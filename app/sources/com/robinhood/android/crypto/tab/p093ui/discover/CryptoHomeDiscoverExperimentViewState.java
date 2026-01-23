package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoHomeDiscoverExperimentViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\nHÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentViewState;", "", "categoryServerNames", "Lkotlinx/collections/immutable/ImmutableList;", "", "categoryNames", "sheetDto", "Lrh_server_driven_ui/v1/AlertDto;", "title", "selectedCategoryIndex", "", "selectedCategoryServerName", "tradingOptionsItems", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "isLoading", "", "onlyShowPreviewItems", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lrh_server_driven_ui/v1/AlertDto;Ljava/lang/String;ILjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/android/navigation/keys/FragmentKey;)V", "getCategoryServerNames", "()Lkotlinx/collections/immutable/ImmutableList;", "getCategoryNames", "getSheetDto", "()Lrh_server_driven_ui/v1/AlertDto;", "getTitle", "()Ljava/lang/String;", "getSelectedCategoryIndex", "()I", "getSelectedCategoryServerName", "getTradingOptionsItems", "()Z", "getOnlyShowPreviewItems", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeDiscoverExperimentViewState {
    public static final int $stable = 8;
    private final ImmutableList<String> categoryNames;
    private final ImmutableList<String> categoryServerNames;
    private final FragmentKey fragmentKey;
    private final boolean isLoading;
    private final boolean onlyShowPreviewItems;
    private final int selectedCategoryIndex;
    private final String selectedCategoryServerName;
    private final AlertDto sheetDto;
    private final String title;
    private final ImmutableList<CryptoTradingOptions.TradingOptionItem> tradingOptionsItems;

    public static /* synthetic */ CryptoHomeDiscoverExperimentViewState copy$default(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, ImmutableList immutableList, ImmutableList immutableList2, AlertDto alertDto, String str, int i, String str2, ImmutableList immutableList3, boolean z, boolean z2, FragmentKey fragmentKey, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = cryptoHomeDiscoverExperimentViewState.categoryServerNames;
        }
        if ((i2 & 2) != 0) {
            immutableList2 = cryptoHomeDiscoverExperimentViewState.categoryNames;
        }
        if ((i2 & 4) != 0) {
            alertDto = cryptoHomeDiscoverExperimentViewState.sheetDto;
        }
        if ((i2 & 8) != 0) {
            str = cryptoHomeDiscoverExperimentViewState.title;
        }
        if ((i2 & 16) != 0) {
            i = cryptoHomeDiscoverExperimentViewState.selectedCategoryIndex;
        }
        if ((i2 & 32) != 0) {
            str2 = cryptoHomeDiscoverExperimentViewState.selectedCategoryServerName;
        }
        if ((i2 & 64) != 0) {
            immutableList3 = cryptoHomeDiscoverExperimentViewState.tradingOptionsItems;
        }
        if ((i2 & 128) != 0) {
            z = cryptoHomeDiscoverExperimentViewState.isLoading;
        }
        if ((i2 & 256) != 0) {
            z2 = cryptoHomeDiscoverExperimentViewState.onlyShowPreviewItems;
        }
        if ((i2 & 512) != 0) {
            fragmentKey = cryptoHomeDiscoverExperimentViewState.fragmentKey;
        }
        boolean z3 = z2;
        FragmentKey fragmentKey2 = fragmentKey;
        ImmutableList immutableList4 = immutableList3;
        boolean z4 = z;
        int i3 = i;
        String str3 = str2;
        return cryptoHomeDiscoverExperimentViewState.copy(immutableList, immutableList2, alertDto, str, i3, str3, immutableList4, z4, z3, fragmentKey2);
    }

    public final ImmutableList<String> component1() {
        return this.categoryServerNames;
    }

    /* renamed from: component10, reason: from getter */
    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    public final ImmutableList<String> component2() {
        return this.categoryNames;
    }

    /* renamed from: component3, reason: from getter */
    public final AlertDto getSheetDto() {
        return this.sheetDto;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSelectedCategoryServerName() {
        return this.selectedCategoryServerName;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> component7() {
        return this.tradingOptionsItems;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getOnlyShowPreviewItems() {
        return this.onlyShowPreviewItems;
    }

    public final CryptoHomeDiscoverExperimentViewState copy(ImmutableList<String> categoryServerNames, ImmutableList<String> categoryNames, AlertDto sheetDto, String title, int selectedCategoryIndex, String selectedCategoryServerName, ImmutableList<CryptoTradingOptions.TradingOptionItem> tradingOptionsItems, boolean isLoading, boolean onlyShowPreviewItems, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(categoryServerNames, "categoryServerNames");
        Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedCategoryServerName, "selectedCategoryServerName");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        return new CryptoHomeDiscoverExperimentViewState(categoryServerNames, categoryNames, sheetDto, title, selectedCategoryIndex, selectedCategoryServerName, tradingOptionsItems, isLoading, onlyShowPreviewItems, fragmentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeDiscoverExperimentViewState)) {
            return false;
        }
        CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = (CryptoHomeDiscoverExperimentViewState) other;
        return Intrinsics.areEqual(this.categoryServerNames, cryptoHomeDiscoverExperimentViewState.categoryServerNames) && Intrinsics.areEqual(this.categoryNames, cryptoHomeDiscoverExperimentViewState.categoryNames) && Intrinsics.areEqual(this.sheetDto, cryptoHomeDiscoverExperimentViewState.sheetDto) && Intrinsics.areEqual(this.title, cryptoHomeDiscoverExperimentViewState.title) && this.selectedCategoryIndex == cryptoHomeDiscoverExperimentViewState.selectedCategoryIndex && Intrinsics.areEqual(this.selectedCategoryServerName, cryptoHomeDiscoverExperimentViewState.selectedCategoryServerName) && Intrinsics.areEqual(this.tradingOptionsItems, cryptoHomeDiscoverExperimentViewState.tradingOptionsItems) && this.isLoading == cryptoHomeDiscoverExperimentViewState.isLoading && this.onlyShowPreviewItems == cryptoHomeDiscoverExperimentViewState.onlyShowPreviewItems && Intrinsics.areEqual(this.fragmentKey, cryptoHomeDiscoverExperimentViewState.fragmentKey);
    }

    public int hashCode() {
        int iHashCode = ((this.categoryServerNames.hashCode() * 31) + this.categoryNames.hashCode()) * 31;
        AlertDto alertDto = this.sheetDto;
        int iHashCode2 = (((((((iHashCode + (alertDto == null ? 0 : alertDto.hashCode())) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.selectedCategoryIndex)) * 31) + this.selectedCategoryServerName.hashCode()) * 31;
        ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList = this.tradingOptionsItems;
        return ((((((iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.onlyShowPreviewItems)) * 31) + this.fragmentKey.hashCode();
    }

    public String toString() {
        return "CryptoHomeDiscoverExperimentViewState(categoryServerNames=" + this.categoryServerNames + ", categoryNames=" + this.categoryNames + ", sheetDto=" + this.sheetDto + ", title=" + this.title + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ", selectedCategoryServerName=" + this.selectedCategoryServerName + ", tradingOptionsItems=" + this.tradingOptionsItems + ", isLoading=" + this.isLoading + ", onlyShowPreviewItems=" + this.onlyShowPreviewItems + ", fragmentKey=" + this.fragmentKey + ")";
    }

    public CryptoHomeDiscoverExperimentViewState(ImmutableList<String> categoryServerNames, ImmutableList<String> categoryNames, AlertDto alertDto, String title, int i, String selectedCategoryServerName, ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList, boolean z, boolean z2, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(categoryServerNames, "categoryServerNames");
        Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedCategoryServerName, "selectedCategoryServerName");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        this.categoryServerNames = categoryServerNames;
        this.categoryNames = categoryNames;
        this.sheetDto = alertDto;
        this.title = title;
        this.selectedCategoryIndex = i;
        this.selectedCategoryServerName = selectedCategoryServerName;
        this.tradingOptionsItems = immutableList;
        this.isLoading = z;
        this.onlyShowPreviewItems = z2;
        this.fragmentKey = fragmentKey;
    }

    public /* synthetic */ CryptoHomeDiscoverExperimentViewState(ImmutableList immutableList, ImmutableList immutableList2, AlertDto alertDto, String str, int i, String str2, ImmutableList immutableList3, boolean z, boolean z2, FragmentKey fragmentKey, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, immutableList2, (i2 & 4) != 0 ? null : alertDto, str, i, str2, immutableList3, z, z2, fragmentKey);
    }

    public final ImmutableList<String> getCategoryServerNames() {
        return this.categoryServerNames;
    }

    public final ImmutableList<String> getCategoryNames() {
        return this.categoryNames;
    }

    public final AlertDto getSheetDto() {
        return this.sheetDto;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final String getSelectedCategoryServerName() {
        return this.selectedCategoryServerName;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> getTradingOptionsItems() {
        return this.tradingOptionsItems;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getOnlyShowPreviewItems() {
        return this.onlyShowPreviewItems;
    }

    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }
}
