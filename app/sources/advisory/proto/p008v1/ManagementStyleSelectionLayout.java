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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ManagementStyleSelectionLayout.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "Lcom/squareup/wire/Message;", "", "image_content", "Ladvisory/proto/v1/ManagementStyleSelectionImageContent;", "list_content", "Ladvisory/proto/v1/ManagementStyleSelectionListContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionImageContent;Ladvisory/proto/v1/ManagementStyleSelectionListContent;Lokio/ByteString;)V", "getImage_content", "()Ladvisory/proto/v1/ManagementStyleSelectionImageContent;", "getList_content", "()Ladvisory/proto/v1/ManagementStyleSelectionListContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ManagementStyleSelectionLayout extends Message {

    @JvmField
    public static final ProtoAdapter<ManagementStyleSelectionLayout> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionImageContent#ADAPTER", jsonName = "imageContent", oneofName = "layout_content", schemaIndex = 0, tag = 1)
    private final ManagementStyleSelectionImageContent image_content;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionListContent#ADAPTER", jsonName = "listContent", oneofName = "layout_content", schemaIndex = 1, tag = 2)
    private final ManagementStyleSelectionListContent list_content;

    public ManagementStyleSelectionLayout() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4512newBuilder();
    }

    public final ManagementStyleSelectionImageContent getImage_content() {
        return this.image_content;
    }

    public final ManagementStyleSelectionListContent getList_content() {
        return this.list_content;
    }

    public /* synthetic */ ManagementStyleSelectionLayout(ManagementStyleSelectionImageContent managementStyleSelectionImageContent, ManagementStyleSelectionListContent managementStyleSelectionListContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managementStyleSelectionImageContent, (i & 2) != 0 ? null : managementStyleSelectionListContent, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleSelectionLayout(ManagementStyleSelectionImageContent managementStyleSelectionImageContent, ManagementStyleSelectionListContent managementStyleSelectionListContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_content = managementStyleSelectionImageContent;
        this.list_content = managementStyleSelectionListContent;
        if (Internal.countNonNull(managementStyleSelectionImageContent, managementStyleSelectionListContent) > 1) {
            throw new IllegalArgumentException("At most one of image_content, list_content may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4512newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagementStyleSelectionLayout)) {
            return false;
        }
        ManagementStyleSelectionLayout managementStyleSelectionLayout = (ManagementStyleSelectionLayout) other;
        return Intrinsics.areEqual(unknownFields(), managementStyleSelectionLayout.unknownFields()) && Intrinsics.areEqual(this.image_content, managementStyleSelectionLayout.image_content) && Intrinsics.areEqual(this.list_content, managementStyleSelectionLayout.list_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ManagementStyleSelectionImageContent managementStyleSelectionImageContent = this.image_content;
        int iHashCode2 = (iHashCode + (managementStyleSelectionImageContent != null ? managementStyleSelectionImageContent.hashCode() : 0)) * 37;
        ManagementStyleSelectionListContent managementStyleSelectionListContent = this.list_content;
        int iHashCode3 = iHashCode2 + (managementStyleSelectionListContent != null ? managementStyleSelectionListContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ManagementStyleSelectionImageContent managementStyleSelectionImageContent = this.image_content;
        if (managementStyleSelectionImageContent != null) {
            arrayList.add("image_content=" + managementStyleSelectionImageContent);
        }
        ManagementStyleSelectionListContent managementStyleSelectionListContent = this.list_content;
        if (managementStyleSelectionListContent != null) {
            arrayList.add("list_content=" + managementStyleSelectionListContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagementStyleSelectionLayout{", "}", 0, null, null, 56, null);
    }

    public final ManagementStyleSelectionLayout copy(ManagementStyleSelectionImageContent image_content, ManagementStyleSelectionListContent list_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagementStyleSelectionLayout(image_content, list_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementStyleSelectionLayout.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagementStyleSelectionLayout>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ManagementStyleSelectionLayout$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagementStyleSelectionLayout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ManagementStyleSelectionImageContent.ADAPTER.encodedSizeWithTag(1, value.getImage_content()) + ManagementStyleSelectionListContent.ADAPTER.encodedSizeWithTag(2, value.getList_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagementStyleSelectionLayout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleSelectionImageContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage_content());
                ManagementStyleSelectionListContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getList_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagementStyleSelectionLayout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementStyleSelectionListContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getList_content());
                ManagementStyleSelectionImageContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionLayout redact(ManagementStyleSelectionLayout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleSelectionImageContent image_content = value.getImage_content();
                ManagementStyleSelectionImageContent managementStyleSelectionImageContentRedact = image_content != null ? ManagementStyleSelectionImageContent.ADAPTER.redact(image_content) : null;
                ManagementStyleSelectionListContent list_content = value.getList_content();
                return value.copy(managementStyleSelectionImageContentRedact, list_content != null ? ManagementStyleSelectionListContent.ADAPTER.redact(list_content) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionLayout decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ManagementStyleSelectionImageContent managementStyleSelectionImageContentDecode = null;
                ManagementStyleSelectionListContent managementStyleSelectionListContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ManagementStyleSelectionLayout(managementStyleSelectionImageContentDecode, managementStyleSelectionListContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        managementStyleSelectionImageContentDecode = ManagementStyleSelectionImageContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        managementStyleSelectionListContentDecode = ManagementStyleSelectionListContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
