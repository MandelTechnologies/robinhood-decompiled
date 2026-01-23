package microgram.android.bifrost.internal.bridge;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.android.HostMessageDispatcher;
import microgram.android.MessageHandler;
import microgram.android.bifrost.internal.protocol.Protocol2;
import microgram.android.bifrost.internal.protocol.RawResponse;
import microgram.generator.IdGenerator;

/* compiled from: RealBifrostBridge.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/android/bifrost/internal/bridge/RealBifrostBridge;", "Lmicrogram/android/bifrost/internal/bridge/BifrostBridge;", "Lmicrogram/android/MessageHandler;", "Lmicrogram/android/HostMessageDispatcher;", "messageDispatcher", "Lmicrogram/generator/IdGenerator;", "", "stringIdGenerator", "<init>", "(Lmicrogram/android/HostMessageDispatcher;Lmicrogram/generator/IdGenerator;)V", "Lmicrogram/Message;", "message", "", "handle", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/android/HostMessageDispatcher;", "Lmicrogram/generator/IdGenerator;", "", "Lkotlinx/coroutines/channels/SendChannel;", "Lmicrogram/android/bifrost/internal/protocol/RawResponse;", "calls", "Ljava/util/Map;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "lib-microgram-bifrost_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RealBifrostBridge implements BifrostBridge, MessageHandler {
    private final Map<String, Channel9<RawResponse>> calls;
    private final Mutex lock;
    private final HostMessageDispatcher messageDispatcher;
    private final IdGenerator<String> stringIdGenerator;

    /* compiled from: RealBifrostBridge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.bifrost.internal.bridge.RealBifrostBridge", m3645f = "RealBifrostBridge.kt", m3646l = {123, 100}, m3647m = "handle")
    /* renamed from: microgram.android.bifrost.internal.bridge.RealBifrostBridge$handle$1 */
    static final class C462431 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462431(Continuation<? super C462431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealBifrostBridge.this.handle(null, this);
        }
    }

    @Override // microgram.android.MessageHandler
    public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
        return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
    }

    public RealBifrostBridge(HostMessageDispatcher messageDispatcher, IdGenerator<String> stringIdGenerator) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(stringIdGenerator, "stringIdGenerator");
        this.messageDispatcher = messageDispatcher;
        this.stringIdGenerator = stringIdGenerator;
        this.calls = new LinkedHashMap();
        this.lock = Mutex3.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r10.send(r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handle(Message message, Continuation<? super Boolean> continuation) {
        C462431 c462431;
        RawResponse rawResponse;
        Mutex mutex;
        if (continuation instanceof C462431) {
            c462431 = (C462431) continuation;
            int i = c462431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462431.label = i - Integer.MIN_VALUE;
            } else {
                c462431 = new C462431(continuation);
            }
        }
        Object obj = c462431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462431.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                String payload = message.getPayload();
                if (payload != null) {
                    Json json = Protocol2.getJSON();
                    json.getSerializersModule();
                    rawResponse = (RawResponse) json.decodeFromString(BuiltinSerializers.getNullable(RawResponse.INSTANCE.serializer()), payload);
                    if (rawResponse != null) {
                        mutex = this.lock;
                        c462431.L$0 = rawResponse;
                        c462431.L$1 = mutex;
                        c462431.label = 1;
                        if (mutex.lock(null, c462431) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                return boxing.boxBoolean(false);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(true);
            }
            mutex = (Mutex) c462431.L$1;
            rawResponse = (RawResponse) c462431.L$0;
            ResultKt.throwOnFailure(obj);
            Channel9<RawResponse> channel9 = this.calls.get(rawResponse.getId());
            if (channel9 == null) {
                return boxing.boxBoolean(false);
            }
            c462431.L$0 = null;
            c462431.L$1 = null;
            c462431.label = 2;
        } finally {
            mutex.unlock(null);
        }
    }
}
