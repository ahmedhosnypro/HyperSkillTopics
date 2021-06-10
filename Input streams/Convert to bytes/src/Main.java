import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] bytes1 = inputStream.readAllBytes();
        for (byte b: bytes1){
            System.out.print(b);
        }
    }
}