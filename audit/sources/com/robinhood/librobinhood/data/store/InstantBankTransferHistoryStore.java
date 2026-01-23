package com.robinhood.librobinhood.data.store;

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

/* compiled from: InstantBankTransferHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstantBankTransferHistoryStore;", "Lcom/robinhood/store/Store;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/store/StoreBundle;)V", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstantBankTransferHistoryStore extends Store {
    private final AchRelationshipStore achRelationshipStore;
    private final PaymentTransferStore paymentTransferStore;
    private final HistoryTransactionLoader transactionLoader;

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantBankTransferHistoryStore(AchRelationshipStore achRelationshipStore, PaymentTransferStore paymentTransferStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.achRelationshipStore = achRelationshipStore;
        this.paymentTransferStore = paymentTransferStore;
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.InstantBankTransferHistoryStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.INSTANT_BANK_TRANSFER);
                return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(this.this$0.paymentTransferStore, reference.getSourceId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null), new C33899x31cf3d83(null, this.this$0));
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }
}
