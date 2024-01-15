
public class Main {
    public static void main(String[] args) {
        test(25, 15);
        test(18, 25);
        test(50, 5);
        test(generateRandomAge(), 20);
        test(generateRandomAge(), 30);
    }

    public static void test(int age, int temperature) {
        String result = canGoOutside(age, temperature);
        System.out.println(result);
    }

    public static String canGoOutside(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature >= 0 && temperature <= 28)
                || (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 70) + 1;
    }
}