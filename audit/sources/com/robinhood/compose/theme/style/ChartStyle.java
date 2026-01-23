package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ChartStyle;", "", "legendTitleColor", "Landroidx/compose/ui/graphics/Color;", "tickerTextColor", "scrubLineColor", "scrubLabelTrackEmptyText", "scrubLineStrokeWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JJJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLegendTitleColor-0d7_KjU", "()J", "J", "getTickerTextColor-0d7_KjU", "getScrubLineColor-0d7_KjU", "getScrubLabelTrackEmptyText-0d7_KjU", "getScrubLineStrokeWidth-D9Ej5fM", "()F", "F", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-D9Ej5fM", "copy", "copy-hLbrIc0", "(JJJJF)Lcom/robinhood/compose/theme/style/ChartStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class ChartStyle {
    public static final int $stable = 0;
    private final long legendTitleColor;
    private final long scrubLabelTrackEmptyText;
    private final long scrubLineColor;
    private final float scrubLineStrokeWidth;
    private final long tickerTextColor;

    public /* synthetic */ ChartStyle(long j, long j2, long j3, long j4, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, f);
    }

    /* renamed from: copy-hLbrIc0$default, reason: not valid java name */
    public static /* synthetic */ ChartStyle m21718copyhLbrIc0$default(ChartStyle chartStyle, long j, long j2, long j3, long j4, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chartStyle.legendTitleColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = chartStyle.tickerTextColor;
        }
        return chartStyle.m21724copyhLbrIc0(j5, j2, (i & 4) != 0 ? chartStyle.scrubLineColor : j3, (i & 8) != 0 ? chartStyle.scrubLabelTrackEmptyText : j4, (i & 16) != 0 ? chartStyle.scrubLineStrokeWidth : f);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getLegendTitleColor() {
        return this.legendTitleColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTickerTextColor() {
        return this.tickerTextColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrubLineColor() {
        return this.scrubLineColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrubLabelTrackEmptyText() {
        return this.scrubLabelTrackEmptyText;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrubLineStrokeWidth() {
        return this.scrubLineStrokeWidth;
    }

    /* renamed from: copy-hLbrIc0, reason: not valid java name */
    public final ChartStyle m21724copyhLbrIc0(long legendTitleColor, long tickerTextColor, long scrubLineColor, long scrubLabelTrackEmptyText, float scrubLineStrokeWidth) {
        return new ChartStyle(legendTitleColor, tickerTextColor, scrubLineColor, scrubLabelTrackEmptyText, scrubLineStrokeWidth, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartStyle)) {
            return false;
        }
        ChartStyle chartStyle = (ChartStyle) other;
        return Color.m6707equalsimpl0(this.legendTitleColor, chartStyle.legendTitleColor) && Color.m6707equalsimpl0(this.tickerTextColor, chartStyle.tickerTextColor) && Color.m6707equalsimpl0(this.scrubLineColor, chartStyle.scrubLineColor) && Color.m6707equalsimpl0(this.scrubLabelTrackEmptyText, chartStyle.scrubLabelTrackEmptyText) && C2002Dp.m7997equalsimpl0(this.scrubLineStrokeWidth, chartStyle.scrubLineStrokeWidth);
    }

    public int hashCode() {
        return (((((((Color.m6713hashCodeimpl(this.legendTitleColor) * 31) + Color.m6713hashCodeimpl(this.tickerTextColor)) * 31) + Color.m6713hashCodeimpl(this.scrubLineColor)) * 31) + Color.m6713hashCodeimpl(this.scrubLabelTrackEmptyText)) * 31) + C2002Dp.m7998hashCodeimpl(this.scrubLineStrokeWidth);
    }

    public String toString() {
        return "ChartStyle(legendTitleColor=" + Color.m6714toStringimpl(this.legendTitleColor) + ", tickerTextColor=" + Color.m6714toStringimpl(this.tickerTextColor) + ", scrubLineColor=" + Color.m6714toStringimpl(this.scrubLineColor) + ", scrubLabelTrackEmptyText=" + Color.m6714toStringimpl(this.scrubLabelTrackEmptyText) + ", scrubLineStrokeWidth=" + C2002Dp.m7999toStringimpl(this.scrubLineStrokeWidth) + ")";
    }

    private ChartStyle(long j, long j2, long j3, long j4, float f) {
        this.legendTitleColor = j;
        this.tickerTextColor = j2;
        this.scrubLineColor = j3;
        this.scrubLabelTrackEmptyText = j4;
        this.scrubLineStrokeWidth = f;
    }

    /* renamed from: getLegendTitleColor-0d7_KjU, reason: not valid java name */
    public final long m21725getLegendTitleColor0d7_KjU() {
        return this.legendTitleColor;
    }

    /* renamed from: getTickerTextColor-0d7_KjU, reason: not valid java name */
    public final long m21729getTickerTextColor0d7_KjU() {
        return this.tickerTextColor;
    }

    /* renamed from: getScrubLineColor-0d7_KjU, reason: not valid java name */
    public final long m21727getScrubLineColor0d7_KjU() {
        return this.scrubLineColor;
    }

    /* renamed from: getScrubLabelTrackEmptyText-0d7_KjU, reason: not valid java name */
    public final long m21726getScrubLabelTrackEmptyText0d7_KjU() {
        return this.scrubLabelTrackEmptyText;
    }

    /* renamed from: getScrubLineStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m21728getScrubLineStrokeWidthD9Ej5fM() {
        return this.scrubLineStrokeWidth;
    }

    public /* synthetic */ ChartStyle(long j, long j2, long j3, long j4, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, (i & 16) != 0 ? C2002Dp.m7995constructorimpl(2) : f, null);
    }
}
