package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ChartGroup.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"rh_server_driven_ui/v1/ChartGroup$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/ChartGroup;", "legend_dataAdapter", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemList;", "getLegend_dataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "legend_dataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: rh_server_driven_ui.v1.ChartGroup$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes25.dex */
public final class ChartGroup2 extends ProtoAdapter<ChartGroup> {

    /* renamed from: legend_dataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy legend_dataAdapter;

    ChartGroup2(FieldEncoding fieldEncoding, KClass<ChartGroup> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rh_server_driven_ui.v1.ChartGroup", syntax, (Object) null, "rh-server-driven-ui/rh_server_driven_ui/proto/v1/containers.proto");
        this.legend_dataAdapter = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartGroup$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartGroup2.legend_dataAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, ChartLegendItemList>> getLegend_dataAdapter() {
        return (ProtoAdapter) this.legend_dataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter legend_dataAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ChartLegendItemList.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ChartGroup value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size() + Chart.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getCharts());
        if (value.getDisplay_span() != DisplaySpan.DISPLAY_SPAN_UNSPECIFIED) {
            size += DisplaySpan.ADAPTER.encodedSizeWithTag(2, value.getDisplay_span());
        }
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        return size + protoAdapter.encodedSizeWithTag(3, value.getX_axis()) + protoAdapter.encodedSizeWithTag(4, value.getY_axis()) + getLegend_dataAdapter().encodedSizeWithTag(5, value.getLegend_data()) + protoAdapter.encodedSizeWithTag(6, value.getY_axis_secondary());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ChartGroup value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        Chart.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCharts());
        if (value.getDisplay_span() != DisplaySpan.DISPLAY_SPAN_UNSPECIFIED) {
            DisplaySpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisplay_span());
        }
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        protoAdapter.encodeWithTag(writer, 3, (int) value.getX_axis());
        protoAdapter.encodeWithTag(writer, 4, (int) value.getY_axis());
        getLegend_dataAdapter().encodeWithTag(writer, 5, (int) value.getLegend_data());
        protoAdapter.encodeWithTag(writer, 6, (int) value.getY_axis_secondary());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ChartGroup value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        protoAdapter.encodeWithTag(writer, 6, (int) value.getY_axis_secondary());
        getLegend_dataAdapter().encodeWithTag(writer, 5, (int) value.getLegend_data());
        protoAdapter.encodeWithTag(writer, 4, (int) value.getY_axis());
        protoAdapter.encodeWithTag(writer, 3, (int) value.getX_axis());
        if (value.getDisplay_span() != DisplaySpan.DISPLAY_SPAN_UNSPECIFIED) {
            DisplaySpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisplay_span());
        }
        Chart.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCharts());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ChartGroup decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        DisplaySpan displaySpanDecode = DisplaySpan.DISPLAY_SPAN_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        ChartAxis chartAxisDecode = null;
        ChartAxis chartAxisDecode2 = null;
        ChartAxis chartAxisDecode3 = null;
        while (true) {
            DisplaySpan displaySpan = displaySpanDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            arrayList.add(Chart.ADAPTER.decode(reader));
                            break;
                        case 2:
                            try {
                                displaySpanDecode = DisplaySpan.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            chartAxisDecode = ChartAxis.ADAPTER.decode(reader);
                            break;
                        case 4:
                            chartAxisDecode2 = ChartAxis.ADAPTER.decode(reader);
                            break;
                        case 5:
                            linkedHashMap.putAll(getLegend_dataAdapter().decode(reader));
                            break;
                        case 6:
                            chartAxisDecode3 = ChartAxis.ADAPTER.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                } else {
                    return new ChartGroup(arrayList, displaySpan, chartAxisDecode, chartAxisDecode2, linkedHashMap, chartAxisDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ChartGroup redact(ChartGroup value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List listM26823redactElements = Internal.m26823redactElements(value.getCharts(), Chart.ADAPTER);
        ChartAxis x_axis = value.getX_axis();
        ChartAxis chartAxisRedact = x_axis != null ? ChartAxis.ADAPTER.redact(x_axis) : null;
        ChartAxis y_axis = value.getY_axis();
        ChartAxis chartAxisRedact2 = y_axis != null ? ChartAxis.ADAPTER.redact(y_axis) : null;
        Map mapM26824redactElements = Internal.m26824redactElements(value.getLegend_data(), ChartLegendItemList.ADAPTER);
        ChartAxis y_axis_secondary = value.getY_axis_secondary();
        return ChartGroup.copy$default(value, listM26823redactElements, null, chartAxisRedact, chartAxisRedact2, mapM26824redactElements, y_axis_secondary != null ? ChartAxis.ADAPTER.redact(y_axis_secondary) : null, ByteString.EMPTY, 2, null);
    }
}
