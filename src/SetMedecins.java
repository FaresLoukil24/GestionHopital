import java.util.Set;
import java.util.TreeSet;

public class SetMedecins {
    private Set<Medecin> etM;

    public SetMedecins() {
        etM = new TreeSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        etM.add(m);
    }

    public boolean rechercherMedecin(int cin) {
        return etM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    public void afficherMedecins() {
        etM.forEach(System.out::println);
    }

    public long nombreMedecins() {
        return etM.size();
    }

    public TreeSet<Medecin> trierMedecins() {
        return new TreeSet<>(etM);
    }
}
