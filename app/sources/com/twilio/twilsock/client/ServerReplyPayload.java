package com.twilio.twilsock.client;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/twilio/twilsock/client/ServerReplyPayload;", "", "seen1", "", "backoffPolicy", "Lcom/twilio/twilsock/client/BackoffPolicy;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/twilio/twilsock/client/BackoffPolicy;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/twilio/twilsock/client/BackoffPolicy;)V", "getBackoffPolicy$annotations", "()V", "getBackoffPolicy", "()Lcom/twilio/twilsock/client/BackoffPolicy;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class ServerReplyPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BackoffPolicy backoffPolicy;

    /* JADX WARN: Multi-variable type inference failed */
    public ServerReplyPayload() {
        this((BackoffPolicy) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ServerReplyPayload copy$default(ServerReplyPayload serverReplyPayload, BackoffPolicy backoffPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            backoffPolicy = serverReplyPayload.backoffPolicy;
        }
        return serverReplyPayload.copy(backoffPolicy);
    }

    @SerialName("backoff_policy")
    public static /* synthetic */ void getBackoffPolicy$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    public final ServerReplyPayload copy(BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        return new ServerReplyPayload(backoffPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServerReplyPayload) && Intrinsics.areEqual(this.backoffPolicy, ((ServerReplyPayload) other).backoffPolicy);
    }

    public int hashCode() {
        return this.backoffPolicy.hashCode();
    }

    public String toString() {
        return "ServerReplyPayload(backoffPolicy=" + this.backoffPolicy + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/ServerReplyPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/ServerReplyPayload;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ServerReplyPayload> serializer() {
            return ServerReplyPayload$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ServerReplyPayload(int i, @SerialName("backoff_policy") BackoffPolicy backoffPolicy, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.backoffPolicy = new BackoffPolicy(0, 0, 3, (DefaultConstructorMarker) null);
        } else {
            this.backoffPolicy = backoffPolicy;
        }
    }

    public ServerReplyPayload(BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        this.backoffPolicy = backoffPolicy;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(ServerReplyPayload self, Encoding3 output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && Intrinsics.areEqual(self.backoffPolicy, new BackoffPolicy(0, 0, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, BackoffPolicy$$serializer.INSTANCE, self.backoffPolicy);
    }

    public /* synthetic */ ServerReplyPayload(BackoffPolicy backoffPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BackoffPolicy(0, 0, 3, (DefaultConstructorMarker) null) : backoffPolicy);
    }

    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }
}
