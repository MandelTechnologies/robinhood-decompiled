package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: GenerateSRRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016Jn\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f0\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Lcom/squareup/wire/Message;", "", "twilio_conversation_id", "", "twilio_message_id", "user_uuid", "response_version", "sf_case_id", "generation_mode", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "triage_context", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;Ljava/util/Map;Lokio/ByteString;)V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id", "getUser_uuid", "getResponse_version", "getSf_case_id", "getGeneration_mode", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "getTriage_context", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GenerateSRRequest extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.GenerateSRRequestMode#ADAPTER", jsonName = "generationMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final GenerateSRRequestMode generation_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "responseVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String response_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sfCaseId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String sf_case_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "triageContext", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final Map<String, Map<String, ?>> triage_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioConversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String twilio_conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioMessageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String twilio_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String user_uuid;

    @JvmField
    public static final ProtoAdapter<GenerateSRRequest> ADAPTER = new GenerateSRRequest2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(GenerateSRRequest.class), Syntax.PROTO_3);

    public GenerateSRRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GenerateSRRequest(String str, String str2, String str3, String str4, String str5, GenerateSRRequestMode generateSRRequestMode, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED : generateSRRequestMode, (i & 64) != 0 ? MapsKt.emptyMap() : map, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20491newBuilder();
    }

    public final String getTwilio_conversation_id() {
        return this.twilio_conversation_id;
    }

    public final String getTwilio_message_id() {
        return this.twilio_message_id;
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getResponse_version() {
        return this.response_version;
    }

    public final String getSf_case_id() {
        return this.sf_case_id;
    }

    public final GenerateSRRequestMode getGeneration_mode() {
        return this.generation_mode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateSRRequest(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestMode generation_mode, Map<String, ? extends Map<String, ?>> triage_context, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(triage_context, "triage_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.twilio_conversation_id = twilio_conversation_id;
        this.twilio_message_id = twilio_message_id;
        this.user_uuid = user_uuid;
        this.response_version = response_version;
        this.sf_case_id = sf_case_id;
        this.generation_mode = generation_mode;
        this.triage_context = Internal.immutableCopyOfMapWithStructValues("triage_context", triage_context);
    }

    public final Map<String, Map<String, ?>> getTriage_context() {
        return this.triage_context;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20491newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GenerateSRRequest)) {
            return false;
        }
        GenerateSRRequest generateSRRequest = (GenerateSRRequest) other;
        return Intrinsics.areEqual(unknownFields(), generateSRRequest.unknownFields()) && Intrinsics.areEqual(this.twilio_conversation_id, generateSRRequest.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, generateSRRequest.twilio_message_id) && Intrinsics.areEqual(this.user_uuid, generateSRRequest.user_uuid) && Intrinsics.areEqual(this.response_version, generateSRRequest.response_version) && Intrinsics.areEqual(this.sf_case_id, generateSRRequest.sf_case_id) && this.generation_mode == generateSRRequest.generation_mode && Intrinsics.areEqual(this.triage_context, generateSRRequest.triage_context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.twilio_conversation_id.hashCode()) * 37) + this.twilio_message_id.hashCode()) * 37) + this.user_uuid.hashCode()) * 37) + this.response_version.hashCode()) * 37) + this.sf_case_id.hashCode()) * 37) + this.generation_mode.hashCode()) * 37) + this.triage_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("twilio_conversation_id=" + Internal.sanitize(this.twilio_conversation_id));
        arrayList.add("twilio_message_id=" + Internal.sanitize(this.twilio_message_id));
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("response_version=" + Internal.sanitize(this.response_version));
        arrayList.add("sf_case_id=" + Internal.sanitize(this.sf_case_id));
        arrayList.add("generation_mode=" + this.generation_mode);
        if (!this.triage_context.isEmpty()) {
            arrayList.add("triage_context=" + this.triage_context);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenerateSRRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GenerateSRRequest copy$default(GenerateSRRequest generateSRRequest, String str, String str2, String str3, String str4, String str5, GenerateSRRequestMode generateSRRequestMode, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateSRRequest.twilio_conversation_id;
        }
        if ((i & 2) != 0) {
            str2 = generateSRRequest.twilio_message_id;
        }
        if ((i & 4) != 0) {
            str3 = generateSRRequest.user_uuid;
        }
        if ((i & 8) != 0) {
            str4 = generateSRRequest.response_version;
        }
        if ((i & 16) != 0) {
            str5 = generateSRRequest.sf_case_id;
        }
        if ((i & 32) != 0) {
            generateSRRequestMode = generateSRRequest.generation_mode;
        }
        if ((i & 64) != 0) {
            map = generateSRRequest.triage_context;
        }
        if ((i & 128) != 0) {
            byteString = generateSRRequest.unknownFields();
        }
        Map map2 = map;
        ByteString byteString2 = byteString;
        String str6 = str5;
        GenerateSRRequestMode generateSRRequestMode2 = generateSRRequestMode;
        return generateSRRequest.copy(str, str2, str3, str4, str6, generateSRRequestMode2, map2, byteString2);
    }

    public final GenerateSRRequest copy(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestMode generation_mode, Map<String, ? extends Map<String, ?>> triage_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(triage_context, "triage_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GenerateSRRequest(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generation_mode, triage_context, unknownFields);
    }
}
