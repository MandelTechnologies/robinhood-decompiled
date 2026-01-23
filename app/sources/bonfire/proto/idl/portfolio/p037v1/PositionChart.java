package bonfire.proto.idl.portfolio.p037v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PositionChart.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBS\u0012\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016JR\u0010\u001b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R(\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionChart;", "Lcom/squareup/wire/Message;", "", "chart_lines", "", "", "", "page_direction", "Lbonfire/proto/idl/portfolio/v1/PositionChartDirection;", "overlays", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/portfolio/v1/PositionChartDirection;Ljava/util/List;Lokio/ByteString;)V", "getPage_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDirection;", "getChart_lines", "()Ljava/util/List;", "getOverlays", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionChart extends Message {

    @JvmField
    public static final ProtoAdapter<PositionChart> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Map<String, ?>> chart_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Map<String, ?>> overlays;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionChartDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PositionChartDirection page_direction;

    public PositionChart() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9026newBuilder();
    }

    public /* synthetic */ PositionChart(List list, PositionChartDirection positionChartDirection, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? PositionChartDirection.PositionChartDirection_UNSPECIFIED : positionChartDirection, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PositionChartDirection getPage_direction() {
        return this.page_direction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionChart(List<? extends Map<String, ?>> chart_lines, PositionChartDirection page_direction, List<? extends Map<String, ?>> overlays, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(chart_lines, "chart_lines");
        Intrinsics.checkNotNullParameter(page_direction, "page_direction");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.page_direction = page_direction;
        this.chart_lines = (List) Internal.immutableCopyOfStruct("chart_lines", chart_lines);
        this.overlays = (List) Internal.immutableCopyOfStruct("overlays", overlays);
    }

    public final List<Map<String, ?>> getChart_lines() {
        return this.chart_lines;
    }

    public final List<Map<String, ?>> getOverlays() {
        return this.overlays;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9026newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionChart)) {
            return false;
        }
        PositionChart positionChart = (PositionChart) other;
        return Intrinsics.areEqual(unknownFields(), positionChart.unknownFields()) && Intrinsics.areEqual(this.chart_lines, positionChart.chart_lines) && this.page_direction == positionChart.page_direction && Intrinsics.areEqual(this.overlays, positionChart.overlays);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.chart_lines.hashCode()) * 37) + this.page_direction.hashCode()) * 37) + this.overlays.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.chart_lines.isEmpty()) {
            arrayList.add("chart_lines=" + this.chart_lines);
        }
        arrayList.add("page_direction=" + this.page_direction);
        if (!this.overlays.isEmpty()) {
            arrayList.add("overlays=" + this.overlays);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionChart{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositionChart copy$default(PositionChart positionChart, List list, PositionChartDirection positionChartDirection, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = positionChart.chart_lines;
        }
        if ((i & 2) != 0) {
            positionChartDirection = positionChart.page_direction;
        }
        if ((i & 4) != 0) {
            list2 = positionChart.overlays;
        }
        if ((i & 8) != 0) {
            byteString = positionChart.unknownFields();
        }
        return positionChart.copy(list, positionChartDirection, list2, byteString);
    }

    public final PositionChart copy(List<? extends Map<String, ?>> chart_lines, PositionChartDirection page_direction, List<? extends Map<String, ?>> overlays, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(chart_lines, "chart_lines");
        Intrinsics.checkNotNullParameter(page_direction, "page_direction");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionChart(chart_lines, page_direction, overlays, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionChart.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionChart>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.PositionChart$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionChart value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getChart_lines());
                if (value.getPage_direction() != PositionChartDirection.PositionChartDirection_UNSPECIFIED) {
                    iEncodedSizeWithTag += PositionChartDirection.ADAPTER.encodedSizeWithTag(2, value.getPage_direction());
                }
                return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getOverlays());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionChart value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getChart_lines());
                if (value.getPage_direction() != PositionChartDirection.PositionChartDirection_UNSPECIFIED) {
                    PositionChartDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getPage_direction());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getOverlays());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionChart value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getOverlays());
                if (value.getPage_direction() != PositionChartDirection.PositionChartDirection_UNSPECIFIED) {
                    PositionChartDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getPage_direction());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getChart_lines());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionChart decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                PositionChartDirection positionChartDirectionDecode = PositionChartDirection.PositionChartDirection_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PositionChart(arrayList, positionChartDirectionDecode, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRUCT_MAP.decode(reader));
                    } else if (iNextTag == 2) {
                        try {
                            positionChartDirectionDecode = PositionChartDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        arrayList2.add(ProtoAdapter.STRUCT_MAP.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionChart redact(PositionChart value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<Map<String, ?>> chart_lines = value.getChart_lines();
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                return PositionChart.copy$default(value, Internal.m26823redactElements(chart_lines, protoAdapter), null, Internal.m26823redactElements(value.getOverlays(), protoAdapter), ByteString.EMPTY, 2, null);
            }
        };
    }
}
