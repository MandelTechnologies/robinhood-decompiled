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

/* compiled from: SectionComponent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponent;", "Lcom/squareup/wire/Message;", "", "node_id", "", "header", "total_events_count", "", "preview_events", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lokio/ByteString;)V", "getNode_id", "()Ljava/lang/String;", "getHeader", "getTotal_events_count", "()I", "getPreview_events", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SectionComponent extends Message {

    @JvmField
    public static final ProtoAdapter<SectionComponent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nodeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String node_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventComponent#ADAPTER", jsonName = "previewEvents", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<EventComponent> preview_events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalEventsCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int total_events_count;

    public SectionComponent() {
        this(null, null, 0, null, null, 31, null);
    }

    public /* synthetic */ SectionComponent(String str, String str2, int i, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23841newBuilder();
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getTotal_events_count() {
        return this.total_events_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionComponent(String node_id, String header, int i, List<EventComponent> preview_events, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(preview_events, "preview_events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.node_id = node_id;
        this.header = header;
        this.total_events_count = i;
        this.preview_events = Internal.immutableCopyOf("preview_events", preview_events);
    }

    public final List<EventComponent> getPreview_events() {
        return this.preview_events;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23841newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SectionComponent)) {
            return false;
        }
        SectionComponent sectionComponent = (SectionComponent) other;
        return Intrinsics.areEqual(unknownFields(), sectionComponent.unknownFields()) && Intrinsics.areEqual(this.node_id, sectionComponent.node_id) && Intrinsics.areEqual(this.header, sectionComponent.header) && this.total_events_count == sectionComponent.total_events_count && Intrinsics.areEqual(this.preview_events, sectionComponent.preview_events);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.node_id.hashCode()) * 37) + this.header.hashCode()) * 37) + Integer.hashCode(this.total_events_count)) * 37) + this.preview_events.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("node_id=" + Internal.sanitize(this.node_id));
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("total_events_count=" + this.total_events_count);
        if (!this.preview_events.isEmpty()) {
            arrayList.add("preview_events=" + this.preview_events);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionComponent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SectionComponent copy$default(SectionComponent sectionComponent, String str, String str2, int i, List list, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sectionComponent.node_id;
        }
        if ((i2 & 2) != 0) {
            str2 = sectionComponent.header;
        }
        if ((i2 & 4) != 0) {
            i = sectionComponent.total_events_count;
        }
        if ((i2 & 8) != 0) {
            list = sectionComponent.preview_events;
        }
        if ((i2 & 16) != 0) {
            byteString = sectionComponent.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return sectionComponent.copy(str, str2, i3, list, byteString2);
    }

    public final SectionComponent copy(String node_id, String header, int total_events_count, List<EventComponent> preview_events, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(preview_events, "preview_events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SectionComponent(node_id, header, total_events_count, preview_events, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SectionComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SectionComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.SectionComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SectionComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeader());
                }
                if (value.getTotal_events_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTotal_events_count()));
                }
                return size + EventComponent.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getPreview_events());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SectionComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader());
                }
                if (value.getTotal_events_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_events_count()));
                }
                EventComponent.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getPreview_events());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SectionComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EventComponent.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getPreview_events());
                if (value.getTotal_events_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_events_count()));
                }
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader());
                }
                if (Intrinsics.areEqual(value.getNode_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SectionComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SectionComponent(strDecode, strDecode2, iIntValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        arrayList.add(EventComponent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SectionComponent redact(SectionComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SectionComponent.copy$default(value, null, null, 0, Internal.m26823redactElements(value.getPreview_events(), EventComponent.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
