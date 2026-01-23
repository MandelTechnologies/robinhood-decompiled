package com.robinhood.feature.sweep.onboarding;

import com.robinhood.models.api.bonfire.ApiSweepFlow;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "", "<init>", "()V", "Loading", "Loaded", "AlreadyEnrolled", "Paused", "Error", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$AlreadyEnrolled;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Error;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Loaded;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Loading;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Paused;", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class SweepOnboardingViewState {
    public static final int $stable = 0;

    public /* synthetic */ SweepOnboardingViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SweepOnboardingViewState() {
    }

    /* compiled from: SweepOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Loading;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends SweepOnboardingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SweepOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Loaded;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "accountNumber", "", "sweepFlow", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "goldInterestRate", "Ljava/math/BigDecimal;", "nonGoldInterestRate", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiSweepFlow;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getSweepFlow", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "getGoldInterestRate", "()Ljava/math/BigDecimal;", "getNonGoldInterestRate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends SweepOnboardingViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final BigDecimal goldInterestRate;
        private final BigDecimal nonGoldInterestRate;
        private final ApiSweepFlow sweepFlow;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ApiSweepFlow apiSweepFlow, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                apiSweepFlow = loaded.sweepFlow;
            }
            if ((i & 4) != 0) {
                bigDecimal = loaded.goldInterestRate;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = loaded.nonGoldInterestRate;
            }
            return loaded.copy(str, apiSweepFlow, bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSweepFlow getSweepFlow() {
            return this.sweepFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getGoldInterestRate() {
            return this.goldInterestRate;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getNonGoldInterestRate() {
            return this.nonGoldInterestRate;
        }

        public final Loaded copy(String accountNumber, ApiSweepFlow sweepFlow, BigDecimal goldInterestRate, BigDecimal nonGoldInterestRate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sweepFlow, "sweepFlow");
            return new Loaded(accountNumber, sweepFlow, goldInterestRate, nonGoldInterestRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.sweepFlow, loaded.sweepFlow) && Intrinsics.areEqual(this.goldInterestRate, loaded.goldInterestRate) && Intrinsics.areEqual(this.nonGoldInterestRate, loaded.nonGoldInterestRate);
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.sweepFlow.hashCode()) * 31;
            BigDecimal bigDecimal = this.goldInterestRate;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.nonGoldInterestRate;
            return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", sweepFlow=" + this.sweepFlow + ", goldInterestRate=" + this.goldInterestRate + ", nonGoldInterestRate=" + this.nonGoldInterestRate + ")";
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ApiSweepFlow getSweepFlow() {
            return this.sweepFlow;
        }

        public final BigDecimal getGoldInterestRate() {
            return this.goldInterestRate;
        }

        public final BigDecimal getNonGoldInterestRate() {
            return this.nonGoldInterestRate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String accountNumber, ApiSweepFlow sweepFlow, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sweepFlow, "sweepFlow");
            this.accountNumber = accountNumber;
            this.sweepFlow = sweepFlow;
            this.goldInterestRate = bigDecimal;
            this.nonGoldInterestRate = bigDecimal2;
        }
    }

    /* compiled from: SweepOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$AlreadyEnrolled;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "sweepApy", "Ljava/math/BigDecimal;", "isMcwEnabled", "", "<init>", "(Ljava/math/BigDecimal;Z)V", "getSweepApy", "()Ljava/math/BigDecimal;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyEnrolled extends SweepOnboardingViewState {
        public static final int $stable = 8;
        private final boolean isMcwEnabled;
        private final BigDecimal sweepApy;

        public static /* synthetic */ AlreadyEnrolled copy$default(AlreadyEnrolled alreadyEnrolled, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = alreadyEnrolled.sweepApy;
            }
            if ((i & 2) != 0) {
                z = alreadyEnrolled.isMcwEnabled;
            }
            return alreadyEnrolled.copy(bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getSweepApy() {
            return this.sweepApy;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMcwEnabled() {
            return this.isMcwEnabled;
        }

        public final AlreadyEnrolled copy(BigDecimal sweepApy, boolean isMcwEnabled) {
            Intrinsics.checkNotNullParameter(sweepApy, "sweepApy");
            return new AlreadyEnrolled(sweepApy, isMcwEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlreadyEnrolled)) {
                return false;
            }
            AlreadyEnrolled alreadyEnrolled = (AlreadyEnrolled) other;
            return Intrinsics.areEqual(this.sweepApy, alreadyEnrolled.sweepApy) && this.isMcwEnabled == alreadyEnrolled.isMcwEnabled;
        }

        public int hashCode() {
            return (this.sweepApy.hashCode() * 31) + Boolean.hashCode(this.isMcwEnabled);
        }

        public String toString() {
            return "AlreadyEnrolled(sweepApy=" + this.sweepApy + ", isMcwEnabled=" + this.isMcwEnabled + ")";
        }

        public final BigDecimal getSweepApy() {
            return this.sweepApy;
        }

        public final boolean isMcwEnabled() {
            return this.isMcwEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyEnrolled(BigDecimal sweepApy, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(sweepApy, "sweepApy");
            this.sweepApy = sweepApy;
            this.isMcwEnabled = z;
        }
    }

    /* compiled from: SweepOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Paused;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Paused extends SweepOnboardingViewState {
        public static final int $stable = 0;
        public static final Paused INSTANCE = new Paused();

        public boolean equals(Object other) {
            return this == other || (other instanceof Paused);
        }

        public int hashCode() {
            return 863161299;
        }

        public String toString() {
            return "Paused";
        }

        private Paused() {
            super(null);
        }
    }

    /* compiled from: SweepOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState$Error;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends SweepOnboardingViewState {
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

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
