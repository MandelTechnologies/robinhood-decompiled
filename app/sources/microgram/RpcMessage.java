package microgram;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: RpcMessage.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000b\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b*\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b\n\u00100¨\u00063"}, m3636d2 = {"Lmicrogram/RpcMessage;", "", "", "target", "messageId", "payload", "", "errorCode", "", "wantsReply", "isReply", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)V", "replyTarget", "Lmicrogram/Message;", "message", "(Ljava/lang/String;Lmicrogram/Message;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_core", "(Lmicrogram/RpcMessage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "getMessageId", "getMessageId$annotations", "()V", "getPayload", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "Z", "getWantsReply", "()Z", "Companion", "$serializer", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class RpcMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer errorCode;
    private final boolean isReply;
    private final String messageId;
    private final String payload;
    private final String target;
    private final boolean wantsReply;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcMessage)) {
            return false;
        }
        RpcMessage rpcMessage = (RpcMessage) other;
        return Intrinsics.areEqual(this.target, rpcMessage.target) && Intrinsics.areEqual(this.messageId, rpcMessage.messageId) && Intrinsics.areEqual(this.payload, rpcMessage.payload) && Intrinsics.areEqual(this.errorCode, rpcMessage.errorCode) && this.wantsReply == rpcMessage.wantsReply && this.isReply == rpcMessage.isReply;
    }

    public int hashCode() {
        int iHashCode = ((this.target.hashCode() * 31) + this.messageId.hashCode()) * 31;
        String str = this.payload;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.errorCode;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.wantsReply)) * 31) + Boolean.hashCode(this.isReply);
    }

    public String toString() {
        return "RpcMessage(target=" + this.target + ", messageId=" + this.messageId + ", payload=" + this.payload + ", errorCode=" + this.errorCode + ", wantsReply=" + this.wantsReply + ", isReply=" + this.isReply + ")";
    }

    /* compiled from: RpcMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RpcMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RpcMessage;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RpcMessage> serializer() {
            return RpcMessage2.INSTANCE;
        }
    }

    public /* synthetic */ RpcMessage(int i, String str, String str2, String str3, Integer num, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, RpcMessage2.INSTANCE.getDescriptor());
        }
        this.target = str;
        this.messageId = str2;
        if ((i & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = str3;
        }
        if ((i & 8) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 16) == 0) {
            this.wantsReply = false;
        } else {
            this.wantsReply = z;
        }
        if ((i & 32) == 0) {
            this.isReply = false;
        } else {
            this.isReply = z2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_core(RpcMessage self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.target);
        output.encodeStringElement(serialDesc, 1, self.messageId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.payload != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.payload);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.errorCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.errorCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.wantsReply) {
            output.encodeBooleanElement(serialDesc, 4, self.wantsReply);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isReply) {
            output.encodeBooleanElement(serialDesc, 5, self.isReply);
        }
    }

    public RpcMessage(String target, String messageId, String str, Integer num, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.target = target;
        this.messageId = messageId;
        this.payload = str;
        this.errorCode = num;
        this.wantsReply = z;
        this.isReply = z2;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final boolean getWantsReply() {
        return this.wantsReply;
    }

    /* renamed from: isReply, reason: from getter */
    public final boolean getIsReply() {
        return this.isReply;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RpcMessage(String replyTarget, Message message) {
        this(replyTarget, replyTarget, message.getPayload(), message.getErrorCode(), false, true);
        Intrinsics.checkNotNullParameter(replyTarget, "replyTarget");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
