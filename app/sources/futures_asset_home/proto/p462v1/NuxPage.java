package futures_asset_home.proto.p462v1;

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

/* compiled from: NuxPage.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lfutures_asset_home/proto/v1/NuxPage;", "Lcom/squareup/wire/Message;", "", "type", "Lfutures_asset_home/proto/v1/NuxType;", "tooltip_markdown_content", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lfutures_asset_home/proto/v1/NuxType;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Lfutures_asset_home/proto/v1/NuxType;", "getTooltip_markdown_content", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class NuxPage extends Message {

    @JvmField
    public static final ProtoAdapter<NuxPage> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tooltipMarkdownContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String tooltip_markdown_content;

    @WireField(adapter = "futures_asset_home.proto.v1.NuxType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final NuxType type;

    public NuxPage() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28098newBuilder();
    }

    public final NuxType getType() {
        return this.type;
    }

    public /* synthetic */ NuxPage(NuxType nuxType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NuxType.TYPE_UNSPECIFIED : nuxType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTooltip_markdown_content() {
        return this.tooltip_markdown_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NuxPage(NuxType type2, String tooltip_markdown_content, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(tooltip_markdown_content, "tooltip_markdown_content");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.tooltip_markdown_content = tooltip_markdown_content;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28098newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NuxPage)) {
            return false;
        }
        NuxPage nuxPage = (NuxPage) other;
        return Intrinsics.areEqual(unknownFields(), nuxPage.unknownFields()) && this.type == nuxPage.type && Intrinsics.areEqual(this.tooltip_markdown_content, nuxPage.tooltip_markdown_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.tooltip_markdown_content.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("tooltip_markdown_content=" + Internal.sanitize(this.tooltip_markdown_content));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NuxPage{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NuxPage copy$default(NuxPage nuxPage, NuxType nuxType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            nuxType = nuxPage.type;
        }
        if ((i & 2) != 0) {
            str = nuxPage.tooltip_markdown_content;
        }
        if ((i & 4) != 0) {
            byteString = nuxPage.unknownFields();
        }
        return nuxPage.copy(nuxType, str, byteString);
    }

    public final NuxPage copy(NuxType type2, String tooltip_markdown_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(tooltip_markdown_content, "tooltip_markdown_content");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NuxPage(type2, tooltip_markdown_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NuxPage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NuxPage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_asset_home.proto.v1.NuxPage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NuxPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != NuxType.TYPE_UNSPECIFIED) {
                    size += NuxType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return !Intrinsics.areEqual(value.getTooltip_markdown_content(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTooltip_markdown_content()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NuxPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != NuxType.TYPE_UNSPECIFIED) {
                    NuxType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTooltip_markdown_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTooltip_markdown_content());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NuxPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTooltip_markdown_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTooltip_markdown_content());
                }
                if (value.getType() != NuxType.TYPE_UNSPECIFIED) {
                    NuxType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NuxPage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NuxType nuxTypeDecode = NuxType.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NuxPage(nuxTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            nuxTypeDecode = NuxType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NuxPage redact(NuxPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NuxPage.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
