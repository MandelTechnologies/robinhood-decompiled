package com.robinhood.android.crypto.tab.p093ui.news;

import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeNewsViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsViewState;", "", "isContentVisible", "", "cryptoArticles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getCryptoArticles", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeNewsViewState {
    public static final int $stable = 8;
    private final ImmutableList<CryptoNewsArticle> cryptoArticles;
    private final boolean isContentVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeNewsViewState copy$default(CryptoHomeNewsViewState cryptoHomeNewsViewState, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoHomeNewsViewState.isContentVisible;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoHomeNewsViewState.cryptoArticles;
        }
        return cryptoHomeNewsViewState.copy(z, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsContentVisible() {
        return this.isContentVisible;
    }

    public final ImmutableList<CryptoNewsArticle> component2() {
        return this.cryptoArticles;
    }

    public final CryptoHomeNewsViewState copy(boolean isContentVisible, ImmutableList<CryptoNewsArticle> cryptoArticles) {
        Intrinsics.checkNotNullParameter(cryptoArticles, "cryptoArticles");
        return new CryptoHomeNewsViewState(isContentVisible, cryptoArticles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeNewsViewState)) {
            return false;
        }
        CryptoHomeNewsViewState cryptoHomeNewsViewState = (CryptoHomeNewsViewState) other;
        return this.isContentVisible == cryptoHomeNewsViewState.isContentVisible && Intrinsics.areEqual(this.cryptoArticles, cryptoHomeNewsViewState.cryptoArticles);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isContentVisible) * 31) + this.cryptoArticles.hashCode();
    }

    public String toString() {
        return "CryptoHomeNewsViewState(isContentVisible=" + this.isContentVisible + ", cryptoArticles=" + this.cryptoArticles + ")";
    }

    public CryptoHomeNewsViewState(boolean z, ImmutableList<CryptoNewsArticle> cryptoArticles) {
        Intrinsics.checkNotNullParameter(cryptoArticles, "cryptoArticles");
        this.isContentVisible = z;
        this.cryptoArticles = cryptoArticles;
    }

    public final boolean isContentVisible() {
        return this.isContentVisible;
    }

    public final ImmutableList<CryptoNewsArticle> getCryptoArticles() {
        return this.cryptoArticles;
    }
}
