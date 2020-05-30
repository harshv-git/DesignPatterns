package factorymethod;

public class InputReaderFactory {
    public static InputReader getReader(String type){
        if(type == null) {
            return new UtilReader();
        }
        switch (type){
            case "buffer" :
                return new IOReader();
            default :
                return new UtilReader();
        }
    }
}
