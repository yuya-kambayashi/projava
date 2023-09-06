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
        switch(state){
            case ZERO, INT : return true;
            case FRAC :{
                if (data.charAt(data.length()-1) == '0'){
                    return false;
                }
                else{
                    return true;
                }
            }

            default : return false;
        }
    }
}
