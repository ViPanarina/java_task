public class hw30_01 {

    public static void main(String[] args) {
        //создаем массив длинной 22
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        //обходим массив циклом и счмиаем сумму элементов с начала до конца
        int sum = 0;
        for (int i= 0; i< array.length;i++ ) {
            sum=sum+array[i];
            System.out.println(sum);
        }
        System.out.println(sum);



        //посчитать сумму элементов с конца в начало
       /* for(int i= array.length-1; i>=0;i--){
            sum = sum+ array[i];
            System.out.println(sum);
        }
        System.out.println(sum);
         */


        //посчитать сумму элементов сначала с четными
       /*
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0){
               sum = sum + array[i];
                System.out.println(sum);
            }
            */

        // а потом с нечетными индексами
        /*
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum = sum + array[i];
                System.out.println(sum);
            }
        }
         */

        //пройтись циклом так что бы суммировались первый и послежний, потом второй и предпослежний итд
       /* public static int getSum(int[] arr){
            int firstElement = 0;
            int secondElement = array.length - 1;
            while (firstElement < secondElement) {
                sum = sum + (array[firstElement] + array[secondElement]);
                firstElement++;
                secondElement--;
            }
            return sum;
        }
        */
    }
}







