package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardStackStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationEndCardStyle;", "", "padding", "Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Padding;", "colors", "Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Colors;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Padding;Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Colors;Landroidx/compose/ui/text/TextStyle;)V", "getPadding", "()Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Padding;", "getColors", "()Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Colors;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Padding", "Colors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationEndCardStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Padding padding;
    private final androidx.compose.p011ui.text.TextStyle textStyle;

    public static /* synthetic */ NotificationEndCardStyle copy$default(NotificationEndCardStyle notificationEndCardStyle, Padding padding, Colors colors, androidx.compose.p011ui.text.TextStyle textStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            padding = notificationEndCardStyle.padding;
        }
        if ((i & 2) != 0) {
            colors = notificationEndCardStyle.colors;
        }
        if ((i & 4) != 0) {
            textStyle = notificationEndCardStyle.textStyle;
        }
        return notificationEndCardStyle.copy(padding, colors, textStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    /* renamed from: component2, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
        return this.textStyle;
    }

    public final NotificationEndCardStyle copy(Padding padding, Colors colors, androidx.compose.p011ui.text.TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return new NotificationEndCardStyle(padding, colors, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationEndCardStyle)) {
            return false;
        }
        NotificationEndCardStyle notificationEndCardStyle = (NotificationEndCardStyle) other;
        return Intrinsics.areEqual(this.padding, notificationEndCardStyle.padding) && Intrinsics.areEqual(this.colors, notificationEndCardStyle.colors) && Intrinsics.areEqual(this.textStyle, notificationEndCardStyle.textStyle);
    }

    public int hashCode() {
        return (((this.padding.hashCode() * 31) + this.colors.hashCode()) * 31) + this.textStyle.hashCode();
    }

    public String toString() {
        return "NotificationEndCardStyle(padding=" + this.padding + ", colors=" + this.colors + ", textStyle=" + this.textStyle + ")";
    }

    public NotificationEndCardStyle(Padding padding, Colors colors, androidx.compose.p011ui.text.TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.padding = padding;
        this.colors = colors;
        this.textStyle = textStyle;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* compiled from: CardStackStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Padding;", "", "verticalPadding", "Landroidx/compose/ui/unit/Dp;", "horizontalPadding", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getVerticalPadding-D9Ej5fM", "()F", "F", "getHorizontalPadding-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Padding;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Padding {
        public static final int $stable = 0;
        private final float horizontalPadding;
        private final float verticalPadding;

        public /* synthetic */ Padding(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ Padding m21862copyYgX7TsA$default(Padding padding, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = padding.verticalPadding;
            }
            if ((i & 2) != 0) {
                f2 = padding.horizontalPadding;
            }
            return padding.m21865copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalPadding() {
            return this.verticalPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalPadding() {
            return this.horizontalPadding;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final Padding m21865copyYgX7TsA(float verticalPadding, float horizontalPadding) {
            return new Padding(verticalPadding, horizontalPadding, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Padding)) {
                return false;
            }
            Padding padding = (Padding) other;
            return C2002Dp.m7997equalsimpl0(this.verticalPadding, padding.verticalPadding) && C2002Dp.m7997equalsimpl0(this.horizontalPadding, padding.horizontalPadding);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.verticalPadding) * 31) + C2002Dp.m7998hashCodeimpl(this.horizontalPadding);
        }

        public String toString() {
            return "Padding(verticalPadding=" + C2002Dp.m7999toStringimpl(this.verticalPadding) + ", horizontalPadding=" + C2002Dp.m7999toStringimpl(this.horizontalPadding) + ")";
        }

        private Padding(float f, float f2) {
            this.verticalPadding = f;
            this.horizontalPadding = f2;
        }

        /* renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
        public final float m21867getVerticalPaddingD9Ej5fM() {
            return this.verticalPadding;
        }

        /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
        public final float m21866getHorizontalPaddingD9Ej5fM() {
            return this.horizontalPadding;
        }
    }

    /* compiled from: CardStackStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Colors;", "", "bgTopCardColor", "Landroidx/compose/ui/graphics/Color;", "bgHiddenColor", "borderColor", "textColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBgTopCardColor-0d7_KjU", "()J", "J", "getBgHiddenColor-0d7_KjU", "getBorderColor-0d7_KjU", "getTextColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Lcom/robinhood/compose/theme/style/NotificationEndCardStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long bgHiddenColor;
        private final long bgTopCardColor;
        private final long borderColor;
        private final long textColor;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4);
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Colors m21852copyjRlVdoo$default(Colors colors, long j, long j2, long j3, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.bgTopCardColor;
            }
            long j5 = j;
            if ((i & 2) != 0) {
                j2 = colors.bgHiddenColor;
            }
            long j6 = j2;
            if ((i & 4) != 0) {
                j3 = colors.borderColor;
            }
            return colors.m21857copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? colors.textColor : j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBgTopCardColor() {
            return this.bgTopCardColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBgHiddenColor() {
            return this.bgHiddenColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getTextColor() {
            return this.textColor;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Colors m21857copyjRlVdoo(long bgTopCardColor, long bgHiddenColor, long borderColor, long textColor) {
            return new Colors(bgTopCardColor, bgHiddenColor, borderColor, textColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.bgTopCardColor, colors.bgTopCardColor) && Color.m6707equalsimpl0(this.bgHiddenColor, colors.bgHiddenColor) && Color.m6707equalsimpl0(this.borderColor, colors.borderColor) && Color.m6707equalsimpl0(this.textColor, colors.textColor);
        }

        public int hashCode() {
            return (((((Color.m6713hashCodeimpl(this.bgTopCardColor) * 31) + Color.m6713hashCodeimpl(this.bgHiddenColor)) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + Color.m6713hashCodeimpl(this.textColor);
        }

        public String toString() {
            return "Colors(bgTopCardColor=" + Color.m6714toStringimpl(this.bgTopCardColor) + ", bgHiddenColor=" + Color.m6714toStringimpl(this.bgHiddenColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ")";
        }

        private Colors(long j, long j2, long j3, long j4) {
            this.bgTopCardColor = j;
            this.bgHiddenColor = j2;
            this.borderColor = j3;
            this.textColor = j4;
        }

        /* renamed from: getBgTopCardColor-0d7_KjU, reason: not valid java name */
        public final long m21859getBgTopCardColor0d7_KjU() {
            return this.bgTopCardColor;
        }

        /* renamed from: getBgHiddenColor-0d7_KjU, reason: not valid java name */
        public final long m21858getBgHiddenColor0d7_KjU() {
            return this.bgHiddenColor;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
        public final long m21860getBorderColor0d7_KjU() {
            return this.borderColor;
        }

        /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
        public final long m21861getTextColor0d7_KjU() {
            return this.textColor;
        }
    }
}
