package com.robinhood.android.search.newsfeed.marketupdates;

import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.market.updates.p332db.MarketIndicator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedMarketIndicesViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketIndicesViewState;", "", "newsfeedContentIndicators", "", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "marketIndicesMap", "", "", "Lcom/robinhood/models/market/updates/db/MarketIndicator;", "cryptoQuotesMap", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getNewsfeedContentIndicators", "()Ljava/util/List;", "getMarketIndicesMap", "()Ljava/util/Map;", "getCryptoQuotesMap", "marketIndicatorItems", "Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemData;", "getMarketIndicatorItems", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NewsFeedMarketIndicesViewState {
    public static final int $stable = 8;
    private final Map<String, CryptoQuote> cryptoQuotesMap;
    private final List<MarketIndicatorItemData> marketIndicatorItems;
    private final Map<String, MarketIndicator> marketIndicesMap;
    private final List<Content.MarketIndicator> newsfeedContentIndicators;

    public NewsFeedMarketIndicesViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsFeedMarketIndicesViewState copy$default(NewsFeedMarketIndicesViewState newsFeedMarketIndicesViewState, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsFeedMarketIndicesViewState.newsfeedContentIndicators;
        }
        if ((i & 2) != 0) {
            map = newsFeedMarketIndicesViewState.marketIndicesMap;
        }
        if ((i & 4) != 0) {
            map2 = newsFeedMarketIndicesViewState.cryptoQuotesMap;
        }
        return newsFeedMarketIndicesViewState.copy(list, map, map2);
    }

    public final List<Content.MarketIndicator> component1() {
        return this.newsfeedContentIndicators;
    }

    public final Map<String, MarketIndicator> component2() {
        return this.marketIndicesMap;
    }

    public final Map<String, CryptoQuote> component3() {
        return this.cryptoQuotesMap;
    }

    public final NewsFeedMarketIndicesViewState copy(List<Content.MarketIndicator> newsfeedContentIndicators, Map<String, MarketIndicator> marketIndicesMap, Map<String, CryptoQuote> cryptoQuotesMap) {
        Intrinsics.checkNotNullParameter(newsfeedContentIndicators, "newsfeedContentIndicators");
        Intrinsics.checkNotNullParameter(marketIndicesMap, "marketIndicesMap");
        Intrinsics.checkNotNullParameter(cryptoQuotesMap, "cryptoQuotesMap");
        return new NewsFeedMarketIndicesViewState(newsfeedContentIndicators, marketIndicesMap, cryptoQuotesMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeedMarketIndicesViewState)) {
            return false;
        }
        NewsFeedMarketIndicesViewState newsFeedMarketIndicesViewState = (NewsFeedMarketIndicesViewState) other;
        return Intrinsics.areEqual(this.newsfeedContentIndicators, newsFeedMarketIndicesViewState.newsfeedContentIndicators) && Intrinsics.areEqual(this.marketIndicesMap, newsFeedMarketIndicesViewState.marketIndicesMap) && Intrinsics.areEqual(this.cryptoQuotesMap, newsFeedMarketIndicesViewState.cryptoQuotesMap);
    }

    public int hashCode() {
        return (((this.newsfeedContentIndicators.hashCode() * 31) + this.marketIndicesMap.hashCode()) * 31) + this.cryptoQuotesMap.hashCode();
    }

    public String toString() {
        return "NewsFeedMarketIndicesViewState(newsfeedContentIndicators=" + this.newsfeedContentIndicators + ", marketIndicesMap=" + this.marketIndicesMap + ", cryptoQuotesMap=" + this.cryptoQuotesMap + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[PHI: r6
      0x005d: PHI (r6v8 com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemData) = 
      (r6v7 com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemData)
      (r6v10 com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemData)
     binds: [B:17:0x007d, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NewsFeedMarketIndicesViewState(List<Content.MarketIndicator> newsfeedContentIndicators, Map<String, MarketIndicator> marketIndicesMap, Map<String, CryptoQuote> cryptoQuotesMap) {
        CryptoQuote cryptoQuote;
        MarketIndicatorItemData marketIndicatorItemData;
        Intrinsics.checkNotNullParameter(newsfeedContentIndicators, "newsfeedContentIndicators");
        Intrinsics.checkNotNullParameter(marketIndicesMap, "marketIndicesMap");
        Intrinsics.checkNotNullParameter(cryptoQuotesMap, "cryptoQuotesMap");
        this.newsfeedContentIndicators = newsfeedContentIndicators;
        this.marketIndicesMap = marketIndicesMap;
        this.cryptoQuotesMap = cryptoQuotesMap;
        List<Content.MarketIndicator> list = newsfeedContentIndicators;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Content.MarketIndicator marketIndicator : list) {
            MarketIndicatorItemData defaultMarketIndicatorItemData = MarketIndicatorItemDataConverters.toDefaultMarketIndicatorItemData(marketIndicator);
            String indicatorType = marketIndicator.getIndicatorType();
            if (Intrinsics.areEqual(indicatorType, Content.MarketIndicator.MARKET_INDEX_TYPE)) {
                MarketIndicator marketIndicator2 = this.marketIndicesMap.get(marketIndicator.getIndicatorKey());
                if (marketIndicator2 != null && (marketIndicatorItemData = MarketIndicatorItemDataConverters.toMarketIndicatorItemData(marketIndicator2, marketIndicator.getLabel())) != null) {
                    defaultMarketIndicatorItemData = marketIndicatorItemData;
                }
            } else if (!Intrinsics.areEqual(indicatorType, Content.MarketIndicator.CRYPTO_TYPE) || (cryptoQuote = this.cryptoQuotesMap.get(marketIndicator.getIndicatorKey())) == null || (marketIndicatorItemData = MarketIndicatorItemDataConverters.toMarketIndicatorItemData(cryptoQuote, marketIndicator.getLabel())) == null) {
            }
            arrayList.add(defaultMarketIndicatorItemData);
        }
        this.marketIndicatorItems = arrayList;
    }

    public /* synthetic */ NewsFeedMarketIndicesViewState(List list, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final List<Content.MarketIndicator> getNewsfeedContentIndicators() {
        return this.newsfeedContentIndicators;
    }

    public final Map<String, MarketIndicator> getMarketIndicesMap() {
        return this.marketIndicesMap;
    }

    public final Map<String, CryptoQuote> getCryptoQuotesMap() {
        return this.cryptoQuotesMap;
    }

    public final List<MarketIndicatorItemData> getMarketIndicatorItems() {
        return this.marketIndicatorItems;
    }
}
