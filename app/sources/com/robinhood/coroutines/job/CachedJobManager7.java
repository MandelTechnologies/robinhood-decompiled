package com.robinhood.coroutines.job;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/coroutines/job/RetainableCachedJob;", "", "retainUntilCanceled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.job.RetainableCachedJob, reason: use source file name */
/* loaded from: classes20.dex */
public interface CachedJobManager7 {
    Object retainUntilCanceled(Continuation<?> continuation);
}
