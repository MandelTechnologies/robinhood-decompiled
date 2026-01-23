package com.robinhood.shared.tradeladder.p398ui.ladder.shared.style;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.util.MathHelpers;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.utils.compose.extensions.Colors8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle;", "", "start", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;", "end", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;)V", "getStart", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;", "getEnd", "sided", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Sided", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class QuantityBarStyle {
    public static final int $stable = 0;
    private final Sided end;
    private final Sided start;

    public static /* synthetic */ QuantityBarStyle copy$default(QuantityBarStyle quantityBarStyle, Sided sided, Sided sided2, int i, Object obj) {
        if ((i & 1) != 0) {
            sided = quantityBarStyle.start;
        }
        if ((i & 2) != 0) {
            sided2 = quantityBarStyle.end;
        }
        return quantityBarStyle.copy(sided, sided2);
    }

    /* renamed from: component1, reason: from getter */
    public final Sided getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final Sided getEnd() {
        return this.end;
    }

    public final QuantityBarStyle copy(Sided start, Sided end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new QuantityBarStyle(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantityBarStyle)) {
            return false;
        }
        QuantityBarStyle quantityBarStyle = (QuantityBarStyle) other;
        return Intrinsics.areEqual(this.start, quantityBarStyle.start) && Intrinsics.areEqual(this.end, quantityBarStyle.end);
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "QuantityBarStyle(start=" + this.start + ", end=" + this.end + ")";
    }

    public QuantityBarStyle(Sided start, Sided end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
    }

    public final Sided getStart() {
        return this.start;
    }

    public final Sided getEnd() {
        return this.end;
    }

    /* compiled from: LadderStyle.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\rJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\rJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\rJ\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u0012J\t\u0010&\u001a\u00020\tHÆ\u0003JB\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "borderColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "barShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "<init>", "(JJJFLandroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextColor-0d7_KjU", "()J", "J", "getBackgroundColor-0d7_KjU", "getBorderColor-0d7_KjU", "getBorderWidth-D9Ej5fM", "()F", "F", "getBarShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "actualBarBackgroundColor", "rowBackgroundColor", "alpha", "", "actualBarBackgroundColor-5vOe2sY", "(JF)J", "actualBorderColor", "actualBorderColor-5vOe2sY", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-D9Ej5fM", "component5", "copy", "copy-OR8Va-U", "(JJJFLandroidx/compose/foundation/shape/RoundedCornerShape;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle$Sided;", "equals", "", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Sided {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final RoundedCornerShape barShape;
        private final long borderColor;
        private final float borderWidth;
        private final long textColor;

        public /* synthetic */ Sided(long j, long j2, long j3, float f, RoundedCornerShape roundedCornerShape, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, f, roundedCornerShape);
        }

        /* renamed from: copy-OR8Va-U$default, reason: not valid java name */
        public static /* synthetic */ Sided m26271copyOR8VaU$default(Sided sided, long j, long j2, long j3, float f, RoundedCornerShape roundedCornerShape, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sided.textColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = sided.backgroundColor;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = sided.borderColor;
            }
            return sided.m26278copyOR8VaU(j4, j5, j3, (i & 8) != 0 ? sided.borderWidth : f, (i & 16) != 0 ? sided.barShape : roundedCornerShape);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getTextColor() {
            return this.textColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBorderWidth() {
            return this.borderWidth;
        }

        /* renamed from: component5, reason: from getter */
        public final RoundedCornerShape getBarShape() {
            return this.barShape;
        }

        /* renamed from: copy-OR8Va-U, reason: not valid java name */
        public final Sided m26278copyOR8VaU(long textColor, long backgroundColor, long borderColor, float borderWidth, RoundedCornerShape barShape) {
            Intrinsics.checkNotNullParameter(barShape, "barShape");
            return new Sided(textColor, backgroundColor, borderColor, borderWidth, barShape, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sided)) {
                return false;
            }
            Sided sided = (Sided) other;
            return Color.m6707equalsimpl0(this.textColor, sided.textColor) && Color.m6707equalsimpl0(this.backgroundColor, sided.backgroundColor) && Color.m6707equalsimpl0(this.borderColor, sided.borderColor) && C2002Dp.m7997equalsimpl0(this.borderWidth, sided.borderWidth) && Intrinsics.areEqual(this.barShape, sided.barShape);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.textColor) * 31) + Color.m6713hashCodeimpl(this.backgroundColor)) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + C2002Dp.m7998hashCodeimpl(this.borderWidth)) * 31) + this.barShape.hashCode();
        }

        public String toString() {
            return "Sided(textColor=" + Color.m6714toStringimpl(this.textColor) + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", borderWidth=" + C2002Dp.m7999toStringimpl(this.borderWidth) + ", barShape=" + this.barShape + ")";
        }

        private Sided(long j, long j2, long j3, float f, RoundedCornerShape barShape) {
            Intrinsics.checkNotNullParameter(barShape, "barShape");
            this.textColor = j;
            this.backgroundColor = j2;
            this.borderColor = j3;
            this.borderWidth = f;
            this.barShape = barShape;
        }

        /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
        public final long m26282getTextColor0d7_KjU() {
            return this.textColor;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m26279getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
        public final long m26280getBorderColor0d7_KjU() {
            return this.borderColor;
        }

        /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
        public final float m26281getBorderWidthD9Ej5fM() {
            return this.borderWidth;
        }

        public final RoundedCornerShape getBarShape() {
            return this.barShape;
        }

        /* renamed from: actualBarBackgroundColor-5vOe2sY, reason: not valid java name */
        public final long m26272actualBarBackgroundColor5vOe2sY(long rowBackgroundColor, float alpha) {
            return Colors8.m26601blendWithjxsXWHM(rowBackgroundColor, this.backgroundColor, alpha);
        }

        /* renamed from: actualBorderColor-5vOe2sY, reason: not valid java name */
        public final long m26273actualBorderColor5vOe2sY(long rowBackgroundColor, float alpha) {
            long j = this.borderColor;
            if (j != 16) {
                return Colors8.m26601blendWithjxsXWHM(rowBackgroundColor, j, MathHelpers.lerp(0.4f, 1.0f, alpha));
            }
            return Color.INSTANCE.m6726getUnspecified0d7_KjU();
        }
    }

    public final Sided sided(Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return side == Side.START ? this.start : this.end;
    }
}
