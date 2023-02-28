package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelUsingForEach {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("FootballClub");

        Object[][] dataArr = {
                {"SN","ClubId","ClubName","Trophy","Value"},
                {1,"Rm-77","Real Madrid",33,120000},
                {2,"FCb-200","Barcelona",20,140000},
                {3,"Mu-600","Manchester united",14,10000},
                {4,"Mc-300","Manchester city",17,1200000},
        };

        int rowCount = 0;
        for(Object[] inv:dataArr){
            XSSFRow row = sheet.createRow(rowCount++);
            int cellCount = 0;
            for(Object value:inv){
                XSSFCell cell = row.createCell(cellCount++);

                if(value instanceof String){
                    cell.setCellValue((String) value);
                }
                if(value instanceof Integer){
                    cell.setCellValue((Integer)value);
                }
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream("Data\\FootballCLub.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
