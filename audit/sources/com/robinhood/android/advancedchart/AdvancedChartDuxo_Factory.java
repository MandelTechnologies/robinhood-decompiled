package com.robinhood.android.advancedchart;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvancedChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bä\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "instrumentAdvancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "instrumentChartIntervalsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "showExtendedHoursChartPref", "customIntervalsTooltipShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AdvancedChartDuxo_Factory implements Factory<AdvancedChartDuxo> {
    private final Provider<AdvancedChartStore> advancedChartStore;
    private final Provider<StateFlow2<Boolean>> customIntervalsTooltipShownPrefState;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentAdvancedChartStore> instrumentAdvancedChartStore;
    private final Provider<InstrumentChartIntervalsStore> instrumentChartIntervalsStore;
    private final Provider<InstrumentChartSpansStore> instrumentChartSpansStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> showCandlestickChartPref;
    private final Provider<BooleanPreference> showExtendedHoursChartPref;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdvancedChartDuxo_Factory create(Provider<QuoteStore> provider, Provider<AdvancedChartStore> provider2, Provider<InstrumentAdvancedChartStore> provider3, Provider<ExperimentsStore> provider4, Provider<InstrumentStore> provider5, Provider<InstrumentChartSpansStore> provider6, Provider<InstrumentChartIntervalsStore> provider7, Provider<UserStore> provider8, Provider<BooleanPreference> provider9, Provider<BooleanPreference> provider10, Provider<StateFlow2<Boolean>> provider11, Provider<EventLogger> provider12, Provider<SavedStateHandle> provider13, Provider<LazyMoshi> provider14, Provider<DuxoBundle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final AdvancedChartDuxo newInstance(QuoteStore quoteStore, AdvancedChartStore advancedChartStore, InstrumentAdvancedChartStore instrumentAdvancedChartStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, InstrumentChartSpansStore instrumentChartSpansStore, InstrumentChartIntervalsStore instrumentChartIntervalsStore, UserStore userStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, StateFlow2<Boolean> stateFlow2, EventLogger eventLogger, SavedStateHandle savedStateHandle, LazyMoshi lazyMoshi, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(quoteStore, advancedChartStore, instrumentAdvancedChartStore, experimentsStore, instrumentStore, instrumentChartSpansStore, instrumentChartIntervalsStore, userStore, booleanPreference, booleanPreference2, stateFlow2, eventLogger, savedStateHandle, lazyMoshi, duxoBundle);
    }

    public AdvancedChartDuxo_Factory(Provider<QuoteStore> quoteStore, Provider<AdvancedChartStore> advancedChartStore, Provider<InstrumentAdvancedChartStore> instrumentAdvancedChartStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<InstrumentChartSpansStore> instrumentChartSpansStore, Provider<InstrumentChartIntervalsStore> instrumentChartIntervalsStore, Provider<UserStore> userStore, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> showExtendedHoursChartPref, Provider<StateFlow2<Boolean>> customIntervalsTooltipShownPrefState, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(instrumentAdvancedChartStore, "instrumentAdvancedChartStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
        Intrinsics.checkNotNullParameter(instrumentChartIntervalsStore, "instrumentChartIntervalsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
        Intrinsics.checkNotNullParameter(customIntervalsTooltipShownPrefState, "customIntervalsTooltipShownPrefState");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.quoteStore = quoteStore;
        this.advancedChartStore = advancedChartStore;
        this.instrumentAdvancedChartStore = instrumentAdvancedChartStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.instrumentChartSpansStore = instrumentChartSpansStore;
        this.instrumentChartIntervalsStore = instrumentChartIntervalsStore;
        this.userStore = userStore;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.showExtendedHoursChartPref = showExtendedHoursChartPref;
        this.customIntervalsTooltipShownPrefState = customIntervalsTooltipShownPrefState;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.moshi = moshi;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AdvancedChartDuxo get() {
        Companion companion = INSTANCE;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        AdvancedChartStore advancedChartStore = this.advancedChartStore.get();
        Intrinsics.checkNotNullExpressionValue(advancedChartStore, "get(...)");
        InstrumentAdvancedChartStore instrumentAdvancedChartStore = this.instrumentAdvancedChartStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAdvancedChartStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        InstrumentChartSpansStore instrumentChartSpansStore = this.instrumentChartSpansStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartSpansStore, "get(...)");
        InstrumentChartIntervalsStore instrumentChartIntervalsStore = this.instrumentChartIntervalsStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartIntervalsStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        BooleanPreference booleanPreference = this.showCandlestickChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.showExtendedHoursChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        StateFlow2<Boolean> stateFlow2 = this.customIntervalsTooltipShownPrefState.get();
        Intrinsics.checkNotNullExpressionValue(stateFlow2, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        LazyMoshi lazyMoshi2 = lazyMoshi;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(quoteStore, advancedChartStore, instrumentAdvancedChartStore, experimentsStore, instrumentStore, instrumentChartSpansStore, instrumentChartIntervalsStore, userStore, booleanPreference, booleanPreference2, stateFlow2, eventLogger, savedStateHandle, lazyMoshi2, duxoBundle);
    }

    /* compiled from: AdvancedChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jå\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0017\u0010\u001a\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0007H\u0007J\u008b\u0001\u0010&\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advancedchart/AdvancedChartDuxo_Factory;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "instrumentAdvancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "instrumentChartIntervalsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "showExtendedHoursChartPref", "customIntervalsTooltipShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvancedChartDuxo_Factory create(Provider<QuoteStore> quoteStore, Provider<AdvancedChartStore> advancedChartStore, Provider<InstrumentAdvancedChartStore> instrumentAdvancedChartStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<InstrumentChartSpansStore> instrumentChartSpansStore, Provider<InstrumentChartIntervalsStore> instrumentChartIntervalsStore, Provider<UserStore> userStore, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> showExtendedHoursChartPref, Provider<StateFlow2<Boolean>> customIntervalsTooltipShownPrefState, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
            Intrinsics.checkNotNullParameter(instrumentAdvancedChartStore, "instrumentAdvancedChartStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
            Intrinsics.checkNotNullParameter(instrumentChartIntervalsStore, "instrumentChartIntervalsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
            Intrinsics.checkNotNullParameter(customIntervalsTooltipShownPrefState, "customIntervalsTooltipShownPrefState");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvancedChartDuxo_Factory(quoteStore, advancedChartStore, instrumentAdvancedChartStore, experimentsStore, instrumentStore, instrumentChartSpansStore, instrumentChartIntervalsStore, userStore, showCandlestickChartPref, showExtendedHoursChartPref, customIntervalsTooltipShownPrefState, eventLogger, savedStateHandle, moshi, duxoBundle);
        }

        @JvmStatic
        public final AdvancedChartDuxo newInstance(QuoteStore quoteStore, AdvancedChartStore advancedChartStore, InstrumentAdvancedChartStore instrumentAdvancedChartStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, InstrumentChartSpansStore instrumentChartSpansStore, InstrumentChartIntervalsStore instrumentChartIntervalsStore, UserStore userStore, BooleanPreference showCandlestickChartPref, BooleanPreference showExtendedHoursChartPref, StateFlow2<Boolean> customIntervalsTooltipShownPrefState, EventLogger eventLogger, SavedStateHandle savedStateHandle, LazyMoshi moshi, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
            Intrinsics.checkNotNullParameter(instrumentAdvancedChartStore, "instrumentAdvancedChartStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
            Intrinsics.checkNotNullParameter(instrumentChartIntervalsStore, "instrumentChartIntervalsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
            Intrinsics.checkNotNullParameter(customIntervalsTooltipShownPrefState, "customIntervalsTooltipShownPrefState");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvancedChartDuxo(quoteStore, advancedChartStore, instrumentAdvancedChartStore, experimentsStore, instrumentStore, instrumentChartSpansStore, instrumentChartIntervalsStore, userStore, showCandlestickChartPref, showExtendedHoursChartPref, customIntervalsTooltipShownPrefState, eventLogger, savedStateHandle, moshi, duxoBundle);
        }
    }
}
