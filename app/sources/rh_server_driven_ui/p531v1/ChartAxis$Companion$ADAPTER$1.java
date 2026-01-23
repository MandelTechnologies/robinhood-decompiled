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
import rh_server_driven_ui.p531v1.ChartAxis;

/* compiled from: ChartAxis.kt */
@Metadata(m3635d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR-\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\b¨\u0006\u001b"}, m3636d2 = {"rh_server_driven_ui/v1/ChartAxis$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/ChartAxis;", "scrubbing_labelsAdapter", "", "", "Lrh_server_driven_ui/v1/DisplayText;", "getScrubbing_labelsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "scrubbing_labelsAdapter$delegate", "Lkotlin/Lazy;", "cursor_dataAdapter", "Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "getCursor_dataAdapter", "cursor_dataAdapter$delegate", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class ChartAxis$Companion$ADAPTER$1 extends ProtoAdapter<ChartAxis> {

    /* renamed from: cursor_dataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy cursor_dataAdapter;

    /* renamed from: scrubbing_labelsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy scrubbing_labelsAdapter;

    ChartAxis$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<ChartAxis> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rh_server_driven_ui.v1.ChartAxis", syntax, (Object) null, "rh-server-driven-ui/rh_server_driven_ui/proto/v1/containers.proto");
        this.scrubbing_labelsAdapter = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxis$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartAxis$Companion$ADAPTER$1.scrubbing_labelsAdapter_delegate$lambda$0();
            }
        });
        this.cursor_dataAdapter = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxis$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartAxis$Companion$ADAPTER$1.cursor_dataAdapter_delegate$lambda$1();
            }
        });
    }

    private final ProtoAdapter<Map<String, DisplayText>> getScrubbing_labelsAdapter() {
        return (ProtoAdapter) this.scrubbing_labelsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter scrubbing_labelsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, DisplayText.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter cursor_dataAdapter_delegate$lambda$1() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ChartAxis.ChartAxisCursorData.ADAPTER);
    }

    private final ProtoAdapter<Map<String, ChartAxis.ChartAxisCursorData>> getCursor_dataAdapter() {
        return (ProtoAdapter) this.cursor_dataAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ChartAxis value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size() + ChartAxisLabel.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLabels());
        ProtoAdapter<ChartAxisRange> protoAdapter = ChartAxisRange.ADAPTER;
        return size + protoAdapter.encodedSizeWithTag(2, value.getRange()) + protoAdapter.encodedSizeWithTag(3, value.getEffective_range()) + getScrubbing_labelsAdapter().encodedSizeWithTag(4, value.getScrubbing_labels()) + getCursor_dataAdapter().encodedSizeWithTag(5, value.getCursor_data());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ChartAxis value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        ChartAxisLabel.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLabels());
        ProtoAdapter<ChartAxisRange> protoAdapter = ChartAxisRange.ADAPTER;
        protoAdapter.encodeWithTag(writer, 2, (int) value.getRange());
        protoAdapter.encodeWithTag(writer, 3, (int) value.getEffective_range());
        getScrubbing_labelsAdapter().encodeWithTag(writer, 4, (int) value.getScrubbing_labels());
        getCursor_dataAdapter().encodeWithTag(writer, 5, (int) value.getCursor_data());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ChartAxis value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getCursor_dataAdapter().encodeWithTag(writer, 5, (int) value.getCursor_data());
        getScrubbing_labelsAdapter().encodeWithTag(writer, 4, (int) value.getScrubbing_labels());
        ProtoAdapter<ChartAxisRange> protoAdapter = ChartAxisRange.ADAPTER;
        protoAdapter.encodeWithTag(writer, 3, (int) value.getEffective_range());
        protoAdapter.encodeWithTag(writer, 2, (int) value.getRange());
        ChartAxisLabel.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLabels());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ChartAxis decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        ChartAxisRange chartAxisRangeDecode = null;
        ChartAxisRange chartAxisRangeDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new ChartAxis(arrayList, chartAxisRangeDecode, chartAxisRangeDecode2, linkedHashMap, linkedHashMap2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                arrayList.add(ChartAxisLabel.ADAPTER.decode(reader));
            } else if (iNextTag == 2) {
                chartAxisRangeDecode = ChartAxisRange.ADAPTER.decode(reader);
            } else if (iNextTag == 3) {
                chartAxisRangeDecode2 = ChartAxisRange.ADAPTER.decode(reader);
            } else if (iNextTag == 4) {
                linkedHashMap.putAll(getScrubbing_labelsAdapter().decode(reader));
            } else if (iNextTag == 5) {
                linkedHashMap2.putAll(getCursor_dataAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ChartAxis redact(ChartAxis value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<ChartAxisLabel> listM26823redactElements = Internal.m26823redactElements(value.getLabels(), ChartAxisLabel.ADAPTER);
        ChartAxisRange range = value.getRange();
        ChartAxisRange chartAxisRangeRedact = range != null ? ChartAxisRange.ADAPTER.redact(range) : null;
        ChartAxisRange effective_range = value.getEffective_range();
        return value.copy(listM26823redactElements, chartAxisRangeRedact, effective_range != null ? ChartAxisRange.ADAPTER.redact(effective_range) : null, Internal.m26824redactElements(value.getScrubbing_labels(), DisplayText.ADAPTER), Internal.m26824redactElements(value.getCursor_data(), ChartAxis.ChartAxisCursorData.ADAPTER), ByteString.EMPTY);
    }
}
