package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import nummus.p512v1.FeeTierDto;

/* compiled from: DepositIncentivePromoDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010(R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010(R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010\u001f¨\u00064"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/DepositIncentivePromo;", "Landroid/os/Parcelable;", "Lnummus/v1/DepositIncentivePromoDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/DepositIncentivePromoDto$Surrogate;)V", "", "is_promo_claimed", "is_account_eligible_for_promo", "", "promo_start_time", "promo_end_time", "Lcom/robinhood/rosetta/common/MoneyDto;", "required_deposit_fiat_amount", "Lnummus/v1/FeeTierDto;", "target_tier", "", "lockup_period_days", "net_deposited_amount", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lnummus/v1/DepositIncentivePromo;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/DepositIncentivePromoDto$Surrogate;", "()Z", "getPromo_start_time", "getPromo_end_time", "getRequired_deposit_fiat_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTarget_tier", "()Lnummus/v1/FeeTierDto;", "getLockup_period_days", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
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

    public final boolean is_promo_claimed() {
        return this.surrogate.getIs_promo_claimed();
    }

    public final boolean is_account_eligible_for_promo() {
        return this.surrogate.getIs_account_eligible_for_promo();
    }

    public final String getPromo_start_time() {
        return this.surrogate.getPromo_start_time();
    }

    public final String getPromo_end_time() {
        return this.surrogate.getPromo_end_time();
    }

    public final MoneyDto getRequired_deposit_fiat_amount() {
        return this.surrogate.getRequired_deposit_fiat_amount();
    }

    public final FeeTierDto getTarget_tier() {
        return this.surrogate.getTarget_tier();
    }

    public final int getLockup_period_days() {
        return this.surrogate.getLockup_period_days();
    }

    public /* synthetic */ DepositIncentivePromoDto(boolean z, boolean z2, String str, String str2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, MoneyDto moneyDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : moneyDto, (i2 & 32) != 0 ? null : feeTierDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : moneyDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DepositIncentivePromoDto(boolean z, boolean z2, String promo_start_time, String promo_end_time, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, MoneyDto moneyDto2) {
        this(new Surrogate(z, z2, promo_start_time, promo_end_time, moneyDto, feeTierDto, i, moneyDto2));
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
    }

    @Override // com.robinhood.idl.Dto
    public DepositIncentivePromo toProto() {
        boolean is_promo_claimed = this.surrogate.getIs_promo_claimed();
        boolean is_account_eligible_for_promo = this.surrogate.getIs_account_eligible_for_promo();
        String promo_start_time = this.surrogate.getPromo_start_time();
        String promo_end_time = this.surrogate.getPromo_end_time();
        MoneyDto required_deposit_fiat_amount = this.surrogate.getRequired_deposit_fiat_amount();
        Money proto = required_deposit_fiat_amount != null ? required_deposit_fiat_amount.toProto() : null;
        FeeTierDto target_tier = this.surrogate.getTarget_tier();
        FeeTier proto2 = target_tier != null ? target_tier.toProto() : null;
        int lockup_period_days = this.surrogate.getLockup_period_days();
        MoneyDto net_deposited_amount = this.surrogate.getNet_deposited_amount();
        return new DepositIncentivePromo(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, proto, proto2, lockup_period_days, net_deposited_amount != null ? net_deposited_amount.toProto() : null, null, 256, null);
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
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bl\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013Be\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b\u0003\u0010)R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b,\u0010+\u001a\u0004\b\u0004\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\"R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R/\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\b<\u0010+\u001a\u0004\b;\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00102\u0012\u0004\b>\u0010+\u001a\u0004\b=\u00104¨\u0006A"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto$Surrogate;", "", "", "is_promo_claimed", "is_account_eligible_for_promo", "", "promo_start_time", "promo_end_time", "Lcom/robinhood/rosetta/common/MoneyDto;", "required_deposit_fiat_amount", "Lnummus/v1/FeeTierDto;", "target_tier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "lockup_period_days", "net_deposited_amount", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/DepositIncentivePromoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_promo_claimed$annotations", "()V", "is_account_eligible_for_promo$annotations", "Ljava/lang/String;", "getPromo_start_time", "getPromo_start_time$annotations", "getPromo_end_time", "getPromo_end_time$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getRequired_deposit_fiat_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRequired_deposit_fiat_amount$annotations", "Lnummus/v1/FeeTierDto;", "getTarget_tier", "()Lnummus/v1/FeeTierDto;", "getTarget_tier$annotations", "I", "getLockup_period_days", "getLockup_period_days$annotations", "getNet_deposited_amount", "getNet_deposited_amount$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_account_eligible_for_promo;
        private final boolean is_promo_claimed;
        private final int lockup_period_days;
        private final MoneyDto net_deposited_amount;
        private final String promo_end_time;
        private final String promo_start_time;
        private final MoneyDto required_deposit_fiat_amount;
        private final FeeTierDto target_tier;

        public Surrogate() {
            this(false, false, (String) null, (String) null, (MoneyDto) null, (FeeTierDto) null, 0, (MoneyDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_promo_claimed == surrogate.is_promo_claimed && this.is_account_eligible_for_promo == surrogate.is_account_eligible_for_promo && Intrinsics.areEqual(this.promo_start_time, surrogate.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, surrogate.promo_end_time) && Intrinsics.areEqual(this.required_deposit_fiat_amount, surrogate.required_deposit_fiat_amount) && Intrinsics.areEqual(this.target_tier, surrogate.target_tier) && this.lockup_period_days == surrogate.lockup_period_days && Intrinsics.areEqual(this.net_deposited_amount, surrogate.net_deposited_amount);
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.is_promo_claimed) * 31) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 31) + this.promo_start_time.hashCode()) * 31) + this.promo_end_time.hashCode()) * 31;
            MoneyDto moneyDto = this.required_deposit_fiat_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            FeeTierDto feeTierDto = this.target_tier;
            int iHashCode3 = (((iHashCode2 + (feeTierDto == null ? 0 : feeTierDto.hashCode())) * 31) + Integer.hashCode(this.lockup_period_days)) * 31;
            MoneyDto moneyDto2 = this.net_deposited_amount;
            return iHashCode3 + (moneyDto2 != null ? moneyDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(is_promo_claimed=" + this.is_promo_claimed + ", is_account_eligible_for_promo=" + this.is_account_eligible_for_promo + ", promo_start_time=" + this.promo_start_time + ", promo_end_time=" + this.promo_end_time + ", required_deposit_fiat_amount=" + this.required_deposit_fiat_amount + ", target_tier=" + this.target_tier + ", lockup_period_days=" + this.lockup_period_days + ", net_deposited_amount=" + this.net_deposited_amount + ")";
        }

        /* compiled from: DepositIncentivePromoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/DepositIncentivePromoDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DepositIncentivePromoDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, String str, String str2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i2, MoneyDto moneyDto2, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.promo_start_time = "";
            } else {
                this.promo_start_time = str;
            }
            if ((i & 8) == 0) {
                this.promo_end_time = "";
            } else {
                this.promo_end_time = str2;
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
                this.lockup_period_days = 0;
            } else {
                this.lockup_period_days = i2;
            }
            if ((i & 128) == 0) {
                this.net_deposited_amount = null;
            } else {
                this.net_deposited_amount = moneyDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_promo_claimed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.is_account_eligible_for_promo;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            if (!Intrinsics.areEqual(self.promo_start_time, "")) {
                output.encodeStringElement(serialDesc, 2, self.promo_start_time);
            }
            if (!Intrinsics.areEqual(self.promo_end_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.promo_end_time);
            }
            MoneyDto moneyDto = self.required_deposit_fiat_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            FeeTierDto feeTierDto = self.target_tier;
            if (feeTierDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FeeTierDto.Serializer.INSTANCE, feeTierDto);
            }
            int i = self.lockup_period_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            MoneyDto moneyDto2 = self.net_deposited_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
        }

        public Surrogate(boolean z, boolean z2, String promo_start_time, String promo_end_time, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, MoneyDto moneyDto2) {
            Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
            Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
            this.is_promo_claimed = z;
            this.is_account_eligible_for_promo = z2;
            this.promo_start_time = promo_start_time;
            this.promo_end_time = promo_end_time;
            this.required_deposit_fiat_amount = moneyDto;
            this.target_tier = feeTierDto;
            this.lockup_period_days = i;
            this.net_deposited_amount = moneyDto2;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, String str, String str2, MoneyDto moneyDto, FeeTierDto feeTierDto, int i, MoneyDto moneyDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : moneyDto, (i2 & 32) != 0 ? null : feeTierDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : moneyDto2);
        }

        /* renamed from: is_promo_claimed, reason: from getter */
        public final boolean getIs_promo_claimed() {
            return this.is_promo_claimed;
        }

        /* renamed from: is_account_eligible_for_promo, reason: from getter */
        public final boolean getIs_account_eligible_for_promo() {
            return this.is_account_eligible_for_promo;
        }

        public final String getPromo_start_time() {
            return this.promo_start_time;
        }

        public final String getPromo_end_time() {
            return this.promo_end_time;
        }

        public final MoneyDto getRequired_deposit_fiat_amount() {
            return this.required_deposit_fiat_amount;
        }

        public final FeeTierDto getTarget_tier() {
            return this.target_tier;
        }

        public final int getLockup_period_days() {
            return this.lockup_period_days;
        }

        public final MoneyDto getNet_deposited_amount() {
            return this.net_deposited_amount;
        }
    }

    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/DepositIncentivePromoDto;", "Lnummus/v1/DepositIncentivePromo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/DepositIncentivePromoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            String promo_start_time = proto.getPromo_start_time();
            String promo_end_time = proto.getPromo_end_time();
            Money required_deposit_fiat_amount = proto.getRequired_deposit_fiat_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = required_deposit_fiat_amount != null ? MoneyDto.INSTANCE.fromProto(required_deposit_fiat_amount) : null;
            FeeTier target_tier = proto.getTarget_tier();
            FeeTierDto feeTierDtoFromProto = target_tier != null ? FeeTierDto.INSTANCE.fromProto(target_tier) : null;
            int lockup_period_days = proto.getLockup_period_days();
            Money net_deposited_amount = proto.getNet_deposited_amount();
            return new DepositIncentivePromoDto(new Surrogate(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, moneyDtoFromProto, feeTierDtoFromProto, lockup_period_days, net_deposited_amount != null ? MoneyDto.INSTANCE.fromProto(net_deposited_amount) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.DepositIncentivePromoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositIncentivePromoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DepositIncentivePromoDto(false, false, null, null, null, null, 0, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DepositIncentivePromoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/DepositIncentivePromoDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/DepositIncentivePromoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DepositIncentivePromoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.DepositIncentivePromo", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "nummus.v1.DepositIncentivePromoDto";
        }
    }
}
