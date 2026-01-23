package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.screens.coordinator.state.PaymentProcessorState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentProcessorState.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState$Companion", m3645f = "PaymentProcessorState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "produceState")
/* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState$Companion$produceState$1, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentProcessorState2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentProcessorState.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentProcessorState2(PaymentProcessorState.Companion companion, Continuation<? super PaymentProcessorState2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.produceState(null, null, null, this);
    }
}
