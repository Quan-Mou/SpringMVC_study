package com.quan.springmvc.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("/static");
        try {
            File file = resource.getFile();

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

            System.out.println(ResourceUtils.getURL("classpath:static/").getPath());
            System.out.println(System.getProperty("user.dir"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
