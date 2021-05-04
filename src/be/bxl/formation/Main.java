package be.bxl.formation;
import java.util.Locale;
import be.bxl.formation.models.Duree;
public class Main {

    public static void main(String[] args) {
    Duree duree1 = new Duree(2, 12, 3, 15);
	duree1.getTotalSeconde();

    Duree duree2 = new Duree(1, 11, 4, 20);
    duree2.getTotalSeconde();

    System.out.println(duree1.subDuree(duree2));
    System.out.println(duree1.addDuree(duree2));

    }
}
