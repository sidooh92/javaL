import java.util.ArrayList;
import java.util.List;

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
        //zad2 Zwroc liste zmodyfikowanych osob z wzgledu na to czy maja pierscien
        //jezeli maja dopisz do imienia - have ring w przeciwnym wypadku does not have rin
    }

}
