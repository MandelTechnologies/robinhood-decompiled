package advisory.proto.p008v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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

/* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;)V", "", "new_label", "Lcom/robinhood/idl/IdlDecimal;", "new_value", "new_value_label", "old_label", "old_value", "old_value_label", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;", "getNew_label", "getNew_value", "()Lcom/robinhood/idl/IdlDecimal;", "getNew_value_label", "getOld_label", "getOld_value", "getOld_value_label", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class AdvisoryInsightTwoBarChartComparisonDto implements Dto3<AdvisoryInsightTwoBarChartComparison>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightTwoBarChartComparisonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightTwoBarChartComparisonDto, AdvisoryInsightTwoBarChartComparison>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightTwoBarChartComparisonDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightTwoBarChartComparisonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightTwoBarChartComparisonDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getNew_label() {
        return this.surrogate.getNew_label();
    }

    public final IdlDecimal getNew_value() {
        return this.surrogate.getNew_value();
    }

    public final String getNew_value_label() {
        return this.surrogate.getNew_value_label();
    }

    public final String getOld_label() {
        return this.surrogate.getOld_label();
    }

    public final IdlDecimal getOld_value() {
        return this.surrogate.getOld_value();
    }

    public final String getOld_value_label() {
        return this.surrogate.getOld_value_label();
    }

    public /* synthetic */ AdvisoryInsightTwoBarChartComparisonDto(String str, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightTwoBarChartComparisonDto(String new_label, IdlDecimal new_value, String new_value_label, String old_label, IdlDecimal old_value, String old_value_label) {
        this(new Surrogate(new_label, new_value, new_value_label, old_label, old_value, old_value_label));
        Intrinsics.checkNotNullParameter(new_label, "new_label");
        Intrinsics.checkNotNullParameter(new_value, "new_value");
        Intrinsics.checkNotNullParameter(new_value_label, "new_value_label");
        Intrinsics.checkNotNullParameter(old_label, "old_label");
        Intrinsics.checkNotNullParameter(old_value, "old_value");
        Intrinsics.checkNotNullParameter(old_value_label, "old_value_label");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisoryInsightTwoBarChartComparison toProto() {
        return new AdvisoryInsightTwoBarChartComparison(this.surrogate.getNew_label(), this.surrogate.getNew_value().getStringValue(), this.surrogate.getNew_value_label(), this.surrogate.getOld_label(), this.surrogate.getOld_value().getStringValue(), this.surrogate.getOld_value_label(), null, 64, null);
    }

    public String toString() {
        return "[AdvisoryInsightTwoBarChartComparisonDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightTwoBarChartComparisonDto) && Intrinsics.areEqual(((AdvisoryInsightTwoBarChartComparisonDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001eR/\u0010\u000b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010)\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010+R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001e¨\u00067"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;", "", "", "new_label", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "new_value", "new_value_label", "old_label", "old_value", "old_value_label", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNew_label", "getNew_label$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getNew_value", "()Lcom/robinhood/idl/IdlDecimal;", "getNew_value$annotations", "getNew_value_label", "getNew_value_label$annotations", "getOld_label", "getOld_label$annotations", "getOld_value", "getOld_value$annotations", "getOld_value_label", "getOld_value_label$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String new_label;
        private final IdlDecimal new_value;
        private final String new_value_label;
        private final String old_label;
        private final IdlDecimal old_value;
        private final String old_value_label;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (String) null, (String) null, (IdlDecimal) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.new_label, surrogate.new_label) && Intrinsics.areEqual(this.new_value, surrogate.new_value) && Intrinsics.areEqual(this.new_value_label, surrogate.new_value_label) && Intrinsics.areEqual(this.old_label, surrogate.old_label) && Intrinsics.areEqual(this.old_value, surrogate.old_value) && Intrinsics.areEqual(this.old_value_label, surrogate.old_value_label);
        }

        public int hashCode() {
            return (((((((((this.new_label.hashCode() * 31) + this.new_value.hashCode()) * 31) + this.new_value_label.hashCode()) * 31) + this.old_label.hashCode()) * 31) + this.old_value.hashCode()) * 31) + this.old_value_label.hashCode();
        }

        public String toString() {
            return "Surrogate(new_label=" + this.new_label + ", new_value=" + this.new_value + ", new_value_label=" + this.new_value_label + ", old_label=" + this.old_label + ", old_value=" + this.old_value + ", old_value_label=" + this.old_value_label + ")";
        }

        /* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightTwoBarChartComparisonDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.new_label = "";
            } else {
                this.new_label = str;
            }
            if ((i & 2) == 0) {
                this.new_value = new IdlDecimal("");
            } else {
                this.new_value = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.new_value_label = "";
            } else {
                this.new_value_label = str2;
            }
            if ((i & 8) == 0) {
                this.old_label = "";
            } else {
                this.old_label = str3;
            }
            if ((i & 16) == 0) {
                this.old_value = new IdlDecimal("");
            } else {
                this.old_value = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.old_value_label = "";
            } else {
                this.old_value_label = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.new_label, "")) {
                output.encodeStringElement(serialDesc, 0, self.new_label);
            }
            if (!Intrinsics.areEqual(self.new_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.new_value);
            }
            if (!Intrinsics.areEqual(self.new_value_label, "")) {
                output.encodeStringElement(serialDesc, 2, self.new_value_label);
            }
            if (!Intrinsics.areEqual(self.old_label, "")) {
                output.encodeStringElement(serialDesc, 3, self.old_label);
            }
            if (!Intrinsics.areEqual(self.old_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.old_value);
            }
            if (Intrinsics.areEqual(self.old_value_label, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.old_value_label);
        }

        public Surrogate(String new_label, IdlDecimal new_value, String new_value_label, String old_label, IdlDecimal old_value, String old_value_label) {
            Intrinsics.checkNotNullParameter(new_label, "new_label");
            Intrinsics.checkNotNullParameter(new_value, "new_value");
            Intrinsics.checkNotNullParameter(new_value_label, "new_value_label");
            Intrinsics.checkNotNullParameter(old_label, "old_label");
            Intrinsics.checkNotNullParameter(old_value, "old_value");
            Intrinsics.checkNotNullParameter(old_value_label, "old_value_label");
            this.new_label = new_label;
            this.new_value = new_value;
            this.new_value_label = new_value_label;
            this.old_label = old_label;
            this.old_value = old_value;
            this.old_value_label = old_value_label;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str4);
        }

        public final String getNew_label() {
            return this.new_label;
        }

        public final IdlDecimal getNew_value() {
            return this.new_value;
        }

        public final String getNew_value_label() {
            return this.new_value_label;
        }

        public final String getOld_label() {
            return this.old_label;
        }

        public final IdlDecimal getOld_value() {
            return this.old_value;
        }

        public final String getOld_value_label() {
            return this.old_value_label;
        }
    }

    /* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparison;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AdvisoryInsightTwoBarChartComparisonDto, AdvisoryInsightTwoBarChartComparison> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightTwoBarChartComparisonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightTwoBarChartComparisonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightTwoBarChartComparisonDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightTwoBarChartComparisonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsightTwoBarChartComparison> getProtoAdapter() {
            return AdvisoryInsightTwoBarChartComparison.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightTwoBarChartComparisonDto getZeroValue() {
            return AdvisoryInsightTwoBarChartComparisonDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightTwoBarChartComparisonDto fromProto(AdvisoryInsightTwoBarChartComparison proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AdvisoryInsightTwoBarChartComparisonDto(new Surrogate(proto.getNew_label(), new IdlDecimal(proto.getNew_value()), proto.getNew_value_label(), proto.getOld_label(), new IdlDecimal(proto.getOld_value()), proto.getOld_value_label()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightTwoBarChartComparisonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightTwoBarChartComparisonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryInsightTwoBarChartComparisonDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisoryInsightTwoBarChartComparisonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsightTwoBarChartComparison", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightTwoBarChartComparisonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightTwoBarChartComparisonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightTwoBarChartComparisonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryInsightTwoBarChartComparisonDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightTwoBarChartComparisonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightTwoBarChartComparisonDto";
        }
    }
}
