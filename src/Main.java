import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//        Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
//        ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
//        фильтрации можно также в Map.
//        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//
//        Работу сдать как обычно ссылкой на гит репозиторий
//        Частые ошибки:
//        1. Заставляете пользователя вводить все существующие критерии фильтрации
//        2. Невозможно использовать более одного критерия фильтрации одновременно
//        3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру,
//        а не всем введенным пользователем
//        4. Работа выполнена только для каких то конкретных ноутбуков,
//        и если поменять характеристики ноутбуков или добавить еще ноутбук,
//        то программа начинает работать некорректно
public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        Notebook note1 = new Notebook();
        note1.setOzu(2);
        note1.setHardDisc(100);
        note1.setOs("Windows10");
        note1.setColor("Желтый");

        Notebook note2 = new Notebook();
        note2.setOzu(4);
        note2.setHardDisc(100);
        note2.setOs("Windows10");
        note2.setColor("Черный");

        Notebook note3 = new Notebook();
        note3.setOzu(3);
        note3.setHardDisc(256);
        note3.setOs("Windows10");
        note3.setColor("Золотой");

        Notebook note4 = new Notebook();
        note4.setOzu(4);
        note4.setHardDisc(512);
        note4.setOs("Windows10");
        note4.setColor("Черный");

        Notebook note5 = new Notebook();
        note5.setOzu(4);
        note5.setHardDisc(100);
        note5.setOs("Windows10");
        note5.setColor("Черный");

        Notebook note6 = new Notebook();
        note6.setOzu(4);
        note6.setHardDisc(100);
        note6.setOs("Windows10");
        note6.setColor("Черный");


        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        notebooks.add(note4);
        notebooks.add(note5);

        Map<String, String> map2 = new HashMap<>();
        map2.put("3", "os");
        map2.put("4", "color");
        Map<Integer,Integer>map = new HashMap<>();

        choice1(map);
        choice2(map2);
        fiils(notebooks, choice1(map), map2);

    }
        static Map<Integer, Integer> choice1(Map<Integer,Integer>map) {
            Map<Integer,String> menu = new HashMap<>();
            menu.put(1, "ozu");
            menu.put(2, "HardDisc");
            Scanner scanner = new Scanner(System.in);
            Map<Integer, Integer> fil1 = new HashMap<>();
            for (Map.Entry<Integer, String> entry : menu.entrySet()) {
                System.out.println("Введите минимальное значение" + entry.getValue() + " :");
                Integer value = scanner.nextInt();
                fil1.put(entry.getKey(), value);
            }
           return fil1;
        }
        static Map<String, String> choice2 (Map<String,String>map2) {
            Scanner scanner1 = new Scanner(System.in);
            Map<String, String> fil2 = new HashMap<>();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                System.out.println("Введите параметры" + entry.getValue() + " :");
                String param = scanner1.nextLine();
                fil2.put(entry.getKey(), param);

            }
            return fil2;
        }
        static void fiils(Set<Notebook> notebooks, Map<Integer,Integer> map , Map<String,String> map2 ) {
            Set<Notebook> filter = new HashSet<>();
            for (Notebook note : notebooks) {
                if (note.getOzu().equals(map.get(1)) && note.getHardDisc().equals(map.get(2))
                        && note.getOs().equals(map2.get("1")) && note.getColor().equals(map2.get("2"))) {
                    filter.add(note);
                }
            }
            System.out.println(filter);
        }
}