package com.robinhood.android.cortex.digest.portfolio.agreement;

import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent;", "", "Loaded", "Timeout", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent$Timeout;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface PortfolioDigestAgreementDuxo2 {

    /* compiled from: PortfolioDigestAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementEvent$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements PortfolioDigestAgreementDuxo2 {
        public static final int $stable = 8;
        private final PortfolioDigest.HasOnboarded digest;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, PortfolioDigest.HasOnboarded hasOnboarded, int i, Object obj) {
            if ((i & 1) != 0) {
                hasOnboarded = loaded.digest;
            }
            return loaded.copy(hasOnboarded);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        public final Loaded copy(PortfolioDigest.HasOnboarded digest) {
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

        public Loaded(PortfolioDigest.HasOnboarded digest) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
        }

        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }
    }

    /* compiled from: PortfolioDigestAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent$Timeout;", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent;", "<init>", "()V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementEvent$Timeout */
    public static final class Timeout implements PortfolioDigestAgreementDuxo2 {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }
}
