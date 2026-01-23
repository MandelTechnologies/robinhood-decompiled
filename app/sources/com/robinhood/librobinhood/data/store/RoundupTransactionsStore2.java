package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.pluto.ApiRoundupTransactions;
import com.robinhood.models.p320db.mcduckling.RoundupTransactions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RoundupTransactionsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/mcduckling/RoundupTransactions;", "roundupId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupTransactionsStore$endpoint$1", m3645f = "RoundupTransactionsStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RoundupTransactionsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RoundupTransactionsStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super RoundupTransactions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoundupTransactionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundupTransactionsStore2(RoundupTransactionsStore roundupTransactionsStore, Continuation<? super RoundupTransactionsStore2> continuation) {
        super(2, continuation);
        this.this$0 = roundupTransactionsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoundupTransactionsStore2 roundupTransactionsStore2 = new RoundupTransactionsStore2(this.this$0, continuation);
        roundupTransactionsStore2.L$0 = obj;
        return roundupTransactionsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super RoundupTransactions> continuation) {
        return ((RoundupTransactionsStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid2 = (UUID) this.L$0;
            PlutoApi plutoApi = this.this$0.pluto;
            this.L$0 = uuid2;
            this.label = 1;
            Object roundupTransactions = plutoApi.getRoundupTransactions(uuid2, this);
            if (roundupTransactions == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuid2;
            obj = roundupTransactions;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ApiRoundupTransactions apiRoundupTransactions = (ApiRoundupTransactions) obj;
        return new RoundupTransactions(uuid, apiRoundupTransactions.getPending_transactions(), apiRoundupTransactions.getAssociated_transactions());
    }
}
