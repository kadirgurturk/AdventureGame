# Adventure Game

### Bu uygulama Patika.dev [projelerinden](https://academy.patika.dev/courses/java-102/advgame-1) biridir. 
### AdventureGame metin bazlı RPG türünden bir oyundur. Amacımız oyuna başladığımız köyün çevresindeki tehlikeli bölgelerdeki düşmanları yenip o bölgeye özel eşyayı envantere almak ve bu 3 eşya ile SafeHouse'a gelmektir.

##Oynanış ve Dinamikler
+ Oyun bize önce karakterimize bir isim vermemizi daha sonra Samuray,Okçu ve Şövalye sınıflarından birini seçmemizi ister.
+ Oyun genel olarak 2 bölgeden oluşuyor Köy ve Köyün Dışı
+ Köy kendi içinde Market ve SafeHouse olarak ikiye ayrılır.
+ Köyün Dışı kendi içinde Mağara, Nehir ve Orman olarak ikiye ayrılır.
+ Bu iki bölge Köy Meydanı ve Köy Çıkısı ile birbirine bağlanırlar.
+ Güvenli eve girdiğimiz anda canımız fullenir. Marketten ise Silah veya Zırh alabiliriz.
+ Köy Dışındaki belirli bölgelerde belirli düşmanlar, 1 - 3 adet arasında rastgele bulunurlar.
+ Bu bölgelerde isteğe bağlı, bu düşmanlar ile combata girebilir ister o lokasyondan kaçabiliriz.
+ Combat sıra tabanlı bir sistemdir. İlk vuruşu daima bir vuruyoruz, iki farklı vuruşumuz bulunmakta: normal ve kritik.
+ Normal vuruş: Seçtiğimiz sınıf'ın defult hasar gücü ve eğer varsa Sihaımızın hasar gücünün toplamı kadardır.
+ Kritik vuruş: Bu vuruş turunun hasarı rastgele'dir. Kendi toplam hasar gücümüzün 2 katı ile 0 arasında vurabiliriz.
+ Düşmandan her zaman, düşmanımızın hasar gücü - zırh defansımız kadar hasar alırız.
+ Combat sonunda eğer combatı kazanırsak belirli ıtem ve para alırız.
+ Eğer ölürsek baştan başlama veya oyundan çıkabiliriz.

##Lokasyonlar
###Cave
+ Düşman Zombi (1-3)
+ Item : Food
###Forest
+ Düşman : Vampir (1-3)
+ Item : Firewood
###River
+ Düşman : Ayı (1-3)
+ Item : Water

