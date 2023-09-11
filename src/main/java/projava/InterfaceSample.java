package projava;

import java.util.List;

public class InterfaceSample {
    record Student(String name, int score) implements Named{}
    record Teacher(String name, String subject) implements Named{}


    @FunctionalInterface
    interface Named {
        String name();

        default String greeding(){
            return "Hello Mr. %s".formatted((name()));
        }
    }

    static class Passenger implements Named{

        @Override
        public String name() {
            return "no name";
        }
    }


    public static void main(String[] args){
        var people = List.of(new Student("kis", 80), new Teacher("kam", "Math"), new Passenger());

        for(var p : people){
            System.out.println(p.greeding());
        }
    }
}

