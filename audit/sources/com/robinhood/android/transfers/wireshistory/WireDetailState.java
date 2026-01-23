package com.robinhood.android.transfers.wireshistory;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.models.history.MinervaTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireDetailState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/wireshistory/WireDetailState;", "", "overview", "Lcom/robinhood/android/transfers/wireshistory/WireOverview;", "transaction", "Lcom/robinhood/shared/models/history/MinervaTransaction;", ErrorResponse.DETAIL, "", "loadingText", "isLoading", "", "<init>", "(Lcom/robinhood/android/transfers/wireshistory/WireOverview;Lcom/robinhood/shared/models/history/MinervaTransaction;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V", "getOverview", "()Lcom/robinhood/android/transfers/wireshistory/WireOverview;", "getTransaction", "()Lcom/robinhood/shared/models/history/MinervaTransaction;", "getDetail", "()Ljava/lang/CharSequence;", "getLoadingText", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-wires-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WireDetailState {
    public static final int $stable = 8;
    private final CharSequence detail;
    private final boolean isLoading;
    private final CharSequence loadingText;
    private final WireOverview overview;
    private final MinervaTransaction transaction;

    public WireDetailState() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ WireDetailState copy$default(WireDetailState wireDetailState, WireOverview wireOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wireOverview = wireDetailState.overview;
        }
        if ((i & 2) != 0) {
            minervaTransaction = wireDetailState.transaction;
        }
        if ((i & 4) != 0) {
            charSequence = wireDetailState.detail;
        }
        if ((i & 8) != 0) {
            charSequence2 = wireDetailState.loadingText;
        }
        if ((i & 16) != 0) {
            z = wireDetailState.isLoading;
        }
        boolean z2 = z;
        CharSequence charSequence3 = charSequence;
        return wireDetailState.copy(wireOverview, minervaTransaction, charSequence3, charSequence2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final WireOverview getOverview() {
        return this.overview;
    }

    /* renamed from: component2, reason: from getter */
    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getDetail() {
        return this.detail;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final WireDetailState copy(WireOverview overview, MinervaTransaction transaction, CharSequence detail, CharSequence loadingText, boolean isLoading) {
        return new WireDetailState(overview, transaction, detail, loadingText, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WireDetailState)) {
            return false;
        }
        WireDetailState wireDetailState = (WireDetailState) other;
        return Intrinsics.areEqual(this.overview, wireDetailState.overview) && Intrinsics.areEqual(this.transaction, wireDetailState.transaction) && Intrinsics.areEqual(this.detail, wireDetailState.detail) && Intrinsics.areEqual(this.loadingText, wireDetailState.loadingText) && this.isLoading == wireDetailState.isLoading;
    }

    public int hashCode() {
        WireOverview wireOverview = this.overview;
        int iHashCode = (wireOverview == null ? 0 : wireOverview.hashCode()) * 31;
        MinervaTransaction minervaTransaction = this.transaction;
        int iHashCode2 = (iHashCode + (minervaTransaction == null ? 0 : minervaTransaction.hashCode())) * 31;
        CharSequence charSequence = this.detail;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.loadingText;
        return ((iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        WireOverview wireOverview = this.overview;
        MinervaTransaction minervaTransaction = this.transaction;
        CharSequence charSequence = this.detail;
        CharSequence charSequence2 = this.loadingText;
        return "WireDetailState(overview=" + wireOverview + ", transaction=" + minervaTransaction + ", detail=" + ((Object) charSequence) + ", loadingText=" + ((Object) charSequence2) + ", isLoading=" + this.isLoading + ")";
    }

    public WireDetailState(WireOverview wireOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.overview = wireOverview;
        this.transaction = minervaTransaction;
        this.detail = charSequence;
        this.loadingText = charSequence2;
        this.isLoading = z;
    }

    public /* synthetic */ WireDetailState(WireOverview wireOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireOverview, (i & 2) != 0 ? null : minervaTransaction, (i & 4) != 0 ? null : charSequence, (i & 8) != 0 ? null : charSequence2, (i & 16) != 0 ? false : z);
    }

    public final WireOverview getOverview() {
        return this.overview;
    }

    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    public final CharSequence getDetail() {
        return this.detail;
    }

    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
