package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CardTransactionHistoryStore;
import com.robinhood.models.p320db.mcduckling.CardReward;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.PendingCardTransaction;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CardTransactionHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CardTransactionHistoryStore;", "Lcom/robinhood/store/Store;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "merchantStore", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MerchantStore;Lcom/robinhood/store/StoreBundle;)V", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamCardTransaction", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "status", "Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;", "streamCardTransaction$lib_store_cash_externalDebug", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CardTransactionHistoryStore extends Store {
    private final CardTransactionStore cardTransactionStore;
    private final MerchantStore merchantStore;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: CardTransactionHistoryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTransaction.Status.values().length];
            try {
                iArr[CardTransaction.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTransaction.Status.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionHistoryStore(CardTransactionStore cardTransactionStore, MerchantStore merchantStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(merchantStore, "merchantStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cardTransactionStore = cardTransactionStore;
        this.merchantStore = merchantStore;
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CardTransactionHistoryStore$transactionLoader$1

            /* compiled from: CardTransactionHistoryStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.CardTransactionHistoryStore$transactionLoader$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HistoryTransactionType.values().length];
                    try {
                        iArr[HistoryTransactionType.PENDING_CARD_TRANSACTION.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HistoryTransactionType.SETTLED_CARD_TRANSACTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HistoryTransactionType.DECLINED_CARD_TRANSACTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
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
                CardTransaction.Status status;
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), CardTransactionHistoryStore3.getCardTransactionTypes());
                int i = WhenMappings.$EnumSwitchMapping$0[reference.getSourceType().ordinal()];
                if (i == 1) {
                    status = CardTransaction.Status.PENDING;
                } else if (i == 2) {
                    status = CardTransaction.Status.SETTLED;
                } else if (i == 3) {
                    status = CardTransaction.Status.DECLINED;
                } else {
                    throw new IllegalArgumentException("Invalid transaction type: " + reference.getSourceType());
                }
                return Context7.buffer$default(RxConvert.asFlow(this.this$0.streamCardTransaction$lib_store_cash_externalDebug(reference, status)), Integer.MAX_VALUE, null, 2, null);
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final Observable<MinervaTransaction> streamCardTransaction$lib_store_cash_externalDebug(TransactionReference reference, final CardTransaction.Status status) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(status, "status");
        HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), CardTransactionHistoryStore3.getCardTransactionTypes());
        UUID sourceId = reference.getSourceId();
        CardTransactionStore.refresh$default(this.cardTransactionStore, status, sourceId, false, 4, null);
        Observable observableSwitchMap = this.cardTransactionStore.streamTransaction(status, sourceId).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CardTransactionHistoryStore$streamCardTransaction$$inlined$switchMap$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C33632x633d82f7<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Observable optionals;
                Intrinsics.checkNotNullParameter(t, "t");
                UUID merchantId = ((CardTransaction) t).getMerchantId();
                if (merchantId != null) {
                    MerchantStore.refreshMerchant$default(this.this$0.merchantStore, merchantId, false, 2, null);
                    optionals = ObservablesKt.toOptionals(this.this$0.merchantStore.streamMerchant(merchantId));
                } else {
                    optionals = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(optionals, "just(...)");
                }
                final CardTransaction.Status status2 = status;
                return optionals.map(new Function() { // from class: com.robinhood.librobinhood.data.store.CardTransactionHistoryStore$streamCardTransaction$$inlined$switchMap$1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(Optional<? extends UiMerchant> u) {
                        List<CardReward> rewards;
                        Intrinsics.checkNotNullParameter(u, "u");
                        Object obj = t;
                        Intrinsics.checkNotNull(obj);
                        CardTransaction cardTransaction = (CardTransaction) obj;
                        UiMerchant uiMerchantComponent1 = u.component1();
                        int i = CardTransactionHistoryStore.WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                        if (i == 1) {
                            rewards = ((PendingCardTransaction) cardTransaction).getRewards();
                        } else {
                            rewards = i != 2 ? null : ((SettledCardTransaction) cardTransaction).getRewards();
                        }
                        return (R) new MinervaTransaction.FromCard(cardTransaction, true, uiMerchantComponent1, rewards);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
