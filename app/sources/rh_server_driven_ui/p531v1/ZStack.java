package rh_server_driven_ui.p531v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ZStack;

/* compiled from: ZStack.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack;", "Lcom/squareup/wire/Message;", "", "layers", "", "Lrh_server_driven_ui/v1/ZStack$Layer;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getLayers", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Layer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ZStack extends Message {

    @JvmField
    public static final ProtoAdapter<ZStack> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ZStack$Layer#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Layer> layers;

    /* JADX WARN: Multi-variable type inference failed */
    public ZStack() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29870newBuilder();
    }

    public /* synthetic */ ZStack(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZStack(List<Layer> layers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.layers = Internal.immutableCopyOf("layers", layers);
    }

    public final List<Layer> getLayers() {
        return this.layers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29870newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ZStack)) {
            return false;
        }
        ZStack zStack = (ZStack) other;
        return Intrinsics.areEqual(unknownFields(), zStack.unknownFields()) && Intrinsics.areEqual(this.layers, zStack.layers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layers.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.layers.isEmpty()) {
            arrayList.add("layers=" + this.layers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ZStack{", "}", 0, null, null, 56, null);
    }

    public final ZStack copy(List<Layer> layers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ZStack(layers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ZStack.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ZStack>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ZStack$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ZStack value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ZStack.Layer.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLayers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ZStack value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ZStack.Layer.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLayers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ZStack value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ZStack.Layer.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLayers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ZStack decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ZStack(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ZStack.Layer.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ZStack redact(ZStack value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getLayers(), ZStack.Layer.ADAPTER), ByteString.EMPTY);
            }
        };
    }

    /* compiled from: ZStack.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer;", "Lcom/squareup/wire/Message;", "", "component", "Lrh_server_driven_ui/v1/UIComponent;", "constraints", "", "Lrh_server_driven_ui/v1/ZStack$Layer$Constraint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Ljava/util/List;Lokio/ByteString;)V", "getComponent", "()Lrh_server_driven_ui/v1/UIComponent;", "getConstraints", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Constraint", "Edge", "Axis", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Layer extends Message {

        @JvmField
        public static final ProtoAdapter<Layer> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final UIComponent component;

        @WireField(adapter = "rh_server_driven_ui.v1.ZStack$Layer$Constraint#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<Constraint> constraints;

        public Layer() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29871newBuilder();
        }

        public final UIComponent getComponent() {
            return this.component;
        }

        public /* synthetic */ Layer(UIComponent uIComponent, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Layer(UIComponent uIComponent, List<Constraint> constraints, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.component = uIComponent;
            this.constraints = Internal.immutableCopyOf("constraints", constraints);
        }

        public final List<Constraint> getConstraints() {
            return this.constraints;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29871newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Layer)) {
                return false;
            }
            Layer layer = (Layer) other;
            return Intrinsics.areEqual(unknownFields(), layer.unknownFields()) && Intrinsics.areEqual(this.component, layer.component) && Intrinsics.areEqual(this.constraints, layer.constraints);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            UIComponent uIComponent = this.component;
            int iHashCode2 = ((iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37) + this.constraints.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            UIComponent uIComponent = this.component;
            if (uIComponent != null) {
                arrayList.add("component=" + uIComponent);
            }
            if (!this.constraints.isEmpty()) {
                arrayList.add("constraints=" + this.constraints);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Layer{", "}", 0, null, null, 56, null);
        }

        public final Layer copy(UIComponent component, List<Constraint> constraints, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Layer(component, constraints, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Layer.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Layer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ZStack$Layer$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ZStack.Layer value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getComponent() != null) {
                        size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getComponent());
                    }
                    return size + ZStack.Layer.Constraint.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getConstraints());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ZStack.Layer value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getComponent() != null) {
                        UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                    }
                    ZStack.Layer.Constraint.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getConstraints());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ZStack.Layer value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ZStack.Layer.Constraint.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getConstraints());
                    if (value.getComponent() != null) {
                        UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ZStack.Layer decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    UIComponent uIComponentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ZStack.Layer(uIComponentDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            arrayList.add(ZStack.Layer.Constraint.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ZStack.Layer redact(ZStack.Layer value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    UIComponent component = value.getComponent();
                    return value.copy(component != null ? UIComponent.ADAPTER.redact(component) : null, Internal.m26823redactElements(value.getConstraints(), ZStack.Layer.Constraint.ADAPTER), ByteString.EMPTY);
                }
            };
        }

        /* compiled from: ZStack.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer$Constraint;", "Lcom/squareup/wire/Message;", "", "parent_edge", "Lrh_server_driven_ui/v1/ZStack$Layer$Edge;", "layer_edge", "axis", "Lrh_server_driven_ui/v1/ZStack$Layer$Axis;", "offset", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ZStack$Layer$Edge;Lrh_server_driven_ui/v1/ZStack$Layer$Edge;Lrh_server_driven_ui/v1/ZStack$Layer$Axis;DLokio/ByteString;)V", "getParent_edge", "()Lrh_server_driven_ui/v1/ZStack$Layer$Edge;", "getLayer_edge", "getAxis", "()Lrh_server_driven_ui/v1/ZStack$Layer$Axis;", "getOffset", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Constraint extends Message {

            @JvmField
            public static final ProtoAdapter<Constraint> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.ZStack$Layer$Axis#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final Axis axis;

            @WireField(adapter = "rh_server_driven_ui.v1.ZStack$Layer$Edge#ADAPTER", jsonName = "layerEdge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final Edge layer_edge;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final double offset;

            @WireField(adapter = "rh_server_driven_ui.v1.ZStack$Layer$Edge#ADAPTER", jsonName = "parentEdge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Edge parent_edge;

            public Constraint() {
                this(null, null, null, 0.0d, null, 31, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29872newBuilder();
            }

            public final Edge getParent_edge() {
                return this.parent_edge;
            }

            public /* synthetic */ Constraint(Edge edge, Edge edge2, Axis axis, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? Edge.EDGE_UNSPECIFIED : edge, (i & 2) != 0 ? Edge.EDGE_UNSPECIFIED : edge2, (i & 4) != 0 ? Axis.AXIS_UNSPECIFIED : axis, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public final Edge getLayer_edge() {
                return this.layer_edge;
            }

            public final Axis getAxis() {
                return this.axis;
            }

            public final double getOffset() {
                return this.offset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Constraint(Edge parent_edge, Edge layer_edge, Axis axis, double d, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(parent_edge, "parent_edge");
                Intrinsics.checkNotNullParameter(layer_edge, "layer_edge");
                Intrinsics.checkNotNullParameter(axis, "axis");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.parent_edge = parent_edge;
                this.layer_edge = layer_edge;
                this.axis = axis;
                this.offset = d;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29872newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Constraint)) {
                    return false;
                }
                Constraint constraint = (Constraint) other;
                return Intrinsics.areEqual(unknownFields(), constraint.unknownFields()) && this.parent_edge == constraint.parent_edge && this.layer_edge == constraint.layer_edge && this.axis == constraint.axis && this.offset == constraint.offset;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((((unknownFields().hashCode() * 37) + this.parent_edge.hashCode()) * 37) + this.layer_edge.hashCode()) * 37) + this.axis.hashCode()) * 37) + Double.hashCode(this.offset);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("parent_edge=" + this.parent_edge);
                arrayList.add("layer_edge=" + this.layer_edge);
                arrayList.add("axis=" + this.axis);
                arrayList.add("offset=" + this.offset);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Constraint{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Constraint copy$default(Constraint constraint, Edge edge, Edge edge2, Axis axis, double d, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    edge = constraint.parent_edge;
                }
                if ((i & 2) != 0) {
                    edge2 = constraint.layer_edge;
                }
                if ((i & 4) != 0) {
                    axis = constraint.axis;
                }
                if ((i & 8) != 0) {
                    d = constraint.offset;
                }
                if ((i & 16) != 0) {
                    byteString = constraint.unknownFields();
                }
                ByteString byteString2 = byteString;
                Axis axis2 = axis;
                return constraint.copy(edge, edge2, axis2, d, byteString2);
            }

            public final Constraint copy(Edge parent_edge, Edge layer_edge, Axis axis, double offset, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(parent_edge, "parent_edge");
                Intrinsics.checkNotNullParameter(layer_edge, "layer_edge");
                Intrinsics.checkNotNullParameter(axis, "axis");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Constraint(parent_edge, layer_edge, axis, offset, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Constraint.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Constraint>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ZStack$Layer$Constraint$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ZStack.Layer.Constraint value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ZStack.Layer.Edge parent_edge = value.getParent_edge();
                        ZStack.Layer.Edge edge = ZStack.Layer.Edge.EDGE_UNSPECIFIED;
                        if (parent_edge != edge) {
                            size += ZStack.Layer.Edge.ADAPTER.encodedSizeWithTag(1, value.getParent_edge());
                        }
                        if (value.getLayer_edge() != edge) {
                            size += ZStack.Layer.Edge.ADAPTER.encodedSizeWithTag(2, value.getLayer_edge());
                        }
                        if (value.getAxis() != ZStack.Layer.Axis.AXIS_UNSPECIFIED) {
                            size += ZStack.Layer.Axis.ADAPTER.encodedSizeWithTag(3, value.getAxis());
                        }
                        return !Double.valueOf(value.getOffset()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getOffset())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ZStack.Layer.Constraint value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ZStack.Layer.Edge parent_edge = value.getParent_edge();
                        ZStack.Layer.Edge edge = ZStack.Layer.Edge.EDGE_UNSPECIFIED;
                        if (parent_edge != edge) {
                            ZStack.Layer.Edge.ADAPTER.encodeWithTag(writer, 1, (int) value.getParent_edge());
                        }
                        if (value.getLayer_edge() != edge) {
                            ZStack.Layer.Edge.ADAPTER.encodeWithTag(writer, 2, (int) value.getLayer_edge());
                        }
                        if (value.getAxis() != ZStack.Layer.Axis.AXIS_UNSPECIFIED) {
                            ZStack.Layer.Axis.ADAPTER.encodeWithTag(writer, 3, (int) value.getAxis());
                        }
                        if (!Double.valueOf(value.getOffset()).equals(Double.valueOf(0.0d))) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getOffset()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ZStack.Layer.Constraint value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Double.valueOf(value.getOffset()).equals(Double.valueOf(0.0d))) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getOffset()));
                        }
                        if (value.getAxis() != ZStack.Layer.Axis.AXIS_UNSPECIFIED) {
                            ZStack.Layer.Axis.ADAPTER.encodeWithTag(writer, 3, (int) value.getAxis());
                        }
                        ZStack.Layer.Edge layer_edge = value.getLayer_edge();
                        ZStack.Layer.Edge edge = ZStack.Layer.Edge.EDGE_UNSPECIFIED;
                        if (layer_edge != edge) {
                            ZStack.Layer.Edge.ADAPTER.encodeWithTag(writer, 2, (int) value.getLayer_edge());
                        }
                        if (value.getParent_edge() != edge) {
                            ZStack.Layer.Edge.ADAPTER.encodeWithTag(writer, 1, (int) value.getParent_edge());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ZStack.Layer.Constraint decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        ZStack.Layer.Edge edge = ZStack.Layer.Edge.EDGE_UNSPECIFIED;
                        ZStack.Layer.Axis axis = ZStack.Layer.Axis.AXIS_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        double dDoubleValue = 0.0d;
                        ZStack.Layer.Edge edgeDecode = edge;
                        ZStack.Layer.Axis axisDecode = axis;
                        ZStack.Layer.Edge edgeDecode2 = edgeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ZStack.Layer.Constraint(edgeDecode2, edgeDecode, axisDecode, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    edgeDecode2 = ZStack.Layer.Edge.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                try {
                                    edgeDecode = ZStack.Layer.Edge.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (iNextTag == 3) {
                                try {
                                    axisDecode = ZStack.Layer.Axis.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                            } else if (iNextTag == 4) {
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ZStack.Layer.Constraint redact(ZStack.Layer.Constraint value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return ZStack.Layer.Constraint.copy$default(value, null, null, null, 0.0d, ByteString.EMPTY, 15, null);
                    }
                };
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ZStack.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer$Edge;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EDGE_UNSPECIFIED", "EDGE_START", "EDGE_CENTER", "EDGE_END", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Edge implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Edge[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Edge> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Edge EDGE_CENTER;
            public static final Edge EDGE_END;
            public static final Edge EDGE_START;
            public static final Edge EDGE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Edge[] $values() {
                return new Edge[]{EDGE_UNSPECIFIED, EDGE_START, EDGE_CENTER, EDGE_END};
            }

            @JvmStatic
            public static final Edge fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Edge> getEntries() {
                return $ENTRIES;
            }

            private Edge(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Edge edge = new Edge("EDGE_UNSPECIFIED", 0, 0);
                EDGE_UNSPECIFIED = edge;
                EDGE_START = new Edge("EDGE_START", 1, 1);
                EDGE_CENTER = new Edge("EDGE_CENTER", 2, 2);
                EDGE_END = new Edge("EDGE_END", 3, 3);
                Edge[] edgeArr$values = $values();
                $VALUES = edgeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(edgeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Edge.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Edge>(orCreateKotlinClass, syntax, edge) { // from class: rh_server_driven_ui.v1.ZStack$Layer$Edge$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public ZStack.Layer.Edge fromValue(int value) {
                        return ZStack.Layer.Edge.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: ZStack.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer$Edge$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/ZStack$Layer$Edge;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Edge fromValue(int value) {
                    if (value == 0) {
                        return Edge.EDGE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Edge.EDGE_START;
                    }
                    if (value == 2) {
                        return Edge.EDGE_CENTER;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Edge.EDGE_END;
                }
            }

            public static Edge valueOf(String str) {
                return (Edge) Enum.valueOf(Edge.class, str);
            }

            public static Edge[] values() {
                return (Edge[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ZStack.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer$Axis;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AXIS_UNSPECIFIED", "AXIS_X", "AXIS_Y", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Axis implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Axis[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Axis> ADAPTER;
            public static final Axis AXIS_UNSPECIFIED;
            public static final Axis AXIS_X;
            public static final Axis AXIS_Y;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;

            private static final /* synthetic */ Axis[] $values() {
                return new Axis[]{AXIS_UNSPECIFIED, AXIS_X, AXIS_Y};
            }

            @JvmStatic
            public static final Axis fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Axis> getEntries() {
                return $ENTRIES;
            }

            private Axis(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Axis axis = new Axis("AXIS_UNSPECIFIED", 0, 0);
                AXIS_UNSPECIFIED = axis;
                AXIS_X = new Axis("AXIS_X", 1, 1);
                AXIS_Y = new Axis("AXIS_Y", 2, 2);
                Axis[] axisArr$values = $values();
                $VALUES = axisArr$values;
                $ENTRIES = EnumEntries2.enumEntries(axisArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Axis.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Axis>(orCreateKotlinClass, syntax, axis) { // from class: rh_server_driven_ui.v1.ZStack$Layer$Axis$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public ZStack.Layer.Axis fromValue(int value) {
                        return ZStack.Layer.Axis.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: ZStack.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/ZStack$Layer$Axis$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/ZStack$Layer$Axis;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Axis fromValue(int value) {
                    if (value == 0) {
                        return Axis.AXIS_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Axis.AXIS_X;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Axis.AXIS_Y;
                }
            }

            public static Axis valueOf(String str) {
                return (Axis) Enum.valueOf(Axis.class, str);
            }

            public static Axis[] values() {
                return (Axis[]) $VALUES.clone();
            }
        }
    }
}
