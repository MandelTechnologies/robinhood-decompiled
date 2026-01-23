package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.utils.Outcome;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentProcessorManager.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$load$1$deferredPayment$1", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$load$1$deferredPayment$1, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentProcessorManager3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends Payment, ? extends CoreError>>, Object> {
    int label;
    final /* synthetic */ PaymentProcessorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentProcessorManager3(PaymentProcessorManager paymentProcessorManager, Continuation<? super PaymentProcessorManager3> continuation) {
        super(2, continuation);
        this.this$0 = paymentProcessorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentProcessorManager3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        return ((PaymentProcessorManager3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PaymentProcessorManager paymentProcessorManager = this.this$0;
        this.label = 1;
        Object payment = paymentProcessorManager.getPayment(this);
        return payment == coroutine_suspended ? coroutine_suspended : payment;
    }
}
