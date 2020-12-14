package com.learn.assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class AbsoluteFilePath implements FilePath {

    FilenameFilter filenameFilter;

    public AbsoluteFilePath(FilenameFilter filenameFilter) {
        this.filenameFilter = filenameFilter;
    }

    @Override
    public String getPath(File file) {

        if (file == null )
            throw new RuntimeException("Not valid File");
        return file.getAbsolutePath();
    }

    @Override
    public List<String> getAllFilePaths(String path) {

        return getAllFilePaths(path, "*");
    }

    @Override
    public List<String> getAllFilePaths(String path, String pattern) {

        File directory = new File(path);
        if (!directory.isDirectory()) {
            throw new RuntimeException("not valid directory");
        }
        File[] files = directory.listFiles();
        List<String> allFilePaths = new ArrayList<>(files.length);
        for (File file: files) {
            if (filenameFilter.accept(file, file.getName())) {
                allFilePaths.add(getPath(file));
            }
        }
        return allFilePaths;
    }
}
