package com.learn.assignment1;

import java.io.FilenameFilter;
import java.util.List;
import java.util.Scanner;

public class FileSearchApplication {

    public static void main(String[] args) {

        System.out.println("-- Welcome to File Search --");

        int choice = 1;
        Scanner scanner = new Scanner(System.in);
        FileNameSearchFilter filenameFilter = new FileNameSearchFilter();
        FilePath filePath = new AbsoluteFilePath(filenameFilter);

        do {
            System.out.println("Please Enter Path");
            String path = scanner.nextLine();
            System.out.println("Please Enter pattern");
            String pattern = scanner.nextLine();
            filenameFilter.setPattern(pattern);
            try {
                List<String> paths = filePath.getAllFilePaths(path, pattern);
                paths.forEach(System.out::println);
            } catch (Exception ex) {
                System.out.println("Exception :" + ex.getMessage());
                continue;
            }
            System.out.println("Please Enter 0 to Exit");
            choice = Integer.valueOf(scanner.nextLine());
        } while (choice > 0);
    }
}
