package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: Chart.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u000fH\u0016J\u0097\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u00102R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/Chart;", "Lcom/squareup/wire/Message;", "", "title", "Lrh_server_driven_ui/v1/Text;", "weight", "", "lines", "", "Lrh_server_driven_ui/v1/Line;", "x_axis", "Lrh_server_driven_ui/v1/ChartAxis;", "y_axis", "legend_data", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemList;", "fills", "Lrh_server_driven_ui/v1/ChartFill;", "overlays", "Lrh_server_driven_ui/v1/UIComponent;", "y_axis_secondary", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Text;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxis;Lrh_server_driven_ui/v1/ChartAxis;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxis;Lokio/ByteString;)V", "getTitle", "()Lrh_server_driven_ui/v1/Text;", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxis;", "getY_axis", "getY_axis_secondary", "getLines", "()Ljava/util/List;", "getLegend_data", "()Ljava/util/Map;", "getFills", "getOverlays", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Lrh_server_driven_ui/v1/Text;Ljava/lang/Float;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxis;Lrh_server_driven_ui/v1/ChartAxis;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxis;Lokio/ByteString;)Lrh_server_driven_ui/v1/Chart;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Chart extends Message {

    @WireField(adapter = "rh_server_driven_ui.v1.ChartFill#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<ChartFill> fills;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartLegendItemList#ADAPTER", jsonName = "legendData", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final Map<String, ChartLegendItemList> legend_data;

    @WireField(adapter = "rh_server_driven_ui.v1.Line#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Line> lines;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<UIComponent> overlays;

    @WireField(adapter = "rh_server_driven_ui.v1.Text#ADAPTER", schemaIndex = 0, tag = 1)
    private final Text title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
    private final Float weight;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "xAxis", schemaIndex = 3, tag = 4)
    private final ChartAxis x_axis;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "yAxis", schemaIndex = 4, tag = 5)
    private final ChartAxis y_axis;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "yAxisSecondary", schemaIndex = 8, tag = 9)
    private final ChartAxis y_axis_secondary;

    @JvmField
    public static final ProtoAdapter<Chart> ADAPTER = new Chart4(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Chart.class), Syntax.PROTO_3);

    public Chart() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29673newBuilder();
    }

    public final Text getTitle() {
        return this.title;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public /* synthetic */ Chart(Text text, Float f, List list, ChartAxis chartAxis, ChartAxis chartAxis2, Map map, List list2, List list3, ChartAxis chartAxis3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : text, (i & 2) != 0 ? null : f, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : chartAxis, (i & 16) != 0 ? null : chartAxis2, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : chartAxis3, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartAxis getX_axis() {
        return this.x_axis;
    }

    public final ChartAxis getY_axis() {
        return this.y_axis;
    }

    public final ChartAxis getY_axis_secondary() {
        return this.y_axis_secondary;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Chart(Text text, Float f, List<Line> lines, ChartAxis chartAxis, ChartAxis chartAxis2, Map<String, ChartLegendItemList> legend_data, List<ChartFill> fills, List<UIComponent> overlays, ChartAxis chartAxis3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = text;
        this.weight = f;
        this.x_axis = chartAxis;
        this.y_axis = chartAxis2;
        this.y_axis_secondary = chartAxis3;
        this.lines = Internal.immutableCopyOf("lines", lines);
        this.legend_data = Internal.immutableCopyOf("legend_data", legend_data);
        this.fills = Internal.immutableCopyOf("fills", fills);
        this.overlays = Internal.immutableCopyOf("overlays", overlays);
    }

    public final List<Line> getLines() {
        return this.lines;
    }

    public final Map<String, ChartLegendItemList> getLegend_data() {
        return this.legend_data;
    }

    public final List<ChartFill> getFills() {
        return this.fills;
    }

    public final List<UIComponent> getOverlays() {
        return this.overlays;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29673newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Chart)) {
            return false;
        }
        Chart chart = (Chart) other;
        return Intrinsics.areEqual(unknownFields(), chart.unknownFields()) && Intrinsics.areEqual(this.title, chart.title) && Intrinsics.areEqual(this.weight, chart.weight) && Intrinsics.areEqual(this.lines, chart.lines) && Intrinsics.areEqual(this.x_axis, chart.x_axis) && Intrinsics.areEqual(this.y_axis, chart.y_axis) && Intrinsics.areEqual(this.legend_data, chart.legend_data) && Intrinsics.areEqual(this.fills, chart.fills) && Intrinsics.areEqual(this.overlays, chart.overlays) && Intrinsics.areEqual(this.y_axis_secondary, chart.y_axis_secondary);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int iHashCode2 = (iHashCode + (text != null ? text.hashCode() : 0)) * 37;
        Float f = this.weight;
        int iHashCode3 = (((iHashCode2 + (f != null ? f.hashCode() : 0)) * 37) + this.lines.hashCode()) * 37;
        ChartAxis chartAxis = this.x_axis;
        int iHashCode4 = (iHashCode3 + (chartAxis != null ? chartAxis.hashCode() : 0)) * 37;
        ChartAxis chartAxis2 = this.y_axis;
        int iHashCode5 = (((((((iHashCode4 + (chartAxis2 != null ? chartAxis2.hashCode() : 0)) * 37) + this.legend_data.hashCode()) * 37) + this.fills.hashCode()) * 37) + this.overlays.hashCode()) * 37;
        ChartAxis chartAxis3 = this.y_axis_secondary;
        int iHashCode6 = iHashCode5 + (chartAxis3 != null ? chartAxis3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            arrayList.add("title=" + text);
        }
        Float f = this.weight;
        if (f != null) {
            arrayList.add("weight=" + f);
        }
        if (!this.lines.isEmpty()) {
            arrayList.add("lines=" + this.lines);
        }
        ChartAxis chartAxis = this.x_axis;
        if (chartAxis != null) {
            arrayList.add("x_axis=" + chartAxis);
        }
        ChartAxis chartAxis2 = this.y_axis;
        if (chartAxis2 != null) {
            arrayList.add("y_axis=" + chartAxis2);
        }
        if (!this.legend_data.isEmpty()) {
            arrayList.add("legend_data=" + this.legend_data);
        }
        if (!this.fills.isEmpty()) {
            arrayList.add("fills=" + this.fills);
        }
        if (!this.overlays.isEmpty()) {
            arrayList.add("overlays=" + this.overlays);
        }
        ChartAxis chartAxis3 = this.y_axis_secondary;
        if (chartAxis3 != null) {
            arrayList.add("y_axis_secondary=" + chartAxis3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Chart{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Chart copy$default(Chart chart, Text text, Float f, List list, ChartAxis chartAxis, ChartAxis chartAxis2, Map map, List list2, List list3, ChartAxis chartAxis3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            text = chart.title;
        }
        if ((i & 2) != 0) {
            f = chart.weight;
        }
        if ((i & 4) != 0) {
            list = chart.lines;
        }
        if ((i & 8) != 0) {
            chartAxis = chart.x_axis;
        }
        if ((i & 16) != 0) {
            chartAxis2 = chart.y_axis;
        }
        if ((i & 32) != 0) {
            map = chart.legend_data;
        }
        if ((i & 64) != 0) {
            list2 = chart.fills;
        }
        if ((i & 128) != 0) {
            list3 = chart.overlays;
        }
        if ((i & 256) != 0) {
            chartAxis3 = chart.y_axis_secondary;
        }
        if ((i & 512) != 0) {
            byteString = chart.unknownFields();
        }
        ChartAxis chartAxis4 = chartAxis3;
        ByteString byteString2 = byteString;
        List list4 = list2;
        List list5 = list3;
        ChartAxis chartAxis5 = chartAxis2;
        Map map2 = map;
        return chart.copy(text, f, list, chartAxis, chartAxis5, map2, list4, list5, chartAxis4, byteString2);
    }

    public final Chart copy(Text title, Float weight, List<Line> lines, ChartAxis x_axis, ChartAxis y_axis, Map<String, ChartLegendItemList> legend_data, List<ChartFill> fills, List<UIComponent> overlays, ChartAxis y_axis_secondary, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Chart(title, weight, lines, x_axis, y_axis, legend_data, fills, overlays, y_axis_secondary, unknownFields);
    }
}
