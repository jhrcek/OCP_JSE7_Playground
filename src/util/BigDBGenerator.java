package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class BigDBGenerator {

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("/home/jhrcek/Temp/big.txt"))) {
            Random rand = new Random();
            int id = 0;
            String[] names = {"Jane", "Joe", "Carl"};

            writer.println("DROP TABLE IF EXISTS TEST;");
            writer.println("CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255), INT NUMBER);");

            for (int i = 0; i < 100000; i++) {
                writer.printf("INSERT INTO TEST VALUES(%d, '%s', %d);\n",
                        id++,
                        names[rand.nextInt(names.length)],
                        rand.nextInt());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
