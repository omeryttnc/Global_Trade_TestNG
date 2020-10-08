package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {

    XSSFWorkbook wb ;
    XSSFSheet sheet;

    public ExcelRead(String path) {
        try {
            File excelFile = new File(path);
            FileInputStream fis = new FileInputStream(excelFile);
            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getString (int sheetNumber, int row, int column){
        sheet =wb.getSheetAt(sheetNumber);

        return sheet.getRow(row).getCell(column).getStringCellValue();
    }


}
