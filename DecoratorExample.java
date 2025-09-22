// Базовый интерфейс
interface Coffee {
    double getCost();
    String getDescription();
}

// Конкретная реализация
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.0;
    }
    
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}

// Базовый декоратор
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    
    public double getCost() {
        return decoratedCoffee.getCost();
    }
    
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

// Конкретные декораторы
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}

// Использование
public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());
        
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());
    }
}