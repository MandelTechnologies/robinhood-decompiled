package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressBarStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/ProgressBarStyle$Colors;", "spacing", "Lcom/robinhood/compose/theme/style/ProgressBarStyle$Spacing;", "<init>", "(Lcom/robinhood/compose/theme/style/ProgressBarStyle$Colors;Lcom/robinhood/compose/theme/style/ProgressBarStyle$Spacing;)V", "getColors", "()Lcom/robinhood/compose/theme/style/ProgressBarStyle$Colors;", "getSpacing", "()Lcom/robinhood/compose/theme/style/ProgressBarStyle$Spacing;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Spacing", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProgressBarStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;

    public static /* synthetic */ ProgressBarStyle copy$default(ProgressBarStyle progressBarStyle, Colors colors, Spacing spacing, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = progressBarStyle.colors;
        }
        if ((i & 2) != 0) {
            spacing = progressBarStyle.spacing;
        }
        return progressBarStyle.copy(colors, spacing);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    public final ProgressBarStyle copy(Colors colors, Spacing spacing) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        return new ProgressBarStyle(colors, spacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarStyle)) {
            return false;
        }
        ProgressBarStyle progressBarStyle = (ProgressBarStyle) other;
        return Intrinsics.areEqual(this.colors, progressBarStyle.colors) && Intrinsics.areEqual(this.spacing, progressBarStyle.spacing);
    }

    public int hashCode() {
        return (this.colors.hashCode() * 31) + this.spacing.hashCode();
    }

    public String toString() {
        return "ProgressBarStyle(colors=" + this.colors + ", spacing=" + this.spacing + ")";
    }

    public ProgressBarStyle(Colors colors, Spacing spacing) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.colors = colors;
        this.spacing = spacing;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* compiled from: ProgressBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ProgressBarStyle$Colors;", "", "activeColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveColor-0d7_KjU", "()J", "J", "getBackgroundColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/theme/style/ProgressBarStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long activeColor;
        private final long backgroundColor;

        public /* synthetic */ Colors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ Colors m21896copyOWjLjI$default(Colors colors, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.activeColor;
            }
            if ((i & 2) != 0) {
                j2 = colors.backgroundColor;
            }
            return colors.m21899copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveColor() {
            return this.activeColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final Colors m21899copyOWjLjI(long activeColor, long backgroundColor) {
            return new Colors(activeColor, backgroundColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.activeColor, colors.activeColor) && Color.m6707equalsimpl0(this.backgroundColor, colors.backgroundColor);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.activeColor) * 31) + Color.m6713hashCodeimpl(this.backgroundColor);
        }

        public String toString() {
            return "Colors(activeColor=" + Color.m6714toStringimpl(this.activeColor) + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
        }

        private Colors(long j, long j2) {
            this.activeColor = j;
            this.backgroundColor = j2;
        }

        /* renamed from: getActiveColor-0d7_KjU, reason: not valid java name */
        public final long m21900getActiveColor0d7_KjU() {
            return this.activeColor;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21901getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }
    }

    /* compiled from: ProgressBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ProgressBarStyle$Spacing;", "", "height", "Landroidx/compose/ui/unit/Dp;", "segmentSpacing", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-D9Ej5fM", "()F", "F", "getSegmentSpacing-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/ProgressBarStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final float height;
        private final float segmentSpacing;

        public /* synthetic */ Spacing(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21902copyYgX7TsA$default(Spacing spacing, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.height;
            }
            if ((i & 2) != 0) {
                f2 = spacing.segmentSpacing;
            }
            return spacing.m21905copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSegmentSpacing() {
            return this.segmentSpacing;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final Spacing m21905copyYgX7TsA(float height, float segmentSpacing) {
            return new Spacing(height, segmentSpacing, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return C2002Dp.m7997equalsimpl0(this.height, spacing.height) && C2002Dp.m7997equalsimpl0(this.segmentSpacing, spacing.segmentSpacing);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.height) * 31) + C2002Dp.m7998hashCodeimpl(this.segmentSpacing);
        }

        public String toString() {
            return "Spacing(height=" + C2002Dp.m7999toStringimpl(this.height) + ", segmentSpacing=" + C2002Dp.m7999toStringimpl(this.segmentSpacing) + ")";
        }

        private Spacing(float f, float f2) {
            this.height = f;
            this.segmentSpacing = f2;
        }

        /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
        public final float m21906getHeightD9Ej5fM() {
            return this.height;
        }

        /* renamed from: getSegmentSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21907getSegmentSpacingD9Ej5fM() {
            return this.segmentSpacing;
        }
    }
}
