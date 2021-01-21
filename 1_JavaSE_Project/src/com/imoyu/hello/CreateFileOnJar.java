package com.imoyu.hello;

import java.io.File;
import java.io.IOException;

public class CreateFileOnJar {

    public static void main(String[] args) throws IOException {

        File file = new File("123.txt");
        System.out.println(file.getAbsolutePath());
        file.createNewFile();
    }

}
