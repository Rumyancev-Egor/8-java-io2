package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> res = new ArrayList<>();
        if (rootDir.toFile().isDirectory()){
            for (File item : rootDir.toFile().listFiles()){
                if (item.isDirectory()){
                    res.addAll(listFiles(item.toPath()));
                }else{
                    res.add(item.toPath());
                }
            }
        }
        return res;
    }
}
