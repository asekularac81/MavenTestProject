package data;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadFile {

  public List <String> readLine (String path) throws IOException {

    File file = new File(path);
    List lines = FileUtils.readLines(file, "UTF-8");

    return lines;
  }
}
