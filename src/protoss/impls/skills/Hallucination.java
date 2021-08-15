package protoss.impls.skills;

import common.interfaces.ISkill;

public class Hallucination implements ISkill {
    @Override
    public void use() {
        System.out.println("Use Hallucination Skill");
    }

    @Override
    public String toString() {
        return "Hallucination";
    }
}
