import java.io.*;

class Data implements Serializable {
    String text;
    Data(String text) { this.text = text; }
}

public class Experiment4 {
    public static void main(String[] args) throws Exception {
        try ( // Write to file
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello MCA Students!");
        }

        String line;
        try ( // Read from file
                BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            line = reader.readLine();
        }

        try ( // Serialization
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            out.writeObject(new Data(line));
        }

        Data d;
        try ( // Deserialization
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"))) {
            d = (Data) in.readObject();
        }
        System.out.println("Deserialized Data: " + d.text);
    }
}