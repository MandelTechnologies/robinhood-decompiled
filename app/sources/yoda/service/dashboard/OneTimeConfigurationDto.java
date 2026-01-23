package yoda.service.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yoda.service.dashboard.ProjectedValuesDto;

/* compiled from: OneTimeConfigurationDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/dashboard/OneTimeConfiguration;", "Landroid/os/Parcelable;", "Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;)V", "", "slider_minimum_value", "slider_maximum_value", "slider_increment_value", "Lyoda/service/dashboard/ProjectedValuesDto;", "projection_values", "(DDDLyoda/service/dashboard/ProjectedValuesDto;)V", "toProto", "()Lyoda/service/dashboard/OneTimeConfiguration;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;", "getSlider_minimum_value", "()D", "getSlider_maximum_value", "getSlider_increment_value", "getProjection_values", "()Lyoda/service/dashboard/ProjectedValuesDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class OneTimeConfigurationDto implements Dto3<OneTimeConfiguration>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OneTimeConfigurationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OneTimeConfigurationDto, OneTimeConfiguration>> binaryBase64Serializer$delegate;
    private static final OneTimeConfigurationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OneTimeConfigurationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OneTimeConfigurationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getSlider_minimum_value() {
        return this.surrogate.getSlider_minimum_value();
    }

    public final double getSlider_maximum_value() {
        return this.surrogate.getSlider_maximum_value();
    }

    public final double getSlider_increment_value() {
        return this.surrogate.getSlider_increment_value();
    }

    public final ProjectedValuesDto getProjection_values() {
        return this.surrogate.getProjection_values();
    }

    public /* synthetic */ OneTimeConfigurationDto(double d, double d2, double d3, ProjectedValuesDto projectedValuesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? null : projectedValuesDto);
    }

    public OneTimeConfigurationDto(double d, double d2, double d3, ProjectedValuesDto projectedValuesDto) {
        this(new Surrogate(d, d2, d3, projectedValuesDto));
    }

    @Override // com.robinhood.idl.Dto
    public OneTimeConfiguration toProto() {
        double slider_minimum_value = this.surrogate.getSlider_minimum_value();
        double slider_maximum_value = this.surrogate.getSlider_maximum_value();
        double slider_increment_value = this.surrogate.getSlider_increment_value();
        ProjectedValuesDto projection_values = this.surrogate.getProjection_values();
        return new OneTimeConfiguration(slider_minimum_value, slider_maximum_value, slider_increment_value, projection_values != null ? projection_values.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[OneTimeConfigurationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OneTimeConfigurationDto) && Intrinsics.areEqual(((OneTimeConfigurationDto) other).surrogate, this.surrogate);
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
    /* compiled from: OneTimeConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B^\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB=\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "slider_minimum_value", "slider_maximum_value", "slider_increment_value", "Lyoda/service/dashboard/ProjectedValuesDto;", "projection_values", "<init>", "(DDDLyoda/service/dashboard/ProjectedValuesDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDLyoda/service/dashboard/ProjectedValuesDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_dashboard_externalRelease", "(Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getSlider_minimum_value", "()D", "getSlider_minimum_value$annotations", "()V", "getSlider_maximum_value", "getSlider_maximum_value$annotations", "getSlider_increment_value", "getSlider_increment_value$annotations", "Lyoda/service/dashboard/ProjectedValuesDto;", "getProjection_values", "()Lyoda/service/dashboard/ProjectedValuesDto;", "getProjection_values$annotations", "Companion", "$serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ProjectedValuesDto projection_values;
        private final double slider_increment_value;
        private final double slider_maximum_value;
        private final double slider_minimum_value;

        public Surrogate() {
            this(0.0d, 0.0d, 0.0d, (ProjectedValuesDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.slider_minimum_value, surrogate.slider_minimum_value) == 0 && Double.compare(this.slider_maximum_value, surrogate.slider_maximum_value) == 0 && Double.compare(this.slider_increment_value, surrogate.slider_increment_value) == 0 && Intrinsics.areEqual(this.projection_values, surrogate.projection_values);
        }

        public int hashCode() {
            int iHashCode = ((((Double.hashCode(this.slider_minimum_value) * 31) + Double.hashCode(this.slider_maximum_value)) * 31) + Double.hashCode(this.slider_increment_value)) * 31;
            ProjectedValuesDto projectedValuesDto = this.projection_values;
            return iHashCode + (projectedValuesDto == null ? 0 : projectedValuesDto.hashCode());
        }

        public String toString() {
            return "Surrogate(slider_minimum_value=" + this.slider_minimum_value + ", slider_maximum_value=" + this.slider_maximum_value + ", slider_increment_value=" + this.slider_increment_value + ", projection_values=" + this.projection_values + ")";
        }

        /* compiled from: OneTimeConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OneTimeConfigurationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, double d2, double d3, ProjectedValuesDto projectedValuesDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.slider_minimum_value = 0.0d;
            } else {
                this.slider_minimum_value = d;
            }
            if ((i & 2) == 0) {
                this.slider_maximum_value = 0.0d;
            } else {
                this.slider_maximum_value = d2;
            }
            if ((i & 4) == 0) {
                this.slider_increment_value = 0.0d;
            } else {
                this.slider_increment_value = d3;
            }
            if ((i & 8) == 0) {
                this.projection_values = null;
            } else {
                this.projection_values = projectedValuesDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_dashboard_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.slider_minimum_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.slider_minimum_value));
            }
            if (Double.compare(self.slider_maximum_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.slider_maximum_value));
            }
            if (Double.compare(self.slider_increment_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.slider_increment_value));
            }
            ProjectedValuesDto projectedValuesDto = self.projection_values;
            if (projectedValuesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ProjectedValuesDto.Serializer.INSTANCE, projectedValuesDto);
            }
        }

        public Surrogate(double d, double d2, double d3, ProjectedValuesDto projectedValuesDto) {
            this.slider_minimum_value = d;
            this.slider_maximum_value = d2;
            this.slider_increment_value = d3;
            this.projection_values = projectedValuesDto;
        }

        public /* synthetic */ Surrogate(double d, double d2, double d3, ProjectedValuesDto projectedValuesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? null : projectedValuesDto);
        }

        public final double getSlider_minimum_value() {
            return this.slider_minimum_value;
        }

        public final double getSlider_maximum_value() {
            return this.slider_maximum_value;
        }

        public final double getSlider_increment_value() {
            return this.slider_increment_value;
        }

        public final ProjectedValuesDto getProjection_values() {
            return this.projection_values;
        }
    }

    /* compiled from: OneTimeConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/dashboard/OneTimeConfigurationDto;", "Lyoda/service/dashboard/OneTimeConfiguration;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/OneTimeConfigurationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OneTimeConfigurationDto, OneTimeConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OneTimeConfigurationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OneTimeConfigurationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OneTimeConfigurationDto> getBinaryBase64Serializer() {
            return (KSerializer) OneTimeConfigurationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OneTimeConfiguration> getProtoAdapter() {
            return OneTimeConfiguration.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OneTimeConfigurationDto getZeroValue() {
            return OneTimeConfigurationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OneTimeConfigurationDto fromProto(OneTimeConfiguration proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            double slider_minimum_value = proto.getSlider_minimum_value();
            double slider_maximum_value = proto.getSlider_maximum_value();
            double slider_increment_value = proto.getSlider_increment_value();
            ProjectedValues projection_values = proto.getProjection_values();
            return new OneTimeConfigurationDto(new Surrogate(slider_minimum_value, slider_maximum_value, slider_increment_value, projection_values != null ? ProjectedValuesDto.INSTANCE.fromProto(projection_values) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.OneTimeConfigurationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OneTimeConfigurationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OneTimeConfigurationDto(0.0d, 0.0d, 0.0d, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OneTimeConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/OneTimeConfigurationDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/dashboard/OneTimeConfigurationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<OneTimeConfigurationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.dashboard.OneTimeConfiguration", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OneTimeConfigurationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OneTimeConfigurationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OneTimeConfigurationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OneTimeConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfigurationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "yoda.service.dashboard.OneTimeConfigurationDto";
        }
    }
}
