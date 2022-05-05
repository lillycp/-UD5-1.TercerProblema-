import com.utils.RobotsUtils;

public class Producto {

    public String nombre;
    public float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Crear producto
    public static Producto generarProducto() {
        String nombre = RobotsUtils.generarNombreProducto();
        float precio = (float) RobotsUtils.generarNumeroAleatorio(20);
        return new Producto(nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
