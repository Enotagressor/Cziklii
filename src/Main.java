public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        int i = 1;
        int j = 10;
        int k = i;
        while (i <= j) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
            for (i=i-1; i >= k; i--) {
                System.out.print(i + " ");
            }
        }

    public static void task2(){
        int f = 6;
        int d = 31;
        for (; f <= d; f = f + 7){
            System.out.println("Сегодня пятница " + f + " число. Необходимо подготовить отчет!");
        }
    }
    public static void task3() {
        int y = 2022;
        int n = 200;
        int e = 100;
        int o = 0;
        int k = 79;

        for (; o <= (y + e); o = o + k){
            if (o >= (y - n)){
                System.out.println(o);
            }
        }

    }
}

