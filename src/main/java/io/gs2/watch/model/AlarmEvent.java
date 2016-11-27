package io.gs2.watch.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * アラームイベント
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AlarmEvent implements Serializable {

	/** アラームイベントID */
	String eventId;
	/** アラームID */
	String alarmId;
	/** イベントの種類 */
	String type;
	/** イベント発生日時 */
	Long eventAt;
	
	/**
	 * アラームイベントIDを取得
	 * 
	 * @return アラームイベントID
	 */
	public String getEventId() {
		return eventId;
	}
	
	/**
	 * アラームイベントIDを設定
	 * 
	 * @param eventId アラームイベントID
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	
	/**
	 * アラームIDを取得
	 * 
	 * @return アラームID
	 */
	public String getAlarmId() {
		return alarmId;
	}
	
	/**
	 * アラームIDを設定
	 * 
	 * @param alarmId アラームID
	 */
	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}
	
	/**
	 * イベントの種類を取得
	 * 
	 * @return イベントの種類
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * イベントの種類を設定
	 * 
	 * @param type イベントの種類
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * イベント発生日時を取得
	 * 
	 * @return イベント発生日時
	 */
	public Long getEventAt() {
		return eventAt;
	}
	
	/**
	 * イベント発生日時を設定
	 * 
	 * @param eventAt イベント発生日時
	 */
	public void setEventAt(Long eventAt) {
		this.eventAt = eventAt;
	}
}
