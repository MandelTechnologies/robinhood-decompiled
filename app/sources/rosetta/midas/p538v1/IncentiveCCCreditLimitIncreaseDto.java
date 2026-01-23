package rosetta.midas.p538v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;)V", "Lcom/robinhood/rosetta/common/MoneyDto;", "credit_limit_increase_delta", "(Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class IncentiveCCCreditLimitIncreaseDto implements Dto3<IncentiveCCCreditLimitIncrease>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IncentiveCCCreditLimitIncreaseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IncentiveCCCreditLimitIncreaseDto, IncentiveCCCreditLimitIncrease>> binaryBase64Serializer$delegate;
    private static final IncentiveCCCreditLimitIncreaseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IncentiveCCCreditLimitIncreaseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IncentiveCCCreditLimitIncreaseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public IncentiveCCCreditLimitIncreaseDto(MoneyDto moneyDto) {
        this(new Surrogate(moneyDto));
    }

    public /* synthetic */ IncentiveCCCreditLimitIncreaseDto(MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IncentiveCCCreditLimitIncrease toProto() {
        MoneyDto credit_limit_increase_delta = this.surrogate.getCredit_limit_increase_delta();
        return new IncentiveCCCreditLimitIncrease(credit_limit_increase_delta != null ? credit_limit_increase_delta.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[IncentiveCCCreditLimitIncreaseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IncentiveCCCreditLimitIncreaseDto) && Intrinsics.areEqual(((IncentiveCCCreditLimitIncreaseDto) other).surrogate, this.surrogate);
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
    /* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "credit_limit_increase_delta", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCredit_limit_increase_delta", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCredit_limit_increase_delta$annotations", "()V", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto credit_limit_increase_delta;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MoneyDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.credit_limit_increase_delta, ((Surrogate) other).credit_limit_increase_delta);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.credit_limit_increase_delta;
            if (moneyDto == null) {
                return 0;
            }
            return moneyDto.hashCode();
        }

        public String toString() {
            return "Surrogate(credit_limit_increase_delta=" + this.credit_limit_increase_delta + ")";
        }

        /* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IncentiveCCCreditLimitIncreaseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credit_limit_increase_delta = null;
            } else {
                this.credit_limit_increase_delta = moneyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.credit_limit_increase_delta;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
        }

        public Surrogate(MoneyDto moneyDto) {
            this.credit_limit_increase_delta = moneyDto;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto);
        }

        public final MoneyDto getCredit_limit_increase_delta() {
            return this.credit_limit_increase_delta;
        }
    }

    /* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IncentiveCCCreditLimitIncreaseDto, IncentiveCCCreditLimitIncrease> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IncentiveCCCreditLimitIncreaseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IncentiveCCCreditLimitIncreaseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IncentiveCCCreditLimitIncreaseDto> getBinaryBase64Serializer() {
            return (KSerializer) IncentiveCCCreditLimitIncreaseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IncentiveCCCreditLimitIncrease> getProtoAdapter() {
            return IncentiveCCCreditLimitIncrease.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IncentiveCCCreditLimitIncreaseDto getZeroValue() {
            return IncentiveCCCreditLimitIncreaseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IncentiveCCCreditLimitIncreaseDto fromProto(IncentiveCCCreditLimitIncrease proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money credit_limit_increase_delta = proto.getCredit_limit_increase_delta();
            return new IncentiveCCCreditLimitIncreaseDto(new Surrogate(credit_limit_increase_delta != null ? MoneyDto.INSTANCE.fromProto(credit_limit_increase_delta) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.IncentiveCCCreditLimitIncreaseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IncentiveCCCreditLimitIncreaseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IncentiveCCCreditLimitIncreaseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IncentiveCCCreditLimitIncreaseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.IncentiveCCCreditLimitIncrease", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IncentiveCCCreditLimitIncreaseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IncentiveCCCreditLimitIncreaseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IncentiveCCCreditLimitIncreaseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IncentiveCCCreditLimitIncreaseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.IncentiveCCCreditLimitIncreaseDto";
        }
    }
}
