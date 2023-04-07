package ejerciciopolimor;

public class Perecedero extends Producto {

    protected int diasPorCaducar;

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    public Perecedero( String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "{" +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", diasPorCaducar='"  + diasPorCaducar + '\'' +
                '}';
    }

    @Override
    public double calcular (int cantidadDeProductos) {

      /*  if (diasPorCaducar==1){
            return cantidadDeProductos*precio/4;
        }
        else if  (diasPorCaducar==2){
            return cantidadDeProductos*precio/3;
        }
       else if (diasPorCaducar==3){
           return diasPorCaducar*precio/2;
        }
        return cantidadDeProductos*precio; */

        switch (diasPorCaducar) {
            case 1:
            return   cantidadDeProductos*this.precio/4;
                case 2:
                return cantidadDeProductos*this.precio/3;
            case 3:
              return cantidadDeProductos*this.precio/2;
            default:
                return (cantidadDeProductos*this.precio);

        }
    }
}



