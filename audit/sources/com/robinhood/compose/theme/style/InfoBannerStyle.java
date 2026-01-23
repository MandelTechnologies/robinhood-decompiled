package com.robinhood.compose.theme.style;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoBannerStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "", "spacing", "Lcom/robinhood/compose/theme/style/InfoBannerStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/InfoBannerStyle$Typography;", "colors", "Lcom/robinhood/compose/theme/style/InfoBannerStyle$Colors;", "<init>", "(Lcom/robinhood/compose/theme/style/InfoBannerStyle$Spacing;Lcom/robinhood/compose/theme/style/InfoBannerStyle$Typography;Lcom/robinhood/compose/theme/style/InfoBannerStyle$Colors;)V", "getSpacing", "()Lcom/robinhood/compose/theme/style/InfoBannerStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/InfoBannerStyle$Typography;", "getColors", "()Lcom/robinhood/compose/theme/style/InfoBannerStyle$Colors;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Spacing", "Typography", "Colors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InfoBannerStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ InfoBannerStyle copy$default(InfoBannerStyle infoBannerStyle, Spacing spacing, Typography typography, Colors colors, int i, Object obj) {
        if ((i & 1) != 0) {
            spacing = infoBannerStyle.spacing;
        }
        if ((i & 2) != 0) {
            typography = infoBannerStyle.typography;
        }
        if ((i & 4) != 0) {
            colors = infoBannerStyle.colors;
        }
        return infoBannerStyle.copy(spacing, typography, colors);
    }

    /* renamed from: component1, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* renamed from: component2, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    /* renamed from: component3, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    public final InfoBannerStyle copy(Spacing spacing, Typography typography, Colors colors) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new InfoBannerStyle(spacing, typography, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBannerStyle)) {
            return false;
        }
        InfoBannerStyle infoBannerStyle = (InfoBannerStyle) other;
        return Intrinsics.areEqual(this.spacing, infoBannerStyle.spacing) && Intrinsics.areEqual(this.typography, infoBannerStyle.typography) && Intrinsics.areEqual(this.colors, infoBannerStyle.colors);
    }

    public int hashCode() {
        return (((this.spacing.hashCode() * 31) + this.typography.hashCode()) * 31) + this.colors.hashCode();
    }

    public String toString() {
        return "InfoBannerStyle(spacing=" + this.spacing + ", typography=" + this.typography + ", colors=" + this.colors + ")";
    }

    public InfoBannerStyle(Spacing spacing, Typography typography, Colors colors) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.spacing = spacing;
        this.typography = typography;
        this.colors = colors;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    public final Colors getColors() {
        return this.colors;
    }

    /* compiled from: InfoBannerStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/InfoBannerStyle$Spacing;", "", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "spaceBetweenItems", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getSpaceBetweenItems-D9Ej5fM", "()F", "F", "component1", "component2", "component2-D9Ej5fM", "copy", "copy-3ABfNKs", "(Landroidx/compose/foundation/layout/PaddingValues;F)Lcom/robinhood/compose/theme/style/InfoBannerStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final PaddingValues padding;
        private final float spaceBetweenItems;

        public /* synthetic */ Spacing(PaddingValues paddingValues, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(paddingValues, f);
        }

        /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21800copy3ABfNKs$default(Spacing spacing, PaddingValues paddingValues, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                paddingValues = spacing.padding;
            }
            if ((i & 2) != 0) {
                f = spacing.spaceBetweenItems;
            }
            return spacing.m21802copy3ABfNKs(paddingValues, f);
        }

        /* renamed from: component1, reason: from getter */
        public final PaddingValues getPadding() {
            return this.padding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpaceBetweenItems() {
            return this.spaceBetweenItems;
        }

        /* renamed from: copy-3ABfNKs, reason: not valid java name */
        public final Spacing m21802copy3ABfNKs(PaddingValues padding, float spaceBetweenItems) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            return new Spacing(padding, spaceBetweenItems, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return Intrinsics.areEqual(this.padding, spacing.padding) && C2002Dp.m7997equalsimpl0(this.spaceBetweenItems, spacing.spaceBetweenItems);
        }

        public int hashCode() {
            return (this.padding.hashCode() * 31) + C2002Dp.m7998hashCodeimpl(this.spaceBetweenItems);
        }

        public String toString() {
            return "Spacing(padding=" + this.padding + ", spaceBetweenItems=" + C2002Dp.m7999toStringimpl(this.spaceBetweenItems) + ")";
        }

        private Spacing(PaddingValues padding, float f) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.padding = padding;
            this.spaceBetweenItems = f;
        }

        public final PaddingValues getPadding() {
            return this.padding;
        }

        /* renamed from: getSpaceBetweenItems-D9Ej5fM, reason: not valid java name */
        public final float m21803getSpaceBetweenItemsD9Ej5fM() {
            return this.spaceBetweenItems;
        }
    }

    /* compiled from: InfoBannerStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/InfoBannerStyle$Typography;", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Landroidx/compose/ui/text/TextStyle;)V", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle textStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.textStyle;
            }
            return typography.copy(textStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            return new Typography(textStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Typography) && Intrinsics.areEqual(this.textStyle, ((Typography) other).textStyle);
        }

        public int hashCode() {
            return this.textStyle.hashCode();
        }

        public String toString() {
            return "Typography(textStyle=" + this.textStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.textStyle = textStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }
    }

    /* compiled from: InfoBannerStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/InfoBannerStyle$Colors;", "", "defaultForeground", "Landroidx/compose/ui/graphics/Color;", "defaultBackground", "urgentForeground", "urgentBackground", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDefaultForeground-0d7_KjU", "()J", "J", "getDefaultBackground-0d7_KjU", "getUrgentForeground-0d7_KjU", "getUrgentBackground-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Lcom/robinhood/compose/theme/style/InfoBannerStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long defaultBackground;
        private final long defaultForeground;
        private final long urgentBackground;
        private final long urgentForeground;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4);
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Colors m21790copyjRlVdoo$default(Colors colors, long j, long j2, long j3, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.defaultForeground;
            }
            long j5 = j;
            if ((i & 2) != 0) {
                j2 = colors.defaultBackground;
            }
            long j6 = j2;
            if ((i & 4) != 0) {
                j3 = colors.urgentForeground;
            }
            return colors.m21795copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? colors.urgentBackground : j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefaultForeground() {
            return this.defaultForeground;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefaultBackground() {
            return this.defaultBackground;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getUrgentForeground() {
            return this.urgentForeground;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getUrgentBackground() {
            return this.urgentBackground;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Colors m21795copyjRlVdoo(long defaultForeground, long defaultBackground, long urgentForeground, long urgentBackground) {
            return new Colors(defaultForeground, defaultBackground, urgentForeground, urgentBackground, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.defaultForeground, colors.defaultForeground) && Color.m6707equalsimpl0(this.defaultBackground, colors.defaultBackground) && Color.m6707equalsimpl0(this.urgentForeground, colors.urgentForeground) && Color.m6707equalsimpl0(this.urgentBackground, colors.urgentBackground);
        }

        public int hashCode() {
            return (((((Color.m6713hashCodeimpl(this.defaultForeground) * 31) + Color.m6713hashCodeimpl(this.defaultBackground)) * 31) + Color.m6713hashCodeimpl(this.urgentForeground)) * 31) + Color.m6713hashCodeimpl(this.urgentBackground);
        }

        public String toString() {
            return "Colors(defaultForeground=" + Color.m6714toStringimpl(this.defaultForeground) + ", defaultBackground=" + Color.m6714toStringimpl(this.defaultBackground) + ", urgentForeground=" + Color.m6714toStringimpl(this.urgentForeground) + ", urgentBackground=" + Color.m6714toStringimpl(this.urgentBackground) + ")";
        }

        private Colors(long j, long j2, long j3, long j4) {
            this.defaultForeground = j;
            this.defaultBackground = j2;
            this.urgentForeground = j3;
            this.urgentBackground = j4;
        }

        /* renamed from: getDefaultForeground-0d7_KjU, reason: not valid java name */
        public final long m21797getDefaultForeground0d7_KjU() {
            return this.defaultForeground;
        }

        /* renamed from: getDefaultBackground-0d7_KjU, reason: not valid java name */
        public final long m21796getDefaultBackground0d7_KjU() {
            return this.defaultBackground;
        }

        /* renamed from: getUrgentForeground-0d7_KjU, reason: not valid java name */
        public final long m21799getUrgentForeground0d7_KjU() {
            return this.urgentForeground;
        }

        /* renamed from: getUrgentBackground-0d7_KjU, reason: not valid java name */
        public final long m21798getUrgentBackground0d7_KjU() {
            return this.urgentBackground;
        }
    }
}
