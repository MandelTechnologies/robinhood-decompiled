package com.robinhood.coroutines.job;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002JR\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0001\u0010\u00042<\u0010\u0005\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH¦@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/coroutines/job/CachedJobManager;", "C", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "execute", "R", "block", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "component", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAwake", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep", "", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface CachedJobManager<C> extends CachedJobManager7 {
    <R> Object execute(Function3<? super CoroutineScope, ? super C, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation);

    Object isAwake(Continuation<? super Boolean> continuation);

    Object sleep(String str, Throwable th, Continuation<? super Unit> continuation);

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object sleep$default(CachedJobManager cachedJobManager, String str, Throwable th, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sleep");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            return cachedJobManager.sleep(str, th, continuation);
        }
    }
}
