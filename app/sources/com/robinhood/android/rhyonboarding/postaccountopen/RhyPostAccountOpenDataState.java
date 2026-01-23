package com.robinhood.android.rhyonboarding.postaccountopen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPostAccountOpenDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDataState;", "", "loading", "", "spendingAccountCreated", "timeout", "<init>", "(ZLjava/lang/Boolean;Z)V", "getLoading", "()Z", "getSpendingAccountCreated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimeout", "component1", "component2", "component3", "copy", "(ZLjava/lang/Boolean;Z)Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyPostAccountOpenDataState {
    public static final int $stable = 0;
    private final boolean loading;
    private final Boolean spendingAccountCreated;
    private final boolean timeout;

    public RhyPostAccountOpenDataState() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ RhyPostAccountOpenDataState copy$default(RhyPostAccountOpenDataState rhyPostAccountOpenDataState, boolean z, Boolean bool, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhyPostAccountOpenDataState.loading;
        }
        if ((i & 2) != 0) {
            bool = rhyPostAccountOpenDataState.spendingAccountCreated;
        }
        if ((i & 4) != 0) {
            z2 = rhyPostAccountOpenDataState.timeout;
        }
        return rhyPostAccountOpenDataState.copy(z, bool, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSpendingAccountCreated() {
        return this.spendingAccountCreated;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTimeout() {
        return this.timeout;
    }

    public final RhyPostAccountOpenDataState copy(boolean loading, Boolean spendingAccountCreated, boolean timeout) {
        return new RhyPostAccountOpenDataState(loading, spendingAccountCreated, timeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyPostAccountOpenDataState)) {
            return false;
        }
        RhyPostAccountOpenDataState rhyPostAccountOpenDataState = (RhyPostAccountOpenDataState) other;
        return this.loading == rhyPostAccountOpenDataState.loading && Intrinsics.areEqual(this.spendingAccountCreated, rhyPostAccountOpenDataState.spendingAccountCreated) && this.timeout == rhyPostAccountOpenDataState.timeout;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        Boolean bool = this.spendingAccountCreated;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.timeout);
    }

    public String toString() {
        return "RhyPostAccountOpenDataState(loading=" + this.loading + ", spendingAccountCreated=" + this.spendingAccountCreated + ", timeout=" + this.timeout + ")";
    }

    public RhyPostAccountOpenDataState(boolean z, Boolean bool, boolean z2) {
        this.loading = z;
        this.spendingAccountCreated = bool;
        this.timeout = z2;
    }

    public /* synthetic */ RhyPostAccountOpenDataState(boolean z, Boolean bool, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z2);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final Boolean getSpendingAccountCreated() {
        return this.spendingAccountCreated;
    }

    public final boolean getTimeout() {
        return this.timeout;
    }
}
