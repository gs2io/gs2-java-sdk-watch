package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * アラームの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateAlermRequest extends Gs2BasicRequest<UpdateAlermRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "UpdateAlerm";
	}

	/** アラーム名 */
	String alermName;
	/** 説明文 */
	String description;
	/** 演算子 */
	String expression;
	/** 閾値 */
	Integer threshold;
	/** 通知ID */
	String notificationId;

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
	public UpdateAlermRequest withAlermName(String alermName) {
		setAlermName(alermName);
		return this;
	}
	
	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public UpdateAlermRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
	
	/**
	 * 演算子を取得。
	 * 
	 * @return 演算子
	 */
	public String getExpression() {
		return expression;
	}
	
	/**
	 * 演算子を設定。
	 * 
	 * @param expression 演算子
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	/**
	 * 演算子を設定。
	 * 
	 * @param expression 演算子
	 * @return this
	 */
	public UpdateAlermRequest withExpression(String expression) {
		setExpression(expression);
		return this;
	}
	
	/**
	 * 閾値を取得。
	 * 
	 * @return 閾値
	 */
	public Integer getThreshold() {
		return threshold;
	}
	
	/**
	 * 閾値を設定。
	 * 
	 * @param threshold 閾値
	 */
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}
	
	/**
	 * 閾値を設定。
	 * 
	 * @param threshold 閾値
	 * @return this
	 */
	public UpdateAlermRequest withThreshold(Integer threshold) {
		setThreshold(threshold);
		return this;
	}
	
	/**
	 * 通知IDを取得
	 * 
	 * @return 通知ID
	 */
	public String getNotificationId() {
		return notificationId;
	}
	
	/**
	 * 通知IDを設定
	 * 
	 * @param notificationId 通知ID
	 */
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	/**
	 * 通知IDを設定
	 * 
	 * @param notificationId 通知ID
	 * @return this
	 */
	public UpdateAlermRequest withNotificationId(String notificationId) {
		setNotificationId(notificationId);
		return this;
	}
}
