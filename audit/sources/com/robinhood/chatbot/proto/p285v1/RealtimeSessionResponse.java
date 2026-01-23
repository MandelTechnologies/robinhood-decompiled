package com.robinhood.chatbot.proto.p285v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RealtimeSessionResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponse;", "Lcom/squareup/wire/Message;", "", "conversation_id", "", "session_id", "signaling_url", "token", "expires_at", "ice_config", "Lcom/robinhood/chatbot/proto/v1/IceConfig;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/IceConfig;Lokio/ByteString;)V", "getConversation_id", "()Ljava/lang/String;", "getSession_id", "getSignaling_url", "getToken", "getExpires_at", "getIce_config", "()Lcom/robinhood/chatbot/proto/v1/IceConfig;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RealtimeSessionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<RealtimeSessionResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expiresAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String expires_at;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.IceConfig#ADAPTER", jsonName = "iceConfig", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final IceConfig ice_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "signalingUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String signaling_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String token;

    public RealtimeSessionResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ RealtimeSessionResponse(String str, String str2, String str3, String str4, String str5, IceConfig iceConfig, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : iceConfig, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20533newBuilder();
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSignaling_url() {
        return this.signaling_url;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getExpires_at() {
        return this.expires_at;
    }

    public final IceConfig getIce_config() {
        return this.ice_config;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeSessionResponse(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfig iceConfig, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expires_at, "expires_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.conversation_id = conversation_id;
        this.session_id = session_id;
        this.signaling_url = signaling_url;
        this.token = token;
        this.expires_at = expires_at;
        this.ice_config = iceConfig;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20533newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealtimeSessionResponse)) {
            return false;
        }
        RealtimeSessionResponse realtimeSessionResponse = (RealtimeSessionResponse) other;
        return Intrinsics.areEqual(unknownFields(), realtimeSessionResponse.unknownFields()) && Intrinsics.areEqual(this.conversation_id, realtimeSessionResponse.conversation_id) && Intrinsics.areEqual(this.session_id, realtimeSessionResponse.session_id) && Intrinsics.areEqual(this.signaling_url, realtimeSessionResponse.signaling_url) && Intrinsics.areEqual(this.token, realtimeSessionResponse.token) && Intrinsics.areEqual(this.expires_at, realtimeSessionResponse.expires_at) && Intrinsics.areEqual(this.ice_config, realtimeSessionResponse.ice_config);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.conversation_id.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.signaling_url.hashCode()) * 37) + this.token.hashCode()) * 37) + this.expires_at.hashCode()) * 37;
        IceConfig iceConfig = this.ice_config;
        int iHashCode2 = iHashCode + (iceConfig != null ? iceConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("conversation_id=" + Internal.sanitize(this.conversation_id));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("signaling_url=" + Internal.sanitize(this.signaling_url));
        arrayList.add("token=" + Internal.sanitize(this.token));
        arrayList.add("expires_at=" + Internal.sanitize(this.expires_at));
        IceConfig iceConfig = this.ice_config;
        if (iceConfig != null) {
            arrayList.add("ice_config=" + iceConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealtimeSessionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RealtimeSessionResponse copy$default(RealtimeSessionResponse realtimeSessionResponse, String str, String str2, String str3, String str4, String str5, IceConfig iceConfig, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realtimeSessionResponse.conversation_id;
        }
        if ((i & 2) != 0) {
            str2 = realtimeSessionResponse.session_id;
        }
        if ((i & 4) != 0) {
            str3 = realtimeSessionResponse.signaling_url;
        }
        if ((i & 8) != 0) {
            str4 = realtimeSessionResponse.token;
        }
        if ((i & 16) != 0) {
            str5 = realtimeSessionResponse.expires_at;
        }
        if ((i & 32) != 0) {
            iceConfig = realtimeSessionResponse.ice_config;
        }
        if ((i & 64) != 0) {
            byteString = realtimeSessionResponse.unknownFields();
        }
        IceConfig iceConfig2 = iceConfig;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return realtimeSessionResponse.copy(str, str2, str7, str4, str6, iceConfig2, byteString2);
    }

    public final RealtimeSessionResponse copy(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfig ice_config, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expires_at, "expires_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealtimeSessionResponse(conversation_id, session_id, signaling_url, token, expires_at, ice_config, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealtimeSessionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealtimeSessionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.RealtimeSessionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealtimeSessionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConversation_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getSignaling_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSignaling_url());
                }
                if (!Intrinsics.areEqual(value.getToken(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getToken());
                }
                if (!Intrinsics.areEqual(value.getExpires_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getExpires_at());
                }
                return value.getIce_config() != null ? size + IceConfig.ADAPTER.encodedSizeWithTag(6, value.getIce_config()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealtimeSessionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getSignaling_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSignaling_url());
                }
                if (!Intrinsics.areEqual(value.getToken(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getToken());
                }
                if (!Intrinsics.areEqual(value.getExpires_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getExpires_at());
                }
                if (value.getIce_config() != null) {
                    IceConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getIce_config());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealtimeSessionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIce_config() != null) {
                    IceConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getIce_config());
                }
                if (!Intrinsics.areEqual(value.getExpires_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getExpires_at());
                }
                if (!Intrinsics.areEqual(value.getToken(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getToken());
                }
                if (!Intrinsics.areEqual(value.getSignaling_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSignaling_url());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                if (Intrinsics.areEqual(value.getConversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealtimeSessionResponse redact(RealtimeSessionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IceConfig ice_config = value.getIce_config();
                return RealtimeSessionResponse.copy$default(value, null, null, null, null, null, ice_config != null ? IceConfig.ADAPTER.redact(ice_config) : null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RealtimeSessionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                IceConfig iceConfigDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                iceConfigDecode = IceConfig.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new RealtimeSessionResponse(strDecode, strDecode5, strDecode2, strDecode3, strDecode4, iceConfigDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
