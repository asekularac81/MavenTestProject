import java.io.IOException;

import data.ReadFile;
import data.StringUtilsExample;

public class TestClass {

  public static void main (String [] args) throws IOException {
    ReadFile rf = new ReadFile();
    System.out.println(rf.readLine("src/main/resources/file.txt"));


    StringUtilsExample sue = new StringUtilsExample();
    System.out.println(sue.daLiJeStringAlfaNumeric("Ana123456Anas"));
  }
}
