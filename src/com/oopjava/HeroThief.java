package src.com.oopjava;

public class HeroThief extends Hero {
    String skillActiveOne;
    String skillPassiveTwo;
    String skillActiveThree;

    void showHeroSkill(){
        System.out.println("Hero Skill --");
        System.out.println("Skill One (Active) : "+this.skillActiveOne);
        System.out.println("Skill Two (Passive) : "+this.skillPassiveTwo);
        System.out.println("Skill Three (Active) : "+this.skillActiveThree);
    }
}
