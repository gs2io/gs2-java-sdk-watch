package io.gs2.watch.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.watch.model.Alarm;

/**
 * アラーム一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeAlarmResult {

	/** アラーム一覧 */
	List<Alarm> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したアラーム数を取得。
	 * 
	 * @return 取得したアラーム数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したアラーム一覧を取得。
	 * 
	 * @return アラーム一覧
	 */
	public List<Alarm> getItems() {
		return items;
	}
	
	/**
	 * アラーム一覧を設定。
	 * 
	 * @param items アラーム一覧
	 */
	public void setItems(List<Alarm> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeAlarmRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
