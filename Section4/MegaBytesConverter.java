package Section4;

public class MegaBytesConverter {
/**
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
 * The method should not return anything (void) and it needs to calculate the megabytes and 
 * remaining kilobytes from the kilobytes parameter.
 * 
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 * XX represents the original value kiloBytes.
 * YY represents the calculated megabytes.
 * ZZ represents the calculated remaining kilobytes.
 * 
 * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
 * 
 * TIP: 1 MB = 1024 KB
 * 
 * printMegaBytesAndKiloBytes(2500); →  "2500 KB = 2 MB and 452 KB"
 * printMegaBytesAndKiloBytes(-1024); →  "Invalid Value" because parameter is less than 0.
 * printMegaBytesAndKiloBytes(5000); → "5000 KB = 4 MB and 904 KB" 
 * @param kiloBytes gets kiloBytes.
 */
    public static void printMegaBytesAndKiloBytes(final int kiloBytes) {
        int extraBytes = 0;
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int megabytes = kiloBytes / 1024;
            extraBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + extraBytes + " KB");
        }
    }    
}
