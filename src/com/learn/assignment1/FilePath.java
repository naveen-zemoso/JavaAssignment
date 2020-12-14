package com.learn.assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public interface FilePath {

    String getPath(File file);
    List<String> getAllFilePaths(String path);
    List<String> getAllFilePaths(String path, String pattern);

}
