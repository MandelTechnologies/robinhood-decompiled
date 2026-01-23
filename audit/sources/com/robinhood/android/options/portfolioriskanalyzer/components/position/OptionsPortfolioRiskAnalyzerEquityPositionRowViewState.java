package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRowViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "", "equityInstrumentId", "Ljava/util/UUID;", "title", "", "subtitle", "checked", "", "totalReturn", "totalReturnPercentage", "pnlColorType", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/PnLColorType;", "costBasis", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/PnLColorType;Ljava/lang/String;)V", "getEquityInstrumentId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getChecked", "()Z", "getTotalReturn", "getTotalReturnPercentage", "getPnlColorType", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/PnLColorType;", "getCostBasis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerEquityPositionRowViewState {
    public static final int $stable = 0;
    private final boolean checked;
    private final String costBasis;
    private final UUID equityInstrumentId;
    private final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 pnlColorType;
    private final String subtitle;
    private final String title;
    private final String totalReturn;
    private final String totalReturnPercentage;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerEquityPositionRowViewState copy$default(OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, UUID uuid, String str, String str2, boolean z, String str3, String str4, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 optionsPortfolioRiskAnalyzerEquityPositionRowViewState2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.equityInstrumentId;
        }
        if ((i & 2) != 0) {
            str = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.title;
        }
        if ((i & 4) != 0) {
            str2 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.subtitle;
        }
        if ((i & 8) != 0) {
            z = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.checked;
        }
        if ((i & 16) != 0) {
            str3 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.totalReturn;
        }
        if ((i & 32) != 0) {
            str4 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.totalReturnPercentage;
        }
        if ((i & 64) != 0) {
            optionsPortfolioRiskAnalyzerEquityPositionRowViewState2 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.pnlColorType;
        }
        if ((i & 128) != 0) {
            str5 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState.costBasis;
        }
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 optionsPortfolioRiskAnalyzerEquityPositionRowViewState22 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState2;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return optionsPortfolioRiskAnalyzerEquityPositionRowViewState.copy(uuid, str, str2, z, str7, str8, optionsPortfolioRiskAnalyzerEquityPositionRowViewState22, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTotalReturnPercentage() {
        return this.totalReturnPercentage;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 getPnlColorType() {
        return this.pnlColorType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCostBasis() {
        return this.costBasis;
    }

    public final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState copy(UUID equityInstrumentId, String title, String subtitle, boolean checked, String totalReturn, String totalReturnPercentage, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 pnlColorType, String costBasis) {
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(totalReturnPercentage, "totalReturnPercentage");
        Intrinsics.checkNotNullParameter(pnlColorType, "pnlColorType");
        Intrinsics.checkNotNullParameter(costBasis, "costBasis");
        return new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState(equityInstrumentId, title, subtitle, checked, totalReturn, totalReturnPercentage, pnlColorType, costBasis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerEquityPositionRowViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState = (OptionsPortfolioRiskAnalyzerEquityPositionRowViewState) other;
        return Intrinsics.areEqual(this.equityInstrumentId, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.equityInstrumentId) && Intrinsics.areEqual(this.title, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.title) && Intrinsics.areEqual(this.subtitle, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.subtitle) && this.checked == optionsPortfolioRiskAnalyzerEquityPositionRowViewState.checked && Intrinsics.areEqual(this.totalReturn, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.totalReturn) && Intrinsics.areEqual(this.totalReturnPercentage, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.totalReturnPercentage) && this.pnlColorType == optionsPortfolioRiskAnalyzerEquityPositionRowViewState.pnlColorType && Intrinsics.areEqual(this.costBasis, optionsPortfolioRiskAnalyzerEquityPositionRowViewState.costBasis);
    }

    public int hashCode() {
        return (((((((((((((this.equityInstrumentId.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + this.totalReturn.hashCode()) * 31) + this.totalReturnPercentage.hashCode()) * 31) + this.pnlColorType.hashCode()) * 31) + this.costBasis.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerEquityPositionRowViewState(equityInstrumentId=" + this.equityInstrumentId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", checked=" + this.checked + ", totalReturn=" + this.totalReturn + ", totalReturnPercentage=" + this.totalReturnPercentage + ", pnlColorType=" + this.pnlColorType + ", costBasis=" + this.costBasis + ")";
    }

    public OptionsPortfolioRiskAnalyzerEquityPositionRowViewState(UUID equityInstrumentId, String title, String subtitle, boolean z, String totalReturn, String totalReturnPercentage, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 pnlColorType, String costBasis) {
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(totalReturnPercentage, "totalReturnPercentage");
        Intrinsics.checkNotNullParameter(pnlColorType, "pnlColorType");
        Intrinsics.checkNotNullParameter(costBasis, "costBasis");
        this.equityInstrumentId = equityInstrumentId;
        this.title = title;
        this.subtitle = subtitle;
        this.checked = z;
        this.totalReturn = totalReturn;
        this.totalReturnPercentage = totalReturnPercentage;
        this.pnlColorType = pnlColorType;
        this.costBasis = costBasis;
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final String getTotalReturn() {
        return this.totalReturn;
    }

    public final String getTotalReturnPercentage() {
        return this.totalReturnPercentage;
    }

    public final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 getPnlColorType() {
        return this.pnlColorType;
    }

    public final String getCostBasis() {
        return this.costBasis;
    }
}
