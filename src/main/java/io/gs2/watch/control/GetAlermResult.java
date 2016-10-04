package io.gs2.watch.control;

import io.gs2.watch.model.Alerm;

/**
 * アラーム取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class GetAlermResult {

	/** アラーム */
	Alerm item;
	
	/**
	 * 取得したアラームを取得。
	 * 
	 * @return アラーム
	 */
	public Alerm getItem() {
		return item;
	}
	
	/**
	 * アラームを設定。
	 * 
	 * @param item アラーム
	 */
	public void setItem(Alerm item) {
		this.item = item;
	}
}
