package androidx.work;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WorkContinuation {
    public abstract Operation enqueue();

    public abstract WorkContinuation then(List<OneTimeWorkRequest> work);

    public final WorkContinuation then(OneTimeWorkRequest work) {
        return then(Collections.singletonList(work));
    }
}
