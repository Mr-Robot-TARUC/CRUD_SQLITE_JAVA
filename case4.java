import java.io.IOException;

public class case4 {
    public void delete() throws IOException {
        // The Read.bat Location should be Changed According to Your Current File
        // Location
        String path = "cmd /c start C:\\Users\\user\\Desktop\\Southern\\Case4Search.bat";
        Runtime rn = Runtime.getRuntime();
        Process pr = rn.exec(path);
    }
}
