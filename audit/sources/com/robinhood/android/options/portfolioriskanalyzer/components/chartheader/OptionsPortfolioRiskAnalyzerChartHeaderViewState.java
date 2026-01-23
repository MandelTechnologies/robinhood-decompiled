package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerChartHeaderViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JK\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;", "", "underlying", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "underlyingDetailPageFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "underlyingSymbol", "", "underlyingPriceStr", "underlyingPercentageChangeStr", "underlyingChangeDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "<init>", "(Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/theme/Direction;)V", "getUnderlying", "()Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "getUnderlyingDetailPageFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getUnderlyingSymbol", "()Ljava/lang/String;", "getUnderlyingPriceStr", "getUnderlyingPercentageChangeStr", "getUnderlyingChangeDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getUnderlyingPriceAndPercentageChangeString", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerChartHeaderViewState {
    public static final int $stable = 8;
    private final OptionSimulatedChartBundle5 underlying;
    private final BentoTheme4 underlyingChangeDirection;
    private final FragmentKey underlyingDetailPageFragmentKey;
    private final String underlyingPercentageChangeStr;
    private final String underlyingPriceStr;
    private final String underlyingSymbol;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerChartHeaderViewState copy$default(OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, FragmentKey fragmentKey, String str, String str2, String str3, BentoTheme4 bentoTheme4, int i, Object obj) {
        if ((i & 1) != 0) {
            optionSimulatedChartBundle5 = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlying;
        }
        if ((i & 2) != 0) {
            fragmentKey = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingDetailPageFragmentKey;
        }
        if ((i & 4) != 0) {
            str = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingSymbol;
        }
        if ((i & 8) != 0) {
            str2 = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingPriceStr;
        }
        if ((i & 16) != 0) {
            str3 = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingPercentageChangeStr;
        }
        if ((i & 32) != 0) {
            bentoTheme4 = optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingChangeDirection;
        }
        String str4 = str3;
        BentoTheme4 bentoTheme42 = bentoTheme4;
        return optionsPortfolioRiskAnalyzerChartHeaderViewState.copy(optionSimulatedChartBundle5, fragmentKey, str, str2, str4, bentoTheme42);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    /* renamed from: component2, reason: from getter */
    public final FragmentKey getUnderlyingDetailPageFragmentKey() {
        return this.underlyingDetailPageFragmentKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnderlyingPriceStr() {
        return this.underlyingPriceStr;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUnderlyingPercentageChangeStr() {
        return this.underlyingPercentageChangeStr;
    }

    /* renamed from: component6, reason: from getter */
    public final BentoTheme4 getUnderlyingChangeDirection() {
        return this.underlyingChangeDirection;
    }

    public final OptionsPortfolioRiskAnalyzerChartHeaderViewState copy(OptionSimulatedChartBundle5 underlying, FragmentKey underlyingDetailPageFragmentKey, String underlyingSymbol, String underlyingPriceStr, String underlyingPercentageChangeStr, BentoTheme4 underlyingChangeDirection) {
        Intrinsics.checkNotNullParameter(underlyingSymbol, "underlyingSymbol");
        Intrinsics.checkNotNullParameter(underlyingPriceStr, "underlyingPriceStr");
        Intrinsics.checkNotNullParameter(underlyingChangeDirection, "underlyingChangeDirection");
        return new OptionsPortfolioRiskAnalyzerChartHeaderViewState(underlying, underlyingDetailPageFragmentKey, underlyingSymbol, underlyingPriceStr, underlyingPercentageChangeStr, underlyingChangeDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerChartHeaderViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState = (OptionsPortfolioRiskAnalyzerChartHeaderViewState) other;
        return Intrinsics.areEqual(this.underlying, optionsPortfolioRiskAnalyzerChartHeaderViewState.underlying) && Intrinsics.areEqual(this.underlyingDetailPageFragmentKey, optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingDetailPageFragmentKey) && Intrinsics.areEqual(this.underlyingSymbol, optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingSymbol) && Intrinsics.areEqual(this.underlyingPriceStr, optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingPriceStr) && Intrinsics.areEqual(this.underlyingPercentageChangeStr, optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingPercentageChangeStr) && this.underlyingChangeDirection == optionsPortfolioRiskAnalyzerChartHeaderViewState.underlyingChangeDirection;
    }

    public int hashCode() {
        OptionSimulatedChartBundle5 optionSimulatedChartBundle5 = this.underlying;
        int iHashCode = (optionSimulatedChartBundle5 == null ? 0 : optionSimulatedChartBundle5.hashCode()) * 31;
        FragmentKey fragmentKey = this.underlyingDetailPageFragmentKey;
        int iHashCode2 = (((((iHashCode + (fragmentKey == null ? 0 : fragmentKey.hashCode())) * 31) + this.underlyingSymbol.hashCode()) * 31) + this.underlyingPriceStr.hashCode()) * 31;
        String str = this.underlyingPercentageChangeStr;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.underlyingChangeDirection.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerChartHeaderViewState(underlying=" + this.underlying + ", underlyingDetailPageFragmentKey=" + this.underlyingDetailPageFragmentKey + ", underlyingSymbol=" + this.underlyingSymbol + ", underlyingPriceStr=" + this.underlyingPriceStr + ", underlyingPercentageChangeStr=" + this.underlyingPercentageChangeStr + ", underlyingChangeDirection=" + this.underlyingChangeDirection + ")";
    }

    public OptionsPortfolioRiskAnalyzerChartHeaderViewState(OptionSimulatedChartBundle5 optionSimulatedChartBundle5, FragmentKey fragmentKey, String underlyingSymbol, String underlyingPriceStr, String str, BentoTheme4 underlyingChangeDirection) {
        Intrinsics.checkNotNullParameter(underlyingSymbol, "underlyingSymbol");
        Intrinsics.checkNotNullParameter(underlyingPriceStr, "underlyingPriceStr");
        Intrinsics.checkNotNullParameter(underlyingChangeDirection, "underlyingChangeDirection");
        this.underlying = optionSimulatedChartBundle5;
        this.underlyingDetailPageFragmentKey = fragmentKey;
        this.underlyingSymbol = underlyingSymbol;
        this.underlyingPriceStr = underlyingPriceStr;
        this.underlyingPercentageChangeStr = str;
        this.underlyingChangeDirection = underlyingChangeDirection;
    }

    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final FragmentKey getUnderlyingDetailPageFragmentKey() {
        return this.underlyingDetailPageFragmentKey;
    }

    public final String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }

    public final String getUnderlyingPriceStr() {
        return this.underlyingPriceStr;
    }

    public final String getUnderlyingPercentageChangeStr() {
        return this.underlyingPercentageChangeStr;
    }

    public final BentoTheme4 getUnderlyingChangeDirection() {
        return this.underlyingChangeDirection;
    }

    public final String getUnderlyingPriceAndPercentageChangeString(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String str = this.underlyingPercentageChangeStr;
        if (str == null) {
            return this.underlyingPriceStr;
        }
        String string2 = resources.getString(C11048R.string.general_number_and_percent_change_format, this.underlyingPriceStr, str);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
