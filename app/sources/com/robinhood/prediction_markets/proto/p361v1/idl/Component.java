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

/* compiled from: Component.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/Component;", "Lcom/squareup/wire/Message;", "", "rank", "", "section_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponent;", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "section_divider_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILcom/robinhood/prediction_markets/proto/v1/idl/SectionComponent;Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponent;Lokio/ByteString;)V", "getRank", "()I", "getSection_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponent;", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "getSection_divider_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponent;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Component extends Message {

    @JvmField
    public static final ProtoAdapter<Component> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventComponent#ADAPTER", jsonName = "eventComponent", oneofName = "component", schemaIndex = 2, tag = 3)
    private final EventComponent event_component;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int rank;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.SectionComponent#ADAPTER", jsonName = "sectionComponent", oneofName = "component", schemaIndex = 1, tag = 2)
    private final SectionComponent section_component;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.SectionDividerComponent#ADAPTER", jsonName = "sectionDividerComponent", oneofName = "component", schemaIndex = 3, tag = 4)
    private final SectionDividerComponent section_divider_component;

    public Component() {
        this(0, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23771newBuilder();
    }

    public final int getRank() {
        return this.rank;
    }

    public final SectionComponent getSection_component() {
        return this.section_component;
    }

    public final EventComponent getEvent_component() {
        return this.event_component;
    }

    public final SectionDividerComponent getSection_divider_component() {
        return this.section_divider_component;
    }

    public /* synthetic */ Component(int i, SectionComponent sectionComponent, EventComponent eventComponent, SectionDividerComponent sectionDividerComponent, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : sectionComponent, (i2 & 4) != 0 ? null : eventComponent, (i2 & 8) != 0 ? null : sectionDividerComponent, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Component(int i, SectionComponent sectionComponent, EventComponent eventComponent, SectionDividerComponent sectionDividerComponent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rank = i;
        this.section_component = sectionComponent;
        this.event_component = eventComponent;
        this.section_divider_component = sectionDividerComponent;
        if (Internal.countNonNull(sectionComponent, eventComponent, sectionDividerComponent) > 1) {
            throw new IllegalArgumentException("At most one of section_component, event_component, section_divider_component may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23771newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Component)) {
            return false;
        }
        Component component = (Component) other;
        return Intrinsics.areEqual(unknownFields(), component.unknownFields()) && this.rank == component.rank && Intrinsics.areEqual(this.section_component, component.section_component) && Intrinsics.areEqual(this.event_component, component.event_component) && Intrinsics.areEqual(this.section_divider_component, component.section_divider_component);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.rank)) * 37;
        SectionComponent sectionComponent = this.section_component;
        int iHashCode2 = (iHashCode + (sectionComponent != null ? sectionComponent.hashCode() : 0)) * 37;
        EventComponent eventComponent = this.event_component;
        int iHashCode3 = (iHashCode2 + (eventComponent != null ? eventComponent.hashCode() : 0)) * 37;
        SectionDividerComponent sectionDividerComponent = this.section_divider_component;
        int iHashCode4 = iHashCode3 + (sectionDividerComponent != null ? sectionDividerComponent.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rank=" + this.rank);
        SectionComponent sectionComponent = this.section_component;
        if (sectionComponent != null) {
            arrayList.add("section_component=" + sectionComponent);
        }
        EventComponent eventComponent = this.event_component;
        if (eventComponent != null) {
            arrayList.add("event_component=" + eventComponent);
        }
        SectionDividerComponent sectionDividerComponent = this.section_divider_component;
        if (sectionDividerComponent != null) {
            arrayList.add("section_divider_component=" + sectionDividerComponent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Component{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Component copy$default(Component component, int i, SectionComponent sectionComponent, EventComponent eventComponent, SectionDividerComponent sectionDividerComponent, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = component.rank;
        }
        if ((i2 & 2) != 0) {
            sectionComponent = component.section_component;
        }
        if ((i2 & 4) != 0) {
            eventComponent = component.event_component;
        }
        if ((i2 & 8) != 0) {
            sectionDividerComponent = component.section_divider_component;
        }
        if ((i2 & 16) != 0) {
            byteString = component.unknownFields();
        }
        ByteString byteString2 = byteString;
        EventComponent eventComponent2 = eventComponent;
        return component.copy(i, sectionComponent, eventComponent2, sectionDividerComponent, byteString2);
    }

    public final Component copy(int rank, SectionComponent section_component, EventComponent event_component, SectionDividerComponent section_divider_component, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Component(rank, section_component, event_component, section_divider_component, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Component.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Component>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.Component$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Component value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRank() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getRank()));
                }
                return size + SectionComponent.ADAPTER.encodedSizeWithTag(2, value.getSection_component()) + EventComponent.ADAPTER.encodedSizeWithTag(3, value.getEvent_component()) + SectionDividerComponent.ADAPTER.encodedSizeWithTag(4, value.getSection_divider_component());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Component value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getRank()));
                }
                SectionComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getSection_component());
                EventComponent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_component());
                SectionDividerComponent.ADAPTER.encodeWithTag(writer, 4, (int) value.getSection_divider_component());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Component value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SectionDividerComponent.ADAPTER.encodeWithTag(writer, 4, (int) value.getSection_divider_component());
                EventComponent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_component());
                SectionComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getSection_component());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getRank()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Component redact(Component value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SectionComponent section_component = value.getSection_component();
                SectionComponent sectionComponentRedact = section_component != null ? SectionComponent.ADAPTER.redact(section_component) : null;
                EventComponent event_component = value.getEvent_component();
                EventComponent eventComponentRedact = event_component != null ? EventComponent.ADAPTER.redact(event_component) : null;
                SectionDividerComponent section_divider_component = value.getSection_divider_component();
                return Component.copy$default(value, 0, sectionComponentRedact, eventComponentRedact, section_divider_component != null ? SectionDividerComponent.ADAPTER.redact(section_divider_component) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Component decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SectionComponent sectionComponentDecode = null;
                int iIntValue = 0;
                EventComponent eventComponentDecode = null;
                SectionDividerComponent sectionDividerComponentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Component(iIntValue, sectionComponentDecode, eventComponentDecode, sectionDividerComponentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        sectionComponentDecode = SectionComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        eventComponentDecode = EventComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        sectionDividerComponentDecode = SectionDividerComponent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
