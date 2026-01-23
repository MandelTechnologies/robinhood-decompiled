package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ColorDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventStateDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventStatusDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventTagDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GameStartFormatDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.PageTypeDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: EventStateDto.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b,\b\u0007\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004ihjkB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bù\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010/Jý\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\r2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020$2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020:H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bG\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bH\u00105R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\bK\u0010JR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\r8F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bM\u00105R\u0019\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bP\u00105R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\bQ\u0010JR\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bR\u00105R\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0019\u0010\u001b\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158F¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bV\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bW\u00105R\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010 \u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bZ\u00105R\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b[\u0010JR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b\\\u0010JR\u0011\u0010#\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b]\u00105R\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010,\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010-\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bf\u00105R\u0013\u0010.\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bg\u00105¨\u0006l"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "Landroid/os/Parcelable;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;)V", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;", "event_status", "", "event_progress", "event_state_detailed", "", "contract_id_to_event_scores", "", "contract_id_to_visual_indicator", "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "contract_id_to_color", "open_interest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "game_start", "subtitle", "contract_id_to_visual_emphasis", "event_id", "supports_live_data", "external_source_ts", "edp_live_data_primary_label", "edp_live_data_secondary_label", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;", "game_start_format", RhGcmListenerService.EXTRA_CATEGORY, "contract_id_to_tertiary_text", "contract_id_to_quaternary_text", "gdp_title", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "page_type", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventTagDto;", "event_tags", "Lcom/robinhood/idl/IdlDecimal;", "total_volume_of_all_contracts_v2", "", "total_open_interest_of_all_contracts_v2", "last_play_description", "last_play_header", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;JLjava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;JLjava/lang/String;Ljava/lang/String;)Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto;", "toProto", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "getEvent_status", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;", "getEvent_progress", "getEvent_state_detailed", "getContract_id_to_event_scores", "()Ljava/util/Map;", "getContract_id_to_visual_indicator", "getContract_id_to_color", "getOpen_interest", "getGame_start", "()Lj$/time/Instant;", "getSubtitle", "getContract_id_to_visual_emphasis", "getEvent_id", "getSupports_live_data", "()Z", "getExternal_source_ts", "getEdp_live_data_primary_label", "getEdp_live_data_secondary_label", "getGame_start_format", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;", "getCategory", "getContract_id_to_tertiary_text", "getContract_id_to_quaternary_text", "getGdp_title", "getPage_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "getEvent_tags", "()Ljava/util/List;", "getTotal_volume_of_all_contracts_v2", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_open_interest_of_all_contracts_v2", "()J", "getLast_play_description", "getLast_play_header", "Companion", "Surrogate", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EventStateDto implements Dto3<EventState>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventStateDto, EventState>> binaryBase64Serializer$delegate;
    private static final EventStateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventStateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EventStatusDto getEvent_status() {
        return this.surrogate.getEvent_status();
    }

    public final String getEvent_progress() {
        return this.surrogate.getEvent_progress();
    }

    public final String getEvent_state_detailed() {
        return this.surrogate.getEvent_state_detailed();
    }

    public final Map<String, String> getContract_id_to_event_scores() {
        return this.surrogate.getContract_id_to_event_scores();
    }

    public final Map<String, Boolean> getContract_id_to_visual_indicator() {
        return this.surrogate.getContract_id_to_visual_indicator();
    }

    public final Map<String, ColorDto> getContract_id_to_color() {
        return this.surrogate.getContract_id_to_color();
    }

    public final String getOpen_interest() {
        return this.surrogate.getOpen_interest();
    }

    public final Instant getGame_start() {
        return this.surrogate.getGame_start();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final Map<String, Boolean> getContract_id_to_visual_emphasis() {
        return this.surrogate.getContract_id_to_visual_emphasis();
    }

    public final String getEvent_id() {
        return this.surrogate.getEvent_id();
    }

    public final boolean getSupports_live_data() {
        return this.surrogate.getSupports_live_data();
    }

    public final Instant getExternal_source_ts() {
        return this.surrogate.getExternal_source_ts();
    }

    public final String getEdp_live_data_primary_label() {
        return this.surrogate.getEdp_live_data_primary_label();
    }

    public final String getEdp_live_data_secondary_label() {
        return this.surrogate.getEdp_live_data_secondary_label();
    }

    public final GameStartFormatDto getGame_start_format() {
        return this.surrogate.getGame_start_format();
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final Map<String, String> getContract_id_to_tertiary_text() {
        return this.surrogate.getContract_id_to_tertiary_text();
    }

    public final Map<String, String> getContract_id_to_quaternary_text() {
        return this.surrogate.getContract_id_to_quaternary_text();
    }

    public final String getGdp_title() {
        return this.surrogate.getGdp_title();
    }

    public final PageTypeDto getPage_type() {
        return this.surrogate.getPage_type();
    }

    public final List<EventTagDto> getEvent_tags() {
        return this.surrogate.getEvent_tags();
    }

    public final IdlDecimal getTotal_volume_of_all_contracts_v2() {
        return this.surrogate.getTotal_volume_of_all_contracts_v2();
    }

    public final long getTotal_open_interest_of_all_contracts_v2() {
        return this.surrogate.getTotal_open_interest_of_all_contracts_v2();
    }

    public final String getLast_play_description() {
        return this.surrogate.getLast_play_description();
    }

    public final String getLast_play_header() {
        return this.surrogate.getLast_play_header();
    }

    public /* synthetic */ EventStateDto(EventStatusDto eventStatusDto, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormatDto gameStartFormatDto, String str8, Map map5, Map map6, String str9, PageTypeDto pageTypeDto, List list, IdlDecimal idlDecimal, long j, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventStatusDto.INSTANCE.getZeroValue() : eventStatusDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? MapsKt.emptyMap() : map3, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? MapsKt.emptyMap() : map4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? GameStartFormatDto.INSTANCE.getZeroValue() : gameStartFormatDto, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? MapsKt.emptyMap() : map5, (i & 262144) != 0 ? MapsKt.emptyMap() : map6, (i & 524288) != 0 ? "" : str9, (i & 1048576) != 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto, (i & 2097152) != 0 ? CollectionsKt.emptyList() : list, (i & 4194304) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8388608) != 0 ? 0L : j, (i & 16777216) != 0 ? null : str10, (i & 33554432) != 0 ? null : str11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventStateDto(EventStatusDto event_status, String event_progress, String str, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, ColorDto> contract_id_to_color, String open_interest, Instant instant, String str2, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean z, Instant instant2, String str3, String str4, GameStartFormatDto game_start_format, String str5, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageTypeDto page_type, List<EventTagDto> event_tags, IdlDecimal total_volume_of_all_contracts_v2, long j, String str6, String str7) {
        this(new Surrogate(event_status, event_progress, str, contract_id_to_event_scores, contract_id_to_visual_indicator, contract_id_to_color, open_interest, instant, str2, contract_id_to_visual_emphasis, event_id, z, instant2, str3, str4, game_start_format, str5, contract_id_to_tertiary_text, contract_id_to_quaternary_text, gdp_title, page_type, event_tags, total_volume_of_all_contracts_v2, j, str6, str7));
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
    }

    public static /* synthetic */ EventStateDto copy$default(EventStateDto eventStateDto, EventStatusDto eventStatusDto, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormatDto gameStartFormatDto, String str8, Map map5, Map map6, String str9, PageTypeDto pageTypeDto, List list, IdlDecimal idlDecimal, long j, String str10, String str11, int i, Object obj) {
        String last_play_header;
        String str12;
        EventStatusDto event_status = (i & 1) != 0 ? eventStateDto.surrogate.getEvent_status() : eventStatusDto;
        String event_progress = (i & 2) != 0 ? eventStateDto.surrogate.getEvent_progress() : str;
        String event_state_detailed = (i & 4) != 0 ? eventStateDto.surrogate.getEvent_state_detailed() : str2;
        Map contract_id_to_event_scores = (i & 8) != 0 ? eventStateDto.surrogate.getContract_id_to_event_scores() : map;
        Map contract_id_to_visual_indicator = (i & 16) != 0 ? eventStateDto.surrogate.getContract_id_to_visual_indicator() : map2;
        Map contract_id_to_color = (i & 32) != 0 ? eventStateDto.surrogate.getContract_id_to_color() : map3;
        String open_interest = (i & 64) != 0 ? eventStateDto.surrogate.getOpen_interest() : str3;
        Instant game_start = (i & 128) != 0 ? eventStateDto.surrogate.getGame_start() : instant;
        String subtitle = (i & 256) != 0 ? eventStateDto.surrogate.getSubtitle() : str4;
        Map contract_id_to_visual_emphasis = (i & 512) != 0 ? eventStateDto.surrogate.getContract_id_to_visual_emphasis() : map4;
        String event_id = (i & 1024) != 0 ? eventStateDto.surrogate.getEvent_id() : str5;
        boolean supports_live_data = (i & 2048) != 0 ? eventStateDto.surrogate.getSupports_live_data() : z;
        Instant external_source_ts = (i & 4096) != 0 ? eventStateDto.surrogate.getExternal_source_ts() : instant2;
        String edp_live_data_primary_label = (i & 8192) != 0 ? eventStateDto.surrogate.getEdp_live_data_primary_label() : str6;
        EventStatusDto eventStatusDto2 = event_status;
        String edp_live_data_secondary_label = (i & 16384) != 0 ? eventStateDto.surrogate.getEdp_live_data_secondary_label() : str7;
        GameStartFormatDto game_start_format = (i & 32768) != 0 ? eventStateDto.surrogate.getGame_start_format() : gameStartFormatDto;
        String category = (i & 65536) != 0 ? eventStateDto.surrogate.getCategory() : str8;
        Map contract_id_to_tertiary_text = (i & 131072) != 0 ? eventStateDto.surrogate.getContract_id_to_tertiary_text() : map5;
        Map contract_id_to_quaternary_text = (i & 262144) != 0 ? eventStateDto.surrogate.getContract_id_to_quaternary_text() : map6;
        String gdp_title = (i & 524288) != 0 ? eventStateDto.surrogate.getGdp_title() : str9;
        PageTypeDto page_type = (i & 1048576) != 0 ? eventStateDto.surrogate.getPage_type() : pageTypeDto;
        List event_tags = (i & 2097152) != 0 ? eventStateDto.surrogate.getEvent_tags() : list;
        IdlDecimal total_volume_of_all_contracts_v2 = (i & 4194304) != 0 ? eventStateDto.surrogate.getTotal_volume_of_all_contracts_v2() : idlDecimal;
        long total_open_interest_of_all_contracts_v2 = (i & 8388608) != 0 ? eventStateDto.surrogate.getTotal_open_interest_of_all_contracts_v2() : j;
        String last_play_description = (i & 16777216) != 0 ? eventStateDto.surrogate.getLast_play_description() : str10;
        if ((i & 33554432) != 0) {
            str12 = last_play_description;
            last_play_header = eventStateDto.surrogate.getLast_play_header();
        } else {
            last_play_header = str11;
            str12 = last_play_description;
        }
        return eventStateDto.copy(eventStatusDto2, event_progress, event_state_detailed, contract_id_to_event_scores, contract_id_to_visual_indicator, contract_id_to_color, open_interest, game_start, subtitle, contract_id_to_visual_emphasis, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, game_start_format, category, contract_id_to_tertiary_text, contract_id_to_quaternary_text, gdp_title, page_type, event_tags, total_volume_of_all_contracts_v2, total_open_interest_of_all_contracts_v2, str12, last_play_header);
    }

    public final EventStateDto copy(EventStatusDto event_status, String event_progress, String event_state_detailed, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, ColorDto> contract_id_to_color, String open_interest, Instant game_start, String subtitle, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean supports_live_data, Instant external_source_ts, String edp_live_data_primary_label, String edp_live_data_secondary_label, GameStartFormatDto game_start_format, String category, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageTypeDto page_type, List<EventTagDto> event_tags, IdlDecimal total_volume_of_all_contracts_v2, long total_open_interest_of_all_contracts_v2, String last_play_description, String last_play_header) {
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
        return new EventStateDto(new Surrogate(event_status, event_progress, event_state_detailed, contract_id_to_event_scores, contract_id_to_visual_indicator, contract_id_to_color, open_interest, game_start, subtitle, contract_id_to_visual_emphasis, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, game_start_format, category, contract_id_to_tertiary_text, contract_id_to_quaternary_text, gdp_title, page_type, event_tags, total_volume_of_all_contracts_v2, total_open_interest_of_all_contracts_v2, last_play_description, last_play_header));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventState toProto() {
        EventStatus eventStatus = (EventStatus) this.surrogate.getEvent_status().toProto();
        String event_progress = this.surrogate.getEvent_progress();
        String event_state_detailed = this.surrogate.getEvent_state_detailed();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getContract_id_to_event_scores().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        Set<Map.Entry<String, Boolean>> setEntrySet2 = this.surrogate.getContract_id_to_visual_indicator().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
        Iterator<T> it2 = setEntrySet2.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str = (String) entry2.getKey();
            Boolean bool = (Boolean) entry2.getValue();
            bool.booleanValue();
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(str, bool);
            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
        }
        Set<Map.Entry<String, ColorDto>> setEntrySet3 = this.surrogate.getContract_id_to_color().entrySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet3, 10)), 16));
        Iterator<T> it3 = setEntrySet3.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            Tuples2 tuples2M3642to3 = Tuples4.m3642to((String) entry3.getKey(), ((ColorDto) entry3.getValue()).toProto());
            linkedHashMap3.put(tuples2M3642to3.getFirst(), tuples2M3642to3.getSecond());
        }
        String open_interest = this.surrogate.getOpen_interest();
        Instant game_start = this.surrogate.getGame_start();
        String subtitle = this.surrogate.getSubtitle();
        Set<Map.Entry<String, Boolean>> setEntrySet4 = this.surrogate.getContract_id_to_visual_emphasis().entrySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet4, 10)), 16));
        Iterator<T> it4 = setEntrySet4.iterator();
        while (it4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it4.next();
            String str2 = (String) entry4.getKey();
            Boolean bool2 = (Boolean) entry4.getValue();
            bool2.booleanValue();
            Tuples2 tuples2M3642to4 = Tuples4.m3642to(str2, bool2);
            linkedHashMap4.put(tuples2M3642to4.getFirst(), tuples2M3642to4.getSecond());
        }
        String event_id = this.surrogate.getEvent_id();
        boolean supports_live_data = this.surrogate.getSupports_live_data();
        Instant external_source_ts = this.surrogate.getExternal_source_ts();
        String edp_live_data_primary_label = this.surrogate.getEdp_live_data_primary_label();
        String edp_live_data_secondary_label = this.surrogate.getEdp_live_data_secondary_label();
        GameStartFormat gameStartFormat = (GameStartFormat) this.surrogate.getGame_start_format().toProto();
        String category = this.surrogate.getCategory();
        Set<Map.Entry<String, String>> setEntrySet5 = this.surrogate.getContract_id_to_tertiary_text().entrySet();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet5, 10)), 16));
        Iterator it5 = setEntrySet5.iterator();
        while (it5.hasNext()) {
            Map.Entry entry5 = (Map.Entry) it5.next();
            Iterator it6 = it5;
            Tuples2 tuples2M3642to5 = Tuples4.m3642to((String) entry5.getKey(), (String) entry5.getValue());
            linkedHashMap5.put(tuples2M3642to5.getFirst(), tuples2M3642to5.getSecond());
            eventStatus = eventStatus;
            it5 = it6;
        }
        EventStatus eventStatus2 = eventStatus;
        Set<Map.Entry<String, String>> setEntrySet6 = this.surrogate.getContract_id_to_quaternary_text().entrySet();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet6, 10)), 16));
        Iterator it7 = setEntrySet6.iterator();
        while (it7.hasNext()) {
            Map.Entry entry6 = (Map.Entry) it7.next();
            Iterator it8 = it7;
            Tuples2 tuples2M3642to6 = Tuples4.m3642to((String) entry6.getKey(), (String) entry6.getValue());
            linkedHashMap6.put(tuples2M3642to6.getFirst(), tuples2M3642to6.getSecond());
            it7 = it8;
        }
        String gdp_title = this.surrogate.getGdp_title();
        PageType pageType = (PageType) this.surrogate.getPage_type().toProto();
        List<EventTagDto> event_tags = this.surrogate.getEvent_tags();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_tags, 10));
        Iterator<T> it9 = event_tags.iterator();
        while (it9.hasNext()) {
            arrayList.add(((EventTagDto) it9.next()).toProto());
        }
        return new EventState(eventStatus2, event_progress, event_state_detailed, linkedHashMap, linkedHashMap2, linkedHashMap3, open_interest, game_start, subtitle, linkedHashMap4, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, gameStartFormat, category, linkedHashMap5, linkedHashMap6, gdp_title, pageType, arrayList, this.surrogate.getTotal_volume_of_all_contracts_v2().getStringValue(), this.surrogate.getTotal_open_interest_of_all_contracts_v2(), this.surrogate.getLast_play_description(), this.surrogate.getLast_play_header(), null, 67108864, null);
    }

    public String toString() {
        return "[EventStateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventStateDto) && Intrinsics.areEqual(((EventStateDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bq\b\u0083\b\u0018\u0000 ©\u00012\u00020\u0001:\u0004ª\u0001©\u0001BÑ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u0017\b\u0002\u0010(\u001a\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0'\u0012\u0017\b\u0002\u0010+\u001a\u00110)¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/Bé\u0002\b\u0010\u0012\u0006\u00101\u001a\u000200\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\b\u0010(\u001a\u0004\u0018\u00010&\u0012\u0006\u0010+\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b.\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u001c\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u001c\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u001c\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0010\u0010G\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bG\u0010AJ6\u0010H\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bJ\u0010AJ\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003¢\u0006\u0004\bK\u0010DJ\u0010\u0010L\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bL\u0010AJ\u0010\u0010M\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bM\u0010NJ6\u0010O\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\bO\u0010IJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bP\u0010AJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bQ\u0010AJ\u0010\u0010R\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bT\u0010AJ\u001c\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\bU\u0010DJ\u001c\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\bV\u0010DJ\u0010\u0010W\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bW\u0010AJ\u0010\u0010X\u001a\u00020!HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020$0#HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0'HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00110)¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0*HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b`\u0010AJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\ba\u0010AJÚ\u0003\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u00042.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\t2.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0017\b\u0002\u0010(\u001a\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0'2\u0017\b\u0002\u0010+\u001a\u00110)¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bd\u0010AJ\u0010\u0010e\u001a\u000200HÖ\u0001¢\u0006\u0004\be\u0010fJ\u001a\u0010h\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bh\u0010iR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010j\u0012\u0004\bl\u0010m\u001a\u0004\bk\u0010?R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010n\u0012\u0004\bp\u0010m\u001a\u0004\bo\u0010AR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010n\u0012\u0004\br\u0010m\u001a\u0004\bq\u0010AR,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010s\u0012\u0004\bu\u0010m\u001a\u0004\bt\u0010DR,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010s\u0012\u0004\bw\u0010m\u001a\u0004\bv\u0010DR,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010s\u0012\u0004\by\u0010m\u001a\u0004\bx\u0010DR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010n\u0012\u0004\b{\u0010m\u001a\u0004\bz\u0010ARF\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010|\u0012\u0004\b~\u0010m\u001a\u0004\b}\u0010IR#\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u0014\u0010n\u0012\u0005\b\u0080\u0001\u0010m\u001a\u0004\b\u007f\u0010AR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0015\u0010s\u0012\u0005\b\u0082\u0001\u0010m\u001a\u0005\b\u0081\u0001\u0010DR\"\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010n\u0012\u0005\b\u0084\u0001\u0010m\u001a\u0005\b\u0083\u0001\u0010AR#\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0017\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010m\u001a\u0005\b\u0086\u0001\u0010NRH\u0010\u0018\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010|\u0012\u0005\b\u0089\u0001\u0010m\u001a\u0005\b\u0088\u0001\u0010IR$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0019\u0010n\u0012\u0005\b\u008b\u0001\u0010m\u001a\u0005\b\u008a\u0001\u0010AR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001a\u0010n\u0012\u0005\b\u008d\u0001\u0010m\u001a\u0005\b\u008c\u0001\u0010AR#\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u008e\u0001\u0012\u0005\b\u0090\u0001\u0010m\u001a\u0005\b\u008f\u0001\u0010SR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010n\u0012\u0005\b\u0092\u0001\u0010m\u001a\u0005\b\u0091\u0001\u0010AR.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010s\u0012\u0005\b\u0094\u0001\u0010m\u001a\u0005\b\u0093\u0001\u0010DR.\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010s\u0012\u0005\b\u0096\u0001\u0010m\u001a\u0005\b\u0095\u0001\u0010DR\"\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010n\u0012\u0005\b\u0098\u0001\u0010m\u001a\u0005\b\u0097\u0001\u0010AR#\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0099\u0001\u0012\u0005\b\u009b\u0001\u0010m\u001a\u0005\b\u009a\u0001\u0010YR)\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010\u009c\u0001\u0012\u0005\b\u009e\u0001\u0010m\u001a\u0005\b\u009d\u0001\u0010[R2\u0010(\u001a\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0'8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b(\u0010\u009f\u0001\u0012\u0005\b¡\u0001\u0010m\u001a\u0005\b \u0001\u0010]R2\u0010+\u001a\u00110)¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0*8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b+\u0010¢\u0001\u0012\u0005\b¤\u0001\u0010m\u001a\u0005\b£\u0001\u0010_R$\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b,\u0010n\u0012\u0005\b¦\u0001\u0010m\u001a\u0005\b¥\u0001\u0010AR$\u0010-\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b-\u0010n\u0012\u0005\b¨\u0001\u0010m\u001a\u0005\b§\u0001\u0010A¨\u0006«\u0001"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;", "event_status", "", "event_progress", "event_state_detailed", "", "contract_id_to_event_scores", "", "contract_id_to_visual_indicator", "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "contract_id_to_color", "open_interest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "game_start", "subtitle", "contract_id_to_visual_emphasis", "event_id", "supports_live_data", "external_source_ts", "edp_live_data_primary_label", "edp_live_data_secondary_label", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;", "game_start_format", RhGcmListenerService.EXTRA_CATEGORY, "contract_id_to_tertiary_text", "contract_id_to_quaternary_text", "gdp_title", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "page_type", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventTagDto;", "event_tags", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_volume_of_all_contracts_v2", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "total_open_interest_of_all_contracts_v2", "last_play_description", "last_play_header", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;JLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;JLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$prediction_markets_v1_externalRelease", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "()Lj$/time/Instant;", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15", "component16", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;", "component17", "component18", "component19", "component20", "component21", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "component22", "()Ljava/util/List;", "component23", "()Lcom/robinhood/idl/IdlDecimal;", "component24", "()J", "component25", "component26", "copy", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;JLjava/lang/String;Ljava/lang/String;)Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatusDto;", "getEvent_status", "getEvent_status$annotations", "()V", "Ljava/lang/String;", "getEvent_progress", "getEvent_progress$annotations", "getEvent_state_detailed", "getEvent_state_detailed$annotations", "Ljava/util/Map;", "getContract_id_to_event_scores", "getContract_id_to_event_scores$annotations", "getContract_id_to_visual_indicator", "getContract_id_to_visual_indicator$annotations", "getContract_id_to_color", "getContract_id_to_color$annotations", "getOpen_interest", "getOpen_interest$annotations", "Lj$/time/Instant;", "getGame_start", "getGame_start$annotations", "getSubtitle", "getSubtitle$annotations", "getContract_id_to_visual_emphasis", "getContract_id_to_visual_emphasis$annotations", "getEvent_id", "getEvent_id$annotations", "Z", "getSupports_live_data", "getSupports_live_data$annotations", "getExternal_source_ts", "getExternal_source_ts$annotations", "getEdp_live_data_primary_label", "getEdp_live_data_primary_label$annotations", "getEdp_live_data_secondary_label", "getEdp_live_data_secondary_label$annotations", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameStartFormatDto;", "getGame_start_format", "getGame_start_format$annotations", "getCategory", "getCategory$annotations", "getContract_id_to_tertiary_text", "getContract_id_to_tertiary_text$annotations", "getContract_id_to_quaternary_text", "getContract_id_to_quaternary_text$annotations", "getGdp_title", "getGdp_title$annotations", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "getPage_type", "getPage_type$annotations", "Ljava/util/List;", "getEvent_tags", "getEvent_tags$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getTotal_volume_of_all_contracts_v2", "getTotal_volume_of_all_contracts_v2$annotations", "J", "getTotal_open_interest_of_all_contracts_v2", "getTotal_open_interest_of_all_contracts_v2$annotations", "getLast_play_description", "getLast_play_description$annotations", "getLast_play_header", "getLast_play_header$annotations", "Companion", "$serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String category;
        private final Map<String, ColorDto> contract_id_to_color;
        private final Map<String, String> contract_id_to_event_scores;
        private final Map<String, String> contract_id_to_quaternary_text;
        private final Map<String, String> contract_id_to_tertiary_text;
        private final Map<String, Boolean> contract_id_to_visual_emphasis;
        private final Map<String, Boolean> contract_id_to_visual_indicator;
        private final String edp_live_data_primary_label;
        private final String edp_live_data_secondary_label;
        private final String event_id;
        private final String event_progress;
        private final String event_state_detailed;
        private final EventStatusDto event_status;
        private final List<EventTagDto> event_tags;
        private final Instant external_source_ts;
        private final Instant game_start;
        private final GameStartFormatDto game_start_format;
        private final String gdp_title;
        private final String last_play_description;
        private final String last_play_header;
        private final String open_interest;
        private final PageTypeDto page_type;
        private final String subtitle;
        private final boolean supports_live_data;
        private final long total_open_interest_of_all_contracts_v2;
        private final IdlDecimal total_volume_of_all_contracts_v2;

        public Surrogate() {
            this((EventStatusDto) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (Instant) null, (String) null, (Map) null, (String) null, false, (Instant) null, (String) null, (String) null, (GameStartFormatDto) null, (String) null, (Map) null, (Map) null, (String) null, (PageTypeDto) null, (List) null, (IdlDecimal) null, 0L, (String) null, (String) null, 67108863, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ColorDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
            return new ArrayListSerializer(EventTagDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EventStatusDto eventStatusDto, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormatDto gameStartFormatDto, String str8, Map map5, Map map6, String str9, PageTypeDto pageTypeDto, List list, IdlDecimal idlDecimal, long j, String str10, String str11, int i, Object obj) {
            EventStatusDto eventStatusDto2 = (i & 1) != 0 ? surrogate.event_status : eventStatusDto;
            return surrogate.copy(eventStatusDto2, (i & 2) != 0 ? surrogate.event_progress : str, (i & 4) != 0 ? surrogate.event_state_detailed : str2, (i & 8) != 0 ? surrogate.contract_id_to_event_scores : map, (i & 16) != 0 ? surrogate.contract_id_to_visual_indicator : map2, (i & 32) != 0 ? surrogate.contract_id_to_color : map3, (i & 64) != 0 ? surrogate.open_interest : str3, (i & 128) != 0 ? surrogate.game_start : instant, (i & 256) != 0 ? surrogate.subtitle : str4, (i & 512) != 0 ? surrogate.contract_id_to_visual_emphasis : map4, (i & 1024) != 0 ? surrogate.event_id : str5, (i & 2048) != 0 ? surrogate.supports_live_data : z, (i & 4096) != 0 ? surrogate.external_source_ts : instant2, (i & 8192) != 0 ? surrogate.edp_live_data_primary_label : str6, (i & 16384) != 0 ? surrogate.edp_live_data_secondary_label : str7, (i & 32768) != 0 ? surrogate.game_start_format : gameStartFormatDto, (i & 65536) != 0 ? surrogate.category : str8, (i & 131072) != 0 ? surrogate.contract_id_to_tertiary_text : map5, (i & 262144) != 0 ? surrogate.contract_id_to_quaternary_text : map6, (i & 524288) != 0 ? surrogate.gdp_title : str9, (i & 1048576) != 0 ? surrogate.page_type : pageTypeDto, (i & 2097152) != 0 ? surrogate.event_tags : list, (i & 4194304) != 0 ? surrogate.total_volume_of_all_contracts_v2 : idlDecimal, (i & 8388608) != 0 ? surrogate.total_open_interest_of_all_contracts_v2 : j, (i & 16777216) != 0 ? surrogate.last_play_description : str10, (i & 33554432) != 0 ? surrogate.last_play_header : str11);
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("contractIdToColor")
        @JsonAnnotations2(names = {"contract_id_to_color"})
        public static /* synthetic */ void getContract_id_to_color$annotations() {
        }

        @SerialName("contractIdToEventScores")
        @JsonAnnotations2(names = {"contract_id_to_event_scores"})
        public static /* synthetic */ void getContract_id_to_event_scores$annotations() {
        }

        @SerialName("contractIdToQuaternaryText")
        @JsonAnnotations2(names = {"contract_id_to_quaternary_text"})
        public static /* synthetic */ void getContract_id_to_quaternary_text$annotations() {
        }

        @SerialName("contractIdToTertiaryText")
        @JsonAnnotations2(names = {"contract_id_to_tertiary_text"})
        public static /* synthetic */ void getContract_id_to_tertiary_text$annotations() {
        }

        @SerialName("contractIdToVisualEmphasis")
        @JsonAnnotations2(names = {"contract_id_to_visual_emphasis"})
        public static /* synthetic */ void getContract_id_to_visual_emphasis$annotations() {
        }

        @SerialName("contractIdToVisualIndicator")
        @JsonAnnotations2(names = {"contract_id_to_visual_indicator"})
        public static /* synthetic */ void getContract_id_to_visual_indicator$annotations() {
        }

        @SerialName("edpLiveDataPrimaryLabel")
        @JsonAnnotations2(names = {"edp_live_data_primary_label"})
        public static /* synthetic */ void getEdp_live_data_primary_label$annotations() {
        }

        @SerialName("edpLiveDataSecondaryLabel")
        @JsonAnnotations2(names = {"edp_live_data_secondary_label"})
        public static /* synthetic */ void getEdp_live_data_secondary_label$annotations() {
        }

        @SerialName("eventId")
        @JsonAnnotations2(names = {"event_id"})
        public static /* synthetic */ void getEvent_id$annotations() {
        }

        @SerialName("eventProgress")
        @JsonAnnotations2(names = {"event_progress"})
        public static /* synthetic */ void getEvent_progress$annotations() {
        }

        @SerialName("eventStateDetailed")
        @JsonAnnotations2(names = {"event_state_detailed"})
        public static /* synthetic */ void getEvent_state_detailed$annotations() {
        }

        @SerialName("eventStatus")
        @JsonAnnotations2(names = {"event_status"})
        public static /* synthetic */ void getEvent_status$annotations() {
        }

        @SerialName("eventTags")
        @JsonAnnotations2(names = {"event_tags"})
        public static /* synthetic */ void getEvent_tags$annotations() {
        }

        @SerialName("externalSourceTs")
        @JsonAnnotations2(names = {"external_source_ts"})
        public static /* synthetic */ void getExternal_source_ts$annotations() {
        }

        @SerialName("gameStart")
        @JsonAnnotations2(names = {"game_start"})
        public static /* synthetic */ void getGame_start$annotations() {
        }

        @SerialName("gameStartFormat")
        @JsonAnnotations2(names = {"game_start_format"})
        public static /* synthetic */ void getGame_start_format$annotations() {
        }

        @SerialName("gdpTitle")
        @JsonAnnotations2(names = {"gdp_title"})
        public static /* synthetic */ void getGdp_title$annotations() {
        }

        @SerialName("lastPlayDescription")
        @JsonAnnotations2(names = {"last_play_description"})
        public static /* synthetic */ void getLast_play_description$annotations() {
        }

        @SerialName("lastPlayHeader")
        @JsonAnnotations2(names = {"last_play_header"})
        public static /* synthetic */ void getLast_play_header$annotations() {
        }

        @SerialName("openInterest")
        @JsonAnnotations2(names = {"open_interest"})
        public static /* synthetic */ void getOpen_interest$annotations() {
        }

        @SerialName("pageType")
        @JsonAnnotations2(names = {"page_type"})
        public static /* synthetic */ void getPage_type$annotations() {
        }

        @SerialName("subtitle")
        @JsonAnnotations2(names = {"subtitle"})
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        @SerialName("supportsLiveData")
        @JsonAnnotations2(names = {"supports_live_data"})
        public static /* synthetic */ void getSupports_live_data$annotations() {
        }

        @SerialName("totalOpenInterestOfAllContractsV2")
        @JsonAnnotations2(names = {"total_open_interest_of_all_contracts_v2"})
        public static /* synthetic */ void getTotal_open_interest_of_all_contracts_v2$annotations() {
        }

        @SerialName("totalVolumeOfAllContractsV2")
        @JsonAnnotations2(names = {"total_volume_of_all_contracts_v2"})
        public static /* synthetic */ void getTotal_volume_of_all_contracts_v2$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EventStatusDto getEvent_status() {
            return this.event_status;
        }

        public final Map<String, Boolean> component10() {
            return this.contract_id_to_visual_emphasis;
        }

        /* renamed from: component11, reason: from getter */
        public final String getEvent_id() {
            return this.event_id;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getSupports_live_data() {
            return this.supports_live_data;
        }

        /* renamed from: component13, reason: from getter */
        public final Instant getExternal_source_ts() {
            return this.external_source_ts;
        }

        /* renamed from: component14, reason: from getter */
        public final String getEdp_live_data_primary_label() {
            return this.edp_live_data_primary_label;
        }

        /* renamed from: component15, reason: from getter */
        public final String getEdp_live_data_secondary_label() {
            return this.edp_live_data_secondary_label;
        }

        /* renamed from: component16, reason: from getter */
        public final GameStartFormatDto getGame_start_format() {
            return this.game_start_format;
        }

        /* renamed from: component17, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public final Map<String, String> component18() {
            return this.contract_id_to_tertiary_text;
        }

        public final Map<String, String> component19() {
            return this.contract_id_to_quaternary_text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_progress() {
            return this.event_progress;
        }

        /* renamed from: component20, reason: from getter */
        public final String getGdp_title() {
            return this.gdp_title;
        }

        /* renamed from: component21, reason: from getter */
        public final PageTypeDto getPage_type() {
            return this.page_type;
        }

        public final List<EventTagDto> component22() {
            return this.event_tags;
        }

        /* renamed from: component23, reason: from getter */
        public final IdlDecimal getTotal_volume_of_all_contracts_v2() {
            return this.total_volume_of_all_contracts_v2;
        }

        /* renamed from: component24, reason: from getter */
        public final long getTotal_open_interest_of_all_contracts_v2() {
            return this.total_open_interest_of_all_contracts_v2;
        }

        /* renamed from: component25, reason: from getter */
        public final String getLast_play_description() {
            return this.last_play_description;
        }

        /* renamed from: component26, reason: from getter */
        public final String getLast_play_header() {
            return this.last_play_header;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEvent_state_detailed() {
            return this.event_state_detailed;
        }

        public final Map<String, String> component4() {
            return this.contract_id_to_event_scores;
        }

        public final Map<String, Boolean> component5() {
            return this.contract_id_to_visual_indicator;
        }

        public final Map<String, ColorDto> component6() {
            return this.contract_id_to_color;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOpen_interest() {
            return this.open_interest;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getGame_start() {
            return this.game_start;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Surrogate copy(EventStatusDto event_status, String event_progress, String event_state_detailed, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, ColorDto> contract_id_to_color, String open_interest, Instant game_start, String subtitle, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean supports_live_data, Instant external_source_ts, String edp_live_data_primary_label, String edp_live_data_secondary_label, GameStartFormatDto game_start_format, String category, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageTypeDto page_type, List<EventTagDto> event_tags, IdlDecimal total_volume_of_all_contracts_v2, long total_open_interest_of_all_contracts_v2, String last_play_description, String last_play_header) {
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
            return new Surrogate(event_status, event_progress, event_state_detailed, contract_id_to_event_scores, contract_id_to_visual_indicator, contract_id_to_color, open_interest, game_start, subtitle, contract_id_to_visual_emphasis, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, game_start_format, category, contract_id_to_tertiary_text, contract_id_to_quaternary_text, gdp_title, page_type, event_tags, total_volume_of_all_contracts_v2, total_open_interest_of_all_contracts_v2, last_play_description, last_play_header);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.event_status == surrogate.event_status && Intrinsics.areEqual(this.event_progress, surrogate.event_progress) && Intrinsics.areEqual(this.event_state_detailed, surrogate.event_state_detailed) && Intrinsics.areEqual(this.contract_id_to_event_scores, surrogate.contract_id_to_event_scores) && Intrinsics.areEqual(this.contract_id_to_visual_indicator, surrogate.contract_id_to_visual_indicator) && Intrinsics.areEqual(this.contract_id_to_color, surrogate.contract_id_to_color) && Intrinsics.areEqual(this.open_interest, surrogate.open_interest) && Intrinsics.areEqual(this.game_start, surrogate.game_start) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.contract_id_to_visual_emphasis, surrogate.contract_id_to_visual_emphasis) && Intrinsics.areEqual(this.event_id, surrogate.event_id) && this.supports_live_data == surrogate.supports_live_data && Intrinsics.areEqual(this.external_source_ts, surrogate.external_source_ts) && Intrinsics.areEqual(this.edp_live_data_primary_label, surrogate.edp_live_data_primary_label) && Intrinsics.areEqual(this.edp_live_data_secondary_label, surrogate.edp_live_data_secondary_label) && this.game_start_format == surrogate.game_start_format && Intrinsics.areEqual(this.category, surrogate.category) && Intrinsics.areEqual(this.contract_id_to_tertiary_text, surrogate.contract_id_to_tertiary_text) && Intrinsics.areEqual(this.contract_id_to_quaternary_text, surrogate.contract_id_to_quaternary_text) && Intrinsics.areEqual(this.gdp_title, surrogate.gdp_title) && this.page_type == surrogate.page_type && Intrinsics.areEqual(this.event_tags, surrogate.event_tags) && Intrinsics.areEqual(this.total_volume_of_all_contracts_v2, surrogate.total_volume_of_all_contracts_v2) && this.total_open_interest_of_all_contracts_v2 == surrogate.total_open_interest_of_all_contracts_v2 && Intrinsics.areEqual(this.last_play_description, surrogate.last_play_description) && Intrinsics.areEqual(this.last_play_header, surrogate.last_play_header);
        }

        public int hashCode() {
            int iHashCode = ((this.event_status.hashCode() * 31) + this.event_progress.hashCode()) * 31;
            String str = this.event_state_detailed;
            int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contract_id_to_event_scores.hashCode()) * 31) + this.contract_id_to_visual_indicator.hashCode()) * 31) + this.contract_id_to_color.hashCode()) * 31) + this.open_interest.hashCode()) * 31;
            Instant instant = this.game_start;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.contract_id_to_visual_emphasis.hashCode()) * 31) + this.event_id.hashCode()) * 31) + Boolean.hashCode(this.supports_live_data)) * 31;
            Instant instant2 = this.external_source_ts;
            int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            String str3 = this.edp_live_data_primary_label;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.edp_live_data_secondary_label;
            int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.game_start_format.hashCode()) * 31;
            String str5 = this.category;
            int iHashCode8 = (((((((((((((((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.contract_id_to_tertiary_text.hashCode()) * 31) + this.contract_id_to_quaternary_text.hashCode()) * 31) + this.gdp_title.hashCode()) * 31) + this.page_type.hashCode()) * 31) + this.event_tags.hashCode()) * 31) + this.total_volume_of_all_contracts_v2.hashCode()) * 31) + Long.hashCode(this.total_open_interest_of_all_contracts_v2)) * 31;
            String str6 = this.last_play_description;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.last_play_header;
            return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(event_status=" + this.event_status + ", event_progress=" + this.event_progress + ", event_state_detailed=" + this.event_state_detailed + ", contract_id_to_event_scores=" + this.contract_id_to_event_scores + ", contract_id_to_visual_indicator=" + this.contract_id_to_visual_indicator + ", contract_id_to_color=" + this.contract_id_to_color + ", open_interest=" + this.open_interest + ", game_start=" + this.game_start + ", subtitle=" + this.subtitle + ", contract_id_to_visual_emphasis=" + this.contract_id_to_visual_emphasis + ", event_id=" + this.event_id + ", supports_live_data=" + this.supports_live_data + ", external_source_ts=" + this.external_source_ts + ", edp_live_data_primary_label=" + this.edp_live_data_primary_label + ", edp_live_data_secondary_label=" + this.edp_live_data_secondary_label + ", game_start_format=" + this.game_start_format + ", category=" + this.category + ", contract_id_to_tertiary_text=" + this.contract_id_to_tertiary_text + ", contract_id_to_quaternary_text=" + this.contract_id_to_quaternary_text + ", gdp_title=" + this.gdp_title + ", page_type=" + this.page_type + ", event_tags=" + this.event_tags + ", total_volume_of_all_contracts_v2=" + this.total_volume_of_all_contracts_v2 + ", total_open_interest_of_all_contracts_v2=" + this.total_open_interest_of_all_contracts_v2 + ", last_play_description=" + this.last_play_description + ", last_play_header=" + this.last_play_header + ")";
        }

        /* compiled from: EventStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventStateDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$3();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$4();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$Surrogate$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventStateDto.Surrogate._childSerializers$_anonymous_$5();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, EventStatusDto eventStatusDto, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormatDto gameStartFormatDto, String str8, Map map5, Map map6, String str9, PageTypeDto pageTypeDto, List list, IdlDecimal idlDecimal, long j, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
            this.event_status = (i & 1) == 0 ? EventStatusDto.INSTANCE.getZeroValue() : eventStatusDto;
            if ((i & 2) == 0) {
                this.event_progress = "";
            } else {
                this.event_progress = str;
            }
            if ((i & 4) == 0) {
                this.event_state_detailed = null;
            } else {
                this.event_state_detailed = str2;
            }
            if ((i & 8) == 0) {
                this.contract_id_to_event_scores = MapsKt.emptyMap();
            } else {
                this.contract_id_to_event_scores = map;
            }
            if ((i & 16) == 0) {
                this.contract_id_to_visual_indicator = MapsKt.emptyMap();
            } else {
                this.contract_id_to_visual_indicator = map2;
            }
            if ((i & 32) == 0) {
                this.contract_id_to_color = MapsKt.emptyMap();
            } else {
                this.contract_id_to_color = map3;
            }
            if ((i & 64) == 0) {
                this.open_interest = "";
            } else {
                this.open_interest = str3;
            }
            if ((i & 128) == 0) {
                this.game_start = null;
            } else {
                this.game_start = instant;
            }
            if ((i & 256) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str4;
            }
            if ((i & 512) == 0) {
                this.contract_id_to_visual_emphasis = MapsKt.emptyMap();
            } else {
                this.contract_id_to_visual_emphasis = map4;
            }
            if ((i & 1024) == 0) {
                this.event_id = "";
            } else {
                this.event_id = str5;
            }
            if ((i & 2048) == 0) {
                this.supports_live_data = false;
            } else {
                this.supports_live_data = z;
            }
            if ((i & 4096) == 0) {
                this.external_source_ts = null;
            } else {
                this.external_source_ts = instant2;
            }
            if ((i & 8192) == 0) {
                this.edp_live_data_primary_label = null;
            } else {
                this.edp_live_data_primary_label = str6;
            }
            if ((i & 16384) == 0) {
                this.edp_live_data_secondary_label = null;
            } else {
                this.edp_live_data_secondary_label = str7;
            }
            this.game_start_format = (32768 & i) == 0 ? GameStartFormatDto.INSTANCE.getZeroValue() : gameStartFormatDto;
            if ((65536 & i) == 0) {
                this.category = null;
            } else {
                this.category = str8;
            }
            this.contract_id_to_tertiary_text = (131072 & i) == 0 ? MapsKt.emptyMap() : map5;
            this.contract_id_to_quaternary_text = (262144 & i) == 0 ? MapsKt.emptyMap() : map6;
            if ((524288 & i) == 0) {
                this.gdp_title = "";
            } else {
                this.gdp_title = str9;
            }
            this.page_type = (1048576 & i) == 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto;
            this.event_tags = (2097152 & i) == 0 ? CollectionsKt.emptyList() : list;
            this.total_volume_of_all_contracts_v2 = (4194304 & i) == 0 ? new IdlDecimal("") : idlDecimal;
            this.total_open_interest_of_all_contracts_v2 = (8388608 & i) == 0 ? 0L : j;
            if ((16777216 & i) == 0) {
                this.last_play_description = null;
            } else {
                this.last_play_description = str10;
            }
            if ((i & 33554432) == 0) {
                this.last_play_header = null;
            } else {
                this.last_play_header = str11;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.event_status != EventStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EventStatusDto.Serializer.INSTANCE, self.event_status);
            }
            if (!Intrinsics.areEqual(self.event_progress, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_progress);
            }
            String str = self.event_state_detailed;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_event_scores, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.contract_id_to_event_scores);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_visual_indicator, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.contract_id_to_visual_indicator);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_color, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.contract_id_to_color);
            }
            if (!Intrinsics.areEqual(self.open_interest, "")) {
                output.encodeStringElement(serialDesc, 6, self.open_interest);
            }
            Instant instant = self.game_start;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
            String str2 = self.subtitle;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str2);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_visual_emphasis, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.contract_id_to_visual_emphasis);
            }
            if (!Intrinsics.areEqual(self.event_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.event_id);
            }
            boolean z = self.supports_live_data;
            if (z) {
                output.encodeBooleanElement(serialDesc, 11, z);
            }
            Instant instant2 = self.external_source_ts;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant2);
            }
            String str3 = self.edp_live_data_primary_label;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.edp_live_data_secondary_label;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str4);
            }
            if (self.game_start_format != GameStartFormatDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, GameStartFormatDto.Serializer.INSTANCE, self.game_start_format);
            }
            String str5 = self.category;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, str5);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_tertiary_text, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 17, lazyArr[17].getValue(), self.contract_id_to_tertiary_text);
            }
            if (!Intrinsics.areEqual(self.contract_id_to_quaternary_text, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 18, lazyArr[18].getValue(), self.contract_id_to_quaternary_text);
            }
            if (!Intrinsics.areEqual(self.gdp_title, "")) {
                output.encodeStringElement(serialDesc, 19, self.gdp_title);
            }
            if (self.page_type != PageTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, PageTypeDto.Serializer.INSTANCE, self.page_type);
            }
            if (!Intrinsics.areEqual(self.event_tags, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 21, lazyArr[21].getValue(), self.event_tags);
            }
            if (!Intrinsics.areEqual(self.total_volume_of_all_contracts_v2, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 22, IdlDecimalSerializer.INSTANCE, self.total_volume_of_all_contracts_v2);
            }
            long j = self.total_open_interest_of_all_contracts_v2;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 23, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            String str6 = self.last_play_description;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, StringSerializer.INSTANCE, str6);
            }
            String str7 = self.last_play_header;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, StringSerializer.INSTANCE, str7);
            }
        }

        public Surrogate(EventStatusDto event_status, String event_progress, String str, Map<String, String> contract_id_to_event_scores, Map<String, Boolean> contract_id_to_visual_indicator, Map<String, ColorDto> contract_id_to_color, String open_interest, Instant instant, String str2, Map<String, Boolean> contract_id_to_visual_emphasis, String event_id, boolean z, Instant instant2, String str3, String str4, GameStartFormatDto game_start_format, String str5, Map<String, String> contract_id_to_tertiary_text, Map<String, String> contract_id_to_quaternary_text, String gdp_title, PageTypeDto page_type, List<EventTagDto> event_tags, IdlDecimal total_volume_of_all_contracts_v2, long j, String str6, String str7) {
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
            this.event_status = event_status;
            this.event_progress = event_progress;
            this.event_state_detailed = str;
            this.contract_id_to_event_scores = contract_id_to_event_scores;
            this.contract_id_to_visual_indicator = contract_id_to_visual_indicator;
            this.contract_id_to_color = contract_id_to_color;
            this.open_interest = open_interest;
            this.game_start = instant;
            this.subtitle = str2;
            this.contract_id_to_visual_emphasis = contract_id_to_visual_emphasis;
            this.event_id = event_id;
            this.supports_live_data = z;
            this.external_source_ts = instant2;
            this.edp_live_data_primary_label = str3;
            this.edp_live_data_secondary_label = str4;
            this.game_start_format = game_start_format;
            this.category = str5;
            this.contract_id_to_tertiary_text = contract_id_to_tertiary_text;
            this.contract_id_to_quaternary_text = contract_id_to_quaternary_text;
            this.gdp_title = gdp_title;
            this.page_type = page_type;
            this.event_tags = event_tags;
            this.total_volume_of_all_contracts_v2 = total_volume_of_all_contracts_v2;
            this.total_open_interest_of_all_contracts_v2 = j;
            this.last_play_description = str6;
            this.last_play_header = str7;
        }

        public final EventStatusDto getEvent_status() {
            return this.event_status;
        }

        public /* synthetic */ Surrogate(EventStatusDto eventStatusDto, String str, String str2, Map map, Map map2, Map map3, String str3, Instant instant, String str4, Map map4, String str5, boolean z, Instant instant2, String str6, String str7, GameStartFormatDto gameStartFormatDto, String str8, Map map5, Map map6, String str9, PageTypeDto pageTypeDto, List list, IdlDecimal idlDecimal, long j, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EventStatusDto.INSTANCE.getZeroValue() : eventStatusDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? MapsKt.emptyMap() : map3, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? MapsKt.emptyMap() : map4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? GameStartFormatDto.INSTANCE.getZeroValue() : gameStartFormatDto, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? MapsKt.emptyMap() : map5, (i & 262144) != 0 ? MapsKt.emptyMap() : map6, (i & 524288) != 0 ? "" : str9, (i & 1048576) != 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto, (i & 2097152) != 0 ? CollectionsKt.emptyList() : list, (i & 4194304) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8388608) != 0 ? 0L : j, (i & 16777216) != 0 ? null : str10, (i & 33554432) != 0 ? null : str11);
        }

        public final String getEvent_progress() {
            return this.event_progress;
        }

        public final String getEvent_state_detailed() {
            return this.event_state_detailed;
        }

        public final Map<String, String> getContract_id_to_event_scores() {
            return this.contract_id_to_event_scores;
        }

        public final Map<String, Boolean> getContract_id_to_visual_indicator() {
            return this.contract_id_to_visual_indicator;
        }

        public final Map<String, ColorDto> getContract_id_to_color() {
            return this.contract_id_to_color;
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

        public final Map<String, Boolean> getContract_id_to_visual_emphasis() {
            return this.contract_id_to_visual_emphasis;
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

        public final GameStartFormatDto getGame_start_format() {
            return this.game_start_format;
        }

        public final String getCategory() {
            return this.category;
        }

        public final Map<String, String> getContract_id_to_tertiary_text() {
            return this.contract_id_to_tertiary_text;
        }

        public final Map<String, String> getContract_id_to_quaternary_text() {
            return this.contract_id_to_quaternary_text;
        }

        public final String getGdp_title() {
            return this.gdp_title;
        }

        public final PageTypeDto getPage_type() {
            return this.page_type;
        }

        public final List<EventTagDto> getEvent_tags() {
            return this.event_tags;
        }

        public final IdlDecimal getTotal_volume_of_all_contracts_v2() {
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
    }

    /* compiled from: EventStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventStateDto, EventState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventStateDto> getBinaryBase64Serializer() {
            return (KSerializer) EventStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventState> getProtoAdapter() {
            return EventState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventStateDto getZeroValue() {
            return EventStateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventStateDto fromProto(EventState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EventStatusDto eventStatusDtoFromProto = EventStatusDto.INSTANCE.fromProto(proto.getEvent_status());
            String event_progress = proto.getEvent_progress();
            String event_state_detailed = proto.getEvent_state_detailed();
            Set<Map.Entry<String, String>> setEntrySet = proto.getContract_id_to_event_scores().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            Set<Map.Entry<String, Boolean>> setEntrySet2 = proto.getContract_id_to_visual_indicator().entrySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
            Iterator<T> it2 = setEntrySet2.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str = (String) entry2.getKey();
                Boolean bool = (Boolean) entry2.getValue();
                bool.booleanValue();
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(str, bool);
                linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
            }
            Set<Map.Entry<String, Color>> setEntrySet3 = proto.getContract_id_to_color().entrySet();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet3, 10)), 16));
            Iterator<T> it3 = setEntrySet3.iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                Tuples2 tuples2M3642to3 = Tuples4.m3642to((String) entry3.getKey(), ColorDto.INSTANCE.fromProto((Color) entry3.getValue()));
                linkedHashMap3.put(tuples2M3642to3.getFirst(), tuples2M3642to3.getSecond());
            }
            String open_interest = proto.getOpen_interest();
            Instant game_start = proto.getGame_start();
            String subtitle = proto.getSubtitle();
            Set<Map.Entry<String, Boolean>> setEntrySet4 = proto.getContract_id_to_visual_emphasis().entrySet();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet4, 10)), 16));
            Iterator<T> it4 = setEntrySet4.iterator();
            while (it4.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it4.next();
                String str2 = (String) entry4.getKey();
                Boolean bool2 = (Boolean) entry4.getValue();
                bool2.booleanValue();
                Tuples2 tuples2M3642to4 = Tuples4.m3642to(str2, bool2);
                linkedHashMap4.put(tuples2M3642to4.getFirst(), tuples2M3642to4.getSecond());
            }
            String event_id = proto.getEvent_id();
            boolean supports_live_data = proto.getSupports_live_data();
            Instant external_source_ts = proto.getExternal_source_ts();
            String edp_live_data_primary_label = proto.getEdp_live_data_primary_label();
            String edp_live_data_secondary_label = proto.getEdp_live_data_secondary_label();
            GameStartFormatDto gameStartFormatDtoFromProto = GameStartFormatDto.INSTANCE.fromProto(proto.getGame_start_format());
            String category = proto.getCategory();
            Set<Map.Entry<String, String>> setEntrySet5 = proto.getContract_id_to_tertiary_text().entrySet();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet5, 10)), 16));
            Iterator<T> it5 = setEntrySet5.iterator();
            while (it5.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it5.next();
                Tuples2 tuples2M3642to5 = Tuples4.m3642to((String) entry5.getKey(), (String) entry5.getValue());
                linkedHashMap5.put(tuples2M3642to5.getFirst(), tuples2M3642to5.getSecond());
            }
            Set<Map.Entry<String, String>> setEntrySet6 = proto.getContract_id_to_quaternary_text().entrySet();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet6, 10)), 16));
            Iterator<T> it6 = setEntrySet6.iterator();
            while (it6.hasNext()) {
                Map.Entry entry6 = (Map.Entry) it6.next();
                LinkedHashMap linkedHashMap7 = linkedHashMap5;
                Tuples2 tuples2M3642to6 = Tuples4.m3642to((String) entry6.getKey(), (String) entry6.getValue());
                linkedHashMap6.put(tuples2M3642to6.getFirst(), tuples2M3642to6.getSecond());
                linkedHashMap5 = linkedHashMap7;
            }
            LinkedHashMap linkedHashMap8 = linkedHashMap5;
            String gdp_title = proto.getGdp_title();
            PageTypeDto pageTypeDtoFromProto = PageTypeDto.INSTANCE.fromProto(proto.getPage_type());
            List<EventTag> event_tags = proto.getEvent_tags();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_tags, 10));
            for (Iterator it7 = event_tags.iterator(); it7.hasNext(); it7 = it7) {
                arrayList.add(EventTagDto.INSTANCE.fromProto((EventTag) it7.next()));
            }
            return new EventStateDto(new Surrogate(eventStatusDtoFromProto, event_progress, event_state_detailed, linkedHashMap, linkedHashMap2, linkedHashMap3, open_interest, game_start, subtitle, linkedHashMap4, event_id, supports_live_data, external_source_ts, edp_live_data_primary_label, edp_live_data_secondary_label, gameStartFormatDtoFromProto, category, linkedHashMap8, linkedHashMap6, gdp_title, pageTypeDtoFromProto, arrayList, new IdlDecimal(proto.getTotal_volume_of_all_contracts_v2()), proto.getTotal_open_interest_of_all_contracts_v2(), proto.getLast_play_description(), proto.getLast_play_header()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventStateDto.binaryBase64Serializer_delegate$lambda$7();
            }
        });
        zeroValue = new EventStateDto(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, 67108863, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$7() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventStateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.EventState", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.EventStateDto";
        }
    }
}
