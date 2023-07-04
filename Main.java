import java.util. *;
public class Main {
        public static void main(String[] args) {
                    int[] array = {1, 2, 3, 4, 2, 1, 5, 5, 6, 7, 8, 8};
                    List<Integer> list = new ArrayList<>();
                    for (int element : array) {
                        list.add(element);
                    }
                    Set<Integer> uniqueSet = new LinkedHashSet<>(list);
                    int[] uniqueArray = new int[uniqueSet.size()];
                    int index = 0;
                    for (int element : uniqueSet) {
                        uniqueArray[index++] = element;
                    }

                    for (int element : uniqueArray) {
                        System.out.print(element + " ");
                    }
                }
            }
