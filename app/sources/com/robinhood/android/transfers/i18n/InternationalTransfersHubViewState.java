package com.robinhood.android.transfers.i18n;

import androidx.paging.PagedList;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.transfers.withdrawablecash.WithdrawableCashState;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternationalTransfersHubViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003,-.Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jw\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState;", "", "isPendingHistoryTitleVisible", "", "isCompletedHistoryVisible", "isLimitsSubtitleVisible", "pendingHistoryItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "completedHistoryItems", "actionsState", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "linkedAccountsState", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "withdrawableAmountState", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "<init>", "(ZZZLandroidx/paging/PagedList;Landroidx/paging/PagedList;Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;)V", "()Z", "getPendingHistoryItems", "()Landroidx/paging/PagedList;", "getCompletedHistoryItems", "getActionsState", "()Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "getLinkedAccountsState", "()Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "getWithdrawableAmountState", "()Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "TransferHubActionsState", "LinkedAccountsState", EquityOrderFormRowState2.AccountRowTestTag, "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransfersHubViewState {
    public static final int $stable = 8;
    private final TransferHubActionsState actionsState;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> completedHistoryItems;
    private final boolean isCompletedHistoryVisible;
    private final boolean isLimitsSubtitleVisible;
    private final boolean isPendingHistoryTitleVisible;
    private final LinkedAccountsState linkedAccountsState;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems;
    private final WithdrawableCashState withdrawableAmountState;

    public static /* synthetic */ InternationalTransfersHubViewState copy$default(InternationalTransfersHubViewState internationalTransfersHubViewState, boolean z, boolean z2, boolean z3, PagedList pagedList, PagedList pagedList2, TransferHubActionsState transferHubActionsState, LinkedAccountsState linkedAccountsState, WithdrawableCashState withdrawableCashState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = internationalTransfersHubViewState.isPendingHistoryTitleVisible;
        }
        if ((i & 2) != 0) {
            z2 = internationalTransfersHubViewState.isCompletedHistoryVisible;
        }
        if ((i & 4) != 0) {
            z3 = internationalTransfersHubViewState.isLimitsSubtitleVisible;
        }
        if ((i & 8) != 0) {
            pagedList = internationalTransfersHubViewState.pendingHistoryItems;
        }
        if ((i & 16) != 0) {
            pagedList2 = internationalTransfersHubViewState.completedHistoryItems;
        }
        if ((i & 32) != 0) {
            transferHubActionsState = internationalTransfersHubViewState.actionsState;
        }
        if ((i & 64) != 0) {
            linkedAccountsState = internationalTransfersHubViewState.linkedAccountsState;
        }
        if ((i & 128) != 0) {
            withdrawableCashState = internationalTransfersHubViewState.withdrawableAmountState;
        }
        LinkedAccountsState linkedAccountsState2 = linkedAccountsState;
        WithdrawableCashState withdrawableCashState2 = withdrawableCashState;
        PagedList pagedList3 = pagedList2;
        TransferHubActionsState transferHubActionsState2 = transferHubActionsState;
        return internationalTransfersHubViewState.copy(z, z2, z3, pagedList, pagedList3, transferHubActionsState2, linkedAccountsState2, withdrawableCashState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPendingHistoryTitleVisible() {
        return this.isPendingHistoryTitleVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCompletedHistoryVisible() {
        return this.isCompletedHistoryVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLimitsSubtitleVisible() {
        return this.isLimitsSubtitleVisible;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component4() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component5() {
        return this.completedHistoryItems;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferHubActionsState getActionsState() {
        return this.actionsState;
    }

    /* renamed from: component7, reason: from getter */
    public final LinkedAccountsState getLinkedAccountsState() {
        return this.linkedAccountsState;
    }

    /* renamed from: component8, reason: from getter */
    public final WithdrawableCashState getWithdrawableAmountState() {
        return this.withdrawableAmountState;
    }

    public final InternationalTransfersHubViewState copy(boolean isPendingHistoryTitleVisible, boolean isCompletedHistoryVisible, boolean isLimitsSubtitleVisible, PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems, PagedList<StatefulHistoryEvent<HistoryEvent>> completedHistoryItems, TransferHubActionsState actionsState, LinkedAccountsState linkedAccountsState, WithdrawableCashState withdrawableAmountState) {
        Intrinsics.checkNotNullParameter(actionsState, "actionsState");
        Intrinsics.checkNotNullParameter(linkedAccountsState, "linkedAccountsState");
        return new InternationalTransfersHubViewState(isPendingHistoryTitleVisible, isCompletedHistoryVisible, isLimitsSubtitleVisible, pendingHistoryItems, completedHistoryItems, actionsState, linkedAccountsState, withdrawableAmountState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransfersHubViewState)) {
            return false;
        }
        InternationalTransfersHubViewState internationalTransfersHubViewState = (InternationalTransfersHubViewState) other;
        return this.isPendingHistoryTitleVisible == internationalTransfersHubViewState.isPendingHistoryTitleVisible && this.isCompletedHistoryVisible == internationalTransfersHubViewState.isCompletedHistoryVisible && this.isLimitsSubtitleVisible == internationalTransfersHubViewState.isLimitsSubtitleVisible && Intrinsics.areEqual(this.pendingHistoryItems, internationalTransfersHubViewState.pendingHistoryItems) && Intrinsics.areEqual(this.completedHistoryItems, internationalTransfersHubViewState.completedHistoryItems) && Intrinsics.areEqual(this.actionsState, internationalTransfersHubViewState.actionsState) && Intrinsics.areEqual(this.linkedAccountsState, internationalTransfersHubViewState.linkedAccountsState) && Intrinsics.areEqual(this.withdrawableAmountState, internationalTransfersHubViewState.withdrawableAmountState);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isPendingHistoryTitleVisible) * 31) + Boolean.hashCode(this.isCompletedHistoryVisible)) * 31) + Boolean.hashCode(this.isLimitsSubtitleVisible)) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pendingHistoryItems;
        int iHashCode2 = (iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2 = this.completedHistoryItems;
        int iHashCode3 = (((((iHashCode2 + (pagedList2 == null ? 0 : pagedList2.hashCode())) * 31) + this.actionsState.hashCode()) * 31) + this.linkedAccountsState.hashCode()) * 31;
        WithdrawableCashState withdrawableCashState = this.withdrawableAmountState;
        return iHashCode3 + (withdrawableCashState != null ? withdrawableCashState.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransfersHubViewState(isPendingHistoryTitleVisible=" + this.isPendingHistoryTitleVisible + ", isCompletedHistoryVisible=" + this.isCompletedHistoryVisible + ", isLimitsSubtitleVisible=" + this.isLimitsSubtitleVisible + ", pendingHistoryItems=" + this.pendingHistoryItems + ", completedHistoryItems=" + this.completedHistoryItems + ", actionsState=" + this.actionsState + ", linkedAccountsState=" + this.linkedAccountsState + ", withdrawableAmountState=" + this.withdrawableAmountState + ")";
    }

    public InternationalTransfersHubViewState(boolean z, boolean z2, boolean z3, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2, TransferHubActionsState actionsState, LinkedAccountsState linkedAccountsState, WithdrawableCashState withdrawableCashState) {
        Intrinsics.checkNotNullParameter(actionsState, "actionsState");
        Intrinsics.checkNotNullParameter(linkedAccountsState, "linkedAccountsState");
        this.isPendingHistoryTitleVisible = z;
        this.isCompletedHistoryVisible = z2;
        this.isLimitsSubtitleVisible = z3;
        this.pendingHistoryItems = pagedList;
        this.completedHistoryItems = pagedList2;
        this.actionsState = actionsState;
        this.linkedAccountsState = linkedAccountsState;
        this.withdrawableAmountState = withdrawableCashState;
    }

    public /* synthetic */ InternationalTransfersHubViewState(boolean z, boolean z2, boolean z3, PagedList pagedList, PagedList pagedList2, TransferHubActionsState transferHubActionsState, LinkedAccountsState linkedAccountsState, WithdrawableCashState withdrawableCashState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? null : pagedList, (i & 16) != 0 ? null : pagedList2, transferHubActionsState, linkedAccountsState, (i & 128) != 0 ? null : withdrawableCashState);
    }

    public final boolean isPendingHistoryTitleVisible() {
        return this.isPendingHistoryTitleVisible;
    }

    public final boolean isCompletedHistoryVisible() {
        return this.isCompletedHistoryVisible;
    }

    public final boolean isLimitsSubtitleVisible() {
        return this.isLimitsSubtitleVisible;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getPendingHistoryItems() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getCompletedHistoryItems() {
        return this.completedHistoryItems;
    }

    public final TransferHubActionsState getActionsState() {
        return this.actionsState;
    }

    public final LinkedAccountsState getLinkedAccountsState() {
        return this.linkedAccountsState;
    }

    public final WithdrawableCashState getWithdrawableAmountState() {
        return this.withdrawableAmountState;
    }

    /* compiled from: InternationalTransfersHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "", "ActionBar", "ActionBarWithRows", "Rows", "Loading", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBar;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$Loading;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$Rows;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TransferHubActionsState {

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBar;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ActionBar implements TransferHubActionsState {
            public static final int $stable = 0;
            public static final ActionBar INSTANCE = new ActionBar();

            public boolean equals(Object other) {
                return this == other || (other instanceof ActionBar);
            }

            public int hashCode() {
                return 1607333126;
            }

            public String toString() {
                return "ActionBar";
            }

            private ActionBar() {
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "rows", "", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows$ActionRow;", "<init>", "(Ljava/util/List;)V", "getRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ActionRow", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ActionBarWithRows implements TransferHubActionsState {
            public static final int $stable = 8;
            private final List<ActionRow> rows;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ActionBarWithRows copy$default(ActionBarWithRows actionBarWithRows, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = actionBarWithRows.rows;
                }
                return actionBarWithRows.copy(list);
            }

            public final List<ActionRow> component1() {
                return this.rows;
            }

            public final ActionBarWithRows copy(List<? extends ActionRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                return new ActionBarWithRows(rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActionBarWithRows) && Intrinsics.areEqual(this.rows, ((ActionBarWithRows) other).rows);
            }

            public int hashCode() {
                return this.rows.hashCode();
            }

            public String toString() {
                return "ActionBarWithRows(rows=" + this.rows + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ActionBarWithRows(List<? extends ActionRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                this.rows = rows;
            }

            public final List<ActionRow> getRows() {
                return this.rows;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: InternationalTransfersHubViewState.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows$ActionRow;", "", "title", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;IILcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getTitle", "()I", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "TRANSFER_IN_IRA", "TRANSFER_BETWEEN_ACCOUNTS", "VIEW_TRANSFER_LIMITS", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class ActionRow {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ActionRow[] $VALUES;
                private final ServerToBentoAssetMapper2 icon;
                private final int title;
                public static final ActionRow TRANSFER_IN_IRA = new ActionRow("TRANSFER_IN_IRA", 0, C30556R.string.transfer_isa_in_title, ServerToBentoAssetMapper2.DOWNLOAD_24);
                public static final ActionRow TRANSFER_BETWEEN_ACCOUNTS = new ActionRow("TRANSFER_BETWEEN_ACCOUNTS", 1, C30556R.string.transfer_between_accounts_title, ServerToBentoAssetMapper2.TRANSFERS_24);
                public static final ActionRow VIEW_TRANSFER_LIMITS = new ActionRow("VIEW_TRANSFER_LIMITS", 2, C30556R.string.view_transfer_limits_title, ServerToBentoAssetMapper2.RHW_BROWSER_TAB_24);

                private static final /* synthetic */ ActionRow[] $values() {
                    return new ActionRow[]{TRANSFER_IN_IRA, TRANSFER_BETWEEN_ACCOUNTS, VIEW_TRANSFER_LIMITS};
                }

                public static EnumEntries<ActionRow> getEntries() {
                    return $ENTRIES;
                }

                private ActionRow(String str, int i, int i2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
                    this.title = i2;
                    this.icon = serverToBentoAssetMapper2;
                }

                public final int getTitle() {
                    return this.title;
                }

                public final ServerToBentoAssetMapper2 getIcon() {
                    return this.icon;
                }

                static {
                    ActionRow[] actionRowArr$values = $values();
                    $VALUES = actionRowArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(actionRowArr$values);
                }

                public static ActionRow valueOf(String str) {
                    return (ActionRow) Enum.valueOf(ActionRow.class, str);
                }

                public static ActionRow[] values() {
                    return (ActionRow[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$Rows;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Rows implements TransferHubActionsState {
            public static final int $stable = 0;
            public static final Rows INSTANCE = new Rows();

            public boolean equals(Object other) {
                return this == other || (other instanceof Rows);
            }

            public int hashCode() {
                return 798973232;
            }

            public String toString() {
                return "Rows";
            }

            private Rows() {
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$Loading;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements TransferHubActionsState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1547914619;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }
    }

    /* compiled from: InternationalTransfersHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "", "isVisible", "", "()Z", "Loading", "Empty", "Hidden", "Loaded", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Empty;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Hidden;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Loaded;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Loading;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LinkedAccountsState {
        boolean isVisible();

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Loading;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements LinkedAccountsState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 510408185;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }

            @Override // com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState.LinkedAccountsState
            public boolean isVisible() {
                return DefaultImpls.isVisible(this);
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Empty;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Empty implements LinkedAccountsState {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -1351228086;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }

            @Override // com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState.LinkedAccountsState
            public boolean isVisible() {
                return DefaultImpls.isVisible(this);
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Hidden;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Hidden implements LinkedAccountsState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            public boolean equals(Object other) {
                return this == other || (other instanceof Hidden);
            }

            public int hashCode() {
                return 1143422285;
            }

            public String toString() {
                return "Hidden";
            }

            private Hidden() {
            }

            @Override // com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState.LinkedAccountsState
            public boolean isVisible() {
                return DefaultImpls.isVisible(this);
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState$Loaded;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "accountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getAccountRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements LinkedAccountsState {
            public static final int $stable = 0;
            private final ImmutableList<AccountRow> accountRows;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    immutableList = loaded.accountRows;
                }
                return loaded.copy(immutableList);
            }

            public final ImmutableList<AccountRow> component1() {
                return this.accountRows;
            }

            public final Loaded copy(ImmutableList<AccountRow> accountRows) {
                Intrinsics.checkNotNullParameter(accountRows, "accountRows");
                return new Loaded(accountRows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && Intrinsics.areEqual(this.accountRows, ((Loaded) other).accountRows);
            }

            public int hashCode() {
                return this.accountRows.hashCode();
            }

            public String toString() {
                return "Loaded(accountRows=" + this.accountRows + ")";
            }

            public Loaded(ImmutableList<AccountRow> accountRows) {
                Intrinsics.checkNotNullParameter(accountRows, "accountRows");
                this.accountRows = accountRows;
            }

            @Override // com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState.LinkedAccountsState
            public boolean isVisible() {
                return DefaultImpls.isVisible(this);
            }

            public final ImmutableList<AccountRow> getAccountRows() {
                return this.accountRows;
            }
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean isVisible(LinkedAccountsState linkedAccountsState) {
                return !(linkedAccountsState instanceof Hidden);
            }
        }
    }

    /* compiled from: InternationalTransfersHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "", "primaryText", "", "secondaryText", "metadata", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getMetadata", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "equals", "", "other", "hashCode", "toString", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountRow {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ServerToBentoAssetMapper2 icon;
        private final Integer metadata;
        private final String primaryText;
        private final String secondaryText;

        public static /* synthetic */ AccountRow copy$default(AccountRow accountRow, String str, String str2, Integer num, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountRow.primaryText;
            }
            if ((i & 2) != 0) {
                str2 = accountRow.secondaryText;
            }
            if ((i & 4) != 0) {
                num = accountRow.metadata;
            }
            if ((i & 8) != 0) {
                serverToBentoAssetMapper2 = accountRow.icon;
            }
            return accountRow.copy(str, str2, num, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMetadata() {
            return this.metadata;
        }

        /* renamed from: component4, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final AccountRow copy(String primaryText, String secondaryText, Integer metadata, ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new AccountRow(primaryText, secondaryText, metadata, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountRow)) {
                return false;
            }
            AccountRow accountRow = (AccountRow) other;
            return Intrinsics.areEqual(this.primaryText, accountRow.primaryText) && Intrinsics.areEqual(this.secondaryText, accountRow.secondaryText) && Intrinsics.areEqual(this.metadata, accountRow.metadata) && this.icon == accountRow.icon;
        }

        public int hashCode() {
            int iHashCode = ((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31;
            Integer num = this.metadata;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
            return iHashCode2 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
        }

        public String toString() {
            return "AccountRow(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metadata=" + this.metadata + ", icon=" + this.icon + ")";
        }

        public AccountRow(String primaryText, String secondaryText, Integer num, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.metadata = num;
            this.icon = serverToBentoAssetMapper2;
        }

        public /* synthetic */ AccountRow(String str, String str2, Integer num, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, num, (i & 8) != 0 ? null : serverToBentoAssetMapper2);
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final Integer getMetadata() {
            return this.metadata;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* compiled from: InternationalTransfersHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow$Companion;", "", "<init>", "()V", "bankAccountDefault", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "bankName", "", "accountNumberLastFour", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final AccountRow bankAccountDefault(String bankName, String accountNumberLastFour) {
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Intrinsics.checkNotNullParameter(accountNumberLastFour, "accountNumberLastFour");
                return new AccountRow(bankName, StringsKt.repeat("•", 4) + accountNumberLastFour, Integer.valueOf(C11048R.string.general_label_verified), null, 8, null);
            }
        }
    }
}
