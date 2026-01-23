package com.robinhood.shared.crypto.staking.staking.initialization;

import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitialLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "", "PromptCryptoAccountAgreement", "StakingNotAvailable", "ShowInterstitial", "ShowInputPage", "Error", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$PromptCryptoAccountAgreement;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$ShowInputPage;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$ShowInterstitial;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$StakingNotAvailable;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InitialLoadingEvent {

    /* compiled from: InitialLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$PromptCryptoAccountAgreement;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PromptCryptoAccountAgreement implements InitialLoadingEvent {
        public static final int $stable = 0;
        public static final PromptCryptoAccountAgreement INSTANCE = new PromptCryptoAccountAgreement();

        public boolean equals(Object other) {
            return this == other || (other instanceof PromptCryptoAccountAgreement);
        }

        public int hashCode() {
            return 733352789;
        }

        public String toString() {
            return "PromptCryptoAccountAgreement";
        }

        private PromptCryptoAccountAgreement() {
        }
    }

    /* compiled from: InitialLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$StakingNotAvailable;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StakingNotAvailable implements InitialLoadingEvent {
        public static final int $stable = 0;
        public static final StakingNotAvailable INSTANCE = new StakingNotAvailable();

        public boolean equals(Object other) {
            return this == other || (other instanceof StakingNotAvailable);
        }

        public int hashCode() {
            return -514675814;
        }

        public String toString() {
            return "StakingNotAvailable";
        }

        private StakingNotAvailable() {
        }
    }

    /* compiled from: InitialLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$ShowInterstitial;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "pageContent", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "<init>", "(Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;)V", "getPageContent", "()Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInterstitial implements InitialLoadingEvent {
        public static final int $stable = 8;
        private final StakingConfig.OnboardingPage pageContent;

        public static /* synthetic */ ShowInterstitial copy$default(ShowInterstitial showInterstitial, StakingConfig.OnboardingPage onboardingPage, int i, Object obj) {
            if ((i & 1) != 0) {
                onboardingPage = showInterstitial.pageContent;
            }
            return showInterstitial.copy(onboardingPage);
        }

        /* renamed from: component1, reason: from getter */
        public final StakingConfig.OnboardingPage getPageContent() {
            return this.pageContent;
        }

        public final ShowInterstitial copy(StakingConfig.OnboardingPage pageContent) {
            Intrinsics.checkNotNullParameter(pageContent, "pageContent");
            return new ShowInterstitial(pageContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInterstitial) && Intrinsics.areEqual(this.pageContent, ((ShowInterstitial) other).pageContent);
        }

        public int hashCode() {
            return this.pageContent.hashCode();
        }

        public String toString() {
            return "ShowInterstitial(pageContent=" + this.pageContent + ")";
        }

        public ShowInterstitial(StakingConfig.OnboardingPage pageContent) {
            Intrinsics.checkNotNullParameter(pageContent, "pageContent");
            this.pageContent = pageContent;
        }

        public final StakingConfig.OnboardingPage getPageContent() {
            return this.pageContent;
        }
    }

    /* compiled from: InitialLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$ShowInputPage;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInputPage implements InitialLoadingEvent {
        public static final int $stable = 0;
        public static final ShowInputPage INSTANCE = new ShowInputPage();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowInputPage);
        }

        public int hashCode() {
            return 1197007817;
        }

        public String toString() {
            return "ShowInputPage";
        }

        private ShowInputPage() {
        }
    }

    /* compiled from: InitialLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements InitialLoadingEvent {
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
