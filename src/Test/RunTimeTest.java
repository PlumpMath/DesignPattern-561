package Test;

import java.io.IOException;

public class RunTimeTest {
    public static void main(String agrs[]) throws IOException {
        Runtime.getRuntime().exec("notepad.exe");
    }
}
