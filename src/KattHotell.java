import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean finnsChip(String chipnummer) {
        for (Katt k : katter) {
            if (k.getChipnummer().equals(chipnummer)) {
                return false;
            }
        }
        return false;
    }

    public boolean checkaIn(Katt katt) {
        if (finnsChip(katt.getChipnummer())) {
            System.out.println("VARNING: Chipnummer " + katt.getChipnummer() + " finns redan! Incheckning nekad.");
            return false;
        }
        katter.add(katt);
        return true;
    }

    public int getAntalKatter() {
        return katter.size();
    }

    public void upprop() {
        if (katter.isEmpty()) {
            System.out.println("Hotellet är tomt - inga katter incheckad.");
            return;
        }
        System.out.println("--- Upprop av katter ---");
        for (Katt k : katter) {
            System.out.println(k.getNamn() + " Ras:" + k.getRas() + " Chip" + k.getChipnummer());
        }
    }
}

