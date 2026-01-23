package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "", "onConstraintsStateChanged", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "state", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.work.impl.constraints.OnConstraintsStateChangedListener, reason: use source file name */
/* loaded from: classes.dex */
public interface WorkConstraintsTracker3 {
    void onConstraintsStateChanged(WorkSpec workSpec, WorkConstraintsTracker2 state);
}
