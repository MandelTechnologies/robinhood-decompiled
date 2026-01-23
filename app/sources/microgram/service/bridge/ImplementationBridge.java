package microgram.service.bridge;

import com.plaid.internal.EnumC7081g;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import microgram.service.protocol.Peer;
import microgram.service.protocol.ProtocolExceptions3;
import microgram.service.protocol.ProtocolMessage;
import microgram.service.protocol.ProtocolMessage3;
import microgram.service.protocol.ProtocolMessage6;
import microgram.service.protocol.ProtocolMessageSubscriber;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ImplementationBridge.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R,\u0010'\u001a\u001a\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lmicrogram/service/bridge/ImplementationBridge;", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/service/protocol/ServiceCallable;", "callable", "Lmicrogram/service/protocol/Peer;", "peer", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/service/protocol/ServiceCallable;Lmicrogram/service/protocol/Peer;)V", "Lmicrogram/service/protocol/Request$Call;", "call", "", "handleCall", "(Lmicrogram/service/protocol/Request$Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/protocol/Request$Cancellation;", "cancellation", "handleCancellation", "(Lmicrogram/service/protocol/Request$Cancellation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "id", "Lkotlinx/coroutines/Job;", "onJobCompletion", "(Ljava/lang/Throwable;Ljava/util/UUID;)Lkotlinx/coroutines/Job;", "Lmicrogram/service/protocol/ProtocolMessage;", "protocolMessage", "onMessage", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lmicrogram/service/protocol/ServiceCallable;", "Lmicrogram/service/protocol/Peer;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "", "Lkotlinx/coroutines/Deferred;", "calls", "Ljava/util/Map;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ImplementationBridge implements ProtocolMessageSubscriber {
    private final ServiceCallable callable;
    private final Map<UUID, Deferred<Throwable>> calls;
    private final CoroutineScope coroutineScope;
    private final Mutex lock;
    private final Peer peer;

    /* compiled from: ImplementationBridge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.ImplementationBridge", m3645f = "ImplementationBridge.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "handleCall")
    /* renamed from: microgram.service.bridge.ImplementationBridge$handleCall$1 */
    static final class C467821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C467821(Continuation<? super C467821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImplementationBridge.this.handleCall(null, this);
        }
    }

    /* compiled from: ImplementationBridge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.ImplementationBridge", m3645f = "ImplementationBridge.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "handleCancellation")
    /* renamed from: microgram.service.bridge.ImplementationBridge$handleCancellation$1 */
    static final class C467831 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C467831(Continuation<? super C467831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImplementationBridge.this.handleCancellation(null, this);
        }
    }

    public ImplementationBridge(CoroutineScope coroutineScope, ServiceCallable callable, Peer peer) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(peer, "peer");
        this.coroutineScope = coroutineScope;
        this.callable = callable;
        this.peer = peer;
        this.lock = Mutex3.Mutex$default(false, 1, null);
        this.calls = new LinkedHashMap();
    }

    @Override // microgram.service.protocol.ProtocolMessageSubscriber
    public Object onMessage(ProtocolMessage protocolMessage, Continuation<? super Unit> continuation) {
        if (protocolMessage instanceof ProtocolMessage3) {
            ProtocolMessage3 protocolMessage3 = (ProtocolMessage3) protocolMessage;
            if (protocolMessage3 instanceof ProtocolMessage3.Call) {
                Object objHandleCall = handleCall((ProtocolMessage3.Call) protocolMessage, continuation);
                return objHandleCall == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleCall : Unit.INSTANCE;
            }
            if (!(protocolMessage3 instanceof ProtocolMessage3.Cancellation)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objHandleCancellation = handleCancellation((ProtocolMessage3.Cancellation) protocolMessage, continuation);
            return objHandleCancellation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleCancellation : Unit.INSTANCE;
        }
        if (protocolMessage instanceof ProtocolMessage6) {
            throw new UnsupportedOperationException("Implementations cannot receive responses");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleCall(ProtocolMessage3.Call call, Continuation<? super Unit> continuation) {
        C467821 c467821;
        final ProtocolMessage3.Call call2;
        Mutex mutex;
        if (continuation instanceof C467821) {
            c467821 = (C467821) continuation;
            int i = c467821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467821.label = i - Integer.MIN_VALUE;
            } else {
                c467821 = new C467821(continuation);
            }
        }
        Object obj = c467821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.lock;
            call2 = call;
            c467821.L$0 = call2;
            c467821.L$1 = mutex2;
            c467821.label = 1;
            if (mutex2.lock(null, c467821) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex3 = (Mutex) c467821.L$1;
            ProtocolMessage3.Call call3 = (ProtocolMessage3.Call) c467821.L$0;
            ResultKt.throwOnFailure(obj);
            call2 = call3;
            mutex = mutex3;
        }
        try {
            if (this.calls.get(call2.getCallId()) != null) {
                throw new IOException("Call " + call2.getCallId() + " is already in flight");
            }
            Flow flow = FlowKt.flow(new ImplementationBridge4(this, call2, null));
            Integer limit = call2.getLimit();
            if (limit != null) {
                flow = FlowKt.take(flow, limit.intValue());
            }
            Flow flow2 = flow;
            Map<UUID, Deferred<Throwable>> map = this.calls;
            UUID callId = call2.getCallId();
            final Deferred<Throwable> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.coroutineScope, new CoroutineName("Respond to Call " + call2.getCallId()), null, new ImplementationBridge2(limit, flow2, this, call2, null), 2, null);
            deferredAsync$default.invokeOnCompletion(new Function1() { // from class: microgram.service.bridge.ImplementationBridge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ImplementationBridge.handleCall$lambda$3$lambda$2$lambda$1(this.f$0, deferredAsync$default, call2, (Throwable) obj2);
                }
            });
            map.put(callId, deferredAsync$default);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCall$lambda$3$lambda$2$lambda$1(ImplementationBridge implementationBridge, Deferred deferred, ProtocolMessage3.Call call, Throwable th) {
        if (th == null) {
            th = (Throwable) deferred.getCompleted();
        }
        implementationBridge.onJobCompletion(th, call.getCallId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleCancellation(ProtocolMessage3.Cancellation cancellation, Continuation<? super Unit> continuation) {
        C467831 c467831;
        UUID uuid;
        Mutex mutex;
        if (continuation instanceof C467831) {
            c467831 = (C467831) continuation;
            int i = c467831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467831.label = i - Integer.MIN_VALUE;
            } else {
                c467831 = new C467831(continuation);
            }
        }
        Object obj = c467831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            UUID callId = cancellation.getCallId();
            Mutex mutex2 = this.lock;
            c467831.L$0 = callId;
            c467831.L$1 = mutex2;
            c467831.label = 1;
            if (mutex2.lock(null, c467831) == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = callId;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c467831.L$1;
            uuid = (UUID) c467831.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            Deferred<Throwable> deferredRemove = this.calls.remove(uuid);
            if (deferredRemove != null) {
                Job.DefaultImpls.cancel$default(deferredRemove, null, 1, null);
                Unit unit = Unit.INSTANCE;
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* compiled from: ImplementationBridge.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.ImplementationBridge$onJobCompletion$1", m3645f = "ImplementationBridge.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.service.bridge.ImplementationBridge$onJobCompletion$1 */
    static final class C467841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $cause;
        final /* synthetic */ UUID $id;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C467841(Throwable th, UUID uuid, Continuation<? super C467841> continuation) {
            super(2, continuation);
            this.$cause = th;
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImplementationBridge.this.new C467841(this.$cause, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C467841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r1.send(r7, r6) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            UUID uuid;
            ImplementationBridge implementationBridge;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = ImplementationBridge.this.lock;
                    ImplementationBridge implementationBridge2 = ImplementationBridge.this;
                    uuid = this.$id;
                    this.L$0 = mutex;
                    this.L$1 = implementationBridge2;
                    this.L$2 = uuid;
                    this.label = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        implementationBridge = implementationBridge2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                uuid = (UUID) this.L$2;
                implementationBridge = (ImplementationBridge) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Deferred) implementationBridge.calls.remove(uuid)) != null && !(this.$cause instanceof ProtocolExceptions3)) {
                    UUID uuid2 = this.$id;
                    Throwable th = this.$cause;
                    ProtocolMessage6.Termination termination = new ProtocolMessage6.Termination(uuid2, th != null ? ImplementationBridge5.asTerminationError(th) : null);
                    Peer peer = ImplementationBridge.this.peer;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        }
    }

    private final Job onJobCompletion(Throwable cause, UUID id) {
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, new CoroutineName("Call completion: " + id), null, new C467841(cause, id, null), 2, null);
    }
}
