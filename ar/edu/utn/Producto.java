package ar.edu.utn;

import java.time.LocalDate;

public class Producto {

  private String nombre;
  private String descripcion;
  private LocalDate fechaAlta;
  private Integer pesoKg;
  private Double precio;

  private static final Double minPrecio = 0.1;

  public Producto(String nombre) {
    this.nombre = nombre;
    this.fechaAlta = LocalDate.now();
    this.precio = minPrecio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public LocalDate getFechaAlta() {
    return this.fechaAlta;
  }

  public String getDescripcion() {
    return this.descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public int getPesoKg() {
    return this.pesoKg;
  }

  

  public void setPesoKg(int pesoKg) {
    this.pesoKg = pesoKg;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }

  public int getPrecio(){
    return this.precio.intValue();
  }



}