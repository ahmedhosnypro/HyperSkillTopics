import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String s = reader.readLine().trim();
        reader.close();
        if (s.isEmpty()){
            System.out.println(0);
        }
        else {
            String[] strings = s.split("\\s+");
            int l = strings.length;
            System.out.println(strings.length);
        }

    }
}