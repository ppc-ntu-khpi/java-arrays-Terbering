import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Створюємо масив інтів розміром size
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        
        // Заповнюємо масив arr з клавіатури
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxCount = 0;
        int mostFrequent = 0;
        
        // Створюємо HashMap для підрахунку кількості входжень кожного числа
        Map<Integer, Integer> countMap = new HashMap<>();

        // Додаємо кожне число з масиву до countMap, збільшуючи його лічильник
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Проходимось по елементах countMap, знаходячи ключ з найбільшою кількістю входжень
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Виводимо найчастіше зустрічаючеся число та кількість його входжень
        System.out.println("Most frequent number is " + mostFrequent + " and it occurs " + maxCount + " times.");
    }
}