import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();


        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                int cube1 = j * j * j;
                if (cube1 > i) break;
                for (int k = j; k <= i; k++) {
                    int cube2 = k * k * k;
                    if (cube2 > i) break;
                    if (cube1 + cube2 == i) count++;
                    if (count == 2) {
                        numbers.add(i);
                        break;
                    }
                }
                if (count == 2) break;
            }
        }


        int size = numbers.size();
        if (size == 0) {
            System.out.println("none");
        } else {
            int lastIndex = size - 1;
            System.out.println(numbers.get(lastIndex));
        }
        scanner.close();
    }
}
