package com.robinhood.android.cortex.store.portfolio;

import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PortfolioDigestStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "sources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "getSources", "()Lkotlinx/collections/immutable/ImmutableList;", "Success", "NotFound", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult$NotFound;", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult$Success;", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestResult, reason: use source file name */
/* loaded from: classes2.dex */
public interface PortfolioDigestStore2 {
    PortfolioDigest getDigest();

    ImmutableList<ArticleSource> getSources();

    /* compiled from: PortfolioDigestStore.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult$Success;", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;", "key", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "sources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;Lkotlinx/collections/immutable/ImmutableList;)V", "getKey", "()Ljava/lang/String;", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "getSources", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestResult$Success, reason: from toString */
    public static final /* data */ class Success implements PortfolioDigestStore2 {
        public static final int $stable = 8;
        private final PortfolioDigest digest;
        private final String key;
        private final ImmutableList<ArticleSource> sources;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, String str, PortfolioDigest portfolioDigest, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.key;
            }
            if ((i & 2) != 0) {
                portfolioDigest = success.digest;
            }
            if ((i & 4) != 0) {
                immutableList = success.sources;
            }
            return success.copy(str, portfolioDigest, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final PortfolioDigest getDigest() {
            return this.digest;
        }

        public final ImmutableList<ArticleSource> component3() {
            return this.sources;
        }

        public final Success copy(String key, PortfolioDigest digest, ImmutableList<ArticleSource> sources) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new Success(key, digest, sources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.key, success.key) && Intrinsics.areEqual(this.digest, success.digest) && Intrinsics.areEqual(this.sources, success.sources);
        }

        public int hashCode() {
            int iHashCode = ((this.key.hashCode() * 31) + this.digest.hashCode()) * 31;
            ImmutableList<ArticleSource> immutableList = this.sources;
            return iHashCode + (immutableList == null ? 0 : immutableList.hashCode());
        }

        public String toString() {
            return "Success(key=" + this.key + ", digest=" + this.digest + ", sources=" + this.sources + ")";
        }

        public Success(String key, PortfolioDigest digest, ImmutableList<ArticleSource> immutableList) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.key = key;
            this.digest = digest;
            this.sources = immutableList;
        }

        public final String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2
        public PortfolioDigest getDigest() {
            return this.digest;
        }

        @Override // com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2
        public ImmutableList<ArticleSource> getSources() {
            return this.sources;
        }
    }

    /* compiled from: PortfolioDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult$NotFound;", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;", "key", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getKey", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "sources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "getSources", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestResult$NotFound, reason: from toString */
    public static final /* data */ class NotFound implements PortfolioDigestStore2 {
        public static final int $stable = 8;
        private final String key;
        private final Throwable throwable;

        public static /* synthetic */ NotFound copy$default(NotFound notFound, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notFound.key;
            }
            if ((i & 2) != 0) {
                th = notFound.throwable;
            }
            return notFound.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NotFound copy(String key, Throwable throwable) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NotFound(key, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotFound)) {
                return false;
            }
            NotFound notFound = (NotFound) other;
            return Intrinsics.areEqual(this.key, notFound.key) && Intrinsics.areEqual(this.throwable, notFound.throwable);
        }

        @Override // com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2
        public PortfolioDigest getDigest() {
            return null;
        }

        @Override // com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2
        public ImmutableList<ArticleSource> getSources() {
            return null;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.throwable.hashCode();
        }

        public String toString() {
            return "NotFound(key=" + this.key + ", throwable=" + this.throwable + ")";
        }

        public NotFound(String key, Throwable throwable) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.key = key;
            this.throwable = throwable;
        }

        public final String getKey() {
            return this.key;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
