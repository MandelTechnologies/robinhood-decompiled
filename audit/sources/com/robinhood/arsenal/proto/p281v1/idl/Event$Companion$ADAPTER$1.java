package com.robinhood.arsenal.proto.p281v1.idl;

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
import rosetta.identi.agreements.AgreementType;

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m3636d2 = {"com/robinhood/arsenal/proto/v1/idl/Event$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/arsenal/proto/v1/idl/Event;", "event_contractsAdapter", "", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "getEvent_contractsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "event_contractsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class Event$Companion$ADAPTER$1 extends ProtoAdapter<Event> {

    /* renamed from: event_contractsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy event_contractsAdapter;

    Event$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<Event> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/arsenal.public.Event", syntax, (Object) null, "arsenal/arsenal/proto/v1/public/entity.proto");
        this.event_contractsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.Event$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Event$Companion$ADAPTER$1.event_contractsAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter event_contractsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.INT32, EventContract.ADAPTER);
    }

    private final ProtoAdapter<Map<Integer, EventContract>> getEvent_contractsAdapter() {
        return (ProtoAdapter) this.event_contractsAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Event value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getId(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
        }
        if (!Intrinsics.areEqual(value.getSeries_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSeries_id());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDescription());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getLong_description());
        if (value.getState() != EventState.EVENT_STATE_UNSPECIFIED) {
            iEncodedSizeWithTag += EventState.ADAPTER.encodedSizeWithTag(7, value.getState());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getTick_size());
        }
        if (value.getTimeline() != null) {
            iEncodedSizeWithTag += Timeline.ADAPTER.encodedSizeWithTag(9, value.getTimeline());
        }
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + getEvent_contractsAdapter().encodedSizeWithTag(10, value.getEvent_contracts());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            iEncodedSizeWithTag2 += EventViewMode.ADAPTER.encodedSizeWithTag(11, value.getView_mode());
        }
        int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + AgreementType.ADAPTER.asRepeated().encodedSizeWithTag(12, value.getAttestations()) + protoAdapter.encodedSizeWithTag(13, value.getBracket_id()) + EventRegion.ADAPTER.encodedSizeWithTag(14, value.getRegion()) + EventRound.ADAPTER.encodedSizeWithTag(15, value.getRound()) + protoAdapter.encodedSizeWithTag(16, value.getReceipt_shortname());
        if (value.getEvent_index() != 0) {
            iEncodedSizeWithTag3 += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getEvent_index()));
        }
        int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(18, value.getBanner_text()) + EventMDLiveDataBackup.ADAPTER.encodedSizeWithTag(19, value.getMd_live_data_backup()) + protoAdapter.asRepeated().encodedSizeWithTag(20, value.getAttestation_values());
        if (value.getSeries_index() != 0) {
            iEncodedSizeWithTag4 += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getSeries_index()));
        }
        return iEncodedSizeWithTag4 + protoAdapter.asRepeated().encodedSizeWithTag(32, value.getProhibition_rules());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Event value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (!Intrinsics.areEqual(value.getSeries_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSeries_id());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 6, (int) value.getLong_description());
        if (value.getState() != EventState.EVENT_STATE_UNSPECIFIED) {
            EventState.ADAPTER.encodeWithTag(writer, 7, (int) value.getState());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            protoAdapter.encodeWithTag(writer, 8, (int) value.getTick_size());
        }
        if (value.getTimeline() != null) {
            Timeline.ADAPTER.encodeWithTag(writer, 9, (int) value.getTimeline());
        }
        getEvent_contractsAdapter().encodeWithTag(writer, 10, (int) value.getEvent_contracts());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            EventViewMode.ADAPTER.encodeWithTag(writer, 11, (int) value.getView_mode());
        }
        AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getAttestations());
        protoAdapter.encodeWithTag(writer, 13, (int) value.getBracket_id());
        EventRegion.ADAPTER.encodeWithTag(writer, 14, (int) value.getRegion());
        EventRound.ADAPTER.encodeWithTag(writer, 15, (int) value.getRound());
        protoAdapter.encodeWithTag(writer, 16, (int) value.getReceipt_shortname());
        if (value.getEvent_index() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getEvent_index()));
        }
        protoAdapter.encodeWithTag(writer, 18, (int) value.getBanner_text());
        EventMDLiveDataBackup.ADAPTER.encodeWithTag(writer, 19, (int) value.getMd_live_data_backup());
        protoAdapter.asRepeated().encodeWithTag(writer, 20, (int) value.getAttestation_values());
        if (value.getSeries_index() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getSeries_index()));
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 32, (int) value.getProhibition_rules());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Event value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 32, (int) value.getProhibition_rules());
        if (value.getSeries_index() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getSeries_index()));
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 20, (int) value.getAttestation_values());
        EventMDLiveDataBackup.ADAPTER.encodeWithTag(writer, 19, (int) value.getMd_live_data_backup());
        protoAdapter.encodeWithTag(writer, 18, (int) value.getBanner_text());
        if (value.getEvent_index() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getEvent_index()));
        }
        protoAdapter.encodeWithTag(writer, 16, (int) value.getReceipt_shortname());
        EventRound.ADAPTER.encodeWithTag(writer, 15, (int) value.getRound());
        EventRegion.ADAPTER.encodeWithTag(writer, 14, (int) value.getRegion());
        protoAdapter.encodeWithTag(writer, 13, (int) value.getBracket_id());
        AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getAttestations());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            EventViewMode.ADAPTER.encodeWithTag(writer, 11, (int) value.getView_mode());
        }
        getEvent_contractsAdapter().encodeWithTag(writer, 10, (int) value.getEvent_contracts());
        if (value.getTimeline() != null) {
            Timeline.ADAPTER.encodeWithTag(writer, 9, (int) value.getTimeline());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            protoAdapter.encodeWithTag(writer, 8, (int) value.getTick_size());
        }
        if (value.getState() != EventState.EVENT_STATE_UNSPECIFIED) {
            EventState.ADAPTER.encodeWithTag(writer, 7, (int) value.getState());
        }
        protoAdapter.encodeWithTag(writer, 6, (int) value.getLong_description());
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            protoAdapter.encodeWithTag(writer, 4, (int) value.getSymbol());
        }
        if (!Intrinsics.areEqual(value.getSeries_id(), "")) {
            protoAdapter.encodeWithTag(writer, 3, (int) value.getSeries_id());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (Intrinsics.areEqual(value.getId(), "")) {
            return;
        }
        protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Event decode(ProtoReader reader) throws IOException {
        ArrayList arrayList;
        EventViewMode eventViewMode;
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        EventState eventState = EventState.EVENT_STATE_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EventViewMode eventViewMode2 = EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        EventState eventStateDecode = eventState;
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        String strDecode5 = null;
        Timeline timelineDecode = null;
        String strDecode6 = null;
        EventRegion eventRegionDecode = null;
        EventRound eventRoundDecode = null;
        String strDecode7 = null;
        String strDecode8 = null;
        EventMDLiveDataBackup eventMDLiveDataBackupDecode = null;
        int iIntValue = 0;
        int iIntValue2 = 0;
        EventViewMode eventViewModeDecode = eventViewMode2;
        String strDecode9 = strDecode4;
        String strDecode10 = strDecode9;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Event(strDecode9, strDecode10, strDecode, strDecode2, strDecode3, strDecode5, eventStateDecode, strDecode4, timelineDecode, linkedHashMap, eventViewModeDecode, arrayList2, strDecode6, eventRegionDecode, eventRoundDecode, strDecode7, iIntValue, strDecode8, eventMDLiveDataBackupDecode, arrayList3, iIntValue2, arrayList4, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag != 32) {
                switch (iNextTag) {
                    case 1:
                        arrayList = arrayList3;
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        arrayList = arrayList3;
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        arrayList = arrayList3;
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        arrayList = arrayList3;
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        arrayList = arrayList3;
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 6:
                        arrayList = arrayList3;
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        arrayList = arrayList3;
                        eventViewMode = eventViewModeDecode;
                        str = strDecode9;
                        try {
                            eventStateDecode = EventState.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 8:
                        arrayList = arrayList3;
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 9:
                        arrayList = arrayList3;
                        timelineDecode = Timeline.ADAPTER.decode(reader);
                        break;
                    case 10:
                        arrayList = arrayList3;
                        eventViewMode = eventViewModeDecode;
                        str = strDecode9;
                        linkedHashMap.putAll(getEvent_contractsAdapter().decode(reader));
                        break;
                    case 11:
                        arrayList = arrayList3;
                        eventViewMode = eventViewModeDecode;
                        str = strDecode9;
                        try {
                            eventViewModeDecode = EventViewMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                        strDecode9 = str;
                        break;
                    case 12:
                        try {
                            AgreementType.ADAPTER.tryDecode(reader, arrayList2);
                            arrayList = arrayList3;
                            eventViewMode = eventViewModeDecode;
                            str = strDecode9;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            arrayList = arrayList3;
                            eventViewMode = eventViewModeDecode;
                            str = strDecode9;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            break;
                        }
                    case 13:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 14:
                        eventRegionDecode = EventRegion.ADAPTER.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 15:
                        eventRoundDecode = EventRound.ADAPTER.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 16:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 17:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        arrayList = arrayList3;
                        break;
                    case 18:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 19:
                        eventMDLiveDataBackupDecode = EventMDLiveDataBackup.ADAPTER.decode(reader);
                        arrayList = arrayList3;
                        break;
                    case 20:
                        arrayList3.add(ProtoAdapter.STRING.decode(reader));
                        arrayList = arrayList3;
                        eventViewMode = eventViewModeDecode;
                        str = strDecode9;
                        break;
                    case 21:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        arrayList = arrayList3;
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        arrayList = arrayList3;
                        eventViewMode = eventViewModeDecode;
                        str = strDecode9;
                        break;
                }
                arrayList3 = arrayList;
            } else {
                arrayList = arrayList3;
                eventViewMode = eventViewModeDecode;
                str = strDecode9;
                arrayList4.add(ProtoAdapter.STRING.decode(reader));
            }
            eventViewModeDecode = eventViewMode;
            strDecode9 = str;
            arrayList3 = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Event redact(Event value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Timeline timeline = value.getTimeline();
        Timeline timelineRedact = timeline != null ? Timeline.ADAPTER.redact(timeline) : null;
        Map mapM26824redactElements = Internal.m26824redactElements(value.getEvent_contracts(), EventContract.ADAPTER);
        EventRegion region = value.getRegion();
        EventRegion eventRegionRedact = region != null ? EventRegion.ADAPTER.redact(region) : null;
        EventRound round = value.getRound();
        EventRound eventRoundRedact = round != null ? EventRound.ADAPTER.redact(round) : null;
        EventMDLiveDataBackup md_live_data_backup = value.getMd_live_data_backup();
        return value.copy((3906815 & 1) != 0 ? value.id : null, (3906815 & 2) != 0 ? value.name : null, (3906815 & 4) != 0 ? value.series_id : null, (3906815 & 8) != 0 ? value.symbol : null, (3906815 & 16) != 0 ? value.description : null, (3906815 & 32) != 0 ? value.long_description : null, (3906815 & 64) != 0 ? value.state : null, (3906815 & 128) != 0 ? value.tick_size : null, (3906815 & 256) != 0 ? value.timeline : timelineRedact, (3906815 & 512) != 0 ? value.event_contracts : mapM26824redactElements, (3906815 & 1024) != 0 ? value.view_mode : null, (3906815 & 2048) != 0 ? value.attestations : null, (3906815 & 4096) != 0 ? value.bracket_id : null, (3906815 & 8192) != 0 ? value.region : eventRegionRedact, (3906815 & 16384) != 0 ? value.round : eventRoundRedact, (3906815 & 32768) != 0 ? value.receipt_shortname : null, (3906815 & 65536) != 0 ? value.event_index : 0, (3906815 & 131072) != 0 ? value.banner_text : null, (3906815 & 262144) != 0 ? value.md_live_data_backup : md_live_data_backup != null ? EventMDLiveDataBackup.ADAPTER.redact(md_live_data_backup) : null, (3906815 & 524288) != 0 ? value.attestation_values : null, (3906815 & 1048576) != 0 ? value.series_index : 0, (3906815 & 2097152) != 0 ? value.prohibition_rules : null, (3906815 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
