public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen("Mercadona");

        for (int i = 0; i < 6; i++) {
            Robot robot = Robot.generateRobot();
            almacen.almacenarRobot(robot);
        }

        for (int i = 0; i < 6; i++) {
            almacen.descargarRobot();
        }

    }
}
