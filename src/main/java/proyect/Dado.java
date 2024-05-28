package proyect;

public class Dado {
    private short cara;

    public Dado() {
    }

    public void lanzar() {
        cara = (short) (Math.random() * 6 + 1);
    }

    public short getCara() {
        return cara;
    }
}
