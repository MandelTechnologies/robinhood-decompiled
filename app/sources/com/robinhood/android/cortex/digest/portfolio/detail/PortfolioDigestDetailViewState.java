package com.robinhood.android.cortex.digest.portfolio.detail;

import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PortfolioDigestDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailViewState;", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "articleSources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "getArticleSources", "()Lkotlinx/collections/immutable/ImmutableList;", "getFeedback", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PortfolioDigestDetailViewState {
    public static final int $stable = 8;
    private final ImmutableList<ArticleSource> articleSources;
    private final PortfolioDigest.HasOnboarded digest;
    private final DigestFeedback feedback;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioDigestDetailViewState copy$default(PortfolioDigestDetailViewState portfolioDigestDetailViewState, PortfolioDigest.HasOnboarded hasOnboarded, ImmutableList immutableList, DigestFeedback digestFeedback, int i, Object obj) {
        if ((i & 1) != 0) {
            hasOnboarded = portfolioDigestDetailViewState.digest;
        }
        if ((i & 2) != 0) {
            immutableList = portfolioDigestDetailViewState.articleSources;
        }
        if ((i & 4) != 0) {
            digestFeedback = portfolioDigestDetailViewState.feedback;
        }
        return portfolioDigestDetailViewState.copy(hasOnboarded, immutableList, digestFeedback);
    }

    /* renamed from: component1, reason: from getter */
    public final PortfolioDigest.HasOnboarded getDigest() {
        return this.digest;
    }

    public final ImmutableList<ArticleSource> component2() {
        return this.articleSources;
    }

    /* renamed from: component3, reason: from getter */
    public final DigestFeedback getFeedback() {
        return this.feedback;
    }

    public final PortfolioDigestDetailViewState copy(PortfolioDigest.HasOnboarded digest, ImmutableList<ArticleSource> articleSources, DigestFeedback feedback) {
        Intrinsics.checkNotNullParameter(digest, "digest");
        Intrinsics.checkNotNullParameter(articleSources, "articleSources");
        return new PortfolioDigestDetailViewState(digest, articleSources, feedback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioDigestDetailViewState)) {
            return false;
        }
        PortfolioDigestDetailViewState portfolioDigestDetailViewState = (PortfolioDigestDetailViewState) other;
        return Intrinsics.areEqual(this.digest, portfolioDigestDetailViewState.digest) && Intrinsics.areEqual(this.articleSources, portfolioDigestDetailViewState.articleSources) && Intrinsics.areEqual(this.feedback, portfolioDigestDetailViewState.feedback);
    }

    public int hashCode() {
        int iHashCode = ((this.digest.hashCode() * 31) + this.articleSources.hashCode()) * 31;
        DigestFeedback digestFeedback = this.feedback;
        return iHashCode + (digestFeedback == null ? 0 : digestFeedback.hashCode());
    }

    public String toString() {
        return "PortfolioDigestDetailViewState(digest=" + this.digest + ", articleSources=" + this.articleSources + ", feedback=" + this.feedback + ")";
    }

    public PortfolioDigestDetailViewState(PortfolioDigest.HasOnboarded digest, ImmutableList<ArticleSource> articleSources, DigestFeedback digestFeedback) {
        Intrinsics.checkNotNullParameter(digest, "digest");
        Intrinsics.checkNotNullParameter(articleSources, "articleSources");
        this.digest = digest;
        this.articleSources = articleSources;
        this.feedback = digestFeedback;
    }

    public final PortfolioDigest.HasOnboarded getDigest() {
        return this.digest;
    }

    public /* synthetic */ PortfolioDigestDetailViewState(PortfolioDigest.HasOnboarded hasOnboarded, ImmutableList immutableList, DigestFeedback digestFeedback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hasOnboarded, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList, (i & 4) != 0 ? null : digestFeedback);
    }

    public final ImmutableList<ArticleSource> getArticleSources() {
        return this.articleSources;
    }

    public final DigestFeedback getFeedback() {
        return this.feedback;
    }
}
