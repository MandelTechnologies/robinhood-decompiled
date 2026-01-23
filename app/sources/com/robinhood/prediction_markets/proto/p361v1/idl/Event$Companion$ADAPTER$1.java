package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m3636d2 = {"com/robinhood/prediction_markets/proto/v1/idl/Event$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Event;", "event_contractsAdapter", "", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "getEvent_contractsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "event_contractsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class Event$Companion$ADAPTER$1 extends ProtoAdapter<Event> {

    /* renamed from: event_contractsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy event_contractsAdapter;

    Event$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<Event> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/prediction_markets.v1.Event", syntax, (Object) null, "prediction-markets/prediction_markets/proto/v1/public/entity.proto");
        this.event_contractsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.Event$Companion$ADAPTER$1$$ExternalSyntheticLambda0
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
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getLong_description()) + getEvent_contractsAdapter().encodedSizeWithTag(4, value.getEvent_contracts());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            iEncodedSizeWithTag += EventViewMode.ADAPTER.encodedSizeWithTag(5, value.getView_mode());
        }
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getBanner_text()) + protoAdapter.asRepeated().encodedSizeWithTag(8, value.getAttestation_values());
        if (value.getState() != ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED) {
            iEncodedSizeWithTag2 += ArsenalEventState.ADAPTER.encodedSizeWithTag(9, value.getState());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(10, value.getTick_size());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(11, value.getDescription());
        }
        if (value.getTimeline() != null) {
            iEncodedSizeWithTag2 += Timeline.ADAPTER.encodedSizeWithTag(12, value.getTimeline());
        }
        int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.asRepeated().encodedSizeWithTag(13, value.getProhibition_rules());
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            iEncodedSizeWithTag3 += PageType.ADAPTER.encodedSizeWithTag(14, value.getPage_type());
        }
        ProtoAdapter<ContractGroup> protoAdapter2 = ContractGroup.ADAPTER;
        int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter2.asRepeated().encodedSizeWithTag(15, value.getGame_contract_groups()) + protoAdapter.asRepeated().encodedSizeWithTag(16, value.getUrl_slugs());
        if (!Intrinsics.areEqual(value.getCategory(), "")) {
            iEncodedSizeWithTag4 += protoAdapter.encodedSizeWithTag(17, value.getCategory());
        }
        int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter2.asRepeated().encodedSizeWithTag(18, value.getPrepack_contract_group());
        if (value.getSupports_combos()) {
            iEncodedSizeWithTag5 += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.getSupports_combos()));
        }
        if (value.getIs_live()) {
            iEncodedSizeWithTag5 += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.getIs_live()));
        }
        ProtoAdapter<ContractGroupSection> protoAdapter3 = ContractGroupSection.ADAPTER;
        return iEncodedSizeWithTag5 + protoAdapter3.asRepeated().encodedSizeWithTag(22, value.getProps_contract_group_sections_v2()) + EventType.ADAPTER.encodedSizeWithTag(23, value.getEvent_type()) + protoAdapter.encodedSizeWithTag(24, value.getParent_event_id()) + protoAdapter3.asRepeated().encodedSizeWithTag(19, value.getProps_contract_group_sections());
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
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 3, (int) value.getLong_description());
        getEvent_contractsAdapter().encodeWithTag(writer, 4, (int) value.getEvent_contracts());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            EventViewMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getView_mode());
        }
        protoAdapter.encodeWithTag(writer, 7, (int) value.getBanner_text());
        protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getAttestation_values());
        if (value.getState() != ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED) {
            ArsenalEventState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            protoAdapter.encodeWithTag(writer, 10, (int) value.getTick_size());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            protoAdapter.encodeWithTag(writer, 11, (int) value.getDescription());
        }
        if (value.getTimeline() != null) {
            Timeline.ADAPTER.encodeWithTag(writer, 12, (int) value.getTimeline());
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 13, (int) value.getProhibition_rules());
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            PageType.ADAPTER.encodeWithTag(writer, 14, (int) value.getPage_type());
        }
        ProtoAdapter<ContractGroup> protoAdapter2 = ContractGroup.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(writer, 15, (int) value.getGame_contract_groups());
        protoAdapter.asRepeated().encodeWithTag(writer, 16, (int) value.getUrl_slugs());
        if (!Intrinsics.areEqual(value.getCategory(), "")) {
            protoAdapter.encodeWithTag(writer, 17, (int) value.getCategory());
        }
        protoAdapter2.asRepeated().encodeWithTag(writer, 18, (int) value.getPrepack_contract_group());
        if (value.getSupports_combos()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 20, (int) Boolean.valueOf(value.getSupports_combos()));
        }
        if (value.getIs_live()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getIs_live()));
        }
        ProtoAdapter<ContractGroupSection> protoAdapter3 = ContractGroupSection.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(writer, 22, (int) value.getProps_contract_group_sections_v2());
        EventType.ADAPTER.encodeWithTag(writer, 23, (int) value.getEvent_type());
        protoAdapter.encodeWithTag(writer, 24, (int) value.getParent_event_id());
        protoAdapter3.asRepeated().encodeWithTag(writer, 19, (int) value.getProps_contract_group_sections());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Event value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<ContractGroupSection> protoAdapter = ContractGroupSection.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(writer, 19, (int) value.getProps_contract_group_sections());
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(writer, 24, (int) value.getParent_event_id());
        EventType.ADAPTER.encodeWithTag(writer, 23, (int) value.getEvent_type());
        protoAdapter.asRepeated().encodeWithTag(writer, 22, (int) value.getProps_contract_group_sections_v2());
        if (value.getIs_live()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getIs_live()));
        }
        if (value.getSupports_combos()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 20, (int) Boolean.valueOf(value.getSupports_combos()));
        }
        ProtoAdapter<ContractGroup> protoAdapter3 = ContractGroup.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(writer, 18, (int) value.getPrepack_contract_group());
        if (!Intrinsics.areEqual(value.getCategory(), "")) {
            protoAdapter2.encodeWithTag(writer, 17, (int) value.getCategory());
        }
        protoAdapter2.asRepeated().encodeWithTag(writer, 16, (int) value.getUrl_slugs());
        protoAdapter3.asRepeated().encodeWithTag(writer, 15, (int) value.getGame_contract_groups());
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            PageType.ADAPTER.encodeWithTag(writer, 14, (int) value.getPage_type());
        }
        protoAdapter2.asRepeated().encodeWithTag(writer, 13, (int) value.getProhibition_rules());
        if (value.getTimeline() != null) {
            Timeline.ADAPTER.encodeWithTag(writer, 12, (int) value.getTimeline());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            protoAdapter2.encodeWithTag(writer, 11, (int) value.getDescription());
        }
        if (!Intrinsics.areEqual(value.getTick_size(), "")) {
            protoAdapter2.encodeWithTag(writer, 10, (int) value.getTick_size());
        }
        if (value.getState() != ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED) {
            ArsenalEventState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        protoAdapter2.asRepeated().encodeWithTag(writer, 8, (int) value.getAttestation_values());
        protoAdapter2.encodeWithTag(writer, 7, (int) value.getBanner_text());
        if (value.getView_mode() != EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED) {
            EventViewMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getView_mode());
        }
        getEvent_contractsAdapter().encodeWithTag(writer, 4, (int) value.getEvent_contracts());
        protoAdapter2.encodeWithTag(writer, 3, (int) value.getLong_description());
        if (!Intrinsics.areEqual(value.getName(), "")) {
            protoAdapter2.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (Intrinsics.areEqual(value.getId(), "")) {
            return;
        }
        protoAdapter2.encodeWithTag(writer, 1, (int) value.getId());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Event decode(ProtoReader reader) throws IOException {
        ArsenalEventState arsenalEventState;
        long j;
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EventViewMode eventViewMode = EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED;
        ArrayList arrayList = new ArrayList();
        ArsenalEventState arsenalEventState2 = ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED;
        ArrayList arrayList2 = new ArrayList();
        PageType pageType = PageType.PAGE_TYPE_UNSPECIFIED;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        EventViewMode eventViewModeDecode = eventViewMode;
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = null;
        String strDecode5 = null;
        Timeline timelineDecode = null;
        EventType eventTypeDecode = null;
        String strDecode6 = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        PageType pageTypeDecode = pageType;
        String strDecode7 = strDecode3;
        String strDecode8 = strDecode7;
        ArsenalEventState arsenalEventStateDecode = arsenalEventState2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Event(strDecode7, strDecode8, strDecode4, linkedHashMap, eventViewModeDecode, strDecode5, arrayList, arsenalEventStateDecode, strDecode, strDecode2, timelineDecode, arrayList2, pageTypeDecode, arrayList3, arrayList4, strDecode3, arrayList5, zBooleanValue, zBooleanValue2, arrayList6, eventTypeDecode, strDecode6, arrayList7, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    j = jBeginMessage;
                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 2:
                    j = jBeginMessage;
                    strDecode8 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    j = jBeginMessage;
                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    linkedHashMap.putAll(getEvent_contractsAdapter().decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 5:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    try {
                        eventViewModeDecode = EventViewMode.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 6:
                default:
                    reader.readUnknownField(iNextTag);
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 7:
                    j = jBeginMessage;
                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 8:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList.add(ProtoAdapter.STRING.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 9:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    try {
                        arsenalEventStateDecode = ArsenalEventState.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 10:
                    j = jBeginMessage;
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 11:
                    j = jBeginMessage;
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 12:
                    j = jBeginMessage;
                    timelineDecode = Timeline.ADAPTER.decode(reader);
                    break;
                case 13:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 14:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    try {
                        pageTypeDecode = PageType.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 15:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList3.add(ContractGroup.ADAPTER.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 16:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList4.add(ProtoAdapter.STRING.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 17:
                    j = jBeginMessage;
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 18:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList5.add(ContractGroup.ADAPTER.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 19:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList7.add(ContractGroupSection.ADAPTER.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 20:
                    j = jBeginMessage;
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 21:
                    j = jBeginMessage;
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 22:
                    arsenalEventState = arsenalEventStateDecode;
                    j = jBeginMessage;
                    arrayList6.add(ContractGroupSection.ADAPTER.decode(reader));
                    arsenalEventStateDecode = arsenalEventState;
                    break;
                case 23:
                    try {
                        eventTypeDecode = EventType.ADAPTER.decode(reader);
                        j = jBeginMessage;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        arsenalEventState = arsenalEventStateDecode;
                        j = jBeginMessage;
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 24:
                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                    j = jBeginMessage;
                    break;
            }
            jBeginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Event redact(Event value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Map mapM26824redactElements = Internal.m26824redactElements(value.getEvent_contracts(), EventContract.ADAPTER);
        Timeline timeline = value.getTimeline();
        Timeline timelineRedact = timeline != null ? Timeline.ADAPTER.redact(timeline) : null;
        List<ContractGroup> game_contract_groups = value.getGame_contract_groups();
        ProtoAdapter<ContractGroup> protoAdapter = ContractGroup.ADAPTER;
        List listM26823redactElements = Internal.m26823redactElements(game_contract_groups, protoAdapter);
        List listM26823redactElements2 = Internal.m26823redactElements(value.getPrepack_contract_group(), protoAdapter);
        List<ContractGroupSection> props_contract_group_sections_v2 = value.getProps_contract_group_sections_v2();
        ProtoAdapter<ContractGroupSection> protoAdapter2 = ContractGroupSection.ADAPTER;
        return value.copy((3595255 & 1) != 0 ? value.id : null, (3595255 & 2) != 0 ? value.name : null, (3595255 & 4) != 0 ? value.long_description : null, (3595255 & 8) != 0 ? value.event_contracts : mapM26824redactElements, (3595255 & 16) != 0 ? value.view_mode : null, (3595255 & 32) != 0 ? value.banner_text : null, (3595255 & 64) != 0 ? value.attestation_values : null, (3595255 & 128) != 0 ? value.state : null, (3595255 & 256) != 0 ? value.tick_size : null, (3595255 & 512) != 0 ? value.description : null, (3595255 & 1024) != 0 ? value.timeline : timelineRedact, (3595255 & 2048) != 0 ? value.prohibition_rules : null, (3595255 & 4096) != 0 ? value.page_type : null, (3595255 & 8192) != 0 ? value.game_contract_groups : listM26823redactElements, (3595255 & 16384) != 0 ? value.url_slugs : null, (3595255 & 32768) != 0 ? value.category : null, (3595255 & 65536) != 0 ? value.prepack_contract_group : listM26823redactElements2, (3595255 & 131072) != 0 ? value.supports_combos : false, (3595255 & 262144) != 0 ? value.is_live : false, (3595255 & 524288) != 0 ? value.props_contract_group_sections_v2 : Internal.m26823redactElements(props_contract_group_sections_v2, protoAdapter2), (3595255 & 1048576) != 0 ? value.event_type : null, (3595255 & 2097152) != 0 ? value.parent_event_id : null, (3595255 & 4194304) != 0 ? value.props_contract_group_sections : Internal.m26823redactElements(value.getProps_contract_group_sections(), protoAdapter2), (3595255 & 8388608) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
