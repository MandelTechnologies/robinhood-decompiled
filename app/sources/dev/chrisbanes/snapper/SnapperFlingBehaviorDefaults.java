package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapperFlingBehavior.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fRM\u0010\u0017\u001a8\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehaviorDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "SpringAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSpringAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/Function1;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "MaximumFlingDistance", "Lkotlin/jvm/functions/Function1;", "getMaximumFlingDistance", "()Lkotlin/jvm/functions/Function1;", "getMaximumFlingDistance$annotations", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "SnapIndex", "Lkotlin/jvm/functions/Function3;", "getSnapIndex", "()Lkotlin/jvm/functions/Function3;", "lib_release"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SnapperFlingBehaviorDefaults {
    public static final SnapperFlingBehaviorDefaults INSTANCE = new SnapperFlingBehaviorDefaults();
    private static final AnimationSpec<Float> SpringAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final Function1<SnapperLayoutInfo, Float> MaximumFlingDistance = new Function1<SnapperLayoutInfo, Float>() { // from class: dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults$MaximumFlingDistance$1
        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(SnapperLayoutInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    };
    private static final Function3<SnapperLayoutInfo, Integer, Integer, Integer> SnapIndex = new Function3<SnapperLayoutInfo, Integer, Integer, Integer>() { // from class: dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults$SnapIndex$1
        public final Integer invoke(SnapperLayoutInfo noName_0, int i, int i2) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            return Integer.valueOf(i2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(SnapperLayoutInfo snapperLayoutInfo, Integer num, Integer num2) {
            return invoke(snapperLayoutInfo, num.intValue(), num2.intValue());
        }
    };
    public static final int $stable = 8;

    private SnapperFlingBehaviorDefaults() {
    }

    public final AnimationSpec<Float> getSpringAnimationSpec() {
        return SpringAnimationSpec;
    }

    public final Function1<SnapperLayoutInfo, Float> getMaximumFlingDistance() {
        return MaximumFlingDistance;
    }
}
