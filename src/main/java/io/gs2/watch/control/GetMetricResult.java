package io.gs2.watch.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.watch.model.Metric;

/**
 * メトリック取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetMetricResult {

	/** メトリック */
	List<Metric> items;
	
	/**
	 * 取得したメトリックを取得。
	 * 
	 * @return メトリック
	 */
	public List<Metric> getItems() {
		return items;
	}
	
	/**
	 * メトリックを設定。
	 * 
	 * @param items メトリック
	 */
	public void setItems(List<Metric> items) {
		this.items = items;
	}
}
