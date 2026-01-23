package rh_server_driven_ui.p531v1;

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

/* compiled from: WeightedItem.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lrh_server_driven_ui/v1/WeightedItem;", "Lcom/squareup/wire/Message;", "", "component", "Lrh_server_driven_ui/v1/UIComponent;", "weight", "", "baseline_alignment", "Lrh_server_driven_ui/v1/BaselineAlignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/Float;Lrh_server_driven_ui/v1/BaselineAlignment;Lokio/ByteString;)V", "getComponent", "()Lrh_server_driven_ui/v1/UIComponent;", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBaseline_alignment", "()Lrh_server_driven_ui/v1/BaselineAlignment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/Float;Lrh_server_driven_ui/v1/BaselineAlignment;Lokio/ByteString;)Lrh_server_driven_ui/v1/WeightedItem;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class WeightedItem extends Message {

    @JvmField
    public static final ProtoAdapter<WeightedItem> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.BaselineAlignment#ADAPTER", jsonName = "baselineAlignment", schemaIndex = 2, tag = 3)
    private final BaselineAlignment baseline_alignment;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent component;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
    private final Float weight;

    public WeightedItem() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29869newBuilder();
    }

    public final UIComponent getComponent() {
        return this.component;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public final BaselineAlignment getBaseline_alignment() {
        return this.baseline_alignment;
    }

    public /* synthetic */ WeightedItem(UIComponent uIComponent, Float f, BaselineAlignment baselineAlignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : baselineAlignment, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightedItem(UIComponent uIComponent, Float f, BaselineAlignment baselineAlignment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.component = uIComponent;
        this.weight = f;
        this.baseline_alignment = baselineAlignment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29869newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WeightedItem)) {
            return false;
        }
        WeightedItem weightedItem = (WeightedItem) other;
        return Intrinsics.areEqual(unknownFields(), weightedItem.unknownFields()) && Intrinsics.areEqual(this.component, weightedItem.component) && Intrinsics.areEqual(this.weight, weightedItem.weight) && this.baseline_alignment == weightedItem.baseline_alignment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.component;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        Float f = this.weight;
        int iHashCode3 = (iHashCode2 + (f != null ? f.hashCode() : 0)) * 37;
        BaselineAlignment baselineAlignment = this.baseline_alignment;
        int iHashCode4 = iHashCode3 + (baselineAlignment != null ? baselineAlignment.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.component;
        if (uIComponent != null) {
            arrayList.add("component=" + uIComponent);
        }
        Float f = this.weight;
        if (f != null) {
            arrayList.add("weight=" + f);
        }
        BaselineAlignment baselineAlignment = this.baseline_alignment;
        if (baselineAlignment != null) {
            arrayList.add("baseline_alignment=" + baselineAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WeightedItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WeightedItem copy$default(WeightedItem weightedItem, UIComponent uIComponent, Float f, BaselineAlignment baselineAlignment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = weightedItem.component;
        }
        if ((i & 2) != 0) {
            f = weightedItem.weight;
        }
        if ((i & 4) != 0) {
            baselineAlignment = weightedItem.baseline_alignment;
        }
        if ((i & 8) != 0) {
            byteString = weightedItem.unknownFields();
        }
        return weightedItem.copy(uIComponent, f, baselineAlignment, byteString);
    }

    public final WeightedItem copy(UIComponent component, Float weight, BaselineAlignment baseline_alignment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WeightedItem(component, weight, baseline_alignment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WeightedItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WeightedItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.WeightedItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WeightedItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getComponent() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getComponent());
                }
                return size + ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.getWeight()) + BaselineAlignment.ADAPTER.encodedSizeWithTag(3, value.getBaseline_alignment());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WeightedItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getComponent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) value.getWeight());
                BaselineAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getBaseline_alignment());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WeightedItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BaselineAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getBaseline_alignment());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) value.getWeight());
                if (value.getComponent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WeightedItem redact(WeightedItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent component = value.getComponent();
                return WeightedItem.copy$default(value, component != null ? UIComponent.ADAPTER.redact(component) : null, null, null, ByteString.EMPTY, 6, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WeightedItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                Float fDecode = null;
                BaselineAlignment baselineAlignmentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WeightedItem(uIComponentDecode, fDecode, baselineAlignmentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            baselineAlignmentDecode = BaselineAlignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
