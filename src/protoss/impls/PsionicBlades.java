package protoss.impls;

import common.interfaces.IAttack;

public class PsionicBlades implements IAttack {
    // Override keyword isn't compulsory but it is great engineering practice to have this
    @Override
    public void attack() {
        System.out.println("Psionic Blades Attack");
    }
}
