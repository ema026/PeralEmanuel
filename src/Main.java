import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)  {

        Ssm ssm = new Ssm();
        try {
        ssm.registrarPersona("Emanuel", "Peral", 31, "La Perla", "36382541", "Empleado");
        ssm.registrarPersona("Mariano", "Medina", 31, "barrio1", "36358965", "Empleado");
        ssm.registrarPersona("Sebastian", "Cabral", 31, "barrio2", "25368451", "Empleado");
        ssm.registrarPersona("Andrea", "Cabral", 31, "La Perla", "3215468", "Empleado");
        ssm.registrarPersona("Juan", "Cabral", 31, "centro", "6541236", "Empleado");
        ssm.registrarPersona("Cistina", "Cabral", 31, "Nueva pompeya", "1265489", "Empleado");
        ssm.registrarPersona("Sol", "Cabral", 31, "barrio4", "45987156", "Empleado");
        ssm.registrarPersona("Daiana", "Cabral", 31, "bario5", "36548741", "Empleado");
        ssm.registrarPersona("Esteban", "Cabral", 31, "barrio6", "31985474", "Empleado");
        }catch (SinReactivosException e){
            System.out.println("No hay reactivos");
        }

        HashMap<Integer, RegistroTemperatura> testeo = new HashMap<>();
        testeo = ssm.testear();

        for (HashMap.Entry<Integer, RegistroTemperatura> entry : testeo.entrySet()) {
            int numeroKit = entry.getKey();
            RegistroTemperatura registro = entry.getValue();
            System.out.println("Kit: " + numeroKit + " | DNI: " + registro.getDni() + " | Temperatura: " + registro.getTemperatura());
        }

    try{
        ssm.aislar();
    }
     catch (TemperaturaAltaException e) {
        System.out.println("Temperatura alta detectada en el kit " + e.getNumeroKit() + " del barrio " + e.getBarrio());
    }
    

        System.out.println("Personas sin casos sospechosos:");
        ArrayList<Persona> personasSinCasosSospechosos = ssm.obtenerPersonasSinCasosSospechosos();
        for (Persona persona : personasSinCasosSospechosos) {
            System.out.println(persona);
        }

        System.out.println("\nCasos sospechosos:");
        ArrayList<CasoSospechoso> casosSospechosos = ssm.obtenerCasosSospechosos();
        for (CasoSospechoso caso : casosSospechosos) {
            System.out.println("Kit: " + caso.getNumeroKit() + " | Temperatura: " + caso.getTemperatura() + " | Barrio: " + caso.getBarrio());
        }
    }


    }


