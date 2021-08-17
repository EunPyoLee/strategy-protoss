package protoss.units;

import common.exceptions.energy_exception.EnergyException;
import common.interfaces.IAttack;
import common.interfaces.ISkill;
import common.types.types;
import protoss.Protoss;
import protoss.impls.attacks.NoAttack;
import protoss.impls.skills.Hallucination;
import protoss.impls.skills.PsionicStorm;

import java.util.ArrayList;
import java.util.List;

public class HighTemplar extends Protoss {
    public HighTemplar(){
        this.setName("High Templar");
        this.setHP(40);
        this.setShield(40);
        this.setEnergy(200);
        this.setHasAttack(false);
        this.setHasSkill(true);
        this.setHasEnergy(true);
        this.setUnitType(types.UNIT_TYPES.BIOLOGICAL);
        this.setAttackType(types.ATTACK_TYPES.NONE);
        this.setAttackBehavior(new NoAttack());
        List<ISkill> skills = new ArrayList<ISkill>();
        skills.add(new PsionicStorm());
        skills.add(new Hallucination());
        this.setSkillBehaviors(skills);
        this.selfIntro();
    }
}
