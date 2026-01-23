package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsStringSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ArsenalEventStateDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupSectionDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventTypeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventViewModeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.PageTypeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.TimelineDto;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EventDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004YZ[\\B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¯\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0014\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u0014¢\u0006\u0004\b\u0006\u0010,J¬\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0002\u0010!\u001a\u00020\t2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00142\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u0014J\b\u0010M\u001a\u00020\u0002H\u0016J\b\u0010N\u001a\u00020\tH\u0016J\u0013\u0010O\u001a\u00020$2\b\u0010P\u001a\u0004\u0018\u00010QH\u0096\u0002J\b\u0010R\u001a\u00020\u000eH\u0016J\u0018\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u000eH\u0016J\b\u0010X\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b5\u0010.R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010.R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010.R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\b>\u00107R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\bB\u00107R\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bC\u0010.R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148F¢\u0006\u0006\u001a\u0004\bD\u00107R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010FR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00148F¢\u0006\u0006\u001a\u0004\bG\u00107R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010*\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010.R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u00148F¢\u0006\u0006\u001a\u0004\bK\u00107¨\u0006]"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Event;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate;)V", "id", "", "name", "long_description", "event_contracts", "", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "view_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;", "banner_text", "attestation_values", "", "state", "Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;", "tick_size", "description", "timeline", "Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;", "prohibition_rules", "page_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "game_contract_groups", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "url_slugs", RhGcmListenerService.EXTRA_CATEGORY, "prepack_contract_group", "supports_combos", "", "is_live", "props_contract_group_sections_v2", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "event_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;", "parent_event_id", "props_contract_group_sections", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getLong_description", "getEvent_contracts", "()Ljava/util/Map;", "getView_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;", "getBanner_text", "getAttestation_values", "()Ljava/util/List;", "getState", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;", "getTick_size", "getDescription", "getTimeline", "()Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;", "getProhibition_rules", "getPage_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "getGame_contract_groups", "getUrl_slugs", "getCategory", "getPrepack_contract_group", "getSupports_combos", "()Z", "getProps_contract_group_sections_v2", "getEvent_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;", "getParent_event_id", "getProps_contract_group_sections", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EventDto implements Dto3<Event>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventDto, Event>> binaryBase64Serializer$delegate;
    private static final EventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getLong_description() {
        return this.surrogate.getLong_description();
    }

    public final Map<Integer, EventContractDto> getEvent_contracts() {
        return this.surrogate.getEvent_contracts();
    }

    public final EventViewModeDto getView_mode() {
        return this.surrogate.getView_mode();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final List<String> getAttestation_values() {
        return this.surrogate.getAttestation_values();
    }

    public final ArsenalEventStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getTick_size() {
        return this.surrogate.getTick_size();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final TimelineDto getTimeline() {
        return this.surrogate.getTimeline();
    }

    public final List<String> getProhibition_rules() {
        return this.surrogate.getProhibition_rules();
    }

    public final PageTypeDto getPage_type() {
        return this.surrogate.getPage_type();
    }

    public final List<ContractGroupDto> getGame_contract_groups() {
        return this.surrogate.getGame_contract_groups();
    }

    public final List<String> getUrl_slugs() {
        return this.surrogate.getUrl_slugs();
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final List<ContractGroupDto> getPrepack_contract_group() {
        return this.surrogate.getPrepack_contract_group();
    }

    public final boolean getSupports_combos() {
        return this.surrogate.getSupports_combos();
    }

    public final boolean is_live() {
        return this.surrogate.is_live();
    }

    public final List<ContractGroupSectionDto> getProps_contract_group_sections_v2() {
        return this.surrogate.getProps_contract_group_sections_v2();
    }

    public final EventTypeDto getEvent_type() {
        return this.surrogate.getEvent_type();
    }

    public final String getParent_event_id() {
        return this.surrogate.getParent_event_id();
    }

    public final List<ContractGroupSectionDto> getProps_contract_group_sections() {
        return this.surrogate.getProps_contract_group_sections();
    }

    public /* synthetic */ EventDto(String str, String str2, String str3, Map map, EventViewModeDto eventViewModeDto, String str4, List list, ArsenalEventStateDto arsenalEventStateDto, String str5, String str6, TimelineDto timelineDto, List list2, PageTypeDto pageTypeDto, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventTypeDto eventTypeDto, String str8, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? EventViewModeDto.INSTANCE.getZeroValue() : eventViewModeDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ArsenalEventStateDto.INSTANCE.getZeroValue() : arsenalEventStateDto, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? null : timelineDto, (i & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i & 4096) != 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto, (i & 8192) != 0 ? CollectionsKt.emptyList() : list3, (i & 16384) != 0 ? CollectionsKt.emptyList() : list4, (i & 32768) == 0 ? str7 : "", (i & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i & 131072) != 0 ? false : z, (i & 262144) == 0 ? z2 : false, (i & 524288) != 0 ? CollectionsKt.emptyList() : list6, (i & 1048576) != 0 ? null : eventTypeDto, (i & 2097152) != 0 ? null : str8, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventDto(String id, String name, String str, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, String str2, List<String> attestation_values, ArsenalEventStateDto state, String tick_size, String description, TimelineDto timelineDto, List<String> prohibition_rules, PageTypeDto page_type, List<ContractGroupDto> game_contract_groups, List<String> url_slugs, String category, List<ContractGroupDto> prepack_contract_group, boolean z, boolean z2, List<ContractGroupSectionDto> props_contract_group_sections_v2, EventTypeDto eventTypeDto, String str3, List<ContractGroupSectionDto> props_contract_group_sections) {
        this(new Surrogate(id, name, str, event_contracts, view_mode, str2, attestation_values, state, tick_size, description, timelineDto, prohibition_rules, page_type, game_contract_groups, url_slugs, category, prepack_contract_group, z, z2, props_contract_group_sections_v2, eventTypeDto, str3, props_contract_group_sections));
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
    }

    public static /* synthetic */ EventDto copy$default(EventDto eventDto, String str, String str2, String str3, Map map, EventViewModeDto eventViewModeDto, String str4, List list, ArsenalEventStateDto arsenalEventStateDto, String str5, String str6, TimelineDto timelineDto, List list2, PageTypeDto pageTypeDto, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventTypeDto eventTypeDto, String str8, List list7, int i, Object obj) {
        List props_contract_group_sections;
        String str9;
        String id = (i & 1) != 0 ? eventDto.surrogate.getId() : str;
        String name = (i & 2) != 0 ? eventDto.surrogate.getName() : str2;
        String long_description = (i & 4) != 0 ? eventDto.surrogate.getLong_description() : str3;
        Map event_contracts = (i & 8) != 0 ? eventDto.surrogate.getEvent_contracts() : map;
        EventViewModeDto view_mode = (i & 16) != 0 ? eventDto.surrogate.getView_mode() : eventViewModeDto;
        String banner_text = (i & 32) != 0 ? eventDto.surrogate.getBanner_text() : str4;
        List attestation_values = (i & 64) != 0 ? eventDto.surrogate.getAttestation_values() : list;
        ArsenalEventStateDto state = (i & 128) != 0 ? eventDto.surrogate.getState() : arsenalEventStateDto;
        String tick_size = (i & 256) != 0 ? eventDto.surrogate.getTick_size() : str5;
        String description = (i & 512) != 0 ? eventDto.surrogate.getDescription() : str6;
        TimelineDto timeline = (i & 1024) != 0 ? eventDto.surrogate.getTimeline() : timelineDto;
        List prohibition_rules = (i & 2048) != 0 ? eventDto.surrogate.getProhibition_rules() : list2;
        PageTypeDto page_type = (i & 4096) != 0 ? eventDto.surrogate.getPage_type() : pageTypeDto;
        List game_contract_groups = (i & 8192) != 0 ? eventDto.surrogate.getGame_contract_groups() : list3;
        String str10 = id;
        List url_slugs = (i & 16384) != 0 ? eventDto.surrogate.getUrl_slugs() : list4;
        String category = (i & 32768) != 0 ? eventDto.surrogate.getCategory() : str7;
        List prepack_contract_group = (i & 65536) != 0 ? eventDto.surrogate.getPrepack_contract_group() : list5;
        boolean supports_combos = (i & 131072) != 0 ? eventDto.surrogate.getSupports_combos() : z;
        boolean zIs_live = (i & 262144) != 0 ? eventDto.surrogate.is_live() : z2;
        List props_contract_group_sections_v2 = (i & 524288) != 0 ? eventDto.surrogate.getProps_contract_group_sections_v2() : list6;
        EventTypeDto event_type = (i & 1048576) != 0 ? eventDto.surrogate.getEvent_type() : eventTypeDto;
        String parent_event_id = (i & 2097152) != 0 ? eventDto.surrogate.getParent_event_id() : str8;
        if ((i & 4194304) != 0) {
            str9 = parent_event_id;
            props_contract_group_sections = eventDto.surrogate.getProps_contract_group_sections();
        } else {
            props_contract_group_sections = list7;
            str9 = parent_event_id;
        }
        return eventDto.copy(str10, name, long_description, event_contracts, view_mode, banner_text, attestation_values, state, tick_size, description, timeline, prohibition_rules, page_type, game_contract_groups, url_slugs, category, prepack_contract_group, supports_combos, zIs_live, props_contract_group_sections_v2, event_type, str9, props_contract_group_sections);
    }

    public final EventDto copy(String id, String name, String long_description, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, String banner_text, List<String> attestation_values, ArsenalEventStateDto state, String tick_size, String description, TimelineDto timeline, List<String> prohibition_rules, PageTypeDto page_type, List<ContractGroupDto> game_contract_groups, List<String> url_slugs, String category, List<ContractGroupDto> prepack_contract_group, boolean supports_combos, boolean is_live, List<ContractGroupSectionDto> props_contract_group_sections_v2, EventTypeDto event_type, String parent_event_id, List<ContractGroupSectionDto> props_contract_group_sections) {
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
        return new EventDto(new Surrogate(id, name, long_description, event_contracts, view_mode, banner_text, attestation_values, state, tick_size, description, timeline, prohibition_rules, page_type, game_contract_groups, url_slugs, category, prepack_contract_group, supports_combos, is_live, props_contract_group_sections_v2, event_type, parent_event_id, props_contract_group_sections));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Event toProto() {
        String id = this.surrogate.getId();
        String name = this.surrogate.getName();
        String long_description = this.surrogate.getLong_description();
        Set<Map.Entry<Integer, EventContractDto>> setEntrySet = this.surrogate.getEvent_contracts().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(((Number) entry.getKey()).intValue()), ((EventContractDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        EventViewMode eventViewMode = (EventViewMode) this.surrogate.getView_mode().toProto();
        String banner_text = this.surrogate.getBanner_text();
        List<String> attestation_values = this.surrogate.getAttestation_values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_values, 10));
        Iterator<T> it2 = attestation_values.iterator();
        while (it2.hasNext()) {
            arrayList.add((String) it2.next());
        }
        ArsenalEventState arsenalEventState = (ArsenalEventState) this.surrogate.getState().toProto();
        String tick_size = this.surrogate.getTick_size();
        String description = this.surrogate.getDescription();
        TimelineDto timeline = this.surrogate.getTimeline();
        Timeline proto = timeline != null ? timeline.toProto() : null;
        List<String> prohibition_rules = this.surrogate.getProhibition_rules();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prohibition_rules, 10));
        Iterator<T> it3 = prohibition_rules.iterator();
        while (it3.hasNext()) {
            arrayList2.add((String) it3.next());
        }
        PageType pageType = (PageType) this.surrogate.getPage_type().toProto();
        List<ContractGroupDto> game_contract_groups = this.surrogate.getGame_contract_groups();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(game_contract_groups, 10));
        Iterator<T> it4 = game_contract_groups.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((ContractGroupDto) it4.next()).toProto());
        }
        List<String> url_slugs = this.surrogate.getUrl_slugs();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(url_slugs, 10));
        Iterator<T> it5 = url_slugs.iterator();
        while (it5.hasNext()) {
            arrayList4.add((String) it5.next());
        }
        String category = this.surrogate.getCategory();
        List<ContractGroupDto> prepack_contract_group = this.surrogate.getPrepack_contract_group();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prepack_contract_group, 10));
        Iterator<T> it6 = prepack_contract_group.iterator();
        while (it6.hasNext()) {
            arrayList5.add(((ContractGroupDto) it6.next()).toProto());
        }
        boolean supports_combos = this.surrogate.getSupports_combos();
        boolean zIs_live = this.surrogate.is_live();
        List<ContractGroupSectionDto> props_contract_group_sections_v2 = this.surrogate.getProps_contract_group_sections_v2();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(props_contract_group_sections_v2, 10));
        Iterator<T> it7 = props_contract_group_sections_v2.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((ContractGroupSectionDto) it7.next()).toProto());
        }
        EventTypeDto event_type = this.surrogate.getEvent_type();
        EventType eventType = event_type != null ? (EventType) event_type.toProto() : null;
        String parent_event_id = this.surrogate.getParent_event_id();
        List<ContractGroupSectionDto> props_contract_group_sections = this.surrogate.getProps_contract_group_sections();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(props_contract_group_sections, 10));
        Iterator<T> it8 = props_contract_group_sections.iterator();
        while (it8.hasNext()) {
            arrayList7.add(((ContractGroupSectionDto) it8.next()).toProto());
        }
        return new Event(id, name, long_description, linkedHashMap, eventViewMode, banner_text, arrayList, arsenalEventState, tick_size, description, proto, arrayList2, pageType, arrayList3, arrayList4, category, arrayList5, supports_combos, zIs_live, arrayList6, eventType, parent_event_id, arrayList7, null, 8388608, null);
    }

    public String toString() {
        return "[EventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventDto) && Intrinsics.areEqual(((EventDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008b\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001B¼\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0011\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u0011¢\u0006\u0004\b)\u0010*B³\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0011\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0011\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0011\u0012\b\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b)\u0010.J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J$\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u0010j\u001a\u00020\u000eHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010m\u001a\u00020\u0013HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010r\u001a\u00020\u001aHÆ\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011HÆ\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011HÆ\u0003J\t\u0010w\u001a\u00020!HÆ\u0003J\t\u0010x\u001a\u00020!HÆ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020$0\u0011HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020$0\u0011HÆ\u0003J¾\u0002\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u0011HÆ\u0001J\u0013\u0010~\u001a\u00020!2\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0080\u0001\u001a\u00020\bHÖ\u0001J\n\u0010\u0081\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00002\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0001¢\u0006\u0003\b\u0089\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00100\u001a\u0004\b6\u00102R7\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u00100\u001a\u0004\b8\u00109R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u00100\u001a\u0004\b>\u00102R\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00100\u001a\u0004\bC\u0010DR\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u00100\u001a\u0004\bF\u00102R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u00100\u001a\u0004\bH\u00102R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u00100\u001a\u0004\bJ\u0010KR\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u00100\u001a\u0004\bM\u0010AR\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00100\u001a\u0004\bO\u0010PR\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u00100\u001a\u0004\bR\u0010AR\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u00100\u001a\u0004\bT\u0010AR\u001c\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u00100\u001a\u0004\bV\u00102R\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u00100\u001a\u0004\bX\u0010AR\u001c\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u00100\u001a\u0004\bZ\u0010[R\u001c\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u00100\u001a\u0004\b\"\u0010[R\"\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00100\u001a\u0004\b^\u0010AR\u001e\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u00100\u001a\u0004\b`\u0010aR\u001e\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u00100\u001a\u0004\bc\u00102R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u00100\u001a\u0004\be\u0010A¨\u0006\u008c\u0001"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate;", "", "id", "", "name", "long_description", "event_contracts", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32MapKeySerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "view_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;", "banner_text", "attestation_values", "", "state", "Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;", "tick_size", "description", "timeline", "Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;", "prohibition_rules", "page_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "game_contract_groups", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "url_slugs", RhGcmListenerService.EXTRA_CATEGORY, "prepack_contract_group", "supports_combos", "", "is_live", "props_contract_group_sections_v2", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "event_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;", "parent_event_id", "props_contract_group_sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;Ljava/lang/String;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "getLong_description$annotations", "getLong_description", "getEvent_contracts$annotations", "getEvent_contracts", "()Ljava/util/Map;", "getView_mode$annotations", "getView_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewModeDto;", "getBanner_text$annotations", "getBanner_text", "getAttestation_values$annotations", "getAttestation_values", "()Ljava/util/List;", "getState$annotations", "getState", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ArsenalEventStateDto;", "getTick_size$annotations", "getTick_size", "getDescription$annotations", "getDescription", "getTimeline$annotations", "getTimeline", "()Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineDto;", "getProhibition_rules$annotations", "getProhibition_rules", "getPage_type$annotations", "getPage_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/PageTypeDto;", "getGame_contract_groups$annotations", "getGame_contract_groups", "getUrl_slugs$annotations", "getUrl_slugs", "getCategory$annotations", "getCategory", "getPrepack_contract_group$annotations", "getPrepack_contract_group", "getSupports_combos$annotations", "getSupports_combos", "()Z", "is_live$annotations", "getProps_contract_group_sections_v2$annotations", "getProps_contract_group_sections_v2", "getEvent_type$annotations", "getEvent_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventTypeDto;", "getParent_event_id$annotations", "getParent_event_id", "getProps_contract_group_sections$annotations", "getProps_contract_group_sections", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> attestation_values;
        private final String banner_text;
        private final String category;
        private final String description;
        private final Map<Integer, EventContractDto> event_contracts;
        private final EventTypeDto event_type;
        private final List<ContractGroupDto> game_contract_groups;
        private final String id;
        private final boolean is_live;
        private final String long_description;
        private final String name;
        private final PageTypeDto page_type;
        private final String parent_event_id;
        private final List<ContractGroupDto> prepack_contract_group;
        private final List<String> prohibition_rules;
        private final List<ContractGroupSectionDto> props_contract_group_sections;
        private final List<ContractGroupSectionDto> props_contract_group_sections_v2;
        private final ArsenalEventStateDto state;
        private final boolean supports_combos;
        private final String tick_size;
        private final TimelineDto timeline;
        private final List<String> url_slugs;
        private final EventViewModeDto view_mode;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Map) null, (EventViewModeDto) null, (String) null, (List) null, (ArsenalEventStateDto) null, (String) null, (String) null, (TimelineDto) null, (List) null, (PageTypeDto) null, (List) null, (List) null, (String) null, (List) null, false, false, (List) null, (EventTypeDto) null, (String) null, (List) null, 8388607, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(SignedIntAsStringSerializer.INSTANCE, EventContractDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(ContractGroupDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
            return new ArrayListSerializer(ContractGroupDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
            return new ArrayListSerializer(ContractGroupSectionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
            return new ArrayListSerializer(ContractGroupSectionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, Map map, EventViewModeDto eventViewModeDto, String str4, List list, ArsenalEventStateDto arsenalEventStateDto, String str5, String str6, TimelineDto timelineDto, List list2, PageTypeDto pageTypeDto, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventTypeDto eventTypeDto, String str8, List list7, int i, Object obj) {
            List list8;
            String str9;
            String str10 = (i & 1) != 0 ? surrogate.id : str;
            String str11 = (i & 2) != 0 ? surrogate.name : str2;
            String str12 = (i & 4) != 0 ? surrogate.long_description : str3;
            Map map2 = (i & 8) != 0 ? surrogate.event_contracts : map;
            EventViewModeDto eventViewModeDto2 = (i & 16) != 0 ? surrogate.view_mode : eventViewModeDto;
            String str13 = (i & 32) != 0 ? surrogate.banner_text : str4;
            List list9 = (i & 64) != 0 ? surrogate.attestation_values : list;
            ArsenalEventStateDto arsenalEventStateDto2 = (i & 128) != 0 ? surrogate.state : arsenalEventStateDto;
            String str14 = (i & 256) != 0 ? surrogate.tick_size : str5;
            String str15 = (i & 512) != 0 ? surrogate.description : str6;
            TimelineDto timelineDto2 = (i & 1024) != 0 ? surrogate.timeline : timelineDto;
            List list10 = (i & 2048) != 0 ? surrogate.prohibition_rules : list2;
            PageTypeDto pageTypeDto2 = (i & 4096) != 0 ? surrogate.page_type : pageTypeDto;
            List list11 = (i & 8192) != 0 ? surrogate.game_contract_groups : list3;
            String str16 = str10;
            List list12 = (i & 16384) != 0 ? surrogate.url_slugs : list4;
            String str17 = (i & 32768) != 0 ? surrogate.category : str7;
            List list13 = (i & 65536) != 0 ? surrogate.prepack_contract_group : list5;
            boolean z3 = (i & 131072) != 0 ? surrogate.supports_combos : z;
            boolean z4 = (i & 262144) != 0 ? surrogate.is_live : z2;
            List list14 = (i & 524288) != 0 ? surrogate.props_contract_group_sections_v2 : list6;
            EventTypeDto eventTypeDto2 = (i & 1048576) != 0 ? surrogate.event_type : eventTypeDto;
            String str18 = (i & 2097152) != 0 ? surrogate.parent_event_id : str8;
            if ((i & 4194304) != 0) {
                str9 = str18;
                list8 = surrogate.props_contract_group_sections;
            } else {
                list8 = list7;
                str9 = str18;
            }
            return surrogate.copy(str16, str11, str12, map2, eventViewModeDto2, str13, list9, arsenalEventStateDto2, str14, str15, timelineDto2, list10, pageTypeDto2, list11, list12, str17, list13, z3, z4, list14, eventTypeDto2, str9, list8);
        }

        @SerialName("attestationValues")
        @JsonAnnotations2(names = {"attestation_values"})
        public static /* synthetic */ void getAttestation_values$annotations() {
        }

        @SerialName("bannerText")
        @JsonAnnotations2(names = {"banner_text"})
        public static /* synthetic */ void getBanner_text$annotations() {
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("eventContracts")
        @JsonAnnotations2(names = {"event_contracts"})
        public static /* synthetic */ void getEvent_contracts$annotations() {
        }

        @SerialName("eventType")
        @JsonAnnotations2(names = {"event_type"})
        public static /* synthetic */ void getEvent_type$annotations() {
        }

        @SerialName("gameContractGroups")
        @JsonAnnotations2(names = {"game_contract_groups"})
        public static /* synthetic */ void getGame_contract_groups$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("longDescription")
        @JsonAnnotations2(names = {"long_description"})
        public static /* synthetic */ void getLong_description$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("pageType")
        @JsonAnnotations2(names = {"page_type"})
        public static /* synthetic */ void getPage_type$annotations() {
        }

        @SerialName("parentEventId")
        @JsonAnnotations2(names = {"parent_event_id"})
        public static /* synthetic */ void getParent_event_id$annotations() {
        }

        @SerialName("prepackContractGroup")
        @JsonAnnotations2(names = {"prepack_contract_group"})
        public static /* synthetic */ void getPrepack_contract_group$annotations() {
        }

        @SerialName("prohibitionRules")
        @JsonAnnotations2(names = {"prohibition_rules"})
        public static /* synthetic */ void getProhibition_rules$annotations() {
        }

        @SerialName("propsContractGroupSections")
        @JsonAnnotations2(names = {"props_contract_group_sections"})
        public static /* synthetic */ void getProps_contract_group_sections$annotations() {
        }

        @SerialName("propsContractGroupSectionsV2")
        @JsonAnnotations2(names = {"props_contract_group_sections_v2"})
        public static /* synthetic */ void getProps_contract_group_sections_v2$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("supportsCombos")
        @JsonAnnotations2(names = {"supports_combos"})
        public static /* synthetic */ void getSupports_combos$annotations() {
        }

        @SerialName("tickSize")
        @JsonAnnotations2(names = {"tick_size"})
        public static /* synthetic */ void getTick_size$annotations() {
        }

        @SerialName("timeline")
        @JsonAnnotations2(names = {"timeline"})
        public static /* synthetic */ void getTimeline$annotations() {
        }

        @SerialName("urlSlugs")
        @JsonAnnotations2(names = {"url_slugs"})
        public static /* synthetic */ void getUrl_slugs$annotations() {
        }

        @SerialName("viewMode")
        @JsonAnnotations2(names = {"view_mode"})
        public static /* synthetic */ void getView_mode$annotations() {
        }

        @SerialName("isLive")
        @JsonAnnotations2(names = {"is_live"})
        public static /* synthetic */ void is_live$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component11, reason: from getter */
        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final List<String> component12() {
            return this.prohibition_rules;
        }

        /* renamed from: component13, reason: from getter */
        public final PageTypeDto getPage_type() {
            return this.page_type;
        }

        public final List<ContractGroupDto> component14() {
            return this.game_contract_groups;
        }

        public final List<String> component15() {
            return this.url_slugs;
        }

        /* renamed from: component16, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public final List<ContractGroupDto> component17() {
            return this.prepack_contract_group;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getSupports_combos() {
            return this.supports_combos;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getIs_live() {
            return this.is_live;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<ContractGroupSectionDto> component20() {
            return this.props_contract_group_sections_v2;
        }

        /* renamed from: component21, reason: from getter */
        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        /* renamed from: component22, reason: from getter */
        public final String getParent_event_id() {
            return this.parent_event_id;
        }

        public final List<ContractGroupSectionDto> component23() {
            return this.props_contract_group_sections;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLong_description() {
            return this.long_description;
        }

        public final Map<Integer, EventContractDto> component4() {
            return this.event_contracts;
        }

        /* renamed from: component5, reason: from getter */
        public final EventViewModeDto getView_mode() {
            return this.view_mode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBanner_text() {
            return this.banner_text;
        }

        public final List<String> component7() {
            return this.attestation_values;
        }

        /* renamed from: component8, reason: from getter */
        public final ArsenalEventStateDto getState() {
            return this.state;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTick_size() {
            return this.tick_size;
        }

        public final Surrogate copy(String id, String name, String long_description, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, String banner_text, List<String> attestation_values, ArsenalEventStateDto state, String tick_size, String description, TimelineDto timeline, List<String> prohibition_rules, PageTypeDto page_type, List<ContractGroupDto> game_contract_groups, List<String> url_slugs, String category, List<ContractGroupDto> prepack_contract_group, boolean supports_combos, boolean is_live, List<ContractGroupSectionDto> props_contract_group_sections_v2, EventTypeDto event_type, String parent_event_id, List<ContractGroupSectionDto> props_contract_group_sections) {
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
            return new Surrogate(id, name, long_description, event_contracts, view_mode, banner_text, attestation_values, state, tick_size, description, timeline, prohibition_rules, page_type, game_contract_groups, url_slugs, category, prepack_contract_group, supports_combos, is_live, props_contract_group_sections_v2, event_type, parent_event_id, props_contract_group_sections);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.long_description, surrogate.long_description) && Intrinsics.areEqual(this.event_contracts, surrogate.event_contracts) && this.view_mode == surrogate.view_mode && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.attestation_values, surrogate.attestation_values) && this.state == surrogate.state && Intrinsics.areEqual(this.tick_size, surrogate.tick_size) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.prohibition_rules, surrogate.prohibition_rules) && this.page_type == surrogate.page_type && Intrinsics.areEqual(this.game_contract_groups, surrogate.game_contract_groups) && Intrinsics.areEqual(this.url_slugs, surrogate.url_slugs) && Intrinsics.areEqual(this.category, surrogate.category) && Intrinsics.areEqual(this.prepack_contract_group, surrogate.prepack_contract_group) && this.supports_combos == surrogate.supports_combos && this.is_live == surrogate.is_live && Intrinsics.areEqual(this.props_contract_group_sections_v2, surrogate.props_contract_group_sections_v2) && this.event_type == surrogate.event_type && Intrinsics.areEqual(this.parent_event_id, surrogate.parent_event_id) && Intrinsics.areEqual(this.props_contract_group_sections, surrogate.props_contract_group_sections);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.long_description;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.event_contracts.hashCode()) * 31) + this.view_mode.hashCode()) * 31;
            String str2 = this.banner_text;
            int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.attestation_values.hashCode()) * 31) + this.state.hashCode()) * 31) + this.tick_size.hashCode()) * 31) + this.description.hashCode()) * 31;
            TimelineDto timelineDto = this.timeline;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31) + this.prohibition_rules.hashCode()) * 31) + this.page_type.hashCode()) * 31) + this.game_contract_groups.hashCode()) * 31) + this.url_slugs.hashCode()) * 31) + this.category.hashCode()) * 31) + this.prepack_contract_group.hashCode()) * 31) + Boolean.hashCode(this.supports_combos)) * 31) + Boolean.hashCode(this.is_live)) * 31) + this.props_contract_group_sections_v2.hashCode()) * 31;
            EventTypeDto eventTypeDto = this.event_type;
            int iHashCode5 = (iHashCode4 + (eventTypeDto == null ? 0 : eventTypeDto.hashCode())) * 31;
            String str3 = this.parent_event_id;
            return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.props_contract_group_sections.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", long_description=" + this.long_description + ", event_contracts=" + this.event_contracts + ", view_mode=" + this.view_mode + ", banner_text=" + this.banner_text + ", attestation_values=" + this.attestation_values + ", state=" + this.state + ", tick_size=" + this.tick_size + ", description=" + this.description + ", timeline=" + this.timeline + ", prohibition_rules=" + this.prohibition_rules + ", page_type=" + this.page_type + ", game_contract_groups=" + this.game_contract_groups + ", url_slugs=" + this.url_slugs + ", category=" + this.category + ", prepack_contract_group=" + this.prepack_contract_group + ", supports_combos=" + this.supports_combos + ", is_live=" + this.is_live + ", props_contract_group_sections_v2=" + this.props_contract_group_sections_v2 + ", event_type=" + this.event_type + ", parent_event_id=" + this.parent_event_id + ", props_contract_group_sections=" + this.props_contract_group_sections + ")";
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventDto4.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$3();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$4();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$5();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$6();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Map map, EventViewModeDto eventViewModeDto, String str4, List list, ArsenalEventStateDto arsenalEventStateDto, String str5, String str6, TimelineDto timelineDto, List list2, PageTypeDto pageTypeDto, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventTypeDto eventTypeDto, String str8, List list7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.long_description = null;
            } else {
                this.long_description = str3;
            }
            if ((i & 8) == 0) {
                this.event_contracts = MapsKt.emptyMap();
            } else {
                this.event_contracts = map;
            }
            if ((i & 16) == 0) {
                this.view_mode = EventViewModeDto.INSTANCE.getZeroValue();
            } else {
                this.view_mode = eventViewModeDto;
            }
            if ((i & 32) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str4;
            }
            if ((i & 64) == 0) {
                this.attestation_values = CollectionsKt.emptyList();
            } else {
                this.attestation_values = list;
            }
            if ((i & 128) == 0) {
                this.state = ArsenalEventStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = arsenalEventStateDto;
            }
            if ((i & 256) == 0) {
                this.tick_size = "";
            } else {
                this.tick_size = str5;
            }
            if ((i & 512) == 0) {
                this.description = "";
            } else {
                this.description = str6;
            }
            if ((i & 1024) == 0) {
                this.timeline = null;
            } else {
                this.timeline = timelineDto;
            }
            if ((i & 2048) == 0) {
                this.prohibition_rules = CollectionsKt.emptyList();
            } else {
                this.prohibition_rules = list2;
            }
            this.page_type = (i & 4096) == 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto;
            this.game_contract_groups = (i & 8192) == 0 ? CollectionsKt.emptyList() : list3;
            this.url_slugs = (i & 16384) == 0 ? CollectionsKt.emptyList() : list4;
            if ((32768 & i) == 0) {
                this.category = "";
            } else {
                this.category = str7;
            }
            this.prepack_contract_group = (65536 & i) == 0 ? CollectionsKt.emptyList() : list5;
            if ((131072 & i) == 0) {
                this.supports_combos = false;
            } else {
                this.supports_combos = z;
            }
            if ((262144 & i) == 0) {
                this.is_live = false;
            } else {
                this.is_live = z2;
            }
            this.props_contract_group_sections_v2 = (524288 & i) == 0 ? CollectionsKt.emptyList() : list6;
            if ((1048576 & i) == 0) {
                this.event_type = null;
            } else {
                this.event_type = eventTypeDto;
            }
            if ((2097152 & i) == 0) {
                this.parent_event_id = null;
            } else {
                this.parent_event_id = str8;
            }
            this.props_contract_group_sections = (i & 4194304) == 0 ? CollectionsKt.emptyList() : list7;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            String str = self.long_description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.event_contracts, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.event_contracts);
            }
            if (self.view_mode != EventViewModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, EventViewModeDto.Serializer.INSTANCE, self.view_mode);
            }
            String str2 = self.banner_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str2);
            }
            if (!Intrinsics.areEqual(self.attestation_values, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.attestation_values);
            }
            if (self.state != ArsenalEventStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, ArsenalEventStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.tick_size, "")) {
                output.encodeStringElement(serialDesc, 8, self.tick_size);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 9, self.description);
            }
            TimelineDto timelineDto = self.timeline;
            if (timelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, TimelineDto.Serializer.INSTANCE, timelineDto);
            }
            if (!Intrinsics.areEqual(self.prohibition_rules, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.prohibition_rules);
            }
            if (self.page_type != PageTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, PageTypeDto.Serializer.INSTANCE, self.page_type);
            }
            if (!Intrinsics.areEqual(self.game_contract_groups, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 13, lazyArr[13].getValue(), self.game_contract_groups);
            }
            if (!Intrinsics.areEqual(self.url_slugs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.url_slugs);
            }
            if (!Intrinsics.areEqual(self.category, "")) {
                output.encodeStringElement(serialDesc, 15, self.category);
            }
            if (!Intrinsics.areEqual(self.prepack_contract_group, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.prepack_contract_group);
            }
            boolean z = self.supports_combos;
            if (z) {
                output.encodeBooleanElement(serialDesc, 17, z);
            }
            boolean z2 = self.is_live;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 18, z2);
            }
            if (!Intrinsics.areEqual(self.props_contract_group_sections_v2, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self.props_contract_group_sections_v2);
            }
            EventTypeDto eventTypeDto = self.event_type;
            if (eventTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, EventTypeDto.Serializer.INSTANCE, eventTypeDto);
            }
            String str3 = self.parent_event_id;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, str3);
            }
            if (Intrinsics.areEqual(self.props_contract_group_sections, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.props_contract_group_sections);
        }

        public Surrogate(String id, String name, String str, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, String str2, List<String> attestation_values, ArsenalEventStateDto state, String tick_size, String description, TimelineDto timelineDto, List<String> prohibition_rules, PageTypeDto page_type, List<ContractGroupDto> game_contract_groups, List<String> url_slugs, String category, List<ContractGroupDto> prepack_contract_group, boolean z, boolean z2, List<ContractGroupSectionDto> props_contract_group_sections_v2, EventTypeDto eventTypeDto, String str3, List<ContractGroupSectionDto> props_contract_group_sections) {
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
            this.id = id;
            this.name = name;
            this.long_description = str;
            this.event_contracts = event_contracts;
            this.view_mode = view_mode;
            this.banner_text = str2;
            this.attestation_values = attestation_values;
            this.state = state;
            this.tick_size = tick_size;
            this.description = description;
            this.timeline = timelineDto;
            this.prohibition_rules = prohibition_rules;
            this.page_type = page_type;
            this.game_contract_groups = game_contract_groups;
            this.url_slugs = url_slugs;
            this.category = category;
            this.prepack_contract_group = prepack_contract_group;
            this.supports_combos = z;
            this.is_live = z2;
            this.props_contract_group_sections_v2 = props_contract_group_sections_v2;
            this.event_type = eventTypeDto;
            this.parent_event_id = str3;
            this.props_contract_group_sections = props_contract_group_sections;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Map map, EventViewModeDto eventViewModeDto, String str4, List list, ArsenalEventStateDto arsenalEventStateDto, String str5, String str6, TimelineDto timelineDto, List list2, PageTypeDto pageTypeDto, List list3, List list4, String str7, List list5, boolean z, boolean z2, List list6, EventTypeDto eventTypeDto, String str8, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? EventViewModeDto.INSTANCE.getZeroValue() : eventViewModeDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ArsenalEventStateDto.INSTANCE.getZeroValue() : arsenalEventStateDto, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? null : timelineDto, (i & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i & 4096) != 0 ? PageTypeDto.INSTANCE.getZeroValue() : pageTypeDto, (i & 8192) != 0 ? CollectionsKt.emptyList() : list3, (i & 16384) != 0 ? CollectionsKt.emptyList() : list4, (i & 32768) == 0 ? str7 : "", (i & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i & 131072) != 0 ? false : z, (i & 262144) == 0 ? z2 : false, (i & 524288) != 0 ? CollectionsKt.emptyList() : list6, (i & 1048576) != 0 ? null : eventTypeDto, (i & 2097152) != 0 ? null : str8, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list7);
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

        public final Map<Integer, EventContractDto> getEvent_contracts() {
            return this.event_contracts;
        }

        public final EventViewModeDto getView_mode() {
            return this.view_mode;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final List<String> getAttestation_values() {
            return this.attestation_values;
        }

        public final ArsenalEventStateDto getState() {
            return this.state;
        }

        public final String getTick_size() {
            return this.tick_size;
        }

        public final String getDescription() {
            return this.description;
        }

        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final List<String> getProhibition_rules() {
            return this.prohibition_rules;
        }

        public final PageTypeDto getPage_type() {
            return this.page_type;
        }

        public final List<ContractGroupDto> getGame_contract_groups() {
            return this.game_contract_groups;
        }

        public final List<String> getUrl_slugs() {
            return this.url_slugs;
        }

        public final String getCategory() {
            return this.category;
        }

        public final List<ContractGroupDto> getPrepack_contract_group() {
            return this.prepack_contract_group;
        }

        public final boolean getSupports_combos() {
            return this.supports_combos;
        }

        public final boolean is_live() {
            return this.is_live;
        }

        public final List<ContractGroupSectionDto> getProps_contract_group_sections_v2() {
            return this.props_contract_group_sections_v2;
        }

        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        public final String getParent_event_id() {
            return this.parent_event_id;
        }

        public final List<ContractGroupSectionDto> getProps_contract_group_sections() {
            return this.props_contract_group_sections;
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Event;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventDto, Event> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventDto> getBinaryBase64Serializer() {
            return (KSerializer) EventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Event> getProtoAdapter() {
            return Event.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventDto getZeroValue() {
            return EventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventDto fromProto(Event proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String name = proto.getName();
            String long_description = proto.getLong_description();
            Set<Map.Entry<Integer, EventContract>> setEntrySet = proto.getEvent_contracts().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(((Number) entry.getKey()).intValue()), EventContractDto.INSTANCE.fromProto((EventContract) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            EventViewModeDto eventViewModeDtoFromProto = EventViewModeDto.INSTANCE.fromProto(proto.getView_mode());
            String banner_text = proto.getBanner_text();
            List<String> attestation_values = proto.getAttestation_values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_values, 10));
            Iterator<T> it2 = attestation_values.iterator();
            while (it2.hasNext()) {
                arrayList.add((String) it2.next());
            }
            ArsenalEventStateDto arsenalEventStateDtoFromProto = ArsenalEventStateDto.INSTANCE.fromProto(proto.getState());
            String tick_size = proto.getTick_size();
            String description = proto.getDescription();
            Timeline timeline = proto.getTimeline();
            TimelineDto timelineDtoFromProto = timeline != null ? TimelineDto.INSTANCE.fromProto(timeline) : null;
            List<String> prohibition_rules = proto.getProhibition_rules();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prohibition_rules, 10));
            Iterator<T> it3 = prohibition_rules.iterator();
            while (it3.hasNext()) {
                arrayList2.add((String) it3.next());
            }
            PageTypeDto pageTypeDtoFromProto = PageTypeDto.INSTANCE.fromProto(proto.getPage_type());
            List<ContractGroup> game_contract_groups = proto.getGame_contract_groups();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(game_contract_groups, 10));
            Iterator<T> it4 = game_contract_groups.iterator();
            while (it4.hasNext()) {
                arrayList3.add(ContractGroupDto.INSTANCE.fromProto((ContractGroup) it4.next()));
            }
            List<String> url_slugs = proto.getUrl_slugs();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(url_slugs, 10));
            Iterator<T> it5 = url_slugs.iterator();
            while (it5.hasNext()) {
                arrayList4.add((String) it5.next());
            }
            String category = proto.getCategory();
            List<ContractGroup> prepack_contract_group = proto.getPrepack_contract_group();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prepack_contract_group, 10));
            Iterator<T> it6 = prepack_contract_group.iterator();
            while (it6.hasNext()) {
                arrayList5.add(ContractGroupDto.INSTANCE.fromProto((ContractGroup) it6.next()));
            }
            boolean supports_combos = proto.getSupports_combos();
            boolean is_live = proto.getIs_live();
            List<ContractGroupSection> props_contract_group_sections_v2 = proto.getProps_contract_group_sections_v2();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(props_contract_group_sections_v2, 10));
            Iterator<T> it7 = props_contract_group_sections_v2.iterator();
            while (it7.hasNext()) {
                arrayList6.add(ContractGroupSectionDto.INSTANCE.fromProto((ContractGroupSection) it7.next()));
            }
            EventType event_type = proto.getEvent_type();
            EventTypeDto eventTypeDtoFromProto = event_type != null ? EventTypeDto.INSTANCE.fromProto(event_type) : null;
            String parent_event_id = proto.getParent_event_id();
            List<ContractGroupSection> props_contract_group_sections = proto.getProps_contract_group_sections();
            EventTypeDto eventTypeDto = eventTypeDtoFromProto;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(props_contract_group_sections, 10));
            for (Iterator it8 = props_contract_group_sections.iterator(); it8.hasNext(); it8 = it8) {
                arrayList7.add(ContractGroupSectionDto.INSTANCE.fromProto((ContractGroupSection) it8.next()));
            }
            return new EventDto(new Surrogate(id, name, long_description, linkedHashMap, eventViewModeDtoFromProto, banner_text, arrayList, arsenalEventStateDtoFromProto, tick_size, description, timelineDtoFromProto, arrayList2, pageTypeDtoFromProto, arrayList3, arrayList4, category, arrayList5, supports_combos, is_live, arrayList6, eventTypeDto, parent_event_id, arrayList7), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventDto.binaryBase64Serializer_delegate$lambda$8();
            }
        });
        zeroValue = new EventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 8388607, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$8() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.Event", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.EventDto";
        }
    }
}
