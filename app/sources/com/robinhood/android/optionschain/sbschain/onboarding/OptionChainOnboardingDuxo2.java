package com.robinhood.android.optionschain.sbschain.onboarding;

import com.robinhood.android.options.contracts.OptionChainIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;", "", "<init>", "()V", "Loading", "Error", "Loaded", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Error;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Loaded;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Loading;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingViewState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionChainOnboardingDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ OptionChainOnboardingDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionChainOnboardingDuxo2() {
    }

    /* compiled from: OptionChainOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Loading;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingViewState$Loading */
    public static final /* data */ class Loading extends OptionChainOnboardingDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1234690484;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: OptionChainOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Error;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingViewState$Error */
    public static final /* data */ class Error extends OptionChainOnboardingDuxo2 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1545071848;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: OptionChainOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState$Loaded;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;", "optionChainIntentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainIntentKey;)V", "getOptionChainIntentKey", "()Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends OptionChainOnboardingDuxo2 {
        public static final int $stable = 8;
        private final OptionChainIntentKey optionChainIntentKey;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, OptionChainIntentKey optionChainIntentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                optionChainIntentKey = loaded.optionChainIntentKey;
            }
            return loaded.copy(optionChainIntentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChainIntentKey getOptionChainIntentKey() {
            return this.optionChainIntentKey;
        }

        public final Loaded copy(OptionChainIntentKey optionChainIntentKey) {
            Intrinsics.checkNotNullParameter(optionChainIntentKey, "optionChainIntentKey");
            return new Loaded(optionChainIntentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.optionChainIntentKey, ((Loaded) other).optionChainIntentKey);
        }

        public int hashCode() {
            return this.optionChainIntentKey.hashCode();
        }

        public String toString() {
            return "Loaded(optionChainIntentKey=" + this.optionChainIntentKey + ")";
        }

        public final OptionChainIntentKey getOptionChainIntentKey() {
            return this.optionChainIntentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(OptionChainIntentKey optionChainIntentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(optionChainIntentKey, "optionChainIntentKey");
            this.optionChainIntentKey = optionChainIntentKey;
        }
    }
}
