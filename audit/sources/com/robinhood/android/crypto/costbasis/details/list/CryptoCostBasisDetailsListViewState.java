package com.robinhood.android.crypto.costbasis.details.list;

import com.robinhood.android.crypto.costbasis.details.entry.CostBasisEntryArgs;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoCostBasisDetailsListViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0007\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListViewState;", "", "isLoading", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "spannedSubtitle", "isCompleted", "breakdownCardState", "Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "lots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/costbasis/details/list/CostBasisLotRowData;", "passthroughArgs", "Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;)V", "()Z", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSpannedSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBreakdownCardState", "()Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "getLots", "()Lkotlinx/collections/immutable/ImmutableList;", "getPassthroughArgs", "()Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;)Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisDetailsListViewState {
    public static final int $stable = 8;
    private final BreakdownCardState breakdownCardState;
    private final Boolean isCompleted;
    private final boolean isLoading;
    private final ImmutableList<CostBasisLotRowData> lots;
    private final CostBasisEntryArgs passthroughArgs;
    private final StringResource spannedSubtitle;
    private final StringResource title;

    public static /* synthetic */ CryptoCostBasisDetailsListViewState copy$default(CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, boolean z, StringResource stringResource, StringResource stringResource2, Boolean bool, BreakdownCardState breakdownCardState, ImmutableList immutableList, CostBasisEntryArgs costBasisEntryArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoCostBasisDetailsListViewState.isLoading;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoCostBasisDetailsListViewState.title;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoCostBasisDetailsListViewState.spannedSubtitle;
        }
        if ((i & 8) != 0) {
            bool = cryptoCostBasisDetailsListViewState.isCompleted;
        }
        if ((i & 16) != 0) {
            breakdownCardState = cryptoCostBasisDetailsListViewState.breakdownCardState;
        }
        if ((i & 32) != 0) {
            immutableList = cryptoCostBasisDetailsListViewState.lots;
        }
        if ((i & 64) != 0) {
            costBasisEntryArgs = cryptoCostBasisDetailsListViewState.passthroughArgs;
        }
        ImmutableList immutableList2 = immutableList;
        CostBasisEntryArgs costBasisEntryArgs2 = costBasisEntryArgs;
        BreakdownCardState breakdownCardState2 = breakdownCardState;
        StringResource stringResource3 = stringResource2;
        return cryptoCostBasisDetailsListViewState.copy(z, stringResource, stringResource3, bool, breakdownCardState2, immutableList2, costBasisEntryArgs2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSpannedSubtitle() {
        return this.spannedSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component5, reason: from getter */
    public final BreakdownCardState getBreakdownCardState() {
        return this.breakdownCardState;
    }

    public final ImmutableList<CostBasisLotRowData> component6() {
        return this.lots;
    }

    /* renamed from: component7, reason: from getter */
    public final CostBasisEntryArgs getPassthroughArgs() {
        return this.passthroughArgs;
    }

    public final CryptoCostBasisDetailsListViewState copy(boolean isLoading, StringResource title, StringResource spannedSubtitle, Boolean isCompleted, BreakdownCardState breakdownCardState, ImmutableList<CostBasisLotRowData> lots, CostBasisEntryArgs passthroughArgs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(spannedSubtitle, "spannedSubtitle");
        Intrinsics.checkNotNullParameter(lots, "lots");
        return new CryptoCostBasisDetailsListViewState(isLoading, title, spannedSubtitle, isCompleted, breakdownCardState, lots, passthroughArgs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisDetailsListViewState)) {
            return false;
        }
        CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState = (CryptoCostBasisDetailsListViewState) other;
        return this.isLoading == cryptoCostBasisDetailsListViewState.isLoading && Intrinsics.areEqual(this.title, cryptoCostBasisDetailsListViewState.title) && Intrinsics.areEqual(this.spannedSubtitle, cryptoCostBasisDetailsListViewState.spannedSubtitle) && Intrinsics.areEqual(this.isCompleted, cryptoCostBasisDetailsListViewState.isCompleted) && Intrinsics.areEqual(this.breakdownCardState, cryptoCostBasisDetailsListViewState.breakdownCardState) && Intrinsics.areEqual(this.lots, cryptoCostBasisDetailsListViewState.lots) && Intrinsics.areEqual(this.passthroughArgs, cryptoCostBasisDetailsListViewState.passthroughArgs);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.title.hashCode()) * 31) + this.spannedSubtitle.hashCode()) * 31;
        Boolean bool = this.isCompleted;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BreakdownCardState breakdownCardState = this.breakdownCardState;
        int iHashCode3 = (((iHashCode2 + (breakdownCardState == null ? 0 : breakdownCardState.hashCode())) * 31) + this.lots.hashCode()) * 31;
        CostBasisEntryArgs costBasisEntryArgs = this.passthroughArgs;
        return iHashCode3 + (costBasisEntryArgs != null ? costBasisEntryArgs.hashCode() : 0);
    }

    public String toString() {
        return "CryptoCostBasisDetailsListViewState(isLoading=" + this.isLoading + ", title=" + this.title + ", spannedSubtitle=" + this.spannedSubtitle + ", isCompleted=" + this.isCompleted + ", breakdownCardState=" + this.breakdownCardState + ", lots=" + this.lots + ", passthroughArgs=" + this.passthroughArgs + ")";
    }

    public CryptoCostBasisDetailsListViewState(boolean z, StringResource title, StringResource spannedSubtitle, Boolean bool, BreakdownCardState breakdownCardState, ImmutableList<CostBasisLotRowData> lots, CostBasisEntryArgs costBasisEntryArgs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(spannedSubtitle, "spannedSubtitle");
        Intrinsics.checkNotNullParameter(lots, "lots");
        this.isLoading = z;
        this.title = title;
        this.spannedSubtitle = spannedSubtitle;
        this.isCompleted = bool;
        this.breakdownCardState = breakdownCardState;
        this.lots = lots;
        this.passthroughArgs = costBasisEntryArgs;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSpannedSubtitle() {
        return this.spannedSubtitle;
    }

    public final Boolean isCompleted() {
        return this.isCompleted;
    }

    public final BreakdownCardState getBreakdownCardState() {
        return this.breakdownCardState;
    }

    public final ImmutableList<CostBasisLotRowData> getLots() {
        return this.lots;
    }

    public final CostBasisEntryArgs getPassthroughArgs() {
        return this.passthroughArgs;
    }
}
