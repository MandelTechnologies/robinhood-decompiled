package com.robinhood.android.advisory.onboarding.outro;

import kotlin.Metadata;

/* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", "", "Deposit", "Retirement", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual$Deposit;", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual$Retirement;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface FirstDepositNumberVisual {

    /* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual$Deposit;", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deposit implements FirstDepositNumberVisual {
        public static final int $stable = 0;
        public static final Deposit INSTANCE = new Deposit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Deposit);
        }

        public int hashCode() {
            return -1295258468;
        }

        public String toString() {
            return "Deposit";
        }

        private Deposit() {
        }
    }

    /* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual$Retirement;", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", "ringPercentage", "", "<init>", "(F)V", "getRingPercentage", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Retirement implements FirstDepositNumberVisual {
        public static final int $stable = 0;
        private final float ringPercentage;

        public static /* synthetic */ Retirement copy$default(Retirement retirement, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = retirement.ringPercentage;
            }
            return retirement.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRingPercentage() {
            return this.ringPercentage;
        }

        public final Retirement copy(float ringPercentage) {
            return new Retirement(ringPercentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retirement) && Float.compare(this.ringPercentage, ((Retirement) other).ringPercentage) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.ringPercentage);
        }

        public String toString() {
            return "Retirement(ringPercentage=" + this.ringPercentage + ")";
        }

        public Retirement(float f) {
            this.ringPercentage = f;
        }

        public final float getRingPercentage() {
            return this.ringPercentage;
        }
    }
}
