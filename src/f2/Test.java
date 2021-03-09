package f2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Test {
    public static void main(String[] args) {
        List<Human>input=new ArrayList<>();
        input.add(new Human(60,"Петя","Катя",LocalDate.of(2010,10,17),90));
        input.add(new Human(25,"Вова","Алина",LocalDate.of(2009,1,23),80));
        input.add(new Human(49,"Кирилл","Софа",LocalDate.of(2008,7,21),70));
        input.add(new Human(38,"Даниил","Елена",LocalDate.of(2007,7,20),60));
        input.add(new Human(50,"Алексей","Алиса",LocalDate.of(2006,9,25),50));
        input.add(new Human(44,"Андрей","Рита",LocalDate.of(2005,2,28),40));


        input.stream()
                .sorted(Comparator.comparing(Human::getBirthDate))
                .filter(human->human.getAge() < 50)
                .forEach(System.out::println);

        System.out.println();
        Stream<Human> stream2 = input.stream();
        stream2.forEach(s-> System.out.printf(s.getFirstName()+" "+s.getLastName()+" "));

        System.out.println();
        System.out.println();
        input.stream()
                .sorted(Comparator.comparing(Human::getBirthDate))
                .forEach(System.out::println);

        System.out.println();
        input.stream()
                .sorted(Comparator.comparing(Human::getWeight))
                .forEach(System.out::println);
    }
}
