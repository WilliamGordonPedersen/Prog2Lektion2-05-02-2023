public abstract class Figur {
    private int omkreds;
    private int areal;
    private int x;
    private int y;

    public Figur(int omkreds, int areal, int x, int y) {
        super();
        this.omkreds = omkreds;
        this.areal = areal;
        this.x = x;
        this.y = y;
    }

    public int getOmkreds() {
        return omkreds;
    }

    public int getAreal() {
        return areal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

