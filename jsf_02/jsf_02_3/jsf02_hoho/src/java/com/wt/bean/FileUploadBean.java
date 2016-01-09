package com.wt.bean;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

public class FileUploadBean {
    
    public FileUploadBean() {
    }
    
    private Part file;

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
    public void upload(){
        if(file != null){
            try {
                //用文件读取的方式模拟上传/保存操作
                Scanner scanner = new Scanner(file.getInputStream());
                while (scanner.hasNext()) {                    
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileUploadBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
