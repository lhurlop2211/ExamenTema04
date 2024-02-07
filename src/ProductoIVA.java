public class ProductoIVA extends Producto{

    private double IVAaplicable;

    public ProductoIVA(String descripcion, double precioBruto) {
        super(descripcion, precioBruto);
    }



    public double getIVAaplicable() {
        return IVAaplicable;
    }

    public void setIVAaplicable(double IVAaplicable) {
        this.IVAaplicable = IVAaplicable;
    }
}
