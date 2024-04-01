package Tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public  class ExcelReader
{

    // method reading data from excel file
    public   String[][] getExcelData(String fileName, String sheetName){

        String[][] data = null;
        try
        {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheet(sheetName);
            XSSFRow row = sh.getRow(0);
            int noOfRows = sh.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRows-1][noOfCols];

            for (int i = 1; i < noOfRows; i++)
            {
                 row = sh.getRow(i);
                if (row != null) {
                    for (int j = 0; j < noOfCols; j++)
                    {
                         cell = row.getCell(j);
                        if (cell != null) {
                            if (cell.getCellType() == CellType.STRING) {
                                data[i-1][j] = cell.getStringCellValue();
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                data[i-1][j] = String.valueOf((int) cell.getNumericCellValue());
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("The exception is: " +e.getMessage());
        }
        return data;
    }
}
