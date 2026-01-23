package com.robinhood.arsenal.proto.p281v1.idl;

import com.singular.sdk.internal.Constants;
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
import rosetta.identi.agreements.AgreementType;

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB\u009b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010K\u001a\u00020\u0002H\u0017J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\b\u0010P\u001a\u00020\u0011H\u0016J\b\u0010Q\u001a\u00020\u0004H\u0016J\u009a\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010#\u001a\u00020\u00112\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010%\u001a\u00020&R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0016\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010#\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010H¨\u0006T"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/Event;", "Lcom/squareup/wire/Message;", "", "id", "", "name", "series_id", "symbol", "description", "long_description", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "tick_size", "timeline", "Lcom/robinhood/arsenal/proto/v1/idl/Timeline;", "event_contracts", "", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "view_mode", "Lcom/robinhood/arsenal/proto/v1/idl/EventViewMode;", "attestations", "", "Lrosetta/identi/agreements/AgreementType;", "bracket_id", "region", "Lcom/robinhood/arsenal/proto/v1/idl/EventRegion;", "round", "Lcom/robinhood/arsenal/proto/v1/idl/EventRound;", "receipt_shortname", Constants.EVENT_INDEX, "banner_text", "md_live_data_backup", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "attestation_values", "series_index", "prohibition_rules", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventState;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/Timeline;Ljava/util/Map;Lcom/robinhood/arsenal/proto/v1/idl/EventViewMode;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventRegion;Lcom/robinhood/arsenal/proto/v1/idl/EventRound;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;Ljava/util/List;ILjava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "getSeries_id", "getSymbol", "getDescription", "getLong_description", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "getTick_size", "getTimeline", "()Lcom/robinhood/arsenal/proto/v1/idl/Timeline;", "getView_mode", "()Lcom/robinhood/arsenal/proto/v1/idl/EventViewMode;", "getBracket_id", "getRegion", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRegion;", "getRound", "()Lcom/robinhood/arsenal/proto/v1/idl/EventRound;", "getReceipt_shortname", "getEvent_index", "()I", "getBanner_text", "getMd_live_data_backup", "()Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "getSeries_index", "getEvent_contracts", "()Ljava/util/Map;", "getAttestations$annotations", "()V", "getAttestations", "()Ljava/util/List;", "getAttestation_values", "getProhibition_rules", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Event extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "attestationValues", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 20)
    private final List<String> attestation_values;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 12)
    private final List<AgreementType> attestations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 17, tag = 18)
    private final String banner_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bracketId", schemaIndex = 12, tag = 13)
    private final String bracket_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventContract#ADAPTER", jsonName = "eventContracts", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 9, tag = 10)
    private final Map<Integer, EventContract> event_contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "eventIndex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final int event_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "longDescription", schemaIndex = 5, tag = 6)
    private final String long_description;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventMDLiveDataBackup#ADAPTER", jsonName = "mdLiveDataBackup", schemaIndex = 18, tag = 19)
    private final EventMDLiveDataBackup md_live_data_backup;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "prohibitionRules", label = WireField.Label.REPEATED, schemaIndex = 21, tag = 32)
    private final List<String> prohibition_rules;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "receiptShortname", schemaIndex = 15, tag = 16)
    private final String receipt_shortname;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventRegion#ADAPTER", schemaIndex = 13, tag = 14)
    private final EventRegion region;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventRound#ADAPTER", schemaIndex = 14, tag = 15)
    private final EventRound round;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "seriesId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String series_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seriesIndex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final int series_index;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final EventState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String tick_size;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Timeline#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Timeline timeline;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventViewMode#ADAPTER", jsonName = "viewMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final EventViewMode view_mode;

    @JvmField
    public static final ProtoAdapter<Event> ADAPTER = new Event$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Event.class), Syntax.PROTO_3);

    public Event() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, 8388607, null);
    }

    @Deprecated
    public static /* synthetic */ void getAttestations$annotations() {
    }

    public /* synthetic */ Event(String str, String str2, String str3, String str4, String str5, String str6, EventState eventState, String str7, Timeline timeline, Map map, EventViewMode eventViewMode, List list, String str8, EventRegion eventRegion, EventRound eventRound, String str9, int i, String str10, EventMDLiveDataBackup eventMDLiveDataBackup, List list2, int i2, List list3, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? EventState.EVENT_STATE_UNSPECIFIED : eventState, (i3 & 128) == 0 ? str7 : "", (i3 & 256) != 0 ? null : timeline, (i3 & 512) != 0 ? MapsKt.emptyMap() : map, (i3 & 1024) != 0 ? EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED : eventViewMode, (i3 & 2048) != 0 ? CollectionsKt.emptyList() : list, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? null : eventRegion, (i3 & 16384) != 0 ? null : eventRound, (i3 & 32768) != 0 ? null : str9, (i3 & 65536) != 0 ? 0 : i, (i3 & 131072) != 0 ? null : str10, (i3 & 262144) != 0 ? null : eventMDLiveDataBackup, (i3 & 524288) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 1048576) == 0 ? i2 : 0, (i3 & 2097152) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20124newBuilder();
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

    public final EventState getState() {
        return this.state;
    }

    public final String getTick_size() {
        return this.tick_size;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final EventViewMode getView_mode() {
        return this.view_mode;
    }

    public final String getBracket_id() {
        return this.bracket_id;
    }

    public final EventRegion getRegion() {
        return this.region;
    }

    public final EventRound getRound() {
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

    public final EventMDLiveDataBackup getMd_live_data_backup() {
        return this.md_live_data_backup;
    }

    public final int getSeries_index() {
        return this.series_index;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Event(String id, String name, String series_id, String symbol, String description, String str, EventState state, String tick_size, Timeline timeline, Map<Integer, EventContract> event_contracts, EventViewMode view_mode, List<? extends AgreementType> attestations, String str2, EventRegion eventRegion, EventRound eventRound, String str3, int i, String str4, EventMDLiveDataBackup eventMDLiveDataBackup, List<String> attestation_values, int i2, List<String> prohibition_rules, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.series_id = series_id;
        this.symbol = symbol;
        this.description = description;
        this.long_description = str;
        this.state = state;
        this.tick_size = tick_size;
        this.timeline = timeline;
        this.view_mode = view_mode;
        this.bracket_id = str2;
        this.region = eventRegion;
        this.round = eventRound;
        this.receipt_shortname = str3;
        this.event_index = i;
        this.banner_text = str4;
        this.md_live_data_backup = eventMDLiveDataBackup;
        this.series_index = i2;
        this.event_contracts = Internal.immutableCopyOf("event_contracts", event_contracts);
        this.attestations = Internal.immutableCopyOf("attestations", attestations);
        this.attestation_values = Internal.immutableCopyOf("attestation_values", attestation_values);
        this.prohibition_rules = Internal.immutableCopyOf("prohibition_rules", prohibition_rules);
    }

    public final Map<Integer, EventContract> getEvent_contracts() {
        return this.event_contracts;
    }

    public final List<AgreementType> getAttestations() {
        return this.attestations;
    }

    public final List<String> getAttestation_values() {
        return this.attestation_values;
    }

    public final List<String> getProhibition_rules() {
        return this.prohibition_rules;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20124newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), event.unknownFields()) && Intrinsics.areEqual(this.id, event.id) && Intrinsics.areEqual(this.name, event.name) && Intrinsics.areEqual(this.series_id, event.series_id) && Intrinsics.areEqual(this.symbol, event.symbol) && Intrinsics.areEqual(this.description, event.description) && Intrinsics.areEqual(this.long_description, event.long_description) && this.state == event.state && Intrinsics.areEqual(this.tick_size, event.tick_size) && Intrinsics.areEqual(this.timeline, event.timeline) && Intrinsics.areEqual(this.event_contracts, event.event_contracts) && this.view_mode == event.view_mode && Intrinsics.areEqual(this.attestations, event.attestations) && Intrinsics.areEqual(this.bracket_id, event.bracket_id) && Intrinsics.areEqual(this.region, event.region) && Intrinsics.areEqual(this.round, event.round) && Intrinsics.areEqual(this.receipt_shortname, event.receipt_shortname) && this.event_index == event.event_index && Intrinsics.areEqual(this.banner_text, event.banner_text) && Intrinsics.areEqual(this.md_live_data_backup, event.md_live_data_backup) && Intrinsics.areEqual(this.attestation_values, event.attestation_values) && this.series_index == event.series_index && Intrinsics.areEqual(this.prohibition_rules, event.prohibition_rules);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.series_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.description.hashCode()) * 37;
        String str = this.long_description;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.tick_size.hashCode()) * 37;
        Timeline timeline = this.timeline;
        int iHashCode3 = (((((((iHashCode2 + (timeline != null ? timeline.hashCode() : 0)) * 37) + this.event_contracts.hashCode()) * 37) + this.view_mode.hashCode()) * 37) + this.attestations.hashCode()) * 37;
        String str2 = this.bracket_id;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EventRegion eventRegion = this.region;
        int iHashCode5 = (iHashCode4 + (eventRegion != null ? eventRegion.hashCode() : 0)) * 37;
        EventRound eventRound = this.round;
        int iHashCode6 = (iHashCode5 + (eventRound != null ? eventRound.hashCode() : 0)) * 37;
        String str3 = this.receipt_shortname;
        int iHashCode7 = (((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37) + Integer.hashCode(this.event_index)) * 37;
        String str4 = this.banner_text;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        EventMDLiveDataBackup eventMDLiveDataBackup = this.md_live_data_backup;
        int iHashCode9 = ((((((iHashCode8 + (eventMDLiveDataBackup != null ? eventMDLiveDataBackup.hashCode() : 0)) * 37) + this.attestation_values.hashCode()) * 37) + Integer.hashCode(this.series_index)) * 37) + this.prohibition_rules.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("series_id=" + Internal.sanitize(this.series_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("description=" + Internal.sanitize(this.description));
        String str = this.long_description;
        if (str != null) {
            arrayList.add("long_description=" + Internal.sanitize(str));
        }
        arrayList.add("state=" + this.state);
        arrayList.add("tick_size=" + Internal.sanitize(this.tick_size));
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        if (!this.event_contracts.isEmpty()) {
            arrayList.add("event_contracts=" + this.event_contracts);
        }
        arrayList.add("view_mode=" + this.view_mode);
        if (!this.attestations.isEmpty()) {
            arrayList.add("attestations=" + this.attestations);
        }
        String str2 = this.bracket_id;
        if (str2 != null) {
            arrayList.add("bracket_id=" + Internal.sanitize(str2));
        }
        EventRegion eventRegion = this.region;
        if (eventRegion != null) {
            arrayList.add("region=" + eventRegion);
        }
        EventRound eventRound = this.round;
        if (eventRound != null) {
            arrayList.add("round=" + eventRound);
        }
        String str3 = this.receipt_shortname;
        if (str3 != null) {
            arrayList.add("receipt_shortname=" + Internal.sanitize(str3));
        }
        arrayList.add("event_index=" + this.event_index);
        String str4 = this.banner_text;
        if (str4 != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str4));
        }
        EventMDLiveDataBackup eventMDLiveDataBackup = this.md_live_data_backup;
        if (eventMDLiveDataBackup != null) {
            arrayList.add("md_live_data_backup=" + eventMDLiveDataBackup);
        }
        if (!this.attestation_values.isEmpty()) {
            arrayList.add("attestation_values=" + Internal.sanitize(this.attestation_values));
        }
        arrayList.add("series_index=" + this.series_index);
        if (!this.prohibition_rules.isEmpty()) {
            arrayList.add("prohibition_rules=" + Internal.sanitize(this.prohibition_rules));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Event{", "}", 0, null, null, 56, null);
    }

    public final Event copy(String id, String name, String series_id, String symbol, String description, String long_description, EventState state, String tick_size, Timeline timeline, Map<Integer, EventContract> event_contracts, EventViewMode view_mode, List<? extends AgreementType> attestations, String bracket_id, EventRegion region, EventRound round, String receipt_shortname, int event_index, String banner_text, EventMDLiveDataBackup md_live_data_backup, List<String> attestation_values, int series_index, List<String> prohibition_rules, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Event(id, name, series_id, symbol, description, long_description, state, tick_size, timeline, event_contracts, view_mode, attestations, bracket_id, region, round, receipt_shortname, event_index, banner_text, md_live_data_backup, attestation_values, series_index, prohibition_rules, unknownFields);
    }
}
