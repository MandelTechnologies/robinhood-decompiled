package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownSpannedTextStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\tJ\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "", "linkColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinkColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component1-QN2ZGVo", "copy", "copy-Y2TPw74", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MarkdownSpannedTextStyle {
    public static final int $stable = 0;
    private final Color linkColor;

    public /* synthetic */ MarkdownSpannedTextStyle(Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(color);
    }

    /* renamed from: copy-Y2TPw74$default, reason: not valid java name */
    public static /* synthetic */ MarkdownSpannedTextStyle m21804copyY2TPw74$default(MarkdownSpannedTextStyle markdownSpannedTextStyle, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            color = markdownSpannedTextStyle.linkColor;
        }
        return markdownSpannedTextStyle.m21806copyY2TPw74(color);
    }

    /* renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getLinkColor() {
        return this.linkColor;
    }

    /* renamed from: copy-Y2TPw74, reason: not valid java name */
    public final MarkdownSpannedTextStyle m21806copyY2TPw74(Color linkColor) {
        return new MarkdownSpannedTextStyle(linkColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkdownSpannedTextStyle) && Intrinsics.areEqual(this.linkColor, ((MarkdownSpannedTextStyle) other).linkColor);
    }

    public int hashCode() {
        Color color = this.linkColor;
        if (color == null) {
            return 0;
        }
        return Color.m6713hashCodeimpl(color.getValue());
    }

    public String toString() {
        return "MarkdownSpannedTextStyle(linkColor=" + this.linkColor + ")";
    }

    private MarkdownSpannedTextStyle(Color color) {
        this.linkColor = color;
    }

    /* renamed from: getLinkColor-QN2ZGVo, reason: not valid java name */
    public final Color m21807getLinkColorQN2ZGVo() {
        return this.linkColor;
    }
}
