package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Job.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "<init>", "()V", "parent", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "dispose", "", "childCancelled", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.NonDisposableHandle, reason: use source file name */
/* loaded from: classes23.dex */
public final class Job7 implements Job4, Job2 {
    public static final Job7 INSTANCE = new Job7();

    @Override // kotlinx.coroutines.Job2
    public boolean childCancelled(Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.Job4
    public void dispose() {
    }

    @Override // kotlinx.coroutines.Job2
    public Job getParent() {
        return null;
    }

    private Job7() {
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
