package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/RowStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/RowStyle$Colors;", "typography", "Lcom/robinhood/compose/theme/style/RowStyle$Typography;", "<init>", "(Lcom/robinhood/compose/theme/style/RowStyle$Colors;Lcom/robinhood/compose/theme/style/RowStyle$Typography;)V", "getColors", "()Lcom/robinhood/compose/theme/style/RowStyle$Colors;", "getTypography", "()Lcom/robinhood/compose/theme/style/RowStyle$Typography;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RowStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Typography typography;

    public static /* synthetic */ RowStyle copy$default(RowStyle rowStyle, Colors colors, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = rowStyle.colors;
        }
        if ((i & 2) != 0) {
            typography = rowStyle.typography;
        }
        return rowStyle.copy(colors, typography);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    public final RowStyle copy(Colors colors, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new RowStyle(colors, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowStyle)) {
            return false;
        }
        RowStyle rowStyle = (RowStyle) other;
        return Intrinsics.areEqual(this.colors, rowStyle.colors) && Intrinsics.areEqual(this.typography, rowStyle.typography);
    }

    public int hashCode() {
        return (this.colors.hashCode() * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "RowStyle(colors=" + this.colors + ", typography=" + this.typography + ")";
    }

    public RowStyle(Colors colors, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(typography, "typography");
        this.colors = colors;
        this.typography = typography;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    /* compiled from: RowStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000bJD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/RowStyle$Colors;", "", "primaryTextColor", "Landroidx/compose/ui/graphics/Color;", "secondaryTextColor", "disabledColor", "dividerColor", "caretColor", "<init>", "(JJJLandroidx/compose/ui/graphics/Color;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPrimaryTextColor-0d7_KjU", "()J", "J", "getSecondaryTextColor-0d7_KjU", "getDisabledColor-0d7_KjU", "getDividerColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getCaretColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-QN2ZGVo", "component5", "component5-0d7_KjU", "copy", "copy-2dG9hJU", "(JJJLandroidx/compose/ui/graphics/Color;J)Lcom/robinhood/compose/theme/style/RowStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long caretColor;
        private final long disabledColor;
        private final Color dividerColor;
        private final long primaryTextColor;
        private final long secondaryTextColor;

        public /* synthetic */ Colors(long j, long j2, long j3, Color color, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, color, j4);
        }

        /* renamed from: copy-2dG9hJU$default, reason: not valid java name */
        public static /* synthetic */ Colors m21918copy2dG9hJU$default(Colors colors, long j, long j2, long j3, Color color, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.primaryTextColor;
            }
            long j5 = j;
            if ((i & 2) != 0) {
                j2 = colors.secondaryTextColor;
            }
            return colors.m21924copy2dG9hJU(j5, j2, (i & 4) != 0 ? colors.disabledColor : j3, (i & 8) != 0 ? colors.dividerColor : color, (i & 16) != 0 ? colors.caretColor : j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimaryTextColor() {
            return this.primaryTextColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondaryTextColor() {
            return this.secondaryTextColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getDividerColor() {
            return this.dividerColor;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCaretColor() {
            return this.caretColor;
        }

        /* renamed from: copy-2dG9hJU, reason: not valid java name */
        public final Colors m21924copy2dG9hJU(long primaryTextColor, long secondaryTextColor, long disabledColor, Color dividerColor, long caretColor) {
            return new Colors(primaryTextColor, secondaryTextColor, disabledColor, dividerColor, caretColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.primaryTextColor, colors.primaryTextColor) && Color.m6707equalsimpl0(this.secondaryTextColor, colors.secondaryTextColor) && Color.m6707equalsimpl0(this.disabledColor, colors.disabledColor) && Intrinsics.areEqual(this.dividerColor, colors.dividerColor) && Color.m6707equalsimpl0(this.caretColor, colors.caretColor);
        }

        public int hashCode() {
            int iM6713hashCodeimpl = ((((Color.m6713hashCodeimpl(this.primaryTextColor) * 31) + Color.m6713hashCodeimpl(this.secondaryTextColor)) * 31) + Color.m6713hashCodeimpl(this.disabledColor)) * 31;
            Color color = this.dividerColor;
            return ((iM6713hashCodeimpl + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31) + Color.m6713hashCodeimpl(this.caretColor);
        }

        public String toString() {
            return "Colors(primaryTextColor=" + Color.m6714toStringimpl(this.primaryTextColor) + ", secondaryTextColor=" + Color.m6714toStringimpl(this.secondaryTextColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ", dividerColor=" + this.dividerColor + ", caretColor=" + Color.m6714toStringimpl(this.caretColor) + ")";
        }

        private Colors(long j, long j2, long j3, Color color, long j4) {
            this.primaryTextColor = j;
            this.secondaryTextColor = j2;
            this.disabledColor = j3;
            this.dividerColor = color;
            this.caretColor = j4;
        }

        /* renamed from: getPrimaryTextColor-0d7_KjU, reason: not valid java name */
        public final long m21928getPrimaryTextColor0d7_KjU() {
            return this.primaryTextColor;
        }

        /* renamed from: getSecondaryTextColor-0d7_KjU, reason: not valid java name */
        public final long m21929getSecondaryTextColor0d7_KjU() {
            return this.secondaryTextColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21926getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        /* renamed from: getDividerColor-QN2ZGVo, reason: not valid java name */
        public final Color m21927getDividerColorQN2ZGVo() {
            return this.dividerColor;
        }

        /* renamed from: getCaretColor-0d7_KjU, reason: not valid java name */
        public final long m21925getCaretColor0d7_KjU() {
            return this.caretColor;
        }
    }

    /* compiled from: RowStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/RowStyle$Typography;", "", "primaryTextStyle", "Landroidx/compose/ui/text/TextStyle;", "secondaryTextStyle", "ctaTextStyle", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getPrimaryTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getSecondaryTextStyle", "getCtaTextStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle ctaTextStyle;
        private final androidx.compose.p011ui.text.TextStyle primaryTextStyle;
        private final androidx.compose.p011ui.text.TextStyle secondaryTextStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, androidx.compose.p011ui.text.TextStyle textStyle3, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.primaryTextStyle;
            }
            if ((i & 2) != 0) {
                textStyle2 = typography.secondaryTextStyle;
            }
            if ((i & 4) != 0) {
                textStyle3 = typography.ctaTextStyle;
            }
            return typography.copy(textStyle, textStyle2, textStyle3);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getPrimaryTextStyle() {
            return this.primaryTextStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getSecondaryTextStyle() {
            return this.secondaryTextStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getCtaTextStyle() {
            return this.ctaTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle primaryTextStyle, androidx.compose.p011ui.text.TextStyle secondaryTextStyle, androidx.compose.p011ui.text.TextStyle ctaTextStyle) {
            Intrinsics.checkNotNullParameter(primaryTextStyle, "primaryTextStyle");
            Intrinsics.checkNotNullParameter(secondaryTextStyle, "secondaryTextStyle");
            Intrinsics.checkNotNullParameter(ctaTextStyle, "ctaTextStyle");
            return new Typography(primaryTextStyle, secondaryTextStyle, ctaTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.primaryTextStyle, typography.primaryTextStyle) && Intrinsics.areEqual(this.secondaryTextStyle, typography.secondaryTextStyle) && Intrinsics.areEqual(this.ctaTextStyle, typography.ctaTextStyle);
        }

        public int hashCode() {
            return (((this.primaryTextStyle.hashCode() * 31) + this.secondaryTextStyle.hashCode()) * 31) + this.ctaTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(primaryTextStyle=" + this.primaryTextStyle + ", secondaryTextStyle=" + this.secondaryTextStyle + ", ctaTextStyle=" + this.ctaTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle primaryTextStyle, androidx.compose.p011ui.text.TextStyle secondaryTextStyle, androidx.compose.p011ui.text.TextStyle ctaTextStyle) {
            Intrinsics.checkNotNullParameter(primaryTextStyle, "primaryTextStyle");
            Intrinsics.checkNotNullParameter(secondaryTextStyle, "secondaryTextStyle");
            Intrinsics.checkNotNullParameter(ctaTextStyle, "ctaTextStyle");
            this.primaryTextStyle = primaryTextStyle;
            this.secondaryTextStyle = secondaryTextStyle;
            this.ctaTextStyle = ctaTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getPrimaryTextStyle() {
            return this.primaryTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getSecondaryTextStyle() {
            return this.secondaryTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getCtaTextStyle() {
            return this.ctaTextStyle;
        }
    }
}
