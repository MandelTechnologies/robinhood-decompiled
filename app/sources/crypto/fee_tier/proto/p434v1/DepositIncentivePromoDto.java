package crypto.fee_tier.proto.p434v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import crypto.fee_tier.proto.p434v1.FeeTierDto;
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
import p479j$.time.Instant;

/* compiled from: DepositIncentivePromoDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006-"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "Landroid/os/Parcelable;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;", "surrogate", "<init>", "(Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;)V", "", "is_promo_claimed", "is_account_eligible_for_promo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "promo_start_time", "promo_end_time", "Lcom/robinhood/rosetta/common/MoneyDto;", "required_deposit_fiat_amount", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "target_tier", "", "lockout_period_days", "(ZZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;I)V", "toProto", "()Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class DepositIncentivePromoDto implements Dto3<DepositIncentivePromo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DepositIncentivePromoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DepositIncentivePromoDto, DepositIncentivePromo>> binaryBase64Serializer$delegate;
    private static final DepositIncentivePromoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DepositIncentivePromoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DepositIncentivePromoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ DepositIncentivePromoDto(boolean z, boolean z2, Instant instant, Instant instant2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2, (i2 & 16) != 0 ? null : moneyDto, (i2 & 32) != 0 ? null : feeTierDto, (i2 & 64) != 0 ? 0 : i);
    }

    public DepositIncentivePromoDto(boolean z, boolean z2, Instant instant, Instant instant2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i) {
        this(new Surrogate(z, z2, instant, instant2, moneyDto, feeTierDto, i));
    }

    @Override // com.robinhood.idl.Dto
    public DepositIncentivePromo toProto() {
        boolean is_promo_claimed = this.surrogate.getIs_promo_claimed();
        boolean is_account_eligible_for_promo = this.surrogate.getIs_account_eligible_for_promo();
        Instant promo_start_time = this.surrogate.getPromo_start_time();
        Instant promo_end_time = this.surrogate.getPromo_end_time();
        MoneyDto required_deposit_fiat_amount = this.surrogate.getRequired_deposit_fiat_amount();
        Money proto = required_deposit_fiat_amount != null ? required_deposit_fiat_amount.toProto() : null;
        FeeTierDto target_tier = this.surrogate.getTarget_tier();
        return new DepositIncentivePromo(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, proto, target_tier != null ? target_tier.toProto() : null, this.surrogate.getLockout_period_days(), null, 128, null);
    }

    public String toString() {
        return "[DepositIncentivePromoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DepositIncentivePromoDto) && Intrinsics.areEqual(((DepositIncentivePromoDto) other).surrogate, this.surrogate);
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
    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@B¬\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0011¢\u0006\u0004\b\u0013\u0010\u0014B[\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b\u0003\u0010+R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b.\u0010-\u001a\u0004\b\u0004\u0010+RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b2\u0010-\u001a\u0004\b0\u00101RF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b4\u0010-\u001a\u0004\b3\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010-\u001a\u0004\b6\u00107R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b:\u0010;R/\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010&¨\u0006B"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;", "", "", "is_promo_claimed", "is_account_eligible_for_promo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "promo_start_time", "promo_end_time", "Lcom/robinhood/rosetta/common/MoneyDto;", "required_deposit_fiat_amount", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "target_tier", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "lockout_period_days", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_fee_tier_proto_v1_externalRelease", "(Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_promo_claimed$annotations", "()V", "is_account_eligible_for_promo$annotations", "Lj$/time/Instant;", "getPromo_start_time", "()Lj$/time/Instant;", "getPromo_start_time$annotations", "getPromo_end_time", "getPromo_end_time$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getRequired_deposit_fiat_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRequired_deposit_fiat_amount$annotations", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "getTarget_tier", "()Lcrypto/fee_tier/proto/v1/FeeTierDto;", "getTarget_tier$annotations", "I", "getLockout_period_days", "getLockout_period_days$annotations", "Companion", "$serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_account_eligible_for_promo;
        private final boolean is_promo_claimed;
        private final int lockout_period_days;
        private final Instant promo_end_time;
        private final Instant promo_start_time;
        private final MoneyDto required_deposit_fiat_amount;
        private final FeeTierDto target_tier;

        public Surrogate() {
            this(false, false, (Instant) null, (Instant) null, (MoneyDto) null, (FeeTierDto) null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_promo_claimed == surrogate.is_promo_claimed && this.is_account_eligible_for_promo == surrogate.is_account_eligible_for_promo && Intrinsics.areEqual(this.promo_start_time, surrogate.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, surrogate.promo_end_time) && Intrinsics.areEqual(this.required_deposit_fiat_amount, surrogate.required_deposit_fiat_amount) && Intrinsics.areEqual(this.target_tier, surrogate.target_tier) && this.lockout_period_days == surrogate.lockout_period_days;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.is_promo_claimed) * 31) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 31;
            Instant instant = this.promo_start_time;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.promo_end_time;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            MoneyDto moneyDto = this.required_deposit_fiat_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            FeeTierDto feeTierDto = this.target_tier;
            return ((iHashCode4 + (feeTierDto != null ? feeTierDto.hashCode() : 0)) * 31) + Integer.hashCode(this.lockout_period_days);
        }

        public String toString() {
            return "Surrogate(is_promo_claimed=" + this.is_promo_claimed + ", is_account_eligible_for_promo=" + this.is_account_eligible_for_promo + ", promo_start_time=" + this.promo_start_time + ", promo_end_time=" + this.promo_end_time + ", required_deposit_fiat_amount=" + this.required_deposit_fiat_amount + ", target_tier=" + this.target_tier + ", lockout_period_days=" + this.lockout_period_days + ")";
        }

        /* compiled from: DepositIncentivePromoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DepositIncentivePromoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, Instant instant, Instant instant2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.is_promo_claimed = false;
            } else {
                this.is_promo_claimed = z;
            }
            if ((i & 2) == 0) {
                this.is_account_eligible_for_promo = false;
            } else {
                this.is_account_eligible_for_promo = z2;
            }
            if ((i & 4) == 0) {
                this.promo_start_time = null;
            } else {
                this.promo_start_time = instant;
            }
            if ((i & 8) == 0) {
                this.promo_end_time = null;
            } else {
                this.promo_end_time = instant2;
            }
            if ((i & 16) == 0) {
                this.required_deposit_fiat_amount = null;
            } else {
                this.required_deposit_fiat_amount = moneyDto;
            }
            if ((i & 32) == 0) {
                this.target_tier = null;
            } else {
                this.target_tier = feeTierDto;
            }
            if ((i & 64) == 0) {
                this.lockout_period_days = 0;
            } else {
                this.lockout_period_days = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_fee_tier_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_promo_claimed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.is_account_eligible_for_promo;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            Instant instant = self.promo_start_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.promo_end_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            MoneyDto moneyDto = self.required_deposit_fiat_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            FeeTierDto feeTierDto = self.target_tier;
            if (feeTierDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FeeTierDto.Serializer.INSTANCE, feeTierDto);
            }
            int i = self.lockout_period_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(boolean z, boolean z2, Instant instant, Instant instant2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i) {
            this.is_promo_claimed = z;
            this.is_account_eligible_for_promo = z2;
            this.promo_start_time = instant;
            this.promo_end_time = instant2;
            this.required_deposit_fiat_amount = moneyDto;
            this.target_tier = feeTierDto;
            this.lockout_period_days = i;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, Instant instant, Instant instant2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2, (i2 & 16) != 0 ? null : moneyDto, (i2 & 32) != 0 ? null : feeTierDto, (i2 & 64) != 0 ? 0 : i);
        }

        /* renamed from: is_promo_claimed, reason: from getter */
        public final boolean getIs_promo_claimed() {
            return this.is_promo_claimed;
        }

        /* renamed from: is_account_eligible_for_promo, reason: from getter */
        public final boolean getIs_account_eligible_for_promo() {
            return this.is_account_eligible_for_promo;
        }

        public final Instant getPromo_start_time() {
            return this.promo_start_time;
        }

        public final Instant getPromo_end_time() {
            return this.promo_end_time;
        }

        public final MoneyDto getRequired_deposit_fiat_amount() {
            return this.required_deposit_fiat_amount;
        }

        public final FeeTierDto getTarget_tier() {
            return this.target_tier;
        }

        public final int getLockout_period_days() {
            return this.lockout_period_days;
        }
    }

    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DepositIncentivePromoDto, DepositIncentivePromo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositIncentivePromoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositIncentivePromoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositIncentivePromoDto> getBinaryBase64Serializer() {
            return (KSerializer) DepositIncentivePromoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DepositIncentivePromo> getProtoAdapter() {
            return DepositIncentivePromo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositIncentivePromoDto getZeroValue() {
            return DepositIncentivePromoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositIncentivePromoDto fromProto(DepositIncentivePromo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean is_promo_claimed = proto.getIs_promo_claimed();
            boolean is_account_eligible_for_promo = proto.getIs_account_eligible_for_promo();
            Instant promo_start_time = proto.getPromo_start_time();
            Instant promo_end_time = proto.getPromo_end_time();
            Money required_deposit_fiat_amount = proto.getRequired_deposit_fiat_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = required_deposit_fiat_amount != null ? MoneyDto.INSTANCE.fromProto(required_deposit_fiat_amount) : null;
            FeeTier target_tier = proto.getTarget_tier();
            return new DepositIncentivePromoDto(new Surrogate(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, moneyDtoFromProto, target_tier != null ? FeeTierDto.INSTANCE.fromProto(target_tier) : null, proto.getLockout_period_days()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto.fee_tier.proto.v1.DepositIncentivePromoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositIncentivePromoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DepositIncentivePromoDto(false, false, null, null, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DepositIncentivePromoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto.fee_tier.proto.v1.DepositIncentivePromo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DepositIncentivePromoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DepositIncentivePromoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DepositIncentivePromoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "crypto.fee_tier.proto.v1.DepositIncentivePromoDto";
        }
    }
}
