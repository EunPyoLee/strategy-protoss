package protoss.impls.skills;

import common.interfaces.ISkill;

public class Gather implements ISkill {
    @Override
    public void use() {
        System.out.println("Use Gather Mineral/Gas Skill");
    }

    @Override
    public String toString() {
        return "Gather";
    }
}
