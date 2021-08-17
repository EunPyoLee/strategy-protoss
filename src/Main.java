import common.exceptions.skill_exception.SkillExceptions;
import protoss.Protoss;
import protoss.units.Dragoon;
import protoss.units.HighTemplar;
import protoss.units.Probe;
import protoss.units.Zealot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        /*
        Create probe, zealot, dragoon, high templar
        and perform attack and skills if they have
         */
        List<Protoss> protossUnits = new ArrayList<Protoss>();
        protossUnits.add(new Probe());
        System.out.println();
        protossUnits.add(new Zealot());
        System.out.println();
        protossUnits.add(new Dragoon());
        System.out.println();
        protossUnits.add(new HighTemplar());
        System.out.println();
        for(int i = 0; i < protossUnits.size(); ++i){
            protossUnits.get(i).performAttack();
            for(int j = 0; j < protossUnits.get(i).getNumSkills(); ++j){
                try {
                    protossUnits.get(i).performSkill(j);
                } catch (SkillExceptions e){
                    System.out.println(e.toString());
                }
            }
            System.out.println();
        }
    }
}
