package com.stripe.android.payments.core.authentication.threeds2;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J.\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "complete3ds2Auth", "", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "remainingRetries", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onComplete3ds2AuthFailure", "error", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor, reason: use source file name */
/* loaded from: classes22.dex */
public final class Stripe3ds2ChallengeResultProcessor2 implements Stripe3ds2ChallengeResultProcessor {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", m3645f = "Stripe3ds2ChallengeResultProcessor.kt", m3646l = {147, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "complete3ds2Auth")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 */
    static final class C425841 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C425841(Continuation<? super C425841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2ChallengeResultProcessor2.this.complete3ds2Auth(null, null, 0, this);
        }
    }

    /* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", m3645f = "Stripe3ds2ChallengeResultProcessor.kt", m3646l = {200, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "onComplete3ds2AuthFailure")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 */
    static final class C425851 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C425851(Continuation<? super C425851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2ChallengeResultProcessor2.this.onComplete3ds2AuthFailure(null, null, 0, null, this);
        }
    }

    public Stripe3ds2ChallengeResultProcessor2(StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, RetryDelaySupplier retryDelaySupplier, Logger logger, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.logger = logger;
        this.workContext = workContext;
    }

    /* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2", m3645f = "Stripe3ds2ChallengeResultProcessor.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2 */
    static final class C425862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unvalidated>, Object> {
        final /* synthetic */ ChallengeResult $challengeResult;
        Object L$0;
        int label;
        final /* synthetic */ Stripe3ds2ChallengeResultProcessor2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425862(ChallengeResult challengeResult, Stripe3ds2ChallengeResultProcessor2 stripe3ds2ChallengeResultProcessor2, Continuation<? super C425862> continuation) {
            super(2, continuation);
            this.$challengeResult = challengeResult;
            this.this$0 = stripe3ds2ChallengeResultProcessor2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425862(this.$challengeResult, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unvalidated> continuation) {
            return ((C425862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiRequest.Options options;
            Object objComplete3ds2Auth$default;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ChallengeResult challengeResult = this.$challengeResult;
                if (challengeResult instanceof ChallengeResult.Succeeded) {
                    this.this$0.analyticsRequestExecutor.executeAsync(this.this$0.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Succeeded) this.$challengeResult).getUiTypeCode()));
                } else if (challengeResult instanceof ChallengeResult.Failed) {
                    this.this$0.analyticsRequestExecutor.executeAsync(this.this$0.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Failed) this.$challengeResult).getUiTypeCode()));
                } else if (challengeResult instanceof ChallengeResult.Canceled) {
                    this.this$0.analyticsRequestExecutor.executeAsync(this.this$0.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCanceled, ((ChallengeResult.Canceled) this.$challengeResult).getUiTypeCode()));
                } else if ((challengeResult instanceof ChallengeResult.ProtocolError) || (challengeResult instanceof ChallengeResult.RuntimeError)) {
                    this.this$0.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.this$0.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, null, 62, null));
                } else if (challengeResult instanceof ChallengeResult.Timeout) {
                    this.this$0.analyticsRequestExecutor.executeAsync(this.this$0.paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeTimedOut, ((ChallengeResult.Timeout) this.$challengeResult).getUiTypeCode()));
                }
                AnalyticsRequestExecutor analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.Auth3ds2ChallengePresented;
                UiType initialUiType = this.$challengeResult.getInitialUiType();
                String code = initialUiType != null ? initialUiType.getCode() : null;
                if (code == null) {
                    code = "";
                }
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(paymentAnalyticsEvent, code));
                options = new ApiRequest.Options(this.$challengeResult.getIntentData().getPublishableKey(), this.$challengeResult.getIntentData().getAccountId(), null, 4, null);
                Stripe3ds2ChallengeResultProcessor2 stripe3ds2ChallengeResultProcessor2 = this.this$0;
                ChallengeResult challengeResult2 = this.$challengeResult;
                this.L$0 = options;
                this.label = 1;
                objComplete3ds2Auth$default = Stripe3ds2ChallengeResultProcessor2.complete3ds2Auth$default(stripe3ds2ChallengeResultProcessor2, challengeResult2, options, 0, this, 4, null);
                if (objComplete3ds2Auth$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ApiRequest.Options options2 = (ApiRequest.Options) this.L$0;
                ResultKt.throwOnFailure(obj);
                options = options2;
                objComplete3ds2Auth$default = obj;
            }
            if (((Boolean) objComplete3ds2Auth$default).booleanValue()) {
                ChallengeResult challengeResult3 = this.$challengeResult;
                if (!(challengeResult3 instanceof ChallengeResult.Succeeded)) {
                    if (!(challengeResult3 instanceof ChallengeResult.Failed)) {
                        if (challengeResult3 instanceof ChallengeResult.Canceled) {
                            i3 = 3;
                        } else if (!(challengeResult3 instanceof ChallengeResult.ProtocolError) && !(challengeResult3 instanceof ChallengeResult.RuntimeError)) {
                            if (!(challengeResult3 instanceof ChallengeResult.Timeout)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = 4;
                        }
                    }
                    i = 2;
                }
                i = i3;
            } else {
                i = 2;
            }
            return new Unvalidated(this.$challengeResult.getIntentData().getClientSecret(), i, null, false, null, null, options.getStripeAccount(), 60, null);
        }
    }

    @Override // com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor
    public Object process(ChallengeResult challengeResult, Continuation<? super Unvalidated> continuation) {
        return BuildersKt.withContext(this.workContext, new C425862(challengeResult, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object complete3ds2Auth(ChallengeResult challengeResult, ApiRequest.Options options, int i, Continuation<? super Boolean> continuation) {
        C425841 c425841;
        Object objMo26871complete3ds2Auth0E7RQCE;
        Stripe3ds2ChallengeResultProcessor2 stripe3ds2ChallengeResultProcessor2;
        if (continuation instanceof C425841) {
            c425841 = (C425841) continuation;
            int i2 = c425841.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c425841.label = i2 - Integer.MIN_VALUE;
            } else {
                c425841 = new C425841(continuation);
            }
        }
        C425841 c4258412 = c425841;
        Object objOnComplete3ds2AuthFailure = c4258412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4258412.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOnComplete3ds2AuthFailure);
            StripeRepository stripeRepository = this.stripeRepository;
            String sourceId = challengeResult.getIntentData().getSourceId();
            c4258412.L$0 = this;
            c4258412.L$1 = challengeResult;
            c4258412.L$2 = options;
            c4258412.I$0 = i;
            c4258412.label = 1;
            objMo26871complete3ds2Auth0E7RQCE = stripeRepository.mo26871complete3ds2Auth0E7RQCE(sourceId, options, c4258412);
            if (objMo26871complete3ds2Auth0E7RQCE != coroutine_suspended) {
                stripe3ds2ChallengeResultProcessor2 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOnComplete3ds2AuthFailure);
            return boxing.boxBoolean(((Boolean) objOnComplete3ds2AuthFailure).booleanValue());
        }
        i = c4258412.I$0;
        options = (ApiRequest.Options) c4258412.L$2;
        challengeResult = (ChallengeResult) c4258412.L$1;
        stripe3ds2ChallengeResultProcessor2 = (Stripe3ds2ChallengeResultProcessor2) c4258412.L$0;
        ResultKt.throwOnFailure(objOnComplete3ds2AuthFailure);
        objMo26871complete3ds2Auth0E7RQCE = ((Result) objOnComplete3ds2AuthFailure).getValue();
        int i4 = i;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo26871complete3ds2Auth0E7RQCE);
        if (thM28553exceptionOrNullimpl == null) {
            stripe3ds2ChallengeResultProcessor2.logger.debug("3DS2 challenge completion request was successful. " + (3 - i4) + " retries attempted.");
            return boxing.boxBoolean(true);
        }
        c4258412.L$0 = null;
        c4258412.L$1 = null;
        c4258412.L$2 = null;
        c4258412.label = 2;
        objOnComplete3ds2AuthFailure = stripe3ds2ChallengeResultProcessor2.onComplete3ds2AuthFailure(challengeResult, options, i4, thM28553exceptionOrNullimpl, c4258412);
    }

    static /* synthetic */ Object complete3ds2Auth$default(Stripe3ds2ChallengeResultProcessor2 stripe3ds2ChallengeResultProcessor2, ChallengeResult challengeResult, ApiRequest.Options options, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return stripe3ds2ChallengeResultProcessor2.complete3ds2Auth(challengeResult, options, i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onComplete3ds2AuthFailure(ChallengeResult challengeResult, ApiRequest.Options options, int i, Throwable th, Continuation<? super Boolean> continuation) {
        C425851 c425851;
        Stripe3ds2ChallengeResultProcessor2 stripe3ds2ChallengeResultProcessor2;
        if (continuation instanceof C425851) {
            c425851 = (C425851) continuation;
            int i2 = c425851.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c425851.label = i2 - Integer.MIN_VALUE;
            } else {
                c425851 = new C425851(continuation);
            }
        }
        Object obj = c425851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c425851.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.logger.error("3DS2 challenge completion request failed. Remaining retries: " + i, th);
            boolean isClientError = th instanceof StripeException ? ((StripeException) th).getIsClientError() : false;
            if (i > 0 && isClientError) {
                long jMo26845getDelay3nIYWDw = this.retryDelaySupplier.mo26845getDelay3nIYWDw(3, i);
                c425851.L$0 = this;
                c425851.L$1 = challengeResult;
                c425851.L$2 = options;
                c425851.I$0 = i;
                c425851.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(jMo26845getDelay3nIYWDw, c425851) != coroutine_suspended) {
                    stripe3ds2ChallengeResultProcessor2 = this;
                }
            }
            this.logger.debug("Did not make a successful 3DS2 challenge completion request after retrying.");
            return boxing.boxBoolean(false);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        i = c425851.I$0;
        options = (ApiRequest.Options) c425851.L$2;
        challengeResult = (ChallengeResult) c425851.L$1;
        stripe3ds2ChallengeResultProcessor2 = (Stripe3ds2ChallengeResultProcessor2) c425851.L$0;
        ResultKt.throwOnFailure(obj);
        c425851.L$0 = null;
        c425851.L$1 = null;
        c425851.L$2 = null;
        c425851.label = 2;
        Object objComplete3ds2Auth = stripe3ds2ChallengeResultProcessor2.complete3ds2Auth(challengeResult, options, i - 1, c425851);
        return objComplete3ds2Auth == coroutine_suspended ? coroutine_suspended : objComplete3ds2Auth;
    }

    /* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$Companion;", "", "()V", "MAX_RETRIES", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$Companion */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
