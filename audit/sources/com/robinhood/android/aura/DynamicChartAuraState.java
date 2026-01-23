package com.robinhood.android.aura;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.aura.ChartAuraType;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicChartAura.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0012J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/aura/DynamicChartAuraState;", "", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "line", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "blurFactor", "", "alphaOverride", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/models/serverdriven/experimental/api/Line;FFLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getLine", "()Lcom/robinhood/models/serverdriven/experimental/api/Line;", "getStrokeWidth-D9Ej5fM", "()F", "F", "getBlurFactor", "getAlphaOverride", "()Ljava/lang/Float;", "Ljava/lang/Float;", "type", "Lcom/robinhood/android/aura/ChartAuraType;", "getType", "()Lcom/robinhood/android/aura/ChartAuraType;", "component1", "component2", "component3", "component3-D9Ej5fM", "component4", "component5", "copy", "copy-TDGSqEk", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/models/serverdriven/experimental/api/Line;FFLjava/lang/Float;)Lcom/robinhood/android/aura/DynamicChartAuraState;", "equals", "", "other", "hashCode", "", "toString", "", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DynamicChartAuraState {
    public static final int $stable = 8;
    private final Float alphaOverride;
    private final float blurFactor;
    private final Direction direction;
    private final Line line;
    private final float strokeWidth;

    /* compiled from: DynamicChartAura.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DynamicChartAuraState(Direction direction, Line line, float f, float f2, Float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(direction, line, f, f2, f3);
    }

    /* renamed from: copy-TDGSqEk$default, reason: not valid java name */
    public static /* synthetic */ DynamicChartAuraState m11346copyTDGSqEk$default(DynamicChartAuraState dynamicChartAuraState, Direction direction, Line line, float f, float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            direction = dynamicChartAuraState.direction;
        }
        if ((i & 2) != 0) {
            line = dynamicChartAuraState.line;
        }
        if ((i & 4) != 0) {
            f = dynamicChartAuraState.strokeWidth;
        }
        if ((i & 8) != 0) {
            f2 = dynamicChartAuraState.blurFactor;
        }
        if ((i & 16) != 0) {
            f3 = dynamicChartAuraState.alphaOverride;
        }
        Float f4 = f3;
        float f5 = f;
        return dynamicChartAuraState.m11348copyTDGSqEk(direction, line, f5, f2, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final Line getLine() {
        return this.line;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBlurFactor() {
        return this.blurFactor;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getAlphaOverride() {
        return this.alphaOverride;
    }

    /* renamed from: copy-TDGSqEk, reason: not valid java name */
    public final DynamicChartAuraState m11348copyTDGSqEk(Direction direction, Line line, float strokeWidth, float blurFactor, Float alphaOverride) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(line, "line");
        return new DynamicChartAuraState(direction, line, strokeWidth, blurFactor, alphaOverride, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicChartAuraState)) {
            return false;
        }
        DynamicChartAuraState dynamicChartAuraState = (DynamicChartAuraState) other;
        return this.direction == dynamicChartAuraState.direction && Intrinsics.areEqual(this.line, dynamicChartAuraState.line) && C2002Dp.m7997equalsimpl0(this.strokeWidth, dynamicChartAuraState.strokeWidth) && Float.compare(this.blurFactor, dynamicChartAuraState.blurFactor) == 0 && Intrinsics.areEqual((Object) this.alphaOverride, (Object) dynamicChartAuraState.alphaOverride);
    }

    public int hashCode() {
        int iHashCode = ((((((this.direction.hashCode() * 31) + this.line.hashCode()) * 31) + C2002Dp.m7998hashCodeimpl(this.strokeWidth)) * 31) + Float.hashCode(this.blurFactor)) * 31;
        Float f = this.alphaOverride;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        return "DynamicChartAuraState(direction=" + this.direction + ", line=" + this.line + ", strokeWidth=" + C2002Dp.m7999toStringimpl(this.strokeWidth) + ", blurFactor=" + this.blurFactor + ", alphaOverride=" + this.alphaOverride + ")";
    }

    private DynamicChartAuraState(Direction direction, Line line, float f, float f2, Float f3) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(line, "line");
        this.direction = direction;
        this.line = line;
        this.strokeWidth = f;
        this.blurFactor = f2;
        this.alphaOverride = f3;
    }

    public /* synthetic */ DynamicChartAuraState(Direction direction, Line line, float f, float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(direction, line, f, (i & 8) != 0 ? 1.4f : f2, (i & 16) != 0 ? null : f3, null);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Line getLine() {
        return this.line;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m11349getStrokeWidthD9Ej5fM() {
        return this.strokeWidth;
    }

    public final float getBlurFactor() {
        return this.blurFactor;
    }

    public final Float getAlphaOverride() {
        return this.alphaOverride;
    }

    public final ChartAuraType getType() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return ChartAuraType.Positive.INSTANCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ChartAuraType.Negative.INSTANCE;
    }
}
