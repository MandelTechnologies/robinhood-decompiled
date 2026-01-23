package nimbus.service.p511v1;

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
import nimbus.service.p511v1.AcatsClawbackDto;
import nimbus.service.p511v1.BorrowingLimitCheckFailedDto;
import nimbus.service.p511v1.EmptyTransferDto;
import nimbus.service.p511v1.GoldBoostDto;
import nimbus.service.p511v1.InstantCheckFailedDto;
import nimbus.service.p511v1.MaintenanceExcessCheckFailedDto;
import nimbus.service.p511v1.ManagedAccountFundingTransferValueCheckFailedDto;
import nimbus.service.p511v1.NegativeTransferMarketValueDto;
import nimbus.service.p511v1.Pdt25kLimitDto;
import nimbus.service.p511v1.TransferCountCheckFailedDto;
import nimbus.service.p511v1.TransferLimitCheckFailedDto;
import nimbus.service.p511v1.TwoKMinimumEquityCheckFailedDto;
import nimbus.service.p511v1.UnsettledPositionsCheckFailedDto;

/* compiled from: PreSubmissionWarningTypeDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto;", "Lcom/robinhood/idl/MessageDto;", "Lnimbus/service/v1/PreSubmissionWarningType;", "Landroid/os/Parcelable;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;", "surrogate", "<init>", "(Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;)V", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "warning_type", "(Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;)V", "toProto", "()Lnimbus/service/v1/PreSubmissionWarningType;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;", "getWarning_type", "()Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Companion", "Surrogate", "WarningTypeDto", "Serializer", "MultibindingModule", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class PreSubmissionWarningTypeDto implements Dto3<PreSubmissionWarningType>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PreSubmissionWarningTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PreSubmissionWarningTypeDto, PreSubmissionWarningType>> binaryBase64Serializer$delegate;
    private static final PreSubmissionWarningTypeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PreSubmissionWarningTypeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PreSubmissionWarningTypeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final WarningTypeDto getWarning_type() {
        if (this.surrogate.getPdt_25k_limit() != null) {
            return new WarningTypeDto.Pdt25kLimit(this.surrogate.getPdt_25k_limit());
        }
        if (this.surrogate.getAcats_clawback() != null) {
            return new WarningTypeDto.AcatsClawback(this.surrogate.getAcats_clawback());
        }
        if (this.surrogate.getTwo_k_minimum_equity_check_failed() != null) {
            return new WarningTypeDto.TwoKMinimumEquityCheckFailed(this.surrogate.getTwo_k_minimum_equity_check_failed());
        }
        if (this.surrogate.getMaintenance_excess_check_failed() != null) {
            return new WarningTypeDto.MaintenanceExcessCheckFailed(this.surrogate.getMaintenance_excess_check_failed());
        }
        if (this.surrogate.getBorrowing_limit_check_failed() != null) {
            return new WarningTypeDto.BorrowingLimitCheckFailed(this.surrogate.getBorrowing_limit_check_failed());
        }
        if (this.surrogate.getTransfer_limit_check_failed() != null) {
            return new WarningTypeDto.TransferLimitCheckFailed(this.surrogate.getTransfer_limit_check_failed());
        }
        if (this.surrogate.getUnsettled_positions_check_failed() != null) {
            return new WarningTypeDto.UnsettledPositionsCheckFailed(this.surrogate.getUnsettled_positions_check_failed());
        }
        if (this.surrogate.getNegative_transfer_market_value() != null) {
            return new WarningTypeDto.NegativeTransferMarketValue(this.surrogate.getNegative_transfer_market_value());
        }
        if (this.surrogate.getGold_boost_details() != null) {
            return new WarningTypeDto.GoldBoostDetails(this.surrogate.getGold_boost_details());
        }
        if (this.surrogate.getInstant_check_failed() != null) {
            return new WarningTypeDto.InstantCheckFailed(this.surrogate.getInstant_check_failed());
        }
        if (this.surrogate.getTransfer_count_check_failed() != null) {
            return new WarningTypeDto.TransferCountCheckFailed(this.surrogate.getTransfer_count_check_failed());
        }
        if (this.surrogate.getEmpty_transfer() != null) {
            return new WarningTypeDto.EmptyTransfer(this.surrogate.getEmpty_transfer());
        }
        if (this.surrogate.getManaged_account_funding_transfer_value_check_failed() != null) {
            return new WarningTypeDto.ManagedAccountFundingTransferValueCheckFailed(this.surrogate.getManaged_account_funding_transfer_value_check_failed());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PreSubmissionWarningTypeDto(WarningTypeDto warningTypeDto) {
        WarningTypeDto.Pdt25kLimit pdt25kLimit = warningTypeDto instanceof WarningTypeDto.Pdt25kLimit ? (WarningTypeDto.Pdt25kLimit) warningTypeDto : null;
        Pdt25kLimitDto value = pdt25kLimit != null ? pdt25kLimit.getValue() : null;
        WarningTypeDto.AcatsClawback acatsClawback = warningTypeDto instanceof WarningTypeDto.AcatsClawback ? (WarningTypeDto.AcatsClawback) warningTypeDto : null;
        AcatsClawbackDto value2 = acatsClawback != null ? acatsClawback.getValue() : null;
        WarningTypeDto.TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed = warningTypeDto instanceof WarningTypeDto.TwoKMinimumEquityCheckFailed ? (WarningTypeDto.TwoKMinimumEquityCheckFailed) warningTypeDto : null;
        TwoKMinimumEquityCheckFailedDto value3 = twoKMinimumEquityCheckFailed != null ? twoKMinimumEquityCheckFailed.getValue() : null;
        WarningTypeDto.MaintenanceExcessCheckFailed maintenanceExcessCheckFailed = warningTypeDto instanceof WarningTypeDto.MaintenanceExcessCheckFailed ? (WarningTypeDto.MaintenanceExcessCheckFailed) warningTypeDto : null;
        MaintenanceExcessCheckFailedDto value4 = maintenanceExcessCheckFailed != null ? maintenanceExcessCheckFailed.getValue() : null;
        WarningTypeDto.BorrowingLimitCheckFailed borrowingLimitCheckFailed = warningTypeDto instanceof WarningTypeDto.BorrowingLimitCheckFailed ? (WarningTypeDto.BorrowingLimitCheckFailed) warningTypeDto : null;
        BorrowingLimitCheckFailedDto value5 = borrowingLimitCheckFailed != null ? borrowingLimitCheckFailed.getValue() : null;
        WarningTypeDto.TransferLimitCheckFailed transferLimitCheckFailed = warningTypeDto instanceof WarningTypeDto.TransferLimitCheckFailed ? (WarningTypeDto.TransferLimitCheckFailed) warningTypeDto : null;
        TransferLimitCheckFailedDto value6 = transferLimitCheckFailed != null ? transferLimitCheckFailed.getValue() : null;
        WarningTypeDto.UnsettledPositionsCheckFailed unsettledPositionsCheckFailed = warningTypeDto instanceof WarningTypeDto.UnsettledPositionsCheckFailed ? (WarningTypeDto.UnsettledPositionsCheckFailed) warningTypeDto : null;
        UnsettledPositionsCheckFailedDto value7 = unsettledPositionsCheckFailed != null ? unsettledPositionsCheckFailed.getValue() : null;
        WarningTypeDto.NegativeTransferMarketValue negativeTransferMarketValue = warningTypeDto instanceof WarningTypeDto.NegativeTransferMarketValue ? (WarningTypeDto.NegativeTransferMarketValue) warningTypeDto : null;
        NegativeTransferMarketValueDto value8 = negativeTransferMarketValue != null ? negativeTransferMarketValue.getValue() : null;
        WarningTypeDto.GoldBoostDetails goldBoostDetails = warningTypeDto instanceof WarningTypeDto.GoldBoostDetails ? (WarningTypeDto.GoldBoostDetails) warningTypeDto : null;
        GoldBoostDto value9 = goldBoostDetails != null ? goldBoostDetails.getValue() : null;
        WarningTypeDto.InstantCheckFailed instantCheckFailed = warningTypeDto instanceof WarningTypeDto.InstantCheckFailed ? (WarningTypeDto.InstantCheckFailed) warningTypeDto : null;
        InstantCheckFailedDto value10 = instantCheckFailed != null ? instantCheckFailed.getValue() : null;
        WarningTypeDto.TransferCountCheckFailed transferCountCheckFailed = warningTypeDto instanceof WarningTypeDto.TransferCountCheckFailed ? (WarningTypeDto.TransferCountCheckFailed) warningTypeDto : null;
        TransferCountCheckFailedDto value11 = transferCountCheckFailed != null ? transferCountCheckFailed.getValue() : null;
        WarningTypeDto.EmptyTransfer emptyTransfer = warningTypeDto instanceof WarningTypeDto.EmptyTransfer ? (WarningTypeDto.EmptyTransfer) warningTypeDto : null;
        EmptyTransferDto value12 = emptyTransfer != null ? emptyTransfer.getValue() : null;
        WarningTypeDto.ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailed = warningTypeDto instanceof WarningTypeDto.ManagedAccountFundingTransferValueCheckFailed ? (WarningTypeDto.ManagedAccountFundingTransferValueCheckFailed) warningTypeDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, managedAccountFundingTransferValueCheckFailed != null ? managedAccountFundingTransferValueCheckFailed.getValue() : null));
    }

    public /* synthetic */ PreSubmissionWarningTypeDto(WarningTypeDto warningTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : warningTypeDto);
    }

    @Override // com.robinhood.idl.Dto
    public PreSubmissionWarningType toProto() {
        Pdt25kLimitDto pdt_25k_limit = this.surrogate.getPdt_25k_limit();
        Pdt25kLimit proto = pdt_25k_limit != null ? pdt_25k_limit.toProto() : null;
        AcatsClawbackDto acats_clawback = this.surrogate.getAcats_clawback();
        AcatsClawback proto2 = acats_clawback != null ? acats_clawback.toProto() : null;
        TwoKMinimumEquityCheckFailedDto two_k_minimum_equity_check_failed = this.surrogate.getTwo_k_minimum_equity_check_failed();
        TwoKMinimumEquityCheckFailed proto3 = two_k_minimum_equity_check_failed != null ? two_k_minimum_equity_check_failed.toProto() : null;
        MaintenanceExcessCheckFailedDto maintenance_excess_check_failed = this.surrogate.getMaintenance_excess_check_failed();
        MaintenanceExcessCheckFailed proto4 = maintenance_excess_check_failed != null ? maintenance_excess_check_failed.toProto() : null;
        BorrowingLimitCheckFailedDto borrowing_limit_check_failed = this.surrogate.getBorrowing_limit_check_failed();
        BorrowingLimitCheckFailed proto5 = borrowing_limit_check_failed != null ? borrowing_limit_check_failed.toProto() : null;
        TransferLimitCheckFailedDto transfer_limit_check_failed = this.surrogate.getTransfer_limit_check_failed();
        TransferLimitCheckFailed proto6 = transfer_limit_check_failed != null ? transfer_limit_check_failed.toProto() : null;
        UnsettledPositionsCheckFailedDto unsettled_positions_check_failed = this.surrogate.getUnsettled_positions_check_failed();
        UnsettledPositionsCheckFailed proto7 = unsettled_positions_check_failed != null ? unsettled_positions_check_failed.toProto() : null;
        NegativeTransferMarketValueDto negative_transfer_market_value = this.surrogate.getNegative_transfer_market_value();
        NegativeTransferMarketValue proto8 = negative_transfer_market_value != null ? negative_transfer_market_value.toProto() : null;
        GoldBoostDto gold_boost_details = this.surrogate.getGold_boost_details();
        GoldBoost proto9 = gold_boost_details != null ? gold_boost_details.toProto() : null;
        InstantCheckFailedDto instant_check_failed = this.surrogate.getInstant_check_failed();
        InstantCheckFailed proto10 = instant_check_failed != null ? instant_check_failed.toProto() : null;
        TransferCountCheckFailedDto transfer_count_check_failed = this.surrogate.getTransfer_count_check_failed();
        TransferCountCheckFailed proto11 = transfer_count_check_failed != null ? transfer_count_check_failed.toProto() : null;
        EmptyTransferDto empty_transfer = this.surrogate.getEmpty_transfer();
        EmptyTransfer proto12 = empty_transfer != null ? empty_transfer.toProto() : null;
        ManagedAccountFundingTransferValueCheckFailedDto managed_account_funding_transfer_value_check_failed = this.surrogate.getManaged_account_funding_transfer_value_check_failed();
        return new PreSubmissionWarningType(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, managed_account_funding_transfer_value_check_failed != null ? managed_account_funding_transfer_value_check_failed.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[PreSubmissionWarningTypeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PreSubmissionWarningTypeDto) && Intrinsics.areEqual(((PreSubmissionWarningTypeDto) other).surrogate, this.surrogate);
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
    /* compiled from: PreSubmissionWarningTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\b\u0083\b\u0018\u0000 j2\u00020\u0001:\u0002kjB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u009d\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\bA\u00109\u001a\u0004\b?\u0010@R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bE\u00109\u001a\u0004\bC\u0010DR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010F\u0012\u0004\bI\u00109\u001a\u0004\bG\u0010HR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010J\u0012\u0004\bM\u00109\u001a\u0004\bK\u0010LR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bQ\u00109\u001a\u0004\bO\u0010PR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010R\u0012\u0004\bU\u00109\u001a\u0004\bS\u0010TR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010V\u0012\u0004\bY\u00109\u001a\u0004\bW\u0010XR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Z\u0012\u0004\b]\u00109\u001a\u0004\b[\u0010\\R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010^\u0012\u0004\ba\u00109\u001a\u0004\b_\u0010`R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010b\u0012\u0004\be\u00109\u001a\u0004\bc\u0010dR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010f\u0012\u0004\bi\u00109\u001a\u0004\bg\u0010h¨\u0006l"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;", "", "Lnimbus/service/v1/Pdt25kLimitDto;", "pdt_25k_limit", "Lnimbus/service/v1/AcatsClawbackDto;", "acats_clawback", "Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "two_k_minimum_equity_check_failed", "Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "maintenance_excess_check_failed", "Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "borrowing_limit_check_failed", "Lnimbus/service/v1/TransferLimitCheckFailedDto;", "transfer_limit_check_failed", "Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "unsettled_positions_check_failed", "Lnimbus/service/v1/NegativeTransferMarketValueDto;", "negative_transfer_market_value", "Lnimbus/service/v1/GoldBoostDto;", "gold_boost_details", "Lnimbus/service/v1/InstantCheckFailedDto;", "instant_check_failed", "Lnimbus/service/v1/TransferCountCheckFailedDto;", "transfer_count_check_failed", "Lnimbus/service/v1/EmptyTransferDto;", "empty_transfer", "Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "managed_account_funding_transfer_value_check_failed", "<init>", "(Lnimbus/service/v1/Pdt25kLimitDto;Lnimbus/service/v1/AcatsClawbackDto;Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;Lnimbus/service/v1/BorrowingLimitCheckFailedDto;Lnimbus/service/v1/TransferLimitCheckFailedDto;Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;Lnimbus/service/v1/NegativeTransferMarketValueDto;Lnimbus/service/v1/GoldBoostDto;Lnimbus/service/v1/InstantCheckFailedDto;Lnimbus/service/v1/TransferCountCheckFailedDto;Lnimbus/service/v1/EmptyTransferDto;Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILnimbus/service/v1/Pdt25kLimitDto;Lnimbus/service/v1/AcatsClawbackDto;Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;Lnimbus/service/v1/BorrowingLimitCheckFailedDto;Lnimbus/service/v1/TransferLimitCheckFailedDto;Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;Lnimbus/service/v1/NegativeTransferMarketValueDto;Lnimbus/service/v1/GoldBoostDto;Lnimbus/service/v1/InstantCheckFailedDto;Lnimbus/service/v1/TransferCountCheckFailedDto;Lnimbus/service/v1/EmptyTransferDto;Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nimbus_v1_externalRelease", "(Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/Pdt25kLimitDto;", "getPdt_25k_limit", "()Lnimbus/service/v1/Pdt25kLimitDto;", "getPdt_25k_limit$annotations", "()V", "Lnimbus/service/v1/AcatsClawbackDto;", "getAcats_clawback", "()Lnimbus/service/v1/AcatsClawbackDto;", "getAcats_clawback$annotations", "Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "getTwo_k_minimum_equity_check_failed", "()Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "getTwo_k_minimum_equity_check_failed$annotations", "Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "getMaintenance_excess_check_failed", "()Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "getMaintenance_excess_check_failed$annotations", "Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "getBorrowing_limit_check_failed", "()Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "getBorrowing_limit_check_failed$annotations", "Lnimbus/service/v1/TransferLimitCheckFailedDto;", "getTransfer_limit_check_failed", "()Lnimbus/service/v1/TransferLimitCheckFailedDto;", "getTransfer_limit_check_failed$annotations", "Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "getUnsettled_positions_check_failed", "()Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "getUnsettled_positions_check_failed$annotations", "Lnimbus/service/v1/NegativeTransferMarketValueDto;", "getNegative_transfer_market_value", "()Lnimbus/service/v1/NegativeTransferMarketValueDto;", "getNegative_transfer_market_value$annotations", "Lnimbus/service/v1/GoldBoostDto;", "getGold_boost_details", "()Lnimbus/service/v1/GoldBoostDto;", "getGold_boost_details$annotations", "Lnimbus/service/v1/InstantCheckFailedDto;", "getInstant_check_failed", "()Lnimbus/service/v1/InstantCheckFailedDto;", "getInstant_check_failed$annotations", "Lnimbus/service/v1/TransferCountCheckFailedDto;", "getTransfer_count_check_failed", "()Lnimbus/service/v1/TransferCountCheckFailedDto;", "getTransfer_count_check_failed$annotations", "Lnimbus/service/v1/EmptyTransferDto;", "getEmpty_transfer", "()Lnimbus/service/v1/EmptyTransferDto;", "getEmpty_transfer$annotations", "Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "getManaged_account_funding_transfer_value_check_failed", "()Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "getManaged_account_funding_transfer_value_check_failed$annotations", "Companion", "$serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AcatsClawbackDto acats_clawback;
        private final BorrowingLimitCheckFailedDto borrowing_limit_check_failed;
        private final EmptyTransferDto empty_transfer;
        private final GoldBoostDto gold_boost_details;
        private final InstantCheckFailedDto instant_check_failed;
        private final MaintenanceExcessCheckFailedDto maintenance_excess_check_failed;
        private final ManagedAccountFundingTransferValueCheckFailedDto managed_account_funding_transfer_value_check_failed;
        private final NegativeTransferMarketValueDto negative_transfer_market_value;
        private final Pdt25kLimitDto pdt_25k_limit;
        private final TransferCountCheckFailedDto transfer_count_check_failed;
        private final TransferLimitCheckFailedDto transfer_limit_check_failed;
        private final TwoKMinimumEquityCheckFailedDto two_k_minimum_equity_check_failed;
        private final UnsettledPositionsCheckFailedDto unsettled_positions_check_failed;

        public Surrogate() {
            this((Pdt25kLimitDto) null, (AcatsClawbackDto) null, (TwoKMinimumEquityCheckFailedDto) null, (MaintenanceExcessCheckFailedDto) null, (BorrowingLimitCheckFailedDto) null, (TransferLimitCheckFailedDto) null, (UnsettledPositionsCheckFailedDto) null, (NegativeTransferMarketValueDto) null, (GoldBoostDto) null, (InstantCheckFailedDto) null, (TransferCountCheckFailedDto) null, (EmptyTransferDto) null, (ManagedAccountFundingTransferValueCheckFailedDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.pdt_25k_limit, surrogate.pdt_25k_limit) && Intrinsics.areEqual(this.acats_clawback, surrogate.acats_clawback) && Intrinsics.areEqual(this.two_k_minimum_equity_check_failed, surrogate.two_k_minimum_equity_check_failed) && Intrinsics.areEqual(this.maintenance_excess_check_failed, surrogate.maintenance_excess_check_failed) && Intrinsics.areEqual(this.borrowing_limit_check_failed, surrogate.borrowing_limit_check_failed) && Intrinsics.areEqual(this.transfer_limit_check_failed, surrogate.transfer_limit_check_failed) && Intrinsics.areEqual(this.unsettled_positions_check_failed, surrogate.unsettled_positions_check_failed) && Intrinsics.areEqual(this.negative_transfer_market_value, surrogate.negative_transfer_market_value) && Intrinsics.areEqual(this.gold_boost_details, surrogate.gold_boost_details) && Intrinsics.areEqual(this.instant_check_failed, surrogate.instant_check_failed) && Intrinsics.areEqual(this.transfer_count_check_failed, surrogate.transfer_count_check_failed) && Intrinsics.areEqual(this.empty_transfer, surrogate.empty_transfer) && Intrinsics.areEqual(this.managed_account_funding_transfer_value_check_failed, surrogate.managed_account_funding_transfer_value_check_failed);
        }

        public int hashCode() {
            Pdt25kLimitDto pdt25kLimitDto = this.pdt_25k_limit;
            int iHashCode = (pdt25kLimitDto == null ? 0 : pdt25kLimitDto.hashCode()) * 31;
            AcatsClawbackDto acatsClawbackDto = this.acats_clawback;
            int iHashCode2 = (iHashCode + (acatsClawbackDto == null ? 0 : acatsClawbackDto.hashCode())) * 31;
            TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDto = this.two_k_minimum_equity_check_failed;
            int iHashCode3 = (iHashCode2 + (twoKMinimumEquityCheckFailedDto == null ? 0 : twoKMinimumEquityCheckFailedDto.hashCode())) * 31;
            MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDto = this.maintenance_excess_check_failed;
            int iHashCode4 = (iHashCode3 + (maintenanceExcessCheckFailedDto == null ? 0 : maintenanceExcessCheckFailedDto.hashCode())) * 31;
            BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDto = this.borrowing_limit_check_failed;
            int iHashCode5 = (iHashCode4 + (borrowingLimitCheckFailedDto == null ? 0 : borrowingLimitCheckFailedDto.hashCode())) * 31;
            TransferLimitCheckFailedDto transferLimitCheckFailedDto = this.transfer_limit_check_failed;
            int iHashCode6 = (iHashCode5 + (transferLimitCheckFailedDto == null ? 0 : transferLimitCheckFailedDto.hashCode())) * 31;
            UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDto = this.unsettled_positions_check_failed;
            int iHashCode7 = (iHashCode6 + (unsettledPositionsCheckFailedDto == null ? 0 : unsettledPositionsCheckFailedDto.hashCode())) * 31;
            NegativeTransferMarketValueDto negativeTransferMarketValueDto = this.negative_transfer_market_value;
            int iHashCode8 = (iHashCode7 + (negativeTransferMarketValueDto == null ? 0 : negativeTransferMarketValueDto.hashCode())) * 31;
            GoldBoostDto goldBoostDto = this.gold_boost_details;
            int iHashCode9 = (iHashCode8 + (goldBoostDto == null ? 0 : goldBoostDto.hashCode())) * 31;
            InstantCheckFailedDto instantCheckFailedDto = this.instant_check_failed;
            int iHashCode10 = (iHashCode9 + (instantCheckFailedDto == null ? 0 : instantCheckFailedDto.hashCode())) * 31;
            TransferCountCheckFailedDto transferCountCheckFailedDto = this.transfer_count_check_failed;
            int iHashCode11 = (iHashCode10 + (transferCountCheckFailedDto == null ? 0 : transferCountCheckFailedDto.hashCode())) * 31;
            EmptyTransferDto emptyTransferDto = this.empty_transfer;
            int iHashCode12 = (iHashCode11 + (emptyTransferDto == null ? 0 : emptyTransferDto.hashCode())) * 31;
            ManagedAccountFundingTransferValueCheckFailedDto managedAccountFundingTransferValueCheckFailedDto = this.managed_account_funding_transfer_value_check_failed;
            return iHashCode12 + (managedAccountFundingTransferValueCheckFailedDto != null ? managedAccountFundingTransferValueCheckFailedDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(pdt_25k_limit=" + this.pdt_25k_limit + ", acats_clawback=" + this.acats_clawback + ", two_k_minimum_equity_check_failed=" + this.two_k_minimum_equity_check_failed + ", maintenance_excess_check_failed=" + this.maintenance_excess_check_failed + ", borrowing_limit_check_failed=" + this.borrowing_limit_check_failed + ", transfer_limit_check_failed=" + this.transfer_limit_check_failed + ", unsettled_positions_check_failed=" + this.unsettled_positions_check_failed + ", negative_transfer_market_value=" + this.negative_transfer_market_value + ", gold_boost_details=" + this.gold_boost_details + ", instant_check_failed=" + this.instant_check_failed + ", transfer_count_check_failed=" + this.transfer_count_check_failed + ", empty_transfer=" + this.empty_transfer + ", managed_account_funding_transfer_value_check_failed=" + this.managed_account_funding_transfer_value_check_failed + ")";
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PreSubmissionWarningTypeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Pdt25kLimitDto pdt25kLimitDto, AcatsClawbackDto acatsClawbackDto, TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDto, MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDto, BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDto, TransferLimitCheckFailedDto transferLimitCheckFailedDto, UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDto, NegativeTransferMarketValueDto negativeTransferMarketValueDto, GoldBoostDto goldBoostDto, InstantCheckFailedDto instantCheckFailedDto, TransferCountCheckFailedDto transferCountCheckFailedDto, EmptyTransferDto emptyTransferDto, ManagedAccountFundingTransferValueCheckFailedDto managedAccountFundingTransferValueCheckFailedDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.pdt_25k_limit = null;
            } else {
                this.pdt_25k_limit = pdt25kLimitDto;
            }
            if ((i & 2) == 0) {
                this.acats_clawback = null;
            } else {
                this.acats_clawback = acatsClawbackDto;
            }
            if ((i & 4) == 0) {
                this.two_k_minimum_equity_check_failed = null;
            } else {
                this.two_k_minimum_equity_check_failed = twoKMinimumEquityCheckFailedDto;
            }
            if ((i & 8) == 0) {
                this.maintenance_excess_check_failed = null;
            } else {
                this.maintenance_excess_check_failed = maintenanceExcessCheckFailedDto;
            }
            if ((i & 16) == 0) {
                this.borrowing_limit_check_failed = null;
            } else {
                this.borrowing_limit_check_failed = borrowingLimitCheckFailedDto;
            }
            if ((i & 32) == 0) {
                this.transfer_limit_check_failed = null;
            } else {
                this.transfer_limit_check_failed = transferLimitCheckFailedDto;
            }
            if ((i & 64) == 0) {
                this.unsettled_positions_check_failed = null;
            } else {
                this.unsettled_positions_check_failed = unsettledPositionsCheckFailedDto;
            }
            if ((i & 128) == 0) {
                this.negative_transfer_market_value = null;
            } else {
                this.negative_transfer_market_value = negativeTransferMarketValueDto;
            }
            if ((i & 256) == 0) {
                this.gold_boost_details = null;
            } else {
                this.gold_boost_details = goldBoostDto;
            }
            if ((i & 512) == 0) {
                this.instant_check_failed = null;
            } else {
                this.instant_check_failed = instantCheckFailedDto;
            }
            if ((i & 1024) == 0) {
                this.transfer_count_check_failed = null;
            } else {
                this.transfer_count_check_failed = transferCountCheckFailedDto;
            }
            if ((i & 2048) == 0) {
                this.empty_transfer = null;
            } else {
                this.empty_transfer = emptyTransferDto;
            }
            if ((i & 4096) == 0) {
                this.managed_account_funding_transfer_value_check_failed = null;
            } else {
                this.managed_account_funding_transfer_value_check_failed = managedAccountFundingTransferValueCheckFailedDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nimbus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Pdt25kLimitDto pdt25kLimitDto = self.pdt_25k_limit;
            if (pdt25kLimitDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, Pdt25kLimitDto.Serializer.INSTANCE, pdt25kLimitDto);
            }
            AcatsClawbackDto acatsClawbackDto = self.acats_clawback;
            if (acatsClawbackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AcatsClawbackDto.Serializer.INSTANCE, acatsClawbackDto);
            }
            TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDto = self.two_k_minimum_equity_check_failed;
            if (twoKMinimumEquityCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TwoKMinimumEquityCheckFailedDto.Serializer.INSTANCE, twoKMinimumEquityCheckFailedDto);
            }
            MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDto = self.maintenance_excess_check_failed;
            if (maintenanceExcessCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MaintenanceExcessCheckFailedDto.Serializer.INSTANCE, maintenanceExcessCheckFailedDto);
            }
            BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDto = self.borrowing_limit_check_failed;
            if (borrowingLimitCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BorrowingLimitCheckFailedDto.Serializer.INSTANCE, borrowingLimitCheckFailedDto);
            }
            TransferLimitCheckFailedDto transferLimitCheckFailedDto = self.transfer_limit_check_failed;
            if (transferLimitCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TransferLimitCheckFailedDto.Serializer.INSTANCE, transferLimitCheckFailedDto);
            }
            UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDto = self.unsettled_positions_check_failed;
            if (unsettledPositionsCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, UnsettledPositionsCheckFailedDto.Serializer.INSTANCE, unsettledPositionsCheckFailedDto);
            }
            NegativeTransferMarketValueDto negativeTransferMarketValueDto = self.negative_transfer_market_value;
            if (negativeTransferMarketValueDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, NegativeTransferMarketValueDto.Serializer.INSTANCE, negativeTransferMarketValueDto);
            }
            GoldBoostDto goldBoostDto = self.gold_boost_details;
            if (goldBoostDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GoldBoostDto.Serializer.INSTANCE, goldBoostDto);
            }
            InstantCheckFailedDto instantCheckFailedDto = self.instant_check_failed;
            if (instantCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, InstantCheckFailedDto.Serializer.INSTANCE, instantCheckFailedDto);
            }
            TransferCountCheckFailedDto transferCountCheckFailedDto = self.transfer_count_check_failed;
            if (transferCountCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, TransferCountCheckFailedDto.Serializer.INSTANCE, transferCountCheckFailedDto);
            }
            EmptyTransferDto emptyTransferDto = self.empty_transfer;
            if (emptyTransferDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, EmptyTransferDto.Serializer.INSTANCE, emptyTransferDto);
            }
            ManagedAccountFundingTransferValueCheckFailedDto managedAccountFundingTransferValueCheckFailedDto = self.managed_account_funding_transfer_value_check_failed;
            if (managedAccountFundingTransferValueCheckFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, ManagedAccountFundingTransferValueCheckFailedDto.Serializer.INSTANCE, managedAccountFundingTransferValueCheckFailedDto);
            }
        }

        public Surrogate(Pdt25kLimitDto pdt25kLimitDto, AcatsClawbackDto acatsClawbackDto, TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDto, MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDto, BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDto, TransferLimitCheckFailedDto transferLimitCheckFailedDto, UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDto, NegativeTransferMarketValueDto negativeTransferMarketValueDto, GoldBoostDto goldBoostDto, InstantCheckFailedDto instantCheckFailedDto, TransferCountCheckFailedDto transferCountCheckFailedDto, EmptyTransferDto emptyTransferDto, ManagedAccountFundingTransferValueCheckFailedDto managedAccountFundingTransferValueCheckFailedDto) {
            this.pdt_25k_limit = pdt25kLimitDto;
            this.acats_clawback = acatsClawbackDto;
            this.two_k_minimum_equity_check_failed = twoKMinimumEquityCheckFailedDto;
            this.maintenance_excess_check_failed = maintenanceExcessCheckFailedDto;
            this.borrowing_limit_check_failed = borrowingLimitCheckFailedDto;
            this.transfer_limit_check_failed = transferLimitCheckFailedDto;
            this.unsettled_positions_check_failed = unsettledPositionsCheckFailedDto;
            this.negative_transfer_market_value = negativeTransferMarketValueDto;
            this.gold_boost_details = goldBoostDto;
            this.instant_check_failed = instantCheckFailedDto;
            this.transfer_count_check_failed = transferCountCheckFailedDto;
            this.empty_transfer = emptyTransferDto;
            this.managed_account_funding_transfer_value_check_failed = managedAccountFundingTransferValueCheckFailedDto;
        }

        public /* synthetic */ Surrogate(Pdt25kLimitDto pdt25kLimitDto, AcatsClawbackDto acatsClawbackDto, TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDto, MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDto, BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDto, TransferLimitCheckFailedDto transferLimitCheckFailedDto, UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDto, NegativeTransferMarketValueDto negativeTransferMarketValueDto, GoldBoostDto goldBoostDto, InstantCheckFailedDto instantCheckFailedDto, TransferCountCheckFailedDto transferCountCheckFailedDto, EmptyTransferDto emptyTransferDto, ManagedAccountFundingTransferValueCheckFailedDto managedAccountFundingTransferValueCheckFailedDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pdt25kLimitDto, (i & 2) != 0 ? null : acatsClawbackDto, (i & 4) != 0 ? null : twoKMinimumEquityCheckFailedDto, (i & 8) != 0 ? null : maintenanceExcessCheckFailedDto, (i & 16) != 0 ? null : borrowingLimitCheckFailedDto, (i & 32) != 0 ? null : transferLimitCheckFailedDto, (i & 64) != 0 ? null : unsettledPositionsCheckFailedDto, (i & 128) != 0 ? null : negativeTransferMarketValueDto, (i & 256) != 0 ? null : goldBoostDto, (i & 512) != 0 ? null : instantCheckFailedDto, (i & 1024) != 0 ? null : transferCountCheckFailedDto, (i & 2048) != 0 ? null : emptyTransferDto, (i & 4096) != 0 ? null : managedAccountFundingTransferValueCheckFailedDto);
        }

        public final Pdt25kLimitDto getPdt_25k_limit() {
            return this.pdt_25k_limit;
        }

        public final AcatsClawbackDto getAcats_clawback() {
            return this.acats_clawback;
        }

        public final TwoKMinimumEquityCheckFailedDto getTwo_k_minimum_equity_check_failed() {
            return this.two_k_minimum_equity_check_failed;
        }

        public final MaintenanceExcessCheckFailedDto getMaintenance_excess_check_failed() {
            return this.maintenance_excess_check_failed;
        }

        public final BorrowingLimitCheckFailedDto getBorrowing_limit_check_failed() {
            return this.borrowing_limit_check_failed;
        }

        public final TransferLimitCheckFailedDto getTransfer_limit_check_failed() {
            return this.transfer_limit_check_failed;
        }

        public final UnsettledPositionsCheckFailedDto getUnsettled_positions_check_failed() {
            return this.unsettled_positions_check_failed;
        }

        public final NegativeTransferMarketValueDto getNegative_transfer_market_value() {
            return this.negative_transfer_market_value;
        }

        public final GoldBoostDto getGold_boost_details() {
            return this.gold_boost_details;
        }

        public final InstantCheckFailedDto getInstant_check_failed() {
            return this.instant_check_failed;
        }

        public final TransferCountCheckFailedDto getTransfer_count_check_failed() {
            return this.transfer_count_check_failed;
        }

        public final EmptyTransferDto getEmpty_transfer() {
            return this.empty_transfer;
        }

        public final ManagedAccountFundingTransferValueCheckFailedDto getManaged_account_funding_transfer_value_check_failed() {
            return this.managed_account_funding_transfer_value_check_failed;
        }
    }

    /* compiled from: PreSubmissionWarningTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto;", "Lnimbus/service/v1/PreSubmissionWarningType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/PreSubmissionWarningTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PreSubmissionWarningTypeDto, PreSubmissionWarningType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreSubmissionWarningTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionWarningTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionWarningTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) PreSubmissionWarningTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PreSubmissionWarningType> getProtoAdapter() {
            return PreSubmissionWarningType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionWarningTypeDto getZeroValue() {
            return PreSubmissionWarningTypeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionWarningTypeDto fromProto(PreSubmissionWarningType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Pdt25kLimit pdt_25k_limit = proto.getPdt_25k_limit();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Pdt25kLimitDto pdt25kLimitDtoFromProto = pdt_25k_limit != null ? Pdt25kLimitDto.INSTANCE.fromProto(pdt_25k_limit) : null;
            AcatsClawback acats_clawback = proto.getAcats_clawback();
            AcatsClawbackDto acatsClawbackDtoFromProto = acats_clawback != null ? AcatsClawbackDto.INSTANCE.fromProto(acats_clawback) : null;
            TwoKMinimumEquityCheckFailed two_k_minimum_equity_check_failed = proto.getTwo_k_minimum_equity_check_failed();
            TwoKMinimumEquityCheckFailedDto twoKMinimumEquityCheckFailedDtoFromProto = two_k_minimum_equity_check_failed != null ? TwoKMinimumEquityCheckFailedDto.INSTANCE.fromProto(two_k_minimum_equity_check_failed) : null;
            MaintenanceExcessCheckFailed maintenance_excess_check_failed = proto.getMaintenance_excess_check_failed();
            MaintenanceExcessCheckFailedDto maintenanceExcessCheckFailedDtoFromProto = maintenance_excess_check_failed != null ? MaintenanceExcessCheckFailedDto.INSTANCE.fromProto(maintenance_excess_check_failed) : null;
            BorrowingLimitCheckFailed borrowing_limit_check_failed = proto.getBorrowing_limit_check_failed();
            BorrowingLimitCheckFailedDto borrowingLimitCheckFailedDtoFromProto = borrowing_limit_check_failed != null ? BorrowingLimitCheckFailedDto.INSTANCE.fromProto(borrowing_limit_check_failed) : null;
            TransferLimitCheckFailed transfer_limit_check_failed = proto.getTransfer_limit_check_failed();
            TransferLimitCheckFailedDto transferLimitCheckFailedDtoFromProto = transfer_limit_check_failed != null ? TransferLimitCheckFailedDto.INSTANCE.fromProto(transfer_limit_check_failed) : null;
            UnsettledPositionsCheckFailed unsettled_positions_check_failed = proto.getUnsettled_positions_check_failed();
            UnsettledPositionsCheckFailedDto unsettledPositionsCheckFailedDtoFromProto = unsettled_positions_check_failed != null ? UnsettledPositionsCheckFailedDto.INSTANCE.fromProto(unsettled_positions_check_failed) : null;
            NegativeTransferMarketValue negative_transfer_market_value = proto.getNegative_transfer_market_value();
            NegativeTransferMarketValueDto negativeTransferMarketValueDtoFromProto = negative_transfer_market_value != null ? NegativeTransferMarketValueDto.INSTANCE.fromProto(negative_transfer_market_value) : null;
            GoldBoost gold_boost_details = proto.getGold_boost_details();
            GoldBoostDto goldBoostDtoFromProto = gold_boost_details != null ? GoldBoostDto.INSTANCE.fromProto(gold_boost_details) : null;
            InstantCheckFailed instant_check_failed = proto.getInstant_check_failed();
            InstantCheckFailedDto instantCheckFailedDtoFromProto = instant_check_failed != null ? InstantCheckFailedDto.INSTANCE.fromProto(instant_check_failed) : null;
            TransferCountCheckFailed transfer_count_check_failed = proto.getTransfer_count_check_failed();
            TransferCountCheckFailedDto transferCountCheckFailedDtoFromProto = transfer_count_check_failed != null ? TransferCountCheckFailedDto.INSTANCE.fromProto(transfer_count_check_failed) : null;
            EmptyTransfer empty_transfer = proto.getEmpty_transfer();
            EmptyTransferDto emptyTransferDtoFromProto = empty_transfer != null ? EmptyTransferDto.INSTANCE.fromProto(empty_transfer) : null;
            ManagedAccountFundingTransferValueCheckFailed managed_account_funding_transfer_value_check_failed = proto.getManaged_account_funding_transfer_value_check_failed();
            return new PreSubmissionWarningTypeDto(new Surrogate(pdt25kLimitDtoFromProto, acatsClawbackDtoFromProto, twoKMinimumEquityCheckFailedDtoFromProto, maintenanceExcessCheckFailedDtoFromProto, borrowingLimitCheckFailedDtoFromProto, transferLimitCheckFailedDtoFromProto, unsettledPositionsCheckFailedDtoFromProto, negativeTransferMarketValueDtoFromProto, goldBoostDtoFromProto, instantCheckFailedDtoFromProto, transferCountCheckFailedDtoFromProto, emptyTransferDtoFromProto, managed_account_funding_transfer_value_check_failed != null ? ManagedAccountFundingTransferValueCheckFailedDto.INSTANCE.fromProto(managed_account_funding_transfer_value_check_failed) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.PreSubmissionWarningTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreSubmissionWarningTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PreSubmissionWarningTypeDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PreSubmissionWarningTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Pdt25kLimit", "AcatsClawback", "TwoKMinimumEquityCheckFailed", "MaintenanceExcessCheckFailed", "BorrowingLimitCheckFailed", "TransferLimitCheckFailed", "UnsettledPositionsCheckFailed", "NegativeTransferMarketValue", "GoldBoostDetails", "InstantCheckFailed", "TransferCountCheckFailed", "EmptyTransfer", "ManagedAccountFundingTransferValueCheckFailed", "Companion", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$AcatsClawback;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$BorrowingLimitCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$EmptyTransfer;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$GoldBoostDetails;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$InstantCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$MaintenanceExcessCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$ManagedAccountFundingTransferValueCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$NegativeTransferMarketValue;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$Pdt25kLimit;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TransferCountCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TransferLimitCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TwoKMinimumEquityCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$UnsettledPositionsCheckFailed;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class WarningTypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ WarningTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private WarningTypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$Pdt25kLimit;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/Pdt25kLimitDto;", "value", "<init>", "(Lnimbus/service/v1/Pdt25kLimitDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/Pdt25kLimitDto;", "getValue", "()Lnimbus/service/v1/Pdt25kLimitDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Pdt25kLimit extends WarningTypeDto {
            private final Pdt25kLimitDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pdt25kLimit) && Intrinsics.areEqual(this.value, ((Pdt25kLimit) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Pdt25kLimit(value=" + this.value + ")";
            }

            public final Pdt25kLimitDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pdt25kLimit(Pdt25kLimitDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$AcatsClawback;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/AcatsClawbackDto;", "value", "<init>", "(Lnimbus/service/v1/AcatsClawbackDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/AcatsClawbackDto;", "getValue", "()Lnimbus/service/v1/AcatsClawbackDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AcatsClawback extends WarningTypeDto {
            private final AcatsClawbackDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AcatsClawback) && Intrinsics.areEqual(this.value, ((AcatsClawback) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AcatsClawback(value=" + this.value + ")";
            }

            public final AcatsClawbackDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AcatsClawback(AcatsClawbackDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TwoKMinimumEquityCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "getValue", "()Lnimbus/service/v1/TwoKMinimumEquityCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TwoKMinimumEquityCheckFailed extends WarningTypeDto {
            private final TwoKMinimumEquityCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TwoKMinimumEquityCheckFailed) && Intrinsics.areEqual(this.value, ((TwoKMinimumEquityCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TwoKMinimumEquityCheckFailed(value=" + this.value + ")";
            }

            public final TwoKMinimumEquityCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TwoKMinimumEquityCheckFailed(TwoKMinimumEquityCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$MaintenanceExcessCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "getValue", "()Lnimbus/service/v1/MaintenanceExcessCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MaintenanceExcessCheckFailed extends WarningTypeDto {
            private final MaintenanceExcessCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MaintenanceExcessCheckFailed) && Intrinsics.areEqual(this.value, ((MaintenanceExcessCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MaintenanceExcessCheckFailed(value=" + this.value + ")";
            }

            public final MaintenanceExcessCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MaintenanceExcessCheckFailed(MaintenanceExcessCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$BorrowingLimitCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/BorrowingLimitCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "getValue", "()Lnimbus/service/v1/BorrowingLimitCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BorrowingLimitCheckFailed extends WarningTypeDto {
            private final BorrowingLimitCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BorrowingLimitCheckFailed) && Intrinsics.areEqual(this.value, ((BorrowingLimitCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BorrowingLimitCheckFailed(value=" + this.value + ")";
            }

            public final BorrowingLimitCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BorrowingLimitCheckFailed(BorrowingLimitCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TransferLimitCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/TransferLimitCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/TransferLimitCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/TransferLimitCheckFailedDto;", "getValue", "()Lnimbus/service/v1/TransferLimitCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TransferLimitCheckFailed extends WarningTypeDto {
            private final TransferLimitCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransferLimitCheckFailed) && Intrinsics.areEqual(this.value, ((TransferLimitCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TransferLimitCheckFailed(value=" + this.value + ")";
            }

            public final TransferLimitCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransferLimitCheckFailed(TransferLimitCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$UnsettledPositionsCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "getValue", "()Lnimbus/service/v1/UnsettledPositionsCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnsettledPositionsCheckFailed extends WarningTypeDto {
            private final UnsettledPositionsCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnsettledPositionsCheckFailed) && Intrinsics.areEqual(this.value, ((UnsettledPositionsCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UnsettledPositionsCheckFailed(value=" + this.value + ")";
            }

            public final UnsettledPositionsCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsettledPositionsCheckFailed(UnsettledPositionsCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$NegativeTransferMarketValue;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/NegativeTransferMarketValueDto;", "value", "<init>", "(Lnimbus/service/v1/NegativeTransferMarketValueDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/NegativeTransferMarketValueDto;", "getValue", "()Lnimbus/service/v1/NegativeTransferMarketValueDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NegativeTransferMarketValue extends WarningTypeDto {
            private final NegativeTransferMarketValueDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NegativeTransferMarketValue) && Intrinsics.areEqual(this.value, ((NegativeTransferMarketValue) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NegativeTransferMarketValue(value=" + this.value + ")";
            }

            public final NegativeTransferMarketValueDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NegativeTransferMarketValue(NegativeTransferMarketValueDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$GoldBoostDetails;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/GoldBoostDto;", "value", "<init>", "(Lnimbus/service/v1/GoldBoostDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/GoldBoostDto;", "getValue", "()Lnimbus/service/v1/GoldBoostDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GoldBoostDetails extends WarningTypeDto {
            private final GoldBoostDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoldBoostDetails) && Intrinsics.areEqual(this.value, ((GoldBoostDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GoldBoostDetails(value=" + this.value + ")";
            }

            public final GoldBoostDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoldBoostDetails(GoldBoostDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$InstantCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/InstantCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/InstantCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/InstantCheckFailedDto;", "getValue", "()Lnimbus/service/v1/InstantCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InstantCheckFailed extends WarningTypeDto {
            private final InstantCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InstantCheckFailed) && Intrinsics.areEqual(this.value, ((InstantCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InstantCheckFailed(value=" + this.value + ")";
            }

            public final InstantCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstantCheckFailed(InstantCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$TransferCountCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/TransferCountCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/TransferCountCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/TransferCountCheckFailedDto;", "getValue", "()Lnimbus/service/v1/TransferCountCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class TransferCountCheckFailed extends WarningTypeDto {
            private final TransferCountCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransferCountCheckFailed) && Intrinsics.areEqual(this.value, ((TransferCountCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TransferCountCheckFailed(value=" + this.value + ")";
            }

            public final TransferCountCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransferCountCheckFailed(TransferCountCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$EmptyTransfer;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/EmptyTransferDto;", "value", "<init>", "(Lnimbus/service/v1/EmptyTransferDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/EmptyTransferDto;", "getValue", "()Lnimbus/service/v1/EmptyTransferDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class EmptyTransfer extends WarningTypeDto {
            private final EmptyTransferDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmptyTransfer) && Intrinsics.areEqual(this.value, ((EmptyTransfer) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EmptyTransfer(value=" + this.value + ")";
            }

            public final EmptyTransferDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmptyTransfer(EmptyTransferDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$ManagedAccountFundingTransferValueCheckFailed;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "value", "<init>", "(Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "getValue", "()Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailedDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class ManagedAccountFundingTransferValueCheckFailed extends WarningTypeDto {
            private final ManagedAccountFundingTransferValueCheckFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ManagedAccountFundingTransferValueCheckFailed) && Intrinsics.areEqual(this.value, ((ManagedAccountFundingTransferValueCheckFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ManagedAccountFundingTransferValueCheckFailed(value=" + this.value + ")";
            }

            public final ManagedAccountFundingTransferValueCheckFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ManagedAccountFundingTransferValueCheckFailed(ManagedAccountFundingTransferValueCheckFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PreSubmissionWarningTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto;", "Lnimbus/service/v1/PreSubmissionWarningType;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion implements Dto4.Creator<WarningTypeDto, PreSubmissionWarningType> {
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
            public ProtoAdapter<PreSubmissionWarningType> getProtoAdapter() {
                return PreSubmissionWarningType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WarningTypeDto fromProto(PreSubmissionWarningType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPdt_25k_limit() != null) {
                    return new Pdt25kLimit(Pdt25kLimitDto.INSTANCE.fromProto(proto.getPdt_25k_limit()));
                }
                if (proto.getAcats_clawback() != null) {
                    return new AcatsClawback(AcatsClawbackDto.INSTANCE.fromProto(proto.getAcats_clawback()));
                }
                if (proto.getTwo_k_minimum_equity_check_failed() != null) {
                    return new TwoKMinimumEquityCheckFailed(TwoKMinimumEquityCheckFailedDto.INSTANCE.fromProto(proto.getTwo_k_minimum_equity_check_failed()));
                }
                if (proto.getMaintenance_excess_check_failed() != null) {
                    return new MaintenanceExcessCheckFailed(MaintenanceExcessCheckFailedDto.INSTANCE.fromProto(proto.getMaintenance_excess_check_failed()));
                }
                if (proto.getBorrowing_limit_check_failed() != null) {
                    return new BorrowingLimitCheckFailed(BorrowingLimitCheckFailedDto.INSTANCE.fromProto(proto.getBorrowing_limit_check_failed()));
                }
                if (proto.getTransfer_limit_check_failed() != null) {
                    return new TransferLimitCheckFailed(TransferLimitCheckFailedDto.INSTANCE.fromProto(proto.getTransfer_limit_check_failed()));
                }
                if (proto.getUnsettled_positions_check_failed() != null) {
                    return new UnsettledPositionsCheckFailed(UnsettledPositionsCheckFailedDto.INSTANCE.fromProto(proto.getUnsettled_positions_check_failed()));
                }
                if (proto.getNegative_transfer_market_value() != null) {
                    return new NegativeTransferMarketValue(NegativeTransferMarketValueDto.INSTANCE.fromProto(proto.getNegative_transfer_market_value()));
                }
                if (proto.getGold_boost_details() != null) {
                    return new GoldBoostDetails(GoldBoostDto.INSTANCE.fromProto(proto.getGold_boost_details()));
                }
                if (proto.getInstant_check_failed() != null) {
                    return new InstantCheckFailed(InstantCheckFailedDto.INSTANCE.fromProto(proto.getInstant_check_failed()));
                }
                if (proto.getTransfer_count_check_failed() != null) {
                    return new TransferCountCheckFailed(TransferCountCheckFailedDto.INSTANCE.fromProto(proto.getTransfer_count_check_failed()));
                }
                if (proto.getEmpty_transfer() != null) {
                    return new EmptyTransfer(EmptyTransferDto.INSTANCE.fromProto(proto.getEmpty_transfer()));
                }
                if (proto.getManaged_account_funding_transfer_value_check_failed() != null) {
                    return new ManagedAccountFundingTransferValueCheckFailed(ManagedAccountFundingTransferValueCheckFailedDto.INSTANCE.fromProto(proto.getManaged_account_funding_transfer_value_check_failed()));
                }
                return null;
            }
        }
    }

    /* compiled from: PreSubmissionWarningTypeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionWarningTypeDto;", "<init>", "()V", "surrogateSerializer", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<PreSubmissionWarningTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nimbus.service.v1.PreSubmissionWarningType", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PreSubmissionWarningTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PreSubmissionWarningTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PreSubmissionWarningTypeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PreSubmissionWarningTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningTypeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "nimbus.service.v1.PreSubmissionWarningTypeDto";
        }
    }
}
