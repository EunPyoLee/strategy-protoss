package protoss.impls;

import common.interfaces.IAttack;

public class KineticBeam implements IAttack {
    @Override
    public void attack() {
        System.out.println("Kinetic Beam Attack");
    }
}
