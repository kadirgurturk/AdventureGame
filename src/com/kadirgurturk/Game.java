package com.kadirgurturk;

import com.kadirgurturk.Characters.Okçu;
import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Characters.Samuray;
import com.kadirgurturk.Characters.Sovalye;
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
        System.out.println("Okcu Içın 2:");
        System.out.println("Sovalye Içın 3:");
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

        System.out.println("Macera Basliyor " + player.getName());
        SafeHouse();
    }

    private void SafeHouse() {
        var safeHouse = new SafeHouse(player);
        safeHouse.Location();
        System.out.println("Köy Meydanına Gitmek Icin 2'ye Bas");
        System.out.println("-------------------");
        var val = Integer.parseInt(sc.nextLine());

        if (val == 2) {
            TownCenter();
        }
    }

    private void Store(){
        var store = new Store(player);
        store.Location();
        TownCenter();
    }

    private void TownCenter() {
        System.out.println("Köy Meydanındasın... Köy Bugün Oldukca Kalabalık ve Canlı.");
        System.out.println("Güvenli Eve Gitmek Icin 1'e");
        System.out.println("Markete Gitmek Icin 2'ye");
        System.out.println("Koy Cikisina Gitmek Icin 3'e Tuslayiniz");
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
        }
    }

    private void TownExıt()
    {
        System.out.println("-------------------");
        System.out.println("Koyun Cikisi Burası. Buradan Sonra Tehlikeli Bolgelerle Dolu");
        System.out.println("Geri Donmek Icin 4'ü Tuslayınız");
        System.out.println("-------------------");

        var val = Integer.parseInt(sc.nextLine());

        switch (val){
            case 4:{
                TownCenter();
            }
        }
    }
}