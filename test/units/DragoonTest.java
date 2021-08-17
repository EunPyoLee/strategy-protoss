package units;


import common.exceptions.energy_exception.EnergyException;
import common.exceptions.skill_exception.SkillExceptions;
import common.types.types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import protoss.Protoss;
import protoss.units.Dragoon;

public class DragoonTest {
    @Test
    public void testConstructDragoon(){
        Protoss dragoon = new Dragoon();
        Assertions.assertTrue( dragoon.getName().equals("Dragoon"));
        Assertions.assertTrue( dragoon.getHP() == 100);
        Assertions.assertTrue(dragoon.getShield() == 80);
        Assertions.assertTrue(dragoon.getUnitType() == types.UNIT_TYPES.MASSIVE);
        Assertions.assertTrue(dragoon.getAttackType() == types.ATTACK_TYPES.EXPLOSIVE);
        Assertions.assertTrue(dragoon.isHasAttack() == true);
        Assertions.assertTrue(dragoon.isHasSkill() == false);
    }

    @Test
    public void testDragoonShouldNotUseSkill() {
        Protoss dragoon = new Dragoon();
        boolean caughtSkillExceptions = false;
        try{
            dragoon.performSkill(0);
        } catch (SkillExceptions e){
            caughtSkillExceptions = true;
        }
        Assertions.assertTrue(caughtSkillExceptions);
    }

    @Test
    public void testDragoonShouldNotHaveEnergy() {
        Protoss dragoon = new Dragoon();
        boolean caughtEnergyExceptions = false;
        try{
            dragoon.getEnergy();
        } catch (EnergyException e){
            caughtEnergyExceptions = true;
        }
        Assertions.assertTrue(caughtEnergyExceptions);
    }
}