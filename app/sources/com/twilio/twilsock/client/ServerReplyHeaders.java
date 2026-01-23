package com.twilio.twilsock.client;

import com.twilio.util.AccountDescriptor;
import com.twilio.util.AccountDescriptor2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementBuilders2;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000234BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J=\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001J&\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÁ\u0001¢\u0006\u0002\b2R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u001d¨\u00065"}, m3636d2 = {"Lcom/twilio/twilsock/client/ServerReplyHeaders;", "", "seen1", "", "status", "Lcom/twilio/twilsock/client/Status;", "httpStatus", "continuationToken", "", "httpHeaders", "Lkotlinx/serialization/json/JsonObject;", "accountDescriptor", "Lcom/twilio/util/AccountDescriptor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/twilio/twilsock/client/Status;Lcom/twilio/twilsock/client/Status;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lcom/twilio/util/AccountDescriptor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/twilio/twilsock/client/Status;Lcom/twilio/twilsock/client/Status;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lcom/twilio/util/AccountDescriptor;)V", "getAccountDescriptor$annotations", "()V", "getAccountDescriptor", "()Lcom/twilio/util/AccountDescriptor;", "getContinuationToken$annotations", "getContinuationToken", "()Ljava/lang/String;", "getHttpHeaders$annotations", "getHttpHeaders", "()Lkotlinx/serialization/json/JsonObject;", "getHttpStatus$annotations", "getHttpStatus", "()Lcom/twilio/twilsock/client/Status;", "getStatus$annotations", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class ServerReplyHeaders {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountDescriptor accountDescriptor;
    private final String continuationToken;
    private final JsonElement6 httpHeaders;
    private final Status httpStatus;
    private final Status status;

    public static /* synthetic */ ServerReplyHeaders copy$default(ServerReplyHeaders serverReplyHeaders, Status status, Status status2, String str, JsonElement6 jsonElement6, AccountDescriptor accountDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            status = serverReplyHeaders.status;
        }
        if ((i & 2) != 0) {
            status2 = serverReplyHeaders.httpStatus;
        }
        if ((i & 4) != 0) {
            str = serverReplyHeaders.continuationToken;
        }
        if ((i & 8) != 0) {
            jsonElement6 = serverReplyHeaders.httpHeaders;
        }
        if ((i & 16) != 0) {
            accountDescriptor = serverReplyHeaders.accountDescriptor;
        }
        AccountDescriptor accountDescriptor2 = accountDescriptor;
        String str2 = str;
        return serverReplyHeaders.copy(status, status2, str2, jsonElement6, accountDescriptor2);
    }

    @SerialName("account_descriptor")
    public static /* synthetic */ void getAccountDescriptor$annotations() {
    }

    @SerialName("continuation_token")
    public static /* synthetic */ void getContinuationToken$annotations() {
    }

    @SerialName("http_headers")
    public static /* synthetic */ void getHttpHeaders$annotations() {
    }

    @SerialName("http_status")
    public static /* synthetic */ void getHttpStatus$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getHttpStatus() {
        return this.httpStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    /* renamed from: component4, reason: from getter */
    public final JsonElement6 getHttpHeaders() {
        return this.httpHeaders;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountDescriptor getAccountDescriptor() {
        return this.accountDescriptor;
    }

    public final ServerReplyHeaders copy(Status status, Status httpStatus, String continuationToken, JsonElement6 httpHeaders, AccountDescriptor accountDescriptor) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(httpStatus, "httpStatus");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(httpHeaders, "httpHeaders");
        return new ServerReplyHeaders(status, httpStatus, continuationToken, httpHeaders, accountDescriptor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerReplyHeaders)) {
            return false;
        }
        ServerReplyHeaders serverReplyHeaders = (ServerReplyHeaders) other;
        return Intrinsics.areEqual(this.status, serverReplyHeaders.status) && Intrinsics.areEqual(this.httpStatus, serverReplyHeaders.httpStatus) && Intrinsics.areEqual(this.continuationToken, serverReplyHeaders.continuationToken) && Intrinsics.areEqual(this.httpHeaders, serverReplyHeaders.httpHeaders) && Intrinsics.areEqual(this.accountDescriptor, serverReplyHeaders.accountDescriptor);
    }

    public int hashCode() {
        int iHashCode = ((((((this.status.hashCode() * 31) + this.httpStatus.hashCode()) * 31) + this.continuationToken.hashCode()) * 31) + this.httpHeaders.hashCode()) * 31;
        AccountDescriptor accountDescriptor = this.accountDescriptor;
        return iHashCode + (accountDescriptor == null ? 0 : accountDescriptor.hashCode());
    }

    public String toString() {
        return "ServerReplyHeaders(status=" + this.status + ", httpStatus=" + this.httpStatus + ", continuationToken=" + this.continuationToken + ", httpHeaders=" + this.httpHeaders + ", accountDescriptor=" + this.accountDescriptor + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/ServerReplyHeaders$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/ServerReplyHeaders;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ServerReplyHeaders> serializer() {
            return ServerReplyHeaders$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ServerReplyHeaders(int i, @SerialName("status") Status status, @SerialName("http_status") Status status2, @SerialName("continuation_token") String str, @SerialName("http_headers") JsonElement6 jsonElement6, @SerialName("account_descriptor") AccountDescriptor accountDescriptor, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, ServerReplyHeaders$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
        if ((i & 2) == 0) {
            this.httpStatus = Status.INSTANCE.getOk();
        } else {
            this.httpStatus = status2;
        }
        if ((i & 4) == 0) {
            this.continuationToken = "";
        } else {
            this.continuationToken = str;
        }
        if ((i & 8) == 0) {
            this.httpHeaders = new JsonElementBuilders2().build();
        } else {
            this.httpHeaders = jsonElement6;
        }
        if ((i & 16) == 0) {
            this.accountDescriptor = null;
        } else {
            this.accountDescriptor = accountDescriptor;
        }
    }

    public ServerReplyHeaders(Status status, Status httpStatus, String continuationToken, JsonElement6 httpHeaders, AccountDescriptor accountDescriptor) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(httpStatus, "httpStatus");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(httpHeaders, "httpHeaders");
        this.status = status;
        this.httpStatus = httpStatus;
        this.continuationToken = continuationToken;
        this.httpHeaders = httpHeaders;
        this.accountDescriptor = accountDescriptor;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(ServerReplyHeaders self, Encoding3 output, SerialDescriptor serialDesc) {
        Status$$serializer status$$serializer = Status$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, status$$serializer, self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.httpStatus, Status.INSTANCE.getOk())) {
            output.encodeSerializableElement(serialDesc, 1, status$$serializer, self.httpStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.continuationToken, "")) {
            output.encodeStringElement(serialDesc, 2, self.continuationToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.httpHeaders, new JsonElementBuilders2().build())) {
            output.encodeSerializableElement(serialDesc, 3, JsonElementSerializers6.INSTANCE, self.httpHeaders);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.accountDescriptor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, AccountDescriptor2.INSTANCE, self.accountDescriptor);
    }

    public final Status getStatus() {
        return this.status;
    }

    public /* synthetic */ ServerReplyHeaders(Status status, Status status2, String str, JsonElement6 jsonElement6, AccountDescriptor accountDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? Status.INSTANCE.getOk() : status2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? new JsonElementBuilders2().build() : jsonElement6, (i & 16) != 0 ? null : accountDescriptor);
    }

    public final Status getHttpStatus() {
        return this.httpStatus;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final JsonElement6 getHttpHeaders() {
        return this.httpHeaders;
    }

    public final AccountDescriptor getAccountDescriptor() {
        return this.accountDescriptor;
    }
}
