package com.goit.javaonline3.files;

import java.util.List;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Folder {
    private List<GeneralFile> GeneralFile;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.goit.javaonline3.files.GeneralFile> getGeneralFile() {
        return GeneralFile;
    }

    public void setGeneralFile(List<com.goit.javaonline3.files.GeneralFile> generalFile) {
        GeneralFile = generalFile;
    }
}