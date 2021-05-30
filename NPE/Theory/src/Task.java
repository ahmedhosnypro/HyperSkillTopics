// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    String str1;
    String str2 = "123";

    if (str2.equals(str1 = "123")) {
      str2 = null;
    }

    str1 = str2;
    str2 = str1;

    System.out.println(str2);
  }
}
