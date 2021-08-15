package protoss.impls;

import common.interfaces.IAttack;

public class PhaseDisruptor implements IAttack {
    @Override
    public void attack() {
        System.out.println("Phase Disruptor Attack");
    }
}
