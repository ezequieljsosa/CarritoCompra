import ar.edu.utn.CarritoCompra;
import ar.edu.utn.DescuentoPorcentaje;
import ar.edu.utn.Producto;
import ar.edu.utn.ItemCarrito;


class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");

    Producto p1 = new Producto("cosito del coso");
    p1.setPrecio(100);
    ItemCarrito cp1 = new ItemCarrito( 2 ,p1);
    
    CarritoCompra cc = new CarritoCompra();
    cc.addProducto(cp1);
    DescuentoPorcentaje descuento = new DescuentoPorcentaje(0.10);
    

    System.out.println(cc.precio(descuento));
    
  }
}