package com.road.java.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 5、现在有一份班级JAVA成绩（student_sorce.xlsx）：  ----------55分
 * 1）、设计一个类ExcelUtil，包含readExcel 、writeExcel 和getSumSocre 方法 ； ------5分（少一个方法扣2分）
 * 2）、readExcel 使用poi包 读取文件，读取文件时 区分xls 和xlsx ， 15分
 * 3）、getSumSocre 方法用于计算 每个学生的成绩总分； --5分 ；
 * 4）、writeExcel 方法 ，把计算每个学生的总成绩写入到student_sorce.xlsx 文件中，（要求：在原文件的sheet 里添加一列，列名为总分，学生成绩写入到里面）--15分

 * @author Administrator
 *
 */
public class ExcelUtil {
	
	Workbook wb;
	Sheet sheet;
	List<StuScore> list = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		ExcelUtil ex = new ExcelUtil();
		ex.readExcel("student_sorce.xlsx");
		ex.writeExcel();
		ex.writeDB();
//		System.out.println(ex.list);
	}

	public void readExcel(String path) throws Exception {
		try (InputStream inp = new FileInputStream(path)) {
			wb = WorkbookFactory.create(inp);
			sheet = wb.getSheet("student_socre");
		}
	}
	
	public double getSumSocre(int index) {
		Row row = sheet.getRow(index);
		
		int sum = 0;
		StuScore ss = new StuScore();
		ss.setName(row.getCell(0).getStringCellValue());
		for (int i = 1; i < 7; i++) {
			if (row.getCell(i) != null) {
				sum += row.getCell(i).getNumericCellValue();
				ss.getS()[i - 1] = row.getCell(i).getNumericCellValue();
			}
		}
		ss.getS()[6] = sum;
		list.add(ss);
		return sum;
	}

	public void writeExcel() throws Exception {
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(7);
		cell.setCellValue("total");
		double sum;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			if (sheet.getRow(i) == null || sheet.getRow(i).getCell(0) == null 
					|| "".equals(sheet.getRow(i).getCell(0).getStringCellValue())) {
				continue;
			}
			sum = getSumSocre(i);
			if (sheet.getRow(i).getCell(7) != null) {
				sheet.getRow(i).getCell(7).setCellValue(sum);
			}
		}

		OutputStream fileOut = null;
		try  {
			fileOut = new FileOutputStream("workbook.xlsx");
			wb.write(fileOut);
		} finally {
			fileOut.close();
		}
	}

	public void writeDB() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://106.14.219.240:3306/testroad";
		String username = "testroad";
		String password = "Test@123456";
		Connection conn = null;
		conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();

		for (StuScore ss : list) {

			String sql = "INSERT INTO test "
					+ "(`name`, question_1, question_2, question_3, question_4, question_5, question_6, toal_score )"
					+ "VALUES('" 
					+ ss.getName() + "'," 
					+ ss.getS()[0] + "," 
					+ ss.getS()[1] + "," 
					+ ss.getS()[2] + "," 
					+ ss.getS()[3] + "," 
					+ ss.getS()[4] + "," 
					+ ss.getS()[5] + "," 
					+ ss.getS()[6]
					+ ");";
//			System.out.println(sql);
			st.executeUpdate(sql);
		}
		
		st.close();
		conn.close();
	}

}

class StuScore {

	String name;
	double[] s = new double[7];
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getS() {
		return s;
	}

	public void setS(double[] s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "StuScore [name=" + name + ", s=" + Arrays.toString(s) + "]";
	}

}
