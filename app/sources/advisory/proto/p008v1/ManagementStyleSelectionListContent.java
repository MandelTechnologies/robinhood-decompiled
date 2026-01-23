package advisory.proto.p008v1;

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

/* compiled from: ManagementStyleSelectionListContent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionListContent;", "Lcom/squareup/wire/Message;", "", "value_props", "", "Ladvisory/proto/v1/ManagementStyleSelectionValueProp;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getValue_props", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ManagementStyleSelectionListContent extends Message {

    @JvmField
    public static final ProtoAdapter<ManagementStyleSelectionListContent> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionValueProp#ADAPTER", jsonName = "valueProps", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ManagementStyleSelectionValueProp> value_props;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagementStyleSelectionListContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4513newBuilder();
    }

    public /* synthetic */ ManagementStyleSelectionListContent(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleSelectionListContent(List<ManagementStyleSelectionValueProp> value_props, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.value_props = Internal.immutableCopyOf("value_props", value_props);
    }

    public final List<ManagementStyleSelectionValueProp> getValue_props() {
        return this.value_props;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4513newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagementStyleSelectionListContent)) {
            return false;
        }
        ManagementStyleSelectionListContent managementStyleSelectionListContent = (ManagementStyleSelectionListContent) other;
        return Intrinsics.areEqual(unknownFields(), managementStyleSelectionListContent.unknownFields()) && Intrinsics.areEqual(this.value_props, managementStyleSelectionListContent.value_props);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.value_props.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.value_props.isEmpty()) {
            arrayList.add("value_props=" + this.value_props);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagementStyleSelectionListContent{", "}", 0, null, null, 56, null);
    }

    public final ManagementStyleSelectionListContent copy(List<ManagementStyleSelectionValueProp> value_props, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagementStyleSelectionListContent(value_props, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementStyleSelectionListContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagementStyleSelectionListContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ManagementStyleSelectionListContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagementStyleSelectionListContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ManagementStyleSelectionValueProp.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getValue_props());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagementStyleSelectionListContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleSelectionValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getValue_props());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagementStyleSelectionListContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementStyleSelectionValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getValue_props());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionListContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ManagementStyleSelectionListContent(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ManagementStyleSelectionValueProp.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionListContent redact(ManagementStyleSelectionListContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getValue_props(), ManagementStyleSelectionValueProp.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
