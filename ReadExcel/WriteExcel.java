package ReadExcel;

import org.apache.poi.ss.formula.Formula;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Invoice");

        Object[][] dataArr = {
                {"SN","ItemCode","ItemName","Qty","UnitPrice","TotalPrice"},
                {1,"phn-100","Iphone 14",2,120000,"D2*E2"},
                {2,"lpt-200","Dell",1,140000,"D3*E3"},
                {3,"phn-200","Mi",4,10000,"D4*E4"},
                {4,"lpt-100","HP",10,1200000,"D5*E5"},
        };

        int rowNUm = dataArr.length;
        int colNUm = dataArr[0].length;
//        System.out.println("Number of row :: "+rowNUm);
//        System.out.println("Number of column :: "+colNUm);

        XSSFRow row=null;
        for(int r=0;r<rowNUm;r++){
             row = sheet.createRow(r);
            for(int c=0;c<colNUm;c++){
                XSSFCell cell = row.createCell(c);
                Object value = dataArr[r][c];
                if(c==colNUm-1 && r != 0){
//                    cell.setCellFormula("D"+(r+1)+"*"+"E"+(r+1));
                    cell.setCellFormula((String) value);
                    break;
                }

                if(value instanceof String){
                    cell.setCellValue((String) value);
                }
                if(value instanceof Integer){
                    cell.setCellValue((Integer)value);
                }

            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream("Data\\Invoice.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
