package com.chainsys.file;

import java.io.File;

public class DirList {

    public static void main(String[] args) {
        String dirname = "d:/temp";
        File file = new File(dirname);
        String list_of_filenames_in_directory[] = null;
        if(file.isDirectory())
        {
            System.out.println(dirname + "is a Directory");
            list_of_filenames_in_directory = file.list();
            for(int i=0;i<list_of_filenames_in_directory.length;i++)
            {
                File f = new File(dirname + "/" + list_of_filenames_in_directory[i]);
                if(f.isDirectory()) 
                {
                    System.out.println("\t<" + f.getName() + "> is a sub directory");
                }
                else
                {
                    System.out.println("\t" + f.getName() + " is a file");
                }
            }
        }
    }
}