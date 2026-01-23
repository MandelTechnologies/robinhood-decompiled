package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoSelectionRowStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle$Colors;", "<init>", "(Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle$Colors;)V", "getColors", "()Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle$Colors;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoSelectionRowStyle {
    public static final int $stable = 0;
    private final Colors colors;

    public static /* synthetic */ BentoSelectionRowStyle copy$default(BentoSelectionRowStyle bentoSelectionRowStyle, Colors colors, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = bentoSelectionRowStyle.colors;
        }
        return bentoSelectionRowStyle.copy(colors);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    public final BentoSelectionRowStyle copy(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new BentoSelectionRowStyle(colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BentoSelectionRowStyle) && Intrinsics.areEqual(this.colors, ((BentoSelectionRowStyle) other).colors);
    }

    public int hashCode() {
        return this.colors.hashCode();
    }

    public String toString() {
        return "BentoSelectionRowStyle(colors=" + this.colors + ")";
    }

    public BentoSelectionRowStyle(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
    }

    public final Colors getColors() {
        return this.colors;
    }

    /* compiled from: BentoSelectionRowStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle$Colors;", "", "fgColor", "Landroidx/compose/ui/graphics/Color;", "fgColorSecondary", "fgColorDisabled", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFgColor-0d7_KjU", "()J", "J", "getFgColorSecondary-0d7_KjU", "getFgColorDisabled-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long fgColor;
        private final long fgColorDisabled;
        private final long fgColorSecondary;

        public /* synthetic */ Colors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3);
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Colors m21686copyysEtTa8$default(Colors colors, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.fgColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = colors.fgColorSecondary;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = colors.fgColorDisabled;
            }
            return colors.m21690copyysEtTa8(j4, j5, j3);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getFgColor() {
            return this.fgColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getFgColorSecondary() {
            return this.fgColorSecondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getFgColorDisabled() {
            return this.fgColorDisabled;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Colors m21690copyysEtTa8(long fgColor, long fgColorSecondary, long fgColorDisabled) {
            return new Colors(fgColor, fgColorSecondary, fgColorDisabled, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.fgColor, colors.fgColor) && Color.m6707equalsimpl0(this.fgColorSecondary, colors.fgColorSecondary) && Color.m6707equalsimpl0(this.fgColorDisabled, colors.fgColorDisabled);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.fgColor) * 31) + Color.m6713hashCodeimpl(this.fgColorSecondary)) * 31) + Color.m6713hashCodeimpl(this.fgColorDisabled);
        }

        public String toString() {
            return "Colors(fgColor=" + Color.m6714toStringimpl(this.fgColor) + ", fgColorSecondary=" + Color.m6714toStringimpl(this.fgColorSecondary) + ", fgColorDisabled=" + Color.m6714toStringimpl(this.fgColorDisabled) + ")";
        }

        private Colors(long j, long j2, long j3) {
            this.fgColor = j;
            this.fgColorSecondary = j2;
            this.fgColorDisabled = j3;
        }

        /* renamed from: getFgColor-0d7_KjU, reason: not valid java name */
        public final long m21691getFgColor0d7_KjU() {
            return this.fgColor;
        }

        /* renamed from: getFgColorSecondary-0d7_KjU, reason: not valid java name */
        public final long m21693getFgColorSecondary0d7_KjU() {
            return this.fgColorSecondary;
        }

        /* renamed from: getFgColorDisabled-0d7_KjU, reason: not valid java name */
        public final long m21692getFgColorDisabled0d7_KjU() {
            return this.fgColorDisabled;
        }
    }
}
