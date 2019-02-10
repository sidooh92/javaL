import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Teammate teammate1 = new Teammate("Frodo",true);
        Teammate teammate2 = new Teammate("Gandalf",false);
        Teammate teammate3 = new Teammate("Aragorn",false);
        Teammate teammate4 = new Teammate("Legolas",false);
        Teammate teammate5 = new Teammate("Gimli",false);

        List<Teammate> teammateList =  new ArrayList<>();
        teammateList.add(teammate1);
        teammateList.add(teammate2);
        teammateList.add(teammate3);
        teammateList.add(teammate4);
        teammateList.add(teammate5);


        //zad1 Zwroc listę osob ktore nie maja pierscienia
        List<Teammate> collectPersonWithoutRing = teammateList
                .stream()
                .filter(person -> !person.isHasRring())
                .collect(Collectors.toList());
        //collectPersonWithoutRing.forEach(System.out::println);


        //zad2 Zwroc liste zmodyfikowanych osob z wzgledu na to czy maja pierscien
        //jezeli maja dopisz do imienia - have ring w przeciwnym wypadku does not have rin

        List<Teammate> collectModified = teammateList
                .stream()
                .map(person -> {
                    if (person.isHasRring()) {
                        person.setName(person.getName() + "has ring");
                    } else person.setName(person.getName() + "does not has ring");

                    return person;
                })
                .collect(Collectors.toList());
        collectModified.forEach(System.out::println);

    }

}
