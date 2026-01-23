package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchPositionRowViewState;", "", "underlyingId", "Ljava/util/UUID;", "name", "", "symbol", "positionCount", "", "isEquity", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;IZ)V", "getUnderlyingId", "()Ljava/util/UUID;", "getName", "()Ljava/lang/String;", "getSymbol", "getPositionCount", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerSearchPositionRowViewState {
    public static final int $stable = 8;
    private final boolean isEquity;
    private final String name;
    private final int positionCount;
    private final String symbol;
    private final UUID underlyingId;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerSearchPositionRowViewState copy$default(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState, UUID uuid, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = optionsPortfolioRiskAnalyzerSearchPositionRowViewState.underlyingId;
        }
        if ((i2 & 2) != 0) {
            str = optionsPortfolioRiskAnalyzerSearchPositionRowViewState.name;
        }
        if ((i2 & 4) != 0) {
            str2 = optionsPortfolioRiskAnalyzerSearchPositionRowViewState.symbol;
        }
        if ((i2 & 8) != 0) {
            i = optionsPortfolioRiskAnalyzerSearchPositionRowViewState.positionCount;
        }
        if ((i2 & 16) != 0) {
            z = optionsPortfolioRiskAnalyzerSearchPositionRowViewState.isEquity;
        }
        boolean z2 = z;
        String str3 = str2;
        return optionsPortfolioRiskAnalyzerSearchPositionRowViewState.copy(uuid, str, str3, i, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPositionCount() {
        return this.positionCount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsEquity() {
        return this.isEquity;
    }

    public final OptionsPortfolioRiskAnalyzerSearchPositionRowViewState copy(UUID underlyingId, String name, String symbol, int positionCount, boolean isEquity) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new OptionsPortfolioRiskAnalyzerSearchPositionRowViewState(underlyingId, name, symbol, positionCount, isEquity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerSearchPositionRowViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState = (OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) other;
        return Intrinsics.areEqual(this.underlyingId, optionsPortfolioRiskAnalyzerSearchPositionRowViewState.underlyingId) && Intrinsics.areEqual(this.name, optionsPortfolioRiskAnalyzerSearchPositionRowViewState.name) && Intrinsics.areEqual(this.symbol, optionsPortfolioRiskAnalyzerSearchPositionRowViewState.symbol) && this.positionCount == optionsPortfolioRiskAnalyzerSearchPositionRowViewState.positionCount && this.isEquity == optionsPortfolioRiskAnalyzerSearchPositionRowViewState.isEquity;
    }

    public int hashCode() {
        return (((((((this.underlyingId.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31) + Integer.hashCode(this.positionCount)) * 31) + Boolean.hashCode(this.isEquity);
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerSearchPositionRowViewState(underlyingId=" + this.underlyingId + ", name=" + this.name + ", symbol=" + this.symbol + ", positionCount=" + this.positionCount + ", isEquity=" + this.isEquity + ")";
    }

    public OptionsPortfolioRiskAnalyzerSearchPositionRowViewState(UUID underlyingId, String name, String symbol, int i, boolean z) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.underlyingId = underlyingId;
        this.name = name;
        this.symbol = symbol;
        this.positionCount = i;
        this.isEquity = z;
    }

    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final int getPositionCount() {
        return this.positionCount;
    }

    public final boolean isEquity() {
        return this.isEquity;
    }
}
