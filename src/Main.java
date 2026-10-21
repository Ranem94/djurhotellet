
public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        //Testa tomt hotell (Etapp 5)
        hotell.upprop();

        Katt k1 = new Katt("Missan", "12345", "Ragdoll");
        Katt k2 = new Katt("Morris", "67890", "Bondkatt");
        Katt k3 = new Katt("Missan Kopia", "12345", "Perser");

        hotell.checkaIn(k1);
        hotell.checkaIn(k2);
        hotell.checkaIn(k3); // nekas

        System.out.println("\n--- Test hittaNamn ---");
        Katt hittad = hotell.hittaNamn("maja");
        if (hittad != null) {
            System.out.println("Hittad: " + hittad.getNamn() + " " + hittad.getRas());
        } else {
            System.out.println("Katten hittades inte");
        }
        Katt ejHittad = hotell.hittaNamn("Bosse");
        if (ejHittad == null) {
            System.out.println("Bosse finns inte - returnerar null som väntat");
        }

        hotell.upprop();
        System.out.println("Antal:" + hotell.getAntalKatter());
    }
}
