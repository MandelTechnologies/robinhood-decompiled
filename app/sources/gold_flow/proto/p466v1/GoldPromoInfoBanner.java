package gold_flow.proto.p466v1;

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
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldPromoInfoBanner.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPromoInfoBanner;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "content_markdown", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getContent_markdown", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldPromoInfoBanner extends Message {

    @JvmField
    public static final ProtoAdapter<GoldPromoInfoBanner> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentMarkdown", schemaIndex = 1, tag = 2)
    private final String content_markdown;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 0, tag = 1)
    private final Icon icon;

    public GoldPromoInfoBanner() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28167newBuilder();
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getContent_markdown() {
        return this.content_markdown;
    }

    public /* synthetic */ GoldPromoInfoBanner(Icon icon, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPromoInfoBanner(Icon icon, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.content_markdown = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28167newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldPromoInfoBanner)) {
            return false;
        }
        GoldPromoInfoBanner goldPromoInfoBanner = (GoldPromoInfoBanner) other;
        return Intrinsics.areEqual(unknownFields(), goldPromoInfoBanner.unknownFields()) && this.icon == goldPromoInfoBanner.icon && Intrinsics.areEqual(this.content_markdown, goldPromoInfoBanner.content_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.content_markdown;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str = this.content_markdown;
        if (str != null) {
            arrayList.add("content_markdown=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldPromoInfoBanner{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldPromoInfoBanner copy$default(GoldPromoInfoBanner goldPromoInfoBanner, Icon icon, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            icon = goldPromoInfoBanner.icon;
        }
        if ((i & 2) != 0) {
            str = goldPromoInfoBanner.content_markdown;
        }
        if ((i & 4) != 0) {
            byteString = goldPromoInfoBanner.unknownFields();
        }
        return goldPromoInfoBanner.copy(icon, str, byteString);
    }

    public final GoldPromoInfoBanner copy(Icon icon, String content_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldPromoInfoBanner(icon, content_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldPromoInfoBanner.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldPromoInfoBanner>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.GoldPromoInfoBanner$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldPromoInfoBanner value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContent_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldPromoInfoBanner value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContent_markdown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldPromoInfoBanner value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContent_markdown());
                Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPromoInfoBanner redact(GoldPromoInfoBanner value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldPromoInfoBanner.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldPromoInfoBanner decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldPromoInfoBanner(iconDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
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
        };
    }
}
