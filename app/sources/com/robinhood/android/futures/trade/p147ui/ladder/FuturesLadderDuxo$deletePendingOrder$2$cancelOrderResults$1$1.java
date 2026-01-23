package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.store.futures.FuturesOrderStore;
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

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {793}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends UiFuturesOrder>>, Object> {
    final /* synthetic */ UUID $orderId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1(FuturesLadderDuxo futuresLadderDuxo, UUID uuid, Continuation<? super FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresLadderDuxo;
        this.$orderId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1 futuresLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1 = new FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1(this.this$0, this.$orderId, continuation);
        futuresLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1.L$0 = obj;
        return futuresLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends UiFuturesOrder>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<UiFuturesOrder>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<UiFuturesOrder>> continuation) {
        return ((FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                UUID uuid = this.$orderId;
                Result.Companion companion = Result.INSTANCE;
                FuturesOrderStore futuresOrderStore = futuresLadderDuxo.futuresOrderStore;
                this.label = 1;
                obj = futuresOrderStore.cancelOrder(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((UiFuturesOrder) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m28549boximpl(objM28550constructorimpl);
    }
}
