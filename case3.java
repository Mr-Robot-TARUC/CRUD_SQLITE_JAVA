import java.io.IOException;

public class case3 {
    public void search() throws IOException {
        // The Read.bat Location should be Changed According to Your Current File
        // Location
        String path = "cmd /c start C:\\Users\\user\\Desktop\\Southern\\Case3Search.bat";
        Runtime rn = Runtime.getRuntime();
        Process pr = rn.exec(path);
    }
}
