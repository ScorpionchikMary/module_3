// Старая система (адаптируемый класс)
class LegacyRectangle {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("LegacyRectangle: draw(" + x1 + "," + y1 + "," + x2 + "," + y2 + ")");
    }
}

// Новый интерфейс
interface Shape {
    void draw(int x, int y, int width, int height);
}

// Адаптер
class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;
    
    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    
    @Override
    public void draw(int x, int y, int width, int height) {
        int x2 = x + width;
        int y2 = y + height;
        legacyRectangle.draw(x, y, x2, y2);
    }
}

// Использование
public class AdapterExample {
    public static void main(String[] args) {
        LegacyRectangle legacyRect = new LegacyRectangle();
        Shape adapter = new RectangleAdapter(legacyRect);
        
        // Используем новый интерфейс со старым кодом
        adapter.draw(10, 20, 30, 40);
    }
}