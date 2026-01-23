package androidx.constraintlayout.compose;

import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MotionLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/runtime/MutableFloatState;", "motionProgress", "<init>", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", "Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/compose/runtime/MutableFloatState;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MotionLayoutScope {
    private final MotionMeasurer measurer;
    private final SnapshotFloatState2 motionProgress;

    public MotionLayoutScope(MotionMeasurer motionMeasurer, SnapshotFloatState2 snapshotFloatState2) {
        this.measurer = motionMeasurer;
        this.motionProgress = snapshotFloatState2;
    }
}
