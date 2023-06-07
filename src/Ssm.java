import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ssm {
    private LinkedHashSet<Persona> listaPersonas;

    private ArrayList<CasoSospechoso> casosSospechosos;
    private Integer cantidadReactivos = 1000;

    public Ssm() {
        listaPersonas = new LinkedHashSet<>();
        casosSospechosos = new ArrayList<CasoSospechoso>();
    }



    public void registrarPersona(String nombre, String apellido, int edad, String barrio, String dni, String ocupacion)
            throws SinReactivosException {
        if (cantidadReactivos <= 0) {
            throw new SinReactivosException("No hay mas reactivos");
        }

        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                throw new IllegalArgumentException("El DNI ya está registrado");
            }
        }
        listaPersonas.add(new Persona(nombre, apellido, edad, barrio, dni, ocupacion));
        cantidadReactivos--;
    }

    public HashMap<Integer, RegistroTemperatura> testear() {
        HashMap<Integer, RegistroTemperatura> tablaTemperaturas = new HashMap<Integer,RegistroTemperatura >();

        Random random = new Random();
        for (Persona persona : listaPersonas) {

            RegistroTemperatura registro = new RegistroTemperatura(persona.getDni(), persona.getTemperatura());
            tablaTemperaturas.put(persona.getNumeroKit(), registro);


        if ( persona.getTemperatura()> 38) {
            casosSospechosos.add(new CasoSospechoso(persona.getNumeroKit(), persona.getTemperatura(), persona.getBarrio()));
        }
    }
        return tablaTemperaturas;
    }

        public void aislar() throws TemperaturaAltaException {
            for (Persona persona : listaPersonas) {
                if (persona.getTemperatura() >= 38.0) {
                    throw new TemperaturaAltaException(persona.getNumeroKit(), persona.getBarrio());
                }
            }
        }

    private boolean esCasoSospechoso(int numeroKit) {
        for (CasoSospechoso caso : casosSospechosos) {
            if (caso.getNumeroKit() == numeroKit) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Persona> obtenerPersonasSinCasosSospechosos() {
        ArrayList<Persona> personasSinCasosSospechosos = new ArrayList<>();
        for (Persona persona : listaPersonas) {
            if (!esCasoSospechoso(persona.getNumeroKit())) {
                personasSinCasosSospechosos.add(persona);
            }
        }
        return personasSinCasosSospechosos;
    }

    public ArrayList<CasoSospechoso> obtenerCasosSospechosos() {

        return casosSospechosos;
    }

}



