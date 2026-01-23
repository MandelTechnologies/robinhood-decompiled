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

/* compiled from: ColorStop.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J7\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lrh_server_driven_ui/v1/ColorStop;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "stop", "", "opacity", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;FLjava/lang/Float;Lokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getStop", "()F", "getOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lrh_server_driven_ui/v1/ThemedColor;FLjava/lang/Float;Lokio/ByteString;)Lrh_server_driven_ui/v1/ColorStop;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ColorStop extends Message {

    @JvmField
    public static final ProtoAdapter<ColorStop> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
    private final Float opacity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float stop;

    public ColorStop() {
        this(null, 0.0f, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29703newBuilder();
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final float getStop() {
        return this.stop;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public /* synthetic */ ColorStop(ThemedColor themedColor, float f, Float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorStop(ThemedColor themedColor, float f, Float f2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = themedColor;
        this.stop = f;
        this.opacity = f2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29703newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ColorStop)) {
            return false;
        }
        ColorStop colorStop = (ColorStop) other;
        return Intrinsics.areEqual(unknownFields(), colorStop.unknownFields()) && Intrinsics.areEqual(this.color, colorStop.color) && this.stop == colorStop.stop && Intrinsics.areEqual(this.opacity, colorStop.opacity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.stop)) * 37;
        Float f = this.opacity;
        int iHashCode3 = iHashCode2 + (f != null ? f.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("stop=" + this.stop);
        Float f = this.opacity;
        if (f != null) {
            arrayList.add("opacity=" + f);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ColorStop{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ColorStop copy$default(ColorStop colorStop, ThemedColor themedColor, float f, Float f2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = colorStop.color;
        }
        if ((i & 2) != 0) {
            f = colorStop.stop;
        }
        if ((i & 4) != 0) {
            f2 = colorStop.opacity;
        }
        if ((i & 8) != 0) {
            byteString = colorStop.unknownFields();
        }
        return colorStop.copy(themedColor, f, f2, byteString);
    }

    public final ColorStop copy(ThemedColor color, float stop, Float opacity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ColorStop(color, stop, opacity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ColorStop.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ColorStop>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ColorStop$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ColorStop value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor());
                }
                if (!Float.valueOf(value.getStop()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getStop()));
                }
                return size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.getOpacity());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ColorStop value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
                if (!Float.valueOf(value.getStop()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getStop()));
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) value.getOpacity());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ColorStop value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getOpacity());
                if (!Float.valueOf(value.getStop()).equals(Float.valueOf(0.0f))) {
                    protoAdapter.encodeWithTag(writer, 2, (int) Float.valueOf(value.getStop()));
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ColorStop redact(ColorStop value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return ColorStop.copy$default(value, color != null ? ThemedColor.ADAPTER.redact(color) : null, 0.0f, null, ByteString.EMPTY, 6, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ColorStop decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                float fFloatValue = 0.0f;
                Float fDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ColorStop(themedColorDecode, fFloatValue, fDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
