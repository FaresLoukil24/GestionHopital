import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin, List<Patient>> medecinPatients;

    public Hopital() {
        medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ArrayList<>());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).add(p);
        } else {

            System.out.println("Medecin not found in the hospital.");
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) ->
                System.out.println("Medecin: " + medecin + ", Patients: " + patients));
    }

    public void afficherMedecinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            List<Patient> patients = medecinPatients.get(m);
            patients.stream()
                    .filter(patient -> "mohamed".equals(patient.getNom()))
                    .forEach(System.out::println);
        } else {
            System.out.println("Medecin not found in the hospital.");
        }
    }
}
