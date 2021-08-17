package common.exceptions.energy_exception;

public class EnergyException extends Exception{
    public EnergyException(String msg){
        super(msg);
    }
    public static class NullEnergy extends EnergyException{
        public NullEnergy(){
            super("This unit does not have energy");
        }
    }
}


