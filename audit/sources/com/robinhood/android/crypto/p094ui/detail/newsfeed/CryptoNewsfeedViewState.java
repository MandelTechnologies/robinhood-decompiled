package com.robinhood.android.crypto.p094ui.detail.newsfeed;

import com.robinhood.android.crypto.p094ui.detail.newsfeed.section.NewsfeedRowState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Duration;

/* compiled from: CryptoNewsfeedDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedViewState;", "", "newsfeeds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "symbol", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)V", "getNewsfeeds", "()Lkotlinx/collections/immutable/ImmutableList;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsfeedViewState {
    private static final NewsfeedRowState loading;
    private final ImmutableList<NewsfeedRowState> newsfeeds;
    private final String symbol;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsfeedViewState copy$default(CryptoNewsfeedViewState cryptoNewsfeedViewState, ImmutableList immutableList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoNewsfeedViewState.newsfeeds;
        }
        if ((i & 2) != 0) {
            str = cryptoNewsfeedViewState.symbol;
        }
        return cryptoNewsfeedViewState.copy(immutableList, str);
    }

    public final ImmutableList<NewsfeedRowState> component1() {
        return this.newsfeeds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final CryptoNewsfeedViewState copy(ImmutableList<NewsfeedRowState> newsfeeds, String symbol) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        return new CryptoNewsfeedViewState(newsfeeds, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsfeedViewState)) {
            return false;
        }
        CryptoNewsfeedViewState cryptoNewsfeedViewState = (CryptoNewsfeedViewState) other;
        return Intrinsics.areEqual(this.newsfeeds, cryptoNewsfeedViewState.newsfeeds) && Intrinsics.areEqual(this.symbol, cryptoNewsfeedViewState.symbol);
    }

    public int hashCode() {
        int iHashCode = this.newsfeeds.hashCode() * 31;
        String str = this.symbol;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CryptoNewsfeedViewState(newsfeeds=" + this.newsfeeds + ", symbol=" + this.symbol + ")";
    }

    public CryptoNewsfeedViewState(ImmutableList<NewsfeedRowState> newsfeeds, String str) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        this.newsfeeds = newsfeeds;
        this.symbol = str;
    }

    public final ImmutableList<NewsfeedRowState> getNewsfeeds() {
        return this.newsfeeds;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    /* compiled from: CryptoNewsfeedDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedViewState$Companion;", "", "<init>", "()V", "loading", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "getLoading$feature_crypto_externalDebug", "()Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NewsfeedRowState getLoading$feature_crypto_externalDebug() {
            return CryptoNewsfeedViewState.loading;
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Duration ZERO = Duration.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        loading = new NewsfeedRowState(uuidRandomUUID, null, ZERO, "---", "-- ----- ----- ---- ----", "", true);
    }
}
