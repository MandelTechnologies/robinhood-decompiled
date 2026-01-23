package com.robinhood.android.accountcenter.views;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState;", "", "headerText", "", "items", "", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState$Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeaderText", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AssetBreakdownCircleChartState {
    public static final int $stable = 8;
    private final String headerText;
    private final List<Item> items;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetBreakdownCircleChartState copy$default(AssetBreakdownCircleChartState assetBreakdownCircleChartState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetBreakdownCircleChartState.headerText;
        }
        if ((i & 2) != 0) {
            list = assetBreakdownCircleChartState.items;
        }
        return assetBreakdownCircleChartState.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final AssetBreakdownCircleChartState copy(String headerText, List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AssetBreakdownCircleChartState(headerText, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetBreakdownCircleChartState)) {
            return false;
        }
        AssetBreakdownCircleChartState assetBreakdownCircleChartState = (AssetBreakdownCircleChartState) other;
        return Intrinsics.areEqual(this.headerText, assetBreakdownCircleChartState.headerText) && Intrinsics.areEqual(this.items, assetBreakdownCircleChartState.items);
    }

    public int hashCode() {
        String str = this.headerText;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "AssetBreakdownCircleChartState(headerText=" + this.headerText + ", items=" + this.items + ")";
    }

    public AssetBreakdownCircleChartState(String str, List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.headerText = str;
        this.items = items;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public /* synthetic */ AssetBreakdownCircleChartState(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState$Item;", "", "id", "", "title", "percentage", "", "displayPercentage", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getPercentage", "()F", "getDisplayPercentage", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final String displayPercentage;
        private final String id;
        private final float percentage;
        private final boolean selected;
        private final String title;

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, float f, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.title;
            }
            if ((i & 4) != 0) {
                f = item.percentage;
            }
            if ((i & 8) != 0) {
                str3 = item.displayPercentage;
            }
            if ((i & 16) != 0) {
                z = item.selected;
            }
            boolean z2 = z;
            float f2 = f;
            return item.copy(str, str2, f2, str3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
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
        public final boolean getSelected() {
            return this.selected;
        }

        public final Item copy(String id, String title, float percentage, String displayPercentage, boolean selected) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
            return new Item(id, title, percentage, displayPercentage, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.id, item.id) && Intrinsics.areEqual(this.title, item.title) && Float.compare(this.percentage, item.percentage) == 0 && Intrinsics.areEqual(this.displayPercentage, item.displayPercentage) && this.selected == item.selected;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Float.hashCode(this.percentage)) * 31) + this.displayPercentage.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Item(id=" + this.id + ", title=" + this.title + ", percentage=" + this.percentage + ", displayPercentage=" + this.displayPercentage + ", selected=" + this.selected + ")";
        }

        public Item(String id, String title, float f, String displayPercentage, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
            this.id = id;
            this.title = title;
            this.percentage = f;
            this.displayPercentage = displayPercentage;
            this.selected = z;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        public final String getDisplayPercentage() {
            return this.displayPercentage;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }
}
