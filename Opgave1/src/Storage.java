import java.util.ArrayList;

public class Storage {
    private static ArrayList<Cirkel> gemteCirkler = new ArrayList<>();
    public static void addNyCirkel(Cirkel cirkel) {
        gemteCirkler.add(cirkel);
    }
    public static ArrayList<Cirkel> getAlleCirkler() {
        return new ArrayList<Cirkel>(gemteCirkler);
    }
}
