package modelo;

public class Bicicleta {
    private Llanta llanta;
    private Freno freno;
    private Cambio cambio;
    private final String marca;
    private final String modelo;
    private final String color;
    private final double precio;
    static private int numBicicletas = 0;
    private int identificador;

    public Bicicleta(Llanta llanta, Freno freno, Cambio cambio, String marca, String modelo, String color, double precio) {
        this.llanta = llanta;
        this.freno = freno;
        this.cambio = cambio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.identificador = ++numBicicletas;
    }

    public double getPrecio() {
        return precio;
    }

    public String impBicicletas(){
        return "--------------------------------------------------------" + "\n" +
                "Bicicleta N° " + identificador + "\n" +
                "--------------------------------------------------------" + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio: " + this.precio + "\n" +
                freno.impTipoFreno() + "\n"+
                "Llanta: " + llanta.impLlanta()+ "\n" +
                "Cambios: " + cambio.impTipoCambios();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

}
