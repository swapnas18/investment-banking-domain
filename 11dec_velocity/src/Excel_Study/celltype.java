package Excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class celltype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
	 Sheet studentresult = WorkbookFactory.create(MyFile).getSheet("Studentsresult");

	int totalrownum = studentresult.getLastRowNum(); 
	
	for(int i=0;i<=totalrownum;i++){

		int cellnumber=(studentresult.getRow(i).getLastCellNum()-1);
		
		for(int j=0;j<=cellnumber;j++) {
			
		System.out.print(studentresult.getRow(i).getCell(j)+"-->");
		}System.out.println();
			
		}
	}
	}
	
	











//if(name.equals(studentresult.getRow(i).getCell(j).getCellType())) {
//System.out.print(studentresult.getRow(i).getCell(j)+"-->");
//}
////else if(rollno.equals(studentresult.getRow(i).getCell(j).getCellType())) {
//System.out.print(studentresult.getRow(i).getCell(j)+"-->");
//}
//else if (mark.equals(studentresult.getRow(i).getCell(j).getCellType())) {
//System.out.print(studentresult.getRow(i).getCell(j)+"-->");
//}

//CellType  rollno= studentresult.getRow(1).getCell(1).getCellType();
//CellType mark = studentresult.getRow(2).getCell(2).getCellType();
//CellType grade = studentresult.getRow(2).getCell(3).getCellType();
//CellType status = studentresult.getRow(2).getCell(4).getCellType();
//CellType result = studentresult.getRow(2).getCell(5).getCellType();
//System.out.println("name type-->"+name);
//System.out.println("rollno type-->" +rollno);
//System.out.println("mark type-->"+mark);
//System.out.println("grade type-->"+grade);
//System.out.println("status type-->"+status);
//System.out.println("result type-->"+result);
