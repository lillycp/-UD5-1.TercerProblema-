import com.generic.GenericQueue;
import com.utils.RobotsUtils;

public class Almacen {

    public String nombre;
    private GenericQueue<Robot> cola = new GenericQueue<Robot>();

    public Almacen(String nombre) {
        this.nombre = nombre;
    }

    public void almacenarRobot(Robot robot){
        System.out.println("El robot " + robot.getNombreRobot() + " se ha almacenado");
        cola.enqueue(robot);
    }

    public Robot descargarRobot() {
        Robot robot = cola.dequeue();
        System.out.println("Descargado robot: " + robot.getNombreRobot());
        return robot;
    }
}
