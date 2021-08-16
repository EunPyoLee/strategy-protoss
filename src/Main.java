import common.exceptions.skill_exception.SkillExceptions;
import protoss.Protoss;
import protoss.units.Zealot;

public class Main {
    public static void main(String []args){
        /*
        Create probe, zealot, dragoon, high templar
         */
        Protoss zealot = new Zealot();
        zealot.performAttack();
        try{
            zealot.performSkill(0);
        } catch(SkillExceptions e){
            System.out.println(e.toString());
        }
    }
}
