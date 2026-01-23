package com.robinhood.android.cortex.digest.asset.onboarding;

import kotlin.Metadata;

/* compiled from: AssetDigestOnboardingParentEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent;", "", "Timeout", "Loaded", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent$Timeout;", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface AssetDigestOnboardingParentEvent {

    /* compiled from: AssetDigestOnboardingParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent$Timeout;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Timeout implements AssetDigestOnboardingParentEvent {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        public boolean equals(Object other) {
            return this == other || (other instanceof Timeout);
        }

        public int hashCode() {
            return 501232216;
        }

        public String toString() {
            return "Timeout";
        }

        private Timeout() {
        }
    }

    /* compiled from: AssetDigestOnboardingParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AssetDigestOnboardingParentEvent {
        public static final int $stable = 0;
        public static final Loaded INSTANCE = new Loaded();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loaded);
        }

        public int hashCode() {
            return -1731702738;
        }

        public String toString() {
            return "Loaded";
        }

        private Loaded() {
        }
    }
}
