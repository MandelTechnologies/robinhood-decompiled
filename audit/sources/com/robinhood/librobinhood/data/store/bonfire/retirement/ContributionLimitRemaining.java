package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementContributionsCombinedSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionLimitRemaining;", "", "taxYear", "", "limitRemaining", "Lcom/robinhood/models/util/Money;", "<init>", "(ILcom/robinhood/models/util/Money;)V", "getTaxYear", "()I", "getLimitRemaining", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ContributionLimitRemaining {
    private final Money limitRemaining;
    private final int taxYear;

    public static /* synthetic */ ContributionLimitRemaining copy$default(ContributionLimitRemaining contributionLimitRemaining, int i, Money money, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contributionLimitRemaining.taxYear;
        }
        if ((i2 & 2) != 0) {
            money = contributionLimitRemaining.limitRemaining;
        }
        return contributionLimitRemaining.copy(i, money);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTaxYear() {
        return this.taxYear;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getLimitRemaining() {
        return this.limitRemaining;
    }

    public final ContributionLimitRemaining copy(int taxYear, Money limitRemaining) {
        Intrinsics.checkNotNullParameter(limitRemaining, "limitRemaining");
        return new ContributionLimitRemaining(taxYear, limitRemaining);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionLimitRemaining)) {
            return false;
        }
        ContributionLimitRemaining contributionLimitRemaining = (ContributionLimitRemaining) other;
        return this.taxYear == contributionLimitRemaining.taxYear && Intrinsics.areEqual(this.limitRemaining, contributionLimitRemaining.limitRemaining);
    }

    public int hashCode() {
        return (Integer.hashCode(this.taxYear) * 31) + this.limitRemaining.hashCode();
    }

    public String toString() {
        return "ContributionLimitRemaining(taxYear=" + this.taxYear + ", limitRemaining=" + this.limitRemaining + ")";
    }

    public ContributionLimitRemaining(int i, Money limitRemaining) {
        Intrinsics.checkNotNullParameter(limitRemaining, "limitRemaining");
        this.taxYear = i;
        this.limitRemaining = limitRemaining;
    }

    public final int getTaxYear() {
        return this.taxYear;
    }

    public final Money getLimitRemaining() {
        return this.limitRemaining;
    }
}
