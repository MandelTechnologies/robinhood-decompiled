package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: EventSeries.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B[\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJa\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u001dR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeries;", "Lcom/squareup/wire/Message;", "", "", "id", "name", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "end_time", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesState;", "state", "", "event_ids", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesState;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesState;Ljava/util/List;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/EventSeries;", "Ljava/lang/String;", "getId", "getName", "getSymbol", "Lj$/time/Instant;", "getEnd_time", "()Lj$/time/Instant;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesState;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesState;", "Ljava/util/List;", "getEvent_ids", "()Ljava/util/List;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventSeries extends Message {

    @JvmField
    public static final ProtoAdapter<EventSeries> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventIds", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 30)
    private final List<String> event_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventSeriesState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final EventSeriesState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public EventSeries() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ EventSeries(String str, String str2, String str3, Instant instant, EventSeriesState eventSeriesState, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? EventSeriesState.EVENT_SERIES_STATE_UNSPECIFIED : eventSeriesState, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20134newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Instant getEnd_time() {
        return this.end_time;
    }

    public final EventSeriesState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventSeries(String id, String name, String symbol, Instant instant, EventSeriesState state, List<String> event_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.end_time = instant;
        this.state = state;
        this.event_ids = Internal.immutableCopyOf("event_ids", event_ids);
    }

    public final List<String> getEvent_ids() {
        return this.event_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20134newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventSeries)) {
            return false;
        }
        EventSeries eventSeries = (EventSeries) other;
        return Intrinsics.areEqual(unknownFields(), eventSeries.unknownFields()) && Intrinsics.areEqual(this.id, eventSeries.id) && Intrinsics.areEqual(this.name, eventSeries.name) && Intrinsics.areEqual(this.symbol, eventSeries.symbol) && Intrinsics.areEqual(this.end_time, eventSeries.end_time) && this.state == eventSeries.state && Intrinsics.areEqual(this.event_ids, eventSeries.event_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        Instant instant = this.end_time;
        int iHashCode2 = ((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.event_ids.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        Instant instant = this.end_time;
        if (instant != null) {
            arrayList.add("end_time=" + instant);
        }
        arrayList.add("state=" + this.state);
        if (!this.event_ids.isEmpty()) {
            arrayList.add("event_ids=" + Internal.sanitize(this.event_ids));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventSeries{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventSeries copy$default(EventSeries eventSeries, String str, String str2, String str3, Instant instant, EventSeriesState eventSeriesState, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSeries.id;
        }
        if ((i & 2) != 0) {
            str2 = eventSeries.name;
        }
        if ((i & 4) != 0) {
            str3 = eventSeries.symbol;
        }
        if ((i & 8) != 0) {
            instant = eventSeries.end_time;
        }
        if ((i & 16) != 0) {
            eventSeriesState = eventSeries.state;
        }
        if ((i & 32) != 0) {
            list = eventSeries.event_ids;
        }
        if ((i & 64) != 0) {
            byteString = eventSeries.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        EventSeriesState eventSeriesState2 = eventSeriesState;
        String str4 = str3;
        return eventSeries.copy(str, str2, str4, instant, eventSeriesState2, list2, byteString2);
    }

    public final EventSeries copy(String id, String name, String symbol, Instant end_time, EventSeriesState state, List<String> event_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventSeries(id, name, symbol, end_time, state, event_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventSeries.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventSeries>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.EventSeries$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventSeries value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (value.getEnd_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getEnd_time());
                }
                if (value.getState() != EventSeriesState.EVENT_SERIES_STATE_UNSPECIFIED) {
                    size += EventSeriesState.ADAPTER.encodedSizeWithTag(5, value.getState());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(30, value.getEvent_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventSeries value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                if (value.getState() != EventSeriesState.EVENT_SERIES_STATE_UNSPECIFIED) {
                    EventSeriesState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 30, (int) value.getEvent_ids());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventSeries value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 30, (int) value.getEvent_ids());
                if (value.getState() != EventSeriesState.EVENT_SERIES_STATE_UNSPECIFIED) {
                    EventSeriesState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSymbol());
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
            public EventSeries decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventSeriesState eventSeriesState = EventSeriesState.EVENT_SERIES_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                EventSeriesState eventSeriesStateDecode = eventSeriesState;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EventSeries(strDecode3, strDecode, strDecode2, instantDecode, eventSeriesStateDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            eventSeriesStateDecode = EventSeriesState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 30) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventSeries redact(EventSeries value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant end_time = value.getEnd_time();
                return EventSeries.copy$default(value, null, null, null, end_time != null ? ProtoAdapter.INSTANT.redact(end_time) : null, null, null, ByteString.EMPTY, 55, null);
            }
        };
    }
}
