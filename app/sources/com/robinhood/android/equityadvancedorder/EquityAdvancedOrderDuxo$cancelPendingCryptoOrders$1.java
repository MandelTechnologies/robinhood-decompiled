package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.validation.CryptoPendingAndCancelExtension;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1559}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $minTimeInFlight;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, long j, Continuation<? super EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
        this.$minTimeInFlight = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1(this.this$0, this.$minTimeInFlight, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EquityOrderCheckValidator equityOrderCheckValidator = this.this$0.equityOrderCheckValidator;
            long j = this.$minTimeInFlight;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1.invokeSuspend$lambda$0(((Boolean) obj2).booleanValue());
                }
            };
            final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
            Function1 function12 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1.invokeSuspend$lambda$1(equityAdvancedOrderDuxo, (EquityOrderEvent) obj2);
                }
            };
            this.label = 1;
            if (CryptoPendingAndCancelExtension.cancelPendingCryptoOrders(equityOrderCheckValidator, j, function1, function12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityOrderEvent equityOrderEvent) {
        Intrinsics.checkNotNull(equityOrderEvent, "null cannot be cast to non-null type com.robinhood.android.equity.validation.event.EquityOrderEvent.Advanced");
        equityAdvancedOrderDuxo.submit((EquityOrderEvent.Advanced) equityOrderEvent);
        return Unit.INSTANCE;
    }
}
