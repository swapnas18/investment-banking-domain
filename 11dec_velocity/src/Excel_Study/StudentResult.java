package Excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class StudentResult {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream MyFile= new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
Sheet studentresult = WorkbookFactory.create(MyFile).getSheet("Sheet3");

		   int totalrow = studentresult.getLastRowNum();
		   int totalcell = (studentresult.getRow(0).getLastCellNum())-1;
		   
		for (int i=0;i<=totalrow;i++) {
			
			for (int j=0;j<=totalcell;j++) {
				
				CellType singlecell = studentresult.getRow(i).getCell(j).getCellType();
				 switch(singlecell) {
				 case STRING:
					 System.out.print(studentresult.getRow(i).getCell(j).getStringCellValue()+"-->");
					 break;
				 case NUMERIC:
					 System.out.print(studentresult.getRow(i).getCell(j).getNumericCellValue()+"-->");
					 break;
				 case BOOLEAN:
					 System.out.print(studentresult.getRow(i).getCell(j).getBooleanCellValue()+"-->");
					 break;
					 
					
				 }
	
			}System.out.println();
			
			
		}
		  
		  
		  
		
		  
		  
		  
	}

}
