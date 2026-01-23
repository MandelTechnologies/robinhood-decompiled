package com.stripe.android.payments.paymentlauncher;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.stripe.android.payments.Unvalidated;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1", m3645f = "PaymentLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes22.dex */
final class PaymentLauncherViewModel$onPaymentFlowResult$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Unvalidated $paymentFlowResult;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$onPaymentFlowResult$1(PaymentLauncherViewModel paymentLauncherViewModel, Unvalidated unvalidated, Continuation<? super PaymentLauncherViewModel$onPaymentFlowResult$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$paymentFlowResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r4, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM26914processResultgIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentFlowResultProcessor paymentFlowResultProcessor = this.this$0.isPaymentIntent ? (PaymentFlowResultProcessor) this.this$0.lazyPaymentIntentFlowResultProcessor.get() : (PaymentFlowResultProcessor) this.this$0.lazySetupIntentFlowResultProcessor.get();
            Unvalidated unvalidated = this.$paymentFlowResult;
            this.label = 1;
            objM26914processResultgIAlus = paymentFlowResultProcessor.m26914processResultgIAlus(unvalidated, this);
            if (objM26914processResultgIAlus != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objM26914processResultgIAlus = ((Result) obj).getValue();
        PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26914processResultgIAlus);
        if (thM28553exceptionOrNullimpl == null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$1$1 paymentLauncherViewModel$onPaymentFlowResult$1$1$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$1$1(paymentLauncherViewModel, (StripeIntentResult) objM26914processResultgIAlus, null);
            this.label = 2;
        } else {
            CoroutineContext coroutineContext2 = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$2$1 paymentLauncherViewModel$onPaymentFlowResult$1$2$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(paymentLauncherViewModel, thM28553exceptionOrNullimpl, null);
            this.label = 3;
        }
    }
}
