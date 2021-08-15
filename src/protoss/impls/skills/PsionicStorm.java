package protoss.impls.skills;

import common.interfaces.ISkill;

public class PsionicStorm implements ISkill {
    @Override
    public void use() {
        System.out.println("Use Psionic Storm Skill");
    }

    @Override
    public String toString() {
        return "Psionic Storm";
    }
}
