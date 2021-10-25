package  ar.edu.utn;

import java.time.LocalDate;

public abstract class Descuento {

    private LocalDate desde;
    private LocalDate hasta;

    public LocalDate getDesde(){
      return this.desde;
    }

    public LocalDate getHasta(){
      return this.hasta;
    }
    
    public void getDesde(LocalDate desde){
      this.desde = desde;
    }

    public void getHasta(LocalDate hasta){
      this.hasta = hasta;
    }

    public Boolean valido(LocalDate fecha){
        return fecha.isAfter(this.desde) && fecha.isBefore(this.hasta);
    }

    public abstract int descuento(int base);

}