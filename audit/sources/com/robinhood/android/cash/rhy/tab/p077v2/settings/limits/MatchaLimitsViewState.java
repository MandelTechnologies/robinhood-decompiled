package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaLimitsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Error;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Loading;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface MatchaLimitsViewState {

    /* compiled from: MatchaLimitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Loading;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements MatchaLimitsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: MatchaLimitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "weeklySendLimit", "", "weeklyTransactionsLimit", "", "minTransactionAmount", "instantTransferFee", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getWeeklySendLimit", "()Ljava/lang/String;", "getWeeklyTransactionsLimit", "()I", "getMinTransactionAmount", "getInstantTransferFee", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements MatchaLimitsViewState {
        public static final int $stable = 0;
        private final String instantTransferFee;
        private final String minTransactionAmount;
        private final String weeklySendLimit;
        private final int weeklyTransactionsLimit;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loaded.weeklySendLimit;
            }
            if ((i2 & 2) != 0) {
                i = loaded.weeklyTransactionsLimit;
            }
            if ((i2 & 4) != 0) {
                str2 = loaded.minTransactionAmount;
            }
            if ((i2 & 8) != 0) {
                str3 = loaded.instantTransferFee;
            }
            return loaded.copy(str, i, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getWeeklySendLimit() {
            return this.weeklySendLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWeeklyTransactionsLimit() {
            return this.weeklyTransactionsLimit;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMinTransactionAmount() {
            return this.minTransactionAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInstantTransferFee() {
            return this.instantTransferFee;
        }

        public final Loaded copy(String weeklySendLimit, int weeklyTransactionsLimit, String minTransactionAmount, String instantTransferFee) {
            Intrinsics.checkNotNullParameter(weeklySendLimit, "weeklySendLimit");
            Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
            Intrinsics.checkNotNullParameter(instantTransferFee, "instantTransferFee");
            return new Loaded(weeklySendLimit, weeklyTransactionsLimit, minTransactionAmount, instantTransferFee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.weeklySendLimit, loaded.weeklySendLimit) && this.weeklyTransactionsLimit == loaded.weeklyTransactionsLimit && Intrinsics.areEqual(this.minTransactionAmount, loaded.minTransactionAmount) && Intrinsics.areEqual(this.instantTransferFee, loaded.instantTransferFee);
        }

        public int hashCode() {
            return (((((this.weeklySendLimit.hashCode() * 31) + Integer.hashCode(this.weeklyTransactionsLimit)) * 31) + this.minTransactionAmount.hashCode()) * 31) + this.instantTransferFee.hashCode();
        }

        public String toString() {
            return "Loaded(weeklySendLimit=" + this.weeklySendLimit + ", weeklyTransactionsLimit=" + this.weeklyTransactionsLimit + ", minTransactionAmount=" + this.minTransactionAmount + ", instantTransferFee=" + this.instantTransferFee + ")";
        }

        public Loaded(String weeklySendLimit, int i, String minTransactionAmount, String instantTransferFee) {
            Intrinsics.checkNotNullParameter(weeklySendLimit, "weeklySendLimit");
            Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
            Intrinsics.checkNotNullParameter(instantTransferFee, "instantTransferFee");
            this.weeklySendLimit = weeklySendLimit;
            this.weeklyTransactionsLimit = i;
            this.minTransactionAmount = minTransactionAmount;
            this.instantTransferFee = instantTransferFee;
        }

        public final String getWeeklySendLimit() {
            return this.weeklySendLimit;
        }

        public final int getWeeklyTransactionsLimit() {
            return this.weeklyTransactionsLimit;
        }

        public final String getMinTransactionAmount() {
            return this.minTransactionAmount;
        }

        public final String getInstantTransferFee() {
            return this.instantTransferFee;
        }
    }

    /* compiled from: MatchaLimitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState$Error;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MatchaLimitsViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
