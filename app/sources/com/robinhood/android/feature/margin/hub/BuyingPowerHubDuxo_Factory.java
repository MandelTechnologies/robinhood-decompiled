package com.robinhood.android.feature.margin.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.IntPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "marginHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "buyingPowerHubOnboardingAlertStore", "Lcom/robinhood/android/lib/margin/hub/store/BuyingPowerHubOnboardingAlertStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BuyingPowerHubDuxo_Factory implements Factory<BuyingPowerHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BuyingPowerHubOnboardingAlertStore> buyingPowerHubOnboardingAlertStore;
    private final Provider<IntPreference> displayCurrencyPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MarginHubStore> marginHubStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BuyingPowerHubState2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BuyingPowerHubDuxo_Factory create(Provider<MarginHubStore> provider, Provider<BuyingPowerHubOnboardingAlertStore> provider2, Provider<AccountProvider> provider3, Provider<RegionGateProvider> provider4, Provider<IntPreference> provider5, Provider<BuyingPowerHubState2> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final BuyingPowerHubDuxo newInstance(MarginHubStore marginHubStore, BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, IntPreference intPreference, BuyingPowerHubState2 buyingPowerHubState2, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(marginHubStore, buyingPowerHubOnboardingAlertStore, accountProvider, regionGateProvider, intPreference, buyingPowerHubState2, duxoBundle, savedStateHandle);
    }

    public BuyingPowerHubDuxo_Factory(Provider<MarginHubStore> marginHubStore, Provider<BuyingPowerHubOnboardingAlertStore> buyingPowerHubOnboardingAlertStore, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider, Provider<IntPreference> displayCurrencyPref, Provider<BuyingPowerHubState2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(marginHubStore, "marginHubStore");
        Intrinsics.checkNotNullParameter(buyingPowerHubOnboardingAlertStore, "buyingPowerHubOnboardingAlertStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.marginHubStore = marginHubStore;
        this.buyingPowerHubOnboardingAlertStore = buyingPowerHubOnboardingAlertStore;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.displayCurrencyPref = displayCurrencyPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public BuyingPowerHubDuxo get() {
        Companion companion = INSTANCE;
        MarginHubStore marginHubStore = this.marginHubStore.get();
        Intrinsics.checkNotNullExpressionValue(marginHubStore, "get(...)");
        BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore = this.buyingPowerHubOnboardingAlertStore.get();
        Intrinsics.checkNotNullExpressionValue(buyingPowerHubOnboardingAlertStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        IntPreference intPreference = this.displayCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        BuyingPowerHubState2 buyingPowerHubState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(buyingPowerHubState2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(marginHubStore, buyingPowerHubOnboardingAlertStore, accountProvider, regionGateProvider, intPreference, buyingPowerHubState2, duxoBundle, savedStateHandle);
    }

    /* compiled from: BuyingPowerHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo_Factory;", "marginHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "buyingPowerHubOnboardingAlertStore", "Lcom/robinhood/android/lib/margin/hub/store/BuyingPowerHubOnboardingAlertStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BuyingPowerHubDuxo_Factory create(Provider<MarginHubStore> marginHubStore, Provider<BuyingPowerHubOnboardingAlertStore> buyingPowerHubOnboardingAlertStore, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider, Provider<IntPreference> displayCurrencyPref, Provider<BuyingPowerHubState2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(marginHubStore, "marginHubStore");
            Intrinsics.checkNotNullParameter(buyingPowerHubOnboardingAlertStore, "buyingPowerHubOnboardingAlertStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new BuyingPowerHubDuxo_Factory(marginHubStore, buyingPowerHubOnboardingAlertStore, accountProvider, regionGateProvider, displayCurrencyPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final BuyingPowerHubDuxo newInstance(MarginHubStore marginHubStore, BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, IntPreference displayCurrencyPref, BuyingPowerHubState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(marginHubStore, "marginHubStore");
            Intrinsics.checkNotNullParameter(buyingPowerHubOnboardingAlertStore, "buyingPowerHubOnboardingAlertStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new BuyingPowerHubDuxo(marginHubStore, buyingPowerHubOnboardingAlertStore, accountProvider, regionGateProvider, displayCurrencyPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
