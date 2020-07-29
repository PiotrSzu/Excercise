package WzorceProjektowe;

public class Computer {
    private String ram;
    private String hdd;
    private String processor;

    private boolean graphicCard;
    private boolean bluetooth;
    private boolean networkCard;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.processor = builder.processor;
        this.graphicCard = builder.graphicCard;
        this.bluetooth = builder.bluetooth;
        this.networkCard = builder.networkCard;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public boolean isGraphicCard() {
        return graphicCard;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public boolean isNetworkCard() {
        return networkCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", processor='" + processor + '\'' +
                ", graphicCard=" + graphicCard +
                ", bluetooth=" + bluetooth +
                ", networkCard=" + networkCard +
                '}';
    }

    public static class ComputerBuilder{
        private String ram;
        private String hdd;
        private String processor;

        private boolean graphicCard;
        private boolean bluetooth;
        private boolean networkCard;

        public ComputerBuilder(String ram, String hdd, String processor) {
            this.ram = ram;
            this.hdd = hdd;
            this.processor = processor;
        }

        public ComputerBuilder setGrapficCard(boolean grapficCard){
            this.graphicCard = grapficCard;
            return this;
        }
        public ComputerBuilder setBluetooth(boolean bluetooth){
            this.bluetooth = bluetooth;
            return this;
        }
        public ComputerBuilder setNetworkCard(boolean networkCard){
            this.networkCard = networkCard;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
