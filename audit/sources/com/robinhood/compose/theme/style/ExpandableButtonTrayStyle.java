package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandableButtonTrayStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Colors;", "spacing", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Typography;", "<init>", "(Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Colors;Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Spacing;Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Typography;)V", "getColors", "()Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Colors;", "getSpacing", "()Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Typography;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Spacing", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExpandableButtonTrayStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ ExpandableButtonTrayStyle copy$default(ExpandableButtonTrayStyle expandableButtonTrayStyle, Colors colors, Spacing spacing, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = expandableButtonTrayStyle.colors;
        }
        if ((i & 2) != 0) {
            spacing = expandableButtonTrayStyle.spacing;
        }
        if ((i & 4) != 0) {
            typography = expandableButtonTrayStyle.typography;
        }
        return expandableButtonTrayStyle.copy(colors, spacing, typography);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* renamed from: component3, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    public final ExpandableButtonTrayStyle copy(Colors colors, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new ExpandableButtonTrayStyle(colors, spacing, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableButtonTrayStyle)) {
            return false;
        }
        ExpandableButtonTrayStyle expandableButtonTrayStyle = (ExpandableButtonTrayStyle) other;
        return Intrinsics.areEqual(this.colors, expandableButtonTrayStyle.colors) && Intrinsics.areEqual(this.spacing, expandableButtonTrayStyle.spacing) && Intrinsics.areEqual(this.typography, expandableButtonTrayStyle.typography);
    }

    public int hashCode() {
        return (((this.colors.hashCode() * 31) + this.spacing.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "ExpandableButtonTrayStyle(colors=" + this.colors + ", spacing=" + this.spacing + ", typography=" + this.typography + ")";
    }

    public ExpandableButtonTrayStyle(Colors colors, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        this.colors = colors;
        this.spacing = spacing;
        this.typography = typography;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    /* compiled from: ExpandableButtonTrayStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Colors;", "", "bgColor", "Landroidx/compose/ui/graphics/Color;", "labelTextColor", "valueTextColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBgColor-0d7_KjU", "()J", "J", "getLabelTextColor-0d7_KjU", "getValueTextColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long bgColor;
        private final long labelTextColor;
        private final long valueTextColor;

        public /* synthetic */ Colors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3);
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Colors m21766copyysEtTa8$default(Colors colors, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.bgColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = colors.labelTextColor;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = colors.valueTextColor;
            }
            return colors.m21770copyysEtTa8(j4, j5, j3);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBgColor() {
            return this.bgColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getLabelTextColor() {
            return this.labelTextColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getValueTextColor() {
            return this.valueTextColor;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Colors m21770copyysEtTa8(long bgColor, long labelTextColor, long valueTextColor) {
            return new Colors(bgColor, labelTextColor, valueTextColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.bgColor, colors.bgColor) && Color.m6707equalsimpl0(this.labelTextColor, colors.labelTextColor) && Color.m6707equalsimpl0(this.valueTextColor, colors.valueTextColor);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.bgColor) * 31) + Color.m6713hashCodeimpl(this.labelTextColor)) * 31) + Color.m6713hashCodeimpl(this.valueTextColor);
        }

        public String toString() {
            return "Colors(bgColor=" + Color.m6714toStringimpl(this.bgColor) + ", labelTextColor=" + Color.m6714toStringimpl(this.labelTextColor) + ", valueTextColor=" + Color.m6714toStringimpl(this.valueTextColor) + ")";
        }

        private Colors(long j, long j2, long j3) {
            this.bgColor = j;
            this.labelTextColor = j2;
            this.valueTextColor = j3;
        }

        /* renamed from: getBgColor-0d7_KjU, reason: not valid java name */
        public final long m21771getBgColor0d7_KjU() {
            return this.bgColor;
        }

        /* renamed from: getLabelTextColor-0d7_KjU, reason: not valid java name */
        public final long m21772getLabelTextColor0d7_KjU() {
            return this.labelTextColor;
        }

        /* renamed from: getValueTextColor-0d7_KjU, reason: not valid java name */
        public final long m21773getValueTextColor0d7_KjU() {
            return this.valueTextColor;
        }
    }

    /* compiled from: ExpandableButtonTrayStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Spacing;", "", "horizontalContainerPadding", "Landroidx/compose/ui/unit/Dp;", "horizontalItemPadding", "verticalButtonSpacing", "verticalTrayPadding", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHorizontalContainerPadding-D9Ej5fM", "()F", "F", "getHorizontalItemPadding-D9Ej5fM", "getVerticalButtonSpacing-D9Ej5fM", "getVerticalTrayPadding-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final float horizontalContainerPadding;
        private final float horizontalItemPadding;
        private final float verticalButtonSpacing;
        private final float verticalTrayPadding;

        public /* synthetic */ Spacing(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4);
        }

        /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21774copya9UjIt4$default(Spacing spacing, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.horizontalContainerPadding;
            }
            if ((i & 2) != 0) {
                f2 = spacing.horizontalItemPadding;
            }
            if ((i & 4) != 0) {
                f3 = spacing.verticalButtonSpacing;
            }
            if ((i & 8) != 0) {
                f4 = spacing.verticalTrayPadding;
            }
            return spacing.m21779copya9UjIt4(f, f2, f3, f4);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalContainerPadding() {
            return this.horizontalContainerPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalItemPadding() {
            return this.horizontalItemPadding;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalButtonSpacing() {
            return this.verticalButtonSpacing;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalTrayPadding() {
            return this.verticalTrayPadding;
        }

        /* renamed from: copy-a9UjIt4, reason: not valid java name */
        public final Spacing m21779copya9UjIt4(float horizontalContainerPadding, float horizontalItemPadding, float verticalButtonSpacing, float verticalTrayPadding) {
            return new Spacing(horizontalContainerPadding, horizontalItemPadding, verticalButtonSpacing, verticalTrayPadding, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return C2002Dp.m7997equalsimpl0(this.horizontalContainerPadding, spacing.horizontalContainerPadding) && C2002Dp.m7997equalsimpl0(this.horizontalItemPadding, spacing.horizontalItemPadding) && C2002Dp.m7997equalsimpl0(this.verticalButtonSpacing, spacing.verticalButtonSpacing) && C2002Dp.m7997equalsimpl0(this.verticalTrayPadding, spacing.verticalTrayPadding);
        }

        public int hashCode() {
            return (((((C2002Dp.m7998hashCodeimpl(this.horizontalContainerPadding) * 31) + C2002Dp.m7998hashCodeimpl(this.horizontalItemPadding)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalButtonSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalTrayPadding);
        }

        public String toString() {
            return "Spacing(horizontalContainerPadding=" + C2002Dp.m7999toStringimpl(this.horizontalContainerPadding) + ", horizontalItemPadding=" + C2002Dp.m7999toStringimpl(this.horizontalItemPadding) + ", verticalButtonSpacing=" + C2002Dp.m7999toStringimpl(this.verticalButtonSpacing) + ", verticalTrayPadding=" + C2002Dp.m7999toStringimpl(this.verticalTrayPadding) + ")";
        }

        private Spacing(float f, float f2, float f3, float f4) {
            this.horizontalContainerPadding = f;
            this.horizontalItemPadding = f2;
            this.verticalButtonSpacing = f3;
            this.verticalTrayPadding = f4;
        }

        /* renamed from: getHorizontalContainerPadding-D9Ej5fM, reason: not valid java name */
        public final float m21780getHorizontalContainerPaddingD9Ej5fM() {
            return this.horizontalContainerPadding;
        }

        /* renamed from: getHorizontalItemPadding-D9Ej5fM, reason: not valid java name */
        public final float m21781getHorizontalItemPaddingD9Ej5fM() {
            return this.horizontalItemPadding;
        }

        /* renamed from: getVerticalButtonSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21782getVerticalButtonSpacingD9Ej5fM() {
            return this.verticalButtonSpacing;
        }

        /* renamed from: getVerticalTrayPadding-D9Ej5fM, reason: not valid java name */
        public final float m21783getVerticalTrayPaddingD9Ej5fM() {
            return this.verticalTrayPadding;
        }
    }

    /* compiled from: ExpandableButtonTrayStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle$Typography;", "", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "valueTextStyle", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getLabelTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getValueTextStyle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle labelTextStyle;
        private final androidx.compose.p011ui.text.TextStyle valueTextStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.labelTextStyle;
            }
            if ((i & 2) != 0) {
                textStyle2 = typography.valueTextStyle;
            }
            return typography.copy(textStyle, textStyle2);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getLabelTextStyle() {
            return this.labelTextStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getValueTextStyle() {
            return this.valueTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle labelTextStyle, androidx.compose.p011ui.text.TextStyle valueTextStyle) {
            Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
            Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
            return new Typography(labelTextStyle, valueTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.labelTextStyle, typography.labelTextStyle) && Intrinsics.areEqual(this.valueTextStyle, typography.valueTextStyle);
        }

        public int hashCode() {
            return (this.labelTextStyle.hashCode() * 31) + this.valueTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(labelTextStyle=" + this.labelTextStyle + ", valueTextStyle=" + this.valueTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle labelTextStyle, androidx.compose.p011ui.text.TextStyle valueTextStyle) {
            Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
            Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
            this.labelTextStyle = labelTextStyle;
            this.valueTextStyle = valueTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getLabelTextStyle() {
            return this.labelTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getValueTextStyle() {
            return this.valueTextStyle;
        }
    }
}
