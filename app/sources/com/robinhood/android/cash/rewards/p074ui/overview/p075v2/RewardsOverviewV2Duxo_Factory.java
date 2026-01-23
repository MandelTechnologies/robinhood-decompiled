package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.RoundupOverviewStore;
import com.robinhood.librobinhood.data.store.RoundupTransactionsStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOverviewV2Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo;", "roundupEnrollmentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupOverviewStore", "Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;", "roundupTransactionsStore", "Lcom/robinhood/librobinhood/data/store/RoundupTransactionsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RewardsOverviewV2Duxo_Factory implements Factory<RewardsOverviewV2Duxo> {
    private final Provider<CardTransactionStore> cardTransactionStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<HistoryStore> historyStore;
    private final Provider<RoundupEnrollmentStore> roundupEnrollmentStore;
    private final Provider<RoundupOverviewStore> roundupOverviewStore;
    private final Provider<RoundupTransactionsStore> roundupTransactionsStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RewardsOverviewV2Duxo_Factory create(Provider<RoundupEnrollmentStore> provider, Provider<RoundupOverviewStore> provider2, Provider<RoundupTransactionsStore> provider3, Provider<HistoryStore> provider4, Provider<CardTransactionStore> provider5, Provider<DispatcherProvider> provider6, Provider<RxFactory> provider7, Provider<RxGlobalErrorHandler> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final RewardsOverviewV2Duxo newInstance(RoundupEnrollmentStore roundupEnrollmentStore, RoundupOverviewStore roundupOverviewStore, RoundupTransactionsStore roundupTransactionsStore, HistoryStore historyStore, CardTransactionStore cardTransactionStore) {
        return INSTANCE.newInstance(roundupEnrollmentStore, roundupOverviewStore, roundupTransactionsStore, historyStore, cardTransactionStore);
    }

    public RewardsOverviewV2Duxo_Factory(Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<RoundupOverviewStore> roundupOverviewStore, Provider<RoundupTransactionsStore> roundupTransactionsStore, Provider<HistoryStore> historyStore, Provider<CardTransactionStore> cardTransactionStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(roundupOverviewStore, "roundupOverviewStore");
        Intrinsics.checkNotNullParameter(roundupTransactionsStore, "roundupTransactionsStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.roundupOverviewStore = roundupOverviewStore;
        this.roundupTransactionsStore = roundupTransactionsStore;
        this.historyStore = historyStore;
        this.cardTransactionStore = cardTransactionStore;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RewardsOverviewV2Duxo get() {
        Companion companion = INSTANCE;
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupEnrollmentStore, "get(...)");
        RoundupOverviewStore roundupOverviewStore = this.roundupOverviewStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupOverviewStore, "get(...)");
        RoundupTransactionsStore roundupTransactionsStore = this.roundupTransactionsStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupTransactionsStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        CardTransactionStore cardTransactionStore = this.cardTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(cardTransactionStore, "get(...)");
        RewardsOverviewV2Duxo rewardsOverviewV2DuxoNewInstance = companion.newInstance(roundupEnrollmentStore, roundupOverviewStore, roundupTransactionsStore, historyStore, cardTransactionStore);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rewardsOverviewV2DuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rewardsOverviewV2DuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rewardsOverviewV2DuxoNewInstance, rxGlobalErrorHandler);
        return rewardsOverviewV2DuxoNewInstance;
    }

    /* compiled from: RewardsOverviewV2Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo_Factory;", "roundupEnrollmentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupOverviewStore", "Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;", "roundupTransactionsStore", "Lcom/robinhood/librobinhood/data/store/RoundupTransactionsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RewardsOverviewV2Duxo_Factory create(Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<RoundupOverviewStore> roundupOverviewStore, Provider<RoundupTransactionsStore> roundupTransactionsStore, Provider<HistoryStore> historyStore, Provider<CardTransactionStore> cardTransactionStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(roundupOverviewStore, "roundupOverviewStore");
            Intrinsics.checkNotNullParameter(roundupTransactionsStore, "roundupTransactionsStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RewardsOverviewV2Duxo_Factory(roundupEnrollmentStore, roundupOverviewStore, roundupTransactionsStore, historyStore, cardTransactionStore, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RewardsOverviewV2Duxo newInstance(RoundupEnrollmentStore roundupEnrollmentStore, RoundupOverviewStore roundupOverviewStore, RoundupTransactionsStore roundupTransactionsStore, HistoryStore historyStore, CardTransactionStore cardTransactionStore) {
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(roundupOverviewStore, "roundupOverviewStore");
            Intrinsics.checkNotNullParameter(roundupTransactionsStore, "roundupTransactionsStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
            return new RewardsOverviewV2Duxo(roundupEnrollmentStore, roundupOverviewStore, roundupTransactionsStore, historyStore, cardTransactionStore);
        }
    }
}
