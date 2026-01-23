package io.ktor.utils.p478io;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job2;
import kotlinx.coroutines.Job3;
import kotlinx.coroutines.Job4;
import kotlinx.coroutines.selects.SelectClause0;

/* compiled from: Coroutines.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u000f\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0014J\"\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0017J8\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0003¢\u0006\u0004\b\"\u0010#J\u0014\u0010$\u001a\u00060\u0015j\u0002`\u0016H\u0097\u0001¢\u0006\u0004\b$\u0010%JM\u0010.\u001a\u00020-2\b\b\u0002\u0010&\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132'\u0010,\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0(j\u0002`+H\u0097\u0001¢\u0006\u0004\b.\u0010/J9\u0010.\u001a\u00020-2'\u0010,\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0(j\u0002`+H\u0096\u0001¢\u0006\u0004\b.\u00100J\u0013\u00101\u001a\u00020\u000eH\u0096Aø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001c\u00104\u001a\u0002032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u0002032\u0006\u00106\u001a\u000203H\u0096\u0003¢\u0006\u0004\b7\u00108J\u0018\u00107\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0097\u0003¢\u0006\u0004\b7\u0010:J\u0010\u0010;\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010<R\u0014\u0010I\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010<R\u0014\u0010J\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010<R\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, m3636d2 = {"Lio/ktor/utils/io/ChannelJob;", "", "Lio/ktor/utils/io/WriterJob;", "Lkotlinx/coroutines/Job;", "delegate", "Lio/ktor/utils/io/ByteChannel;", "channel", "<init>", "(Lkotlinx/coroutines/Job;Lio/ktor/utils/io/ByteChannel;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "", "cancel", "()V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "other", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "start", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "Lio/ktor/utils/io/ByteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteChannel;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "isActive", "isCancelled", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ChannelJob, reason: use source file name */
/* loaded from: classes14.dex */
final class Coroutines implements Job, Coroutines5 {
    private final ByteChannelCtor channel;
    private final Job delegate;

    @Override // kotlinx.coroutines.Job
    public Job2 attachChild(Job3 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.delegate.attachChild(child);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cause) {
        this.delegate.cancel(cause);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public /* synthetic */ boolean cancel(Throwable cause) {
        return this.delegate.cancel(cause);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation2) {
        Intrinsics.checkNotNullParameter(operation2, "operation");
        return (R) this.delegate.fold(initial, operation2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (E) this.delegate.get(key);
    }

    @Override // kotlinx.coroutines.Job
    public CancellationException getCancellationException() {
        return this.delegate.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    public Sequence<Job> getChildren() {
        return this.delegate.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.delegate.getKey();
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        return this.delegate.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return this.delegate.getParent();
    }

    @Override // kotlinx.coroutines.Job
    public Job4 invokeOnCompletion(Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.Job
    public Job4 invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(onCancelling, invokeImmediately, handler);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.delegate.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.delegate.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public Object join(Continuation<? super Unit> continuation) {
        return this.delegate.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.delegate.plus(context);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public Job plus(Job other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.delegate.plus(other);
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.delegate.start();
    }

    public Coroutines(Job delegate, ByteChannelCtor channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.delegate = delegate;
        this.channel = channel;
    }

    @Override // io.ktor.utils.p478io.Coroutines5
    public ByteChannelCtor getChannel() {
        return this.channel;
    }

    public String toString() {
        return "ChannelJob[" + this.delegate + ']';
    }
}
