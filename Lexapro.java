import java.nio.file.Files;
import java.nio.file.Path;

public class Lexapro {
    public static void main(String [] args) {
        System.out.println("---Mooon Stats---");
        System.out.println("...");

        for(int i = 1; i <= 5; i++) {
            String tempRaw = Files.readString(Path.of("sys/class/thermal/thermal_zone0/temp")).trim();

            double tempCelsius = Double.parseDouble(tempRaw) / 1000.0;
            System.out.println("Check # " + i);
            System.out.println("Aktuelle Temperatur: " + tempCelsius);

            Thread.sleep(1500);
        }
        System.out.println("Messung schließt sich...");
    }
}
