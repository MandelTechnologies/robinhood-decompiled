package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.Quote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoNewsDataState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J-\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDataState;", "", "newsFeedElements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "quotes", "", "Lcom/robinhood/models/db/Quote;", "<init>", "(Ljava/util/List;Ljava/lang/Iterable;)V", "elements", "Lcom/robinhood/android/newsfeed/model/Element;", "getElements", "()Ljava/util/List;", "articles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "getArticles", "()Lkotlinx/collections/immutable/ImmutableList;", "relatedInstrumentQuoteMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lkotlin/collections/HashMap;", "educationCarousel", "Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "getEducationCarousel", "()Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "cryptoArticles", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "getCryptoArticles", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsDataState {
    public static final int $stable = 8;
    private final List<NewsFeedElement> newsFeedElements;
    private final Iterable<Quote> quotes;
    private final HashMap<UUID, Quote> relatedInstrumentQuoteMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoNewsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final List<NewsFeedElement> component1() {
        return this.newsFeedElements;
    }

    private final Iterable<Quote> component2() {
        return this.quotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsDataState copy$default(CryptoNewsDataState cryptoNewsDataState, List list, Iterable iterable, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoNewsDataState.newsFeedElements;
        }
        if ((i & 2) != 0) {
            iterable = cryptoNewsDataState.quotes;
        }
        return cryptoNewsDataState.copy(list, iterable);
    }

    public final CryptoNewsDataState copy(List<NewsFeedElement> newsFeedElements, Iterable<Quote> quotes) {
        return new CryptoNewsDataState(newsFeedElements, quotes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsDataState)) {
            return false;
        }
        CryptoNewsDataState cryptoNewsDataState = (CryptoNewsDataState) other;
        return Intrinsics.areEqual(this.newsFeedElements, cryptoNewsDataState.newsFeedElements) && Intrinsics.areEqual(this.quotes, cryptoNewsDataState.quotes);
    }

    public int hashCode() {
        List<NewsFeedElement> list = this.newsFeedElements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Iterable<Quote> iterable = this.quotes;
        return iHashCode + (iterable != null ? iterable.hashCode() : 0);
    }

    public String toString() {
        return "CryptoNewsDataState(newsFeedElements=" + this.newsFeedElements + ", quotes=" + this.quotes + ")";
    }

    public CryptoNewsDataState(List<NewsFeedElement> list, Iterable<Quote> iterable) {
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

    public /* synthetic */ CryptoNewsDataState(List list, Iterable iterable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : iterable);
    }

    private final List<Element> getElements() {
        List<NewsFeedElement> listEmptyList = this.newsFeedElements;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return NewsFeedElements.toElements$default(listEmptyList, SetsKt.emptySet(), false, false, false, false, MapsKt.emptyMap(), SetsKt.emptySet(), MapsKt.emptyMap(), MapsKt.emptyMap(), 0, null, 1024, null);
    }

    private final ImmutableList<Content.Article> getArticles() {
        List<NewsFeedElement> listEmptyList = this.newsFeedElements;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return extensions2.toImmutableList(CollectionsKt.filterIsInstance(NewsFeedElements.toInstrumentNewsContent(listEmptyList), Content.Article.class));
    }

    public final Element.EducationCarousel getEducationCarousel() {
        List<Element> elements = getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof Element.EducationCarousel) {
                arrayList.add(obj);
            }
        }
        return (Element.EducationCarousel) CollectionsKt.firstOrNull((List) arrayList);
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
