package com.robinhood.android.common.views;

import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.views.BaseInstrumentRowView_MembersInjector;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/InstrumentRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "instrumentChartBoundsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentRowView_MembersInjector implements MembersInjector<InstrumentRowView> {
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<InstrumentChartBoundsStore> instrumentChartBoundsStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<BooleanPreference> isShowingExtendedHoursPref;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<QuoteHistoricalStore> quoteHistoricalStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore;
    private final Provider<StringPreference> viewModePreference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstrumentRowView> create(Provider<StringPreference> provider, Provider<InstrumentStore> provider2, Provider<QuoteStore> provider3, Provider<UnrealizedProfitAndLossStore> provider4, Provider<QuoteHistoricalStore> provider5, Provider<MarketHoursStore> provider6, Provider<TraderMarketHoursManager> provider7, Provider<ExperimentsProvider> provider8, Provider<InstrumentChartBoundsStore> provider9, Provider<BooleanPreference> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final void injectExperimentsProvider(InstrumentRowView instrumentRowView, ExperimentsProvider experimentsProvider) {
        INSTANCE.injectExperimentsProvider(instrumentRowView, experimentsProvider);
    }

    @JvmStatic
    public static final void injectInstrumentChartBoundsStore(InstrumentRowView instrumentRowView, InstrumentChartBoundsStore instrumentChartBoundsStore) {
        INSTANCE.injectInstrumentChartBoundsStore(instrumentRowView, instrumentChartBoundsStore);
    }

    @JvmStatic
    public static final void injectInstrumentStore(InstrumentRowView instrumentRowView, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(instrumentRowView, instrumentStore);
    }

    @JvmStatic
    @ShowExtendedHoursChartPref
    public static final void injectIsShowingExtendedHoursPref(InstrumentRowView instrumentRowView, BooleanPreference booleanPreference) {
        INSTANCE.injectIsShowingExtendedHoursPref(instrumentRowView, booleanPreference);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(InstrumentRowView instrumentRowView, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(instrumentRowView, traderMarketHoursManager);
    }

    @JvmStatic
    public static final void injectMarketHoursStore(InstrumentRowView instrumentRowView, MarketHoursStore marketHoursStore) {
        INSTANCE.injectMarketHoursStore(instrumentRowView, marketHoursStore);
    }

    @JvmStatic
    public static final void injectQuoteHistoricalStore(InstrumentRowView instrumentRowView, QuoteHistoricalStore quoteHistoricalStore) {
        INSTANCE.injectQuoteHistoricalStore(instrumentRowView, quoteHistoricalStore);
    }

    @JvmStatic
    public static final void injectQuoteStore(InstrumentRowView instrumentRowView, QuoteStore quoteStore) {
        INSTANCE.injectQuoteStore(instrumentRowView, quoteStore);
    }

    @JvmStatic
    public static final void injectUnrealizedProfitAndLossStore(InstrumentRowView instrumentRowView, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore) {
        INSTANCE.injectUnrealizedProfitAndLossStore(instrumentRowView, unrealizedProfitAndLossStore);
    }

    public InstrumentRowView_MembersInjector(Provider<StringPreference> viewModePreference, Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<MarketHoursStore> marketHoursStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsProvider> experimentsProvider, Provider<InstrumentChartBoundsStore> instrumentChartBoundsStore, Provider<BooleanPreference> isShowingExtendedHoursPref) {
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(instrumentChartBoundsStore, "instrumentChartBoundsStore");
        Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
        this.viewModePreference = viewModePreference;
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.quoteHistoricalStore = quoteHistoricalStore;
        this.marketHoursStore = marketHoursStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsProvider = experimentsProvider;
        this.instrumentChartBoundsStore = instrumentChartBoundsStore;
        this.isShowingExtendedHoursPref = isShowingExtendedHoursPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstrumentRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseInstrumentRowView_MembersInjector.Companion companion = BaseInstrumentRowView_MembersInjector.INSTANCE;
        StringPreference stringPreference = this.viewModePreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectViewModePreference(instance, stringPreference);
        Companion companion2 = INSTANCE;
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(instance, instrumentStore);
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        companion2.injectQuoteStore(instance, quoteStore);
        UnrealizedProfitAndLossStore unrealizedProfitAndLossStore = this.unrealizedProfitAndLossStore.get();
        Intrinsics.checkNotNullExpressionValue(unrealizedProfitAndLossStore, "get(...)");
        companion2.injectUnrealizedProfitAndLossStore(instance, unrealizedProfitAndLossStore);
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteHistoricalStore, "get(...)");
        companion2.injectQuoteHistoricalStore(instance, quoteHistoricalStore);
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        companion2.injectMarketHoursStore(instance, marketHoursStore);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion2.injectMarketHoursManager(instance, traderMarketHoursManager);
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        companion2.injectExperimentsProvider(instance, experimentsProvider);
        InstrumentChartBoundsStore instrumentChartBoundsStore = this.instrumentChartBoundsStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartBoundsStore, "get(...)");
        companion2.injectInstrumentChartBoundsStore(instance, instrumentChartBoundsStore);
        BooleanPreference booleanPreference = this.isShowingExtendedHoursPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectIsShowingExtendedHoursPref(instance, booleanPreference);
    }

    /* compiled from: InstrumentRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009a\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/InstrumentRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "instrumentChartBoundsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectInstrumentStore", "", "instance", "injectQuoteStore", "injectUnrealizedProfitAndLossStore", "injectQuoteHistoricalStore", "injectMarketHoursStore", "injectMarketHoursManager", "injectExperimentsProvider", "injectInstrumentChartBoundsStore", "injectIsShowingExtendedHoursPref", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstrumentRowView> create(Provider<StringPreference> viewModePreference, Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<MarketHoursStore> marketHoursStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsProvider> experimentsProvider, Provider<InstrumentChartBoundsStore> instrumentChartBoundsStore, Provider<BooleanPreference> isShowingExtendedHoursPref) {
            Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(instrumentChartBoundsStore, "instrumentChartBoundsStore");
            Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
            return new InstrumentRowView_MembersInjector(viewModePreference, instrumentStore, quoteStore, unrealizedProfitAndLossStore, quoteHistoricalStore, marketHoursStore, marketHoursManager, experimentsProvider, instrumentChartBoundsStore, isShowingExtendedHoursPref);
        }

        @JvmStatic
        public final void injectInstrumentStore(InstrumentRowView instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectQuoteStore(InstrumentRowView instance, QuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            instance.setQuoteStore(quoteStore);
        }

        @JvmStatic
        public final void injectUnrealizedProfitAndLossStore(InstrumentRowView instance, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            instance.setUnrealizedProfitAndLossStore(unrealizedProfitAndLossStore);
        }

        @JvmStatic
        public final void injectQuoteHistoricalStore(InstrumentRowView instance, QuoteHistoricalStore quoteHistoricalStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            instance.setQuoteHistoricalStore(quoteHistoricalStore);
        }

        @JvmStatic
        public final void injectMarketHoursStore(InstrumentRowView instance, MarketHoursStore marketHoursStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            instance.setMarketHoursStore(marketHoursStore);
        }

        @JvmStatic
        public final void injectMarketHoursManager(InstrumentRowView instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }

        @JvmStatic
        public final void injectExperimentsProvider(InstrumentRowView instance, ExperimentsProvider experimentsProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            instance.setExperimentsProvider(experimentsProvider);
        }

        @JvmStatic
        public final void injectInstrumentChartBoundsStore(InstrumentRowView instance, InstrumentChartBoundsStore instrumentChartBoundsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentChartBoundsStore, "instrumentChartBoundsStore");
            instance.setInstrumentChartBoundsStore(instrumentChartBoundsStore);
        }

        @JvmStatic
        @ShowExtendedHoursChartPref
        public final void injectIsShowingExtendedHoursPref(InstrumentRowView instance, BooleanPreference isShowingExtendedHoursPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
            instance.setShowingExtendedHoursPref(isShowingExtendedHoursPref);
        }
    }
}
