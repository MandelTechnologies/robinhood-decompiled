package com.robinhood.android.crypto.tab.p093ui.news;

import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.Quote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeNewsDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J-\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsDataState;", "", "newsFeedElements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "quotes", "", "Lcom/robinhood/models/db/Quote;", "<init>", "(Ljava/util/List;Ljava/lang/Iterable;)V", "articles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "getArticles", "()Lkotlinx/collections/immutable/ImmutableList;", "relatedInstrumentQuoteMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lkotlin/collections/HashMap;", "isContentVisible", "", "()Z", "cryptoArticles", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "getCryptoArticles", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeNewsDataState {
    public static final int $stable = 8;
    private final List<NewsFeedElement> newsFeedElements;
    private final Iterable<Quote> quotes;
    private final HashMap<UUID, Quote> relatedInstrumentQuoteMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeNewsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final List<NewsFeedElement> component1() {
        return this.newsFeedElements;
    }

    private final Iterable<Quote> component2() {
        return this.quotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeNewsDataState copy$default(CryptoHomeNewsDataState cryptoHomeNewsDataState, List list, Iterable iterable, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoHomeNewsDataState.newsFeedElements;
        }
        if ((i & 2) != 0) {
            iterable = cryptoHomeNewsDataState.quotes;
        }
        return cryptoHomeNewsDataState.copy(list, iterable);
    }

    public final CryptoHomeNewsDataState copy(List<NewsFeedElement> newsFeedElements, Iterable<Quote> quotes) {
        return new CryptoHomeNewsDataState(newsFeedElements, quotes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeNewsDataState)) {
            return false;
        }
        CryptoHomeNewsDataState cryptoHomeNewsDataState = (CryptoHomeNewsDataState) other;
        return Intrinsics.areEqual(this.newsFeedElements, cryptoHomeNewsDataState.newsFeedElements) && Intrinsics.areEqual(this.quotes, cryptoHomeNewsDataState.quotes);
    }

    public int hashCode() {
        List<NewsFeedElement> list = this.newsFeedElements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Iterable<Quote> iterable = this.quotes;
        return iHashCode + (iterable != null ? iterable.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHomeNewsDataState(newsFeedElements=" + this.newsFeedElements + ", quotes=" + this.quotes + ")";
    }

    public CryptoHomeNewsDataState(List<NewsFeedElement> list, Iterable<Quote> iterable) {
        this.newsFeedElements = list;
        this.quotes = iterable;
        HashMap<UUID, Quote> map = new HashMap<>();
        if (iterable != null) {
            for (Quote quote : iterable) {
                map.put(quote.getInstrumentId(), quote);
            }
        }
        this.relatedInstrumentQuoteMap = map;
    }

    public /* synthetic */ CryptoHomeNewsDataState(List list, Iterable iterable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : iterable);
    }

    private final ImmutableList<Content.Article> getArticles() {
        List<NewsFeedElement> listEmptyList = this.newsFeedElements;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return extensions2.toImmutableList(CollectionsKt.take(CollectionsKt.filterIsInstance(NewsFeedElements.toInstrumentNewsContent(listEmptyList), Content.Article.class), 3));
    }

    public final boolean isContentVisible() {
        return !getArticles().isEmpty();
    }

    public final ImmutableList<CryptoNewsArticle> getCryptoArticles() {
        UUID id;
        UUID id2;
        ImmutableList<Content.Article> articles = getArticles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(articles, 10));
        for (Content.Article article : articles) {
            RelatedInstrument firstInstrument = article.getFirstInstrument();
            Quote quote = null;
            Quote quote2 = (firstInstrument == null || (id2 = firstInstrument.getId()) == null) ? null : this.relatedInstrumentQuoteMap.get(id2);
            RelatedInstrument secondInstrument = article.getSecondInstrument();
            if (secondInstrument != null && (id = secondInstrument.getId()) != null) {
                quote = this.relatedInstrumentQuoteMap.get(id);
            }
            arrayList.add(new CryptoNewsArticle(article, quote2, quote));
        }
        return extensions2.toImmutableList(arrayList);
    }
}
