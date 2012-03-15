package com.home.example.db;

public class AlarmType implements Comparable<AlarmType> {

	private long specificProblem;

	private short probableCause;

	private short defaultSeverity;

	private byte autoAcknowledged;

	private byte switchOverUpdate;

	private byte clearingInfo;

	private long clearingDelay;

	private long informingDelay;

	private long timeToLive;

	private String alarmText = "";

	private String operationInstructions = "";

	private String probableCauseName = "";

	private String eventTypeName = "";
	
	private boolean local;
	
	private long lastModifiedTime;
	
	public static AlarmType cloneAlarmType(AlarmType initAlarmType) {
		
		if(initAlarmType == null)
			return null;
		
		AlarmType newAlarmType = new AlarmType();
		
		newAlarmType.setSpecificProblem(initAlarmType.getSpecificProblem());
		newAlarmType.setProbableCause(initAlarmType.getProbableCause());
		newAlarmType.setDefaultSeverity(initAlarmType.getDefaultSeverity());
		newAlarmType.setAutoAcknowledged(initAlarmType.getAutoAcknowledged());
		newAlarmType.setSwitchOverUpdate(initAlarmType.getSwitchOverUpdate());
		newAlarmType.setClearingInfo(initAlarmType.getClearingInfo());
		newAlarmType.setClearingDelay(initAlarmType.getClearingDelay());
		newAlarmType.setInformingDelay(initAlarmType.getInformingDelay());
		newAlarmType.setTimeToLive(initAlarmType.getTimeToLive());
		newAlarmType.setAlarmText(new String(initAlarmType.getAlarmText()));
		newAlarmType.setOperationInstructions(new String(initAlarmType.getOperationInstructions()));
		newAlarmType.setProbableCauseName(new String(initAlarmType.getProbableCauseName()));
		newAlarmType.setEventTypeName(new String(initAlarmType.getEventTypeName()));
		newAlarmType.setLocal(initAlarmType.isLocal());
		
		return newAlarmType;

	}

	public int compareTo(AlarmType alarmType) {
		return (int)(this.getSpecificProblem() - alarmType.getSpecificProblem());
	}

	/**
	 * Gets the specific problem
	 */
	public long getSpecificProblem() {
		return specificProblem;
	}

	/**
	 * Sets the specific problem
	 */
	public void setSpecificProblem(long specificProblem) {
		this.specificProblem = specificProblem;
	}

	/**
	 * Gets the probable cause
	 */
	public short getProbableCause() {
		return probableCause;
	}

	/**
	 * Sets the probable cause
	 */
	public void setProbableCause(short probableCause) {
		this.probableCause = probableCause;
	}

	/**
	 * Gets the default severity
	 */
	public short getDefaultSeverity() {
		return defaultSeverity;
	}

	/**
	 * Sets the defaultSeverity
	 */
	public void setDefaultSeverity(short defaultSeverity) {
		this.defaultSeverity = defaultSeverity;
	}

	/**
	 * Gets the autoAcknowledged
	 */
	public byte getAutoAcknowledged() {
		return autoAcknowledged;
	}

	/**
	 * Sets the autoAcknowledged
	 */
	public void setAutoAcknowledged(byte autoAcknowledged) {
		this.autoAcknowledged = autoAcknowledged;
	}

	/**
	 * Gets the switchOverUpdate
	 */
	public byte getSwitchOverUpdate() {
		return switchOverUpdate;
	}

	/**
	 * Sets the switchOverUpdate
	 */
	public void setSwitchOverUpdate(byte switchOverUpdate) {
		this.switchOverUpdate = switchOverUpdate;
	}

	/**
	 * Gets the clearingInfo
	 */
	public byte getClearingInfo() {
		return clearingInfo;
	}

	/**
	 * Sets the clearingInfo
	 */
	public void setClearingInfo(byte clearingInfo) {
		this.clearingInfo = clearingInfo;
	}

	/**
	 * Gets the clearingDelay
	 */
	public long getClearingDelay() {
		return clearingDelay;
	}

	/**
	 * Sets the clearingDelay
	 */
	public void setClearingDelay(long clearingDelay) {
		this.clearingDelay = clearingDelay;
	}

	/**
	 * Gets the informingDelay
	 */
	public long getInformingDelay() {
		return informingDelay;
	}

	/**
	 * Sets the informingDelay
	 */
	public void setInformingDelay(long informingDelay) {
		this.informingDelay = informingDelay;
	}

	/**
	 * Gets the timeToLive
	 */
	public long getTimeToLive() {
		return timeToLive;
	}

	/**
	 * Sets the timeToLive
	 */
	public void setTimeToLive(long timeToLive) {
		this.timeToLive = timeToLive;
	}

	/**
	 * Gets the alarmText
	 */
	public String getAlarmText() {
		return alarmText;
	}

	/**
	 * Sets the alarmText
	 */
	public void setAlarmText(String alarmText) {
		this.alarmText = alarmText;
	}

	/**
	 * Gets the operationInstructions
	 */
	public String getOperationInstructions() {
		return operationInstructions;
	}

	/**
	 * Sets the operationInstructions
	 */
	public void setOperationInstructions(String operationInstructions) {
		this.operationInstructions = operationInstructions;
	}

	/**
	 * Gets the probableCauseName
	 */
	public String getProbableCauseName() {
		return probableCauseName;
	}

	/**
	 * Sets the probableCauseName
	 */
	public void setProbableCauseName(String probableCauseName) {
		this.probableCauseName = probableCauseName;
	}

	/**
	 * Gets the eventTypeName
	 */
	public String getEventTypeName() {
		return eventTypeName;
	}

	/**
	 * Sets the eventTypeName
	 */
	public void setEventTypeName(String eventTypeName) {
		this.eventTypeName = eventTypeName;
	}

	/**
	 * Gets the local
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * Sets the local
	 */
	public void setLocal(boolean local) {
		this.local = local;
	}

	/**
	 * Gets the lastModifiedTime
	 */
	public long getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * Sets the lastModifiedTime
	 */
	public void setLastModifiedTime(long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

}