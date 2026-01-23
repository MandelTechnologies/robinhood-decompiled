package com.robinhood.android.common.recurring.schedule;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderScheduleDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "directDepositRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "markwon", "Lio/noties/markwon/Markwon;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringOrderScheduleDuxo_Factory implements Factory<RecurringOrderScheduleDuxo> {
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EtpDetailsStore> etpDetailsStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;
    private final Provider<Markwon> markwon;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringOrderScheduleDuxo_Factory create(Provider<DirectDepositRelationshipStore> provider, Provider<TraderInvestmentScheduleStore> provider2, Provider<RhyAccountStore> provider3, Provider<StaticContentStore> provider4, Provider<EtpDetailsStore> provider5, Provider<InstrumentStore> provider6, Provider<Markwon> provider7, Provider<SavedStateHandle> provider8, Provider<DispatcherProvider> provider9, Provider<RxFactory> provider10, Provider<RxGlobalErrorHandler> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final RecurringOrderScheduleDuxo newInstance(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore traderInvestmentScheduleStore, RhyAccountStore rhyAccountStore, StaticContentStore staticContentStore, EtpDetailsStore etpDetailsStore, InstrumentStore instrumentStore, Markwon markwon, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(directDepositRelationshipStore, traderInvestmentScheduleStore, rhyAccountStore, staticContentStore, etpDetailsStore, instrumentStore, markwon, savedStateHandle);
    }

    public RecurringOrderScheduleDuxo_Factory(Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<RhyAccountStore> rhyAccountStore, Provider<StaticContentStore> staticContentStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<InstrumentStore> instrumentStore, Provider<Markwon> markwon, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.rhyAccountStore = rhyAccountStore;
        this.staticContentStore = staticContentStore;
        this.etpDetailsStore = etpDetailsStore;
        this.instrumentStore = instrumentStore;
        this.markwon = markwon;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecurringOrderScheduleDuxo get() {
        Companion companion = INSTANCE;
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        EtpDetailsStore etpDetailsStore = this.etpDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(etpDetailsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecurringOrderScheduleDuxo recurringOrderScheduleDuxoNewInstance = companion.newInstance(directDepositRelationshipStore, traderInvestmentScheduleStore, rhyAccountStore, staticContentStore, etpDetailsStore, instrumentStore, markwon, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recurringOrderScheduleDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recurringOrderScheduleDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recurringOrderScheduleDuxoNewInstance, rxGlobalErrorHandler);
        return recurringOrderScheduleDuxoNewInstance;
    }

    /* compiled from: RecurringOrderScheduleDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo_Factory;", "directDepositRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "markwon", "Lio/noties/markwon/Markwon;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringOrderScheduleDuxo_Factory create(Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<RhyAccountStore> rhyAccountStore, Provider<StaticContentStore> staticContentStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<InstrumentStore> instrumentStore, Provider<Markwon> markwon, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecurringOrderScheduleDuxo_Factory(directDepositRelationshipStore, investmentScheduleStore, rhyAccountStore, staticContentStore, etpDetailsStore, instrumentStore, markwon, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecurringOrderScheduleDuxo newInstance(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, RhyAccountStore rhyAccountStore, StaticContentStore staticContentStore, EtpDetailsStore etpDetailsStore, InstrumentStore instrumentStore, Markwon markwon, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringOrderScheduleDuxo(directDepositRelationshipStore, investmentScheduleStore, rhyAccountStore, staticContentStore, etpDetailsStore, instrumentStore, markwon, savedStateHandle);
        }
    }
}
