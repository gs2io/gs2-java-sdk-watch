package io.gs2.watch.control;

import java.util.List;

/**
 * サービス一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class DescribeOperationResult {

	/** サービス一覧 */
	List<String> items;
	
	/**
	 * 取得したサービス数を取得。
	 * 
	 * @return 取得したサービス数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したサービス一覧を取得。
	 * 
	 * @return サービス一覧
	 */
	public List<String> getItems() {
		return items;
	}
	
	/**
	 * サービス一覧を設定。
	 * 
	 * @param items サービス一覧
	 */
	public void setItems(List<String> items) {
		this.items = items;
	}
}
