package com.robinhood.librobinhood.data.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TwentyFourHourMarketOnboardingBottomSheetManager_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "hasShownAdtOnboardingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TwentyFourHourMarketOnboardingBottomSheetManager_Factory implements Factory<TwentyFourHourMarketOnboardingBottomSheetManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore;
    private final Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;

    @JvmStatic
    public static final TwentyFourHourMarketOnboardingBottomSheetManager_Factory create(Provider<TraderMarketHoursManager> provider, Provider<InstrumentStore> provider2, Provider<AccountProvider> provider3, Provider<EquityTradingSeenStatusStore> provider4, Provider<BooleanPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TwentyFourHourMarketOnboardingBottomSheetManager newInstance(TraderMarketHoursManager traderMarketHoursManager, InstrumentStore instrumentStore, AccountProvider accountProvider, EquityTradingSeenStatusStore equityTradingSeenStatusStore, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(traderMarketHoursManager, instrumentStore, accountProvider, equityTradingSeenStatusStore, booleanPreference);
    }

    public TwentyFourHourMarketOnboardingBottomSheetManager_Factory(Provider<TraderMarketHoursManager> marketHoursManager, Provider<InstrumentStore> instrumentStore, Provider<AccountProvider> accountProvider, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref) {
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        this.marketHoursManager = marketHoursManager;
        this.instrumentStore = instrumentStore;
        this.accountProvider = accountProvider;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
    }

    @Override // javax.inject.Provider
    public TwentyFourHourMarketOnboardingBottomSheetManager get() {
        Companion companion = INSTANCE;
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        EquityTradingSeenStatusStore equityTradingSeenStatusStore = this.equityTradingSeenStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSeenStatusStore, "get(...)");
        BooleanPreference booleanPreference = this.hasShownAdtOnboardingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(traderMarketHoursManager, instrumentStore, accountProvider, equityTradingSeenStatusStore, booleanPreference);
    }

    /* compiled from: TwentyFourHourMarketOnboardingBottomSheetManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager_Factory;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "hasShownAdtOnboardingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TwentyFourHourMarketOnboardingBottomSheetManager_Factory create(Provider<TraderMarketHoursManager> marketHoursManager, Provider<InstrumentStore> instrumentStore, Provider<AccountProvider> accountProvider, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref) {
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            return new TwentyFourHourMarketOnboardingBottomSheetManager_Factory(marketHoursManager, instrumentStore, accountProvider, equityTradingSeenStatusStore, hasShownAdtOnboardingBottomSheetPref);
        }

        @JvmStatic
        public final TwentyFourHourMarketOnboardingBottomSheetManager newInstance(TraderMarketHoursManager marketHoursManager, InstrumentStore instrumentStore, AccountProvider accountProvider, EquityTradingSeenStatusStore equityTradingSeenStatusStore, BooleanPreference hasShownAdtOnboardingBottomSheetPref) {
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            return new TwentyFourHourMarketOnboardingBottomSheetManager(marketHoursManager, instrumentStore, accountProvider, equityTradingSeenStatusStore, hasShownAdtOnboardingBottomSheetPref);
        }
    }
}
