package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: ComponentHierarchy.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "Lcom/squareup/wire/Message;", "", "parent_0", "Lcom/robinhood/rosetta/eventlogging/Component;", "parent_1", "parent_2", "parent_3", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/Component;Lokio/ByteString;)V", "getParent_0", "()Lcom/robinhood/rosetta/eventlogging/Component;", "getParent_1", "getParent_2", "getParent_3", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ComponentHierarchy extends Message {

    @JvmField
    public static final ProtoAdapter<ComponentHierarchy> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", jsonName = "parent0", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Component parent_0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", jsonName = "parent1", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Component parent_1;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", jsonName = "parent2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Component parent_2;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", jsonName = "parent3", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Component parent_3;

    public ComponentHierarchy() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24136newBuilder();
    }

    public final Component getParent_0() {
        return this.parent_0;
    }

    public final Component getParent_1() {
        return this.parent_1;
    }

    public final Component getParent_2() {
        return this.parent_2;
    }

    public final Component getParent_3() {
        return this.parent_3;
    }

    public /* synthetic */ ComponentHierarchy(Component component, Component component2, Component component3, Component component4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : component, (i & 2) != 0 ? null : component2, (i & 4) != 0 ? null : component3, (i & 8) != 0 ? null : component4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentHierarchy(Component component, Component component2, Component component3, Component component4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.parent_0 = component;
        this.parent_1 = component2;
        this.parent_2 = component3;
        this.parent_3 = component4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24136newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ComponentHierarchy)) {
            return false;
        }
        ComponentHierarchy componentHierarchy = (ComponentHierarchy) other;
        return Intrinsics.areEqual(unknownFields(), componentHierarchy.unknownFields()) && Intrinsics.areEqual(this.parent_0, componentHierarchy.parent_0) && Intrinsics.areEqual(this.parent_1, componentHierarchy.parent_1) && Intrinsics.areEqual(this.parent_2, componentHierarchy.parent_2) && Intrinsics.areEqual(this.parent_3, componentHierarchy.parent_3);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Component component = this.parent_0;
        int iHashCode2 = (iHashCode + (component != null ? component.hashCode() : 0)) * 37;
        Component component2 = this.parent_1;
        int iHashCode3 = (iHashCode2 + (component2 != null ? component2.hashCode() : 0)) * 37;
        Component component3 = this.parent_2;
        int iHashCode4 = (iHashCode3 + (component3 != null ? component3.hashCode() : 0)) * 37;
        Component component4 = this.parent_3;
        int iHashCode5 = iHashCode4 + (component4 != null ? component4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Component component = this.parent_0;
        if (component != null) {
            arrayList.add("parent_0=" + component);
        }
        Component component2 = this.parent_1;
        if (component2 != null) {
            arrayList.add("parent_1=" + component2);
        }
        Component component3 = this.parent_2;
        if (component3 != null) {
            arrayList.add("parent_2=" + component3);
        }
        Component component4 = this.parent_3;
        if (component4 != null) {
            arrayList.add("parent_3=" + component4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComponentHierarchy{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ComponentHierarchy copy$default(ComponentHierarchy componentHierarchy, Component component, Component component2, Component component3, Component component4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            component = componentHierarchy.parent_0;
        }
        if ((i & 2) != 0) {
            component2 = componentHierarchy.parent_1;
        }
        if ((i & 4) != 0) {
            component3 = componentHierarchy.parent_2;
        }
        if ((i & 8) != 0) {
            component4 = componentHierarchy.parent_3;
        }
        if ((i & 16) != 0) {
            byteString = componentHierarchy.unknownFields();
        }
        ByteString byteString2 = byteString;
        Component component5 = component3;
        return componentHierarchy.copy(component, component2, component5, component4, byteString2);
    }

    public final ComponentHierarchy copy(Component parent_0, Component parent_1, Component parent_2, Component parent_3, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ComponentHierarchy(parent_0, parent_1, parent_2, parent_3, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComponentHierarchy.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ComponentHierarchy>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ComponentHierarchy$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ComponentHierarchy value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getParent_0() != null) {
                    size += Component.ADAPTER.encodedSizeWithTag(1, value.getParent_0());
                }
                if (value.getParent_1() != null) {
                    size += Component.ADAPTER.encodedSizeWithTag(2, value.getParent_1());
                }
                if (value.getParent_2() != null) {
                    size += Component.ADAPTER.encodedSizeWithTag(3, value.getParent_2());
                }
                return value.getParent_3() != null ? size + Component.ADAPTER.encodedSizeWithTag(4, value.getParent_3()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ComponentHierarchy value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getParent_0() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 1, (int) value.getParent_0());
                }
                if (value.getParent_1() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 2, (int) value.getParent_1());
                }
                if (value.getParent_2() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getParent_2());
                }
                if (value.getParent_3() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 4, (int) value.getParent_3());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ComponentHierarchy value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getParent_3() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 4, (int) value.getParent_3());
                }
                if (value.getParent_2() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getParent_2());
                }
                if (value.getParent_1() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 2, (int) value.getParent_1());
                }
                if (value.getParent_0() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 1, (int) value.getParent_0());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ComponentHierarchy redact(ComponentHierarchy value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Component parent_0 = value.getParent_0();
                Component componentRedact = parent_0 != null ? Component.ADAPTER.redact(parent_0) : null;
                Component parent_1 = value.getParent_1();
                Component componentRedact2 = parent_1 != null ? Component.ADAPTER.redact(parent_1) : null;
                Component parent_2 = value.getParent_2();
                Component componentRedact3 = parent_2 != null ? Component.ADAPTER.redact(parent_2) : null;
                Component parent_3 = value.getParent_3();
                return value.copy(componentRedact, componentRedact2, componentRedact3, parent_3 != null ? Component.ADAPTER.redact(parent_3) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ComponentHierarchy decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Component componentDecode = null;
                Component componentDecode2 = null;
                Component componentDecode3 = null;
                Component componentDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ComponentHierarchy(componentDecode, componentDecode2, componentDecode3, componentDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        componentDecode = Component.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        componentDecode2 = Component.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        componentDecode3 = Component.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        componentDecode4 = Component.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
