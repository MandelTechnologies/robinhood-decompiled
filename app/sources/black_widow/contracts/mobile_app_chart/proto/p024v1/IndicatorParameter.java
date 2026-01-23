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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: IndicatorParameter.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u00100R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000f\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00062"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "Lcom/squareup/wire/Message;", "", "parameter_id_value", "", "study_param_type", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;", "value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "requires_future_calculation", "", "requires_past_calculation", "validation_to", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "visible", "is_label_param", AnnotatedPrivateKey.LABEL, "input_options", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptions;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;Ljava/lang/Boolean;Ljava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getParameter_id_value", "()Ljava/lang/String;", "getStudy_param_type", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "getRequires_future_calculation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRequires_past_calculation", "getValidation_to", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "getVisible", "getLabel", "getInput_options", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;Ljava/lang/Boolean;Ljava/lang/Boolean;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameter;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorParameter extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorParameter> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.InputOptions#ADAPTER", jsonName = "inputOptions", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<InputOptions> input_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLabelParam", schemaIndex = 7, tag = 8)
    private final Boolean is_label_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parameterIdValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 11)
    private final String parameter_id_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requiresFutureCalculation", schemaIndex = 3, tag = 4)
    private final Boolean requires_future_calculation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requiresPastCalculation", schemaIndex = 4, tag = 5)
    private final Boolean requires_past_calculation;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterType#ADAPTER", jsonName = "studyParamType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IndicatorParameterType study_param_type;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParamValidation#ADAPTER", jsonName = "validationTo", schemaIndex = 5, tag = 6)
    private final IndicatorParamValidation validation_to;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValue#ADAPTER", schemaIndex = 2, tag = 3)
    private final IndicatorParameterValue value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    private final Boolean visible;

    public IndicatorParameter() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ IndicatorParameter(String str, IndicatorParameterType indicatorParameterType, IndicatorParameterValue indicatorParameterValue, Boolean bool, Boolean bool2, IndicatorParamValidation indicatorParamValidation, Boolean bool3, Boolean bool4, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED : indicatorParameterType, (i & 4) != 0 ? null : indicatorParameterValue, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : indicatorParamValidation, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8606newBuilder();
    }

    public final String getParameter_id_value() {
        return this.parameter_id_value;
    }

    public final IndicatorParameterType getStudy_param_type() {
        return this.study_param_type;
    }

    public final IndicatorParameterValue getValue() {
        return this.value;
    }

    public final Boolean getRequires_future_calculation() {
        return this.requires_future_calculation;
    }

    public final Boolean getRequires_past_calculation() {
        return this.requires_past_calculation;
    }

    public final IndicatorParamValidation getValidation_to() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorParameter(String parameter_id_value, IndicatorParameterType study_param_type, IndicatorParameterValue indicatorParameterValue, Boolean bool, Boolean bool2, IndicatorParamValidation indicatorParamValidation, Boolean bool3, Boolean bool4, String label, List<InputOptions> input_options, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(study_param_type, "study_param_type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(input_options, "input_options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.parameter_id_value = parameter_id_value;
        this.study_param_type = study_param_type;
        this.value = indicatorParameterValue;
        this.requires_future_calculation = bool;
        this.requires_past_calculation = bool2;
        this.validation_to = indicatorParamValidation;
        this.visible = bool3;
        this.is_label_param = bool4;
        this.label = label;
        this.input_options = Internal.immutableCopyOf("input_options", input_options);
    }

    public final List<InputOptions> getInput_options() {
        return this.input_options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8606newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorParameter)) {
            return false;
        }
        IndicatorParameter indicatorParameter = (IndicatorParameter) other;
        return Intrinsics.areEqual(unknownFields(), indicatorParameter.unknownFields()) && Intrinsics.areEqual(this.parameter_id_value, indicatorParameter.parameter_id_value) && this.study_param_type == indicatorParameter.study_param_type && Intrinsics.areEqual(this.value, indicatorParameter.value) && Intrinsics.areEqual(this.requires_future_calculation, indicatorParameter.requires_future_calculation) && Intrinsics.areEqual(this.requires_past_calculation, indicatorParameter.requires_past_calculation) && Intrinsics.areEqual(this.validation_to, indicatorParameter.validation_to) && Intrinsics.areEqual(this.visible, indicatorParameter.visible) && Intrinsics.areEqual(this.is_label_param, indicatorParameter.is_label_param) && Intrinsics.areEqual(this.label, indicatorParameter.label) && Intrinsics.areEqual(this.input_options, indicatorParameter.input_options);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.parameter_id_value.hashCode()) * 37) + this.study_param_type.hashCode()) * 37;
        IndicatorParameterValue indicatorParameterValue = this.value;
        int iHashCode2 = (iHashCode + (indicatorParameterValue != null ? indicatorParameterValue.hashCode() : 0)) * 37;
        Boolean bool = this.requires_future_calculation;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.requires_past_calculation;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        IndicatorParamValidation indicatorParamValidation = this.validation_to;
        int iHashCode5 = (iHashCode4 + (indicatorParamValidation != null ? indicatorParamValidation.hashCode() : 0)) * 37;
        Boolean bool3 = this.visible;
        int iHashCode6 = (iHashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.is_label_param;
        int iHashCode7 = ((((iHashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 37) + this.label.hashCode()) * 37) + this.input_options.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("parameter_id_value=" + Internal.sanitize(this.parameter_id_value));
        arrayList.add("study_param_type=" + this.study_param_type);
        IndicatorParameterValue indicatorParameterValue = this.value;
        if (indicatorParameterValue != null) {
            arrayList.add("value=" + indicatorParameterValue);
        }
        Boolean bool = this.requires_future_calculation;
        if (bool != null) {
            arrayList.add("requires_future_calculation=" + bool);
        }
        Boolean bool2 = this.requires_past_calculation;
        if (bool2 != null) {
            arrayList.add("requires_past_calculation=" + bool2);
        }
        IndicatorParamValidation indicatorParamValidation = this.validation_to;
        if (indicatorParamValidation != null) {
            arrayList.add("validation_to=" + indicatorParamValidation);
        }
        Boolean bool3 = this.visible;
        if (bool3 != null) {
            arrayList.add("visible=" + bool3);
        }
        Boolean bool4 = this.is_label_param;
        if (bool4 != null) {
            arrayList.add("is_label_param=" + bool4);
        }
        arrayList.add("label=" + Internal.sanitize(this.label));
        if (!this.input_options.isEmpty()) {
            arrayList.add("input_options=" + this.input_options);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorParameter{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IndicatorParameter copy$default(IndicatorParameter indicatorParameter, String str, IndicatorParameterType indicatorParameterType, IndicatorParameterValue indicatorParameterValue, Boolean bool, Boolean bool2, IndicatorParamValidation indicatorParamValidation, Boolean bool3, Boolean bool4, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorParameter.parameter_id_value;
        }
        if ((i & 2) != 0) {
            indicatorParameterType = indicatorParameter.study_param_type;
        }
        if ((i & 4) != 0) {
            indicatorParameterValue = indicatorParameter.value;
        }
        if ((i & 8) != 0) {
            bool = indicatorParameter.requires_future_calculation;
        }
        if ((i & 16) != 0) {
            bool2 = indicatorParameter.requires_past_calculation;
        }
        if ((i & 32) != 0) {
            indicatorParamValidation = indicatorParameter.validation_to;
        }
        if ((i & 64) != 0) {
            bool3 = indicatorParameter.visible;
        }
        if ((i & 128) != 0) {
            bool4 = indicatorParameter.is_label_param;
        }
        if ((i & 256) != 0) {
            str2 = indicatorParameter.label;
        }
        if ((i & 512) != 0) {
            list = indicatorParameter.input_options;
        }
        if ((i & 1024) != 0) {
            byteString = indicatorParameter.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        Boolean bool5 = bool4;
        String str3 = str2;
        IndicatorParamValidation indicatorParamValidation2 = indicatorParamValidation;
        Boolean bool6 = bool3;
        Boolean bool7 = bool2;
        IndicatorParameterValue indicatorParameterValue2 = indicatorParameterValue;
        return indicatorParameter.copy(str, indicatorParameterType, indicatorParameterValue2, bool, bool7, indicatorParamValidation2, bool6, bool5, str3, list2, byteString2);
    }

    public final IndicatorParameter copy(String parameter_id_value, IndicatorParameterType study_param_type, IndicatorParameterValue value, Boolean requires_future_calculation, Boolean requires_past_calculation, IndicatorParamValidation validation_to, Boolean visible, Boolean is_label_param, String label, List<InputOptions> input_options, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(parameter_id_value, "parameter_id_value");
        Intrinsics.checkNotNullParameter(study_param_type, "study_param_type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(input_options, "input_options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorParameter(parameter_id_value, study_param_type, value, requires_future_calculation, requires_past_calculation, validation_to, visible, is_label_param, label, input_options, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorParameter.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorParameter>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameter$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorParameter value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getParameter_id_value());
                }
                if (value.getStudy_param_type() != IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED) {
                    size += IndicatorParameterType.ADAPTER.encodedSizeWithTag(2, value.getStudy_param_type());
                }
                int iEncodedSizeWithTag = size + IndicatorParameterValue.ADAPTER.encodedSizeWithTag(3, value.getValue());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getRequires_future_calculation()) + protoAdapter.encodedSizeWithTag(5, value.getRequires_past_calculation()) + IndicatorParamValidation.ADAPTER.encodedSizeWithTag(6, value.getValidation_to()) + protoAdapter.encodedSizeWithTag(7, value.getVisible()) + protoAdapter.encodedSizeWithTag(8, value.getIs_label_param());
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getLabel());
                }
                return iEncodedSizeWithTag2 + InputOptions.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getInput_options());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorParameter value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getParameter_id_value());
                }
                if (value.getStudy_param_type() != IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED) {
                    IndicatorParameterType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStudy_param_type());
                }
                IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 3, (int) value.getValue());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getRequires_future_calculation());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getRequires_past_calculation());
                IndicatorParamValidation.ADAPTER.encodeWithTag(writer, 6, (int) value.getValidation_to());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getVisible());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getIs_label_param());
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLabel());
                }
                InputOptions.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getInput_options());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorParameter value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InputOptions.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getInput_options());
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLabel());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getIs_label_param());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getVisible());
                IndicatorParamValidation.ADAPTER.encodeWithTag(writer, 6, (int) value.getValidation_to());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getRequires_past_calculation());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getRequires_future_calculation());
                IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 3, (int) value.getValue());
                if (value.getStudy_param_type() != IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED) {
                    IndicatorParameterType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStudy_param_type());
                }
                if (Intrinsics.areEqual(value.getParameter_id_value(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getParameter_id_value());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParameter decode(ProtoReader reader) throws IOException {
                IndicatorParameterType indicatorParameterType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                IndicatorParameterType indicatorParameterType2 = IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IndicatorParameterValue indicatorParameterValueDecode = null;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                IndicatorParamValidation indicatorParamValidationDecode = null;
                Boolean boolDecode3 = null;
                Boolean boolDecode4 = null;
                IndicatorParameterType indicatorParameterTypeDecode = indicatorParameterType2;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 2:
                                try {
                                    indicatorParameterTypeDecode = IndicatorParameterType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    indicatorParameterType = indicatorParameterTypeDecode;
                                    str = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                indicatorParameterValueDecode = IndicatorParameterValue.ADAPTER.decode(reader);
                                break;
                            case 4:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                indicatorParamValidationDecode = IndicatorParamValidation.ADAPTER.decode(reader);
                                break;
                            case 7:
                                boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 8:
                                boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                arrayList.add(InputOptions.ADAPTER.decode(reader));
                                indicatorParameterType = indicatorParameterTypeDecode;
                                str = strDecode2;
                                strDecode2 = str;
                                indicatorParameterTypeDecode = indicatorParameterType;
                                break;
                            case 11:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                indicatorParameterType = indicatorParameterTypeDecode;
                                str = strDecode2;
                                strDecode2 = str;
                                indicatorParameterTypeDecode = indicatorParameterType;
                                break;
                        }
                    } else {
                        return new IndicatorParameter(strDecode2, indicatorParameterTypeDecode, indicatorParameterValueDecode, boolDecode, boolDecode2, indicatorParamValidationDecode, boolDecode3, boolDecode4, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParameter redact(IndicatorParameter value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorParameterValue value2 = value.getValue();
                IndicatorParameterValue indicatorParameterValueRedact = value2 != null ? IndicatorParameterValue.ADAPTER.redact(value2) : null;
                IndicatorParamValidation validation_to = value.getValidation_to();
                return IndicatorParameter.copy$default(value, null, null, indicatorParameterValueRedact, null, null, validation_to != null ? IndicatorParamValidation.ADAPTER.redact(validation_to) : null, null, null, null, Internal.m26823redactElements(value.getInput_options(), InputOptions.ADAPTER), ByteString.EMPTY, 475, null);
            }
        };
    }
}
