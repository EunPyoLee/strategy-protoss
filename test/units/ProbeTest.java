package units;


import common.exceptions.skill_exception.SkillExceptions;
import common.types.types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import protoss.Protoss;
import protoss.units.Probe;

public class ProbeTest {
    @Test
    public void testConstructDragoon(){
        Protoss probe = new Probe();
        Assertions.assertTrue( probe.getName().equals("Probe"));
        Assertions.assertTrue( probe.getHP() == 20);
        Assertions.assertTrue(probe.getShield() == 20);
        Assertions.assertTrue(probe.getUnitType() == types.UNIT_TYPES.MECHANICAL);
        Assertions.assertTrue(probe.getAttackType() == types.ATTACK_TYPES.NORMAL);
        Assertions.assertTrue(probe.isHasAttack() == true);
        Assertions.assertTrue(probe.isHasSkill() == true);
    }

    @Test
    public void testProbeShouldUseSkill() {
        Protoss probe = new Probe();
        boolean caughtSkillExceptions = false;
        for(int i = 0; i < 2; ++i){
            try{
                probe.performSkill(i);
            } catch (SkillExceptions e){
                caughtSkillExceptions = true;
            }
            Assertions.assertTrue(!caughtSkillExceptions);
        }
    }
}