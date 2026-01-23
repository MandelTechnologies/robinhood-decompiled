package com.robinhood.compose.theme.style;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommunicationCardStyle.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004*+,-B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006."}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "", "border", "Landroidx/compose/foundation/BorderStroke;", "colors", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Colors;", "shape", "Landroidx/compose/ui/graphics/Shape;", "sizing", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Sizing;", "spacing", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Typography;", "<init>", "(Landroidx/compose/foundation/BorderStroke;Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Colors;Landroidx/compose/ui/graphics/Shape;Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Sizing;Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Spacing;Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Typography;)V", "getBorder", "()Landroidx/compose/foundation/BorderStroke;", "getColors", "()Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Colors;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSizing", "()Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Sizing;", "getSpacing", "()Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Typography;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "Sizing", "Spacing", "Typography", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommunicationCardStyle {
    public static final int $stable = 0;
    private final BorderStroke border;
    private final Colors colors;
    private final Shape shape;
    private final Sizing sizing;
    private final Spacing spacing;
    private final Typography typography;

    public static /* synthetic */ CommunicationCardStyle copy$default(CommunicationCardStyle communicationCardStyle, BorderStroke borderStroke, Colors colors, Shape shape, Sizing sizing, Spacing spacing, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            borderStroke = communicationCardStyle.border;
        }
        if ((i & 2) != 0) {
            colors = communicationCardStyle.colors;
        }
        if ((i & 4) != 0) {
            shape = communicationCardStyle.shape;
        }
        if ((i & 8) != 0) {
            sizing = communicationCardStyle.sizing;
        }
        if ((i & 16) != 0) {
            spacing = communicationCardStyle.spacing;
        }
        if ((i & 32) != 0) {
            typography = communicationCardStyle.typography;
        }
        Spacing spacing2 = spacing;
        Typography typography2 = typography;
        return communicationCardStyle.copy(borderStroke, colors, shape, sizing, spacing2, typography2);
    }

    /* renamed from: component1, reason: from getter */
    public final BorderStroke getBorder() {
        return this.border;
    }

    /* renamed from: component2, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component3, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component4, reason: from getter */
    public final Sizing getSizing() {
        return this.sizing;
    }

    /* renamed from: component5, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* renamed from: component6, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    public final CommunicationCardStyle copy(BorderStroke border, Colors colors, Shape shape, Sizing sizing, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new CommunicationCardStyle(border, colors, shape, sizing, spacing, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationCardStyle)) {
            return false;
        }
        CommunicationCardStyle communicationCardStyle = (CommunicationCardStyle) other;
        return Intrinsics.areEqual(this.border, communicationCardStyle.border) && Intrinsics.areEqual(this.colors, communicationCardStyle.colors) && Intrinsics.areEqual(this.shape, communicationCardStyle.shape) && Intrinsics.areEqual(this.sizing, communicationCardStyle.sizing) && Intrinsics.areEqual(this.spacing, communicationCardStyle.spacing) && Intrinsics.areEqual(this.typography, communicationCardStyle.typography);
    }

    public int hashCode() {
        return (((((((((this.border.hashCode() * 31) + this.colors.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.sizing.hashCode()) * 31) + this.spacing.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "CommunicationCardStyle(border=" + this.border + ", colors=" + this.colors + ", shape=" + this.shape + ", sizing=" + this.sizing + ", spacing=" + this.spacing + ", typography=" + this.typography + ")";
    }

    public CommunicationCardStyle(BorderStroke border, Colors colors, Shape shape, Sizing sizing, Spacing spacing, Typography typography) {
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(typography, "typography");
        this.border = border;
        this.colors = colors;
        this.shape = shape;
        this.sizing = sizing;
        this.spacing = spacing;
        this.typography = typography;
    }

    public final BorderStroke getBorder() {
        return this.border;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final Sizing getSizing() {
        return this.sizing;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    /* compiled from: CommunicationCardStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Colors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "darkDismissIconTint", "lightDismissIconTint", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getDarkDismissIconTint-0d7_KjU", "getLightDismissIconTint-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final long darkDismissIconTint;
        private final long lightDismissIconTint;

        public /* synthetic */ Colors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3);
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Colors m21746copyysEtTa8$default(Colors colors, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.backgroundColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = colors.darkDismissIconTint;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = colors.lightDismissIconTint;
            }
            return colors.m21750copyysEtTa8(j4, j5, j3);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDarkDismissIconTint() {
            return this.darkDismissIconTint;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getLightDismissIconTint() {
            return this.lightDismissIconTint;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Colors m21750copyysEtTa8(long backgroundColor, long darkDismissIconTint, long lightDismissIconTint) {
            return new Colors(backgroundColor, darkDismissIconTint, lightDismissIconTint, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.backgroundColor, colors.backgroundColor) && Color.m6707equalsimpl0(this.darkDismissIconTint, colors.darkDismissIconTint) && Color.m6707equalsimpl0(this.lightDismissIconTint, colors.lightDismissIconTint);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.darkDismissIconTint)) * 31) + Color.m6713hashCodeimpl(this.lightDismissIconTint);
        }

        public String toString() {
            return "Colors(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", darkDismissIconTint=" + Color.m6714toStringimpl(this.darkDismissIconTint) + ", lightDismissIconTint=" + Color.m6714toStringimpl(this.lightDismissIconTint) + ")";
        }

        private Colors(long j, long j2, long j3) {
            this.backgroundColor = j;
            this.darkDismissIconTint = j2;
            this.lightDismissIconTint = j3;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21751getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getDarkDismissIconTint-0d7_KjU, reason: not valid java name */
        public final long m21752getDarkDismissIconTint0d7_KjU() {
            return this.darkDismissIconTint;
        }

        /* renamed from: getLightDismissIconTint-0d7_KjU, reason: not valid java name */
        public final long m21753getLightDismissIconTint0d7_KjU() {
            return this.lightDismissIconTint;
        }
    }

    /* compiled from: CommunicationCardStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Sizing;", "", "height", "Landroidx/compose/ui/unit/Dp;", "dismissTapTargetSize", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-D9Ej5fM", "()F", "F", "getDismissTapTargetSize-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Sizing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sizing {
        public static final int $stable = 0;
        private final float dismissTapTargetSize;
        private final float height;

        public /* synthetic */ Sizing(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ Sizing m21754copyYgX7TsA$default(Sizing sizing, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = sizing.height;
            }
            if ((i & 2) != 0) {
                f2 = sizing.dismissTapTargetSize;
            }
            return sizing.m21757copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getDismissTapTargetSize() {
            return this.dismissTapTargetSize;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final Sizing m21757copyYgX7TsA(float height, float dismissTapTargetSize) {
            return new Sizing(height, dismissTapTargetSize, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sizing)) {
                return false;
            }
            Sizing sizing = (Sizing) other;
            return C2002Dp.m7997equalsimpl0(this.height, sizing.height) && C2002Dp.m7997equalsimpl0(this.dismissTapTargetSize, sizing.dismissTapTargetSize);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.height) * 31) + C2002Dp.m7998hashCodeimpl(this.dismissTapTargetSize);
        }

        public String toString() {
            return "Sizing(height=" + C2002Dp.m7999toStringimpl(this.height) + ", dismissTapTargetSize=" + C2002Dp.m7999toStringimpl(this.dismissTapTargetSize) + ")";
        }

        private Sizing(float f, float f2) {
            this.height = f;
            this.dismissTapTargetSize = f2;
        }

        /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
        public final float m21759getHeightD9Ej5fM() {
            return this.height;
        }

        /* renamed from: getDismissTapTargetSize-D9Ej5fM, reason: not valid java name */
        public final float m21758getDismissTapTargetSizeD9Ej5fM() {
            return this.dismissTapTargetSize;
        }
    }

    /* compiled from: CommunicationCardStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Spacing;", "", "textPadding", "Landroidx/compose/ui/unit/Dp;", "textEndPaddingWithoutIllustration", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextPadding-D9Ej5fM", "()F", "F", "getTextEndPaddingWithoutIllustration-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final float textEndPaddingWithoutIllustration;
        private final float textPadding;

        public /* synthetic */ Spacing(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ Spacing m21760copyYgX7TsA$default(Spacing spacing, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.textPadding;
            }
            if ((i & 2) != 0) {
                f2 = spacing.textEndPaddingWithoutIllustration;
            }
            return spacing.m21763copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getTextPadding() {
            return this.textPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getTextEndPaddingWithoutIllustration() {
            return this.textEndPaddingWithoutIllustration;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final Spacing m21763copyYgX7TsA(float textPadding, float textEndPaddingWithoutIllustration) {
            return new Spacing(textPadding, textEndPaddingWithoutIllustration, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return C2002Dp.m7997equalsimpl0(this.textPadding, spacing.textPadding) && C2002Dp.m7997equalsimpl0(this.textEndPaddingWithoutIllustration, spacing.textEndPaddingWithoutIllustration);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.textPadding) * 31) + C2002Dp.m7998hashCodeimpl(this.textEndPaddingWithoutIllustration);
        }

        public String toString() {
            return "Spacing(textPadding=" + C2002Dp.m7999toStringimpl(this.textPadding) + ", textEndPaddingWithoutIllustration=" + C2002Dp.m7999toStringimpl(this.textEndPaddingWithoutIllustration) + ")";
        }

        private Spacing(float f, float f2) {
            this.textPadding = f;
            this.textEndPaddingWithoutIllustration = f2;
        }

        /* renamed from: getTextPadding-D9Ej5fM, reason: not valid java name */
        public final float m21765getTextPaddingD9Ej5fM() {
            return this.textPadding;
        }

        /* renamed from: getTextEndPaddingWithoutIllustration-D9Ej5fM, reason: not valid java name */
        public final float m21764getTextEndPaddingWithoutIllustrationD9Ej5fM() {
            return this.textEndPaddingWithoutIllustration;
        }
    }

    /* compiled from: CommunicationCardStyle.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/CommunicationCardStyle$Typography;", "", "standardTextStyle", "Landroidx/compose/ui/text/TextStyle;", "brandMomentTextStyle", "maxLines", "", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;I)V", "getStandardTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getBrandMomentTextStyle", "getMaxLines", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle brandMomentTextStyle;
        private final int maxLines;
        private final androidx.compose.p011ui.text.TextStyle standardTextStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                textStyle = typography.standardTextStyle;
            }
            if ((i2 & 2) != 0) {
                textStyle2 = typography.brandMomentTextStyle;
            }
            if ((i2 & 4) != 0) {
                i = typography.maxLines;
            }
            return typography.copy(textStyle, textStyle2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getStandardTextStyle() {
            return this.standardTextStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getBrandMomentTextStyle() {
            return this.brandMomentTextStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle standardTextStyle, androidx.compose.p011ui.text.TextStyle brandMomentTextStyle, int maxLines) {
            Intrinsics.checkNotNullParameter(standardTextStyle, "standardTextStyle");
            Intrinsics.checkNotNullParameter(brandMomentTextStyle, "brandMomentTextStyle");
            return new Typography(standardTextStyle, brandMomentTextStyle, maxLines);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.standardTextStyle, typography.standardTextStyle) && Intrinsics.areEqual(this.brandMomentTextStyle, typography.brandMomentTextStyle) && this.maxLines == typography.maxLines;
        }

        public int hashCode() {
            return (((this.standardTextStyle.hashCode() * 31) + this.brandMomentTextStyle.hashCode()) * 31) + Integer.hashCode(this.maxLines);
        }

        public String toString() {
            return "Typography(standardTextStyle=" + this.standardTextStyle + ", brandMomentTextStyle=" + this.brandMomentTextStyle + ", maxLines=" + this.maxLines + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle standardTextStyle, androidx.compose.p011ui.text.TextStyle brandMomentTextStyle, int i) {
            Intrinsics.checkNotNullParameter(standardTextStyle, "standardTextStyle");
            Intrinsics.checkNotNullParameter(brandMomentTextStyle, "brandMomentTextStyle");
            this.standardTextStyle = standardTextStyle;
            this.brandMomentTextStyle = brandMomentTextStyle;
            this.maxLines = i;
        }

        public final androidx.compose.p011ui.text.TextStyle getStandardTextStyle() {
            return this.standardTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getBrandMomentTextStyle() {
            return this.brandMomentTextStyle;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }
    }
}
