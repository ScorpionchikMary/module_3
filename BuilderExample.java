class Computer {
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    
    // Геттеры
    public String getHDD() { return HDD; }
    public String getRAM() { return RAM; }
    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }
    
    // Builder класс
    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }
        
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
}

// Использование
public class BuilderExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "8GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(false)
                .build();
        
        System.out.println("Computer config: HDD=" + computer.getHDD() + 
                          ", RAM=" + computer.getRAM() +
                          ", GraphicsCard=" + computer.isGraphicsCardEnabled() +
                          ", Bluetooth=" + computer.isBluetoothEnabled());
    }
}