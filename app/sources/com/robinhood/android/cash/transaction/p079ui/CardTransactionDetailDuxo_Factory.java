package com.robinhood.android.cash.transaction.p079ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.shared.history.formatters.legacy.CardTransactionFormatter;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "cardTransactionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CardTransactionDetailDuxo_Factory implements Factory<CardTransactionDetailDuxo> {
    private final Provider<CardTransactionFormatter> cardTransactionFormatter;
    private final Provider<CardTransactionStore> cardTransactionStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<HistoryTransactionStore> historyTransactionStore;
    private final Provider<Minerva> minerva;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CardTransactionDetailDuxo_Factory create(Provider<CardTransactionStore> provider, Provider<Minerva> provider2, Provider<HistoryTransactionStore> provider3, Provider<CardTransactionFormatter> provider4, Provider<PaymentCardStore> provider5, Provider<ExperimentsStore> provider6, Provider<SavedStateHandle> provider7, Provider<DispatcherProvider> provider8, Provider<RxFactory> provider9, Provider<RxGlobalErrorHandler> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CardTransactionDetailDuxo newInstance(CardTransactionStore cardTransactionStore, Minerva minerva, HistoryTransactionStore historyTransactionStore, CardTransactionFormatter cardTransactionFormatter, PaymentCardStore paymentCardStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cardTransactionStore, minerva, historyTransactionStore, cardTransactionFormatter, paymentCardStore, experimentsStore, savedStateHandle);
    }

    public CardTransactionDetailDuxo_Factory(Provider<CardTransactionStore> cardTransactionStore, Provider<Minerva> minerva, Provider<HistoryTransactionStore> historyTransactionStore, Provider<CardTransactionFormatter> cardTransactionFormatter, Provider<PaymentCardStore> paymentCardStore, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.cardTransactionStore = cardTransactionStore;
        this.minerva = minerva;
        this.historyTransactionStore = historyTransactionStore;
        this.cardTransactionFormatter = cardTransactionFormatter;
        this.paymentCardStore = paymentCardStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CardTransactionDetailDuxo get() {
        Companion companion = INSTANCE;
        CardTransactionStore cardTransactionStore = this.cardTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(cardTransactionStore, "get(...)");
        Minerva minerva = this.minerva.get();
        Intrinsics.checkNotNullExpressionValue(minerva, "get(...)");
        HistoryTransactionStore historyTransactionStore = this.historyTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(historyTransactionStore, "get(...)");
        CardTransactionFormatter cardTransactionFormatter = this.cardTransactionFormatter.get();
        Intrinsics.checkNotNullExpressionValue(cardTransactionFormatter, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CardTransactionDetailDuxo cardTransactionDetailDuxoNewInstance = companion.newInstance(cardTransactionStore, minerva, historyTransactionStore, cardTransactionFormatter, paymentCardStore, experimentsStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(cardTransactionDetailDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(cardTransactionDetailDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(cardTransactionDetailDuxoNewInstance, rxGlobalErrorHandler);
        return cardTransactionDetailDuxoNewInstance;
    }

    /* compiled from: CardTransactionDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007J@\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo_Factory;", "cardTransactionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CardTransactionDetailDuxo_Factory create(Provider<CardTransactionStore> cardTransactionStore, Provider<Minerva> minerva, Provider<HistoryTransactionStore> historyTransactionStore, Provider<CardTransactionFormatter> cardTransactionFormatter, Provider<PaymentCardStore> paymentCardStore, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
            Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CardTransactionDetailDuxo_Factory(cardTransactionStore, minerva, historyTransactionStore, cardTransactionFormatter, paymentCardStore, experimentsStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CardTransactionDetailDuxo newInstance(CardTransactionStore cardTransactionStore, Minerva minerva, HistoryTransactionStore historyTransactionStore, CardTransactionFormatter cardTransactionFormatter, PaymentCardStore paymentCardStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
            Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CardTransactionDetailDuxo(cardTransactionStore, minerva, historyTransactionStore, cardTransactionFormatter, paymentCardStore, experimentsStore, savedStateHandle);
        }
    }
}
