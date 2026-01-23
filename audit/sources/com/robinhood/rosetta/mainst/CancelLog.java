package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.Route;
import rosetta.order.Agent;

/* compiled from: CancelLog.kt */
@kotlin.Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J^\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLog;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/Time;", "open_agent", "Lrosetta/order/Agent;", "open_at", "closed_agent", "closed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Route;Lokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getDate", "()Lcom/robinhood/rosetta/mainst/Time;", "getOpen_agent", "()Lrosetta/order/Agent;", "getOpen_at", "getClosed_agent", "getClosed_at", "getRoute", "()Lrosetta/mainst/Route;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CancelLog extends Message {

    @JvmField
    public static final ProtoAdapter<CancelLog> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "closedAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Agent closed_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "closedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Time closed_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time date;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "openAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Agent open_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "openAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time open_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Route route;

    public CancelLog() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24641newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final Time getDate() {
        return this.date;
    }

    public final Agent getOpen_agent() {
        return this.open_agent;
    }

    public /* synthetic */ CancelLog(UUID uuid, Time time, Agent agent, Time time2, Agent agent2, Time time3, Route route, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : time, (i & 4) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i & 8) != 0 ? null : time2, (i & 16) != 0 ? Agent.AGENT_UNSPECIFIED : agent2, (i & 32) != 0 ? null : time3, (i & 64) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Time getOpen_at() {
        return this.open_at;
    }

    public final Agent getClosed_agent() {
        return this.closed_agent;
    }

    public final Time getClosed_at() {
        return this.closed_at;
    }

    public final Route getRoute() {
        return this.route;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelLog(UUID uuid, Time time, Agent open_agent, Time time2, Agent closed_agent, Time time3, Route route, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(open_agent, "open_agent");
        Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.date = time;
        this.open_agent = open_agent;
        this.open_at = time2;
        this.closed_agent = closed_agent;
        this.closed_at = time3;
        this.route = route;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24641newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CancelLog)) {
            return false;
        }
        CancelLog cancelLog = (CancelLog) other;
        return Intrinsics.areEqual(unknownFields(), cancelLog.unknownFields()) && Intrinsics.areEqual(this.order_id, cancelLog.order_id) && Intrinsics.areEqual(this.date, cancelLog.date) && this.open_agent == cancelLog.open_agent && Intrinsics.areEqual(this.open_at, cancelLog.open_at) && this.closed_agent == cancelLog.closed_agent && Intrinsics.areEqual(this.closed_at, cancelLog.closed_at) && this.route == cancelLog.route;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        Time time = this.date;
        int iHashCode3 = (((iHashCode2 + (time != null ? time.hashCode() : 0)) * 37) + this.open_agent.hashCode()) * 37;
        Time time2 = this.open_at;
        int iHashCode4 = (((iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.closed_agent.hashCode()) * 37;
        Time time3 = this.closed_at;
        int iHashCode5 = ((iHashCode4 + (time3 != null ? time3.hashCode() : 0)) * 37) + this.route.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        Time time = this.date;
        if (time != null) {
            arrayList.add("date=" + time);
        }
        arrayList.add("open_agent=" + this.open_agent);
        Time time2 = this.open_at;
        if (time2 != null) {
            arrayList.add("open_at=" + time2);
        }
        arrayList.add("closed_agent=" + this.closed_agent);
        Time time3 = this.closed_at;
        if (time3 != null) {
            arrayList.add("closed_at=" + time3);
        }
        arrayList.add("route=" + this.route);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelLog{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CancelLog copy$default(CancelLog cancelLog, UUID uuid, Time time, Agent agent, Time time2, Agent agent2, Time time3, Route route, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cancelLog.order_id;
        }
        if ((i & 2) != 0) {
            time = cancelLog.date;
        }
        if ((i & 4) != 0) {
            agent = cancelLog.open_agent;
        }
        if ((i & 8) != 0) {
            time2 = cancelLog.open_at;
        }
        if ((i & 16) != 0) {
            agent2 = cancelLog.closed_agent;
        }
        if ((i & 32) != 0) {
            time3 = cancelLog.closed_at;
        }
        if ((i & 64) != 0) {
            route = cancelLog.route;
        }
        if ((i & 128) != 0) {
            byteString = cancelLog.unknownFields();
        }
        Route route2 = route;
        ByteString byteString2 = byteString;
        Agent agent3 = agent2;
        Time time4 = time3;
        return cancelLog.copy(uuid, time, agent, time2, agent3, time4, route2, byteString2);
    }

    public final CancelLog copy(UUID order_id, Time date, Agent open_agent, Time open_at, Agent closed_agent, Time closed_at, Route route, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(open_agent, "open_agent");
        Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CancelLog(order_id, date, open_agent, open_at, closed_agent, closed_at, route, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CancelLog.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CancelLog>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.CancelLog$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CancelLog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getDate() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getDate());
                }
                Agent open_agent = value.getOpen_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (open_agent != agent) {
                    size += Agent.ADAPTER.encodedSizeWithTag(3, value.getOpen_agent());
                }
                if (value.getOpen_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getOpen_at());
                }
                if (value.getClosed_agent() != agent) {
                    size += Agent.ADAPTER.encodedSizeWithTag(5, value.getClosed_agent());
                }
                if (value.getClosed_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(6, value.getClosed_at());
                }
                return value.getRoute() != Route.ROUTE_UNSPECIFIED ? size + Route.ADAPTER.encodedSizeWithTag(7, value.getRoute()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CancelLog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getDate() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate());
                }
                Agent open_agent = value.getOpen_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (open_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_agent());
                }
                if (value.getOpen_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getOpen_at());
                }
                if (value.getClosed_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 5, (int) value.getClosed_agent());
                }
                if (value.getClosed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getClosed_at());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 7, (int) value.getRoute());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CancelLog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 7, (int) value.getRoute());
                }
                if (value.getClosed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getClosed_at());
                }
                Agent closed_agent = value.getClosed_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (closed_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 5, (int) value.getClosed_agent());
                }
                if (value.getOpen_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getOpen_at());
                }
                if (value.getOpen_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_agent());
                }
                if (value.getDate() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CancelLog decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Agent agent = Agent.AGENT_UNSPECIFIED;
                Route route = Route.ROUTE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Route routeDecode = route;
                UUID uuidDecode = null;
                Time timeDecode = null;
                Time timeDecode2 = null;
                Time timeDecode3 = null;
                Agent agentDecode = agent;
                Agent agentDecode2 = agentDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 2:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 3:
                                try {
                                    agentDecode = Agent.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 5:
                                try {
                                    agentDecode2 = Agent.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                timeDecode3 = Time.ADAPTER.decode(reader);
                                break;
                            case 7:
                                try {
                                    routeDecode = Route.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CancelLog(uuidDecode, timeDecode, agentDecode, timeDecode2, agentDecode2, timeDecode3, routeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CancelLog redact(CancelLog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                Time date = value.getDate();
                Time timeRedact = date != null ? Time.ADAPTER.redact(date) : null;
                Time open_at = value.getOpen_at();
                Time timeRedact2 = open_at != null ? Time.ADAPTER.redact(open_at) : null;
                Time closed_at = value.getClosed_at();
                return CancelLog.copy$default(value, uuidRedact, timeRedact, null, timeRedact2, null, closed_at != null ? Time.ADAPTER.redact(closed_at) : null, null, ByteString.EMPTY, 84, null);
            }
        };
    }
}
