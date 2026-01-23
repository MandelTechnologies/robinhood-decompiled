package com.robinhood.android.creditcard.p091ui.creditapplication;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationViewState;", "", "isLoading", "", "isPageStateLoading", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditApplicationViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final boolean isPageStateLoading;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditApplicationViewState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ CreditApplicationViewState copy$default(CreditApplicationViewState creditApplicationViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = creditApplicationViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = creditApplicationViewState.isPageStateLoading;
        }
        return creditApplicationViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPageStateLoading() {
        return this.isPageStateLoading;
    }

    public final CreditApplicationViewState copy(boolean isLoading, boolean isPageStateLoading) {
        return new CreditApplicationViewState(isLoading, isPageStateLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditApplicationViewState)) {
            return false;
        }
        CreditApplicationViewState creditApplicationViewState = (CreditApplicationViewState) other;
        return this.isLoading == creditApplicationViewState.isLoading && this.isPageStateLoading == creditApplicationViewState.isPageStateLoading;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isPageStateLoading);
    }

    public String toString() {
        return "CreditApplicationViewState(isLoading=" + this.isLoading + ", isPageStateLoading=" + this.isPageStateLoading + ")";
    }

    public CreditApplicationViewState(boolean z, boolean z2) {
        this.isLoading = z;
        this.isPageStateLoading = z2;
    }

    public /* synthetic */ CreditApplicationViewState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPageStateLoading() {
        return this.isPageStateLoading;
    }
}
