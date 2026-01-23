package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRowViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/PnLColorType;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.PnLColorType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[] $VALUES;
    public static final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 POSITIVE = new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2("POSITIVE", 0);
    public static final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 NEGATIVE = new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2("NEGATIVE", 1);
    public static final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 NEUTRAL = new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2("NEUTRAL", 2);

    private static final /* synthetic */ OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[] $values() {
        return new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[]{POSITIVE, NEGATIVE, NEUTRAL};
    }

    public static EnumEntries<OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2> getEntries() {
        return $ENTRIES;
    }

    private OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2(String str, int i) {
    }

    static {
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[] optionsPortfolioRiskAnalyzerEquityPositionRowViewState2Arr$values = $values();
        $VALUES = optionsPortfolioRiskAnalyzerEquityPositionRowViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsPortfolioRiskAnalyzerEquityPositionRowViewState2Arr$values);
    }

    public static OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 valueOf(String str) {
        return (OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2) Enum.valueOf(OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.class, str);
    }

    public static OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[] values() {
        return (OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2[]) $VALUES.clone();
    }
}
