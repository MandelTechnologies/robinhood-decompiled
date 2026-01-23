package microgram.android.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import microgram.MicrogramError;
import microgram.RpcMessage;

/* compiled from: HostPlatformMessageTunnel.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"sendRpcMessage", "Lmicrogram/MicrogramError;", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "json", "Lkotlinx/serialization/json/Json;", "message", "Lmicrogram/RpcMessage;", "(Lmicrogram/android/internal/HostPlatformMessageTunnel;Lkotlinx/serialization/json/Json;Lmicrogram/RpcMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.HostPlatformMessageTunnelKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HostPlatformMessageTunnel2 {

    /* compiled from: HostPlatformMessageTunnel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.HostPlatformMessageTunnelKt", m3645f = "HostPlatformMessageTunnel.kt", m3646l = {58}, m3647m = "sendRpcMessage")
    /* renamed from: microgram.android.internal.HostPlatformMessageTunnelKt$sendRpcMessage$1 */
    static final class C462571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462571(Continuation<? super C462571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HostPlatformMessageTunnel2.sendRpcMessage(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object sendRpcMessage(HostPlatformMessageTunnel hostPlatformMessageTunnel, Json json, RpcMessage rpcMessage, Continuation<? super MicrogramError> continuation) {
        C462571 c462571;
        if (continuation instanceof C462571) {
            c462571 = (C462571) continuation;
            int i = c462571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462571.label = i - Integer.MIN_VALUE;
            } else {
                c462571 = new C462571(continuation);
            }
        }
        Object objSendMessage = c462571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessage);
            json.getSerializersModule();
            String strEncodeToString = json.encodeToString(RpcMessage.INSTANCE.serializer(), rpcMessage);
            c462571.label = 1;
            objSendMessage = hostPlatformMessageTunnel.sendMessage(strEncodeToString, c462571);
            if (objSendMessage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessage);
        }
        if (((Number) objSendMessage).intValue() == 0) {
            objSendMessage = null;
        }
        Integer num = (Integer) objSendMessage;
        if (num != null) {
            return MicrogramError.INSTANCE.fromInt(num.intValue());
        }
        return null;
    }
}
