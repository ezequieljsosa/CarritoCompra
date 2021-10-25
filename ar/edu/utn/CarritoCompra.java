package  ar.edu.utn;

public class CarritoCompra {

  private ItemCarrito item;

  // Por ahora lo simplificamos a un solo articulo
  public void addProducto(ItemCarrito cp) {
    this.item = cp;
  }

  public int precio(Descuento descuento){
    return item.precio() - 
            descuento.descuento(item.precio());
  }

}