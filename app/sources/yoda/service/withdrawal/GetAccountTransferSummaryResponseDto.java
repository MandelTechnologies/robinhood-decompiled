package yoda.service.withdrawal;

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

/* compiled from: GetAccountTransferSummaryResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponse;", "Landroid/os/Parcelable;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;)V", "Lcom/robinhood/rosetta/common/MoneyDto;", "account_balance", "min_withdrawable_amount", "min_account_value", "Lcom/robinhood/idl/IdlDecimal;", "disclosure_warning_percentage", "full_withdrawal_alert_percentage", "withdrawable_amount", "outstanding_fees", "withdrawable_amount_after_clawback_applied", "clawback_amount", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lyoda/service/withdrawal/GetAccountTransferSummaryResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;", "getWithdrawable_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetAccountTransferSummaryResponseDto implements Dto3<GetAccountTransferSummaryResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountTransferSummaryResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountTransferSummaryResponseDto, GetAccountTransferSummaryResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountTransferSummaryResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountTransferSummaryResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountTransferSummaryResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getWithdrawable_amount() {
        return this.surrogate.getWithdrawable_amount();
    }

    public /* synthetic */ GetAccountTransferSummaryResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? null : moneyDto4, (i & 64) != 0 ? null : moneyDto5, (i & 128) != 0 ? null : moneyDto6, (i & 256) != 0 ? null : moneyDto7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountTransferSummaryResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal disclosure_warning_percentage, IdlDecimal full_withdrawal_alert_percentage, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7) {
        this(new Surrogate(moneyDto, moneyDto2, moneyDto3, disclosure_warning_percentage, full_withdrawal_alert_percentage, moneyDto4, moneyDto5, moneyDto6, moneyDto7));
        Intrinsics.checkNotNullParameter(disclosure_warning_percentage, "disclosure_warning_percentage");
        Intrinsics.checkNotNullParameter(full_withdrawal_alert_percentage, "full_withdrawal_alert_percentage");
    }

    @Override // com.robinhood.idl.Dto
    public GetAccountTransferSummaryResponse toProto() {
        MoneyDto account_balance = this.surrogate.getAccount_balance();
        Money proto = account_balance != null ? account_balance.toProto() : null;
        MoneyDto min_withdrawable_amount = this.surrogate.getMin_withdrawable_amount();
        Money proto2 = min_withdrawable_amount != null ? min_withdrawable_amount.toProto() : null;
        MoneyDto min_account_value = this.surrogate.getMin_account_value();
        Money proto3 = min_account_value != null ? min_account_value.toProto() : null;
        String stringValue = this.surrogate.getDisclosure_warning_percentage().getStringValue();
        String stringValue2 = this.surrogate.getFull_withdrawal_alert_percentage().getStringValue();
        MoneyDto withdrawable_amount = this.surrogate.getWithdrawable_amount();
        Money proto4 = withdrawable_amount != null ? withdrawable_amount.toProto() : null;
        MoneyDto outstanding_fees = this.surrogate.getOutstanding_fees();
        Money proto5 = outstanding_fees != null ? outstanding_fees.toProto() : null;
        MoneyDto withdrawable_amount_after_clawback_applied = this.surrogate.getWithdrawable_amount_after_clawback_applied();
        Money proto6 = withdrawable_amount_after_clawback_applied != null ? withdrawable_amount_after_clawback_applied.toProto() : null;
        MoneyDto clawback_amount = this.surrogate.getClawback_amount();
        return new GetAccountTransferSummaryResponse(proto, proto2, proto3, stringValue, stringValue2, proto4, proto5, proto6, clawback_amount != null ? clawback_amount.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[GetAccountTransferSummaryResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountTransferSummaryResponseDto) && Intrinsics.areEqual(((GetAccountTransferSummaryResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountTransferSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010+R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R/\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010)\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010+R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010)\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010+R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010)\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010)\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010+¨\u0006B"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "account_balance", "min_withdrawable_amount", "min_account_value", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "disclosure_warning_percentage", "full_withdrawal_alert_percentage", "withdrawable_amount", "outstanding_fees", "withdrawable_amount_after_clawback_applied", "clawback_amount", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_withdrawal_externalRelease", "(Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAccount_balance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAccount_balance$annotations", "()V", "getMin_withdrawable_amount", "getMin_withdrawable_amount$annotations", "getMin_account_value", "getMin_account_value$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getDisclosure_warning_percentage", "()Lcom/robinhood/idl/IdlDecimal;", "getDisclosure_warning_percentage$annotations", "getFull_withdrawal_alert_percentage", "getFull_withdrawal_alert_percentage$annotations", "getWithdrawable_amount", "getWithdrawable_amount$annotations", "getOutstanding_fees", "getOutstanding_fees$annotations", "getWithdrawable_amount_after_clawback_applied", "getWithdrawable_amount_after_clawback_applied$annotations", "getClawback_amount", "getClawback_amount$annotations", "Companion", "$serializer", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto account_balance;
        private final MoneyDto clawback_amount;
        private final IdlDecimal disclosure_warning_percentage;
        private final IdlDecimal full_withdrawal_alert_percentage;
        private final MoneyDto min_account_value;
        private final MoneyDto min_withdrawable_amount;
        private final MoneyDto outstanding_fees;
        private final MoneyDto withdrawable_amount;
        private final MoneyDto withdrawable_amount_after_clawback_applied;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_balance, surrogate.account_balance) && Intrinsics.areEqual(this.min_withdrawable_amount, surrogate.min_withdrawable_amount) && Intrinsics.areEqual(this.min_account_value, surrogate.min_account_value) && Intrinsics.areEqual(this.disclosure_warning_percentage, surrogate.disclosure_warning_percentage) && Intrinsics.areEqual(this.full_withdrawal_alert_percentage, surrogate.full_withdrawal_alert_percentage) && Intrinsics.areEqual(this.withdrawable_amount, surrogate.withdrawable_amount) && Intrinsics.areEqual(this.outstanding_fees, surrogate.outstanding_fees) && Intrinsics.areEqual(this.withdrawable_amount_after_clawback_applied, surrogate.withdrawable_amount_after_clawback_applied) && Intrinsics.areEqual(this.clawback_amount, surrogate.clawback_amount);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.account_balance;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.min_withdrawable_amount;
            int iHashCode2 = (iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.min_account_value;
            int iHashCode3 = (((((iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31) + this.disclosure_warning_percentage.hashCode()) * 31) + this.full_withdrawal_alert_percentage.hashCode()) * 31;
            MoneyDto moneyDto4 = this.withdrawable_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.outstanding_fees;
            int iHashCode5 = (iHashCode4 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.withdrawable_amount_after_clawback_applied;
            int iHashCode6 = (iHashCode5 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31;
            MoneyDto moneyDto7 = this.clawback_amount;
            return iHashCode6 + (moneyDto7 != null ? moneyDto7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_balance=" + this.account_balance + ", min_withdrawable_amount=" + this.min_withdrawable_amount + ", min_account_value=" + this.min_account_value + ", disclosure_warning_percentage=" + this.disclosure_warning_percentage + ", full_withdrawal_alert_percentage=" + this.full_withdrawal_alert_percentage + ", withdrawable_amount=" + this.withdrawable_amount + ", outstanding_fees=" + this.outstanding_fees + ", withdrawable_amount_after_clawback_applied=" + this.withdrawable_amount_after_clawback_applied + ", clawback_amount=" + this.clawback_amount + ")";
        }

        /* compiled from: GetAccountTransferSummaryResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountTransferSummaryResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_balance = null;
            } else {
                this.account_balance = moneyDto;
            }
            if ((i & 2) == 0) {
                this.min_withdrawable_amount = null;
            } else {
                this.min_withdrawable_amount = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.min_account_value = null;
            } else {
                this.min_account_value = moneyDto3;
            }
            if ((i & 8) == 0) {
                this.disclosure_warning_percentage = new IdlDecimal("");
            } else {
                this.disclosure_warning_percentage = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.full_withdrawal_alert_percentage = new IdlDecimal("");
            } else {
                this.full_withdrawal_alert_percentage = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.withdrawable_amount = null;
            } else {
                this.withdrawable_amount = moneyDto4;
            }
            if ((i & 64) == 0) {
                this.outstanding_fees = null;
            } else {
                this.outstanding_fees = moneyDto5;
            }
            if ((i & 128) == 0) {
                this.withdrawable_amount_after_clawback_applied = null;
            } else {
                this.withdrawable_amount_after_clawback_applied = moneyDto6;
            }
            if ((i & 256) == 0) {
                this.clawback_amount = null;
            } else {
                this.clawback_amount = moneyDto7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_withdrawal_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.account_balance;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.min_withdrawable_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.min_account_value;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.disclosure_warning_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.disclosure_warning_percentage);
            }
            if (!Intrinsics.areEqual(self.full_withdrawal_alert_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.full_withdrawal_alert_percentage);
            }
            MoneyDto moneyDto4 = self.withdrawable_amount;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.outstanding_fees;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.withdrawable_amount_after_clawback_applied;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
            MoneyDto moneyDto7 = self.clawback_amount;
            if (moneyDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MoneyDto.Serializer.INSTANCE, moneyDto7);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal disclosure_warning_percentage, IdlDecimal full_withdrawal_alert_percentage, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7) {
            Intrinsics.checkNotNullParameter(disclosure_warning_percentage, "disclosure_warning_percentage");
            Intrinsics.checkNotNullParameter(full_withdrawal_alert_percentage, "full_withdrawal_alert_percentage");
            this.account_balance = moneyDto;
            this.min_withdrawable_amount = moneyDto2;
            this.min_account_value = moneyDto3;
            this.disclosure_warning_percentage = disclosure_warning_percentage;
            this.full_withdrawal_alert_percentage = full_withdrawal_alert_percentage;
            this.withdrawable_amount = moneyDto4;
            this.outstanding_fees = moneyDto5;
            this.withdrawable_amount_after_clawback_applied = moneyDto6;
            this.clawback_amount = moneyDto7;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? null : moneyDto4, (i & 64) != 0 ? null : moneyDto5, (i & 128) != 0 ? null : moneyDto6, (i & 256) != 0 ? null : moneyDto7);
        }

        public final MoneyDto getAccount_balance() {
            return this.account_balance;
        }

        public final MoneyDto getMin_withdrawable_amount() {
            return this.min_withdrawable_amount;
        }

        public final MoneyDto getMin_account_value() {
            return this.min_account_value;
        }

        public final IdlDecimal getDisclosure_warning_percentage() {
            return this.disclosure_warning_percentage;
        }

        public final IdlDecimal getFull_withdrawal_alert_percentage() {
            return this.full_withdrawal_alert_percentage;
        }

        public final MoneyDto getWithdrawable_amount() {
            return this.withdrawable_amount;
        }

        public final MoneyDto getOutstanding_fees() {
            return this.outstanding_fees;
        }

        public final MoneyDto getWithdrawable_amount_after_clawback_applied() {
            return this.withdrawable_amount_after_clawback_applied;
        }

        public final MoneyDto getClawback_amount() {
            return this.clawback_amount;
        }
    }

    /* compiled from: GetAccountTransferSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountTransferSummaryResponseDto, GetAccountTransferSummaryResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountTransferSummaryResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountTransferSummaryResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountTransferSummaryResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountTransferSummaryResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountTransferSummaryResponse> getProtoAdapter() {
            return GetAccountTransferSummaryResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountTransferSummaryResponseDto getZeroValue() {
            return GetAccountTransferSummaryResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountTransferSummaryResponseDto fromProto(GetAccountTransferSummaryResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money account_balance = proto.getAccount_balance();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = account_balance != null ? MoneyDto.INSTANCE.fromProto(account_balance) : null;
            Money min_withdrawable_amount = proto.getMin_withdrawable_amount();
            MoneyDto moneyDtoFromProto2 = min_withdrawable_amount != null ? MoneyDto.INSTANCE.fromProto(min_withdrawable_amount) : null;
            Money min_account_value = proto.getMin_account_value();
            MoneyDto moneyDtoFromProto3 = min_account_value != null ? MoneyDto.INSTANCE.fromProto(min_account_value) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getDisclosure_warning_percentage());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getFull_withdrawal_alert_percentage());
            Money withdrawable_amount = proto.getWithdrawable_amount();
            MoneyDto moneyDtoFromProto4 = withdrawable_amount != null ? MoneyDto.INSTANCE.fromProto(withdrawable_amount) : null;
            Money outstanding_fees = proto.getOutstanding_fees();
            MoneyDto moneyDtoFromProto5 = outstanding_fees != null ? MoneyDto.INSTANCE.fromProto(outstanding_fees) : null;
            Money withdrawable_amount_after_clawback_applied = proto.getWithdrawable_amount_after_clawback_applied();
            MoneyDto moneyDtoFromProto6 = withdrawable_amount_after_clawback_applied != null ? MoneyDto.INSTANCE.fromProto(withdrawable_amount_after_clawback_applied) : null;
            Money clawback_amount = proto.getClawback_amount();
            return new GetAccountTransferSummaryResponseDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, idlDecimal, idlDecimal2, moneyDtoFromProto4, moneyDtoFromProto5, moneyDtoFromProto6, clawback_amount != null ? MoneyDto.INSTANCE.fromProto(clawback_amount) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.withdrawal.GetAccountTransferSummaryResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountTransferSummaryResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAccountTransferSummaryResponseDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountTransferSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetAccountTransferSummaryResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.withdrawal.GetAccountTransferSummaryResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountTransferSummaryResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountTransferSummaryResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountTransferSummaryResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountTransferSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "yoda.service.withdrawal.GetAccountTransferSummaryResponseDto";
        }
    }
}
