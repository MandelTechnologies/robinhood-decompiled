package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotFloatState.android.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"createSnapshotMutableFloatState", "Landroidx/compose/runtime/MutableFloatState;", "value", "", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class SnapshotFloatState_androidKt {
    public static final SnapshotFloatState2 createSnapshotMutableFloatState(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }
}
