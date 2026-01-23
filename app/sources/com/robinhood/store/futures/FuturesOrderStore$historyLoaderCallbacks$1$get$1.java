package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder2;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orders", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$historyLoaderCallbacks$1$get$1", m3645f = "FuturesOrderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$historyLoaderCallbacks$1$get$1 extends ContinuationImpl7 implements Function2<List<? extends UiFuturesOrder>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$historyLoaderCallbacks$1$get$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$historyLoaderCallbacks$1$get$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$historyLoaderCallbacks$1$get$1 futuresOrderStore$historyLoaderCallbacks$1$get$1 = new FuturesOrderStore$historyLoaderCallbacks$1$get$1(this.this$0, continuation);
        futuresOrderStore$historyLoaderCallbacks$1$get$1.L$0 = obj;
        return futuresOrderStore$historyLoaderCallbacks$1$get$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UiFuturesOrder> list, Continuation<? super Unit> continuation) {
        return invoke2((List<UiFuturesOrder>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UiFuturesOrder> list, Continuation<? super Unit> continuation) {
        return ((FuturesOrderStore$historyLoaderCallbacks$1$get$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<UUID> orderIds = UiFuturesOrder2.getOrderIds((List) this.L$0);
        if (!orderIds.isEmpty()) {
            this.this$0.refreshRealizedPnls(orderIds);
        }
        return Unit.INSTANCE;
    }
}
