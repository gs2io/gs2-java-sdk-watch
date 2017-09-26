package io.gs2.watch.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.watch.model.AlarmEvent;

/**
 * イベント一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeAlarmEventResult {

	/** イベント一覧 */
	List<AlarmEvent> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したイベント数を取得。
	 * 
	 * @return 取得したイベント数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したイベント一覧を取得。
	 * 
	 * @return イベント一覧
	 */
	public List<AlarmEvent> getItems() {
		return items;
	}
	
	/**
	 * イベント一覧を設定。
	 * 
	 * @param items イベント一覧
	 */
	public void setItems(List<AlarmEvent> items) {
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
