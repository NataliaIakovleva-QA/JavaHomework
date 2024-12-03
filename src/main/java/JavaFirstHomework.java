import java.util.List;

public class JavaFirstHomework {

    public static void intDoubleOperations() {
        int a = 5;
        double b = 2.5;

        // Сложение int и double
        double result = a + b;
        System.out.println("Результат сложения: " + result);

        // Вычитание int и double
        result = a - b;
        System.out.println("Результат вычитания: " + result);

        // Умножение int и double
        result = a * b;
        System.out.println("Результат умножения: " + result);

        // Деление int и double
        result = a / b;
        System.out.println("Результат деления: " + result);

        double x = 9.99;
        int y = (int) x; // Приведение double к int

        System.out.println("Значение double: " + x);
        System.out.println("Значение после приведения к int: " + y);

    }

    public static void overflowOperations () {

        int maxInt = Integer.MAX_VALUE; // Максимальное значение для int
        System.out.println("Максимальное значение для int: " + maxInt);

        // Переполнение при сложении
        int result = maxInt + 1;
        System.out.println("Результат переполнения (maxInt + 1): " + result);

        int maxInt2 = Integer.MAX_VALUE;

        // Переполнение при умножении
        int result2 = maxInt2 * 2;
        System.out.println("Результат переполнения (maxInt2 * 2): " + result2);

    }

    public static void logicOperators() {
        int a = 5;
        int b = 10;
        boolean result;

        // Логическое И (&&)
        result = (a > 3) && (b < 20);
        System.out.println("a > 3 и b < 20: " + result);

        // Логическое ИЛИ (||)
        result = (a > 3) || (b > 20);
        System.out.println("a > 3 или b > 20: " + result);

        // Логическое НЕ (!)
        result = !(a < 10);
        System.out.println("a не меньше 10: " + result);
    }

    public static void main(String[] args) {
        intDoubleOperations();
        overflowOperations();
        logicOperators();

    }
}
