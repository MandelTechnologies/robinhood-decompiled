package microgram.android.service.protocol;

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
import microgram.MicrogramError;
import microgram.android.HostMessageDispatcher;
import microgram.service.protocol.Peer;
import microgram.service.protocol.ProtocolExceptions5;
import microgram.service.protocol.ProtocolMessage;

/* compiled from: Peer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/service/protocol/HostMessageDispatcherPeer;", "Lmicrogram/service/protocol/Peer;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "targetName", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/android/HostMessageDispatcher;Ljava/lang/String;Lkotlinx/serialization/json/Json;)V", "send", "", "protocolMessage", "Lmicrogram/service/protocol/ProtocolMessage;", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.service.protocol.HostMessageDispatcherPeer, reason: use source file name */
/* loaded from: classes14.dex */
final class Peer2 implements Peer {
    private final Json json;
    private final HostMessageDispatcher messageDispatcher;
    private final String targetName;

    /* compiled from: Peer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.service.protocol.HostMessageDispatcherPeer", m3645f = "Peer.kt", m3646l = {27}, m3647m = "send")
    /* renamed from: microgram.android.service.protocol.HostMessageDispatcherPeer$send$1 */
    static final class C462821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462821(Continuation<? super C462821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Peer2.this.send(null, this);
        }
    }

    public Peer2(HostMessageDispatcher messageDispatcher, String targetName, Json json) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        Intrinsics.checkNotNullParameter(json, "json");
        this.messageDispatcher = messageDispatcher;
        this.targetName = targetName;
        this.json = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.service.protocol.Peer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object send(ProtocolMessage protocolMessage, Continuation<? super Unit> continuation) throws Exception {
        C462821 c462821;
        MicrogramError microgramErrorFromInt;
        if (continuation instanceof C462821) {
            c462821 = (C462821) continuation;
            int i = c462821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462821.label = i - Integer.MIN_VALUE;
            } else {
                c462821 = new C462821(continuation);
            }
        }
        Object objSendMessageWithReply = c462821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessageWithReply);
            Json json = this.json;
            json.getSerializersModule();
            Message message = new Message(json.encodeToString(ProtocolMessage.INSTANCE.serializer(), protocolMessage), null, 2, null);
            HostMessageDispatcher hostMessageDispatcher = this.messageDispatcher;
            String str = this.targetName;
            c462821.label = 1;
            objSendMessageWithReply = hostMessageDispatcher.sendMessageWithReply(str, message, c462821);
            if (objSendMessageWithReply == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessageWithReply);
        }
        Message message2 = (Message) objSendMessageWithReply;
        Integer errorCode = message2.getErrorCode();
        if (errorCode == null || (microgramErrorFromInt = MicrogramError.INSTANCE.fromInt(errorCode.intValue())) == null) {
            return Unit.INSTANCE;
        }
        throw ProtocolExceptions5.asException(microgramErrorFromInt, message2.getPayload());
    }
}
