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
public class DescribeAlermEventRequest extends Gs2BasicRequest<DescribeAlermEventRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "DescribeAlermEvent";
	}

	/** アラーム名 */
	String alermName;
	/** 取得開始位置トークン */
	String pageToken;
	/** 取得件数 */
	Integer limit;

	/**
	 * アラーム名を取得。
	 * 
	 * @return アラーム名
	 */
	public String getAlermName() {
		return alermName;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param alermName アラーム名
	 */
	public void setAlermName(String alermName) {
		this.alermName = alermName;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param alermName アラーム名
	 * @return this
	 */
	public DescribeAlermEventRequest withAlermName(String alermName) {
		setAlermName(alermName);
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
	public DescribeAlermEventRequest withPageToken(String pageToken) {
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
	public DescribeAlermEventRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
