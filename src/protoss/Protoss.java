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

import common.exceptions.skill_exception.SkillExceptions;
import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;

import java.util.List;

// Superclass for Protoss unit
public abstract class Protoss {
    IAttack attackBehavior;
    List<ISkill> skillBehaviors;

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

    public void skillIntro(){
        System.out.println("[Skills]");
        if(!this.hasSkill){
            System.out.println("None");
        } else{
            for(int i =0; i < skillBehaviors.size(); ++i){
                System.out.printf("%d - %s\n", i, skillBehaviors.get(i).toString());
            }
        }
    }

    public void attackIntro(){
        System.out.println("[Attack]");
        if(!this.hasSkill){
            System.out.println(attackType);
            return;
        }

        System.out.printf("Attack Type: %s\n", attackType.toString());
        System.out.printf("Weapon: %s\n", attackBehavior.toString());
    }

    public void performAttack() {
        if(!this.hasAttack){
            System.out.printf("%s does not have attack\n", name);
        }else {
            System.out.printf("%s attacks\n Attack Type: %v\n", name, attackType);
            this.attackBehavior.attack();
        }
    }

    public void performSkill(int skillIdx) throws SkillExceptions{
        if(skillIdx >= skillBehaviors.size()){
            throw new SkillExceptions.OutOfRange();
        }
        System.out.println(skillBehaviors.get(skillIdx));
    }
}
