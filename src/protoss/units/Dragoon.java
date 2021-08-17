package protoss.units;

import common.exceptions.energy_exception.EnergyException;
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
        this.setEnergy(0);
        this.setHasAttack(true);
        this.setHasSkill(false);
        this.setHasEnergy(false);
        this.setUnitType(types.UNIT_TYPES.MASSIVE);
        this.setAttackType(types.ATTACK_TYPES.EXPLOSIVE);
        this.setAttackBehavior(new PhaseDisruptor());
        this.setSkillBehaviors(new ArrayList<ISkill>(0));
        this.selfIntro();
    }
}
