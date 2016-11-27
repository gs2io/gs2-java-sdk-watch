package io.gs2.watch.control;

import io.gs2.watch.model.Alarm;

/**
 * アラームの更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class UpdateAlarmResult {
	
	Alarm item;
	
	/**
	 * アラームを取得。
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
	
	/**
	 * アラームを設定。
	 * 
	 * @param item アラーム
	 * @return this
	 */
	public UpdateAlarmResult withItem(Alarm item) {
		setItem(item);
		return this;
	}
}