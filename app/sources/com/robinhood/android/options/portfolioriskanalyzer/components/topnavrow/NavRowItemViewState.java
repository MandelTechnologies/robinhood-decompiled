package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;", "", "underlyingId", "Ljava/util/UUID;", "symbol", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getUnderlyingId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavRowItemViewState {
    public static final int $stable = 8;
    private final String symbol;
    private final UUID underlyingId;

    public static /* synthetic */ NavRowItemViewState copy$default(NavRowItemViewState navRowItemViewState, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = navRowItemViewState.underlyingId;
        }
        if ((i & 2) != 0) {
            str = navRowItemViewState.symbol;
        }
        return navRowItemViewState.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final NavRowItemViewState copy(UUID underlyingId, String symbol) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new NavRowItemViewState(underlyingId, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavRowItemViewState)) {
            return false;
        }
        NavRowItemViewState navRowItemViewState = (NavRowItemViewState) other;
        return Intrinsics.areEqual(this.underlyingId, navRowItemViewState.underlyingId) && Intrinsics.areEqual(this.symbol, navRowItemViewState.symbol);
    }

    public int hashCode() {
        return (this.underlyingId.hashCode() * 31) + this.symbol.hashCode();
    }

    public String toString() {
        return "NavRowItemViewState(underlyingId=" + this.underlyingId + ", symbol=" + this.symbol + ")";
    }

    public NavRowItemViewState(UUID underlyingId, String symbol) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.underlyingId = underlyingId;
        this.symbol = symbol;
    }

    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    public final String getSymbol() {
        return this.symbol;
    }
}
