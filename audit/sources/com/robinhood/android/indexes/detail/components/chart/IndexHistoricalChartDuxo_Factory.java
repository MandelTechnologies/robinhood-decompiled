package com.robinhood.android.indexes.detail.components.chart;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexHistoricalChartStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;", "indexHistoricalChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "indexDetailPageCurbHoursTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexHistoricalChartDuxo_Factory implements Factory<IndexHistoricalChartDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> indexDetailPageCurbHoursTooltipPref;
    private final Provider<IndexHistoricalChartStore> indexHistoricalChartStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> showCandlestickChartPref;
    private final Provider<IndexHistoricalChartStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexHistoricalChartDuxo_Factory create(Provider<IndexHistoricalChartStore> provider, Provider<IndexStore> provider2, Provider<OptionChainStore> provider3, Provider<ExperimentsStore> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6, Provider<SavedStateHandle> provider7, Provider<DuxoBundle> provider8, Provider<IndexHistoricalChartStateProvider> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final IndexHistoricalChartDuxo newInstance(IndexHistoricalChartStore indexHistoricalChartStore, IndexStore indexStore, OptionChainStore optionChainStore, ExperimentsStore experimentsStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexHistoricalChartStateProvider indexHistoricalChartStateProvider) {
        return INSTANCE.newInstance(indexHistoricalChartStore, indexStore, optionChainStore, experimentsStore, booleanPreference, booleanPreference2, savedStateHandle, duxoBundle, indexHistoricalChartStateProvider);
    }

    public IndexHistoricalChartDuxo_Factory(Provider<IndexHistoricalChartStore> indexHistoricalChartStore, Provider<IndexStore> indexStore, Provider<OptionChainStore> optionChainStore, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> indexDetailPageCurbHoursTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexHistoricalChartStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        Intrinsics.checkNotNullParameter(indexDetailPageCurbHoursTooltipPref, "indexDetailPageCurbHoursTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.indexHistoricalChartStore = indexHistoricalChartStore;
        this.indexStore = indexStore;
        this.optionChainStore = optionChainStore;
        this.experimentsStore = experimentsStore;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.indexDetailPageCurbHoursTooltipPref = indexDetailPageCurbHoursTooltipPref;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndexHistoricalChartDuxo get() {
        Companion companion = INSTANCE;
        IndexHistoricalChartStore indexHistoricalChartStore = this.indexHistoricalChartStore.get();
        Intrinsics.checkNotNullExpressionValue(indexHistoricalChartStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.showCandlestickChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.indexDetailPageCurbHoursTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IndexHistoricalChartStateProvider indexHistoricalChartStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexHistoricalChartStateProvider, "get(...)");
        return companion.newInstance(indexHistoricalChartStore, indexStore, optionChainStore, experimentsStore, booleanPreference, booleanPreference2, savedStateHandle, duxoBundle, indexHistoricalChartStateProvider);
    }

    /* compiled from: IndexHistoricalChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H\u0007JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo_Factory;", "indexHistoricalChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "indexDetailPageCurbHoursTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartStateProvider;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexHistoricalChartDuxo_Factory create(Provider<IndexHistoricalChartStore> indexHistoricalChartStore, Provider<IndexStore> indexStore, Provider<OptionChainStore> optionChainStore, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> indexDetailPageCurbHoursTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexHistoricalChartStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(indexDetailPageCurbHoursTooltipPref, "indexDetailPageCurbHoursTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexHistoricalChartDuxo_Factory(indexHistoricalChartStore, indexStore, optionChainStore, experimentsStore, showCandlestickChartPref, indexDetailPageCurbHoursTooltipPref, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final IndexHistoricalChartDuxo newInstance(IndexHistoricalChartStore indexHistoricalChartStore, IndexStore indexStore, OptionChainStore optionChainStore, ExperimentsStore experimentsStore, BooleanPreference showCandlestickChartPref, BooleanPreference indexDetailPageCurbHoursTooltipPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexHistoricalChartStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(indexDetailPageCurbHoursTooltipPref, "indexDetailPageCurbHoursTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexHistoricalChartDuxo(indexHistoricalChartStore, indexStore, optionChainStore, experimentsStore, showCandlestickChartPref, indexDetailPageCurbHoursTooltipPref, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
