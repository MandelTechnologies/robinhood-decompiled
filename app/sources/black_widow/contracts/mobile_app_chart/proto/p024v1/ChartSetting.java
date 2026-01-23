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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChartSetting.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010-\u001a\u00020\u0002H\u0017J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u0087\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u00105R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001cR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u00067"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "Lcom/squareup/wire/Message;", "", "key", "", AnnotatedPrivateKey.LABEL, "is_enabled", "", "boolean_value", "chart_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartType;", "nested_section", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;", "radio_group", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroup;", "multi_select_group", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroup;", "trading_section", "", "layer_group", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartType;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroup;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroup;Lkotlin/Unit;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroup;Lokio/ByteString;)V", "getKey", "()Ljava/lang/String;", "getLabel", "()Z", "getBoolean_value", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChart_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartType;", "getNested_section", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;", "getRadio_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroup;", "getMulti_select_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroup;", "getTrading_section", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getLayer_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroup;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartType;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroup;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroup;Lkotlin/Unit;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroup;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ChartSetting extends Message {

    @JvmField
    public static final ProtoAdapter<ChartSetting> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "booleanValue", oneofName = "value", schemaIndex = 3, tag = 5)
    private final Boolean boolean_value;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingChartType#ADAPTER", jsonName = "chartType", oneofName = "value", schemaIndex = 4, tag = 6)
    private final ChartSettingChartType chart_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String label;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingLayerGroup#ADAPTER", jsonName = "layerGroup", oneofName = "value", schemaIndex = 9, tag = 11)
    private final ChartSettingLayerGroup layer_group;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingMultiSelectGroup#ADAPTER", jsonName = "multiSelectGroup", oneofName = "value", schemaIndex = 7, tag = 9)
    private final ChartSettingMultiSelectGroup multi_select_group;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingSection#ADAPTER", jsonName = "nestedSection", oneofName = "value", schemaIndex = 5, tag = 7)
    private final ChartSettingSection nested_section;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingRadioGroup#ADAPTER", jsonName = "radioGroup", oneofName = "value", schemaIndex = 6, tag = 8)
    private final ChartSettingRadioGroup radio_group;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", jsonName = "tradingSection", oneofName = "value", schemaIndex = 8, tag = 10)
    private final Unit trading_section;

    public ChartSetting() {
        this(null, null, false, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ ChartSetting(String str, String str2, boolean z, Boolean bool, ChartSettingChartType chartSettingChartType, ChartSettingSection chartSettingSection, ChartSettingRadioGroup chartSettingRadioGroup, ChartSettingMultiSelectGroup chartSettingMultiSelectGroup, Unit unit, ChartSettingLayerGroup chartSettingLayerGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : chartSettingChartType, (i & 32) != 0 ? null : chartSettingSection, (i & 64) != 0 ? null : chartSettingRadioGroup, (i & 128) != 0 ? null : chartSettingMultiSelectGroup, (i & 256) != 0 ? null : unit, (i & 512) != 0 ? null : chartSettingLayerGroup, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8557newBuilder();
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    /* renamed from: is_enabled, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    public final Boolean getBoolean_value() {
        return this.boolean_value;
    }

    public final ChartSettingChartType getChart_type() {
        return this.chart_type;
    }

    public final ChartSettingSection getNested_section() {
        return this.nested_section;
    }

    public final ChartSettingRadioGroup getRadio_group() {
        return this.radio_group;
    }

    public final ChartSettingMultiSelectGroup getMulti_select_group() {
        return this.multi_select_group;
    }

    public final Unit getTrading_section() {
        return this.trading_section;
    }

    public final ChartSettingLayerGroup getLayer_group() {
        return this.layer_group;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartSetting(String key, String label, boolean z, Boolean bool, ChartSettingChartType chartSettingChartType, ChartSettingSection chartSettingSection, ChartSettingRadioGroup chartSettingRadioGroup, ChartSettingMultiSelectGroup chartSettingMultiSelectGroup, Unit unit, ChartSettingLayerGroup chartSettingLayerGroup, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.key = key;
        this.label = label;
        this.is_enabled = z;
        this.boolean_value = bool;
        this.chart_type = chartSettingChartType;
        this.nested_section = chartSettingSection;
        this.radio_group = chartSettingRadioGroup;
        this.multi_select_group = chartSettingMultiSelectGroup;
        this.trading_section = unit;
        this.layer_group = chartSettingLayerGroup;
        if (Internal.countNonNull(bool, chartSettingChartType, chartSettingSection, chartSettingRadioGroup, chartSettingMultiSelectGroup, unit, chartSettingLayerGroup) > 1) {
            throw new IllegalArgumentException("At most one of boolean_value, chart_type, nested_section, radio_group, multi_select_group, trading_section, layer_group may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8557newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartSetting)) {
            return false;
        }
        ChartSetting chartSetting = (ChartSetting) other;
        return Intrinsics.areEqual(unknownFields(), chartSetting.unknownFields()) && Intrinsics.areEqual(this.key, chartSetting.key) && Intrinsics.areEqual(this.label, chartSetting.label) && this.is_enabled == chartSetting.is_enabled && Intrinsics.areEqual(this.boolean_value, chartSetting.boolean_value) && Intrinsics.areEqual(this.chart_type, chartSetting.chart_type) && Intrinsics.areEqual(this.nested_section, chartSetting.nested_section) && Intrinsics.areEqual(this.radio_group, chartSetting.radio_group) && Intrinsics.areEqual(this.multi_select_group, chartSetting.multi_select_group) && Intrinsics.areEqual(this.trading_section, chartSetting.trading_section) && Intrinsics.areEqual(this.layer_group, chartSetting.layer_group);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.label.hashCode()) * 37) + Boolean.hashCode(this.is_enabled)) * 37;
        Boolean bool = this.boolean_value;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        ChartSettingChartType chartSettingChartType = this.chart_type;
        int iHashCode3 = (iHashCode2 + (chartSettingChartType != null ? chartSettingChartType.hashCode() : 0)) * 37;
        ChartSettingSection chartSettingSection = this.nested_section;
        int iHashCode4 = (iHashCode3 + (chartSettingSection != null ? chartSettingSection.hashCode() : 0)) * 37;
        ChartSettingRadioGroup chartSettingRadioGroup = this.radio_group;
        int iHashCode5 = (iHashCode4 + (chartSettingRadioGroup != null ? chartSettingRadioGroup.hashCode() : 0)) * 37;
        ChartSettingMultiSelectGroup chartSettingMultiSelectGroup = this.multi_select_group;
        int iHashCode6 = (iHashCode5 + (chartSettingMultiSelectGroup != null ? chartSettingMultiSelectGroup.hashCode() : 0)) * 37;
        Unit unit = this.trading_section;
        int iHashCode7 = (iHashCode6 + (unit != null ? unit.hashCode() : 0)) * 37;
        ChartSettingLayerGroup chartSettingLayerGroup = this.layer_group;
        int iHashCode8 = iHashCode7 + (chartSettingLayerGroup != null ? chartSettingLayerGroup.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key=" + Internal.sanitize(this.key));
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("is_enabled=" + this.is_enabled);
        Boolean bool = this.boolean_value;
        if (bool != null) {
            arrayList.add("boolean_value=" + bool);
        }
        ChartSettingChartType chartSettingChartType = this.chart_type;
        if (chartSettingChartType != null) {
            arrayList.add("chart_type=" + chartSettingChartType);
        }
        ChartSettingSection chartSettingSection = this.nested_section;
        if (chartSettingSection != null) {
            arrayList.add("nested_section=" + chartSettingSection);
        }
        ChartSettingRadioGroup chartSettingRadioGroup = this.radio_group;
        if (chartSettingRadioGroup != null) {
            arrayList.add("radio_group=" + chartSettingRadioGroup);
        }
        ChartSettingMultiSelectGroup chartSettingMultiSelectGroup = this.multi_select_group;
        if (chartSettingMultiSelectGroup != null) {
            arrayList.add("multi_select_group=" + chartSettingMultiSelectGroup);
        }
        Unit unit = this.trading_section;
        if (unit != null) {
            arrayList.add("trading_section=" + unit);
        }
        ChartSettingLayerGroup chartSettingLayerGroup = this.layer_group;
        if (chartSettingLayerGroup != null) {
            arrayList.add("layer_group=" + chartSettingLayerGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartSetting{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChartSetting copy$default(ChartSetting chartSetting, String str, String str2, boolean z, Boolean bool, ChartSettingChartType chartSettingChartType, ChartSettingSection chartSettingSection, ChartSettingRadioGroup chartSettingRadioGroup, ChartSettingMultiSelectGroup chartSettingMultiSelectGroup, Unit unit, ChartSettingLayerGroup chartSettingLayerGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartSetting.key;
        }
        if ((i & 2) != 0) {
            str2 = chartSetting.label;
        }
        if ((i & 4) != 0) {
            z = chartSetting.is_enabled;
        }
        if ((i & 8) != 0) {
            bool = chartSetting.boolean_value;
        }
        if ((i & 16) != 0) {
            chartSettingChartType = chartSetting.chart_type;
        }
        if ((i & 32) != 0) {
            chartSettingSection = chartSetting.nested_section;
        }
        if ((i & 64) != 0) {
            chartSettingRadioGroup = chartSetting.radio_group;
        }
        if ((i & 128) != 0) {
            chartSettingMultiSelectGroup = chartSetting.multi_select_group;
        }
        if ((i & 256) != 0) {
            unit = chartSetting.trading_section;
        }
        if ((i & 512) != 0) {
            chartSettingLayerGroup = chartSetting.layer_group;
        }
        if ((i & 1024) != 0) {
            byteString = chartSetting.unknownFields();
        }
        ChartSettingLayerGroup chartSettingLayerGroup2 = chartSettingLayerGroup;
        ByteString byteString2 = byteString;
        ChartSettingMultiSelectGroup chartSettingMultiSelectGroup2 = chartSettingMultiSelectGroup;
        Unit unit2 = unit;
        ChartSettingSection chartSettingSection2 = chartSettingSection;
        ChartSettingRadioGroup chartSettingRadioGroup2 = chartSettingRadioGroup;
        ChartSettingChartType chartSettingChartType2 = chartSettingChartType;
        boolean z2 = z;
        return chartSetting.copy(str, str2, z2, bool, chartSettingChartType2, chartSettingSection2, chartSettingRadioGroup2, chartSettingMultiSelectGroup2, unit2, chartSettingLayerGroup2, byteString2);
    }

    public final ChartSetting copy(String key, String label, boolean is_enabled, Boolean boolean_value, ChartSettingChartType chart_type, ChartSettingSection nested_section, ChartSettingRadioGroup radio_group, ChartSettingMultiSelectGroup multi_select_group, Unit trading_section, ChartSettingLayerGroup layer_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartSetting(key, label, is_enabled, boolean_value, chart_type, nested_section, radio_group, multi_select_group, trading_section, layer_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartSetting.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartSetting>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ChartSetting$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartSetting value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getKey());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLabel());
                }
                if (value.getIs_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_enabled()));
                }
                return size + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getBoolean_value()) + ChartSettingChartType.ADAPTER.encodedSizeWithTag(6, value.getChart_type()) + ChartSettingSection.ADAPTER.encodedSizeWithTag(7, value.getNested_section()) + ChartSettingRadioGroup.ADAPTER.encodedSizeWithTag(8, value.getRadio_group()) + ChartSettingMultiSelectGroup.ADAPTER.encodedSizeWithTag(9, value.getMulti_select_group()) + ProtoAdapter.EMPTY.encodedSizeWithTag(10, value.getTrading_section()) + ChartSettingLayerGroup.ADAPTER.encodedSizeWithTag(11, value.getLayer_group());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartSetting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getKey());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getBoolean_value());
                ChartSettingChartType.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart_type());
                ChartSettingSection.ADAPTER.encodeWithTag(writer, 7, (int) value.getNested_section());
                ChartSettingRadioGroup.ADAPTER.encodeWithTag(writer, 8, (int) value.getRadio_group());
                ChartSettingMultiSelectGroup.ADAPTER.encodeWithTag(writer, 9, (int) value.getMulti_select_group());
                ProtoAdapter.EMPTY.encodeWithTag(writer, 10, (int) value.getTrading_section());
                ChartSettingLayerGroup.ADAPTER.encodeWithTag(writer, 11, (int) value.getLayer_group());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartSetting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ChartSettingLayerGroup.ADAPTER.encodeWithTag(writer, 11, (int) value.getLayer_group());
                ProtoAdapter.EMPTY.encodeWithTag(writer, 10, (int) value.getTrading_section());
                ChartSettingMultiSelectGroup.ADAPTER.encodeWithTag(writer, 9, (int) value.getMulti_select_group());
                ChartSettingRadioGroup.ADAPTER.encodeWithTag(writer, 8, (int) value.getRadio_group());
                ChartSettingSection.ADAPTER.encodeWithTag(writer, 7, (int) value.getNested_section());
                ChartSettingChartType.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart_type());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getBoolean_value());
                if (value.getIs_enabled()) {
                    protoAdapter.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                if (Intrinsics.areEqual(value.getKey(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getKey());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartSetting redact(ChartSetting value) {
                Unit unit;
                Intrinsics.checkNotNullParameter(value, "value");
                ChartSettingChartType chart_type = value.getChart_type();
                ChartSettingChartType chartSettingChartTypeRedact = chart_type != null ? ChartSettingChartType.ADAPTER.redact(chart_type) : null;
                ChartSettingSection nested_section = value.getNested_section();
                ChartSettingSection chartSettingSectionRedact = nested_section != null ? ChartSettingSection.ADAPTER.redact(nested_section) : null;
                ChartSettingRadioGroup radio_group = value.getRadio_group();
                ChartSettingRadioGroup chartSettingRadioGroupRedact = radio_group != null ? ChartSettingRadioGroup.ADAPTER.redact(radio_group) : null;
                ChartSettingMultiSelectGroup multi_select_group = value.getMulti_select_group();
                ChartSettingMultiSelectGroup chartSettingMultiSelectGroupRedact = multi_select_group != null ? ChartSettingMultiSelectGroup.ADAPTER.redact(multi_select_group) : null;
                Unit trading_section = value.getTrading_section();
                if (trading_section != null) {
                    ProtoAdapter.EMPTY.redact(trading_section);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                ChartSettingLayerGroup layer_group = value.getLayer_group();
                return ChartSetting.copy$default(value, null, null, false, null, chartSettingChartTypeRedact, chartSettingSectionRedact, chartSettingRadioGroupRedact, chartSettingMultiSelectGroupRedact, unit, layer_group != null ? ChartSettingLayerGroup.ADAPTER.redact(layer_group) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartSetting decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Boolean boolDecode = null;
                boolean zBooleanValue = false;
                ChartSettingChartType chartSettingChartTypeDecode = null;
                ChartSettingSection chartSettingSectionDecode = null;
                ChartSettingRadioGroup chartSettingRadioGroupDecode = null;
                ChartSettingMultiSelectGroup chartSettingMultiSelectGroupDecode = null;
                ChartSettingLayerGroup chartSettingLayerGroupDecode = null;
                Unit unit = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 5:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                chartSettingChartTypeDecode = ChartSettingChartType.ADAPTER.decode(reader);
                                break;
                            case 7:
                                chartSettingSectionDecode = ChartSettingSection.ADAPTER.decode(reader);
                                break;
                            case 8:
                                chartSettingRadioGroupDecode = ChartSettingRadioGroup.ADAPTER.decode(reader);
                                break;
                            case 9:
                                chartSettingMultiSelectGroupDecode = ChartSettingMultiSelectGroup.ADAPTER.decode(reader);
                                break;
                            case 10:
                                ProtoAdapter.EMPTY.decode(reader);
                                unit = Unit.INSTANCE;
                                break;
                            case 11:
                                chartSettingLayerGroupDecode = ChartSettingLayerGroup.ADAPTER.decode(reader);
                                break;
                        }
                    } else {
                        return new ChartSetting(strDecode, strDecode2, zBooleanValue, boolDecode, chartSettingChartTypeDecode, chartSettingSectionDecode, chartSettingRadioGroupDecode, chartSettingMultiSelectGroupDecode, unit, chartSettingLayerGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
