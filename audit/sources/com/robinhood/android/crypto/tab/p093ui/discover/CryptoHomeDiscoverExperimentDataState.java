package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.contracts.CryptoExploreFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoHomeDiscoverExperimentDataState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J?\u00107\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u00108\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000bHÖ\u0001J\t\u0010;\u001a\u00020\u001aHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0%8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b.\u0010'R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDataState;", "", "categoryToOptionsResponse", "", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "response", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "onlyShowPreviewItems", "", "selectedCategoryIndex", "", "<init>", "(Ljava/util/Map;Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;ZI)V", "getCategoryToOptionsResponse", "()Ljava/util/Map;", "getResponse", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "getOnlyShowPreviewItems", "()Z", "getSelectedCategoryIndex", "()I", "selectedCategory", "getSelectedCategory", "()Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "selectedCategoryServerName", "", "getSelectedCategoryServerName", "()Ljava/lang/String;", "isLoading", "sheetDto", "Lrh_server_driven_ui/v1/AlertDto;", "getSheetDto", "()Lrh_server_driven_ui/v1/AlertDto;", "title", "getTitle", "categoryNames", "Lkotlinx/collections/immutable/PersistentList;", "getCategoryNames", "()Lkotlinx/collections/immutable/PersistentList;", "categoryServerNames", "getCategoryServerNames", "previewItemsCount", "getPreviewItemsCount", "tradingOptionsItems", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "getTradingOptionsItems", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeDiscoverExperimentDataState {
    public static final int $stable = 8;
    private final Map<CryptoTradingOptionsCategory, CryptoTradingOptions> categoryToOptionsResponse;
    private final boolean onlyShowPreviewItems;
    private final CryptoExploreCategories response;
    private final int selectedCategoryIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeDiscoverExperimentDataState copy$default(CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState, Map map, CryptoExploreCategories cryptoExploreCategories, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = cryptoHomeDiscoverExperimentDataState.categoryToOptionsResponse;
        }
        if ((i2 & 2) != 0) {
            cryptoExploreCategories = cryptoHomeDiscoverExperimentDataState.response;
        }
        if ((i2 & 4) != 0) {
            z = cryptoHomeDiscoverExperimentDataState.onlyShowPreviewItems;
        }
        if ((i2 & 8) != 0) {
            i = cryptoHomeDiscoverExperimentDataState.selectedCategoryIndex;
        }
        return cryptoHomeDiscoverExperimentDataState.copy(map, cryptoExploreCategories, z, i);
    }

    public final Map<CryptoTradingOptionsCategory, CryptoTradingOptions> component1() {
        return this.categoryToOptionsResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoExploreCategories getResponse() {
        return this.response;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOnlyShowPreviewItems() {
        return this.onlyShowPreviewItems;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final CryptoHomeDiscoverExperimentDataState copy(Map<CryptoTradingOptionsCategory, CryptoTradingOptions> categoryToOptionsResponse, CryptoExploreCategories response, boolean onlyShowPreviewItems, int selectedCategoryIndex) {
        Intrinsics.checkNotNullParameter(categoryToOptionsResponse, "categoryToOptionsResponse");
        return new CryptoHomeDiscoverExperimentDataState(categoryToOptionsResponse, response, onlyShowPreviewItems, selectedCategoryIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeDiscoverExperimentDataState)) {
            return false;
        }
        CryptoHomeDiscoverExperimentDataState cryptoHomeDiscoverExperimentDataState = (CryptoHomeDiscoverExperimentDataState) other;
        return Intrinsics.areEqual(this.categoryToOptionsResponse, cryptoHomeDiscoverExperimentDataState.categoryToOptionsResponse) && Intrinsics.areEqual(this.response, cryptoHomeDiscoverExperimentDataState.response) && this.onlyShowPreviewItems == cryptoHomeDiscoverExperimentDataState.onlyShowPreviewItems && this.selectedCategoryIndex == cryptoHomeDiscoverExperimentDataState.selectedCategoryIndex;
    }

    public int hashCode() {
        int iHashCode = this.categoryToOptionsResponse.hashCode() * 31;
        CryptoExploreCategories cryptoExploreCategories = this.response;
        return ((((iHashCode + (cryptoExploreCategories == null ? 0 : cryptoExploreCategories.hashCode())) * 31) + Boolean.hashCode(this.onlyShowPreviewItems)) * 31) + Integer.hashCode(this.selectedCategoryIndex);
    }

    public String toString() {
        return "CryptoHomeDiscoverExperimentDataState(categoryToOptionsResponse=" + this.categoryToOptionsResponse + ", response=" + this.response + ", onlyShowPreviewItems=" + this.onlyShowPreviewItems + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ")";
    }

    public CryptoHomeDiscoverExperimentDataState(Map<CryptoTradingOptionsCategory, CryptoTradingOptions> categoryToOptionsResponse, CryptoExploreCategories cryptoExploreCategories, boolean z, int i) {
        Intrinsics.checkNotNullParameter(categoryToOptionsResponse, "categoryToOptionsResponse");
        this.categoryToOptionsResponse = categoryToOptionsResponse;
        this.response = cryptoExploreCategories;
        this.onlyShowPreviewItems = z;
        this.selectedCategoryIndex = i;
    }

    public /* synthetic */ CryptoHomeDiscoverExperimentDataState(Map map, CryptoExploreCategories cryptoExploreCategories, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MapsKt.emptyMap() : map, (i2 & 2) != 0 ? null : cryptoExploreCategories, (i2 & 4) != 0 ? false : z, i);
    }

    public final Map<CryptoTradingOptionsCategory, CryptoTradingOptions> getCategoryToOptionsResponse() {
        return this.categoryToOptionsResponse;
    }

    public final CryptoExploreCategories getResponse() {
        return this.response;
    }

    public final boolean getOnlyShowPreviewItems() {
        return this.onlyShowPreviewItems;
    }

    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    private final CryptoTradingOptionsCategory getSelectedCategory() {
        ImmutableList<CryptoTradingOptionsCategory> categories;
        CryptoExploreCategories cryptoExploreCategories = this.response;
        if (cryptoExploreCategories == null || (categories = cryptoExploreCategories.getCategories()) == null) {
            return null;
        }
        return (CryptoTradingOptionsCategory) CollectionsKt.getOrNull(categories, this.selectedCategoryIndex);
    }

    public final String getSelectedCategoryServerName() {
        String serverName;
        CryptoTradingOptionsCategory selectedCategory = getSelectedCategory();
        return (selectedCategory == null || (serverName = selectedCategory.getServerName()) == null) ? "" : serverName;
    }

    public final boolean isLoading() {
        return this.response == null;
    }

    public final AlertDto getSheetDto() {
        CryptoExploreCategories cryptoExploreCategories = this.response;
        if (cryptoExploreCategories != null) {
            return cryptoExploreCategories.getInfoSheet();
        }
        return null;
    }

    public final String getTitle() {
        CryptoExploreCategories cryptoExploreCategories = this.response;
        String title = cryptoExploreCategories != null ? cryptoExploreCategories.getTitle() : null;
        return title == null ? "" : title;
    }

    public final ImmutableList3<String> getCategoryNames() {
        List listEmptyList;
        ImmutableList<CryptoTradingOptionsCategory> categories;
        CryptoExploreCategories cryptoExploreCategories = this.response;
        if (cryptoExploreCategories == null || (categories = cryptoExploreCategories.getCategories()) == null) {
            listEmptyList = null;
        } else {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
            Iterator<CryptoTradingOptionsCategory> it = categories.iterator();
            while (it.hasNext()) {
                listEmptyList.add(it.next().getDisplayName());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return extensions2.toPersistentList(listEmptyList);
    }

    public final ImmutableList3<String> getCategoryServerNames() {
        List listEmptyList;
        ImmutableList<CryptoTradingOptionsCategory> categories;
        CryptoExploreCategories cryptoExploreCategories = this.response;
        if (cryptoExploreCategories == null || (categories = cryptoExploreCategories.getCategories()) == null) {
            listEmptyList = null;
        } else {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
            Iterator<CryptoTradingOptionsCategory> it = categories.iterator();
            while (it.hasNext()) {
                listEmptyList.add(it.next().getServerName());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return extensions2.toPersistentList(listEmptyList);
    }

    public final int getPreviewItemsCount() {
        CryptoExploreCategories cryptoExploreCategories;
        if (this.onlyShowPreviewItems && (cryptoExploreCategories = this.response) != null) {
            return cryptoExploreCategories.getPreviewCount();
        }
        return Integer.MAX_VALUE;
    }

    public final ImmutableList3<CryptoTradingOptions.TradingOptionItem> getTradingOptionsItems() {
        CryptoTradingOptions cryptoTradingOptions;
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results;
        List listTake;
        CryptoTradingOptionsCategory selectedCategory = getSelectedCategory();
        if (selectedCategory == null || (cryptoTradingOptions = this.categoryToOptionsResponse.get(selectedCategory)) == null || (results = cryptoTradingOptions.getResults()) == null || (listTake = CollectionsKt.take(results, getPreviewItemsCount())) == null) {
            return null;
        }
        return extensions2.toPersistentList(listTake);
    }

    public final FragmentKey getFragmentKey() {
        return new CryptoExploreFragmentKey(this.response, this.selectedCategoryIndex, getTitle());
    }
}
