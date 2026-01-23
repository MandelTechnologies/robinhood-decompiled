package microgram.android.internal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.MicrogramError;
import microgram.RpcMessage;
import microgram.android.HostMessageDispatcher;
import microgram.android.MessageHandler;
import microgram.android.MicrogramSource;
import microgram.android.internal.HostReceiveMessageHandler4;
import microgram.android.internal.RpcListener;
import microgram.generator.IdGenerator;

/* compiled from: RealHostMessageDispatcher.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ \u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Lmicrogram/android/internal/RealHostMessageDispatcher;", "Lmicrogram/android/HostMessageDispatcher;", "Lmicrogram/android/internal/ReplyReceiver;", "Lkotlinx/serialization/json/Json;", "json", "Lmicrogram/generator/IdGenerator;", "", "stringIdGenerator", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "platformMessageTunnel", "Lmicrogram/android/internal/RpcListener;", "listener", "Lmicrogram/android/MicrogramSource;", "source", "Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "<init>", "(Lkotlinx/serialization/json/Json;Lmicrogram/generator/IdGenerator;Lmicrogram/android/internal/HostPlatformMessageTunnel;Lmicrogram/android/internal/RpcListener;Lmicrogram/android/MicrogramSource;Lcom/robinhood/android/tracing/TrackTrace;)V", "identifier", "Lmicrogram/android/MessageHandler;", "handler", "", "registerMessageHandler", "(Ljava/lang/String;Lmicrogram/android/MessageHandler;)V", "target", "Lmicrogram/Message;", "message", "Lmicrogram/MicrogramError;", "sendMessage", "(Ljava/lang/String;Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessageWithReply", "messageId", "Lmicrogram/android/internal/ReplyReceiver$Status;", "processReply", "onInterrupted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/Json;", "Lmicrogram/generator/IdGenerator;", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "Lmicrogram/android/internal/RpcListener;", "Lmicrogram/android/MicrogramSource;", "localTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "", "Lkotlinx/coroutines/CompletableDeferred;", "replies", "Ljava/util/Map;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RealHostMessageDispatcher implements HostMessageDispatcher, HostReceiveMessageHandler4 {
    private final Json json;
    private final RpcListener listener;
    private final RhTrace6 localTrace;
    private final Mutex lock;
    private final HostPlatformMessageTunnel platformMessageTunnel;
    private final Map<String, CompletableDeferred<Message>> replies;
    private final MicrogramSource source;
    private final IdGenerator<String> stringIdGenerator;

    /* compiled from: RealHostMessageDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealHostMessageDispatcher", m3645f = "RealHostMessageDispatcher.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "onInterrupted")
    /* renamed from: microgram.android.internal.RealHostMessageDispatcher$onInterrupted$1 */
    static final class C462581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462581(Continuation<? super C462581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHostMessageDispatcher.this.onInterrupted(this);
        }
    }

    /* compiled from: RealHostMessageDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealHostMessageDispatcher", m3645f = "RealHostMessageDispatcher.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "processReply")
    /* renamed from: microgram.android.internal.RealHostMessageDispatcher$processReply$1 */
    static final class C462591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C462591(Continuation<? super C462591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHostMessageDispatcher.this.processReply(null, null, this);
        }
    }

    /* compiled from: RealHostMessageDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealHostMessageDispatcher", m3645f = "RealHostMessageDispatcher.kt", m3646l = {53, 55}, m3647m = "sendMessage")
    /* renamed from: microgram.android.internal.RealHostMessageDispatcher$sendMessage$1 */
    static final class C462601 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462601(Continuation<? super C462601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHostMessageDispatcher.this.sendMessage(null, null, this);
        }
    }

    /* compiled from: RealHostMessageDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.RealHostMessageDispatcher", m3645f = "RealHostMessageDispatcher.kt", m3646l = {70, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 77, 79, 81, 83, 83}, m3647m = "sendMessageWithReply")
    /* renamed from: microgram.android.internal.RealHostMessageDispatcher$sendMessageWithReply$1 */
    static final class C462611 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C462611(Continuation<? super C462611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHostMessageDispatcher.this.sendMessageWithReply(null, null, this);
        }
    }

    public RealHostMessageDispatcher(Json json, IdGenerator<String> stringIdGenerator, HostPlatformMessageTunnel platformMessageTunnel, RpcListener listener, MicrogramSource source, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(stringIdGenerator, "stringIdGenerator");
        Intrinsics.checkNotNullParameter(platformMessageTunnel, "platformMessageTunnel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.json = json;
        this.stringIdGenerator = stringIdGenerator;
        this.platformMessageTunnel = platformMessageTunnel;
        this.listener = listener;
        this.source = source;
        this.localTrace = instanceTrace.withMethodNamePrefix("RealHostMessageDispatcher.");
        this.lock = Mutex3.Mutex$default(false, 1, null);
        this.replies = new LinkedHashMap();
    }

    @Override // microgram.android.HostMessageDispatcher
    public void registerMessageHandler(String identifier, MessageHandler handler) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.platformMessageTunnel.registerMessageHandler(identifier, handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // microgram.android.HostMessageDispatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendMessage(String str, Message message, Continuation<? super MicrogramError> continuation) throws Throwable {
        C462601 c462601;
        String str2;
        RhTrace3 rhTrace3BeginSpan;
        RpcMessage rpcMessage;
        RhTrace3 rhTrace3;
        if (continuation instanceof C462601) {
            c462601 = (C462601) continuation;
            int i = c462601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462601.label = i - Integer.MIN_VALUE;
            } else {
                c462601 = new C462601(continuation);
            }
        }
        Object objSendRpcMessage = c462601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRpcMessage);
            RhTrace6 rhTrace6 = this.localTrace;
            if (rhTrace6.isEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendMessage(\"");
                str2 = str;
                sb.append(str2);
                sb.append("\", ...)");
                rhTrace3BeginSpan = rhTrace6.beginSpan(sb.toString());
            } else {
                str2 = str;
                rhTrace3BeginSpan = null;
            }
            try {
                rpcMessage = new RpcMessage(str2, this.stringIdGenerator.next(), message.getPayload(), message.getErrorCode(), false, false);
                RpcListener rpcListener = this.listener;
                MicrogramSource microgramSource = this.source;
                RpcListener.Direction direction = RpcListener.Direction.SEND;
                c462601.L$0 = rhTrace3BeginSpan;
                c462601.L$1 = rpcMessage;
                c462601.label = 1;
                if (rpcListener.onRpcEvent(microgramSource, direction, rpcMessage, c462601) == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                rhTrace3 = rhTrace3BeginSpan;
                if (rhTrace3 != null) {
                    rhTrace3.end();
                }
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rhTrace3 = (RhTrace3) c462601.L$0;
            try {
                ResultKt.throwOnFailure(objSendRpcMessage);
                MicrogramError microgramError = (MicrogramError) objSendRpcMessage;
                if (rhTrace3 != null) {
                    rhTrace3.end();
                }
                return microgramError;
            } catch (Throwable th2) {
                th = th2;
                if (rhTrace3 != null) {
                }
                throw th;
            }
        }
        RpcMessage rpcMessage2 = (RpcMessage) c462601.L$1;
        RhTrace3 rhTrace32 = (RhTrace3) c462601.L$0;
        try {
            ResultKt.throwOnFailure(objSendRpcMessage);
            rpcMessage = rpcMessage2;
            rhTrace3BeginSpan = rhTrace32;
        } catch (Throwable th3) {
            th = th3;
            rhTrace3 = rhTrace32;
            if (rhTrace3 != null) {
            }
            throw th;
        }
        HostPlatformMessageTunnel hostPlatformMessageTunnel = this.platformMessageTunnel;
        Json json = this.json;
        c462601.L$0 = rhTrace3BeginSpan;
        c462601.L$1 = null;
        c462601.label = 2;
        objSendRpcMessage = HostPlatformMessageTunnel2.sendRpcMessage(hostPlatformMessageTunnel, json, rpcMessage, c462601);
        if (objSendRpcMessage != coroutine_suspended) {
            rhTrace3 = rhTrace3BeginSpan;
            MicrogramError microgramError2 = (MicrogramError) objSendRpcMessage;
            if (rhTrace3 != null) {
            }
            return microgramError2;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
    
        if (processReply(r8, r10, r2) == r3) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016b A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #7 {all -> 0x018e, blocks: (B:62:0x0167, B:64:0x016b), top: B:112:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f3  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, microgram.android.internal.RealHostMessageDispatcher$sendMessageWithReply$1] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // microgram.android.HostMessageDispatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendMessageWithReply(String str, Message message, Continuation<? super Message> continuation) throws Throwable {
        RhTrace3 c462611;
        String str2;
        RhTrace3 rhTrace3BeginSpan;
        RpcMessage rpcMessage;
        Mutex mutex;
        String str3;
        CompletableDeferred<Message> completableDeferred;
        Mutex mutex2;
        RhTrace3 rhTrace3;
        Object objSendRpcMessage;
        CompletableDeferred completableDeferred2;
        String str4;
        MicrogramError microgramError;
        String str5;
        RhTrace3 rhTrace32;
        NonCancellable nonCancellable;
        RealHostMessageDispatcher2 realHostMessageDispatcher2;
        Message message2;
        NonCancellable nonCancellable2;
        RealHostMessageDispatcher2 realHostMessageDispatcher22;
        Message message3;
        RhTrace3 rhTrace33;
        if (continuation instanceof C462611) {
            C462611 c4626112 = (C462611) continuation;
            int i = c4626112.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4626112.label = i - Integer.MIN_VALUE;
                c462611 = c4626112;
            } else {
                c462611 = new C462611(continuation);
            }
        }
        Object objAwait = c462611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c462611.label) {
                case 0:
                    ResultKt.throwOnFailure(objAwait);
                    RhTrace6 rhTrace6 = this.localTrace;
                    if (rhTrace6.isEnabled()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("sendMessageWithReply(\"");
                        str2 = str;
                        sb.append(str2);
                        sb.append("\", ...)");
                        rhTrace3BeginSpan = rhTrace6.beginSpan(sb.toString());
                    } else {
                        str2 = str;
                        rhTrace3BeginSpan = null;
                    }
                    try {
                        rpcMessage = new RpcMessage(str2, this.stringIdGenerator.next(), message.getPayload(), message.getErrorCode(), true, false);
                        RpcListener rpcListener = this.listener;
                        MicrogramSource microgramSource = this.source;
                        RpcListener.Direction direction = RpcListener.Direction.SEND;
                        c462611.L$0 = rhTrace3BeginSpan;
                        c462611.L$1 = rpcMessage;
                        c462611.label = 1;
                        if (rpcListener.onRpcEvent(microgramSource, direction, rpcMessage, c462611) != coroutine_suspended) {
                            String messageId = rpcMessage.getMessageId();
                            CompletableDeferred<Message> completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
                            mutex = this.lock;
                            c462611.L$0 = rhTrace3BeginSpan;
                            c462611.L$1 = messageId;
                            c462611.L$2 = completableDeferredCompletableDeferred$default;
                            c462611.L$3 = mutex;
                            c462611.L$4 = rpcMessage;
                            c462611.label = 2;
                            if (mutex.lock(null, c462611) != coroutine_suspended) {
                                str3 = messageId;
                                completableDeferred = completableDeferredCompletableDeferred$default;
                                mutex2 = mutex;
                                try {
                                    this.replies.put(str3, completableDeferred);
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        HostPlatformMessageTunnel hostPlatformMessageTunnel = this.platformMessageTunnel;
                                        Json json = this.json;
                                        c462611.L$0 = rhTrace3BeginSpan;
                                        c462611.L$1 = str3;
                                        c462611.L$2 = completableDeferred;
                                        c462611.L$3 = rpcMessage;
                                        c462611.L$4 = null;
                                        c462611.label = 3;
                                        objSendRpcMessage = HostPlatformMessageTunnel2.sendRpcMessage(hostPlatformMessageTunnel, json, rpcMessage, c462611);
                                        if (objSendRpcMessage != coroutine_suspended) {
                                            RhTrace3 rhTrace34 = rhTrace3BeginSpan;
                                            completableDeferred2 = completableDeferred;
                                            objAwait = objSendRpcMessage;
                                            rhTrace3 = rhTrace34;
                                            try {
                                                microgramError = (MicrogramError) objAwait;
                                                if (microgramError != null) {
                                                    String messageId2 = rpcMessage.getMessageId();
                                                    Message message4 = new Message(null, boxing.boxInt(microgramError.getValue()), 1, null);
                                                    c462611.L$0 = rhTrace3;
                                                    c462611.L$1 = str3;
                                                    c462611.L$2 = completableDeferred2;
                                                    c462611.L$3 = null;
                                                    c462611.label = 4;
                                                    break;
                                                }
                                                str5 = str3;
                                                c462611.L$0 = rhTrace3;
                                                c462611.L$1 = str5;
                                                c462611.L$2 = null;
                                                c462611.L$3 = null;
                                                c462611.label = 5;
                                                objAwait = completableDeferred2.await(c462611);
                                                if (objAwait != coroutine_suspended) {
                                                    str4 = str5;
                                                    rhTrace32 = rhTrace3;
                                                    message2 = (Message) objAwait;
                                                    try {
                                                        nonCancellable2 = NonCancellable.INSTANCE;
                                                        realHostMessageDispatcher22 = new RealHostMessageDispatcher2(this, str4, null);
                                                        c462611.L$0 = rhTrace32;
                                                        c462611.L$1 = message2;
                                                        c462611.label = 6;
                                                        if (BuildersKt.withContext(nonCancellable2, realHostMessageDispatcher22, c462611) != coroutine_suspended) {
                                                            message3 = message2;
                                                            rhTrace33 = rhTrace32;
                                                            if (rhTrace33 != null) {
                                                                rhTrace33.end();
                                                            }
                                                            return message3;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c462611 = rhTrace32;
                                                        if (c462611 != 0) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = str3;
                                                nonCancellable = NonCancellable.INSTANCE;
                                                realHostMessageDispatcher2 = new RealHostMessageDispatcher2(this, str4, null);
                                                c462611.L$0 = rhTrace3;
                                                c462611.L$1 = th;
                                                c462611.L$2 = null;
                                                c462611.L$3 = null;
                                                c462611.L$4 = null;
                                                c462611.label = 7;
                                                if (BuildersKt.withContext(nonCancellable, realHostMessageDispatcher2, c462611) != coroutine_suspended) {
                                                }
                                                return coroutine_suspended;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        rhTrace3 = rhTrace3BeginSpan;
                                        str4 = str3;
                                        nonCancellable = NonCancellable.INSTANCE;
                                        realHostMessageDispatcher2 = new RealHostMessageDispatcher2(this, str4, null);
                                        c462611.L$0 = rhTrace3;
                                        c462611.L$1 = th;
                                        c462611.L$2 = null;
                                        c462611.L$3 = null;
                                        c462611.L$4 = null;
                                        c462611.label = 7;
                                        if (BuildersKt.withContext(nonCancellable, realHostMessageDispatcher2, c462611) != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                } finally {
                                    mutex2.unlock(null);
                                }
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        c462611 = rhTrace3BeginSpan;
                        if (c462611 != 0) {
                        }
                        throw th;
                    }
                case 1:
                    RpcMessage rpcMessage2 = (RpcMessage) c462611.L$1;
                    rhTrace3 = (RhTrace3) c462611.L$0;
                    try {
                        ResultKt.throwOnFailure(objAwait);
                        rpcMessage = rpcMessage2;
                        rhTrace3BeginSpan = rhTrace3;
                        String messageId3 = rpcMessage.getMessageId();
                        CompletableDeferred<Message> completableDeferredCompletableDeferred$default2 = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
                        mutex = this.lock;
                        c462611.L$0 = rhTrace3BeginSpan;
                        c462611.L$1 = messageId3;
                        c462611.L$2 = completableDeferredCompletableDeferred$default2;
                        c462611.L$3 = mutex;
                        c462611.L$4 = rpcMessage;
                        c462611.label = 2;
                        if (mutex.lock(null, c462611) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        th = th5;
                        c462611 = rhTrace3;
                        if (c462611 != 0) {
                            c462611.end();
                        }
                        throw th;
                    }
                case 2:
                    RpcMessage rpcMessage3 = (RpcMessage) c462611.L$4;
                    mutex2 = (Mutex) c462611.L$3;
                    CompletableDeferred<Message> completableDeferred3 = (CompletableDeferred) c462611.L$2;
                    str3 = (String) c462611.L$1;
                    RhTrace3 rhTrace35 = (RhTrace3) c462611.L$0;
                    try {
                        ResultKt.throwOnFailure(objAwait);
                        completableDeferred = completableDeferred3;
                        rpcMessage = rpcMessage3;
                        rhTrace3BeginSpan = rhTrace35;
                        this.replies.put(str3, completableDeferred);
                        Unit unit2 = Unit.INSTANCE;
                        HostPlatformMessageTunnel hostPlatformMessageTunnel2 = this.platformMessageTunnel;
                        Json json2 = this.json;
                        c462611.L$0 = rhTrace3BeginSpan;
                        c462611.L$1 = str3;
                        c462611.L$2 = completableDeferred;
                        c462611.L$3 = rpcMessage;
                        c462611.L$4 = null;
                        c462611.label = 3;
                        objSendRpcMessage = HostPlatformMessageTunnel2.sendRpcMessage(hostPlatformMessageTunnel2, json2, rpcMessage, c462611);
                        if (objSendRpcMessage != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th = th6;
                        c462611 = rhTrace35;
                        if (c462611 != 0) {
                        }
                        throw th;
                    }
                case 3:
                    RpcMessage rpcMessage4 = (RpcMessage) c462611.L$3;
                    CompletableDeferred completableDeferred4 = (CompletableDeferred) c462611.L$2;
                    String str6 = (String) c462611.L$1;
                    RhTrace3 rhTrace36 = (RhTrace3) c462611.L$0;
                    try {
                        ResultKt.throwOnFailure(objAwait);
                        rpcMessage = rpcMessage4;
                        completableDeferred2 = completableDeferred4;
                        rhTrace3 = rhTrace36;
                        str3 = str6;
                        microgramError = (MicrogramError) objAwait;
                        if (microgramError != null) {
                        }
                        str5 = str3;
                        c462611.L$0 = rhTrace3;
                        c462611.L$1 = str5;
                        c462611.L$2 = null;
                        c462611.L$3 = null;
                        c462611.label = 5;
                        objAwait = completableDeferred2.await(c462611);
                        if (objAwait != coroutine_suspended) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        str4 = str6;
                        rhTrace3 = rhTrace36;
                        nonCancellable = NonCancellable.INSTANCE;
                        realHostMessageDispatcher2 = new RealHostMessageDispatcher2(this, str4, null);
                        c462611.L$0 = rhTrace3;
                        c462611.L$1 = th;
                        c462611.L$2 = null;
                        c462611.L$3 = null;
                        c462611.L$4 = null;
                        c462611.label = 7;
                        if (BuildersKt.withContext(nonCancellable, realHostMessageDispatcher2, c462611) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                case 4:
                    completableDeferred2 = (CompletableDeferred) c462611.L$2;
                    str5 = (String) c462611.L$1;
                    rhTrace3 = (RhTrace3) c462611.L$0;
                    try {
                        ResultKt.throwOnFailure(objAwait);
                        c462611.L$0 = rhTrace3;
                        c462611.L$1 = str5;
                        c462611.L$2 = null;
                        c462611.L$3 = null;
                        c462611.label = 5;
                        objAwait = completableDeferred2.await(c462611);
                        if (objAwait != coroutine_suspended) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str4 = str5;
                        nonCancellable = NonCancellable.INSTANCE;
                        realHostMessageDispatcher2 = new RealHostMessageDispatcher2(this, str4, null);
                        c462611.L$0 = rhTrace3;
                        c462611.L$1 = th;
                        c462611.L$2 = null;
                        c462611.L$3 = null;
                        c462611.L$4 = null;
                        c462611.label = 7;
                        if (BuildersKt.withContext(nonCancellable, realHostMessageDispatcher2, c462611) != coroutine_suspended) {
                            throw th;
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                case 5:
                    str4 = (String) c462611.L$1;
                    rhTrace32 = (RhTrace3) c462611.L$0;
                    try {
                        ResultKt.throwOnFailure(objAwait);
                        message2 = (Message) objAwait;
                        nonCancellable2 = NonCancellable.INSTANCE;
                        realHostMessageDispatcher22 = new RealHostMessageDispatcher2(this, str4, null);
                        c462611.L$0 = rhTrace32;
                        c462611.L$1 = message2;
                        c462611.label = 6;
                        if (BuildersKt.withContext(nonCancellable2, realHostMessageDispatcher22, c462611) != coroutine_suspended) {
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        rhTrace3 = rhTrace32;
                        nonCancellable = NonCancellable.INSTANCE;
                        realHostMessageDispatcher2 = new RealHostMessageDispatcher2(this, str4, null);
                        c462611.L$0 = rhTrace3;
                        c462611.L$1 = th;
                        c462611.L$2 = null;
                        c462611.L$3 = null;
                        c462611.L$4 = null;
                        c462611.label = 7;
                        if (BuildersKt.withContext(nonCancellable, realHostMessageDispatcher2, c462611) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                case 6:
                    message3 = (Message) c462611.L$1;
                    rhTrace33 = (RhTrace3) c462611.L$0;
                    ResultKt.throwOnFailure(objAwait);
                    if (rhTrace33 != null) {
                    }
                    return message3;
                case 7:
                    Throwable th10 = (Throwable) c462611.L$1;
                    ResultKt.throwOnFailure(objAwait);
                    throw th10;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.internal.HostReceiveMessageHandler4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processReply(String str, Message message, Continuation<? super HostReceiveMessageHandler4.Status> continuation) throws Throwable {
        C462591 c462591;
        RhTrace3 rhTrace3BeginSpan;
        Mutex mutex;
        RhTrace3 rhTrace3;
        Throwable th;
        HostReceiveMessageHandler4.Status status;
        if (continuation instanceof C462591) {
            c462591 = (C462591) continuation;
            int i = c462591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462591.label = i - Integer.MIN_VALUE;
            } else {
                c462591 = new C462591(continuation);
            }
        }
        Object obj = c462591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RhTrace6 rhTrace6 = this.localTrace;
            if (rhTrace6.isEnabled()) {
                rhTrace3BeginSpan = rhTrace6.beginSpan("processReply(\"" + str + "\", ...)");
            } else {
                rhTrace3BeginSpan = null;
            }
            try {
                mutex = this.lock;
                c462591.L$0 = str;
                c462591.L$1 = message;
                c462591.L$2 = rhTrace3BeginSpan;
                c462591.L$3 = mutex;
                c462591.label = 1;
                if (mutex.lock(null, c462591) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                rhTrace3 = rhTrace3BeginSpan;
                if (rhTrace3 != null) {
                    rhTrace3.end();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c462591.L$3;
            rhTrace3 = (RhTrace3) c462591.L$2;
            Message message2 = (Message) c462591.L$1;
            String str2 = (String) c462591.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                rhTrace3BeginSpan = rhTrace3;
                str = str2;
                message = message2;
            } catch (Throwable th3) {
                th = th3;
                if (rhTrace3 != null) {
                }
                throw th;
            }
        }
        try {
            CompletableDeferred<Message> completableDeferredRemove = this.replies.remove(str);
            boolBoxBoolean = completableDeferredRemove != null ? boxing.boxBoolean(completableDeferredRemove.complete(message)) : null;
            if (boolBoxBoolean == null) {
                status = HostReceiveMessageHandler4.Status.NOT_ACCEPTED;
            } else if (Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(false))) {
                status = HostReceiveMessageHandler4.Status.FAILED;
            } else {
                if (!Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true))) {
                    throw new NoWhenBranchMatchedException();
                }
                status = HostReceiveMessageHandler4.Status.ACCEPTED;
            }
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            return status;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.internal.HostReceiveMessageHandler4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onInterrupted(Continuation<? super Unit> continuation) throws Throwable {
        C462581 c462581;
        RhTrace3 rhTrace3;
        Throwable th;
        Mutex mutex;
        if (continuation instanceof C462581) {
            c462581 = (C462581) continuation;
            int i = c462581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462581.label = i - Integer.MIN_VALUE;
            } else {
                c462581 = new C462581(continuation);
            }
        }
        Object obj = c462581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RhTrace6 rhTrace6 = this.localTrace;
            RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("onInterrupted");
            try {
                Mutex mutex2 = this.lock;
                c462581.L$0 = rhTrace3BeginSpan;
                c462581.L$1 = mutex2;
                c462581.label = 1;
                if (mutex2.lock(null, c462581) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rhTrace3 = rhTrace3BeginSpan;
                mutex = mutex2;
            } catch (Throwable th2) {
                rhTrace3 = rhTrace3BeginSpan;
                th = th2;
                if (rhTrace3 != null) {
                    rhTrace3.end();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c462581.L$1;
            rhTrace3 = (RhTrace3) c462581.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                if (rhTrace3 != null) {
                }
                throw th;
            }
        }
        try {
            Iterator<CompletableDeferred<Message>> it = this.replies.values().iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default(it.next(), null, 1, null);
            }
            this.replies.clear();
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            if (rhTrace3 != null) {
                rhTrace3.end();
            }
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            mutex.unlock(null);
            throw th4;
        }
    }
}
