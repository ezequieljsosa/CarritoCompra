package  ar.edu.utn;

import java.time.LocalDate;

public class DescuentoFijo extends Descuento {

    private int monto;

    public DescuentoFijo(int monto){
      this.monto = monto;
    }


    public int descuento(int base ){
      return monto;
    }

}