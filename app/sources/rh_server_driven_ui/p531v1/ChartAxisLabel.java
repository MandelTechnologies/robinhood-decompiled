package rh_server_driven_ui.p531v1;

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

/* compiled from: ChartAxisLabel.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabel;", "Lcom/squareup/wire/Message;", "", "value", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "text_style", "Lrh_server_driven_ui/v1/TextStyle;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(FLrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/TextStyle;Ljava/lang/String;Lokio/ByteString;)V", "getValue", "()F", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getText_style", "()Lrh_server_driven_ui/v1/TextStyle;", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartAxisLabel extends Message {

    @JvmField
    public static final ProtoAdapter<ChartAxisLabel> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String text;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", jsonName = "textStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TextStyle text_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float value;

    public ChartAxisLabel() {
        this(0.0f, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29686newBuilder();
    }

    public final float getValue() {
        return this.value;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final TextStyle getText_style() {
        return this.text_style;
    }

    public /* synthetic */ ChartAxisLabel(float f, ThemedColor themedColor, TextStyle textStyle, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartAxisLabel(float f, ThemedColor themedColor, TextStyle text_style, String text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text_style, "text_style");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.value = f;
        this.color = themedColor;
        this.text_style = text_style;
        this.text = text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29686newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartAxisLabel)) {
            return false;
        }
        ChartAxisLabel chartAxisLabel = (ChartAxisLabel) other;
        return Intrinsics.areEqual(unknownFields(), chartAxisLabel.unknownFields()) && this.value == chartAxisLabel.value && Intrinsics.areEqual(this.color, chartAxisLabel.color) && this.text_style == chartAxisLabel.text_style && Intrinsics.areEqual(this.text, chartAxisLabel.text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Float.hashCode(this.value)) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = ((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.text_style.hashCode()) * 37) + this.text.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("value=" + this.value);
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("text_style=" + this.text_style);
        arrayList.add("text=" + Internal.sanitize(this.text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartAxisLabel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChartAxisLabel copy$default(ChartAxisLabel chartAxisLabel, float f, ThemedColor themedColor, TextStyle textStyle, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartAxisLabel.value;
        }
        if ((i & 2) != 0) {
            themedColor = chartAxisLabel.color;
        }
        if ((i & 4) != 0) {
            textStyle = chartAxisLabel.text_style;
        }
        if ((i & 8) != 0) {
            str = chartAxisLabel.text;
        }
        if ((i & 16) != 0) {
            byteString = chartAxisLabel.unknownFields();
        }
        ByteString byteString2 = byteString;
        TextStyle textStyle2 = textStyle;
        return chartAxisLabel.copy(f, themedColor, textStyle2, str, byteString2);
    }

    public final ChartAxisLabel copy(float value, ThemedColor color, TextStyle text_style, String text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text_style, "text_style");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartAxisLabel(value, color, text_style, text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartAxisLabel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartAxisLabel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxisLabel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartAxisLabel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Float.valueOf(value.getValue()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getValue()));
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getColor());
                }
                if (value.getText_style() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    size += TextStyle.ADAPTER.encodedSizeWithTag(3, value.getText_style());
                }
                return !Intrinsics.areEqual(value.getText(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getText()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartAxisLabel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getValue()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getValue()));
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (value.getText_style() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_style());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getText());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartAxisLabel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getText());
                }
                if (value.getText_style() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_style());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (Float.valueOf(value.getValue()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartAxisLabel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextStyle textStyleDecode = TextStyle.TEXT_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                String strDecode = "";
                float fFloatValue = 0.0f;
                while (true) {
                    TextStyle textStyle = textStyleDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ChartAxisLabel(fFloatValue, themedColorDecode, textStyle, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        } else if (iNextTag == 2) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                textStyleDecode = TextStyle.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartAxisLabel redact(ChartAxisLabel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return ChartAxisLabel.copy$default(value, 0.0f, color != null ? ThemedColor.ADAPTER.redact(color) : null, null, null, ByteString.EMPTY, 13, null);
            }
        };
    }
}
