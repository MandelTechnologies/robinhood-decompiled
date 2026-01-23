package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ChartGroup.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Be\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\rH\u0016Jd\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartGroup;", "Lcom/squareup/wire/Message;", "", "charts", "", "Lrh_server_driven_ui/v1/Chart;", "display_span", "Lrh_server_driven_ui/v1/DisplaySpan;", "x_axis", "Lrh_server_driven_ui/v1/ChartAxis;", "y_axis", "legend_data", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemList;", "y_axis_secondary", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/DisplaySpan;Lrh_server_driven_ui/v1/ChartAxis;Lrh_server_driven_ui/v1/ChartAxis;Ljava/util/Map;Lrh_server_driven_ui/v1/ChartAxis;Lokio/ByteString;)V", "getDisplay_span", "()Lrh_server_driven_ui/v1/DisplaySpan;", "getX_axis", "()Lrh_server_driven_ui/v1/ChartAxis;", "getY_axis", "getY_axis_secondary", "getCharts", "()Ljava/util/List;", "getLegend_data", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartGroup extends Message {

    @WireField(adapter = "rh_server_driven_ui.v1.Chart#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Chart> charts;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplaySpan#ADAPTER", jsonName = "displaySpan", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DisplaySpan display_span;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartLegendItemList#ADAPTER", jsonName = "legendData", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final Map<String, ChartLegendItemList> legend_data;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "xAxis", schemaIndex = 2, tag = 3)
    private final ChartAxis x_axis;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "yAxis", schemaIndex = 3, tag = 4)
    private final ChartAxis y_axis;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis#ADAPTER", jsonName = "yAxisSecondary", schemaIndex = 5, tag = 6)
    private final ChartAxis y_axis_secondary;

    @JvmField
    public static final ProtoAdapter<ChartGroup> ADAPTER = new ChartGroup2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(ChartGroup.class), Syntax.PROTO_3);

    public ChartGroup() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29692newBuilder();
    }

    public /* synthetic */ ChartGroup(List list, DisplaySpan displaySpan, ChartAxis chartAxis, ChartAxis chartAxis2, Map map, ChartAxis chartAxis3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? DisplaySpan.DISPLAY_SPAN_UNSPECIFIED : displaySpan, (i & 4) != 0 ? null : chartAxis, (i & 8) != 0 ? null : chartAxis2, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? null : chartAxis3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DisplaySpan getDisplay_span() {
        return this.display_span;
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
    public ChartGroup(List<Chart> charts, DisplaySpan display_span, ChartAxis chartAxis, ChartAxis chartAxis2, Map<String, ChartLegendItemList> legend_data, ChartAxis chartAxis3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.display_span = display_span;
        this.x_axis = chartAxis;
        this.y_axis = chartAxis2;
        this.y_axis_secondary = chartAxis3;
        this.charts = Internal.immutableCopyOf("charts", charts);
        this.legend_data = Internal.immutableCopyOf("legend_data", legend_data);
    }

    public final List<Chart> getCharts() {
        return this.charts;
    }

    public final Map<String, ChartLegendItemList> getLegend_data() {
        return this.legend_data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29692newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartGroup)) {
            return false;
        }
        ChartGroup chartGroup = (ChartGroup) other;
        return Intrinsics.areEqual(unknownFields(), chartGroup.unknownFields()) && Intrinsics.areEqual(this.charts, chartGroup.charts) && this.display_span == chartGroup.display_span && Intrinsics.areEqual(this.x_axis, chartGroup.x_axis) && Intrinsics.areEqual(this.y_axis, chartGroup.y_axis) && Intrinsics.areEqual(this.legend_data, chartGroup.legend_data) && Intrinsics.areEqual(this.y_axis_secondary, chartGroup.y_axis_secondary);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.charts.hashCode()) * 37) + this.display_span.hashCode()) * 37;
        ChartAxis chartAxis = this.x_axis;
        int iHashCode2 = (iHashCode + (chartAxis != null ? chartAxis.hashCode() : 0)) * 37;
        ChartAxis chartAxis2 = this.y_axis;
        int iHashCode3 = (((iHashCode2 + (chartAxis2 != null ? chartAxis2.hashCode() : 0)) * 37) + this.legend_data.hashCode()) * 37;
        ChartAxis chartAxis3 = this.y_axis_secondary;
        int iHashCode4 = iHashCode3 + (chartAxis3 != null ? chartAxis3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.charts.isEmpty()) {
            arrayList.add("charts=" + this.charts);
        }
        arrayList.add("display_span=" + this.display_span);
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
        ChartAxis chartAxis3 = this.y_axis_secondary;
        if (chartAxis3 != null) {
            arrayList.add("y_axis_secondary=" + chartAxis3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartGroup{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChartGroup copy$default(ChartGroup chartGroup, List list, DisplaySpan displaySpan, ChartAxis chartAxis, ChartAxis chartAxis2, Map map, ChartAxis chartAxis3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartGroup.charts;
        }
        if ((i & 2) != 0) {
            displaySpan = chartGroup.display_span;
        }
        if ((i & 4) != 0) {
            chartAxis = chartGroup.x_axis;
        }
        if ((i & 8) != 0) {
            chartAxis2 = chartGroup.y_axis;
        }
        if ((i & 16) != 0) {
            map = chartGroup.legend_data;
        }
        if ((i & 32) != 0) {
            chartAxis3 = chartGroup.y_axis_secondary;
        }
        if ((i & 64) != 0) {
            byteString = chartGroup.unknownFields();
        }
        ChartAxis chartAxis4 = chartAxis3;
        ByteString byteString2 = byteString;
        Map map2 = map;
        ChartAxis chartAxis5 = chartAxis;
        return chartGroup.copy(list, displaySpan, chartAxis5, chartAxis2, map2, chartAxis4, byteString2);
    }

    public final ChartGroup copy(List<Chart> charts, DisplaySpan display_span, ChartAxis x_axis, ChartAxis y_axis, Map<String, ChartLegendItemList> legend_data, ChartAxis y_axis_secondary, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(legend_data, "legend_data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartGroup(charts, display_span, x_axis, y_axis, legend_data, y_axis_secondary, unknownFields);
    }
}
