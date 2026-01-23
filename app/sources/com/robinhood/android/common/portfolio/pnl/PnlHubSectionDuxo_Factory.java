package com.robinhood.android.common.portfolio.pnl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: PnlHubSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB¡\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "newTagShownPref", "Lcom/robinhood/prefs/IntPreference;", "displayCurrencyPref", "nowIncludesCryptoTooltipShownPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PnlHubSectionDuxo_Factory implements Factory<PnlHubSectionDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<Clock> clock;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<IntPreference> displayCurrencyPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> newTagShownPref;
    private final Provider<BooleanPreference> nowIncludesCryptoTooltipShownPref;
    private final Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PnlHubSectionDuxo_Factory create(Provider<UserStore> provider, Provider<AccountAccessStore> provider2, Provider<RegionGateProvider> provider3, Provider<ProfitAndLossHubSectionStore> provider4, Provider<ExperimentsStore> provider5, Provider<Clock> provider6, Provider<CryptoExperimentsStore> provider7, Provider<BooleanPreference> provider8, Provider<IntPreference> provider9, Provider<BooleanPreference> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final PnlHubSectionDuxo newInstance(UserStore userStore, AccountAccessStore accountAccessStore, RegionGateProvider regionGateProvider, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, ExperimentsStore experimentsStore, Clock clock, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference booleanPreference, IntPreference intPreference, BooleanPreference booleanPreference2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(userStore, accountAccessStore, regionGateProvider, profitAndLossHubSectionStore, experimentsStore, clock, cryptoExperimentsStore, booleanPreference, intPreference, booleanPreference2, duxoBundle);
    }

    public PnlHubSectionDuxo_Factory(Provider<UserStore> userStore, Provider<AccountAccessStore> accountAccessStore, Provider<RegionGateProvider> regionGateProvider, Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> newTagShownPref, Provider<IntPreference> displayCurrencyPref, Provider<BooleanPreference> nowIncludesCryptoTooltipShownPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(newTagShownPref, "newTagShownPref");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(nowIncludesCryptoTooltipShownPref, "nowIncludesCryptoTooltipShownPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.accountAccessStore = accountAccessStore;
        this.regionGateProvider = regionGateProvider;
        this.profitAndLossHubSectionStore = profitAndLossHubSectionStore;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.newTagShownPref = newTagShownPref;
        this.displayCurrencyPref = displayCurrencyPref;
        this.nowIncludesCryptoTooltipShownPref = nowIncludesCryptoTooltipShownPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PnlHubSectionDuxo get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        ProfitAndLossHubSectionStore profitAndLossHubSectionStore = this.profitAndLossHubSectionStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossHubSectionStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.newTagShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.displayCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.nowIncludesCryptoTooltipShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(userStore, accountAccessStore, regionGateProvider, profitAndLossHubSectionStore, experimentsStore, clock, cryptoExperimentsStore, booleanPreference, intPreference, booleanPreference2, duxoBundle);
    }

    /* compiled from: PnlHubSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "newTagShownPref", "Lcom/robinhood/prefs/IntPreference;", "displayCurrencyPref", "nowIncludesCryptoTooltipShownPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo_Factory;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "newInstance", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PnlHubSectionDuxo_Factory create(Provider<UserStore> userStore, Provider<AccountAccessStore> accountAccessStore, Provider<RegionGateProvider> regionGateProvider, Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> newTagShownPref, Provider<IntPreference> displayCurrencyPref, Provider<BooleanPreference> nowIncludesCryptoTooltipShownPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(newTagShownPref, "newTagShownPref");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(nowIncludesCryptoTooltipShownPref, "nowIncludesCryptoTooltipShownPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PnlHubSectionDuxo_Factory(userStore, accountAccessStore, regionGateProvider, profitAndLossHubSectionStore, experimentsStore, clock, cryptoExperimentsStore, newTagShownPref, displayCurrencyPref, nowIncludesCryptoTooltipShownPref, duxoBundle);
        }

        @JvmStatic
        public final PnlHubSectionDuxo newInstance(UserStore userStore, AccountAccessStore accountAccessStore, RegionGateProvider regionGateProvider, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, ExperimentsStore experimentsStore, Clock clock, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference newTagShownPref, IntPreference displayCurrencyPref, BooleanPreference nowIncludesCryptoTooltipShownPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(newTagShownPref, "newTagShownPref");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(nowIncludesCryptoTooltipShownPref, "nowIncludesCryptoTooltipShownPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PnlHubSectionDuxo(userStore, accountAccessStore, regionGateProvider, profitAndLossHubSectionStore, experimentsStore, clock, cryptoExperimentsStore, newTagShownPref, displayCurrencyPref, nowIncludesCryptoTooltipShownPref, duxoBundle);
        }
    }
}
