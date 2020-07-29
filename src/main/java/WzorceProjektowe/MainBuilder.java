package WzorceProjektowe;

public class MainBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1024", "1024", "Atom 2").setBluetooth(true)
                .setGrapficCard(true)
                .setNetworkCard(true)
                .build();
        System.out.println(computer.toString());
    }
}
