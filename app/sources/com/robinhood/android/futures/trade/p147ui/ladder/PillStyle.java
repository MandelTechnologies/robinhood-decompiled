package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJ\u0010\u0010 \u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b!\u0010\u000fJ\u0010\u0010\"\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b#\u0010\u000fJ\u0010\u0010$\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b%\u0010\u000fJ\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u000fJ\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u000fJ`\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/PillStyle;", "", "buyTextColor", "Landroidx/compose/ui/graphics/Color;", "sellTextColor", "buyBackgroundColor", "sellBackgroundColor", "buyBottomBackgroundColor", "sellBottomBackgroundColor", "topLoadingBackgroundColor", "bottomLoadingBackgroundColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getTopLoadingBackgroundColor-0d7_KjU", "()J", "getBottomLoadingBackgroundColor-0d7_KjU", "topBackgroundColor", "orderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "topBackgroundColor-vNxB06k", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;)J", "bottomBackgroundColor", "bottomBackgroundColor-vNxB06k", "textColor", "textColor-vNxB06k", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "copy", "copy-FD3wquc", "(JJJJJJJJ)Lcom/robinhood/android/futures/trade/ui/ladder/PillStyle;", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PillStyle {
    public static final int $stable = 0;
    private final long bottomLoadingBackgroundColor;
    private final long buyBackgroundColor;
    private final long buyBottomBackgroundColor;
    private final long buyTextColor;
    private final long sellBackgroundColor;
    private final long sellBottomBackgroundColor;
    private final long sellTextColor;
    private final long topLoadingBackgroundColor;

    public /* synthetic */ PillStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getBuyTextColor() {
        return this.buyTextColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    private final long getSellTextColor() {
        return this.sellTextColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    private final long getBuyBackgroundColor() {
        return this.buyBackgroundColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    private final long getSellBackgroundColor() {
        return this.sellBackgroundColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    private final long getBuyBottomBackgroundColor() {
        return this.buyBottomBackgroundColor;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    private final long getSellBottomBackgroundColor() {
        return this.sellBottomBackgroundColor;
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ PillStyle m14876copyFD3wquc$default(PillStyle pillStyle, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11 = (i & 1) != 0 ? pillStyle.buyTextColor : j;
        long j12 = (i & 2) != 0 ? pillStyle.sellTextColor : j2;
        long j13 = (i & 4) != 0 ? pillStyle.buyBackgroundColor : j3;
        long j14 = (i & 8) != 0 ? pillStyle.sellBackgroundColor : j4;
        long j15 = (i & 16) != 0 ? pillStyle.buyBottomBackgroundColor : j5;
        long j16 = (i & 32) != 0 ? pillStyle.sellBottomBackgroundColor : j6;
        long j17 = (i & 64) != 0 ? pillStyle.topLoadingBackgroundColor : j7;
        if ((i & 128) != 0) {
            j9 = pillStyle.bottomLoadingBackgroundColor;
            j10 = j11;
        } else {
            j9 = j8;
            j10 = j11;
        }
        return pillStyle.m14880copyFD3wquc(j10, j12, j13, j14, j15, j16, j17, j9);
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getTopLoadingBackgroundColor() {
        return this.topLoadingBackgroundColor;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getBottomLoadingBackgroundColor() {
        return this.bottomLoadingBackgroundColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final PillStyle m14880copyFD3wquc(long buyTextColor, long sellTextColor, long buyBackgroundColor, long sellBackgroundColor, long buyBottomBackgroundColor, long sellBottomBackgroundColor, long topLoadingBackgroundColor, long bottomLoadingBackgroundColor) {
        return new PillStyle(buyTextColor, sellTextColor, buyBackgroundColor, sellBackgroundColor, buyBottomBackgroundColor, sellBottomBackgroundColor, topLoadingBackgroundColor, bottomLoadingBackgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PillStyle)) {
            return false;
        }
        PillStyle pillStyle = (PillStyle) other;
        return Color.m6707equalsimpl0(this.buyTextColor, pillStyle.buyTextColor) && Color.m6707equalsimpl0(this.sellTextColor, pillStyle.sellTextColor) && Color.m6707equalsimpl0(this.buyBackgroundColor, pillStyle.buyBackgroundColor) && Color.m6707equalsimpl0(this.sellBackgroundColor, pillStyle.sellBackgroundColor) && Color.m6707equalsimpl0(this.buyBottomBackgroundColor, pillStyle.buyBottomBackgroundColor) && Color.m6707equalsimpl0(this.sellBottomBackgroundColor, pillStyle.sellBottomBackgroundColor) && Color.m6707equalsimpl0(this.topLoadingBackgroundColor, pillStyle.topLoadingBackgroundColor) && Color.m6707equalsimpl0(this.bottomLoadingBackgroundColor, pillStyle.bottomLoadingBackgroundColor);
    }

    public int hashCode() {
        return (((((((((((((Color.m6713hashCodeimpl(this.buyTextColor) * 31) + Color.m6713hashCodeimpl(this.sellTextColor)) * 31) + Color.m6713hashCodeimpl(this.buyBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.sellBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.buyBottomBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.sellBottomBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.topLoadingBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.bottomLoadingBackgroundColor);
    }

    public String toString() {
        return "PillStyle(buyTextColor=" + Color.m6714toStringimpl(this.buyTextColor) + ", sellTextColor=" + Color.m6714toStringimpl(this.sellTextColor) + ", buyBackgroundColor=" + Color.m6714toStringimpl(this.buyBackgroundColor) + ", sellBackgroundColor=" + Color.m6714toStringimpl(this.sellBackgroundColor) + ", buyBottomBackgroundColor=" + Color.m6714toStringimpl(this.buyBottomBackgroundColor) + ", sellBottomBackgroundColor=" + Color.m6714toStringimpl(this.sellBottomBackgroundColor) + ", topLoadingBackgroundColor=" + Color.m6714toStringimpl(this.topLoadingBackgroundColor) + ", bottomLoadingBackgroundColor=" + Color.m6714toStringimpl(this.bottomLoadingBackgroundColor) + ")";
    }

    private PillStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.buyTextColor = j;
        this.sellTextColor = j2;
        this.buyBackgroundColor = j3;
        this.sellBackgroundColor = j4;
        this.buyBottomBackgroundColor = j5;
        this.sellBottomBackgroundColor = j6;
        this.topLoadingBackgroundColor = j7;
        this.bottomLoadingBackgroundColor = j8;
    }

    /* renamed from: getTopLoadingBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m14882getTopLoadingBackgroundColor0d7_KjU() {
        return this.topLoadingBackgroundColor;
    }

    /* renamed from: getBottomLoadingBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m14881getBottomLoadingBackgroundColor0d7_KjU() {
        return this.bottomLoadingBackgroundColor;
    }

    /* renamed from: topBackgroundColor-vNxB06k, reason: not valid java name */
    public final long m14884topBackgroundColorvNxB06k(FuturesOrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return orderSide == FuturesOrderSide.BUY ? this.buyBackgroundColor : this.sellBackgroundColor;
    }

    /* renamed from: bottomBackgroundColor-vNxB06k, reason: not valid java name */
    public final long m14877bottomBackgroundColorvNxB06k(FuturesOrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return orderSide == FuturesOrderSide.BUY ? this.buyBottomBackgroundColor : this.sellBottomBackgroundColor;
    }

    /* renamed from: textColor-vNxB06k, reason: not valid java name */
    public final long m14883textColorvNxB06k(FuturesOrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return orderSide == FuturesOrderSide.BUY ? this.buyTextColor : this.sellTextColor;
    }
}
