package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * オペレーション一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeOperationRequest extends Gs2BasicRequest<DescribeOperationRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "DescribeOperation";
	}

	/** サービス */
	String service;

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
	public DescribeOperationRequest withService(String service) {
		setService(service);
		return this;
	}
	
}
