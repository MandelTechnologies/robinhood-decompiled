package com.robinhood.android.acatsin.asset;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInReviewAssetsViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JK\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsViewState;", "", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "equityAssets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "optionAssets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "assetFilterType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "showTitle", "", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;Z)V", "getCashAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "getEquityAssets", "()Ljava/util/List;", "getOptionAssets", "getAssetFilterType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "getShowTitle", "()Z", "cashDisplayItems", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "getCashDisplayItems", "equityDisplayItems", "getEquityDisplayItems", "optionDisplayItems", "getOptionDisplayItems", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "getAssets", "displayList", "getDisplayList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInReviewAssetsViewState {
    public static final int $stable = 8;
    private final ApiAcatsTransfer.Asset.AssetType assetFilterType;
    private final List<UiAcatsAsset> assets;
    private final UiAcatsAsset.CashAsset cashAsset;
    private final List<UiAcatsAsset.EquityAsset> equityAssets;
    private final List<UiAcatsAsset.OptionAsset> optionAssets;
    private final boolean showTitle;

    /* compiled from: AcatsInReviewAssetsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.Asset.AssetType.values().length];
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AcatsInReviewAssetsViewState() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ AcatsInReviewAssetsViewState copy$default(AcatsInReviewAssetsViewState acatsInReviewAssetsViewState, UiAcatsAsset.CashAsset cashAsset, List list, List list2, ApiAcatsTransfer.Asset.AssetType assetType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cashAsset = acatsInReviewAssetsViewState.cashAsset;
        }
        if ((i & 2) != 0) {
            list = acatsInReviewAssetsViewState.equityAssets;
        }
        if ((i & 4) != 0) {
            list2 = acatsInReviewAssetsViewState.optionAssets;
        }
        if ((i & 8) != 0) {
            assetType = acatsInReviewAssetsViewState.assetFilterType;
        }
        if ((i & 16) != 0) {
            z = acatsInReviewAssetsViewState.showTitle;
        }
        boolean z2 = z;
        List list3 = list2;
        return acatsInReviewAssetsViewState.copy(cashAsset, list, list3, assetType, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    public final List<UiAcatsAsset.EquityAsset> component2() {
        return this.equityAssets;
    }

    public final List<UiAcatsAsset.OptionAsset> component3() {
        return this.optionAssets;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final AcatsInReviewAssetsViewState copy(UiAcatsAsset.CashAsset cashAsset, List<UiAcatsAsset.EquityAsset> equityAssets, List<UiAcatsAsset.OptionAsset> optionAssets, ApiAcatsTransfer.Asset.AssetType assetFilterType, boolean showTitle) {
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        return new AcatsInReviewAssetsViewState(cashAsset, equityAssets, optionAssets, assetFilterType, showTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInReviewAssetsViewState)) {
            return false;
        }
        AcatsInReviewAssetsViewState acatsInReviewAssetsViewState = (AcatsInReviewAssetsViewState) other;
        return Intrinsics.areEqual(this.cashAsset, acatsInReviewAssetsViewState.cashAsset) && Intrinsics.areEqual(this.equityAssets, acatsInReviewAssetsViewState.equityAssets) && Intrinsics.areEqual(this.optionAssets, acatsInReviewAssetsViewState.optionAssets) && this.assetFilterType == acatsInReviewAssetsViewState.assetFilterType && this.showTitle == acatsInReviewAssetsViewState.showTitle;
    }

    public int hashCode() {
        UiAcatsAsset.CashAsset cashAsset = this.cashAsset;
        int iHashCode = (((((cashAsset == null ? 0 : cashAsset.hashCode()) * 31) + this.equityAssets.hashCode()) * 31) + this.optionAssets.hashCode()) * 31;
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        return ((iHashCode + (assetType != null ? assetType.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTitle);
    }

    public String toString() {
        return "AcatsInReviewAssetsViewState(cashAsset=" + this.cashAsset + ", equityAssets=" + this.equityAssets + ", optionAssets=" + this.optionAssets + ", assetFilterType=" + this.assetFilterType + ", showTitle=" + this.showTitle + ")";
    }

    public AcatsInReviewAssetsViewState(UiAcatsAsset.CashAsset cashAsset, List<UiAcatsAsset.EquityAsset> equityAssets, List<UiAcatsAsset.OptionAsset> optionAssets, ApiAcatsTransfer.Asset.AssetType assetType, boolean z) {
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        this.cashAsset = cashAsset;
        this.equityAssets = equityAssets;
        this.optionAssets = optionAssets;
        this.assetFilterType = assetType;
        this.showTitle = z;
        this.assets = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(cashAsset), (Iterable) equityAssets), (Iterable) optionAssets);
    }

    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    public /* synthetic */ AcatsInReviewAssetsViewState(UiAcatsAsset.CashAsset cashAsset, List list, List list2, ApiAcatsTransfer.Asset.AssetType assetType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cashAsset, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? null : assetType, (i & 16) != 0 ? false : z);
    }

    public final List<UiAcatsAsset.EquityAsset> getEquityAssets() {
        return this.equityAssets;
    }

    public final List<UiAcatsAsset.OptionAsset> getOptionAssets() {
        return this.optionAssets;
    }

    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    private final List<BuildPartialItem> getCashDisplayItems() {
        if (this.cashAsset == null) {
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf((Object[]) new BuildPartialItem[]{new BuildPartialItem.Header(C7686R.string.acats_in_build_partial_cash_and_margin_header), new BuildPartialItem.Asset(this.cashAsset)});
    }

    private final List<BuildPartialItem> getEquityDisplayItems() {
        if (this.equityAssets.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf(new BuildPartialItem.Header(C7686R.string.acats_in_build_partial_equity_header));
        List<UiAcatsAsset.EquityAsset> list = this.equityAssets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BuildPartialItem.Asset((UiAcatsAsset.EquityAsset) it.next()));
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    private final List<BuildPartialItem> getOptionDisplayItems() {
        if (this.optionAssets.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf(new BuildPartialItem.Header(C7686R.string.acats_in_build_partial_options_header));
        List<UiAcatsAsset.OptionAsset> list = this.optionAssets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BuildPartialItem.Asset((UiAcatsAsset.OptionAsset) it.next()));
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final List<BuildPartialItem> getDisplayList() {
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        int i = assetType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i == 1) {
            return getCashDisplayItems();
        }
        if (i == 2) {
            return getEquityDisplayItems();
        }
        if (i == 3) {
            return getOptionDisplayItems();
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) getCashDisplayItems(), (Iterable) getEquityDisplayItems()), (Iterable) getOptionDisplayItems());
    }
}
