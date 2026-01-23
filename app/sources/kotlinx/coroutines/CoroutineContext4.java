package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Scopes4;
import kotlinx.coroutines.internal.ThreadContext;

/* compiled from: CoroutineContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\"\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "threadLocalIsSet", "", "saveThreadContext", "", "oldValue", "clearThreadContext", "afterCompletionUndispatched", "afterResume", "state", "clearThreadLocal", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.UndispatchedCoroutine, reason: use source file name */
/* loaded from: classes23.dex */
public final class CoroutineContext4<T> extends Scopes4<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<Tuples2<CoroutineContext, Object>> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public CoroutineContext4(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        CoroutineContext5 coroutineContext5 = CoroutineContext5.INSTANCE;
        super(coroutineContext.get(coroutineContext5) == null ? coroutineContext.plus(coroutineContext5) : coroutineContext, continuation);
        this.threadStateToRecover = new ThreadLocal<>();
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = ThreadContext.updateThreadContext(coroutineContext, null);
        ThreadContext.restoreThreadContext(coroutineContext, objUpdateThreadContext);
        saveThreadContext(coroutineContext, objUpdateThreadContext);
    }

    public final void saveThreadContext(CoroutineContext context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(Tuples4.m3642to(context, oldValue));
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.Scopes4
    public void afterCompletionUndispatched() {
        clearThreadLocal();
    }

    @Override // kotlinx.coroutines.internal.Scopes4, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(Object state) {
        clearThreadLocal();
        Object objRecoverResult = CompletionState3.recoverResult(state, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext coroutineContext = continuation.getContext();
        Object objUpdateThreadContext = ThreadContext.updateThreadContext(coroutineContext, null);
        CoroutineContext4<?> coroutineContext4UpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContext.NO_THREAD_ELEMENTS ? CoroutineContext3.updateUndispatchedCompletion(continuation, coroutineContext, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
            Unit unit = Unit.INSTANCE;
            if (coroutineContext4UpdateUndispatchedCompletion == null || coroutineContext4UpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContext.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            }
        } catch (Throwable th) {
            if (coroutineContext4UpdateUndispatchedCompletion == null || coroutineContext4UpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContext.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            }
            throw th;
        }
    }

    private final void clearThreadLocal() {
        if (this.threadLocalIsSet) {
            Tuples2<CoroutineContext, Object> tuples2 = this.threadStateToRecover.get();
            if (tuples2 != null) {
                ThreadContext.restoreThreadContext(tuples2.component1(), tuples2.component2());
            }
            this.threadStateToRecover.remove();
        }
    }
}
