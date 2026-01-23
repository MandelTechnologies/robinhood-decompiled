package com.robinhood.android.crypto.p094ui.detail.newsfeed.section;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoNewsfeedSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/CryptoNewsfeedSectionViewState;", "", "newsfeeds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "isShowMoreVisible", "", "isVisible", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZZ)V", "getNewsfeeds", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsfeedSectionViewState {
    public static final int $stable = 8;
    private final boolean isShowMoreVisible;
    private final boolean isVisible;
    private final ImmutableList<NewsfeedRowState> newsfeeds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsfeedSectionViewState copy$default(CryptoNewsfeedSectionViewState cryptoNewsfeedSectionViewState, ImmutableList immutableList, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoNewsfeedSectionViewState.newsfeeds;
        }
        if ((i & 2) != 0) {
            z = cryptoNewsfeedSectionViewState.isShowMoreVisible;
        }
        if ((i & 4) != 0) {
            z2 = cryptoNewsfeedSectionViewState.isVisible;
        }
        return cryptoNewsfeedSectionViewState.copy(immutableList, z, z2);
    }

    public final ImmutableList<NewsfeedRowState> component1() {
        return this.newsfeeds;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsShowMoreVisible() {
        return this.isShowMoreVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final CryptoNewsfeedSectionViewState copy(ImmutableList<NewsfeedRowState> newsfeeds, boolean isShowMoreVisible, boolean isVisible) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        return new CryptoNewsfeedSectionViewState(newsfeeds, isShowMoreVisible, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsfeedSectionViewState)) {
            return false;
        }
        CryptoNewsfeedSectionViewState cryptoNewsfeedSectionViewState = (CryptoNewsfeedSectionViewState) other;
        return Intrinsics.areEqual(this.newsfeeds, cryptoNewsfeedSectionViewState.newsfeeds) && this.isShowMoreVisible == cryptoNewsfeedSectionViewState.isShowMoreVisible && this.isVisible == cryptoNewsfeedSectionViewState.isVisible;
    }

    public int hashCode() {
        return (((this.newsfeeds.hashCode() * 31) + Boolean.hashCode(this.isShowMoreVisible)) * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "CryptoNewsfeedSectionViewState(newsfeeds=" + this.newsfeeds + ", isShowMoreVisible=" + this.isShowMoreVisible + ", isVisible=" + this.isVisible + ")";
    }

    public CryptoNewsfeedSectionViewState(ImmutableList<NewsfeedRowState> newsfeeds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        this.newsfeeds = newsfeeds;
        this.isShowMoreVisible = z;
        this.isVisible = z2;
    }

    public final ImmutableList<NewsfeedRowState> getNewsfeeds() {
        return this.newsfeeds;
    }

    public final boolean isShowMoreVisible() {
        return this.isShowMoreVisible;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
