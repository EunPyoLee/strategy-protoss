package protoss.impls;

import common.interfaces.IAttack;

public class NoAttack implements IAttack {
    @Override
    public void attack() {
        System.out.println("No Attack");
    }
}
