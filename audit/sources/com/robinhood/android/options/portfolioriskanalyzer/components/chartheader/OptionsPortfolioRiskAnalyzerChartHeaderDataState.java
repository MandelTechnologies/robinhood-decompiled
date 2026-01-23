package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderDataState;", "", "accountNumber", "", "equityHistorical", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "underlying", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getAccountNumber", "()Ljava/lang/String;", "getEquityHistorical", "()Lcom/robinhood/models/ui/UiQuoteHistorical;", "getIndexCloseValue", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getUnderlying", "()Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerChartHeaderDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UiQuoteHistorical equityHistorical;
    private final IndexCloseValue indexCloseValue;
    private final OptionSimulatedChartBundle5 underlying;
    private final UnderlyingQuote underlyingQuote;

    public OptionsPortfolioRiskAnalyzerChartHeaderDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerChartHeaderDataState copy$default(OptionsPortfolioRiskAnalyzerChartHeaderDataState optionsPortfolioRiskAnalyzerChartHeaderDataState, String str, UiQuoteHistorical uiQuoteHistorical, IndexCloseValue indexCloseValue, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, UnderlyingQuote underlyingQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsPortfolioRiskAnalyzerChartHeaderDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            uiQuoteHistorical = optionsPortfolioRiskAnalyzerChartHeaderDataState.equityHistorical;
        }
        if ((i & 4) != 0) {
            indexCloseValue = optionsPortfolioRiskAnalyzerChartHeaderDataState.indexCloseValue;
        }
        if ((i & 8) != 0) {
            optionSimulatedChartBundle5 = optionsPortfolioRiskAnalyzerChartHeaderDataState.underlying;
        }
        if ((i & 16) != 0) {
            underlyingQuote = optionsPortfolioRiskAnalyzerChartHeaderDataState.underlyingQuote;
        }
        UnderlyingQuote underlyingQuote2 = underlyingQuote;
        IndexCloseValue indexCloseValue2 = indexCloseValue;
        return optionsPortfolioRiskAnalyzerChartHeaderDataState.copy(str, uiQuoteHistorical, indexCloseValue2, optionSimulatedChartBundle5, underlyingQuote2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UiQuoteHistorical getEquityHistorical() {
        return this.equityHistorical;
    }

    /* renamed from: component3, reason: from getter */
    public final IndexCloseValue getIndexCloseValue() {
        return this.indexCloseValue;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    /* renamed from: component5, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final OptionsPortfolioRiskAnalyzerChartHeaderDataState copy(String accountNumber, UiQuoteHistorical equityHistorical, IndexCloseValue indexCloseValue, OptionSimulatedChartBundle5 underlying, UnderlyingQuote underlyingQuote) {
        return new OptionsPortfolioRiskAnalyzerChartHeaderDataState(accountNumber, equityHistorical, indexCloseValue, underlying, underlyingQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerChartHeaderDataState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerChartHeaderDataState optionsPortfolioRiskAnalyzerChartHeaderDataState = (OptionsPortfolioRiskAnalyzerChartHeaderDataState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsPortfolioRiskAnalyzerChartHeaderDataState.accountNumber) && Intrinsics.areEqual(this.equityHistorical, optionsPortfolioRiskAnalyzerChartHeaderDataState.equityHistorical) && Intrinsics.areEqual(this.indexCloseValue, optionsPortfolioRiskAnalyzerChartHeaderDataState.indexCloseValue) && Intrinsics.areEqual(this.underlying, optionsPortfolioRiskAnalyzerChartHeaderDataState.underlying) && Intrinsics.areEqual(this.underlyingQuote, optionsPortfolioRiskAnalyzerChartHeaderDataState.underlyingQuote);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UiQuoteHistorical uiQuoteHistorical = this.equityHistorical;
        int iHashCode2 = (iHashCode + (uiQuoteHistorical == null ? 0 : uiQuoteHistorical.hashCode())) * 31;
        IndexCloseValue indexCloseValue = this.indexCloseValue;
        int iHashCode3 = (iHashCode2 + (indexCloseValue == null ? 0 : indexCloseValue.hashCode())) * 31;
        OptionSimulatedChartBundle5 optionSimulatedChartBundle5 = this.underlying;
        int iHashCode4 = (iHashCode3 + (optionSimulatedChartBundle5 == null ? 0 : optionSimulatedChartBundle5.hashCode())) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        return iHashCode4 + (underlyingQuote != null ? underlyingQuote.hashCode() : 0);
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerChartHeaderDataState(accountNumber=" + this.accountNumber + ", equityHistorical=" + this.equityHistorical + ", indexCloseValue=" + this.indexCloseValue + ", underlying=" + this.underlying + ", underlyingQuote=" + this.underlyingQuote + ")";
    }

    public OptionsPortfolioRiskAnalyzerChartHeaderDataState(String str, UiQuoteHistorical uiQuoteHistorical, IndexCloseValue indexCloseValue, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, UnderlyingQuote underlyingQuote) {
        this.accountNumber = str;
        this.equityHistorical = uiQuoteHistorical;
        this.indexCloseValue = indexCloseValue;
        this.underlying = optionSimulatedChartBundle5;
        this.underlyingQuote = underlyingQuote;
    }

    public /* synthetic */ OptionsPortfolioRiskAnalyzerChartHeaderDataState(String str, UiQuoteHistorical uiQuoteHistorical, IndexCloseValue indexCloseValue, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, UnderlyingQuote underlyingQuote, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uiQuoteHistorical, (i & 4) != 0 ? null : indexCloseValue, (i & 8) != 0 ? null : optionSimulatedChartBundle5, (i & 16) != 0 ? null : underlyingQuote);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UiQuoteHistorical getEquityHistorical() {
        return this.equityHistorical;
    }

    public final IndexCloseValue getIndexCloseValue() {
        return this.indexCloseValue;
    }

    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }
}
