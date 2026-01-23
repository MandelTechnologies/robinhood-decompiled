package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardStackStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationCardStyle;", "", "typography", "Lcom/robinhood/compose/theme/style/NotificationCardStyle$Typography;", "colors", "Lcom/robinhood/compose/theme/style/NotificationCardStyle$Colors;", "spacing", "Lcom/robinhood/compose/theme/style/NotificationCardStyle$Spacing;", "<init>", "(Lcom/robinhood/compose/theme/style/NotificationCardStyle$Typography;Lcom/robinhood/compose/theme/style/NotificationCardStyle$Colors;Lcom/robinhood/compose/theme/style/NotificationCardStyle$Spacing;)V", "getTypography", "()Lcom/robinhood/compose/theme/style/NotificationCardStyle$Typography;", "getColors", "()Lcom/robinhood/compose/theme/style/NotificationCardStyle$Colors;", "getSpacing", "()Lcom/robinhood/compose/theme/style/NotificationCardStyle$Spacing;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Typography", "Colors", "Spacing", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationCardStyle {
    public static final int $stable = 0;
    private final Colors colors;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ NotificationCardStyle copy$default(NotificationCardStyle notificationCardStyle, Typography typography, Colors colors, Spacing spacing, int i, Object obj) {
        if ((i & 1) != 0) {
            typography = notificationCardStyle.typography;
        }
        if ((i & 2) != 0) {
            colors = notificationCardStyle.colors;
        }
        if ((i & 4) != 0) {
            spacing = notificationCardStyle.spacing;
        }
        return notificationCardStyle.copy(typography, colors, spacing);
    }

    /* renamed from: component1, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    /* renamed from: component2, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component3, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    public final NotificationCardStyle copy(Typography typography, Colors colors, Spacing spacing) {
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        return new NotificationCardStyle(typography, colors, spacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationCardStyle)) {
            return false;
        }
        NotificationCardStyle notificationCardStyle = (NotificationCardStyle) other;
        return Intrinsics.areEqual(this.typography, notificationCardStyle.typography) && Intrinsics.areEqual(this.colors, notificationCardStyle.colors) && Intrinsics.areEqual(this.spacing, notificationCardStyle.spacing);
    }

    public int hashCode() {
        return (((this.typography.hashCode() * 31) + this.colors.hashCode()) * 31) + this.spacing.hashCode();
    }

    public String toString() {
        return "NotificationCardStyle(typography=" + this.typography + ", colors=" + this.colors + ", spacing=" + this.spacing + ")";
    }

    public NotificationCardStyle(Typography typography, Colors colors, Spacing spacing) {
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.typography = typography;
        this.colors = colors;
        this.spacing = spacing;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* compiled from: CardStackStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationCardStyle$Typography;", "", "title", "Landroidx/compose/ui/text/TextStyle;", "timeTextStyle", "messageLargeFont", "messageFont", "countTextStyle", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getTitle", "()Landroidx/compose/ui/text/TextStyle;", "getTimeTextStyle", "getMessageLargeFont", "getMessageFont", "getCountTextStyle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle countTextStyle;
        private final androidx.compose.p011ui.text.TextStyle messageFont;
        private final androidx.compose.p011ui.text.TextStyle messageLargeFont;
        private final androidx.compose.p011ui.text.TextStyle timeTextStyle;
        private final androidx.compose.p011ui.text.TextStyle title;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, androidx.compose.p011ui.text.TextStyle textStyle3, androidx.compose.p011ui.text.TextStyle textStyle4, androidx.compose.p011ui.text.TextStyle textStyle5, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.title;
            }
            if ((i & 2) != 0) {
                textStyle2 = typography.timeTextStyle;
            }
            if ((i & 4) != 0) {
                textStyle3 = typography.messageLargeFont;
            }
            if ((i & 8) != 0) {
                textStyle4 = typography.messageFont;
            }
            if ((i & 16) != 0) {
                textStyle5 = typography.countTextStyle;
            }
            androidx.compose.p011ui.text.TextStyle textStyle6 = textStyle5;
            androidx.compose.p011ui.text.TextStyle textStyle7 = textStyle3;
            return typography.copy(textStyle, textStyle2, textStyle7, textStyle4, textStyle6);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTimeTextStyle() {
            return this.timeTextStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getMessageLargeFont() {
            return this.messageLargeFont;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getMessageFont() {
            return this.messageFont;
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getCountTextStyle() {
            return this.countTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle title, androidx.compose.p011ui.text.TextStyle timeTextStyle, androidx.compose.p011ui.text.TextStyle messageLargeFont, androidx.compose.p011ui.text.TextStyle messageFont, androidx.compose.p011ui.text.TextStyle countTextStyle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(timeTextStyle, "timeTextStyle");
            Intrinsics.checkNotNullParameter(messageLargeFont, "messageLargeFont");
            Intrinsics.checkNotNullParameter(messageFont, "messageFont");
            Intrinsics.checkNotNullParameter(countTextStyle, "countTextStyle");
            return new Typography(title, timeTextStyle, messageLargeFont, messageFont, countTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.title, typography.title) && Intrinsics.areEqual(this.timeTextStyle, typography.timeTextStyle) && Intrinsics.areEqual(this.messageLargeFont, typography.messageLargeFont) && Intrinsics.areEqual(this.messageFont, typography.messageFont) && Intrinsics.areEqual(this.countTextStyle, typography.countTextStyle);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.timeTextStyle.hashCode()) * 31) + this.messageLargeFont.hashCode()) * 31) + this.messageFont.hashCode()) * 31) + this.countTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(title=" + this.title + ", timeTextStyle=" + this.timeTextStyle + ", messageLargeFont=" + this.messageLargeFont + ", messageFont=" + this.messageFont + ", countTextStyle=" + this.countTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle title, androidx.compose.p011ui.text.TextStyle timeTextStyle, androidx.compose.p011ui.text.TextStyle messageLargeFont, androidx.compose.p011ui.text.TextStyle messageFont, androidx.compose.p011ui.text.TextStyle countTextStyle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(timeTextStyle, "timeTextStyle");
            Intrinsics.checkNotNullParameter(messageLargeFont, "messageLargeFont");
            Intrinsics.checkNotNullParameter(messageFont, "messageFont");
            Intrinsics.checkNotNullParameter(countTextStyle, "countTextStyle");
            this.title = title;
            this.timeTextStyle = timeTextStyle;
            this.messageLargeFont = messageLargeFont;
            this.messageFont = messageFont;
            this.countTextStyle = countTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getTitle() {
            return this.title;
        }

        public final androidx.compose.p011ui.text.TextStyle getTimeTextStyle() {
            return this.timeTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getMessageLargeFont() {
            return this.messageLargeFont;
        }

        public final androidx.compose.p011ui.text.TextStyle getMessageFont() {
            return this.messageFont;
        }

        public final androidx.compose.p011ui.text.TextStyle getCountTextStyle() {
            return this.countTextStyle;
        }
    }

    /* compiled from: CardStackStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationCardStyle$Colors;", "", "contentTintColor", "Landroidx/compose/ui/graphics/Color;", "indicationColor", "borderColor", "messageColor", "ctaBtnColorOverride", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentTintColor-0d7_KjU", "()J", "J", "getIndicationColor-0d7_KjU", "getBorderColor-0d7_KjU", "getMessageColor-0d7_KjU", "getCtaBtnColorOverride-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/compose/theme/style/NotificationCardStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long borderColor;
        private final long contentTintColor;
        private final long ctaBtnColorOverride;
        private final long indicationColor;
        private final long messageColor;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5);
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ Colors m21818copyt635Npw$default(Colors colors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.contentTintColor;
            }
            long j6 = j;
            if ((i & 2) != 0) {
                j2 = colors.indicationColor;
            }
            return colors.m21824copyt635Npw(j6, j2, (i & 4) != 0 ? colors.borderColor : j3, (i & 8) != 0 ? colors.messageColor : j4, (i & 16) != 0 ? colors.ctaBtnColorOverride : j5);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getContentTintColor() {
            return this.contentTintColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getIndicationColor() {
            return this.indicationColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getMessageColor() {
            return this.messageColor;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCtaBtnColorOverride() {
            return this.ctaBtnColorOverride;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final Colors m21824copyt635Npw(long contentTintColor, long indicationColor, long borderColor, long messageColor, long ctaBtnColorOverride) {
            return new Colors(contentTintColor, indicationColor, borderColor, messageColor, ctaBtnColorOverride, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.contentTintColor, colors.contentTintColor) && Color.m6707equalsimpl0(this.indicationColor, colors.indicationColor) && Color.m6707equalsimpl0(this.borderColor, colors.borderColor) && Color.m6707equalsimpl0(this.messageColor, colors.messageColor) && Color.m6707equalsimpl0(this.ctaBtnColorOverride, colors.ctaBtnColorOverride);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.contentTintColor) * 31) + Color.m6713hashCodeimpl(this.indicationColor)) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + Color.m6713hashCodeimpl(this.messageColor)) * 31) + Color.m6713hashCodeimpl(this.ctaBtnColorOverride);
        }

        public String toString() {
            return "Colors(contentTintColor=" + Color.m6714toStringimpl(this.contentTintColor) + ", indicationColor=" + Color.m6714toStringimpl(this.indicationColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", messageColor=" + Color.m6714toStringimpl(this.messageColor) + ", ctaBtnColorOverride=" + Color.m6714toStringimpl(this.ctaBtnColorOverride) + ")";
        }

        private Colors(long j, long j2, long j3, long j4, long j5) {
            this.contentTintColor = j;
            this.indicationColor = j2;
            this.borderColor = j3;
            this.messageColor = j4;
            this.ctaBtnColorOverride = j5;
        }

        /* renamed from: getContentTintColor-0d7_KjU, reason: not valid java name */
        public final long m21826getContentTintColor0d7_KjU() {
            return this.contentTintColor;
        }

        /* renamed from: getIndicationColor-0d7_KjU, reason: not valid java name */
        public final long m21828getIndicationColor0d7_KjU() {
            return this.indicationColor;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
        public final long m21825getBorderColor0d7_KjU() {
            return this.borderColor;
        }

        /* renamed from: getMessageColor-0d7_KjU, reason: not valid java name */
        public final long m21829getMessageColor0d7_KjU() {
            return this.messageColor;
        }

        /* renamed from: getCtaBtnColorOverride-0d7_KjU, reason: not valid java name */
        public final long m21827getCtaBtnColorOverride0d7_KjU() {
            return this.ctaBtnColorOverride;
        }
    }

    /* compiled from: CardStackStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0010J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0010J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0010J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u0010J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u0010J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\u0010J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010\u0010J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\u0010Jt\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\f\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010¨\u00069"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NotificationCardStyle$Spacing;", "", "cardRadius", "Landroidx/compose/ui/unit/Dp;", "contentBottomSpacing", "defaultContentStartSpacing", "contentEndSpacing", "headerTopPadding", "headerHorizontalSpacing", "closeButtonPadding", "messageEndPadding", "ctaTopSpacing", "footerBottomExtraPadding", "<init>", "(FFFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCardRadius-D9Ej5fM", "()F", "F", "getContentBottomSpacing-D9Ej5fM", "getDefaultContentStartSpacing-D9Ej5fM", "getContentEndSpacing-D9Ej5fM", "getHeaderTopPadding-D9Ej5fM", "getHeaderHorizontalSpacing-D9Ej5fM", "getCloseButtonPadding-D9Ej5fM", "getMessageEndPadding-D9Ej5fM", "getCtaTopSpacing-D9Ej5fM", "getFooterBottomExtraPadding-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "component6", "component6-D9Ej5fM", "component7", "component7-D9Ej5fM", "component8", "component8-D9Ej5fM", "component9", "component9-D9Ej5fM", "component10", "component10-D9Ej5fM", "copy", "copy-ETLW93k", "(FFFFFFFFFF)Lcom/robinhood/compose/theme/style/NotificationCardStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final float cardRadius;
        private final float closeButtonPadding;
        private final float contentBottomSpacing;
        private final float contentEndSpacing;
        private final float ctaTopSpacing;
        private final float defaultContentStartSpacing;
        private final float footerBottomExtraPadding;
        private final float headerHorizontalSpacing;
        private final float headerTopPadding;
        private final float messageEndPadding;

        public /* synthetic */ Spacing(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10);
        }

        /* renamed from: copy-ETLW93k$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21830copyETLW93k$default(Spacing spacing, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.cardRadius;
            }
            if ((i & 2) != 0) {
                f2 = spacing.contentBottomSpacing;
            }
            if ((i & 4) != 0) {
                f3 = spacing.defaultContentStartSpacing;
            }
            if ((i & 8) != 0) {
                f4 = spacing.contentEndSpacing;
            }
            if ((i & 16) != 0) {
                f5 = spacing.headerTopPadding;
            }
            if ((i & 32) != 0) {
                f6 = spacing.headerHorizontalSpacing;
            }
            if ((i & 64) != 0) {
                f7 = spacing.closeButtonPadding;
            }
            if ((i & 128) != 0) {
                f8 = spacing.messageEndPadding;
            }
            if ((i & 256) != 0) {
                f9 = spacing.ctaTopSpacing;
            }
            if ((i & 512) != 0) {
                f10 = spacing.footerBottomExtraPadding;
            }
            float f11 = f9;
            float f12 = f10;
            float f13 = f7;
            float f14 = f8;
            float f15 = f5;
            float f16 = f6;
            return spacing.m21841copyETLW93k(f, f2, f3, f4, f15, f16, f13, f14, f11, f12);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCardRadius() {
            return this.cardRadius;
        }

        /* renamed from: component10-D9Ej5fM, reason: not valid java name and from getter */
        public final float getFooterBottomExtraPadding() {
            return this.footerBottomExtraPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getContentBottomSpacing() {
            return this.contentBottomSpacing;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getDefaultContentStartSpacing() {
            return this.defaultContentStartSpacing;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getContentEndSpacing() {
            return this.contentEndSpacing;
        }

        /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeaderTopPadding() {
            return this.headerTopPadding;
        }

        /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeaderHorizontalSpacing() {
            return this.headerHorizontalSpacing;
        }

        /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCloseButtonPadding() {
            return this.closeButtonPadding;
        }

        /* renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMessageEndPadding() {
            return this.messageEndPadding;
        }

        /* renamed from: component9-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCtaTopSpacing() {
            return this.ctaTopSpacing;
        }

        /* renamed from: copy-ETLW93k, reason: not valid java name */
        public final Spacing m21841copyETLW93k(float cardRadius, float contentBottomSpacing, float defaultContentStartSpacing, float contentEndSpacing, float headerTopPadding, float headerHorizontalSpacing, float closeButtonPadding, float messageEndPadding, float ctaTopSpacing, float footerBottomExtraPadding) {
            return new Spacing(cardRadius, contentBottomSpacing, defaultContentStartSpacing, contentEndSpacing, headerTopPadding, headerHorizontalSpacing, closeButtonPadding, messageEndPadding, ctaTopSpacing, footerBottomExtraPadding, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return C2002Dp.m7997equalsimpl0(this.cardRadius, spacing.cardRadius) && C2002Dp.m7997equalsimpl0(this.contentBottomSpacing, spacing.contentBottomSpacing) && C2002Dp.m7997equalsimpl0(this.defaultContentStartSpacing, spacing.defaultContentStartSpacing) && C2002Dp.m7997equalsimpl0(this.contentEndSpacing, spacing.contentEndSpacing) && C2002Dp.m7997equalsimpl0(this.headerTopPadding, spacing.headerTopPadding) && C2002Dp.m7997equalsimpl0(this.headerHorizontalSpacing, spacing.headerHorizontalSpacing) && C2002Dp.m7997equalsimpl0(this.closeButtonPadding, spacing.closeButtonPadding) && C2002Dp.m7997equalsimpl0(this.messageEndPadding, spacing.messageEndPadding) && C2002Dp.m7997equalsimpl0(this.ctaTopSpacing, spacing.ctaTopSpacing) && C2002Dp.m7997equalsimpl0(this.footerBottomExtraPadding, spacing.footerBottomExtraPadding);
        }

        public int hashCode() {
            return (((((((((((((((((C2002Dp.m7998hashCodeimpl(this.cardRadius) * 31) + C2002Dp.m7998hashCodeimpl(this.contentBottomSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.defaultContentStartSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.contentEndSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.headerTopPadding)) * 31) + C2002Dp.m7998hashCodeimpl(this.headerHorizontalSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.closeButtonPadding)) * 31) + C2002Dp.m7998hashCodeimpl(this.messageEndPadding)) * 31) + C2002Dp.m7998hashCodeimpl(this.ctaTopSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.footerBottomExtraPadding);
        }

        public String toString() {
            return "Spacing(cardRadius=" + C2002Dp.m7999toStringimpl(this.cardRadius) + ", contentBottomSpacing=" + C2002Dp.m7999toStringimpl(this.contentBottomSpacing) + ", defaultContentStartSpacing=" + C2002Dp.m7999toStringimpl(this.defaultContentStartSpacing) + ", contentEndSpacing=" + C2002Dp.m7999toStringimpl(this.contentEndSpacing) + ", headerTopPadding=" + C2002Dp.m7999toStringimpl(this.headerTopPadding) + ", headerHorizontalSpacing=" + C2002Dp.m7999toStringimpl(this.headerHorizontalSpacing) + ", closeButtonPadding=" + C2002Dp.m7999toStringimpl(this.closeButtonPadding) + ", messageEndPadding=" + C2002Dp.m7999toStringimpl(this.messageEndPadding) + ", ctaTopSpacing=" + C2002Dp.m7999toStringimpl(this.ctaTopSpacing) + ", footerBottomExtraPadding=" + C2002Dp.m7999toStringimpl(this.footerBottomExtraPadding) + ")";
        }

        private Spacing(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            this.cardRadius = f;
            this.contentBottomSpacing = f2;
            this.defaultContentStartSpacing = f3;
            this.contentEndSpacing = f4;
            this.headerTopPadding = f5;
            this.headerHorizontalSpacing = f6;
            this.closeButtonPadding = f7;
            this.messageEndPadding = f8;
            this.ctaTopSpacing = f9;
            this.footerBottomExtraPadding = f10;
        }

        /* renamed from: getCardRadius-D9Ej5fM, reason: not valid java name */
        public final float m21842getCardRadiusD9Ej5fM() {
            return this.cardRadius;
        }

        /* renamed from: getContentBottomSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21844getContentBottomSpacingD9Ej5fM() {
            return this.contentBottomSpacing;
        }

        /* renamed from: getDefaultContentStartSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21847getDefaultContentStartSpacingD9Ej5fM() {
            return this.defaultContentStartSpacing;
        }

        /* renamed from: getContentEndSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21845getContentEndSpacingD9Ej5fM() {
            return this.contentEndSpacing;
        }

        /* renamed from: getHeaderTopPadding-D9Ej5fM, reason: not valid java name */
        public final float m21850getHeaderTopPaddingD9Ej5fM() {
            return this.headerTopPadding;
        }

        /* renamed from: getHeaderHorizontalSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21849getHeaderHorizontalSpacingD9Ej5fM() {
            return this.headerHorizontalSpacing;
        }

        /* renamed from: getCloseButtonPadding-D9Ej5fM, reason: not valid java name */
        public final float m21843getCloseButtonPaddingD9Ej5fM() {
            return this.closeButtonPadding;
        }

        /* renamed from: getMessageEndPadding-D9Ej5fM, reason: not valid java name */
        public final float m21851getMessageEndPaddingD9Ej5fM() {
            return this.messageEndPadding;
        }

        /* renamed from: getCtaTopSpacing-D9Ej5fM, reason: not valid java name */
        public final float m21846getCtaTopSpacingD9Ej5fM() {
            return this.ctaTopSpacing;
        }

        /* renamed from: getFooterBottomExtraPadding-D9Ej5fM, reason: not valid java name */
        public final float m21848getFooterBottomExtraPaddingD9Ej5fM() {
            return this.footerBottomExtraPadding;
        }
    }
}
