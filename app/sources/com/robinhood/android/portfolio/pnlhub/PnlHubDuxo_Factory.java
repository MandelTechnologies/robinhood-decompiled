package com.robinhood.android.portfolio.pnlhub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: PnlHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BË\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;", "profitAndLossChartStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/prefs/StringPreference;", "tradeDetailSettingsPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenCryptoPnlFilterTooltipPref", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;", "profitAndLossTradeListStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PnlHubDuxo_Factory implements Factory<PnlHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Clock> clock;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasSeenCryptoPnlFilterTooltipPref;
    private final Provider<ProfitAndLossChartStore> profitAndLossChartStore;
    private final Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore;
    private final Provider<ProfitAndLossTradeListStore> profitAndLossTradeListStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PnlHubStateProvider> stateProvider;
    private final Provider<StringPreference> tradeDetailSettingsPref;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PnlHubDuxo_Factory create(Provider<Clock> provider, Provider<UserStore> provider2, Provider<AccountProvider> provider3, Provider<RegionGateProvider> provider4, Provider<ProfitAndLossChartStore> provider5, Provider<ProfitAndLossHubSectionStore> provider6, Provider<StringPreference> provider7, Provider<BooleanPreference> provider8, Provider<ProfitAndLossTradeListStore> provider9, Provider<ExperimentsStore> provider10, Provider<CryptoExperimentsStore> provider11, Provider<PnlHubStateProvider> provider12, Provider<DuxoBundle> provider13, Provider<SavedStateHandle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final PnlHubDuxo newInstance(Clock clock, UserStore userStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, ProfitAndLossChartStore profitAndLossChartStore, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, StringPreference stringPreference, BooleanPreference booleanPreference, ProfitAndLossTradeListStore profitAndLossTradeListStore, ExperimentsStore experimentsStore, CryptoExperimentsStore cryptoExperimentsStore, PnlHubStateProvider pnlHubStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(clock, userStore, accountProvider, regionGateProvider, profitAndLossChartStore, profitAndLossHubSectionStore, stringPreference, booleanPreference, profitAndLossTradeListStore, experimentsStore, cryptoExperimentsStore, pnlHubStateProvider, duxoBundle, savedStateHandle);
    }

    public PnlHubDuxo_Factory(Provider<Clock> clock, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider, Provider<ProfitAndLossChartStore> profitAndLossChartStore, Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore, Provider<StringPreference> tradeDetailSettingsPref, Provider<BooleanPreference> hasSeenCryptoPnlFilterTooltipPref, Provider<ProfitAndLossTradeListStore> profitAndLossTradeListStore, Provider<ExperimentsStore> experimentsStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<PnlHubStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(profitAndLossChartStore, "profitAndLossChartStore");
        Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
        Intrinsics.checkNotNullParameter(tradeDetailSettingsPref, "tradeDetailSettingsPref");
        Intrinsics.checkNotNullParameter(hasSeenCryptoPnlFilterTooltipPref, "hasSeenCryptoPnlFilterTooltipPref");
        Intrinsics.checkNotNullParameter(profitAndLossTradeListStore, "profitAndLossTradeListStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.clock = clock;
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.profitAndLossChartStore = profitAndLossChartStore;
        this.profitAndLossHubSectionStore = profitAndLossHubSectionStore;
        this.tradeDetailSettingsPref = tradeDetailSettingsPref;
        this.hasSeenCryptoPnlFilterTooltipPref = hasSeenCryptoPnlFilterTooltipPref;
        this.profitAndLossTradeListStore = profitAndLossTradeListStore;
        this.experimentsStore = experimentsStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public PnlHubDuxo get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        ProfitAndLossChartStore profitAndLossChartStore = this.profitAndLossChartStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossChartStore, "get(...)");
        ProfitAndLossHubSectionStore profitAndLossHubSectionStore = this.profitAndLossHubSectionStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossHubSectionStore, "get(...)");
        StringPreference stringPreference = this.tradeDetailSettingsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenCryptoPnlFilterTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        ProfitAndLossTradeListStore profitAndLossTradeListStore = this.profitAndLossTradeListStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossTradeListStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        PnlHubStateProvider pnlHubStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(pnlHubStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(clock, userStore, accountProvider, regionGateProvider, profitAndLossChartStore, profitAndLossHubSectionStore, stringPreference, booleanPreference, profitAndLossTradeListStore, experimentsStore, cryptoExperimentsStore, pnlHubStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: PnlHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÓ\u0001\u0010\"\u001a\u00020!2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u007f\u0010%\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;", "profitAndLossChartStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/prefs/StringPreference;", "tradeDetailSettingsPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenCryptoPnlFilterTooltipPref", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;", "profitAndLossTradeListStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo_Factory;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PnlHubDuxo_Factory create(Provider<Clock> clock, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider, Provider<ProfitAndLossChartStore> profitAndLossChartStore, Provider<ProfitAndLossHubSectionStore> profitAndLossHubSectionStore, Provider<StringPreference> tradeDetailSettingsPref, Provider<BooleanPreference> hasSeenCryptoPnlFilterTooltipPref, Provider<ProfitAndLossTradeListStore> profitAndLossTradeListStore, Provider<ExperimentsStore> experimentsStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<PnlHubStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(profitAndLossChartStore, "profitAndLossChartStore");
            Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
            Intrinsics.checkNotNullParameter(tradeDetailSettingsPref, "tradeDetailSettingsPref");
            Intrinsics.checkNotNullParameter(hasSeenCryptoPnlFilterTooltipPref, "hasSeenCryptoPnlFilterTooltipPref");
            Intrinsics.checkNotNullParameter(profitAndLossTradeListStore, "profitAndLossTradeListStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PnlHubDuxo_Factory(clock, userStore, accountProvider, regionGateProvider, profitAndLossChartStore, profitAndLossHubSectionStore, tradeDetailSettingsPref, hasSeenCryptoPnlFilterTooltipPref, profitAndLossTradeListStore, experimentsStore, cryptoExperimentsStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final PnlHubDuxo newInstance(Clock clock, UserStore userStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, ProfitAndLossChartStore profitAndLossChartStore, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, StringPreference tradeDetailSettingsPref, BooleanPreference hasSeenCryptoPnlFilterTooltipPref, ProfitAndLossTradeListStore profitAndLossTradeListStore, ExperimentsStore experimentsStore, CryptoExperimentsStore cryptoExperimentsStore, PnlHubStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(profitAndLossChartStore, "profitAndLossChartStore");
            Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
            Intrinsics.checkNotNullParameter(tradeDetailSettingsPref, "tradeDetailSettingsPref");
            Intrinsics.checkNotNullParameter(hasSeenCryptoPnlFilterTooltipPref, "hasSeenCryptoPnlFilterTooltipPref");
            Intrinsics.checkNotNullParameter(profitAndLossTradeListStore, "profitAndLossTradeListStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PnlHubDuxo(clock, userStore, accountProvider, regionGateProvider, profitAndLossChartStore, profitAndLossHubSectionStore, tradeDetailSettingsPref, hasSeenCryptoPnlFilterTooltipPref, profitAndLossTradeListStore, experimentsStore, cryptoExperimentsStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
