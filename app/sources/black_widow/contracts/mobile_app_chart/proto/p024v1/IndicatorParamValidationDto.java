package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: IndicatorParamValidationDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006+"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;)V", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "precision", "step", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;", "getMin", "()Ljava/lang/Double;", "getMax", "getPrecision", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IndicatorParamValidationDto implements Dto3<IndicatorParamValidation>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndicatorParamValidationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndicatorParamValidationDto, IndicatorParamValidation>> binaryBase64Serializer$delegate;
    private static final IndicatorParamValidationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndicatorParamValidationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndicatorParamValidationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final Double getMin() {
        return this.surrogate.getMin();
    }

    public final Double getMax() {
        return this.surrogate.getMax();
    }

    public final Double getPrecision() {
        return this.surrogate.getPrecision();
    }

    public /* synthetic */ IndicatorParamValidationDto(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }

    public IndicatorParamValidationDto(Double d, Double d2, Double d3, Double d4) {
        this(new Surrogate(d, d2, d3, d4));
    }

    @Override // com.robinhood.idl.Dto
    public IndicatorParamValidation toProto() {
        return new IndicatorParamValidation(this.surrogate.getMin(), this.surrogate.getMax(), this.surrogate.getPrecision(), this.surrogate.getStep(), null, 16, null);
    }

    public String toString() {
        return "[IndicatorParamValidationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndicatorParamValidationDto) && Intrinsics.areEqual(((IndicatorParamValidationDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndicatorParamValidationDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.Bs\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R1\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010%R1\u0010\t\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%¨\u00060"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "min", AnalyticsStrings.MAX_WELCOME_TAG, "precision", "step", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getMin", "()Ljava/lang/Double;", "getMin$annotations", "()V", "getMax", "getMax$annotations", "getPrecision", "getPrecision$annotations", "getStep", "getStep$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Double max;
        private final Double min;
        private final Double precision;
        private final Double step;

        public Surrogate() {
            this((Double) null, (Double) null, (Double) null, (Double) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual((Object) this.min, (Object) surrogate.min) && Intrinsics.areEqual((Object) this.max, (Object) surrogate.max) && Intrinsics.areEqual((Object) this.precision, (Object) surrogate.precision) && Intrinsics.areEqual((Object) this.step, (Object) surrogate.step);
        }

        public int hashCode() {
            Double d = this.min;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.max;
            int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.precision;
            int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.step;
            return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(min=" + this.min + ", max=" + this.max + ", precision=" + this.precision + ", step=" + this.step + ")";
        }

        /* compiled from: IndicatorParamValidationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndicatorParamValidationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Double d, Double d2, Double d3, Double d4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.min = null;
            } else {
                this.min = d;
            }
            if ((i & 2) == 0) {
                this.max = null;
            } else {
                this.max = d2;
            }
            if ((i & 4) == 0) {
                this.precision = null;
            } else {
                this.precision = d3;
            }
            if ((i & 8) == 0) {
                this.step = null;
            } else {
                this.step = d4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Double d = self.min;
            if (d != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, d);
            }
            Double d2 = self.max;
            if (d2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, d2);
            }
            Double d3 = self.precision;
            if (d3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, d3);
            }
            Double d4 = self.step;
            if (d4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, d4);
            }
        }

        public Surrogate(Double d, Double d2, Double d3, Double d4) {
            this.min = d;
            this.max = d2;
            this.precision = d3;
            this.step = d4;
        }

        public /* synthetic */ Surrogate(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
        }

        public final Double getMin() {
            return this.min;
        }

        public final Double getMax() {
            return this.max;
        }

        public final Double getPrecision() {
            return this.precision;
        }

        public final Double getStep() {
            return this.step;
        }
    }

    /* compiled from: IndicatorParamValidationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IndicatorParamValidationDto, IndicatorParamValidation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicatorParamValidationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParamValidationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndicatorParamValidationDto> getBinaryBase64Serializer() {
            return (KSerializer) IndicatorParamValidationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndicatorParamValidation> getProtoAdapter() {
            return IndicatorParamValidation.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParamValidationDto getZeroValue() {
            return IndicatorParamValidationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndicatorParamValidationDto fromProto(IndicatorParamValidation proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IndicatorParamValidationDto(new Surrogate(proto.getMin(), proto.getMax(), proto.getPrecision(), proto.getStep()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParamValidationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndicatorParamValidationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IndicatorParamValidationDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndicatorParamValidationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndicatorParamValidationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParamValidation", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndicatorParamValidationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndicatorParamValidationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndicatorParamValidationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndicatorParamValidationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParamValidationDto";
        }
    }
}
