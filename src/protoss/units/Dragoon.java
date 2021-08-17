package protoss.units;

import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;
import protoss.Protoss;
import protoss.impls.attacks.PhaseDisruptor;

import java.util.ArrayList;
import java.util.List;

public class Dragoon extends Protoss {
    public Dragoon(){
        this.setName("Dragoon");
        this.setHP(100);
        this.setShield(80);
        this.setHasAttack(true);
        this.setHasSkill(false);
        this.setUnitType(types.UNIT_TYPES.MASSIVE);
        this.setAttackType(types.ATTACK_TYPES.EXPLOSIVE);
        this.setAttackBehavior(new PhaseDisruptor());
        this.setSkillBehaviors(new ArrayList<ISkill>(0));
        this.selfIntro();
    }

    @Override
    protected void setName(String name){
        this.name = name;
    }

    @Override
    protected void setHP(int hp){
        this.hp = hp;
    }

    @Override
    protected void setShield(int shield){
        this.shield = shield;
    }

    @Override
    protected void setHasSkill(boolean hasSkill){
        this.hasSkill = hasSkill;
    }

    @Override
    protected void setHasAttack(boolean hasAttack){
        this.hasAttack = hasAttack;
    }

    @Override
    protected void setUnitType(types.UNIT_TYPES ut){
        this.unitType = ut;
    }

    @Override
    protected void setAttackType(types.ATTACK_TYPES at){
        this.attackType = at;
    }

    @Override
    protected void setAttackBehavior(IAttack attack){
        attackBehavior = attack;
    }

    @Override
    protected void setSkillBehaviors(List<ISkill> skills){
        skillBehaviors = skills;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getHP(){
        return hp;
    }

    @Override
    public int getShield(){
        return shield;
    }

    @Override
    public boolean isHasSkill() {
        return hasSkill;
    }

    @Override
    public boolean isHasAttack(){
        return hasAttack;
    }

    @Override
    public types.UNIT_TYPES getUnitType(){
        return unitType;
    }

    @Override
    public types.ATTACK_TYPES getAttackType(){
        return attackType;
    }

    @Override
    public void selfIntro() {
        System.out.printf("[Name]: %s\n", this.getName());
        System.out.printf("[Shield/HP]: %d/%d\n", this.getShield(),this.getHP());
        System.out.printf("[Unit Type]: %s\n", this.getUnitType());
        this.attackIntro();
        this.skillIntro();
    }
}
