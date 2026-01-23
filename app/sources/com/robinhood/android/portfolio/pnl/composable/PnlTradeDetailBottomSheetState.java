package com.robinhood.android.portfolio.pnl.composable;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlTradeDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;", "", ErrorResponse.DETAIL, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "cryptoCostBasisEnabled", "", "pnlUpdatesEnabled", "<init>", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZZ)V", "getDetail", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getCryptoCostBasisEnabled", "()Z", "getPnlUpdatesEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlTradeDetailBottomSheetState {
    public static final int $stable = 8;
    private final boolean cryptoCostBasisEnabled;
    private final ProfitAndLossTradeItem detail;
    private final boolean pnlUpdatesEnabled;

    public static /* synthetic */ PnlTradeDetailBottomSheetState copy$default(PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            profitAndLossTradeItem = pnlTradeDetailBottomSheetState.detail;
        }
        if ((i & 2) != 0) {
            z = pnlTradeDetailBottomSheetState.cryptoCostBasisEnabled;
        }
        if ((i & 4) != 0) {
            z2 = pnlTradeDetailBottomSheetState.pnlUpdatesEnabled;
        }
        return pnlTradeDetailBottomSheetState.copy(profitAndLossTradeItem, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ProfitAndLossTradeItem getDetail() {
        return this.detail;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCryptoCostBasisEnabled() {
        return this.cryptoCostBasisEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final PnlTradeDetailBottomSheetState copy(ProfitAndLossTradeItem detail, boolean cryptoCostBasisEnabled, boolean pnlUpdatesEnabled) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new PnlTradeDetailBottomSheetState(detail, cryptoCostBasisEnabled, pnlUpdatesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlTradeDetailBottomSheetState)) {
            return false;
        }
        PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState = (PnlTradeDetailBottomSheetState) other;
        return Intrinsics.areEqual(this.detail, pnlTradeDetailBottomSheetState.detail) && this.cryptoCostBasisEnabled == pnlTradeDetailBottomSheetState.cryptoCostBasisEnabled && this.pnlUpdatesEnabled == pnlTradeDetailBottomSheetState.pnlUpdatesEnabled;
    }

    public int hashCode() {
        return (((this.detail.hashCode() * 31) + Boolean.hashCode(this.cryptoCostBasisEnabled)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        return "PnlTradeDetailBottomSheetState(detail=" + this.detail + ", cryptoCostBasisEnabled=" + this.cryptoCostBasisEnabled + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    public PnlTradeDetailBottomSheetState(ProfitAndLossTradeItem detail, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.detail = detail;
        this.cryptoCostBasisEnabled = z;
        this.pnlUpdatesEnabled = z2;
    }

    public final ProfitAndLossTradeItem getDetail() {
        return this.detail;
    }

    public final boolean getCryptoCostBasisEnabled() {
        return this.cryptoCostBasisEnabled;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }
}
