package com.robinhood.android.crypto.costbasis.details.list;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.CostBasisBottomSheetDto;

/* compiled from: CryptoCostBasisDetailsListComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "", "depositDateLabel", "Lcom/robinhood/utils/resource/StringResource;", "totalQuantity", "", "availableQuantity", "closedQuantity", "availableQuantityBottomSheet", "Lnummus/v1/CostBasisBottomSheetDto;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisBottomSheetDto;)V", "getDepositDateLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getTotalQuantity", "()Ljava/lang/String;", "getAvailableQuantity", "getClosedQuantity", "getAvailableQuantityBottomSheet", "()Lnummus/v1/CostBasisBottomSheetDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BreakdownCardState {
    public static final int $stable = 8;
    private final String availableQuantity;
    private final CostBasisBottomSheetDto availableQuantityBottomSheet;
    private final String closedQuantity;
    private final StringResource depositDateLabel;
    private final String totalQuantity;

    public static /* synthetic */ BreakdownCardState copy$default(BreakdownCardState breakdownCardState, StringResource stringResource, String str, String str2, String str3, CostBasisBottomSheetDto costBasisBottomSheetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = breakdownCardState.depositDateLabel;
        }
        if ((i & 2) != 0) {
            str = breakdownCardState.totalQuantity;
        }
        if ((i & 4) != 0) {
            str2 = breakdownCardState.availableQuantity;
        }
        if ((i & 8) != 0) {
            str3 = breakdownCardState.closedQuantity;
        }
        if ((i & 16) != 0) {
            costBasisBottomSheetDto = breakdownCardState.availableQuantityBottomSheet;
        }
        CostBasisBottomSheetDto costBasisBottomSheetDto2 = costBasisBottomSheetDto;
        String str4 = str2;
        return breakdownCardState.copy(stringResource, str, str4, str3, costBasisBottomSheetDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getDepositDateLabel() {
        return this.depositDateLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvailableQuantity() {
        return this.availableQuantity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClosedQuantity() {
        return this.closedQuantity;
    }

    /* renamed from: component5, reason: from getter */
    public final CostBasisBottomSheetDto getAvailableQuantityBottomSheet() {
        return this.availableQuantityBottomSheet;
    }

    public final BreakdownCardState copy(StringResource depositDateLabel, String totalQuantity, String availableQuantity, String closedQuantity, CostBasisBottomSheetDto availableQuantityBottomSheet) {
        Intrinsics.checkNotNullParameter(depositDateLabel, "depositDateLabel");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(availableQuantity, "availableQuantity");
        Intrinsics.checkNotNullParameter(closedQuantity, "closedQuantity");
        return new BreakdownCardState(depositDateLabel, totalQuantity, availableQuantity, closedQuantity, availableQuantityBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakdownCardState)) {
            return false;
        }
        BreakdownCardState breakdownCardState = (BreakdownCardState) other;
        return Intrinsics.areEqual(this.depositDateLabel, breakdownCardState.depositDateLabel) && Intrinsics.areEqual(this.totalQuantity, breakdownCardState.totalQuantity) && Intrinsics.areEqual(this.availableQuantity, breakdownCardState.availableQuantity) && Intrinsics.areEqual(this.closedQuantity, breakdownCardState.closedQuantity) && Intrinsics.areEqual(this.availableQuantityBottomSheet, breakdownCardState.availableQuantityBottomSheet);
    }

    public int hashCode() {
        int iHashCode = ((((((this.depositDateLabel.hashCode() * 31) + this.totalQuantity.hashCode()) * 31) + this.availableQuantity.hashCode()) * 31) + this.closedQuantity.hashCode()) * 31;
        CostBasisBottomSheetDto costBasisBottomSheetDto = this.availableQuantityBottomSheet;
        return iHashCode + (costBasisBottomSheetDto == null ? 0 : costBasisBottomSheetDto.hashCode());
    }

    public String toString() {
        return "BreakdownCardState(depositDateLabel=" + this.depositDateLabel + ", totalQuantity=" + this.totalQuantity + ", availableQuantity=" + this.availableQuantity + ", closedQuantity=" + this.closedQuantity + ", availableQuantityBottomSheet=" + this.availableQuantityBottomSheet + ")";
    }

    public BreakdownCardState(StringResource depositDateLabel, String totalQuantity, String availableQuantity, String closedQuantity, CostBasisBottomSheetDto costBasisBottomSheetDto) {
        Intrinsics.checkNotNullParameter(depositDateLabel, "depositDateLabel");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(availableQuantity, "availableQuantity");
        Intrinsics.checkNotNullParameter(closedQuantity, "closedQuantity");
        this.depositDateLabel = depositDateLabel;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
        this.closedQuantity = closedQuantity;
        this.availableQuantityBottomSheet = costBasisBottomSheetDto;
    }

    public final StringResource getDepositDateLabel() {
        return this.depositDateLabel;
    }

    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    public final String getAvailableQuantity() {
        return this.availableQuantity;
    }

    public final String getClosedQuantity() {
        return this.closedQuantity;
    }

    public final CostBasisBottomSheetDto getAvailableQuantityBottomSheet() {
        return this.availableQuantityBottomSheet;
    }
}
