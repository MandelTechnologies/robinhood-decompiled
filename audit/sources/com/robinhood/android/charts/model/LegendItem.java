package com.robinhood.android.charts.model;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegendItem.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003JP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/charts/model/LegendItem;", "", "id", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "title", "value", "valueColor", "suffix", "Lcom/robinhood/android/charts/model/LegendItemSuffix;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;Ljava/lang/String;JLcom/robinhood/android/charts/model/LegendItemSuffix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getTitle", "getValue", "getValueColor-0d7_KjU", "()J", "J", "getSuffix", "()Lcom/robinhood/android/charts/model/LegendItemSuffix;", "component1", "component2", "component2-QN2ZGVo", "component3", "component4", "component5", "component5-0d7_KjU", "component6", "copy", "copy-o595zdw", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;Ljava/lang/String;JLcom/robinhood/android/charts/model/LegendItemSuffix;)Lcom/robinhood/android/charts/model/LegendItem;", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LegendItem {
    public static final int $stable = 0;
    private final Color color;
    private final String id;
    private final LegendItemSuffix suffix;
    private final String title;
    private final String value;
    private final long valueColor;

    public /* synthetic */ LegendItem(String str, Color color, String str2, String str3, long j, LegendItemSuffix legendItemSuffix, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, color, str2, str3, j, legendItemSuffix);
    }

    /* renamed from: copy-o595zdw$default, reason: not valid java name */
    public static /* synthetic */ LegendItem m12060copyo595zdw$default(LegendItem legendItem, String str, Color color, String str2, String str3, long j, LegendItemSuffix legendItemSuffix, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legendItem.id;
        }
        if ((i & 2) != 0) {
            color = legendItem.color;
        }
        if ((i & 4) != 0) {
            str2 = legendItem.title;
        }
        if ((i & 8) != 0) {
            str3 = legendItem.value;
        }
        if ((i & 16) != 0) {
            j = legendItem.valueColor;
        }
        if ((i & 32) != 0) {
            legendItemSuffix = legendItem.suffix;
        }
        LegendItemSuffix legendItemSuffix2 = legendItemSuffix;
        long j2 = j;
        return legendItem.m12063copyo595zdw(str, color, str2, str3, j2, legendItemSuffix2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getValueColor() {
        return this.valueColor;
    }

    /* renamed from: component6, reason: from getter */
    public final LegendItemSuffix getSuffix() {
        return this.suffix;
    }

    /* renamed from: copy-o595zdw, reason: not valid java name */
    public final LegendItem m12063copyo595zdw(String id, Color color, String title, String value, long valueColor, LegendItemSuffix suffix) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new LegendItem(id, color, title, value, valueColor, suffix, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendItem)) {
            return false;
        }
        LegendItem legendItem = (LegendItem) other;
        return Intrinsics.areEqual(this.id, legendItem.id) && Intrinsics.areEqual(this.color, legendItem.color) && Intrinsics.areEqual(this.title, legendItem.title) && Intrinsics.areEqual(this.value, legendItem.value) && Color.m6707equalsimpl0(this.valueColor, legendItem.valueColor) && Intrinsics.areEqual(this.suffix, legendItem.suffix);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Color color = this.color;
        int iM6713hashCodeimpl = (((((((iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31) + this.title.hashCode()) * 31) + this.value.hashCode()) * 31) + Color.m6713hashCodeimpl(this.valueColor)) * 31;
        LegendItemSuffix legendItemSuffix = this.suffix;
        return iM6713hashCodeimpl + (legendItemSuffix != null ? legendItemSuffix.hashCode() : 0);
    }

    public String toString() {
        return "LegendItem(id=" + this.id + ", color=" + this.color + ", title=" + this.title + ", value=" + this.value + ", valueColor=" + Color.m6714toStringimpl(this.valueColor) + ", suffix=" + this.suffix + ")";
    }

    private LegendItem(String id, Color color, String title, String value, long j, LegendItemSuffix legendItemSuffix) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.id = id;
        this.color = color;
        this.title = title;
        this.value = value;
        this.valueColor = j;
        this.suffix = legendItemSuffix;
    }

    public /* synthetic */ LegendItem(String str, Color color, String str2, String str3, long j, LegendItemSuffix legendItemSuffix, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, color, str2, str3, j, (i & 32) != 0 ? null : legendItemSuffix, null);
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final Color m12064getColorQN2ZGVo() {
        return this.color;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: getValueColor-0d7_KjU, reason: not valid java name */
    public final long m12065getValueColor0d7_KjU() {
        return this.valueColor;
    }

    public final LegendItemSuffix getSuffix() {
        return this.suffix;
    }
}
