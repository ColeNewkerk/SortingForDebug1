import java.util.List;

public class Sorter {

    public static void sort(List<Integer> aList) {
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.size(); j++) {
                if (aList.get(i) < aList.get(j)) {
                    var temp = aList.get(i);
                    aList.set(i, aList.get(j));
                    aList.set(j, temp);
                }
            }
        }
    }

}
