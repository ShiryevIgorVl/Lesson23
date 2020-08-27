import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class TelephoneDirectory {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Иванов", "111 , 222");
//        map.put("Иванов", 222);
        map.put("Петров", "333");
        map.put("Сидоров", "444 , 555");
//        map.put("Сидоров", "555");
        map.put("Смирнов", "666");

//        ArrayList<String> TelDir = new ArrayList<>();
//        TelDir.add(111, "Иванов");
//        TelDir.add(222, "Иванов");
//        TelDir.add(333, "Петров");
//        TelDir.add(444, "Сидоров");
//        TelDir.add(555, "Смирнов");
//        TelDir.add(666, "Смирнов");


        System.out.println(map.get("Сидоров"));
           }


}
