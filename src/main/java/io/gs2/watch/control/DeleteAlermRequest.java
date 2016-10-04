package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * アラームの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteAlermRequest extends Gs2BasicRequest<DeleteAlermRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "DeleteAlerm";
	}
	
	/** アラーム名 */
	String alermName;
	
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
	public DeleteAlermRequest withAlermName(String alermName) {
		setAlermName(alermName);
		return this;
	}
}
