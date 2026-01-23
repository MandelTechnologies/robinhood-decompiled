package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Timeout.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u000b\u001a\u00020\u0000H\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "coroutine", "Lkotlinx/coroutines/Job;", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "(Ljava/lang/String;)V", "createCopy", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.TimeoutCancellationException, reason: use source file name */
/* loaded from: classes23.dex */
public final class Timeout4 extends CancellationException implements CopyableThrowable<Timeout4> {

    @JvmField
    public final transient Job coroutine;

    public Timeout4(String str, Job job) {
        super(str);
        this.coroutine = job;
    }

    public Timeout4(String str) {
        this(str, null);
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public Timeout4 createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        Timeout4 timeout4 = new Timeout4(message, this.coroutine);
        timeout4.initCause(this);
        return timeout4;
    }
}
