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

/* compiled from: SolidLineType.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/SolidLineType;", "Lcom/squareup/wire/Message;", "", "stroke_width", "", "cap_style", "Lrh_server_driven_ui/v1/LineCapStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(FLrh_server_driven_ui/v1/LineCapStyle;Lokio/ByteString;)V", "getStroke_width", "()F", "getCap_style", "()Lrh_server_driven_ui/v1/LineCapStyle;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SolidLineType extends Message {

    @JvmField
    public static final ProtoAdapter<SolidLineType> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.LineCapStyle#ADAPTER", jsonName = "capStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final LineCapStyle cap_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "strokeWidth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float stroke_width;

    public SolidLineType() {
        this(0.0f, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29810newBuilder();
    }

    public final float getStroke_width() {
        return this.stroke_width;
    }

    public final LineCapStyle getCap_style() {
        return this.cap_style;
    }

    public /* synthetic */ SolidLineType(float f, LineCapStyle lineCapStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? LineCapStyle.LINE_CAP_UNSPECIFIED : lineCapStyle, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidLineType(float f, LineCapStyle cap_style, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cap_style, "cap_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.stroke_width = f;
        this.cap_style = cap_style;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29810newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SolidLineType)) {
            return false;
        }
        SolidLineType solidLineType = (SolidLineType) other;
        return Intrinsics.areEqual(unknownFields(), solidLineType.unknownFields()) && this.stroke_width == solidLineType.stroke_width && this.cap_style == solidLineType.cap_style;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Float.hashCode(this.stroke_width)) * 37) + this.cap_style.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("stroke_width=" + this.stroke_width);
        arrayList.add("cap_style=" + this.cap_style);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SolidLineType{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SolidLineType copy$default(SolidLineType solidLineType, float f, LineCapStyle lineCapStyle, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = solidLineType.stroke_width;
        }
        if ((i & 2) != 0) {
            lineCapStyle = solidLineType.cap_style;
        }
        if ((i & 4) != 0) {
            byteString = solidLineType.unknownFields();
        }
        return solidLineType.copy(f, lineCapStyle, byteString);
    }

    public final SolidLineType copy(float stroke_width, LineCapStyle cap_style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cap_style, "cap_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SolidLineType(stroke_width, cap_style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SolidLineType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SolidLineType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.SolidLineType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SolidLineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Float.valueOf(value.getStroke_width()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getStroke_width()));
                }
                return value.getCap_style() != LineCapStyle.LINE_CAP_UNSPECIFIED ? size + LineCapStyle.ADAPTER.encodedSizeWithTag(2, value.getCap_style()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SolidLineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getStroke_width()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getStroke_width()));
                }
                if (value.getCap_style() != LineCapStyle.LINE_CAP_UNSPECIFIED) {
                    LineCapStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getCap_style());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SolidLineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCap_style() != LineCapStyle.LINE_CAP_UNSPECIFIED) {
                    LineCapStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getCap_style());
                }
                if (Float.valueOf(value.getStroke_width()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getStroke_width()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SolidLineType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LineCapStyle lineCapStyleDecode = LineCapStyle.LINE_CAP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SolidLineType(fFloatValue, lineCapStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 2) {
                        try {
                            lineCapStyleDecode = LineCapStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SolidLineType redact(SolidLineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SolidLineType.copy$default(value, 0.0f, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
