package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRedirect;
import io.ktor.client.request.HttpRequest2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpRedirect.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "context", "Lio/ktor/client/request/HttpRequestBuilder;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", m3645f = "HttpRedirect.kt", m3646l = {64, 69}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.HttpRedirect$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpRedirect3 extends ContinuationImpl7 implements Function3<HttpSend5, HttpRequest2, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ HttpRedirect $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRedirect3(HttpRedirect httpRedirect, HttpClient httpClient, Continuation<? super HttpRedirect3> continuation) {
        super(3, continuation);
        this.$plugin = httpRedirect;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpSend5 httpSend5, HttpRequest2 httpRequest2, Continuation<? super HttpClientCall> continuation) {
        HttpRedirect3 httpRedirect3 = new HttpRedirect3(this.$plugin, this.$scope, continuation);
        httpRedirect3.L$0 = httpSend5;
        httpRedirect3.L$1 = httpRequest2;
        return httpRedirect3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        HttpRequest2 httpRequest2;
        HttpSend5 httpSend5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HttpSend5 httpSend52 = (HttpSend5) this.L$0;
            httpRequest2 = (HttpRequest2) this.L$1;
            this.L$0 = httpSend52;
            this.L$1 = httpRequest2;
            this.label = 1;
            Object objExecute = httpSend52.execute(httpRequest2, this);
            if (objExecute != coroutine_suspended) {
                httpSend5 = httpSend52;
                obj = objExecute;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        httpRequest2 = (HttpRequest2) this.L$1;
        HttpSend5 httpSend53 = (HttpSend5) this.L$0;
        ResultKt.throwOnFailure(obj);
        httpSend5 = httpSend53;
        HttpRequest2 httpRequest22 = httpRequest2;
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$plugin.checkHttpMethod && !HttpRedirect4.ALLOWED_FOR_REDIRECT.contains(httpClientCall.getRequest().getMethod())) {
            return httpClientCall;
        }
        HttpRedirect.Companion companion = HttpRedirect.INSTANCE;
        boolean z = this.$plugin.allowHttpsDowngrade;
        HttpClient httpClient = this.$scope;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objHandleCall = companion.handleCall(httpSend5, httpRequest22, httpClientCall, z, httpClient, this);
        return objHandleCall == coroutine_suspended ? coroutine_suspended : objHandleCall;
    }
}
