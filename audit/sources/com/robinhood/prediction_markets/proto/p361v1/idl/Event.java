package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
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

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB·\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\u0012\b\b\u0002\u0010'\u001a\u00020(¢\u0006\u0004\b)\u0010*J\b\u0010L\u001a\u00020\u0002H\u0017J\u0013\u0010M\u001a\u00020\u001f2\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\b\u0010P\u001a\u00020\tH\u0016J\b\u0010Q\u001a\u00020\u0004H\u0016J¶\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\b\b\u0002\u0010'\u001a\u00020(R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010<R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010CR\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010J\u001a\u0004\bK\u0010C¨\u0006T"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/Event;", "Lcom/squareup/wire/Message;", "", "id", "", "name", "long_description", "event_contracts", "", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "view_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode;", "banner_text", "attestation_values", "", "state", "Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState;", "tick_size", "description", "timeline", "Lcom/robinhood/prediction_markets/proto/v1/idl/Timeline;", "prohibition_rules", "page_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;", "game_contract_groups", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroup;", "url_slugs", RhGcmListenerService.EXTRA_CATEGORY, "prepack_contract_group", "supports_combos", "", "is_live", "props_contract_group_sections_v2", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSection;", "event_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventType;", "parent_event_id", "props_contract_group_sections", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/Timeline;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/EventType;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "getLong_description", "getView_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode;", "getBanner_text", "getState", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventState;", "getTick_size", "getDescription", "getTimeline", "()Lcom/robinhood/prediction_markets/proto/v1/idl/Timeline;", "getPage_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;", "getCategory", "getSupports_combos", "()Z", "getEvent_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventType;", "getParent_event_id", "getEvent_contracts", "()Ljava/util/Map;", "getAttestation_values", "()Ljava/util/List;", "getProhibition_rules", "getGame_contract_groups", "getUrl_slugs", "getPrepack_contract_group", "getProps_contract_group_sections_v2", "getProps_contract_group_sections$annotations", "()V", "getProps_contract_group_sections", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Event extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "attestationValues", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 8)
    private final List<String> attestation_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 5, tag = 7)
    private final String banner_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final String description;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventContract#ADAPTER", jsonName = "eventContracts", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    private final Map<Integer, EventContract> event_contracts;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventType#ADAPTER", jsonName = "eventType", schemaIndex = 20, tag = 23)
    private final EventType event_type;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractGroup#ADAPTER", jsonName = "gameContractGroups", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 15)
    private final List<ContractGroup> game_contract_groups;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLive", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 21)
    private final boolean is_live;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "longDescription", schemaIndex = 2, tag = 3)
    private final String long_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.PageType#ADAPTER", jsonName = "pageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final PageType page_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parentEventId", schemaIndex = 21, tag = 24)
    private final String parent_event_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractGroup#ADAPTER", jsonName = "prepackContractGroup", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 18)
    private final List<ContractGroup> prepack_contract_group;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "prohibitionRules", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 13)
    private final List<String> prohibition_rules;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSection#ADAPTER", jsonName = "propsContractGroupSections", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 19)
    private final List<ContractGroupSection> props_contract_group_sections;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSection#ADAPTER", jsonName = "propsContractGroupSectionsV2", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 22)
    private final List<ContractGroupSection> props_contract_group_sections_v2;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ArsenalEventState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final ArsenalEventState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsCombos", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 20)
    private final boolean supports_combos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final String tick_size;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.Timeline#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final Timeline timeline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlSlugs", label = WireField.Label.REPEATED, schemaIndex = 14, tag = 16)
    private final List<String> url_slugs;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventViewMode#ADAPTER", jsonName = "viewMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final EventViewMode view_mode;

    @JvmField
    public static final ProtoAdapter<Event> ADAPTER = new Event$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Event.class), Syntax.PROTO_3);

    public Event() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 16777215, null);
    }

    @Deprecated
    public static /* synthetic */ void getProps_contract_group_sections$annotations() {
    }

    public /* synthetic */ Event(String str, String str2, String str3, Map map, EventViewMode eventViewMode, String str4, List list, ArsenalEventState arsenalEventState, String str5, String str6, Timeline timeline, List list2, PageType pageType, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventType eventType, String str8, List list7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED : eventViewMode, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ArsenalEventState.ARSENAL_EVENT_STATE_UNSPECIFIED : arsenalEventState, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? null : timeline, (i & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i & 4096) != 0 ? PageType.PAGE_TYPE_UNSPECIFIED : pageType, (i & 8192) != 0 ? CollectionsKt.emptyList() : list3, (i & 16384) != 0 ? CollectionsKt.emptyList() : list4, (i & 32768) == 0 ? str7 : "", (i & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i & 131072) != 0 ? false : z, (i & 262144) == 0 ? z2 : false, (i & 524288) != 0 ? CollectionsKt.emptyList() : list6, (i & 1048576) != 0 ? null : eventType, (i & 2097152) != 0 ? null : str8, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list7, (i & 8388608) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23780newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getLong_description() {
        return this.long_description;
    }

    public final EventViewMode getView_mode() {
        return this.view_mode;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final ArsenalEventState getState() {
        return this.state;
    }

    public final String getTick_size() {
        return this.tick_size;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final PageType getPage_type() {
        return this.page_type;
    }

    public final String getCategory() {
        return this.category;
    }

    public final boolean getSupports_combos() {
        return this.supports_combos;
    }

    /* renamed from: is_live, reason: from getter */
    public final boolean getIs_live() {
        return this.is_live;
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    public final String getParent_event_id() {
        return this.parent_event_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Event(String id, String name, String str, Map<Integer, EventContract> event_contracts, EventViewMode view_mode, String str2, List<String> attestation_values, ArsenalEventState state, String tick_size, String description, Timeline timeline, List<String> prohibition_rules, PageType page_type, List<ContractGroup> game_contract_groups, List<String> url_slugs, String category, List<ContractGroup> prepack_contract_group, boolean z, boolean z2, List<ContractGroupSection> props_contract_group_sections_v2, EventType eventType, String str3, List<ContractGroupSection> props_contract_group_sections, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
        Intrinsics.checkNotNullParameter(view_mode, "view_mode");
        Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(game_contract_groups, "game_contract_groups");
        Intrinsics.checkNotNullParameter(url_slugs, "url_slugs");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(prepack_contract_group, "prepack_contract_group");
        Intrinsics.checkNotNullParameter(props_contract_group_sections_v2, "props_contract_group_sections_v2");
        Intrinsics.checkNotNullParameter(props_contract_group_sections, "props_contract_group_sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.long_description = str;
        this.view_mode = view_mode;
        this.banner_text = str2;
        this.state = state;
        this.tick_size = tick_size;
        this.description = description;
        this.timeline = timeline;
        this.page_type = page_type;
        this.category = category;
        this.supports_combos = z;
        this.is_live = z2;
        this.event_type = eventType;
        this.parent_event_id = str3;
        this.event_contracts = Internal.immutableCopyOf("event_contracts", event_contracts);
        this.attestation_values = Internal.immutableCopyOf("attestation_values", attestation_values);
        this.prohibition_rules = Internal.immutableCopyOf("prohibition_rules", prohibition_rules);
        this.game_contract_groups = Internal.immutableCopyOf("game_contract_groups", game_contract_groups);
        this.url_slugs = Internal.immutableCopyOf("url_slugs", url_slugs);
        this.prepack_contract_group = Internal.immutableCopyOf("prepack_contract_group", prepack_contract_group);
        this.props_contract_group_sections_v2 = Internal.immutableCopyOf("props_contract_group_sections_v2", props_contract_group_sections_v2);
        this.props_contract_group_sections = Internal.immutableCopyOf("props_contract_group_sections", props_contract_group_sections);
    }

    public final Map<Integer, EventContract> getEvent_contracts() {
        return this.event_contracts;
    }

    public final List<String> getAttestation_values() {
        return this.attestation_values;
    }

    public final List<String> getProhibition_rules() {
        return this.prohibition_rules;
    }

    public final List<ContractGroup> getGame_contract_groups() {
        return this.game_contract_groups;
    }

    public final List<String> getUrl_slugs() {
        return this.url_slugs;
    }

    public final List<ContractGroup> getPrepack_contract_group() {
        return this.prepack_contract_group;
    }

    public final List<ContractGroupSection> getProps_contract_group_sections_v2() {
        return this.props_contract_group_sections_v2;
    }

    public final List<ContractGroupSection> getProps_contract_group_sections() {
        return this.props_contract_group_sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23780newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(unknownFields(), event.unknownFields()) && Intrinsics.areEqual(this.id, event.id) && Intrinsics.areEqual(this.name, event.name) && Intrinsics.areEqual(this.long_description, event.long_description) && Intrinsics.areEqual(this.event_contracts, event.event_contracts) && this.view_mode == event.view_mode && Intrinsics.areEqual(this.banner_text, event.banner_text) && Intrinsics.areEqual(this.attestation_values, event.attestation_values) && this.state == event.state && Intrinsics.areEqual(this.tick_size, event.tick_size) && Intrinsics.areEqual(this.description, event.description) && Intrinsics.areEqual(this.timeline, event.timeline) && Intrinsics.areEqual(this.prohibition_rules, event.prohibition_rules) && this.page_type == event.page_type && Intrinsics.areEqual(this.game_contract_groups, event.game_contract_groups) && Intrinsics.areEqual(this.url_slugs, event.url_slugs) && Intrinsics.areEqual(this.category, event.category) && Intrinsics.areEqual(this.prepack_contract_group, event.prepack_contract_group) && this.supports_combos == event.supports_combos && this.is_live == event.is_live && Intrinsics.areEqual(this.props_contract_group_sections_v2, event.props_contract_group_sections_v2) && this.event_type == event.event_type && Intrinsics.areEqual(this.parent_event_id, event.parent_event_id) && Intrinsics.areEqual(this.props_contract_group_sections, event.props_contract_group_sections);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37;
        String str = this.long_description;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.event_contracts.hashCode()) * 37) + this.view_mode.hashCode()) * 37;
        String str2 = this.banner_text;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.attestation_values.hashCode()) * 37) + this.state.hashCode()) * 37) + this.tick_size.hashCode()) * 37) + this.description.hashCode()) * 37;
        Timeline timeline = this.timeline;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (timeline != null ? timeline.hashCode() : 0)) * 37) + this.prohibition_rules.hashCode()) * 37) + this.page_type.hashCode()) * 37) + this.game_contract_groups.hashCode()) * 37) + this.url_slugs.hashCode()) * 37) + this.category.hashCode()) * 37) + this.prepack_contract_group.hashCode()) * 37) + Boolean.hashCode(this.supports_combos)) * 37) + Boolean.hashCode(this.is_live)) * 37) + this.props_contract_group_sections_v2.hashCode()) * 37;
        EventType eventType = this.event_type;
        int iHashCode5 = (iHashCode4 + (eventType != null ? eventType.hashCode() : 0)) * 37;
        String str3 = this.parent_event_id;
        int iHashCode6 = ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.props_contract_group_sections.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        String str = this.long_description;
        if (str != null) {
            arrayList.add("long_description=" + Internal.sanitize(str));
        }
        if (!this.event_contracts.isEmpty()) {
            arrayList.add("event_contracts=" + this.event_contracts);
        }
        arrayList.add("view_mode=" + this.view_mode);
        String str2 = this.banner_text;
        if (str2 != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str2));
        }
        if (!this.attestation_values.isEmpty()) {
            arrayList.add("attestation_values=" + Internal.sanitize(this.attestation_values));
        }
        arrayList.add("state=" + this.state);
        arrayList.add("tick_size=" + Internal.sanitize(this.tick_size));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        if (!this.prohibition_rules.isEmpty()) {
            arrayList.add("prohibition_rules=" + Internal.sanitize(this.prohibition_rules));
        }
        arrayList.add("page_type=" + this.page_type);
        if (!this.game_contract_groups.isEmpty()) {
            arrayList.add("game_contract_groups=" + this.game_contract_groups);
        }
        if (!this.url_slugs.isEmpty()) {
            arrayList.add("url_slugs=" + Internal.sanitize(this.url_slugs));
        }
        arrayList.add("category=" + Internal.sanitize(this.category));
        if (!this.prepack_contract_group.isEmpty()) {
            arrayList.add("prepack_contract_group=" + this.prepack_contract_group);
        }
        arrayList.add("supports_combos=" + this.supports_combos);
        arrayList.add("is_live=" + this.is_live);
        if (!this.props_contract_group_sections_v2.isEmpty()) {
            arrayList.add("props_contract_group_sections_v2=" + this.props_contract_group_sections_v2);
        }
        EventType eventType = this.event_type;
        if (eventType != null) {
            arrayList.add("event_type=" + eventType);
        }
        String str3 = this.parent_event_id;
        if (str3 != null) {
            arrayList.add("parent_event_id=" + Internal.sanitize(str3));
        }
        if (!this.props_contract_group_sections.isEmpty()) {
            arrayList.add("props_contract_group_sections=" + this.props_contract_group_sections);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Event{", "}", 0, null, null, 56, null);
    }

    public final Event copy(String id, String name, String long_description, Map<Integer, EventContract> event_contracts, EventViewMode view_mode, String banner_text, List<String> attestation_values, ArsenalEventState state, String tick_size, String description, Timeline timeline, List<String> prohibition_rules, PageType page_type, List<ContractGroup> game_contract_groups, List<String> url_slugs, String category, List<ContractGroup> prepack_contract_group, boolean supports_combos, boolean is_live, List<ContractGroupSection> props_contract_group_sections_v2, EventType event_type, String parent_event_id, List<ContractGroupSection> props_contract_group_sections, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
        Intrinsics.checkNotNullParameter(view_mode, "view_mode");
        Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(game_contract_groups, "game_contract_groups");
        Intrinsics.checkNotNullParameter(url_slugs, "url_slugs");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(prepack_contract_group, "prepack_contract_group");
        Intrinsics.checkNotNullParameter(props_contract_group_sections_v2, "props_contract_group_sections_v2");
        Intrinsics.checkNotNullParameter(props_contract_group_sections, "props_contract_group_sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Event(id, name, long_description, event_contracts, view_mode, banner_text, attestation_values, state, tick_size, description, timeline, prohibition_rules, page_type, game_contract_groups, url_slugs, category, prepack_contract_group, supports_combos, is_live, props_contract_group_sections_v2, event_type, parent_event_id, props_contract_group_sections, unknownFields);
    }
}
