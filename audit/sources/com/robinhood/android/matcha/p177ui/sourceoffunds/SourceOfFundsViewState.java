package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SourceOfFundsViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsViewState;", "", "isContinueButtonEnabled", "", "isAddDebitCardButtonVisible", "accountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "selectionEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "selectedAccountId", "", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "()Z", "getAccountRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectionEvent", "()Lcom/robinhood/udf/UiEvent;", "getSelectedAccountId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SourceOfFundsViewState {
    public static final int $stable = 8;
    private final ImmutableList<SourceOfFundsDataState2> accountRows;
    private final boolean isAddDebitCardButtonVisible;
    private final boolean isContinueButtonEnabled;
    private final String selectedAccountId;
    private final UiEvent<TransferAccount> selectionEvent;

    public static /* synthetic */ SourceOfFundsViewState copy$default(SourceOfFundsViewState sourceOfFundsViewState, boolean z, boolean z2, ImmutableList immutableList, UiEvent uiEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sourceOfFundsViewState.isContinueButtonEnabled;
        }
        if ((i & 2) != 0) {
            z2 = sourceOfFundsViewState.isAddDebitCardButtonVisible;
        }
        if ((i & 4) != 0) {
            immutableList = sourceOfFundsViewState.accountRows;
        }
        if ((i & 8) != 0) {
            uiEvent = sourceOfFundsViewState.selectionEvent;
        }
        if ((i & 16) != 0) {
            str = sourceOfFundsViewState.selectedAccountId;
        }
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        return sourceOfFundsViewState.copy(z, z2, immutableList2, uiEvent, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAddDebitCardButtonVisible() {
        return this.isAddDebitCardButtonVisible;
    }

    public final ImmutableList<SourceOfFundsDataState2> component3() {
        return this.accountRows;
    }

    public final UiEvent<TransferAccount> component4() {
        return this.selectionEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final SourceOfFundsViewState copy(boolean isContinueButtonEnabled, boolean isAddDebitCardButtonVisible, ImmutableList<? extends SourceOfFundsDataState2> accountRows, UiEvent<TransferAccount> selectionEvent, String selectedAccountId) {
        Intrinsics.checkNotNullParameter(accountRows, "accountRows");
        return new SourceOfFundsViewState(isContinueButtonEnabled, isAddDebitCardButtonVisible, accountRows, selectionEvent, selectedAccountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceOfFundsViewState)) {
            return false;
        }
        SourceOfFundsViewState sourceOfFundsViewState = (SourceOfFundsViewState) other;
        return this.isContinueButtonEnabled == sourceOfFundsViewState.isContinueButtonEnabled && this.isAddDebitCardButtonVisible == sourceOfFundsViewState.isAddDebitCardButtonVisible && Intrinsics.areEqual(this.accountRows, sourceOfFundsViewState.accountRows) && Intrinsics.areEqual(this.selectionEvent, sourceOfFundsViewState.selectionEvent) && Intrinsics.areEqual(this.selectedAccountId, sourceOfFundsViewState.selectedAccountId);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isContinueButtonEnabled) * 31) + Boolean.hashCode(this.isAddDebitCardButtonVisible)) * 31) + this.accountRows.hashCode()) * 31;
        UiEvent<TransferAccount> uiEvent = this.selectionEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        String str = this.selectedAccountId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SourceOfFundsViewState(isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", isAddDebitCardButtonVisible=" + this.isAddDebitCardButtonVisible + ", accountRows=" + this.accountRows + ", selectionEvent=" + this.selectionEvent + ", selectedAccountId=" + this.selectedAccountId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SourceOfFundsViewState(boolean z, boolean z2, ImmutableList<? extends SourceOfFundsDataState2> accountRows, UiEvent<TransferAccount> uiEvent, String str) {
        Intrinsics.checkNotNullParameter(accountRows, "accountRows");
        this.isContinueButtonEnabled = z;
        this.isAddDebitCardButtonVisible = z2;
        this.accountRows = accountRows;
        this.selectionEvent = uiEvent;
        this.selectedAccountId = str;
    }

    public final boolean isContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final boolean isAddDebitCardButtonVisible() {
        return this.isAddDebitCardButtonVisible;
    }

    public final ImmutableList<SourceOfFundsDataState2> getAccountRows() {
        return this.accountRows;
    }

    public final UiEvent<TransferAccount> getSelectionEvent() {
        return this.selectionEvent;
    }

    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }
}
