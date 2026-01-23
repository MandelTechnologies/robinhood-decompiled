package com.robinhood.android.cortex.digest.portfolio.splash;

import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loaded;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loading;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashViewState, reason: use source file name */
/* loaded from: classes2.dex */
public interface PortfolioDigestSplashDuxo4 {

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loading;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;", "<init>", "()V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashViewState$Loading */
    public static final class Loading implements PortfolioDigestSplashDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loaded;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements PortfolioDigestSplashDuxo4 {
        public static final int $stable = 8;
        private final PortfolioDigest.NeedsOnboarding digest;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, PortfolioDigest.NeedsOnboarding needsOnboarding, int i, Object obj) {
            if ((i & 1) != 0) {
                needsOnboarding = loaded.digest;
            }
            return loaded.copy(needsOnboarding);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }

        public final Loaded copy(PortfolioDigest.NeedsOnboarding digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new Loaded(digest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.digest, ((Loaded) other).digest);
        }

        public int hashCode() {
            return this.digest.hashCode();
        }

        public String toString() {
            return "Loaded(digest=" + this.digest + ")";
        }

        public Loaded(PortfolioDigest.NeedsOnboarding digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
        }

        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }
    }
}
