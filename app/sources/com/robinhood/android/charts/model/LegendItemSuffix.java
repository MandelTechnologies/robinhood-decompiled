package com.robinhood.android.charts.model;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegendItem.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/charts/model/LegendItemSuffix;", "", "value", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/String;", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "component2-QN2ZGVo", "component3", "copy", "copy-bi-UJ9A", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LegendItemSuffix {
    public static final int $stable = 0;
    private final Color color;
    private final TextStyle textStyle;
    private final String value;

    public /* synthetic */ LegendItemSuffix(String str, Color color, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, color, textStyle);
    }

    /* renamed from: copy-bi-UJ9A$default, reason: not valid java name */
    public static /* synthetic */ LegendItemSuffix m12066copybiUJ9A$default(LegendItemSuffix legendItemSuffix, String str, Color color, TextStyle textStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legendItemSuffix.value;
        }
        if ((i & 2) != 0) {
            color = legendItemSuffix.color;
        }
        if ((i & 4) != 0) {
            textStyle = legendItemSuffix.textStyle;
        }
        return legendItemSuffix.m12068copybiUJ9A(str, color, textStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: copy-bi-UJ9A, reason: not valid java name */
    public final LegendItemSuffix m12068copybiUJ9A(String value, Color color, TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new LegendItemSuffix(value, color, textStyle, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendItemSuffix)) {
            return false;
        }
        LegendItemSuffix legendItemSuffix = (LegendItemSuffix) other;
        return Intrinsics.areEqual(this.value, legendItemSuffix.value) && Intrinsics.areEqual(this.color, legendItemSuffix.color) && Intrinsics.areEqual(this.textStyle, legendItemSuffix.textStyle);
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        Color color = this.color;
        int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
        TextStyle textStyle = this.textStyle;
        return iM6713hashCodeimpl + (textStyle != null ? textStyle.hashCode() : 0);
    }

    public String toString() {
        return "LegendItemSuffix(value=" + this.value + ", color=" + this.color + ", textStyle=" + this.textStyle + ")";
    }

    private LegendItemSuffix(String value, Color color, TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.color = color;
        this.textStyle = textStyle;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final Color m12069getColorQN2ZGVo() {
        return this.color;
    }

    public final TextStyle getTextStyle() {
        return this.textStyle;
    }
}
