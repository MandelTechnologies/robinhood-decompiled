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

/* compiled from: MarginRateRow.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J:\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginRateRow;", "Lcom/squareup/wire/Message;", "", "text_color", "Lrh_server_driven_ui/v1/ThemedColor;", "title", "", "value", "font_weight", "Lrh_server_driven_ui/v1/FontWeight;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/FontWeight;Lokio/ByteString;)V", "getText_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getTitle", "()Ljava/lang/String;", "getValue", "getFont_weight", "()Lrh_server_driven_ui/v1/FontWeight;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarginRateRow extends Message {

    @JvmField
    public static final ProtoAdapter<MarginRateRow> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.FontWeight#ADAPTER", jsonName = "fontWeight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final FontWeight font_weight;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColor", schemaIndex = 0, tag = 1)
    private final ThemedColor text_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    public MarginRateRow() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ MarginRateRow(ThemedColor themedColor, String str, String str2, FontWeight fontWeight, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? FontWeight.FONT_WEIGHT_UNSPECIFIED : fontWeight, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29775newBuilder();
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

    public final FontWeight getFont_weight() {
        return this.font_weight;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginRateRow(ThemedColor themedColor, String title, String value, FontWeight font_weight, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(font_weight, "font_weight");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text_color = themedColor;
        this.title = title;
        this.value = value;
        this.font_weight = font_weight;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29775newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginRateRow)) {
            return false;
        }
        MarginRateRow marginRateRow = (MarginRateRow) other;
        return Intrinsics.areEqual(unknownFields(), marginRateRow.unknownFields()) && Intrinsics.areEqual(this.text_color, marginRateRow.text_color) && Intrinsics.areEqual(this.title, marginRateRow.title) && Intrinsics.areEqual(this.value, marginRateRow.value) && this.font_weight == marginRateRow.font_weight;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.text_color;
        int iHashCode2 = ((((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.value.hashCode()) * 37) + this.font_weight.hashCode();
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
        arrayList.add("font_weight=" + this.font_weight);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginRateRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginRateRow copy$default(MarginRateRow marginRateRow, ThemedColor themedColor, String str, String str2, FontWeight fontWeight, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = marginRateRow.text_color;
        }
        if ((i & 2) != 0) {
            str = marginRateRow.title;
        }
        if ((i & 4) != 0) {
            str2 = marginRateRow.value;
        }
        if ((i & 8) != 0) {
            fontWeight = marginRateRow.font_weight;
        }
        if ((i & 16) != 0) {
            byteString = marginRateRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return marginRateRow.copy(themedColor, str, str3, fontWeight, byteString2);
    }

    public final MarginRateRow copy(ThemedColor text_color, String title, String value, FontWeight font_weight, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(font_weight, "font_weight");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginRateRow(text_color, title, value, font_weight, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginRateRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginRateRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MarginRateRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginRateRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getText_color());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue());
                }
                return value.getFont_weight() != FontWeight.FONT_WEIGHT_UNSPECIFIED ? size + FontWeight.ADAPTER.encodedSizeWithTag(4, value.getFont_weight()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginRateRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getText_color());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (value.getFont_weight() != FontWeight.FONT_WEIGHT_UNSPECIFIED) {
                    FontWeight.ADAPTER.encodeWithTag(writer, 4, (int) value.getFont_weight());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginRateRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFont_weight() != FontWeight.FONT_WEIGHT_UNSPECIFIED) {
                    FontWeight.ADAPTER.encodeWithTag(writer, 4, (int) value.getFont_weight());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getText_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginRateRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FontWeight fontWeightDecode = FontWeight.FONT_WEIGHT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                ThemedColor themedColorDecode = null;
                while (true) {
                    FontWeight fontWeight = fontWeightDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MarginRateRow(themedColorDecode, strDecode, strDecode2, fontWeight, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                fontWeightDecode = FontWeight.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginRateRow redact(MarginRateRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor text_color = value.getText_color();
                return MarginRateRow.copy$default(value, text_color != null ? ThemedColor.ADAPTER.redact(text_color) : null, null, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
