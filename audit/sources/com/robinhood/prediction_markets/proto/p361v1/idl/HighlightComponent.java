package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: HighlightComponent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponent;", "Lcom/squareup/wire/Message;", "", "rank", "", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "reserve_highlight_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;Lokio/ByteString;)V", "getRank", "()I", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "getReserve_highlight_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HighlightComponent extends Message {

    @JvmField
    public static final ProtoAdapter<HighlightComponent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventComponent#ADAPTER", jsonName = "eventComponent", oneofName = "component", schemaIndex = 1, tag = 2)
    private final EventComponent event_component;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int rank;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ReserveHighlightComponent#ADAPTER", jsonName = "reserveHighlightComponent", oneofName = "component", schemaIndex = 2, tag = 3)
    private final ReserveHighlightComponent reserve_highlight_component;

    public HighlightComponent() {
        this(0, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23820newBuilder();
    }

    public final int getRank() {
        return this.rank;
    }

    public final EventComponent getEvent_component() {
        return this.event_component;
    }

    public final ReserveHighlightComponent getReserve_highlight_component() {
        return this.reserve_highlight_component;
    }

    public /* synthetic */ HighlightComponent(int i, EventComponent eventComponent, ReserveHighlightComponent reserveHighlightComponent, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : eventComponent, (i2 & 4) != 0 ? null : reserveHighlightComponent, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightComponent(int i, EventComponent eventComponent, ReserveHighlightComponent reserveHighlightComponent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rank = i;
        this.event_component = eventComponent;
        this.reserve_highlight_component = reserveHighlightComponent;
        if (Internal.countNonNull(eventComponent, reserveHighlightComponent) > 1) {
            throw new IllegalArgumentException("At most one of event_component, reserve_highlight_component may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23820newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HighlightComponent)) {
            return false;
        }
        HighlightComponent highlightComponent = (HighlightComponent) other;
        return Intrinsics.areEqual(unknownFields(), highlightComponent.unknownFields()) && this.rank == highlightComponent.rank && Intrinsics.areEqual(this.event_component, highlightComponent.event_component) && Intrinsics.areEqual(this.reserve_highlight_component, highlightComponent.reserve_highlight_component);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.rank)) * 37;
        EventComponent eventComponent = this.event_component;
        int iHashCode2 = (iHashCode + (eventComponent != null ? eventComponent.hashCode() : 0)) * 37;
        ReserveHighlightComponent reserveHighlightComponent = this.reserve_highlight_component;
        int iHashCode3 = iHashCode2 + (reserveHighlightComponent != null ? reserveHighlightComponent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rank=" + this.rank);
        EventComponent eventComponent = this.event_component;
        if (eventComponent != null) {
            arrayList.add("event_component=" + eventComponent);
        }
        ReserveHighlightComponent reserveHighlightComponent = this.reserve_highlight_component;
        if (reserveHighlightComponent != null) {
            arrayList.add("reserve_highlight_component=" + reserveHighlightComponent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HighlightComponent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HighlightComponent copy$default(HighlightComponent highlightComponent, int i, EventComponent eventComponent, ReserveHighlightComponent reserveHighlightComponent, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = highlightComponent.rank;
        }
        if ((i2 & 2) != 0) {
            eventComponent = highlightComponent.event_component;
        }
        if ((i2 & 4) != 0) {
            reserveHighlightComponent = highlightComponent.reserve_highlight_component;
        }
        if ((i2 & 8) != 0) {
            byteString = highlightComponent.unknownFields();
        }
        return highlightComponent.copy(i, eventComponent, reserveHighlightComponent, byteString);
    }

    public final HighlightComponent copy(int rank, EventComponent event_component, ReserveHighlightComponent reserve_highlight_component, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HighlightComponent(rank, event_component, reserve_highlight_component, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HighlightComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HighlightComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.HighlightComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HighlightComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRank() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getRank()));
                }
                return size + EventComponent.ADAPTER.encodedSizeWithTag(2, value.getEvent_component()) + ReserveHighlightComponent.ADAPTER.encodedSizeWithTag(3, value.getReserve_highlight_component());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HighlightComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getRank()));
                }
                EventComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent_component());
                ReserveHighlightComponent.ADAPTER.encodeWithTag(writer, 3, (int) value.getReserve_highlight_component());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HighlightComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ReserveHighlightComponent.ADAPTER.encodeWithTag(writer, 3, (int) value.getReserve_highlight_component());
                EventComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent_component());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getRank()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightComponent redact(HighlightComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EventComponent event_component = value.getEvent_component();
                EventComponent eventComponentRedact = event_component != null ? EventComponent.ADAPTER.redact(event_component) : null;
                ReserveHighlightComponent reserve_highlight_component = value.getReserve_highlight_component();
                return HighlightComponent.copy$default(value, 0, eventComponentRedact, reserve_highlight_component != null ? ReserveHighlightComponent.ADAPTER.redact(reserve_highlight_component) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HighlightComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                EventComponent eventComponentDecode = null;
                ReserveHighlightComponent reserveHighlightComponentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HighlightComponent(iIntValue, eventComponentDecode, reserveHighlightComponentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        eventComponentDecode = EventComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        reserveHighlightComponentDecode = ReserveHighlightComponent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
