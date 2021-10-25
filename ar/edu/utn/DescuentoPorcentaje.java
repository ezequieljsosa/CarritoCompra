package  ar.edu.utn;

import java.time.LocalDate;

public class DescuentoPorcentaje extends Descuento {

    private Double porcentaje;

    public DescuentoPorcentaje(double porcentaje){      
      this.porcentaje = porcentaje;
    }


    public int descuento(int base ){
      return  Double.valueOf(base * this.porcentaje).intValue();
    }

}