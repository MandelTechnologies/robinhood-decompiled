package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTickerText.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J`\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/TickerTextState;", "", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "textType", "Lcom/robinhood/compose/bento/component/text/TextType;", "autoSize", "", "contentDescription", "minScaleFactor", "", "padding", "Lcom/robinhood/compose/bento/component/text/TickerPadding;", "<init>", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Lcom/robinhood/compose/bento/component/text/TextType;ZLjava/lang/String;FLcom/robinhood/compose/bento/component/text/TickerPadding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getColor-0d7_KjU", "()J", "J", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getTextType", "()Lcom/robinhood/compose/bento/component/text/TextType;", "getAutoSize", "()Z", "getContentDescription", "getMinScaleFactor", "()F", "getPadding", "()Lcom/robinhood/compose/bento/component/text/TickerPadding;", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy-8V94_ZQ", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Lcom/robinhood/compose/bento/component/text/TextType;ZLjava/lang/String;FLcom/robinhood/compose/bento/component/text/TickerPadding;)Lcom/robinhood/compose/bento/component/text/TickerTextState;", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TickerTextState {
    public static final int $stable = 0;
    private final boolean autoSize;
    private final long color;
    private final String contentDescription;
    private final float minScaleFactor;
    private final TickerPadding padding;
    private final TextStyle style;
    private final String text;
    private final BentoTickerText4 textType;

    public /* synthetic */ TickerTextState(String str, long j, TextStyle textStyle, BentoTickerText4 bentoTickerText4, boolean z, String str2, float f, TickerPadding tickerPadding, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textStyle, bentoTickerText4, z, str2, f, tickerPadding);
    }

    /* renamed from: copy-8V94_ZQ$default, reason: not valid java name */
    public static /* synthetic */ TickerTextState m21131copy8V94_ZQ$default(TickerTextState tickerTextState, String str, long j, TextStyle textStyle, BentoTickerText4 bentoTickerText4, boolean z, String str2, float f, TickerPadding tickerPadding, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tickerTextState.text;
        }
        if ((i & 2) != 0) {
            j = tickerTextState.color;
        }
        if ((i & 4) != 0) {
            textStyle = tickerTextState.style;
        }
        if ((i & 8) != 0) {
            bentoTickerText4 = tickerTextState.textType;
        }
        if ((i & 16) != 0) {
            z = tickerTextState.autoSize;
        }
        if ((i & 32) != 0) {
            str2 = tickerTextState.contentDescription;
        }
        if ((i & 64) != 0) {
            f = tickerTextState.minScaleFactor;
        }
        if ((i & 128) != 0) {
            tickerPadding = tickerTextState.padding;
        }
        float f2 = f;
        TickerPadding tickerPadding2 = tickerPadding;
        return tickerTextState.m21133copy8V94_ZQ(str, j, textStyle, bentoTickerText4, z, str2, f2, tickerPadding2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoTickerText4 getTextType() {
        return this.textType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAutoSize() {
        return this.autoSize;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final float getMinScaleFactor() {
        return this.minScaleFactor;
    }

    /* renamed from: component8, reason: from getter */
    public final TickerPadding getPadding() {
        return this.padding;
    }

    /* renamed from: copy-8V94_ZQ, reason: not valid java name */
    public final TickerTextState m21133copy8V94_ZQ(String text, long color, TextStyle style, BentoTickerText4 textType, boolean autoSize, String contentDescription, float minScaleFactor, TickerPadding padding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(textType, "textType");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(padding, "padding");
        return new TickerTextState(text, color, style, textType, autoSize, contentDescription, minScaleFactor, padding, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickerTextState)) {
            return false;
        }
        TickerTextState tickerTextState = (TickerTextState) other;
        return Intrinsics.areEqual(this.text, tickerTextState.text) && Color.m6707equalsimpl0(this.color, tickerTextState.color) && Intrinsics.areEqual(this.style, tickerTextState.style) && this.textType == tickerTextState.textType && this.autoSize == tickerTextState.autoSize && Intrinsics.areEqual(this.contentDescription, tickerTextState.contentDescription) && Float.compare(this.minScaleFactor, tickerTextState.minScaleFactor) == 0 && Intrinsics.areEqual(this.padding, tickerTextState.padding);
    }

    public int hashCode() {
        return (((((((((((((this.text.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + this.style.hashCode()) * 31) + this.textType.hashCode()) * 31) + Boolean.hashCode(this.autoSize)) * 31) + this.contentDescription.hashCode()) * 31) + Float.hashCode(this.minScaleFactor)) * 31) + this.padding.hashCode();
    }

    public String toString() {
        return "TickerTextState(text=" + this.text + ", color=" + Color.m6714toStringimpl(this.color) + ", style=" + this.style + ", textType=" + this.textType + ", autoSize=" + this.autoSize + ", contentDescription=" + this.contentDescription + ", minScaleFactor=" + this.minScaleFactor + ", padding=" + this.padding + ")";
    }

    private TickerTextState(String text, long j, TextStyle style, BentoTickerText4 textType, boolean z, String contentDescription, float f, TickerPadding padding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(textType, "textType");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.text = text;
        this.color = j;
        this.style = style;
        this.textType = textType;
        this.autoSize = z;
        this.contentDescription = contentDescription;
        this.minScaleFactor = f;
        this.padding = padding;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m21134getColor0d7_KjU() {
        return this.color;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final BentoTickerText4 getTextType() {
        return this.textType;
    }

    public final boolean getAutoSize() {
        return this.autoSize;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final float getMinScaleFactor() {
        return this.minScaleFactor;
    }

    public /* synthetic */ TickerTextState(String str, long j, TextStyle textStyle, BentoTickerText4 bentoTickerText4, boolean z, String str2, float f, TickerPadding tickerPadding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textStyle, bentoTickerText4, z, (i & 32) != 0 ? str : str2, (i & 64) != 0 ? 0.5f : f, (i & 128) != 0 ? new TickerPadding(0.0f, 0.0f, 3, null) : tickerPadding, null);
    }

    public final TickerPadding getPadding() {
        return this.padding;
    }
}
