package com.robinhood.android.equitydetail.p123ui.position;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo;", "unifiedAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showAverageCostRetirementTooltipPrefs", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PositionSectionDuxo_Factory implements Factory<PositionSectionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs;
    private final Provider<PositionSectionStateProvider> stateProvider;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;
    private final Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PositionSectionDuxo_Factory create(Provider<UnifiedAccountStore> provider, Provider<InstrumentStore> provider2, Provider<PositionStore> provider3, Provider<QuoteStore> provider4, Provider<ExperimentsStore> provider5, Provider<UnrealizedProfitAndLossStore> provider6, Provider<RegionGateProvider> provider7, Provider<BooleanPreference> provider8, Provider<DuxoBundle> provider9, Provider<PositionSectionStateProvider> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final PositionSectionDuxo newInstance(UnifiedAccountStore unifiedAccountStore, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, ExperimentsStore experimentsStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference, DuxoBundle duxoBundle, PositionSectionStateProvider positionSectionStateProvider) {
        return INSTANCE.newInstance(unifiedAccountStore, instrumentStore, positionStore, quoteStore, experimentsStore, unrealizedProfitAndLossStore, regionGateProvider, booleanPreference, duxoBundle, positionSectionStateProvider);
    }

    public PositionSectionDuxo_Factory(Provider<UnifiedAccountStore> unifiedAccountStore, Provider<InstrumentStore> instrumentStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<ExperimentsStore> experimentStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs, Provider<DuxoBundle> duxoBundle, Provider<PositionSectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.unifiedAccountStore = unifiedAccountStore;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.experimentStore = experimentStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.regionGateProvider = regionGateProvider;
        this.showAverageCostRetirementTooltipPrefs = showAverageCostRetirementTooltipPrefs;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public PositionSectionDuxo get() {
        Companion companion = INSTANCE;
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        UnrealizedProfitAndLossStore unrealizedProfitAndLossStore = this.unrealizedProfitAndLossStore.get();
        Intrinsics.checkNotNullExpressionValue(unrealizedProfitAndLossStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        BooleanPreference booleanPreference = this.showAverageCostRetirementTooltipPrefs.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        PositionSectionStateProvider positionSectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(positionSectionStateProvider, "get(...)");
        return companion.newInstance(unifiedAccountStore, instrumentStore, positionStore, quoteStore, experimentsStore, unrealizedProfitAndLossStore, regionGateProvider, booleanPreference, duxoBundle, positionSectionStateProvider);
    }

    /* compiled from: PositionSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo_Factory;", "unifiedAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showAverageCostRetirementTooltipPrefs", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionStateProvider;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionSectionDuxo_Factory create(Provider<UnifiedAccountStore> unifiedAccountStore, Provider<InstrumentStore> instrumentStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<ExperimentsStore> experimentStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs, Provider<DuxoBundle> duxoBundle, Provider<PositionSectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PositionSectionDuxo_Factory(unifiedAccountStore, instrumentStore, positionStore, quoteStore, experimentStore, unrealizedProfitAndLossStore, regionGateProvider, showAverageCostRetirementTooltipPrefs, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final PositionSectionDuxo newInstance(UnifiedAccountStore unifiedAccountStore, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, ExperimentsStore experimentStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, RegionGateProvider regionGateProvider, BooleanPreference showAverageCostRetirementTooltipPrefs, DuxoBundle duxoBundle, PositionSectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PositionSectionDuxo(unifiedAccountStore, instrumentStore, positionStore, quoteStore, experimentStore, unrealizedProfitAndLossStore, regionGateProvider, showAverageCostRetirementTooltipPrefs, duxoBundle, stateProvider);
        }
    }
}
