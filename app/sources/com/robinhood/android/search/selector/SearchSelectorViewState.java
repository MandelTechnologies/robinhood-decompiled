package com.robinhood.android.search.selector;

import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SearchSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010)\u001a\u0004\u0018\u00010\u001a*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u000e\u0010*\u001a\u00020\u001a*\u0004\u0018\u00010\u000bH\u0002J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u00100\u001a\u00020\u0003HÂ\u0003JS\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u001eHÖ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorViewState;", "", "isLoading", "", "assetChipsSearchItems", "", "Lcom/robinhood/android/search/selector/SearchItem;", "searchResultItems", "searchText", "", "launchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "isInEtfRegionGate", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;Z)V", "()Z", "getAssetChipsSearchItems", "()Ljava/util/List;", "getSearchResultItems", "getSearchText", "()Ljava/lang/String;", "isSearchTextEmpty", "shouldShowAssetChipsSection", "getShouldShowAssetChipsSection", "hasCopilotCryptoChips", "assetChipsSectionTitle", "Lcom/robinhood/utils/resource/StringResource;", "getAssetChipsSectionTitle", "()Lcom/robinhood/utils/resource/StringResource;", "assetChipsRowCount", "", "getAssetChipsRowCount", "()I", "nullStateDescriptionText", "getNullStateDescriptionText", "searchHintText", "getSearchHintText", "disclosureText", "Lcom/robinhood/android/search/selector/DisclosureText;", "getDisclosureText", "()Lcom/robinhood/android/search/selector/DisclosureText;", "additionalDescriptionTextRes", "additionalHintTextRes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SearchSelectorViewState {
    private final int assetChipsRowCount;
    private final List<SearchSelectorViewState3> assetChipsSearchItems;
    private final boolean hasCopilotCryptoChips;
    private final boolean isInEtfRegionGate;
    private final boolean isLoading;
    private final boolean isSearchTextEmpty;
    private final SearchSelectorLaunchMode launchMode;
    private final List<SearchSelectorViewState3> searchResultItems;
    private final String searchText;
    private final boolean shouldShowAssetChipsSection;

    public SearchSelectorViewState() {
        this(false, null, null, null, null, false, 63, null);
    }

    /* renamed from: component5, reason: from getter */
    private final SearchSelectorLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getIsInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    public static /* synthetic */ SearchSelectorViewState copy$default(SearchSelectorViewState searchSelectorViewState, boolean z, List list, List list2, String str, SearchSelectorLaunchMode searchSelectorLaunchMode, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchSelectorViewState.isLoading;
        }
        if ((i & 2) != 0) {
            list = searchSelectorViewState.assetChipsSearchItems;
        }
        if ((i & 4) != 0) {
            list2 = searchSelectorViewState.searchResultItems;
        }
        if ((i & 8) != 0) {
            str = searchSelectorViewState.searchText;
        }
        if ((i & 16) != 0) {
            searchSelectorLaunchMode = searchSelectorViewState.launchMode;
        }
        if ((i & 32) != 0) {
            z2 = searchSelectorViewState.isInEtfRegionGate;
        }
        SearchSelectorLaunchMode searchSelectorLaunchMode2 = searchSelectorLaunchMode;
        boolean z3 = z2;
        return searchSelectorViewState.copy(z, list, list2, str, searchSelectorLaunchMode2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<SearchSelectorViewState3> component2() {
        return this.assetChipsSearchItems;
    }

    public final List<SearchSelectorViewState3> component3() {
        return this.searchResultItems;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    public final SearchSelectorViewState copy(boolean isLoading, List<? extends SearchSelectorViewState3> assetChipsSearchItems, List<? extends SearchSelectorViewState3> searchResultItems, String searchText, SearchSelectorLaunchMode launchMode, boolean isInEtfRegionGate) {
        Intrinsics.checkNotNullParameter(assetChipsSearchItems, "assetChipsSearchItems");
        Intrinsics.checkNotNullParameter(searchResultItems, "searchResultItems");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new SearchSelectorViewState(isLoading, assetChipsSearchItems, searchResultItems, searchText, launchMode, isInEtfRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchSelectorViewState)) {
            return false;
        }
        SearchSelectorViewState searchSelectorViewState = (SearchSelectorViewState) other;
        return this.isLoading == searchSelectorViewState.isLoading && Intrinsics.areEqual(this.assetChipsSearchItems, searchSelectorViewState.assetChipsSearchItems) && Intrinsics.areEqual(this.searchResultItems, searchSelectorViewState.searchResultItems) && Intrinsics.areEqual(this.searchText, searchSelectorViewState.searchText) && Intrinsics.areEqual(this.launchMode, searchSelectorViewState.launchMode) && this.isInEtfRegionGate == searchSelectorViewState.isInEtfRegionGate;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isLoading) * 31) + this.assetChipsSearchItems.hashCode()) * 31) + this.searchResultItems.hashCode()) * 31) + this.searchText.hashCode()) * 31;
        SearchSelectorLaunchMode searchSelectorLaunchMode = this.launchMode;
        return ((iHashCode + (searchSelectorLaunchMode == null ? 0 : searchSelectorLaunchMode.hashCode())) * 31) + Boolean.hashCode(this.isInEtfRegionGate);
    }

    public String toString() {
        return "SearchSelectorViewState(isLoading=" + this.isLoading + ", assetChipsSearchItems=" + this.assetChipsSearchItems + ", searchResultItems=" + this.searchResultItems + ", searchText=" + this.searchText + ", launchMode=" + this.launchMode + ", isInEtfRegionGate=" + this.isInEtfRegionGate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSelectorViewState(boolean z, List<? extends SearchSelectorViewState3> assetChipsSearchItems, List<? extends SearchSelectorViewState3> searchResultItems, String searchText, SearchSelectorLaunchMode searchSelectorLaunchMode, boolean z2) {
        Intrinsics.checkNotNullParameter(assetChipsSearchItems, "assetChipsSearchItems");
        Intrinsics.checkNotNullParameter(searchResultItems, "searchResultItems");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.isLoading = z;
        this.assetChipsSearchItems = assetChipsSearchItems;
        this.searchResultItems = searchResultItems;
        this.searchText = searchText;
        this.launchMode = searchSelectorLaunchMode;
        this.isInEtfRegionGate = z2;
        boolean z3 = false;
        boolean z4 = searchText.length() == 0;
        this.isSearchTextEmpty = z4;
        this.shouldShowAssetChipsSection = z4 && !assetChipsSearchItems.isEmpty();
        List<? extends SearchSelectorViewState3> list = assetChipsSearchItems;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SearchSelectorViewState3 searchSelectorViewState3 = (SearchSelectorViewState3) it.next();
                SearchSelectorViewState3.SecurityRow.CopilotResultItem copilotResultItem = searchSelectorViewState3 instanceof SearchSelectorViewState3.SecurityRow.CopilotResultItem ? (SearchSelectorViewState3.SecurityRow.CopilotResultItem) searchSelectorViewState3 : null;
                if ((copilotResultItem != null ? copilotResultItem.getType() : null) == AssetType3.CRYPTO) {
                    z3 = true;
                    break;
                }
            }
        }
        this.hasCopilotCryptoChips = z3;
        this.assetChipsRowCount = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((this.assetChipsSearchItems.size() + 3) / 4, 1), 3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SearchSelectorViewState(boolean z, List list, List list2, String str, SearchSelectorLaunchMode searchSelectorLaunchMode, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : searchSelectorLaunchMode, (i & 32) != 0 ? false : z2);
    }

    public final List<SearchSelectorViewState3> getAssetChipsSearchItems() {
        return this.assetChipsSearchItems;
    }

    public final List<SearchSelectorViewState3> getSearchResultItems() {
        return this.searchResultItems;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: isSearchTextEmpty, reason: from getter */
    public final boolean getIsSearchTextEmpty() {
        return this.isSearchTextEmpty;
    }

    public final boolean getShouldShowAssetChipsSection() {
        return this.shouldShowAssetChipsSection;
    }

    public final StringResource getAssetChipsSectionTitle() {
        int i;
        if (!this.shouldShowAssetChipsSection) {
            return null;
        }
        SearchSelectorLaunchMode searchSelectorLaunchMode = this.launchMode;
        if ((searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options) && ((SearchSelectorLaunchMode.Options) searchSelectorLaunchMode).getUseOptionHoldings()) {
            return null;
        }
        SearchSelectorLaunchMode searchSelectorLaunchMode2 = this.launchMode;
        if (!(searchSelectorLaunchMode2 instanceof SearchSelectorLaunchMode.Copilot)) {
            return searchSelectorLaunchMode2 instanceof SearchSelectorLaunchMode.Ladder ? StringResource.INSTANCE.invoke(C28142R.string.ladder_asset_section_title, new Object[0]) : StringResource.INSTANCE.invoke(C28142R.string.search_stocks_owned_title, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.hasCopilotCryptoChips) {
            i = C28142R.string.search_popular_assets_title;
        } else {
            i = C28142R.string.search_popular_stocks_title;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final int getAssetChipsRowCount() {
        return this.assetChipsRowCount;
    }

    public final StringResource getNullStateDescriptionText() {
        SearchSelectorLaunchMode searchSelectorLaunchMode = this.launchMode;
        if (searchSelectorLaunchMode != null) {
            return additionalDescriptionTextRes(searchSelectorLaunchMode, this.isInEtfRegionGate);
        }
        return null;
    }

    public final StringResource getSearchHintText() {
        SearchSelectorLaunchMode searchSelectorLaunchMode = this.launchMode;
        if (searchSelectorLaunchMode != null) {
            return additionalHintTextRes(searchSelectorLaunchMode);
        }
        return null;
    }

    public final DisclosureText getDisclosureText() {
        int i;
        int i2;
        StringResource stringResourceInvoke;
        if (!(this.launchMode instanceof SearchSelectorLaunchMode.Copilot) || this.searchText.length() != 0) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.hasCopilotCryptoChips) {
            i = C28142R.string.gated_crypto_rhc_copilot_search_disclosure;
        } else {
            i = C28142R.string.copilot_search_disclosure;
        }
        StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
        if (this.hasCopilotCryptoChips) {
            i2 = C28142R.string.search_popular_assets_title;
        } else {
            i2 = C28142R.string.search_popular_stocks_title;
        }
        StringResource stringResourceInvoke3 = companion.invoke(i2, new Object[0]);
        if (this.hasCopilotCryptoChips) {
            stringResourceInvoke = companion.invoke(C28142R.string.gated_crypto_search_copilot_disclosure_sheet_message, new Object[0]);
        } else {
            stringResourceInvoke = companion.invoke(new StringResource.PluralsResource(C28142R.plurals.search_copilot_disclosure_sheet_message, this.assetChipsSearchItems.size()), Integer.valueOf(this.assetChipsSearchItems.size()));
        }
        return new DisclosureText(stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke, "cortex-search-disclosure");
    }

    private final StringResource additionalDescriptionTextRes(SearchSelectorLaunchMode searchSelectorLaunchMode, boolean z) {
        int i;
        int i2;
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.Watchlist) {
            return StringResource.INSTANCE.invoke(C28142R.string.gated_options_watchlist_double_tap_education_description, new Object[0]);
        }
        if ((searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.AdvancedChart) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.BwAdvanceChart)) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (z) {
                i = C28142R.string.gated_etf_advanced_chart_education_description;
            } else {
                i = C28142R.string.advanced_chart_education_description_without_etf;
            }
            return companion.invoke(i, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.SimulatedReturnPreTradeOnboarding) {
            return StringResource.INSTANCE.invoke(C28142R.string.f4929xd0f01ba9, new Object[0]);
        }
        if ((searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.Deeplink) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.AssetHome) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.SideBySideChainOnboarding) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.StrategyBuilder) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Ladder)) {
            return null;
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Copilot) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            if (this.hasCopilotCryptoChips) {
                i2 = C28142R.string.gated_crypto_copilot_search_description;
            } else {
                i2 = C28142R.string.copilot_search_description;
            }
            return companion2.invoke(i2, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.TradingTrends) {
            return StringResource.INSTANCE.invoke(C28142R.string.trading_trends_onboarding, new Object[0]);
        }
        if (!(searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.CompanyFinancials)) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C28142R.string.company_financials_search_description, new Object[0]);
    }

    private final StringResource additionalHintTextRes(SearchSelectorLaunchMode searchSelectorLaunchMode) {
        int i;
        int i2;
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.TradingTrends) {
            return StringResource.INSTANCE.invoke(C28142R.string.trading_trends_search_hint, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.CompanyFinancials) {
            return StringResource.INSTANCE.invoke(C28142R.string.company_financials_search_hint, new Object[0]);
        }
        if ((searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.SimulatedReturnPreTradeOnboarding) || (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.SideBySideChainOnboarding)) {
            return StringResource.INSTANCE.invoke(C28142R.string.gated_options_sbs_onboarding_search_hint, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Copilot) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.hasCopilotCryptoChips) {
                i2 = C28142R.string.gated_crypto_search_hint_copilot;
            } else {
                i2 = C28142R.string.search_hint_copilot;
            }
            return companion.invoke(i2, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.Watchlist) {
            if (((SearchSelectorLaunchMode.Options.Watchlist) searchSelectorLaunchMode).getPostOptionsOnboardingExperiment()) {
                return StringResource.INSTANCE.invoke(C28142R.string.search_hint_onboarding_upsell_experiment, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C28142R.string.search_hint, new Object[0]);
        }
        if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Ladder) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            if (this.isInEtfRegionGate) {
                i = C28142R.string.gated_etf_ladder_education_description;
            } else {
                i = C28142R.string.ladder_education_description_without_etf;
            }
            return companion2.invoke(i, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C28142R.string.search_hint, new Object[0]);
    }
}
