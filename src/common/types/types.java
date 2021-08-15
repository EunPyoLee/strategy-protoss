package common.types;

public class types {
    public enum UNIT_TYPES {
        LIGHT,
        ARMORED,
        MASSIVE,
        BIOLOGICAL,
        MECHANICAL,
        PSIONIC,
        STRUCTURE,
        HEROIC
    }

    public enum ATTACK_TYPES {
        NONE{
            @Override
            public String toString() {
                return "None";
            }
        },
        NORMAL{
            @Override
            public String toString() {
                return "Normal";
            }
        },
        CONCUSSION{
            @Override
            public String toString() {
                return "Concussion";
            }
        },
        EXPLOSIVE{
            @Override
            public String toString() {
                return "Explosive";
            }
        }
    }
}