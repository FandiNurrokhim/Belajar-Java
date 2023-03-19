package Latihan1;

public class Main {
    public static void main(String[] args) {
        
        // object player
        Player player1 = new Player("Fandi", 100.0);

        // object senjata
        Weapon tombak  = new Weapon("Tombak", 15.0);

        // Membuat object Armor
        Armor baju     = new Armor("Baju Zirah",50.0);

        // Equip Weapon Armor
        player1.equipWeapon(tombak);
        player1.equipArmor(baju);

        player1.damage(250);
        player1.display();
    }
}
