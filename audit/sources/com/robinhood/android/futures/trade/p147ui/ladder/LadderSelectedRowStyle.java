package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderSelectedRowStyle;", "", "buyBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sellBackgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBuyBackgroundColor-0d7_KjU", "()J", "J", "getSellBackgroundColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/android/futures/trade/ui/ladder/LadderSelectedRowStyle;", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LadderSelectedRowStyle {
    public static final int $stable = 0;
    private final long buyBackgroundColor;
    private final long sellBackgroundColor;

    public /* synthetic */ LadderSelectedRowStyle(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ LadderSelectedRowStyle m14837copyOWjLjI$default(LadderSelectedRowStyle ladderSelectedRowStyle, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ladderSelectedRowStyle.buyBackgroundColor;
        }
        if ((i & 2) != 0) {
            j2 = ladderSelectedRowStyle.sellBackgroundColor;
        }
        return ladderSelectedRowStyle.m14840copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBuyBackgroundColor() {
        return this.buyBackgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getSellBackgroundColor() {
        return this.sellBackgroundColor;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final LadderSelectedRowStyle m14840copyOWjLjI(long buyBackgroundColor, long sellBackgroundColor) {
        return new LadderSelectedRowStyle(buyBackgroundColor, sellBackgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderSelectedRowStyle)) {
            return false;
        }
        LadderSelectedRowStyle ladderSelectedRowStyle = (LadderSelectedRowStyle) other;
        return Color.m6707equalsimpl0(this.buyBackgroundColor, ladderSelectedRowStyle.buyBackgroundColor) && Color.m6707equalsimpl0(this.sellBackgroundColor, ladderSelectedRowStyle.sellBackgroundColor);
    }

    public int hashCode() {
        return (Color.m6713hashCodeimpl(this.buyBackgroundColor) * 31) + Color.m6713hashCodeimpl(this.sellBackgroundColor);
    }

    public String toString() {
        return "LadderSelectedRowStyle(buyBackgroundColor=" + Color.m6714toStringimpl(this.buyBackgroundColor) + ", sellBackgroundColor=" + Color.m6714toStringimpl(this.sellBackgroundColor) + ")";
    }

    private LadderSelectedRowStyle(long j, long j2) {
        this.buyBackgroundColor = j;
        this.sellBackgroundColor = j2;
    }

    /* renamed from: getBuyBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m14841getBuyBackgroundColor0d7_KjU() {
        return this.buyBackgroundColor;
    }

    /* renamed from: getSellBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m14842getSellBackgroundColor0d7_KjU() {
        return this.sellBackgroundColor;
    }
}
