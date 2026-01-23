package com.robinhood.android.acatsin.accountcontents;

import android.graphics.Bitmap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountContentsDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003Je\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;", "", "brokerageName", "", "brokerageLogo", "Landroid/graphics/Bitmap;", "isLoaded", "", "items", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "selectedItems", "buildPartialBannerContentfulId", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getBrokerageName", "()Ljava/lang/String;", "getBrokerageLogo", "()Landroid/graphics/Bitmap;", "()Z", "getItems", "()Ljava/util/List;", "getSelectedItems", "getBuildPartialBannerContentfulId", "getSupportedContentTypes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInAccountContentsDataState {
    public static final int $stable = 8;
    private final Bitmap brokerageLogo;
    private final String brokerageName;
    private final String buildPartialBannerContentfulId;
    private final boolean isLoaded;
    private final List<AccountContentItem> items;
    private final List<AccountContentItem> selectedItems;
    private final List<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

    public AcatsInAccountContentsDataState() {
        this(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ AcatsInAccountContentsDataState copy$default(AcatsInAccountContentsDataState acatsInAccountContentsDataState, String str, Bitmap bitmap, boolean z, List list, List list2, String str2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsInAccountContentsDataState.brokerageName;
        }
        if ((i & 2) != 0) {
            bitmap = acatsInAccountContentsDataState.brokerageLogo;
        }
        if ((i & 4) != 0) {
            z = acatsInAccountContentsDataState.isLoaded;
        }
        if ((i & 8) != 0) {
            list = acatsInAccountContentsDataState.items;
        }
        if ((i & 16) != 0) {
            list2 = acatsInAccountContentsDataState.selectedItems;
        }
        if ((i & 32) != 0) {
            str2 = acatsInAccountContentsDataState.buildPartialBannerContentfulId;
        }
        if ((i & 64) != 0) {
            list3 = acatsInAccountContentsDataState.supportedContentTypes;
        }
        String str3 = str2;
        List list4 = list3;
        List list5 = list2;
        boolean z2 = z;
        return acatsInAccountContentsDataState.copy(str, bitmap, z2, list, list5, str3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBrokerageName() {
        return this.brokerageName;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getBrokerageLogo() {
        return this.brokerageLogo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoaded() {
        return this.isLoaded;
    }

    public final List<AccountContentItem> component4() {
        return this.items;
    }

    public final List<AccountContentItem> component5() {
        return this.selectedItems;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> component7() {
        return this.supportedContentTypes;
    }

    public final AcatsInAccountContentsDataState copy(String brokerageName, Bitmap brokerageLogo, boolean isLoaded, List<AccountContentItem> items, List<AccountContentItem> selectedItems, String buildPartialBannerContentfulId, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes) {
        Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        return new AcatsInAccountContentsDataState(brokerageName, brokerageLogo, isLoaded, items, selectedItems, buildPartialBannerContentfulId, supportedContentTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInAccountContentsDataState)) {
            return false;
        }
        AcatsInAccountContentsDataState acatsInAccountContentsDataState = (AcatsInAccountContentsDataState) other;
        return Intrinsics.areEqual(this.brokerageName, acatsInAccountContentsDataState.brokerageName) && Intrinsics.areEqual(this.brokerageLogo, acatsInAccountContentsDataState.brokerageLogo) && this.isLoaded == acatsInAccountContentsDataState.isLoaded && Intrinsics.areEqual(this.items, acatsInAccountContentsDataState.items) && Intrinsics.areEqual(this.selectedItems, acatsInAccountContentsDataState.selectedItems) && Intrinsics.areEqual(this.buildPartialBannerContentfulId, acatsInAccountContentsDataState.buildPartialBannerContentfulId) && Intrinsics.areEqual(this.supportedContentTypes, acatsInAccountContentsDataState.supportedContentTypes);
    }

    public int hashCode() {
        int iHashCode = this.brokerageName.hashCode() * 31;
        Bitmap bitmap = this.brokerageLogo;
        int iHashCode2 = (((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isLoaded)) * 31) + this.items.hashCode()) * 31) + this.selectedItems.hashCode()) * 31;
        String str = this.buildPartialBannerContentfulId;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.supportedContentTypes.hashCode();
    }

    public String toString() {
        return "AcatsInAccountContentsDataState(brokerageName=" + this.brokerageName + ", brokerageLogo=" + this.brokerageLogo + ", isLoaded=" + this.isLoaded + ", items=" + this.items + ", selectedItems=" + this.selectedItems + ", buildPartialBannerContentfulId=" + this.buildPartialBannerContentfulId + ", supportedContentTypes=" + this.supportedContentTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInAccountContentsDataState(String brokerageName, Bitmap bitmap, boolean z, List<AccountContentItem> items, List<AccountContentItem> selectedItems, String str, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes) {
        Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        this.brokerageName = brokerageName;
        this.brokerageLogo = bitmap;
        this.isLoaded = z;
        this.items = items;
        this.selectedItems = selectedItems;
        this.buildPartialBannerContentfulId = str;
        this.supportedContentTypes = supportedContentTypes;
    }

    public /* synthetic */ AcatsInAccountContentsDataState(String str, Bitmap bitmap, boolean z, List list, List list2, String str2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final String getBrokerageName() {
        return this.brokerageName;
    }

    public final Bitmap getBrokerageLogo() {
        return this.brokerageLogo;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public final List<AccountContentItem> getItems() {
        return this.items;
    }

    public final List<AccountContentItem> getSelectedItems() {
        return this.selectedItems;
    }

    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }
}
