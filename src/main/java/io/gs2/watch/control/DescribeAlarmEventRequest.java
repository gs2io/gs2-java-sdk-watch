package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * アラーム一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeAlarmEventRequest extends Gs2BasicRequest<DescribeAlarmEventRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "DescribeAlarmEvent";
	}

	/** アラーム名 */
	String alarmName;
	/** 取得開始位置トークン */
	String pageToken;
	/** 取得件数 */
	Integer limit;

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
	public DescribeAlarmEventRequest withAlarmName(String alarmName) {
		setAlarmName(alarmName);
		return this;
	}
	
	/**
	 * 取得開始位置トークンを取得。
	 * 
	 * @return 取得開始位置トークン
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 * @return this
	 */
	public DescribeAlarmEventRequest withPageToken(String pageToken) {
		setPageToken(pageToken);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public DescribeAlarmEventRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
