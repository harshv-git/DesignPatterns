package factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOReader implements InputReader {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public IOReader() {
        System.out.println("Instantiating IOReader");
    }

    @Override
    public String readLine() throws IOException {
        return bufferedReader.readLine();
    }
}
