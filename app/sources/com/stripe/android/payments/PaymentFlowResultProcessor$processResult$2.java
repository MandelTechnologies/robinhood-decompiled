package com.stripe.android.payments;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0005*\u00020\u0006H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "S", "T", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/StripeIntentResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", m3645f = "PaymentFlowResultProcessor.kt", m3646l = {57, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 95}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes22.dex */
final class PaymentFlowResultProcessor$processResult$2<S> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends S>>, Object> {
    final /* synthetic */ Unvalidated $unvalidatedResult;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentFlowResultProcessor$processResult$2(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Unvalidated unvalidated, Continuation<? super PaymentFlowResultProcessor$processResult$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentFlowResultProcessor;
        this.$unvalidatedResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentFlowResultProcessor$processResult$2 paymentFlowResultProcessor$processResult$2 = new PaymentFlowResultProcessor$processResult$2(this.this$0, this.$unvalidatedResult, continuation);
        paymentFlowResultProcessor$processResult$2.L$0 = obj;
        return paymentFlowResultProcessor$processResult$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends S>> continuation) {
        return ((PaymentFlowResultProcessor$processResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object objM28550constructorimpl2;
        Object objMo26916retrieveStripeIntentBWLJW6A;
        Validated validated;
        ApiRequest.Options options;
        StripeIntentResult stripeIntentResultCreateStripeIntentResult;
        Object objMo26913cancelStripeIntentSourceBWLJW6A;
        Validated validated2;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        String publishableKey;
        String threeDS2IntentId;
        Object objM26912refreshStripeIntentUntilTerminalStateBWLJW6A;
        Validated validated3;
        PaymentFlowResultProcessor paymentFlowResultProcessor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Unvalidated unvalidated = this.$unvalidatedResult;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(unvalidated.validate$payments_core_release());
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
            if (thM28553exceptionOrNullimpl == null) {
                Validated validated4 = (Validated) objM28550constructorimpl2;
                Object obj2 = ((PaymentFlowResultProcessor) this.this$0).publishableKeyProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ApiRequest.Options options2 = new ApiRequest.Options((String) obj2, validated4.getStripeAccountId(), null, 4, null);
                PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor3 = this.this$0;
                String clientSecret = validated4.getClientSecret();
                List<String> expand_payment_method = PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD();
                this.L$0 = validated4;
                this.L$1 = options2;
                this.label = 1;
                objMo26916retrieveStripeIntentBWLJW6A = paymentFlowResultProcessor3.mo26916retrieveStripeIntentBWLJW6A(clientSecret, options2, expand_payment_method, this);
                if (objMo26916retrieveStripeIntentBWLJW6A != coroutine_suspended) {
                    validated = validated4;
                    options = options2;
                }
                return coroutine_suspended;
            }
            return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl)));
        }
        if (i != 1) {
            if (i == 2) {
                paymentFlowResultProcessor2 = (PaymentFlowResultProcessor) this.L$1;
                validated3 = (Validated) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM26912refreshStripeIntentUntilTerminalStateBWLJW6A = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objM26912refreshStripeIntentUntilTerminalStateBWLJW6A);
                StripeIntent stripeIntent = (StripeIntent) objM26912refreshStripeIntentUntilTerminalStateBWLJW6A;
                stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent, paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent, validated3.getFlowOutcome()), paymentFlowResultProcessor2.failureMessageFactory.create(stripeIntent, validated3.getFlowOutcome()));
                objM28550constructorimpl = Result.m28550constructorimpl(stripeIntentResultCreateStripeIntentResult);
                return Result.m28549boximpl(objM28550constructorimpl);
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.L$1;
            validated2 = (Validated) this.L$0;
            ResultKt.throwOnFailure(obj);
            objMo26913cancelStripeIntentSourceBWLJW6A = ((Result) obj).getValue();
            ResultKt.throwOnFailure(objMo26913cancelStripeIntentSourceBWLJW6A);
            StripeIntent stripeIntent2 = (StripeIntent) objMo26913cancelStripeIntentSourceBWLJW6A;
            stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(stripeIntent2, validated2.getFlowOutcome(), paymentFlowResultProcessor.failureMessageFactory.create(stripeIntent2, validated2.getFlowOutcome()));
            objM28550constructorimpl = Result.m28550constructorimpl(stripeIntentResultCreateStripeIntentResult);
            return Result.m28549boximpl(objM28550constructorimpl);
        }
        options = (ApiRequest.Options) this.L$1;
        validated = (Validated) this.L$0;
        ResultKt.throwOnFailure(obj);
        objMo26916retrieveStripeIntentBWLJW6A = ((Result) obj).getValue();
        PaymentFlowResultProcessor paymentFlowResultProcessor4 = this.this$0;
        if (!Result.m28556isSuccessimpl(objMo26916retrieveStripeIntentBWLJW6A)) {
            objM28550constructorimpl = Result.m28550constructorimpl(objMo26916retrieveStripeIntentBWLJW6A);
            return Result.m28549boximpl(objM28550constructorimpl);
        }
        StripeIntent stripeIntent3 = (StripeIntent) objMo26916retrieveStripeIntentBWLJW6A;
        if (stripeIntent3.getStatus() != StripeIntent.Status.Succeeded && stripeIntent3.getStatus() != StripeIntent.Status.RequiresCapture) {
            if (!paymentFlowResultProcessor4.shouldRefreshIntent(stripeIntent3, validated.getFlowOutcome())) {
                if (paymentFlowResultProcessor4.shouldCancelIntentSource(stripeIntent3, validated.getCanCancelSource())) {
                    String sourceId = validated.getSourceId();
                    String str = "";
                    if (sourceId == null) {
                        sourceId = "";
                    }
                    paymentFlowResultProcessor4.logger.debug("Canceling source '" + sourceId + "' for '" + stripeIntent3.getClass().getSimpleName() + "'");
                    StripeIntent.NextActionData nextActionData = stripeIntent3.getNextActionData();
                    StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS2 ? (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData : null;
                    if (use3DS2 == null || (threeDS2IntentId = use3DS2.getThreeDS2IntentId()) == null) {
                        String id = stripeIntent3.getId();
                        if (id != null) {
                            str = id;
                        }
                    } else {
                        str = threeDS2IntentId;
                    }
                    if (use3DS2 != null && (publishableKey = use3DS2.getPublishableKey()) != null) {
                        options = new ApiRequest.Options(publishableKey, null, null, 6, null);
                    }
                    this.L$0 = validated;
                    this.L$1 = paymentFlowResultProcessor4;
                    this.label = 3;
                    objMo26913cancelStripeIntentSourceBWLJW6A = paymentFlowResultProcessor4.mo26913cancelStripeIntentSourceBWLJW6A(str, options, sourceId, this);
                    if (objMo26913cancelStripeIntentSourceBWLJW6A != coroutine_suspended) {
                        validated2 = validated;
                        paymentFlowResultProcessor = paymentFlowResultProcessor4;
                        ResultKt.throwOnFailure(objMo26913cancelStripeIntentSourceBWLJW6A);
                        StripeIntent stripeIntent22 = (StripeIntent) objMo26913cancelStripeIntentSourceBWLJW6A;
                        stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(stripeIntent22, validated2.getFlowOutcome(), paymentFlowResultProcessor.failureMessageFactory.create(stripeIntent22, validated2.getFlowOutcome()));
                    }
                } else {
                    stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor4.createStripeIntentResult(stripeIntent3, validated.getFlowOutcome(), paymentFlowResultProcessor4.failureMessageFactory.create(stripeIntent3, validated.getFlowOutcome()));
                }
            } else {
                String clientSecret2 = validated.getClientSecret();
                this.L$0 = validated;
                this.L$1 = paymentFlowResultProcessor4;
                this.label = 2;
                objM26912refreshStripeIntentUntilTerminalStateBWLJW6A = paymentFlowResultProcessor4.m26912refreshStripeIntentUntilTerminalStateBWLJW6A(stripeIntent3, clientSecret2, options, this);
                if (objM26912refreshStripeIntentUntilTerminalStateBWLJW6A != coroutine_suspended) {
                    validated3 = validated;
                    paymentFlowResultProcessor2 = paymentFlowResultProcessor4;
                    ResultKt.throwOnFailure(objM26912refreshStripeIntentUntilTerminalStateBWLJW6A);
                    StripeIntent stripeIntent4 = (StripeIntent) objM26912refreshStripeIntentUntilTerminalStateBWLJW6A;
                    stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent4, paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent4, validated3.getFlowOutcome()), paymentFlowResultProcessor2.failureMessageFactory.create(stripeIntent4, validated3.getFlowOutcome()));
                }
            }
            return coroutine_suspended;
        }
        stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor4.createStripeIntentResult(stripeIntent3, 1, paymentFlowResultProcessor4.failureMessageFactory.create(stripeIntent3, validated.getFlowOutcome()));
        objM28550constructorimpl = Result.m28550constructorimpl(stripeIntentResultCreateStripeIntentResult);
        return Result.m28549boximpl(objM28550constructorimpl);
    }
}
