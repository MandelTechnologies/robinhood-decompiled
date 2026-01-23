package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: IndicatorParameterValueDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010#\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000f¨\u0006)"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "value", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "getString_value", "string_value", "Companion", "Surrogate", "ValueDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IndicatorParameterValueDto implements Dto3<IndicatorParameterValue>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndicatorParameterValueDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndicatorParameterValueDto, IndicatorParameterValue>> binaryBase64Serializer$delegate;
    private static final IndicatorParameterValueDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndicatorParameterValueDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndicatorParameterValueDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ValueDto getValue() {
        if (this.surrogate.getString_value() != null) {
            return new ValueDto.StringValue(this.surrogate.getString_value());
        }
        if (this.surrogate.getNumber_value() != null) {
            return new ValueDto.NumberValue(this.surrogate.getNumber_value().doubleValue());
        }
        if (this.surrogate.getBool_value() != null) {
            return new ValueDto.BoolValue(this.surrogate.getBool_value().booleanValue());
        }
        return null;
    }

    public final String getString_value() {
        return this.surrogate.getString_value();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IndicatorParameterValueDto(ValueDto valueDto) {
        ValueDto.StringValue stringValue = valueDto instanceof ValueDto.StringValue ? (ValueDto.StringValue) valueDto : null;
        String value = stringValue != null ? stringValue.getValue() : null;
        ValueDto.NumberValue numberValue = valueDto instanceof ValueDto.NumberValue ? (ValueDto.NumberValue) valueDto : null;
        Double dValueOf = numberValue != null ? Double.valueOf(numberValue.getValue()) : null;
        ValueDto.BoolValue boolValue = valueDto instanceof ValueDto.BoolValue ? (ValueDto.BoolValue) valueDto : null;
        this(new Surrogate(value, dValueOf, boolValue != null ? Boolean.valueOf(boolValue.getValue()) : null));
    }

    public /* synthetic */ IndicatorParameterValueDto(ValueDto valueDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : valueDto);
    }

    @Override // com.robinhood.idl.Dto
    public IndicatorParameterValue toProto() {
        return new IndicatorParameterValue(this.surrogate.getString_value(), this.surrogate.getNumber_value(), this.surrogate.getBool_value(), null, 8, null);
    }

    public String toString() {
        return "[IndicatorParameterValueDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndicatorParameterValueDto) && Intrinsics.areEqual(((IndicatorParameterValueDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndicatorParameterValueDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B:\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001cR1\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;", "", "", "string_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "number_value", "", "bool_value", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getString_value", "getString_value$annotations", "()V", "Ljava/lang/Double;", "getNumber_value", "()Ljava/lang/Double;", "getNumber_value$annotations", "Ljava/lang/Boolean;", "getBool_value", "()Ljava/lang/Boolean;", "getBool_value$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean bool_value;
        private final Double number_value;
        private final String string_value;

        public Surrogate() {
            this((String) null, (Double) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.string_value, surrogate.string_value) && Intrinsics.areEqual((Object) this.number_value, (Object) surrogate.number_value) && Intrinsics.areEqual(this.bool_value, surrogate.bool_value);
        }

        public int hashCode() {
            String str = this.string_value;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d = this.number_value;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Boolean bool = this.bool_value;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(string_value=" + this.string_value + ", number_value=" + this.number_value + ", bool_value=" + this.bool_value + ")";
        }

        /* compiled from: IndicatorParameterValueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndicatorParameterValueDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Double d, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.string_value = null;
            } else {
                this.string_value = str;
            }
            if ((i & 2) == 0) {
                this.number_value = null;
            } else {
                this.number_value = d;
            }
            if ((i & 4) == 0) {
                this.bool_value = null;
            } else {
                this.bool_value = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.string_value;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            Double d = self.number_value;
            if (d != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, d);
            }
            Boolean bool = self.bool_value;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String str, Double d, Boolean bool) {
            this.string_value = str;
            this.number_value = d;
            this.bool_value = bool;
        }

        public /* synthetic */ Surrogate(String str, Double d, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : bool);
        }

        public final String getString_value() {
            return this.string_value;
        }

        public final Double getNumber_value() {
            return this.number_value;
        }

        public final Boolean getBool_value() {
            return this.bool_value;
        }
    }

    /* compiled from: IndicatorParameterValueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IndicatorParameterValueDto, IndicatorParameterValue> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicatorParameterValueDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParameterValueDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParameterValueDto> getBinaryBase64Serializer() {
            return (KSerializer) IndicatorParameterValueDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndicatorParameterValue> getProtoAdapter() {
            return IndicatorParameterValue.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParameterValueDto getZeroValue() {
            return IndicatorParameterValueDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParameterValueDto fromProto(IndicatorParameterValue proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IndicatorParameterValueDto(new Surrogate(proto.getString_value(), proto.getNumber_value(), proto.getBool_value()), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValueDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorParameterValueDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IndicatorParameterValueDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndicatorParameterValueDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "StringValue", "NumberValue", "BoolValue", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$BoolValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$NumberValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$StringValue;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: IndicatorParameterValueDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$StringValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StringValue extends ValueDto {
            private final String value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StringValue(value=" + this.value + ")";
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StringValue(String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: IndicatorParameterValueDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$NumberValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "()D", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NumberValue extends ValueDto {
            private final double value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NumberValue) && Double.compare(this.value, ((NumberValue) other).value) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            public String toString() {
                return "NumberValue(value=" + this.value + ")";
            }

            public final double getValue() {
                return this.value;
            }

            public NumberValue(double d) {
                super(null);
                this.value = d;
            }
        }

        /* compiled from: IndicatorParameterValueDto.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$BoolValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "", "value", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValue", "()Z", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BoolValue extends ValueDto {
            private final boolean value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BoolValue) && this.value == ((BoolValue) other).value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return "BoolValue(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public BoolValue(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: IndicatorParameterValueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ValueDto, IndicatorParameterValue> {
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
            public ProtoAdapter<IndicatorParameterValue> getProtoAdapter() {
                return IndicatorParameterValue.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValueDto fromProto(IndicatorParameterValue proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getString_value() != null) {
                    return new StringValue(proto.getString_value());
                }
                if (proto.getNumber_value() != null) {
                    return new NumberValue(proto.getNumber_value().doubleValue());
                }
                if (proto.getBool_value() != null) {
                    return new BoolValue(proto.getBool_value().booleanValue());
                }
                return null;
            }
        }
    }

    /* compiled from: IndicatorParameterValueDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndicatorParameterValueDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValue", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndicatorParameterValueDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndicatorParameterValueDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndicatorParameterValueDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndicatorParameterValueDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValueDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValueDto";
        }
    }
}
