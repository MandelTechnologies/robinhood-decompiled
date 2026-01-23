package microgram.android.internal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.MicrogramError;
import microgram.RpcMessage;
import microgram.android.MessageHandler;
import microgram.android.MicrogramSource;
import microgram.android.internal.HostReceiveMessageHandler4;
import microgram.android.internal.RpcListener;

/* compiled from: HostReceiveMessageHandler.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/android/internal/RealHostReceiveMessageHandler;", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "json", "Lkotlinx/serialization/json/Json;", "inboundMessageRouter", "Lmicrogram/android/internal/InboundMessageRouter;", "replyReceiver", "Lmicrogram/android/internal/ReplyReceiver;", "listener", "Lmicrogram/android/internal/RpcListener;", "source", "Lmicrogram/android/MicrogramSource;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lkotlinx/serialization/json/Json;Lmicrogram/android/internal/InboundMessageRouter;Lmicrogram/android/internal/ReplyReceiver;Lmicrogram/android/internal/RpcListener;Lmicrogram/android/MicrogramSource;Lcom/robinhood/android/tracing/TrackTrace;)V", "localTrace", "processIncomingMessage", "Lmicrogram/MicrogramError;", "message", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUnderlyingTransportReset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerMessageHandler", "identifier", "handler", "Lmicrogram/android/MessageHandler;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.RealHostReceiveMessageHandler, reason: use source file name */
/* loaded from: classes14.dex */
public final class HostReceiveMessageHandler3 implements HostReceiveMessageHandler {
    private final InboundMessageRouter inboundMessageRouter;
    private final Json json;
    private final RpcListener listener;
    private final RhTrace6 localTrace;
    private final HostReceiveMessageHandler4 replyReceiver;
    private final MicrogramSource source;

    /* compiled from: HostReceiveMessageHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.internal.RealHostReceiveMessageHandler$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HostReceiveMessageHandler4.Status.values().length];
            try {
                iArr[HostReceiveMessageHandler4.Status.NOT_ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HostReceiveMessageHandler4.Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HostReceiveMessageHandler4.Status.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: HostReceiveMessageHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealHostReceiveMessageHandler", m3645f = "HostReceiveMessageHandler.kt", m3646l = {119, 123, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "processIncomingMessage")
    /* renamed from: microgram.android.internal.RealHostReceiveMessageHandler$processIncomingMessage$1 */
    static final class C462621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462621(Continuation<? super C462621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HostReceiveMessageHandler3.this.processIncomingMessage(null, this);
        }
    }

    public HostReceiveMessageHandler3(Json json, InboundMessageRouter inboundMessageRouter, HostReceiveMessageHandler4 replyReceiver, RpcListener listener, MicrogramSource source, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
        Intrinsics.checkNotNullParameter(replyReceiver, "replyReceiver");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.json = json;
        this.inboundMessageRouter = inboundMessageRouter;
        this.replyReceiver = replyReceiver;
        this.listener = listener;
        this.source = source;
        this.localTrace = instanceTrace.withMethodNamePrefix("RealHostReceiveMessageHandler.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:57:0x00e8, B:21:0x0044, B:41:0x00b4, B:46:0x00c5, B:47:0x00ca, B:48:0x00cb, B:49:0x00ce), top: B:67:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // microgram.android.internal.HostReceiveMessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processIncomingMessage(String str, Continuation<? super MicrogramError> continuation) throws Throwable {
        C462621 c462621;
        RhTrace3 rhTrace3BeginSpan;
        RpcMessage rpcMessage;
        RhTrace3 rhTrace3;
        int i;
        if (continuation instanceof C462621) {
            c462621 = (C462621) continuation;
            int i2 = c462621.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c462621.label = i2 - Integer.MIN_VALUE;
            } else {
                c462621 = new C462621(continuation);
            }
        }
        Object obj = c462621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c462621.label;
        MicrogramError microgramError = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                RhTrace6 rhTrace6 = this.localTrace;
                rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("processIncomingMessage");
                try {
                    Json json = this.json;
                    json.getSerializersModule();
                    rpcMessage = (RpcMessage) json.decodeFromString(RpcMessage.INSTANCE.serializer(), str);
                    RpcListener rpcListener = this.listener;
                    MicrogramSource microgramSource = this.source;
                    RpcListener.Direction direction = RpcListener.Direction.RECEIVE;
                    c462621.L$0 = rhTrace3BeginSpan;
                    c462621.L$1 = rpcMessage;
                    c462621.label = 1;
                    if (rpcListener.onRpcEvent(microgramSource, direction, rpcMessage, c462621) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    RhTrace3 rhTrace32 = rhTrace3BeginSpan;
                    th = th;
                    str = rhTrace32;
                    if (str != 0) {
                        str.end();
                    }
                    throw th;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rhTrace3 = (RhTrace3) c462621.L$0;
                    ResultKt.throwOnFailure(obj);
                    microgramError = (MicrogramError) obj;
                    if (rhTrace3 != null) {
                        rhTrace3.end();
                    }
                    return microgramError;
                }
                rhTrace3 = (RhTrace3) c462621.L$0;
                ResultKt.throwOnFailure(obj);
                i = WhenMappings.$EnumSwitchMapping$0[((HostReceiveMessageHandler4.Status) obj).ordinal()];
                if (i != 1) {
                    microgramError = MicrogramError.WIRE_COMMUNICATION_ERROR;
                } else if (i == 2) {
                    microgramError = MicrogramError.INTERNAL_ERROR;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (rhTrace3 != null) {
                }
                return microgramError;
            }
            rpcMessage = (RpcMessage) c462621.L$1;
            RhTrace3 rhTrace33 = (RhTrace3) c462621.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                rhTrace3BeginSpan = rhTrace33;
            } catch (Throwable th2) {
                th = th2;
                str = rhTrace33;
                if (str != 0) {
                }
                throw th;
            }
            if (rpcMessage.getIsReply()) {
                Message message = new Message(rpcMessage);
                HostReceiveMessageHandler4 hostReceiveMessageHandler4 = this.replyReceiver;
                String target = rpcMessage.getTarget();
                c462621.L$0 = rhTrace3BeginSpan;
                c462621.L$1 = null;
                c462621.label = 2;
                Object objProcessReply = hostReceiveMessageHandler4.processReply(target, message, c462621);
                if (objProcessReply != coroutine_suspended) {
                    RhTrace3 rhTrace34 = rhTrace3BeginSpan;
                    obj = objProcessReply;
                    rhTrace3 = rhTrace34;
                    i = WhenMappings.$EnumSwitchMapping$0[((HostReceiveMessageHandler4.Status) obj).ordinal()];
                    if (i != 1) {
                    }
                    if (rhTrace3 != null) {
                    }
                    return microgramError;
                }
            } else {
                InboundMessageRouter inboundMessageRouter = this.inboundMessageRouter;
                c462621.L$0 = rhTrace3BeginSpan;
                c462621.L$1 = null;
                c462621.label = 3;
                Object objAccept = inboundMessageRouter.accept(rpcMessage, c462621);
                if (objAccept != coroutine_suspended) {
                    RhTrace3 rhTrace35 = rhTrace3BeginSpan;
                    obj = objAccept;
                    rhTrace3 = rhTrace35;
                    microgramError = (MicrogramError) obj;
                    if (rhTrace3 != null) {
                    }
                    return microgramError;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // microgram.android.internal.HostReceiveMessageHandler
    public Object handleUnderlyingTransportReset(Continuation<? super Unit> continuation) {
        this.localTrace.instant("handleUnderlyingTransportReset");
        Object objOnInterrupted = this.replyReceiver.onInterrupted(continuation);
        return objOnInterrupted == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnInterrupted : Unit.INSTANCE;
    }

    @Override // microgram.android.internal.HostReceiveMessageHandler
    public void registerMessageHandler(String identifier, MessageHandler handler) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(handler, "handler");
        RhTrace6 rhTrace6 = this.localTrace;
        if (rhTrace6.isEnabled()) {
            rhTrace6.instant("registerMessageHandler(\"" + identifier + "\", ...)");
        }
        this.inboundMessageRouter.registerHandler(identifier, handler);
    }
}
