package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;", "", "contributions", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "taxYear", "", "<init>", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;Ljava/lang/Integer;)V", "getContributions", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "getTaxYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;Ljava/lang/Integer;)Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;", "equals", "", "other", "hashCode", "toString", "", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionBottomSheetDataState {
    public static final int $stable = 8;
    private final IsaContributions contributions;
    private final Integer taxYear;

    /* JADX WARN: Multi-variable type inference failed */
    public IsaContributionBottomSheetDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IsaContributionBottomSheetDataState copy$default(IsaContributionBottomSheetDataState isaContributionBottomSheetDataState, IsaContributions isaContributions, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            isaContributions = isaContributionBottomSheetDataState.contributions;
        }
        if ((i & 2) != 0) {
            num = isaContributionBottomSheetDataState.taxYear;
        }
        return isaContributionBottomSheetDataState.copy(isaContributions, num);
    }

    /* renamed from: component1, reason: from getter */
    public final IsaContributions getContributions() {
        return this.contributions;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTaxYear() {
        return this.taxYear;
    }

    public final IsaContributionBottomSheetDataState copy(IsaContributions contributions, Integer taxYear) {
        return new IsaContributionBottomSheetDataState(contributions, taxYear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionBottomSheetDataState)) {
            return false;
        }
        IsaContributionBottomSheetDataState isaContributionBottomSheetDataState = (IsaContributionBottomSheetDataState) other;
        return Intrinsics.areEqual(this.contributions, isaContributionBottomSheetDataState.contributions) && Intrinsics.areEqual(this.taxYear, isaContributionBottomSheetDataState.taxYear);
    }

    public int hashCode() {
        IsaContributions isaContributions = this.contributions;
        int iHashCode = (isaContributions == null ? 0 : isaContributions.hashCode()) * 31;
        Integer num = this.taxYear;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "IsaContributionBottomSheetDataState(contributions=" + this.contributions + ", taxYear=" + this.taxYear + ")";
    }

    public IsaContributionBottomSheetDataState(IsaContributions isaContributions, Integer num) {
        this.contributions = isaContributions;
        this.taxYear = num;
    }

    public /* synthetic */ IsaContributionBottomSheetDataState(IsaContributions isaContributions, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : isaContributions, (i & 2) != 0 ? null : num);
    }

    public final IsaContributions getContributions() {
        return this.contributions;
    }

    public final Integer getTaxYear() {
        return this.taxYear;
    }
}
