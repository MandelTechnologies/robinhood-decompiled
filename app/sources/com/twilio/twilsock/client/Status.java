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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002-.BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0017\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/twilio/twilsock/client/Status;", "", "seen1", "", "status", "", "code", "errorCode", "description", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V", "getCode$annotations", "()V", "getCode", "()I", "getDescription$annotations", "getDescription", "()Ljava/lang/String;", "getErrorCode$annotations", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus$annotations", "getStatus", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)Lcom/twilio/twilsock/client/Status;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class Status {
    private static final Status BadRequest = new Status("Bad request", 400, (Integer) (0 == true ? 1 : 0), (String) null, 12, (DefaultConstructorMarker) null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Ok */
    private static final Status f6485Ok = new Status("ok", 200, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null);
    private final int code;
    private final String description;
    private final Integer errorCode;
    private final String status;

    public static /* synthetic */ Status copy$default(Status status, String str, int i, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = status.status;
        }
        if ((i2 & 2) != 0) {
            i = status.code;
        }
        if ((i2 & 4) != 0) {
            num = status.errorCode;
        }
        if ((i2 & 8) != 0) {
            str2 = status.description;
        }
        return status.copy(str, i, num, str2);
    }

    @SerialName("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @SerialName("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @SerialName("errorCode")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Status copy(String status, int code, Integer errorCode, String description) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new Status(status, code, errorCode, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return Intrinsics.areEqual(this.status, status.status) && this.code == status.code && Intrinsics.areEqual(this.errorCode, status.errorCode) && Intrinsics.areEqual(this.description, status.description);
    }

    public int hashCode() {
        int iHashCode = ((this.status.hashCode() * 31) + Integer.hashCode(this.code)) * 31;
        Integer num = this.errorCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Status(status=" + this.status + ", code=" + this.code + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
    }

    @Deprecated
    public /* synthetic */ Status(int i, @SerialName("status") String str, @SerialName("code") int i2, @SerialName("errorCode") Integer num, @SerialName("description") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, Status$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.code = i2;
        if ((i & 4) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
    }

    public Status(String status, int i, Integer num, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.code = i;
        this.errorCode = num;
        this.description = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(Status self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.status);
        output.encodeIntElement(serialDesc, 1, self.code);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errorCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.errorCode);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.description == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.description);
    }

    public /* synthetic */ Status(String str, int i, Integer num, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2);
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getCode() {
        return this.code;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getDescription() {
        return this.description;
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/twilio/twilsock/client/Status$Companion;", "", "()V", "BadRequest", "Lcom/twilio/twilsock/client/Status;", "getBadRequest", "()Lcom/twilio/twilsock/client/Status;", "Ok", "getOk", "serializer", "Lkotlinx/serialization/KSerializer;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Status> serializer() {
            return Status$$serializer.INSTANCE;
        }

        public final Status getOk() {
            return Status.f6485Ok;
        }

        public final Status getBadRequest() {
            return Status.BadRequest;
        }
    }
}
