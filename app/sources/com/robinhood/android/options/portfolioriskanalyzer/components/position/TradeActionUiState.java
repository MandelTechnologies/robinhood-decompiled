package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeActionUiState;", "", "rollActionButtonUiState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;", "openActionButtonUiState", "closeActionButtonUiState", "<init>", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;)V", "getRollActionButtonUiState", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeButtonUiState;", "getOpenActionButtonUiState", "getCloseActionButtonUiState", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TradeActionUiState {
    public static final int $stable = 8;
    private final TradeButtonUiState closeActionButtonUiState;
    private final TradeButtonUiState openActionButtonUiState;
    private final TradeButtonUiState rollActionButtonUiState;

    public TradeActionUiState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ TradeActionUiState copy$default(TradeActionUiState tradeActionUiState, TradeButtonUiState tradeButtonUiState, TradeButtonUiState tradeButtonUiState2, TradeButtonUiState tradeButtonUiState3, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeButtonUiState = tradeActionUiState.rollActionButtonUiState;
        }
        if ((i & 2) != 0) {
            tradeButtonUiState2 = tradeActionUiState.openActionButtonUiState;
        }
        if ((i & 4) != 0) {
            tradeButtonUiState3 = tradeActionUiState.closeActionButtonUiState;
        }
        return tradeActionUiState.copy(tradeButtonUiState, tradeButtonUiState2, tradeButtonUiState3);
    }

    /* renamed from: component1, reason: from getter */
    public final TradeButtonUiState getRollActionButtonUiState() {
        return this.rollActionButtonUiState;
    }

    /* renamed from: component2, reason: from getter */
    public final TradeButtonUiState getOpenActionButtonUiState() {
        return this.openActionButtonUiState;
    }

    /* renamed from: component3, reason: from getter */
    public final TradeButtonUiState getCloseActionButtonUiState() {
        return this.closeActionButtonUiState;
    }

    public final TradeActionUiState copy(TradeButtonUiState rollActionButtonUiState, TradeButtonUiState openActionButtonUiState, TradeButtonUiState closeActionButtonUiState) {
        Intrinsics.checkNotNullParameter(rollActionButtonUiState, "rollActionButtonUiState");
        Intrinsics.checkNotNullParameter(openActionButtonUiState, "openActionButtonUiState");
        Intrinsics.checkNotNullParameter(closeActionButtonUiState, "closeActionButtonUiState");
        return new TradeActionUiState(rollActionButtonUiState, openActionButtonUiState, closeActionButtonUiState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeActionUiState)) {
            return false;
        }
        TradeActionUiState tradeActionUiState = (TradeActionUiState) other;
        return Intrinsics.areEqual(this.rollActionButtonUiState, tradeActionUiState.rollActionButtonUiState) && Intrinsics.areEqual(this.openActionButtonUiState, tradeActionUiState.openActionButtonUiState) && Intrinsics.areEqual(this.closeActionButtonUiState, tradeActionUiState.closeActionButtonUiState);
    }

    public int hashCode() {
        return (((this.rollActionButtonUiState.hashCode() * 31) + this.openActionButtonUiState.hashCode()) * 31) + this.closeActionButtonUiState.hashCode();
    }

    public String toString() {
        return "TradeActionUiState(rollActionButtonUiState=" + this.rollActionButtonUiState + ", openActionButtonUiState=" + this.openActionButtonUiState + ", closeActionButtonUiState=" + this.closeActionButtonUiState + ")";
    }

    public TradeActionUiState(TradeButtonUiState rollActionButtonUiState, TradeButtonUiState openActionButtonUiState, TradeButtonUiState closeActionButtonUiState) {
        Intrinsics.checkNotNullParameter(rollActionButtonUiState, "rollActionButtonUiState");
        Intrinsics.checkNotNullParameter(openActionButtonUiState, "openActionButtonUiState");
        Intrinsics.checkNotNullParameter(closeActionButtonUiState, "closeActionButtonUiState");
        this.rollActionButtonUiState = rollActionButtonUiState;
        this.openActionButtonUiState = openActionButtonUiState;
        this.closeActionButtonUiState = closeActionButtonUiState;
    }

    public /* synthetic */ TradeActionUiState(TradeButtonUiState tradeButtonUiState, TradeButtonUiState tradeButtonUiState2, TradeButtonUiState tradeButtonUiState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TradeButtonUiState(false, null, 3, null) : tradeButtonUiState, (i & 2) != 0 ? new TradeButtonUiState(false, null, 3, null) : tradeButtonUiState2, (i & 4) != 0 ? new TradeButtonUiState(false, null, 3, null) : tradeButtonUiState3);
    }

    public final TradeButtonUiState getRollActionButtonUiState() {
        return this.rollActionButtonUiState;
    }

    public final TradeButtonUiState getOpenActionButtonUiState() {
        return this.openActionButtonUiState;
    }

    public final TradeButtonUiState getCloseActionButtonUiState() {
        return this.closeActionButtonUiState;
    }
}
