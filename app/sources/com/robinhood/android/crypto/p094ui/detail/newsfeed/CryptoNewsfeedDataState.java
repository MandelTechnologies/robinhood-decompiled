package com.robinhood.android.crypto.p094ui.detail.newsfeed;

import bonfire.proto.idl.crypto.p033v1.MediaDto;
import com.robinhood.android.crypto.p094ui.detail.newsfeed.section.NewsfeedRowState;
import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
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

/* compiled from: CryptoNewsfeedDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedDataState;", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isLoading", "", "newsfeeds", "", "Lcom/robinhood/models/crypto/db/CryptoNewsfeed;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLjava/util/List;)V", "displayNewsfeeds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "getDisplayNewsfeeds$feature_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "symbol", "", "getSymbol$feature_crypto_externalDebug", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsfeedDataState {
    public static final int $stable = 8;
    private final UiCurrencyPair currencyPair;
    private final boolean isLoading;
    private final List<CryptoNewsfeed> newsfeeds;

    public CryptoNewsfeedDataState() {
        this(null, false, null, 7, null);
    }

    /* renamed from: component1, reason: from getter */
    private final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    private final List<CryptoNewsfeed> component3() {
        return this.newsfeeds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsfeedDataState copy$default(CryptoNewsfeedDataState cryptoNewsfeedDataState, UiCurrencyPair uiCurrencyPair, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoNewsfeedDataState.currencyPair;
        }
        if ((i & 2) != 0) {
            z = cryptoNewsfeedDataState.isLoading;
        }
        if ((i & 4) != 0) {
            list = cryptoNewsfeedDataState.newsfeeds;
        }
        return cryptoNewsfeedDataState.copy(uiCurrencyPair, z, list);
    }

    public final CryptoNewsfeedDataState copy(UiCurrencyPair currencyPair, boolean isLoading, List<CryptoNewsfeed> newsfeeds) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        return new CryptoNewsfeedDataState(currencyPair, isLoading, newsfeeds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsfeedDataState)) {
            return false;
        }
        CryptoNewsfeedDataState cryptoNewsfeedDataState = (CryptoNewsfeedDataState) other;
        return Intrinsics.areEqual(this.currencyPair, cryptoNewsfeedDataState.currencyPair) && this.isLoading == cryptoNewsfeedDataState.isLoading && Intrinsics.areEqual(this.newsfeeds, cryptoNewsfeedDataState.newsfeeds);
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        return ((((uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.newsfeeds.hashCode();
    }

    public String toString() {
        return "CryptoNewsfeedDataState(currencyPair=" + this.currencyPair + ", isLoading=" + this.isLoading + ", newsfeeds=" + this.newsfeeds + ")";
    }

    public CryptoNewsfeedDataState(UiCurrencyPair uiCurrencyPair, boolean z, List<CryptoNewsfeed> newsfeeds) {
        Intrinsics.checkNotNullParameter(newsfeeds, "newsfeeds");
        this.currencyPair = uiCurrencyPair;
        this.isLoading = z;
        this.newsfeeds = newsfeeds;
    }

    public /* synthetic */ CryptoNewsfeedDataState(UiCurrencyPair uiCurrencyPair, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? true : z, (i & 4) != 0 ? extensions2.persistentListOf() : list);
    }

    public final ImmutableList<NewsfeedRowState> getDisplayNewsfeeds$feature_crypto_externalDebug() {
        ArrayList arrayList;
        if (this.isLoading) {
            arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(CryptoNewsfeedViewState.INSTANCE.getLoading$feature_crypto_externalDebug());
            }
        } else {
            List<CryptoNewsfeed> list = this.newsfeeds;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CryptoNewsfeed cryptoNewsfeed : list) {
                UUID id = cryptoNewsfeed.getId();
                MediaDto media = cryptoNewsfeed.getData().getMedia();
                arrayList2.add(new NewsfeedRowState(id, media != null ? media.getUrl() : null, Durations.since(cryptoNewsfeed.getPublishedAt()), cryptoNewsfeed.getData().getSource(), cryptoNewsfeed.getData().getTitle(), cryptoNewsfeed.getData().getUrl(), false, 64, null));
            }
            arrayList = arrayList2;
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final String getSymbol$feature_crypto_externalDebug() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null) {
            return uiCurrencyPair.getDisplaySymbol();
        }
        return null;
    }
}
