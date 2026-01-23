package com.robinhood.android.acats.plaid.partialsupport;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AcatsInPlaidPartialTransferSupportedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/partialsupport/AcatsPlaidPartialTransferSupportedViewState;", "", "count", "", "hasShortEquityPositions", "", "<init>", "(IZ)V", "getCount", "()I", "getHasShortEquityPositions", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferSupportedViewState {
    public static final int $stable = 0;
    private final int count;
    private final boolean hasShortEquityPositions;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsPlaidPartialTransferSupportedViewState() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ AcatsPlaidPartialTransferSupportedViewState copy$default(AcatsPlaidPartialTransferSupportedViewState acatsPlaidPartialTransferSupportedViewState, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = acatsPlaidPartialTransferSupportedViewState.count;
        }
        if ((i2 & 2) != 0) {
            z = acatsPlaidPartialTransferSupportedViewState.hasShortEquityPositions;
        }
        return acatsPlaidPartialTransferSupportedViewState.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasShortEquityPositions() {
        return this.hasShortEquityPositions;
    }

    public final AcatsPlaidPartialTransferSupportedViewState copy(int count, boolean hasShortEquityPositions) {
        return new AcatsPlaidPartialTransferSupportedViewState(count, hasShortEquityPositions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferSupportedViewState)) {
            return false;
        }
        AcatsPlaidPartialTransferSupportedViewState acatsPlaidPartialTransferSupportedViewState = (AcatsPlaidPartialTransferSupportedViewState) other;
        return this.count == acatsPlaidPartialTransferSupportedViewState.count && this.hasShortEquityPositions == acatsPlaidPartialTransferSupportedViewState.hasShortEquityPositions;
    }

    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + Boolean.hashCode(this.hasShortEquityPositions);
    }

    public String toString() {
        return "AcatsPlaidPartialTransferSupportedViewState(count=" + this.count + ", hasShortEquityPositions=" + this.hasShortEquityPositions + ")";
    }

    public AcatsPlaidPartialTransferSupportedViewState(int i, boolean z) {
        this.count = i;
        this.hasShortEquityPositions = z;
    }

    public /* synthetic */ AcatsPlaidPartialTransferSupportedViewState(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? false : z);
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getHasShortEquityPositions() {
        return this.hasShortEquityPositions;
    }
}
