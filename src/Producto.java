public class Producto implements Comprable{
    private final String descripcion;
    private final double precioBruto;


    public Producto(String descripcion, double precioBruto) {
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }

    public String getDescripcion() {
        if (descripcion.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            return descripcion;
        }
    }

    public double getPrecioBruto() {
        if (precioBruto >= 0) {
            return precioBruto;
        } else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return (descripcion + " : " + precioBruto + " € ");
    }

    public void getPrecioNeto(){
        getPrecioNeto();
    }
}
