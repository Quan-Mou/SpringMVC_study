package com.quan.springmvc.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;

@Controller
@RequestMapping("/file")
public class UploadController {

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("fileName")  MultipartFile fileName) {
        InputStream in = null;
        try {
            in = fileName.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/quanmou/Documents/writeCode/SpringMVC_study" + "/springmvc-006/src/" + fileName.getOriginalFilename());
            while(true) {
                int data = in.read();
                if(data == -1) {
                    System.out.println();
                    break;
                }
//                System.out.print((char) data);
                if(data == 32) {
                    System.out.println();
                }
                fileOutputStream.write(data);
            }

            fileOutputStream.flush();

        } catch(Exception e) {

            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "success";
    }


    @GetMapping("/download")
    public ResponseEntity<byte[]> fileDownload() {
        try {
            File file = new File("/Users/quanmou/Documents/writeCode/SpringMVC_study/springmvc-006/src/权.png");
            System.out.println(file.toPath());
            System.out.println(file.toURI());

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment",file.getName());
            return new ResponseEntity<byte[]>(Files.readAllBytes(file.toPath()),headers,HttpStatus.OK);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
