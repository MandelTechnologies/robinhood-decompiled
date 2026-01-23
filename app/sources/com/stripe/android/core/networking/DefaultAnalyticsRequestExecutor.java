package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DefaultAnalyticsRequestExecutor.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "()V", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V", "executeAsync", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DefaultAnalyticsRequestExecutor implements AnalyticsRequestExecutor {
    private final Logger logger;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    public DefaultAnalyticsRequestExecutor(StripeNetworkClient stripeNetworkClient, CoroutineContext workContext, Logger logger) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
        this.logger = logger;
    }

    public DefaultAnalyticsRequestExecutor() {
        this(Logger.INSTANCE.noop(), Dispatchers.getIO());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor(Logger logger, CoroutineContext workContext) {
        this(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), workContext, logger);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestExecutor
    public void executeAsync(AnalyticsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.logger.info("Event: " + request.getParams().get("event"));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C425171(request, null), 3, null);
    }

    /* compiled from: DefaultAnalyticsRequestExecutor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1", m3645f = "DefaultAnalyticsRequestExecutor.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1 */
    static final class C425171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425171(AnalyticsRequest analyticsRequest, Continuation<? super C425171> continuation) {
            super(2, continuation);
            this.$request = analyticsRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C425171 c425171 = DefaultAnalyticsRequestExecutor.this.new C425171(this.$request, continuation);
            c425171.L$0 = obj;
            return c425171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = DefaultAnalyticsRequestExecutor.this;
                    AnalyticsRequest analyticsRequest = this.$request;
                    Result.Companion companion = Result.INSTANCE;
                    StripeNetworkClient stripeNetworkClient = defaultAnalyticsRequestExecutor.stripeNetworkClient;
                    this.label = 1;
                    obj = stripeNetworkClient.executeRequest(analyticsRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((StripeResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = DefaultAnalyticsRequestExecutor.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                defaultAnalyticsRequestExecutor2.logger.error("Exception while making analytics request", thM28553exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }
}
