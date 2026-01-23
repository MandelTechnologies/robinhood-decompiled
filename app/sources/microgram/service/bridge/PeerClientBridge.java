package microgram.service.bridge;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import kotlinx.serialization.json.JsonElement;
import microgram.generator.IdGenerator;
import microgram.service.protocol.Peer;
import microgram.service.protocol.ProtocolExceptions3;
import microgram.service.protocol.ProtocolMessage;
import microgram.service.protocol.ProtocolMessage3;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: PeerClientBridge.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\u000f\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010!\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00101\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m3636d2 = {"Lmicrogram/service/bridge/PeerClientBridge;", "Lmicrogram/service/bridge/ClientBridge;", "Lmicrogram/service/protocol/Peer;", "peer", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "uuidGenerator", "<init>", "(Lmicrogram/service/protocol/Peer;Lmicrogram/generator/IdGenerator;)V", "Lmicrogram/service/protocol/Response;", "response", "", "handleResponse", "(Lmicrogram/service/protocol/Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lkotlinx/serialization/json/JsonElement;", "element", "handleEmission", "(Ljava/util/UUID;Lkotlinx/serialization/json/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/protocol/Response$Termination$Error;", "error", "handleTermination", "(Ljava/util/UUID;Lmicrogram/service/protocol/Response$Termination$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "terminate", "(Ljava/util/UUID;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/protocol/ProtocolMessage;", "protocolMessage", "onMessage", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CarResultComposable2.BODY, "", "limit", "Lkotlinx/coroutines/flow/Flow;", "call", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;", "Lmicrogram/service/protocol/Peer;", "Lmicrogram/generator/IdGenerator;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "", "Lkotlinx/coroutines/channels/SendChannel;", "calls", "Ljava/util/Map;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PeerClientBridge implements ClientBridge {
    private final Map<UUID, Channel9<JsonElement>> calls;
    private final Mutex lock;
    private final Peer peer;
    private final IdGenerator<UUID> uuidGenerator;

    /* compiled from: PeerClientBridge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.PeerClientBridge", m3645f = "PeerClientBridge.kt", m3646l = {118, 91}, m3647m = "handleEmission")
    /* renamed from: microgram.service.bridge.PeerClientBridge$handleEmission$1 */
    static final class C467861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C467861(Continuation<? super C467861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerClientBridge.this.handleEmission(null, null, this);
        }
    }

    /* compiled from: PeerClientBridge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.PeerClientBridge", m3645f = "PeerClientBridge.kt", m3646l = {118}, m3647m = "terminate")
    /* renamed from: microgram.service.bridge.PeerClientBridge$terminate$1 */
    static final class C467871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C467871(Continuation<? super C467871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerClientBridge.this.terminate(null, null, this);
        }
    }

    public PeerClientBridge(Peer peer, IdGenerator<UUID> uuidGenerator) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.peer = peer;
        this.uuidGenerator = uuidGenerator;
        this.lock = Mutex3.Mutex$default(false, 1, null);
        this.calls = new LinkedHashMap();
    }

    @Override // microgram.service.protocol.ProtocolMessageSubscriber
    public Object onMessage(ProtocolMessage protocolMessage, Continuation<? super Unit> continuation) {
        if (protocolMessage instanceof ProtocolMessage6) {
            Object objHandleResponse = handleResponse((ProtocolMessage6) protocolMessage, continuation);
            return objHandleResponse == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleResponse : Unit.INSTANCE;
        }
        if (protocolMessage instanceof ProtocolMessage3) {
            throw new UnsupportedOperationException("Clients cannot receive requests");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: PeerClientBridge.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/serialization/json/JsonElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.bridge.PeerClientBridge$call$1", m3645f = "PeerClientBridge.kt", m3646l = {118, 58, 59, 61, 70, 70}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.service.bridge.PeerClientBridge$call$1 */
    static final class C467851 extends ContinuationImpl7 implements Function2<FlowCollector<? super JsonElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonElement $body;
        final /* synthetic */ Integer $limit;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ PeerClientBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C467851(Integer num, PeerClientBridge peerClientBridge, JsonElement jsonElement, Continuation<? super C467851> continuation) {
            super(2, continuation);
            this.$limit = num;
            this.this$0 = peerClientBridge;
            this.$body = jsonElement;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C467851 c467851 = new C467851(this.$limit, this.this$0, this.$body, continuation);
            c467851.L$0 = obj;
            return c467851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super JsonElement> flowCollector, Continuation<? super Unit> continuation) {
            return ((C467851) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x01a8, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r0, r9, r17) == r2) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0103 A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #1 {all -> 0x01d9, blocks: (B:30:0x00f5, B:32:0x0103, B:70:0x01db, B:71:0x01e2), top: B:76:0x00f5 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0152 A[Catch: all -> 0x003d, PHI: r0 r6 r7 r8 r9 r10
          0x0152: PHI (r0v29 kotlinx.coroutines.channels.ChannelIterator) = (r0v26 kotlinx.coroutines.channels.ChannelIterator), (r0v30 kotlinx.coroutines.channels.ChannelIterator) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE]
          0x0152: PHI (r6v16 kotlin.jvm.internal.Ref$IntRef) = (r6v14 kotlin.jvm.internal.Ref$IntRef), (r6v17 kotlin.jvm.internal.Ref$IntRef) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE]
          0x0152: PHI (r7v18 kotlin.jvm.internal.Ref$ObjectRef) = (r7v16 kotlin.jvm.internal.Ref$ObjectRef), (r7v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE]
          0x0152: PHI (r8v17 microgram.service.protocol.Request$Call) = (r8v15 microgram.service.protocol.Request$Call), (r8v18 microgram.service.protocol.Request$Call) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE]
          0x0152: PHI (r9v17 kotlinx.coroutines.flow.FlowCollector) = (r9v15 kotlinx.coroutines.flow.FlowCollector), (r9v18 kotlinx.coroutines.flow.FlowCollector) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE]
          0x0152: PHI (r10v11 java.lang.Object) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:15:0x0059, B:40:0x014e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x003d, blocks: (B:9:0x0038, B:47:0x0179, B:39:0x013d, B:42:0x0152, B:44:0x015a, B:49:0x017d, B:52:0x0182, B:14:0x0056, B:17:0x0072, B:38:0x0139), top: B:77:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015a A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:9:0x0038, B:47:0x0179, B:39:0x013d, B:42:0x0152, B:44:0x015a, B:49:0x017d, B:52:0x0182, B:14:0x0056, B:17:0x0072, B:38:0x0139), top: B:77:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017d A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:9:0x0038, B:47:0x0179, B:39:0x013d, B:42:0x0152, B:44:0x015a, B:49:0x017d, B:52:0x0182, B:14:0x0056, B:17:0x0072, B:38:0x0139), top: B:77:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0188 A[PHI: r6 r7 r8
          0x0188: PHI (r6v15 kotlin.jvm.internal.Ref$IntRef) = (r6v16 kotlin.jvm.internal.Ref$IntRef), (r6v18 kotlin.jvm.internal.Ref$IntRef) binds: [B:43:0x0158, B:53:0x0186] A[DONT_GENERATE, DONT_INLINE]
          0x0188: PHI (r7v17 kotlin.jvm.internal.Ref$ObjectRef) = (r7v18 kotlin.jvm.internal.Ref$ObjectRef), (r7v20 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:43:0x0158, B:53:0x0186] A[DONT_GENERATE, DONT_INLINE]
          0x0188: PHI (r8v16 microgram.service.protocol.Request$Call) = (r8v17 microgram.service.protocol.Request$Call), (r8v19 microgram.service.protocol.Request$Call) binds: [B:43:0x0158, B:53:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01db A[Catch: all -> 0x01d9, TRY_ENTER, TryCatch #1 {all -> 0x01d9, blocks: (B:30:0x00f5, B:32:0x0103, B:70:0x01db, B:71:0x01e2), top: B:76:0x00f5 }] */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0176 -> B:47:0x0179). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.IntRef intRef;
            Ref.ObjectRef objectRef;
            ProtocolMessage3.Call call;
            ?? r0;
            FlowCollector flowCollector;
            PeerClientBridge peerClientBridge;
            ProtocolMessage3.Call call2;
            Mutex mutex;
            Ref.ObjectRef objectRef2;
            Channel channel;
            Ref.IntRef intRef2;
            Channel channel2;
            Ref.ObjectRef objectRef3;
            FlowCollector flowCollector2;
            Channel3 it;
            Object objHasNext;
            Integer num;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                        Integer num2 = this.$limit;
                        if (num2 != null && num2.intValue() <= 0) {
                            return Unit.INSTANCE;
                        }
                        ProtocolMessage3.Call call3 = new ProtocolMessage3.Call((UUID) this.this$0.uuidGenerator.next(), this.$body, this.$limit);
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        Channel channelChannel$default = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                        Mutex mutex2 = this.this$0.lock;
                        PeerClientBridge peerClientBridge2 = this.this$0;
                        this.L$0 = flowCollector3;
                        this.L$1 = call3;
                        this.L$2 = objectRef4;
                        this.L$3 = channelChannel$default;
                        this.L$4 = mutex2;
                        this.L$5 = peerClientBridge2;
                        this.label = 1;
                        if (mutex2.lock(null, this) != coroutine_suspended) {
                            flowCollector = flowCollector3;
                            peerClientBridge = peerClientBridge2;
                            call2 = call3;
                            mutex = mutex2;
                            objectRef2 = objectRef4;
                            channel = channelChannel$default;
                            try {
                                if (peerClientBridge.calls.get(call2.getCallId()) != null) {
                                    peerClientBridge.calls.put(call2.getCallId(), channel);
                                    Unit unit = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    intRef2 = new Ref.IntRef();
                                    try {
                                        Peer peer = this.this$0.peer;
                                        this.L$0 = flowCollector;
                                        this.L$1 = call2;
                                        this.L$2 = objectRef2;
                                        this.L$3 = channel;
                                        this.L$4 = intRef2;
                                        this.L$5 = null;
                                        this.label = 2;
                                        if (peer.send(call2, this) != coroutine_suspended) {
                                            channel2 = channel;
                                            objectRef3 = objectRef2;
                                            call = call2;
                                            flowCollector2 = flowCollector;
                                            it = channel2.iterator();
                                            this.L$0 = flowCollector2;
                                            this.L$1 = call;
                                            this.L$2 = objectRef3;
                                            this.L$3 = intRef2;
                                            this.L$4 = it;
                                            this.label = 3;
                                            objHasNext = it.hasNext(this);
                                            if (objHasNext == coroutine_suspended) {
                                                if (!((Boolean) objHasNext).booleanValue()) {
                                                    JsonElement jsonElement = (JsonElement) it.next();
                                                    intRef2.element++;
                                                    this.L$0 = flowCollector2;
                                                    this.L$1 = call;
                                                    this.L$2 = objectRef3;
                                                    this.L$3 = intRef2;
                                                    this.L$4 = it;
                                                    this.label = 4;
                                                    if (flowCollector2.emit(jsonElement, this) == coroutine_suspended) {
                                                    }
                                                    num = this.$limit;
                                                    if (num != null) {
                                                        int i = intRef2.element;
                                                        if (num != null && i == num.intValue()) {
                                                            NonCancellable nonCancellable = NonCancellable.INSTANCE;
                                                            PeerClientBridge peerClientBridge3 = this.this$0;
                                                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(peerClientBridge3, call, objectRef3, intRef2, this.$limit, null);
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.L$2 = null;
                                                            this.L$3 = null;
                                                            this.L$4 = null;
                                                            this.label = 5;
                                                            break;
                                                        }
                                                    }
                                                    this.L$0 = flowCollector2;
                                                    this.L$1 = call;
                                                    this.L$2 = objectRef3;
                                                    this.L$3 = intRef2;
                                                    this.L$4 = it;
                                                    this.label = 3;
                                                    objHasNext = it.hasNext(this);
                                                    if (objHasNext == coroutine_suspended) {
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        ProtocolMessage3.Call call4 = call2;
                                        objectRef = objectRef2;
                                        call = call4;
                                        intRef = intRef2;
                                        r0 = th;
                                        try {
                                            objectRef.element = r0;
                                            throw r0;
                                        } catch (Throwable th2) {
                                            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                            AnonymousClass2 anonymousClass22 = new AnonymousClass2(this.this$0, call, objectRef, intRef, this.$limit, null);
                                            this.L$0 = th2;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.label = 6;
                                            if (BuildersKt.withContext(nonCancellable2, anonymousClass22, this) != coroutine_suspended) {
                                                throw th2;
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th3) {
                                mutex.unlock(null);
                                throw th3;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        peerClientBridge = (PeerClientBridge) this.L$5;
                        mutex = (Mutex) this.L$4;
                        channel = (Channel) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        call2 = (ProtocolMessage3.Call) this.L$1;
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (peerClientBridge.calls.get(call2.getCallId()) != null) {
                        }
                        break;
                    case 2:
                        intRef2 = (Ref.IntRef) this.L$4;
                        channel2 = (Channel) this.L$3;
                        objectRef3 = (Ref.ObjectRef) this.L$2;
                        call = (ProtocolMessage3.Call) this.L$1;
                        flowCollector2 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = channel2.iterator();
                        this.L$0 = flowCollector2;
                        this.L$1 = call;
                        this.L$2 = objectRef3;
                        this.L$3 = intRef2;
                        this.L$4 = it;
                        this.label = 3;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        it = (Channel3) this.L$4;
                        intRef2 = (Ref.IntRef) this.L$3;
                        objectRef3 = (Ref.ObjectRef) this.L$2;
                        call = (ProtocolMessage3.Call) this.L$1;
                        flowCollector2 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objHasNext = obj;
                        if (!((Boolean) objHasNext).booleanValue()) {
                        }
                        return coroutine_suspended;
                    case 4:
                        it = (Channel3) this.L$4;
                        intRef2 = (Ref.IntRef) this.L$3;
                        objectRef3 = (Ref.ObjectRef) this.L$2;
                        call = (ProtocolMessage3.Call) this.L$1;
                        flowCollector2 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        num = this.$limit;
                        if (num != null) {
                        }
                        this.L$0 = flowCollector2;
                        this.L$1 = call;
                        this.L$2 = objectRef3;
                        this.L$3 = intRef2;
                        this.L$4 = it;
                        this.label = 3;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        Throwable th4 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th4;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                intRef = intRef2;
                objectRef = objectRef3;
                r0 = th5;
            }
        }

        /* compiled from: PeerClientBridge.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "microgram.service.bridge.PeerClientBridge$call$1$2", m3645f = "PeerClientBridge.kt", m3646l = {74, 76}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: microgram.service.bridge.PeerClientBridge$call$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ProtocolMessage3.Call $call;
            final /* synthetic */ Ref.ObjectRef<Throwable> $cause;
            final /* synthetic */ Integer $limit;
            final /* synthetic */ Ref.IntRef $taken;
            int label;
            final /* synthetic */ PeerClientBridge this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PeerClientBridge peerClientBridge, ProtocolMessage3.Call call, Ref.ObjectRef<Throwable> objectRef, Ref.IntRef intRef, Integer num, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = peerClientBridge;
                this.$call = call;
                this.$cause = objectRef;
                this.$taken = intRef;
                this.$limit = num;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$call, this.$cause, this.$taken, this.$limit, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
            
                if (r8.send(r1, r7) == r0) goto L30;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PeerClientBridge peerClientBridge = this.this$0;
                    UUID callId = this.$call.getCallId();
                    Throwable th = this.$cause.element;
                    if (th == null || (th instanceof CancellationException)) {
                        th = null;
                    }
                    this.label = 1;
                    if (peerClientBridge.terminate(callId, th, this) != coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
                Throwable th2 = this.$cause.element;
                if (th2 != null && !(th2 instanceof ProtocolExceptions3)) {
                    int i2 = this.$taken.element;
                    Integer num = this.$limit;
                    if (num == null || i2 != num.intValue()) {
                        Peer peer = this.this$0.peer;
                        ProtocolMessage3.Cancellation cancellation = new ProtocolMessage3.Cancellation(this.$call.getCallId());
                        this.label = 2;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // microgram.service.bridge.ClientBridge
    public Flow<JsonElement> call(JsonElement body, Integer limit) {
        Intrinsics.checkNotNullParameter(body, "body");
        return FlowKt.flow(new C467851(limit, this, body, null));
    }

    private final Object handleResponse(ProtocolMessage6 protocolMessage6, Continuation<? super Unit> continuation) {
        if (protocolMessage6 instanceof ProtocolMessage6.Emission) {
            ProtocolMessage6.Emission emission = (ProtocolMessage6.Emission) protocolMessage6;
            Object objHandleEmission = handleEmission(emission.getCallId(), emission.getBody(), continuation);
            return objHandleEmission == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleEmission : Unit.INSTANCE;
        }
        if (!(protocolMessage6 instanceof ProtocolMessage6.Termination)) {
            throw new NoWhenBranchMatchedException();
        }
        ProtocolMessage6.Termination termination = (ProtocolMessage6.Termination) protocolMessage6;
        Object objHandleTermination = handleTermination(termination.getCallId(), termination.getError(), continuation);
        return objHandleTermination == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleTermination : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r7.send(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEmission(UUID uuid, JsonElement jsonElement, Continuation<? super Unit> continuation) {
        C467861 c467861;
        Mutex mutex;
        if (continuation instanceof C467861) {
            c467861 = (C467861) continuation;
            int i = c467861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467861.label = i - Integer.MIN_VALUE;
            } else {
                c467861 = new C467861(continuation);
            }
        }
        Object obj = c467861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467861.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.lock;
                c467861.L$0 = uuid;
                c467861.L$1 = jsonElement;
                c467861.L$2 = mutex;
                c467861.label = 1;
                if (mutex.lock(null, c467861) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            Mutex mutex2 = (Mutex) c467861.L$2;
            jsonElement = (JsonElement) c467861.L$1;
            UUID uuid2 = (UUID) c467861.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            uuid = uuid2;
            Channel9<JsonElement> channel9 = this.calls.get(uuid);
            if (channel9 != null) {
                c467861.L$0 = null;
                c467861.L$1 = null;
                c467861.L$2 = null;
                c467861.label = 2;
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    private final Object handleTermination(UUID uuid, ProtocolMessage6.Termination.Error error, Continuation<? super Unit> continuation) {
        Object objTerminate = terminate(uuid, error != null ? PeerClientBridge2.asException(error) : null, continuation);
        return objTerminate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTerminate : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object terminate(UUID uuid, Throwable th, Continuation<? super Boolean> continuation) {
        C467871 c467871;
        Mutex mutex;
        if (continuation instanceof C467871) {
            c467871 = (C467871) continuation;
            int i = c467871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467871.label = i - Integer.MIN_VALUE;
            } else {
                c467871 = new C467871(continuation);
            }
        }
        Object obj = c467871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.lock;
            c467871.L$0 = uuid;
            c467871.L$1 = th;
            c467871.L$2 = mutex;
            c467871.label = 1;
            if (mutex.lock(null, c467871) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c467871.L$2;
            th = (Throwable) c467871.L$1;
            UUID uuid2 = (UUID) c467871.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            uuid = uuid2;
        }
        try {
            Channel9<JsonElement> channel9Remove = this.calls.remove(uuid);
            if (channel9Remove != null) {
                return boxing.boxBoolean(channel9Remove.close(th));
            }
            return null;
        } finally {
            mutex.unlock(null);
        }
    }

    public String toString() {
        return "PeerClientBridge(peer=" + this.peer + ")";
    }
}
