package com.robinhood.android.p273ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistHomeStates.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/ui/WatchlistHomeViewState$Loaded;", "Lcom/robinhood/android/ui/WatchlistHomeViewState$Loading;", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.WatchlistHomeViewState, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class WatchlistHomeStates3 {
    public static final int $stable = 0;

    public /* synthetic */ WatchlistHomeStates3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WatchlistHomeStates.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeViewState$Loading;", "Lcom/robinhood/android/ui/WatchlistHomeViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ui.WatchlistHomeViewState$Loading */
    public static final /* data */ class Loading extends WatchlistHomeStates3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1886861300;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private WatchlistHomeStates3() {
    }

    /* compiled from: WatchlistHomeStates.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeViewState$Loaded;", "Lcom/robinhood/android/ui/WatchlistHomeViewState;", "accountNumber", "", "enableSwipeToBuy", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getEnableSwipeToBuy", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ui.WatchlistHomeViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends WatchlistHomeStates3 {
        public static final int $stable = 0;
        private final String accountNumber;
        private final boolean enableSwipeToBuy;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                z = loaded.enableSwipeToBuy;
            }
            return loaded.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableSwipeToBuy() {
            return this.enableSwipeToBuy;
        }

        public final Loaded copy(String accountNumber, boolean enableSwipeToBuy) {
            return new Loaded(accountNumber, enableSwipeToBuy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && this.enableSwipeToBuy == loaded.enableSwipeToBuy;
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.enableSwipeToBuy);
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", enableSwipeToBuy=" + this.enableSwipeToBuy + ")";
        }

        public /* synthetic */ Loaded(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getEnableSwipeToBuy() {
            return this.enableSwipeToBuy;
        }

        public Loaded(String str, boolean z) {
            super(null);
            this.accountNumber = str;
            this.enableSwipeToBuy = z;
        }
    }
}
