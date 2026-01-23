package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.p166fx.provider.McwDisplayCurrenciesProvider;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayCurrencySwitcherDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo;", "mcwDisplayCurrenciesProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "mcwFxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "homeDisplayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "accountTabDisplayCurrencySelectionPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DisplayCurrencySwitcherDuxo_Factory implements Factory<DisplayCurrencySwitcherDuxo> {
    private final Provider<IntPreference> accountTabDisplayCurrencySelectionPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref;
    private final Provider<IntPreference> homeDisplayCurrencySelectionPref;
    private final Provider<McwDisplayCurrenciesProvider> mcwDisplayCurrenciesProvider;
    private final Provider<McwFxRatesProvider> mcwFxRatesProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DisplayCurrencySwitcherDuxo_Factory create(Provider<McwDisplayCurrenciesProvider> provider, Provider<McwFxRatesProvider> provider2, Provider<BooleanPreference> provider3, Provider<IntPreference> provider4, Provider<IntPreference> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final DisplayCurrencySwitcherDuxo newInstance(McwDisplayCurrenciesProvider mcwDisplayCurrenciesProvider, McwFxRatesProvider mcwFxRatesProvider, BooleanPreference booleanPreference, IntPreference intPreference, IntPreference intPreference2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(mcwDisplayCurrenciesProvider, mcwFxRatesProvider, booleanPreference, intPreference, intPreference2, duxoBundle);
    }

    public DisplayCurrencySwitcherDuxo_Factory(Provider<McwDisplayCurrenciesProvider> mcwDisplayCurrenciesProvider, Provider<McwFxRatesProvider> mcwFxRatesProvider, Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref, Provider<IntPreference> homeDisplayCurrencySelectionPref, Provider<IntPreference> accountTabDisplayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(mcwDisplayCurrenciesProvider, "mcwDisplayCurrenciesProvider");
        Intrinsics.checkNotNullParameter(mcwFxRatesProvider, "mcwFxRatesProvider");
        Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
        Intrinsics.checkNotNullParameter(homeDisplayCurrencySelectionPref, "homeDisplayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(accountTabDisplayCurrencySelectionPref, "accountTabDisplayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mcwDisplayCurrenciesProvider = mcwDisplayCurrenciesProvider;
        this.mcwFxRatesProvider = mcwFxRatesProvider;
        this.hasSeenFxSwitcherFtuxPref = hasSeenFxSwitcherFtuxPref;
        this.homeDisplayCurrencySelectionPref = homeDisplayCurrencySelectionPref;
        this.accountTabDisplayCurrencySelectionPref = accountTabDisplayCurrencySelectionPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DisplayCurrencySwitcherDuxo get() {
        Companion companion = INSTANCE;
        McwDisplayCurrenciesProvider mcwDisplayCurrenciesProvider = this.mcwDisplayCurrenciesProvider.get();
        Intrinsics.checkNotNullExpressionValue(mcwDisplayCurrenciesProvider, "get(...)");
        McwFxRatesProvider mcwFxRatesProvider = this.mcwFxRatesProvider.get();
        Intrinsics.checkNotNullExpressionValue(mcwFxRatesProvider, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenFxSwitcherFtuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.homeDisplayCurrencySelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        IntPreference intPreference2 = this.accountTabDisplayCurrencySelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(mcwDisplayCurrenciesProvider, mcwFxRatesProvider, booleanPreference, intPreference, intPreference2, duxoBundle);
    }

    /* compiled from: DisplayCurrencySwitcherDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo_Factory;", "mcwDisplayCurrenciesProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "mcwFxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "homeDisplayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "accountTabDisplayCurrencySelectionPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo;", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DisplayCurrencySwitcherDuxo_Factory create(Provider<McwDisplayCurrenciesProvider> mcwDisplayCurrenciesProvider, Provider<McwFxRatesProvider> mcwFxRatesProvider, Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref, Provider<IntPreference> homeDisplayCurrencySelectionPref, Provider<IntPreference> accountTabDisplayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(mcwDisplayCurrenciesProvider, "mcwDisplayCurrenciesProvider");
            Intrinsics.checkNotNullParameter(mcwFxRatesProvider, "mcwFxRatesProvider");
            Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
            Intrinsics.checkNotNullParameter(homeDisplayCurrencySelectionPref, "homeDisplayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(accountTabDisplayCurrencySelectionPref, "accountTabDisplayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DisplayCurrencySwitcherDuxo_Factory(mcwDisplayCurrenciesProvider, mcwFxRatesProvider, hasSeenFxSwitcherFtuxPref, homeDisplayCurrencySelectionPref, accountTabDisplayCurrencySelectionPref, duxoBundle);
        }

        @JvmStatic
        public final DisplayCurrencySwitcherDuxo newInstance(McwDisplayCurrenciesProvider mcwDisplayCurrenciesProvider, McwFxRatesProvider mcwFxRatesProvider, BooleanPreference hasSeenFxSwitcherFtuxPref, IntPreference homeDisplayCurrencySelectionPref, IntPreference accountTabDisplayCurrencySelectionPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(mcwDisplayCurrenciesProvider, "mcwDisplayCurrenciesProvider");
            Intrinsics.checkNotNullParameter(mcwFxRatesProvider, "mcwFxRatesProvider");
            Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
            Intrinsics.checkNotNullParameter(homeDisplayCurrencySelectionPref, "homeDisplayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(accountTabDisplayCurrencySelectionPref, "accountTabDisplayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DisplayCurrencySwitcherDuxo(mcwDisplayCurrenciesProvider, mcwFxRatesProvider, hasSeenFxSwitcherFtuxPref, homeDisplayCurrencySelectionPref, accountTabDisplayCurrencySelectionPref, duxoBundle);
        }
    }
}
