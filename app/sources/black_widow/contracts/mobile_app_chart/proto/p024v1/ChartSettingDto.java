package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingChartTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingLayerGroupDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingMultiSelectGroupDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingRadioGroupDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChartSettingDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;)V", "", "key", AnnotatedPrivateKey.LABEL, "", "is_enabled", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "value", "(Ljava/lang/String;Ljava/lang/String;ZLblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;", "getKey", "getLabel", "()Z", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getNested_section", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "nested_section", "Companion", "Surrogate", "ValueDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class ChartSettingDto implements Dto3<ChartSetting>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartSettingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartSettingDto, ChartSetting>> binaryBase64Serializer$delegate;
    private static final ChartSettingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartSettingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartSettingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getKey() {
        return this.surrogate.getKey();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final boolean is_enabled() {
        return this.surrogate.getIs_enabled();
    }

    public final ValueDto getValue() {
        if (this.surrogate.getBoolean_value() != null) {
            return new ValueDto.BooleanValue(this.surrogate.getBoolean_value().booleanValue());
        }
        if (this.surrogate.getChart_type() != null) {
            return new ValueDto.ChartType(this.surrogate.getChart_type());
        }
        if (this.surrogate.getNested_section() != null) {
            return new ValueDto.NestedSection(this.surrogate.getNested_section());
        }
        if (this.surrogate.getRadio_group() != null) {
            return new ValueDto.RadioGroup(this.surrogate.getRadio_group());
        }
        if (this.surrogate.getMulti_select_group() != null) {
            return new ValueDto.MultiSelectGroup(this.surrogate.getMulti_select_group());
        }
        if (this.surrogate.getTrading_section() != null) {
            return ValueDto.TradingSection.INSTANCE;
        }
        if (this.surrogate.getLayer_group() != null) {
            return new ValueDto.LayerGroup(this.surrogate.getLayer_group());
        }
        return null;
    }

    public final ChartSettingSectionDto getNested_section() {
        return this.surrogate.getNested_section();
    }

    public /* synthetic */ ChartSettingDto(String str, String str2, boolean z, ValueDto valueDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : valueDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChartSettingDto(String key, String label, boolean z, ValueDto valueDto) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        ValueDto.BooleanValue booleanValue = valueDto instanceof ValueDto.BooleanValue ? (ValueDto.BooleanValue) valueDto : null;
        Boolean boolValueOf = booleanValue != null ? Boolean.valueOf(booleanValue.getValue()) : null;
        ValueDto.ChartType chartType = valueDto instanceof ValueDto.ChartType ? (ValueDto.ChartType) valueDto : null;
        ChartSettingChartTypeDto value = chartType != null ? chartType.getValue() : null;
        ValueDto.NestedSection nestedSection = valueDto instanceof ValueDto.NestedSection ? (ValueDto.NestedSection) valueDto : null;
        ChartSettingSectionDto value2 = nestedSection != null ? nestedSection.getValue() : null;
        ValueDto.RadioGroup radioGroup = valueDto instanceof ValueDto.RadioGroup ? (ValueDto.RadioGroup) valueDto : null;
        ChartSettingRadioGroupDto value3 = radioGroup != null ? radioGroup.getValue() : null;
        ValueDto.MultiSelectGroup multiSelectGroup = valueDto instanceof ValueDto.MultiSelectGroup ? (ValueDto.MultiSelectGroup) valueDto : null;
        ChartSettingMultiSelectGroupDto value4 = multiSelectGroup != null ? multiSelectGroup.getValue() : null;
        Unit unit = valueDto instanceof ValueDto.TradingSection ? Unit.INSTANCE : null;
        ValueDto.LayerGroup layerGroup = valueDto instanceof ValueDto.LayerGroup ? (ValueDto.LayerGroup) valueDto : null;
        this(new Surrogate(key, label, z, boolValueOf, value, value2, value3, value4, unit, layerGroup != null ? layerGroup.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public ChartSetting toProto() {
        String key = this.surrogate.getKey();
        String label = this.surrogate.getLabel();
        boolean is_enabled = this.surrogate.getIs_enabled();
        Boolean boolean_value = this.surrogate.getBoolean_value();
        ChartSettingChartTypeDto chart_type = this.surrogate.getChart_type();
        ChartSettingChartType proto = chart_type != null ? chart_type.toProto() : null;
        ChartSettingSectionDto nested_section = this.surrogate.getNested_section();
        ChartSettingSection proto2 = nested_section != null ? nested_section.toProto() : null;
        ChartSettingRadioGroupDto radio_group = this.surrogate.getRadio_group();
        ChartSettingRadioGroup proto3 = radio_group != null ? radio_group.toProto() : null;
        ChartSettingMultiSelectGroupDto multi_select_group = this.surrogate.getMulti_select_group();
        ChartSettingMultiSelectGroup proto4 = multi_select_group != null ? multi_select_group.toProto() : null;
        Unit trading_section = this.surrogate.getTrading_section();
        ChartSettingLayerGroupDto layer_group = this.surrogate.getLayer_group();
        return new ChartSetting(key, label, is_enabled, boolean_value, proto, proto2, proto3, proto4, trading_section, layer_group != null ? layer_group.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[ChartSettingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartSettingDto) && Intrinsics.areEqual(((ChartSettingDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartSettingDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POBy\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010\"\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b\u0006\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010-\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b:\u0010-\u001a\u0004\b8\u00109R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010AR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\bF\u0010-\u001a\u0004\bD\u0010ER\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bJ\u0010-\u001a\u0004\bH\u0010IR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010K\u0012\u0004\bN\u0010-\u001a\u0004\bL\u0010M¨\u0006Q"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;", "", "", "key", AnnotatedPrivateKey.LABEL, "", "is_enabled", "boolean_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "chart_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "nested_section", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "radio_group", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "multi_select_group", "", "trading_section", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "layer_group", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;Lkotlin/Unit;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;Lkotlin/Unit;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getLabel", "getLabel$annotations", "Z", "()Z", "is_enabled$annotations", "Ljava/lang/Boolean;", "getBoolean_value", "()Ljava/lang/Boolean;", "getBoolean_value$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "getChart_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "getChart_type$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getNested_section", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getNested_section$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "getRadio_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "getRadio_group$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "getMulti_select_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "getMulti_select_group$annotations", "Lkotlin/Unit;", "getTrading_section", "()Lkotlin/Unit;", "getTrading_section$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "getLayer_group", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "getLayer_group$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean boolean_value;
        private final ChartSettingChartTypeDto chart_type;
        private final boolean is_enabled;
        private final String key;
        private final String label;
        private final ChartSettingLayerGroupDto layer_group;
        private final ChartSettingMultiSelectGroupDto multi_select_group;
        private final ChartSettingSectionDto nested_section;
        private final ChartSettingRadioGroupDto radio_group;
        private final Unit trading_section;

        public Surrogate() {
            this((String) null, (String) null, false, (Boolean) null, (ChartSettingChartTypeDto) null, (ChartSettingSectionDto) null, (ChartSettingRadioGroupDto) null, (ChartSettingMultiSelectGroupDto) null, (Unit) null, (ChartSettingLayerGroupDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.key, surrogate.key) && Intrinsics.areEqual(this.label, surrogate.label) && this.is_enabled == surrogate.is_enabled && Intrinsics.areEqual(this.boolean_value, surrogate.boolean_value) && Intrinsics.areEqual(this.chart_type, surrogate.chart_type) && Intrinsics.areEqual(this.nested_section, surrogate.nested_section) && Intrinsics.areEqual(this.radio_group, surrogate.radio_group) && Intrinsics.areEqual(this.multi_select_group, surrogate.multi_select_group) && Intrinsics.areEqual(this.trading_section, surrogate.trading_section) && Intrinsics.areEqual(this.layer_group, surrogate.layer_group);
        }

        public int hashCode() {
            int iHashCode = ((((this.key.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.is_enabled)) * 31;
            Boolean bool = this.boolean_value;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ChartSettingChartTypeDto chartSettingChartTypeDto = this.chart_type;
            int iHashCode3 = (iHashCode2 + (chartSettingChartTypeDto == null ? 0 : chartSettingChartTypeDto.hashCode())) * 31;
            ChartSettingSectionDto chartSettingSectionDto = this.nested_section;
            int iHashCode4 = (iHashCode3 + (chartSettingSectionDto == null ? 0 : chartSettingSectionDto.hashCode())) * 31;
            ChartSettingRadioGroupDto chartSettingRadioGroupDto = this.radio_group;
            int iHashCode5 = (iHashCode4 + (chartSettingRadioGroupDto == null ? 0 : chartSettingRadioGroupDto.hashCode())) * 31;
            ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDto = this.multi_select_group;
            int iHashCode6 = (iHashCode5 + (chartSettingMultiSelectGroupDto == null ? 0 : chartSettingMultiSelectGroupDto.hashCode())) * 31;
            Unit unit = this.trading_section;
            int iHashCode7 = (iHashCode6 + (unit == null ? 0 : unit.hashCode())) * 31;
            ChartSettingLayerGroupDto chartSettingLayerGroupDto = this.layer_group;
            return iHashCode7 + (chartSettingLayerGroupDto != null ? chartSettingLayerGroupDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(key=" + this.key + ", label=" + this.label + ", is_enabled=" + this.is_enabled + ", boolean_value=" + this.boolean_value + ", chart_type=" + this.chart_type + ", nested_section=" + this.nested_section + ", radio_group=" + this.radio_group + ", multi_select_group=" + this.multi_select_group + ", trading_section=" + this.trading_section + ", layer_group=" + this.layer_group + ")";
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartSettingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, Boolean bool, ChartSettingChartTypeDto chartSettingChartTypeDto, ChartSettingSectionDto chartSettingSectionDto, ChartSettingRadioGroupDto chartSettingRadioGroupDto, ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDto, Unit unit, ChartSettingLayerGroupDto chartSettingLayerGroupDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.key = "";
            } else {
                this.key = str;
            }
            if ((i & 2) == 0) {
                this.label = "";
            } else {
                this.label = str2;
            }
            if ((i & 4) == 0) {
                this.is_enabled = false;
            } else {
                this.is_enabled = z;
            }
            if ((i & 8) == 0) {
                this.boolean_value = null;
            } else {
                this.boolean_value = bool;
            }
            if ((i & 16) == 0) {
                this.chart_type = null;
            } else {
                this.chart_type = chartSettingChartTypeDto;
            }
            if ((i & 32) == 0) {
                this.nested_section = null;
            } else {
                this.nested_section = chartSettingSectionDto;
            }
            if ((i & 64) == 0) {
                this.radio_group = null;
            } else {
                this.radio_group = chartSettingRadioGroupDto;
            }
            if ((i & 128) == 0) {
                this.multi_select_group = null;
            } else {
                this.multi_select_group = chartSettingMultiSelectGroupDto;
            }
            if ((i & 256) == 0) {
                this.trading_section = null;
            } else {
                this.trading_section = unit;
            }
            if ((i & 512) == 0) {
                this.layer_group = null;
            } else {
                this.layer_group = chartSettingLayerGroupDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.key, "")) {
                output.encodeStringElement(serialDesc, 0, self.key);
            }
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 1, self.label);
            }
            boolean z = self.is_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            Boolean bool = self.boolean_value;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool);
            }
            ChartSettingChartTypeDto chartSettingChartTypeDto = self.chart_type;
            if (chartSettingChartTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ChartSettingChartTypeDto.Serializer.INSTANCE, chartSettingChartTypeDto);
            }
            ChartSettingSectionDto chartSettingSectionDto = self.nested_section;
            if (chartSettingSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ChartSettingSectionDto.Serializer.INSTANCE, chartSettingSectionDto);
            }
            ChartSettingRadioGroupDto chartSettingRadioGroupDto = self.radio_group;
            if (chartSettingRadioGroupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ChartSettingRadioGroupDto.Serializer.INSTANCE, chartSettingRadioGroupDto);
            }
            ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDto = self.multi_select_group;
            if (chartSettingMultiSelectGroupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ChartSettingMultiSelectGroupDto.Serializer.INSTANCE, chartSettingMultiSelectGroupDto);
            }
            Unit unit = self.trading_section;
            if (unit != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, UnitSerializer.INSTANCE, unit);
            }
            ChartSettingLayerGroupDto chartSettingLayerGroupDto = self.layer_group;
            if (chartSettingLayerGroupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ChartSettingLayerGroupDto.Serializer.INSTANCE, chartSettingLayerGroupDto);
            }
        }

        public Surrogate(String key, String label, boolean z, Boolean bool, ChartSettingChartTypeDto chartSettingChartTypeDto, ChartSettingSectionDto chartSettingSectionDto, ChartSettingRadioGroupDto chartSettingRadioGroupDto, ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDto, Unit unit, ChartSettingLayerGroupDto chartSettingLayerGroupDto) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            this.key = key;
            this.label = label;
            this.is_enabled = z;
            this.boolean_value = bool;
            this.chart_type = chartSettingChartTypeDto;
            this.nested_section = chartSettingSectionDto;
            this.radio_group = chartSettingRadioGroupDto;
            this.multi_select_group = chartSettingMultiSelectGroupDto;
            this.trading_section = unit;
            this.layer_group = chartSettingLayerGroupDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, Boolean bool, ChartSettingChartTypeDto chartSettingChartTypeDto, ChartSettingSectionDto chartSettingSectionDto, ChartSettingRadioGroupDto chartSettingRadioGroupDto, ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDto, Unit unit, ChartSettingLayerGroupDto chartSettingLayerGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : chartSettingChartTypeDto, (i & 32) != 0 ? null : chartSettingSectionDto, (i & 64) != 0 ? null : chartSettingRadioGroupDto, (i & 128) != 0 ? null : chartSettingMultiSelectGroupDto, (i & 256) != 0 ? null : unit, (i & 512) != 0 ? null : chartSettingLayerGroupDto);
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

        public final ChartSettingChartTypeDto getChart_type() {
            return this.chart_type;
        }

        public final ChartSettingSectionDto getNested_section() {
            return this.nested_section;
        }

        public final ChartSettingRadioGroupDto getRadio_group() {
            return this.radio_group;
        }

        public final ChartSettingMultiSelectGroupDto getMulti_select_group() {
            return this.multi_select_group;
        }

        public final Unit getTrading_section() {
            return this.trading_section;
        }

        public final ChartSettingLayerGroupDto getLayer_group() {
            return this.layer_group;
        }
    }

    /* compiled from: ChartSettingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartSettingDto, ChartSetting> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartSettingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartSettingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartSettingDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartSettingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartSetting> getProtoAdapter() {
            return ChartSetting.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartSettingDto getZeroValue() {
            return ChartSettingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartSettingDto fromProto(ChartSetting proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String key = proto.getKey();
            String label = proto.getLabel();
            boolean is_enabled = proto.getIs_enabled();
            Boolean boolean_value = proto.getBoolean_value();
            ChartSettingChartType chart_type = proto.getChart_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ChartSettingChartTypeDto chartSettingChartTypeDtoFromProto = chart_type != null ? ChartSettingChartTypeDto.INSTANCE.fromProto(chart_type) : null;
            ChartSettingSection nested_section = proto.getNested_section();
            ChartSettingSectionDto chartSettingSectionDtoFromProto = nested_section != null ? ChartSettingSectionDto.INSTANCE.fromProto(nested_section) : null;
            ChartSettingRadioGroup radio_group = proto.getRadio_group();
            ChartSettingRadioGroupDto chartSettingRadioGroupDtoFromProto = radio_group != null ? ChartSettingRadioGroupDto.INSTANCE.fromProto(radio_group) : null;
            ChartSettingMultiSelectGroup multi_select_group = proto.getMulti_select_group();
            ChartSettingMultiSelectGroupDto chartSettingMultiSelectGroupDtoFromProto = multi_select_group != null ? ChartSettingMultiSelectGroupDto.INSTANCE.fromProto(multi_select_group) : null;
            Unit trading_section = proto.getTrading_section();
            ChartSettingLayerGroup layer_group = proto.getLayer_group();
            return new ChartSettingDto(new Surrogate(key, label, is_enabled, boolean_value, chartSettingChartTypeDtoFromProto, chartSettingSectionDtoFromProto, chartSettingRadioGroupDtoFromProto, chartSettingMultiSelectGroupDtoFromProto, trading_section, layer_group != null ? ChartSettingLayerGroupDto.INSTANCE.fromProto(layer_group) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartSettingDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChartSettingDto(null, null, false, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartSettingDto.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "BooleanValue", "ChartType", "NestedSection", "RadioGroup", "MultiSelectGroup", "TradingSection", "LayerGroup", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$BooleanValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$ChartType;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$LayerGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$MultiSelectGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$NestedSection;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$RadioGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$TradingSection;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ValueDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ValueDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValueDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$BooleanValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "", "value", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValue", "()Z", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BooleanValue extends ValueDto {
            private final boolean value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BooleanValue) && this.value == ((BooleanValue) other).value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return "BooleanValue(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public BooleanValue(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$ChartType;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartTypeDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ChartType extends ValueDto {
            private final ChartSettingChartTypeDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChartType) && Intrinsics.areEqual(this.value, ((ChartType) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChartType(value=" + this.value + ")";
            }

            public final ChartSettingChartTypeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChartType(ChartSettingChartTypeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$NestedSection;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NestedSection extends ValueDto {
            private final ChartSettingSectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NestedSection) && Intrinsics.areEqual(this.value, ((NestedSection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NestedSection(value=" + this.value + ")";
            }

            public final ChartSettingSectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NestedSection(ChartSettingSectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$RadioGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroupDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RadioGroup extends ValueDto {
            private final ChartSettingRadioGroupDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RadioGroup) && Intrinsics.areEqual(this.value, ((RadioGroup) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RadioGroup(value=" + this.value + ")";
            }

            public final ChartSettingRadioGroupDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RadioGroup(ChartSettingRadioGroupDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$MultiSelectGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroupDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MultiSelectGroup extends ValueDto {
            private final ChartSettingMultiSelectGroupDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MultiSelectGroup) && Intrinsics.areEqual(this.value, ((MultiSelectGroup) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MultiSelectGroup(value=" + this.value + ")";
            }

            public final ChartSettingMultiSelectGroupDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiSelectGroup(ChartSettingMultiSelectGroupDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$TradingSection;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TradingSection extends ValueDto {
            public static final TradingSection INSTANCE = new TradingSection();

            public boolean equals(Object other) {
                return this == other || (other instanceof TradingSection);
            }

            public int hashCode() {
                return -1637625952;
            }

            public String toString() {
                return "TradingSection";
            }

            private TradingSection() {
                super(null);
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$LayerGroup;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingLayerGroupDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LayerGroup extends ValueDto {
            private final ChartSettingLayerGroupDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LayerGroup) && Intrinsics.areEqual(this.value, ((LayerGroup) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LayerGroup(value=" + this.value + ")";
            }

            public final ChartSettingLayerGroupDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LayerGroup(ChartSettingLayerGroupDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartSettingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSetting;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ValueDto, ChartSetting> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartSetting> getProtoAdapter() {
                return ChartSetting.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValueDto fromProto(ChartSetting proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getBoolean_value() != null) {
                    return new BooleanValue(proto.getBoolean_value().booleanValue());
                }
                if (proto.getChart_type() != null) {
                    return new ChartType(ChartSettingChartTypeDto.INSTANCE.fromProto(proto.getChart_type()));
                }
                if (proto.getNested_section() != null) {
                    return new NestedSection(ChartSettingSectionDto.INSTANCE.fromProto(proto.getNested_section()));
                }
                if (proto.getRadio_group() != null) {
                    return new RadioGroup(ChartSettingRadioGroupDto.INSTANCE.fromProto(proto.getRadio_group()));
                }
                if (proto.getMulti_select_group() != null) {
                    return new MultiSelectGroup(ChartSettingMultiSelectGroupDto.INSTANCE.fromProto(proto.getMulti_select_group()));
                }
                if (proto.getTrading_section() != null) {
                    return TradingSection.INSTANCE;
                }
                if (proto.getLayer_group() != null) {
                    return new LayerGroup(ChartSettingLayerGroupDto.INSTANCE.fromProto(proto.getLayer_group()));
                }
                return null;
            }
        }
    }

    /* compiled from: ChartSettingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartSettingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.ChartSetting", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartSettingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartSettingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartSettingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartSettingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingDto";
        }
    }
}
