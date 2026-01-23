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

/* compiled from: MarginRateHeader.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J0\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginRateHeader;", "Lcom/squareup/wire/Message;", "", "text_color", "Lrh_server_driven_ui/v1/ThemedColor;", "title", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getText_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getTitle", "()Ljava/lang/String;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarginRateHeader extends Message {

    @JvmField
    public static final ProtoAdapter<MarginRateHeader> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColor", schemaIndex = 0, tag = 1)
    private final ThemedColor text_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    public MarginRateHeader() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ MarginRateHeader(ThemedColor themedColor, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29774newBuilder();
    }

    public final ThemedColor getText_color() {
        return this.text_color;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginRateHeader(ThemedColor themedColor, String title, String value, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text_color = themedColor;
        this.title = title;
        this.value = value;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29774newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginRateHeader)) {
            return false;
        }
        MarginRateHeader marginRateHeader = (MarginRateHeader) other;
        return Intrinsics.areEqual(unknownFields(), marginRateHeader.unknownFields()) && Intrinsics.areEqual(this.text_color, marginRateHeader.text_color) && Intrinsics.areEqual(this.title, marginRateHeader.title) && Intrinsics.areEqual(this.value, marginRateHeader.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.text_color;
        int iHashCode2 = ((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.value.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.text_color;
        if (themedColor != null) {
            arrayList.add("text_color=" + themedColor);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("value=" + Internal.sanitize(this.value));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginRateHeader{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginRateHeader copy$default(MarginRateHeader marginRateHeader, ThemedColor themedColor, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = marginRateHeader.text_color;
        }
        if ((i & 2) != 0) {
            str = marginRateHeader.title;
        }
        if ((i & 4) != 0) {
            str2 = marginRateHeader.value;
        }
        if ((i & 8) != 0) {
            byteString = marginRateHeader.unknownFields();
        }
        return marginRateHeader.copy(themedColor, str, str2, byteString);
    }

    public final MarginRateHeader copy(ThemedColor text_color, String title, String value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginRateHeader(text_color, title, value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginRateHeader.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginRateHeader>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MarginRateHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginRateHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getText_color());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginRateHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getText_color());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginRateHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getText_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginRateHeader redact(MarginRateHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor text_color = value.getText_color();
                return MarginRateHeader.copy$default(value, text_color != null ? ThemedColor.ADAPTER.redact(text_color) : null, null, null, ByteString.EMPTY, 6, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginRateHeader decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginRateHeader(themedColorDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
