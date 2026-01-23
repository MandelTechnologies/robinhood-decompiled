package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import com.robinhood.android.common.options.chart.OptionHistoricalChartHelper;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;", "<init>", "()V", "getUnderlyingDeltaAndPercentageStringAndDirection", "Lkotlin/Triple;", "", "Lcom/robinhood/compose/bento/theme/Direction;", "ds", "getUnderlyingDetailPageFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "reduce", "dataState", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerChartHeaderStateProvider implements StateProvider<OptionsPortfolioRiskAnalyzerChartHeaderDataState, OptionsPortfolioRiskAnalyzerChartHeaderViewState> {
    public static final int $stable = 0;

    /* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Tuples3<String, String, BentoTheme4> getUnderlyingDeltaAndPercentageStringAndDirection(OptionsPortfolioRiskAnalyzerChartHeaderDataState ds) {
        BigDecimal closeValue;
        BigDecimal value;
        String nullable$default;
        if (ds.getUnderlyingQuote() == null) {
            return new Tuples3<>("-", null, BentoTheme4.POSITIVE);
        }
        UnderlyingQuote underlyingQuote = ds.getUnderlyingQuote();
        if (underlyingQuote instanceof UnderlyingQuote.EquityQuote) {
            closeValue = OptionHistoricalChartHelper.getEquityDeltaFromPrice(((UnderlyingQuote.EquityQuote) ds.getUnderlyingQuote()).getEquityQuote(), ds.getEquityHistorical(), DisplaySpan.DAY);
        } else {
            if (!(underlyingQuote instanceof UnderlyingQuote.IndexQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            IndexCloseValue indexCloseValue = ds.getIndexCloseValue();
            closeValue = indexCloseValue != null ? indexCloseValue.getCloseValue() : null;
        }
        UnderlyingQuote underlyingQuote2 = ds.getUnderlyingQuote();
        if (underlyingQuote2 instanceof UnderlyingQuote.EquityQuote) {
            value = Money3.getBigDecimalCompat(((UnderlyingQuote.EquityQuote) ds.getUnderlyingQuote()).getEquityQuote().getLastTradePrice());
        } else {
            if (!(underlyingQuote2 instanceof UnderlyingQuote.IndexQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((UnderlyingQuote.IndexQuote) ds.getUnderlyingQuote()).getIndexValue().getValue();
        }
        BigDecimal bigDecimalCalculateDeltaValueFrom = NumberUtils.calculateDeltaValueFrom(value, closeValue);
        BigDecimal bigDecimalCalculateDeltaPercentFrom = NumberUtils.calculateDeltaPercentFrom(value, closeValue);
        UnderlyingQuote underlyingQuote3 = ds.getUnderlyingQuote();
        if (underlyingQuote3 instanceof UnderlyingQuote.EquityQuote) {
            nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getCurrencyFormat(), value, null, 2, null);
        } else {
            if (!(underlyingQuote3 instanceof UnderlyingQuote.IndexQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getNoCurrencyFormat(), value, null, 2, null);
        }
        return new Tuples3<>(nullable$default, bigDecimalCalculateDeltaPercentFrom != null ? NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaFormat(), bigDecimalCalculateDeltaPercentFrom, null, 2, null) : null, BigDecimals7.isNegative(bigDecimalCalculateDeltaValueFrom) ? BentoTheme4.NEGATIVE : BentoTheme4.POSITIVE);
    }

    private final FragmentKey getUnderlyingDetailPageFragmentKey(OptionsPortfolioRiskAnalyzerChartHeaderDataState ds) {
        OptionSimulatedChartBundle5 underlying = ds.getUnderlying();
        OptionChain.UnderlyingType type2 = underlying != null ? underlying.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new LegacyFragmentKey.EquityInstrumentDetail(ds.getUnderlying().getUnderlyingId(), null, ds.getAccountNumber(), InstrumentDetailSource.OPTION_PORTFOLIO_RISK_ANALYZER, false, 18, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new IndexDetailPageFragmentKey(ds.getUnderlying().getUnderlyingId(), ds.getAccountNumber(), IndexDetailPageFragmentKey2.OptionPortfolioRiskAnalyzer.INSTANCE);
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsPortfolioRiskAnalyzerChartHeaderViewState reduce(OptionsPortfolioRiskAnalyzerChartHeaderDataState dataState) {
        String symbol;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Tuples3<String, String, BentoTheme4> underlyingDeltaAndPercentageStringAndDirection = getUnderlyingDeltaAndPercentageStringAndDirection(dataState);
        String strComponent1 = underlyingDeltaAndPercentageStringAndDirection.component1();
        String strComponent2 = underlyingDeltaAndPercentageStringAndDirection.component2();
        BentoTheme4 bentoTheme4Component3 = underlyingDeltaAndPercentageStringAndDirection.component3();
        OptionSimulatedChartBundle5 underlying = dataState.getUnderlying();
        UnderlyingQuote underlyingQuote = dataState.getUnderlyingQuote();
        if (underlyingQuote == null || (symbol = underlyingQuote.getSymbol()) == null) {
            symbol = "";
        }
        return new OptionsPortfolioRiskAnalyzerChartHeaderViewState(underlying, getUnderlyingDetailPageFragmentKey(dataState), symbol, strComponent1, strComponent2, bentoTheme4Component3);
    }
}
