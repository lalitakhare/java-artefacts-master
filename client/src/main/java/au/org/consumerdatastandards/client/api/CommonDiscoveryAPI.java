/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.api;

import au.org.consumerdatastandards.client.*;
import au.org.consumerdatastandards.client.model.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class CommonDiscoveryAPI {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(CommonDiscoveryAPI.class);

    private ApiClient apiClient;

    public CommonDiscoveryAPI() {
        this(new ApiClient());
    }

    public CommonDiscoveryAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOutages
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getOutagesCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/discovery/outages";

        LOGGER.trace("Building Call for getOutages with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOutagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        return getOutagesCall(_callback);
    }

    /**
     * Get Outages
     * Obtain a list of scheduled outages for the implementation
     * @return ResponseDiscoveryOutagesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public ResponseDiscoveryOutagesList getOutages() throws ApiException {

        LOGGER.trace("getOutages");

        ApiResponse<ResponseDiscoveryOutagesList> resp = getOutagesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Outages
     * Obtain a list of scheduled outages for the implementation
     * @return ApiResponse&lt;ResponseDiscoveryOutagesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ResponseDiscoveryOutagesList> getOutagesWithHttpInfo() throws ApiException {
        okhttp3.Call call = getOutagesValidateBeforeCall(null);
        Type returnType = new TypeToken<ResponseDiscoveryOutagesList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Outages (asynchronously)
     * Obtain a list of scheduled outages for the implementation
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getOutagesAsync(final ApiCallback<ResponseDiscoveryOutagesList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getOutages");

        okhttp3.Call call = getOutagesValidateBeforeCall(_callback);
        Type returnType = new TypeToken<ResponseDiscoveryOutagesList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getStatus
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getStatusCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/discovery/status";

        LOGGER.trace("Building Call for getStatus with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        return getStatusCall(_callback);
    }

    /**
     * Get Status
     * Obtain a health check status for the implementation
     * @return CommonDiscoveryStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public CommonDiscoveryStatus getStatus() throws ApiException {

        LOGGER.trace("getStatus");

        ApiResponse<CommonDiscoveryStatus> resp = getStatusWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Status
     * Obtain a health check status for the implementation
     * @return ApiResponse&lt;CommonDiscoveryStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CommonDiscoveryStatus> getStatusWithHttpInfo() throws ApiException {
        okhttp3.Call call = getStatusValidateBeforeCall(null);
        Type returnType = new TypeToken<CommonDiscoveryStatus>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Status (asynchronously)
     * Obtain a health check status for the implementation
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *   <tr><td> ResponseCode.OK </td><td> Success </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getStatusAsync(final ApiCallback<CommonDiscoveryStatus> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getStatus");

        okhttp3.Call call = getStatusValidateBeforeCall(_callback);
        Type returnType = new TypeToken<CommonDiscoveryStatus>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }

    private void addQueryParam(List<Pair> queryParams, String paramName, Object paramValue) {
        if (paramValue != null) {
            LOGGER.trace("Adding query parameter of {} with value of {}", paramName, paramValue);
            queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        }
    }
}
