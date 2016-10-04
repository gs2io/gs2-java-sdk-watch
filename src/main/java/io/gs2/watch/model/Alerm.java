package io.gs2.watch.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * アラーム
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Alerm implements Serializable {

	/** アラームID */
	String alermId;
	/** オーナーID */
	String ownerId;
	/** アラーム名 */
	String name;
	/** 説明文 */
	String description;
	/** 監視対象サービス */
	String service;
	/** 監視対象サービスID */
	String serviceId;
	/** 監視対象オペレーション */
	String operation;
	/** 条件式 */
	String expression;
	/** 閾値 */
	Integer threshold;
	/** 通知ID */
	String notificationId;
	/** 作成日時 */
	Long createAt;
	/** 更新日時 */
	Long updateAt;
	/** ステータス */
	String status;
	/** 最終ステータス更新日時 */
	Long lastStatusChangeAt;
	
	/**
	 * アラームIDを取得
	 * 
	 * @return アラームID
	 */
	public String getAlermId() {
		return alermId;
	}
	
	/**
	 * アラームIDを設定
	 * 
	 * @param alermId アラームID
	 */
	public void setAlermId(String alermId) {
		this.alermId = alermId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * アラーム名を取得
	 * 
	 * @return アラーム名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * アラーム名を設定
	 * 
	 * @param name アラーム名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 監視対象サービスを取得
	 * 
	 * @return 監視対象サービス
	 */
	public String getService() {
		return service;
	}
	
	/**
	 * 監視対象サービスを設定
	 * 
	 * @param service 監視対象サービス
	 */
	public void setService(String service) {
		this.service = service;
	}
	
	/**
	 * 監視対象サービスIDを取得
	 * 
	 * @return 監視対象サービスID
	 */
	public String getServiceId() {
		return serviceId;
	}
	
	/**
	 * 監視対象サービスIDを設定
	 * 
	 * @param serviceId 監視対象サービスID
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	/**
	 * 監視対象オペレーションを取得
	 * 
	 * @return 監視対象オペレーション
	 */
	public String getOperation() {
		return operation;
	}
	
	/**
	 * 監視対象オペレーションを設定
	 * 
	 * @param operation 監視対象オペレーション
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	/**
	 * 演算子を取得
	 * 
	 * @return 演算子
	 */
	public String getExpression() {
		return expression;
	}
	
	/**
	 * 演算子を設定
	 * 
	 * @param expression 演算子
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	/**
	 * 閾値を取得
	 * 
	 * @return 閾値
	 */
	public Integer getThreshold() {
		return threshold;
	}
	
	/**
	 * 閾値を設定
	 * 
	 * @param threshold 閾値
	 */
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
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
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
	
	/**
	 * ステータスを取得
	 * 
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * ステータスを設定
	 * 
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * 最終ステータス更新日時を取得
	 * 
	 * @return 最終ステータス更新日時
	 */
	public Long getLastStatusChangeAt() {
		return lastStatusChangeAt;
	}
	
	/**
	 * 最終ステータス更新日時を設定
	 * 
	 * @param lastStatusChangeAt 最終ステータス更新日時
	 */
	public void setLastStatusChangeAt(Long lastStatusChangeAt) {
		this.lastStatusChangeAt = lastStatusChangeAt;
	}
}
