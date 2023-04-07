package ejerciciopolimor;

public class NoPerecedero extends Producto {
  String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "{" +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public double calcular (int cantidadDeProductos){

  return precio*cantidadDeProductos;

    }


}
