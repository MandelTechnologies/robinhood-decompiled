package com.robinhood.compose.theme.style;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NumpadStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NumpadStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/NumpadStyle$Colors;", "spacing", "Lcom/robinhood/compose/theme/style/NumpadStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/NumpadStyle$Typography;", "<init>", "(Lcom/robinhood/compose/theme/style/NumpadStyle$Colors;Lcom/robinhood/compose/theme/style/NumpadStyle$Spacing;Lcom/robinhood/compose/theme/style/NumpadStyle$Typography;)V", "getColors", "()Lcom/robinhood/compose/theme/style/NumpadStyle$Colors;", "getSpacing", "()Lcom/robinhood/compose/theme/style/NumpadStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/NumpadStyle$Typography;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Spacing", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NumpadStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ NumpadStyle copy$default(NumpadStyle numpadStyle, Colors colors, Spacing spacing, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = numpadStyle.colors;
        }
        if ((i & 2) != 0) {
            spacing = numpadStyle.spacing;
        }
        if ((i & 4) != 0) {
            typography = numpadStyle.typography;
        }
        return numpadStyle.copy(colors, spacing, typography);
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

    public final NumpadStyle copy(Colors colors, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new NumpadStyle(colors, spacing, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumpadStyle)) {
            return false;
        }
        NumpadStyle numpadStyle = (NumpadStyle) other;
        return Intrinsics.areEqual(this.colors, numpadStyle.colors) && Intrinsics.areEqual(this.spacing, numpadStyle.spacing) && Intrinsics.areEqual(this.typography, numpadStyle.typography);
    }

    public int hashCode() {
        return (((this.colors.hashCode() * 31) + this.spacing.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "NumpadStyle(colors=" + this.colors + ", spacing=" + this.spacing + ", typography=" + this.typography + ")";
    }

    public NumpadStyle(Colors colors, Spacing spacing, Typography typography) {
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

    /* compiled from: NumpadStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NumpadStyle$Colors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContentColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/theme/style/NumpadStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final long contentColor;
        private final long disabledContentColor;

        public /* synthetic */ Colors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3);
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Colors m21868copyysEtTa8$default(Colors colors, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.backgroundColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = colors.contentColor;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = colors.disabledContentColor;
            }
            return colors.m21872copyysEtTa8(j4, j5, j3);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getContentColor() {
            return this.contentColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledContentColor() {
            return this.disabledContentColor;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Colors m21872copyysEtTa8(long backgroundColor, long contentColor, long disabledContentColor) {
            return new Colors(backgroundColor, contentColor, disabledContentColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.backgroundColor, colors.backgroundColor) && Color.m6707equalsimpl0(this.contentColor, colors.contentColor) && Color.m6707equalsimpl0(this.disabledContentColor, colors.disabledContentColor);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.contentColor)) * 31) + Color.m6713hashCodeimpl(this.disabledContentColor);
        }

        public String toString() {
            return "Colors(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", contentColor=" + Color.m6714toStringimpl(this.contentColor) + ", disabledContentColor=" + Color.m6714toStringimpl(this.disabledContentColor) + ")";
        }

        private Colors(long j, long j2, long j3) {
            this.backgroundColor = j;
            this.contentColor = j2;
            this.disabledContentColor = j3;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21873getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m21874getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
        public final long m21875getDisabledContentColor0d7_KjU() {
            return this.disabledContentColor;
        }
    }

    /* compiled from: NumpadStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NumpadStyle$Spacing;", "", "ctaButtonPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getCtaButtonPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final PaddingValues ctaButtonPadding;

        public static /* synthetic */ Spacing copy$default(Spacing spacing, PaddingValues paddingValues, int i, Object obj) {
            if ((i & 1) != 0) {
                paddingValues = spacing.ctaButtonPadding;
            }
            return spacing.copy(paddingValues);
        }

        /* renamed from: component1, reason: from getter */
        public final PaddingValues getCtaButtonPadding() {
            return this.ctaButtonPadding;
        }

        public final Spacing copy(PaddingValues ctaButtonPadding) {
            Intrinsics.checkNotNullParameter(ctaButtonPadding, "ctaButtonPadding");
            return new Spacing(ctaButtonPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Spacing) && Intrinsics.areEqual(this.ctaButtonPadding, ((Spacing) other).ctaButtonPadding);
        }

        public int hashCode() {
            return this.ctaButtonPadding.hashCode();
        }

        public String toString() {
            return "Spacing(ctaButtonPadding=" + this.ctaButtonPadding + ")";
        }

        public Spacing(PaddingValues ctaButtonPadding) {
            Intrinsics.checkNotNullParameter(ctaButtonPadding, "ctaButtonPadding");
            this.ctaButtonPadding = ctaButtonPadding;
        }

        public final PaddingValues getCtaButtonPadding() {
            return this.ctaButtonPadding;
        }
    }

    /* compiled from: NumpadStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NumpadStyle$Typography;", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "customKeyTextStyle", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getCustomKeyTextStyle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle customKeyTextStyle;
        private final androidx.compose.p011ui.text.TextStyle textStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.textStyle;
            }
            if ((i & 2) != 0) {
                textStyle2 = typography.customKeyTextStyle;
            }
            return typography.copy(textStyle, textStyle2);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getCustomKeyTextStyle() {
            return this.customKeyTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle customKeyTextStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            Intrinsics.checkNotNullParameter(customKeyTextStyle, "customKeyTextStyle");
            return new Typography(textStyle, customKeyTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.textStyle, typography.textStyle) && Intrinsics.areEqual(this.customKeyTextStyle, typography.customKeyTextStyle);
        }

        public int hashCode() {
            return (this.textStyle.hashCode() * 31) + this.customKeyTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(textStyle=" + this.textStyle + ", customKeyTextStyle=" + this.customKeyTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle customKeyTextStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            Intrinsics.checkNotNullParameter(customKeyTextStyle, "customKeyTextStyle");
            this.textStyle = textStyle;
            this.customKeyTextStyle = customKeyTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getCustomKeyTextStyle() {
            return this.customKeyTextStyle;
        }
    }
}
