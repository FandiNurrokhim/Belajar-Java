package Latihan1;

public class Player {
    String name;
    Double health;
    int level;
    int damage;
    double damageReduction;
    double damageTaken;
    double healthAfterDamage;
    
    //  Object
    Weapon weapon;
    Armor armor;

    Player(String name, Double health) {
        this.name   = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        if (this.healthAfterDamage > 1) {
            System.out.println("Name   : " + this.name);
            System.out.println("Health : " + this.health + "HP");
            this.weapon.display();
            this.armor.display();
            System.out.println("\nDamage Diterima: " + this.damageTaken);
            System.out.println("Sisa Hp : " + this.healthAfterDamage + "HP");
        } else {
            System.out.println("Player Mati");
        }
    }    

    Double damage(int damage) {
        this.damage = damage;
        double defencePower = armor.defencePower;
        double damageReduction = defencePower / 100;
        double damageTaken = damage - (damage * damageReduction);
        this.damageTaken = damageTaken;
        double healthAfterDamage = health - damageTaken;
        this.healthAfterDamage = healthAfterDamage;
        return damageTaken;
    }
    
}

class Weapon {
    Double attackPower;
    String name;

    Weapon(String name, Double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + "\nAttack Power : " + this.attackPower);
    }
}

class Armor {
    Double defencePower;
    String name;

    Armor(String name, Double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor   : " + this.name + "\nDefence : " + this.defencePower);
    }
}
