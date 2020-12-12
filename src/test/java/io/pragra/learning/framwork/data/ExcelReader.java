package io.pragra.learning.framwork.data;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {
    public static void main(String[] args) throws IOException, InvalidFormatException {

      //  List<String> list = Files.readAllLines(Paths.get("C:\\Users\\Sarit\\Desktop", "QATeamMemberNames.xlsx"));
      //  list.forEach(System.out::println);
        Path path = Paths.get("C:\\Users\\Sarit\\Desktop", "QATeamMemberNames.xlsx");
        Workbook workbook;
        workbook = new XSSFWorkbook(path.toFile());
        Sheet sheet1 = workbook.getSheet("Names");
        Iterator<Row> rowIterator = sheet1.rowIterator();

        while (rowIterator.hasNext()) {
            Row rows = rowIterator.next();
            Iterator<Cell> cellIterator = rows.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cells = cellIterator.next();
                if (cells.getCellType() == CellType.STRING) {
                    System.out.println(cells.getStringCellValue());
                }
                if (cells.getCellType() == CellType.NUMERIC) {
                    System.out.println(cells.getNumericCellValue());
                }
            }
        }
    }
}


