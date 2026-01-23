package com.robinhood.shared.trading.tradecomponentscompose.traderow;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericTradeRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u0015J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jp\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeButtonState;", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "backgroundColor", "loading", "", "hide", "enabled", "clickThrough", "onClicked", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;JJJZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTextColor-0d7_KjU", "()J", "J", "getBorderColor-0d7_KjU", "getBackgroundColor-0d7_KjU", "getLoading", "()Z", "getHide", "getEnabled", "getClickThrough", "getOnClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component6", "component7", "component8", "component9", "copy", "copy-gUzqikQ", "(Ljava/lang/String;JJJZZZZLkotlin/jvm/functions/Function0;)Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeButtonState;", "equals", "other", "hashCode", "", "toString", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TradeButtonState {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long borderColor;
    private final boolean clickThrough;
    private final boolean enabled;
    private final boolean hide;
    private final boolean loading;
    private final Function0<Unit> onClicked;
    private final String text;
    private final long textColor;

    public /* synthetic */ TradeButtonState(String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, z, z2, z3, z4, function0);
    }

    /* renamed from: copy-gUzqikQ$default, reason: not valid java name */
    public static /* synthetic */ TradeButtonState m26326copygUzqikQ$default(TradeButtonState tradeButtonState, String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeButtonState.text;
        }
        if ((i & 2) != 0) {
            j = tradeButtonState.textColor;
        }
        if ((i & 4) != 0) {
            j2 = tradeButtonState.borderColor;
        }
        if ((i & 8) != 0) {
            j3 = tradeButtonState.backgroundColor;
        }
        if ((i & 16) != 0) {
            z = tradeButtonState.loading;
        }
        if ((i & 32) != 0) {
            z2 = tradeButtonState.hide;
        }
        if ((i & 64) != 0) {
            z3 = tradeButtonState.enabled;
        }
        if ((i & 128) != 0) {
            z4 = tradeButtonState.clickThrough;
        }
        if ((i & 256) != 0) {
            function0 = tradeButtonState.onClicked;
        }
        Function0 function02 = function0;
        boolean z5 = z3;
        boolean z6 = z;
        long j4 = j3;
        long j5 = j2;
        return tradeButtonState.m26330copygUzqikQ(str, j, j5, j4, z6, z2, z5, z4, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHide() {
        return this.hide;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getClickThrough() {
        return this.clickThrough;
    }

    public final Function0<Unit> component9() {
        return this.onClicked;
    }

    /* renamed from: copy-gUzqikQ, reason: not valid java name */
    public final TradeButtonState m26330copygUzqikQ(String text, long textColor, long borderColor, long backgroundColor, boolean loading, boolean hide, boolean enabled, boolean clickThrough, Function0<Unit> onClicked) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        return new TradeButtonState(text, textColor, borderColor, backgroundColor, loading, hide, enabled, clickThrough, onClicked, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeButtonState)) {
            return false;
        }
        TradeButtonState tradeButtonState = (TradeButtonState) other;
        return Intrinsics.areEqual(this.text, tradeButtonState.text) && Color.m6707equalsimpl0(this.textColor, tradeButtonState.textColor) && Color.m6707equalsimpl0(this.borderColor, tradeButtonState.borderColor) && Color.m6707equalsimpl0(this.backgroundColor, tradeButtonState.backgroundColor) && this.loading == tradeButtonState.loading && this.hide == tradeButtonState.hide && this.enabled == tradeButtonState.enabled && this.clickThrough == tradeButtonState.clickThrough && Intrinsics.areEqual(this.onClicked, tradeButtonState.onClicked);
    }

    public int hashCode() {
        return (((((((((((((((this.text.hashCode() * 31) + Color.m6713hashCodeimpl(this.textColor)) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + Color.m6713hashCodeimpl(this.backgroundColor)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.hide)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.clickThrough)) * 31) + this.onClicked.hashCode();
    }

    public String toString() {
        return "TradeButtonState(text=" + this.text + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", loading=" + this.loading + ", hide=" + this.hide + ", enabled=" + this.enabled + ", clickThrough=" + this.clickThrough + ", onClicked=" + this.onClicked + ")";
    }

    private TradeButtonState(String text, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> onClicked) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        this.text = text;
        this.textColor = j;
        this.borderColor = j2;
        this.backgroundColor = j3;
        this.loading = z;
        this.hide = z2;
        this.enabled = z3;
        this.clickThrough = z4;
        this.onClicked = onClicked;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m26333getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m26332getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m26331getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getHide() {
        return this.hide;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getClickThrough() {
        return this.clickThrough;
    }

    public final Function0<Unit> getOnClicked() {
        return this.onClicked;
    }
}
