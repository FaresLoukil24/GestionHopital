import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;


    public ListPatients(List<Patient> listP) {
        this.listP = listP;
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP.sort((p1, p2) -> p1.getNom().compareToIgnoreCase(p2.getNom()));
    }

    public void patientSansRedondance() {
        List<Patient> distinctPatients = listP.stream().distinct().collect(Collectors.toList());
        distinctPatients.forEach(System.out::println);
    }
}
