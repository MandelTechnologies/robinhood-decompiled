package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParamValidationDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterValueDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InputOptionsDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: IndicatorParameterDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;)V", "", "parameter_id_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;", "study_param_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "value", "", "requires_future_calculation", "requires_past_calculation", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "validation_to", "visible", "is_label_param", AnnotatedPrivateKey.LABEL, "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptionsDto;", "input_options", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;", "getParameter_id_value", "getStudy_param_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "getValidation_to", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "getVisible", "()Ljava/lang/Boolean;", "getLabel", "getInput_options", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class IndicatorParameterDto implements Dto3<IndicatorParameter>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndicatorParameterDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndicatorParameterDto, IndicatorParameter>> binaryBase64Serializer$delegate;
    private static final IndicatorParameterDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndicatorParameterDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndicatorParameterDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getParameter_id_value() {
        return this.surrogate.getParameter_id_value();
    }

    public final IndicatorParameterTypeDto getStudy_param_type() {
        return this.surrogate.getStudy_param_type();
    }

    public final IndicatorParameterValueDto getValue() {
        return this.surrogate.getValue();
    }

    public final IndicatorParamValidationDto getValidation_to() {
        return this.surrogate.getValidation_to();
    }

    public final Boolean getVisible() {
        return this.surrogate.getVisible();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final List<InputOptionsDto> getInput_options() {
        return this.surrogate.getInput_options();
    }

    public /* synthetic */ IndicatorParameterDto(String str, IndicatorParameterTypeDto indicatorParameterTypeDto, IndicatorParameterValueDto indicatorParameterValueDto, Boolean bool, Boolean bool2, IndicatorParamValidationDto indicatorParamValidationDto, Boolean bool3, Boolean bool4, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IndicatorParameterTypeDto.INSTANCE.getZeroValue() : indicatorParameterTypeDto, (i & 4) != 0 ? null : indicatorParameterValueDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : indicatorParamValidationDto, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorParameterDto(String parameter_id_value, IndicatorParameterTypeDto study_param_type, IndicatorParameterValueDto indicatorParameterValueDto, Boolean bool, Boolean bool2, IndicatorParamValidationDto indicatorParamValidationDto, Boolean bool3, Boolean bool4, String label, List<InputOptionsDto> input_options) {
        this(new Surrogate(parameter_id_value, study_param_type, indicatorParameterValueDto, bool, bool2, indicatorParamValidationDto, bool3, bool4, label, input_options));
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(study_param_type, "study_param_type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(input_options, "input_options");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IndicatorParameter toProto() {
        String parameter_id_value = this.surrogate.getParameter_id_value();
        IndicatorParameterType indicatorParameterType = (IndicatorParameterType) this.surrogate.getStudy_param_type().toProto();
        IndicatorParameterValueDto value = this.surrogate.getValue();
        IndicatorParameterValue proto = value != null ? value.toProto() : null;
        Boolean requires_future_calculation = this.surrogate.getRequires_future_calculation();
        Boolean requires_past_calculation = this.surrogate.getRequires_past_calculation();
        IndicatorParamValidationDto validation_to = this.surrogate.getValidation_to();
        IndicatorParamValidation proto2 = validation_to != null ? validation_to.toProto() : null;
        Boolean visible = this.surrogate.getVisible();
        Boolean is_label_param = this.surrogate.getIs_label_param();
        String label = this.surrogate.getLabel();
        List<InputOptionsDto> input_options = this.surrogate.getInput_options();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(input_options, 10));
        Iterator<T> it = input_options.iterator();
        while (it.hasNext()) {
            arrayList.add(((InputOptionsDto) it.next()).toProto());
        }
        return new IndicatorParameter(parameter_id_value, indicatorParameterType, proto, requires_future_calculation, requires_past_calculation, proto2, visible, is_label_param, label, arrayList, null, 1024, null);
    }

    public String toString() {
        return "[IndicatorParameterDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndicatorParameterDto) && Intrinsics.areEqual(((IndicatorParameterDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndicatorParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b,\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIB}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00108R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\bA\u0010-\u001a\u0004\b@\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\bB\u0010-\u001a\u0004\b\u000e\u00108R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\bD\u0010-\u001a\u0004\bC\u0010$R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\bH\u0010-\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;", "", "", "parameter_id_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;", "study_param_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "value", "", "requires_future_calculation", "requires_past_calculation", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "validation_to", "visible", "is_label_param", AnnotatedPrivateKey.LABEL, "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptionsDto;", "input_options", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getParameter_id_value", "getParameter_id_value$annotations", "()V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;", "getStudy_param_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterTypeDto;", "getStudy_param_type$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "getValue$annotations", "Ljava/lang/Boolean;", "getRequires_future_calculation", "()Ljava/lang/Boolean;", "getRequires_future_calculation$annotations", "getRequires_past_calculation", "getRequires_past_calculation$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "getValidation_to", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "getValidation_to$annotations", "getVisible", "getVisible$annotations", "is_label_param$annotations", "getLabel", "getLabel$annotations", "Ljava/util/List;", "getInput_options", "()Ljava/util/List;", "getInput_options$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<InputOptionsDto> input_options;
        private final Boolean is_label_param;
        private final String label;
        private final String parameter_id_value;
        private final Boolean requires_future_calculation;
        private final Boolean requires_past_calculation;
        private final IndicatorParameterTypeDto study_param_type;
        private final IndicatorParamValidationDto validation_to;
        private final IndicatorParameterValueDto value;
        private final Boolean visible;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorParameterDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (IndicatorParameterTypeDto) null, (IndicatorParameterValueDto) null, (Boolean) null, (Boolean) null, (IndicatorParamValidationDto) null, (Boolean) null, (Boolean) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InputOptionsDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.parameter_id_value, surrogate.parameter_id_value) && this.study_param_type == surrogate.study_param_type && Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.requires_future_calculation, surrogate.requires_future_calculation) && Intrinsics.areEqual(this.requires_past_calculation, surrogate.requires_past_calculation) && Intrinsics.areEqual(this.validation_to, surrogate.validation_to) && Intrinsics.areEqual(this.visible, surrogate.visible) && Intrinsics.areEqual(this.is_label_param, surrogate.is_label_param) && Intrinsics.areEqual(this.label, surrogate.label) && Intrinsics.areEqual(this.input_options, surrogate.input_options);
        }

        public int hashCode() {
            int iHashCode = ((this.parameter_id_value.hashCode() * 31) + this.study_param_type.hashCode()) * 31;
            IndicatorParameterValueDto indicatorParameterValueDto = this.value;
            int iHashCode2 = (iHashCode + (indicatorParameterValueDto == null ? 0 : indicatorParameterValueDto.hashCode())) * 31;
            Boolean bool = this.requires_future_calculation;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.requires_past_calculation;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            IndicatorParamValidationDto indicatorParamValidationDto = this.validation_to;
            int iHashCode5 = (iHashCode4 + (indicatorParamValidationDto == null ? 0 : indicatorParamValidationDto.hashCode())) * 31;
            Boolean bool3 = this.visible;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.is_label_param;
            return ((((iHashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + this.label.hashCode()) * 31) + this.input_options.hashCode();
        }

        public String toString() {
            return "Surrogate(parameter_id_value=" + this.parameter_id_value + ", study_param_type=" + this.study_param_type + ", value=" + this.value + ", requires_future_calculation=" + this.requires_future_calculation + ", requires_past_calculation=" + this.requires_past_calculation + ", validation_to=" + this.validation_to + ", visible=" + this.visible + ", is_label_param=" + this.is_label_param + ", label=" + this.label + ", input_options=" + this.input_options + ")";
        }

        /* compiled from: IndicatorParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndicatorParameterDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IndicatorParameterTypeDto indicatorParameterTypeDto, IndicatorParameterValueDto indicatorParameterValueDto, Boolean bool, Boolean bool2, IndicatorParamValidationDto indicatorParamValidationDto, Boolean bool3, Boolean bool4, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.parameter_id_value = "";
            } else {
                this.parameter_id_value = str;
            }
            if ((i & 2) == 0) {
                this.study_param_type = IndicatorParameterTypeDto.INSTANCE.getZeroValue();
            } else {
                this.study_param_type = indicatorParameterTypeDto;
            }
            if ((i & 4) == 0) {
                this.value = null;
            } else {
                this.value = indicatorParameterValueDto;
            }
            if ((i & 8) == 0) {
                this.requires_future_calculation = null;
            } else {
                this.requires_future_calculation = bool;
            }
            if ((i & 16) == 0) {
                this.requires_past_calculation = null;
            } else {
                this.requires_past_calculation = bool2;
            }
            if ((i & 32) == 0) {
                this.validation_to = null;
            } else {
                this.validation_to = indicatorParamValidationDto;
            }
            if ((i & 64) == 0) {
                this.visible = null;
            } else {
                this.visible = bool3;
            }
            if ((i & 128) == 0) {
                this.is_label_param = null;
            } else {
                this.is_label_param = bool4;
            }
            if ((i & 256) == 0) {
                this.label = "";
            } else {
                this.label = str2;
            }
            if ((i & 512) == 0) {
                this.input_options = CollectionsKt.emptyList();
            } else {
                this.input_options = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.parameter_id_value, "")) {
                output.encodeStringElement(serialDesc, 0, self.parameter_id_value);
            }
            if (self.study_param_type != IndicatorParameterTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, IndicatorParameterTypeDto.Serializer.INSTANCE, self.study_param_type);
            }
            IndicatorParameterValueDto indicatorParameterValueDto = self.value;
            if (indicatorParameterValueDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IndicatorParameterValueDto.Serializer.INSTANCE, indicatorParameterValueDto);
            }
            Boolean bool = self.requires_future_calculation;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.requires_past_calculation;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool2);
            }
            IndicatorParamValidationDto indicatorParamValidationDto = self.validation_to;
            if (indicatorParamValidationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IndicatorParamValidationDto.Serializer.INSTANCE, indicatorParamValidationDto);
            }
            Boolean bool3 = self.visible;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, bool3);
            }
            Boolean bool4 = self.is_label_param;
            if (bool4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool4);
            }
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 8, self.label);
            }
            if (Intrinsics.areEqual(self.input_options, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.input_options);
        }

        public Surrogate(String parameter_id_value, IndicatorParameterTypeDto study_param_type, IndicatorParameterValueDto indicatorParameterValueDto, Boolean bool, Boolean bool2, IndicatorParamValidationDto indicatorParamValidationDto, Boolean bool3, Boolean bool4, String label, List<InputOptionsDto> input_options) {
            Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
            Intrinsics.checkNotNullParameter(study_param_type, "study_param_type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(input_options, "input_options");
            this.parameter_id_value = parameter_id_value;
            this.study_param_type = study_param_type;
            this.value = indicatorParameterValueDto;
            this.requires_future_calculation = bool;
            this.requires_past_calculation = bool2;
            this.validation_to = indicatorParamValidationDto;
            this.visible = bool3;
            this.is_label_param = bool4;
            this.label = label;
            this.input_options = input_options;
        }

        public /* synthetic */ Surrogate(String str, IndicatorParameterTypeDto indicatorParameterTypeDto, IndicatorParameterValueDto indicatorParameterValueDto, Boolean bool, Boolean bool2, IndicatorParamValidationDto indicatorParamValidationDto, Boolean bool3, Boolean bool4, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IndicatorParameterTypeDto.INSTANCE.getZeroValue() : indicatorParameterTypeDto, (i & 4) != 0 ? null : indicatorParameterValueDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : indicatorParamValidationDto, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getParameter_id_value() {
            return this.parameter_id_value;
        }

        public final IndicatorParameterTypeDto getStudy_param_type() {
            return this.study_param_type;
        }

        public final IndicatorParameterValueDto getValue() {
            return this.value;
        }

        public final Boolean getRequires_future_calculation() {
            return this.requires_future_calculation;
        }

        public final Boolean getRequires_past_calculation() {
            return this.requires_past_calculation;
        }

        public final IndicatorParamValidationDto getValidation_to() {
            return this.validation_to;
        }

        public final Boolean getVisible() {
            return this.visible;
        }

        /* renamed from: is_label_param, reason: from getter */
        public final Boolean getIs_label_param() {
            return this.is_label_param;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<InputOptionsDto> getInput_options() {
            return this.input_options;
        }
    }

    /* compiled from: IndicatorParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IndicatorParameterDto, IndicatorParameter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicatorParameterDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParameterDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParameterDto> getBinaryBase64Serializer() {
            return (KSerializer) IndicatorParameterDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndicatorParameter> getProtoAdapter() {
            return IndicatorParameter.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParameterDto getZeroValue() {
            return IndicatorParameterDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParameterDto fromProto(IndicatorParameter proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String parameter_id_value = proto.getParameter_id_value();
            IndicatorParameterTypeDto indicatorParameterTypeDtoFromProto = IndicatorParameterTypeDto.INSTANCE.fromProto(proto.getStudy_param_type());
            IndicatorParameterValue value = proto.getValue();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IndicatorParameterValueDto indicatorParameterValueDtoFromProto = value != null ? IndicatorParameterValueDto.INSTANCE.fromProto(value) : null;
            Boolean requires_future_calculation = proto.getRequires_future_calculation();
            Boolean requires_past_calculation = proto.getRequires_past_calculation();
            IndicatorParamValidation validation_to = proto.getValidation_to();
            IndicatorParamValidationDto indicatorParamValidationDtoFromProto = validation_to != null ? IndicatorParamValidationDto.INSTANCE.fromProto(validation_to) : null;
            Boolean visible = proto.getVisible();
            Boolean is_label_param = proto.getIs_label_param();
            String label = proto.getLabel();
            List<InputOptions> input_options = proto.getInput_options();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(input_options, 10));
            Iterator<T> it = input_options.iterator();
            while (it.hasNext()) {
                arrayList.add(InputOptionsDto.INSTANCE.fromProto((InputOptions) it.next()));
            }
            return new IndicatorParameterDto(new Surrogate(parameter_id_value, indicatorParameterTypeDtoFromProto, indicatorParameterValueDtoFromProto, requires_future_calculation, requires_past_calculation, indicatorParamValidationDtoFromProto, visible, is_label_param, label, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorParameterDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new IndicatorParameterDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndicatorParameterDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndicatorParameterDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameter", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndicatorParameterDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndicatorParameterDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndicatorParameterDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndicatorParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterDto";
        }
    }
}
