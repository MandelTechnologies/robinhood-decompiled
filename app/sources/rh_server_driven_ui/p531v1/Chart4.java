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

/* compiled from: Chart.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"rh_server_driven_ui/v1/Chart$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Chart;", "legend_dataAdapter", "", "", "Lrh_server_driven_ui/v1/ChartLegendItemList;", "getLegend_dataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "legend_dataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: rh_server_driven_ui.v1.Chart$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes25.dex */
public final class Chart4 extends ProtoAdapter<Chart> {

    /* renamed from: legend_dataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy legend_dataAdapter;

    Chart4(FieldEncoding fieldEncoding, KClass<Chart> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rh_server_driven_ui.v1.Chart", syntax, (Object) null, "rh-server-driven-ui/rh_server_driven_ui/proto/v1/containers.proto");
        this.legend_dataAdapter = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.Chart$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Chart4.legend_dataAdapter_delegate$lambda$0();
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
    public int encodedSize(Chart value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size() + Text.ADAPTER.encodedSizeWithTag(1, value.getTitle()) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.getWeight()) + Line.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getLines());
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        return size + protoAdapter.encodedSizeWithTag(4, value.getX_axis()) + protoAdapter.encodedSizeWithTag(5, value.getY_axis()) + getLegend_dataAdapter().encodedSizeWithTag(6, value.getLegend_data()) + ChartFill.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getFills()) + UIComponent.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getOverlays()) + protoAdapter.encodedSizeWithTag(9, value.getY_axis_secondary());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Chart value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        Text.ADAPTER.encodeWithTag(writer, 1, (int) value.getTitle());
        ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) value.getWeight());
        Line.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getLines());
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        protoAdapter.encodeWithTag(writer, 4, (int) value.getX_axis());
        protoAdapter.encodeWithTag(writer, 5, (int) value.getY_axis());
        getLegend_dataAdapter().encodeWithTag(writer, 6, (int) value.getLegend_data());
        ChartFill.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFills());
        UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getOverlays());
        protoAdapter.encodeWithTag(writer, 9, (int) value.getY_axis_secondary());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Chart value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<ChartAxis> protoAdapter = ChartAxis.ADAPTER;
        protoAdapter.encodeWithTag(writer, 9, (int) value.getY_axis_secondary());
        UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getOverlays());
        ChartFill.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFills());
        getLegend_dataAdapter().encodeWithTag(writer, 6, (int) value.getLegend_data());
        protoAdapter.encodeWithTag(writer, 5, (int) value.getY_axis());
        protoAdapter.encodeWithTag(writer, 4, (int) value.getX_axis());
        Line.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getLines());
        ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) value.getWeight());
        Text.ADAPTER.encodeWithTag(writer, 1, (int) value.getTitle());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Chart decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        Text textDecode = null;
        Float fDecode = null;
        ChartAxis chartAxisDecode = null;
        ChartAxis chartAxisDecode2 = null;
        ChartAxis chartAxisDecode3 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        textDecode = Text.ADAPTER.decode(reader);
                        break;
                    case 2:
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 3:
                        arrayList.add(Line.ADAPTER.decode(reader));
                        break;
                    case 4:
                        chartAxisDecode = ChartAxis.ADAPTER.decode(reader);
                        break;
                    case 5:
                        chartAxisDecode2 = ChartAxis.ADAPTER.decode(reader);
                        break;
                    case 6:
                        linkedHashMap.putAll(getLegend_dataAdapter().decode(reader));
                        break;
                    case 7:
                        arrayList2.add(ChartFill.ADAPTER.decode(reader));
                        break;
                    case 8:
                        arrayList3.add(UIComponent.ADAPTER.decode(reader));
                        break;
                    case 9:
                        chartAxisDecode3 = ChartAxis.ADAPTER.decode(reader);
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        break;
                }
            } else {
                return new Chart(textDecode, fDecode, arrayList, chartAxisDecode, chartAxisDecode2, linkedHashMap, arrayList2, arrayList3, chartAxisDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Chart redact(Chart value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Text title = value.getTitle();
        Text textRedact = title != null ? Text.ADAPTER.redact(title) : null;
        List listM26823redactElements = Internal.m26823redactElements(value.getLines(), Line.ADAPTER);
        ChartAxis x_axis = value.getX_axis();
        ChartAxis chartAxisRedact = x_axis != null ? ChartAxis.ADAPTER.redact(x_axis) : null;
        ChartAxis y_axis = value.getY_axis();
        ChartAxis chartAxisRedact2 = y_axis != null ? ChartAxis.ADAPTER.redact(y_axis) : null;
        Map mapM26824redactElements = Internal.m26824redactElements(value.getLegend_data(), ChartLegendItemList.ADAPTER);
        List listM26823redactElements2 = Internal.m26823redactElements(value.getFills(), ChartFill.ADAPTER);
        List listM26823redactElements3 = Internal.m26823redactElements(value.getOverlays(), UIComponent.ADAPTER);
        ChartAxis y_axis_secondary = value.getY_axis_secondary();
        return Chart.copy$default(value, textRedact, null, listM26823redactElements, chartAxisRedact, chartAxisRedact2, mapM26824redactElements, listM26823redactElements2, listM26823redactElements3, y_axis_secondary != null ? ChartAxis.ADAPTER.redact(y_axis_secondary) : null, ByteString.EMPTY, 2, null);
    }
}
