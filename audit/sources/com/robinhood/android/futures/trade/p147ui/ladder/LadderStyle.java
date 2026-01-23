package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderStyle;", "", "marketOrderForm", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderMarketOrderFormStyle;", "selectedRow", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderSelectedRowStyle;", "orderPill", "Lcom/robinhood/android/futures/trade/ui/ladder/PillStyle;", "quantityBar", "Lcom/robinhood/android/futures/trade/ui/ladder/QuantityBarStyle;", "pillOutlineGradiantBrush", "Landroidx/compose/ui/graphics/Brush;", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/LadderMarketOrderFormStyle;Lcom/robinhood/android/futures/trade/ui/ladder/LadderSelectedRowStyle;Lcom/robinhood/android/futures/trade/ui/ladder/PillStyle;Lcom/robinhood/android/futures/trade/ui/ladder/QuantityBarStyle;Landroidx/compose/ui/graphics/Brush;)V", "getMarketOrderForm", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderMarketOrderFormStyle;", "getSelectedRow", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderSelectedRowStyle;", "getOrderPill", "()Lcom/robinhood/android/futures/trade/ui/ladder/PillStyle;", "getQuantityBar", "()Lcom/robinhood/android/futures/trade/ui/ladder/QuantityBarStyle;", "getPillOutlineGradiantBrush", "()Landroidx/compose/ui/graphics/Brush;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LadderStyle {
    public static final int $stable = 0;
    private final LadderMarketOrderFormStyle marketOrderForm;
    private final PillStyle orderPill;
    private final Brush pillOutlineGradiantBrush;
    private final QuantityBarStyle quantityBar;
    private final LadderSelectedRowStyle selectedRow;

    public static /* synthetic */ LadderStyle copy$default(LadderStyle ladderStyle, LadderMarketOrderFormStyle ladderMarketOrderFormStyle, LadderSelectedRowStyle ladderSelectedRowStyle, PillStyle pillStyle, QuantityBarStyle quantityBarStyle, Brush brush, int i, Object obj) {
        if ((i & 1) != 0) {
            ladderMarketOrderFormStyle = ladderStyle.marketOrderForm;
        }
        if ((i & 2) != 0) {
            ladderSelectedRowStyle = ladderStyle.selectedRow;
        }
        if ((i & 4) != 0) {
            pillStyle = ladderStyle.orderPill;
        }
        if ((i & 8) != 0) {
            quantityBarStyle = ladderStyle.quantityBar;
        }
        if ((i & 16) != 0) {
            brush = ladderStyle.pillOutlineGradiantBrush;
        }
        Brush brush2 = brush;
        PillStyle pillStyle2 = pillStyle;
        return ladderStyle.copy(ladderMarketOrderFormStyle, ladderSelectedRowStyle, pillStyle2, quantityBarStyle, brush2);
    }

    /* renamed from: component1, reason: from getter */
    public final LadderMarketOrderFormStyle getMarketOrderForm() {
        return this.marketOrderForm;
    }

    /* renamed from: component2, reason: from getter */
    public final LadderSelectedRowStyle getSelectedRow() {
        return this.selectedRow;
    }

    /* renamed from: component3, reason: from getter */
    public final PillStyle getOrderPill() {
        return this.orderPill;
    }

    /* renamed from: component4, reason: from getter */
    public final QuantityBarStyle getQuantityBar() {
        return this.quantityBar;
    }

    /* renamed from: component5, reason: from getter */
    public final Brush getPillOutlineGradiantBrush() {
        return this.pillOutlineGradiantBrush;
    }

    public final LadderStyle copy(LadderMarketOrderFormStyle marketOrderForm, LadderSelectedRowStyle selectedRow, PillStyle orderPill, QuantityBarStyle quantityBar, Brush pillOutlineGradiantBrush) {
        Intrinsics.checkNotNullParameter(marketOrderForm, "marketOrderForm");
        Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
        Intrinsics.checkNotNullParameter(orderPill, "orderPill");
        Intrinsics.checkNotNullParameter(quantityBar, "quantityBar");
        Intrinsics.checkNotNullParameter(pillOutlineGradiantBrush, "pillOutlineGradiantBrush");
        return new LadderStyle(marketOrderForm, selectedRow, orderPill, quantityBar, pillOutlineGradiantBrush);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderStyle)) {
            return false;
        }
        LadderStyle ladderStyle = (LadderStyle) other;
        return Intrinsics.areEqual(this.marketOrderForm, ladderStyle.marketOrderForm) && Intrinsics.areEqual(this.selectedRow, ladderStyle.selectedRow) && Intrinsics.areEqual(this.orderPill, ladderStyle.orderPill) && Intrinsics.areEqual(this.quantityBar, ladderStyle.quantityBar) && Intrinsics.areEqual(this.pillOutlineGradiantBrush, ladderStyle.pillOutlineGradiantBrush);
    }

    public int hashCode() {
        return (((((((this.marketOrderForm.hashCode() * 31) + this.selectedRow.hashCode()) * 31) + this.orderPill.hashCode()) * 31) + this.quantityBar.hashCode()) * 31) + this.pillOutlineGradiantBrush.hashCode();
    }

    public String toString() {
        return "LadderStyle(marketOrderForm=" + this.marketOrderForm + ", selectedRow=" + this.selectedRow + ", orderPill=" + this.orderPill + ", quantityBar=" + this.quantityBar + ", pillOutlineGradiantBrush=" + this.pillOutlineGradiantBrush + ")";
    }

    public LadderStyle(LadderMarketOrderFormStyle marketOrderForm, LadderSelectedRowStyle selectedRow, PillStyle orderPill, QuantityBarStyle quantityBar, Brush pillOutlineGradiantBrush) {
        Intrinsics.checkNotNullParameter(marketOrderForm, "marketOrderForm");
        Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
        Intrinsics.checkNotNullParameter(orderPill, "orderPill");
        Intrinsics.checkNotNullParameter(quantityBar, "quantityBar");
        Intrinsics.checkNotNullParameter(pillOutlineGradiantBrush, "pillOutlineGradiantBrush");
        this.marketOrderForm = marketOrderForm;
        this.selectedRow = selectedRow;
        this.orderPill = orderPill;
        this.quantityBar = quantityBar;
        this.pillOutlineGradiantBrush = pillOutlineGradiantBrush;
    }

    public final LadderMarketOrderFormStyle getMarketOrderForm() {
        return this.marketOrderForm;
    }

    public final LadderSelectedRowStyle getSelectedRow() {
        return this.selectedRow;
    }

    public final PillStyle getOrderPill() {
        return this.orderPill;
    }

    public final QuantityBarStyle getQuantityBar() {
        return this.quantityBar;
    }

    public final Brush getPillOutlineGradiantBrush() {
        return this.pillOutlineGradiantBrush;
    }
}
