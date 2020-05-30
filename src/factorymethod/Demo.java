package factorymethod;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        String[] types = {"scanner", "buffer", ""};
        for(String type : types){
            InputReader reader = InputReaderFactory.getReader(type);
            System.out.println("Enter a line :");
            String line = "";
            try {
                line = reader.readLine();
            } catch (IOException e) {
                line = "Some error occurred";
            }
            System.out.println("Output :");
            System.out.println(line);
        }
    }
}
