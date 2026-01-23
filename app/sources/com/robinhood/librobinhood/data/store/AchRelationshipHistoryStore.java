package com.robinhood.librobinhood.data.store;

import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AchRelationshipHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\u00020\r¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AchRelationshipHistoryStore;", "Lcom/robinhood/store/Store;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/store/StoreBundle;)V", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AchRelationshipHistoryStore extends Store {
    private final AccountStore accountStore;
    private final AchRelationshipStore achRelationshipStore;
    private final PaymentTransferStore paymentTransferStore;
    private final HistoryTransactionLoader transactionLoader;

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchRelationshipHistoryStore(PaymentTransferStore paymentTransferStore, AchRelationshipStore achRelationshipStore, AccountStore accountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.paymentTransferStore = paymentTransferStore;
        this.achRelationshipStore = achRelationshipStore;
        this.accountStore = accountStore;
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipHistoryStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ORIGINATED_ACH_TRANSFER);
                AchRelationshipStore.refresh$default(this.this$0.achRelationshipStore, false, 1, null);
                return FlowKt.transformLatest(Operators.combine(Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getAchTransfer$default(this.this$0.paymentTransferStore, reference.getSourceId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(this.this$0.paymentTransferStore, reference.getSourceId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null)), new C33530xa2bb1e19(null, this.this$0));
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }
}
