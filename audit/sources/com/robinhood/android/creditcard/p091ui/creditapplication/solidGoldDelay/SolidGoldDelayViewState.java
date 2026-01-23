package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SolidGoldDelayDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayViewState;", "", "isLoading", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SolidGoldDelayViewState {
    public static final int $stable = 0;
    private final boolean isLoading;

    public SolidGoldDelayViewState() {
        this(false, 1, null);
    }

    public static /* synthetic */ SolidGoldDelayViewState copy$default(SolidGoldDelayViewState solidGoldDelayViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = solidGoldDelayViewState.isLoading;
        }
        return solidGoldDelayViewState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final SolidGoldDelayViewState copy(boolean isLoading) {
        return new SolidGoldDelayViewState(isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidGoldDelayViewState) && this.isLoading == ((SolidGoldDelayViewState) other).isLoading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "SolidGoldDelayViewState(isLoading=" + this.isLoading + ")";
    }

    public SolidGoldDelayViewState(boolean z) {
        this.isLoading = z;
    }

    public /* synthetic */ SolidGoldDelayViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
