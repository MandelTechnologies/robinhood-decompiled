package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompletableDeferred.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u0002H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"completeWith", "", "T", "Lkotlinx/coroutines/CompletableDeferred;", "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "CompletableDeferred", "parent", "Lkotlinx/coroutines/Job;", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "kotlinx-coroutines-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.CompletableDeferredKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class CompletableDeferred3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(CompletableDeferred<T> completableDeferred, Object obj) {
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        return thM28553exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(thM28553exceptionOrNullimpl);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    public static final <T> CompletableDeferred<T> CompletableDeferred(Job job) {
        return new CompletableDeferred2(job);
    }

    public static final <T> CompletableDeferred<T> CompletableDeferred(T t) {
        CompletableDeferred2 completableDeferred2 = new CompletableDeferred2(null);
        completableDeferred2.complete(t);
        return completableDeferred2;
    }
}
