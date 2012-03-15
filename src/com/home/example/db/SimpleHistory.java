package com.home.example.db;

/**
 * 
 * The AlarmHistoryRecord class incapsulates data of an alarm event.
 * 
 * @author Iouri V. Koulikov
 * 
 * @version 5.0
 * 
 */
public class SimpleHistory {
	
	public static final short UNCLEARED = 0;
	
	public static final short CLEARED = 1;
	
	public static final short WARNING_ALARM_CLEARED = 2;

	private long notificationId;

	private long alarmId;

	private long specificProblem;

	private short probableCause;

	private String eventTypeName;

	private String extendedEventTypeName;

	private long alarmTime;
	
	private long systemTime;
	
	private long originalTime;
	
	private short utcShift;

	private String managedObjectId;

	private String applicationId;

	private short ackState;

	private short clearState;

	private short perceivedSeverity;

	private String IApplAdditionalInfo;

	private String applAdditionalInfo;

	private byte clearingInfo;

	private String alarmText;

	private String correlatedNotifications;

	private long ackTime;

	private String userId;

	private String systemId;

	private short controlIndicator;

	public String toString() {

		return "notificationId: " + notificationId + " alarmId: " + alarmId
				+ " specificProblem: " + specificProblem + " probableCause: "
				+ probableCause + " eventTypeName: " + eventTypeName
				+ " extendedEventTypeName: " + extendedEventTypeName
				+ " alarmTime: " + alarmTime + " systemTime: " + systemTime 
				+ "originalTime: " + originalTime + " utcShift: " + utcShift
				+ " managedObjectId: " + managedObjectId + " applicationId: " + applicationId
				+ " ackState: " + ackState + " clearState: " + clearState
				+ " perceivedSeverity: " + perceivedSeverity
				+ " IApplAdditionalInfo: " + IApplAdditionalInfo
				+ " applAdditionalInfo: " + applAdditionalInfo
				+ " clearingInfo: " + clearingInfo + " alarmText: " + alarmText
				+ " ackTime: " + ackTime + " userId: " + userId + " systemId: "
				+ systemId + " controlIndicator: " + controlIndicator;

	}

	/**
	 * Gets the notification id.
	 *  
	 */
	public long getNotificationId() {
		return notificationId;
	}

	/**
	 * Sets the notificationId.
	 * 
	 * @param notificationId -
	 *            the notification id to set
	 */
	public void setNotificationId(long notificationId) {
		this.notificationId = notificationId;
	}

	/**
	 * Gets the alarm id.
	 *  
	 */
	public long getAlarmId() {
		return alarmId;
	}

	/**
	 * Sets the alarm id.
	 * 
	 * @param alarmId -
	 *            the alarm id to set
	 */
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}

	/**
	 * Returns the specific problem.
	 *  
	 */
	public long getSpecificProblem() {
		return specificProblem;
	}

	/**
	 * Sets the specific problem.
	 * 
	 * @param specificProblem -
	 *            the specific problem to set
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
	 * Gets the eventTypeName
	 */
	public String getExtendedEventTypeName() {
		return extendedEventTypeName;
	}

	/**
	 * Sets the extendedEventTypeName
	 */
	public void setExtendedEventTypeName(String extendedEventTypeName) {
		this.extendedEventTypeName = extendedEventTypeName;
	}

	/**
	 * Returns the alarm time.
	 *  
	 */
	public long getAlarmTime() {
		return alarmTime;
	}

	/**
	 * Sets the alarm time.
	 * 
	 * @param alarmTime -
	 *            the alarm time to set
	 */
	public void setAlarmTime(long alarmTime) {
		this.alarmTime = alarmTime;
	}
	
	/**
	 * Returns the system time.
	 * 
	 */
	public long getSystemTime() {
		return systemTime;
	}

	/**
	 * Sets the systemTime.
	 * 
	 * @param systemTime -
	 *            the system time to set.
	 */
	public void setSystemTime(long systemTime) {
		this.systemTime = systemTime;
	}
	
	/**
	 * Returns the original time.
	 * 
	 */
	public long getOriginalTime() {
		return originalTime;
	}

	/**
	 * Sets the originalTime.
	 * 
	 * @param originalTime -
	 *            the original time to set.
	 */
	public void setOriginalTime(long originalTime) {
		this.originalTime = originalTime;
	}

	/**
	 * Returns the utcShift.
	 * 
	 */
	public short getUtcShift() {
		return utcShift;
	}

	/**
	 * Sets the utcShift.
	 * 
	 * @param utcShift -
	 *            the utcShift to set.
	 */
	public void setUtcShift(short utcShift) {
		this.utcShift = utcShift;
	}

	/**
	 * Returns the managed object.
	 *  
	 */
	public String getManagedObjectId() {
		return managedObjectId;
	}

	/**
	 * Sets the managed object.
	 * 
	 * @param MOId -
	 *            the managed object to set
	 */
	public void setManagedObjectId(String managedObjectId) {
		this.managedObjectId = managedObjectId;
	}

	/**
	 * Returns the application id.
	 *  
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * Sets the application id.
	 * 
	 * @param applicationId -
	 *            the application id to set.
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Returns the alarm's acked state.
	 *  
	 */
	public short getAckState() {
		return ackState;
	}

	/**
	 * Sets the alarm's acked state.
	 * 
	 * @param mode -
	 *            the alarm's acked state to set
	 */
	public void setAckState(short ackState) {
		this.ackState = ackState;
	}

	/**
	 * Returns the alarm's cleared state.
	 *  
	 */
	public short getClearState() {
		return clearState;
	}

	/**
	 * Sets the alarm's cleared state.
	 * 
	 * @param mode -
	 *            the alarm's cleared state to set
	 */
	public void setClearState(short clearState) {
		this.clearState = clearState;
	}

	/**
	 * Returns the perceived severity.
	 *  
	 */
	public short getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * Sets the perceived severity..
	 * 
	 * @param perceivedSeverity -
	 *            the perceived severity to set.
	 */
	public void setPerceivedSeverity(short perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
	}

	/**
	 * Returns the identified application additional info.
	 *  
	 */
	public String getIApplAdditionalInfo() {
		return IApplAdditionalInfo;
	}

	/**
	 * Sets the identified application additional info.
	 * 
	 * @param IApplAdditionalInfo -
	 *            the identified application additional info to set
	 */
	public void setIApplAdditionalInfo(String IApplAdditionalInfo) {
		this.IApplAdditionalInfo = IApplAdditionalInfo;
	}

	/**
	 * Returns the non-identified application additional info.
	 *  
	 */
	public String getApplAdditionalInfo() {
		return applAdditionalInfo;
	}

	/**
	 * Sets the non-identified application additional info.
	 * 
	 * @param applAdditionalInfo -
	 *            the identified application additional info
	 */
	public void setApplAdditionalInfo(String applAdditionalInfo) {
		this.applAdditionalInfo = applAdditionalInfo;
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
	 * Returns the correlated notifications.
	 *  
	 */
	public String getCorrelatedNotifications() {
		return this.correlatedNotifications;
	}

	/**
	 * Sets the correlated notifications.
	 * 
	 * @param correlatedNotifications -
	 *            the correlated notifications to set.
	 */
	public void setCorrelatedNotifications(String correlatedNotifications) {
		this.correlatedNotifications = correlatedNotifications;
	}

	/**
	 * Returns the ackTime.
	 *  
	 */
	public long getAckTime() {
		return this.ackTime;
	}

	/**
	 * Sets the ackTime.
	 * 
	 * @param ackTime -
	 *            the flow control to set.
	 */
	public void setAckTime(long ackTime) {
		this.ackTime = ackTime;
	}

	/**
	 * Returns the userId.
	 *  
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Sets the userId.
	 * 
	 * @param userId -
	 *            the userId to set.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Returns the systemId.
	 *  
	 */
	public String getSystemId() {
		return this.systemId;
	}

	/**
	 * Sets the systemId.
	 * 
	 * @param systemId -
	 *            the systemId to set.
	 */
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	/**
	 * Gets the control indicator
	 */
	public short getControlIndicator() {
		return controlIndicator;
	}

	/**
	 * Sets the control indicator
	 */
	public void setControlIndicator(short controlIndicator) {
		this.controlIndicator = controlIndicator;
	}

}