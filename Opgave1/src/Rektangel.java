public class Rektangel extends Figur{
    private int længde;
    private int bredde;
    public Rektangel(int omkreds, int areal, int x, int y, int længde, int bredde) {
        super(omkreds, areal, x, y);
        this.længde = længde;
        this.bredde = bredde;
    }

    public int getLængde() {
        return længde;
    }

    public int getBredde() {
        return bredde;
    }
}
