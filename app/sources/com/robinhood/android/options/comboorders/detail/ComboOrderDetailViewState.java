package com.robinhood.android.options.comboorders.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ComboOrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/ComboOrderDetailViewState;", "", "isLoading", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailViewState {
    public static final int $stable = 0;
    private final boolean isLoading;

    public ComboOrderDetailViewState() {
        this(false, 1, null);
    }

    public static /* synthetic */ ComboOrderDetailViewState copy$default(ComboOrderDetailViewState comboOrderDetailViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = comboOrderDetailViewState.isLoading;
        }
        return comboOrderDetailViewState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ComboOrderDetailViewState copy(boolean isLoading) {
        return new ComboOrderDetailViewState(isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComboOrderDetailViewState) && this.isLoading == ((ComboOrderDetailViewState) other).isLoading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "ComboOrderDetailViewState(isLoading=" + this.isLoading + ")";
    }

    public ComboOrderDetailViewState(boolean z) {
        this.isLoading = z;
    }

    public /* synthetic */ ComboOrderDetailViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
