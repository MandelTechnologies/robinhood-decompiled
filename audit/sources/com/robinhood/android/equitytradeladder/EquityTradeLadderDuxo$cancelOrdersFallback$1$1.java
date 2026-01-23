package com.robinhood.android.equitytradeladder;

import com.robinhood.librobinhood.data.store.OrderStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrdersFallback$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2171}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$cancelOrdersFallback$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $orderId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityTradeLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderDuxo$cancelOrdersFallback$1$1(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, String str, Continuation<? super EquityTradeLadderDuxo$cancelOrdersFallback$1$1> continuation) {
        super(2, continuation);
        this.this$0 = equityTradeLadderDuxo;
        this.$orderId = uuid;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$cancelOrdersFallback$1$1 equityTradeLadderDuxo$cancelOrdersFallback$1$1 = new EquityTradeLadderDuxo$cancelOrdersFallback$1$1(this.this$0, this.$orderId, this.$accountNumber, continuation);
        equityTradeLadderDuxo$cancelOrdersFallback$1$1.L$0 = obj;
        return equityTradeLadderDuxo$cancelOrdersFallback$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderDuxo$cancelOrdersFallback$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderDuxo equityTradeLadderDuxo = this.this$0;
                UUID uuid = this.$orderId;
                String str = this.$accountNumber;
                Result.Companion companion = Result.INSTANCE;
                OrderStore orderStore = equityTradeLadderDuxo.orderStore;
                this.label = 1;
                if (orderStore.cancelOrder(uuid, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
