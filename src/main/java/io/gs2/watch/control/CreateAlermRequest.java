package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * アラームの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateAlermRequest extends Gs2BasicRequest<CreateAlermRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "CreateAlerm";
	}
	
	/** アラーム名 */
	String name;
	/** 説明文 */
	String description;
	/** サービス */
	String service;
	/** サービスID */
	String serviceId;
	/** メトリック */
	String operation;
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
	public String getName() {
		return name;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param name アラーム名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * アラーム名を設定。
	 * 
	 * @param name アラーム名
	 * @return this
	 */
	public CreateAlermRequest withName(String name) {
		setName(name);
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
	public CreateAlermRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
	
	/**
	 * サービスを取得。
	 * 
	 * @return サービス
	 */
	public String getService() {
		return service;
	}
	
	/**
	 * サービスを設定。
	 * 
	 * @param service サービス
	 */
	public void setService(String service) {
		this.service = service;
	}
	
	/**
	 * サービスを設定。
	 * 
	 * @param service サービス
	 * @return this
	 */
	public CreateAlermRequest withService(String service) {
		setService(service);
		return this;
	}
	
	/**
	 * サービスIDを取得。
	 * 
	 * @return サービス
	 */
	public String getServiceId() {
		return serviceId;
	}
	
	/**
	 * サービスIDを設定。
	 * 
	 * @param serviceId サービス
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	/**
	 * サービスIDを設定。
	 * 
	 * @param serviceId サービス
	 * @return this
	 */
	public CreateAlermRequest withServiceId(String serviceId) {
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
	public CreateAlermRequest withOperation(String operation) {
		setOperation(operation);
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
	public CreateAlermRequest withExpression(String expression) {
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
	public CreateAlermRequest withThreshold(Integer threshold) {
		setThreshold(threshold);
		return this;
	}
	
	/**
	 * 通知IDを取得。
	 * 
	 * @return 通知ID
	 */
	public String getNotificationId() {
		return notificationId;
	}
	
	/**
	 * 通知IDを設定。
	 * 
	 * @param notificationId 通知ID
	 */
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	/**
	 * 通知IDを設定。
	 * 
	 * @param notificationId 通知ID
	 * @return this
	 */
	public CreateAlermRequest withNotificationId(String notificationId) {
		setNotificationId(notificationId);
		return this;
	}
}
