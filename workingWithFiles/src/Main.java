import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFileInfo();
        readFile();
        fileWriter();
        readFile();



    }




    public static void createFile()
    {
        File file = new File("C:\\Users\\ömer\\IdeaProjects\\student.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("dosya oluşturuldu");
            } else {
                System.out.println("dosya zaten mevcuz ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file =new File("C:\\Users\\ömer\\IdeaProjects\\student.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+ file.getName());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilirmi  : "+file.canWrite());
            System.out.println("Dosya okunabilirmi : "+file.canRead());
            System.out.println("Dosya boyutu (byte): "+file.length());
        }
    }
    public static void readFile(){
        File file =new File("C:\\Users\\ömer\\IdeaProjects\\student.txt");
        try {
            Scanner reader =new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileWriter(){
        try {
            BufferedWriter bufferedWrite =new BufferedWriter(new FileWriter("C:\\Users\\ömer\\IdeaProjects\\student.txt" ,true) );
            bufferedWrite.newLine();
            bufferedWrite.write("AHMET");
            System.out.println("Dosya yazıldı");
            bufferedWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}