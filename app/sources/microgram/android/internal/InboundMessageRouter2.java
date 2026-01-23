package microgram.android.internal;

import com.mayakapps.rwmutex.ReadWriteMutex;
import com.mayakapps.rwmutex.ReadWriteMutex5;
import com.plaid.internal.EnumC7081g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.MicrogramError;
import microgram.RpcMessage;
import microgram.android.MessageHandler;
import microgram.android.extension.ServiceExtension;

/* compiled from: InboundMessageRouter.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ \u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J2\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u001c\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H&0)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0096@¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000e0\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lmicrogram/android/internal/RealInboundMessageRouter;", "Lmicrogram/android/internal/InboundMessageRouter;", "json", "Lkotlinx/serialization/json/Json;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "platformMessageTunnel", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "extensions", "", "", "Lmicrogram/android/extension/ServiceExtension;", "Lkotlin/jvm/JvmSuppressWildcards;", "handlers", "Lmicrogram/android/MessageHandler;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/internal/HostPlatformMessageTunnel;Ljava/util/Map;Ljava/util/Map;)V", "extensionLoadResults", "Ljava/util/concurrent/ConcurrentHashMap;", "", "kotlin.jvm.PlatformType", "unknownTargetMutex", "Lcom/mayakapps/rwmutex/ReadWriteMutex;", "accept", "Lmicrogram/MicrogramError;", "message", "Lmicrogram/RpcMessage;", "(Lmicrogram/RpcMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptWithoutUnknownTargetBuffer", "acceptWithHandler", "handler", "(Lmicrogram/RpcMessage;Lmicrogram/android/MessageHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installExtension", "id", "registerHandler", "", "target", "withUnknownTargetBuffering", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.RealInboundMessageRouter, reason: use source file name */
/* loaded from: classes14.dex */
public final class InboundMessageRouter2 implements InboundMessageRouter {
    private final ConcurrentHashMap<String, Boolean> extensionLoadResults;
    private final Map<String, ServiceExtension> extensions;
    private final ConcurrentHashMap<String, MessageHandler> handlers;
    private final Json json;
    private final HostPlatformMessageTunnel platformMessageTunnel;
    private final CoroutineScope scope;
    private final ReadWriteMutex unknownTargetMutex;

    /* compiled from: InboundMessageRouter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealInboundMessageRouter", m3645f = "InboundMessageRouter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 63, 66}, m3647m = "accept")
    /* renamed from: microgram.android.internal.RealInboundMessageRouter$accept$1 */
    static final class C462631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462631(Continuation<? super C462631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboundMessageRouter2.this.accept(null, this);
        }
    }

    /* compiled from: InboundMessageRouter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealInboundMessageRouter", m3645f = "InboundMessageRouter.kt", m3646l = {82, 99}, m3647m = "acceptWithHandler")
    /* renamed from: microgram.android.internal.RealInboundMessageRouter$acceptWithHandler$1 */
    static final class C462641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C462641(Continuation<? super C462641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboundMessageRouter2.this.acceptWithHandler(null, null, this);
        }
    }

    /* compiled from: InboundMessageRouter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealInboundMessageRouter", m3645f = "InboundMessageRouter.kt", m3646l = {125, 119}, m3647m = "withUnknownTargetBuffering")
    /* renamed from: microgram.android.internal.RealInboundMessageRouter$withUnknownTargetBuffering$1 */
    static final class C462671<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462671(Continuation<? super C462671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboundMessageRouter2.this.withUnknownTargetBuffering(null, this);
        }
    }

    public InboundMessageRouter2(Json json, CoroutineScope scope, HostPlatformMessageTunnel platformMessageTunnel, Map<String, ServiceExtension> extensions, Map<String, MessageHandler> handlers) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(platformMessageTunnel, "platformMessageTunnel");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.json = json;
        this.scope = scope;
        this.platformMessageTunnel = platformMessageTunnel;
        this.extensions = extensions;
        this.extensionLoadResults = new ConcurrentHashMap<>();
        this.handlers = new ConcurrentHashMap<>(handlers);
        this.unknownTargetMutex = ReadWriteMutex5.ReadWriteMutex();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.internal.InboundMessageRouter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object accept(RpcMessage rpcMessage, Continuation<? super MicrogramError> continuation) throws Throwable {
        C462631 c462631;
        Mutex readMutex;
        Throwable th;
        Mutex mutex;
        if (continuation instanceof C462631) {
            c462631 = (C462631) continuation;
            int i = c462631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462631.label = i - Integer.MIN_VALUE;
            } else {
                c462631 = new C462631(continuation);
            }
        }
        Object obj = c462631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462631.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MessageHandler messageHandler = this.handlers.get(rpcMessage.getTarget());
                if (messageHandler != null) {
                    c462631.label = 3;
                    Object objAcceptWithHandler = acceptWithHandler(rpcMessage, messageHandler, c462631);
                    if (objAcceptWithHandler != coroutine_suspended) {
                        return objAcceptWithHandler;
                    }
                } else {
                    readMutex = this.unknownTargetMutex.getReadMutex();
                    c462631.L$0 = rpcMessage;
                    c462631.L$1 = readMutex;
                    c462631.label = 1;
                    if (readMutex.lock(null, c462631) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                mutex = (Mutex) c462631.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    MicrogramError microgramError = (MicrogramError) obj;
                    mutex.unlock(null);
                    return microgramError;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            Mutex mutex2 = (Mutex) c462631.L$1;
            RpcMessage rpcMessage2 = (RpcMessage) c462631.L$0;
            ResultKt.throwOnFailure(obj);
            readMutex = mutex2;
            rpcMessage = rpcMessage2;
            c462631.L$0 = readMutex;
            c462631.L$1 = null;
            c462631.label = 2;
            Object objAcceptWithoutUnknownTargetBuffer = acceptWithoutUnknownTargetBuffer(rpcMessage, c462631);
            if (objAcceptWithoutUnknownTargetBuffer != coroutine_suspended) {
                Mutex mutex3 = readMutex;
                obj = objAcceptWithoutUnknownTargetBuffer;
                mutex = mutex3;
                MicrogramError microgramError2 = (MicrogramError) obj;
                mutex.unlock(null);
                return microgramError2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex4 = readMutex;
            th = th3;
            mutex = mutex4;
            mutex.unlock(null);
            throw th;
        }
    }

    private final Object acceptWithoutUnknownTargetBuffer(RpcMessage rpcMessage, Continuation<? super MicrogramError> continuation) {
        MessageHandler messageHandler = this.handlers.get(rpcMessage.getTarget());
        if (messageHandler == null) {
            return MicrogramError.UNKNOWN_TARGET;
        }
        return acceptWithHandler(rpcMessage, messageHandler, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acceptWithHandler(RpcMessage rpcMessage, MessageHandler messageHandler, Continuation<? super MicrogramError> continuation) {
        C462641 c462641;
        if (continuation instanceof C462641) {
            c462641 = (C462641) continuation;
            int i = c462641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462641.label = i - Integer.MIN_VALUE;
            } else {
                c462641 = new C462641(continuation);
            }
        }
        Object objHandle = c462641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHandle);
            Message message = new Message(rpcMessage);
            if (rpcMessage.getWantsReply()) {
                c462641.L$0 = rpcMessage;
                c462641.label = 1;
                objHandle = messageHandler.handleWithReplyAsync(message, c462641);
            } else {
                c462641.label = 2;
                objHandle = messageHandler.handle(message, c462641);
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHandle);
            if (((Boolean) objHandle).booleanValue()) {
                return null;
            }
            return MicrogramError.UNSUPPORTED;
        }
        rpcMessage = (RpcMessage) c462641.L$0;
        ResultKt.throwOnFailure(objHandle);
        Deferred deferred = (Deferred) objHandle;
        if (deferred != null) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C462652(deferred, this, rpcMessage, null), 3, null);
            return null;
        }
        return MicrogramError.UNSUPPORTED;
    }

    /* compiled from: InboundMessageRouter.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealInboundMessageRouter$acceptWithHandler$2", m3645f = "InboundMessageRouter.kt", m3646l = {86, 87}, m3647m = "invokeSuspend")
    /* renamed from: microgram.android.internal.RealInboundMessageRouter$acceptWithHandler$2 */
    static final class C462652 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Deferred<Message> $deferredReply;
        final /* synthetic */ RpcMessage $message;
        int label;
        final /* synthetic */ InboundMessageRouter2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462652(Deferred<Message> deferred, InboundMessageRouter2 inboundMessageRouter2, RpcMessage rpcMessage, Continuation<? super C462652> continuation) {
            super(2, continuation);
            this.$deferredReply = deferred;
            this.this$0 = inboundMessageRouter2;
            this.$message = rpcMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C462652(this.$deferredReply, this.this$0, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C462652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (microgram.android.internal.HostPlatformMessageTunnel2.sendRpcMessage(r1, r3, r4, r6) == r0) goto L15;
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
                Deferred<Message> deferred = this.$deferredReply;
                this.label = 1;
                obj = deferred.await(this);
                if (obj != coroutine_suspended) {
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
            HostPlatformMessageTunnel hostPlatformMessageTunnel = this.this$0.platformMessageTunnel;
            Json json = this.this$0.json;
            RpcMessage rpcMessage = new RpcMessage(this.$message.getMessageId(), (Message) obj);
            this.label = 2;
        }
    }

    @Override // microgram.android.internal.InboundMessageRouter
    public boolean installExtension(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Boolean boolComputeIfAbsent = this.extensionLoadResults.computeIfAbsent(id, new Function() { // from class: microgram.android.internal.RealInboundMessageRouter.installExtension.1
            @Override // java.util.function.Function
            public final Boolean apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ServiceExtension serviceExtension = (ServiceExtension) InboundMessageRouter2.this.extensions.get(id);
                if (serviceExtension != null) {
                    InboundMessageRouter2.this.handlers.putAll(serviceExtension.createMessageHandlers());
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(boolComputeIfAbsent, "computeIfAbsent(...)");
        return boolComputeIfAbsent.booleanValue();
    }

    @Override // microgram.android.internal.InboundMessageRouter
    public void registerHandler(String target, MessageHandler handler) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.put(target, handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.internal.InboundMessageRouter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object withUnknownTargetBuffering(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) throws Throwable {
        C462671 c462671;
        Mutex writeMutex;
        Throwable th;
        Mutex mutex;
        if (continuation instanceof C462671) {
            c462671 = (C462671) continuation;
            int i = c462671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462671.label = i - Integer.MIN_VALUE;
            } else {
                c462671 = new C462671(continuation);
            }
        }
        Object obj = c462671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462671.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                writeMutex = this.unknownTargetMutex.getWriteMutex();
                c462671.L$0 = function1;
                c462671.L$1 = writeMutex;
                c462671.label = 1;
                if (writeMutex.lock(null, c462671) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) c462671.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            Mutex mutex2 = (Mutex) c462671.L$1;
            Function1<? super Continuation<? super R>, ? extends Object> function12 = (Function1) c462671.L$0;
            ResultKt.throwOnFailure(obj);
            writeMutex = mutex2;
            function1 = function12;
            c462671.L$0 = writeMutex;
            c462671.L$1 = null;
            c462671.label = 2;
            Object objInvoke = function1.invoke(c462671);
            if (objInvoke != coroutine_suspended) {
                Mutex mutex3 = writeMutex;
                obj = objInvoke;
                mutex = mutex3;
                mutex.unlock(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex4 = writeMutex;
            th = th3;
            mutex = mutex4;
            mutex.unlock(null);
            throw th;
        }
    }
}
