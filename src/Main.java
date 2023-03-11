public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();

    }

    private static void Task1  () {
        System.out.println("Задача 1");
        int [] array = generateRandomArray();
        int sum =0;
        for (int n : array) {
            sum += n;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    private static void Task2  () {
        System.out.println("Задача 2");
        int [] array = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    private static void Task3  () {
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        int sum =0;
        for (int n : array) {
            sum += n;
        }
        double averageSum = 0;
        for (int i = 0; i < array.length; i++) {
            averageSum = sum / array.length;

        }
        System.out.println( averageSum);
    }
    private static void Task4  () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}