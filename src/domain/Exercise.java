public class Exercise {
public static void main (String [] args){
    //вхідний масив
    int features[] = { 2, 2, 11, 11, 7, 6, 6, 8, 7, 7 };
    //масив із повтореннями
    int reps[] = new int[features.length/2];
    
    int temp = features[0];
    //кількість повторень temp
    int c = 0;
    //макс кількість повторень у features
    int maxCount = 0;
    //index для запису в масив reps
    int r = 0;

    //записуємо масив
    for(int i = 1; i < features.length + 1; i++) {
        //зроблено для перевірки останнього ел, звідти та умова i < features.length + 1
        int cur = features.length > i ? features[i] : -features[i-1];
        if(cur == temp) {
            c++;
        } else {
          if (maxCount < c) {
              maxCount = c;
              r = 0;
              reps = new int[features.length/2];
              reps[r] = temp;
          } else if(maxCount == c) {
              r++;
              reps[r] = temp;
          }
          c = 0;
        }
        temp = cur;
    }
    //обрізаємо в новий масив
    int result[] = new int[r+1];
    for(int i = 0; i < r + 1; i++) {
        result[i] = reps[i];
    }
    //виводимо сортований масив
    for (int k : sort(result)) {
        System.out.println(k);
    }
}

//виводимо сортований масив
public static int[] sort (int[] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (array[i] > array[j]) {
                int sTemp = array[i];
                array[i] = array[j];
                array[j] = sTemp;
            }
         }
      }
    }
}
    return array;
