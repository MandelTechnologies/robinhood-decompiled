package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDuxo;", "indexStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory implements Factory<OptionsPortfolioRiskAnalyzerChartHeaderDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore;
    private final Provider<QuoteHistoricalStore> quoteHistoricalStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionsPortfolioRiskAnalyzerChartHeaderStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory create(Provider<IndexStore> provider, Provider<OptionUnderlyingQuoteStore> provider2, Provider<QuoteHistoricalStore> provider3, Provider<DuxoBundle> provider4, Provider<OptionsPortfolioRiskAnalyzerChartHeaderStateProvider> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerChartHeaderDuxo newInstance(IndexStore indexStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, QuoteHistoricalStore quoteHistoricalStore, DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerChartHeaderStateProvider optionsPortfolioRiskAnalyzerChartHeaderStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(indexStore, optionUnderlyingQuoteStore, quoteHistoricalStore, duxoBundle, optionsPortfolioRiskAnalyzerChartHeaderStateProvider, savedStateHandle);
    }

    public OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory(Provider<IndexStore> indexStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerChartHeaderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.indexStore = indexStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.quoteHistoricalStore = quoteHistoricalStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionsPortfolioRiskAnalyzerChartHeaderDuxo get() {
        Companion companion = INSTANCE;
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionUnderlyingQuoteStore optionUnderlyingQuoteStore = this.optionUnderlyingQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUnderlyingQuoteStore, "get(...)");
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteHistoricalStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OptionsPortfolioRiskAnalyzerChartHeaderStateProvider optionsPortfolioRiskAnalyzerChartHeaderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsPortfolioRiskAnalyzerChartHeaderStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(indexStore, optionUnderlyingQuoteStore, quoteHistoricalStore, duxoBundle, optionsPortfolioRiskAnalyzerChartHeaderStateProvider, savedStateHandle);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory;", "indexStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDuxo;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory create(Provider<IndexStore> indexStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerChartHeaderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerChartHeaderDuxo_Factory(indexStore, optionUnderlyingQuoteStore, quoteHistoricalStore, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerChartHeaderDuxo newInstance(IndexStore indexStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, QuoteHistoricalStore quoteHistoricalStore, DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerChartHeaderStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerChartHeaderDuxo(indexStore, optionUnderlyingQuoteStore, quoteHistoricalStore, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
