package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper;", "", "<init>", "()V", "None", "Some", "Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper$None;", "Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper$Some;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.welcome.RhyAccountWrapper, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class WelcomeRhyDataState2 {
    public static final int $stable = 0;

    public /* synthetic */ WelcomeRhyDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WelcomeRhyDataState2() {
    }

    /* compiled from: WelcomeRhyDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper$None;", "Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.referral.welcome.RhyAccountWrapper$None */
    public static final class None extends WelcomeRhyDataState2 {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* compiled from: WelcomeRhyDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper$Some;", "Lcom/robinhood/android/rhy/referral/welcome/RhyAccountWrapper;", "spendingAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccount;)V", "getSpendingAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.referral.welcome.RhyAccountWrapper$Some, reason: from toString */
    public static final /* data */ class Some extends WelcomeRhyDataState2 {
        public static final int $stable = 8;
        private final RhyAccount spendingAccount;

        public static /* synthetic */ Some copy$default(Some some, RhyAccount rhyAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyAccount = some.spendingAccount;
            }
            return some.copy(rhyAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyAccount getSpendingAccount() {
            return this.spendingAccount;
        }

        public final Some copy(RhyAccount spendingAccount) {
            Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
            return new Some(spendingAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Some) && Intrinsics.areEqual(this.spendingAccount, ((Some) other).spendingAccount);
        }

        public int hashCode() {
            return this.spendingAccount.hashCode();
        }

        public String toString() {
            return "Some(spendingAccount=" + this.spendingAccount + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Some(RhyAccount spendingAccount) {
            super(null);
            Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
            this.spendingAccount = spendingAccount;
        }

        public final RhyAccount getSpendingAccount() {
            return this.spendingAccount;
        }
    }
}
