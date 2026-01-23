package com.stripe.android.payments;

import com.plaid.internal.EnumC7081g;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u0004 \u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0005*\u00020\u0006H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/stripe/android/model/StripeIntent;", "S", "Lcom/stripe/android/StripeIntentResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2", m3645f = "PaymentFlowResultProcessor.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2 */
/* loaded from: classes22.dex */
final class C42557x95b5fde6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ StripeIntent $originalIntent;
    final /* synthetic */ Ref.IntRef $remainingRetries;
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Ref.ObjectRef<Result<T>> $stripeIntentResult;
    Object L$0;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C42557x95b5fde6(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Ref.ObjectRef<Result<T>> objectRef, Ref.IntRef intRef, int i, StripeIntent stripeIntent, String str, ApiRequest.Options options, Continuation<? super C42557x95b5fde6> continuation) {
        super(2, continuation);
        this.this$0 = paymentFlowResultProcessor;
        this.$stripeIntentResult = objectRef;
        this.$remainingRetries = intRef;
        this.$maxRetries = i;
        this.$originalIntent = stripeIntent;
        this.$clientSecret = str;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C42557x95b5fde6(this.this$0, this.$stripeIntentResult, this.$remainingRetries, this.$maxRetries, this.$originalIntent, this.$clientSecret, this.$requestOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C42557x95b5fde6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:28:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:28:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            objectRef = this.$stripeIntentResult;
            if (!this.this$0.shouldCallRefreshIntent(this.$originalIntent)) {
            }
            if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = (Ref.ObjectRef) this.L$0;
        ResultKt.throwOnFailure(obj);
        T value = ((Result) obj).getValue();
        objectRef.element = value;
        Ref.IntRef intRef = this.$remainingRetries;
        intRef.element--;
        if (!this.this$0.shouldRetry(this.$stripeIntentResult.element) && this.$remainingRetries.element > 1) {
            long jMo26845getDelay3nIYWDw = ((PaymentFlowResultProcessor) this.this$0).retryDelaySupplier.mo26845getDelay3nIYWDw(this.$maxRetries, this.$remainingRetries.element);
            this.L$0 = null;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(jMo26845getDelay3nIYWDw, this) != coroutine_suspended) {
                objectRef = this.$stripeIntentResult;
                if (!this.this$0.shouldCallRefreshIntent(this.$originalIntent)) {
                    PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor = this.this$0;
                    String str = this.$clientSecret;
                    ApiRequest.Options options = this.$requestOptions;
                    List<String> expand_payment_method = PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD();
                    this.L$0 = objectRef;
                    this.label = 2;
                    Object objMo26915refreshStripeIntentBWLJW6A = paymentFlowResultProcessor.mo26915refreshStripeIntentBWLJW6A(str, options, expand_payment_method, this);
                    value = objMo26915refreshStripeIntentBWLJW6A;
                } else {
                    PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor2 = this.this$0;
                    String str2 = this.$clientSecret;
                    ApiRequest.Options options2 = this.$requestOptions;
                    List<String> expand_payment_method2 = PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD();
                    this.L$0 = objectRef;
                    this.label = 3;
                    Object objMo26916retrieveStripeIntentBWLJW6A = paymentFlowResultProcessor2.mo26916retrieveStripeIntentBWLJW6A(str2, options2, expand_payment_method2, this);
                    value = objMo26916retrieveStripeIntentBWLJW6A;
                }
                if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
