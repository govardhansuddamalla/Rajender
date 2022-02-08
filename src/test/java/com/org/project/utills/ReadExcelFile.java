package com.org.project.utills;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;


/**
 * Created by rajender.koyyeda on 08-02-2022.
 */
public class ReadExcelFile {



    public static void main(String... strings) throws IOException, BiffException, WriteException {

        File file = new File(System.getProperty("user.dir") + "/src/test/resources/com.org/project/config/Input.xls");
        Workbook workbook = Workbook.getWorkbook(file);
        //Read sheet inside the workbook by its name
        //if we pass 0 it means sheet1
        Sheet sheet = workbook.getSheet(0);

        //Find number of rows in excel file

        int rowCount = sheet.getRows();
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(file, workbook);
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Create a loop over all the rows of excel file to read it

        for (int i = 1; i < rowCount ; i++) {

            String x = sheet.getCell(0, i).getContents();
            String y = sheet.getCell(1, i).getContents();
            String z = x + y;
            Label label= new Label(2, i, z);
            writableSheet.addCell(label);
        }
        writableWorkbook.write();
        writableWorkbook.close();
        workbook.close();

    }



    }

