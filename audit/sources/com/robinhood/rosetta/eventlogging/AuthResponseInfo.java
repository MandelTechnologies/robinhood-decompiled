package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.AuthResponseInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AuthResponseInfo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;", "Lcom/squareup/wire/Message;", "", "blocked_reason", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "request_url", "", "request_method", "token_expiry_seconds", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;Ljava/lang/String;Ljava/lang/String;JLokio/ByteString;)V", "getBlocked_reason", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "getRequest_url", "()Ljava/lang/String;", "getRequest_method", "getToken_expiry_seconds", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AuthBlockedReason", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AuthResponseInfo extends Message {

    @JvmField
    public static final ProtoAdapter<AuthResponseInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AuthResponseInfo$AuthBlockedReason#ADAPTER", jsonName = "blockedReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AuthBlockedReason blocked_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String request_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "tokenExpirySeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long token_expiry_seconds;

    public AuthResponseInfo() {
        this(null, null, null, 0L, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24028newBuilder();
    }

    public final AuthBlockedReason getBlocked_reason() {
        return this.blocked_reason;
    }

    public /* synthetic */ AuthResponseInfo(AuthBlockedReason authBlockedReason, String str, String str2, long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED : authBlockedReason, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getRequest_url() {
        return this.request_url;
    }

    public final String getRequest_method() {
        return this.request_method;
    }

    public final long getToken_expiry_seconds() {
        return this.token_expiry_seconds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthResponseInfo(AuthBlockedReason blocked_reason, String request_url, String request_method, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.blocked_reason = blocked_reason;
        this.request_url = request_url;
        this.request_method = request_method;
        this.token_expiry_seconds = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24028newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AuthResponseInfo)) {
            return false;
        }
        AuthResponseInfo authResponseInfo = (AuthResponseInfo) other;
        return Intrinsics.areEqual(unknownFields(), authResponseInfo.unknownFields()) && this.blocked_reason == authResponseInfo.blocked_reason && Intrinsics.areEqual(this.request_url, authResponseInfo.request_url) && Intrinsics.areEqual(this.request_method, authResponseInfo.request_method) && this.token_expiry_seconds == authResponseInfo.token_expiry_seconds;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.blocked_reason.hashCode()) * 37) + this.request_url.hashCode()) * 37) + this.request_method.hashCode()) * 37) + Long.hashCode(this.token_expiry_seconds);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("blocked_reason=" + this.blocked_reason);
        arrayList.add("request_url=" + Internal.sanitize(this.request_url));
        arrayList.add("request_method=" + Internal.sanitize(this.request_method));
        arrayList.add("token_expiry_seconds=" + this.token_expiry_seconds);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthResponseInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AuthResponseInfo copy$default(AuthResponseInfo authResponseInfo, AuthBlockedReason authBlockedReason, String str, String str2, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            authBlockedReason = authResponseInfo.blocked_reason;
        }
        if ((i & 2) != 0) {
            str = authResponseInfo.request_url;
        }
        if ((i & 4) != 0) {
            str2 = authResponseInfo.request_method;
        }
        if ((i & 8) != 0) {
            j = authResponseInfo.token_expiry_seconds;
        }
        if ((i & 16) != 0) {
            byteString = authResponseInfo.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return authResponseInfo.copy(authBlockedReason, str, str3, j, byteString2);
    }

    public final AuthResponseInfo copy(AuthBlockedReason blocked_reason, String request_url, String request_method, long token_expiry_seconds, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AuthResponseInfo(blocked_reason, request_url, request_method, token_expiry_seconds, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AuthResponseInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AuthResponseInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AuthResponseInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AuthResponseInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBlocked_reason() != AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED) {
                    size += AuthResponseInfo.AuthBlockedReason.ADAPTER.encodedSizeWithTag(1, value.getBlocked_reason());
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequest_url());
                }
                if (!Intrinsics.areEqual(value.getRequest_method(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRequest_method());
                }
                return value.getToken_expiry_seconds() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getToken_expiry_seconds())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AuthResponseInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBlocked_reason() != AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED) {
                    AuthResponseInfo.AuthBlockedReason.ADAPTER.encodeWithTag(writer, 1, (int) value.getBlocked_reason());
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequest_url());
                }
                if (!Intrinsics.areEqual(value.getRequest_method(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRequest_method());
                }
                if (value.getToken_expiry_seconds() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getToken_expiry_seconds()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AuthResponseInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getToken_expiry_seconds() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getToken_expiry_seconds()));
                }
                if (!Intrinsics.areEqual(value.getRequest_method(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRequest_method());
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequest_url());
                }
                if (value.getBlocked_reason() != AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED) {
                    AuthResponseInfo.AuthBlockedReason.ADAPTER.encodeWithTag(writer, 1, (int) value.getBlocked_reason());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AuthResponseInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AuthResponseInfo.AuthBlockedReason authBlockedReasonDecode = AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    AuthResponseInfo.AuthBlockedReason authBlockedReason = authBlockedReasonDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AuthResponseInfo(authBlockedReason, strDecode, strDecode2, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                authBlockedReasonDecode = AuthResponseInfo.AuthBlockedReason.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AuthResponseInfo redact(AuthResponseInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AuthResponseInfo.copy$default(value, null, null, null, 0L, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthResponseInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTH_BLOCKED_REASON_UNSPECIFIED", "JWT_INVALID", "TOKEN_REVOKED", "HEADER_NOT_PRESENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AuthBlockedReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthBlockedReason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AuthBlockedReason> ADAPTER;
        public static final AuthBlockedReason AUTH_BLOCKED_REASON_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AuthBlockedReason HEADER_NOT_PRESENT;
        public static final AuthBlockedReason JWT_INVALID;
        public static final AuthBlockedReason TOKEN_REVOKED;
        private final int value;

        private static final /* synthetic */ AuthBlockedReason[] $values() {
            return new AuthBlockedReason[]{AUTH_BLOCKED_REASON_UNSPECIFIED, JWT_INVALID, TOKEN_REVOKED, HEADER_NOT_PRESENT};
        }

        @JvmStatic
        public static final AuthBlockedReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AuthBlockedReason> getEntries() {
            return $ENTRIES;
        }

        private AuthBlockedReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AuthBlockedReason authBlockedReason = new AuthBlockedReason("AUTH_BLOCKED_REASON_UNSPECIFIED", 0, 0);
            AUTH_BLOCKED_REASON_UNSPECIFIED = authBlockedReason;
            JWT_INVALID = new AuthBlockedReason("JWT_INVALID", 1, 1);
            TOKEN_REVOKED = new AuthBlockedReason("TOKEN_REVOKED", 2, 2);
            HEADER_NOT_PRESENT = new AuthBlockedReason("HEADER_NOT_PRESENT", 3, 3);
            AuthBlockedReason[] authBlockedReasonArr$values = $values();
            $VALUES = authBlockedReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(authBlockedReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AuthBlockedReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AuthBlockedReason>(orCreateKotlinClass, syntax, authBlockedReason) { // from class: com.robinhood.rosetta.eventlogging.AuthResponseInfo$AuthBlockedReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AuthResponseInfo.AuthBlockedReason fromValue(int value) {
                    return AuthResponseInfo.AuthBlockedReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AuthResponseInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AuthBlockedReason fromValue(int value) {
                if (value == 0) {
                    return AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED;
                }
                if (value == 1) {
                    return AuthBlockedReason.JWT_INVALID;
                }
                if (value == 2) {
                    return AuthBlockedReason.TOKEN_REVOKED;
                }
                if (value != 3) {
                    return null;
                }
                return AuthBlockedReason.HEADER_NOT_PRESENT;
            }
        }

        public static AuthBlockedReason valueOf(String str) {
            return (AuthBlockedReason) Enum.valueOf(AuthBlockedReason.class, str);
        }

        public static AuthBlockedReason[] values() {
            return (AuthBlockedReason[]) $VALUES.clone();
        }
    }
}
