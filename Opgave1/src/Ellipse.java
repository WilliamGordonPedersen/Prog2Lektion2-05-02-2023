public class Ellipse extends Figur {
    private int radiusLodret;
    private int radiusVandret;
    public Ellipse(int omkreds, int areal, int x, int y, int radiusLodret, int radiusVandret) {
        super(omkreds, areal, x, y);
        this.radiusLodret = radiusLodret;
        this.radiusVandret = radiusVandret;
    }

}
