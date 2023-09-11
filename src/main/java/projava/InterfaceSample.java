package projava;

import java.util.List;

public class InterfaceSample {
    record Student(String name, int score) implements Named{}
    record Teacher(String name, String subject) implements Named{}


    interface Named {
        String name();
    }

    public static void main(String args[]){
        var people = List.of(new Student("kis", 80), new Teacher("kam", "Math"));

        for(var p : people){
//            var n = p instanceof Student s ? s.name() :
//                    p instanceof Teacher t ? t.name() :
//                            "---";

            var n = p.name();

            System.out.println("Hello Mr.%s ".formatted(n));
        }
    }
}
