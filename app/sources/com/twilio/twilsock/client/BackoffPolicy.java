package com.twilio.twilsock.client;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/twilio/twilsock/client/BackoffPolicy;", "", "seen1", "", "reconnectMinMilliseconds", "reconnectMaxMilliseconds", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getReconnectMaxMilliseconds$annotations", "()V", "getReconnectMaxMilliseconds", "()I", "getReconnectMinMilliseconds$annotations", "getReconnectMinMilliseconds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class BackoffPolicy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int reconnectMaxMilliseconds;
    private final int reconnectMinMilliseconds;

    /* JADX WARN: Illegal instructions before constructor call */
    public BackoffPolicy() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BackoffPolicy copy$default(BackoffPolicy backoffPolicy, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = backoffPolicy.reconnectMinMilliseconds;
        }
        if ((i3 & 2) != 0) {
            i2 = backoffPolicy.reconnectMaxMilliseconds;
        }
        return backoffPolicy.copy(i, i2);
    }

    @SerialName("reconnect_max_ms")
    public static /* synthetic */ void getReconnectMaxMilliseconds$annotations() {
    }

    @SerialName("reconnect_min_ms")
    public static /* synthetic */ void getReconnectMinMilliseconds$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getReconnectMinMilliseconds() {
        return this.reconnectMinMilliseconds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReconnectMaxMilliseconds() {
        return this.reconnectMaxMilliseconds;
    }

    public final BackoffPolicy copy(int reconnectMinMilliseconds, int reconnectMaxMilliseconds) {
        return new BackoffPolicy(reconnectMinMilliseconds, reconnectMaxMilliseconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackoffPolicy)) {
            return false;
        }
        BackoffPolicy backoffPolicy = (BackoffPolicy) other;
        return this.reconnectMinMilliseconds == backoffPolicy.reconnectMinMilliseconds && this.reconnectMaxMilliseconds == backoffPolicy.reconnectMaxMilliseconds;
    }

    public int hashCode() {
        return (Integer.hashCode(this.reconnectMinMilliseconds) * 31) + Integer.hashCode(this.reconnectMaxMilliseconds);
    }

    public String toString() {
        return "BackoffPolicy(reconnectMinMilliseconds=" + this.reconnectMinMilliseconds + ", reconnectMaxMilliseconds=" + this.reconnectMaxMilliseconds + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/BackoffPolicy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/BackoffPolicy;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BackoffPolicy> serializer() {
            return BackoffPolicy$$serializer.INSTANCE;
        }
    }

    public BackoffPolicy(int i, int i2) {
        this.reconnectMinMilliseconds = i;
        this.reconnectMaxMilliseconds = i2;
    }

    @Deprecated
    public /* synthetic */ BackoffPolicy(int i, @SerialName("reconnect_min_ms") int i2, @SerialName("reconnect_max_ms") int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.reconnectMinMilliseconds = (i & 1) == 0 ? 1000 : i2;
        if ((i & 2) == 0) {
            this.reconnectMaxMilliseconds = 2000;
        } else {
            this.reconnectMaxMilliseconds = i3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(BackoffPolicy self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.reconnectMinMilliseconds != 1000) {
            output.encodeIntElement(serialDesc, 0, self.reconnectMinMilliseconds);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.reconnectMaxMilliseconds == 2000) {
            return;
        }
        output.encodeIntElement(serialDesc, 1, self.reconnectMaxMilliseconds);
    }

    public /* synthetic */ BackoffPolicy(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1000 : i, (i3 & 2) != 0 ? 2000 : i2);
    }

    public final int getReconnectMinMilliseconds() {
        return this.reconnectMinMilliseconds;
    }

    public final int getReconnectMaxMilliseconds() {
        return this.reconnectMaxMilliseconds;
    }
}
