package com.robinhood.android.optionschain.chainsettings;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnPreTradeStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionChainSettingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BË\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionSimulatedReturnPreTradeStore", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainSettingsSwitchToSbsTooltipShownPref", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionChainSettingsDuxo_Factory implements Factory<OptionChainSettingsDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore;
    private final Provider<OptionChainCustomizationStore> optionChainCustomizationStore;
    private final Provider<BooleanPreference> optionChainSettingsSwitchToSbsTooltipShownPref;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSideBySideChainStore> optionSideBySideChainStore;
    private final Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionChainSettingsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionChainSettingsDuxo_Factory create(Provider<Clock> provider, Provider<EventLogger> provider2, Provider<ExperimentsStore> provider3, Provider<OptionAccountSwitcherStore> provider4, Provider<OptionChainCustomizationStore> provider5, Provider<OptionChainCustomizationDiscoveryStore> provider6, Provider<OptionSettingsStore> provider7, Provider<OptionSideBySideChainStore> provider8, Provider<OptionSimulatedReturnPreTradeStore> provider9, Provider<Resources> provider10, Provider<BooleanPreference> provider11, Provider<OptionChainSettingsStateProvider> provider12, Provider<DuxoBundle> provider13, Provider<SavedStateHandle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final OptionChainSettingsDuxo newInstance(Clock clock, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, Resources resources, BooleanPreference booleanPreference, OptionChainSettingsStateProvider optionChainSettingsStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(clock, eventLogger, experimentsStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionSettingsStore, optionSideBySideChainStore, optionSimulatedReturnPreTradeStore, resources, booleanPreference, optionChainSettingsStateProvider, duxoBundle, savedStateHandle);
    }

    public OptionChainSettingsDuxo_Factory(Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore, Provider<Resources> resources, Provider<BooleanPreference> optionChainSettingsSwitchToSbsTooltipShownPref, Provider<OptionChainSettingsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionChainSettingsSwitchToSbsTooltipShownPref, "optionChainSettingsSwitchToSbsTooltipShownPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.clock = clock;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionSimulatedReturnPreTradeStore = optionSimulatedReturnPreTradeStore;
        this.resources = resources;
        this.optionChainSettingsSwitchToSbsTooltipShownPref = optionChainSettingsSwitchToSbsTooltipShownPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionChainSettingsDuxo get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionChainCustomizationStore optionChainCustomizationStore = this.optionChainCustomizationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationStore, "get(...)");
        OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore = this.optionChainCustomizationDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationDiscoveryStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStore, "get(...)");
        OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore = this.optionSimulatedReturnPreTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnPreTradeStore, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        BooleanPreference booleanPreference = this.optionChainSettingsSwitchToSbsTooltipShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        OptionChainSettingsStateProvider optionChainSettingsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionChainSettingsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(clock, eventLogger, experimentsStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionSettingsStore, optionSideBySideChainStore, optionSimulatedReturnPreTradeStore, resources, booleanPreference, optionChainSettingsStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: OptionChainSettingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÓ\u0001\u0010\"\u001a\u00020!2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u007f\u0010%\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionSimulatedReturnPreTradeStore", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainSettingsSwitchToSbsTooltipShownPref", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo_Factory;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;Landroid/content/res/Resources;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionChainSettingsDuxo_Factory create(Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore, Provider<Resources> resources, Provider<BooleanPreference> optionChainSettingsSwitchToSbsTooltipShownPref, Provider<OptionChainSettingsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(optionChainSettingsSwitchToSbsTooltipShownPref, "optionChainSettingsSwitchToSbsTooltipShownPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionChainSettingsDuxo_Factory(clock, eventLogger, experimentsStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionSettingsStore, optionSideBySideChainStore, optionSimulatedReturnPreTradeStore, resources, optionChainSettingsSwitchToSbsTooltipShownPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final OptionChainSettingsDuxo newInstance(Clock clock, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, Resources resources, BooleanPreference optionChainSettingsSwitchToSbsTooltipShownPref, OptionChainSettingsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(optionChainSettingsSwitchToSbsTooltipShownPref, "optionChainSettingsSwitchToSbsTooltipShownPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionChainSettingsDuxo(clock, eventLogger, experimentsStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionSettingsStore, optionSideBySideChainStore, optionSimulatedReturnPreTradeStore, resources, optionChainSettingsSwitchToSbsTooltipShownPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
