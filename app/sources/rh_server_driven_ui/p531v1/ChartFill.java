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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ChartFill.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JI\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\"R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFill;", "Lcom/squareup/wire/Message;", "", "identifier", "", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ChartFillStyle;", "points", "", "Lrh_server_driven_ui/v1/Point;", "draw_layer", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ChartFillStyle;Ljava/util/List;Ljava/lang/Float;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getStyle", "()Lrh_server_driven_ui/v1/ChartFillStyle;", "getDraw_layer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPoints", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ChartFillStyle;Ljava/util/List;Ljava/lang/Float;Lokio/ByteString;)Lrh_server_driven_ui/v1/ChartFill;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartFill extends Message {

    @JvmField
    public static final ProtoAdapter<ChartFill> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "drawLayer", schemaIndex = 3, tag = 4)
    private final Float draw_layer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.Point#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Point> points;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartFillStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartFillStyle style;

    public ChartFill() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29689newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ChartFillStyle getStyle() {
        return this.style;
    }

    public /* synthetic */ ChartFill(String str, ChartFillStyle chartFillStyle, List list, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : chartFillStyle, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : f, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Float getDraw_layer() {
        return this.draw_layer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartFill(String str, ChartFillStyle chartFillStyle, List<Point> points, Float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = str;
        this.style = chartFillStyle;
        this.draw_layer = f;
        this.points = Internal.immutableCopyOf("points", points);
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29689newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartFill)) {
            return false;
        }
        ChartFill chartFill = (ChartFill) other;
        return Intrinsics.areEqual(unknownFields(), chartFill.unknownFields()) && Intrinsics.areEqual(this.identifier, chartFill.identifier) && Intrinsics.areEqual(this.style, chartFill.style) && Intrinsics.areEqual(this.points, chartFill.points) && Intrinsics.areEqual(this.draw_layer, chartFill.draw_layer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.identifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        ChartFillStyle chartFillStyle = this.style;
        int iHashCode3 = (((iHashCode2 + (chartFillStyle != null ? chartFillStyle.hashCode() : 0)) * 37) + this.points.hashCode()) * 37;
        Float f = this.draw_layer;
        int iHashCode4 = iHashCode3 + (f != null ? f.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.identifier;
        if (str != null) {
            arrayList.add("identifier=" + Internal.sanitize(str));
        }
        ChartFillStyle chartFillStyle = this.style;
        if (chartFillStyle != null) {
            arrayList.add("style=" + chartFillStyle);
        }
        if (!this.points.isEmpty()) {
            arrayList.add("points=" + this.points);
        }
        Float f = this.draw_layer;
        if (f != null) {
            arrayList.add("draw_layer=" + f);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartFill{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChartFill copy$default(ChartFill chartFill, String str, ChartFillStyle chartFillStyle, List list, Float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartFill.identifier;
        }
        if ((i & 2) != 0) {
            chartFillStyle = chartFill.style;
        }
        if ((i & 4) != 0) {
            list = chartFill.points;
        }
        if ((i & 8) != 0) {
            f = chartFill.draw_layer;
        }
        if ((i & 16) != 0) {
            byteString = chartFill.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return chartFill.copy(str, chartFillStyle, list2, f, byteString2);
    }

    public final ChartFill copy(String identifier, ChartFillStyle style, List<Point> points, Float draw_layer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartFill(identifier, style, points, draw_layer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartFill.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartFill>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartFill$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartFill value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
                if (value.getStyle() != null) {
                    size += ChartFillStyle.ADAPTER.encodedSizeWithTag(2, value.getStyle());
                }
                return size + Point.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPoints()) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, value.getDraw_layer());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartFill value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                if (value.getStyle() != null) {
                    ChartFillStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyle());
                }
                Point.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPoints());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) value.getDraw_layer());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartFill value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) value.getDraw_layer());
                Point.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPoints());
                if (value.getStyle() != null) {
                    ChartFillStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartFill decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                ChartFillStyle chartFillStyleDecode = null;
                Float fDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartFill(strDecode, chartFillStyleDecode, arrayList, fDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        chartFillStyleDecode = ChartFillStyle.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(Point.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartFill redact(ChartFill value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartFillStyle style = value.getStyle();
                return ChartFill.copy$default(value, null, style != null ? ChartFillStyle.ADAPTER.redact(style) : null, Internal.m26823redactElements(value.getPoints(), Point.ADAPTER), null, ByteString.EMPTY, 9, null);
            }
        };
    }
}
