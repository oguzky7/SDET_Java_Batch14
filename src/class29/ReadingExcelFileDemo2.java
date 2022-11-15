package class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {

    public static void main(String[] args) throws IOException {

     var excelData=   ExcelReader.read("/Users/oguzk/IdeaProjects/SDET_Java_Batch14/Data/Test.xlsx");
        System.out.println(excelData);

    }
}
