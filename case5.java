import java.io.IOException;

public class case5 {
    public void update() throws IOException {
        // The Read.bat Location should be Changed According to Your Current File
        // Location
        String path = "cmd /c start C:\\Users\\user\\Desktop\\Southern\\Case5Update.bat";
        Runtime rn = Runtime.getRuntime();
        Process pr = rn.exec(path);
    }
}
