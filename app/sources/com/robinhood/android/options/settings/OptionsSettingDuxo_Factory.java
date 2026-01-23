package com.robinhood.android.options.settings;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSettingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSettingDuxo_Factory implements Factory<OptionsSettingDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstantCashLogger> instantCashLogger;
    private final Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionUpgradeStore> optionUpgradeStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsSettingDuxo_Factory create(Provider<AccountProvider> provider, Provider<AccountAccessStore> provider2, Provider<ExperimentsStore> provider3, Provider<LeveredMarginSettingsStore> provider4, Provider<OptionSettingsStore> provider5, Provider<OptionUpgradeStore> provider6, Provider<InstantCashLogger> provider7, Provider<RegionGateProvider> provider8, Provider<SavedStateHandle> provider9, Provider<DispatcherProvider> provider10, Provider<RxFactory> provider11, Provider<RxGlobalErrorHandler> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final OptionsSettingDuxo newInstance(AccountProvider accountProvider, AccountAccessStore accountAccessStore, ExperimentsStore experimentsStore, LeveredMarginSettingsStore leveredMarginSettingsStore, OptionSettingsStore optionSettingsStore, OptionUpgradeStore optionUpgradeStore, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, accountAccessStore, experimentsStore, leveredMarginSettingsStore, optionSettingsStore, optionUpgradeStore, instantCashLogger, regionGateProvider, savedStateHandle);
    }

    public OptionsSettingDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<ExperimentsStore> experimentsStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionUpgradeStore> optionUpgradeStore, Provider<InstantCashLogger> instantCashLogger, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.accountAccessStore = accountAccessStore;
        this.experimentsStore = experimentsStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionUpgradeStore = optionUpgradeStore;
        this.instantCashLogger = instantCashLogger;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionsSettingDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionUpgradeStore optionUpgradeStore = this.optionUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradeStore, "get(...)");
        InstantCashLogger instantCashLogger = this.instantCashLogger.get();
        Intrinsics.checkNotNullExpressionValue(instantCashLogger, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionsSettingDuxo optionsSettingDuxoNewInstance = companion.newInstance(accountProvider, accountAccessStore, experimentsStore, leveredMarginSettingsStore, optionSettingsStore, optionUpgradeStore, instantCashLogger, regionGateProvider, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionsSettingDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionsSettingDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionsSettingDuxoNewInstance, rxGlobalErrorHandler);
        return optionsSettingDuxoNewInstance;
    }

    /* compiled from: OptionsSettingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007JP\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/settings/OptionsSettingDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsSettingDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<ExperimentsStore> experimentsStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionUpgradeStore> optionUpgradeStore, Provider<InstantCashLogger> instantCashLogger, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionsSettingDuxo_Factory(accountProvider, accountAccessStore, experimentsStore, leveredMarginSettingsStore, optionSettingsStore, optionUpgradeStore, instantCashLogger, regionGateProvider, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionsSettingDuxo newInstance(AccountProvider accountProvider, AccountAccessStore accountAccessStore, ExperimentsStore experimentsStore, LeveredMarginSettingsStore leveredMarginSettingsStore, OptionSettingsStore optionSettingsStore, OptionUpgradeStore optionUpgradeStore, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsSettingDuxo(accountProvider, accountAccessStore, experimentsStore, leveredMarginSettingsStore, optionSettingsStore, optionUpgradeStore, instantCashLogger, regionGateProvider, savedStateHandle);
        }
    }
}
