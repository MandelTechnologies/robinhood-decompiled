package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.Events3;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLBuilder2;
import io.ktor.http.URLParser2;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLProtocol2;
import io.ktor.http.Url8;
import io.ktor.util.Attributes2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HttpRedirect.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lio/ktor/client/plugins/HttpRedirect;", "", "checkHttpMethod", "", "allowHttpsDowngrade", "(ZZ)V", "Config", "Plugin", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HttpRedirect {
    private final boolean allowHttpsDowngrade;
    private final boolean checkHttpMethod;

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Attributes2<HttpRedirect> key = new Attributes2<>("HttpRedirect");
    private static final Events3<HttpResponse> HttpResponseRedirect = new Events3<>();

    public /* synthetic */ HttpRedirect(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    private HttpRedirect(boolean z, boolean z2) {
        this.checkHttpMethod = z;
        this.allowHttpsDowngrade = z2;
    }

    /* compiled from: HttpRedirect.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lio/ktor/client/plugins/HttpRedirect$Config;", "", "<init>", "()V", "", "checkHttpMethod", "Z", "getCheckHttpMethod", "()Z", "setCheckHttpMethod", "(Z)V", "allowHttpsDowngrade", "getAllowHttpsDowngrade", "setAllowHttpsDowngrade", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Config {
        private boolean allowHttpsDowngrade;
        private boolean checkHttpMethod = true;

        public final boolean getCheckHttpMethod() {
            return this.checkHttpMethod;
        }

        public final boolean getAllowHttpsDowngrade() {
            return this.allowHttpsDowngrade;
        }
    }

    /* compiled from: HttpRedirect.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J!\u0010\u0013\u001a\u00020\u00032\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0016H\u0016J5\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m3636d2 = {"Lio/ktor/client/plugins/HttpRedirect$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpRedirect$Config;", "Lio/ktor/client/plugins/HttpRedirect;", "()V", "HttpResponseRedirect", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "getHttpResponseRedirect", "()Lio/ktor/events/EventDefinition;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", "scope", "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "handleCall", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "origin", "allowHttpsDowngrade", "", "client", "(Lio/ktor/client/plugins/Sender;Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/call/HttpClientCall;ZLio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: io.ktor.client.plugins.HttpRedirect$Plugin, reason: from kotlin metadata */
    public static final class Companion implements HttpClientPlugin<Config, HttpRedirect> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public Attributes2<HttpRedirect> getKey() {
            return HttpRedirect.key;
        }

        public final Events3<HttpResponse> getHttpResponseRedirect() {
            return HttpRedirect.HttpResponseRedirect;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpRedirect prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpRedirect(config.getCheckHttpMethod(), config.getAllowHttpsDowngrade(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpRedirect plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ((HttpSend) HttpClientPlugin2.plugin(scope, HttpSend.INSTANCE)).intercept(new HttpRedirect3(plugin, scope, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Type inference failed for: r3v6, types: [T, io.ktor.client.request.HttpRequestBuilder] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01ac -> B:35:0x01b2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object handleCall(HttpSend5 httpSend5, HttpRequest2 httpRequest2, HttpClientCall httpClientCall, boolean z, HttpClient httpClient, Continuation<? super HttpClientCall> continuation) {
            HttpRedirect2 httpRedirect2;
            Companion companion;
            String authority;
            Companion companion2;
            Ref.ObjectRef objectRef;
            URLProtocol uRLProtocol;
            HttpSend5 httpSend52;
            Ref.ObjectRef objectRef2;
            HttpRedirect2 httpRedirect22;
            boolean z2;
            HttpClient httpClient2;
            HttpRequest2 httpRequest22;
            String str;
            ?? httpRequest23;
            Object objExecute;
            if (continuation instanceof HttpRedirect2) {
                httpRedirect2 = (HttpRedirect2) continuation;
                int i = httpRedirect2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpRedirect2.label = i - Integer.MIN_VALUE;
                    companion = this;
                } else {
                    companion = this;
                    httpRedirect2 = new HttpRedirect2(companion, continuation);
                }
            }
            Object obj = httpRedirect2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = httpRedirect2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!HttpRedirect4.isRedirect(httpClientCall.getResponse().getStatus())) {
                    return httpClientCall;
                }
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = httpClientCall;
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                T t = httpRequest2;
                objectRef4.element = t;
                URLProtocol protocol = httpClientCall.getRequest().getUrl().getProtocol();
                authority = Url8.getAuthority(httpClientCall.getRequest().getUrl());
                companion2 = companion;
                objectRef = objectRef4;
                uRLProtocol = protocol;
                httpSend52 = httpSend5;
                objectRef2 = objectRef3;
                httpRedirect22 = httpRedirect2;
                z2 = z;
                httpClient2 = httpClient;
                httpRequest22 = t;
                httpClient2.getMonitor().raise(companion2.getHttpResponseRedirect(), ((HttpClientCall) objectRef2.element).getResponse());
                Headers headers = ((HttpClientCall) objectRef2.element).getResponse().getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                str = headers.get(httpHeaders.getLocation());
                HttpRedirect4.LOGGER.trace("Received redirect response to " + str + " for request " + httpRequest22.getUrl());
                httpRequest23 = new HttpRequest2();
                httpRequest23.takeFromWithExecutionContext((HttpRequest2) objectRef.element);
                httpRequest23.getUrl().getParameters().clear();
                if (str != null) {
                }
                if (z2) {
                }
                if (!Intrinsics.areEqual(authority, URLBuilder2.getAuthority(httpRequest23.getUrl()))) {
                }
                objectRef.element = httpRequest23;
                httpRedirect22.L$0 = companion2;
                httpRedirect22.L$1 = httpSend52;
                httpRedirect22.L$2 = httpRequest22;
                httpRedirect22.L$3 = httpClient2;
                httpRedirect22.L$4 = objectRef2;
                httpRedirect22.L$5 = objectRef;
                httpRedirect22.L$6 = uRLProtocol;
                httpRedirect22.L$7 = authority;
                httpRedirect22.L$8 = objectRef2;
                httpRedirect22.Z$0 = z2;
                httpRedirect22.label = 1;
                objExecute = httpSend52.execute(httpRequest23, httpRedirect22);
                if (objExecute != coroutine_suspended) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = httpRedirect2.Z$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) httpRedirect2.L$8;
                String str2 = (String) httpRedirect2.L$7;
                URLProtocol uRLProtocol2 = (URLProtocol) httpRedirect2.L$6;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) httpRedirect2.L$5;
                Ref.ObjectRef objectRef7 = (Ref.ObjectRef) httpRedirect2.L$4;
                HttpClient httpClient3 = (HttpClient) httpRedirect2.L$3;
                HttpRequest2 httpRequest24 = (HttpRequest2) httpRedirect2.L$2;
                HttpSend5 httpSend53 = (HttpSend5) httpRedirect2.L$1;
                companion2 = (Companion) httpRedirect2.L$0;
                ResultKt.throwOnFailure(obj);
                authority = str2;
                HttpRequest2 httpRequest25 = httpRequest24;
                Ref.ObjectRef objectRef8 = objectRef6;
                uRLProtocol = uRLProtocol2;
                objectRef2 = objectRef7;
                HttpRedirect2 httpRedirect23 = httpRedirect2;
                boolean z4 = z3;
                HttpSend5 httpSend54 = httpSend53;
                T t2 = obj;
                objectRef5.element = t2;
                if (HttpRedirect4.isRedirect(((HttpClientCall) objectRef2.element).getResponse().getStatus())) {
                    return objectRef2.element;
                }
                z2 = z4;
                httpRedirect22 = httpRedirect23;
                httpClient2 = httpClient3;
                objectRef = objectRef8;
                httpSend52 = httpSend54;
                httpRequest22 = httpRequest25;
                httpClient2.getMonitor().raise(companion2.getHttpResponseRedirect(), ((HttpClientCall) objectRef2.element).getResponse());
                Headers headers2 = ((HttpClientCall) objectRef2.element).getResponse().getHeaders();
                HttpHeaders httpHeaders2 = HttpHeaders.INSTANCE;
                str = headers2.get(httpHeaders2.getLocation());
                HttpRedirect4.LOGGER.trace("Received redirect response to " + str + " for request " + httpRequest22.getUrl());
                httpRequest23 = new HttpRequest2();
                httpRequest23.takeFromWithExecutionContext((HttpRequest2) objectRef.element);
                httpRequest23.getUrl().getParameters().clear();
                if (str != null) {
                    URLParser2.takeFrom(httpRequest23.getUrl(), str);
                }
                if (z2 && URLProtocol2.isSecure(uRLProtocol) && !URLProtocol2.isSecure(httpRequest23.getUrl().getProtocol())) {
                    HttpRedirect4.LOGGER.trace("Can not redirect " + httpRequest22.getUrl() + " because of security downgrade");
                    return objectRef2.element;
                }
                if (!Intrinsics.areEqual(authority, URLBuilder2.getAuthority(httpRequest23.getUrl()))) {
                    httpRequest23.getHeaders().remove(httpHeaders2.getAuthorization());
                    HttpRedirect4.LOGGER.trace("Removing Authorization header from redirect for " + httpRequest22.getUrl());
                }
                objectRef.element = httpRequest23;
                httpRedirect22.L$0 = companion2;
                httpRedirect22.L$1 = httpSend52;
                httpRedirect22.L$2 = httpRequest22;
                httpRedirect22.L$3 = httpClient2;
                httpRedirect22.L$4 = objectRef2;
                httpRedirect22.L$5 = objectRef;
                httpRedirect22.L$6 = uRLProtocol;
                httpRedirect22.L$7 = authority;
                httpRedirect22.L$8 = objectRef2;
                httpRedirect22.Z$0 = z2;
                httpRedirect22.label = 1;
                objExecute = httpSend52.execute(httpRequest23, httpRedirect22);
                if (objExecute != coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef8 = objectRef;
                httpClient3 = httpClient2;
                z4 = z2;
                t2 = objExecute;
                httpRedirect23 = httpRedirect22;
                objectRef5 = objectRef2;
                httpSend54 = httpSend52;
                httpRequest25 = httpRequest22;
                objectRef5.element = t2;
                if (HttpRedirect4.isRedirect(((HttpClientCall) objectRef2.element).getResponse().getStatus())) {
                }
            }
        }
    }
}
