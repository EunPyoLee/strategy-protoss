package units;


import common.exceptions.skill_exception.SkillExceptions;
import common.types.types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import protoss.Protoss;
import protoss.units.Zealot;

public class ZealotTest {
    @Test
    public void testConstructZealot(){
        Protoss zealot = new Zealot();
        Assertions.assertTrue( zealot.getName().equals("Zealot"), "Test zealot getName: ");
        Assertions.assertTrue( zealot.getHP() == 100, "Test zealot getHP: ");
        Assertions.assertTrue(zealot.getShield() == 60, "Test zealot getShield: ");
        Assertions.assertTrue(zealot.getUnitType() == types.UNIT_TYPES.BIOLOGICAL, "Test zealot getUnitType");
        Assertions.assertTrue(zealot.getAttackType() == types.ATTACK_TYPES.NORMAL, "Test zealot getShield: ");
        Assertions.assertTrue(zealot.isHasAttack() == true, "Test zealot getShield: ");
        Assertions.assertTrue(zealot.isHasSkill() == false, "Test zealot getShield: ");
    }

    @Test
    public void testZealotShouldNotUseSkill() {
        Protoss zealot = new Zealot();
        boolean caughtSkillExceptions = false;
        try{
            zealot.performSkill(0);
        } catch (SkillExceptions e){
            caughtSkillExceptions = true;
        }
        Assertions.assertTrue(caughtSkillExceptions, "Test zealot should not use skill");
    }
}