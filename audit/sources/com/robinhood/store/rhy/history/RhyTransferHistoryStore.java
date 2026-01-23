package com.robinhood.store.rhy.history;

import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RhyTransferHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\u00020\u0013¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore;", "Lcom/robinhood/store/Store;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Lcom/robinhood/store/StoreBundle;)V", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RhyTransferHistoryStore extends Store {
    private final AchRelationshipStore achRelationshipStore;
    private final DebitCardInstrumentStore debitCardInstrumentStore;
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final PaymentTransferStore paymentTransferStore;
    private final RhyTransferIraInfoStore rhyTransferIraInfoStore;
    private final HistoryTransactionLoader transactionLoader;
    private final TransferAccountStore transferAccountStore;

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTransferHistoryStore(DebitCardInstrumentStore debitCardInstrumentStore, AchRelationshipStore achRelationshipStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, TransferAccountStore transferAccountStore, PaymentTransferStore paymentTransferStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.achRelationshipStore = achRelationshipStore;
        this.rhyTransferIraInfoStore = rhyTransferIraInfoStore;
        this.transferAccountStore = transferAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1

            /* compiled from: RhyTransferHistoryStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TransferType.values().length];
                    try {
                        iArr[TransferType.DEBIT_CARD_TRANSFER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TransferType.ORIGINATED_ACH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TransferType.INSTANT_BANK_TRANSFER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TransferType.OUTGOING_WIRE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TransferType.CHECK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TransferType.ROLLOVER_ACH.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TransferType.UK_BANK_TRANSFER.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[TransferType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[TransferType.INCOMING_WIRE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[TransferType.INTERNAL.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[TransferType.INTER_ENTITY.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[TransferType.INTRA_ENTITY.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[TransferType.NON_ORIGINATED_ACH.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[TransferType.NON_ORIGINATED_ACH_EARLY_PAY.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[TransferType.SG_BANK_WITHDRAWAL.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[TransferType.SEPA_CREDIT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[TransferType.UNKNOWN.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.DEBIT_CARD_TRANSFER, HistoryTransactionType.CHECK_TRANSFER, HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER, HistoryTransactionType.INCOMING_WIRE, HistoryTransactionType.OUTGOING_WIRE, HistoryTransactionType.UK_BANK_TRANSFER, HistoryTransactionType.UK_OPEN_BANKING_TRANSFER, HistoryTransactionType.ROLLOVER_ACH}));
                AchRelationshipStore.refresh$default(this.this$0.achRelationshipStore, false, 1, null);
                TransferAccountStore.refresh$default(this.this$0.transferAccountStore, false, 1, null);
                return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(this.this$0.paymentTransferStore, reference.getSourceId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null), new C41558x95b5249(null, this.this$0));
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }
}
