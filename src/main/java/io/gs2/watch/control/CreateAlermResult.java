package io.gs2.watch.control;

import io.gs2.watch.model.Alerm;

/**
 * アラームの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class CreateAlermResult {
	
	Alerm item;
	
	/**
	 * アラームを取得。
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
	
	/**
	 * アラームを設定。
	 * 
	 * @param item アラーム
	 * @return this
	 */
	public CreateAlermResult withItem(Alerm item) {
		setItem(item);
		return this;
	}
}
