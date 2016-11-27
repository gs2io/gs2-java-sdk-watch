package io.gs2.watch.control;

import io.gs2.watch.model.Alarm;

/**
 * アラーム取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class GetAlarmResult {

	/** アラーム */
	Alarm item;
	
	/**
	 * 取得したアラームを取得。
	 * 
	 * @return アラーム
	 */
	public Alarm getItem() {
		return item;
	}
	
	/**
	 * アラームを設定。
	 * 
	 * @param item アラーム
	 */
	public void setItem(Alarm item) {
		this.item = item;
	}
}
