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

/* compiled from: LineType.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineType;", "Lcom/squareup/wire/Message;", "", "solid", "Lrh_server_driven_ui/v1/SolidLineType;", "dotted", "Lrh_server_driven_ui/v1/DottedLineType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/SolidLineType;Lrh_server_driven_ui/v1/DottedLineType;Lokio/ByteString;)V", "getSolid", "()Lrh_server_driven_ui/v1/SolidLineType;", "getDotted", "()Lrh_server_driven_ui/v1/DottedLineType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class LineType extends Message {

    @JvmField
    public static final ProtoAdapter<LineType> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.DottedLineType#ADAPTER", oneofName = "style_details", schemaIndex = 1, tag = 2)
    private final DottedLineType dotted;

    @WireField(adapter = "rh_server_driven_ui.v1.SolidLineType#ADAPTER", oneofName = "style_details", schemaIndex = 0, tag = 1)
    private final SolidLineType solid;

    public LineType() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29770newBuilder();
    }

    public final SolidLineType getSolid() {
        return this.solid;
    }

    public final DottedLineType getDotted() {
        return this.dotted;
    }

    public /* synthetic */ LineType(SolidLineType solidLineType, DottedLineType dottedLineType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : solidLineType, (i & 2) != 0 ? null : dottedLineType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineType(SolidLineType solidLineType, DottedLineType dottedLineType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.solid = solidLineType;
        this.dotted = dottedLineType;
        if (Internal.countNonNull(solidLineType, dottedLineType) > 1) {
            throw new IllegalArgumentException("At most one of solid, dotted may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29770newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LineType)) {
            return false;
        }
        LineType lineType = (LineType) other;
        return Intrinsics.areEqual(unknownFields(), lineType.unknownFields()) && Intrinsics.areEqual(this.solid, lineType.solid) && Intrinsics.areEqual(this.dotted, lineType.dotted);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SolidLineType solidLineType = this.solid;
        int iHashCode2 = (iHashCode + (solidLineType != null ? solidLineType.hashCode() : 0)) * 37;
        DottedLineType dottedLineType = this.dotted;
        int iHashCode3 = iHashCode2 + (dottedLineType != null ? dottedLineType.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SolidLineType solidLineType = this.solid;
        if (solidLineType != null) {
            arrayList.add("solid=" + solidLineType);
        }
        DottedLineType dottedLineType = this.dotted;
        if (dottedLineType != null) {
            arrayList.add("dotted=" + dottedLineType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LineType{", "}", 0, null, null, 56, null);
    }

    public final LineType copy(SolidLineType solid, DottedLineType dotted, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LineType(solid, dotted, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LineType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LineType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.LineType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SolidLineType.ADAPTER.encodedSizeWithTag(1, value.getSolid()) + DottedLineType.ADAPTER.encodedSizeWithTag(2, value.getDotted());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SolidLineType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSolid());
                DottedLineType.ADAPTER.encodeWithTag(writer, 2, (int) value.getDotted());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LineType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DottedLineType.ADAPTER.encodeWithTag(writer, 2, (int) value.getDotted());
                SolidLineType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSolid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LineType redact(LineType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SolidLineType solid = value.getSolid();
                SolidLineType solidLineTypeRedact = solid != null ? SolidLineType.ADAPTER.redact(solid) : null;
                DottedLineType dotted = value.getDotted();
                return value.copy(solidLineTypeRedact, dotted != null ? DottedLineType.ADAPTER.redact(dotted) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LineType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SolidLineType solidLineTypeDecode = null;
                DottedLineType dottedLineTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LineType(solidLineTypeDecode, dottedLineTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        solidLineTypeDecode = SolidLineType.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        dottedLineTypeDecode = DottedLineType.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
