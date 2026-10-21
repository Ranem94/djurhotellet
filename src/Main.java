import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();
        int val = 0;

        while (val != 4) {
            System.out.print("\n1. Checka in katt\n2. Lista alla incheckade\n3. Sök katt på namn\n4. Avsli" +
                    "uta");

            System.out.print("Välj: ");
            val = scanner.nextInt();
            scanner.nextInt();

            if (val == 1) {
                System.out.print("Namn: ");
                String namn = scanner.nextLine();
                System.out.print("Ras: ");
                String ras = scanner.nextLine();
                System.out.print("Chipnummer: ");
                String chip = scanner.nextLine();
                Katt katt = new Katt(namn, ras, chip);
                hotell.checkaIn(katt);

            } else if (val == 2) {
                hotell.upprop();

            } else if (val == 3) {
                System.out.print("Sök namn: ");
                String sokNamn = scanner.nextLine();
                Katt hittad = hotell.hittaNamn(sokNamn);

                if (hittad != null) {
                    System.out.print("Hittad: " + hittad.getNamn() + " Ras: " + hittad.getRas() + " Chip: " + hittad.getChipnummer());
                } else {
                    System.out.print("Katten hittades inte");
                }
            }
        }
        System.out.print("Programmet avslutas.");
        scanner.close();
    }
}