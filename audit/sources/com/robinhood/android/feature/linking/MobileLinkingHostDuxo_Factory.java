package com.robinhood.android.feature.linking;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.store.linking.MobileLinkingStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PriceBookExistenceStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingHostDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "mobileLinkingStore", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MobileLinkingHostDuxo_Factory implements Factory<MobileLinkingHostDuxo> {
    private final Provider<AccountStore> accountStore;
    private final Provider<InstrumentAccountSwitcherStore> accountSwitcherStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesProductStore> futuresProductStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MobileLinkingStore> mobileLinkingStore;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<PriceBookExistenceStore> priceBookExistenceStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MobileLinkingHostDuxo_Factory create(Provider<AccountStore> provider, Provider<MobileLinkingStore> provider2, Provider<InstrumentStore> provider3, Provider<FuturesProductStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<PerformanceChartStore> provider6, Provider<CryptoQuoteStore> provider7, Provider<PriceBookExistenceStore> provider8, Provider<LockscreenManager> provider9, Provider<InstrumentAccountSwitcherStore> provider10, Provider<SavedStateHandle> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final MobileLinkingHostDuxo newInstance(AccountStore accountStore, MobileLinkingStore mobileLinkingStore, InstrumentStore instrumentStore, FuturesProductStore futuresProductStore, TraderMarketHoursManager traderMarketHoursManager, PerformanceChartStore performanceChartStore, CryptoQuoteStore cryptoQuoteStore, PriceBookExistenceStore priceBookExistenceStore, LockscreenManager lockscreenManager, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountStore, mobileLinkingStore, instrumentStore, futuresProductStore, traderMarketHoursManager, performanceChartStore, cryptoQuoteStore, priceBookExistenceStore, lockscreenManager, instrumentAccountSwitcherStore, savedStateHandle, duxoBundle);
    }

    public MobileLinkingHostDuxo_Factory(Provider<AccountStore> accountStore, Provider<MobileLinkingStore> mobileLinkingStore, Provider<InstrumentStore> instrumentStore, Provider<FuturesProductStore> futuresProductStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PerformanceChartStore> performanceChartStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<PriceBookExistenceStore> priceBookExistenceStore, Provider<LockscreenManager> lockscreenManager, Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(mobileLinkingStore, "mobileLinkingStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountStore = accountStore;
        this.mobileLinkingStore = mobileLinkingStore;
        this.instrumentStore = instrumentStore;
        this.futuresProductStore = futuresProductStore;
        this.marketHoursManager = marketHoursManager;
        this.performanceChartStore = performanceChartStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.priceBookExistenceStore = priceBookExistenceStore;
        this.lockscreenManager = lockscreenManager;
        this.accountSwitcherStore = accountSwitcherStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public MobileLinkingHostDuxo get() {
        Companion companion = INSTANCE;
        AccountStore accountStore = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(accountStore, "get(...)");
        MobileLinkingStore mobileLinkingStore = this.mobileLinkingStore.get();
        Intrinsics.checkNotNullExpressionValue(mobileLinkingStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        FuturesProductStore futuresProductStore = this.futuresProductStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        PriceBookExistenceStore priceBookExistenceStore = this.priceBookExistenceStore.get();
        Intrinsics.checkNotNullExpressionValue(priceBookExistenceStore, "get(...)");
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.accountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountStore, mobileLinkingStore, instrumentStore, futuresProductStore, traderMarketHoursManager, performanceChartStore, cryptoQuoteStore, priceBookExistenceStore, lockscreenManager, instrumentAccountSwitcherStore, savedStateHandle, duxoBundle);
    }

    /* compiled from: MobileLinkingHostDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo_Factory;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "mobileLinkingStore", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MobileLinkingHostDuxo_Factory create(Provider<AccountStore> accountStore, Provider<MobileLinkingStore> mobileLinkingStore, Provider<InstrumentStore> instrumentStore, Provider<FuturesProductStore> futuresProductStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PerformanceChartStore> performanceChartStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<PriceBookExistenceStore> priceBookExistenceStore, Provider<LockscreenManager> lockscreenManager, Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(mobileLinkingStore, "mobileLinkingStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MobileLinkingHostDuxo_Factory(accountStore, mobileLinkingStore, instrumentStore, futuresProductStore, marketHoursManager, performanceChartStore, cryptoQuoteStore, priceBookExistenceStore, lockscreenManager, accountSwitcherStore, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final MobileLinkingHostDuxo newInstance(AccountStore accountStore, MobileLinkingStore mobileLinkingStore, InstrumentStore instrumentStore, FuturesProductStore futuresProductStore, TraderMarketHoursManager marketHoursManager, PerformanceChartStore performanceChartStore, CryptoQuoteStore cryptoQuoteStore, PriceBookExistenceStore priceBookExistenceStore, LockscreenManager lockscreenManager, InstrumentAccountSwitcherStore accountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(mobileLinkingStore, "mobileLinkingStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MobileLinkingHostDuxo(accountStore, mobileLinkingStore, instrumentStore, futuresProductStore, marketHoursManager, performanceChartStore, cryptoQuoteStore, priceBookExistenceStore, lockscreenManager, accountSwitcherStore, savedStateHandle, duxoBundle);
        }
    }
}
