package io.ktor.client.engine.android;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequest6;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.Headers;
import io.ktor.http.Headers4;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.DateJvm;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AndroidClientEngine.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m3636d2 = {"Lio/ktor/client/engine/android/AndroidClientEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "config", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "(Lio/ktor/client/engine/android/AndroidEngineConfig;)V", "getConfig", "()Lio/ktor/client/engine/android/AndroidEngineConfig;", "supportedCapabilities", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "execute", "Lio/ktor/client/request/HttpResponseData;", WebsocketGatewayConstants.DATA_KEY, "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProxyAwareConnection", "Ljava/net/HttpURLConnection;", "urlString", "", "ktor-client-android"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AndroidClientEngine extends HttpClientEngineBase {
    private final AndroidEngineConfig config;
    private final Set<HttpClientEngineCapability<?>> supportedCapabilities;

    /* compiled from: AndroidClientEngine.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.engine.android.AndroidClientEngine", m3645f = "AndroidClientEngine.kt", m3646l = {35, 79, 82}, m3647m = "execute")
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngine$execute$1 */
    static final class C455651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C455651(Continuation<? super C455651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngine.this.execute(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(AndroidEngineConfig config) {
        super("ktor-android");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = SetsKt.setOf(HttpTimeout.INSTANCE);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public AndroidEngineConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(HttpRequestData httpRequest4, Continuation<? super HttpRequest6> continuation) throws IOException {
        C455651 c455651;
        final HttpRequestData httpRequest42;
        Object objCallContext;
        AndroidClientEngine androidClientEngine;
        final CoroutineContext coroutineContext;
        final GMTDate date4GMTDate$default;
        final HttpURLConnection proxyAwareConnection;
        Unit unit;
        HttpRequestData httpRequest43;
        CoroutineContext coroutineContext2;
        GMTDate date4;
        HttpURLConnection httpURLConnection;
        if (continuation instanceof C455651) {
            c455651 = (C455651) continuation;
            int i = c455651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455651.label = i - Integer.MIN_VALUE;
            } else {
                c455651 = new C455651(continuation);
            }
        }
        Object obj = c455651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c455651.L$0 = this;
            httpRequest42 = httpRequest4;
            c455651.L$1 = httpRequest42;
            c455651.label = 1;
            objCallContext = UtilsKt.callContext(c455651);
            if (objCallContext != coroutine_suspended) {
                androidClientEngine = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            httpURLConnection = (HttpURLConnection) c455651.L$3;
            date4 = (GMTDate) c455651.L$2;
            coroutineContext2 = (CoroutineContext) c455651.L$1;
            httpRequest43 = (HttpRequestData) c455651.L$0;
            ResultKt.throwOnFailure(obj);
            proxyAwareConnection = httpURLConnection;
            date4GMTDate$default = date4;
            coroutineContext = coroutineContext2;
            httpRequest42 = httpRequest43;
            Function1<HttpURLConnection, HttpRequest6> function1 = new Function1<HttpURLConnection, HttpRequest6>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final HttpRequest6 invoke(HttpURLConnection current) throws IOException {
                    HttpStatusCode httpStatusCodeFromValue;
                    String lowerCase;
                    Intrinsics.checkNotNullParameter(current, "current");
                    int responseCode = current.getResponseCode();
                    String responseMessage = current.getResponseMessage();
                    if (responseMessage != null) {
                        httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                    } else {
                        httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                    }
                    HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                    ByteReadChannelJVM byteReadChannelJVMContent = AndroidURLConnectionUtils.content(current, coroutineContext, httpRequest42);
                    Map<String, List<String>> headerFields = current.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
                    Iterator<T> it = headerFields.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String key = (String) entry.getKey();
                        if (key != null) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                            lowerCase = key.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                        }
                        linkedHashMap.put(lowerCase, entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!StringsKt.isBlank((CharSequence) entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    HttpProtocolVersion http_1_1 = HttpProtocolVersion.INSTANCE.getHTTP_1_1();
                    return new HttpRequest6(httpStatusCode, date4GMTDate$default, new Headers4(linkedHashMap2), http_1_1, byteReadChannelJVMContent, coroutineContext);
                }
            };
            c455651.L$0 = null;
            c455651.L$1 = null;
            c455651.L$2 = null;
            c455651.L$3 = null;
            c455651.label = 3;
            Object objTimeoutAwareConnection = AndroidURLConnectionUtils.timeoutAwareConnection(proxyAwareConnection, httpRequest42, function1, c455651);
            return objTimeoutAwareConnection == coroutine_suspended ? coroutine_suspended : objTimeoutAwareConnection;
        }
        HttpRequestData httpRequest44 = (HttpRequestData) c455651.L$1;
        androidClientEngine = (AndroidClientEngine) c455651.L$0;
        ResultKt.throwOnFailure(obj);
        objCallContext = obj;
        httpRequest42 = httpRequest44;
        coroutineContext = (CoroutineContext) objCallContext;
        date4GMTDate$default = DateJvm.GMTDate$default(null, 1, null);
        String string2 = httpRequest42.getUrl().getUrlString();
        OutgoingContent body = httpRequest42.getBody();
        Headers headers = httpRequest42.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getContentLength());
        Long lBoxLong = str != null ? boxing.boxLong(Long.parseLong(str)) : body.getContentLength();
        proxyAwareConnection = androidClientEngine.getProxyAwareConnection(string2);
        proxyAwareConnection.setConnectTimeout(androidClientEngine.getConfig().getConnectTimeout());
        proxyAwareConnection.setReadTimeout(androidClientEngine.getConfig().getSocketTimeout());
        AndroidURLConnectionUtils.setupTimeoutAttributes(proxyAwareConnection, httpRequest42);
        if (proxyAwareConnection instanceof HttpsURLConnection) {
            androidClientEngine.getConfig().getSslManager().invoke(proxyAwareConnection);
        }
        proxyAwareConnection.setRequestMethod(httpRequest42.getMethod().getValue());
        proxyAwareConnection.setUseCaches(false);
        proxyAwareConnection.setInstanceFollowRedirects(false);
        UtilsKt.mergeHeaders(httpRequest42.getHeaders(), body, new Function2<String, String, Unit>() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$connection$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str2, String str3) {
                invoke2(str2, str3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String key, String value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                proxyAwareConnection.addRequestProperty(key, value);
            }
        });
        androidClientEngine.getConfig().getRequestConfig().invoke(proxyAwareConnection);
        if (AndroidClientEngine3.METHODS_WITHOUT_BODY.contains(httpRequest42.getMethod())) {
            if (!(body instanceof OutgoingContent.NoContent)) {
                throw new IllegalStateException(("Request of type " + httpRequest42.getMethod() + " couldn't send a body with the [Android] engine.").toString());
            }
            Function1<HttpURLConnection, HttpRequest6> function12 = new Function1<HttpURLConnection, HttpRequest6>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final HttpRequest6 invoke(HttpURLConnection current) throws IOException {
                    HttpStatusCode httpStatusCodeFromValue;
                    String lowerCase;
                    Intrinsics.checkNotNullParameter(current, "current");
                    int responseCode = current.getResponseCode();
                    String responseMessage = current.getResponseMessage();
                    if (responseMessage != null) {
                        httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                    } else {
                        httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                    }
                    HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                    ByteReadChannelJVM byteReadChannelJVMContent = AndroidURLConnectionUtils.content(current, coroutineContext, httpRequest42);
                    Map<String, List<String>> headerFields = current.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
                    Iterator<T> it = headerFields.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String key = (String) entry.getKey();
                        if (key != null) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                            lowerCase = key.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                        }
                        linkedHashMap.put(lowerCase, entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!StringsKt.isBlank((CharSequence) entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    HttpProtocolVersion http_1_1 = HttpProtocolVersion.INSTANCE.getHTTP_1_1();
                    return new HttpRequest6(httpStatusCode, date4GMTDate$default, new Headers4(linkedHashMap2), http_1_1, byteReadChannelJVMContent, coroutineContext);
                }
            };
            c455651.L$0 = null;
            c455651.L$1 = null;
            c455651.L$2 = null;
            c455651.L$3 = null;
            c455651.label = 3;
            Object objTimeoutAwareConnection2 = AndroidURLConnectionUtils.timeoutAwareConnection(proxyAwareConnection, httpRequest42, function12, c455651);
            if (objTimeoutAwareConnection2 == coroutine_suspended) {
            }
        } else {
            if (lBoxLong == null && proxyAwareConnection.getRequestProperty(httpHeaders.getTransferEncoding()) == null) {
                proxyAwareConnection.addRequestProperty(httpHeaders.getTransferEncoding(), "chunked");
            }
            if (lBoxLong != null) {
                proxyAwareConnection.setFixedLengthStreamingMode(lBoxLong.longValue());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                proxyAwareConnection.setChunkedStreamingMode(0);
            }
            proxyAwareConnection.setDoOutput(true);
            OutputStream outputStream = proxyAwareConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "outputStream");
            c455651.L$0 = httpRequest42;
            c455651.L$1 = coroutineContext;
            c455651.L$2 = date4GMTDate$default;
            c455651.L$3 = proxyAwareConnection;
            c455651.label = 2;
            if (AndroidClientEngine3.writeTo(body, outputStream, coroutineContext, c455651) != coroutine_suspended) {
                httpRequest43 = httpRequest42;
                coroutineContext2 = coroutineContext;
                date4 = date4GMTDate$default;
                httpURLConnection = proxyAwareConnection;
                proxyAwareConnection = httpURLConnection;
                date4GMTDate$default = date4;
                coroutineContext = coroutineContext2;
                httpRequest42 = httpRequest43;
                Function1<HttpURLConnection, HttpRequest6> function122 = new Function1<HttpURLConnection, HttpRequest6>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final HttpRequest6 invoke(HttpURLConnection current) throws IOException {
                        HttpStatusCode httpStatusCodeFromValue;
                        String lowerCase;
                        Intrinsics.checkNotNullParameter(current, "current");
                        int responseCode = current.getResponseCode();
                        String responseMessage = current.getResponseMessage();
                        if (responseMessage != null) {
                            httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                        } else {
                            httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                        }
                        HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                        ByteReadChannelJVM byteReadChannelJVMContent = AndroidURLConnectionUtils.content(current, coroutineContext, httpRequest42);
                        Map<String, List<String>> headerFields = current.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
                        Iterator<T> it = headerFields.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String key = (String) entry.getKey();
                            if (key != null) {
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                Locale locale = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                                lowerCase = key.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                if (lowerCase == null) {
                                    lowerCase = "";
                                }
                            }
                            linkedHashMap.put(lowerCase, entry.getValue());
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            if (!StringsKt.isBlank((CharSequence) entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        HttpProtocolVersion http_1_1 = HttpProtocolVersion.INSTANCE.getHTTP_1_1();
                        return new HttpRequest6(httpStatusCode, date4GMTDate$default, new Headers4(linkedHashMap2), http_1_1, byteReadChannelJVMContent, coroutineContext);
                    }
                };
                c455651.L$0 = null;
                c455651.L$1 = null;
                c455651.L$2 = null;
                c455651.L$3 = null;
                c455651.label = 3;
                Object objTimeoutAwareConnection22 = AndroidURLConnectionUtils.timeoutAwareConnection(proxyAwareConnection, httpRequest42, function122, c455651);
                if (objTimeoutAwareConnection22 == coroutine_suspended) {
                }
            }
        }
    }

    private final HttpURLConnection getProxyAwareConnection(String urlString) throws IOException {
        URL url = new URL(urlString);
        Proxy proxy = getConfig().getProxy();
        URLConnection uRLConnectionOpenConnection = proxy != null ? url.openConnection(proxy) : null;
        if (uRLConnectionOpenConnection == null) {
            uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNullExpressionValue(uRLConnectionOpenConnection, "url.openConnection()");
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
