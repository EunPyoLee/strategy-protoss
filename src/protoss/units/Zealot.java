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
}
