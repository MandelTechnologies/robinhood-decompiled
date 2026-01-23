package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InfoTags.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TagColors;", "", "foreground", "Landroidx/compose/ui/graphics/Color;", "background", "ripple", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getForeground-0d7_KjU", "()J", "J", "getBackground-0d7_KjU", "getRipple-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/bento/component/TagColors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TagColors {
    public static final int $stable = 0;
    private final long background;
    private final long foreground;
    private final long ripple;

    public /* synthetic */ TagColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ TagColors m20840copyysEtTa8$default(TagColors tagColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tagColors.foreground;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = tagColors.background;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = tagColors.ripple;
        }
        return tagColors.m20844copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getForeground() {
        return this.foreground;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getRipple() {
        return this.ripple;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final TagColors m20844copyysEtTa8(long foreground, long background, long ripple) {
        return new TagColors(foreground, background, ripple, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagColors)) {
            return false;
        }
        TagColors tagColors = (TagColors) other;
        return Color.m6707equalsimpl0(this.foreground, tagColors.foreground) && Color.m6707equalsimpl0(this.background, tagColors.background) && Color.m6707equalsimpl0(this.ripple, tagColors.ripple);
    }

    public int hashCode() {
        return (((Color.m6713hashCodeimpl(this.foreground) * 31) + Color.m6713hashCodeimpl(this.background)) * 31) + Color.m6713hashCodeimpl(this.ripple);
    }

    public String toString() {
        return "TagColors(foreground=" + Color.m6714toStringimpl(this.foreground) + ", background=" + Color.m6714toStringimpl(this.background) + ", ripple=" + Color.m6714toStringimpl(this.ripple) + ")";
    }

    private TagColors(long j, long j2, long j3) {
        this.foreground = j;
        this.background = j2;
        this.ripple = j3;
    }

    /* renamed from: getForeground-0d7_KjU, reason: not valid java name */
    public final long m20846getForeground0d7_KjU() {
        return this.foreground;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m20845getBackground0d7_KjU() {
        return this.background;
    }

    public /* synthetic */ TagColors(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j3, null);
    }

    /* renamed from: getRipple-0d7_KjU, reason: not valid java name */
    public final long m20847getRipple0d7_KjU() {
        return this.ripple;
    }
}
