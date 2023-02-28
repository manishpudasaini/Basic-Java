package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;

public class WriteExcelUsingArrayList {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Countries");
        ArrayList countries = new ArrayList<>();
        countries.add(new Object[]{"SN","CountryId","CountryName","NationalAnimal","Value"});
        countries.add(new Object[]{1,"Np-01","Nepal","Cow",1200000});
        countries.add(new Object[]{2,"Pkt-200","Pakistan","Dog",140000});
        countries.add(new Object[]{4,"Ind-300","India","Tiger",1200000});
        countries.add(new Object[]{3,"Chi-600","China","Cat",10000});

        for(Object name:countries){
            System.out.println(name);
        }
    }
}
