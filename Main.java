public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация всех паттернов ===\n");
        
        // 1. Запуск примера Стратегии
        System.out.println("1. ЗАПУСК СТРАТЕГИИ:");
        StrategyExample.main(new String[]{});
        System.out.println();
        
        // 2. Запуск примера Цепочки обязанностей
        System.out.println("2. ЗАПУСК ЦЕПОЧКИ ОБЯЗАННОСТЕЙ:");
        ChainOfResponsibilityExample.main(new String[]{});
        System.out.println();
        
        // 3. Запуск примера Билдера
        System.out.println("3. ЗАПУСК СТРОИТЕЛЯ:");
        BuilderExample.main(new String[]{});
        System.out.println();
        
        // 4. Запуск примера Прокси
        System.out.println("4. ЗАПУСК ПРОКСИ:");
        ProxyExample.main(new String[]{});
        System.out.println();
        
        // 5. Запуск примера Декоратора
        System.out.println("5. ЗАПУСК ДЕКОРАТОРА:");
        DecoratorExample.main(new String[]{});
        System.out.println();
        
        // 6. Запуск примера Адаптера
        System.out.println("6. ЗАПУСК АДАПТЕРА:");
        AdapterExample.main(new String[]{});
    }
}