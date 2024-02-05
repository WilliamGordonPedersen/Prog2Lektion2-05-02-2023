public class Cirkel extends Figur{
    private int radius;
    private int diameter;
    public Cirkel(int omkreds, int areal, int x, int y, int radius, int diameter) {
        super(omkreds, areal, x, y);
        this.radius = radius;
        this.diameter = diameter;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }
    public void gemCirkel() {
        //if(!(cikler.contains))

    }
    public double beregnAreal() {
double areal = Math.PI * Math.pow(this.radius, 2);
        return areal;
    }

    @Override
    public String toString() {
        return "Radius: " + radius+ ", Diameter: "+ diameter + beregnAreal() ;
    }
}
