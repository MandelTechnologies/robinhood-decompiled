package rh_server_driven_ui.p531v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ChartAxis;

/* compiled from: ChartAxis.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005$%&'(Be\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016Jd\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxis;", "Lcom/squareup/wire/Message;", "", "labels", "", "Lrh_server_driven_ui/v1/ChartAxisLabel;", "range", "Lrh_server_driven_ui/v1/ChartAxisRange;", "effective_range", "scrubbing_labels", "", "", "Lrh_server_driven_ui/v1/DisplayText;", "cursor_data", "Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/ChartAxisRange;Lrh_server_driven_ui/v1/ChartAxisRange;Ljava/util/Map;Ljava/util/Map;Lokio/ByteString;)V", "getRange", "()Lrh_server_driven_ui/v1/ChartAxisRange;", "getEffective_range", "getLabels", "()Ljava/util/List;", "getScrubbing_labels", "()Ljava/util/Map;", "getCursor_data", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ChartAxisCursorData", "ComponentCursorData", "AxisCursorDataList", "AxisCursorData", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartAxis extends Message {

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis$ChartAxisCursorData#ADAPTER", jsonName = "cursorData", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final Map<String, ChartAxisCursorData> cursor_data;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxisRange#ADAPTER", jsonName = "effectiveRange", schemaIndex = 2, tag = 3)
    private final ChartAxisRange effective_range;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxisLabel#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ChartAxisLabel> labels;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartAxisRange#ADAPTER", schemaIndex = 1, tag = 2)
    private final ChartAxisRange range;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "scrubbingLabels", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final Map<String, DisplayText> scrubbing_labels;

    @JvmField
    public static final ProtoAdapter<ChartAxis> ADAPTER = new ChartAxis$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(ChartAxis.class), Syntax.PROTO_3);

    public ChartAxis() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29675newBuilder();
    }

    public /* synthetic */ ChartAxis(List list, ChartAxisRange chartAxisRange, ChartAxisRange chartAxisRange2, Map map, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : chartAxisRange, (i & 4) != 0 ? null : chartAxisRange2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartAxisRange getRange() {
        return this.range;
    }

    public final ChartAxisRange getEffective_range() {
        return this.effective_range;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartAxis(List<ChartAxisLabel> labels, ChartAxisRange chartAxisRange, ChartAxisRange chartAxisRange2, Map<String, DisplayText> scrubbing_labels, Map<String, ChartAxisCursorData> cursor_data, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubbing_labels, "scrubbing_labels");
        Intrinsics.checkNotNullParameter(cursor_data, "cursor_data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.range = chartAxisRange;
        this.effective_range = chartAxisRange2;
        this.labels = Internal.immutableCopyOf("labels", labels);
        this.scrubbing_labels = Internal.immutableCopyOf("scrubbing_labels", scrubbing_labels);
        this.cursor_data = Internal.immutableCopyOf("cursor_data", cursor_data);
    }

    public final List<ChartAxisLabel> getLabels() {
        return this.labels;
    }

    public final Map<String, DisplayText> getScrubbing_labels() {
        return this.scrubbing_labels;
    }

    public final Map<String, ChartAxisCursorData> getCursor_data() {
        return this.cursor_data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29675newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartAxis)) {
            return false;
        }
        ChartAxis chartAxis = (ChartAxis) other;
        return Intrinsics.areEqual(unknownFields(), chartAxis.unknownFields()) && Intrinsics.areEqual(this.labels, chartAxis.labels) && Intrinsics.areEqual(this.range, chartAxis.range) && Intrinsics.areEqual(this.effective_range, chartAxis.effective_range) && Intrinsics.areEqual(this.scrubbing_labels, chartAxis.scrubbing_labels) && Intrinsics.areEqual(this.cursor_data, chartAxis.cursor_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.labels.hashCode()) * 37;
        ChartAxisRange chartAxisRange = this.range;
        int iHashCode2 = (iHashCode + (chartAxisRange != null ? chartAxisRange.hashCode() : 0)) * 37;
        ChartAxisRange chartAxisRange2 = this.effective_range;
        int iHashCode3 = ((((iHashCode2 + (chartAxisRange2 != null ? chartAxisRange2.hashCode() : 0)) * 37) + this.scrubbing_labels.hashCode()) * 37) + this.cursor_data.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.labels.isEmpty()) {
            arrayList.add("labels=" + this.labels);
        }
        ChartAxisRange chartAxisRange = this.range;
        if (chartAxisRange != null) {
            arrayList.add("range=" + chartAxisRange);
        }
        ChartAxisRange chartAxisRange2 = this.effective_range;
        if (chartAxisRange2 != null) {
            arrayList.add("effective_range=" + chartAxisRange2);
        }
        if (!this.scrubbing_labels.isEmpty()) {
            arrayList.add("scrubbing_labels=" + this.scrubbing_labels);
        }
        if (!this.cursor_data.isEmpty()) {
            arrayList.add("cursor_data=" + this.cursor_data);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartAxis{", "}", 0, null, null, 56, null);
    }

    public final ChartAxis copy(List<ChartAxisLabel> labels, ChartAxisRange range, ChartAxisRange effective_range, Map<String, DisplayText> scrubbing_labels, Map<String, ChartAxisCursorData> cursor_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubbing_labels, "scrubbing_labels");
        Intrinsics.checkNotNullParameter(cursor_data, "cursor_data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartAxis(labels, range, effective_range, scrubbing_labels, cursor_data, unknownFields);
    }

    /* compiled from: ChartAxis.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxis$ChartAxisCursorData;", "Lcom/squareup/wire/Message;", "", "component_cursor_data", "Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "axis_cursor_data", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;Lokio/ByteString;)V", "getComponent_cursor_data", "()Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "getAxis_cursor_data", "()Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartAxisCursorData extends Message {

        @JvmField
        public static final ProtoAdapter<ChartAxisCursorData> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis$AxisCursorDataList#ADAPTER", jsonName = "axisCursorData", oneofName = "concrete", schemaIndex = 1, tag = 2)
        private final AxisCursorDataList axis_cursor_data;

        @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis$ComponentCursorData#ADAPTER", jsonName = "componentCursorData", oneofName = "concrete", schemaIndex = 0, tag = 1)
        private final ComponentCursorData component_cursor_data;

        public ChartAxisCursorData() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29678newBuilder();
        }

        public final ComponentCursorData getComponent_cursor_data() {
            return this.component_cursor_data;
        }

        public final AxisCursorDataList getAxis_cursor_data() {
            return this.axis_cursor_data;
        }

        public /* synthetic */ ChartAxisCursorData(ComponentCursorData componentCursorData, AxisCursorDataList axisCursorDataList, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : componentCursorData, (i & 2) != 0 ? null : axisCursorDataList, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartAxisCursorData(ComponentCursorData componentCursorData, AxisCursorDataList axisCursorDataList, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.component_cursor_data = componentCursorData;
            this.axis_cursor_data = axisCursorDataList;
            if (Internal.countNonNull(componentCursorData, axisCursorDataList) > 1) {
                throw new IllegalArgumentException("At most one of component_cursor_data, axis_cursor_data may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29678newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ChartAxisCursorData)) {
                return false;
            }
            ChartAxisCursorData chartAxisCursorData = (ChartAxisCursorData) other;
            return Intrinsics.areEqual(unknownFields(), chartAxisCursorData.unknownFields()) && Intrinsics.areEqual(this.component_cursor_data, chartAxisCursorData.component_cursor_data) && Intrinsics.areEqual(this.axis_cursor_data, chartAxisCursorData.axis_cursor_data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ComponentCursorData componentCursorData = this.component_cursor_data;
            int iHashCode2 = (iHashCode + (componentCursorData != null ? componentCursorData.hashCode() : 0)) * 37;
            AxisCursorDataList axisCursorDataList = this.axis_cursor_data;
            int iHashCode3 = iHashCode2 + (axisCursorDataList != null ? axisCursorDataList.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ComponentCursorData componentCursorData = this.component_cursor_data;
            if (componentCursorData != null) {
                arrayList.add("component_cursor_data=" + componentCursorData);
            }
            AxisCursorDataList axisCursorDataList = this.axis_cursor_data;
            if (axisCursorDataList != null) {
                arrayList.add("axis_cursor_data=" + axisCursorDataList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ChartAxisCursorData{", "}", 0, null, null, 56, null);
        }

        public final ChartAxisCursorData copy(ComponentCursorData component_cursor_data, AxisCursorDataList axis_cursor_data, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ChartAxisCursorData(component_cursor_data, axis_cursor_data, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartAxisCursorData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ChartAxisCursorData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxis$ChartAxisCursorData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ChartAxis.ChartAxisCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ChartAxis.ComponentCursorData.ADAPTER.encodedSizeWithTag(1, value.getComponent_cursor_data()) + ChartAxis.AxisCursorDataList.ADAPTER.encodedSizeWithTag(2, value.getAxis_cursor_data());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ChartAxis.ChartAxisCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ChartAxis.ComponentCursorData.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent_cursor_data());
                    ChartAxis.AxisCursorDataList.ADAPTER.encodeWithTag(writer, 2, (int) value.getAxis_cursor_data());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ChartAxis.ChartAxisCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ChartAxis.AxisCursorDataList.ADAPTER.encodeWithTag(writer, 2, (int) value.getAxis_cursor_data());
                    ChartAxis.ComponentCursorData.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent_cursor_data());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.ChartAxisCursorData redact(ChartAxis.ChartAxisCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ChartAxis.ComponentCursorData component_cursor_data = value.getComponent_cursor_data();
                    ChartAxis.ComponentCursorData componentCursorDataRedact = component_cursor_data != null ? ChartAxis.ComponentCursorData.ADAPTER.redact(component_cursor_data) : null;
                    ChartAxis.AxisCursorDataList axis_cursor_data = value.getAxis_cursor_data();
                    return value.copy(componentCursorDataRedact, axis_cursor_data != null ? ChartAxis.AxisCursorDataList.ADAPTER.redact(axis_cursor_data) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.ChartAxisCursorData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ChartAxis.ComponentCursorData componentCursorDataDecode = null;
                    ChartAxis.AxisCursorDataList axisCursorDataListDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ChartAxis.ChartAxisCursorData(componentCursorDataDecode, axisCursorDataListDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            componentCursorDataDecode = ChartAxis.ComponentCursorData.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            axisCursorDataListDecode = ChartAxis.AxisCursorDataList.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ChartAxis.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxis$ComponentCursorData;", "Lcom/squareup/wire/Message;", "", "component", "Lrh_server_driven_ui/v1/UIComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lokio/ByteString;)V", "getComponent", "()Lrh_server_driven_ui/v1/UIComponent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ComponentCursorData extends Message {

        @JvmField
        public static final ProtoAdapter<ComponentCursorData> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final UIComponent component;

        /* JADX WARN: Multi-variable type inference failed */
        public ComponentCursorData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29680newBuilder();
        }

        public final UIComponent getComponent() {
            return this.component;
        }

        public /* synthetic */ ComponentCursorData(UIComponent uIComponent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentCursorData(UIComponent uIComponent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.component = uIComponent;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29680newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ComponentCursorData)) {
                return false;
            }
            ComponentCursorData componentCursorData = (ComponentCursorData) other;
            return Intrinsics.areEqual(unknownFields(), componentCursorData.unknownFields()) && Intrinsics.areEqual(this.component, componentCursorData.component);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            UIComponent uIComponent = this.component;
            int iHashCode2 = iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            UIComponent uIComponent = this.component;
            if (uIComponent != null) {
                arrayList.add("component=" + uIComponent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ComponentCursorData{", "}", 0, null, null, 56, null);
        }

        public final ComponentCursorData copy(UIComponent component, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ComponentCursorData(component, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComponentCursorData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ComponentCursorData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxis$ComponentCursorData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ChartAxis.ComponentCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getComponent() != null ? size + UIComponent.ADAPTER.encodedSizeWithTag(1, value.getComponent()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ChartAxis.ComponentCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getComponent() != null) {
                        UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ChartAxis.ComponentCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getComponent() != null) {
                        UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.ComponentCursorData redact(ChartAxis.ComponentCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    UIComponent component = value.getComponent();
                    return value.copy(component != null ? UIComponent.ADAPTER.redact(component) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.ComponentCursorData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    UIComponent uIComponentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ChartAxis.ComponentCursorData(uIComponentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ChartAxis.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxis$AxisCursorDataList;", "Lcom/squareup/wire/Message;", "", "title", "Lrh_server_driven_ui/v1/DisplayText;", WebsocketGatewayConstants.DATA_KEY, "", "Lrh_server_driven_ui/v1/ChartAxis$AxisCursorData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/DisplayText;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Lrh_server_driven_ui/v1/DisplayText;", "getData", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AxisCursorDataList extends Message {

        @JvmField
        public static final ProtoAdapter<AxisCursorDataList> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ChartAxis$AxisCursorData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<AxisCursorData> data;

        @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final DisplayText title;

        public AxisCursorDataList() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29677newBuilder();
        }

        public final DisplayText getTitle() {
            return this.title;
        }

        public /* synthetic */ AxisCursorDataList(DisplayText displayText, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : displayText, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AxisCursorDataList(DisplayText displayText, List<AxisCursorData> data, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = displayText;
            this.data = Internal.immutableCopyOf(WebsocketGatewayConstants.DATA_KEY, data);
        }

        public final List<AxisCursorData> getData() {
            return this.data;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29677newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AxisCursorDataList)) {
                return false;
            }
            AxisCursorDataList axisCursorDataList = (AxisCursorDataList) other;
            return Intrinsics.areEqual(unknownFields(), axisCursorDataList.unknownFields()) && Intrinsics.areEqual(this.title, axisCursorDataList.title) && Intrinsics.areEqual(this.data, axisCursorDataList.data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            DisplayText displayText = this.title;
            int iHashCode2 = ((iHashCode + (displayText != null ? displayText.hashCode() : 0)) * 37) + this.data.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            DisplayText displayText = this.title;
            if (displayText != null) {
                arrayList.add("title=" + displayText);
            }
            if (!this.data.isEmpty()) {
                arrayList.add("data=" + this.data);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AxisCursorDataList{", "}", 0, null, null, 56, null);
        }

        public final AxisCursorDataList copy(DisplayText title, List<AxisCursorData> data, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AxisCursorDataList(title, data, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AxisCursorDataList.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AxisCursorDataList>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxis$AxisCursorDataList$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ChartAxis.AxisCursorDataList value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getTitle() != null) {
                        size += DisplayText.ADAPTER.encodedSizeWithTag(1, value.getTitle());
                    }
                    return size + ChartAxis.AxisCursorData.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getData());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ChartAxis.AxisCursorDataList value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTitle() != null) {
                        DisplayText.ADAPTER.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    ChartAxis.AxisCursorData.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getData());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ChartAxis.AxisCursorDataList value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ChartAxis.AxisCursorData.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getData());
                    if (value.getTitle() != null) {
                        DisplayText.ADAPTER.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.AxisCursorDataList decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    DisplayText displayTextDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ChartAxis.AxisCursorDataList(displayTextDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            displayTextDecode = DisplayText.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            arrayList.add(ChartAxis.AxisCursorData.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.AxisCursorDataList redact(ChartAxis.AxisCursorDataList value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    DisplayText title = value.getTitle();
                    return value.copy(title != null ? DisplayText.ADAPTER.redact(title) : null, Internal.m26823redactElements(value.getData(), ChartAxis.AxisCursorData.ADAPTER), ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: ChartAxis.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxis$AxisCursorData;", "Lcom/squareup/wire/Message;", "", "id", "", WebsocketGatewayConstants.DATA_KEY, "Lrh_server_driven_ui/v1/DisplayText;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayText;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getData", "()Lrh_server_driven_ui/v1/DisplayText;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AxisCursorData extends Message {

        @JvmField
        public static final ProtoAdapter<AxisCursorData> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final DisplayText data;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        public AxisCursorData() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29676newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ AxisCursorData(String str, DisplayText displayText, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : displayText, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final DisplayText getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AxisCursorData(String id, DisplayText displayText, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.data = displayText;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29676newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AxisCursorData)) {
                return false;
            }
            AxisCursorData axisCursorData = (AxisCursorData) other;
            return Intrinsics.areEqual(unknownFields(), axisCursorData.unknownFields()) && Intrinsics.areEqual(this.id, axisCursorData.id) && Intrinsics.areEqual(this.data, axisCursorData.data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
            DisplayText displayText = this.data;
            int iHashCode2 = iHashCode + (displayText != null ? displayText.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            DisplayText displayText = this.data;
            if (displayText != null) {
                arrayList.add("data=" + displayText);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AxisCursorData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AxisCursorData copy$default(AxisCursorData axisCursorData, String str, DisplayText displayText, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = axisCursorData.id;
            }
            if ((i & 2) != 0) {
                displayText = axisCursorData.data;
            }
            if ((i & 4) != 0) {
                byteString = axisCursorData.unknownFields();
            }
            return axisCursorData.copy(str, displayText, byteString);
        }

        public final AxisCursorData copy(String id, DisplayText data, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AxisCursorData(id, data, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AxisCursorData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AxisCursorData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxis$AxisCursorData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.AxisCursorData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    DisplayText displayTextDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ChartAxis.AxisCursorData(strDecode, displayTextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            displayTextDecode = DisplayText.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ChartAxis.AxisCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    return value.getData() != null ? size + DisplayText.ADAPTER.encodedSizeWithTag(2, value.getData()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ChartAxis.AxisCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    if (value.getData() != null) {
                        DisplayText.ADAPTER.encodeWithTag(writer, 2, (int) value.getData());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ChartAxis.AxisCursorData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getData() != null) {
                        DisplayText.ADAPTER.encodeWithTag(writer, 2, (int) value.getData());
                    }
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ChartAxis.AxisCursorData redact(ChartAxis.AxisCursorData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    DisplayText data = value.getData();
                    return ChartAxis.AxisCursorData.copy$default(value, null, data != null ? DisplayText.ADAPTER.redact(data) : null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }
}
