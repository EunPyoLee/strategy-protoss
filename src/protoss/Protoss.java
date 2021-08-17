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

import common.exceptions.energy_exception.EnergyException;
import common.exceptions.skill_exception.SkillExceptions;
import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;

import java.util.List;

// Superclass for Protoss unit
public abstract class Protoss {
    protected IAttack attackBehavior;
    protected List<ISkill> skillBehaviors;

    protected String name;
    protected int hp;
    protected int shield;
    protected int energy;
    protected boolean hasEnergy;
    protected boolean hasSkill;
    protected boolean hasAttack;
    protected types.UNIT_TYPES unitType;
    protected types.ATTACK_TYPES attackType;

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
    }

    public void selfIntro() {
        System.out.printf("[Name]: %s\n", this.getName());
        System.out.printf("[Shield/HP]: %d/%d\n", this.getShield(),this.getHP());
        try{
            int energy = this.getEnergy();
            System.out.printf("[Energy]: %d\n", energy);
        } catch (EnergyException e){
            System.out.println("[Energy]: NULL");
        }
        System.out.printf("[Unit Type]: %s\n", this.getUnitType());
        this.attackIntro();
        this.skillIntro();
    }

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

    protected void setName(String name){
        this.name = name;
    }

    protected void setHP(int hp){
        this.hp = hp;
    }

    protected void setShield(int shield){
        this.shield = shield;
    }

    protected void setHasSkill(boolean hasSkill){
        this.hasSkill = hasSkill;
    }

    protected void setHasAttack(boolean hasAttack){
        this.hasAttack = hasAttack;
    }

    protected void setHasEnergy(boolean hasEnergy){
        this.hasEnergy = hasEnergy;
    }

    protected void setUnitType(types.UNIT_TYPES ut){
        this.unitType = ut;
    }

    protected void setAttackType(types.ATTACK_TYPES at){
        this.attackType = at;
    }

    protected void setEnergy(int energy){
        this.energy = energy;
    }

    protected void setAttackBehavior(IAttack attack){
        attackBehavior = attack;
    }

    protected void setSkillBehaviors(List<ISkill> skills){
        skillBehaviors = skills;
    }

    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }

    public int getEnergy() throws EnergyException {
        if(!hasEnergy) {
            throw new EnergyException.NullEnergy();
        }
        return energy;
    }

    public int getShield(){
        return shield;
    }

    public int getNumSkills() {
        return skillBehaviors.size();
    }

    public boolean isHasSkill() {
        return hasSkill;
    }

    public boolean isHasAttack(){
        return hasAttack;
    }

    public boolean isHasEnergy(){
        return hasEnergy;
    }

    public types.UNIT_TYPES getUnitType(){
        return unitType;
    }

    public types.ATTACK_TYPES getAttackType(){
        return attackType;
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
            System.out.printf("%s attacks\nAttack Type: %s\n", name, attackType);
            this.attackBehavior.attack();
        }
    }

    public void performSkill(int skillIdx) throws SkillExceptions{
        if(skillIdx >= skillBehaviors.size()){
            System.out.printf("%s does not have a skill\n", name);
            throw new SkillExceptions.OutOfRange();
        }
        System.out.printf("%s uses the following skill: %s\n", name, skillBehaviors.get(skillIdx));
    }
}
