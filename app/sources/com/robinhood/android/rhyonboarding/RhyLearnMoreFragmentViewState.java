package com.robinhood.android.rhyonboarding;

import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyLearnMoreFragmentViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentViewState;", "", "rhySpendingAccountLearnMore", "Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;", "<init>", "(Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;)V", "getRhySpendingAccountLearnMore", "()Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;", "isLoading", "", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyLearnMoreFragmentViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final RhySpendingAccountLearnMore rhySpendingAccountLearnMore;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyLearnMoreFragmentViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhyLearnMoreFragmentViewState copy$default(RhyLearnMoreFragmentViewState rhyLearnMoreFragmentViewState, RhySpendingAccountLearnMore rhySpendingAccountLearnMore, int i, Object obj) {
        if ((i & 1) != 0) {
            rhySpendingAccountLearnMore = rhyLearnMoreFragmentViewState.rhySpendingAccountLearnMore;
        }
        return rhyLearnMoreFragmentViewState.copy(rhySpendingAccountLearnMore);
    }

    /* renamed from: component1, reason: from getter */
    public final RhySpendingAccountLearnMore getRhySpendingAccountLearnMore() {
        return this.rhySpendingAccountLearnMore;
    }

    public final RhyLearnMoreFragmentViewState copy(RhySpendingAccountLearnMore rhySpendingAccountLearnMore) {
        return new RhyLearnMoreFragmentViewState(rhySpendingAccountLearnMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RhyLearnMoreFragmentViewState) && Intrinsics.areEqual(this.rhySpendingAccountLearnMore, ((RhyLearnMoreFragmentViewState) other).rhySpendingAccountLearnMore);
    }

    public int hashCode() {
        RhySpendingAccountLearnMore rhySpendingAccountLearnMore = this.rhySpendingAccountLearnMore;
        if (rhySpendingAccountLearnMore == null) {
            return 0;
        }
        return rhySpendingAccountLearnMore.hashCode();
    }

    public String toString() {
        return "RhyLearnMoreFragmentViewState(rhySpendingAccountLearnMore=" + this.rhySpendingAccountLearnMore + ")";
    }

    public RhyLearnMoreFragmentViewState(RhySpendingAccountLearnMore rhySpendingAccountLearnMore) {
        this.rhySpendingAccountLearnMore = rhySpendingAccountLearnMore;
        this.isLoading = rhySpendingAccountLearnMore == null;
    }

    public /* synthetic */ RhyLearnMoreFragmentViewState(RhySpendingAccountLearnMore rhySpendingAccountLearnMore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rhySpendingAccountLearnMore);
    }

    public final RhySpendingAccountLearnMore getRhySpendingAccountLearnMore() {
        return this.rhySpendingAccountLearnMore;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }
}
