package microgram;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Message.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/Message;", "", "", "payload", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lmicrogram/RpcMessage;", "rpcMessage", "(Lmicrogram/RpcMessage;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPayload", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Message {
    private final Integer errorCode;
    private final String payload;

    /* JADX WARN: Multi-variable type inference failed */
    public Message() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.payload, message.payload) && Intrinsics.areEqual(this.errorCode, message.errorCode);
    }

    public int hashCode() {
        String str = this.payload;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.errorCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Message(payload=" + this.payload + ", errorCode=" + this.errorCode + ")";
    }

    public Message(String str, Integer num) {
        this.payload = str;
        this.errorCode = num;
    }

    public /* synthetic */ Message(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Message(RpcMessage rpcMessage) {
        this(rpcMessage.getPayload(), rpcMessage.getErrorCode());
        Intrinsics.checkNotNullParameter(rpcMessage, "rpcMessage");
    }
}
