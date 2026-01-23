package com.robinhood.librobinhood.store;

import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiMinervaHistoryItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: MinervaHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"j$/time/Instant", "initiatedAt", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiMinervaHistoryItem;", "<anonymous>", "(Lj$/time/Instant;)Lcom/robinhood/models/PaginatedResult;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.store.MinervaHistoryStore$getOlderHistoryItems$1", m3645f = "MinervaHistoryStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MinervaHistoryStore$getOlderHistoryItems$1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super PaginatedResult<? extends ApiMinervaHistoryItem>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MinervaHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinervaHistoryStore$getOlderHistoryItems$1(MinervaHistoryStore minervaHistoryStore, Continuation<? super MinervaHistoryStore$getOlderHistoryItems$1> continuation) {
        super(2, continuation);
        this.this$0 = minervaHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MinervaHistoryStore$getOlderHistoryItems$1 minervaHistoryStore$getOlderHistoryItems$1 = new MinervaHistoryStore$getOlderHistoryItems$1(this.this$0, continuation);
        minervaHistoryStore$getOlderHistoryItems$1.L$0 = obj;
        return minervaHistoryStore$getOlderHistoryItems$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Instant instant, Continuation<? super PaginatedResult<ApiMinervaHistoryItem>> continuation) {
        return ((MinervaHistoryStore$getOlderHistoryItems$1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Instant instant, Continuation<? super PaginatedResult<? extends ApiMinervaHistoryItem>> continuation) {
        return invoke2(instant, (Continuation<? super PaginatedResult<ApiMinervaHistoryItem>>) continuation);
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
        Instant instant = (Instant) this.L$0;
        Minerva minerva = this.this$0.minerva;
        this.label = 1;
        Object olderHistoryItems = minerva.getOlderHistoryItems(instant, this);
        return olderHistoryItems == coroutine_suspended ? coroutine_suspended : olderHistoryItems;
    }
}
