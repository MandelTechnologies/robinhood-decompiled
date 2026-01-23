package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl2;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletionState2;
import kotlinx.coroutines.DispatchedTask2;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.internal.Scopes4;
import kotlinx.coroutines.internal.ThreadContext;

/* compiled from: Undispatched.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "block", "startUndispatchedOrReturn", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "kotlinx-coroutines-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.intrinsics.UndispatchedKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class Undispatched {
    public static final <R, T> void startCoroutineUndispatched(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbes.probeCoroutineCreated(continuation);
        try {
            CoroutineContext coroutineContext = continuationProbeCoroutineCreated.getContext();
            Object objUpdateThreadContext = ThreadContext.updateThreadContext(coroutineContext, null);
            try {
                DebugProbes.probeCoroutineResumed(continuationProbeCoroutineCreated);
                Object objWrapWithContinuationImpl = !(function2 instanceof ContinuationImpl2) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, continuationProbeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, continuationProbeCoroutineCreated);
                ThreadContext.restoreThreadContext(coroutineContext, objUpdateThreadContext);
                if (objWrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m28550constructorimpl(objWrapWithContinuationImpl));
                }
            } catch (Throwable th) {
                ThreadContext.restoreThreadContext(coroutineContext, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchedTask2) {
                th = ((DispatchedTask2) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(Scopes4<? super T> scopes4, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object completionState2;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            completionState2 = !(function2 instanceof ContinuationImpl2) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, scopes4) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopes4);
        } catch (Throwable th) {
            completionState2 = new CompletionState2(th, false, 2, null);
        }
        if (completionState2 != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = scopes4.makeCompletingOnce$kotlinx_coroutines_core(completionState2)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            scopes4.afterCompletionUndispatched();
            if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletionState2) {
                throw ((CompletionState2) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
            }
            return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(Scopes4<? super T> scopes4, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object completionState2;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            completionState2 = !(function2 instanceof ContinuationImpl2) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r, scopes4) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopes4);
        } catch (Throwable th) {
            completionState2 = new CompletionState2(th, false, 2, null);
        }
        if (completionState2 != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = scopes4.makeCompletingOnce$kotlinx_coroutines_core(completionState2)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            scopes4.afterCompletionUndispatched();
            if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletionState2) {
                Throwable th2 = ((CompletionState2) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
                if (!(th2 instanceof Timeout4) || ((Timeout4) th2).coroutine != scopes4) {
                    throw th2;
                }
                if (completionState2 instanceof CompletionState2) {
                    throw ((CompletionState2) completionState2).cause;
                }
            } else {
                completionState2 = JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            return completionState2;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
