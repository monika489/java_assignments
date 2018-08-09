package Javaassignment1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FileSearchInDirectory {
    /**
     * prints the absolute path of all matching files
     * @param regex regular expression for matching
     */
    private static void printFilePath(String regex) {

        String folderPath = System.getProperty("user.home");
        File folder = new File(folderPath);
        final Pattern p = Pattern.compile(regex);
        File[] listOfFiles = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return p.matcher(f.getName()).matches();
            }
        });
        if (folder.isDirectory()) {
            if (listOfFiles.length < 1) {
                System.out.println("There is no File inside Folder");
            }
            else {
                System.out.println("List of Files & Folder");
                for (File file : listOfFiles) {
                    if(!file.isDirectory()) {
                        try {
                            System.out.println("Absolute Path= " + file.getAbsolutePath().toString());
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        else {
            System.out .println("There is no Folder @ given path :" + folderPath);
        }
    }
    public static void main(String[] args) throws IOException {
        String stop;
        do {
            System.out.println("Enter regex:");
            Scanner s1 = new Scanner(System.in);
            String regex = s1.next();
            printFilePath(regex);
            System.out.println("Want to continue press Y/N");
            stop = s1.next();
        } while (stop.toLowerCase().equals("y"));
    }
}