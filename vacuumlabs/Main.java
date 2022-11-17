package vacuumlabs;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChildSpeak childSpeak = new ChildSpeak();

        List<String> listOriginal = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Milan\\Programiranje\\Java\\vacuumalbs\\test.in", "rw");
            String line;

            while ((line = raf.readLine()) != null) {
                listOriginal.add(line);
                list.add(childSpeak.childSpeakMethod(line));
            }
            String solution = "";
            for (int i = 0; i < list.size(); i++) {
                String x = list.get(i);
                int occurances = Collections.frequency(list, x);
                if (occurances > 0) {
                    occurances = occurances - 1;
                }

                solution += listOriginal.get(i) + " " + occurances + "\n";

            }
            raf.close();

            PrintWriter out;
            out = new PrintWriter("Solution.txt");
            out.println(solution);
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}