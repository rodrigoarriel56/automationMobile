package suporte;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Report {
	
	private String category;
	private String project;
	private String testName;
	private Date startTime;
	private Date endTime;
	private Integer screenShotNumber =0;
	private String os;
	private ExtentReports report;
	private ExtentTest test;
	
	public Report(String ambiente, String testName, String platform) {
		this.os= os;
		this.testName = testName;
		this.startTime = new Date();
//			report = new ExtentReports(getSourcePath);
			report.assignProject(project);
			test = report.startTest(testName);
			test.assignCategory(platform);
			
	}
}

