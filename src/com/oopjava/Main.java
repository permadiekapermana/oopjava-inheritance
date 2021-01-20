package src.com.oopjava;

public class Main {
    public static void main(String[] args) {
        HeroThief hero1 = new HeroThief();
        hero1.name = "Vildred";
        hero1.attackPoint = 771;
        hero1.healthPoint = 3752;
        hero1.defensePoint = 421;
        hero1.showHero();
        hero1.skillActiveOne = "Rapidly attacks two enemies with a swordstorm. Damage dealt increases proportional to the caster's Speed.";
        hero1.skillPassiveTwo = "Increases Attack of the caster for 2 turns and activates Dancing Blade when an enemy is defeated by Sweep or Blade Ascent. Increases Combat Readiness of the caster by 20% when an enemy is defeated. Dancing Blade (Acquire 1 Soul): Attacks all enemies with a swordstorm.";
        hero1.skillActiveThree = "Attacks all enemies with a swordstorm. Damage dealt increases proportional to the caster's Speed.";
        hero1.showHeroSkill();
        System.out.println();

        HeroFighter hero2 = new HeroFighter();
        hero2.name = "Ken";
        hero2.attackPoint = 655;
        hero2.healthPoint = 4653;
        hero2.defensePoint = 500;
        hero2.showHero();
        hero2.skillPassiveOne = "Attacks with a flurry of strikes, with a 50% chance to decrease Defense for 2 turns. If the caster is granted Vigor, also burns target for 2 turns. Damage dealt increases proportional to the caster's max Health.";
        hero2.skillActiveTwo = "Kicks the enemy, decreasing Defense for 2 turns before granting the caster increased Speed for 2 turns. Gains 40 Fighting Spirit when an enemy is defeated. When the caster is granted Vigor, ignores Effect Resistance. Damage dealt increases proportional to the caster's max Health.";
        hero2.skillActiveThree = "Delivers a powerful blow after a flurry of strikes, decreasing Attack for 2 turns and stunning for 1 turn. Grants Vigor to the caster for 3 turns. Damage dealt increases proportional to the caster's max Health. Starts the first battle with 50 Fighting Spirit, and gains 5 Fighting Spirit when attacked.";
        hero2.showHeroSkill();
        System.out.println();

        HeroTank hero3 = new HeroTank();
        hero3.name = "Krau";
        hero3.attackPoint = 553;
        hero3.healthPoint = 4492;
        hero3.defensePoint = 557;
        hero3.showHero();
        hero3.skillActiveOne = "Attack an enemy with a swordstorm with 50% chance to provoke for 1 turn. Damage dealt increases proportional to the caster's max Health.";
        hero3.skillActiveTwo = "Shoves the enemy with a shield, decreasing Combat Readiness by 35%, before granting increased Defense to all allies for 2 turns. Damage dealt increases proportional to the caster's Health.";
        hero3.skillPassiveThree = "Summons the Guardian Ziegfried to attack, dealing damage proportional to the caster's lost Health, penetrating Defense. Also grants a barrier to the caster for 2 turns, with strength proportional to the caster's max Health. This attack cannot trigger a critical hit.";
        hero3.showHeroSkill();
    }
}