package kotlinx.coroutines.rx2;

import io.reactivex.SingleEmitter;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;

/* compiled from: RxSingle.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lkotlinx/coroutines/rx2/RxSingleCoroutine;", "T", "", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "subscriber", "Lio/reactivex/SingleEmitter;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/SingleEmitter;)V", "onCompleted", "", "value", "(Ljava/lang/Object;)V", "onCancelled", "cause", "", "handled", "", "kotlinx-coroutines-rx2"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.rx2.RxSingleCoroutine, reason: use source file name */
/* loaded from: classes23.dex */
final class RxSingle<T> extends AbstractCoroutine<T> {
    private final SingleEmitter<T> subscriber;

    public RxSingle(CoroutineContext coroutineContext, SingleEmitter<T> singleEmitter) {
        super(coroutineContext, false, true);
        this.subscriber = singleEmitter;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCompleted(T value) {
        try {
            this.subscriber.onSuccess(value);
        } catch (Throwable th) {
            RxCancellable2.handleUndeliverableException(th, get$context());
        }
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable cause, boolean handled) {
        try {
            if (this.subscriber.tryOnError(cause)) {
                return;
            }
        } catch (Throwable th) {
            ExceptionsKt.addSuppressed(cause, th);
        }
        RxCancellable2.handleUndeliverableException(cause, get$context());
    }
}
