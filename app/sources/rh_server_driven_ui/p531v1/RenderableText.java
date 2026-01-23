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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RenderableText.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/RenderableText;", "Lcom/squareup/wire/Message;", "", "plain_text", "Lrh_server_driven_ui/v1/PlainText;", "markdown_text", "Lrh_server_driven_ui/v1/MarkdownText;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/PlainText;Lrh_server_driven_ui/v1/MarkdownText;Lokio/ByteString;)V", "getPlain_text", "()Lrh_server_driven_ui/v1/PlainText;", "getMarkdown_text", "()Lrh_server_driven_ui/v1/MarkdownText;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RenderableText extends Message {

    @JvmField
    public static final ProtoAdapter<RenderableText> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.MarkdownText#ADAPTER", jsonName = "markdownText", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final MarkdownText markdown_text;

    @WireField(adapter = "rh_server_driven_ui.v1.PlainText#ADAPTER", jsonName = "plainText", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final PlainText plain_text;

    public RenderableText() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29800newBuilder();
    }

    public final PlainText getPlain_text() {
        return this.plain_text;
    }

    public final MarkdownText getMarkdown_text() {
        return this.markdown_text;
    }

    public /* synthetic */ RenderableText(PlainText plainText, MarkdownText markdownText, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : plainText, (i & 2) != 0 ? null : markdownText, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderableText(PlainText plainText, MarkdownText markdownText, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.plain_text = plainText;
        this.markdown_text = markdownText;
        if (Internal.countNonNull(plainText, markdownText) > 1) {
            throw new IllegalArgumentException("At most one of plain_text, markdown_text may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29800newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RenderableText)) {
            return false;
        }
        RenderableText renderableText = (RenderableText) other;
        return Intrinsics.areEqual(unknownFields(), renderableText.unknownFields()) && Intrinsics.areEqual(this.plain_text, renderableText.plain_text) && Intrinsics.areEqual(this.markdown_text, renderableText.markdown_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PlainText plainText = this.plain_text;
        int iHashCode2 = (iHashCode + (plainText != null ? plainText.hashCode() : 0)) * 37;
        MarkdownText markdownText = this.markdown_text;
        int iHashCode3 = iHashCode2 + (markdownText != null ? markdownText.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PlainText plainText = this.plain_text;
        if (plainText != null) {
            arrayList.add("plain_text=" + plainText);
        }
        MarkdownText markdownText = this.markdown_text;
        if (markdownText != null) {
            arrayList.add("markdown_text=" + markdownText);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RenderableText{", "}", 0, null, null, 56, null);
    }

    public final RenderableText copy(PlainText plain_text, MarkdownText markdown_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RenderableText(plain_text, markdown_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RenderableText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RenderableText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.RenderableText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RenderableText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + PlainText.ADAPTER.encodedSizeWithTag(1, value.getPlain_text()) + MarkdownText.ADAPTER.encodedSizeWithTag(2, value.getMarkdown_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RenderableText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PlainText.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlain_text());
                MarkdownText.ADAPTER.encodeWithTag(writer, 2, (int) value.getMarkdown_text());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RenderableText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MarkdownText.ADAPTER.encodeWithTag(writer, 2, (int) value.getMarkdown_text());
                PlainText.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlain_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RenderableText redact(RenderableText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlainText plain_text = value.getPlain_text();
                PlainText plainTextRedact = plain_text != null ? PlainText.ADAPTER.redact(plain_text) : null;
                MarkdownText markdown_text = value.getMarkdown_text();
                return value.copy(plainTextRedact, markdown_text != null ? MarkdownText.ADAPTER.redact(markdown_text) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RenderableText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PlainText plainTextDecode = null;
                MarkdownText markdownTextDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RenderableText(plainTextDecode, markdownTextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        plainTextDecode = PlainText.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        markdownTextDecode = MarkdownText.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
