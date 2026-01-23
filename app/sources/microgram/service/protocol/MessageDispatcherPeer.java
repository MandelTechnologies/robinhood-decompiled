package microgram.service.protocol;

import kotlin.Metadata;
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
import microgram.MessageDispatcher;
import microgram.MicrogramError;

/* compiled from: Peer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/service/protocol/MessageDispatcherPeer;", "Lmicrogram/service/protocol/Peer;", "Lmicrogram/MessageDispatcher;", "messageDispatcher", "", "targetName", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/MessageDispatcher;Ljava/lang/String;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/service/protocol/ProtocolMessage;", "protocolMessage", "", "send", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Lkotlinx/serialization/json/Json;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class MessageDispatcherPeer implements Peer {
    private final Json json;
    private final String targetName;

    /* compiled from: Peer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MicrogramError.values().length];
            try {
                iArr[MicrogramError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MicrogramError.INTERRUPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MicrogramError.WIRE_COMMUNICATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Peer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.protocol.MessageDispatcherPeer", m3645f = "Peer.kt", m3646l = {40}, m3647m = "send")
    /* renamed from: microgram.service.protocol.MessageDispatcherPeer$send$1 */
    static final class C467951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C467951(Continuation<? super C467951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDispatcherPeer.this.send(null, this);
        }
    }

    public MessageDispatcherPeer(MessageDispatcher messageDispatcher, String targetName, Json json) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        Intrinsics.checkNotNullParameter(json, "json");
        this.targetName = targetName;
        this.json = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.service.protocol.Peer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object send(ProtocolMessage protocolMessage, Continuation<? super Unit> continuation) throws Exception {
        C467951 c467951;
        if (continuation instanceof C467951) {
            c467951 = (C467951) continuation;
            int i = c467951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467951.label = i - Integer.MIN_VALUE;
            } else {
                c467951 = new C467951(continuation);
            }
        }
        Object obj = c467951.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Json json = this.json;
            json.getSerializersModule();
            new Message(json.encodeToString(ProtocolMessage.INSTANCE.serializer(), protocolMessage), null, 2, null);
            c467951.label = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MicrogramError microgramError = (MicrogramError) obj;
        if (microgramError != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[microgramError.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                throw new ProtocolExceptions6("Internal (" + microgramError.getValue() + ") send error " + this.targetName);
            }
            throw ProtocolExceptions5.asException(microgramError, "Encountered while sending to " + this.targetName);
        }
        return Unit.INSTANCE;
    }

    public String toString() {
        return "MessageDispatcherPeer(targetName=" + this.targetName + ")";
    }
}
