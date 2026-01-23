package com.robinhood.rosetta.experiment_assignment;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
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

/* compiled from: AssignmentEvent.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentEvent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEvent;", "variantsAdapter", "", "", "getVariantsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "variantsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentEvent$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class AssignmentEvent2 extends ProtoAdapter<AssignmentEvent> {

    /* renamed from: variantsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy variantsAdapter;

    AssignmentEvent2(FieldEncoding fieldEncoding, KClass<AssignmentEvent> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.experiment_assignment.service.AssignmentEvent", syntax, (Object) null, "rosetta/rosetta/experiment_assignment/service.proto");
        this.variantsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentEvent$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssignmentEvent2.variantsAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getVariantsAdapter() {
        return (ProtoAdapter) this.variantsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter variantsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(AssignmentEvent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_agent());
        }
        int iEncodedSizeWithTag = size + AssignmentResult.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getResults()) + getVariantsAdapter().encodedSizeWithTag(3, value.getVariants());
        if (!Intrinsics.areEqual(value.getRequest_type(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRequest_type());
        }
        if (value.getKaizen_list_respected()) {
            iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getKaizen_list_respected()));
        }
        if (!Intrinsics.areEqual(value.getPlatform(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPlatform());
        }
        if (!Intrinsics.areEqual(value.getVersion(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getVersion());
        }
        if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getEntity_type());
        }
        if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEntity_id());
        }
        if (value.getTrigger()) {
            iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getTrigger()));
        }
        if (!Intrinsics.areEqual(value.getSource(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getSource());
        }
        if (!Intrinsics.areEqual(value.getEvent(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getEvent());
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getTimestamp());
        }
        return !Intrinsics.areEqual(value.getApplication(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getApplication()) : iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, AssignmentEvent value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_agent());
        }
        AssignmentResult.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getResults());
        getVariantsAdapter().encodeWithTag(writer, 3, (int) value.getVariants());
        if (!Intrinsics.areEqual(value.getRequest_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRequest_type());
        }
        if (value.getKaizen_list_respected()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getKaizen_list_respected()));
        }
        if (!Intrinsics.areEqual(value.getPlatform(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPlatform());
        }
        if (!Intrinsics.areEqual(value.getVersion(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVersion());
        }
        if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEntity_type());
        }
        if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntity_id());
        }
        if (value.getTrigger()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getTrigger()));
        }
        if (!Intrinsics.areEqual(value.getSource(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource());
        }
        if (!Intrinsics.areEqual(value.getEvent(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getEvent());
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTimestamp());
        }
        if (!Intrinsics.areEqual(value.getApplication(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getApplication());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, AssignmentEvent value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!Intrinsics.areEqual(value.getApplication(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getApplication());
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTimestamp());
        }
        if (!Intrinsics.areEqual(value.getEvent(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getEvent());
        }
        if (!Intrinsics.areEqual(value.getSource(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource());
        }
        if (value.getTrigger()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getTrigger()));
        }
        if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntity_id());
        }
        if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEntity_type());
        }
        if (!Intrinsics.areEqual(value.getVersion(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVersion());
        }
        if (!Intrinsics.areEqual(value.getPlatform(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPlatform());
        }
        if (value.getKaizen_list_respected()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getKaizen_list_respected()));
        }
        if (!Intrinsics.areEqual(value.getRequest_type(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRequest_type());
        }
        getVariantsAdapter().encodeWithTag(writer, 3, (int) value.getVariants());
        AssignmentResult.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getResults());
        if (Intrinsics.areEqual(value.getUser_agent(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_agent());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public AssignmentEvent decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        String strDecode5 = strDecode4;
        String strDecode6 = strDecode5;
        String strDecode7 = strDecode6;
        String strDecode8 = strDecode7;
        String strDecode9 = strDecode8;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        String strDecode10 = strDecode9;
        while (true) {
            int iNextTag = reader.nextTag();
            String str = strDecode10;
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        arrayList.add(AssignmentResult.ADAPTER.decode(reader));
                        break;
                    case 3:
                        linkedHashMap.putAll(getVariantsAdapter().decode(reader));
                        break;
                    case 4:
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 5:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 6:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 9:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 11:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 13:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 14:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        break;
                }
                strDecode10 = str;
            } else {
                return new AssignmentEvent(strDecode9, arrayList, linkedHashMap, str, zBooleanValue, strDecode, strDecode2, strDecode3, strDecode4, zBooleanValue2, strDecode5, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public AssignmentEvent redact(AssignmentEvent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.copy((16381 & 1) != 0 ? value.user_agent : null, (16381 & 2) != 0 ? value.results : Internal.m26823redactElements(value.getResults(), AssignmentResult.ADAPTER), (16381 & 4) != 0 ? value.variants : null, (16381 & 8) != 0 ? value.request_type : null, (16381 & 16) != 0 ? value.kaizen_list_respected : false, (16381 & 32) != 0 ? value.platform : null, (16381 & 64) != 0 ? value.version : null, (16381 & 128) != 0 ? value.entity_type : null, (16381 & 256) != 0 ? value.entity_id : null, (16381 & 512) != 0 ? value.trigger : false, (16381 & 1024) != 0 ? value.source : null, (16381 & 2048) != 0 ? value.event : null, (16381 & 4096) != 0 ? value.timestamp : null, (16381 & 8192) != 0 ? value.application : null, (16381 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
