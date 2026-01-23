package com.robinhood.android.crypto.pulse.feed;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoPulseFeedDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¡\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseFeedDuxo_Factory implements Factory<CryptoPulseFeedDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Clock> clock;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoPulseStore> cryptoPulseStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<LazyMoshi> moshi;
    private final Provider<NotificationSettingStore> notificationSettingStore;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoPulseFeedStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoPulseFeedDuxo_Factory create(Provider<AccountProvider> provider, Provider<CryptoPulseStore> provider2, Provider<CryptoExperimentsStore> provider3, Provider<ExperimentsProvider> provider4, Provider<NotificationSettingStore> provider5, Provider<PerformanceChartStore> provider6, Provider<Clock> provider7, Provider<DuxoBundle> provider8, Provider<LazyMoshi> provider9, Provider<CryptoPulseFeedStateProvider> provider10, Provider<SavedStateHandle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final CryptoPulseFeedDuxo newInstance(AccountProvider accountProvider, CryptoPulseStore cryptoPulseStore, CryptoExperimentsStore cryptoExperimentsStore, ExperimentsProvider experimentsProvider, NotificationSettingStore notificationSettingStore, PerformanceChartStore performanceChartStore, Clock clock, DuxoBundle duxoBundle, LazyMoshi lazyMoshi, CryptoPulseFeedStateProvider cryptoPulseFeedStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, cryptoPulseStore, cryptoExperimentsStore, experimentsProvider, notificationSettingStore, performanceChartStore, clock, duxoBundle, lazyMoshi, cryptoPulseFeedStateProvider, savedStateHandle);
    }

    public CryptoPulseFeedDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<CryptoPulseStore> cryptoPulseStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<ExperimentsProvider> experimentsProvider, Provider<NotificationSettingStore> notificationSettingStore, Provider<PerformanceChartStore> performanceChartStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<LazyMoshi> moshi, Provider<CryptoPulseFeedStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.cryptoPulseStore = cryptoPulseStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.experimentsProvider = experimentsProvider;
        this.notificationSettingStore = notificationSettingStore;
        this.performanceChartStore = performanceChartStore;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.moshi = moshi;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoPulseFeedDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoPulseStore cryptoPulseStore = this.cryptoPulseStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPulseStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        NotificationSettingStore notificationSettingStore = this.notificationSettingStore.get();
        Intrinsics.checkNotNullExpressionValue(notificationSettingStore, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        CryptoPulseFeedStateProvider cryptoPulseFeedStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPulseFeedStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, cryptoPulseStore, cryptoExperimentsStore, experimentsProvider, notificationSettingStore, performanceChartStore, clock, duxoBundle, lazyMoshi, cryptoPulseFeedStateProvider, savedStateHandle);
    }

    /* compiled from: CryptoPulseFeedDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJg\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo_Factory;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedStateProvider;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoPulseFeedDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<CryptoPulseStore> cryptoPulseStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<ExperimentsProvider> experimentsProvider, Provider<NotificationSettingStore> notificationSettingStore, Provider<PerformanceChartStore> performanceChartStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<LazyMoshi> moshi, Provider<CryptoPulseFeedStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoPulseFeedDuxo_Factory(accountProvider, cryptoPulseStore, cryptoExperimentsStore, experimentsProvider, notificationSettingStore, performanceChartStore, clock, duxoBundle, moshi, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final CryptoPulseFeedDuxo newInstance(AccountProvider accountProvider, CryptoPulseStore cryptoPulseStore, CryptoExperimentsStore cryptoExperimentsStore, ExperimentsProvider experimentsProvider, NotificationSettingStore notificationSettingStore, PerformanceChartStore performanceChartStore, Clock clock, DuxoBundle duxoBundle, LazyMoshi moshi, CryptoPulseFeedStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoPulseFeedDuxo(accountProvider, cryptoPulseStore, cryptoExperimentsStore, experimentsProvider, notificationSettingStore, performanceChartStore, clock, duxoBundle, moshi, stateProvider, savedStateHandle);
        }
    }
}
