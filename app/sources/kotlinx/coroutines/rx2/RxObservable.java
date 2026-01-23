package kotlinx.coroutines.rx2;

import io.reactivex.ObservableEmitter;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: RxObservable.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b)\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004¨\u00066"}, m3636d2 = {"Lkotlinx/coroutines/rx2/RxObservableCoroutine;", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/ObservableEmitter;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/ObservableEmitter;)V", "elem", "", "doLockedNext", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "unlockAndCheckCompleted", "()V", "cause", "", "handled", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "signalCompleted", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "onCompleted", "(Lkotlin/Unit;)V", "onCancelled", "Lio/reactivex/ObservableEmitter;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "isClosedForSend", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_signal", "kotlinx-coroutines-rx2"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.rx2.RxObservableCoroutine, reason: use source file name */
/* loaded from: classes14.dex */
final class RxObservable<T> extends AbstractCoroutine<Unit> implements Produce4<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _signal$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RxObservable.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;
    private final Mutex mutex;
    private final ObservableEmitter<T> subscriber;

    /* compiled from: RxObservable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.rx2.RxObservableCoroutine", m3645f = "RxObservable.kt", m3646l = {113}, m3647m = "send")
    /* renamed from: kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 */
    static final class C461371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RxObservable<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C461371(RxObservable<T> rxObservable, Continuation<? super C461371> continuation) {
            super(continuation);
            this.this$0 = rxObservable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    @Override // kotlinx.coroutines.channels.Produce4
    public Channel9<T> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.Channel9
    /* renamed from: invokeOnClose, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo28845invokeOnClose(Function1 function1) {
        invokeOnClose((Function1<? super Throwable, Unit>) function1);
    }

    @Override // kotlinx.coroutines.channels.Channel9
    @Deprecated
    public boolean offer(T t) {
        return Produce4.DefaultImpls.offer(this, t);
    }

    public RxObservable(CoroutineContext coroutineContext, ObservableEmitter<T> observableEmitter) {
        super(coroutineContext, false, true);
        this.subscriber = observableEmitter;
        this.mutex = Mutex3.Mutex$default(false, 1, null);
    }

    @Override // kotlinx.coroutines.channels.Channel9
    public boolean isClosedForSend() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.Channel9
    public boolean close(Throwable cause) {
        return cancelCoroutine(cause);
    }

    public Void invokeOnClose(Function1<? super Throwable, Unit> handler) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.Channel9
    /* renamed from: trySend-JP2dKIU */
    public Object mo8337trySendJP2dKIU(T element) {
        if (!Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return Channel5.INSTANCE.m28814failurePtdJZtk();
        }
        Throwable thDoLockedNext = doLockedNext(element);
        if (thDoLockedNext == null) {
            return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
        }
        return Channel5.INSTANCE.m28813closedJP2dKIU(thDoLockedNext);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.Channel9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object send(T t, Continuation<? super Unit> continuation) throws Throwable {
        C461371 c461371;
        RxObservable<T> rxObservable;
        if (continuation instanceof C461371) {
            c461371 = (C461371) continuation;
            int i = c461371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461371.label = i - Integer.MIN_VALUE;
            } else {
                c461371 = new C461371(this, continuation);
            }
        }
        Object obj = c461371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex = this.mutex;
            c461371.L$0 = this;
            c461371.L$1 = t;
            c461371.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, c461371, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rxObservable = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t = (T) c461371.L$1;
            rxObservable = (RxObservable) c461371.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Throwable thDoLockedNext = rxObservable.doLockedNext(t);
        if (thDoLockedNext != null) {
            throw thDoLockedNext;
        }
        return Unit.INSTANCE;
    }

    private final Throwable doLockedNext(T elem) {
        if (!isActive()) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(elem);
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zClose = close(undeliverableException);
            unlockAndCheckCompleted();
            if (zClose) {
                return undeliverableException;
            }
            RxCancellable2.handleUndeliverableException(undeliverableException, getContext());
            return getCancellationException();
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isActive() || !Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return;
        }
        doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
    }

    private final void doLockedSignalCompleted(Throwable cause, boolean handled) {
        try {
            if (_signal$volatile$FU.get(this) != -2) {
                _signal$volatile$FU.set(this, -2);
                Throwable th = cause != null ? cause : null;
                if (th == null) {
                    try {
                        this.subscriber.onComplete();
                    } catch (Exception e) {
                        RxCancellable2.handleUndeliverableException(e, getContext());
                    }
                } else if ((th instanceof UndeliverableException) && !handled) {
                    RxCancellable2.handleUndeliverableException(cause, getContext());
                } else if (th != getCancellationException() || !this.subscriber.getDisposed()) {
                    try {
                        this.subscriber.onError(cause);
                    } catch (Exception e2) {
                        ExceptionsKt.addSuppressed(cause, e2);
                        RxCancellable2.handleUndeliverableException(cause, getContext());
                    }
                }
            }
        } finally {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }

    private final void signalCompleted(Throwable cause, boolean handled) {
        if (_signal$volatile$FU.compareAndSet(this, 0, -1) && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(cause, handled);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(Unit value) {
        signalCompleted(null, false);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable cause, boolean handled) {
        signalCompleted(cause, handled);
    }
}
