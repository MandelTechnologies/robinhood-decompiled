package io.ktor.util;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: CoroutinesUtils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlin/coroutines/CoroutineContext;", "SilentSupervisor", "(Lkotlinx/coroutines/Job;)Lkotlin/coroutines/CoroutineContext;", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.util.CoroutinesUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class CoroutinesUtils {
    public static /* synthetic */ CoroutineContext SilentSupervisor$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SilentSupervisor(job);
    }

    public static final CoroutineContext SilentSupervisor(Job job) {
        return Supervisor3.SupervisorJob(job).plus(new CoroutineExceptionHandler6(CoroutineExceptionHandler.INSTANCE));
    }
}
