package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventMDLiveDataBackupDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventRegionDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventRoundDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventStateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventViewModeDto;
import com.robinhood.arsenal.proto.p281v1.idl.TimelineDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsStringSerializer;
import com.singular.sdk.internal.Constants;
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
import rosetta.identi.agreements.AgreementType;
import rosetta.identi.agreements.AgreementTypeDto;

/* compiled from: EventDto.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004YZ[\\B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010#\u001a\u00020\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\b\b\u0002\u0010(\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u0006\u0010*J\u0090\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010#\u001a\u00020\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\b\b\u0002\u0010(\u001a\u00020\u00162\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ\b\u0010L\u001a\u00020\u0002H\u0016J\b\u0010M\u001a\u00020\tH\u0016J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0096\u0002J\b\u0010R\u001a\u00020\u0016H\u0016J\u0018\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0016H\u0016J\b\u0010X\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b=\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\"\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bB\u0010,R\u0011\u0010#\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010$\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bE\u0010,R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8F¢\u0006\u0006\u001a\u0004\bH\u0010<R\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bI\u0010DR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8F¢\u0006\u0006\u001a\u0004\bJ\u0010<¨\u0006]"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Event;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate;)V", "id", "", "name", "series_id", "symbol", "description", "long_description", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;", "tick_size", "timeline", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;", "event_contracts", "", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "view_mode", "Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;", "attestations", "", "Lrosetta/identi/agreements/AgreementTypeDto;", "bracket_id", "region", "Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;", "round", "Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;", "receipt_shortname", Constants.EVENT_INDEX, "banner_text", "md_live_data_backup", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "attestation_values", "series_index", "prohibition_rules", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;Ljava/util/Map;Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;Ljava/util/List;ILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getSeries_id", "getSymbol", "getDescription", "getLong_description", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;", "getTick_size", "getTimeline", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;", "getEvent_contracts", "()Ljava/util/Map;", "getView_mode", "()Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;", "getAttestations", "()Ljava/util/List;", "getBracket_id", "getRegion", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;", "getRound", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;", "getReceipt_shortname", "getEvent_index", "()I", "getBanner_text", "getMd_live_data_backup", "()Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "getAttestation_values", "getSeries_index", "getProhibition_rules", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
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

    public final String getSeries_id() {
        return this.surrogate.getSeries_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getLong_description() {
        return this.surrogate.getLong_description();
    }

    public final EventStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getTick_size() {
        return this.surrogate.getTick_size();
    }

    public final TimelineDto getTimeline() {
        return this.surrogate.getTimeline();
    }

    public final Map<Integer, EventContractDto> getEvent_contracts() {
        return this.surrogate.getEvent_contracts();
    }

    public final EventViewModeDto getView_mode() {
        return this.surrogate.getView_mode();
    }

    public final List<AgreementTypeDto> getAttestations() {
        return this.surrogate.getAttestations();
    }

    public final String getBracket_id() {
        return this.surrogate.getBracket_id();
    }

    public final EventRegionDto getRegion() {
        return this.surrogate.getRegion();
    }

    public final EventRoundDto getRound() {
        return this.surrogate.getRound();
    }

    public final String getReceipt_shortname() {
        return this.surrogate.getReceipt_shortname();
    }

    public final int getEvent_index() {
        return this.surrogate.getEvent_index();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final EventMDLiveDataBackupDto getMd_live_data_backup() {
        return this.surrogate.getMd_live_data_backup();
    }

    public final List<String> getAttestation_values() {
        return this.surrogate.getAttestation_values();
    }

    public final int getSeries_index() {
        return this.surrogate.getSeries_index();
    }

    public final List<String> getProhibition_rules() {
        return this.surrogate.getProhibition_rules();
    }

    public /* synthetic */ EventDto(String str, String str2, String str3, String str4, String str5, String str6, EventStateDto eventStateDto, String str7, TimelineDto timelineDto, Map map, EventViewModeDto eventViewModeDto, List list, String str8, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str9, int i, String str10, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List list2, int i2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? EventStateDto.INSTANCE.getZeroValue() : eventStateDto, (i3 & 128) == 0 ? str7 : "", (i3 & 256) != 0 ? null : timelineDto, (i3 & 512) != 0 ? MapsKt.emptyMap() : map, (i3 & 1024) != 0 ? EventViewModeDto.INSTANCE.getZeroValue() : eventViewModeDto, (i3 & 2048) != 0 ? CollectionsKt.emptyList() : list, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? null : eventRegionDto, (i3 & 16384) != 0 ? null : eventRoundDto, (i3 & 32768) != 0 ? null : str9, (i3 & 65536) != 0 ? 0 : i, (i3 & 131072) != 0 ? null : str10, (i3 & 262144) != 0 ? null : eventMDLiveDataBackupDto, (i3 & 524288) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 1048576) == 0 ? i2 : 0, (i3 & 2097152) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventDto(String id, String name, String series_id, String symbol, String description, String str, EventStateDto state, String tick_size, TimelineDto timelineDto, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, List<? extends AgreementTypeDto> attestations, String str2, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str3, int i, String str4, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List<String> attestation_values, int i2, List<String> prohibition_rules) {
        this(new Surrogate(id, name, series_id, symbol, description, str, state, tick_size, timelineDto, event_contracts, view_mode, attestations, str2, eventRegionDto, eventRoundDto, str3, i, str4, eventMDLiveDataBackupDto, attestation_values, i2, prohibition_rules));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(series_id, "series_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
        Intrinsics.checkNotNullParameter(view_mode, "view_mode");
        Intrinsics.checkNotNullParameter(attestations, "attestations");
        Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
        Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
    }

    public static /* synthetic */ EventDto copy$default(EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, EventStateDto eventStateDto, String str7, TimelineDto timelineDto, Map map, EventViewModeDto eventViewModeDto, List list, String str8, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str9, int i, String str10, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List list2, int i2, List list3, int i3, Object obj) {
        List prohibition_rules;
        int i4;
        String id = (i3 & 1) != 0 ? eventDto.surrogate.getId() : str;
        String name = (i3 & 2) != 0 ? eventDto.surrogate.getName() : str2;
        String series_id = (i3 & 4) != 0 ? eventDto.surrogate.getSeries_id() : str3;
        String symbol = (i3 & 8) != 0 ? eventDto.surrogate.getSymbol() : str4;
        String description = (i3 & 16) != 0 ? eventDto.surrogate.getDescription() : str5;
        String long_description = (i3 & 32) != 0 ? eventDto.surrogate.getLong_description() : str6;
        EventStateDto state = (i3 & 64) != 0 ? eventDto.surrogate.getState() : eventStateDto;
        String tick_size = (i3 & 128) != 0 ? eventDto.surrogate.getTick_size() : str7;
        TimelineDto timeline = (i3 & 256) != 0 ? eventDto.surrogate.getTimeline() : timelineDto;
        Map event_contracts = (i3 & 512) != 0 ? eventDto.surrogate.getEvent_contracts() : map;
        EventViewModeDto view_mode = (i3 & 1024) != 0 ? eventDto.surrogate.getView_mode() : eventViewModeDto;
        List attestations = (i3 & 2048) != 0 ? eventDto.surrogate.getAttestations() : list;
        String bracket_id = (i3 & 4096) != 0 ? eventDto.surrogate.getBracket_id() : str8;
        EventRegionDto region = (i3 & 8192) != 0 ? eventDto.surrogate.getRegion() : eventRegionDto;
        String str11 = id;
        EventRoundDto round = (i3 & 16384) != 0 ? eventDto.surrogate.getRound() : eventRoundDto;
        String receipt_shortname = (i3 & 32768) != 0 ? eventDto.surrogate.getReceipt_shortname() : str9;
        int event_index = (i3 & 65536) != 0 ? eventDto.surrogate.getEvent_index() : i;
        String banner_text = (i3 & 131072) != 0 ? eventDto.surrogate.getBanner_text() : str10;
        EventMDLiveDataBackupDto md_live_data_backup = (i3 & 262144) != 0 ? eventDto.surrogate.getMd_live_data_backup() : eventMDLiveDataBackupDto;
        List attestation_values = (i3 & 524288) != 0 ? eventDto.surrogate.getAttestation_values() : list2;
        int series_index = (i3 & 1048576) != 0 ? eventDto.surrogate.getSeries_index() : i2;
        if ((i3 & 2097152) != 0) {
            i4 = series_index;
            prohibition_rules = eventDto.surrogate.getProhibition_rules();
        } else {
            prohibition_rules = list3;
            i4 = series_index;
        }
        return eventDto.copy(str11, name, series_id, symbol, description, long_description, state, tick_size, timeline, event_contracts, view_mode, attestations, bracket_id, region, round, receipt_shortname, event_index, banner_text, md_live_data_backup, attestation_values, i4, prohibition_rules);
    }

    public final EventDto copy(String id, String name, String series_id, String symbol, String description, String long_description, EventStateDto state, String tick_size, TimelineDto timeline, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, List<? extends AgreementTypeDto> attestations, String bracket_id, EventRegionDto region, EventRoundDto round, String receipt_shortname, int event_index, String banner_text, EventMDLiveDataBackupDto md_live_data_backup, List<String> attestation_values, int series_index, List<String> prohibition_rules) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(series_id, "series_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
        Intrinsics.checkNotNullParameter(view_mode, "view_mode");
        Intrinsics.checkNotNullParameter(attestations, "attestations");
        Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
        Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
        return new EventDto(new Surrogate(id, name, series_id, symbol, description, long_description, state, tick_size, timeline, event_contracts, view_mode, attestations, bracket_id, region, round, receipt_shortname, event_index, banner_text, md_live_data_backup, attestation_values, series_index, prohibition_rules));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Event toProto() {
        String id = this.surrogate.getId();
        String name = this.surrogate.getName();
        String series_id = this.surrogate.getSeries_id();
        String symbol = this.surrogate.getSymbol();
        String description = this.surrogate.getDescription();
        String long_description = this.surrogate.getLong_description();
        EventState eventState = (EventState) this.surrogate.getState().toProto();
        String tick_size = this.surrogate.getTick_size();
        TimelineDto timeline = this.surrogate.getTimeline();
        Timeline proto = timeline != null ? timeline.toProto() : null;
        Set<Map.Entry<Integer, EventContractDto>> setEntrySet = this.surrogate.getEvent_contracts().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(((Number) entry.getKey()).intValue()), ((EventContractDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        EventViewMode eventViewMode = (EventViewMode) this.surrogate.getView_mode().toProto();
        List<AgreementTypeDto> attestations = this.surrogate.getAttestations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestations, 10));
        Iterator<T> it2 = attestations.iterator();
        while (it2.hasNext()) {
            arrayList.add((AgreementType) ((AgreementTypeDto) it2.next()).toProto());
        }
        String bracket_id = this.surrogate.getBracket_id();
        EventRegionDto region = this.surrogate.getRegion();
        EventRegion proto2 = region != null ? region.toProto() : null;
        EventRoundDto round = this.surrogate.getRound();
        EventRound proto3 = round != null ? round.toProto() : null;
        String receipt_shortname = this.surrogate.getReceipt_shortname();
        int event_index = this.surrogate.getEvent_index();
        String banner_text = this.surrogate.getBanner_text();
        EventMDLiveDataBackupDto md_live_data_backup = this.surrogate.getMd_live_data_backup();
        EventMDLiveDataBackup proto4 = md_live_data_backup != null ? md_live_data_backup.toProto() : null;
        List<String> attestation_values = this.surrogate.getAttestation_values();
        EventRegion eventRegion = proto2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_values, 10));
        Iterator<T> it3 = attestation_values.iterator();
        while (it3.hasNext()) {
            arrayList2.add((String) it3.next());
        }
        int series_index = this.surrogate.getSeries_index();
        List<String> prohibition_rules = this.surrogate.getProhibition_rules();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prohibition_rules, 10));
        Iterator<T> it4 = prohibition_rules.iterator();
        while (it4.hasNext()) {
            arrayList3.add((String) it4.next());
        }
        return new Event(id, name, series_id, symbol, description, long_description, eventState, tick_size, proto, linkedHashMap, eventViewMode, arrayList, bracket_id, eventRegion, proto3, receipt_shortname, event_index, banner_text, proto4, arrayList2, series_index, arrayList3, null, 4194304, null);
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
    @Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u0089\u0001\u008a\u0001B¾\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\u0004\u0012\u00020\u00140\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010 \u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0017\b\u0002\u0010&\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b(\u0010)B\u0091\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0006\u0010&\u001a\u00020\u0010\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010-J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\rHÆ\u0003J$\u0010n\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\u0004\u0012\u00020\u00140\u000fHÆ\u0003J\t\u0010o\u001a\u00020\u0016HÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010u\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010$HÆ\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\u0018\u0010y\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003JÀ\u0002\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\u0004\u0012\u00020\u00140\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010 \u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0017\b\u0002\u0010&\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0001J\u0013\u0010|\u001a\u00020}2\b\u0010~\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u007f\u001a\u00020\u0010HÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u00002\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0001¢\u0006\u0003\b\u0088\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010/\u001a\u0004\b=\u0010>R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010/\u001a\u0004\b@\u00101R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010/\u001a\u0004\bB\u0010CR7\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\u0004\u0012\u00020\u00140\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010/\u001a\u0004\bE\u0010FR\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010/\u001a\u0004\bH\u0010IR\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010/\u001a\u0004\bK\u0010LR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010/\u001a\u0004\bN\u00101R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010/\u001a\u0004\bP\u0010QR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010/\u001a\u0004\bS\u0010TR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010/\u001a\u0004\bV\u00101R+\u0010 \u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010/\u001a\u0004\bX\u0010YR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010/\u001a\u0004\b[\u00101R\u001e\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010/\u001a\u0004\b]\u0010^R\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010/\u001a\u0004\b`\u0010LR+\u0010&\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u0010/\u001a\u0004\bb\u0010YR\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010/\u001a\u0004\bd\u0010L¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate;", "", "id", "", "name", "series_id", "symbol", "description", "long_description", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;", "tick_size", "timeline", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;", "event_contracts", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32MapKeySerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "view_mode", "Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;", "attestations", "", "Lrosetta/identi/agreements/AgreementTypeDto;", "bracket_id", "region", "Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;", "round", "Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;", "receipt_shortname", Constants.EVENT_INDEX, "Lcom/robinhood/idl/serialization/Int32Serializer;", "banner_text", "md_live_data_backup", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "attestation_values", "series_index", "prohibition_rules", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;Ljava/util/Map;Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;Ljava/util/List;ILjava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;Ljava/util/Map;Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;Ljava/util/List;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "getSeries_id$annotations", "getSeries_id", "getSymbol$annotations", "getSymbol", "getDescription$annotations", "getDescription", "getLong_description$annotations", "getLong_description", "getState$annotations", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;", "getTick_size$annotations", "getTick_size", "getTimeline$annotations", "getTimeline", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineDto;", "getEvent_contracts$annotations", "getEvent_contracts", "()Ljava/util/Map;", "getView_mode$annotations", "getView_mode", "()Lcom/robinhood/arsenal/proto/v1/idl/EventViewModeDto;", "getAttestations$annotations", "getAttestations", "()Ljava/util/List;", "getBracket_id$annotations", "getBracket_id", "getRegion$annotations", "getRegion", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRegionDto;", "getRound$annotations", "getRound", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRoundDto;", "getReceipt_shortname$annotations", "getReceipt_shortname", "getEvent_index$annotations", "getEvent_index", "()I", "getBanner_text$annotations", "getBanner_text", "getMd_live_data_backup$annotations", "getMd_live_data_backup", "()Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "getAttestation_values$annotations", "getAttestation_values", "getSeries_index$annotations", "getSeries_index", "getProhibition_rules$annotations", "getProhibition_rules", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> attestation_values;
        private final List<AgreementTypeDto> attestations;
        private final String banner_text;
        private final String bracket_id;
        private final String description;
        private final Map<Integer, EventContractDto> event_contracts;
        private final int event_index;
        private final String id;
        private final String long_description;
        private final EventMDLiveDataBackupDto md_live_data_backup;
        private final String name;
        private final List<String> prohibition_rules;
        private final String receipt_shortname;
        private final EventRegionDto region;
        private final EventRoundDto round;
        private final String series_id;
        private final int series_index;
        private final EventStateDto state;
        private final String symbol;
        private final String tick_size;
        private final TimelineDto timeline;
        private final EventViewModeDto view_mode;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EventStateDto) null, (String) null, (TimelineDto) null, (Map) null, (EventViewModeDto) null, (List) null, (String) null, (EventRegionDto) null, (EventRoundDto) null, (String) null, 0, (String) null, (EventMDLiveDataBackupDto) null, (List) null, 0, (List) null, 4194303, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(SignedIntAsStringSerializer.INSTANCE, EventContractDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(AgreementTypeDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, EventStateDto eventStateDto, String str7, TimelineDto timelineDto, Map map, EventViewModeDto eventViewModeDto, List list, String str8, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str9, int i, String str10, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List list2, int i2, List list3, int i3, Object obj) {
            List list4;
            int i4;
            String str11 = (i3 & 1) != 0 ? surrogate.id : str;
            String str12 = (i3 & 2) != 0 ? surrogate.name : str2;
            String str13 = (i3 & 4) != 0 ? surrogate.series_id : str3;
            String str14 = (i3 & 8) != 0 ? surrogate.symbol : str4;
            String str15 = (i3 & 16) != 0 ? surrogate.description : str5;
            String str16 = (i3 & 32) != 0 ? surrogate.long_description : str6;
            EventStateDto eventStateDto2 = (i3 & 64) != 0 ? surrogate.state : eventStateDto;
            String str17 = (i3 & 128) != 0 ? surrogate.tick_size : str7;
            TimelineDto timelineDto2 = (i3 & 256) != 0 ? surrogate.timeline : timelineDto;
            Map map2 = (i3 & 512) != 0 ? surrogate.event_contracts : map;
            EventViewModeDto eventViewModeDto2 = (i3 & 1024) != 0 ? surrogate.view_mode : eventViewModeDto;
            List list5 = (i3 & 2048) != 0 ? surrogate.attestations : list;
            String str18 = (i3 & 4096) != 0 ? surrogate.bracket_id : str8;
            EventRegionDto eventRegionDto2 = (i3 & 8192) != 0 ? surrogate.region : eventRegionDto;
            String str19 = str11;
            EventRoundDto eventRoundDto2 = (i3 & 16384) != 0 ? surrogate.round : eventRoundDto;
            String str20 = (i3 & 32768) != 0 ? surrogate.receipt_shortname : str9;
            int i5 = (i3 & 65536) != 0 ? surrogate.event_index : i;
            String str21 = (i3 & 131072) != 0 ? surrogate.banner_text : str10;
            EventMDLiveDataBackupDto eventMDLiveDataBackupDto2 = (i3 & 262144) != 0 ? surrogate.md_live_data_backup : eventMDLiveDataBackupDto;
            List list6 = (i3 & 524288) != 0 ? surrogate.attestation_values : list2;
            int i6 = (i3 & 1048576) != 0 ? surrogate.series_index : i2;
            if ((i3 & 2097152) != 0) {
                i4 = i6;
                list4 = surrogate.prohibition_rules;
            } else {
                list4 = list3;
                i4 = i6;
            }
            return surrogate.copy(str19, str12, str13, str14, str15, str16, eventStateDto2, str17, timelineDto2, map2, eventViewModeDto2, list5, str18, eventRegionDto2, eventRoundDto2, str20, i5, str21, eventMDLiveDataBackupDto2, list6, i4, list4);
        }

        @SerialName("attestationValues")
        @JsonAnnotations2(names = {"attestation_values"})
        public static /* synthetic */ void getAttestation_values$annotations() {
        }

        @SerialName("attestations")
        @JsonAnnotations2(names = {"attestations"})
        public static /* synthetic */ void getAttestations$annotations() {
        }

        @SerialName("bannerText")
        @JsonAnnotations2(names = {"banner_text"})
        public static /* synthetic */ void getBanner_text$annotations() {
        }

        @SerialName("bracketId")
        @JsonAnnotations2(names = {"bracket_id"})
        public static /* synthetic */ void getBracket_id$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("eventContracts")
        @JsonAnnotations2(names = {"event_contracts"})
        public static /* synthetic */ void getEvent_contracts$annotations() {
        }

        @SerialName("eventIndex")
        @JsonAnnotations2(names = {Constants.EVENT_INDEX})
        public static /* synthetic */ void getEvent_index$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("longDescription")
        @JsonAnnotations2(names = {"long_description"})
        public static /* synthetic */ void getLong_description$annotations() {
        }

        @SerialName("mdLiveDataBackup")
        @JsonAnnotations2(names = {"md_live_data_backup"})
        public static /* synthetic */ void getMd_live_data_backup$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("prohibitionRules")
        @JsonAnnotations2(names = {"prohibition_rules"})
        public static /* synthetic */ void getProhibition_rules$annotations() {
        }

        @SerialName("receiptShortname")
        @JsonAnnotations2(names = {"receipt_shortname"})
        public static /* synthetic */ void getReceipt_shortname$annotations() {
        }

        @SerialName("region")
        @JsonAnnotations2(names = {"region"})
        public static /* synthetic */ void getRegion$annotations() {
        }

        @SerialName("round")
        @JsonAnnotations2(names = {"round"})
        public static /* synthetic */ void getRound$annotations() {
        }

        @SerialName("seriesId")
        @JsonAnnotations2(names = {"series_id"})
        public static /* synthetic */ void getSeries_id$annotations() {
        }

        @SerialName("seriesIndex")
        @JsonAnnotations2(names = {"series_index"})
        public static /* synthetic */ void getSeries_index$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tickSize")
        @JsonAnnotations2(names = {"tick_size"})
        public static /* synthetic */ void getTick_size$annotations() {
        }

        @SerialName("timeline")
        @JsonAnnotations2(names = {"timeline"})
        public static /* synthetic */ void getTimeline$annotations() {
        }

        @SerialName("viewMode")
        @JsonAnnotations2(names = {"view_mode"})
        public static /* synthetic */ void getView_mode$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Map<Integer, EventContractDto> component10() {
            return this.event_contracts;
        }

        /* renamed from: component11, reason: from getter */
        public final EventViewModeDto getView_mode() {
            return this.view_mode;
        }

        public final List<AgreementTypeDto> component12() {
            return this.attestations;
        }

        /* renamed from: component13, reason: from getter */
        public final String getBracket_id() {
            return this.bracket_id;
        }

        /* renamed from: component14, reason: from getter */
        public final EventRegionDto getRegion() {
            return this.region;
        }

        /* renamed from: component15, reason: from getter */
        public final EventRoundDto getRound() {
            return this.round;
        }

        /* renamed from: component16, reason: from getter */
        public final String getReceipt_shortname() {
            return this.receipt_shortname;
        }

        /* renamed from: component17, reason: from getter */
        public final int getEvent_index() {
            return this.event_index;
        }

        /* renamed from: component18, reason: from getter */
        public final String getBanner_text() {
            return this.banner_text;
        }

        /* renamed from: component19, reason: from getter */
        public final EventMDLiveDataBackupDto getMd_live_data_backup() {
            return this.md_live_data_backup;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<String> component20() {
            return this.attestation_values;
        }

        /* renamed from: component21, reason: from getter */
        public final int getSeries_index() {
            return this.series_index;
        }

        public final List<String> component22() {
            return this.prohibition_rules;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSeries_id() {
            return this.series_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLong_description() {
            return this.long_description;
        }

        /* renamed from: component7, reason: from getter */
        public final EventStateDto getState() {
            return this.state;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTick_size() {
            return this.tick_size;
        }

        /* renamed from: component9, reason: from getter */
        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final Surrogate copy(String id, String name, String series_id, String symbol, String description, String long_description, EventStateDto state, String tick_size, TimelineDto timeline, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, List<? extends AgreementTypeDto> attestations, String bracket_id, EventRegionDto region, EventRoundDto round, String receipt_shortname, int event_index, String banner_text, EventMDLiveDataBackupDto md_live_data_backup, List<String> attestation_values, int series_index, List<String> prohibition_rules) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(series_id, "series_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tick_size, "tick_size");
            Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
            Intrinsics.checkNotNullParameter(view_mode, "view_mode");
            Intrinsics.checkNotNullParameter(attestations, "attestations");
            Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
            Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
            return new Surrogate(id, name, series_id, symbol, description, long_description, state, tick_size, timeline, event_contracts, view_mode, attestations, bracket_id, region, round, receipt_shortname, event_index, banner_text, md_live_data_backup, attestation_values, series_index, prohibition_rules);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.series_id, surrogate.series_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.long_description, surrogate.long_description) && this.state == surrogate.state && Intrinsics.areEqual(this.tick_size, surrogate.tick_size) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.event_contracts, surrogate.event_contracts) && this.view_mode == surrogate.view_mode && Intrinsics.areEqual(this.attestations, surrogate.attestations) && Intrinsics.areEqual(this.bracket_id, surrogate.bracket_id) && Intrinsics.areEqual(this.region, surrogate.region) && Intrinsics.areEqual(this.round, surrogate.round) && Intrinsics.areEqual(this.receipt_shortname, surrogate.receipt_shortname) && this.event_index == surrogate.event_index && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.md_live_data_backup, surrogate.md_live_data_backup) && Intrinsics.areEqual(this.attestation_values, surrogate.attestation_values) && this.series_index == surrogate.series_index && Intrinsics.areEqual(this.prohibition_rules, surrogate.prohibition_rules);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.series_id.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.description.hashCode()) * 31;
            String str = this.long_description;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.state.hashCode()) * 31) + this.tick_size.hashCode()) * 31;
            TimelineDto timelineDto = this.timeline;
            int iHashCode3 = (((((((iHashCode2 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31) + this.event_contracts.hashCode()) * 31) + this.view_mode.hashCode()) * 31) + this.attestations.hashCode()) * 31;
            String str2 = this.bracket_id;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EventRegionDto eventRegionDto = this.region;
            int iHashCode5 = (iHashCode4 + (eventRegionDto == null ? 0 : eventRegionDto.hashCode())) * 31;
            EventRoundDto eventRoundDto = this.round;
            int iHashCode6 = (iHashCode5 + (eventRoundDto == null ? 0 : eventRoundDto.hashCode())) * 31;
            String str3 = this.receipt_shortname;
            int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.event_index)) * 31;
            String str4 = this.banner_text;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            EventMDLiveDataBackupDto eventMDLiveDataBackupDto = this.md_live_data_backup;
            return ((((((iHashCode8 + (eventMDLiveDataBackupDto != null ? eventMDLiveDataBackupDto.hashCode() : 0)) * 31) + this.attestation_values.hashCode()) * 31) + Integer.hashCode(this.series_index)) * 31) + this.prohibition_rules.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", series_id=" + this.series_id + ", symbol=" + this.symbol + ", description=" + this.description + ", long_description=" + this.long_description + ", state=" + this.state + ", tick_size=" + this.tick_size + ", timeline=" + this.timeline + ", event_contracts=" + this.event_contracts + ", view_mode=" + this.view_mode + ", attestations=" + this.attestations + ", bracket_id=" + this.bracket_id + ", region=" + this.region + ", round=" + this.round + ", receipt_shortname=" + this.receipt_shortname + ", event_index=" + this.event_index + ", banner_text=" + this.banner_text + ", md_live_data_backup=" + this.md_live_data_backup + ", attestation_values=" + this.attestation_values + ", series_index=" + this.series_index + ", prohibition_rules=" + this.prohibition_rules + ")";
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.Surrogate._childSerializers$_anonymous_$2();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, EventStateDto eventStateDto, String str7, TimelineDto timelineDto, Map map, EventViewModeDto eventViewModeDto, List list, String str8, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str9, int i2, String str10, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List list2, int i3, List list3, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.series_id = "";
            } else {
                this.series_id = str3;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str4;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str5;
            }
            if ((i & 32) == 0) {
                this.long_description = null;
            } else {
                this.long_description = str6;
            }
            if ((i & 64) == 0) {
                this.state = EventStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = eventStateDto;
            }
            if ((i & 128) == 0) {
                this.tick_size = "";
            } else {
                this.tick_size = str7;
            }
            if ((i & 256) == 0) {
                this.timeline = null;
            } else {
                this.timeline = timelineDto;
            }
            if ((i & 512) == 0) {
                this.event_contracts = MapsKt.emptyMap();
            } else {
                this.event_contracts = map;
            }
            if ((i & 1024) == 0) {
                this.view_mode = EventViewModeDto.INSTANCE.getZeroValue();
            } else {
                this.view_mode = eventViewModeDto;
            }
            if ((i & 2048) == 0) {
                this.attestations = CollectionsKt.emptyList();
            } else {
                this.attestations = list;
            }
            if ((i & 4096) == 0) {
                this.bracket_id = null;
            } else {
                this.bracket_id = str8;
            }
            if ((i & 8192) == 0) {
                this.region = null;
            } else {
                this.region = eventRegionDto;
            }
            if ((i & 16384) == 0) {
                this.round = null;
            } else {
                this.round = eventRoundDto;
            }
            if ((32768 & i) == 0) {
                this.receipt_shortname = null;
            } else {
                this.receipt_shortname = str9;
            }
            if ((65536 & i) == 0) {
                this.event_index = 0;
            } else {
                this.event_index = i2;
            }
            if ((131072 & i) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str10;
            }
            if ((262144 & i) == 0) {
                this.md_live_data_backup = null;
            } else {
                this.md_live_data_backup = eventMDLiveDataBackupDto;
            }
            this.attestation_values = (524288 & i) == 0 ? CollectionsKt.emptyList() : list2;
            if ((1048576 & i) == 0) {
                this.series_index = 0;
            } else {
                this.series_index = i3;
            }
            this.prohibition_rules = (i & 2097152) == 0 ? CollectionsKt.emptyList() : list3;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.series_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.series_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 4, self.description);
            }
            String str = self.long_description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            if (self.state != EventStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, EventStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.tick_size, "")) {
                output.encodeStringElement(serialDesc, 7, self.tick_size);
            }
            TimelineDto timelineDto = self.timeline;
            if (timelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, TimelineDto.Serializer.INSTANCE, timelineDto);
            }
            if (!Intrinsics.areEqual(self.event_contracts, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.event_contracts);
            }
            if (self.view_mode != EventViewModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, EventViewModeDto.Serializer.INSTANCE, self.view_mode);
            }
            if (!Intrinsics.areEqual(self.attestations, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.attestations);
            }
            String str2 = self.bracket_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str2);
            }
            EventRegionDto eventRegionDto = self.region;
            if (eventRegionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, EventRegionDto.Serializer.INSTANCE, eventRegionDto);
            }
            EventRoundDto eventRoundDto = self.round;
            if (eventRoundDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, EventRoundDto.Serializer.INSTANCE, eventRoundDto);
            }
            String str3 = self.receipt_shortname;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, str3);
            }
            int i = self.event_index;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 16, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            String str4 = self.banner_text;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, str4);
            }
            EventMDLiveDataBackupDto eventMDLiveDataBackupDto = self.md_live_data_backup;
            if (eventMDLiveDataBackupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, EventMDLiveDataBackupDto.Serializer.INSTANCE, eventMDLiveDataBackupDto);
            }
            if (!Intrinsics.areEqual(self.attestation_values, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self.attestation_values);
            }
            int i2 = self.series_index;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 20, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Intrinsics.areEqual(self.prohibition_rules, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 21, lazyArr[21].getValue(), self.prohibition_rules);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String id, String name, String series_id, String symbol, String description, String str, EventStateDto state, String tick_size, TimelineDto timelineDto, Map<Integer, EventContractDto> event_contracts, EventViewModeDto view_mode, List<? extends AgreementTypeDto> attestations, String str2, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str3, int i, String str4, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List<String> attestation_values, int i2, List<String> prohibition_rules) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(series_id, "series_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tick_size, "tick_size");
            Intrinsics.checkNotNullParameter(event_contracts, "event_contracts");
            Intrinsics.checkNotNullParameter(view_mode, "view_mode");
            Intrinsics.checkNotNullParameter(attestations, "attestations");
            Intrinsics.checkNotNullParameter(attestation_values, "attestation_values");
            Intrinsics.checkNotNullParameter(prohibition_rules, "prohibition_rules");
            this.id = id;
            this.name = name;
            this.series_id = series_id;
            this.symbol = symbol;
            this.description = description;
            this.long_description = str;
            this.state = state;
            this.tick_size = tick_size;
            this.timeline = timelineDto;
            this.event_contracts = event_contracts;
            this.view_mode = view_mode;
            this.attestations = attestations;
            this.bracket_id = str2;
            this.region = eventRegionDto;
            this.round = eventRoundDto;
            this.receipt_shortname = str3;
            this.event_index = i;
            this.banner_text = str4;
            this.md_live_data_backup = eventMDLiveDataBackupDto;
            this.attestation_values = attestation_values;
            this.series_index = i2;
            this.prohibition_rules = prohibition_rules;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, EventStateDto eventStateDto, String str7, TimelineDto timelineDto, Map map, EventViewModeDto eventViewModeDto, List list, String str8, EventRegionDto eventRegionDto, EventRoundDto eventRoundDto, String str9, int i, String str10, EventMDLiveDataBackupDto eventMDLiveDataBackupDto, List list2, int i2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? EventStateDto.INSTANCE.getZeroValue() : eventStateDto, (i3 & 128) == 0 ? str7 : "", (i3 & 256) != 0 ? null : timelineDto, (i3 & 512) != 0 ? MapsKt.emptyMap() : map, (i3 & 1024) != 0 ? EventViewModeDto.INSTANCE.getZeroValue() : eventViewModeDto, (i3 & 2048) != 0 ? CollectionsKt.emptyList() : list, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? null : eventRegionDto, (i3 & 16384) != 0 ? null : eventRoundDto, (i3 & 32768) != 0 ? null : str9, (i3 & 65536) != 0 ? 0 : i, (i3 & 131072) != 0 ? null : str10, (i3 & 262144) != 0 ? null : eventMDLiveDataBackupDto, (i3 & 524288) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 1048576) == 0 ? i2 : 0, (i3 & 2097152) != 0 ? CollectionsKt.emptyList() : list3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSeries_id() {
            return this.series_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getLong_description() {
            return this.long_description;
        }

        public final EventStateDto getState() {
            return this.state;
        }

        public final String getTick_size() {
            return this.tick_size;
        }

        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final Map<Integer, EventContractDto> getEvent_contracts() {
            return this.event_contracts;
        }

        public final EventViewModeDto getView_mode() {
            return this.view_mode;
        }

        public final List<AgreementTypeDto> getAttestations() {
            return this.attestations;
        }

        public final String getBracket_id() {
            return this.bracket_id;
        }

        public final EventRegionDto getRegion() {
            return this.region;
        }

        public final EventRoundDto getRound() {
            return this.round;
        }

        public final String getReceipt_shortname() {
            return this.receipt_shortname;
        }

        public final int getEvent_index() {
            return this.event_index;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final EventMDLiveDataBackupDto getMd_live_data_backup() {
            return this.md_live_data_backup;
        }

        public final List<String> getAttestation_values() {
            return this.attestation_values;
        }

        public final int getSeries_index() {
            return this.series_index;
        }

        public final List<String> getProhibition_rules() {
            return this.prohibition_rules;
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Event;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            String series_id = proto.getSeries_id();
            String symbol = proto.getSymbol();
            String description = proto.getDescription();
            String long_description = proto.getLong_description();
            EventStateDto eventStateDtoFromProto = EventStateDto.INSTANCE.fromProto(proto.getState());
            String tick_size = proto.getTick_size();
            Timeline timeline = proto.getTimeline();
            TimelineDto timelineDtoFromProto = timeline != null ? TimelineDto.INSTANCE.fromProto(timeline) : null;
            Set<Map.Entry<Integer, EventContract>> setEntrySet = proto.getEvent_contracts().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(((Number) entry.getKey()).intValue()), EventContractDto.INSTANCE.fromProto((EventContract) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            EventViewModeDto eventViewModeDtoFromProto = EventViewModeDto.INSTANCE.fromProto(proto.getView_mode());
            List<AgreementType> attestations = proto.getAttestations();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestations, 10));
            Iterator<T> it2 = attestations.iterator();
            while (it2.hasNext()) {
                arrayList.add(AgreementTypeDto.INSTANCE.fromProto((AgreementType) it2.next()));
            }
            String bracket_id = proto.getBracket_id();
            EventRegion region = proto.getRegion();
            EventRegionDto eventRegionDtoFromProto = region != null ? EventRegionDto.INSTANCE.fromProto(region) : null;
            EventRound round = proto.getRound();
            TimelineDto timelineDto = timelineDtoFromProto;
            EventRoundDto eventRoundDtoFromProto = round != null ? EventRoundDto.INSTANCE.fromProto(round) : null;
            String receipt_shortname = proto.getReceipt_shortname();
            int event_index = proto.getEvent_index();
            String banner_text = proto.getBanner_text();
            EventRoundDto eventRoundDto = eventRoundDtoFromProto;
            EventMDLiveDataBackup md_live_data_backup = proto.getMd_live_data_backup();
            EventMDLiveDataBackupDto eventMDLiveDataBackupDtoFromProto = md_live_data_backup != null ? EventMDLiveDataBackupDto.INSTANCE.fromProto(md_live_data_backup) : null;
            List<String> attestation_values = proto.getAttestation_values();
            EventMDLiveDataBackupDto eventMDLiveDataBackupDto = eventMDLiveDataBackupDtoFromProto;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_values, 10));
            Iterator<T> it3 = attestation_values.iterator();
            while (it3.hasNext()) {
                arrayList2.add((String) it3.next());
            }
            int series_index = proto.getSeries_index();
            List<String> prohibition_rules = proto.getProhibition_rules();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prohibition_rules, 10));
            Iterator<T> it4 = prohibition_rules.iterator();
            while (it4.hasNext()) {
                arrayList3.add((String) it4.next());
            }
            return new EventDto(new Surrogate(id, name, series_id, symbol, description, long_description, eventStateDtoFromProto, tick_size, timelineDto, linkedHashMap, eventViewModeDtoFromProto, arrayList, bracket_id, eventRegionDtoFromProto, eventRoundDto, receipt_shortname, event_index, banner_text, eventMDLiveDataBackupDto, arrayList2, series_index, arrayList3), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventDto.binaryBase64Serializer_delegate$lambda$4();
            }
        });
        zeroValue = new EventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$4() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.Event", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventDto";
        }
    }
}
