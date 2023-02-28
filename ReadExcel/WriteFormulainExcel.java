package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFormulainExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("AverageNumber");

        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue(10);
        row.createCell(1).setCellValue(14);
        row.createCell(2).setCellValue(16);
        row.createCell(3).setCellFormula("SUM(A1:C1)/3");

        FileOutputStream fos = new FileOutputStream("Data\\Formula.xlsx");
        workbook.write(fos);
        workbook.close();


    }
}
