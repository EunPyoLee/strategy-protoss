package units;


import common.exceptions.energy_exception.EnergyException;
import common.exceptions.skill_exception.SkillExceptions;
import common.types.types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import protoss.Protoss;
import protoss.units.HighTemplar;

public class HighTemplarTest {
    @Test
    public void testConstructHighTemplar(){
        Protoss ht = new HighTemplar();
        Assertions.assertTrue( ht.getName().equals("High Templar"));
        Assertions.assertTrue( ht.getHP() == 40);
        Assertions.assertTrue(ht.getShield() == 40);
        Assertions.assertTrue(ht.getUnitType() == types.UNIT_TYPES.BIOLOGICAL);
        Assertions.assertTrue(ht.getAttackType() == types.ATTACK_TYPES.NONE);
        Assertions.assertTrue(ht.isHasAttack() == false);
        Assertions.assertTrue(ht.isHasSkill() == true);
    }

    @Test
    public void testProbeShouldUseSkill() {
        Protoss ht = new HighTemplar();
        boolean caughtSkillExceptions = false;
        for(int i = 0; i < 2; ++i){
            try{
                ht.performSkill(i);
            } catch (SkillExceptions e){
                caughtSkillExceptions = true;
            }
            Assertions.assertTrue(!caughtSkillExceptions);
        }
    }

    @Test
    public void testProbeShouldHaveEnergy() {
        Protoss ht = new HighTemplar();
        boolean caughtEnergyExceptions = false;
        try{
            ht.getEnergy();
        } catch (EnergyException e){
            caughtEnergyExceptions = true;
        }
        Assertions.assertFalse(caughtEnergyExceptions);
    }
}