public class Robot {

    public String nombreRobot;
    public boolean espacioCarga;

    public Robot(String nombreRobot, boolean espacioCarga) {
        this.nombreRobot = nombreRobot;
        this.espacioCarga = espacioCarga;
    }

    public String getNombreRobot() {
        return nombreRobot;
    }

    public void setNombreRobot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    public boolean isEspacioCarga() {
        return espacioCarga;
    }

    public void setEspacioCarga(boolean espacioCarga) {
        this.espacioCarga = espacioCarga;
    }


}
