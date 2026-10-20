public class Katt {
    private final String namn;
    private final String chipnummer;
    private final String ras;
 public Katt(String namn, String chipnummer, String ras) {
     this.namn = namn;
     this.chipnummer = chipnummer;
     this.ras = ras;
 }
    public String getNamn() {
     return namn;
 }
 public String getChipnummer() {
     return chipnummer;
 }
 public String getRas() {
     return ras;
 }
}