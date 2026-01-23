package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughSharesViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesViewState;", "", "notEnoughSharesRows", "", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesRowViewState;", "totalSellableShares", "", "showTotalSellableShares", "", "showPendingOrderButton", "showSellAllButton", "hasNoSellableShares", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "Lcom/robinhood/utils/resource/StringResource;", "dialogMessageRes", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getNotEnoughSharesRows", "()Ljava/util/List;", "getTotalSellableShares", "()Ljava/lang/String;", "getShowTotalSellableShares", "()Z", "getShowPendingOrderButton", "getShowSellAllButton", "getHasNoSellableShares", "getTitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "getDialogMessageRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NotEnoughSharesViewState {
    public static final int $stable = 8;
    private final StringResource dialogMessageRes;
    private final boolean hasNoSellableShares;
    private final List<NotEnoughSharesRowViewState> notEnoughSharesRows;
    private final boolean showPendingOrderButton;
    private final boolean showSellAllButton;
    private final boolean showTotalSellableShares;
    private final StringResource titleRes;
    private final String totalSellableShares;

    public static /* synthetic */ NotEnoughSharesViewState copy$default(NotEnoughSharesViewState notEnoughSharesViewState, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notEnoughSharesViewState.notEnoughSharesRows;
        }
        if ((i & 2) != 0) {
            str = notEnoughSharesViewState.totalSellableShares;
        }
        if ((i & 4) != 0) {
            z = notEnoughSharesViewState.showTotalSellableShares;
        }
        if ((i & 8) != 0) {
            z2 = notEnoughSharesViewState.showPendingOrderButton;
        }
        if ((i & 16) != 0) {
            z3 = notEnoughSharesViewState.showSellAllButton;
        }
        if ((i & 32) != 0) {
            z4 = notEnoughSharesViewState.hasNoSellableShares;
        }
        if ((i & 64) != 0) {
            stringResource = notEnoughSharesViewState.titleRes;
        }
        if ((i & 128) != 0) {
            stringResource2 = notEnoughSharesViewState.dialogMessageRes;
        }
        StringResource stringResource3 = stringResource;
        StringResource stringResource4 = stringResource2;
        boolean z5 = z3;
        boolean z6 = z4;
        return notEnoughSharesViewState.copy(list, str, z, z2, z5, z6, stringResource3, stringResource4);
    }

    public final List<NotEnoughSharesRowViewState> component1() {
        return this.notEnoughSharesRows;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTotalSellableShares() {
        return this.totalSellableShares;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowTotalSellableShares() {
        return this.showTotalSellableShares;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowPendingOrderButton() {
        return this.showPendingOrderButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowSellAllButton() {
        return this.showSellAllButton;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasNoSellableShares() {
        return this.hasNoSellableShares;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getDialogMessageRes() {
        return this.dialogMessageRes;
    }

    public final NotEnoughSharesViewState copy(List<NotEnoughSharesRowViewState> notEnoughSharesRows, String totalSellableShares, boolean showTotalSellableShares, boolean showPendingOrderButton, boolean showSellAllButton, boolean hasNoSellableShares, StringResource titleRes, StringResource dialogMessageRes) {
        Intrinsics.checkNotNullParameter(totalSellableShares, "totalSellableShares");
        Intrinsics.checkNotNullParameter(titleRes, "titleRes");
        return new NotEnoughSharesViewState(notEnoughSharesRows, totalSellableShares, showTotalSellableShares, showPendingOrderButton, showSellAllButton, hasNoSellableShares, titleRes, dialogMessageRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotEnoughSharesViewState)) {
            return false;
        }
        NotEnoughSharesViewState notEnoughSharesViewState = (NotEnoughSharesViewState) other;
        return Intrinsics.areEqual(this.notEnoughSharesRows, notEnoughSharesViewState.notEnoughSharesRows) && Intrinsics.areEqual(this.totalSellableShares, notEnoughSharesViewState.totalSellableShares) && this.showTotalSellableShares == notEnoughSharesViewState.showTotalSellableShares && this.showPendingOrderButton == notEnoughSharesViewState.showPendingOrderButton && this.showSellAllButton == notEnoughSharesViewState.showSellAllButton && this.hasNoSellableShares == notEnoughSharesViewState.hasNoSellableShares && Intrinsics.areEqual(this.titleRes, notEnoughSharesViewState.titleRes) && Intrinsics.areEqual(this.dialogMessageRes, notEnoughSharesViewState.dialogMessageRes);
    }

    public int hashCode() {
        List<NotEnoughSharesRowViewState> list = this.notEnoughSharesRows;
        int iHashCode = (((((((((((((list == null ? 0 : list.hashCode()) * 31) + this.totalSellableShares.hashCode()) * 31) + Boolean.hashCode(this.showTotalSellableShares)) * 31) + Boolean.hashCode(this.showPendingOrderButton)) * 31) + Boolean.hashCode(this.showSellAllButton)) * 31) + Boolean.hashCode(this.hasNoSellableShares)) * 31) + this.titleRes.hashCode()) * 31;
        StringResource stringResource = this.dialogMessageRes;
        return iHashCode + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "NotEnoughSharesViewState(notEnoughSharesRows=" + this.notEnoughSharesRows + ", totalSellableShares=" + this.totalSellableShares + ", showTotalSellableShares=" + this.showTotalSellableShares + ", showPendingOrderButton=" + this.showPendingOrderButton + ", showSellAllButton=" + this.showSellAllButton + ", hasNoSellableShares=" + this.hasNoSellableShares + ", titleRes=" + this.titleRes + ", dialogMessageRes=" + this.dialogMessageRes + ")";
    }

    public NotEnoughSharesViewState(List<NotEnoughSharesRowViewState> list, String totalSellableShares, boolean z, boolean z2, boolean z3, boolean z4, StringResource titleRes, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(totalSellableShares, "totalSellableShares");
        Intrinsics.checkNotNullParameter(titleRes, "titleRes");
        this.notEnoughSharesRows = list;
        this.totalSellableShares = totalSellableShares;
        this.showTotalSellableShares = z;
        this.showPendingOrderButton = z2;
        this.showSellAllButton = z3;
        this.hasNoSellableShares = z4;
        this.titleRes = titleRes;
        this.dialogMessageRes = stringResource;
    }

    public final List<NotEnoughSharesRowViewState> getNotEnoughSharesRows() {
        return this.notEnoughSharesRows;
    }

    public final String getTotalSellableShares() {
        return this.totalSellableShares;
    }

    public final boolean getShowTotalSellableShares() {
        return this.showTotalSellableShares;
    }

    public final boolean getShowPendingOrderButton() {
        return this.showPendingOrderButton;
    }

    public final boolean getShowSellAllButton() {
        return this.showSellAllButton;
    }

    public final boolean getHasNoSellableShares() {
        return this.hasNoSellableShares;
    }

    public final StringResource getTitleRes() {
        return this.titleRes;
    }

    public final StringResource getDialogMessageRes() {
        return this.dialogMessageRes;
    }
}
