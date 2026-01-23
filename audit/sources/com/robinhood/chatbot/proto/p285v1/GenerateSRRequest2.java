package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GenerateSRRequest.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R9\u0010\u0003\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00040\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/chatbot/proto/v1/GenerateSRRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "triage_contextAdapter", "", "", "getTriage_contextAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "triage_contextAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.chatbot.proto.v1.GenerateSRRequest$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes20.dex */
public final class GenerateSRRequest2 extends ProtoAdapter<GenerateSRRequest> {

    /* renamed from: triage_contextAdapter$delegate, reason: from kotlin metadata */
    private final Lazy triage_contextAdapter;

    GenerateSRRequest2(FieldEncoding fieldEncoding, KClass<GenerateSRRequest> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/chatbot.service.GenerateSRRequest", syntax, (Object) null, "chatbot/chatbot/proto/v1/suggested_response.proto");
        this.triage_contextAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.GenerateSRRequest$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenerateSRRequest2.triage_contextAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, Map<String, ?>>> getTriage_contextAdapter() {
        return (ProtoAdapter) this.triage_contextAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter triage_contextAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRUCT_MAP);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(GenerateSRRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTwilio_conversation_id());
        }
        if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTwilio_message_id());
        }
        if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUser_uuid());
        }
        if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getResponse_version());
        }
        if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSf_case_id());
        }
        if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
            size += GenerateSRRequestMode.ADAPTER.encodedSizeWithTag(6, value.getGeneration_mode());
        }
        return size + getTriage_contextAdapter().encodedSizeWithTag(7, value.getTriage_context());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, GenerateSRRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getTwilio_conversation_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTwilio_conversation_id());
        }
        if (!Intrinsics.areEqual(value.getTwilio_message_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTwilio_message_id());
        }
        if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_uuid());
        }
        if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResponse_version());
        }
        if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSf_case_id());
        }
        if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
            GenerateSRRequestMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getGeneration_mode());
        }
        getTriage_contextAdapter().encodeWithTag(writer, 7, (int) value.getTriage_context());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, GenerateSRRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getTriage_contextAdapter().encodeWithTag(writer, 7, (int) value.getTriage_context());
        if (value.getGeneration_mode() != GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED) {
            GenerateSRRequestMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getGeneration_mode());
        }
        if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSf_case_id());
        }
        if (!Intrinsics.areEqual(value.getResponse_version(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResponse_version());
        }
        if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_uuid());
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
    public GenerateSRRequest decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        GenerateSRRequestMode generateSRRequestModeDecode = GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        String strDecode5 = strDecode4;
        while (true) {
            GenerateSRRequestMode generateSRRequestMode = generateSRRequestModeDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            try {
                                generateSRRequestModeDecode = GenerateSRRequestMode.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 7:
                            linkedHashMap.putAll(getTriage_contextAdapter().decode(reader));
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                } else {
                    return new GenerateSRRequest(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, generateSRRequestMode, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public GenerateSRRequest redact(GenerateSRRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return GenerateSRRequest.copy$default(value, null, null, null, null, null, null, Internal.m26824redactElements(value.getTriage_context(), ProtoAdapter.STRUCT_MAP), ByteString.EMPTY, 63, null);
    }
}
