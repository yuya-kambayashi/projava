package projava;

public class CheckFloat {

    enum FloatState {
        START,
        INT,
        FRAC_START,
        FRAC,
        ZERO
    }

    static boolean check(String data){
        var state = FloatState.START;

        for (char ch : data.toCharArray()){
            switch (state){
                case START -> {
                    if (ch == '0'){
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9'){
                        state = FloatState.INT;
                    } else{
                        return false;
                    }
                }
                case ZERO -> {
                    if (ch == '.'){
                        state = FloatState.FRAC_START;
                    }
                    else{
                        return false;
                    }
                }
                case INT ->{
                    if (ch >= '0' && ch <= '9'){
                        state = FloatState.INT;
                    } else if (ch == '.'){
                        state = FloatState.FRAC_START;
                    }
                    else{
                        return false;
                    }
                }
                case FRAC_START, FRAC -> {
                    if (ch >= '0' && ch <= '9'){
                        state = FloatState.FRAC;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return switch(state){
            case ZERO, INT, FRAC -> true;
            default -> false;
        };
    }
}