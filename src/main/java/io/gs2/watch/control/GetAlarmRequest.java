package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * アラームの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetAlarmRequest extends Gs2BasicRequest<GetAlarmRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "GetAlarm";
	}
	
	/** アラーム名 */
	String alarmName;
	
	/**
	 * アラーム名を取得。
	 * 
	 * @return アラーム名
	 */
	public String getAlarmName() {
		return alarmName;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param alarmName アラーム名
	 */
	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param alarmName アラーム名
	 * @return this
	 */
	public GetAlarmRequest withAlarmName(String alarmName) {
		setAlarmName(alarmName);
		return this;
	}
}
