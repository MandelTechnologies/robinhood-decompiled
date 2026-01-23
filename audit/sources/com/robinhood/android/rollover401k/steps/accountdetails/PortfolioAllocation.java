package com.robinhood.android.rollover401k.steps.accountdetails;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FoundAccountDetailsState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/accountdetails/PortfolioAllocation;", "", "name", "", "allocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAllocation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PortfolioAllocation {
    public static final int $stable = 0;
    private final String allocation;
    private final String name;

    public static /* synthetic */ PortfolioAllocation copy$default(PortfolioAllocation portfolioAllocation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioAllocation.name;
        }
        if ((i & 2) != 0) {
            str2 = portfolioAllocation.allocation;
        }
        return portfolioAllocation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAllocation() {
        return this.allocation;
    }

    public final PortfolioAllocation copy(String name, String allocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new PortfolioAllocation(name, allocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioAllocation)) {
            return false;
        }
        PortfolioAllocation portfolioAllocation = (PortfolioAllocation) other;
        return Intrinsics.areEqual(this.name, portfolioAllocation.name) && Intrinsics.areEqual(this.allocation, portfolioAllocation.allocation);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.allocation.hashCode();
    }

    public String toString() {
        return "PortfolioAllocation(name=" + this.name + ", allocation=" + this.allocation + ")";
    }

    public PortfolioAllocation(String name, String allocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.name = name;
        this.allocation = allocation;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAllocation() {
        return this.allocation;
    }
}
