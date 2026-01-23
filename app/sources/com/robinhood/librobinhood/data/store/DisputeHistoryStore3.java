package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.Dispute;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: DisputeHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "dispute", "Lcom/robinhood/models/db/mcduckling/Dispute;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DisputeHistoryStore$transactionLoader$1$load$1", m3645f = "DisputeHistoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.DisputeHistoryStore$transactionLoader$1$load$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DisputeHistoryStore3 extends ContinuationImpl7 implements Function2<Dispute, Continuation<? super Flow<? extends MinervaTransaction>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DisputeHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisputeHistoryStore3(DisputeHistoryStore disputeHistoryStore, Continuation<? super DisputeHistoryStore3> continuation) {
        super(2, continuation);
        this.this$0 = disputeHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DisputeHistoryStore3 disputeHistoryStore3 = new DisputeHistoryStore3(this.this$0, continuation);
        disputeHistoryStore3.L$0 = obj;
        return disputeHistoryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Dispute dispute, Continuation<? super Flow<? extends MinervaTransaction>> continuation) {
        return ((DisputeHistoryStore3) create(dispute, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Context7.buffer$default(RxConvert.asFlow(this.this$0.cardTransactionHistoryStore.streamCardTransaction$lib_store_cash_externalDebug(new TransactionReference(((Dispute) this.L$0).getSettlementEvent(), HistoryTransactionType.SETTLED_CARD_TRANSACTION, "", null, false, 24, null), CardTransaction.Status.SETTLED)), Integer.MAX_VALUE, null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
