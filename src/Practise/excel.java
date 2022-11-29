package Practise;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;

public class excel {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\oguzk\\Desktop\\SDET\\Test.xlsx";

        System.out.println(ExcelReader.read("Data/Book2.xlsx"));

//        FileInputStream fileInputStream=new FileInputStream(path);
//        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//        Sheet sheet= (Sheet) xssfWorkbook.getSheet("Sheet1");
//        Row row=sheet.getRow(1);
//        System.out.println(row.getCell(0));
    }
}
