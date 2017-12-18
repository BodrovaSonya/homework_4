import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * scan words from file
 */

public class InputFile {
    private FileInputStream fileInputStream;
    private ArrayList<String>arrayList;

    public InputFile(String file) throws FileNotFoundException {
        setFileInputStream(file);

    }

    public void setFileInputStream(String fileName) {
        try {
            this.fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setArrayList(ArrayList<String>words) {
        this.arrayList = words;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
