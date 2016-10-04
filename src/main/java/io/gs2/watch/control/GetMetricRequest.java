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
public class GetMetricRequest extends Gs2BasicRequest<GetMetricRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "GetMetric";
	}

	/** サービス */
	String serviceId;
	/** オペレーション */
	String operation;
	/** 取得開始日時 */
	Integer begin;
	/** 取得終了日時 */
	Integer end;
	/** 長期間のデータ取得を許可するか */
	Boolean allowLongTerm;
	
	/**
	 * サービスを取得。
	 * 
	 * @return サービス
	 */
	public String getServiceId() {
		return serviceId;
	}
	
	/**
	 * サービスを設定。
	 * 
	 * @param serviceId サービス
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	/**
	 * サービスを設定。
	 * 
	 * @param serviceId サービス
	 * @return this
	 */
	public GetMetricRequest withServiceId(String serviceId) {
		setServiceId(serviceId);
		return this;
	}
	
	/**
	 * オペレーションを取得。
	 * 
	 * @return オペレーション
	 */
	public String getOperation() {
		return operation;
	}
	
	/**
	 * オペレーションを設定。
	 * 
	 * @param operation オペレーション
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	/**
	 * オペレーションを設定。
	 * 
	 * @param operation オペレーション
	 * @return this
	 */
	public GetMetricRequest withOperation(String operation) {
		setOperation(operation);
		return this;
	}
	
	/**
	 * 取得開始日時を取得。
	 * 
	 * @return 取得開始日時
	 */
	public Integer getBegin() {
		return begin;
	}
	
	/**
	 * 取得開始日時を設定。
	 * 
	 * @param begin 取得開始日時
	 */
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	
	/**
	 * 取得開始日時を設定。
	 * 
	 * @param begin 取得開始日時
	 * @return this
	 */
	public GetMetricRequest withBegin(Integer begin) {
		setBegin(begin);
		return this;
	}
	
	/**
	 * 取得終了日時を取得。
	 * 
	 * @return 取得終了日時
	 */
	public Integer getEnd() {
		return end;
	}
	
	/**
	 * 取得終了日時を設定。
	 * 
	 * @param end 取得終了日時
	 */
	public void setEnd(Integer end) {
		this.end = end;
	}
	
	/**
	 * 取得終了日時を設定。
	 * 
	 * @param end 取得終了日時
	 * @return this
	 */
	public GetMetricRequest withEnd(Integer end) {
		setEnd(end);
		return this;
	}
	
	/**
	 * 長期間のデータ取得を許可するかを取得。
	 * 
	 * @return 長期間のデータ取得を許可するか
	 */
	public Boolean getAllowLongTerm() {
		return allowLongTerm;
	}
	
	/**
	 * 長期間のデータ取得を許可するかを設定。
	 * 
	 * @param allowLongTerm 長期間のデータ取得を許可するか
	 */
	public void setAllowLongTerm(Boolean allowLongTerm) {
		this.allowLongTerm = allowLongTerm;
	}
	
	/**
	 * 長期間のデータ取得を許可するかを設定。
	 * 
	 * @param allowLongTerm 長期間のデータ取得を許可するか
	 * @return this
	 */
	public GetMetricRequest withAllowLongTerm(Boolean allowLongTerm) {
		setAllowLongTerm(allowLongTerm);
		return this;
	}
}
