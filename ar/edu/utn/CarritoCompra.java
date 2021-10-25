package  ar.edu.utn;

public class CarritoCompra {

  private CompraProducto compraProducto;

  // Por ahora lo simplificamos a un solo articulo
  public void addProducto(CompraProducto cp) {
    this.compraProducto = cp;
  }

  public int precio(Descuento descuento){
    return compraProducto.precio() - 
            descuento.descuento(compraProducto.precio());
  }

}