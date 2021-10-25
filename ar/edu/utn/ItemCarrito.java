package  ar.edu.utn;

public class ItemCarrito {

    private Producto producto;
    private Integer cantidad;


    public ItemCarrito(int cantidad,Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto(){
        return this.producto;
    }

    public Integer getCantidad(){
        return this.cantidad;
    }

    public int precio(){
      return this.cantidad * this.producto.getPrecio();
    }

}