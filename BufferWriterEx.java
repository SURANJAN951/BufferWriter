
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class BufferWriterEx {
    public static void main(String[] args) throws Exception{
        File dir = new File("PwJava");
        File file = new File(dir,"pwsills.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java");
        bw.newLine();
        bw.write(65);
        char ch[]={'p','w','s','j'};
        bw.write(ch);
        bw.flush();
    }
}
