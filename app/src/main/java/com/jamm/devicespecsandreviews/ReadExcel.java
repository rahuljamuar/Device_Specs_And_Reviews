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

    ArrayList<String> listReviews = new ArrayList<String>();
    ArrayList<String> listModels = new ArrayList<String>();
    ArrayList<String> imageLinkList = new ArrayList<String>();
    ArrayList<String> listTechnology = new ArrayList<String>();

    ArrayList<String> listLaunchDate = new ArrayList<String>();

    ArrayList<String> list2GBand = new ArrayList<String>();
    ArrayList<String> list3GBand = new ArrayList<String>();
    ArrayList<String> list4GBand = new ArrayList<String>();

    ArrayList<String> listDimensions = new ArrayList<String>();
    ArrayList<String> listWeight = new ArrayList<String>();
    ArrayList<String> listSim = new ArrayList<String>();

    ArrayList<String> listDisplayType = new ArrayList<String>();
    ArrayList<String> listDisplaySize = new ArrayList<String>();
    ArrayList<String> listResolution = new ArrayList<String>();
    ArrayList<String> listProtection = new ArrayList<String>();

    ArrayList<String> listOS = new ArrayList<String>();
    ArrayList<String> listChipset = new ArrayList<String>();
    ArrayList<String> listCPU = new ArrayList<String>();
    ArrayList<String> listGPU = new ArrayList<String>();

    ArrayList<String> listCardSlot = new ArrayList<String>();
    ArrayList<String> listInternal = new ArrayList<String>();
    ArrayList<String> listRAM = new ArrayList<String>();

    ArrayList<String> listPrimary = new ArrayList<String>();
    ArrayList<String> listPrimaryFeatures = new ArrayList<String>();
    ArrayList<String> listSecondary = new ArrayList<String>();
    ArrayList<String> listSecondaryFeatures = new ArrayList<String>();
    ArrayList<String> listVideo = new ArrayList<String>();
    ArrayList<String> listFlash = new ArrayList<String>();

    ArrayList<String> listSensors = new ArrayList<String>();
    ArrayList<String> listJava = new ArrayList<String>();
    ArrayList<String> listMiscFeatures = new ArrayList<String>();

    ArrayList<String> listBatteryType = new ArrayList<String>();
    ArrayList<String> listCapacity = new ArrayList<String>();

    ArrayList<String> listLoudspeaker = new ArrayList<String>();
    ArrayList<String> listJack = new ArrayList<String>();

    ArrayList<String> listWlan = new ArrayList<String>();
    ArrayList<String> listBluetooth = new ArrayList<String>();
    ArrayList<String> listGPS = new ArrayList<String>();
    ArrayList<String> listNFC = new ArrayList<String>();
    ArrayList<String> listRadio = new ArrayList<String>();
    ArrayList<String> listUSB = new ArrayList<String>();

    ArrayList<String> listColors = new ArrayList<String>();
    ArrayList<String> listSAR = new ArrayList<String>();
    ArrayList<String> listInTheBox = new ArrayList<String>();
    ArrayList<String> listVariant = new ArrayList<String>();
    ArrayList<String> listModelID = new ArrayList<String>();


    int modelCount;

    public ArrayList<String> getListReviews() {
        return listReviews;
    }

    public int getModelCount() {
        return modelCount;
    }

    public ArrayList<String> getListModels() {
        return listModels;
    }

    public ArrayList<String> getListTechnology() {
        return listTechnology;
    }

    public ArrayList<String> getImageLinkList() {
        return imageLinkList;
    }

    public ArrayList<String> getListLaunchDate() {
        return listLaunchDate;
    }

    public ArrayList<String> getList2GBand() {
        return list2GBand;
    }

    public ArrayList<String> getList3GBand() {
        return list3GBand;
    }

    public ArrayList<String> getList4GBand() {
        return list4GBand;
    }

    public ArrayList<String> getListDimensions() {
        return listDimensions;
    }

    public ArrayList<String> getListWeight() {
        return listWeight;
    }

    public ArrayList<String> getListSim() {
        return listSim;
    }

    public ArrayList<String> getListDisplayType() {
        return listDisplayType;
    }

    public ArrayList<String> getListDisplaySize() {
        return listDisplaySize;
    }

    public ArrayList<String> getListResolution() {
        return listResolution;
    }

    public ArrayList<String> getListProtection() {
        return listProtection;
    }

    public ArrayList<String> getListOS() {
        return listOS;
    }

    public ArrayList<String> getListChipset() {
        return listChipset;
    }

    public ArrayList<String> getListCPU() {
        return listCPU;
    }

    public ArrayList<String> getListGPU() {
        return listGPU;
    }

    public ArrayList<String> getListCardSlot() {
        return listCardSlot;
    }

    public ArrayList<String> getListInternal() {
        return listInternal;
    }

    public ArrayList<String> getListRAM() {
        return listRAM;
    }

    public ArrayList<String> getListPrimary() {
        return listPrimary;
    }

    public ArrayList<String> getListPrimaryFeatures() {
        return listPrimaryFeatures;
    }

    public ArrayList<String> getListSecondary() {
        return listSecondary;
    }

    public ArrayList<String> getListSecondaryFeatures() {
        return listSecondaryFeatures;
    }

    public ArrayList<String> getListVideo() {
        return listVideo;
    }

    public ArrayList<String> getListFlash() {
        return listFlash;
    }

    public ArrayList<String> getListSensors() {
        return listSensors;
    }

    public ArrayList<String> getListJava() {
        return listJava;
    }

    public ArrayList<String> getListMiscFeatures() {
        return listMiscFeatures;
    }

    public ArrayList<String> getListBatteryType() {
        return listBatteryType;
    }

    public ArrayList<String> getListCapacity() {
        return listCapacity;
    }

    public ArrayList<String> getListLoudspeaker() {
        return listLoudspeaker;
    }

    public ArrayList<String> getListJack() {
        return listJack;
    }

    public ArrayList<String> getListWlan() {
        return listWlan;
    }

    public ArrayList<String> getListBluetooth() {
        return listBluetooth;
    }

    public ArrayList<String> getListGPS() {
        return listGPS;
    }

    public ArrayList<String> getListNFC() {
        return listNFC;
    }

    public ArrayList<String> getListRadio() {
        return listRadio;
    }

    public ArrayList<String> getListUSB() {
        return listUSB;
    }

    public ArrayList<String> getListColors() {
        return listColors;
    }

    public ArrayList<String> getListSAR() {
        return listSAR;
    }

    public ArrayList<String> getListInTheBox() {
        return listInTheBox;
    }

    public ArrayList<String> getListVariant() {
        return listVariant;
    }

    public ArrayList<String> getListModelID() {
        return listModelID;
    }

    public void readModels(String smartPhoneBrand) {
        modelCount = 0;

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
                modelCount++;
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
                    listLaunchDate.add(cellVal);
                } else {
                    cellVal = "";
                    listLaunchDate.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(3);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listTechnology.add(cellVal);
                } else {
                    cellVal = "";
                    listTechnology.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(4);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    list2GBand.add(cellVal);
                } else {
                    cellVal = "";
                    list2GBand.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(5);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    list3GBand.add(cellVal);
                } else {
                    cellVal = "";
                    list3GBand.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(6);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    list4GBand.add(cellVal);
                } else {
                    cellVal = "";
                    list4GBand.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(7);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listDimensions.add(cellVal);
                } else {
                    cellVal = "";
                    listDimensions.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(8);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listWeight.add(cellVal);
                } else {
                    cellVal = "";
                    listWeight.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(9);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listSim.add(cellVal);
                } else {
                    cellVal = "";
                    listSim.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(10);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listDisplayType.add(cellVal);
                } else {
                    cellVal = "";
                    listDisplayType.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(11);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listDisplaySize.add(cellVal);
                } else {
                    cellVal = "";
                    listDisplaySize.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(12);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listResolution.add(cellVal);
                } else {
                    cellVal = "";
                    listResolution.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(13);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listProtection.add(cellVal);
                } else {
                    cellVal = "";
                    listProtection.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(14);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listOS.add(cellVal);
                } else {
                    cellVal = "";
                    listOS.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(15);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listChipset.add(cellVal);
                } else {
                    cellVal = "";
                    listChipset.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(16);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listCPU.add(cellVal);
                } else {
                    cellVal = "";
                    listCPU.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(17);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listGPU.add(cellVal);
                } else {
                    cellVal = "";
                    listGPU.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(18);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listCardSlot.add(cellVal);
                } else {
                    cellVal = "";
                    listCardSlot.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(19);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listInternal.add(cellVal);
                } else {
                    cellVal = "";
                    listInternal.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(20);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listRAM.add(cellVal);
                } else {
                    cellVal = "";
                    listRAM.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(21);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listPrimary.add(cellVal);
                } else {
                    cellVal = "";
                    listPrimary.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(22);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listPrimaryFeatures.add(cellVal);
                } else {
                    cellVal = "";
                    listPrimaryFeatures.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(23);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listSecondary.add(cellVal);
                } else {
                    cellVal = "";
                    listSecondary.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(24);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listSecondaryFeatures.add(cellVal);
                } else {
                    cellVal = "";
                    listSecondaryFeatures.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(25);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listVideo.add(cellVal);
                } else {
                    cellVal = "";
                    listVideo.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(26);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listFlash.add(cellVal);
                } else {
                    cellVal = "";
                    listFlash.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(27);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listSensors.add(cellVal);
                } else {
                    cellVal = "";
                    listSensors.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(28);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listJava.add(cellVal);
                } else {
                    cellVal = "";
                    listJava.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(29);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listMiscFeatures.add(cellVal);
                } else {
                    cellVal = "";
                    listMiscFeatures.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(30);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listBatteryType.add(cellVal);
                } else {
                    cellVal = "";
                    listBatteryType.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(31);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listCapacity.add(cellVal);
                } else {
                    cellVal = "";
                    listCapacity.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(32);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listLoudspeaker.add(cellVal);
                } else {
                    cellVal = "";
                    listLoudspeaker.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(33);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listJack.add(cellVal);
                } else {
                    cellVal = "";
                    listJack.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(34);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listWlan.add(cellVal);
                } else {
                    cellVal = "";
                    listWlan.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(35);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listBluetooth.add(cellVal);
                } else {
                    cellVal = "";
                    listBluetooth.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(36);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listGPS.add(cellVal);
                } else {
                    cellVal = "";
                    listGPS.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(37);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listNFC.add(cellVal);
                } else {
                    cellVal = "";
                    listNFC.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(38);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listRadio.add(cellVal);
                } else {
                    cellVal = "";
                    listRadio.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(39);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listUSB.add(cellVal);
                } else {
                    cellVal = "";
                    listUSB.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(40);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listColors.add(cellVal);
                } else {
                    cellVal = "";
                    listColors.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(41);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listSAR.add(cellVal);

                } else {
                    cellVal = "";
                    listSAR.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(42);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listInTheBox.add(cellVal);
                } else {
                    cellVal = "";
                    listInTheBox.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(43);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listVariant.add(cellVal);
                } else {
                    cellVal = "";
                    listVariant.add(cellVal);
                }
            }

            for (int k = 0; k < rowCount; k++) {
                Row row = mySheet.getRow(k);
                Cell cell = null;
                cell = row.getCell(44);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cellVal = cell.toString();
                    listModelID.add(cellVal);
                } else {
                    cellVal = "";
                    listModelID.add(cellVal);
                }
            }








        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
