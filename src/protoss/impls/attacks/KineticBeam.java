package protoss.impls.attacks;

import common.interfaces.IAttack;

public class KineticBeam implements IAttack {
    @Override
    public void attack() {
        System.out.println("Kinetic Beam Attack");
    }

    @Override
    public String toString() {
        return "Kinetic Beam";
    }
}
