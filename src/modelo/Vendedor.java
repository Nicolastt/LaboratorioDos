package modelo;

public class Vendedor {
    private final String nombre;
    private final String id;
    static private int i = 0;
    private double sueldo;
    public int contadorVentas;

    public Vendedor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = 425;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void generarFactura(Factura factura){
        factura.imprimirFactura();
        contadorVentas++;
    }

    public void entregarBicicleta(Local local, Bicicleta bicicleta, Cliente cliente){
        local.quitarBicicleta(bicicleta);
    }

    public String impEmpleados(){
        return String.format("Empleado %d:%n Nombre: %s    Id: %s           NumeroDeVentas: %d",++i,this.nombre,this.id,this.contadorVentas);
    }

    public int getContadorVentas() {
        return contadorVentas;
    }

    public void haVendido() {
        ++contadorVentas;
    }
}
