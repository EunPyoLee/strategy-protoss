package common.exceptions.skill_exception;

public class SkillExceptions extends Exception{
    public SkillExceptions(String msg){
        super(msg);
    }
    public static class OutOfRange extends SkillExceptions{
        public OutOfRange(){
            super("Skill Index Out of Range");
        }
    }

    public static class NotEnoughEnergy extends SkillExceptions {
        public NotEnoughEnergy(){
            super("Not Enough Energy");
        }
    }
}


