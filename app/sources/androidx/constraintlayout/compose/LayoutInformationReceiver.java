package androidx.constraintlayout.compose;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m3636d2 = {"Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "", "information", "", "setLayoutInformation", "(Ljava/lang/String;)V", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "()Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "getForcedWidth", "()I", "getForcedHeight", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "(Landroidx/compose/runtime/MutableState;)V", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "()Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "resetForcedProgress", "()V", "", "getForcedProgress", "()F", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public interface LayoutInformationReceiver {
    MotionLayoutDebugFlags getForcedDrawDebug();

    int getForcedHeight();

    float getForcedProgress();

    int getForcedWidth();

    LayoutInfoFlags getLayoutInformationMode();

    void resetForcedProgress();

    void setLayoutInformation(String information);

    void setUpdateFlag(SnapshotState<Long> needsUpdate);
}
