package billy_mays.service.p023v1;

import android.os.Parcel;
import android.os.Parcelable;
import billy_mays.service.p023v1.BoostedRateInformationDto;
import billy_mays.service.p023v1.DepositBoostInformationDto;
import billy_mays.service.p023v1.GoldEarningsFeatureDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponse;", "Landroid/os/Parcelable;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;", "surrogate", "<init>", "(Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;)V", "Lbilly_mays/service/v1/GoldEarningsFeatureDto;", "gold_sweep_interest_earnings_rate", "gold_deposit_boost_earnings_rate", "", "has_boosted_apy", "Lbilly_mays/service/v1/BoostedRateInformationDto;", "boosted_rate_information", "Lbilly_mays/service/v1/DepositBoostInformationDto;", "deposit_boost_information", "(Lbilly_mays/service/v1/GoldEarningsFeatureDto;Lbilly_mays/service/v1/GoldEarningsFeatureDto;ZLbilly_mays/service/v1/BoostedRateInformationDto;Lbilly_mays/service/v1/DepositBoostInformationDto;)V", "toProto", "()Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;", "getDeposit_boost_information", "()Lbilly_mays/service/v1/DepositBoostInformationDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetGoldEarningsFeaturesResponseDto implements Dto3<GetGoldEarningsFeaturesResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetGoldEarningsFeaturesResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetGoldEarningsFeaturesResponseDto, GetGoldEarningsFeaturesResponse>> binaryBase64Serializer$delegate;
    private static final GetGoldEarningsFeaturesResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetGoldEarningsFeaturesResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetGoldEarningsFeaturesResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DepositBoostInformationDto getDeposit_boost_information() {
        return this.surrogate.getDeposit_boost_information();
    }

    public /* synthetic */ GetGoldEarningsFeaturesResponseDto(GoldEarningsFeatureDto goldEarningsFeatureDto, GoldEarningsFeatureDto goldEarningsFeatureDto2, boolean z, BoostedRateInformationDto boostedRateInformationDto, DepositBoostInformationDto depositBoostInformationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldEarningsFeatureDto, (i & 2) != 0 ? null : goldEarningsFeatureDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : boostedRateInformationDto, (i & 16) != 0 ? null : depositBoostInformationDto);
    }

    public GetGoldEarningsFeaturesResponseDto(GoldEarningsFeatureDto goldEarningsFeatureDto, GoldEarningsFeatureDto goldEarningsFeatureDto2, boolean z, BoostedRateInformationDto boostedRateInformationDto, DepositBoostInformationDto depositBoostInformationDto) {
        this(new Surrogate(goldEarningsFeatureDto, goldEarningsFeatureDto2, z, boostedRateInformationDto, depositBoostInformationDto));
    }

    @Override // com.robinhood.idl.Dto
    public GetGoldEarningsFeaturesResponse toProto() {
        GoldEarningsFeatureDto gold_sweep_interest_earnings_rate = this.surrogate.getGold_sweep_interest_earnings_rate();
        GoldEarningsFeature proto = gold_sweep_interest_earnings_rate != null ? gold_sweep_interest_earnings_rate.toProto() : null;
        GoldEarningsFeatureDto gold_deposit_boost_earnings_rate = this.surrogate.getGold_deposit_boost_earnings_rate();
        GoldEarningsFeature proto2 = gold_deposit_boost_earnings_rate != null ? gold_deposit_boost_earnings_rate.toProto() : null;
        boolean has_boosted_apy = this.surrogate.getHas_boosted_apy();
        BoostedRateInformationDto boosted_rate_information = this.surrogate.getBoosted_rate_information();
        BoostedRateInformation proto3 = boosted_rate_information != null ? boosted_rate_information.toProto() : null;
        DepositBoostInformationDto deposit_boost_information = this.surrogate.getDeposit_boost_information();
        return new GetGoldEarningsFeaturesResponse(proto, proto2, has_boosted_apy, proto3, deposit_boost_information != null ? deposit_boost_information.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetGoldEarningsFeaturesResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetGoldEarningsFeaturesResponseDto) && Intrinsics.areEqual(((GetGoldEarningsFeaturesResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010'\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;", "", "Lbilly_mays/service/v1/GoldEarningsFeatureDto;", "gold_sweep_interest_earnings_rate", "gold_deposit_boost_earnings_rate", "", "has_boosted_apy", "Lbilly_mays/service/v1/BoostedRateInformationDto;", "boosted_rate_information", "Lbilly_mays/service/v1/DepositBoostInformationDto;", "deposit_boost_information", "<init>", "(Lbilly_mays/service/v1/GoldEarningsFeatureDto;Lbilly_mays/service/v1/GoldEarningsFeatureDto;ZLbilly_mays/service/v1/BoostedRateInformationDto;Lbilly_mays/service/v1/DepositBoostInformationDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbilly_mays/service/v1/GoldEarningsFeatureDto;Lbilly_mays/service/v1/GoldEarningsFeatureDto;ZLbilly_mays/service/v1/BoostedRateInformationDto;Lbilly_mays/service/v1/DepositBoostInformationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$billy_mays_service_v1_externalRelease", "(Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbilly_mays/service/v1/GoldEarningsFeatureDto;", "getGold_sweep_interest_earnings_rate", "()Lbilly_mays/service/v1/GoldEarningsFeatureDto;", "getGold_sweep_interest_earnings_rate$annotations", "()V", "getGold_deposit_boost_earnings_rate", "getGold_deposit_boost_earnings_rate$annotations", "Z", "getHas_boosted_apy", "()Z", "getHas_boosted_apy$annotations", "Lbilly_mays/service/v1/BoostedRateInformationDto;", "getBoosted_rate_information", "()Lbilly_mays/service/v1/BoostedRateInformationDto;", "getBoosted_rate_information$annotations", "Lbilly_mays/service/v1/DepositBoostInformationDto;", "getDeposit_boost_information", "()Lbilly_mays/service/v1/DepositBoostInformationDto;", "getDeposit_boost_information$annotations", "Companion", "$serializer", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BoostedRateInformationDto boosted_rate_information;
        private final DepositBoostInformationDto deposit_boost_information;
        private final GoldEarningsFeatureDto gold_deposit_boost_earnings_rate;
        private final GoldEarningsFeatureDto gold_sweep_interest_earnings_rate;
        private final boolean has_boosted_apy;

        public Surrogate() {
            this((GoldEarningsFeatureDto) null, (GoldEarningsFeatureDto) null, false, (BoostedRateInformationDto) null, (DepositBoostInformationDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.gold_sweep_interest_earnings_rate, surrogate.gold_sweep_interest_earnings_rate) && Intrinsics.areEqual(this.gold_deposit_boost_earnings_rate, surrogate.gold_deposit_boost_earnings_rate) && this.has_boosted_apy == surrogate.has_boosted_apy && Intrinsics.areEqual(this.boosted_rate_information, surrogate.boosted_rate_information) && Intrinsics.areEqual(this.deposit_boost_information, surrogate.deposit_boost_information);
        }

        public int hashCode() {
            GoldEarningsFeatureDto goldEarningsFeatureDto = this.gold_sweep_interest_earnings_rate;
            int iHashCode = (goldEarningsFeatureDto == null ? 0 : goldEarningsFeatureDto.hashCode()) * 31;
            GoldEarningsFeatureDto goldEarningsFeatureDto2 = this.gold_deposit_boost_earnings_rate;
            int iHashCode2 = (((iHashCode + (goldEarningsFeatureDto2 == null ? 0 : goldEarningsFeatureDto2.hashCode())) * 31) + Boolean.hashCode(this.has_boosted_apy)) * 31;
            BoostedRateInformationDto boostedRateInformationDto = this.boosted_rate_information;
            int iHashCode3 = (iHashCode2 + (boostedRateInformationDto == null ? 0 : boostedRateInformationDto.hashCode())) * 31;
            DepositBoostInformationDto depositBoostInformationDto = this.deposit_boost_information;
            return iHashCode3 + (depositBoostInformationDto != null ? depositBoostInformationDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(gold_sweep_interest_earnings_rate=" + this.gold_sweep_interest_earnings_rate + ", gold_deposit_boost_earnings_rate=" + this.gold_deposit_boost_earnings_rate + ", has_boosted_apy=" + this.has_boosted_apy + ", boosted_rate_information=" + this.boosted_rate_information + ", deposit_boost_information=" + this.deposit_boost_information + ")";
        }

        /* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetGoldEarningsFeaturesResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GoldEarningsFeatureDto goldEarningsFeatureDto, GoldEarningsFeatureDto goldEarningsFeatureDto2, boolean z, BoostedRateInformationDto boostedRateInformationDto, DepositBoostInformationDto depositBoostInformationDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.gold_sweep_interest_earnings_rate = null;
            } else {
                this.gold_sweep_interest_earnings_rate = goldEarningsFeatureDto;
            }
            if ((i & 2) == 0) {
                this.gold_deposit_boost_earnings_rate = null;
            } else {
                this.gold_deposit_boost_earnings_rate = goldEarningsFeatureDto2;
            }
            if ((i & 4) == 0) {
                this.has_boosted_apy = false;
            } else {
                this.has_boosted_apy = z;
            }
            if ((i & 8) == 0) {
                this.boosted_rate_information = null;
            } else {
                this.boosted_rate_information = boostedRateInformationDto;
            }
            if ((i & 16) == 0) {
                this.deposit_boost_information = null;
            } else {
                this.deposit_boost_information = depositBoostInformationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$billy_mays_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            GoldEarningsFeatureDto goldEarningsFeatureDto = self.gold_sweep_interest_earnings_rate;
            if (goldEarningsFeatureDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, GoldEarningsFeatureDto.Serializer.INSTANCE, goldEarningsFeatureDto);
            }
            GoldEarningsFeatureDto goldEarningsFeatureDto2 = self.gold_deposit_boost_earnings_rate;
            if (goldEarningsFeatureDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GoldEarningsFeatureDto.Serializer.INSTANCE, goldEarningsFeatureDto2);
            }
            boolean z = self.has_boosted_apy;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            BoostedRateInformationDto boostedRateInformationDto = self.boosted_rate_information;
            if (boostedRateInformationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BoostedRateInformationDto.Serializer.INSTANCE, boostedRateInformationDto);
            }
            DepositBoostInformationDto depositBoostInformationDto = self.deposit_boost_information;
            if (depositBoostInformationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DepositBoostInformationDto.Serializer.INSTANCE, depositBoostInformationDto);
            }
        }

        public Surrogate(GoldEarningsFeatureDto goldEarningsFeatureDto, GoldEarningsFeatureDto goldEarningsFeatureDto2, boolean z, BoostedRateInformationDto boostedRateInformationDto, DepositBoostInformationDto depositBoostInformationDto) {
            this.gold_sweep_interest_earnings_rate = goldEarningsFeatureDto;
            this.gold_deposit_boost_earnings_rate = goldEarningsFeatureDto2;
            this.has_boosted_apy = z;
            this.boosted_rate_information = boostedRateInformationDto;
            this.deposit_boost_information = depositBoostInformationDto;
        }

        public /* synthetic */ Surrogate(GoldEarningsFeatureDto goldEarningsFeatureDto, GoldEarningsFeatureDto goldEarningsFeatureDto2, boolean z, BoostedRateInformationDto boostedRateInformationDto, DepositBoostInformationDto depositBoostInformationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : goldEarningsFeatureDto, (i & 2) != 0 ? null : goldEarningsFeatureDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : boostedRateInformationDto, (i & 16) != 0 ? null : depositBoostInformationDto);
        }

        public final GoldEarningsFeatureDto getGold_sweep_interest_earnings_rate() {
            return this.gold_sweep_interest_earnings_rate;
        }

        public final GoldEarningsFeatureDto getGold_deposit_boost_earnings_rate() {
            return this.gold_deposit_boost_earnings_rate;
        }

        public final boolean getHas_boosted_apy() {
            return this.has_boosted_apy;
        }

        public final BoostedRateInformationDto getBoosted_rate_information() {
            return this.boosted_rate_information;
        }

        public final DepositBoostInformationDto getDeposit_boost_information() {
            return this.deposit_boost_information;
        }
    }

    /* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetGoldEarningsFeaturesResponseDto, GetGoldEarningsFeaturesResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetGoldEarningsFeaturesResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetGoldEarningsFeaturesResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetGoldEarningsFeaturesResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetGoldEarningsFeaturesResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetGoldEarningsFeaturesResponse> getProtoAdapter() {
            return GetGoldEarningsFeaturesResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetGoldEarningsFeaturesResponseDto getZeroValue() {
            return GetGoldEarningsFeaturesResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetGoldEarningsFeaturesResponseDto fromProto(GetGoldEarningsFeaturesResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GoldEarningsFeature gold_sweep_interest_earnings_rate = proto.getGold_sweep_interest_earnings_rate();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GoldEarningsFeatureDto goldEarningsFeatureDtoFromProto = gold_sweep_interest_earnings_rate != null ? GoldEarningsFeatureDto.INSTANCE.fromProto(gold_sweep_interest_earnings_rate) : null;
            GoldEarningsFeature gold_deposit_boost_earnings_rate = proto.getGold_deposit_boost_earnings_rate();
            GoldEarningsFeatureDto goldEarningsFeatureDtoFromProto2 = gold_deposit_boost_earnings_rate != null ? GoldEarningsFeatureDto.INSTANCE.fromProto(gold_deposit_boost_earnings_rate) : null;
            boolean has_boosted_apy = proto.getHas_boosted_apy();
            BoostedRateInformation boosted_rate_information = proto.getBoosted_rate_information();
            BoostedRateInformationDto boostedRateInformationDtoFromProto = boosted_rate_information != null ? BoostedRateInformationDto.INSTANCE.fromProto(boosted_rate_information) : null;
            DepositBoostInformation deposit_boost_information = proto.getDeposit_boost_information();
            return new GetGoldEarningsFeaturesResponseDto(new Surrogate(goldEarningsFeatureDtoFromProto, goldEarningsFeatureDtoFromProto2, has_boosted_apy, boostedRateInformationDtoFromProto, deposit_boost_information != null ? DepositBoostInformationDto.INSTANCE.fromProto(deposit_boost_information) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: billy_mays.service.v1.GetGoldEarningsFeaturesResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetGoldEarningsFeaturesResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetGoldEarningsFeaturesResponseDto(null, null, false, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetGoldEarningsFeaturesResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/billy_mays.service.v1.GetGoldEarningsFeaturesResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetGoldEarningsFeaturesResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetGoldEarningsFeaturesResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetGoldEarningsFeaturesResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetGoldEarningsFeaturesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "billy_mays.service.v1.GetGoldEarningsFeaturesResponseDto";
        }
    }
}
