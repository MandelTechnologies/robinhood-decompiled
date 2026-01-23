package com.robinhood.shared.crypto.staking.staking.onboarding;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "", "<init>", "()V", "LoadingState", "ErrorState", "SuccessState", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$ErrorState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$LoadingState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$SuccessState;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingOnboardingViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingOnboardingViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoStakingOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$LoadingState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadingState extends CryptoStakingOnboardingViewState {
        public static final int $stable = 0;
        public static final LoadingState INSTANCE = new LoadingState();

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadingState);
        }

        public int hashCode() {
            return -1382154660;
        }

        public String toString() {
            return "LoadingState";
        }

        private LoadingState() {
            super(null);
        }
    }

    private CryptoStakingOnboardingViewState() {
    }

    /* compiled from: CryptoStakingOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$ErrorState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorState extends CryptoStakingOnboardingViewState {
        public static final int $stable = 0;
        public static final ErrorState INSTANCE = new ErrorState();

        public boolean equals(Object other) {
            return this == other || (other instanceof ErrorState);
        }

        public int hashCode() {
            return -500700464;
        }

        public String toString() {
            return "ErrorState";
        }

        private ErrorState() {
            super(null);
        }
    }

    /* compiled from: CryptoStakingOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState$SuccessState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "primaryButtonText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryButtonText", "isUpdatingAgreement", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getPrimaryButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryButtonText", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SuccessState extends CryptoStakingOnboardingViewState {
        public static final int $stable = StringResource.$stable;
        private final boolean isUpdatingAgreement;
        private final StringResource primaryButtonText;
        private final StringResource secondaryButtonText;

        public static /* synthetic */ SuccessState copy$default(SuccessState successState, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = successState.primaryButtonText;
            }
            if ((i & 2) != 0) {
                stringResource2 = successState.secondaryButtonText;
            }
            if ((i & 4) != 0) {
                z = successState.isUpdatingAgreement;
            }
            return successState.copy(stringResource, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsUpdatingAgreement() {
            return this.isUpdatingAgreement;
        }

        public final SuccessState copy(StringResource primaryButtonText, StringResource secondaryButtonText, boolean isUpdatingAgreement) {
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            return new SuccessState(primaryButtonText, secondaryButtonText, isUpdatingAgreement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessState)) {
                return false;
            }
            SuccessState successState = (SuccessState) other;
            return Intrinsics.areEqual(this.primaryButtonText, successState.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, successState.secondaryButtonText) && this.isUpdatingAgreement == successState.isUpdatingAgreement;
        }

        public int hashCode() {
            return (((this.primaryButtonText.hashCode() * 31) + this.secondaryButtonText.hashCode()) * 31) + Boolean.hashCode(this.isUpdatingAgreement);
        }

        public String toString() {
            return "SuccessState(primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", isUpdatingAgreement=" + this.isUpdatingAgreement + ")";
        }

        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final StringResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public final boolean isUpdatingAgreement() {
            return this.isUpdatingAgreement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessState(StringResource primaryButtonText, StringResource secondaryButtonText, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = secondaryButtonText;
            this.isUpdatingAgreement = z;
        }
    }
}
