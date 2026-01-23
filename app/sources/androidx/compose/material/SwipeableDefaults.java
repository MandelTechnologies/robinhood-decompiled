package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p011ui.unit.C2002Dp;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Swipeable.kt */
@Deprecated
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m3636d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material/ResistanceConfig;", "resistanceConfig", "(Ljava/util/Set;FF)Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/Dp;", "VelocityThreshold", "F", "getVelocityThreshold-D9Ej5fM", "()F", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SwipeableDefaults {
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = C2002Dp.m7995constructorimpl(125);

    private SwipeableDefaults() {
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m5650getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f, f2);
    }

    public final ResistanceConfig resistanceConfig(Set<Float> anchors, float factorAtMin, float factorAtMax) {
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) set);
        Intrinsics.checkNotNull(fMaxOrNull);
        float fFloatValue = fMaxOrNull.floatValue();
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) set);
        Intrinsics.checkNotNull(fMinOrNull);
        return new ResistanceConfig(fFloatValue - fMinOrNull.floatValue(), factorAtMin, factorAtMax);
    }
}
