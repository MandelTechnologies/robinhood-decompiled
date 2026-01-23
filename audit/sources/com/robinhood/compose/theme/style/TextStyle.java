package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextStyle.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextStyle;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "<init>", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JLandroidx/compose/ui/text/TextStyle;)Lcom/robinhood/compose/theme/style/TextStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TextStyle {
    public static final int $stable = 0;
    private final long color;
    private final androidx.compose.p011ui.text.TextStyle style;

    public /* synthetic */ TextStyle(long j, androidx.compose.p011ui.text.TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, textStyle);
    }

    /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m22028copyDxMtmZc$default(TextStyle textStyle, long j, androidx.compose.p011ui.text.TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textStyle.color;
        }
        if ((i & 2) != 0) {
            textStyle2 = textStyle.style;
        }
        return textStyle.m22030copyDxMtmZc(j, textStyle2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.p011ui.text.TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: copy-DxMtmZc, reason: not valid java name */
    public final TextStyle m22030copyDxMtmZc(long color, androidx.compose.p011ui.text.TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new TextStyle(color, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Color.m6707equalsimpl0(this.color, textStyle.color) && Intrinsics.areEqual(this.style, textStyle.style);
    }

    public int hashCode() {
        return (Color.m6713hashCodeimpl(this.color) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "TextStyle(color=" + Color.m6714toStringimpl(this.color) + ", style=" + this.style + ")";
    }

    private TextStyle(long j, androidx.compose.p011ui.text.TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.color = j;
        this.style = style;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m22031getColor0d7_KjU() {
        return this.color;
    }

    public final androidx.compose.p011ui.text.TextStyle getStyle() {
        return this.style;
    }
}
