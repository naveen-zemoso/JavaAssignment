package com.learn.assignment1;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameSearchFilter implements FilenameFilter {

    private String pattern;

    public FileNameSearchFilter() {
    }

    public FileNameSearchFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean accept(File file, String name) {
        return file.isFile() && name.matches(pattern);
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
