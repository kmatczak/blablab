package com.home.example.db;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AlarmTypeDAO {

	private SqlMapClient sqlMap = null;

	public AlarmTypeDAO(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public AlarmType getAlarmType(long specificProblem) throws SQLException {
		return (AlarmType) sqlMap.queryForObject("getAlarmType", new Long(specificProblem));
	}

	public AlarmType getAlarmTypeForUpdate(long specificProblem) throws SQLException{
		return (AlarmType) sqlMap.queryForObject("getAlarmType", new Long(specificProblem));
	}

	@SuppressWarnings("unchecked")
	public List<AlarmType> getAlarmTypes() throws SQLException{
		return (List<AlarmType>)sqlMap.queryForList("getAlarmTypes", null);
	}

	public int updateAlarmType(AlarmType alarmType) throws SQLException{
		return sqlMap.update("updateAlarmType", alarmType);
	}
	
	public long addNewAlarmType(AlarmType alarmType) throws SQLException{
		return ((Long)(sqlMap.insert("addAlarmType", alarmType))).longValue();
	}

}