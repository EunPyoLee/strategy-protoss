package protoss.units;

import common.exceptions.energy_exception.EnergyException;
import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;
import protoss.Protoss;
import protoss.impls.attacks.KineticBeam;
import protoss.impls.skills.Gather;
import protoss.impls.skills.ReturnCargo;

import java.util.ArrayList;
import java.util.List;

public class Probe extends Protoss {
    public Probe(){
        this.setName("Probe");
        this.setHP(20);
        this.setShield(20);
        this.setEnergy(0);
        this.setHasAttack(true);
        this.setHasSkill(true);
        this.setHasEnergy(false);
        this.setUnitType(types.UNIT_TYPES.MECHANICAL);
        this.setAttackType(types.ATTACK_TYPES.NORMAL);
        this.setAttackBehavior(new KineticBeam());
        List<ISkill> skills = new ArrayList<ISkill>();
        skills.add(new Gather());
        skills.add(new ReturnCargo());
        this.setSkillBehaviors(skills);
        this.selfIntro();
    }
}
