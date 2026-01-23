package com.robinhood.android.crypto.p094ui.detail.newsfeed.section;

import bonfire.proto.idl.crypto.p033v1.MediaDto;
import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import com.robinhood.utils.datetime.Durations;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoNewsfeedSectionDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/CryptoNewsfeedSectionDataState;", "", "newsfeeds", "", "Lcom/robinhood/models/crypto/db/CryptoNewsfeed;", "<init>", "(Ljava/util/List;)V", "displayedNewsfeeds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "getDisplayedNewsfeeds$feature_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "isShowMoreVisible", "", "isShowMoreVisible$feature_crypto_externalDebug", "()Z", "isVisible", "isVisible$feature_crypto_externalDebug", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsfeedSectionDataState {
    public static final int $stable = 8;
    private final List<CryptoNewsfeed> newsfeeds;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoNewsfeedSectionDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final List<CryptoNewsfeed> component1() {
        return this.newsfeeds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsfeedSectionDataState copy$default(CryptoNewsfeedSectionDataState cryptoNewsfeedSectionDataState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoNewsfeedSectionDataState.newsfeeds;
        }
        return cryptoNewsfeedSectionDataState.copy(list);
    }

    public final CryptoNewsfeedSectionDataState copy(List<CryptoNewsfeed> newsfeeds) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        return new CryptoNewsfeedSectionDataState(newsfeeds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoNewsfeedSectionDataState) && Intrinsics.areEqual(this.newsfeeds, ((CryptoNewsfeedSectionDataState) other).newsfeeds);
    }

    public int hashCode() {
        return this.newsfeeds.hashCode();
    }

    public String toString() {
        return "CryptoNewsfeedSectionDataState(newsfeeds=" + this.newsfeeds + ")";
    }

    public CryptoNewsfeedSectionDataState(List<CryptoNewsfeed> newsfeeds) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        this.newsfeeds = newsfeeds;
    }

    public /* synthetic */ CryptoNewsfeedSectionDataState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : list);
    }

    public final ImmutableList<NewsfeedRowState> getDisplayedNewsfeeds$feature_crypto_externalDebug() {
        List<CryptoNewsfeed> listTake = CollectionsKt.take(this.newsfeeds, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (CryptoNewsfeed cryptoNewsfeed : listTake) {
            UUID id = cryptoNewsfeed.getId();
            MediaDto media = cryptoNewsfeed.getData().getMedia();
            arrayList.add(new NewsfeedRowState(id, media != null ? media.getUrl() : null, Durations.since(cryptoNewsfeed.getPublishedAt()), cryptoNewsfeed.getData().getSource(), cryptoNewsfeed.getData().getTitle(), cryptoNewsfeed.getData().getUrl(), false, 64, null));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final boolean isShowMoreVisible$feature_crypto_externalDebug() {
        return this.newsfeeds.size() > 3;
    }

    public final boolean isVisible$feature_crypto_externalDebug() {
        return !this.newsfeeds.isEmpty();
    }
}
