package com.robinhood.shared.tradeladder.p398ui.ladder.shared.style;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle;", "", "start", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;", "center", "end", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;)V", "getStart", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;", "getCenter", "getEnd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Sided", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LoadingStyle {
    public static final int $stable = 0;
    private final Sided center;
    private final Sided end;
    private final Sided start;

    public static /* synthetic */ LoadingStyle copy$default(LoadingStyle loadingStyle, Sided sided, Sided sided2, Sided sided3, int i, Object obj) {
        if ((i & 1) != 0) {
            sided = loadingStyle.start;
        }
        if ((i & 2) != 0) {
            sided2 = loadingStyle.center;
        }
        if ((i & 4) != 0) {
            sided3 = loadingStyle.end;
        }
        return loadingStyle.copy(sided, sided2, sided3);
    }

    /* renamed from: component1, reason: from getter */
    public final Sided getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final Sided getCenter() {
        return this.center;
    }

    /* renamed from: component3, reason: from getter */
    public final Sided getEnd() {
        return this.end;
    }

    public final LoadingStyle copy(Sided start, Sided center, Sided end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(end, "end");
        return new LoadingStyle(start, center, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingStyle)) {
            return false;
        }
        LoadingStyle loadingStyle = (LoadingStyle) other;
        return Intrinsics.areEqual(this.start, loadingStyle.start) && Intrinsics.areEqual(this.center, loadingStyle.center) && Intrinsics.areEqual(this.end, loadingStyle.end);
    }

    public int hashCode() {
        return (((this.start.hashCode() * 31) + this.center.hashCode()) * 31) + this.end.hashCode();
    }

    public String toString() {
        return "LoadingStyle(start=" + this.start + ", center=" + this.center + ", end=" + this.end + ")";
    }

    public LoadingStyle(Sided start, Sided center, Sided end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.center = center;
        this.end = end;
    }

    public final Sided getStart() {
        return this.start;
    }

    public final Sided getCenter() {
        return this.center;
    }

    public final Sided getEnd() {
        return this.end;
    }

    /* compiled from: LadderStyle.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "barShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "<init>", "(JJFLandroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getBorderColor-0d7_KjU", "getBorderWidth-D9Ej5fM", "()F", "F", "getBarShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-D9Ej5fM", "component4", "copy", "copy-gs-jSAA", "(JJFLandroidx/compose/foundation/shape/RoundedCornerShape;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle$Sided;", "equals", "", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sided {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final RoundedCornerShape barShape;
        private final long borderColor;
        private final float borderWidth;

        public /* synthetic */ Sided(long j, long j2, float f, RoundedCornerShape roundedCornerShape, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, f, roundedCornerShape);
        }

        /* renamed from: copy-gs-jSAA$default, reason: not valid java name */
        public static /* synthetic */ Sided m26245copygsjSAA$default(Sided sided, long j, long j2, float f, RoundedCornerShape roundedCornerShape, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sided.backgroundColor;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = sided.borderColor;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                f = sided.borderWidth;
            }
            float f2 = f;
            if ((i & 8) != 0) {
                roundedCornerShape = sided.barShape;
            }
            return sided.m26249copygsjSAA(j3, j4, f2, roundedCornerShape);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBorderWidth() {
            return this.borderWidth;
        }

        /* renamed from: component4, reason: from getter */
        public final RoundedCornerShape getBarShape() {
            return this.barShape;
        }

        /* renamed from: copy-gs-jSAA, reason: not valid java name */
        public final Sided m26249copygsjSAA(long backgroundColor, long borderColor, float borderWidth, RoundedCornerShape barShape) {
            Intrinsics.checkNotNullParameter(barShape, "barShape");
            return new Sided(backgroundColor, borderColor, borderWidth, barShape, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sided)) {
                return false;
            }
            Sided sided = (Sided) other;
            return Color.m6707equalsimpl0(this.backgroundColor, sided.backgroundColor) && Color.m6707equalsimpl0(this.borderColor, sided.borderColor) && C2002Dp.m7997equalsimpl0(this.borderWidth, sided.borderWidth) && Intrinsics.areEqual(this.barShape, sided.barShape);
        }

        public int hashCode() {
            return (((((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + C2002Dp.m7998hashCodeimpl(this.borderWidth)) * 31) + this.barShape.hashCode();
        }

        public String toString() {
            return "Sided(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", borderWidth=" + C2002Dp.m7999toStringimpl(this.borderWidth) + ", barShape=" + this.barShape + ")";
        }

        private Sided(long j, long j2, float f, RoundedCornerShape barShape) {
            Intrinsics.checkNotNullParameter(barShape, "barShape");
            this.backgroundColor = j;
            this.borderColor = j2;
            this.borderWidth = f;
            this.barShape = barShape;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m26250getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
        public final long m26251getBorderColor0d7_KjU() {
            return this.borderColor;
        }

        /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
        public final float m26252getBorderWidthD9Ej5fM() {
            return this.borderWidth;
        }

        public final RoundedCornerShape getBarShape() {
            return this.barShape;
        }
    }
}
