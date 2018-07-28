package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class lib implements iautconstant {
	public static String propertiess(String path){
		String u="";
		Properties ref=new Properties();
		try{
			ref.load(new FileInputStream(path));
			u=ref.getProperty("URL");
		}catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
	return u;
		}     
	public static String getvalue(String validd,int row,int cell){
		String  val="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(excel_path));
			val=wb.getSheet(validd).getRow(row).getCell(cell).toString();
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
		}



}
