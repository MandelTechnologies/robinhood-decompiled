package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PlaceholderStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "highlightColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getHighlightColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PlaceholderStyle {
    public static final int $stable = 0;
    private final long color;
    private final long highlightColor;

    public /* synthetic */ PlaceholderStyle(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ PlaceholderStyle m21876copyOWjLjI$default(PlaceholderStyle placeholderStyle, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = placeholderStyle.color;
        }
        if ((i & 2) != 0) {
            j2 = placeholderStyle.highlightColor;
        }
        return placeholderStyle.m21879copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getHighlightColor() {
        return this.highlightColor;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final PlaceholderStyle m21879copyOWjLjI(long color, long highlightColor) {
        return new PlaceholderStyle(color, highlightColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceholderStyle)) {
            return false;
        }
        PlaceholderStyle placeholderStyle = (PlaceholderStyle) other;
        return Color.m6707equalsimpl0(this.color, placeholderStyle.color) && Color.m6707equalsimpl0(this.highlightColor, placeholderStyle.highlightColor);
    }

    public int hashCode() {
        return (Color.m6713hashCodeimpl(this.color) * 31) + Color.m6713hashCodeimpl(this.highlightColor);
    }

    public String toString() {
        return "PlaceholderStyle(color=" + Color.m6714toStringimpl(this.color) + ", highlightColor=" + Color.m6714toStringimpl(this.highlightColor) + ")";
    }

    private PlaceholderStyle(long j, long j2) {
        this.color = j;
        this.highlightColor = j2;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m21880getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getHighlightColor-0d7_KjU, reason: not valid java name */
    public final long m21881getHighlightColor0d7_KjU() {
        return this.highlightColor;
    }
}
