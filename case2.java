import java.io.IOException;

public class case2 {
    public void insert() throws IOException {
        // The Read.bat Location should be Changed According to Your Current File
        // Location
        String path = "cmd /c start C:\\Users\\user\\Desktop\\Southern\\Case2Insert.bat";
        Runtime rn = Runtime.getRuntime();
        Process pr = rn.exec(path);
    }
}
