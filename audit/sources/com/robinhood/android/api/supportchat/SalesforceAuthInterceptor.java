package com.robinhood.android.api.supportchat;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.models.api.ApiSupportSalesforceToken;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: SalesforceAuthInterceptor.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SalesforceAuthInterceptor;", "Lokhttp3/Interceptor;", "salesforceChatTokenManager", "Ldagger/Lazy;", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "<init>", "(Ldagger/Lazy;)V", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "Companion", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SalesforceAuthInterceptor implements Interceptor {
    public static final String SALESFORCE_AUTH_HEADER = "X-Salesforce-Auth-Token";
    private final Lazy<SalesforceChatTokenManager> salesforceChatTokenManager;

    public SalesforceAuthInterceptor(Lazy<SalesforceChatTokenManager> salesforceChatTokenManager) {
        Intrinsics.checkNotNullParameter(salesforceChatTokenManager, "salesforceChatTokenManager");
        this.salesforceChatTokenManager = salesforceChatTokenManager;
    }

    /* compiled from: SalesforceAuthInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lokhttp3/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.api.supportchat.SalesforceAuthInterceptor$intercept$1", m3645f = "SalesforceAuthInterceptor.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.api.supportchat.SalesforceAuthInterceptor$intercept$1 */
    static final class C95561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
        final /* synthetic */ Interceptor.Chain $chain;
        Object L$0;
        int label;
        final /* synthetic */ SalesforceAuthInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C95561(Interceptor.Chain chain, SalesforceAuthInterceptor salesforceAuthInterceptor, Continuation<? super C95561> continuation) {
            super(2, continuation);
            this.$chain = chain;
            this.this$0 = salesforceAuthInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95561(this.$chain, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response> continuation) {
            return ((C95561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Request request;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Request request2 = this.$chain.request();
                if (!Intrinsics.areEqual(request2.getMethod(), "GET")) {
                    try {
                        SalesforceChatTokenManager salesforceChatTokenManager = (SalesforceChatTokenManager) this.this$0.salesforceChatTokenManager.get();
                        this.L$0 = request2;
                        this.label = 1;
                        Object token$default = SalesforceChatTokenManager.getToken$default(salesforceChatTokenManager, false, this, 1, null);
                        if (token$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        request = request2;
                        obj = token$default;
                    } catch (Throwable unused) {
                        request = request2;
                        return this.$chain.proceed(request);
                    }
                } else {
                    Interceptor.Chain chain = this.$chain;
                    return chain.proceed(chain.request());
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                request = (Request) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable unused2) {
                    return this.$chain.proceed(request);
                }
            }
            return this.$chain.proceed(request.newBuilder().header(SalesforceAuthInterceptor.SALESFORCE_AUTH_HEADER, ((ApiSupportSalesforceToken) obj).getAccessToken()).build());
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return (Response) BuildersKt__BuildersKt.runBlocking$default(null, new C95561(chain, this, null), 1, null);
    }
}
