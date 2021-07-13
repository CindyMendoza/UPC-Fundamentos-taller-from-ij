import java.util.HashMap;
import java.util.Map;

public class repeatStringSO {
    public static void main(String[] args) {
        String[] arr = {"PE219002", "PE219103", "PE219204",
                "PE219305", "PE219406", "PE219507","AR219002","AR219103","AR219204","AR219305","AR219406","AR219507",
                "CH219002","CH219103","CH219204","CH219305","CH219406","CH219507","BR219002","BR219103","BR219204",
                "BR219305","BR219406","BR219507"};
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String word: arr) {
            // if word is not in the map
            if(!map.containsKey(word))
                map.put(word, 0);
            map.put(word, map.get(word) + 1);
        }

        for(String word: map.keySet())
            System.out.println(word + " occurs " + map.get(word) + " times");
    }
}
