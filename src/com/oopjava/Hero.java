package src.com.oopjava;

public class Hero {
    String name;
    int attackPoint;
    int healthPoint;    
    int defensePoint;

    void basicAttack(){
        System.out.println("Attack enemy with basic attack.");
    }

    void showHero(){
        System.out.println("Details Hero --");
        System.out.println("Hero Name : "+this.name);
        System.out.println("Attack Point : "+this.attackPoint);
        System.out.println("Health Point : "+this.healthPoint);
        System.out.println("Defense Point : "+this.defensePoint);
        System.out.print("Basic Attack : ");
        basicAttack();
    }

}
