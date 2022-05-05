import com.generic.GenericStack;
import com.utils.RobotsUtils;

public class Robot {

    public String nombreRobot;
    private GenericStack<Producto> espacioCarga = new GenericStack<Producto>();


    public Robot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    public String getNombreRobot() {
        return nombreRobot;
    }

    public void setNombreRobot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    //crear robot
    public static Robot generateRobot() {
        Robot robot = new Robot(RobotsUtils.generarNombreRobot());
        int numProductos = (int) RobotsUtils.generarNumeroAleatorio(5);
        for (int i = 0; i < numProductos; i++) {
            robot.anyadirProducto();
        }
        return robot;
    }

    public void anyadirProducto() {
        Producto producto = Producto.generarProducto();
        System.out.println("El robot " + getNombreRobot() + " apila " + producto);
        espacioCarga.push(producto);
    }

}
