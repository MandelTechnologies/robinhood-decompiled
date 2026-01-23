package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: GetSRRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequest;", "Lcom/squareup/wire/Message;", "", "twilio_conversation_id", "", "twilio_message_id", "response_version", "sf_case_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id", "getResponse_version", "getSf_case_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetSRRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetSRRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "responseVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String response_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sfCaseId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String sf_case_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioConversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String twilio_conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioMessageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String twilio_message_id;

    public GetSRRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ GetSRRequest(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20505newBuilder();
    }

    public final String getTwilio_conversation_id() {
        return this.twilio_conversation_id;
    }

    public final String getTwilio_message_id() {
        return this.twilio_message_id;
    }

    public final String getResponse_version() {
        return this.response_version;
    }

    public final String getSf_case_id() {
        return this.sf_case_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSRRequest(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.twilio_conversation_id = twilio_conversation_id;
        this.twilio_message_id = twilio_message_id;
        this.response_version = response_version;
        this.sf_case_id = sf_case_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20505newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSRRequest)) {
            return false;
        }
        GetSRRequest getSRRequest = (GetSRRequest) other;
        return Intrinsics.areEqual(unknownFields(), getSRRequest.unknownFields()) && Intrinsics.areEqual(this.twilio_conversation_id, getSRRequest.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, getSRRequest.twilio_message_id) && Intrinsics.areEqual(this.response_version, getSRRequest.response_version) && Intrinsics.areEqual(this.sf_case_id, getSRRequest.sf_case_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.twilio_conversation_id.hashCode()) * 37) + this.twilio_message_id.hashCode()) * 37) + this.response_version.hashCode()) * 37) + this.sf_case_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("twilio_conversation_id=" + Internal.sanitize(this.twilio_conversation_id));
        arrayList.add("twilio_message_id=" + Internal.sanitize(this.twilio_message_id));
        arrayList.add("response_version=" + Internal.sanitize(this.response_version));
        arrayList.add("sf_case_id=" + Internal.sanitize(this.sf_case_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSRRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetSRRequest copy$default(GetSRRequest getSRRequest, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSRRequest.twilio_conversation_id;
        }
        if ((i & 2) != 0) {
            str2 = getSRRequest.twilio_message_id;
        }
        if ((i & 4) != 0) {
            str3 = getSRRequest.response_version;
        }
        if ((i & 8) != 0) {
            str4 = getSRRequest.sf_case_id;
        }
        if ((i & 16) != 0) {
            byteString = getSRRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return getSRRequest.copy(str, str2, str5, str4, byteString2);
    }

    public final GetSRRequest copy(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSRRequest(twilio_conversation_id, twilio_message_id, response_version, sf_case_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSRRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSRRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.GetSRRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSRRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTwilio_conversation_id());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTwilio_message_id());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getResponse_version());
                }
                return !Intrinsics.areEqual(value.getSf_case_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSf_case_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSRRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTwilio_conversation_id());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTwilio_message_id());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getResponse_version());
                }
                if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSf_case_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSRRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSf_case_id());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getResponse_version());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTwilio_message_id());
                }
                if (Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTwilio_conversation_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSRRequest redact(GetSRRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetSRRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetSRRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSRRequest(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
