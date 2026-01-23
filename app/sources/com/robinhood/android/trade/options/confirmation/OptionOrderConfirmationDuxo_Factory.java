package com.robinhood.android.trade.options.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.margin.MarginAccountUpsellStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref", "Lcom/robinhood/prefs/LongPreference;", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "stateProvider", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderConfirmationDuxo_Factory implements Factory<OptionOrderConfirmationDuxo> {
    private final Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MarginAccountUpsellStore> marginAccountUpsellStore;
    private final Provider<LongPreference> optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionOrderConfirmationStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionOrderConfirmationDuxo_Factory create(Provider<EventLogger> provider, Provider<ExperimentsStore> provider2, Provider<OptionOrderStore> provider3, Provider<PerformanceLogger> provider4, Provider<UserStore> provider5, Provider<LongPreference> provider6, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> provider7, Provider<MarginAccountUpsellStore> provider8, Provider<OptionOrderConfirmationStateProvider> provider9, Provider<DuxoBundle> provider10, Provider<SavedStateHandle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final OptionOrderConfirmationDuxo newInstance(EventLogger eventLogger, ExperimentsStore experimentsStore, OptionOrderStore optionOrderStore, PerformanceLogger performanceLogger, UserStore userStore, LongPreference longPreference, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, MarginAccountUpsellStore marginAccountUpsellStore, OptionOrderConfirmationStateProvider optionOrderConfirmationStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(eventLogger, experimentsStore, optionOrderStore, performanceLogger, userStore, longPreference, checkOptionUpgradeToLevel3EligibilityUseCase, marginAccountUpsellStore, optionOrderConfirmationStateProvider, duxoBundle, savedStateHandle);
    }

    public OptionOrderConfirmationDuxo_Factory(Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionOrderStore> optionOrderStore, Provider<PerformanceLogger> performanceLogger, Provider<UserStore> userStore, Provider<LongPreference> optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase, Provider<MarginAccountUpsellStore> marginAccountUpsellStore, Provider<OptionOrderConfirmationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref");
        Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
        Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionOrderStore = optionOrderStore;
        this.performanceLogger = performanceLogger;
        this.userStore = userStore;
        this.optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref = optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref;
        this.checkOptionUpgradeToLevel3EligibilityUseCase = checkOptionUpgradeToLevel3EligibilityUseCase;
        this.marginAccountUpsellStore = marginAccountUpsellStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionOrderConfirmationDuxo get() {
        Companion companion = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        LongPreference longPreference = this.optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase = this.checkOptionUpgradeToLevel3EligibilityUseCase.get();
        Intrinsics.checkNotNullExpressionValue(checkOptionUpgradeToLevel3EligibilityUseCase, "get(...)");
        MarginAccountUpsellStore marginAccountUpsellStore = this.marginAccountUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(marginAccountUpsellStore, "get(...)");
        OptionOrderConfirmationStateProvider optionOrderConfirmationStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderConfirmationStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(eventLogger, experimentsStore, optionOrderStore, performanceLogger, userStore, longPreference, checkOptionUpgradeToLevel3EligibilityUseCase, marginAccountUpsellStore, optionOrderConfirmationStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: OptionOrderConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo_Factory;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref", "Lcom/robinhood/prefs/LongPreference;", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "stateProvider", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderConfirmationDuxo_Factory create(Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionOrderStore> optionOrderStore, Provider<PerformanceLogger> performanceLogger, Provider<UserStore> userStore, Provider<LongPreference> optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase, Provider<MarginAccountUpsellStore> marginAccountUpsellStore, Provider<OptionOrderConfirmationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref");
            Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
            Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionOrderConfirmationDuxo_Factory(eventLogger, experimentsStore, optionOrderStore, performanceLogger, userStore, optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, checkOptionUpgradeToLevel3EligibilityUseCase, marginAccountUpsellStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final OptionOrderConfirmationDuxo newInstance(EventLogger eventLogger, ExperimentsStore experimentsStore, OptionOrderStore optionOrderStore, PerformanceLogger performanceLogger, UserStore userStore, LongPreference optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, MarginAccountUpsellStore marginAccountUpsellStore, OptionOrderConfirmationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref");
            Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
            Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionOrderConfirmationDuxo(eventLogger, experimentsStore, optionOrderStore, performanceLogger, userStore, optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, checkOptionUpgradeToLevel3EligibilityUseCase, marginAccountUpsellStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
