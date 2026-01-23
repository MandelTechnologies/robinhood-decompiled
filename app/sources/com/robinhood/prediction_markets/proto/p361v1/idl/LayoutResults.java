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

/* compiled from: LayoutResults.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutResults;", "Lcom/squareup/wire/Message;", "", "node_id", "", "components", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/Component;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getNode_id", "()Ljava/lang/String;", "getComponents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LayoutResults extends Message {

    @JvmField
    public static final ProtoAdapter<LayoutResults> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.Component#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Component> components;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nodeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String node_id;

    public LayoutResults() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23822newBuilder();
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public /* synthetic */ LayoutResults(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutResults(String node_id, List<Component> components, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.node_id = node_id;
        this.components = Internal.immutableCopyOf("components", components);
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23822newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LayoutResults)) {
            return false;
        }
        LayoutResults layoutResults = (LayoutResults) other;
        return Intrinsics.areEqual(unknownFields(), layoutResults.unknownFields()) && Intrinsics.areEqual(this.node_id, layoutResults.node_id) && Intrinsics.areEqual(this.components, layoutResults.components);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.node_id.hashCode()) * 37) + this.components.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("node_id=" + Internal.sanitize(this.node_id));
        if (!this.components.isEmpty()) {
            arrayList.add("components=" + this.components);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LayoutResults{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutResults copy$default(LayoutResults layoutResults, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = layoutResults.node_id;
        }
        if ((i & 2) != 0) {
            list = layoutResults.components;
        }
        if ((i & 4) != 0) {
            byteString = layoutResults.unknownFields();
        }
        return layoutResults.copy(str, list, byteString);
    }

    public final LayoutResults copy(String node_id, List<Component> components, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LayoutResults(node_id, components, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LayoutResults.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LayoutResults>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.LayoutResults$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LayoutResults value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNode_id());
                }
                return size + Component.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getComponents());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LayoutResults value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
                }
                Component.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponents());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LayoutResults value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Component.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponents());
                if (Intrinsics.areEqual(value.getNode_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LayoutResults decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LayoutResults(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(Component.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LayoutResults redact(LayoutResults value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LayoutResults.copy$default(value, null, Internal.m26823redactElements(value.getComponents(), Component.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
