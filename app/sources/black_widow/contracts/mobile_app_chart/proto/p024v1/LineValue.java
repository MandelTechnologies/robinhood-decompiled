package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: LineValue.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\nH\u0016JQ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010$R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "Lcom/squareup/wire/Message;", "", "thickness", "", "colors", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "visible", "", "line_display_type_value", "", "difference_cloud", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;Lokio/ByteString;)V", "getThickness", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColors", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLine_display_type_value", "()Ljava/lang/String;", "getDifference_cloud", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/Integer;Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LineValue extends Message {

    @JvmField
    public static final ProtoAdapter<LineValue> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.LineColor#ADAPTER", oneofName = "value", schemaIndex = 1, tag = 2)
    private final LineColor colors;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.DifferenceCloud#ADAPTER", jsonName = "differenceCloud", oneofName = "value", schemaIndex = 4, tag = 9)
    private final DifferenceCloud difference_cloud;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lineDisplayTypeValue", oneofName = "value", schemaIndex = 3, tag = 8)
    private final String line_display_type_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", oneofName = "value", schemaIndex = 0, tag = 1)
    private final Integer thickness;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", oneofName = "value", schemaIndex = 2, tag = 3)
    private final Boolean visible;

    public LineValue() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8621newBuilder();
    }

    public final Integer getThickness() {
        return this.thickness;
    }

    public final LineColor getColors() {
        return this.colors;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final String getLine_display_type_value() {
        return this.line_display_type_value;
    }

    public final DifferenceCloud getDifference_cloud() {
        return this.difference_cloud;
    }

    public /* synthetic */ LineValue(Integer num, LineColor lineColor, Boolean bool, String str, DifferenceCloud differenceCloud, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : lineColor, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : differenceCloud, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineValue(Integer num, LineColor lineColor, Boolean bool, String str, DifferenceCloud differenceCloud, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.thickness = num;
        this.colors = lineColor;
        this.visible = bool;
        this.line_display_type_value = str;
        this.difference_cloud = differenceCloud;
        if (Internal.countNonNull(num, lineColor, bool, str, differenceCloud) > 1) {
            throw new IllegalArgumentException("At most one of thickness, colors, visible, line_display_type_value, difference_cloud may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8621newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LineValue)) {
            return false;
        }
        LineValue lineValue = (LineValue) other;
        return Intrinsics.areEqual(unknownFields(), lineValue.unknownFields()) && Intrinsics.areEqual(this.thickness, lineValue.thickness) && Intrinsics.areEqual(this.colors, lineValue.colors) && Intrinsics.areEqual(this.visible, lineValue.visible) && Intrinsics.areEqual(this.line_display_type_value, lineValue.line_display_type_value) && Intrinsics.areEqual(this.difference_cloud, lineValue.difference_cloud);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.thickness;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        LineColor lineColor = this.colors;
        int iHashCode3 = (iHashCode2 + (lineColor != null ? lineColor.hashCode() : 0)) * 37;
        Boolean bool = this.visible;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.line_display_type_value;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        DifferenceCloud differenceCloud = this.difference_cloud;
        int iHashCode6 = iHashCode5 + (differenceCloud != null ? differenceCloud.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.thickness;
        if (num != null) {
            arrayList.add("thickness=" + num);
        }
        LineColor lineColor = this.colors;
        if (lineColor != null) {
            arrayList.add("colors=" + lineColor);
        }
        Boolean bool = this.visible;
        if (bool != null) {
            arrayList.add("visible=" + bool);
        }
        String str = this.line_display_type_value;
        if (str != null) {
            arrayList.add("line_display_type_value=" + Internal.sanitize(str));
        }
        DifferenceCloud differenceCloud = this.difference_cloud;
        if (differenceCloud != null) {
            arrayList.add("difference_cloud=" + differenceCloud);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LineValue{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LineValue copy$default(LineValue lineValue, Integer num, LineColor lineColor, Boolean bool, String str, DifferenceCloud differenceCloud, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lineValue.thickness;
        }
        if ((i & 2) != 0) {
            lineColor = lineValue.colors;
        }
        if ((i & 4) != 0) {
            bool = lineValue.visible;
        }
        if ((i & 8) != 0) {
            str = lineValue.line_display_type_value;
        }
        if ((i & 16) != 0) {
            differenceCloud = lineValue.difference_cloud;
        }
        if ((i & 32) != 0) {
            byteString = lineValue.unknownFields();
        }
        DifferenceCloud differenceCloud2 = differenceCloud;
        ByteString byteString2 = byteString;
        return lineValue.copy(num, lineColor, bool, str, differenceCloud2, byteString2);
    }

    public final LineValue copy(Integer thickness, LineColor colors, Boolean visible, String line_display_type_value, DifferenceCloud difference_cloud, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LineValue(thickness, colors, visible, line_display_type_value, difference_cloud, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LineValue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LineValue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.LineValue$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LineValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, value.getThickness()) + LineColor.ADAPTER.encodedSizeWithTag(2, value.getColors()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getVisible()) + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getLine_display_type_value()) + DifferenceCloud.ADAPTER.encodedSizeWithTag(9, value.getDifference_cloud());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LineValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getThickness());
                LineColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColors());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getVisible());
                ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getLine_display_type_value());
                DifferenceCloud.ADAPTER.encodeWithTag(writer, 9, (int) value.getDifference_cloud());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LineValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DifferenceCloud.ADAPTER.encodeWithTag(writer, 9, (int) value.getDifference_cloud());
                ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getLine_display_type_value());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getVisible());
                LineColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColors());
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getThickness());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LineValue redact(LineValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LineColor colors = value.getColors();
                LineColor lineColorRedact = colors != null ? LineColor.ADAPTER.redact(colors) : null;
                DifferenceCloud difference_cloud = value.getDifference_cloud();
                return LineValue.copy$default(value, null, lineColorRedact, null, null, difference_cloud != null ? DifferenceCloud.ADAPTER.redact(difference_cloud) : null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LineValue decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Integer numDecode = null;
                LineColor lineColorDecode = null;
                Boolean boolDecode = null;
                String strDecode = null;
                DifferenceCloud differenceCloudDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LineValue(numDecode, lineColorDecode, boolDecode, strDecode, differenceCloudDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 2) {
                        lineColorDecode = LineColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 8) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 9) {
                        differenceCloudDecode = DifferenceCloud.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
