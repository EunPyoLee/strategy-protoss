package protoss.impls.attacks;

import common.interfaces.IAttack;

public class PhaseDisruptor implements IAttack {
    @Override
    public void attack() {
        System.out.println("Phase Disruptor Attack");
    }

    @Override
    public String toString() {
        return "Phase Disruptor";
    }
}
