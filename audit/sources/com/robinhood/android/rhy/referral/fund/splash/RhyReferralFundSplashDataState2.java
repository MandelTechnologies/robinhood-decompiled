package com.robinhood.android.rhy.referral.fund.splash;

import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSplashDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper;", "", "None", "Some", "Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper$None;", "Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper$Some;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.splash.MinervaAccountWrapper, reason: use source file name */
/* loaded from: classes5.dex */
public interface RhyReferralFundSplashDataState2 {

    /* compiled from: RhyReferralFundSplashDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper$None;", "Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.referral.fund.splash.MinervaAccountWrapper$None */
    public static final class None implements RhyReferralFundSplashDataState2 {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* compiled from: RhyReferralFundSplashDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper$Some;", "Lcom/robinhood/android/rhy/referral/fund/splash/MinervaAccountWrapper;", "minervaAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "<init>", "(Lcom/robinhood/models/db/mcduckling/MinervaAccount;)V", "getMinervaAccount", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.referral.fund.splash.MinervaAccountWrapper$Some, reason: from toString */
    public static final /* data */ class Some implements RhyReferralFundSplashDataState2 {
        public static final int $stable = 8;
        private final MinervaAccount minervaAccount;

        public static /* synthetic */ Some copy$default(Some some, MinervaAccount minervaAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                minervaAccount = some.minervaAccount;
            }
            return some.copy(minervaAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final MinervaAccount getMinervaAccount() {
            return this.minervaAccount;
        }

        public final Some copy(MinervaAccount minervaAccount) {
            Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
            return new Some(minervaAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Some) && Intrinsics.areEqual(this.minervaAccount, ((Some) other).minervaAccount);
        }

        public int hashCode() {
            return this.minervaAccount.hashCode();
        }

        public String toString() {
            return "Some(minervaAccount=" + this.minervaAccount + ")";
        }

        public Some(MinervaAccount minervaAccount) {
            Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
            this.minervaAccount = minervaAccount;
        }

        public final MinervaAccount getMinervaAccount() {
            return this.minervaAccount;
        }
    }
}
