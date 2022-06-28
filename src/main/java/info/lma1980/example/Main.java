package info.lma1980.example;

import org.jline.terminal.*;
import org.jline.utils.Log;
import org.jline.utils.WriterOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            TerminalBuilder b = TerminalBuilder.builder();
            Terminal t = b.dumb(true).streams(System.in, System.out).build();
            t.writer().println("HelloWorld!");
            t.writer().flush();
            Log.info("HelloWorld!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.err.println(ioe);
        }
    }
}