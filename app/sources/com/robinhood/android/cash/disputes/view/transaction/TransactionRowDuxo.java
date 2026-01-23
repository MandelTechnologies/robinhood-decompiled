package com.robinhood.android.cash.disputes.view.transaction;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.MerchantStore;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import com.robinhood.shared.history.formatters.legacy.CardTransactionFormatter;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowViewState;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "merchantStore", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MerchantStore;Landroid/view/View;)V", "cardTransactionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "onCreate", "", "setCardTransaction", "cardTransaction", "isDuplicateTransaction", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionRowDuxo extends ViewDuxo<TransactionRowViewState> {
    public static final int $stable = 8;
    private final CardTransactionFormatter cardTransactionFormatter;
    private final BehaviorRelay<SettledCardTransaction> cardTransactionRelay;
    private final CardTransactionStore cardTransactionStore;
    private final MerchantStore merchantStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRowDuxo(CardTransactionFormatter cardTransactionFormatter, CardTransactionStore cardTransactionStore, MerchantStore merchantStore, View hostView) {
        super(hostView, new TransactionRowViewState(null, false, null, null, 15, null), null, 4, null);
        Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(merchantStore, "merchantStore");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.cardTransactionFormatter = cardTransactionFormatter;
        this.cardTransactionStore = cardTransactionStore;
        this.merchantStore = merchantStore;
        BehaviorRelay<SettledCardTransaction> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.cardTransactionRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<R> observableSwitchMap = this.cardTransactionRelay.switchMap(new Function() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionRowDuxo$onCreate$$inlined$switchMap$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((TransactionRowDuxo$onCreate$$inlined$switchMap$1<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Observable optionals;
                Intrinsics.checkNotNullParameter(t, "t");
                SettledCardTransaction settledCardTransaction = (SettledCardTransaction) t;
                CardTransactionStore.refresh$default(this.this$0.cardTransactionStore, settledCardTransaction.getStatus(), settledCardTransaction.getId(), false, 4, null);
                UUID merchantId = settledCardTransaction.getMerchantId();
                if (merchantId != null) {
                    MerchantStore.refreshMerchant$default(this.this$0.merchantStore, merchantId, false, 2, null);
                    optionals = ObservablesKt.toOptionals(this.this$0.merchantStore.streamMerchant(merchantId));
                } else {
                    optionals = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(optionals, "just(...)");
                }
                return optionals.map(new Function() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionRowDuxo$onCreate$$inlined$switchMap$1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(Optional<? extends UiMerchant> u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Object obj = t;
                        Intrinsics.checkNotNull(obj);
                        return (R) new MinervaTransaction.FromCard((SettledCardTransaction) obj, false, u.component1(), null, 8, null);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionRowDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.onCreate$lambda$3(this.f$0, (MinervaTransaction.FromCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final TransactionRowDuxo transactionRowDuxo, final MinervaTransaction.FromCard minervaTransaction) {
        Intrinsics.checkNotNullParameter(minervaTransaction, "minervaTransaction");
        transactionRowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionRowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.onCreate$lambda$3$lambda$2(this.f$0, minervaTransaction, (TransactionRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowViewState onCreate$lambda$3$lambda$2(TransactionRowDuxo transactionRowDuxo, MinervaTransaction.FromCard fromCard, TransactionRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionRowViewState.copy$default(applyMutation, transactionRowDuxo.cardTransactionFormatter.getSecondaryText((CardTransactionFormatter) fromCard), false, transactionRowDuxo.cardTransactionFormatter.getPrimaryText(fromCard), transactionRowDuxo.cardTransactionFormatter.getAmountText(fromCard), 2, null);
    }

    public static /* synthetic */ void setCardTransaction$default(TransactionRowDuxo transactionRowDuxo, SettledCardTransaction settledCardTransaction, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        transactionRowDuxo.setCardTransaction(settledCardTransaction, z);
    }

    public final void setCardTransaction(SettledCardTransaction cardTransaction, final boolean isDuplicateTransaction) {
        Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
        this.cardTransactionRelay.accept(cardTransaction);
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionRowDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.setCardTransaction$lambda$4(isDuplicateTransaction, (TransactionRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowViewState setCardTransaction$lambda$4(boolean z, TransactionRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionRowViewState.copy$default(applyMutation, null, z, null, null, 13, null);
    }
}
