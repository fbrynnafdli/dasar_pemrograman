import java.util.Scanner;

public class latihanifelse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tanaman: ");
        String tanaman = input.nextLine();
        System.out.print("cuaca: ");
        String cuaca = input.nextLine();
        
        String hasilPenyiraman = "";


        switch (tanaman) {
            case "padi":
                switch (cuaca) {
                    case "cerah":
                        hasilPenyiraman = "siram air 12 liter";
                        break;
                    case "mendung":
                        hasilPenyiraman = "siram secukupnya";
                        break;
                    case "hujan":
                        hasilPenyiraman = "tidak usah siram";
                        break;
                    default:
                        System.out.println("Cuaca tidak valid.");
                        return;
                }
                break;
            
            case "jagung":
                switch (cuaca) {
                    case "cerah":
                        hasilPenyiraman = "siram air 7 liter";
                        break;
                    case "mendung":
                        hasilPenyiraman = "siram secukupnya";
                        break;
                    case "hujan":
                        hasilPenyiraman = "tidak usah siram";
                        break;
                    default:
                        System.out.println("Cuaca tidak valid.");
                        return;
                }
                break;
            
            case "kedelai":
                switch (cuaca) {
                    case "cerah":
                        hasilPenyiraman = "siram air 12 liter";
                        break;
                    case "mendung":
                        hasilPenyiraman = "siram secukupnya";
                        break;
                    case "hujan":
                        hasilPenyiraman = "tidak usah siram";
                        break;
                    default:
                        System.out.println("Cuaca tidak valid.");
                        return;
                }
                break;
            
            default:
                System.out.println("Tanaman tidak valid.");
                return;
        }

        System.out.println("Tanaman " + tanaman + " " + cuaca + " " + hasilPenyiraman + ".");

    }
}