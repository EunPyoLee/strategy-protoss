package protoss.impls.skills;

import common.interfaces.ISkill;

public class ReturnCargo implements ISkill {
    @Override
    public void use() {
        System.out.println("Use Return Cargo Skill");
    }

    @Override
    public String toString() {
        return "Return Cargo";
    }
}
