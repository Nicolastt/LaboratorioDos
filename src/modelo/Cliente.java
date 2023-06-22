package modelo;

public class Cliente {
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private double efectivo;
    private boolean haComprado;

    public double getEfectivo() {
        return efectivo;
    }

    public Cliente(String nombre, String direccion, String telefono, double efectivo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.efectivo = efectivo;
    }

    public void verificarSiEsPosibleComprar(Bicicleta bicicleta, Local local, Vendedor vendedor){
        if(haComprado){
            System.out.println("El cliente ya ha comprado anteriormente, solo se permite una compra por persona");
            return;
        }
        //if(!local.bicicletaEnStock(bicicleta)){
        //    System.out.println("No disponemos de esa bicicleta en nuestro almacen");
        //    return;
        //}
        if(!saldoSuficiente(bicicleta)){
            System.out.println("No dispone del dinero suficiente para comprar la bicicleta");
            return;
        }
        comprarBicicleta(bicicleta);
        Factura factura = new Factura(bicicleta,this,vendedor);
        vendedor.generarFactura(factura);
        vendedor.entregarBicicleta(local,bicicleta,this);
        //local.EmpleadoDelMes(vendedor);

    }

    public boolean saldoSuficiente(Bicicleta bicicleta){
        return this.efectivo >= bicicleta.getPrecio();
    }
    public void comprarBicicleta(Bicicleta bicicleta){
        this.efectivo = efectivo - bicicleta.getPrecio();
        haComprado = true;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }


    public void comprarCasco(Local local, Vendedor vendedor) {
        double precioCasco = 20000;
        if (!(this.efectivo > precioCasco)) {
            System.out.println("Saldo Insuficiente!");
            return; // para salir del método sin ejecutar las líneas de código restantes.
        }

        this.efectivo -= precioCasco;
        local.venderCasco();
        vendedor.haVendido();
    }

    public void comprarCandado(Local local, Vendedor vendedor) {
        double precioCandado = 5;
        if (!(this.efectivo > precioCandado)) {
            System.out.println("Saldo Insuficiente!");
            return; // para salir del método sin ejecutar las líneas de código restantes.
        }
        this.efectivo -= precioCandado;
        local.venderCandado();
        vendedor.haVendido();
    }

}
