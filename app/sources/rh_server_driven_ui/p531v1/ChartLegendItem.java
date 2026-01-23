package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: ChartLegendItem.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006#"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartLegendItem;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "title", "", "value", "value_color", "value_suffix", "Lrh_server_driven_ui/v1/DisplayText;", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/DisplayText;Ljava/lang/String;Lokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getTitle", "()Ljava/lang/String;", "getValue", "getValue_color", "getValue_suffix", "()Lrh_server_driven_ui/v1/DisplayText;", "getId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartLegendItem extends Message {

    @JvmField
    public static final ProtoAdapter<ChartLegendItem> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 0, tag = 1)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "valueColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ThemedColor value_color;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "valueSuffix", schemaIndex = 4, tag = 5)
    private final DisplayText value_suffix;

    public ChartLegendItem() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ChartLegendItem(ThemedColor themedColor, String str, String str2, ThemedColor themedColor2, DisplayText displayText, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : themedColor2, (i & 16) != 0 ? null : displayText, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29695newBuilder();
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final ThemedColor getValue_color() {
        return this.value_color;
    }

    public final DisplayText getValue_suffix() {
        return this.value_suffix;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartLegendItem(ThemedColor themedColor, String title, String value, ThemedColor themedColor2, DisplayText displayText, String id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = themedColor;
        this.title = title;
        this.value = value;
        this.value_color = themedColor2;
        this.value_suffix = displayText;
        this.id = id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29695newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartLegendItem)) {
            return false;
        }
        ChartLegendItem chartLegendItem = (ChartLegendItem) other;
        return Intrinsics.areEqual(unknownFields(), chartLegendItem.unknownFields()) && Intrinsics.areEqual(this.color, chartLegendItem.color) && Intrinsics.areEqual(this.title, chartLegendItem.title) && Intrinsics.areEqual(this.value, chartLegendItem.value) && Intrinsics.areEqual(this.value_color, chartLegendItem.value_color) && Intrinsics.areEqual(this.value_suffix, chartLegendItem.value_suffix) && Intrinsics.areEqual(this.id, chartLegendItem.id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.value.hashCode()) * 37;
        ThemedColor themedColor2 = this.value_color;
        int iHashCode3 = (iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        DisplayText displayText = this.value_suffix;
        int iHashCode4 = ((iHashCode3 + (displayText != null ? displayText.hashCode() : 0)) * 37) + this.id.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("value=" + Internal.sanitize(this.value));
        ThemedColor themedColor2 = this.value_color;
        if (themedColor2 != null) {
            arrayList.add("value_color=" + themedColor2);
        }
        DisplayText displayText = this.value_suffix;
        if (displayText != null) {
            arrayList.add("value_suffix=" + displayText);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartLegendItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChartLegendItem copy$default(ChartLegendItem chartLegendItem, ThemedColor themedColor, String str, String str2, ThemedColor themedColor2, DisplayText displayText, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = chartLegendItem.color;
        }
        if ((i & 2) != 0) {
            str = chartLegendItem.title;
        }
        if ((i & 4) != 0) {
            str2 = chartLegendItem.value;
        }
        if ((i & 8) != 0) {
            themedColor2 = chartLegendItem.value_color;
        }
        if ((i & 16) != 0) {
            displayText = chartLegendItem.value_suffix;
        }
        if ((i & 32) != 0) {
            str3 = chartLegendItem.id;
        }
        if ((i & 64) != 0) {
            byteString = chartLegendItem.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        DisplayText displayText2 = displayText;
        String str5 = str2;
        return chartLegendItem.copy(themedColor, str, str5, themedColor2, displayText2, str4, byteString2);
    }

    public final ChartLegendItem copy(ThemedColor color, String title, String value, ThemedColor value_color, DisplayText value_suffix, String id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartLegendItem(color, title, value, value_color, value_suffix, id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartLegendItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartLegendItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartLegendItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartLegendItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getColor());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue());
                }
                if (value.getValue_color() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getValue_color());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + DisplayText.ADAPTER.encodedSizeWithTag(5, value.getValue_suffix());
                return !Intrinsics.areEqual(value.getId(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getId()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartLegendItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getColor());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (value.getValue_color() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getValue_color());
                }
                DisplayText.ADAPTER.encodeWithTag(writer, 5, (int) value.getValue_suffix());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getId());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartLegendItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getId());
                }
                DisplayText.ADAPTER.encodeWithTag(writer, 5, (int) value.getValue_suffix());
                if (value.getValue_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getValue_color());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartLegendItem redact(ChartLegendItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                ThemedColor themedColorRedact = color != null ? ThemedColor.ADAPTER.redact(color) : null;
                ThemedColor value_color = value.getValue_color();
                ThemedColor themedColorRedact2 = value_color != null ? ThemedColor.ADAPTER.redact(value_color) : null;
                DisplayText value_suffix = value.getValue_suffix();
                return ChartLegendItem.copy$default(value, themedColorRedact, null, null, themedColorRedact2, value_suffix != null ? DisplayText.ADAPTER.redact(value_suffix) : null, null, ByteString.EMPTY, 38, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartLegendItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                DisplayText displayTextDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 5:
                                displayTextDecode = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ChartLegendItem(themedColorDecode, strDecode, strDecode2, themedColorDecode2, displayTextDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
