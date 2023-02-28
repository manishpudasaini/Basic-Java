package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ApplicationRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Data/NewYear.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();
        System.out.println("Tota l number of row in the file :: "+rowNum);

        int columnNUm = sheet.getRow(0).getLastCellNum();
        System.out.println("Total number of cell in one row :: "+columnNUm);

        //using for loop

//        for(int r=0;r<rowNum;r++){
//            XSSFRow row = sheet.getRow(r);
//            for(int c=0;c<columnNUm;c++){
//                XSSFCell cell = row.getCell(c);
////                System.out.print(cell.getCellType());
////                System.out.print(" | ");
//                switch(cell.getCellType()){
//                    case STRING:
//                        System.out.print(cell.getStringCellValue());
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        break;
//                    default:
//                        System.out.print("Default");
//                        break;
//                }
//                System.out.print(" | ");
//            }
//            System.out.println();
//        }

        //using Iterator provided by Library

        Iterator rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()){
            XSSFRow row = (XSSFRow) rowIterator.next();
            Iterator cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                XSSFCell cell = (XSSFCell) cellIterator.next();
                switch(cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        break;
                    case FORMULA:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    default:
                        System.out.print("Default");
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
