package flappyBird;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadFile {
    public int Highscore; 
    public ReadFile() {}

    public void writeFile(int Highscore) {
        try (FileWriter writer = new FileWriter("Highscore.txt")) { // no append flag = overwrite
            writer.write(Integer.toString(Highscore));
        } catch (IOException e) {
            e.printStackTrace();
        }
  }

 
    public void readFile() { 
        try (BufferedReader reader = new BufferedReader(new FileReader("Highscore.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                this.Highscore = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

