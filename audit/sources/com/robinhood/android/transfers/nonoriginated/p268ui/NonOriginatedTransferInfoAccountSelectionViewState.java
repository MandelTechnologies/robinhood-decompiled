package com.robinhood.android.transfers.nonoriginated.p268ui;

import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: NonOriginatedTransferInfoAccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NonOriginatedTransferInfoAccountSelectionViewState {
    public static final int $stable = 8;
    private final ImmutableList<AccountSelectorRowData> rows;
    private final StringResource title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NonOriginatedTransferInfoAccountSelectionViewState copy$default(NonOriginatedTransferInfoAccountSelectionViewState nonOriginatedTransferInfoAccountSelectionViewState, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = nonOriginatedTransferInfoAccountSelectionViewState.title;
        }
        if ((i & 2) != 0) {
            immutableList = nonOriginatedTransferInfoAccountSelectionViewState.rows;
        }
        return nonOriginatedTransferInfoAccountSelectionViewState.copy(stringResource, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<AccountSelectorRowData> component2() {
        return this.rows;
    }

    public final NonOriginatedTransferInfoAccountSelectionViewState copy(StringResource title, ImmutableList<AccountSelectorRowData> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new NonOriginatedTransferInfoAccountSelectionViewState(title, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonOriginatedTransferInfoAccountSelectionViewState)) {
            return false;
        }
        NonOriginatedTransferInfoAccountSelectionViewState nonOriginatedTransferInfoAccountSelectionViewState = (NonOriginatedTransferInfoAccountSelectionViewState) other;
        return Intrinsics.areEqual(this.title, nonOriginatedTransferInfoAccountSelectionViewState.title) && Intrinsics.areEqual(this.rows, nonOriginatedTransferInfoAccountSelectionViewState.rows);
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        return ((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.rows.hashCode();
    }

    public String toString() {
        return "NonOriginatedTransferInfoAccountSelectionViewState(title=" + this.title + ", rows=" + this.rows + ")";
    }

    public NonOriginatedTransferInfoAccountSelectionViewState(StringResource stringResource, ImmutableList<AccountSelectorRowData> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = stringResource;
        this.rows = rows;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<AccountSelectorRowData> getRows() {
        return this.rows;
    }
}
