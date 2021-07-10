import java.io.IOException;

public class case1 {
    public void read() throws IOException {
        // The Read.bat Location should be Changed According to Your Current File
        // Location
        String path = "cmd /c start C:\\Users\\user\\Desktop\\Southern\\Case1Read.bat";
        Runtime rn = Runtime.getRuntime();
        Process pr = rn.exec(path);
    }
}
