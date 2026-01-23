package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: DottedChartFillStyle.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/DottedChartFillStyle;", "Lcom/squareup/wire/Message;", "", "dot_color", "Lrh_server_driven_ui/v1/ThemedColor;", "dot_size", "", "dot_distance", "opacity", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;FFFLokio/ByteString;)V", "getDot_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getDot_size", "()F", "getDot_distance", "getOpacity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class DottedChartFillStyle extends Message {

    @JvmField
    public static final ProtoAdapter<DottedChartFillStyle> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "dotColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor dot_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "dotDistance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float dot_distance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "dotSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float dot_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float opacity;

    public DottedChartFillStyle() {
        this(null, 0.0f, 0.0f, 0.0f, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29735newBuilder();
    }

    public final ThemedColor getDot_color() {
        return this.dot_color;
    }

    public final float getDot_size() {
        return this.dot_size;
    }

    public final float getDot_distance() {
        return this.dot_distance;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public /* synthetic */ DottedChartFillStyle(ThemedColor themedColor, float f, float f2, float f3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedChartFillStyle(ThemedColor themedColor, float f, float f2, float f3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dot_color = themedColor;
        this.dot_size = f;
        this.dot_distance = f2;
        this.opacity = f3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29735newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DottedChartFillStyle)) {
            return false;
        }
        DottedChartFillStyle dottedChartFillStyle = (DottedChartFillStyle) other;
        return Intrinsics.areEqual(unknownFields(), dottedChartFillStyle.unknownFields()) && Intrinsics.areEqual(this.dot_color, dottedChartFillStyle.dot_color) && this.dot_size == dottedChartFillStyle.dot_size && this.dot_distance == dottedChartFillStyle.dot_distance && this.opacity == dottedChartFillStyle.opacity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.dot_color;
        int iHashCode2 = ((((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.dot_size)) * 37) + Float.hashCode(this.dot_distance)) * 37) + Float.hashCode(this.opacity);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.dot_color;
        if (themedColor != null) {
            arrayList.add("dot_color=" + themedColor);
        }
        arrayList.add("dot_size=" + this.dot_size);
        arrayList.add("dot_distance=" + this.dot_distance);
        arrayList.add("opacity=" + this.opacity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DottedChartFillStyle{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DottedChartFillStyle copy$default(DottedChartFillStyle dottedChartFillStyle, ThemedColor themedColor, float f, float f2, float f3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = dottedChartFillStyle.dot_color;
        }
        if ((i & 2) != 0) {
            f = dottedChartFillStyle.dot_size;
        }
        if ((i & 4) != 0) {
            f2 = dottedChartFillStyle.dot_distance;
        }
        if ((i & 8) != 0) {
            f3 = dottedChartFillStyle.opacity;
        }
        if ((i & 16) != 0) {
            byteString = dottedChartFillStyle.unknownFields();
        }
        ByteString byteString2 = byteString;
        float f4 = f2;
        return dottedChartFillStyle.copy(themedColor, f, f4, f3, byteString2);
    }

    public final DottedChartFillStyle copy(ThemedColor dot_color, float dot_size, float dot_distance, float opacity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DottedChartFillStyle(dot_color, dot_size, dot_distance, opacity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DottedChartFillStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DottedChartFillStyle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.DottedChartFillStyle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DottedChartFillStyle value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDot_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getDot_color());
                }
                if (!Float.valueOf(value.getDot_size()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getDot_size()));
                }
                if (!Float.valueOf(value.getDot_distance()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getDot_distance()));
                }
                return !Float.valueOf(value.getOpacity()).equals(fValueOf) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getOpacity())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DottedChartFillStyle value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDot_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getDot_color());
                }
                if (!Float.valueOf(value.getDot_size()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDot_size()));
                }
                if (!Float.valueOf(value.getDot_distance()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getDot_distance()));
                }
                if (!Float.valueOf(value.getOpacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getOpacity()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DottedChartFillStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Float fValueOf = Float.valueOf(value.getOpacity());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getOpacity()));
                }
                if (!Float.valueOf(value.getDot_distance()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getDot_distance()));
                }
                if (!Float.valueOf(value.getDot_size()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDot_size()));
                }
                if (value.getDot_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getDot_color());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DottedChartFillStyle redact(DottedChartFillStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor dot_color = value.getDot_color();
                return DottedChartFillStyle.copy$default(value, dot_color != null ? ThemedColor.ADAPTER.redact(dot_color) : null, 0.0f, 0.0f, 0.0f, ByteString.EMPTY, 14, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DottedChartFillStyle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DottedChartFillStyle(themedColorDecode, fFloatValue, fFloatValue2, fFloatValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 4) {
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
