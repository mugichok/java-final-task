import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        Notebook macBook14 = new Notebook("macBook14", 8, 1024, "macOS", "grey", 16, 3900);
        Notebook acer = new Notebook("acer", 32, 2048, "Windows11", "grey", 16, 3900);
        Notebook asus = new Notebook("asus", 16, 1024, "Windows11", "black", 16, 3800);
        Notebook lenovo = new Notebook("lenovo", 16, 512, "Windows11", "red", 10, 1700);
        Notebook macBook1 = new Notebook("macBook1", 8, 512, "macOS", "white", 4, 5600);
        Notebook samsung = new Notebook("samsung", 16, 1536, "Windows 10", "orange", 11, 4500);
        Notebook hp = new Notebook("hp", 4, 2048, "linux", "white", 8, 4500);
        Notebook msi = new Notebook("msi", 4, 1536, "linux", "black", 4, 1700);
        Notebook huawei = new Notebook("huawei", 32, 1024, "Windowsd 10", "orange", 10, 3800);
        Set<Notebook> chosenNotebooks = new HashSet<>();
        Set<Notebook> notebooks = new HashSet<>(
        Arrays.asList(macBook1, acer, asus, lenovo, macBook14, msi, samsung, hp, huawei));
        Iterator<Notebook> item = notebooks.iterator();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (item.hasNext()) {
            if (!item.next().getColor().toLowerCase().equals(line.toLowerCase())) {
                item.remove();
                i++;
            }
        }
        System.out.println(i);
        System.err.println(notebooks.toString());
        scanner.close();
    }
}
