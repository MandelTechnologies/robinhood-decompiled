package com.robinhood.android.cortex.digest.portfolio.splash;

import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "", "NavigateToDigest", "NavigateToGoldUpgrade", "NavigateToAgreement", "Error", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToAgreement;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToDigest;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToGoldUpgrade;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface PortfolioDigestSplashDuxo3 {

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToDigest;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashEvent$NavigateToDigest, reason: from toString */
    public static final /* data */ class NavigateToDigest implements PortfolioDigestSplashDuxo3 {
        public static final int $stable = 8;
        private final PortfolioDigest.HasOnboarded digest;

        public static /* synthetic */ NavigateToDigest copy$default(NavigateToDigest navigateToDigest, PortfolioDigest.HasOnboarded hasOnboarded, int i, Object obj) {
            if ((i & 1) != 0) {
                hasOnboarded = navigateToDigest.digest;
            }
            return navigateToDigest.copy(hasOnboarded);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        public final NavigateToDigest copy(PortfolioDigest.HasOnboarded digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new NavigateToDigest(digest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToDigest) && Intrinsics.areEqual(this.digest, ((NavigateToDigest) other).digest);
        }

        public int hashCode() {
            return this.digest.hashCode();
        }

        public String toString() {
            return "NavigateToDigest(digest=" + this.digest + ")";
        }

        public NavigateToDigest(PortfolioDigest.HasOnboarded digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
        }

        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToGoldUpgrade;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashEvent$NavigateToGoldUpgrade, reason: from toString */
    public static final /* data */ class NavigateToGoldUpgrade implements PortfolioDigestSplashDuxo3 {
        public static final int $stable = 8;
        private final PortfolioDigest.NeedsGold digest;

        public static /* synthetic */ NavigateToGoldUpgrade copy$default(NavigateToGoldUpgrade navigateToGoldUpgrade, PortfolioDigest.NeedsGold needsGold, int i, Object obj) {
            if ((i & 1) != 0) {
                needsGold = navigateToGoldUpgrade.digest;
            }
            return navigateToGoldUpgrade.copy(needsGold);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.NeedsGold getDigest() {
            return this.digest;
        }

        public final NavigateToGoldUpgrade copy(PortfolioDigest.NeedsGold digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new NavigateToGoldUpgrade(digest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToGoldUpgrade) && Intrinsics.areEqual(this.digest, ((NavigateToGoldUpgrade) other).digest);
        }

        public int hashCode() {
            return this.digest.hashCode();
        }

        public String toString() {
            return "NavigateToGoldUpgrade(digest=" + this.digest + ")";
        }

        public NavigateToGoldUpgrade(PortfolioDigest.NeedsGold digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
        }

        public final PortfolioDigest.NeedsGold getDigest() {
            return this.digest;
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$NavigateToAgreement;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashEvent$NavigateToAgreement, reason: from toString */
    public static final /* data */ class NavigateToAgreement implements PortfolioDigestSplashDuxo3 {
        public static final int $stable = 8;
        private final PortfolioDigest.NeedsOnboarding digest;

        public static /* synthetic */ NavigateToAgreement copy$default(NavigateToAgreement navigateToAgreement, PortfolioDigest.NeedsOnboarding needsOnboarding, int i, Object obj) {
            if ((i & 1) != 0) {
                needsOnboarding = navigateToAgreement.digest;
            }
            return navigateToAgreement.copy(needsOnboarding);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }

        public final NavigateToAgreement copy(PortfolioDigest.NeedsOnboarding digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new NavigateToAgreement(digest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToAgreement) && Intrinsics.areEqual(this.digest, ((NavigateToAgreement) other).digest);
        }

        public int hashCode() {
            return this.digest.hashCode();
        }

        public String toString() {
            return "NavigateToAgreement(digest=" + this.digest + ")";
        }

        public NavigateToAgreement(PortfolioDigest.NeedsOnboarding digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
        }

        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashEvent$Error, reason: from toString */
    public static final /* data */ class Error implements PortfolioDigestSplashDuxo3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

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
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable th) {
            this.throwable = th;
        }

        public /* synthetic */ Error(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
