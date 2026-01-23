package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionSectionViewState;", "", "currentContribution", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;", "<init>", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;)V", "getCurrentContribution", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionSectionViewState {
    public static final int $stable = 8;
    private final IsaContribution currentContribution;

    public static /* synthetic */ IsaContributionSectionViewState copy$default(IsaContributionSectionViewState isaContributionSectionViewState, IsaContribution isaContribution, int i, Object obj) {
        if ((i & 1) != 0) {
            isaContribution = isaContributionSectionViewState.currentContribution;
        }
        return isaContributionSectionViewState.copy(isaContribution);
    }

    /* renamed from: component1, reason: from getter */
    public final IsaContribution getCurrentContribution() {
        return this.currentContribution;
    }

    public final IsaContributionSectionViewState copy(IsaContribution currentContribution) {
        return new IsaContributionSectionViewState(currentContribution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsaContributionSectionViewState) && Intrinsics.areEqual(this.currentContribution, ((IsaContributionSectionViewState) other).currentContribution);
    }

    public int hashCode() {
        IsaContribution isaContribution = this.currentContribution;
        if (isaContribution == null) {
            return 0;
        }
        return isaContribution.hashCode();
    }

    public String toString() {
        return "IsaContributionSectionViewState(currentContribution=" + this.currentContribution + ")";
    }

    public IsaContributionSectionViewState(IsaContribution isaContribution) {
        this.currentContribution = isaContribution;
    }

    public final IsaContribution getCurrentContribution() {
        return this.currentContribution;
    }
}
