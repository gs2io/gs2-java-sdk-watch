package io.gs2.watch;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.watch.control.CreateAlermRequest;
import io.gs2.watch.control.CreateAlermResult;
import io.gs2.watch.control.DeleteAlermRequest;
import io.gs2.watch.control.DescribeAlermEventRequest;
import io.gs2.watch.control.DescribeAlermEventResult;
import io.gs2.watch.control.DescribeAlermRequest;
import io.gs2.watch.control.DescribeAlermResult;
import io.gs2.watch.control.DescribeOperationRequest;
import io.gs2.watch.control.DescribeOperationResult;
import io.gs2.watch.control.DescribeServiceRequest;
import io.gs2.watch.control.DescribeServiceResult;
import io.gs2.watch.control.GetAlermRequest;
import io.gs2.watch.control.GetAlermResult;
import io.gs2.watch.control.GetMetricRequest;
import io.gs2.watch.control.GetMetricResult;
import io.gs2.watch.control.UpdateAlermRequest;
import io.gs2.watch.control.UpdateAlermResult;

/**
 * GS2 Timer API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2WatchClient extends AbstractGs2Client<Gs2WatchClient> {

	public static String ENDPOINT = "watch";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2WatchClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * アラームを作成。<br>
	 * <br>
	 * GS2 内のスタティスティックスに対して監視を行うことができます。<br>
	 * クオータの消費量に対して閾値を設定し、閾値を超えた際に通知を出すことができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateAlermResult createAlerm(CreateAlermRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription())
				.put("service", request.getService())
				.put("serviceId", request.getServiceId())
				.put("operation", request.getOperation())
				.put("expression", request.getExpression())
				.put("threshold", request.getThreshold())
				.put("notificationId", request.getNotificationId());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/alerm", 
				credential, 
				ENDPOINT,
				CreateAlermRequest.Constant.MODULE, 
				CreateAlermRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateAlermResult.class);
	}
	
	/**
	 * アラーム一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return アラーム一覧
	 */
	public DescribeAlermResult describeAlerm(DescribeAlermRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/alerm";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeAlermRequest.Constant.MODULE, 
				DescribeAlermRequest.Constant.FUNCTION);
		return doRequest(get, DescribeAlermResult.class);
	}

	/**
	 * アラームを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return アラーム
	 */
	public GetAlermResult getAlerm(GetAlermRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/alerm/" + request.getAlermName(), 
				credential, 
				ENDPOINT,
				GetAlermRequest.Constant.MODULE, 
				GetAlermRequest.Constant.FUNCTION);
		return doRequest(get, GetAlermResult.class);
	}

	/**
	 * アラームを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateAlermResult updateAlerm(UpdateAlermRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("expression", request.getExpression())
				.put("threshold", request.getThreshold())
				.put("notificationId", request.getNotificationId());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/alerm/" + request.getAlermName(), 
				credential, 
				ENDPOINT,
				UpdateAlermRequest.Constant.MODULE, 
				UpdateAlermRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateAlermResult.class);
	}

	/**
	 * アラームを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteAlerm(DeleteAlermRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/alerm/" + request.getAlermName(), 
				credential, 
				ENDPOINT,
				DeleteAlermRequest.Constant.MODULE, 
				DeleteAlermRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * アラームイベント一覧を取得。<br>
	 * <br>
	 * 過去にアラームが発生した履歴などを確認できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return アラームイベント一覧
	 */
	public DescribeAlermEventResult describeAlermEvent(DescribeAlermEventRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/alerm/" + request.getAlermName() + "/event";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeAlermEventRequest.Constant.MODULE, 
				DescribeAlermEventRequest.Constant.FUNCTION);
		return doRequest(get, DescribeAlermEventResult.class);
	}

	/**
	 * サービス一覧を取得。<br>
	 * <br>
	 * アラームを設定する際に指定できるサービスの一覧を取得できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return サービス一覧
	 */
	public DescribeServiceResult describeService(DescribeServiceRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/service";
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeServiceRequest.Constant.MODULE, 
				DescribeServiceRequest.Constant.FUNCTION);
		return doRequest(get, DescribeServiceResult.class);
	}

	/**
	 * オペレーション一覧を取得。<br>
	 * <br>
	 * アラームを設定する際に指定できるオペレーションの一覧を取得できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return オペレーション一覧
	 */
	public DescribeOperationResult describeOperation(DescribeOperationRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/service/" + request.getService() + "/operation";
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeOperationRequest.Constant.MODULE, 
				DescribeOperationRequest.Constant.FUNCTION);
		return doRequest(get, DescribeOperationResult.class);
	}

	/**
	 * メトリクスを取得。<br>
	 * <br>
	 * 過去のサービスの利用状況を取得します。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return メトリクス
	 */
	public GetMetricResult getMetric(GetMetricRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/metric/" + request.getServiceId() + "/" + request.getOperation();
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getBegin() != null) queryString.add(new BasicNameValuePair("begin", String.valueOf(request.getBegin())));
		if(request.getEnd() != null) queryString.add(new BasicNameValuePair("end", String.valueOf(request.getEnd())));
		if(request.getAllowLongTerm() != null) queryString.add(new BasicNameValuePair("allowLongTerm", String.valueOf(request.getAllowLongTerm())));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				GetMetricRequest.Constant.MODULE, 
				GetMetricRequest.Constant.FUNCTION);
		return doRequest(get, GetMetricResult.class);
	}

}
