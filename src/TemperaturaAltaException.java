public class TemperaturaAltaException extends Exception {
    private int numeroKit;
    private String barrio;

    public TemperaturaAltaException(int numeroKit, String barrio) {
        super("Temperatura alta detectada en el kit " + numeroKit + " del barrio " + barrio);
        this.numeroKit = numeroKit;
        this.barrio = barrio;
    }

    public int getNumeroKit() {
        return numeroKit;
    }

    public String getBarrio() {
        return barrio;
    }
}