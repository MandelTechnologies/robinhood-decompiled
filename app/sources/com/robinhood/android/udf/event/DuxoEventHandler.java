package com.robinhood.android.udf.event;

import dispatch.core.Launch;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: DuxoEventHandler.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J*\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u001cH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/udf/event/DuxoEventHandler;", "E", "", "Lcom/robinhood/android/udf/event/EventProducer;", "Lcom/robinhood/android/udf/event/EventConsumer;", "scopeProvider", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "eventQueueLock", "Lkotlinx/coroutines/sync/Mutex;", "eventQueue", "Ljava/util/Queue;", "Lcom/robinhood/android/udf/event/Event;", "events", "Lkotlinx/coroutines/flow/MutableStateFlow;", "eventFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "submit", "", "eventData", "(Ljava/lang/Object;)V", "consume", "event", "block", "Lkotlin/Function1;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes20.dex */
public final class DuxoEventHandler<E> implements EventProducer<E>, EventConsumer<E> {
    public static final int $stable = 8;
    private final StateFlow<Event<E>> eventFlow;
    private final Queue<Event<E>> eventQueue;
    private final Mutex eventQueueLock;
    private final StateFlow2<Event<E>> events;
    private final Function0<CoroutineScope> scopeProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public DuxoEventHandler(Function0<? extends CoroutineScope> scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.scopeProvider = scopeProvider;
        this.eventQueueLock = Mutex3.Mutex$default(false, 1, null);
        this.eventQueue = new LinkedList();
        StateFlow2<Event<E>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this.events = stateFlow2MutableStateFlow;
        this.eventFlow = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    @Override // com.robinhood.android.udf.event.EventProducer
    public StateFlow<Event<E>> getEventFlow() {
        return this.eventFlow;
    }

    /* compiled from: DuxoEventHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.udf.event.DuxoEventHandler$submit$1", m3645f = "DuxoEventHandler.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.udf.event.DuxoEventHandler$submit$1 */
    static final class C312561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ E $eventData;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DuxoEventHandler<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C312561(DuxoEventHandler<E> duxoEventHandler, E e, Continuation<? super C312561> continuation) {
            super(2, continuation);
            this.this$0 = duxoEventHandler;
            this.$eventData = e;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C312561(this.this$0, this.$eventData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DuxoEventHandler<E> duxoEventHandler;
            Mutex mutex;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Mutex mutex2 = ((DuxoEventHandler) this.this$0).eventQueueLock;
                duxoEventHandler = this.this$0;
                Object obj3 = this.$eventData;
                this.L$0 = mutex2;
                this.L$1 = duxoEventHandler;
                this.L$2 = obj3;
                this.label = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                obj2 = obj3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj4 = this.L$2;
                duxoEventHandler = (DuxoEventHandler) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj4;
            }
            try {
                Queue queue = ((DuxoEventHandler) duxoEventHandler).eventQueue;
                queue.add(new Event(obj2, (UUID) null, new WeakReference(duxoEventHandler), 2, (DefaultConstructorMarker) null));
                if (((DuxoEventHandler) duxoEventHandler).events.compareAndSet(null, queue.peek())) {
                    queue.poll();
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.udf.event.EventProducer
    public void submit(E eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Launch.launchMainImmediate$default(this.scopeProvider.invoke(), null, null, new C312561(this, eventData, null), 3, null);
    }

    /* compiled from: DuxoEventHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.udf.event.DuxoEventHandler$consume$1", m3645f = "DuxoEventHandler.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.udf.event.DuxoEventHandler$consume$1 */
    static final class C312551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<E, Unit> $block;
        final /* synthetic */ Event<E> $event;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ DuxoEventHandler<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C312551(DuxoEventHandler<E> duxoEventHandler, Function1<? super E, Unit> function1, Event<E> event, Continuation<? super C312551> continuation) {
            super(2, continuation);
            this.this$0 = duxoEventHandler;
            this.$block = function1;
            this.$event = event;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C312551(this.this$0, this.$block, this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            DuxoEventHandler<E> duxoEventHandler;
            Mutex mutex;
            Event<E> event;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                booleanRef = new Ref.BooleanRef();
                Mutex mutex2 = ((DuxoEventHandler) this.this$0).eventQueueLock;
                duxoEventHandler = this.this$0;
                Event<E> event2 = this.$event;
                this.L$0 = booleanRef;
                this.L$1 = mutex2;
                this.L$2 = duxoEventHandler;
                this.L$3 = event2;
                this.label = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                event = event2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                event = (Event) this.L$3;
                duxoEventHandler = (DuxoEventHandler) this.L$2;
                mutex = (Mutex) this.L$1;
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                booleanRef.element = ((DuxoEventHandler) duxoEventHandler).events.compareAndSet(event, ((DuxoEventHandler) duxoEventHandler).eventQueue.poll());
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                if (booleanRef.element) {
                    this.$block.invoke(this.$event.getData());
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.udf.event.EventConsumer
    public void consume(Event<E> event, Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(block, "block");
        Launch.launchMainImmediate$default(this.scopeProvider.invoke(), null, null, new C312551(this, block, event, null), 3, null);
    }
}
