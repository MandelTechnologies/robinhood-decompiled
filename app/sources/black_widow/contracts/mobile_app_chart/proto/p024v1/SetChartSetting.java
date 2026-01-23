package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: SetChartSetting.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010$R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "Lcom/squareup/wire/Message;", "", "key", "", "boolean_value", "", "chart_type", "radio_group_value", "multi_select_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupValue;", "layer_group_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupValue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupValue;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupValue;Lokio/ByteString;)V", "getKey", "()Ljava/lang/String;", "getBoolean_value", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChart_type", "getRadio_group_value", "getMulti_select_value", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupValue;", "getLayer_group_value", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupValue;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupValue;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupValue;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetChartSetting extends Message {

    @JvmField
    public static final ProtoAdapter<SetChartSetting> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "booleanValue", oneofName = "value", schemaIndex = 1, tag = 5)
    private final Boolean boolean_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chartType", oneofName = "value", schemaIndex = 2, tag = 6)
    private final String chart_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 3)
    private final String key;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingLayerGroupValue#ADAPTER", jsonName = "layerGroupValue", oneofName = "value", schemaIndex = 5, tag = 9)
    private final ChartSettingLayerGroupValue layer_group_value;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingMultiSelectGroupValue#ADAPTER", jsonName = "multiSelectValue", oneofName = "value", schemaIndex = 4, tag = 8)
    private final ChartSettingMultiSelectGroupValue multi_select_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "radioGroupValue", oneofName = "value", schemaIndex = 3, tag = 7)
    private final String radio_group_value;

    public SetChartSetting() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8652newBuilder();
    }

    public final String getKey() {
        return this.key;
    }

    public /* synthetic */ SetChartSetting(String str, Boolean bool, String str2, String str3, ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue, ChartSettingLayerGroupValue chartSettingLayerGroupValue, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : chartSettingMultiSelectGroupValue, (i & 32) != 0 ? null : chartSettingLayerGroupValue, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getBoolean_value() {
        return this.boolean_value;
    }

    public final String getChart_type() {
        return this.chart_type;
    }

    public final String getRadio_group_value() {
        return this.radio_group_value;
    }

    public final ChartSettingMultiSelectGroupValue getMulti_select_value() {
        return this.multi_select_value;
    }

    public final ChartSettingLayerGroupValue getLayer_group_value() {
        return this.layer_group_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetChartSetting(String key, Boolean bool, String str, String str2, ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue, ChartSettingLayerGroupValue chartSettingLayerGroupValue, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.key = key;
        this.boolean_value = bool;
        this.chart_type = str;
        this.radio_group_value = str2;
        this.multi_select_value = chartSettingMultiSelectGroupValue;
        this.layer_group_value = chartSettingLayerGroupValue;
        if (Internal.countNonNull(bool, str, str2, chartSettingMultiSelectGroupValue, chartSettingLayerGroupValue) > 1) {
            throw new IllegalArgumentException("At most one of boolean_value, chart_type, radio_group_value, multi_select_value, layer_group_value may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8652newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetChartSetting)) {
            return false;
        }
        SetChartSetting setChartSetting = (SetChartSetting) other;
        return Intrinsics.areEqual(unknownFields(), setChartSetting.unknownFields()) && Intrinsics.areEqual(this.key, setChartSetting.key) && Intrinsics.areEqual(this.boolean_value, setChartSetting.boolean_value) && Intrinsics.areEqual(this.chart_type, setChartSetting.chart_type) && Intrinsics.areEqual(this.radio_group_value, setChartSetting.radio_group_value) && Intrinsics.areEqual(this.multi_select_value, setChartSetting.multi_select_value) && Intrinsics.areEqual(this.layer_group_value, setChartSetting.layer_group_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37;
        Boolean bool = this.boolean_value;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.chart_type;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.radio_group_value;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue = this.multi_select_value;
        int iHashCode5 = (iHashCode4 + (chartSettingMultiSelectGroupValue != null ? chartSettingMultiSelectGroupValue.hashCode() : 0)) * 37;
        ChartSettingLayerGroupValue chartSettingLayerGroupValue = this.layer_group_value;
        int iHashCode6 = iHashCode5 + (chartSettingLayerGroupValue != null ? chartSettingLayerGroupValue.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key=" + Internal.sanitize(this.key));
        Boolean bool = this.boolean_value;
        if (bool != null) {
            arrayList.add("boolean_value=" + bool);
        }
        String str = this.chart_type;
        if (str != null) {
            arrayList.add("chart_type=" + Internal.sanitize(str));
        }
        String str2 = this.radio_group_value;
        if (str2 != null) {
            arrayList.add("radio_group_value=" + Internal.sanitize(str2));
        }
        ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue = this.multi_select_value;
        if (chartSettingMultiSelectGroupValue != null) {
            arrayList.add("multi_select_value=" + chartSettingMultiSelectGroupValue);
        }
        ChartSettingLayerGroupValue chartSettingLayerGroupValue = this.layer_group_value;
        if (chartSettingLayerGroupValue != null) {
            arrayList.add("layer_group_value=" + chartSettingLayerGroupValue);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetChartSetting{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetChartSetting copy$default(SetChartSetting setChartSetting, String str, Boolean bool, String str2, String str3, ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue, ChartSettingLayerGroupValue chartSettingLayerGroupValue, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setChartSetting.key;
        }
        if ((i & 2) != 0) {
            bool = setChartSetting.boolean_value;
        }
        if ((i & 4) != 0) {
            str2 = setChartSetting.chart_type;
        }
        if ((i & 8) != 0) {
            str3 = setChartSetting.radio_group_value;
        }
        if ((i & 16) != 0) {
            chartSettingMultiSelectGroupValue = setChartSetting.multi_select_value;
        }
        if ((i & 32) != 0) {
            chartSettingLayerGroupValue = setChartSetting.layer_group_value;
        }
        if ((i & 64) != 0) {
            byteString = setChartSetting.unknownFields();
        }
        ChartSettingLayerGroupValue chartSettingLayerGroupValue2 = chartSettingLayerGroupValue;
        ByteString byteString2 = byteString;
        ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValue2 = chartSettingMultiSelectGroupValue;
        String str4 = str2;
        return setChartSetting.copy(str, bool, str4, str3, chartSettingMultiSelectGroupValue2, chartSettingLayerGroupValue2, byteString2);
    }

    public final SetChartSetting copy(String key, Boolean boolean_value, String chart_type, String radio_group_value, ChartSettingMultiSelectGroupValue multi_select_value, ChartSettingLayerGroupValue layer_group_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetChartSetting(key, boolean_value, chart_type, radio_group_value, multi_select_value, layer_group_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetChartSetting.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetChartSetting>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetChartSetting$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetChartSetting value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getKey());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getBoolean_value());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getChart_type()) + protoAdapter.encodedSizeWithTag(7, value.getRadio_group_value()) + ChartSettingMultiSelectGroupValue.ADAPTER.encodedSizeWithTag(8, value.getMulti_select_value()) + ChartSettingLayerGroupValue.ADAPTER.encodedSizeWithTag(9, value.getLayer_group_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetChartSetting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getKey(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getKey());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getBoolean_value());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getChart_type());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getRadio_group_value());
                ChartSettingMultiSelectGroupValue.ADAPTER.encodeWithTag(writer, 8, (int) value.getMulti_select_value());
                ChartSettingLayerGroupValue.ADAPTER.encodeWithTag(writer, 9, (int) value.getLayer_group_value());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetChartSetting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ChartSettingLayerGroupValue.ADAPTER.encodeWithTag(writer, 9, (int) value.getLayer_group_value());
                ChartSettingMultiSelectGroupValue.ADAPTER.encodeWithTag(writer, 8, (int) value.getMulti_select_value());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getRadio_group_value());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getChart_type());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getBoolean_value());
                if (Intrinsics.areEqual(value.getKey(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getKey());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetChartSetting redact(SetChartSetting value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartSettingMultiSelectGroupValue multi_select_value = value.getMulti_select_value();
                ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValueRedact = multi_select_value != null ? ChartSettingMultiSelectGroupValue.ADAPTER.redact(multi_select_value) : null;
                ChartSettingLayerGroupValue layer_group_value = value.getLayer_group_value();
                return SetChartSetting.copy$default(value, null, null, null, null, chartSettingMultiSelectGroupValueRedact, layer_group_value != null ? ChartSettingLayerGroupValue.ADAPTER.redact(layer_group_value) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetChartSetting decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Boolean boolDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                ChartSettingMultiSelectGroupValue chartSettingMultiSelectGroupValueDecode = null;
                ChartSettingLayerGroupValue chartSettingLayerGroupValueDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 5:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                chartSettingMultiSelectGroupValueDecode = ChartSettingMultiSelectGroupValue.ADAPTER.decode(reader);
                                break;
                            case 9:
                                chartSettingLayerGroupValueDecode = ChartSettingLayerGroupValue.ADAPTER.decode(reader);
                                break;
                        }
                    } else {
                        return new SetChartSetting(strDecode, boolDecode, strDecode2, strDecode3, chartSettingMultiSelectGroupValueDecode, chartSettingLayerGroupValueDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
