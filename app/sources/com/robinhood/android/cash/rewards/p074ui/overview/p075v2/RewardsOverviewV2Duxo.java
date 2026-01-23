package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.p074ui.overview.p075v2.RewardsOverviewV2Duxo;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.RoundupOverviewStore;
import com.robinhood.librobinhood.data.store.RoundupTransactionsStore;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.RoundupOverview;
import com.robinhood.models.p320db.mcduckling.RoundupPendingTransactions;
import com.robinhood.models.p320db.mcduckling.RoundupTransactions;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RewardsOverviewV2Duxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupOverviewStore", "Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;", "roundupTransactionsStore", "Lcom/robinhood/librobinhood/data/store/RoundupTransactionsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;Lcom/robinhood/librobinhood/data/store/RoundupTransactionsStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/CardTransactionStore;)V", "onCreate", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOverviewV2Duxo extends OldBaseDuxo<RewardsOverviewV2ViewState> {
    public static final int $stable = 8;
    private final CardTransactionStore cardTransactionStore;
    private final HistoryStore historyStore;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final RoundupOverviewStore roundupOverviewStore;
    private final RoundupTransactionsStore roundupTransactionsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOverviewV2Duxo(RoundupEnrollmentStore roundupEnrollmentStore, RoundupOverviewStore roundupOverviewStore, RoundupTransactionsStore roundupTransactionsStore, HistoryStore historyStore, CardTransactionStore cardTransactionStore) {
        super(new RewardsOverviewV2ViewState(null, null, null, null, null, null, null, null, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(roundupOverviewStore, "roundupOverviewStore");
        Intrinsics.checkNotNullParameter(roundupTransactionsStore, "roundupTransactionsStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.roundupOverviewStore = roundupOverviewStore;
        this.roundupTransactionsStore = roundupTransactionsStore;
        this.historyStore = historyStore;
        this.cardTransactionStore = cardTransactionStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.roundupOverviewStore.refresh(true);
        this.roundupTransactionsStore.refreshPendingTransactions(true);
        Observable<RoundupEnrollment> observableDistinctUntilChanged = this.roundupEnrollmentStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$1(this.f$0, (RoundupEnrollment) obj);
            }
        });
        Observable<R> observableSwitchMap = this.roundupTransactionsStore.streamPendingTransactions().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CardTransaction>> apply(RoundupPendingTransactions roundupPendingTransactions) {
                Intrinsics.checkNotNullParameter(roundupPendingTransactions, "roundupPendingTransactions");
                List<UUID> pendingTransactions = roundupPendingTransactions.getPendingTransactions();
                if (pendingTransactions != null) {
                    return RewardsOverviewV2Duxo.this.cardTransactionStore.streamTransactions(CardTransaction.Status.PENDING, pendingTransactions);
                }
                Observable observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$3(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap2 = this.roundupOverviewStore.stream().distinctUntilChanged().switchMap(new C102774()).switchMap(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo.onCreate.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CardTransaction>> apply(RoundupTransactions roundupTransactions) {
                Intrinsics.checkNotNullParameter(roundupTransactions, "roundupTransactions");
                List<UUID> associatedTransactions = roundupTransactions.getAssociatedTransactions();
                if (associatedTransactions != null) {
                    return RewardsOverviewV2Duxo.this.cardTransactionStore.streamTransactions(CardTransaction.Status.SETTLED, associatedTransactions);
                }
                Observable observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$5(this.f$0, (List) obj);
            }
        });
        HistoryStore historyStore = this.historyStore;
        Observable observableJust = Observable.just(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableJust2 = Observable.just(HistoryFilter.ROUNDUP_REWARD.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Observable observableJust3 = Observable.just(Instant.EPOCH);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$7(this.f$0, (PagedList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOverviewV2Duxo rewardsOverviewV2Duxo, final RoundupEnrollment roundupEnrollment) {
        rewardsOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$1$lambda$0(roundupEnrollment, (RewardsOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewV2ViewState onCreate$lambda$1$lambda$0(RoundupEnrollment roundupEnrollment, RewardsOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewV2ViewState.copy$default(applyMutation, roundupEnrollment.getState(), roundupEnrollment.getCreatedAt(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RewardsOverviewV2Duxo rewardsOverviewV2Duxo, final List list) {
        rewardsOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$3$lambda$2(list, (RewardsOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewV2ViewState onCreate$lambda$3$lambda$2(List list, RewardsOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewV2ViewState.copy$default(applyMutation, null, null, null, null, null, null, list, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* compiled from: RewardsOverviewV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$onCreate$4 */
    static final class C102774<T, R> implements Function {
        C102774() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends RoundupTransactions> apply(final RoundupOverview roundupOverview) {
            Intrinsics.checkNotNullParameter(roundupOverview, "roundupOverview");
            RewardsOverviewV2Duxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$onCreate$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOverviewV2Duxo.C102774.apply$lambda$0(roundupOverview, (RewardsOverviewV2ViewState) obj);
                }
            });
            UUID openRoundupId = roundupOverview.getOpenRoundupId();
            if (openRoundupId != null) {
                RewardsOverviewV2Duxo.this.roundupTransactionsStore.refresh(openRoundupId, true);
                return RewardsOverviewV2Duxo.this.roundupTransactionsStore.stream(openRoundupId);
            }
            Observable observableJust = Observable.just(RoundupTransactions.INSTANCE.getEMPTY_ROUNDUP_TRANSACTIONS());
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOverviewV2ViewState apply$lambda$0(RoundupOverview roundupOverview, RewardsOverviewV2ViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOverviewV2ViewState.copy$default(applyMutation, null, null, roundupOverview.getRoundupInvested(), roundupOverview.getRoundupMatched(), roundupOverview.getRoundupPending(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(RewardsOverviewV2Duxo rewardsOverviewV2Duxo, final List list) {
        rewardsOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$5$lambda$4(list, (RewardsOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewV2ViewState onCreate$lambda$5$lambda$4(List list, RewardsOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewV2ViewState.copy$default(applyMutation, null, null, null, null, null, null, null, list, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(RewardsOverviewV2Duxo rewardsOverviewV2Duxo, final PagedList historyItems) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        rewardsOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewV2Duxo.onCreate$lambda$7$lambda$6(historyItems, (RewardsOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewV2ViewState onCreate$lambda$7$lambda$6(PagedList pagedList, RewardsOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewV2ViewState.copy$default(applyMutation, null, null, null, null, null, pagedList, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }
}
