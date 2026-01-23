package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoExploreDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;", "", "isSearchVisible", "", "searchOptionItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "categoryResponse", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "initialCategoryIndex", "", "title", "", "query", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;ILjava/lang/String;Ljava/lang/String;)V", "()Z", "getSearchOptionItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getCategoryResponse", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "getInitialCategoryIndex", "()I", "getTitle", "()Ljava/lang/String;", "getQuery", "isSearchLoading", "isSearchEmpty", "isSearchScrollable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoExploreViewState {
    public static final int $stable = 8;
    private final CryptoExploreCategories categoryResponse;
    private final int initialCategoryIndex;
    private final boolean isSearchVisible;
    private final String query;
    private final ImmutableList<CryptoTradingOptions.TradingOptionItem> searchOptionItems;
    private final String title;

    public static /* synthetic */ CryptoExploreViewState copy$default(CryptoExploreViewState cryptoExploreViewState, boolean z, ImmutableList immutableList, CryptoExploreCategories cryptoExploreCategories, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cryptoExploreViewState.isSearchVisible;
        }
        if ((i2 & 2) != 0) {
            immutableList = cryptoExploreViewState.searchOptionItems;
        }
        if ((i2 & 4) != 0) {
            cryptoExploreCategories = cryptoExploreViewState.categoryResponse;
        }
        if ((i2 & 8) != 0) {
            i = cryptoExploreViewState.initialCategoryIndex;
        }
        if ((i2 & 16) != 0) {
            str = cryptoExploreViewState.title;
        }
        if ((i2 & 32) != 0) {
            str2 = cryptoExploreViewState.query;
        }
        String str3 = str;
        String str4 = str2;
        return cryptoExploreViewState.copy(z, immutableList, cryptoExploreCategories, i, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSearchVisible() {
        return this.isSearchVisible;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> component2() {
        return this.searchOptionItems;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoExploreCategories getCategoryResponse() {
        return this.categoryResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInitialCategoryIndex() {
        return this.initialCategoryIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final CryptoExploreViewState copy(boolean isSearchVisible, ImmutableList<CryptoTradingOptions.TradingOptionItem> searchOptionItems, CryptoExploreCategories categoryResponse, int initialCategoryIndex, String title, String query) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(query, "query");
        return new CryptoExploreViewState(isSearchVisible, searchOptionItems, categoryResponse, initialCategoryIndex, title, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoExploreViewState)) {
            return false;
        }
        CryptoExploreViewState cryptoExploreViewState = (CryptoExploreViewState) other;
        return this.isSearchVisible == cryptoExploreViewState.isSearchVisible && Intrinsics.areEqual(this.searchOptionItems, cryptoExploreViewState.searchOptionItems) && Intrinsics.areEqual(this.categoryResponse, cryptoExploreViewState.categoryResponse) && this.initialCategoryIndex == cryptoExploreViewState.initialCategoryIndex && Intrinsics.areEqual(this.title, cryptoExploreViewState.title) && Intrinsics.areEqual(this.query, cryptoExploreViewState.query);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSearchVisible) * 31;
        ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList = this.searchOptionItems;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        CryptoExploreCategories cryptoExploreCategories = this.categoryResponse;
        return ((((((iHashCode2 + (cryptoExploreCategories != null ? cryptoExploreCategories.hashCode() : 0)) * 31) + Integer.hashCode(this.initialCategoryIndex)) * 31) + this.title.hashCode()) * 31) + this.query.hashCode();
    }

    public String toString() {
        return "CryptoExploreViewState(isSearchVisible=" + this.isSearchVisible + ", searchOptionItems=" + this.searchOptionItems + ", categoryResponse=" + this.categoryResponse + ", initialCategoryIndex=" + this.initialCategoryIndex + ", title=" + this.title + ", query=" + this.query + ")";
    }

    public CryptoExploreViewState(boolean z, ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList, CryptoExploreCategories cryptoExploreCategories, int i, String title, String query) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(query, "query");
        this.isSearchVisible = z;
        this.searchOptionItems = immutableList;
        this.categoryResponse = cryptoExploreCategories;
        this.initialCategoryIndex = i;
        this.title = title;
        this.query = query;
    }

    public final boolean isSearchVisible() {
        return this.isSearchVisible;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> getSearchOptionItems() {
        return this.searchOptionItems;
    }

    public final CryptoExploreCategories getCategoryResponse() {
        return this.categoryResponse;
    }

    public final int getInitialCategoryIndex() {
        return this.initialCategoryIndex;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean isSearchLoading() {
        return this.isSearchVisible && this.searchOptionItems == null;
    }

    public final boolean isSearchEmpty() {
        if (this.isSearchVisible) {
            ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList = this.searchOptionItems;
            if (immutableList != null ? immutableList.isEmpty() : false) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSearchScrollable() {
        return !isSearchEmpty();
    }
}
