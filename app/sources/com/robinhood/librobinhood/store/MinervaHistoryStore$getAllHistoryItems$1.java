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

/* compiled from: MinervaHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiMinervaHistoryItem;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.store.MinervaHistoryStore$getAllHistoryItems$1", m3645f = "MinervaHistoryStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MinervaHistoryStore$getAllHistoryItems$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super PaginatedResult<? extends ApiMinervaHistoryItem>>, Object> {
    int label;
    final /* synthetic */ MinervaHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinervaHistoryStore$getAllHistoryItems$1(MinervaHistoryStore minervaHistoryStore, Continuation<? super MinervaHistoryStore$getAllHistoryItems$1> continuation) {
        super(2, continuation);
        this.this$0 = minervaHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinervaHistoryStore$getAllHistoryItems$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super PaginatedResult<? extends ApiMinervaHistoryItem>> continuation) {
        return invoke2(unit, (Continuation<? super PaginatedResult<ApiMinervaHistoryItem>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super PaginatedResult<ApiMinervaHistoryItem>> continuation) {
        return ((MinervaHistoryStore$getAllHistoryItems$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Minerva minerva = this.this$0.minerva;
        this.label = 1;
        Object historyItems = minerva.getHistoryItems(this);
        return historyItems == coroutine_suspended ? coroutine_suspended : historyItems;
    }
}
