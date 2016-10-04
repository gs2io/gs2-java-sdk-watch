package io.gs2.watch.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * メトリック
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Metric implements Serializable {

	/** タイムスタンプ */
	String timestamp;
	/** 値 */
	Integer value;
	
	/**
	 * タイムスタンプを取得
	 * 
	 * @return タイムスタンプ
	 */
	public String getTimestamp() {
		return timestamp;
	}
	
	/**
	 * タイムスタンプを設定
	 * 
	 * @param timestamp タイムスタンプ
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * 値を取得
	 * 
	 * @return 値
	 */
	public Integer getValue() {
		return value;
	}
	
	/**
	 * 値を設定
	 * 
	 * @param value 値
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
}
