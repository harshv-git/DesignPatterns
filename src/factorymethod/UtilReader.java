package factorymethod;

import java.util.Scanner;

public class UtilReader implements InputReader {
    Scanner scanner = new Scanner(System.in);

    public UtilReader() {
        System.out.println("Instantiating UtilReader");
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }
}
