package com.kadirgurturk;

import com.kadirgurturk.Characters.Okçu;
import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Characters.Samuray;
import com.kadirgurturk.Characters.Sovalye;
import com.kadirgurturk.Location.BattleLoc.Cave;
import com.kadirgurturk.Location.BattleLoc.Forest;
import com.kadirgurturk.Location.BattleLoc.River;
import com.kadirgurturk.Location.Location;
import com.kadirgurturk.Location.NormalLoc.SafeHouse;
import com.kadirgurturk.Location.NormalLoc.Store;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private Player player;
    private Location location;

    public void start() {
        System.out.println("---------------------------");
        System.out.println("Maceraya Vakti Ama Once Karakteri Olusturun");

        System.out.println("Karakterinizin Ismini Giriniz");
        var name = sc.nextLine();
        System.out.println("Karakterinizin Turunu Giriniz:");
        System.out.println("Samuray Icin 1:");
        System.out.println("Okcu Icin 2:");
        System.out.println("Sovalye Icin 3:");
        var val = Integer.parseInt(sc.nextLine());

        switch (val) {
            case 1: {
                var samuray = new Samuray();
                player = new Player(samuray, name);
                System.out.println("Karakter Olusturuldu " + player.getCharacter().getCharacterName());
                break;
            }
            case 2: {
                var okcu = new Okçu();
                player = new Player(okcu, name);
                System.out.println("Karakter Olusturuldu " + player.getCharacter().getCharacterName());
                break;
            }
            case 3: {
                var sovalye = new Sovalye();
                player = new Player(sovalye, name);
                System.out.println("Karakter Olusturuldu " + player.getCharacter().getCharacterName());
                break;
            }
        }
        System.out.println("Macerayi Tamamlamak Icin Odun, Su ve Yemek Itemalrini Toplamalısınız, Topladıktan Sonra Güvenli Eve Gelmelisiniz");
        System.out.println("Bu Itemlar Koyun Disindaki ve Tehlikeli Bolgelerde, Bu Yuzden Dikkat Et");
        System.out.println("Macera Basliyor " + player.getName());
        SafeHouse();
    }

    private void SafeHouse() {

        if(player.getInventory().isWater() && player.getInventory().isFood() && player.getInventory().isFirewoord() ){
            System.out.println("TEBRİKLER KAZANDINIZ");
            System.out.println("Tekrar Oynamak Icin 1'e, Cıkmak Icin Herhangi Bir Tusa Basiniz");
            var val = Integer.parseInt(sc.nextLine());

            if(val == 1){
                start();
            }else {
                System.exit(0);
            }
        }
        var safeHouse = new SafeHouse(player);
        safeHouse.Location();
        System.out.println("Koy Meydanina Gitmek Icin 2'ye Bas");
        System.out.println("Oyuncu Ozellikleri Icin 3'e Basiniz");
        System.out.println("-------------------");
        var val = Integer.parseInt(sc.nextLine());

        switch (val){
            case 2:{
                TownCenter();
                break;
            }
            case 3:{
                player.displayCharacter();
                SafeHouse();
                break;
            }
            default:{
                SafeHouse();
            }
        }
    }

    private void Store(){
        var store = new Store(player);
        store.Location();
        TownCenter();
    }

    private void TownCenter() {
        System.out.println("Koy Meydanindasin... Koy Bugun Oldukca Kalabalik ve Canli.");
        System.out.println("Guvenli Eve Gitmek Icin 1'e");
        System.out.println("Markete Gitmek Icin 2'ye");
        System.out.println("Koy Cikisina Gitmek Icin 3'e Tuslayiniz");
        System.out.println("Oyuncu Ozellikleri Icin 4'e Basiniz");
        System.out.println("-------------------");
        var val = Integer.parseInt(sc.nextLine());

        switch (val) {
            case 1 :{
                SafeHouse();
                break;
            }
            case 2:{
                Store();
                break;
            }
            case 3:{
                TownExıt();
                break;
            }
            case 4:{
                player.displayCharacter();
                TownCenter();
                break;
            }
            default:{
                TownCenter();
            }
        }
    }

    private void TownExıt()
    {
        System.out.println("-------------------");
        System.out.println("Koyun Cikisi Burasi. Buradan Sonra Yol Tehlikeli Bolgelere Gider");
        System.out.println("Su Alabildigin Nehir Kiyiysina Gitmek Icin 1'i.");
        System.out.println("Yemek Bulunan Magaraya Gitmek Icin 2");
        System.out.println("Odun Bulunan Ormana Gitmek Icin 3");
        System.out.println("Geri Donmek Icin 4'ü Tuslayınız");
        System.out.println("Oyuncu Ozellikleri Icin 5'e Basiniz");
        System.out.println("-------------------");

        var val = Integer.parseInt(sc.nextLine());

        switch (val){
            case 1:{
                var river = new River(player,"Nehir");
                river.Location();
                TownExıt();
                break;
            }
            case 2:{
                var cave = new Cave(player,"Magara");
                cave.Location();
                TownExıt();
                break;
            }
            case 3:{
                var forest = new Forest(player,"Orman");
                forest.Location();
                TownExıt();
                break;
            }
            case 4:{
                TownCenter();
                break;
            }
            case 5:{
                player.displayCharacter();
                TownExıt();
                break;
            }
            default:{
                TownExıt();
            }
        }
    }
}