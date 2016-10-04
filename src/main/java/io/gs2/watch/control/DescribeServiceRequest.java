package io.gs2.watch.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.watch.Gs2Watch;

/**
 * サービス一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeServiceRequest extends Gs2BasicRequest<DescribeServiceRequest> {

	public static class Constant extends Gs2Watch.Constant {
		public static final String FUNCTION = "DescribeService";
	}
}
