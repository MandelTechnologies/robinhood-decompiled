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
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: EventState.kt */
@Metadata(m3635d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R-\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R-\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R-\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007R-\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u0007R-\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0007¨\u0006'"}, m3636d2 = {"com/robinhood/prediction_markets/proto/v1/idl/EventState$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "contract_id_to_event_scoresAdapter", "", "", "getContract_id_to_event_scoresAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "contract_id_to_event_scoresAdapter$delegate", "Lkotlin/Lazy;", "contract_id_to_visual_indicatorAdapter", "", "getContract_id_to_visual_indicatorAdapter", "contract_id_to_visual_indicatorAdapter$delegate", "contract_id_to_colorAdapter", "Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "getContract_id_to_colorAdapter", "contract_id_to_colorAdapter$delegate", "contract_id_to_visual_emphasisAdapter", "getContract_id_to_visual_emphasisAdapter", "contract_id_to_visual_emphasisAdapter$delegate", "contract_id_to_tertiary_textAdapter", "getContract_id_to_tertiary_textAdapter", "contract_id_to_tertiary_textAdapter$delegate", "contract_id_to_quaternary_textAdapter", "getContract_id_to_quaternary_textAdapter", "contract_id_to_quaternary_textAdapter$delegate", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class EventState3 extends ProtoAdapter<EventState> {

    /* renamed from: contract_id_to_colorAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_colorAdapter;

    /* renamed from: contract_id_to_event_scoresAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_event_scoresAdapter;

    /* renamed from: contract_id_to_quaternary_textAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_quaternary_textAdapter;

    /* renamed from: contract_id_to_tertiary_textAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_tertiary_textAdapter;

    /* renamed from: contract_id_to_visual_emphasisAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_visual_emphasisAdapter;

    /* renamed from: contract_id_to_visual_indicatorAdapter$delegate, reason: from kotlin metadata */
    private final Lazy contract_id_to_visual_indicatorAdapter;

    EventState3(FieldEncoding fieldEncoding, KClass<EventState> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/prediction_markets.v1.EventState", syntax, (Object) null, "prediction-markets/prediction_markets/proto/v1/public/entity.proto");
        this.contract_id_to_event_scoresAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_event_scoresAdapter_delegate$lambda$0();
            }
        });
        this.contract_id_to_visual_indicatorAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_visual_indicatorAdapter_delegate$lambda$1();
            }
        });
        this.contract_id_to_colorAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_colorAdapter_delegate$lambda$2();
            }
        });
        this.contract_id_to_visual_emphasisAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_visual_emphasisAdapter_delegate$lambda$3();
            }
        });
        this.contract_id_to_tertiary_textAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_tertiary_textAdapter_delegate$lambda$4();
            }
        });
        this.contract_id_to_quaternary_textAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventState$Companion$ADAPTER$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventState3.contract_id_to_quaternary_textAdapter_delegate$lambda$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_event_scoresAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getContract_id_to_event_scoresAdapter() {
        return (ProtoAdapter) this.contract_id_to_event_scoresAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_visual_indicatorAdapter_delegate$lambda$1() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);
    }

    private final ProtoAdapter<Map<String, Boolean>> getContract_id_to_visual_indicatorAdapter() {
        return (ProtoAdapter) this.contract_id_to_visual_indicatorAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_colorAdapter_delegate$lambda$2() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, Color.ADAPTER);
    }

    private final ProtoAdapter<Map<String, Color>> getContract_id_to_colorAdapter() {
        return (ProtoAdapter) this.contract_id_to_colorAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_visual_emphasisAdapter_delegate$lambda$3() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);
    }

    private final ProtoAdapter<Map<String, Boolean>> getContract_id_to_visual_emphasisAdapter() {
        return (ProtoAdapter) this.contract_id_to_visual_emphasisAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_tertiary_textAdapter_delegate$lambda$4() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getContract_id_to_tertiary_textAdapter() {
        return (ProtoAdapter) this.contract_id_to_tertiary_textAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter contract_id_to_quaternary_textAdapter_delegate$lambda$5() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getContract_id_to_quaternary_textAdapter() {
        return (ProtoAdapter) this.contract_id_to_quaternary_textAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(EventState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getEvent_status() != EventStatus.EVENT_STATUS_UNSPECIFIED) {
            size += EventStatus.ADAPTER.encodedSizeWithTag(1, value.getEvent_status());
        }
        if (!Intrinsics.areEqual(value.getEvent_progress(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent_progress());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getEvent_state_detailed()) + getContract_id_to_event_scoresAdapter().encodedSizeWithTag(4, value.getContract_id_to_event_scores()) + getContract_id_to_visual_indicatorAdapter().encodedSizeWithTag(5, value.getContract_id_to_visual_indicator()) + getContract_id_to_colorAdapter().encodedSizeWithTag(6, value.getContract_id_to_color());
        if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
            iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getOpen_interest());
        }
        ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, value.getGame_start()) + protoAdapter.encodedSizeWithTag(9, value.getSubtitle()) + getContract_id_to_visual_emphasisAdapter().encodedSizeWithTag(10, value.getContract_id_to_visual_emphasis());
        if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
            iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(11, value.getEvent_id());
        }
        if (value.getSupports_live_data()) {
            iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getSupports_live_data()));
        }
        if (value.getExternal_source_ts() != null) {
            iEncodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(13, value.getExternal_source_ts());
        }
        int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(14, value.getEdp_live_data_primary_label()) + protoAdapter.encodedSizeWithTag(15, value.getEdp_live_data_secondary_label());
        if (value.getGame_start_format() != GameStartFormat.GAME_START_FORMAT_UNSPECIFIED) {
            iEncodedSizeWithTag3 += GameStartFormat.ADAPTER.encodedSizeWithTag(16, value.getGame_start_format());
        }
        int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(17, value.getCategory()) + getContract_id_to_tertiary_textAdapter().encodedSizeWithTag(18, value.getContract_id_to_tertiary_text()) + getContract_id_to_quaternary_textAdapter().encodedSizeWithTag(19, value.getContract_id_to_quaternary_text());
        if (!Intrinsics.areEqual(value.getGdp_title(), "")) {
            iEncodedSizeWithTag4 += protoAdapter.encodedSizeWithTag(21, value.getGdp_title());
        }
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            iEncodedSizeWithTag4 += PageType.ADAPTER.encodedSizeWithTag(22, value.getPage_type());
        }
        int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + EventTag.ADAPTER.asRepeated().encodedSizeWithTag(23, value.getEvent_tags());
        if (!Intrinsics.areEqual(value.getTotal_volume_of_all_contracts_v2(), "")) {
            iEncodedSizeWithTag5 += protoAdapter.encodedSizeWithTag(25, value.getTotal_volume_of_all_contracts_v2());
        }
        if (value.getTotal_open_interest_of_all_contracts_v2() != 0) {
            iEncodedSizeWithTag5 += ProtoAdapter.INT64.encodedSizeWithTag(26, Long.valueOf(value.getTotal_open_interest_of_all_contracts_v2()));
        }
        return iEncodedSizeWithTag5 + protoAdapter.encodedSizeWithTag(27, value.getLast_play_description()) + protoAdapter.encodedSizeWithTag(28, value.getLast_play_header());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, EventState value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getEvent_status() != EventStatus.EVENT_STATUS_UNSPECIFIED) {
            EventStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_status());
        }
        if (!Intrinsics.areEqual(value.getEvent_progress(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_progress());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 3, (int) value.getEvent_state_detailed());
        getContract_id_to_event_scoresAdapter().encodeWithTag(writer, 4, (int) value.getContract_id_to_event_scores());
        getContract_id_to_visual_indicatorAdapter().encodeWithTag(writer, 5, (int) value.getContract_id_to_visual_indicator());
        getContract_id_to_colorAdapter().encodeWithTag(writer, 6, (int) value.getContract_id_to_color());
        if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
            protoAdapter.encodeWithTag(writer, 7, (int) value.getOpen_interest());
        }
        ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(writer, 8, (int) value.getGame_start());
        protoAdapter.encodeWithTag(writer, 9, (int) value.getSubtitle());
        getContract_id_to_visual_emphasisAdapter().encodeWithTag(writer, 10, (int) value.getContract_id_to_visual_emphasis());
        if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
            protoAdapter.encodeWithTag(writer, 11, (int) value.getEvent_id());
        }
        if (value.getSupports_live_data()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getSupports_live_data()));
        }
        if (value.getExternal_source_ts() != null) {
            protoAdapter2.encodeWithTag(writer, 13, (int) value.getExternal_source_ts());
        }
        protoAdapter.encodeWithTag(writer, 14, (int) value.getEdp_live_data_primary_label());
        protoAdapter.encodeWithTag(writer, 15, (int) value.getEdp_live_data_secondary_label());
        if (value.getGame_start_format() != GameStartFormat.GAME_START_FORMAT_UNSPECIFIED) {
            GameStartFormat.ADAPTER.encodeWithTag(writer, 16, (int) value.getGame_start_format());
        }
        protoAdapter.encodeWithTag(writer, 17, (int) value.getCategory());
        getContract_id_to_tertiary_textAdapter().encodeWithTag(writer, 18, (int) value.getContract_id_to_tertiary_text());
        getContract_id_to_quaternary_textAdapter().encodeWithTag(writer, 19, (int) value.getContract_id_to_quaternary_text());
        if (!Intrinsics.areEqual(value.getGdp_title(), "")) {
            protoAdapter.encodeWithTag(writer, 21, (int) value.getGdp_title());
        }
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            PageType.ADAPTER.encodeWithTag(writer, 22, (int) value.getPage_type());
        }
        EventTag.ADAPTER.asRepeated().encodeWithTag(writer, 23, (int) value.getEvent_tags());
        if (!Intrinsics.areEqual(value.getTotal_volume_of_all_contracts_v2(), "")) {
            protoAdapter.encodeWithTag(writer, 25, (int) value.getTotal_volume_of_all_contracts_v2());
        }
        if (value.getTotal_open_interest_of_all_contracts_v2() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 26, (int) Long.valueOf(value.getTotal_open_interest_of_all_contracts_v2()));
        }
        protoAdapter.encodeWithTag(writer, 27, (int) value.getLast_play_description());
        protoAdapter.encodeWithTag(writer, 28, (int) value.getLast_play_header());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, EventState value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 28, (int) value.getLast_play_header());
        protoAdapter.encodeWithTag(writer, 27, (int) value.getLast_play_description());
        if (value.getTotal_open_interest_of_all_contracts_v2() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 26, (int) Long.valueOf(value.getTotal_open_interest_of_all_contracts_v2()));
        }
        if (!Intrinsics.areEqual(value.getTotal_volume_of_all_contracts_v2(), "")) {
            protoAdapter.encodeWithTag(writer, 25, (int) value.getTotal_volume_of_all_contracts_v2());
        }
        EventTag.ADAPTER.asRepeated().encodeWithTag(writer, 23, (int) value.getEvent_tags());
        if (value.getPage_type() != PageType.PAGE_TYPE_UNSPECIFIED) {
            PageType.ADAPTER.encodeWithTag(writer, 22, (int) value.getPage_type());
        }
        if (!Intrinsics.areEqual(value.getGdp_title(), "")) {
            protoAdapter.encodeWithTag(writer, 21, (int) value.getGdp_title());
        }
        getContract_id_to_quaternary_textAdapter().encodeWithTag(writer, 19, (int) value.getContract_id_to_quaternary_text());
        getContract_id_to_tertiary_textAdapter().encodeWithTag(writer, 18, (int) value.getContract_id_to_tertiary_text());
        protoAdapter.encodeWithTag(writer, 17, (int) value.getCategory());
        if (value.getGame_start_format() != GameStartFormat.GAME_START_FORMAT_UNSPECIFIED) {
            GameStartFormat.ADAPTER.encodeWithTag(writer, 16, (int) value.getGame_start_format());
        }
        protoAdapter.encodeWithTag(writer, 15, (int) value.getEdp_live_data_secondary_label());
        protoAdapter.encodeWithTag(writer, 14, (int) value.getEdp_live_data_primary_label());
        if (value.getExternal_source_ts() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getExternal_source_ts());
        }
        if (value.getSupports_live_data()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getSupports_live_data()));
        }
        if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
            protoAdapter.encodeWithTag(writer, 11, (int) value.getEvent_id());
        }
        getContract_id_to_visual_emphasisAdapter().encodeWithTag(writer, 10, (int) value.getContract_id_to_visual_emphasis());
        protoAdapter.encodeWithTag(writer, 9, (int) value.getSubtitle());
        ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getGame_start());
        if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
            protoAdapter.encodeWithTag(writer, 7, (int) value.getOpen_interest());
        }
        getContract_id_to_colorAdapter().encodeWithTag(writer, 6, (int) value.getContract_id_to_color());
        getContract_id_to_visual_indicatorAdapter().encodeWithTag(writer, 5, (int) value.getContract_id_to_visual_indicator());
        getContract_id_to_event_scoresAdapter().encodeWithTag(writer, 4, (int) value.getContract_id_to_event_scores());
        protoAdapter.encodeWithTag(writer, 3, (int) value.getEvent_state_detailed());
        if (!Intrinsics.areEqual(value.getEvent_progress(), "")) {
            protoAdapter.encodeWithTag(writer, 2, (int) value.getEvent_progress());
        }
        if (value.getEvent_status() != EventStatus.EVENT_STATUS_UNSPECIFIED) {
            EventStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_status());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public EventState decode(ProtoReader reader) throws IOException {
        GameStartFormat gameStartFormat;
        ArrayList arrayList;
        PageType pageType;
        Intrinsics.checkNotNullParameter(reader, "reader");
        EventStatus eventStatus = EventStatus.EVENT_STATUS_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        GameStartFormat gameStartFormat2 = GameStartFormat.GAME_START_FORMAT_UNSPECIFIED;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        PageType pageType2 = PageType.PAGE_TYPE_UNSPECIFIED;
        ArrayList arrayList2 = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        EventStatus eventStatusDecode = eventStatus;
        String strDecode = "";
        String strDecode2 = null;
        Instant instantDecode = null;
        String strDecode3 = null;
        Instant instantDecode2 = null;
        String strDecode4 = null;
        String strDecode5 = null;
        String strDecode6 = null;
        String strDecode7 = null;
        String strDecode8 = null;
        boolean zBooleanValue = false;
        long jLongValue = 0;
        PageType pageTypeDecode = pageType2;
        String strDecode9 = strDecode;
        String strDecode10 = strDecode9;
        String strDecode11 = strDecode10;
        String strDecode12 = strDecode11;
        GameStartFormat gameStartFormatDecode = gameStartFormat2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new EventState(eventStatusDecode, strDecode9, strDecode2, linkedHashMap, linkedHashMap2, linkedHashMap3, strDecode10, instantDecode, strDecode3, linkedHashMap4, strDecode11, zBooleanValue, instantDecode2, strDecode4, strDecode5, gameStartFormatDecode, strDecode6, linkedHashMap5, linkedHashMap6, strDecode12, pageTypeDecode, arrayList2, strDecode, jLongValue, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    try {
                        eventStatusDecode = EventStatus.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 2:
                    arrayList = arrayList2;
                    strDecode9 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    arrayList = arrayList2;
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap.putAll(getContract_id_to_event_scoresAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 5:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap2.putAll(getContract_id_to_visual_indicatorAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 6:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap3.putAll(getContract_id_to_colorAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 7:
                    arrayList = arrayList2;
                    strDecode10 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 8:
                    arrayList = arrayList2;
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    break;
                case 9:
                    arrayList = arrayList2;
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 10:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap4.putAll(getContract_id_to_visual_emphasisAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 11:
                    arrayList = arrayList2;
                    strDecode11 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 12:
                    arrayList = arrayList2;
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 13:
                    arrayList = arrayList2;
                    instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    break;
                case 14:
                    arrayList = arrayList2;
                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 15:
                    arrayList = arrayList2;
                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 16:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    try {
                        gameStartFormatDecode = GameStartFormat.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    pageTypeDecode = pageType;
                    break;
                case 17:
                    arrayList = arrayList2;
                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 18:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap5.putAll(getContract_id_to_tertiary_textAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 19:
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    linkedHashMap6.putAll(getContract_id_to_quaternary_textAdapter().decode(reader));
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 20:
                case 24:
                default:
                    reader.readUnknownField(iNextTag);
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 21:
                    arrayList = arrayList2;
                    strDecode12 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 22:
                    try {
                        pageTypeDecode = PageType.ADAPTER.decode(reader);
                        arrayList = arrayList2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        gameStartFormat = gameStartFormatDecode;
                        arrayList = arrayList2;
                        pageType = pageTypeDecode;
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 23:
                    arrayList2.add(EventTag.ADAPTER.decode(reader));
                    gameStartFormat = gameStartFormatDecode;
                    arrayList = arrayList2;
                    pageType = pageTypeDecode;
                    gameStartFormatDecode = gameStartFormat;
                    pageTypeDecode = pageType;
                    break;
                case 25:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    arrayList = arrayList2;
                    break;
                case 26:
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    arrayList = arrayList2;
                    break;
                case 27:
                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                    arrayList = arrayList2;
                    break;
                case 28:
                    strDecode8 = ProtoAdapter.STRING.decode(reader);
                    arrayList = arrayList2;
                    break;
            }
            arrayList2 = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public EventState redact(EventState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Map mapM26824redactElements = Internal.m26824redactElements(value.getContract_id_to_color(), Color.ADAPTER);
        Instant game_start = value.getGame_start();
        Instant instantRedact = game_start != null ? ProtoAdapter.INSTANT.redact(game_start) : null;
        Instant external_source_ts = value.getExternal_source_ts();
        return EventState.copy$default(value, null, null, null, null, null, mapM26824redactElements, null, instantRedact, null, null, null, false, external_source_ts != null ? ProtoAdapter.INSTANT.redact(external_source_ts) : null, null, null, null, null, null, null, null, null, Internal.m26823redactElements(value.getEvent_tags(), EventTag.ADAPTER), null, 0L, null, null, ByteString.EMPTY, 65007455, null);
    }
}
