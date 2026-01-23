package com.robinhood.android.advisory.dashboard.overview.portfolio;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.models.advisory.p304db.portfolio.ClassificationDetails;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CategorySlice.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003JQ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/portfolio/CategorySlice;", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/advisory/db/portfolio/ClassificationDetails;", "allocation", "", "allocationString", "Lcom/robinhood/utils/resource/StringResource;", "assetSlices", "", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/AssetSlice;", "instrumentIds", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;Lcom/robinhood/models/advisory/db/portfolio/ClassificationDetails;FLcom/robinhood/utils/resource/StringResource;Ljava/util/List;Ljava/util/List;)V", "getCategory", "()Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", "getDetails", "()Lcom/robinhood/models/advisory/db/portfolio/ClassificationDetails;", "getAllocation", "()F", "getAllocationString", "()Lcom/robinhood/utils/resource/StringResource;", "getAssetSlices", "()Ljava/util/List;", "getInstrumentIds", "assetsDescription", "", "getAssetsDescription", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class CategorySlice {
    public static final int $stable = 8;
    private final float allocation;
    private final StringResource allocationString;
    private final List<AssetSlice> assetSlices;
    private final AssetClass5 category;
    private final ClassificationDetails details;
    private final List<UUID> instrumentIds;

    public static /* synthetic */ CategorySlice copy$default(CategorySlice categorySlice, AssetClass5 assetClass5, ClassificationDetails classificationDetails, float f, StringResource stringResource, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClass5 = categorySlice.category;
        }
        if ((i & 2) != 0) {
            classificationDetails = categorySlice.details;
        }
        if ((i & 4) != 0) {
            f = categorySlice.allocation;
        }
        if ((i & 8) != 0) {
            stringResource = categorySlice.allocationString;
        }
        if ((i & 16) != 0) {
            list = categorySlice.assetSlices;
        }
        if ((i & 32) != 0) {
            list2 = categorySlice.instrumentIds;
        }
        List list3 = list;
        List list4 = list2;
        return categorySlice.copy(assetClass5, classificationDetails, f, stringResource, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetClass5 getCategory() {
        return this.category;
    }

    /* renamed from: component2, reason: from getter */
    public final ClassificationDetails getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final float getAllocation() {
        return this.allocation;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getAllocationString() {
        return this.allocationString;
    }

    public final List<AssetSlice> component5() {
        return this.assetSlices;
    }

    public final List<UUID> component6() {
        return this.instrumentIds;
    }

    public final CategorySlice copy(AssetClass5 category, ClassificationDetails details, float allocation, StringResource allocationString, List<AssetSlice> assetSlices, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(allocationString, "allocationString");
        Intrinsics.checkNotNullParameter(assetSlices, "assetSlices");
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return new CategorySlice(category, details, allocation, allocationString, assetSlices, instrumentIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategorySlice)) {
            return false;
        }
        CategorySlice categorySlice = (CategorySlice) other;
        return this.category == categorySlice.category && Intrinsics.areEqual(this.details, categorySlice.details) && Float.compare(this.allocation, categorySlice.allocation) == 0 && Intrinsics.areEqual(this.allocationString, categorySlice.allocationString) && Intrinsics.areEqual(this.assetSlices, categorySlice.assetSlices) && Intrinsics.areEqual(this.instrumentIds, categorySlice.instrumentIds);
    }

    public int hashCode() {
        return (((((((((this.category.hashCode() * 31) + this.details.hashCode()) * 31) + Float.hashCode(this.allocation)) * 31) + this.allocationString.hashCode()) * 31) + this.assetSlices.hashCode()) * 31) + this.instrumentIds.hashCode();
    }

    public String toString() {
        return "CategorySlice(category=" + this.category + ", details=" + this.details + ", allocation=" + this.allocation + ", allocationString=" + this.allocationString + ", assetSlices=" + this.assetSlices + ", instrumentIds=" + this.instrumentIds + ")";
    }

    public CategorySlice(AssetClass5 category, ClassificationDetails details, float f, StringResource allocationString, List<AssetSlice> assetSlices, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(allocationString, "allocationString");
        Intrinsics.checkNotNullParameter(assetSlices, "assetSlices");
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        this.category = category;
        this.details = details;
        this.allocation = f;
        this.allocationString = allocationString;
        this.assetSlices = assetSlices;
        this.instrumentIds = instrumentIds;
    }

    public final AssetClass5 getCategory() {
        return this.category;
    }

    public final ClassificationDetails getDetails() {
        return this.details;
    }

    public final float getAllocation() {
        return this.allocation;
    }

    public final StringResource getAllocationString() {
        return this.allocationString;
    }

    public final List<AssetSlice> getAssetSlices() {
        return this.assetSlices;
    }

    public final List<UUID> getInstrumentIds() {
        return this.instrumentIds;
    }

    public final String getAssetsDescription() {
        List<AssetSlice> list = this.assetSlices;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssetSlice) it.next()).getTitle());
        }
        return CategorySlice3.summarize(arrayList, this.instrumentIds.size());
    }
}
