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
import io.gs2.watch.control.CreateAlarmRequest;
import io.gs2.watch.control.CreateAlarmResult;
import io.gs2.watch.control.DeleteAlarmRequest;
import io.gs2.watch.control.DescribeAlarmEventRequest;
import io.gs2.watch.control.DescribeAlarmEventResult;
import io.gs2.watch.control.DescribeAlarmRequest;
import io.gs2.watch.control.DescribeAlarmResult;
import io.gs2.watch.control.DescribeOperationRequest;
import io.gs2.watch.control.DescribeOperationResult;
import io.gs2.watch.control.DescribeServiceRequest;
import io.gs2.watch.control.DescribeServiceResult;
import io.gs2.watch.control.GetAlarmRequest;
import io.gs2.watch.control.GetAlarmResult;
import io.gs2.watch.control.GetMetricRequest;
import io.gs2.watch.control.GetMetricResult;
import io.gs2.watch.control.UpdateAlarmRequest;
import io.gs2.watch.control.UpdateAlarmResult;

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
	public CreateAlarmResult createAlarm(CreateAlarmRequest request) {
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
				Gs2Constant.ENDPOINT_HOST + "/alarm", 
				credential, 
				ENDPOINT,
				CreateAlarmRequest.Constant.MODULE, 
				CreateAlarmRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateAlarmResult.class);
	}
	
	/**
	 * アラーム一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return アラーム一覧
	 */
	public DescribeAlarmResult describeAlarm(DescribeAlarmRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/alarm";
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
				DescribeAlarmRequest.Constant.MODULE, 
				DescribeAlarmRequest.Constant.FUNCTION);
		return doRequest(get, DescribeAlarmResult.class);
	}

	/**
	 * アラームを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return アラーム
	 */
	public GetAlarmResult getAlarm(GetAlarmRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/alarm/" + request.getAlarmName(), 
				credential, 
				ENDPOINT,
				GetAlarmRequest.Constant.MODULE, 
				GetAlarmRequest.Constant.FUNCTION);
		return doRequest(get, GetAlarmResult.class);
	}

	/**
	 * アラームを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateAlarmResult updateAlarm(UpdateAlarmRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("expression", request.getExpression())
				.put("threshold", request.getThreshold())
				.put("notificationId", request.getNotificationId());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/alarm/" + request.getAlarmName(), 
				credential, 
				ENDPOINT,
				UpdateAlarmRequest.Constant.MODULE, 
				UpdateAlarmRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateAlarmResult.class);
	}

	/**
	 * アラームを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteAlarm(DeleteAlarmRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/alarm/" + request.getAlarmName(), 
				credential, 
				ENDPOINT,
				DeleteAlarmRequest.Constant.MODULE, 
				DeleteAlarmRequest.Constant.FUNCTION);
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
	public DescribeAlarmEventResult describeAlarmEvent(DescribeAlarmEventRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/alarm/" + request.getAlarmName() + "/event";
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
				DescribeAlarmEventRequest.Constant.MODULE, 
				DescribeAlarmEventRequest.Constant.FUNCTION);
		return doRequest(get, DescribeAlarmEventResult.class);
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
