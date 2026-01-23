package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1", m3645f = "PaymentLauncherViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes22.dex */
final class PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $analyticsParams;
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1(PaymentLauncherViewModel paymentLauncherViewModel, Throwable th, Map<String, String> map, Continuation<? super PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$it = th;
        this.$analyticsParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1(this.this$0, this.$it, this.$analyticsParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaymentLauncherViewModel.postInternalResult$default(this.this$0, new InternalPaymentResult.Failed(this.$it), null, this.$analyticsParams, 2, null);
        return Unit.INSTANCE;
    }
}
