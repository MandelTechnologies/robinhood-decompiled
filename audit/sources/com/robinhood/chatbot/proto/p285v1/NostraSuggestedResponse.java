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
import p479j$.time.Instant;

/* compiled from: NostraSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B}\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0083\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010 R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b-\u0010 R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b.\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b2\u0010 ¨\u00064"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "Lcom/squareup/wire/Message;", "", "", "twilio_conversation_id", "twilio_message_id", "suggested_text", "status", "", "attempt", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "response_mode", "response_version", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "generation_mode", "reference_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "Ljava/lang/String;", "getTwilio_conversation_id", "getTwilio_message_id", "getSuggested_text", "getStatus", "I", "getAttempt", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "getResponse_mode", "getResponse_version", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "getGeneration_mode", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "getReference_id", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NostraSuggestedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<NostraSuggestedResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int attempt;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.GenerateSRRequestMode#ADAPTER", jsonName = "generationMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final GenerateSRRequestMode generation_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant last_updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referenceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String reference_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "responseMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String response_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "responseVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String response_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "suggestedText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String suggested_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioConversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String twilio_conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioMessageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String twilio_message_id;

    public NostraSuggestedResponse() {
        this(null, null, null, null, 0, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ NostraSuggestedResponse(String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestMode generateSRRequestMode, String str7, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : instant, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED : generateSRRequestMode, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20527newBuilder();
    }

    public final String getTwilio_conversation_id() {
        return this.twilio_conversation_id;
    }

    public final String getTwilio_message_id() {
        return this.twilio_message_id;
    }

    public final String getSuggested_text() {
        return this.suggested_text;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final Instant getLast_updated_at() {
        return this.last_updated_at;
    }

    public final String getResponse_mode() {
        return this.response_mode;
    }

    public final String getResponse_version() {
        return this.response_version;
    }

    public final GenerateSRRequestMode getGeneration_mode() {
        return this.generation_mode;
    }

    public final String getReference_id() {
        return this.reference_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NostraSuggestedResponse(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int i, Instant instant, String response_mode, String response_version, GenerateSRRequestMode generation_mode, String reference_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.twilio_conversation_id = twilio_conversation_id;
        this.twilio_message_id = twilio_message_id;
        this.suggested_text = suggested_text;
        this.status = status;
        this.attempt = i;
        this.last_updated_at = instant;
        this.response_mode = response_mode;
        this.response_version = response_version;
        this.generation_mode = generation_mode;
        this.reference_id = reference_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20527newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NostraSuggestedResponse)) {
            return false;
        }
        NostraSuggestedResponse nostraSuggestedResponse = (NostraSuggestedResponse) other;
        return Intrinsics.areEqual(unknownFields(), nostraSuggestedResponse.unknownFields()) && Intrinsics.areEqual(this.twilio_conversation_id, nostraSuggestedResponse.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, nostraSuggestedResponse.twilio_message_id) && Intrinsics.areEqual(this.suggested_text, nostraSuggestedResponse.suggested_text) && Intrinsics.areEqual(this.status, nostraSuggestedResponse.status) && this.attempt == nostraSuggestedResponse.attempt && Intrinsics.areEqual(this.last_updated_at, nostraSuggestedResponse.last_updated_at) && Intrinsics.areEqual(this.response_mode, nostraSuggestedResponse.response_mode) && Intrinsics.areEqual(this.response_version, nostraSuggestedResponse.response_version) && this.generation_mode == nostraSuggestedResponse.generation_mode && Intrinsics.areEqual(this.reference_id, nostraSuggestedResponse.reference_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.twilio_conversation_id.hashCode()) * 37) + this.twilio_message_id.hashCode()) * 37) + this.suggested_text.hashCode()) * 37) + this.status.hashCode()) * 37) + Integer.hashCode(this.attempt)) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode2 = ((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.response_mode.hashCode()) * 37) + this.response_version.hashCode()) * 37) + this.generation_mode.hashCode()) * 37) + this.reference_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("twilio_conversation_id=" + Internal.sanitize(this.twilio_conversation_id));
        arrayList.add("twilio_message_id=" + Internal.sanitize(this.twilio_message_id));
        arrayList.add("suggested_text=" + Internal.sanitize(this.suggested_text));
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("attempt=" + this.attempt);
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        arrayList.add("response_mode=" + Internal.sanitize(this.response_mode));
        arrayList.add("response_version=" + Internal.sanitize(this.response_version));
        arrayList.add("generation_mode=" + this.generation_mode);
        arrayList.add("reference_id=" + Internal.sanitize(this.reference_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NostraSuggestedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NostraSuggestedResponse copy$default(NostraSuggestedResponse nostraSuggestedResponse, String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestMode generateSRRequestMode, String str7, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nostraSuggestedResponse.twilio_conversation_id;
        }
        if ((i2 & 2) != 0) {
            str2 = nostraSuggestedResponse.twilio_message_id;
        }
        if ((i2 & 4) != 0) {
            str3 = nostraSuggestedResponse.suggested_text;
        }
        if ((i2 & 8) != 0) {
            str4 = nostraSuggestedResponse.status;
        }
        if ((i2 & 16) != 0) {
            i = nostraSuggestedResponse.attempt;
        }
        if ((i2 & 32) != 0) {
            instant = nostraSuggestedResponse.last_updated_at;
        }
        if ((i2 & 64) != 0) {
            str5 = nostraSuggestedResponse.response_mode;
        }
        if ((i2 & 128) != 0) {
            str6 = nostraSuggestedResponse.response_version;
        }
        if ((i2 & 256) != 0) {
            generateSRRequestMode = nostraSuggestedResponse.generation_mode;
        }
        if ((i2 & 512) != 0) {
            str7 = nostraSuggestedResponse.reference_id;
        }
        if ((i2 & 1024) != 0) {
            byteString = nostraSuggestedResponse.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str6;
        GenerateSRRequestMode generateSRRequestMode2 = generateSRRequestMode;
        Instant instant2 = instant;
        String str10 = str5;
        int i3 = i;
        String str11 = str3;
        return nostraSuggestedResponse.copy(str, str2, str11, str4, i3, instant2, str10, str9, generateSRRequestMode2, str8, byteString2);
    }

    public final NostraSuggestedResponse copy(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int attempt, Instant last_updated_at, String response_mode, String response_version, GenerateSRRequestMode generation_mode, String reference_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NostraSuggestedResponse(twilio_conversation_id, twilio_message_id, suggested_text, status, attempt, last_updated_at, response_mode, response_version, generation_mode, reference_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NostraSuggestedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NostraSuggestedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.NostraSuggestedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NostraSuggestedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTwilio_conversation_id());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTwilio_message_id());
                }
                if (!Intrinsics.areEqual(value.getSuggested_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSuggested_text());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getStatus());
                }
                if (value.getAttempt() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getAttempt()));
                }
                if (value.getLast_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getLast_updated_at());
                }
                if (!Intrinsics.areEqual(value.getResponse_mode(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getResponse_mode());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getResponse_version());
                }
                if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
                    size += GenerateSRRequestMode.ADAPTER.encodedSizeWithTag(9, value.getGeneration_mode());
                }
                return !Intrinsics.areEqual(value.getReference_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getReference_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NostraSuggestedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTwilio_conversation_id());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTwilio_message_id());
                }
                if (!Intrinsics.areEqual(value.getSuggested_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSuggested_text());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (value.getAttempt() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getAttempt()));
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getLast_updated_at());
                }
                if (!Intrinsics.areEqual(value.getResponse_mode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getResponse_mode());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getResponse_version());
                }
                if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
                    GenerateSRRequestMode.ADAPTER.encodeWithTag(writer, 9, (int) value.getGeneration_mode());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getReference_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NostraSuggestedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getReference_id());
                }
                if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
                    GenerateSRRequestMode.ADAPTER.encodeWithTag(writer, 9, (int) value.getGeneration_mode());
                }
                if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getResponse_version());
                }
                if (!Intrinsics.areEqual(value.getResponse_mode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getResponse_mode());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getLast_updated_at());
                }
                if (value.getAttempt() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getAttempt()));
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getSuggested_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSuggested_text());
                }
                if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTwilio_message_id());
                }
                if (Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTwilio_conversation_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NostraSuggestedResponse decode(ProtoReader reader) throws IOException {
                GenerateSRRequestMode generateSRRequestMode;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                GenerateSRRequestMode generateSRRequestMode2 = GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                int iIntValue = 0;
                Instant instantDecode = null;
                GenerateSRRequestMode generateSRRequestModeDecode = generateSRRequestMode2;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                try {
                                    generateSRRequestModeDecode = GenerateSRRequestMode.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    generateSRRequestMode = generateSRRequestModeDecode;
                                    str = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                generateSRRequestMode = generateSRRequestModeDecode;
                                str = strDecode6;
                                break;
                        }
                        strDecode6 = str;
                        generateSRRequestModeDecode = generateSRRequestMode;
                    } else {
                        return new NostraSuggestedResponse(strDecode6, strDecode7, strDecode, strDecode2, iIntValue, instantDecode, strDecode3, strDecode4, generateSRRequestModeDecode, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NostraSuggestedResponse redact(NostraSuggestedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant last_updated_at = value.getLast_updated_at();
                return NostraSuggestedResponse.copy$default(value, null, null, null, null, 0, last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null, null, null, null, null, ByteString.EMPTY, 991, null);
            }
        };
    }
}
