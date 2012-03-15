package com.home.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import com.home.example.db.AlarmType;
import com.home.example.db.AlarmTypeDAO;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class AlarmGenerator {

	public static void main(String[] args) {
		if(args.length < 2) {

			System.out.println("usage: AlarmsMaker <package size> <package count>");
			System.exit(0);

		}
		
		String resource = "com/home/example/res/sql-map-config.xml";
		
		PrintStream orgStream 	= null;
		PrintStream fileStream 	= null;
		
		try {
			
			
			// Saving the orginal stream
			orgStream = System.out;
			fileStream = new PrintStream(new FileOutputStream("/home/kmatczak/SW_Developement/workspace_oms/SS_AlProcessor_overload/local_runtime_config/log.txt",true));
			// Redirecting console output to file
			System.setOut(fileStream);
			
			
			
			Properties props = new Properties();
			props.setProperty("username", "root"); //uzupelnic
			props.setProperty("password", "katarakta3"); //uzupelnic
		
			Reader reader = Resources.getResourceAsReader(resource);
			SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader, props);
			
			AlarmTypeDAO dao = new AlarmTypeDAO(sqlMap);
			List<AlarmType> alarmTypes = dao.getAlarmTypes();
			
			Vector<String> alarmTexts = new Vector<String>(alarmTypes.size());
			Vector<Long> specificProblems = new Vector<Long>(alarmTypes.size());
			for(AlarmType alarmType : alarmTypes){
				alarmTexts.add(alarmType.getAlarmText());
				specificProblems.add(alarmType.getSpecificProblem());
			}
			
			String[] et = {"x1", "x2", "x3", "x4", "x5"};
			int maxRNC = 20;
			int maxWBTS = 60000;
			int maxWCELL = 3;
			int maxNID = 28736;
			
			int pack = Integer.parseInt(args[0]);
			int total = Integer.parseInt(args[1]);

			for(int j=0; j<total; ++j){
				List<String> records = new LinkedList<String>();
				
				for(int i = 0; i < pack; i++) {
					int num = j*pack+i;
					
					long time = System.currentTimeMillis();
		
					/*String omsRec = "SP=70002 MO=/TestApp";
					omsRec += " AP=/CLA-0/TestServer/TestApp1 SE=3 IINFO=\"test";
					omsRec += num;
					omsRec += "\"";
					omsRec += " NINFO=\"test\" TIME=";
					omsRec += time;*/
		
					String neRec = "SP=" + specificProblems.get(num%specificProblems.size()) +
					String.format(" MO=moid=NE-RNC-%s/NE-WBTS-%s/WCEL-%s,fsLogicalNetworkElemId=NE-RNC-%s,fsFragmentId=external,fsClusterId=ClusterRoot", (num%maxRNC)+1, (num%maxWBTS)+1, (num%maxWCELL)+1, (num%maxRNC)+1) +
					String.format(" AP=appid=NE-RNC-%s/NE-WBTS-%s/WCEL-%s,fsLogicalNetworkElemId=RNC-1,fsFragmentId=external,fsClusterId=ClusterRoot", (num%maxRNC)+1, (num%maxWBTS)+1, (num%maxWCELL)+1) +
					String.format(" SE=2 IINFO=\"si=01$S$1.%se+12\"", 32625183925L+num) +
					String.format(" NINFO=\"afamily=crnc atime=%s et=%s fc=7 lpt=0 nid=%s nms=0 out=0 rcy=0 utc=0\"", (long)((time/1000 - 240)*1000), et[num%et.length], (num%maxNID)+1) +
					String.format(" TIME=%s", time) +
					" UTCSHIFT=60";
					
					records.add(neRec);
				}
				
				for(String record : records){
					System.out.println("2012 Jan 11 04:23:06 ALARM RAISE " + record);
				}
				
				for(String record : records){
					System.out.println("2012 Jan 11 04:23:06 ALARM CANCEL " + record);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
