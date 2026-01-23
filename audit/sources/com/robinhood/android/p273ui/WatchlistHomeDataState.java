package com.robinhood.android.p273ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistHomeStates.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeDataState;", "", "accountNumber", "", "enableSwipeToBuy", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getEnableSwipeToBuy", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WatchlistHomeDataState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final boolean enableSwipeToBuy;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchlistHomeDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WatchlistHomeDataState copy$default(WatchlistHomeDataState watchlistHomeDataState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchlistHomeDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            z = watchlistHomeDataState.enableSwipeToBuy;
        }
        return watchlistHomeDataState.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableSwipeToBuy() {
        return this.enableSwipeToBuy;
    }

    public final WatchlistHomeDataState copy(String accountNumber, boolean enableSwipeToBuy) {
        return new WatchlistHomeDataState(accountNumber, enableSwipeToBuy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchlistHomeDataState)) {
            return false;
        }
        WatchlistHomeDataState watchlistHomeDataState = (WatchlistHomeDataState) other;
        return Intrinsics.areEqual(this.accountNumber, watchlistHomeDataState.accountNumber) && this.enableSwipeToBuy == watchlistHomeDataState.enableSwipeToBuy;
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.enableSwipeToBuy);
    }

    public String toString() {
        return "WatchlistHomeDataState(accountNumber=" + this.accountNumber + ", enableSwipeToBuy=" + this.enableSwipeToBuy + ")";
    }

    public WatchlistHomeDataState(String str, boolean z) {
        this.accountNumber = str;
        this.enableSwipeToBuy = z;
    }

    public /* synthetic */ WatchlistHomeDataState(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getEnableSwipeToBuy() {
        return this.enableSwipeToBuy;
    }
}
