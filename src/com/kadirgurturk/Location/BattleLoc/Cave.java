package com.kadirgurturk.Location.BattleLoc;

import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Obstacle.Ayı;
import com.kadirgurturk.Obstacle.Zombi;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Cave extends BattleLoc{
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Zombi> obs ;
    private final int obstacleNum;
    private String award = "yemek";

    public Cave(Player player, String name) {
        super(player, name);
        obstacleNum = getNumberforObstacle();
        obs = new ArrayList<>();
        for(int i = 0; i < obstacleNum ; ++i){
            Zombi zombi = new Zombi();
            obs.add(zombi);
        }
    }

    private int getNumberforObstacle()
    {
        Random r = new Random();
        return r.nextInt(4 - 1) + 1;
    }

    @Override
    public void combat() {

        while (getPlayer().getCharacter().getHealth() > 0 && obs.size() > 0){
            System.out.println("----------------------------");

            System.out.println("Vurma sirasi sizde. Düz saldiri için 1'i kritik vurus denemek için 2'ye basin");
            var skl = Integer.parseInt(sc.nextLine());
            attack(skl);
            if(obs.get(obs.size()- 1).getHealth() <= 0 ){
                obs.remove(obs.size()- 1);
                if(obs.size() < 1){
                    System.out.println("Burayi temizledin. Ödülün Yemek ve " +obstacleNum*4+ " Para, Canın'da: "+ getPlayer().getCharacter().getHealth() );

                    getPlayer().getInventory().setFood(true);


                    getPlayer().getCharacter().setMoney(getPlayer().getCharacter().getMoney()+obstacleNum*4);
                    break;
                }
            }
            System.out.println("zombi vuruyor");
            obsAttack();
            if(getPlayer().getCharacter().getHealth() < 1){
                System.out.println("Cıkıs");
                break;
            }
            System.out.println("Canınız: " + getPlayer().getCharacter().getHealth());

            System.out.println(obs.size() + " kadar Zombi kaldı. Saldirilan Zombinin Canı :" + obs.get(obs.size()- 1).getHealth());
            System.out.println("---------------------------");
        }


    }

    private void obsAttack(){
        var hp = getPlayer().getCharacter().getHealth();
        var armorDefense = 0;
        if(getPlayer().getInventory().getArmor() != null){
            armorDefense = getPlayer().getInventory().getArmor().getDefense();
        }
        System.out.println("Alinan Hasar: " + (- armorDefense + obs.get(0).getDamage()));
        getPlayer().getCharacter().setHealth(hp + armorDefense - obs.get(0).getDamage());
    }


    private void attack(int val){

        if(val == 1){
            var dmg = getPlayer().getCharacter().getDamage();
            if(getPlayer().getInventory().getWeapon() != null){
                dmg += getPlayer().getInventory().getWeapon().getDamage();
            }

            var obsHp = obs.get(obs.size()- 1).getHealth();

            obs.get(obs.size()- 1).setHealth(obsHp - dmg);
            System.out.println("Verilen Hasar: " +dmg);
        }else{
            Random r = new Random();
            var dmg = r.nextInt((getPlayer().getCharacter().getDamage() + 10) - 2 ) +2;

            if(getPlayer().getInventory().getWeapon() != null){
                dmg += getPlayer().getInventory().getWeapon().getDamage();
            }

            var obsHp = obs.get(obs.size()- 1).getHealth();

            obs.get(obs.size()- 1).setHealth(obsHp - dmg);
            System.out.println("Verilen Hasar: " +dmg);
        }

    }

    @Override
    public boolean onLocation() {
        return super.onLocation();
    }

    @Override
    public void Location() {
        System.out.println("-----------------------------");
        System.out.println("Magara Girisindesin. Iceride " + obstacleNum + " tane Zombi var, magarayi temizlersen yemek odulunu alabilirsin");
        System.out.println("Geri Donmek Icin B'ye, Savasmak Icin C'ye bas");
        var val = sc.nextLine();

        if(val.toLowerCase(Locale.ROOT).equals("c")){
            combat();
        }

    }
}
