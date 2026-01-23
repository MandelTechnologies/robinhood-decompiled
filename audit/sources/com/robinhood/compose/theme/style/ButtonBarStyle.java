package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonBarStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/ButtonBarStyle$Colors;", "spacing", "Lcom/robinhood/compose/theme/style/ButtonBarStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/ButtonBarStyle$Typography;", "<init>", "(Lcom/robinhood/compose/theme/style/ButtonBarStyle$Colors;Lcom/robinhood/compose/theme/style/ButtonBarStyle$Spacing;Lcom/robinhood/compose/theme/style/ButtonBarStyle$Typography;)V", "getColors", "()Lcom/robinhood/compose/theme/style/ButtonBarStyle$Colors;", "getSpacing", "()Lcom/robinhood/compose/theme/style/ButtonBarStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/ButtonBarStyle$Typography;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Spacing", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ButtonBarStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ ButtonBarStyle copy$default(ButtonBarStyle buttonBarStyle, Colors colors, Spacing spacing, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = buttonBarStyle.colors;
        }
        if ((i & 2) != 0) {
            spacing = buttonBarStyle.spacing;
        }
        if ((i & 4) != 0) {
            typography = buttonBarStyle.typography;
        }
        return buttonBarStyle.copy(colors, spacing, typography);
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

    public final ButtonBarStyle copy(Colors colors, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new ButtonBarStyle(colors, spacing, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBarStyle)) {
            return false;
        }
        ButtonBarStyle buttonBarStyle = (ButtonBarStyle) other;
        return Intrinsics.areEqual(this.colors, buttonBarStyle.colors) && Intrinsics.areEqual(this.spacing, buttonBarStyle.spacing) && Intrinsics.areEqual(this.typography, buttonBarStyle.typography);
    }

    public int hashCode() {
        return (((this.colors.hashCode() * 31) + this.spacing.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "ButtonBarStyle(colors=" + this.colors + ", spacing=" + this.spacing + ", typography=" + this.typography + ")";
    }

    public ButtonBarStyle(Colors colors, Spacing spacing, Typography typography) {
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

    /* compiled from: ButtonBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ButtonBarStyle$Colors;", "", "helperText", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHelperText-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/compose/theme/style/ButtonBarStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long helperText;

        public /* synthetic */ Colors(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Colors m21694copy8_81llA$default(Colors colors, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.helperText;
            }
            return colors.m21696copy8_81llA(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getHelperText() {
            return this.helperText;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Colors m21696copy8_81llA(long helperText) {
            return new Colors(helperText, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Colors) && Color.m6707equalsimpl0(this.helperText, ((Colors) other).helperText);
        }

        public int hashCode() {
            return Color.m6713hashCodeimpl(this.helperText);
        }

        public String toString() {
            return "Colors(helperText=" + Color.m6714toStringimpl(this.helperText) + ")";
        }

        private Colors(long j) {
            this.helperText = j;
        }

        /* renamed from: getHelperText-0d7_KjU, reason: not valid java name */
        public final long m21697getHelperText0d7_KjU() {
            return this.helperText;
        }
    }

    /* compiled from: ButtonBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ButtonBarStyle$Spacing;", "", "verticalPadding", "Landroidx/compose/ui/unit/Dp;", "helperTextButtonStack", "verticalButtonStackSpacing", "horizontalButtonStackSpacing", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getVerticalPadding-D9Ej5fM", "()F", "F", "getHelperTextButtonStack-D9Ej5fM", "getVerticalButtonStackSpacing-D9Ej5fM", "getHorizontalButtonStackSpacing-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Lcom/robinhood/compose/theme/style/ButtonBarStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final float helperTextButtonStack;
        private final float horizontalButtonStackSpacing;
        private final float verticalButtonStackSpacing;
        private final float verticalPadding;

        public /* synthetic */ Spacing(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4);
        }

        /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21698copya9UjIt4$default(Spacing spacing, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.verticalPadding;
            }
            if ((i & 2) != 0) {
                f2 = spacing.helperTextButtonStack;
            }
            if ((i & 4) != 0) {
                f3 = spacing.verticalButtonStackSpacing;
            }
            if ((i & 8) != 0) {
                f4 = spacing.horizontalButtonStackSpacing;
            }
            return spacing.m21703copya9UjIt4(f, f2, f3, f4);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalPadding() {
            return this.verticalPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHelperTextButtonStack() {
            return this.helperTextButtonStack;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalButtonStackSpacing() {
            return this.verticalButtonStackSpacing;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalButtonStackSpacing() {
            return this.horizontalButtonStackSpacing;
        }

        /* renamed from: copy-a9UjIt4, reason: not valid java name */
        public final Spacing m21703copya9UjIt4(float verticalPadding, float helperTextButtonStack, float verticalButtonStackSpacing, float horizontalButtonStackSpacing) {
            return new Spacing(verticalPadding, helperTextButtonStack, verticalButtonStackSpacing, horizontalButtonStackSpacing, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return C2002Dp.m7997equalsimpl0(this.verticalPadding, spacing.verticalPadding) && C2002Dp.m7997equalsimpl0(this.helperTextButtonStack, spacing.helperTextButtonStack) && C2002Dp.m7997equalsimpl0(this.verticalButtonStackSpacing, spacing.verticalButtonStackSpacing) && C2002Dp.m7997equalsimpl0(this.horizontalButtonStackSpacing, spacing.horizontalButtonStackSpacing);
        }

        public int hashCode() {
            return (((((C2002Dp.m7998hashCodeimpl(this.verticalPadding) * 31) + C2002Dp.m7998hashCodeimpl(this.helperTextButtonStack)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalButtonStackSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.horizontalButtonStackSpacing);
        }

        public String toString() {
            return "Spacing(verticalPadding=" + C2002Dp.m7999toStringimpl(this.verticalPadding) + ", helperTextButtonStack=" + C2002Dp.m7999toStringimpl(this.helperTextButtonStack) + ", verticalButtonStackSpacing=" + C2002Dp.m7999toStringimpl(this.verticalButtonStackSpacing) + ", horizontalButtonStackSpacing=" + C2002Dp.m7999toStringimpl(this.horizontalButtonStackSpacing) + ")";
        }

        private Spacing(float f, float f2, float f3, float f4) {
            this.verticalPadding = f;
            this.helperTextButtonStack = f2;
            this.verticalButtonStackSpacing = f3;
            this.horizontalButtonStackSpacing = f4;
        }

        /* renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
        public final float m21707getVerticalPaddingD9Ej5fM() {
            return this.verticalPadding;
        }

        /* renamed from: getHelperTextButtonStack-D9Ej5fM, reason: not valid java name */
        public final float m21704getHelperTextButtonStackD9Ej5fM() {
            return this.helperTextButtonStack;
        }

        /* renamed from: getVerticalButtonStackSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21706getVerticalButtonStackSpacingD9Ej5fM() {
            return this.verticalButtonStackSpacing;
        }

        /* renamed from: getHorizontalButtonStackSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21705getHorizontalButtonStackSpacingD9Ej5fM() {
            return this.horizontalButtonStackSpacing;
        }
    }

    /* compiled from: ButtonBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/ButtonBarStyle$Typography;", "", "helperTextStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Landroidx/compose/ui/text/TextStyle;)V", "getHelperTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle helperTextStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.helperTextStyle;
            }
            return typography.copy(textStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getHelperTextStyle() {
            return this.helperTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle helperTextStyle) {
            Intrinsics.checkNotNullParameter(helperTextStyle, "helperTextStyle");
            return new Typography(helperTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Typography) && Intrinsics.areEqual(this.helperTextStyle, ((Typography) other).helperTextStyle);
        }

        public int hashCode() {
            return this.helperTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(helperTextStyle=" + this.helperTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle helperTextStyle) {
            Intrinsics.checkNotNullParameter(helperTextStyle, "helperTextStyle");
            this.helperTextStyle = helperTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getHelperTextStyle() {
            return this.helperTextStyle;
        }
    }
}
