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
import p479j$.time.Instant;

/* compiled from: EventState.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b3\u0018\u0000 e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001eB\u0081\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0017¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00107J\u0087\u0003\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\n2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u001f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b?\u00107R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u00107R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bD\u00107R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\bE\u00107R\u001a\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010HR\"\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bI\u0010CR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\bJ\u00107R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\bK\u00107R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010=\u001a\u0004\bO\u00107R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010=\u001a\u0004\bP\u00107R\u001a\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010=\u001a\u0004\bT\u00107R\u001a\u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\bX\u00107R\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010=\u001a\u0004\bY\u00107R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b[\u0010\\R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b]\u0010\\R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010Z\u001a\u0004\b^\u0010\\R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\b_\u0010\\R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\b`\u0010\\R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\ba\u0010\\R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010b\u001a\u0004\bc\u0010d¨\u0006f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;", "event_status", "", "event_progress", "event_state_detailed", "", "contract_id_to_event_scores", "", "contract_id_to_visual_indicator", "Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "contract_id_to_color", "open_interest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "game_start", "subtitle", "contract_id_to_visual_emphasis", "event_id", "supports_live_data", "external_source_ts", "edp_live_data_primary_label", "edp_live_data_secondary_label", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormat;", "game_start_format", RhGcmListenerService.EXTRA_CATEGORY, "contract_id_to_tertiary_text", "contract_id_to_quaternary_text", "gdp_title", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;", "page_type", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventTag;", "event_tags", "total_volume_of_all_contracts_v2", "", "total_open_interest_of_all_contracts_v2", "last_play_description", "last_play_header", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormat;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormat;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;", "getEvent_status", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;", "Ljava/lang/String;", "getEvent_progress", "getEvent_state_detailed", "getOpen_interest", "Lj$/time/Instant;", "getGame_start", "()Lj$/time/Instant;", "getSubtitle", "getEvent_id", "Z", "getSupports_live_data", "()Z", "getExternal_source_ts", "getEdp_live_data_primary_label", "getEdp_live_data_secondary_label", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormat;", "getGame_start_format", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormat;", "getCategory", "getGdp_title", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;", "getPage_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageType;", "getTotal_volume_of_all_contracts_v2", "J", "getTotal_open_interest_of_all_contracts_v2", "()J", "getLast_play_description", "getLast_play_header", "Ljava/util/Map;", "getContract_id_to_event_scores", "()Ljava/util/Map;", "getContract_id_to_visual_indicator", "getContract_id_to_color", "getContract_id_to_visual_emphasis", "getContract_id_to_tertiary_text", "getContract_id_to_quaternary_text", "Ljava/util/List;", "getEvent_tags", "()Ljava/util/List;", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventState extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 17)
    private final String category;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.Color#ADAPTER", jsonName = "contractIdToColor", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final Map<String, Color> contract_id_to_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIdToEventScores", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final Map<String, String> contract_id_to_event_scores;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIdToQuaternaryText", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 19)
    private final Map<String, String> contract_id_to_quaternary_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIdToTertiaryText", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 17, tag = 18)
    private final Map<String, String> contract_id_to_tertiary_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "contractIdToVisualEmphasis", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final Map<String, Boolean> contract_id_to_visual_emphasis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "contractIdToVisualIndicator", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final Map<String, Boolean> contract_id_to_visual_indicator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "edpLiveDataPrimaryLabel", schemaIndex = 13, tag = 14)
    private final String edp_live_data_primary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "edpLiveDataSecondaryLabel", schemaIndex = 14, tag = 15)
    private final String edp_live_data_secondary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventProgress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_progress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventStateDetailed", schemaIndex = 2, tag = 3)
    private final String event_state_detailed;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventStatus#ADAPTER", jsonName = "eventStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventStatus event_status;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventTag#ADAPTER", jsonName = "eventTags", label = WireField.Label.REPEATED, schemaIndex = 21, tag = 23)
    private final List<EventTag> event_tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "externalSourceTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant external_source_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "gameStart", schemaIndex = 7, tag = 8)
    private final Instant game_start;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.GameStartFormat#ADAPTER", jsonName = "gameStartFormat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final GameStartFormat game_start_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gdpTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String gdp_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastPlayDescription", schemaIndex = 24, tag = 27)
    private final String last_play_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastPlayHeader", schemaIndex = 25, tag = 28)
    private final String last_play_header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openInterest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String open_interest;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.PageType#ADAPTER", jsonName = "pageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final PageType page_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsLiveData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final boolean supports_live_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "totalOpenInterestOfAllContractsV2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 26)
    private final long total_open_interest_of_all_contracts_v2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalVolumeOfAllContractsV2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 25)
    private final String total_volume_of_all_contracts_v2;

    @JvmField
    public static final ProtoAdapter<EventState> ADAPTER = new EventState3(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(EventState.class), Syntax.PROTO_3);

    public EventState() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 134217727, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23787newBuilder();
    }

    public final EventStatus getEvent_status() {
        return this.event_status;
    }

    public /* synthetic */ EventState(EventStatus eventStatus, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormat gameStartFormat, String str8, Map map5, Map map6, String str9, PageType pageType, List list, String str10, long j, String str11, String str12, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventStatus.EVENT_STATUS_UNSPECIFIED : eventStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? MapsKt.emptyMap() : map3, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? MapsKt.emptyMap() : map4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? GameStartFormat.GAME_START_FORMAT_UNSPECIFIED : gameStartFormat, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? MapsKt.emptyMap() : map5, (i & 262144) != 0 ? MapsKt.emptyMap() : map6, (i & 524288) != 0 ? "" : str9, (i & 1048576) != 0 ? PageType.PAGE_TYPE_UNSPECIFIED : pageType, (i & 2097152) != 0 ? CollectionsKt.emptyList() : list, (i & 4194304) == 0 ? str10 : "", (i & 8388608) != 0 ? 0L : j, (i & 16777216) != 0 ? null : str11, (i & 33554432) != 0 ? null : str12, (i & 67108864) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getEvent_progress() {
        return this.event_progress;
    }

    public final String getEvent_state_detailed() {
        return this.event_state_detailed;
    }

    public final String getOpen_interest() {
        return this.open_interest;
    }

    public final Instant getGame_start() {
        return this.game_start;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final boolean getSupports_live_data() {
        return this.supports_live_data;
    }

    public final Instant getExternal_source_ts() {
        return this.external_source_ts;
    }

    public final String getEdp_live_data_primary_label() {
        return this.edp_live_data_primary_label;
    }

    public final String getEdp_live_data_secondary_label() {
        return this.edp_live_data_secondary_label;
    }

    public final GameStartFormat getGame_start_format() {
        return this.game_start_format;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getGdp_title() {
        return this.gdp_title;
    }

    public final PageType getPage_type() {
        return this.page_type;
    }

    public final String getTotal_volume_of_all_contracts_v2() {
        return this.total_volume_of_all_contracts_v2;
    }

    public final long getTotal_open_interest_of_all_contracts_v2() {
        return this.total_open_interest_of_all_contracts_v2;
    }

    public final String getLast_play_description() {
        return this.last_play_description;
    }

    public final String getLast_play_header() {
        return this.last_play_header;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventState(EventStatus event_status, String event_progress, String str, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, Color> contract_id_to_color, String open_interest, Instant instant, String str2, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean z, Instant instant2, String str3, String str4, GameStartFormat game_start_format, String str5, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageType page_type, List<EventTag> event_tags, String total_volume_of_all_contracts_v2, long j, String str6, String str7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(event_progress, "event_progress");
        Intrinsics.checkNotNullParameter(contract_id_to_event_scores, "contract_id_to_event_scores");
        Intrinsics.checkNotNullParameter(contract_id_to_visual_indicator, "contract_id_to_visual_indicator");
        Intrinsics.checkNotNullParameter(contract_id_to_color, "contract_id_to_color");
        Intrinsics.checkNotNullParameter(open_interest, "open_interest");
        Intrinsics.checkNotNullParameter(contract_id_to_visual_emphasis, "contract_id_to_visual_emphasis");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(game_start_format, "game_start_format");
        Intrinsics.checkNotNullParameter(contract_id_to_tertiary_text, "contract_id_to_tertiary_text");
        Intrinsics.checkNotNullParameter(contract_id_to_quaternary_text, "contract_id_to_quaternary_text");
        Intrinsics.checkNotNullParameter(gdp_title, "gdp_title");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(event_tags, "event_tags");
        Intrinsics.checkNotNullParameter(total_volume_of_all_contracts_v2, "total_volume_of_all_contracts_v2");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_status = event_status;
        this.event_progress = event_progress;
        this.event_state_detailed = str;
        this.open_interest = open_interest;
        this.game_start = instant;
        this.subtitle = str2;
        this.event_id = event_id;
        this.supports_live_data = z;
        this.external_source_ts = instant2;
        this.edp_live_data_primary_label = str3;
        this.edp_live_data_secondary_label = str4;
        this.game_start_format = game_start_format;
        this.category = str5;
        this.gdp_title = gdp_title;
        this.page_type = page_type;
        this.total_volume_of_all_contracts_v2 = total_volume_of_all_contracts_v2;
        this.total_open_interest_of_all_contracts_v2 = j;
        this.last_play_description = str6;
        this.last_play_header = str7;
        this.contract_id_to_event_scores = Internal.immutableCopyOf("contract_id_to_event_scores", contract_id_to_event_scores);
        this.contract_id_to_visual_indicator = Internal.immutableCopyOf("contract_id_to_visual_indicator", contract_id_to_visual_indicator);
        this.contract_id_to_color = Internal.immutableCopyOf("contract_id_to_color", contract_id_to_color);
        this.contract_id_to_visual_emphasis = Internal.immutableCopyOf("contract_id_to_visual_emphasis", contract_id_to_visual_emphasis);
        this.contract_id_to_tertiary_text = Internal.immutableCopyOf("contract_id_to_tertiary_text", contract_id_to_tertiary_text);
        this.contract_id_to_quaternary_text = Internal.immutableCopyOf("contract_id_to_quaternary_text", contract_id_to_quaternary_text);
        this.event_tags = Internal.immutableCopyOf("event_tags", event_tags);
    }

    public final Map<String, String> getContract_id_to_event_scores() {
        return this.contract_id_to_event_scores;
    }

    public final Map<String, Boolean> getContract_id_to_visual_indicator() {
        return this.contract_id_to_visual_indicator;
    }

    public final Map<String, Color> getContract_id_to_color() {
        return this.contract_id_to_color;
    }

    public final Map<String, Boolean> getContract_id_to_visual_emphasis() {
        return this.contract_id_to_visual_emphasis;
    }

    public final Map<String, String> getContract_id_to_tertiary_text() {
        return this.contract_id_to_tertiary_text;
    }

    public final Map<String, String> getContract_id_to_quaternary_text() {
        return this.contract_id_to_quaternary_text;
    }

    public final List<EventTag> getEvent_tags() {
        return this.event_tags;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23787newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventState)) {
            return false;
        }
        EventState eventState = (EventState) other;
        return Intrinsics.areEqual(unknownFields(), eventState.unknownFields()) && this.event_status == eventState.event_status && Intrinsics.areEqual(this.event_progress, eventState.event_progress) && Intrinsics.areEqual(this.event_state_detailed, eventState.event_state_detailed) && Intrinsics.areEqual(this.contract_id_to_event_scores, eventState.contract_id_to_event_scores) && Intrinsics.areEqual(this.contract_id_to_visual_indicator, eventState.contract_id_to_visual_indicator) && Intrinsics.areEqual(this.contract_id_to_color, eventState.contract_id_to_color) && Intrinsics.areEqual(this.open_interest, eventState.open_interest) && Intrinsics.areEqual(this.game_start, eventState.game_start) && Intrinsics.areEqual(this.subtitle, eventState.subtitle) && Intrinsics.areEqual(this.contract_id_to_visual_emphasis, eventState.contract_id_to_visual_emphasis) && Intrinsics.areEqual(this.event_id, eventState.event_id) && this.supports_live_data == eventState.supports_live_data && Intrinsics.areEqual(this.external_source_ts, eventState.external_source_ts) && Intrinsics.areEqual(this.edp_live_data_primary_label, eventState.edp_live_data_primary_label) && Intrinsics.areEqual(this.edp_live_data_secondary_label, eventState.edp_live_data_secondary_label) && this.game_start_format == eventState.game_start_format && Intrinsics.areEqual(this.category, eventState.category) && Intrinsics.areEqual(this.contract_id_to_tertiary_text, eventState.contract_id_to_tertiary_text) && Intrinsics.areEqual(this.contract_id_to_quaternary_text, eventState.contract_id_to_quaternary_text) && Intrinsics.areEqual(this.gdp_title, eventState.gdp_title) && this.page_type == eventState.page_type && Intrinsics.areEqual(this.event_tags, eventState.event_tags) && Intrinsics.areEqual(this.total_volume_of_all_contracts_v2, eventState.total_volume_of_all_contracts_v2) && this.total_open_interest_of_all_contracts_v2 == eventState.total_open_interest_of_all_contracts_v2 && Intrinsics.areEqual(this.last_play_description, eventState.last_play_description) && Intrinsics.areEqual(this.last_play_header, eventState.last_play_header);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.event_status.hashCode()) * 37) + this.event_progress.hashCode()) * 37;
        String str = this.event_state_detailed;
        int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.contract_id_to_event_scores.hashCode()) * 37) + this.contract_id_to_visual_indicator.hashCode()) * 37) + this.contract_id_to_color.hashCode()) * 37) + this.open_interest.hashCode()) * 37;
        Instant instant = this.game_start;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int iHashCode4 = (((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.contract_id_to_visual_emphasis.hashCode()) * 37) + this.event_id.hashCode()) * 37) + Boolean.hashCode(this.supports_live_data)) * 37;
        Instant instant2 = this.external_source_ts;
        int iHashCode5 = (iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        String str3 = this.edp_live_data_primary_label;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.edp_live_data_secondary_label;
        int iHashCode7 = (((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.game_start_format.hashCode()) * 37;
        String str5 = this.category;
        int iHashCode8 = (((((((((((((((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37) + this.contract_id_to_tertiary_text.hashCode()) * 37) + this.contract_id_to_quaternary_text.hashCode()) * 37) + this.gdp_title.hashCode()) * 37) + this.page_type.hashCode()) * 37) + this.event_tags.hashCode()) * 37) + this.total_volume_of_all_contracts_v2.hashCode()) * 37) + Long.hashCode(this.total_open_interest_of_all_contracts_v2)) * 37;
        String str6 = this.last_play_description;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.last_play_header;
        int iHashCode10 = iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_status=" + this.event_status);
        arrayList.add("event_progress=" + Internal.sanitize(this.event_progress));
        String str = this.event_state_detailed;
        if (str != null) {
            arrayList.add("event_state_detailed=" + Internal.sanitize(str));
        }
        if (!this.contract_id_to_event_scores.isEmpty()) {
            arrayList.add("contract_id_to_event_scores=" + this.contract_id_to_event_scores);
        }
        if (!this.contract_id_to_visual_indicator.isEmpty()) {
            arrayList.add("contract_id_to_visual_indicator=" + this.contract_id_to_visual_indicator);
        }
        if (!this.contract_id_to_color.isEmpty()) {
            arrayList.add("contract_id_to_color=" + this.contract_id_to_color);
        }
        arrayList.add("open_interest=" + Internal.sanitize(this.open_interest));
        Instant instant = this.game_start;
        if (instant != null) {
            arrayList.add("game_start=" + instant);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str2));
        }
        if (!this.contract_id_to_visual_emphasis.isEmpty()) {
            arrayList.add("contract_id_to_visual_emphasis=" + this.contract_id_to_visual_emphasis);
        }
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        arrayList.add("supports_live_data=" + this.supports_live_data);
        Instant instant2 = this.external_source_ts;
        if (instant2 != null) {
            arrayList.add("external_source_ts=" + instant2);
        }
        String str3 = this.edp_live_data_primary_label;
        if (str3 != null) {
            arrayList.add("edp_live_data_primary_label=" + Internal.sanitize(str3));
        }
        String str4 = this.edp_live_data_secondary_label;
        if (str4 != null) {
            arrayList.add("edp_live_data_secondary_label=" + Internal.sanitize(str4));
        }
        arrayList.add("game_start_format=" + this.game_start_format);
        String str5 = this.category;
        if (str5 != null) {
            arrayList.add("category=" + Internal.sanitize(str5));
        }
        if (!this.contract_id_to_tertiary_text.isEmpty()) {
            arrayList.add("contract_id_to_tertiary_text=" + this.contract_id_to_tertiary_text);
        }
        if (!this.contract_id_to_quaternary_text.isEmpty()) {
            arrayList.add("contract_id_to_quaternary_text=" + this.contract_id_to_quaternary_text);
        }
        arrayList.add("gdp_title=" + Internal.sanitize(this.gdp_title));
        arrayList.add("page_type=" + this.page_type);
        if (!this.event_tags.isEmpty()) {
            arrayList.add("event_tags=" + this.event_tags);
        }
        arrayList.add("total_volume_of_all_contracts_v2=" + Internal.sanitize(this.total_volume_of_all_contracts_v2));
        arrayList.add("total_open_interest_of_all_contracts_v2=" + this.total_open_interest_of_all_contracts_v2);
        String str6 = this.last_play_description;
        if (str6 != null) {
            arrayList.add("last_play_description=" + Internal.sanitize(str6));
        }
        String str7 = this.last_play_header;
        if (str7 != null) {
            arrayList.add("last_play_header=" + Internal.sanitize(str7));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventState{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventState copy$default(EventState eventState, EventStatus eventStatus, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormat gameStartFormat, String str8, Map map5, Map map6, String str9, PageType pageType, List list, String str10, long j, String str11, String str12, ByteString byteString, int i, Object obj) {
        EventStatus eventStatus2 = (i & 1) != 0 ? eventState.event_status : eventStatus;
        return eventState.copy(eventStatus2, (i & 2) != 0 ? eventState.event_progress : str, (i & 4) != 0 ? eventState.event_state_detailed : str2, (i & 8) != 0 ? eventState.contract_id_to_event_scores : map, (i & 16) != 0 ? eventState.contract_id_to_visual_indicator : map2, (i & 32) != 0 ? eventState.contract_id_to_color : map3, (i & 64) != 0 ? eventState.open_interest : str3, (i & 128) != 0 ? eventState.game_start : instant, (i & 256) != 0 ? eventState.subtitle : str4, (i & 512) != 0 ? eventState.contract_id_to_visual_emphasis : map4, (i & 1024) != 0 ? eventState.event_id : str5, (i & 2048) != 0 ? eventState.supports_live_data : z, (i & 4096) != 0 ? eventState.external_source_ts : instant2, (i & 8192) != 0 ? eventState.edp_live_data_primary_label : str6, (i & 16384) != 0 ? eventState.edp_live_data_secondary_label : str7, (i & 32768) != 0 ? eventState.game_start_format : gameStartFormat, (i & 65536) != 0 ? eventState.category : str8, (i & 131072) != 0 ? eventState.contract_id_to_tertiary_text : map5, (i & 262144) != 0 ? eventState.contract_id_to_quaternary_text : map6, (i & 524288) != 0 ? eventState.gdp_title : str9, (i & 1048576) != 0 ? eventState.page_type : pageType, (i & 2097152) != 0 ? eventState.event_tags : list, (i & 4194304) != 0 ? eventState.total_volume_of_all_contracts_v2 : str10, (i & 8388608) != 0 ? eventState.total_open_interest_of_all_contracts_v2 : j, (i & 16777216) != 0 ? eventState.last_play_description : str11, (i & 33554432) != 0 ? eventState.last_play_header : str12, (i & 67108864) != 0 ? eventState.unknownFields() : byteString);
    }

    public final EventState copy(EventStatus event_status, String event_progress, String event_state_detailed, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, Color> contract_id_to_color, String open_interest, Instant game_start, String subtitle, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean supports_live_data, Instant external_source_ts, String edp_live_data_primary_label, String edp_live_data_secondary_label, GameStartFormat game_start_format, String category, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageType page_type, List<EventTag> event_tags, String total_volume_of_all_contracts_v2, long total_open_interest_of_all_contracts_v2, String last_play_description, String last_play_header, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(event_progress, "event_progress");
        Intrinsics.checkNotNullParameter(contract_id_to_event_scores, "contract_id_to_event_scores");
        Intrinsics.checkNotNullParameter(contract_id_to_visual_indicator, "contract_id_to_visual_indicator");
        Intrinsics.checkNotNullParameter(contract_id_to_color, "contract_id_to_color");
        Intrinsics.checkNotNullParameter(open_interest, "open_interest");
        Intrinsics.checkNotNullParameter(contract_id_to_visual_emphasis, "contract_id_to_visual_emphasis");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(game_start_format, "game_start_format");
        Intrinsics.checkNotNullParameter(contract_id_to_tertiary_text, "contract_id_to_tertiary_text");
        Intrinsics.checkNotNullParameter(contract_id_to_quaternary_text, "contract_id_to_quaternary_text");
        Intrinsics.checkNotNullParameter(gdp_title, "gdp_title");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(event_tags, "event_tags");
        Intrinsics.checkNotNullParameter(total_volume_of_all_contracts_v2, "total_volume_of_all_contracts_v2");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventState(event_status, event_progress, event_state_detailed, contract_id_to_event_scores, contract_id_to_visual_indicator, contract_id_to_color, open_interest, game_start, subtitle, contract_id_to_visual_emphasis, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, game_start_format, category, contract_id_to_tertiary_text, contract_id_to_quaternary_text, gdp_title, page_type, event_tags, total_volume_of_all_contracts_v2, total_open_interest_of_all_contracts_v2, last_play_description, last_play_header, unknownFields);
    }
}
