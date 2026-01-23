package com.mux.android.http;

import com.mux.android.http.HttpRequests4;
import com.robinhood.utils.http.ContentEncoding;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HttpClient.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0003\u0015\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/mux/android/http/HttpClient;", "", "network", "Lcom/mux/android/http/HttpClient$DeviceNetwork;", "backoffBaseTimeMs", "", "(Lcom/mux/android/http/HttpClient$DeviceNetwork;J)V", "call", "Lcom/mux/android/http/HttpClient$CallResult;", "request", "Lcom/mux/android/http/Request;", "(Lcom/mux/android/http/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callOnce", "Lcom/mux/android/http/Response;", "callWithBackoff", "retries", "", "(Lcom/mux/android/http/Request;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeBackoff", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CallResult", "Companion", "DeviceNetwork", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class HttpClient {
    private static final long CONNECTION_TIMEOUT_MS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long READ_TIMEOUT_MS;
    private static final long RETRY_DELAY_BASE_MS;
    private final long backoffBaseTimeMs;
    private final DeviceNetwork network;

    /* compiled from: HttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/mux/android/http/HttpClient$DeviceNetwork;", "", "isOnline", "", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface DeviceNetwork {
        boolean isOnline();
    }

    /* compiled from: HttpClient.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.mux.android.http.HttpClient", m3645f = "HttpClient.kt", m3646l = {50, 53, 56, 58, 64}, m3647m = "callWithBackoff")
    /* renamed from: com.mux.android.http.HttpClient$callWithBackoff$1 */
    static final class C57261 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C57261(Continuation<? super C57261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClient.this.callWithBackoff(null, 0, this);
        }
    }

    public HttpClient(DeviceNetwork network, long j) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.network = network;
        this.backoffBaseTimeMs = j;
    }

    public /* synthetic */ HttpClient(DeviceNetwork deviceNetwork, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNetwork, (i & 2) != 0 ? RETRY_DELAY_BASE_MS : j);
    }

    /* compiled from: HttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/mux/android/http/HttpClient$Companion;", "", "<init>", "()V", "", "CONNECTION_TIMEOUT_MS", "J", "getCONNECTION_TIMEOUT_MS", "()J", "READ_TIMEOUT_MS", "getREAD_TIMEOUT_MS", "", "MAX_REQUEST_RETRIES", "I", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getCONNECTION_TIMEOUT_MS() {
            return HttpClient.CONNECTION_TIMEOUT_MS;
        }

        public final long getREAD_TIMEOUT_MS() {
            return HttpClient.READ_TIMEOUT_MS;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        CONNECTION_TIMEOUT_MS = timeUnit.convert(30L, timeUnit2);
        READ_TIMEOUT_MS = timeUnit.convert(20L, timeUnit2);
        RETRY_DELAY_BASE_MS = timeUnit.convert(5L, timeUnit2);
    }

    public final Object call(HttpRequests3 httpRequests3, Continuation<? super CallResult> continuation) {
        return callWithBackoff$default(this, httpRequests3, 0, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        if (r2 == r4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callWithBackoff(HttpRequests3 httpRequests3, int i, Continuation<? super CallResult> continuation) {
        C57261 c57261;
        HttpRequests3 httpRequests32;
        HttpClient httpClient;
        int i2;
        Exception exc;
        HttpRequests3 httpRequests33;
        int i3;
        HttpClient httpClient2;
        HttpRequests3 httpRequests34;
        HttpClient httpClient3;
        HttpRequests4 httpRequests4;
        int code;
        int i4 = i;
        if (continuation instanceof C57261) {
            c57261 = (C57261) continuation;
            int i5 = c57261.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c57261.label = i5 - Integer.MIN_VALUE;
            } else {
                c57261 = new C57261(continuation);
            }
        }
        Object objCallWithBackoff$maybeRetry = c57261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c57261.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
            c57261.L$0 = this;
            httpRequests32 = httpRequests3;
            c57261.L$1 = httpRequests32;
            c57261.I$0 = i4;
            c57261.label = 1;
            if (maybeBackoff(i4, c57261) != coroutine_suspended) {
                httpClient = this;
            }
            return coroutine_suspended;
        }
        if (i6 == 1) {
            i4 = c57261.I$0;
            HttpRequests3 httpRequests35 = (HttpRequests3) c57261.L$1;
            httpClient = (HttpClient) c57261.L$0;
            ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
            httpRequests32 = httpRequests35;
        } else {
            if (i6 == 2) {
                ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
                return objCallWithBackoff$maybeRetry;
            }
            if (i6 == 3) {
                i2 = c57261.I$0;
                httpRequests34 = (HttpRequests3) c57261.L$1;
                httpClient3 = (HttpClient) c57261.L$0;
                try {
                    ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
                    i3 = i2;
                    try {
                        httpRequests4 = (HttpRequests4) objCallWithBackoff$maybeRetry;
                        code = httpRequests4.getStatus().getCode();
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    i3 = i2;
                }
                if (500 > code && code < 600) {
                    try {
                        CallResult callResult = new CallResult(httpRequests4, null, false, i3, 6, null);
                        i2 = i3;
                        c57261.L$0 = httpClient3;
                        c57261.L$1 = httpRequests34;
                        c57261.I$0 = i2;
                        c57261.label = 4;
                        objCallWithBackoff$maybeRetry = callWithBackoff$maybeRetry(httpClient3, httpRequests34, callResult, c57261);
                        if (objCallWithBackoff$maybeRetry != coroutine_suspended) {
                            httpRequests33 = httpRequests34;
                            httpClient2 = httpClient3;
                            return (CallResult) objCallWithBackoff$maybeRetry;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                    return coroutine_suspended;
                }
                try {
                    i3 = i3;
                    return new CallResult(httpRequests4, null, false, i3, 6, null);
                } catch (Exception e4) {
                    e = e4;
                    i3 = i3;
                }
                exc = e;
                httpRequests33 = httpRequests34;
                httpClient2 = httpClient3;
                CallResult callResult2 = new CallResult(null, exc, false, i3, 5, null);
                c57261.L$0 = null;
                c57261.L$1 = null;
                c57261.label = 5;
                objCallWithBackoff$maybeRetry = callWithBackoff$maybeRetry(httpClient2, httpRequests33, callResult2, c57261);
            } else {
                if (i6 != 4) {
                    if (i6 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
                    return (CallResult) objCallWithBackoff$maybeRetry;
                }
                i2 = c57261.I$0;
                httpRequests33 = (HttpRequests3) c57261.L$1;
                httpClient2 = (HttpClient) c57261.L$0;
                try {
                    ResultKt.throwOnFailure(objCallWithBackoff$maybeRetry);
                    return (CallResult) objCallWithBackoff$maybeRetry;
                } catch (Exception e5) {
                    exc = e5;
                    i3 = i2;
                }
            }
        }
        int i7 = i4;
        if (!httpClient.network.isOnline()) {
            CallResult callResult3 = new CallResult(null, null, true, i7, 3, null);
            c57261.L$0 = null;
            c57261.L$1 = null;
            c57261.label = 2;
            Object objCallWithBackoff$maybeRetry2 = callWithBackoff$maybeRetry(httpClient, httpRequests32, callResult3, c57261);
            if (objCallWithBackoff$maybeRetry2 != coroutine_suspended) {
                return objCallWithBackoff$maybeRetry2;
            }
        } else {
            i2 = i7;
            try {
                c57261.L$0 = httpClient;
                c57261.L$1 = httpRequests32;
                c57261.I$0 = i2;
                c57261.label = 3;
                Object objCallOnce = httpClient.callOnce(httpRequests32, c57261);
                if (objCallOnce != coroutine_suspended) {
                    httpRequests34 = httpRequests32;
                    httpClient3 = httpClient;
                    objCallWithBackoff$maybeRetry = objCallOnce;
                    i3 = i2;
                    httpRequests4 = (HttpRequests4) objCallWithBackoff$maybeRetry;
                    code = httpRequests4.getStatus().getCode();
                    if (500 > code) {
                    }
                    i3 = i3;
                    return new CallResult(httpRequests4, null, false, i3, 6, null);
                }
            } catch (Exception e6) {
                exc = e6;
                httpRequests33 = httpRequests32;
                i3 = i2;
                httpClient2 = httpClient;
            }
        }
        return coroutine_suspended;
    }

    static /* synthetic */ Object callWithBackoff$default(HttpClient httpClient, HttpRequests3 httpRequests3, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return httpClient.callWithBackoff(httpRequests3, i, continuation);
    }

    private static final Object callWithBackoff$maybeRetry(HttpClient httpClient, HttpRequests3 httpRequests3, CallResult callResult, Continuation<? super CallResult> continuation) {
        return callResult.getRetries() < 4 ? httpClient.callWithBackoff(httpRequests3, callResult.getRetries() + 1, continuation) : callResult;
    }

    private final Object maybeBackoff(int i, Continuation<? super Unit> continuation) {
        if (i > 0) {
            Object objDelay = DelayKt.delay((long) ((1 + (Math.pow(2.0d, i - 1) * Math.random())) * this.backoffBaseTimeMs), continuation);
            return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/mux/android/http/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.mux.android.http.HttpClient$callOnce$2", m3645f = "HttpClient.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.mux.android.http.HttpClient$callOnce$2 */
    static final class C57252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpRequests4>, Object> {
        final /* synthetic */ HttpRequests3 $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C57252(HttpRequests3 httpRequests3, Continuation<? super C57252> continuation) {
            super(2, continuation);
            this.$request = httpRequests3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C57252(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpRequests4> continuation) {
            return ((C57252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [T, java.net.HttpURLConnection, java.net.URLConnection] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            byte[] body;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            try {
                List<String> list = this.$request.getHeaders().get("Content-Encoding");
                byte[] bArr = null;
                boolean zAreEqual = Intrinsics.areEqual(list != null ? (String) CollectionsKt.last((List) list) : null, ContentEncoding.GZIP);
                if (this.$request.getBody() != null && zAreEqual) {
                    body = HttpRequests.gzip(this.$request.getBody());
                } else {
                    body = this.$request.getBody();
                }
                URLConnection uRLConnectionOpenConnection = this.$request.getUrl().openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                ?? r2 = (HttpURLConnection) uRLConnectionOpenConnection;
                HttpRequests3 httpRequests3 = this.$request;
                Companion companion = HttpClient.INSTANCE;
                r2.setReadTimeout((int) companion.getREAD_TIMEOUT_MS());
                r2.setConnectTimeout((int) companion.getCONNECTION_TIMEOUT_MS());
                r2.setRequestMethod(httpRequests3.getMethod());
                r2.setDoOutput(body != null);
                r2.setDoInput(true);
                for (Map.Entry<String, List<String>> entry : httpRequests3.getHeaders().entrySet()) {
                    Iterator<T> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        r2.setRequestProperty(entry.getKey(), (String) it.next());
                    }
                }
                String contentType = httpRequests3.getContentType();
                if (contentType != null && contentType.length() > 0) {
                    r2.setRequestProperty("Content-Type", contentType);
                }
                objectRef.element = r2;
                if (body != null) {
                    OutputStream outputStream = r2.getOutputStream();
                    try {
                        outputStream.write(body);
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(outputStream, null);
                    } finally {
                    }
                }
                ((HttpURLConnection) objectRef.element).connect();
                InputStream inputStream = ((HttpURLConnection) objectRef.element).getInputStream();
                if (inputStream != null) {
                    try {
                        byte[] bytes = IOStreams.readBytes(inputStream);
                        Closeable.closeFinally(inputStream, null);
                        bArr = bytes;
                    } finally {
                    }
                }
                HttpRequests3 httpRequests32 = this.$request;
                HttpRequests4.StatusLine statusLine = new HttpRequests4.StatusLine(((HttpURLConnection) objectRef.element).getResponseCode(), ((HttpURLConnection) objectRef.element).getResponseMessage());
                Map<String, List<String>> headerFields = ((HttpURLConnection) objectRef.element).getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                HttpRequests4 httpRequests4 = new HttpRequests4(httpRequests32, statusLine, headerFields, bArr);
                HttpURLConnection httpURLConnection = (HttpURLConnection) objectRef.element;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return httpRequests4;
            } catch (Throwable th) {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) objectRef.element;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
    }

    private final Object callOnce(HttpRequests3 httpRequests3, Continuation<? super HttpRequests4> continuation) throws Exception {
        return BuildersKt.withContext(Dispatchers.getIO(), new C57252(httpRequests3, null), continuation);
    }

    /* compiled from: HttpClient.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006\""}, m3636d2 = {"Lcom/mux/android/http/HttpClient$CallResult;", "", "Lcom/mux/android/http/Response;", "response", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "offlineForCall", "", "retries", "<init>", "(Lcom/mux/android/http/Response;Ljava/lang/Exception;ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/mux/android/http/Response;", "getResponse", "()Lcom/mux/android/http/Response;", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "Z", "getOfflineForCall", "()Z", "I", "getRetries", "getSuccessful", "successful", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CallResult {
        private final Exception exception;
        private final boolean offlineForCall;
        private final HttpRequests4 response;
        private final int retries;

        public CallResult() {
            this(null, null, false, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallResult)) {
                return false;
            }
            CallResult callResult = (CallResult) other;
            return Intrinsics.areEqual(this.response, callResult.response) && Intrinsics.areEqual(this.exception, callResult.exception) && this.offlineForCall == callResult.offlineForCall && this.retries == callResult.retries;
        }

        public int hashCode() {
            HttpRequests4 httpRequests4 = this.response;
            int iHashCode = (httpRequests4 == null ? 0 : httpRequests4.hashCode()) * 31;
            Exception exc = this.exception;
            return ((((iHashCode + (exc != null ? exc.hashCode() : 0)) * 31) + Boolean.hashCode(this.offlineForCall)) * 31) + Integer.hashCode(this.retries);
        }

        public String toString() {
            return "CallResult(response=" + this.response + ", exception=" + this.exception + ", offlineForCall=" + this.offlineForCall + ", retries=" + this.retries + ')';
        }

        public CallResult(HttpRequests4 httpRequests4, Exception exc, boolean z, int i) {
            this.response = httpRequests4;
            this.exception = exc;
            this.offlineForCall = z;
            this.retries = i;
        }

        public /* synthetic */ CallResult(HttpRequests4 httpRequests4, Exception exc, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : httpRequests4, (i2 & 2) != 0 ? null : exc, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
        }

        public final HttpRequests4 getResponse() {
            return this.response;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final boolean getSuccessful() {
            if (this.exception == null) {
                HttpRequests4 httpRequests4 = this.response;
                if ((httpRequests4 != null ? httpRequests4.getSuccessful() : false) && !this.offlineForCall) {
                    return true;
                }
            }
            return false;
        }
    }
}
