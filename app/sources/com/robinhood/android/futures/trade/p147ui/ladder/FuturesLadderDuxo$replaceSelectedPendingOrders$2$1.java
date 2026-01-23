package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.LadderEvent;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.store.futures.FuturesOrderStore;
import java.math.BigDecimal;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$replaceSelectedPendingOrders$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {749}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FuturesLadderDuxo$replaceSelectedPendingOrders$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiFuturesOrder $order;
    final /* synthetic */ UUID $refId;
    final /* synthetic */ BigDecimal $targetPrice;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesLadderDuxo$replaceSelectedPendingOrders$2$1(FuturesLadderDuxo futuresLadderDuxo, UUID uuid, UiFuturesOrder uiFuturesOrder, BigDecimal bigDecimal, Continuation<? super FuturesLadderDuxo$replaceSelectedPendingOrders$2$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresLadderDuxo;
        this.$refId = uuid;
        this.$order = uiFuturesOrder;
        this.$targetPrice = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesLadderDuxo$replaceSelectedPendingOrders$2$1 futuresLadderDuxo$replaceSelectedPendingOrders$2$1 = new FuturesLadderDuxo$replaceSelectedPendingOrders$2$1(this.this$0, this.$refId, this.$order, this.$targetPrice, continuation);
        futuresLadderDuxo$replaceSelectedPendingOrders$2$1.L$0 = obj;
        return futuresLadderDuxo$replaceSelectedPendingOrders$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesLadderDuxo$replaceSelectedPendingOrders$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                UUID uuid = this.$refId;
                UiFuturesOrder uiFuturesOrder = this.$order;
                BigDecimal bigDecimal = this.$targetPrice;
                Result.Companion companion = Result.INSTANCE;
                FuturesOrderStore futuresOrderStore = futuresLadderDuxo.futuresOrderStore;
                Intrinsics.checkNotNull(uuid);
                UUID id = uiFuturesOrder.getId();
                this.label = 1;
                obj = futuresOrderStore.updateOrder(uuid, id, bigDecimal, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((FuturesOrderDto) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        FuturesLadderDuxo futuresLadderDuxo2 = this.this$0;
        UiFuturesOrder uiFuturesOrder2 = this.$order;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            futuresLadderDuxo2.submit(new LadderEvent.ApiOrNetworkError(thM28553exceptionOrNullimpl));
            futuresLadderDuxo2.applyMutation(new FuturesLadderDuxo$replaceSelectedPendingOrders$2$1$2$1(uiFuturesOrder2, null));
        }
        return Unit.INSTANCE;
    }
}
