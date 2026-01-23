package com.twilio.util;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: InternalUtils.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/twilio/util/ErrorResponse;", "", "seen1", "", "message", "", "code", "params", "Lcom/twilio/util/Params;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILcom/twilio/util/Params;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILcom/twilio/util/Params;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getParams", "()Lcom/twilio/util/Params;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$shared_internal_release", "$serializer", "Companion", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
final /* data */ class ErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int code;
    private final String message;
    private final Params params;

    public ErrorResponse() {
        this((String) null, 0, (Params) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, int i, Params params, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorResponse.message;
        }
        if ((i2 & 2) != 0) {
            i = errorResponse.code;
        }
        if ((i2 & 4) != 0) {
            params = errorResponse.params;
        }
        return errorResponse.copy(str, i, params);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final Params getParams() {
        return this.params;
    }

    public final ErrorResponse copy(String message, int code, Params params) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorResponse(message, code, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.areEqual(this.message, errorResponse.message) && this.code == errorResponse.code && Intrinsics.areEqual(this.params, errorResponse.params);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + Integer.hashCode(this.code)) * 31;
        Params params = this.params;
        return iHashCode + (params == null ? 0 : params.hashCode());
    }

    public String toString() {
        return "ErrorResponse(message=" + this.message + ", code=" + this.code + ", params=" + this.params + ')';
    }

    /* compiled from: InternalUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/util/ErrorResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/util/ErrorResponse;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ErrorResponse> serializer() {
            return InternalUtils2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ErrorResponse(int i, String str, int i2, Params params, SerializationConstructorMarker serializationConstructorMarker) {
        this.message = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.code = 0;
        } else {
            this.code = i2;
        }
        if ((i & 4) == 0) {
            this.params = null;
        } else {
            this.params = params;
        }
    }

    public ErrorResponse(String message, int i, Params params) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.code = i;
        this.params = params;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$shared_internal_release(ErrorResponse self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.message, "")) {
            output.encodeStringElement(serialDesc, 0, self.message);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.code != 0) {
            output.encodeIntElement(serialDesc, 1, self.code);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.params == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, InternalUtils8.INSTANCE, self.params);
    }

    public /* synthetic */ ErrorResponse(String str, int i, Params params, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : params);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getCode() {
        return this.code;
    }

    public final Params getParams() {
        return this.params;
    }
}
