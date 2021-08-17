package protoss.units;

import common.exceptions.energy_exception.EnergyException;
import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;
import protoss.Protoss;
import protoss.impls.attacks.PsionicBlades;

import java.util.ArrayList;
import java.util.List;

public class Zealot extends Protoss {
    public Zealot(){
        this.setName("Zealot");
        this.setHP(100);
        this.setShield(60);
        this.setEnergy(0);
        this.setHasAttack(true);
        this.setHasSkill(false);
        this.setHasEnergy(false);
        this.setUnitType(types.UNIT_TYPES.BIOLOGICAL);
        this.setAttackType(types.ATTACK_TYPES.NORMAL);
        this.setAttackBehavior(new PsionicBlades());
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
    protected void setHasEnergy(boolean hasEnergy){
        this.hasEnergy = hasEnergy;
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
    protected void setEnergy(int energy){
        this.energy = energy;
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
    public int getEnergy() throws EnergyException {
        if(!hasEnergy) {
            throw new EnergyException.NullEnergy();
        }
        return energy;
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
    public boolean isHasEnergy(){
        return hasEnergy;
    }

    @Override
    public types.UNIT_TYPES getUnitType(){
        return unitType;
    }

    @Override
    public types.ATTACK_TYPES getAttackType(){
        return attackType;
    }
}
