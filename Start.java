import java.io.FileInputStream;
import java.io.IOException;

public class Start {
    public static void main (String[] args ){
    try (
    FileInputStream f1 = new FileInputStream("File1.txt");
    FileInputStream f2 = new FileInputStream("File2.txt")) {
        int i = 0;
        int j = 0;

        while (i != -1 && j != -1) {
            i = f1.read();
            j = f2.read();

            if (i != j)
                break;
            System.out.println(" i = " + (char) i + " j = " + (char) j);

            if (i != j) {
                System.out.println("The files are  different");
            } else {
                System.out.println(" The files are same");
            }
        }
    } catch (
    IOException e) {
        System.out.println(e);
    }
}
}


