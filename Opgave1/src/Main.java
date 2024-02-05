public class Main {
    public static void main(String[] args) {
        int sidelængden=5;
        Cirkel cirkel = new Cirkel(50, 5, 10, 10, 50, 100);
        Kvadrat kvadrat = new Kvadrat(10, 10, 2, 2, sidelængden);
cirkel.beregnAreal();
        System.out.println(cirkel.beregnAreal());
        Storage.addNyCirkel(cirkel);
        System.out.println(Storage.getAlleCirkler());
    }
}