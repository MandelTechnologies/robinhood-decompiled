package com.robinhood.android.accountcenter.views;

import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AssetBreakdown;", "", "id", "", "name", "description", "Lcom/robinhood/models/serverdriven/db/RichText;", "percentage", "", "displayPercentage", "items", "", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownItem;", "emptyBreakdownState", "Lcom/robinhood/android/accountcenter/views/EmptyAssetBreakdownState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;FLjava/lang/String;Ljava/util/List;Lcom/robinhood/android/accountcenter/views/EmptyAssetBreakdownState;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getPercentage", "()F", "getDisplayPercentage", "getItems", "()Ljava/util/List;", "getEmptyBreakdownState", "()Lcom/robinhood/android/accountcenter/views/EmptyAssetBreakdownState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AssetBreakdown {
    public static final int $stable = 8;
    private final RichText description;
    private final String displayPercentage;
    private final EmptyAssetBreakdownState emptyBreakdownState;
    private final String id;
    private final List<AssetBreakdownItem> items;
    private final String name;
    private final float percentage;

    public static /* synthetic */ AssetBreakdown copy$default(AssetBreakdown assetBreakdown, String str, String str2, RichText richText, float f, String str3, List list, EmptyAssetBreakdownState emptyAssetBreakdownState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetBreakdown.id;
        }
        if ((i & 2) != 0) {
            str2 = assetBreakdown.name;
        }
        if ((i & 4) != 0) {
            richText = assetBreakdown.description;
        }
        if ((i & 8) != 0) {
            f = assetBreakdown.percentage;
        }
        if ((i & 16) != 0) {
            str3 = assetBreakdown.displayPercentage;
        }
        if ((i & 32) != 0) {
            list = assetBreakdown.items;
        }
        if ((i & 64) != 0) {
            emptyAssetBreakdownState = assetBreakdown.emptyBreakdownState;
        }
        List list2 = list;
        EmptyAssetBreakdownState emptyAssetBreakdownState2 = emptyAssetBreakdownState;
        String str4 = str3;
        RichText richText2 = richText;
        return assetBreakdown.copy(str, str2, richText2, f, str4, list2, emptyAssetBreakdownState2);
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
    public final RichText getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayPercentage() {
        return this.displayPercentage;
    }

    public final List<AssetBreakdownItem> component6() {
        return this.items;
    }

    /* renamed from: component7, reason: from getter */
    public final EmptyAssetBreakdownState getEmptyBreakdownState() {
        return this.emptyBreakdownState;
    }

    public final AssetBreakdown copy(String id, String name, RichText description, float percentage, String displayPercentage, List<AssetBreakdownItem> items, EmptyAssetBreakdownState emptyBreakdownState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
        Intrinsics.checkNotNullParameter(items, "items");
        return new AssetBreakdown(id, name, description, percentage, displayPercentage, items, emptyBreakdownState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetBreakdown)) {
            return false;
        }
        AssetBreakdown assetBreakdown = (AssetBreakdown) other;
        return Intrinsics.areEqual(this.id, assetBreakdown.id) && Intrinsics.areEqual(this.name, assetBreakdown.name) && Intrinsics.areEqual(this.description, assetBreakdown.description) && Float.compare(this.percentage, assetBreakdown.percentage) == 0 && Intrinsics.areEqual(this.displayPercentage, assetBreakdown.displayPercentage) && Intrinsics.areEqual(this.items, assetBreakdown.items) && Intrinsics.areEqual(this.emptyBreakdownState, assetBreakdown.emptyBreakdownState);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        RichText richText = this.description;
        int iHashCode2 = (((((((iHashCode + (richText == null ? 0 : richText.hashCode())) * 31) + Float.hashCode(this.percentage)) * 31) + this.displayPercentage.hashCode()) * 31) + this.items.hashCode()) * 31;
        EmptyAssetBreakdownState emptyAssetBreakdownState = this.emptyBreakdownState;
        return iHashCode2 + (emptyAssetBreakdownState != null ? emptyAssetBreakdownState.hashCode() : 0);
    }

    public String toString() {
        return "AssetBreakdown(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", percentage=" + this.percentage + ", displayPercentage=" + this.displayPercentage + ", items=" + this.items + ", emptyBreakdownState=" + this.emptyBreakdownState + ")";
    }

    public AssetBreakdown(String id, String name, RichText richText, float f, String displayPercentage, List<AssetBreakdownItem> items, EmptyAssetBreakdownState emptyAssetBreakdownState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id;
        this.name = name;
        this.description = richText;
        this.percentage = f;
        this.displayPercentage = displayPercentage;
        this.items = items;
        this.emptyBreakdownState = emptyAssetBreakdownState;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final RichText getDescription() {
        return this.description;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final String getDisplayPercentage() {
        return this.displayPercentage;
    }

    public /* synthetic */ AssetBreakdown(String str, String str2, RichText richText, float f, String str3, List list, EmptyAssetBreakdownState emptyAssetBreakdownState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, richText, f, str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, emptyAssetBreakdownState);
    }

    public final List<AssetBreakdownItem> getItems() {
        return this.items;
    }

    public final EmptyAssetBreakdownState getEmptyBreakdownState() {
        return this.emptyBreakdownState;
    }
}
