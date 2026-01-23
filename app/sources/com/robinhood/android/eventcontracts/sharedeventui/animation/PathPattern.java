package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import com.robinhood.android.futures.sharedfuturesui.animations.PathMeasures;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathPattern.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\tJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0010HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/PathPattern;", "", "bottomXOffset", "Landroidx/compose/ui/unit/Dp;", "middleXOffset", "topXOffset", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottomXOffset-D9Ej5fM", "()F", "F", "getMiddleXOffset-D9Ej5fM", "getTopXOffset-D9Ej5fM", "drawPatternPath", "Landroidx/compose/ui/graphics/Path;", "widthPx", "", "heightPx", "density", "Landroidx/compose/ui/unit/Density;", "side", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "drawPathLeft", "drawPatternRight", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "copy", "copy-2z7ARbQ", "(FFF)Lcom/robinhood/android/eventcontracts/sharedeventui/animation/PathPattern;", "equals", "", "other", "hashCode", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final /* data */ class PathPattern {
    private final float bottomXOffset;
    private final float middleXOffset;
    private final float topXOffset;

    /* compiled from: PathPattern.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MovingDeltasAnimation8.values().length];
            try {
                iArr[MovingDeltasAnimation8.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MovingDeltasAnimation8.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PathPattern(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }

    /* renamed from: copy-2z7ARbQ$default, reason: not valid java name */
    public static /* synthetic */ PathPattern m14395copy2z7ARbQ$default(PathPattern pathPattern, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pathPattern.bottomXOffset;
        }
        if ((i & 2) != 0) {
            f2 = pathPattern.middleXOffset;
        }
        if ((i & 4) != 0) {
            f3 = pathPattern.topXOffset;
        }
        return pathPattern.m14399copy2z7ARbQ(f, f2, f3);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomXOffset() {
        return this.bottomXOffset;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMiddleXOffset() {
        return this.middleXOffset;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopXOffset() {
        return this.topXOffset;
    }

    /* renamed from: copy-2z7ARbQ, reason: not valid java name */
    public final PathPattern m14399copy2z7ARbQ(float bottomXOffset, float middleXOffset, float topXOffset) {
        return new PathPattern(bottomXOffset, middleXOffset, topXOffset, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathPattern)) {
            return false;
        }
        PathPattern pathPattern = (PathPattern) other;
        return C2002Dp.m7997equalsimpl0(this.bottomXOffset, pathPattern.bottomXOffset) && C2002Dp.m7997equalsimpl0(this.middleXOffset, pathPattern.middleXOffset) && C2002Dp.m7997equalsimpl0(this.topXOffset, pathPattern.topXOffset);
    }

    public int hashCode() {
        return (((C2002Dp.m7998hashCodeimpl(this.bottomXOffset) * 31) + C2002Dp.m7998hashCodeimpl(this.middleXOffset)) * 31) + C2002Dp.m7998hashCodeimpl(this.topXOffset);
    }

    public String toString() {
        return "PathPattern(bottomXOffset=" + C2002Dp.m7999toStringimpl(this.bottomXOffset) + ", middleXOffset=" + C2002Dp.m7999toStringimpl(this.middleXOffset) + ", topXOffset=" + C2002Dp.m7999toStringimpl(this.topXOffset) + ")";
    }

    private PathPattern(float f, float f2, float f3) {
        this.bottomXOffset = f;
        this.middleXOffset = f2;
        this.topXOffset = f3;
    }

    /* renamed from: getBottomXOffset-D9Ej5fM, reason: not valid java name */
    public final float m14400getBottomXOffsetD9Ej5fM() {
        return this.bottomXOffset;
    }

    /* renamed from: getMiddleXOffset-D9Ej5fM, reason: not valid java name */
    public final float m14401getMiddleXOffsetD9Ej5fM() {
        return this.middleXOffset;
    }

    /* renamed from: getTopXOffset-D9Ej5fM, reason: not valid java name */
    public final float m14402getTopXOffsetD9Ej5fM() {
        return this.topXOffset;
    }

    public final Path drawPatternPath(int widthPx, int heightPx, Density density, MovingDeltasAnimation8 side) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return drawPathLeft(heightPx, density);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawPatternRight(widthPx, heightPx, density);
    }

    private final Path drawPathLeft(int heightPx, Density density) {
        float f = heightPx;
        return PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(density.mo5016toPx0680j_4(this.bottomXOffset)) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(density.mo5016toPx0680j_4(this.topXOffset)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f * 0.5f) & 4294967295L) | (Float.floatToRawIntBits(density.mo5016toPx0680j_4(this.middleXOffset)) << 32)));
    }

    private final Path drawPatternRight(int widthPx, int heightPx, Density density) {
        float f = widthPx;
        float f2 = heightPx;
        return PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(f - density.mo5016toPx0680j_4(this.bottomXOffset)) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f - density.mo5016toPx0680j_4(this.topXOffset)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f - density.mo5016toPx0680j_4(this.middleXOffset)) << 32) | (Float.floatToRawIntBits(f2 * 0.5f) & 4294967295L)));
    }
}
