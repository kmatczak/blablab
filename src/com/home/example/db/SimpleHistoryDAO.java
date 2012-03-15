package com.home.example.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

public class SimpleHistoryDAO
{
	private SqlMapClient sqlMap = null;

	public SimpleHistoryDAO(SqlMapClient sqlMap) {

		this.sqlMap = sqlMap;

	}

	public long addAlarmHistoryRecord(SimpleHistory record)
			throws SQLException {

		try {
			return ((Long) sqlMap.insert("addSimpleHistoryRecord", record))
					.longValue();
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}

	public int cleanAlarmHistory(long alarmHistoryStartTime)
			throws SQLException {

		try {
			Map params = new HashMap(1);
			params.put("startTime", alarmHistoryStartTime);
			return sqlMap.delete("cleanSimpleHistory", params);
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}

	public List getAlarmHistoryRecords() throws SQLException {

		try {
			return sqlMap.queryForList("getSimpleHistoryRecords", null);
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}

	public long getAlarmHistorySize() throws SQLException {

		try {

			Long size = (Long) sqlMap.queryForObject("getSimpleHistorySize",
					null);
			if (size != null) {
				return size;
			} else {
				return 0;
			}

		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}

	public List getAlarmHistoryRecordIds(int fromIndex, int howMany)
			throws SQLException {

		try {

			Map params = new HashMap(2);
			params.put("fromIndex", fromIndex);
			params.put("howMany", howMany);
			return sqlMap.queryForList("getSimpleHistoryRecordIds", params);

		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}

	public int deleteAlarmHistoryRecords(long startNotificationId)
			throws SQLException {

		try {
			return sqlMap.delete("deleteSimpleHistoryRecords", new Long(
					startNotificationId));
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}

	}
}