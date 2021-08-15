package protoss;

/*
    Superclass for subclass inheritance
    Subclass inheritacne for sharing "DNA"(common thing) of that kind

    Prtoss is a race, so all protoss have their protoss "DNA"
    - shield
    - hp
    - name
    - unit type
    - attack behavior
    - attack type
    - skills
    - self-intro
 */

import common.types.types;

// Superclass for Protoss unit
public abstract class Protoss {
    // Todo: declare AttackBehaivor Ineterface
    // Todo: declare SkillBehavior Interface and define array of them

    private String name;
    private int hp;
    private int shield;
    private boolean hasSkill;
    private boolean hasAttack;
    private types.UNIT_TYPES unitType;
    private types.ATTACK_TYPES attackType;

    /*
    You would define a constructor in an abstract classif you are in one of these situations:
    1. you want to perform some initialization (to fields of the abstract class) before the instantiatin of a subclass actually takes place
    2. you have defined final fields in the abstract class but you did not initialize them in the declaration itself; in this case, you MUST have a constructor to init these fields

    side note:
    - you may define more than one constructor (with different arguments)
    - you can (but SHOULD in terms of its real meaning) define all your constructors in abstract class "protected"
    (making them public is pointless as it is abstract)
    - your subclass consturctor(s) can call "one" constructor of the abstract class; it may even HAVE TO call it
    (if there is no-arg/base constructor in the abstract class)
    - if you don't define a constructor in abstract class, the compiler will automatically generate one for you
    (which is public, no arguemnt and does nothing)
     */
    protected Protoss () {
        System.out.println("For AIUR!");
        this.selfIntro();
    }

    public abstract void selfIntro();

    // Todo: attack
    // Todo:

}
