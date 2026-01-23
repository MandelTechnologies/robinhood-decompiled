package crypto.fee_tier.proto.p434v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto.fee_tier.proto.p434v1.DepositIncentivePromoDto;
import crypto.fee_tier.proto.p434v1.IntroductoryPromoDto;
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

/* compiled from: FeeTierPromoDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "Landroid/os/Parcelable;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;", "surrogate", "<init>", "(Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;)V", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;", "promo", "(Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;)V", "toProto", "()Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;", "Companion", "Surrogate", "PromoDto", "Serializer", "MultibindingModule", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class FeeTierPromoDto implements Dto3<FeeTierPromo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeTierPromoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTierPromoDto, FeeTierPromo>> binaryBase64Serializer$delegate;
    private static final FeeTierPromoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeTierPromoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTierPromoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeeTierPromoDto(PromoDto promoDto) {
        PromoDto.DepositIncentive depositIncentive = promoDto instanceof PromoDto.DepositIncentive ? (PromoDto.DepositIncentive) promoDto : null;
        DepositIncentivePromoDto value = depositIncentive != null ? depositIncentive.getValue() : null;
        PromoDto.IntroductoryPromo introductoryPromo = promoDto instanceof PromoDto.IntroductoryPromo ? (PromoDto.IntroductoryPromo) promoDto : null;
        this(new Surrogate(value, introductoryPromo != null ? introductoryPromo.getValue() : null));
    }

    public /* synthetic */ FeeTierPromoDto(PromoDto promoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : promoDto);
    }

    @Override // com.robinhood.idl.Dto
    public FeeTierPromo toProto() {
        DepositIncentivePromoDto deposit_incentive = this.surrogate.getDeposit_incentive();
        DepositIncentivePromo proto = deposit_incentive != null ? deposit_incentive.toProto() : null;
        IntroductoryPromoDto introductory_promo = this.surrogate.getIntroductory_promo();
        return new FeeTierPromo(proto, introductory_promo != null ? introductory_promo.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[FeeTierPromoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeTierPromoDto) && Intrinsics.areEqual(((FeeTierPromoDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeTierPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;", "", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "deposit_incentive", "Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "introductory_promo", "<init>", "(Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_fee_tier_proto_v1_externalRelease", "(Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "getDeposit_incentive", "()Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "getDeposit_incentive$annotations", "()V", "Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "getIntroductory_promo", "()Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "getIntroductory_promo$annotations", "Companion", "$serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DepositIncentivePromoDto deposit_incentive;
        private final IntroductoryPromoDto introductory_promo;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((DepositIncentivePromoDto) null, (IntroductoryPromoDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.deposit_incentive, surrogate.deposit_incentive) && Intrinsics.areEqual(this.introductory_promo, surrogate.introductory_promo);
        }

        public int hashCode() {
            DepositIncentivePromoDto depositIncentivePromoDto = this.deposit_incentive;
            int iHashCode = (depositIncentivePromoDto == null ? 0 : depositIncentivePromoDto.hashCode()) * 31;
            IntroductoryPromoDto introductoryPromoDto = this.introductory_promo;
            return iHashCode + (introductoryPromoDto != null ? introductoryPromoDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(deposit_incentive=" + this.deposit_incentive + ", introductory_promo=" + this.introductory_promo + ")";
        }

        /* compiled from: FeeTierPromoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeTierPromoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DepositIncentivePromoDto depositIncentivePromoDto, IntroductoryPromoDto introductoryPromoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.deposit_incentive = null;
            } else {
                this.deposit_incentive = depositIncentivePromoDto;
            }
            if ((i & 2) == 0) {
                this.introductory_promo = null;
            } else {
                this.introductory_promo = introductoryPromoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_fee_tier_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DepositIncentivePromoDto depositIncentivePromoDto = self.deposit_incentive;
            if (depositIncentivePromoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DepositIncentivePromoDto.Serializer.INSTANCE, depositIncentivePromoDto);
            }
            IntroductoryPromoDto introductoryPromoDto = self.introductory_promo;
            if (introductoryPromoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IntroductoryPromoDto.Serializer.INSTANCE, introductoryPromoDto);
            }
        }

        public Surrogate(DepositIncentivePromoDto depositIncentivePromoDto, IntroductoryPromoDto introductoryPromoDto) {
            this.deposit_incentive = depositIncentivePromoDto;
            this.introductory_promo = introductoryPromoDto;
        }

        public /* synthetic */ Surrogate(DepositIncentivePromoDto depositIncentivePromoDto, IntroductoryPromoDto introductoryPromoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : depositIncentivePromoDto, (i & 2) != 0 ? null : introductoryPromoDto);
        }

        public final DepositIncentivePromoDto getDeposit_incentive() {
            return this.deposit_incentive;
        }

        public final IntroductoryPromoDto getIntroductory_promo() {
            return this.introductory_promo;
        }
    }

    /* compiled from: FeeTierPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeTierPromoDto, FeeTierPromo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeTierPromoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierPromoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierPromoDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTierPromoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeTierPromo> getProtoAdapter() {
            return FeeTierPromo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierPromoDto getZeroValue() {
            return FeeTierPromoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierPromoDto fromProto(FeeTierPromo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DepositIncentivePromo deposit_incentive = proto.getDeposit_incentive();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DepositIncentivePromoDto depositIncentivePromoDtoFromProto = deposit_incentive != null ? DepositIncentivePromoDto.INSTANCE.fromProto(deposit_incentive) : null;
            IntroductoryPromo introductory_promo = proto.getIntroductory_promo();
            return new FeeTierPromoDto(new Surrogate(depositIncentivePromoDtoFromProto, introductory_promo != null ? IntroductoryPromoDto.INSTANCE.fromProto(introductory_promo) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto.fee_tier.proto.v1.FeeTierPromoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTierPromoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeTierPromoDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTierPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DepositIncentive", "IntroductoryPromo", "Companion", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto$DepositIncentive;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto$IntroductoryPromo;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class PromoDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ PromoDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PromoDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: FeeTierPromoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto$DepositIncentive;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "value", "<init>", "(Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "getValue", "()Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DepositIncentive extends PromoDto {
            private final DepositIncentivePromoDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DepositIncentive) && Intrinsics.areEqual(this.value, ((DepositIncentive) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DepositIncentive(value=" + this.value + ")";
            }

            public final DepositIncentivePromoDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DepositIncentive(DepositIncentivePromoDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: FeeTierPromoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto$IntroductoryPromo;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;", "Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "value", "<init>", "(Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "getValue", "()Lcrypto/fee_tier/proto/v1/IntroductoryPromoDto;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IntroductoryPromo extends PromoDto {
            private final IntroductoryPromoDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IntroductoryPromo) && Intrinsics.areEqual(this.value, ((IntroductoryPromo) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IntroductoryPromo(value=" + this.value + ")";
            }

            public final IntroductoryPromoDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IntroductoryPromo(IntroductoryPromoDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: FeeTierPromoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$PromoDto;", "Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<PromoDto, FeeTierPromo> {
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
            public ProtoAdapter<FeeTierPromo> getProtoAdapter() {
                return FeeTierPromo.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PromoDto fromProto(FeeTierPromo proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getDeposit_incentive() != null) {
                    return new DepositIncentive(DepositIncentivePromoDto.INSTANCE.fromProto(proto.getDeposit_incentive()));
                }
                if (proto.getIntroductory_promo() != null) {
                    return new IntroductoryPromo(IntroductoryPromoDto.INSTANCE.fromProto(proto.getIntroductory_promo()));
                }
                return null;
            }
        }
    }

    /* compiled from: FeeTierPromoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTierPromoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto.fee_tier.proto.v1.FeeTierPromo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTierPromoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeTierPromoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeTierPromoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeTierPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "crypto.fee_tier.proto.v1.FeeTierPromoDto";
        }
    }
}
