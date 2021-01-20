package src.com.oopjava;

public class HeroFighter extends Hero {
    String skillPassiveOne;
    String skillActiveTwo;
    String skillActiveThree;

    void showHeroSkill(){
        System.out.println("Hero Skill --");
        System.out.println("Skill One (Passive) : "+this.skillPassiveOne);
        System.out.println("Skill Two (Active) : "+this.skillActiveTwo);
        System.out.println("Skill Three (Active) : "+this.skillActiveThree);
    }
}
