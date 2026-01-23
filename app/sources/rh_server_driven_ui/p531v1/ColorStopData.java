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

/* compiled from: ColorStopData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/ColorStopData;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/Color;", "stop", "", "opacity", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Color;FFLokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/Color;", "getStop", "()F", "getOpacity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ColorStopData extends Message {

    @JvmField
    public static final ProtoAdapter<ColorStopData> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Color color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float opacity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float stop;

    public ColorStopData() {
        this(null, 0.0f, 0.0f, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29704newBuilder();
    }

    public final Color getColor() {
        return this.color;
    }

    public /* synthetic */ ColorStopData(Color color, float f, float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.COLOR_UNSPECIFIED : color, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final float getStop() {
        return this.stop;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorStopData(Color color, float f, float f2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = color;
        this.stop = f;
        this.opacity = f2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29704newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ColorStopData)) {
            return false;
        }
        ColorStopData colorStopData = (ColorStopData) other;
        return Intrinsics.areEqual(unknownFields(), colorStopData.unknownFields()) && this.color == colorStopData.color && this.stop == colorStopData.stop && this.opacity == colorStopData.opacity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.color.hashCode()) * 37) + Float.hashCode(this.stop)) * 37) + Float.hashCode(this.opacity);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("color=" + this.color);
        arrayList.add("stop=" + this.stop);
        arrayList.add("opacity=" + this.opacity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ColorStopData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ColorStopData copy$default(ColorStopData colorStopData, Color color, float f, float f2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            color = colorStopData.color;
        }
        if ((i & 2) != 0) {
            f = colorStopData.stop;
        }
        if ((i & 4) != 0) {
            f2 = colorStopData.opacity;
        }
        if ((i & 8) != 0) {
            byteString = colorStopData.unknownFields();
        }
        return colorStopData.copy(color, f, f2, byteString);
    }

    public final ColorStopData copy(Color color, float stop, float opacity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ColorStopData(color, stop, opacity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ColorStopData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ColorStopData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ColorStopData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ColorStopData value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getColor() != Color.COLOR_UNSPECIFIED) {
                    size += Color.ADAPTER.encodedSizeWithTag(1, value.getColor());
                }
                if (!Float.valueOf(value.getStop()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getStop()));
                }
                return !Float.valueOf(value.getOpacity()).equals(fValueOf) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getOpacity())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ColorStopData value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getColor() != Color.COLOR_UNSPECIFIED) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
                if (!Float.valueOf(value.getStop()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getStop()));
                }
                if (!Float.valueOf(value.getOpacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getOpacity()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ColorStopData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Float fValueOf = Float.valueOf(value.getOpacity());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getOpacity()));
                }
                if (!Float.valueOf(value.getStop()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getStop()));
                }
                if (value.getColor() != Color.COLOR_UNSPECIFIED) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ColorStopData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Color colorDecode = Color.COLOR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ColorStopData(colorDecode, fFloatValue, fFloatValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            colorDecode = Color.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ColorStopData redact(ColorStopData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ColorStopData.copy$default(value, null, 0.0f, 0.0f, ByteString.EMPTY, 7, null);
            }
        };
    }
}
