// Интерфейс
interface Image {
    void display();
}

// Реальный объект
class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
    
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// Прокси
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Использование
public class ProxyExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        
        // Изображение загрузится только при вызове display()
        image.display();
        System.out.println("---");
        
        // Повторный вызов - загрузка не происходит
        image.display();
    }
}