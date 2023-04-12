package com.kadirgurturk.Location.NormalLoc;

import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Items.Armor.Armor;
import com.kadirgurturk.Items.Armor.HeavyArmor;
import com.kadirgurturk.Items.Armor.LightArmor;
import com.kadirgurturk.Items.Armor.MidArmor;
import com.kadirgurturk.Items.Item;
import com.kadirgurturk.Items.Weapon.Gun;
import com.kadirgurturk.Items.Weapon.Rifle;
import com.kadirgurturk.Items.Weapon.Sword;
import com.kadirgurturk.Items.Weapon.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Store extends NormalLoc {
    private final Scanner sc = new Scanner(System.in);

    public Store(Player player) {
        super(player, "Pazar");
    }

    private Player buy(Player player, Item ıtem) {
        if (ıtem instanceof Armor) {
            player.getInventory().setArmor((Armor) ıtem);

        } else {
            player.getInventory().setWeapon((Weapon) ıtem);
        }

        return player;
    }

    @Override
    public boolean onLocation() {
        if (super.getPlayer() != null) {
            return true;
        }

        return false;
    }

    @Override
    public void Location() {
        System.out.println("-------------------");
        System.out.println("Dükkana Hoşgeldiniz");
        System.out.println("Ne tür Item bakiyorsunuz: Silahlar Icın 1'e, Zırhlar Icın 2'yi tuslayiniz");
        System.out.println("Çıkmak Icın Herhangi Bir Tusa Basın");
        var val = Integer.parseInt(sc.nextLine());
        switch (val) {
            case 1: {
                WeaponMenu();
                break;
            }
            case 2:{
                ArmorMenu();
                break;
            }
            default:{
                break;
            }
        }


    }

    public void ArmorMenu(){
        System.out.println("Üç Farklı Zırhım Var: Tabanca, Kiliç, Tüfek ");
        System.out.println("Hafif Zırh Satın Almak Icın 1'i");
        System.out.println("Orta Zırh Almak Icin 2'yi");
        System.out.println("Agir Zirh Satin Almak Icın 3'ü ");
        System.out.println("Zirhlarin Istatistikleri Icın 4'ü");
        System.out.println("Bir Ust Menu  Icin 5'i Tuslayınız");
        var val = Integer.parseInt(sc.nextLine());
        var money = super.getPlayer().getCharacter().getMoney();
        switch (val) {
            case 1: {
                var light = new LightArmor();
                if (money >= light.getPrice()) {
                    money -= light.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), light);
                    System.out.println(light.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                ArmorMenu();
                break;
            }
            case 2: {
                var mid = new MidArmor();
                if (money >= mid.getPrice()) {
                    money -= mid.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), mid);
                    System.out.println(mid.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                ArmorMenu();
                break;
            }
            case 3: {
                var heavy = new HeavyArmor();
                if (money >= heavy.getPrice()) {
                    money -= heavy.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), heavy);
                    System.out.println(heavy.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                ArmorMenu();
                break;
            }
            case 4:{
                var light = new LightArmor();
                var mid = new MidArmor();
                var heavy = new HeavyArmor();

                var list  = new ArrayList<Item>();
                list.add(light);
                list.add(mid);
                list.add(heavy);

                System.out.println("--------Zirhlar--------------");
                for(var ıtem : list){
                    System.out.println(ıtem);
                }
                System.out.println("----------------------");
                ArmorMenu();
                break;
            }

            case 5:{
               Location();
                break;
            }
        }

    }

    public void WeaponMenu() {

        System.out.println("Üç Farklı Silahım Var: Tabanca, Kılıç, Tüfek ");
        System.out.println("Tabanca Satın Almk Icın 1'i");
        System.out.println("Kılıc Satın Almk Icın 2'yi");
        System.out.println("Tüfek Satın Almk Icın 3'ü ");
        System.out.println("Silahların Istatistikleri Icın 4'ü");
        System.out.println("Bir Ust Menu  Icın 5'i Tuslayınız");
        var val = Integer.parseInt(sc.nextLine());
        var money = super.getPlayer().getCharacter().getMoney();
        switch (val) {
            case 1: {
                var gun = new Gun();
                if (money >= gun.getPrice()) {
                    money -= gun.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), gun);
                    System.out.println(gun.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                WeaponMenu();
                break;
            }
            case 2: {
                var sword = new Sword();
                if (money >= sword.getPrice()) {
                    money -= sword.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), sword);
                    System.out.println(sword.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                WeaponMenu();
                break;
            }
            case 3: {
                var rifle = new Rifle();
                if (money >= rifle.getPrice()) {
                    money -= rifle.getPrice();
                    super.getPlayer().getCharacter().setMoney(money);
                    buy(getPlayer(), rifle);
                    System.out.println(rifle.getName() + " Envantere Yüklendi. Kalan Para: " + money);
                } else {
                    System.out.println("Bu Item'a Paraniz Yetmiyor");
                }
                WeaponMenu();
                break;
            }
            case 4:{
                var gun = new Gun();
                var rifle = new Rifle();
                var sword = new Sword();

                var list  = new ArrayList<Item>();
                list.add(gun);
                list.add(rifle);
                list.add(sword);

                System.out.println("--------Silahlar--------------");
                for(var ıtem : list){
                    System.out.println(ıtem);
                }
                System.out.println("----------------------");
                WeaponMenu();
                break;
            }

            case 5:{
                Location();
                break;
            }
        }
    }
}
