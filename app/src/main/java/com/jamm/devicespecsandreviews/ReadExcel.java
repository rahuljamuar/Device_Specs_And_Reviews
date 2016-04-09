package com.jamm.devicespecsandreviews;

import android.os.Environment;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * Created by Rahul on 08-04-2016.
 */
public class ReadExcel {

    int rowCount;
    String cellVal;

    ArrayList<String> listModels = new ArrayList<String>();
    ArrayList<String> imageLinkList = new ArrayList<String>();
    ArrayList<String> listTechnology = new ArrayList<String>();

    public ArrayList<String> getListModels() {
        return listModels;
    }

    public ArrayList<String> getListTechnology() {
        return listTechnology;
    }

    public ArrayList<String> getImageLinkList() {
        return imageLinkList;
    }

    public void readModels(String smartPhoneBrand) {

        try {
            File SDCardRoot = Environment.getExternalStorageDirectory();
            File file = new File(SDCardRoot, "/Android/data/com.jamm.devicespecs/deviceInfo.xls");
            FileInputStream myInput = new FileInputStream(file);

            POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
            HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
            HSSFSheet mySheet = myWorkBook.getSheet(smartPhoneBrand);

            rowCount = mySheet.getPhysicalNumberOfRows();


            listModels.add("Select Model");
            for (int k = 1; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(0);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listModels.add(cellVal);
                } else {
                    cellVal = "";
                    listModels.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(1);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    imageLinkList.add(cellVal);
                } else {
                    cellVal = "";
                    imageLinkList.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(2);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listTechnology.add(cellVal);
                } else {
                    cellVal = "";
                    listTechnology.add(cellVal);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
