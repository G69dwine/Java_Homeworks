package Seminar4;

import java.util.ArrayList;
// import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+7905554433", "Andrew");
        res = hashMap.put("+7905554432", "Alex");
        res = hashMap.put("+7905554432", "Dora");
        
        // Есть нюанс - вывод проходит в порядке, как записано в buckets, но не в порядке записи.
        for (HashMap.Entity element : hashMap) {
            if(element != null)
                System.out.println(element.key + " - " + element.value);
        }

    }
}
