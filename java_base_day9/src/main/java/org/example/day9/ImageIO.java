package org.example.day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageIO {
    private static final String scrImagePath = "";
    private static final String outImagePath = "";

    public static void main(String[] args){

        File orinalFile = new File(scrImagePath);//指定要读取的图片
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            File result = new File(outImagePath);
            if (result.exists()){
               result.delete();
            }
        }
        if
    }
    //读入图片
}
