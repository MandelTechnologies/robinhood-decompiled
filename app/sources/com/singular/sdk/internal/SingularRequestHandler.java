package com.singular.sdk.internal;

import com.robinhood.utils.http.ContentEncoding;
import com.robinhood.utils.http.Headers;
import com.singular.sdk.internal.Api;
import com.singular.sdk.internal.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
class SingularRequestHandler {
    private static final SingularLog logger = SingularLog.getLogger(SingularRequestHandler.class.getSimpleName());
    static int counter = 0;
    private static final String[] POST_PAYLOAD_PARAMS_KEYS = {Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, Constants.GLOBAL_PROPERTIES_KEY, Constants.RequestBody.INSTALL_REFERRER_KEY};

    SingularRequestHandler() {
    }

    static boolean makeRequest(SingularInstance singularInstance, String str, Map<String, String> map, long j, Api.OnApiCallback onApiCallback) throws IOException {
        long currentTimeMillis = Utils.getCurrentTimeMillis();
        int i = counter + 1;
        counter = i;
        SingularLog singularLog = logger;
        singularLog.debug("---------------------------> /%d", Integer.valueOf(i));
        singularLog.debug("url = %s", str);
        singularLog.debug("params = %s", map);
        HttpURLConnection httpURLConnectionBuildRequest = buildRequest(singularInstance, str, map, j);
        try {
            try {
                boolean zSendRequest = sendRequest(singularInstance, onApiCallback, currentTimeMillis, i, httpURLConnectionBuildRequest);
                if (httpURLConnectionBuildRequest != null) {
                    httpURLConnectionBuildRequest.disconnect();
                }
                return zSendRequest;
            } catch (IOException e) {
                throw e;
            }
        } finally {
        }
    }

    static HttpURLConnection buildRequest(SingularInstance singularInstance, String str, Map<String, String> map, long j) throws IOException {
        HttpURLConnection httpConnection;
        Map<String, String> postPayloadParams = getPostPayloadParams(map);
        String str2 = str + "?" + appendHash(getQueryString(singularInstance, map, j), singularInstance.getSingularConfig().secret);
        URL url = new URL(str2);
        if (url.getProtocol().equalsIgnoreCase(com.adjust.sdk.Constants.SCHEME)) {
            httpConnection = getHttpsConnection(url);
        } else {
            httpConnection = getHttpConnection(url);
        }
        setDefaultConnectionProperties(httpConnection);
        setPayloadForRequest(httpConnection, postPayloadParams, singularInstance.getSingularConfig().secret);
        logger.debug("__API__ %s %s", httpConnection.getRequestMethod(), str2);
        return httpConnection;
    }

    static boolean sendRequest(SingularInstance singularInstance, Api.OnApiCallback onApiCallback, long j, int i, HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String response = readResponse(httpURLConnection);
        httpURLConnection.disconnect();
        long currentTimeMillis = Utils.getCurrentTimeMillis() - j;
        SingularLog singularLog = logger;
        singularLog.debug("%d %s", Integer.valueOf(responseCode), response);
        singularLog.debug("<--------------------------- /%d - took %dms", Integer.valueOf(i), Long.valueOf(currentTimeMillis));
        return onApiCallback.handle(singularInstance, responseCode, response);
    }

    private static String readResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStreamReader inputStreamReader;
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = httpURLConnection.getInputStream();
        if (httpURLConnection.getContentEncoding() != null && httpURLConnection.getContentEncoding().equals(ContentEncoding.GZIP)) {
            inputStreamReader = new InputStreamReader(new GZIPInputStream(inputStream));
        } else {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                stringBuffer.append(line);
            } else {
                return stringBuffer.toString();
            }
        }
    }

    private static Map<String, String> getPostPayloadParams(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (String str : POST_PAYLOAD_PARAMS_KEYS) {
            if (map.containsKey(str)) {
                map2.put(str, map.get(str));
                map.remove(str);
            }
        }
        return map2;
    }

    private static void setPayloadForRequest(HttpURLConnection httpURLConnection, Map<String, String> map, String str) throws IOException {
        if (httpURLConnection == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null && map.size() > 0) {
                String string2 = new JSONObject((Map<?, ?>) map).toString();
                String strSha1Hash = Utils.sha1Hash(string2, str);
                jSONObject.put("payload", string2);
                jSONObject.put("signature", strSha1Hash);
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.close();
        } catch (IOException | JSONException e) {
            logger.error("Error in JSON parsing or I/O ", e);
        }
    }

    private static void setDefaultConnectionProperties(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty(Headers.USER_AGENT, Constants.HTTP_USER_AGENT);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
    }

    private static String getQueryString(SingularInstance singularInstance, Map<String, String> map, long j) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            map = new HashMap<>();
        }
        TreeMap treeMap = new TreeMap(map);
        treeMap.put("rt", "json");
        treeMap.put("lag", String.valueOf(Utils.lagSince(j)));
        treeMap.put("c", Utils.getConnectionType(singularInstance.getContext()));
        if ((!treeMap.containsKey(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY) || Utils.isEmptyOrNull((String) treeMap.get(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY))) && !Utils.isEmptyOrNull(singularInstance.getDeviceInfo().oaid)) {
            treeMap.put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, singularInstance.getDeviceInfo().oaid);
            treeMap.put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.OAID_KEYSPACE_VALUE);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String str = (String) entry.getValue();
            String strEncode2 = str != null ? URLEncoder.encode(str, "UTF-8") : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strEncode);
            sb.append("=");
            sb.append(strEncode2);
        }
        return sb.toString();
    }

    private static String appendHash(String str, String str2) {
        if (str == null) {
            return "";
        }
        String strSha1Hash = Utils.sha1Hash(String.format("?%s", str), str2);
        logger.debug("hash = %s", strSha1Hash);
        if (Utils.isEmptyOrNull(strSha1Hash)) {
            return str;
        }
        return str + "&h=" + strSha1Hash;
    }

    public static HttpURLConnection getHttpConnection(URL url) throws IOException {
        if (url != null) {
            return (HttpURLConnection) url.openConnection();
        }
        return null;
    }

    public static HttpURLConnection getHttpsConnection(URL url) throws IOException {
        if (url == null) {
            return null;
        }
        return (HttpsURLConnection) url.openConnection();
    }
}
