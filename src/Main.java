// Att-göra-lista för djurhotellet (KattHotell):
// [ ] 1. Skapa klassen Katt med namn, chipnummer, ras - privat, med getters
// [ ] 2. Skapa klassen KattHotell som äger en privat lista av katter//
// [ ] 3. Lägg till metod för att checka in katt + dubblettspärr på chipnummer
// [ ] 4. Provocera minneshashen Katt@hexkod och förstå varför den kommer//
// [ ] 5. Laga utskriften med getters + hantera tomt hotell
// [ ] 6. Skriv README.md
public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        //Testa tomt hotell (Etapp 5)
        hotell.upprop();

        Katt k1 = new Katt("Missan" , "12345" , "Ragdoll");
        Katt k2 = new Katt("Morris" , "67890" , "Bondkatt");
        Katt k3 = new Katt("Missan Kopia" , "12345" , "Perser");

        hotell.checkaIn(k1);
        hotell.checkaIn(k2);
        hotell.checkaIn(k3); // nekas

        hotell.upprop();
        System.out.println("Antal:" + hotell.getAntalKatter());


    }
}