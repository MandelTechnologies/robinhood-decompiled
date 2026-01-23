package androidx.compose.animation.core;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp3;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VisibilityThresholds.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"4\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013\"\u0015\u0010\u0010\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016\"\u0015\u0010\u0010\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019\"\u0015\u0010\u0010\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001c\"\u0015\u0010\u0010\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001f\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010!¨\u0006\""}, m3636d2 = {"Landroidx/compose/ui/geometry/Rect;", "RectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "", "VisibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.animation.core.VisibilityThresholdsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class VisibilityThresholds {
    private static final Rect RectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    public static final int getVisibilityThreshold(IntCompanionObject intCompanionObject) {
        return 1;
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        long j = 1;
        return IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32));
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(1.0f);
        Tuples2 tuples2M3642to = Tuples4.m3642to(vectorConverter, fValueOf2);
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf2);
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf2);
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
        Tuples2 tuples2M3642to5 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf);
        Tuples2 tuples2M3642to6 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf);
        Tuples2 tuples2M3642to7 = Tuples4.m3642to(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf);
        TwoWayConverter<C2002Dp, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(C2002Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        VisibilityThresholdMap = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, Tuples4.m3642to(vectorConverter2, fValueOf3), Tuples4.m3642to(VectorConvertersKt.getVectorConverter(Dp3.INSTANCE), fValueOf3));
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        long j = 1;
        return IntOffset.m8033constructorimpl((j & 4294967295L) | (j << 32));
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return Size.m6575constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static final float getVisibilityThreshold(C2002Dp.Companion companion) {
        return C2002Dp.m7995constructorimpl(0.1f);
    }
}
