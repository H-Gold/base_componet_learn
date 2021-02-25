package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
 
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
/**
 * jxl ֧������
 *    ��֧��.xlsx  �轫.xlsx���Ϊ 2003���.xls�ļ� 
 *    
 *    Cell cell_name = readsheet.getCell(0, i); ��ȡ��һ�е�����  ǰ�����к�������
 * @author ������
 *
 */
public class FileOfExcelIO {
	public static void main(String[] args) {
		try {
			
			//��ȡָ���е�ֵ
			readSpecifyColumns(new File("D:\\ssm\\test\\111.xls"));
			
			//��ȡָ���е�ֵ
			readSpecifyRows(new File("D:\\ssm\\test\\111.xls"));
			
			//��ȡ���е�ֵ
			readRowsAndColums(new File("D:\\ssm\\test\\111.xls"));
			
			//����ȡ����ֵд�뵽TXT����xls��
			copy_excel(new File("D:\\ssm\\test\\111.xls"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     *  	��ȡָ����
     * @param file
     * @throws Exception
     */
	public static void readSpecifyColumns(File file)throws Exception{
		ArrayList<String> columnList = new ArrayList<String>();
		ArrayList<String> valueList = new ArrayList<String>();
		//������
		Workbook readwb = null;
		InputStream io = new FileInputStream(file.getAbsoluteFile());
		readwb = Workbook.getWorkbook(io);
		//������
		Sheet readsheet = readwb.getSheet(0);
		int rsColumns = readsheet.getColumns();  //��ȡ�������
		int rsRows = readsheet.getRows();  //��ȡ�������
		for (int i = 1; i < rsRows; i++) {//����ȡ��һ��
			Cell cell_name = readsheet.getCell(0, i);  //��һ�е�ֵ
			columnList.add(cell_name.getContents());
			Cell cell_value = readsheet.getCell(2, i);  //�����е�ֵ���˴���Ҫ�ֶ����ģ���ȡ��ͬ�е�ֵ
			valueList.add(cell_value.getContents());
		}
		System.out.println(columnList);
		System.out.println(valueList);
		
		String[] name_String = new String[columnList.size()];
		String[] value_String = new String[columnList.size()];
		for (int i = 0; i < columnList.size(); i++) {
			name_String[i] = columnList.get(i);
			value_String[i] = valueList.get(i);
//			System.out.println("<string name=" + "\"" + name_String[i] + "\">" + value_String[i] +  "</string>");
		}		
	}
	
	/**
	 *   	��ȡָ����,������һ��
	 * @param file
	 * @throws Exception
	 */
	public static void readSpecifyRows(File file)throws Exception{
		ArrayList<String> columnList = new ArrayList<String>();
		Workbook readwb = null;
		InputStream io = new FileInputStream(file.getAbsoluteFile());
		readwb = Workbook.getWorkbook(io);
		Sheet readsheet = readwb.getSheet(0);
		int rsColumns = readsheet.getColumns();  //��ȡ�������
		int rsRows = readsheet.getRows();  //��ȡ�������
		for (int i = 1; i < rsColumns; i++) {
			Cell cell_name = readsheet.getCell(i, 1);  //������ָ���У��˴���Ҫ�ֶ����ģ���ȡ��ͬ�е�ֵ
			columnList.add(cell_name.getContents());
		}
		System.out.println(columnList);
	}
	
	
	private static void readRowsAndColums(File file) throws BiffException, IOException {
		//1:����workbook
        //Workbook workbook=Workbook.getWorkbook(new File("D:\\wenan\\111.xls")); 
		Workbook workbook=Workbook.getWorkbook(file); 
        //2:��ȡ��һ��������sheet
        Sheet sheet=workbook.getSheet(0);
        //3:��ȡ����
        System.out.println("�У�"+sheet.getRows());
        System.out.println("�У�"+sheet.getColumns());
        for(int i=0;i<sheet.getRows();i++){
            for(int j=0;j<sheet.getColumns();j++){
                Cell cell=sheet.getCell(j,i);
                System.out.print(cell.getContents()+" ");
            }
            System.out.println();
        }
        
        //���һ�����ر���Դ
        workbook.close();
	}
	
	/**
	 * 	����ȡ����ֵд�뵽TXT����xls��
	 * @param file
	 * @throws Exception
	 */
	public static void copy_excel(File file) throws Exception {
		FileWriter fWriter = null;
		PrintWriter out = null;
		String fliename = file.getName().replace(".xls", "");
		fWriter = new FileWriter(file.getParent()+ "/agetwo.xls");//�����ʽΪ.xls
		//fWriter = new FileWriter(file.getParent() + "/" + fliename + ".txt");//�����ʽΪ.txt
		out = new PrintWriter(fWriter);
		InputStream is = new FileInputStream(file.getAbsoluteFile());
		Workbook wb = null;
		wb = Workbook.getWorkbook(is);
		int sheet_size = wb.getNumberOfSheets();
		Sheet sheet = wb.getSheet(0);
		for (int j = 1; j < sheet.getRows(); j++) {
			String cellinfo = sheet.getCell(0, j).getContents();//��ȡ���ǵڶ������ݣ�û�б��⣬������ʼλ����forѭ���ж���
			out.println(cellinfo);
		}
		out.close();//�ر���
		fWriter.close();
		out.flush();//ˢ�»���
		System.out.println("�����ɣ�");
	}
 
}