package src.com.oopjava;

public class HeroTank extends Hero {
    String skillActiveOne;
    String skillActiveTwo;
    String skillPassiveThree;

    void showHeroSkill(){
        System.out.println("Hero Skill --");
        System.out.println("Skill One (Active) : "+this.skillActiveOne);
        System.out.println("Skill Two (Active) : "+this.skillActiveTwo);
        System.out.println("Skill Three (Passive) : "+this.skillPassiveThree);
    }
}
