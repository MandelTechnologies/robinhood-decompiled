package io.ktor.client.plugins;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequest2;
import io.ktor.http.URLProtocol2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* compiled from: HttpTimeout.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", m3645f = "HttpTimeout.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.HttpTimeout$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpTimeout3 extends ContinuationImpl7 implements Function3<HttpSend5, HttpRequest2, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ HttpTimeout $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpTimeout3(HttpTimeout httpTimeout, HttpClient httpClient, Continuation<? super HttpTimeout3> continuation) {
        super(3, continuation);
        this.$plugin = httpTimeout;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpSend5 httpSend5, HttpRequest2 httpRequest2, Continuation<? super HttpClientCall> continuation) {
        HttpTimeout3 httpTimeout3 = new HttpTimeout3(this.$plugin, this.$scope, continuation);
        httpTimeout3.L$0 = httpSend5;
        httpTimeout3.L$1 = httpRequest2;
        return httpTimeout3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        HttpSend5 httpSend5 = (HttpSend5) this.L$0;
        HttpRequest2 httpRequest2 = (HttpRequest2) this.L$1;
        if (!URLProtocol2.isWebsocket(httpRequest2.getUrl().getProtocol())) {
            httpRequest2.getBody();
            HttpTimeout.Companion companion = HttpTimeout.INSTANCE;
            HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) httpRequest2.getCapabilityOrNull(companion);
            if (httpTimeoutCapabilityConfiguration == null && this.$plugin.hasNotNullTimeouts()) {
                HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration2 = new HttpTimeout.HttpTimeoutCapabilityConfiguration(null, null, null, 7, null);
                httpRequest2.setCapability(companion, httpTimeoutCapabilityConfiguration2);
                httpTimeoutCapabilityConfiguration = httpTimeoutCapabilityConfiguration2;
            }
            if (httpTimeoutCapabilityConfiguration != null) {
                HttpTimeout httpTimeout = this.$plugin;
                HttpClient httpClient = this.$scope;
                Long l = httpTimeoutCapabilityConfiguration.get_connectTimeoutMillis();
                if (l == null) {
                    l = httpTimeout.connectTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setConnectTimeoutMillis(l);
                Long l2 = httpTimeoutCapabilityConfiguration.get_socketTimeoutMillis();
                if (l2 == null) {
                    l2 = httpTimeout.socketTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setSocketTimeoutMillis(l2);
                Long l3 = httpTimeoutCapabilityConfiguration.get_requestTimeoutMillis();
                if (l3 == null) {
                    l3 = httpTimeout.requestTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setRequestTimeoutMillis(l3);
                Long l4 = httpTimeoutCapabilityConfiguration.get_requestTimeoutMillis();
                if (l4 == null) {
                    l4 = httpTimeout.requestTimeoutMillis;
                }
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new HttpTimeout5(l4, httpRequest2, httpRequest2.getExecutionContext(), null), 3, null);
                    httpRequest2.getExecutionContext().invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            Job.DefaultImpls.cancel$default(jobLaunch$default, null, 1, null);
                        }
                    });
                }
            }
            this.L$0 = null;
            this.label = 2;
            Object objExecute = httpSend5.execute(httpRequest2, this);
            if (objExecute != coroutine_suspended) {
                return objExecute;
            }
        } else {
            this.L$0 = null;
            this.label = 1;
            Object objExecute2 = httpSend5.execute(httpRequest2, this);
            if (objExecute2 != coroutine_suspended) {
                return objExecute2;
            }
        }
        return coroutine_suspended;
    }
}
