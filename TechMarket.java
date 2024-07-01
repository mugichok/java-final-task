import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TechMarket {
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
        Set<Notebook> notebooks = new HashSet<>(
                Arrays.asList(macBook1, acer, asus, lenovo, macBook14, msi, samsung, hp, huawei));
        Scanner scanner = new Scanner(System.in);
        filtrationNotebooks(notebooks, scanner);
        scanner.close();
    }

    private static void filtrationNotebooks(Set<Notebook> notebooks, Scanner scanner) {
        Set<Notebook> chosenNotebooks = new HashSet<>();
        Iterator<Notebook> item = chosenNotebooks.iterator();
        boolean flag = true;
        boolean flag1 = true;

        while (flag) {
            flag1 = true;
            item = chosenNotebooks.iterator();
            System.out.println(
                    "Выберите критерий для выборки ноутбуков, выведите список моделей или завершите программу:\n1. Объём ОЗУ\n2. Объём жесткого диска\n3. Операционная система\n4. Цвет\n5. Количество ядер процессора\n6. Частота процессора\n7. Показать подходящие модели\n8. Завершить программу\n9.Сбросить фильры");
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Введите минимальное значение ОЗУ: ");
                userInput = scanner.nextLine();

                if (checkInt(userInput)) {
                    Integer userInputInt = Integer.parseInt(userInput);

                    if (!item.hasNext()) {
                        for (Notebook elem : notebooks) {
                            if (elem.getRam() >= userInputInt) {
                                chosenNotebooks.add(elem);
                            }
                        }

                    } else {

                        while (item.hasNext()) {
                            if (item.next().getRam() < userInputInt) {
                                item.remove();
                            }
                        }
                    }
                }

            } else if (userInput.equals("2")) {
                System.out.println("Введите минимальное значение объёма жёсткого диска: ");
                userInput = scanner.nextLine();

                if (checkInt(userInput)) {
                    Integer userInputInt = Integer.parseInt(userInput);

                    if (!item.hasNext()) {
                        for (Notebook elem : notebooks) {
                            if (elem.getSsd() >= userInputInt) {
                                chosenNotebooks.add(elem);
                            }
                        }

                    } else {

                        while (item.hasNext()) {
                            if (item.next().getSsd() < userInputInt) {
                                item.remove();
                            }
                        }
                    }
                }

            } else if (userInput.equals("3")) {
                System.out.println("Введите нужную операционную систему: ");
                userInput = scanner.nextLine();

                if (!item.hasNext()) {

                    for (Notebook elem : notebooks) {
                        if (elem.getOperationSystem().toLowerCase().equals(userInput.toLowerCase())) {
                            chosenNotebooks.add(elem);
                        }
                    }

                } else {

                    while (item.hasNext()) {
                        if (!item.next().getOperationSystem().toLowerCase().equals(userInput.toLowerCase())) {
                            item.remove();
                        }
                    }
                }

            } else if (userInput.equals("4")) {
                System.out.println("Введите нужный цвет: ");
                userInput = scanner.nextLine();

                if (!item.hasNext()) {

                    for (Notebook elem : notebooks) {
                        if (elem.getColor().toLowerCase().equals(userInput.toLowerCase())) {
                            chosenNotebooks.add(elem);
                        }
                    }

                } else {

                    while (item.hasNext()) {
                        if (!item.next().getColor().toLowerCase().equals(userInput.toLowerCase())) {
                            item.remove();
                        }
                    }

                }

            } else if (userInput.equals("5")) {
                System.out.println("Введите минимальное количество ядер процессора: ");
                userInput = scanner.nextLine();

                if (checkInt(userInput)) {
                    Integer userInputInt = Integer.parseInt(userInput);

                    if (!item.hasNext()) {
                        for (Notebook elem : notebooks) {
                            if (elem.getNumnerCoresProc() >= userInputInt) {
                                chosenNotebooks.add(elem);
                            }
                        }

                    } else {

                        while (item.hasNext()) {
                            if (item.next().getNumnerCoresProc() < userInputInt) {
                                item.remove();
                            }
                        }
                    }
                }

            } else if (userInput.equals("6")) {
                System.out.println("Введите минимальное частоту процессора: ");
                userInput = scanner.nextLine();

                if (checkInt(userInput)) {
                    Integer userInputInt = Integer.parseInt(userInput);

                    if (!item.hasNext()) {
                        for (Notebook elem : notebooks) {
                            if (elem.getFrecuenceProc() >= userInputInt) {
                                chosenNotebooks.add(elem);
                            }
                        }

                    } else {

                        while (item.hasNext()) {
                            if (item.next().getFrecuenceProc() < userInputInt) {
                                item.remove();
                            }
                        }
                    }
                }

            } else if (userInput.equals("7")) {
                if (chosenNotebooks.isEmpty()) {
                    System.out.println("вы не выбрали критерии для фильтрации либо нет подходящих моделей\n");

                } else {
                    for (Notebook elem : chosenNotebooks) {
                        System.out.println(elem.toString());
                    }
                }

            } else if (userInput.equals("8")) {
                flag = false;
                flag1 = false;

            } else if (userInput.equals("9")) {
                chosenNotebooks.clear();
                System.out.println("\nФильры сброшены\n");
                flag1 = false;

            } else {
                System.out.println("Вы введи некорректные данные, попробуйте ещё раз;)");
            }

            if (chosenNotebooks.isEmpty() && flag1) {
                System.out.println("\nНет подходящих моделей(\nУкажите другие критерии\n");
            }

        }
    }

    public static boolean checkInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные, попробуйте ещё раз;)\n");
            return false;
        }
    }
}
