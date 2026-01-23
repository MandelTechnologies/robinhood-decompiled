package io.ktor.client.call;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import io.ktor.client.HttpClient;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequest6;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponse2;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.OutgoingContent2;
import io.ktor.util.Attributes;
import io.ktor.util.Attributes2;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvm;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: HttpClientCall.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00168\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\u001b\u0010\u001aR\u001a\u0010+\u001a\u00020*8\u0014X\u0094D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, m3636d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", SduiFeatureDiscovery3.INFO_TAG, "", "bodyNullable", "(Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", "response", "", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequest;", "<set-?>", "request", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "setRequest", "(Lio/ktor/client/request/HttpRequest;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "Companion", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class HttpClientCall implements CoroutineScope {
    private static final Attributes2<Object> CustomResponse = new Attributes2<>("CustomResponse");
    private static final /* synthetic */ AtomicIntegerFieldUpdater received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, AnalyticsStrings.PUSH_NOTIF_EVENT_RECEIVED);
    private final boolean allowDoubleReceive;
    private final HttpClient client;
    private volatile /* synthetic */ int received;
    protected HttpRequest request;
    protected HttpResponse response;

    /* compiled from: HttpClientCall.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.call.HttpClientCall", m3645f = "HttpClientCall.kt", m3646l = {86, 89}, m3647m = "bodyNullable")
    /* renamed from: io.ktor.client.call.HttpClientCall$bodyNullable$1 */
    static final class C455601 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C455601(Continuation<? super C455601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.bodyNullable(null, this);
        }
    }

    protected Object getResponseContent(Continuation<? super ByteReadChannelJVM> continuation) {
        return getResponseContent$suspendImpl(this, continuation);
    }

    public HttpClientCall(HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.received = 0;
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    protected final void setRequest(HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    protected final void setResponse(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClientCall(HttpClient client, HttpRequestData requestData, HttpRequest6 responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        if (responseData.getBody() instanceof ByteReadChannelJVM) {
            return;
        }
        getAttributes().put(CustomResponse, responseData.getBody());
    }

    protected boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, Continuation<? super ByteReadChannelJVM> continuation) {
        return httpClientCall.getResponse().getContent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bodyNullable(TypeInfo typeInfo, Continuation<Object> continuation) {
        C455601 c455601;
        HttpClientCall httpClientCall;
        HttpClientCall httpClientCall2;
        Object response;
        if (continuation instanceof C455601) {
            c455601 = (C455601) continuation;
            int i = c455601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455601.label = i - Integer.MIN_VALUE;
            } else {
                c455601 = new C455601(continuation);
            }
        }
        Object orNull = c455601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orNull);
            try {
                if (!TypeInfoJvm.instanceOf(getResponse(), typeInfo.getType())) {
                    if (!getAllowDoubleReceive() && !received$FU.compareAndSet(this, 0, 1)) {
                        throw new HttpClientCall2(this);
                    }
                    orNull = getAttributes().getOrNull(CustomResponse);
                    if (orNull == null) {
                        c455601.L$0 = this;
                        c455601.L$1 = typeInfo;
                        c455601.label = 1;
                        orNull = getResponseContent(c455601);
                    }
                    httpClientCall2 = this;
                } else {
                    HttpResponse response2 = getResponse();
                    HttpResponse2.complete(getResponse());
                    return response2;
                }
            } catch (Throwable th) {
                th = th;
                httpClientCall = this;
                CoroutineScope2.cancel(httpClientCall.getResponse(), "Receive failed", th);
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeInfo = (TypeInfo) c455601.L$1;
                httpClientCall = (HttpClientCall) c455601.L$0;
                try {
                    ResultKt.throwOnFailure(orNull);
                    response = ((HttpResponseContainer) orNull).getResponse();
                    if (!Intrinsics.areEqual(response, OutgoingContent2.INSTANCE)) {
                        response = null;
                    }
                    if (response != null && !TypeInfoJvm.instanceOf(response, typeInfo.getType())) {
                        throw new HttpClientCall3(httpClientCall.getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                    }
                    return response;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        CoroutineScope2.cancel(httpClientCall.getResponse(), "Receive failed", th);
                        throw th;
                    } finally {
                        HttpResponse2.complete(httpClientCall.getResponse());
                    }
                }
            }
            typeInfo = (TypeInfo) c455601.L$1;
            httpClientCall2 = (HttpClientCall) c455601.L$0;
            try {
                ResultKt.throwOnFailure(orNull);
            } catch (Throwable th3) {
                th = th3;
                httpClientCall = httpClientCall2;
                CoroutineScope2.cancel(httpClientCall.getResponse(), "Receive failed", th);
                throw th;
            }
        }
        HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, orNull);
        HttpResponsePipeline responsePipeline = httpClientCall2.client.getResponsePipeline();
        c455601.L$0 = httpClientCall2;
        c455601.L$1 = typeInfo;
        c455601.label = 2;
        orNull = responsePipeline.execute(httpClientCall2, httpResponseContainer, c455601);
        if (orNull != coroutine_suspended) {
            httpClientCall = httpClientCall2;
            response = ((HttpResponseContainer) orNull).getResponse();
            if (!Intrinsics.areEqual(response, OutgoingContent2.INSTANCE)) {
            }
            if (response != null) {
                throw new HttpClientCall3(httpClientCall.getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
            }
            return response;
        }
        return coroutine_suspended;
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + ']';
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        setResponse(response);
    }
}
