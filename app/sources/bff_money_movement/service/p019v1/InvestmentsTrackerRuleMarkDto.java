package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.AxisDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGradientDataDto;
import bff_money_movement.service.p019v1.LineStyleDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InvestmentsTrackerRuleMarkDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMark;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;)V", "Lbff_money_movement/service/v1/AxisDto;", "axis", "", "value", "start", "end", "", AnnotatedPrivateKey.LABEL, "Lbff_money_movement/service/v1/LineStyleDto;", ResourceTypes.STYLE, "Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "gradient", "(Lbff_money_movement/service/v1/AxisDto;DDDLjava/lang/String;Lbff_money_movement/service/v1/LineStyleDto;Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerRuleMark;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;", "getAxis", "()Lbff_money_movement/service/v1/AxisDto;", "getValue", "()D", "getEnd", "getLabel", "getGradient", "()Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InvestmentsTrackerRuleMarkDto implements Dto3<InvestmentsTrackerRuleMark>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerRuleMarkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerRuleMarkDto, InvestmentsTrackerRuleMark>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerRuleMarkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerRuleMarkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerRuleMarkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AxisDto getAxis() {
        return this.surrogate.getAxis();
    }

    public final double getValue() {
        return this.surrogate.getValue();
    }

    public final double getEnd() {
        return this.surrogate.getEnd();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final InvestmentsTrackerGradientDataDto getGradient() {
        return this.surrogate.getGradient();
    }

    public /* synthetic */ InvestmentsTrackerRuleMarkDto(AxisDto axisDto, double d, double d2, double d3, String str, LineStyleDto lineStyleDto, InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AxisDto.INSTANCE.getZeroValue() : axisDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? LineStyleDto.INSTANCE.getZeroValue() : lineStyleDto, (i & 64) != 0 ? null : investmentsTrackerGradientDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerRuleMarkDto(AxisDto axis, double d, double d2, double d3, String label, LineStyleDto style, InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto) {
        this(new Surrogate(axis, d, d2, d3, label, style, investmentsTrackerGradientDataDto));
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerRuleMark toProto() {
        Axis axis = (Axis) this.surrogate.getAxis().toProto();
        double value = this.surrogate.getValue();
        double start = this.surrogate.getStart();
        double end = this.surrogate.getEnd();
        String label = this.surrogate.getLabel();
        LineStyle lineStyle = (LineStyle) this.surrogate.getStyle().toProto();
        InvestmentsTrackerGradientDataDto gradient = this.surrogate.getGradient();
        return new InvestmentsTrackerRuleMark(axis, value, start, end, label, lineStyle, gradient != null ? gradient.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[InvestmentsTrackerRuleMarkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerRuleMarkDto) && Intrinsics.areEqual(((InvestmentsTrackerRuleMarkDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerRuleMarkDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BAB|\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B[\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b3\u0010-\u001a\u0004\b2\u00100R/\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00100R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010\"R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b:\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;", "", "Lbff_money_movement/service/v1/AxisDto;", "axis", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "value", "start", "end", "", AnnotatedPrivateKey.LABEL, "Lbff_money_movement/service/v1/LineStyleDto;", ResourceTypes.STYLE, "Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "gradient", "<init>", "(Lbff_money_movement/service/v1/AxisDto;DDDLjava/lang/String;Lbff_money_movement/service/v1/LineStyleDto;Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/AxisDto;DDDLjava/lang/String;Lbff_money_movement/service/v1/LineStyleDto;Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/AxisDto;", "getAxis", "()Lbff_money_movement/service/v1/AxisDto;", "getAxis$annotations", "()V", "D", "getValue", "()D", "getValue$annotations", "getStart", "getStart$annotations", "getEnd", "getEnd$annotations", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "Lbff_money_movement/service/v1/LineStyleDto;", "getStyle", "()Lbff_money_movement/service/v1/LineStyleDto;", "getStyle$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "getGradient", "()Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "getGradient$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AxisDto axis;
        private final double end;
        private final InvestmentsTrackerGradientDataDto gradient;
        private final String label;
        private final double start;
        private final LineStyleDto style;
        private final double value;

        public Surrogate() {
            this((AxisDto) null, 0.0d, 0.0d, 0.0d, (String) null, (LineStyleDto) null, (InvestmentsTrackerGradientDataDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.axis == surrogate.axis && Double.compare(this.value, surrogate.value) == 0 && Double.compare(this.start, surrogate.start) == 0 && Double.compare(this.end, surrogate.end) == 0 && Intrinsics.areEqual(this.label, surrogate.label) && this.style == surrogate.style && Intrinsics.areEqual(this.gradient, surrogate.gradient);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.axis.hashCode() * 31) + Double.hashCode(this.value)) * 31) + Double.hashCode(this.start)) * 31) + Double.hashCode(this.end)) * 31) + this.label.hashCode()) * 31) + this.style.hashCode()) * 31;
            InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto = this.gradient;
            return iHashCode + (investmentsTrackerGradientDataDto == null ? 0 : investmentsTrackerGradientDataDto.hashCode());
        }

        public String toString() {
            return "Surrogate(axis=" + this.axis + ", value=" + this.value + ", start=" + this.start + ", end=" + this.end + ", label=" + this.label + ", style=" + this.style + ", gradient=" + this.gradient + ")";
        }

        /* compiled from: InvestmentsTrackerRuleMarkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerRuleMarkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AxisDto axisDto, double d, double d2, double d3, String str, LineStyleDto lineStyleDto, InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.axis = (i & 1) == 0 ? AxisDto.INSTANCE.getZeroValue() : axisDto;
            if ((i & 2) == 0) {
                this.value = 0.0d;
            } else {
                this.value = d;
            }
            if ((i & 4) == 0) {
                this.start = 0.0d;
            } else {
                this.start = d2;
            }
            if ((i & 8) == 0) {
                this.end = 0.0d;
            } else {
                this.end = d3;
            }
            if ((i & 16) == 0) {
                this.label = "";
            } else {
                this.label = str;
            }
            if ((i & 32) == 0) {
                this.style = LineStyleDto.INSTANCE.getZeroValue();
            } else {
                this.style = lineStyleDto;
            }
            if ((i & 64) == 0) {
                this.gradient = null;
            } else {
                this.gradient = investmentsTrackerGradientDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.axis != AxisDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AxisDto.Serializer.INSTANCE, self.axis);
            }
            if (Double.compare(self.value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.value));
            }
            if (Double.compare(self.start, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.start));
            }
            if (Double.compare(self.end, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.end));
            }
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 4, self.label);
            }
            if (self.style != LineStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, LineStyleDto.Serializer.INSTANCE, self.style);
            }
            InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto = self.gradient;
            if (investmentsTrackerGradientDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, InvestmentsTrackerGradientDataDto.Serializer.INSTANCE, investmentsTrackerGradientDataDto);
            }
        }

        public Surrogate(AxisDto axis, double d, double d2, double d3, String label, LineStyleDto style, InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(style, "style");
            this.axis = axis;
            this.value = d;
            this.start = d2;
            this.end = d3;
            this.label = label;
            this.style = style;
            this.gradient = investmentsTrackerGradientDataDto;
        }

        public final AxisDto getAxis() {
            return this.axis;
        }

        public /* synthetic */ Surrogate(AxisDto axisDto, double d, double d2, double d3, String str, LineStyleDto lineStyleDto, InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AxisDto.INSTANCE.getZeroValue() : axisDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? LineStyleDto.INSTANCE.getZeroValue() : lineStyleDto, (i & 64) != 0 ? null : investmentsTrackerGradientDataDto);
        }

        public final double getValue() {
            return this.value;
        }

        public final double getStart() {
            return this.start;
        }

        public final double getEnd() {
            return this.end;
        }

        public final String getLabel() {
            return this.label;
        }

        public final LineStyleDto getStyle() {
            return this.style;
        }

        public final InvestmentsTrackerGradientDataDto getGradient() {
            return this.gradient;
        }
    }

    /* compiled from: InvestmentsTrackerRuleMarkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMark;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerRuleMarkDto, InvestmentsTrackerRuleMark> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerRuleMarkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerRuleMarkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerRuleMarkDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerRuleMarkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerRuleMark> getProtoAdapter() {
            return InvestmentsTrackerRuleMark.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerRuleMarkDto getZeroValue() {
            return InvestmentsTrackerRuleMarkDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerRuleMarkDto fromProto(InvestmentsTrackerRuleMark proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AxisDto axisDtoFromProto = AxisDto.INSTANCE.fromProto(proto.getAxis());
            double value = proto.getValue();
            double start = proto.getStart();
            double end = proto.getEnd();
            String label = proto.getLabel();
            LineStyleDto lineStyleDtoFromProto = LineStyleDto.INSTANCE.fromProto(proto.getStyle());
            InvestmentsTrackerGradientData gradient = proto.getGradient();
            return new InvestmentsTrackerRuleMarkDto(new Surrogate(axisDtoFromProto, value, start, end, label, lineStyleDtoFromProto, gradient != null ? InvestmentsTrackerGradientDataDto.INSTANCE.fromProto(gradient) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerRuleMarkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerRuleMarkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestmentsTrackerRuleMarkDto(null, 0.0d, 0.0d, 0.0d, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerRuleMarkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerRuleMarkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerRuleMark", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerRuleMarkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerRuleMarkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerRuleMarkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerRuleMarkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerRuleMarkDto";
        }
    }
}
