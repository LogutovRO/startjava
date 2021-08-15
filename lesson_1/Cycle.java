public class Cycle {   
    public static void main(String[] args) {
        System.out.println("Task1: Выведите на консоль с помощью цикла for все числа от [0, 20]");

        for (int i = 0; i <= 20; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Task2: Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");

        int j = 6;
        while (j >=-6) {
            System.out.println("j = " + j);
            j -= 2;
        }

        System.out.println("Task3: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");

        int k = 10;
        int sumAdd = 0;
        do {
            if (k % 2 != 0) {
                sumAdd += k;
            }
            k++;
        } while (k <= 20);
        System.out.println("sumAdd = " + sumAdd);
    }
}