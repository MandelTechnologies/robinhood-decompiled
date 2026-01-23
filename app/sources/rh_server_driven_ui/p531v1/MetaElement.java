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

/* compiled from: MetaElement.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/MetaElement;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/IconElement;", "text", "Lrh_server_driven_ui/v1/TextElement;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/IconElement;Lrh_server_driven_ui/v1/TextElement;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/IconElement;", "getText", "()Lrh_server_driven_ui/v1/TextElement;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MetaElement extends Message {

    @JvmField
    public static final ProtoAdapter<MetaElement> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.IconElement#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final IconElement icon;

    @WireField(adapter = "rh_server_driven_ui.v1.TextElement#ADAPTER", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final TextElement text;

    public MetaElement() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29781newBuilder();
    }

    public final IconElement getIcon() {
        return this.icon;
    }

    public final TextElement getText() {
        return this.text;
    }

    public /* synthetic */ MetaElement(IconElement iconElement, TextElement textElement, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iconElement, (i & 2) != 0 ? null : textElement, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaElement(IconElement iconElement, TextElement textElement, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = iconElement;
        this.text = textElement;
        if (Internal.countNonNull(iconElement, textElement) > 1) {
            throw new IllegalArgumentException("At most one of icon, text may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29781newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MetaElement)) {
            return false;
        }
        MetaElement metaElement = (MetaElement) other;
        return Intrinsics.areEqual(unknownFields(), metaElement.unknownFields()) && Intrinsics.areEqual(this.icon, metaElement.icon) && Intrinsics.areEqual(this.text, metaElement.text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IconElement iconElement = this.icon;
        int iHashCode2 = (iHashCode + (iconElement != null ? iconElement.hashCode() : 0)) * 37;
        TextElement textElement = this.text;
        int iHashCode3 = iHashCode2 + (textElement != null ? textElement.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IconElement iconElement = this.icon;
        if (iconElement != null) {
            arrayList.add("icon=" + iconElement);
        }
        TextElement textElement = this.text;
        if (textElement != null) {
            arrayList.add("text=" + textElement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MetaElement{", "}", 0, null, null, 56, null);
    }

    public final MetaElement copy(IconElement icon, TextElement text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MetaElement(icon, text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MetaElement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MetaElement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MetaElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MetaElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + IconElement.ADAPTER.encodedSizeWithTag(1, value.getIcon()) + TextElement.ADAPTER.encodedSizeWithTag(2, value.getText());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MetaElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                IconElement.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                TextElement.ADAPTER.encodeWithTag(writer, 2, (int) value.getText());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MetaElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TextElement.ADAPTER.encodeWithTag(writer, 2, (int) value.getText());
                IconElement.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MetaElement redact(MetaElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IconElement icon = value.getIcon();
                IconElement iconElementRedact = icon != null ? IconElement.ADAPTER.redact(icon) : null;
                TextElement text = value.getText();
                return value.copy(iconElementRedact, text != null ? TextElement.ADAPTER.redact(text) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MetaElement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IconElement iconElementDecode = null;
                TextElement textElementDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MetaElement(iconElementDecode, textElementDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iconElementDecode = IconElement.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        textElementDecode = TextElement.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
