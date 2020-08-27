import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String[], Integer> map = new HashMap<>();
        String[] arr = new String[]{"никель", "урок", "хирург", "песня", "небо", "картон", "кулич", "никель", "клад", "оса", "козлы", "картон", "урок", "ящик", "весна", "мотор", "картон", "шаль", "рай", "предатель"};

        for (int i = 0; i < arr.length; i++) {
            Integer value = map.getOrDefault(arr[i],0);
            map.put(arr, value + 1);
        }

        System.out.println(map);

    }
}
