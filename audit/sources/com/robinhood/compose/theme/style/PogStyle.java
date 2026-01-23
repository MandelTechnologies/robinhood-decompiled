package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PogStyle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/PogStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "textStyle", "Lcom/robinhood/compose/theme/style/PogStyle$PogTextStyle;", "<init>", "(Lcom/robinhood/compose/theme/style/PogStyle$PogColors;Lcom/robinhood/compose/theme/style/PogStyle$PogTextStyle;)V", "getColors", "()Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "getTextStyle", "()Lcom/robinhood/compose/theme/style/PogStyle$PogTextStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PogTextStyle", "PogColors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PogStyle {
    public static final int $stable = 0;
    private final PogColors colors;
    private final PogTextStyle textStyle;

    public static /* synthetic */ PogStyle copy$default(PogStyle pogStyle, PogColors pogColors, PogTextStyle pogTextStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            pogColors = pogStyle.colors;
        }
        if ((i & 2) != 0) {
            pogTextStyle = pogStyle.textStyle;
        }
        return pogStyle.copy(pogColors, pogTextStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final PogColors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final PogTextStyle getTextStyle() {
        return this.textStyle;
    }

    public final PogStyle copy(PogColors colors, PogTextStyle textStyle) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return new PogStyle(colors, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PogStyle)) {
            return false;
        }
        PogStyle pogStyle = (PogStyle) other;
        return Intrinsics.areEqual(this.colors, pogStyle.colors) && Intrinsics.areEqual(this.textStyle, pogStyle.textStyle);
    }

    public int hashCode() {
        return (this.colors.hashCode() * 31) + this.textStyle.hashCode();
    }

    public String toString() {
        return "PogStyle(colors=" + this.colors + ", textStyle=" + this.textStyle + ")";
    }

    public PogStyle(PogColors colors, PogTextStyle textStyle) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.colors = colors;
        this.textStyle = textStyle;
    }

    public final PogColors getColors() {
        return this.colors;
    }

    public final PogTextStyle getTextStyle() {
        return this.textStyle;
    }

    /* compiled from: PogStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/PogStyle$PogTextStyle;", "", "standard", "Landroidx/compose/ui/text/TextStyle;", "hero", "extraLarge", "extraSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getStandard", "()Landroidx/compose/ui/text/TextStyle;", "getHero", "getExtraLarge", "getExtraSmall", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PogTextStyle {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle extraLarge;
        private final androidx.compose.p011ui.text.TextStyle extraSmall;
        private final androidx.compose.p011ui.text.TextStyle hero;
        private final androidx.compose.p011ui.text.TextStyle standard;

        public static /* synthetic */ PogTextStyle copy$default(PogTextStyle pogTextStyle, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, androidx.compose.p011ui.text.TextStyle textStyle3, androidx.compose.p011ui.text.TextStyle textStyle4, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = pogTextStyle.standard;
            }
            if ((i & 2) != 0) {
                textStyle2 = pogTextStyle.hero;
            }
            if ((i & 4) != 0) {
                textStyle3 = pogTextStyle.extraLarge;
            }
            if ((i & 8) != 0) {
                textStyle4 = pogTextStyle.extraSmall;
            }
            return pogTextStyle.copy(textStyle, textStyle2, textStyle3, textStyle4);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getStandard() {
            return this.standard;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getHero() {
            return this.hero;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getExtraLarge() {
            return this.extraLarge;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getExtraSmall() {
            return this.extraSmall;
        }

        public final PogTextStyle copy(androidx.compose.p011ui.text.TextStyle standard, androidx.compose.p011ui.text.TextStyle hero, androidx.compose.p011ui.text.TextStyle extraLarge, androidx.compose.p011ui.text.TextStyle extraSmall) {
            Intrinsics.checkNotNullParameter(standard, "standard");
            Intrinsics.checkNotNullParameter(hero, "hero");
            Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
            Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
            return new PogTextStyle(standard, hero, extraLarge, extraSmall);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PogTextStyle)) {
                return false;
            }
            PogTextStyle pogTextStyle = (PogTextStyle) other;
            return Intrinsics.areEqual(this.standard, pogTextStyle.standard) && Intrinsics.areEqual(this.hero, pogTextStyle.hero) && Intrinsics.areEqual(this.extraLarge, pogTextStyle.extraLarge) && Intrinsics.areEqual(this.extraSmall, pogTextStyle.extraSmall);
        }

        public int hashCode() {
            return (((((this.standard.hashCode() * 31) + this.hero.hashCode()) * 31) + this.extraLarge.hashCode()) * 31) + this.extraSmall.hashCode();
        }

        public String toString() {
            return "PogTextStyle(standard=" + this.standard + ", hero=" + this.hero + ", extraLarge=" + this.extraLarge + ", extraSmall=" + this.extraSmall + ")";
        }

        public PogTextStyle(androidx.compose.p011ui.text.TextStyle standard, androidx.compose.p011ui.text.TextStyle hero, androidx.compose.p011ui.text.TextStyle extraLarge, androidx.compose.p011ui.text.TextStyle extraSmall) {
            Intrinsics.checkNotNullParameter(standard, "standard");
            Intrinsics.checkNotNullParameter(hero, "hero");
            Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
            Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
            this.standard = standard;
            this.hero = hero;
            this.extraLarge = extraLarge;
            this.extraSmall = extraSmall;
        }

        public final androidx.compose.p011ui.text.TextStyle getStandard() {
            return this.standard;
        }

        public final androidx.compose.p011ui.text.TextStyle getHero() {
            return this.hero;
        }

        public final androidx.compose.p011ui.text.TextStyle getExtraLarge() {
            return this.extraLarge;
        }

        public final androidx.compose.p011ui.text.TextStyle getExtraSmall() {
            return this.extraSmall;
        }
    }

    /* compiled from: PogStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u000bJB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "", "foregroundEnabled", "Landroidx/compose/ui/graphics/Color;", "backgroundEnabled", "foregroundDisabled", "backgroundDisabled", "borderColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getForegroundEnabled-0d7_KjU", "()J", "J", "getBackgroundEnabled-0d7_KjU", "getForegroundDisabled-0d7_KjU", "getBackgroundDisabled-0d7_KjU", "getBorderColor-0d7_KjU", "foreground", "isEnabled", "", "colorOverride", "foreground-CY1FfXs", "(ZLandroidx/compose/ui/graphics/Color;)J", "background", "background-CY1FfXs", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PogColors {
        public static final int $stable = 0;
        private final long backgroundDisabled;
        private final long backgroundEnabled;
        private final long borderColor;
        private final long foregroundDisabled;
        private final long foregroundEnabled;

        public /* synthetic */ PogColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5);
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ PogColors m21882copyt635Npw$default(PogColors pogColors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pogColors.foregroundEnabled;
            }
            long j6 = j;
            if ((i & 2) != 0) {
                j2 = pogColors.backgroundEnabled;
            }
            return pogColors.m21889copyt635Npw(j6, j2, (i & 4) != 0 ? pogColors.foregroundDisabled : j3, (i & 8) != 0 ? pogColors.backgroundDisabled : j4, (i & 16) != 0 ? pogColors.borderColor : j5);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getForegroundEnabled() {
            return this.foregroundEnabled;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getForegroundDisabled() {
            return this.foregroundDisabled;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundDisabled() {
            return this.backgroundDisabled;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final PogColors m21889copyt635Npw(long foregroundEnabled, long backgroundEnabled, long foregroundDisabled, long backgroundDisabled, long borderColor) {
            return new PogColors(foregroundEnabled, backgroundEnabled, foregroundDisabled, backgroundDisabled, borderColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PogColors)) {
                return false;
            }
            PogColors pogColors = (PogColors) other;
            return Color.m6707equalsimpl0(this.foregroundEnabled, pogColors.foregroundEnabled) && Color.m6707equalsimpl0(this.backgroundEnabled, pogColors.backgroundEnabled) && Color.m6707equalsimpl0(this.foregroundDisabled, pogColors.foregroundDisabled) && Color.m6707equalsimpl0(this.backgroundDisabled, pogColors.backgroundDisabled) && Color.m6707equalsimpl0(this.borderColor, pogColors.borderColor);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.foregroundEnabled) * 31) + Color.m6713hashCodeimpl(this.backgroundEnabled)) * 31) + Color.m6713hashCodeimpl(this.foregroundDisabled)) * 31) + Color.m6713hashCodeimpl(this.backgroundDisabled)) * 31) + Color.m6713hashCodeimpl(this.borderColor);
        }

        public String toString() {
            return "PogColors(foregroundEnabled=" + Color.m6714toStringimpl(this.foregroundEnabled) + ", backgroundEnabled=" + Color.m6714toStringimpl(this.backgroundEnabled) + ", foregroundDisabled=" + Color.m6714toStringimpl(this.foregroundDisabled) + ", backgroundDisabled=" + Color.m6714toStringimpl(this.backgroundDisabled) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ")";
        }

        private PogColors(long j, long j2, long j3, long j4, long j5) {
            this.foregroundEnabled = j;
            this.backgroundEnabled = j2;
            this.foregroundDisabled = j3;
            this.backgroundDisabled = j4;
            this.borderColor = j5;
        }

        /* renamed from: getForegroundEnabled-0d7_KjU, reason: not valid java name */
        public final long m21895getForegroundEnabled0d7_KjU() {
            return this.foregroundEnabled;
        }

        /* renamed from: getBackgroundEnabled-0d7_KjU, reason: not valid java name */
        public final long m21892getBackgroundEnabled0d7_KjU() {
            return this.backgroundEnabled;
        }

        /* renamed from: getForegroundDisabled-0d7_KjU, reason: not valid java name */
        public final long m21894getForegroundDisabled0d7_KjU() {
            return this.foregroundDisabled;
        }

        /* renamed from: getBackgroundDisabled-0d7_KjU, reason: not valid java name */
        public final long m21891getBackgroundDisabled0d7_KjU() {
            return this.backgroundDisabled;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
        public final long m21893getBorderColor0d7_KjU() {
            return this.borderColor;
        }

        /* renamed from: foreground-CY1FfXs, reason: not valid java name */
        public final long m21890foregroundCY1FfXs(boolean isEnabled, Color colorOverride) {
            if (isEnabled) {
                return colorOverride != null ? colorOverride.getValue() : this.foregroundEnabled;
            }
            return this.foregroundDisabled;
        }

        /* renamed from: background-CY1FfXs, reason: not valid java name */
        public final long m21883backgroundCY1FfXs(boolean isEnabled, Color colorOverride) {
            if (isEnabled) {
                return colorOverride != null ? colorOverride.getValue() : this.backgroundEnabled;
            }
            return this.backgroundDisabled;
        }
    }
}
