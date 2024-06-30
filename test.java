import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        Notebook macBook14 = new Notebook("macBook14", 8, 1024, "macOS", "серый", 16, 3900);
        System.out.println(macBook14.getColor().toLowerCase().equals("СеРый".toLowerCase()));
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(macBook14);

        for (Notebook elem : notebooks) {
            if (elem.getColor().toLowerCase().equals("СеРый".toLowerCase())) {
                System.out.println(1);
            }
        }
    }
}
