package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PersonaInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
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

/* compiled from: PersonaInfo.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PersonaInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PersonaInfo;", "attributesAdapter", "", "", "getAttributesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "attributesAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.eventlogging.PersonaInfo$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class PersonaInfo2 extends ProtoAdapter<PersonaInfo> {

    /* renamed from: attributesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy attributesAdapter;

    PersonaInfo2(FieldEncoding fieldEncoding, KClass<PersonaInfo> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.event_logging.PersonaInfo", syntax, (Object) null, "data-platform/data_platform/proto/account_security_event_data.proto");
        this.attributesAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PersonaInfo$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonaInfo2.attributesAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter attributesAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getAttributesAdapter() {
        return (ProtoAdapter) this.attributesAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(PersonaInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getStatus() != PersonaInfo.PersonaStatus.PERSONA_STATUS_UNSPECIFIED) {
            size += PersonaInfo.PersonaStatus.ADAPTER.encodedSizeWithTag(1, value.getStatus());
        }
        if (!Intrinsics.areEqual(value.getAction_description(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAction_description());
        }
        return size + getAttributesAdapter().encodedSizeWithTag(3, value.getAttributes());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PersonaInfo value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getStatus() != PersonaInfo.PersonaStatus.PERSONA_STATUS_UNSPECIFIED) {
            PersonaInfo.PersonaStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
        }
        if (!Intrinsics.areEqual(value.getAction_description(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction_description());
        }
        getAttributesAdapter().encodeWithTag(writer, 3, (int) value.getAttributes());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PersonaInfo value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getAttributesAdapter().encodeWithTag(writer, 3, (int) value.getAttributes());
        if (!Intrinsics.areEqual(value.getAction_description(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction_description());
        }
        if (value.getStatus() != PersonaInfo.PersonaStatus.PERSONA_STATUS_UNSPECIFIED) {
            PersonaInfo.PersonaStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public PersonaInfo decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        PersonaInfo.PersonaStatus personaStatusDecode = PersonaInfo.PersonaStatus.PERSONA_STATUS_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new PersonaInfo(personaStatusDecode, strDecode, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                try {
                    personaStatusDecode = PersonaInfo.PersonaStatus.ADAPTER.decode(reader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (iNextTag == 2) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 3) {
                linkedHashMap.putAll(getAttributesAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PersonaInfo redact(PersonaInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return PersonaInfo.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
    }
}
