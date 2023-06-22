package modelo;

public class Cambio {
    private final int numMarch;
    private final String tipo;

    public Cambio(int numMarch, String tipo) {
        this.numMarch = numMarch;
        this.tipo = tipo;
    }

    public String impTipoCambios(){
        return String.format("\n Tipo: %s    NúmeroDeMarchas: %d", this.tipo, this.numMarch);
    }
}
