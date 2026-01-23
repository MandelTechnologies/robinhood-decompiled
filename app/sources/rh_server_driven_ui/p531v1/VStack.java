package rh_server_driven_ui.p531v1;

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

/* compiled from: VStack.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BA\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JE\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/VStack;", "Lcom/squareup/wire/Message;", "", "components", "", "Lrh_server_driven_ui/v1/WeightedItem;", "spacing", "", "alignment", "Lrh_server_driven_ui/v1/StackAlignment;", "web_flex_no_wrap", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;DLrh_server_driven_ui/v1/StackAlignment;Ljava/lang/Boolean;Lokio/ByteString;)V", "getSpacing", "()D", "getAlignment", "()Lrh_server_driven_ui/v1/StackAlignment;", "getWeb_flex_no_wrap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getComponents", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/util/List;DLrh_server_driven_ui/v1/StackAlignment;Ljava/lang/Boolean;Lokio/ByteString;)Lrh_server_driven_ui/v1/VStack;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class VStack extends Message {

    @JvmField
    public static final ProtoAdapter<VStack> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.StackAlignment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final StackAlignment alignment;

    @WireField(adapter = "rh_server_driven_ui.v1.WeightedItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<WeightedItem> components;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double spacing;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webFlexNoWrap", schemaIndex = 3, tag = 4)
    private final Boolean web_flex_no_wrap;

    public VStack() {
        this(null, 0.0d, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29860newBuilder();
    }

    public /* synthetic */ VStack(List list, double d, StackAlignment stackAlignment, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? StackAlignment.STACK_ALIGNMENT_UNSPECIFIED : stackAlignment, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getSpacing() {
        return this.spacing;
    }

    public final StackAlignment getAlignment() {
        return this.alignment;
    }

    public final Boolean getWeb_flex_no_wrap() {
        return this.web_flex_no_wrap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VStack(List<WeightedItem> components, double d, StackAlignment alignment, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.spacing = d;
        this.alignment = alignment;
        this.web_flex_no_wrap = bool;
        this.components = Internal.immutableCopyOf("components", components);
    }

    public final List<WeightedItem> getComponents() {
        return this.components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29860newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VStack)) {
            return false;
        }
        VStack vStack = (VStack) other;
        return Intrinsics.areEqual(unknownFields(), vStack.unknownFields()) && Intrinsics.areEqual(this.components, vStack.components) && this.spacing == vStack.spacing && this.alignment == vStack.alignment && Intrinsics.areEqual(this.web_flex_no_wrap, vStack.web_flex_no_wrap);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.components.hashCode()) * 37) + Double.hashCode(this.spacing)) * 37) + this.alignment.hashCode()) * 37;
        Boolean bool = this.web_flex_no_wrap;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.components.isEmpty()) {
            arrayList.add("components=" + this.components);
        }
        arrayList.add("spacing=" + this.spacing);
        arrayList.add("alignment=" + this.alignment);
        Boolean bool = this.web_flex_no_wrap;
        if (bool != null) {
            arrayList.add("web_flex_no_wrap=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VStack{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ VStack copy$default(VStack vStack, List list, double d, StackAlignment stackAlignment, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vStack.components;
        }
        if ((i & 2) != 0) {
            d = vStack.spacing;
        }
        if ((i & 4) != 0) {
            stackAlignment = vStack.alignment;
        }
        if ((i & 8) != 0) {
            bool = vStack.web_flex_no_wrap;
        }
        if ((i & 16) != 0) {
            byteString = vStack.unknownFields();
        }
        ByteString byteString2 = byteString;
        StackAlignment stackAlignment2 = stackAlignment;
        return vStack.copy(list, d, stackAlignment2, bool, byteString2);
    }

    public final VStack copy(List<WeightedItem> components, double spacing, StackAlignment alignment, Boolean web_flex_no_wrap, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new VStack(components, spacing, alignment, web_flex_no_wrap, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VStack.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<VStack>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.VStack$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(VStack value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + WeightedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getComponents());
                if (!Double.valueOf(value.getSpacing()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getSpacing()));
                }
                if (value.getAlignment() != StackAlignment.STACK_ALIGNMENT_UNSPECIFIED) {
                    size += StackAlignment.ADAPTER.encodedSizeWithTag(3, value.getAlignment());
                }
                return size + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.getWeb_flex_no_wrap());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, VStack value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                WeightedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
                if (!Double.valueOf(value.getSpacing()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSpacing()));
                }
                if (value.getAlignment() != StackAlignment.STACK_ALIGNMENT_UNSPECIFIED) {
                    StackAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getWeb_flex_no_wrap());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, VStack value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getWeb_flex_no_wrap());
                if (value.getAlignment() != StackAlignment.STACK_ALIGNMENT_UNSPECIFIED) {
                    StackAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                if (!Double.valueOf(value.getSpacing()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSpacing()));
                }
                WeightedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VStack decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                StackAlignment stackAlignmentDecode = StackAlignment.STACK_ALIGNMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                Boolean boolDecode = null;
                while (true) {
                    StackAlignment stackAlignment = stackAlignmentDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new VStack(arrayList, dDoubleValue, stackAlignment, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(WeightedItem.ADAPTER.decode(reader));
                        } else if (iNextTag == 2) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            try {
                                stackAlignmentDecode = StackAlignment.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VStack redact(VStack value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return VStack.copy$default(value, Internal.m26823redactElements(value.getComponents(), WeightedItem.ADAPTER), 0.0d, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
