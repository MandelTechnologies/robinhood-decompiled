package com.robinhood.android.accountcenter.views;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AssetBreakdownItem;", "", "id", "", "name", "percentage", "", "displayPercentage", "deeplink", "Landroid/net/Uri;", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getPercentage", "()F", "getDisplayPercentage", "getDeeplink", "()Landroid/net/Uri;", "getParentId", "isOther", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AssetBreakdownItem {
    private static final String ID_OTHER = "asset_other_breakdown";
    private final Uri deeplink;
    private final String displayPercentage;
    private final String id;
    private final boolean isOther;
    private final String name;
    private final String parentId;
    private final float percentage;
    public static final int $stable = 8;

    public static /* synthetic */ AssetBreakdownItem copy$default(AssetBreakdownItem assetBreakdownItem, String str, String str2, float f, String str3, Uri uri, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetBreakdownItem.id;
        }
        if ((i & 2) != 0) {
            str2 = assetBreakdownItem.name;
        }
        if ((i & 4) != 0) {
            f = assetBreakdownItem.percentage;
        }
        if ((i & 8) != 0) {
            str3 = assetBreakdownItem.displayPercentage;
        }
        if ((i & 16) != 0) {
            uri = assetBreakdownItem.deeplink;
        }
        if ((i & 32) != 0) {
            str4 = assetBreakdownItem.parentId;
        }
        Uri uri2 = uri;
        String str5 = str4;
        return assetBreakdownItem.copy(str, str2, f, str3, uri2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayPercentage() {
        return this.displayPercentage;
    }

    /* renamed from: component5, reason: from getter */
    public final Uri getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final AssetBreakdownItem copy(String id, String name, float percentage, String displayPercentage, Uri deeplink, String parentId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        return new AssetBreakdownItem(id, name, percentage, displayPercentage, deeplink, parentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetBreakdownItem)) {
            return false;
        }
        AssetBreakdownItem assetBreakdownItem = (AssetBreakdownItem) other;
        return Intrinsics.areEqual(this.id, assetBreakdownItem.id) && Intrinsics.areEqual(this.name, assetBreakdownItem.name) && Float.compare(this.percentage, assetBreakdownItem.percentage) == 0 && Intrinsics.areEqual(this.displayPercentage, assetBreakdownItem.displayPercentage) && Intrinsics.areEqual(this.deeplink, assetBreakdownItem.deeplink) && Intrinsics.areEqual(this.parentId, assetBreakdownItem.parentId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.percentage)) * 31) + this.displayPercentage.hashCode()) * 31;
        Uri uri = this.deeplink;
        return ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.parentId.hashCode();
    }

    public String toString() {
        return "AssetBreakdownItem(id=" + this.id + ", name=" + this.name + ", percentage=" + this.percentage + ", displayPercentage=" + this.displayPercentage + ", deeplink=" + this.deeplink + ", parentId=" + this.parentId + ")";
    }

    public AssetBreakdownItem(String id, String name, float f, String displayPercentage, Uri uri, String parentId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        this.id = id;
        this.name = name;
        this.percentage = f;
        this.displayPercentage = displayPercentage;
        this.deeplink = uri;
        this.parentId = parentId;
        this.isOther = Intrinsics.areEqual(id, ID_OTHER);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final String getDisplayPercentage() {
        return this.displayPercentage;
    }

    public final Uri getDeeplink() {
        return this.deeplink;
    }

    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: isOther, reason: from getter */
    public final boolean getIsOther() {
        return this.isOther;
    }
}
