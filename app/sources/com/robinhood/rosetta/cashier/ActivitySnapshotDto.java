package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto;
import com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto;
import com.robinhood.rosetta.cashier.ACHTransferDetailsDto;
import com.robinhood.rosetta.cashier.ActivitySnapshot;
import com.robinhood.rosetta.cashier.ActivitySnapshotDto;
import com.robinhood.rosetta.cashier.BankBalanceDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto;
import com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto;
import com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetailsDto;
import com.robinhood.rosetta.cashier.PlaidSignalDetailsDto;
import com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto;
import com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto;
import com.robinhood.rosetta.common.RequestContext;
import com.robinhood.rosetta.common.RequestContextDto;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ActivitySnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 }2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t~}\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0006\u0010\u001cJ\u0087\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u00106R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010H\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010L\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010T\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010\\\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010d\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010l\u001a\u0004\u0018\u00010i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010p\u001a\u0004\u0018\u00010m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010t\u001a\u0004\u0018\u00010q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0013\u0010x\u001a\u0004\u0018\u00010u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010|\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;)V", "Lokio/ByteString;", "object_id", "", "account_number", "", "account_id", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "context", "ordering_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/rosetta/common/RequestContextDto;", "request_context", "Lcom/robinhood/rosetta/i18n/LocalityDto;", PlaceTypes.COUNTRY, "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContextDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;)V", "copy", "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContextDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;)Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "getObject_id", "()Lokio/ByteString;", "getAccount_number", "()J", "getAccount_id", "getType", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "getTimestamp", "()Lj$/time/Instant;", "getContext", "getOrdering_id", "getUser_id", "getRequest_context", "()Lcom/robinhood/rosetta/common/RequestContextDto;", "getCountry", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "getDetails", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "getAch_relationship_details", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "ach_relationship_details", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "getAch_transfer_details", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "ach_transfer_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "getCheckout_card_relationship_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "checkout_card_relationship_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "getCheckout_card_deposit_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "checkout_card_deposit_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "getCheckout_card_withdrawal_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "checkout_card_withdrawal_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "getCheckout_card_dispute_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "checkout_card_dispute_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "getCheckout_card_dispute_fee_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "checkout_card_dispute_fee_details", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "getBank_balance_details", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "bank_balance_details", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "getIav_queued_deposit_details", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "iav_queued_deposit_details", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "getReceived_ach_transfer_details", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "received_ach_transfer_details", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "getReceived_instant_bank_transfer_details", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "received_instant_bank_transfer_details", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "getPlaid_signal_details", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "plaid_signal_details", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "getAch_deposit_schedule_details", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "ach_deposit_schedule_details", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "getPlaid_identity_update_details", "()Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "plaid_identity_update_details", "Companion", "Surrogate", "DetailsDto", "TypeDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ActivitySnapshotDto implements Dto3<ActivitySnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActivitySnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActivitySnapshotDto, ActivitySnapshot>> binaryBase64Serializer$delegate;
    private static final ActivitySnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActivitySnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActivitySnapshotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getObject_id() {
        return this.surrogate.getObject_id();
    }

    public final long getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final TypeDto getType() {
        return this.surrogate.getType();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getContext() {
        return this.surrogate.getContext();
    }

    public final long getOrdering_id() {
        return this.surrogate.getOrdering_id();
    }

    public final ByteString getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final RequestContextDto getRequest_context() {
        return this.surrogate.getRequest_context();
    }

    public final LocalityDto getCountry() {
        return this.surrogate.getCountry();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getAch_relationship_details() != null) {
            return new DetailsDto.AchRelationshipDetails(this.surrogate.getAch_relationship_details());
        }
        if (this.surrogate.getAch_transfer_details() != null) {
            return new DetailsDto.AchTransferDetails(this.surrogate.getAch_transfer_details());
        }
        if (this.surrogate.getCheckout_card_relationship_details() != null) {
            return new DetailsDto.CheckoutCardRelationshipDetails(this.surrogate.getCheckout_card_relationship_details());
        }
        if (this.surrogate.getCheckout_card_deposit_details() != null) {
            return new DetailsDto.CheckoutCardDepositDetails(this.surrogate.getCheckout_card_deposit_details());
        }
        if (this.surrogate.getCheckout_card_withdrawal_details() != null) {
            return new DetailsDto.CheckoutCardWithdrawalDetails(this.surrogate.getCheckout_card_withdrawal_details());
        }
        if (this.surrogate.getCheckout_card_dispute_details() != null) {
            return new DetailsDto.CheckoutCardDisputeDetails(this.surrogate.getCheckout_card_dispute_details());
        }
        if (this.surrogate.getCheckout_card_dispute_fee_details() != null) {
            return new DetailsDto.CheckoutCardDisputeFeeDetails(this.surrogate.getCheckout_card_dispute_fee_details());
        }
        if (this.surrogate.getBank_balance_details() != null) {
            return new DetailsDto.BankBalanceDetails(this.surrogate.getBank_balance_details());
        }
        if (this.surrogate.getIav_queued_deposit_details() != null) {
            return new DetailsDto.IavQueuedDepositDetails(this.surrogate.getIav_queued_deposit_details());
        }
        if (this.surrogate.getReceived_ach_transfer_details() != null) {
            return new DetailsDto.ReceivedAchTransferDetails(this.surrogate.getReceived_ach_transfer_details());
        }
        if (this.surrogate.getReceived_instant_bank_transfer_details() != null) {
            return new DetailsDto.ReceivedInstantBankTransferDetails(this.surrogate.getReceived_instant_bank_transfer_details());
        }
        if (this.surrogate.getPlaid_signal_details() != null) {
            return new DetailsDto.PlaidSignalDetails(this.surrogate.getPlaid_signal_details());
        }
        if (this.surrogate.getAch_deposit_schedule_details() != null) {
            return new DetailsDto.AchDepositScheduleDetails(this.surrogate.getAch_deposit_schedule_details());
        }
        if (this.surrogate.getPlaid_identity_update_details() != null) {
            return new DetailsDto.PlaidIdentityUpdateDetails(this.surrogate.getPlaid_identity_update_details());
        }
        return null;
    }

    public final ACHRelationshipDetailsDto getAch_relationship_details() {
        return this.surrogate.getAch_relationship_details();
    }

    public final ACHTransferDetailsDto getAch_transfer_details() {
        return this.surrogate.getAch_transfer_details();
    }

    public final CheckoutCardRelationshipDetailsDto getCheckout_card_relationship_details() {
        return this.surrogate.getCheckout_card_relationship_details();
    }

    public final CheckoutCardDepositDetailsDto getCheckout_card_deposit_details() {
        return this.surrogate.getCheckout_card_deposit_details();
    }

    public final CheckoutCardWithdrawalDetailsDto getCheckout_card_withdrawal_details() {
        return this.surrogate.getCheckout_card_withdrawal_details();
    }

    public final CheckoutCardDisputeDetailsDto getCheckout_card_dispute_details() {
        return this.surrogate.getCheckout_card_dispute_details();
    }

    public final CheckoutCardDisputeFeeDetailsDto getCheckout_card_dispute_fee_details() {
        return this.surrogate.getCheckout_card_dispute_fee_details();
    }

    public final BankBalanceDetailsDto getBank_balance_details() {
        return this.surrogate.getBank_balance_details();
    }

    public final IAVQueuedDepositDetailsDto getIav_queued_deposit_details() {
        return this.surrogate.getIav_queued_deposit_details();
    }

    public final ReceivedACHTransferDetailsDto getReceived_ach_transfer_details() {
        return this.surrogate.getReceived_ach_transfer_details();
    }

    public final ReceivedInstantBankTransferDetailsDto getReceived_instant_bank_transfer_details() {
        return this.surrogate.getReceived_instant_bank_transfer_details();
    }

    public final PlaidSignalDetailsDto getPlaid_signal_details() {
        return this.surrogate.getPlaid_signal_details();
    }

    public final ACHDepositScheduleDetailsDto getAch_deposit_schedule_details() {
        return this.surrogate.getAch_deposit_schedule_details();
    }

    public final PlaidIdentityUpdateDetailsDto getPlaid_identity_update_details() {
        return this.surrogate.getPlaid_identity_update_details();
    }

    public /* synthetic */ ActivitySnapshotDto(ByteString byteString, long j, String str, TypeDto typeDto, Instant instant, String str2, long j2, ByteString byteString2, RequestContextDto requestContextDto, LocalityDto localityDto, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? str2 : "", (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? ByteString.EMPTY : byteString2, (i & 256) != 0 ? null : requestContextDto, (i & 512) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 1024) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySnapshotDto(ByteString object_id, long j, String account_id, TypeDto type2, Instant instant, String context, long j2, ByteString user_id, RequestContextDto requestContextDto, LocalityDto country, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(country, "country");
        DetailsDto.AchRelationshipDetails achRelationshipDetails = detailsDto instanceof DetailsDto.AchRelationshipDetails ? (DetailsDto.AchRelationshipDetails) detailsDto : null;
        ACHRelationshipDetailsDto value = achRelationshipDetails != null ? achRelationshipDetails.getValue() : null;
        DetailsDto.AchTransferDetails achTransferDetails = detailsDto instanceof DetailsDto.AchTransferDetails ? (DetailsDto.AchTransferDetails) detailsDto : null;
        ACHTransferDetailsDto value2 = achTransferDetails != null ? achTransferDetails.getValue() : null;
        DetailsDto.CheckoutCardRelationshipDetails checkoutCardRelationshipDetails = detailsDto instanceof DetailsDto.CheckoutCardRelationshipDetails ? (DetailsDto.CheckoutCardRelationshipDetails) detailsDto : null;
        CheckoutCardRelationshipDetailsDto value3 = checkoutCardRelationshipDetails != null ? checkoutCardRelationshipDetails.getValue() : null;
        DetailsDto.CheckoutCardDepositDetails checkoutCardDepositDetails = detailsDto instanceof DetailsDto.CheckoutCardDepositDetails ? (DetailsDto.CheckoutCardDepositDetails) detailsDto : null;
        CheckoutCardDepositDetailsDto value4 = checkoutCardDepositDetails != null ? checkoutCardDepositDetails.getValue() : null;
        DetailsDto.CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails = detailsDto instanceof DetailsDto.CheckoutCardWithdrawalDetails ? (DetailsDto.CheckoutCardWithdrawalDetails) detailsDto : null;
        CheckoutCardWithdrawalDetailsDto value5 = checkoutCardWithdrawalDetails != null ? checkoutCardWithdrawalDetails.getValue() : null;
        DetailsDto.CheckoutCardDisputeDetails checkoutCardDisputeDetails = detailsDto instanceof DetailsDto.CheckoutCardDisputeDetails ? (DetailsDto.CheckoutCardDisputeDetails) detailsDto : null;
        CheckoutCardDisputeDetailsDto value6 = checkoutCardDisputeDetails != null ? checkoutCardDisputeDetails.getValue() : null;
        DetailsDto.CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails = detailsDto instanceof DetailsDto.CheckoutCardDisputeFeeDetails ? (DetailsDto.CheckoutCardDisputeFeeDetails) detailsDto : null;
        CheckoutCardDisputeFeeDetailsDto value7 = checkoutCardDisputeFeeDetails != null ? checkoutCardDisputeFeeDetails.getValue() : null;
        DetailsDto.BankBalanceDetails bankBalanceDetails = detailsDto instanceof DetailsDto.BankBalanceDetails ? (DetailsDto.BankBalanceDetails) detailsDto : null;
        BankBalanceDetailsDto value8 = bankBalanceDetails != null ? bankBalanceDetails.getValue() : null;
        DetailsDto.IavQueuedDepositDetails iavQueuedDepositDetails = detailsDto instanceof DetailsDto.IavQueuedDepositDetails ? (DetailsDto.IavQueuedDepositDetails) detailsDto : null;
        IAVQueuedDepositDetailsDto value9 = iavQueuedDepositDetails != null ? iavQueuedDepositDetails.getValue() : null;
        DetailsDto.ReceivedAchTransferDetails receivedAchTransferDetails = detailsDto instanceof DetailsDto.ReceivedAchTransferDetails ? (DetailsDto.ReceivedAchTransferDetails) detailsDto : null;
        ReceivedACHTransferDetailsDto value10 = receivedAchTransferDetails != null ? receivedAchTransferDetails.getValue() : null;
        DetailsDto.ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails = detailsDto instanceof DetailsDto.ReceivedInstantBankTransferDetails ? (DetailsDto.ReceivedInstantBankTransferDetails) detailsDto : null;
        ReceivedInstantBankTransferDetailsDto value11 = receivedInstantBankTransferDetails != null ? receivedInstantBankTransferDetails.getValue() : null;
        DetailsDto.PlaidSignalDetails plaidSignalDetails = detailsDto instanceof DetailsDto.PlaidSignalDetails ? (DetailsDto.PlaidSignalDetails) detailsDto : null;
        PlaidSignalDetailsDto value12 = plaidSignalDetails != null ? plaidSignalDetails.getValue() : null;
        DetailsDto.AchDepositScheduleDetails achDepositScheduleDetails = detailsDto instanceof DetailsDto.AchDepositScheduleDetails ? (DetailsDto.AchDepositScheduleDetails) detailsDto : null;
        ACHDepositScheduleDetailsDto value13 = achDepositScheduleDetails != null ? achDepositScheduleDetails.getValue() : null;
        DetailsDto.PlaidIdentityUpdateDetails plaidIdentityUpdateDetails = detailsDto instanceof DetailsDto.PlaidIdentityUpdateDetails ? (DetailsDto.PlaidIdentityUpdateDetails) detailsDto : null;
        this(new Surrogate(object_id, j, account_id, type2, instant, context, j2, user_id, requestContextDto, country, value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, plaidIdentityUpdateDetails != null ? plaidIdentityUpdateDetails.getValue() : null));
    }

    public static /* synthetic */ ActivitySnapshotDto copy$default(ActivitySnapshotDto activitySnapshotDto, ByteString byteString, long j, String str, TypeDto typeDto, Instant instant, String str2, long j2, ByteString byteString2, RequestContextDto requestContextDto, LocalityDto localityDto, DetailsDto detailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = activitySnapshotDto.surrogate.getObject_id();
        }
        return activitySnapshotDto.copy(byteString, (i & 2) != 0 ? activitySnapshotDto.surrogate.getAccount_number() : j, (i & 4) != 0 ? activitySnapshotDto.surrogate.getAccount_id() : str, (i & 8) != 0 ? activitySnapshotDto.surrogate.getType() : typeDto, (i & 16) != 0 ? activitySnapshotDto.surrogate.getTimestamp() : instant, (i & 32) != 0 ? activitySnapshotDto.surrogate.getContext() : str2, (i & 64) != 0 ? activitySnapshotDto.surrogate.getOrdering_id() : j2, (i & 128) != 0 ? activitySnapshotDto.surrogate.getUser_id() : byteString2, (i & 256) != 0 ? activitySnapshotDto.surrogate.getRequest_context() : requestContextDto, (i & 512) != 0 ? activitySnapshotDto.surrogate.getCountry() : localityDto, (i & 1024) != 0 ? activitySnapshotDto.getDetails() : detailsDto);
    }

    public final ActivitySnapshotDto copy(ByteString object_id, long account_number, String account_id, TypeDto type2, Instant timestamp, String context, long ordering_id, ByteString user_id, RequestContextDto request_context, LocalityDto country, DetailsDto details) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(country, "country");
        DetailsDto.AchRelationshipDetails achRelationshipDetails = details instanceof DetailsDto.AchRelationshipDetails ? (DetailsDto.AchRelationshipDetails) details : null;
        ACHRelationshipDetailsDto value = achRelationshipDetails != null ? achRelationshipDetails.getValue() : null;
        DetailsDto.AchTransferDetails achTransferDetails = details instanceof DetailsDto.AchTransferDetails ? (DetailsDto.AchTransferDetails) details : null;
        ACHTransferDetailsDto value2 = achTransferDetails != null ? achTransferDetails.getValue() : null;
        DetailsDto.CheckoutCardRelationshipDetails checkoutCardRelationshipDetails = details instanceof DetailsDto.CheckoutCardRelationshipDetails ? (DetailsDto.CheckoutCardRelationshipDetails) details : null;
        CheckoutCardRelationshipDetailsDto value3 = checkoutCardRelationshipDetails != null ? checkoutCardRelationshipDetails.getValue() : null;
        DetailsDto.CheckoutCardDepositDetails checkoutCardDepositDetails = details instanceof DetailsDto.CheckoutCardDepositDetails ? (DetailsDto.CheckoutCardDepositDetails) details : null;
        CheckoutCardDepositDetailsDto value4 = checkoutCardDepositDetails != null ? checkoutCardDepositDetails.getValue() : null;
        DetailsDto.CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails = details instanceof DetailsDto.CheckoutCardWithdrawalDetails ? (DetailsDto.CheckoutCardWithdrawalDetails) details : null;
        CheckoutCardWithdrawalDetailsDto value5 = checkoutCardWithdrawalDetails != null ? checkoutCardWithdrawalDetails.getValue() : null;
        DetailsDto.CheckoutCardDisputeDetails checkoutCardDisputeDetails = details instanceof DetailsDto.CheckoutCardDisputeDetails ? (DetailsDto.CheckoutCardDisputeDetails) details : null;
        CheckoutCardDisputeDetailsDto value6 = checkoutCardDisputeDetails != null ? checkoutCardDisputeDetails.getValue() : null;
        DetailsDto.CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails = details instanceof DetailsDto.CheckoutCardDisputeFeeDetails ? (DetailsDto.CheckoutCardDisputeFeeDetails) details : null;
        CheckoutCardDisputeFeeDetailsDto value7 = checkoutCardDisputeFeeDetails != null ? checkoutCardDisputeFeeDetails.getValue() : null;
        DetailsDto.BankBalanceDetails bankBalanceDetails = details instanceof DetailsDto.BankBalanceDetails ? (DetailsDto.BankBalanceDetails) details : null;
        BankBalanceDetailsDto value8 = bankBalanceDetails != null ? bankBalanceDetails.getValue() : null;
        DetailsDto.IavQueuedDepositDetails iavQueuedDepositDetails = details instanceof DetailsDto.IavQueuedDepositDetails ? (DetailsDto.IavQueuedDepositDetails) details : null;
        IAVQueuedDepositDetailsDto value9 = iavQueuedDepositDetails != null ? iavQueuedDepositDetails.getValue() : null;
        DetailsDto.ReceivedAchTransferDetails receivedAchTransferDetails = details instanceof DetailsDto.ReceivedAchTransferDetails ? (DetailsDto.ReceivedAchTransferDetails) details : null;
        ReceivedACHTransferDetailsDto value10 = receivedAchTransferDetails != null ? receivedAchTransferDetails.getValue() : null;
        DetailsDto.ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails = details instanceof DetailsDto.ReceivedInstantBankTransferDetails ? (DetailsDto.ReceivedInstantBankTransferDetails) details : null;
        ReceivedInstantBankTransferDetailsDto value11 = receivedInstantBankTransferDetails != null ? receivedInstantBankTransferDetails.getValue() : null;
        DetailsDto.PlaidSignalDetails plaidSignalDetails = details instanceof DetailsDto.PlaidSignalDetails ? (DetailsDto.PlaidSignalDetails) details : null;
        PlaidSignalDetailsDto value12 = plaidSignalDetails != null ? plaidSignalDetails.getValue() : null;
        DetailsDto.AchDepositScheduleDetails achDepositScheduleDetails = details instanceof DetailsDto.AchDepositScheduleDetails ? (DetailsDto.AchDepositScheduleDetails) details : null;
        ACHDepositScheduleDetailsDto value13 = achDepositScheduleDetails != null ? achDepositScheduleDetails.getValue() : null;
        DetailsDto.PlaidIdentityUpdateDetails plaidIdentityUpdateDetails = details instanceof DetailsDto.PlaidIdentityUpdateDetails ? (DetailsDto.PlaidIdentityUpdateDetails) details : null;
        return new ActivitySnapshotDto(new Surrogate(object_id, account_number, account_id, type2, timestamp, context, ordering_id, user_id, request_context, country, value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, plaidIdentityUpdateDetails != null ? plaidIdentityUpdateDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ActivitySnapshot toProto() {
        ByteString object_id = this.surrogate.getObject_id();
        long account_number = this.surrogate.getAccount_number();
        String account_id = this.surrogate.getAccount_id();
        ActivitySnapshot.Type type2 = (ActivitySnapshot.Type) this.surrogate.getType().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        String context = this.surrogate.getContext();
        long ordering_id = this.surrogate.getOrdering_id();
        ByteString user_id = this.surrogate.getUser_id();
        RequestContextDto request_context = this.surrogate.getRequest_context();
        RequestContext proto = request_context != null ? request_context.toProto() : null;
        Locality locality = (Locality) this.surrogate.getCountry().toProto();
        ACHRelationshipDetailsDto ach_relationship_details = this.surrogate.getAch_relationship_details();
        ACHRelationshipDetails proto2 = ach_relationship_details != null ? ach_relationship_details.toProto() : null;
        ACHTransferDetailsDto ach_transfer_details = this.surrogate.getAch_transfer_details();
        ACHTransferDetails proto3 = ach_transfer_details != null ? ach_transfer_details.toProto() : null;
        CheckoutCardRelationshipDetailsDto checkout_card_relationship_details = this.surrogate.getCheckout_card_relationship_details();
        CheckoutCardRelationshipDetails proto4 = checkout_card_relationship_details != null ? checkout_card_relationship_details.toProto() : null;
        CheckoutCardDepositDetailsDto checkout_card_deposit_details = this.surrogate.getCheckout_card_deposit_details();
        CheckoutCardDepositDetails proto5 = checkout_card_deposit_details != null ? checkout_card_deposit_details.toProto() : null;
        CheckoutCardWithdrawalDetailsDto checkout_card_withdrawal_details = this.surrogate.getCheckout_card_withdrawal_details();
        CheckoutCardWithdrawalDetails proto6 = checkout_card_withdrawal_details != null ? checkout_card_withdrawal_details.toProto() : null;
        CheckoutCardDisputeDetailsDto checkout_card_dispute_details = this.surrogate.getCheckout_card_dispute_details();
        CheckoutCardDisputeDetails proto7 = checkout_card_dispute_details != null ? checkout_card_dispute_details.toProto() : null;
        CheckoutCardDisputeFeeDetailsDto checkout_card_dispute_fee_details = this.surrogate.getCheckout_card_dispute_fee_details();
        CheckoutCardDisputeFeeDetails proto8 = checkout_card_dispute_fee_details != null ? checkout_card_dispute_fee_details.toProto() : null;
        BankBalanceDetailsDto bank_balance_details = this.surrogate.getBank_balance_details();
        BankBalanceDetails proto9 = bank_balance_details != null ? bank_balance_details.toProto() : null;
        IAVQueuedDepositDetailsDto iav_queued_deposit_details = this.surrogate.getIav_queued_deposit_details();
        IAVQueuedDepositDetails proto10 = iav_queued_deposit_details != null ? iav_queued_deposit_details.toProto() : null;
        ReceivedACHTransferDetailsDto received_ach_transfer_details = this.surrogate.getReceived_ach_transfer_details();
        ReceivedACHTransferDetails proto11 = received_ach_transfer_details != null ? received_ach_transfer_details.toProto() : null;
        ReceivedInstantBankTransferDetailsDto received_instant_bank_transfer_details = this.surrogate.getReceived_instant_bank_transfer_details();
        ReceivedInstantBankTransferDetails proto12 = received_instant_bank_transfer_details != null ? received_instant_bank_transfer_details.toProto() : null;
        PlaidSignalDetailsDto plaid_signal_details = this.surrogate.getPlaid_signal_details();
        PlaidSignalDetails proto13 = plaid_signal_details != null ? plaid_signal_details.toProto() : null;
        ACHDepositScheduleDetailsDto ach_deposit_schedule_details = this.surrogate.getAch_deposit_schedule_details();
        ACHDepositScheduleDetails proto14 = ach_deposit_schedule_details != null ? ach_deposit_schedule_details.toProto() : null;
        PlaidIdentityUpdateDetailsDto plaid_identity_update_details = this.surrogate.getPlaid_identity_update_details();
        return new ActivitySnapshot(object_id, account_number, account_id, type2, timestamp, context, ordering_id, user_id, proto, locality, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, plaid_identity_update_details != null ? plaid_identity_update_details.toProto() : null, null, 16777216, null);
    }

    public String toString() {
        return "[ActivitySnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActivitySnapshotDto) && Intrinsics.areEqual(((ActivitySnapshotDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\bK\b\u0083\b\u0018\u0000 Á\u00012\u00020\u0001:\u0004Â\u0001Á\u0001B÷\u0002\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106B\u0087\u0002\b\u0010\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b5\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bK\u0010LJ6\u0010M\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bO\u0010JJ\u001f\u0010P\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\bP\u0010HJ\u001f\u0010Q\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\bQ\u0010FJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0080\u0003\u0010r\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u0014\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u000103HÆ\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bt\u0010JJ\u0010\u0010u\u001a\u000207HÖ\u0001¢\u0006\u0004\bu\u0010vJ\u001a\u0010y\u001a\u00020x2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\by\u0010zR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010{\u0012\u0004\b}\u0010~\u001a\u0004\b|\u0010FR1\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\t\u0010\u007f\u0012\u0005\b\u0081\u0001\u0010~\u001a\u0005\b\u0080\u0001\u0010HR#\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u000b\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010~\u001a\u0005\b\u0083\u0001\u0010JR#\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\r\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010~\u001a\u0005\b\u0086\u0001\u0010LRI\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0011\u0010\u0088\u0001\u0012\u0005\b\u008a\u0001\u0010~\u001a\u0005\b\u0089\u0001\u0010NR#\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0012\u0010\u0082\u0001\u0012\u0005\b\u008c\u0001\u0010~\u001a\u0005\b\u008b\u0001\u0010JR1\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0013\u0010\u007f\u0012\u0005\b\u008e\u0001\u0010~\u001a\u0005\b\u008d\u0001\u0010HR1\u0010\u0014\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0014\u0010{\u0012\u0005\b\u0090\u0001\u0010~\u001a\u0005\b\u008f\u0001\u0010FR%\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0016\u0010\u0091\u0001\u0012\u0005\b\u0093\u0001\u0010~\u001a\u0005\b\u0092\u0001\u0010SR#\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u0094\u0001\u0012\u0005\b\u0096\u0001\u0010~\u001a\u0005\b\u0095\u0001\u0010UR%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0097\u0001\u0012\u0005\b\u0099\u0001\u0010~\u001a\u0005\b\u0098\u0001\u0010WR%\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u009a\u0001\u0012\u0005\b\u009c\u0001\u0010~\u001a\u0005\b\u009b\u0001\u0010YR%\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u009d\u0001\u0012\u0005\b\u009f\u0001\u0010~\u001a\u0005\b\u009e\u0001\u0010[R%\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010 \u0001\u0012\u0005\b¢\u0001\u0010~\u001a\u0005\b¡\u0001\u0010]R%\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010£\u0001\u0012\u0005\b¥\u0001\u0010~\u001a\u0005\b¤\u0001\u0010_R%\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b$\u0010¦\u0001\u0012\u0005\b¨\u0001\u0010~\u001a\u0005\b§\u0001\u0010aR%\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b&\u0010©\u0001\u0012\u0005\b«\u0001\u0010~\u001a\u0005\bª\u0001\u0010cR%\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b(\u0010¬\u0001\u0012\u0005\b®\u0001\u0010~\u001a\u0005\b\u00ad\u0001\u0010eR%\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b*\u0010¯\u0001\u0012\u0005\b±\u0001\u0010~\u001a\u0005\b°\u0001\u0010gR%\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b,\u0010²\u0001\u0012\u0005\b´\u0001\u0010~\u001a\u0005\b³\u0001\u0010iR%\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b.\u0010µ\u0001\u0012\u0005\b·\u0001\u0010~\u001a\u0005\b¶\u0001\u0010kR%\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b0\u0010¸\u0001\u0012\u0005\bº\u0001\u0010~\u001a\u0005\b¹\u0001\u0010mR%\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b2\u0010»\u0001\u0012\u0005\b½\u0001\u0010~\u001a\u0005\b¼\u0001\u0010oR%\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b4\u0010¾\u0001\u0012\u0005\bÀ\u0001\u0010~\u001a\u0005\b¿\u0001\u0010q¨\u0006Ã\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "object_id", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "account_number", "", "account_id", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "context", "ordering_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/rosetta/common/RequestContextDto;", "request_context", "Lcom/robinhood/rosetta/i18n/LocalityDto;", PlaceTypes.COUNTRY, "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "ach_relationship_details", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "ach_transfer_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "checkout_card_relationship_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "checkout_card_deposit_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "checkout_card_withdrawal_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "checkout_card_dispute_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "checkout_card_dispute_fee_details", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "bank_balance_details", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "iav_queued_deposit_details", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "received_ach_transfer_details", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "received_instant_bank_transfer_details", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "plaid_signal_details", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "ach_deposit_schedule_details", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "plaid_identity_update_details", "<init>", "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContextDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContextDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "component5", "()Lj$/time/Instant;", "component6", "component7", "component8", "component9", "()Lcom/robinhood/rosetta/common/RequestContextDto;", "component10", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "component11", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "component12", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "component13", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "component14", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "component15", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "component16", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "component17", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "component18", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "component19", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "component20", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "component21", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "component22", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "component23", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "component24", "()Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "copy", "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContextDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;)Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getObject_id", "getObject_id$annotations", "()V", "J", "getAccount_number", "getAccount_number$annotations", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "getType", "getType$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getContext", "getContext$annotations", "getOrdering_id", "getOrdering_id$annotations", "getUser_id", "getUser_id$annotations", "Lcom/robinhood/rosetta/common/RequestContextDto;", "getRequest_context", "getRequest_context$annotations", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "getCountry", "getCountry$annotations", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "getAch_relationship_details", "getAch_relationship_details$annotations", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "getAch_transfer_details", "getAch_transfer_details$annotations", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "getCheckout_card_relationship_details", "getCheckout_card_relationship_details$annotations", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "getCheckout_card_deposit_details", "getCheckout_card_deposit_details$annotations", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "getCheckout_card_withdrawal_details", "getCheckout_card_withdrawal_details$annotations", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "getCheckout_card_dispute_details", "getCheckout_card_dispute_details$annotations", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "getCheckout_card_dispute_fee_details", "getCheckout_card_dispute_fee_details$annotations", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "getBank_balance_details", "getBank_balance_details$annotations", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "getIav_queued_deposit_details", "getIav_queued_deposit_details$annotations", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "getReceived_ach_transfer_details", "getReceived_ach_transfer_details$annotations", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "getReceived_instant_bank_transfer_details", "getReceived_instant_bank_transfer_details$annotations", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "getPlaid_signal_details", "getPlaid_signal_details$annotations", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "getAch_deposit_schedule_details", "getAch_deposit_schedule_details$annotations", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "getPlaid_identity_update_details", "getPlaid_identity_update_details$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final long account_number;
        private final ACHDepositScheduleDetailsDto ach_deposit_schedule_details;
        private final ACHRelationshipDetailsDto ach_relationship_details;
        private final ACHTransferDetailsDto ach_transfer_details;
        private final BankBalanceDetailsDto bank_balance_details;
        private final CheckoutCardDepositDetailsDto checkout_card_deposit_details;
        private final CheckoutCardDisputeDetailsDto checkout_card_dispute_details;
        private final CheckoutCardDisputeFeeDetailsDto checkout_card_dispute_fee_details;
        private final CheckoutCardRelationshipDetailsDto checkout_card_relationship_details;
        private final CheckoutCardWithdrawalDetailsDto checkout_card_withdrawal_details;
        private final String context;
        private final LocalityDto country;
        private final IAVQueuedDepositDetailsDto iav_queued_deposit_details;
        private final ByteString object_id;
        private final long ordering_id;
        private final PlaidIdentityUpdateDetailsDto plaid_identity_update_details;
        private final PlaidSignalDetailsDto plaid_signal_details;
        private final ReceivedACHTransferDetailsDto received_ach_transfer_details;
        private final ReceivedInstantBankTransferDetailsDto received_instant_bank_transfer_details;
        private final RequestContextDto request_context;
        private final Instant timestamp;
        private final TypeDto type;
        private final ByteString user_id;

        public Surrogate() {
            this((ByteString) null, 0L, (String) null, (TypeDto) null, (Instant) null, (String) null, 0L, (ByteString) null, (RequestContextDto) null, (LocalityDto) null, (ACHRelationshipDetailsDto) null, (ACHTransferDetailsDto) null, (CheckoutCardRelationshipDetailsDto) null, (CheckoutCardDepositDetailsDto) null, (CheckoutCardWithdrawalDetailsDto) null, (CheckoutCardDisputeDetailsDto) null, (CheckoutCardDisputeFeeDetailsDto) null, (BankBalanceDetailsDto) null, (IAVQueuedDepositDetailsDto) null, (ReceivedACHTransferDetailsDto) null, (ReceivedInstantBankTransferDetailsDto) null, (PlaidSignalDetailsDto) null, (ACHDepositScheduleDetailsDto) null, (PlaidIdentityUpdateDetailsDto) null, 16777215, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, long j, String str, TypeDto typeDto, Instant instant, String str2, long j2, ByteString byteString2, RequestContextDto requestContextDto, LocalityDto localityDto, ACHRelationshipDetailsDto aCHRelationshipDetailsDto, ACHTransferDetailsDto aCHTransferDetailsDto, CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, BankBalanceDetailsDto bankBalanceDetailsDto, IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto, PlaidSignalDetailsDto plaidSignalDetailsDto, ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto, int i, Object obj) {
            PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto2;
            ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto2;
            ByteString byteString3 = (i & 1) != 0 ? surrogate.object_id : byteString;
            long j3 = (i & 2) != 0 ? surrogate.account_number : j;
            String str3 = (i & 4) != 0 ? surrogate.account_id : str;
            TypeDto typeDto2 = (i & 8) != 0 ? surrogate.type : typeDto;
            Instant instant2 = (i & 16) != 0 ? surrogate.timestamp : instant;
            String str4 = (i & 32) != 0 ? surrogate.context : str2;
            long j4 = (i & 64) != 0 ? surrogate.ordering_id : j2;
            ByteString byteString4 = (i & 128) != 0 ? surrogate.user_id : byteString2;
            RequestContextDto requestContextDto2 = (i & 256) != 0 ? surrogate.request_context : requestContextDto;
            LocalityDto localityDto2 = (i & 512) != 0 ? surrogate.country : localityDto;
            ACHRelationshipDetailsDto aCHRelationshipDetailsDto2 = (i & 1024) != 0 ? surrogate.ach_relationship_details : aCHRelationshipDetailsDto;
            ACHTransferDetailsDto aCHTransferDetailsDto2 = (i & 2048) != 0 ? surrogate.ach_transfer_details : aCHTransferDetailsDto;
            ByteString byteString5 = byteString3;
            CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto2 = (i & 4096) != 0 ? surrogate.checkout_card_relationship_details : checkoutCardRelationshipDetailsDto;
            CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto2 = (i & 8192) != 0 ? surrogate.checkout_card_deposit_details : checkoutCardDepositDetailsDto;
            CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto2 = (i & 16384) != 0 ? surrogate.checkout_card_withdrawal_details : checkoutCardWithdrawalDetailsDto;
            CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto2 = (i & 32768) != 0 ? surrogate.checkout_card_dispute_details : checkoutCardDisputeDetailsDto;
            CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto2 = (i & 65536) != 0 ? surrogate.checkout_card_dispute_fee_details : checkoutCardDisputeFeeDetailsDto;
            BankBalanceDetailsDto bankBalanceDetailsDto2 = (i & 131072) != 0 ? surrogate.bank_balance_details : bankBalanceDetailsDto;
            IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto2 = (i & 262144) != 0 ? surrogate.iav_queued_deposit_details : iAVQueuedDepositDetailsDto;
            ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto2 = (i & 524288) != 0 ? surrogate.received_ach_transfer_details : receivedACHTransferDetailsDto;
            ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto2 = (i & 1048576) != 0 ? surrogate.received_instant_bank_transfer_details : receivedInstantBankTransferDetailsDto;
            PlaidSignalDetailsDto plaidSignalDetailsDto2 = (i & 2097152) != 0 ? surrogate.plaid_signal_details : plaidSignalDetailsDto;
            ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto3 = (i & 4194304) != 0 ? surrogate.ach_deposit_schedule_details : aCHDepositScheduleDetailsDto;
            if ((i & 8388608) != 0) {
                aCHDepositScheduleDetailsDto2 = aCHDepositScheduleDetailsDto3;
                plaidIdentityUpdateDetailsDto2 = surrogate.plaid_identity_update_details;
            } else {
                plaidIdentityUpdateDetailsDto2 = plaidIdentityUpdateDetailsDto;
                aCHDepositScheduleDetailsDto2 = aCHDepositScheduleDetailsDto3;
            }
            return surrogate.copy(byteString5, j3, str3, typeDto2, instant2, str4, j4, byteString4, requestContextDto2, localityDto2, aCHRelationshipDetailsDto2, aCHTransferDetailsDto2, checkoutCardRelationshipDetailsDto2, checkoutCardDepositDetailsDto2, checkoutCardWithdrawalDetailsDto2, checkoutCardDisputeDetailsDto2, checkoutCardDisputeFeeDetailsDto2, bankBalanceDetailsDto2, iAVQueuedDepositDetailsDto2, receivedACHTransferDetailsDto2, receivedInstantBankTransferDetailsDto2, plaidSignalDetailsDto2, aCHDepositScheduleDetailsDto2, plaidIdentityUpdateDetailsDto2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("achDepositScheduleDetails")
        @JsonAnnotations2(names = {"ach_deposit_schedule_details"})
        public static /* synthetic */ void getAch_deposit_schedule_details$annotations() {
        }

        @SerialName("achRelationshipDetails")
        @JsonAnnotations2(names = {"ach_relationship_details"})
        public static /* synthetic */ void getAch_relationship_details$annotations() {
        }

        @SerialName("achTransferDetails")
        @JsonAnnotations2(names = {"ach_transfer_details"})
        public static /* synthetic */ void getAch_transfer_details$annotations() {
        }

        @SerialName("bankBalanceDetails")
        @JsonAnnotations2(names = {"bank_balance_details"})
        public static /* synthetic */ void getBank_balance_details$annotations() {
        }

        @SerialName("checkoutCardDepositDetails")
        @JsonAnnotations2(names = {"checkout_card_deposit_details"})
        public static /* synthetic */ void getCheckout_card_deposit_details$annotations() {
        }

        @SerialName("checkoutCardDisputeDetails")
        @JsonAnnotations2(names = {"checkout_card_dispute_details"})
        public static /* synthetic */ void getCheckout_card_dispute_details$annotations() {
        }

        @SerialName("checkoutCardDisputeFeeDetails")
        @JsonAnnotations2(names = {"checkout_card_dispute_fee_details"})
        public static /* synthetic */ void getCheckout_card_dispute_fee_details$annotations() {
        }

        @SerialName("checkoutCardRelationshipDetails")
        @JsonAnnotations2(names = {"checkout_card_relationship_details"})
        public static /* synthetic */ void getCheckout_card_relationship_details$annotations() {
        }

        @SerialName("checkoutCardWithdrawalDetails")
        @JsonAnnotations2(names = {"checkout_card_withdrawal_details"})
        public static /* synthetic */ void getCheckout_card_withdrawal_details$annotations() {
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName(PlaceTypes.COUNTRY)
        @JsonAnnotations2(names = {PlaceTypes.COUNTRY})
        public static /* synthetic */ void getCountry$annotations() {
        }

        @SerialName("iavQueuedDepositDetails")
        @JsonAnnotations2(names = {"iav_queued_deposit_details"})
        public static /* synthetic */ void getIav_queued_deposit_details$annotations() {
        }

        @SerialName("objectId")
        @JsonAnnotations2(names = {"object_id"})
        public static /* synthetic */ void getObject_id$annotations() {
        }

        @SerialName("orderingId")
        @JsonAnnotations2(names = {"ordering_id"})
        public static /* synthetic */ void getOrdering_id$annotations() {
        }

        @SerialName("plaidIdentityUpdateDetails")
        @JsonAnnotations2(names = {"plaid_identity_update_details"})
        public static /* synthetic */ void getPlaid_identity_update_details$annotations() {
        }

        @SerialName("plaidSignalDetails")
        @JsonAnnotations2(names = {"plaid_signal_details"})
        public static /* synthetic */ void getPlaid_signal_details$annotations() {
        }

        @SerialName("receivedAchTransferDetails")
        @JsonAnnotations2(names = {"received_ach_transfer_details"})
        public static /* synthetic */ void getReceived_ach_transfer_details$annotations() {
        }

        @SerialName("receivedInstantBankTransferDetails")
        @JsonAnnotations2(names = {"received_instant_bank_transfer_details"})
        public static /* synthetic */ void getReceived_instant_bank_transfer_details$annotations() {
        }

        @SerialName("requestContext")
        @JsonAnnotations2(names = {"request_context"})
        public static /* synthetic */ void getRequest_context$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getObject_id() {
            return this.object_id;
        }

        /* renamed from: component10, reason: from getter */
        public final LocalityDto getCountry() {
            return this.country;
        }

        /* renamed from: component11, reason: from getter */
        public final ACHRelationshipDetailsDto getAch_relationship_details() {
            return this.ach_relationship_details;
        }

        /* renamed from: component12, reason: from getter */
        public final ACHTransferDetailsDto getAch_transfer_details() {
            return this.ach_transfer_details;
        }

        /* renamed from: component13, reason: from getter */
        public final CheckoutCardRelationshipDetailsDto getCheckout_card_relationship_details() {
            return this.checkout_card_relationship_details;
        }

        /* renamed from: component14, reason: from getter */
        public final CheckoutCardDepositDetailsDto getCheckout_card_deposit_details() {
            return this.checkout_card_deposit_details;
        }

        /* renamed from: component15, reason: from getter */
        public final CheckoutCardWithdrawalDetailsDto getCheckout_card_withdrawal_details() {
            return this.checkout_card_withdrawal_details;
        }

        /* renamed from: component16, reason: from getter */
        public final CheckoutCardDisputeDetailsDto getCheckout_card_dispute_details() {
            return this.checkout_card_dispute_details;
        }

        /* renamed from: component17, reason: from getter */
        public final CheckoutCardDisputeFeeDetailsDto getCheckout_card_dispute_fee_details() {
            return this.checkout_card_dispute_fee_details;
        }

        /* renamed from: component18, reason: from getter */
        public final BankBalanceDetailsDto getBank_balance_details() {
            return this.bank_balance_details;
        }

        /* renamed from: component19, reason: from getter */
        public final IAVQueuedDepositDetailsDto getIav_queued_deposit_details() {
            return this.iav_queued_deposit_details;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component20, reason: from getter */
        public final ReceivedACHTransferDetailsDto getReceived_ach_transfer_details() {
            return this.received_ach_transfer_details;
        }

        /* renamed from: component21, reason: from getter */
        public final ReceivedInstantBankTransferDetailsDto getReceived_instant_bank_transfer_details() {
            return this.received_instant_bank_transfer_details;
        }

        /* renamed from: component22, reason: from getter */
        public final PlaidSignalDetailsDto getPlaid_signal_details() {
            return this.plaid_signal_details;
        }

        /* renamed from: component23, reason: from getter */
        public final ACHDepositScheduleDetailsDto getAch_deposit_schedule_details() {
            return this.ach_deposit_schedule_details;
        }

        /* renamed from: component24, reason: from getter */
        public final PlaidIdentityUpdateDetailsDto getPlaid_identity_update_details() {
            return this.plaid_identity_update_details;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component4, reason: from getter */
        public final TypeDto getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final long getOrdering_id() {
            return this.ordering_id;
        }

        /* renamed from: component8, reason: from getter */
        public final ByteString getUser_id() {
            return this.user_id;
        }

        /* renamed from: component9, reason: from getter */
        public final RequestContextDto getRequest_context() {
            return this.request_context;
        }

        public final Surrogate copy(ByteString object_id, long account_number, String account_id, TypeDto type2, Instant timestamp, String context, long ordering_id, ByteString user_id, RequestContextDto request_context, LocalityDto country, ACHRelationshipDetailsDto ach_relationship_details, ACHTransferDetailsDto ach_transfer_details, CheckoutCardRelationshipDetailsDto checkout_card_relationship_details, CheckoutCardDepositDetailsDto checkout_card_deposit_details, CheckoutCardWithdrawalDetailsDto checkout_card_withdrawal_details, CheckoutCardDisputeDetailsDto checkout_card_dispute_details, CheckoutCardDisputeFeeDetailsDto checkout_card_dispute_fee_details, BankBalanceDetailsDto bank_balance_details, IAVQueuedDepositDetailsDto iav_queued_deposit_details, ReceivedACHTransferDetailsDto received_ach_transfer_details, ReceivedInstantBankTransferDetailsDto received_instant_bank_transfer_details, PlaidSignalDetailsDto plaid_signal_details, ACHDepositScheduleDetailsDto ach_deposit_schedule_details, PlaidIdentityUpdateDetailsDto plaid_identity_update_details) {
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(country, "country");
            return new Surrogate(object_id, account_number, account_id, type2, timestamp, context, ordering_id, user_id, request_context, country, ach_relationship_details, ach_transfer_details, checkout_card_relationship_details, checkout_card_deposit_details, checkout_card_withdrawal_details, checkout_card_dispute_details, checkout_card_dispute_fee_details, bank_balance_details, iav_queued_deposit_details, received_ach_transfer_details, received_instant_bank_transfer_details, plaid_signal_details, ach_deposit_schedule_details, plaid_identity_update_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.object_id, surrogate.object_id) && this.account_number == surrogate.account_number && Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.type == surrogate.type && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.context, surrogate.context) && this.ordering_id == surrogate.ordering_id && Intrinsics.areEqual(this.user_id, surrogate.user_id) && Intrinsics.areEqual(this.request_context, surrogate.request_context) && this.country == surrogate.country && Intrinsics.areEqual(this.ach_relationship_details, surrogate.ach_relationship_details) && Intrinsics.areEqual(this.ach_transfer_details, surrogate.ach_transfer_details) && Intrinsics.areEqual(this.checkout_card_relationship_details, surrogate.checkout_card_relationship_details) && Intrinsics.areEqual(this.checkout_card_deposit_details, surrogate.checkout_card_deposit_details) && Intrinsics.areEqual(this.checkout_card_withdrawal_details, surrogate.checkout_card_withdrawal_details) && Intrinsics.areEqual(this.checkout_card_dispute_details, surrogate.checkout_card_dispute_details) && Intrinsics.areEqual(this.checkout_card_dispute_fee_details, surrogate.checkout_card_dispute_fee_details) && Intrinsics.areEqual(this.bank_balance_details, surrogate.bank_balance_details) && Intrinsics.areEqual(this.iav_queued_deposit_details, surrogate.iav_queued_deposit_details) && Intrinsics.areEqual(this.received_ach_transfer_details, surrogate.received_ach_transfer_details) && Intrinsics.areEqual(this.received_instant_bank_transfer_details, surrogate.received_instant_bank_transfer_details) && Intrinsics.areEqual(this.plaid_signal_details, surrogate.plaid_signal_details) && Intrinsics.areEqual(this.ach_deposit_schedule_details, surrogate.ach_deposit_schedule_details) && Intrinsics.areEqual(this.plaid_identity_update_details, surrogate.plaid_identity_update_details);
        }

        public int hashCode() {
            int iHashCode = ((((((this.object_id.hashCode() * 31) + Long.hashCode(this.account_number)) * 31) + this.account_id.hashCode()) * 31) + this.type.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.context.hashCode()) * 31) + Long.hashCode(this.ordering_id)) * 31) + this.user_id.hashCode()) * 31;
            RequestContextDto requestContextDto = this.request_context;
            int iHashCode3 = (((iHashCode2 + (requestContextDto == null ? 0 : requestContextDto.hashCode())) * 31) + this.country.hashCode()) * 31;
            ACHRelationshipDetailsDto aCHRelationshipDetailsDto = this.ach_relationship_details;
            int iHashCode4 = (iHashCode3 + (aCHRelationshipDetailsDto == null ? 0 : aCHRelationshipDetailsDto.hashCode())) * 31;
            ACHTransferDetailsDto aCHTransferDetailsDto = this.ach_transfer_details;
            int iHashCode5 = (iHashCode4 + (aCHTransferDetailsDto == null ? 0 : aCHTransferDetailsDto.hashCode())) * 31;
            CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto = this.checkout_card_relationship_details;
            int iHashCode6 = (iHashCode5 + (checkoutCardRelationshipDetailsDto == null ? 0 : checkoutCardRelationshipDetailsDto.hashCode())) * 31;
            CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto = this.checkout_card_deposit_details;
            int iHashCode7 = (iHashCode6 + (checkoutCardDepositDetailsDto == null ? 0 : checkoutCardDepositDetailsDto.hashCode())) * 31;
            CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto = this.checkout_card_withdrawal_details;
            int iHashCode8 = (iHashCode7 + (checkoutCardWithdrawalDetailsDto == null ? 0 : checkoutCardWithdrawalDetailsDto.hashCode())) * 31;
            CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto = this.checkout_card_dispute_details;
            int iHashCode9 = (iHashCode8 + (checkoutCardDisputeDetailsDto == null ? 0 : checkoutCardDisputeDetailsDto.hashCode())) * 31;
            CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto = this.checkout_card_dispute_fee_details;
            int iHashCode10 = (iHashCode9 + (checkoutCardDisputeFeeDetailsDto == null ? 0 : checkoutCardDisputeFeeDetailsDto.hashCode())) * 31;
            BankBalanceDetailsDto bankBalanceDetailsDto = this.bank_balance_details;
            int iHashCode11 = (iHashCode10 + (bankBalanceDetailsDto == null ? 0 : bankBalanceDetailsDto.hashCode())) * 31;
            IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto = this.iav_queued_deposit_details;
            int iHashCode12 = (iHashCode11 + (iAVQueuedDepositDetailsDto == null ? 0 : iAVQueuedDepositDetailsDto.hashCode())) * 31;
            ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto = this.received_ach_transfer_details;
            int iHashCode13 = (iHashCode12 + (receivedACHTransferDetailsDto == null ? 0 : receivedACHTransferDetailsDto.hashCode())) * 31;
            ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto = this.received_instant_bank_transfer_details;
            int iHashCode14 = (iHashCode13 + (receivedInstantBankTransferDetailsDto == null ? 0 : receivedInstantBankTransferDetailsDto.hashCode())) * 31;
            PlaidSignalDetailsDto plaidSignalDetailsDto = this.plaid_signal_details;
            int iHashCode15 = (iHashCode14 + (plaidSignalDetailsDto == null ? 0 : plaidSignalDetailsDto.hashCode())) * 31;
            ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto = this.ach_deposit_schedule_details;
            int iHashCode16 = (iHashCode15 + (aCHDepositScheduleDetailsDto == null ? 0 : aCHDepositScheduleDetailsDto.hashCode())) * 31;
            PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto = this.plaid_identity_update_details;
            return iHashCode16 + (plaidIdentityUpdateDetailsDto != null ? plaidIdentityUpdateDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(object_id=" + this.object_id + ", account_number=" + this.account_number + ", account_id=" + this.account_id + ", type=" + this.type + ", timestamp=" + this.timestamp + ", context=" + this.context + ", ordering_id=" + this.ordering_id + ", user_id=" + this.user_id + ", request_context=" + this.request_context + ", country=" + this.country + ", ach_relationship_details=" + this.ach_relationship_details + ", ach_transfer_details=" + this.ach_transfer_details + ", checkout_card_relationship_details=" + this.checkout_card_relationship_details + ", checkout_card_deposit_details=" + this.checkout_card_deposit_details + ", checkout_card_withdrawal_details=" + this.checkout_card_withdrawal_details + ", checkout_card_dispute_details=" + this.checkout_card_dispute_details + ", checkout_card_dispute_fee_details=" + this.checkout_card_dispute_fee_details + ", bank_balance_details=" + this.bank_balance_details + ", iav_queued_deposit_details=" + this.iav_queued_deposit_details + ", received_ach_transfer_details=" + this.received_ach_transfer_details + ", received_instant_bank_transfer_details=" + this.received_instant_bank_transfer_details + ", plaid_signal_details=" + this.plaid_signal_details + ", ach_deposit_schedule_details=" + this.ach_deposit_schedule_details + ", plaid_identity_update_details=" + this.plaid_identity_update_details + ")";
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActivitySnapshotDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, long j, String str, TypeDto typeDto, Instant instant, String str2, long j2, ByteString byteString2, RequestContextDto requestContextDto, LocalityDto localityDto, ACHRelationshipDetailsDto aCHRelationshipDetailsDto, ACHTransferDetailsDto aCHTransferDetailsDto, CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, BankBalanceDetailsDto bankBalanceDetailsDto, IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto, PlaidSignalDetailsDto plaidSignalDetailsDto, ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.object_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.account_number = 0L;
            } else {
                this.account_number = j;
            }
            if ((i & 4) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 8) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 32) == 0) {
                this.context = "";
            } else {
                this.context = str2;
            }
            if ((i & 64) == 0) {
                this.ordering_id = 0L;
            } else {
                this.ordering_id = j2;
            }
            if ((i & 128) == 0) {
                this.user_id = ByteString.EMPTY;
            } else {
                this.user_id = byteString2;
            }
            if ((i & 256) == 0) {
                this.request_context = null;
            } else {
                this.request_context = requestContextDto;
            }
            if ((i & 512) == 0) {
                this.country = LocalityDto.INSTANCE.getZeroValue();
            } else {
                this.country = localityDto;
            }
            if ((i & 1024) == 0) {
                this.ach_relationship_details = null;
            } else {
                this.ach_relationship_details = aCHRelationshipDetailsDto;
            }
            if ((i & 2048) == 0) {
                this.ach_transfer_details = null;
            } else {
                this.ach_transfer_details = aCHTransferDetailsDto;
            }
            if ((i & 4096) == 0) {
                this.checkout_card_relationship_details = null;
            } else {
                this.checkout_card_relationship_details = checkoutCardRelationshipDetailsDto;
            }
            if ((i & 8192) == 0) {
                this.checkout_card_deposit_details = null;
            } else {
                this.checkout_card_deposit_details = checkoutCardDepositDetailsDto;
            }
            if ((i & 16384) == 0) {
                this.checkout_card_withdrawal_details = null;
            } else {
                this.checkout_card_withdrawal_details = checkoutCardWithdrawalDetailsDto;
            }
            if ((32768 & i) == 0) {
                this.checkout_card_dispute_details = null;
            } else {
                this.checkout_card_dispute_details = checkoutCardDisputeDetailsDto;
            }
            if ((65536 & i) == 0) {
                this.checkout_card_dispute_fee_details = null;
            } else {
                this.checkout_card_dispute_fee_details = checkoutCardDisputeFeeDetailsDto;
            }
            if ((131072 & i) == 0) {
                this.bank_balance_details = null;
            } else {
                this.bank_balance_details = bankBalanceDetailsDto;
            }
            if ((262144 & i) == 0) {
                this.iav_queued_deposit_details = null;
            } else {
                this.iav_queued_deposit_details = iAVQueuedDepositDetailsDto;
            }
            if ((524288 & i) == 0) {
                this.received_ach_transfer_details = null;
            } else {
                this.received_ach_transfer_details = receivedACHTransferDetailsDto;
            }
            if ((1048576 & i) == 0) {
                this.received_instant_bank_transfer_details = null;
            } else {
                this.received_instant_bank_transfer_details = receivedInstantBankTransferDetailsDto;
            }
            if ((2097152 & i) == 0) {
                this.plaid_signal_details = null;
            } else {
                this.plaid_signal_details = plaidSignalDetailsDto;
            }
            if ((4194304 & i) == 0) {
                this.ach_deposit_schedule_details = null;
            } else {
                this.ach_deposit_schedule_details = aCHDepositScheduleDetailsDto;
            }
            if ((i & 8388608) == 0) {
                this.plaid_identity_update_details = null;
            } else {
                this.plaid_identity_update_details = plaidIdentityUpdateDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.object_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.object_id);
            }
            long j = self.account_number;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_id);
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TypeDto.Serializer.INSTANCE, self.type);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.context, "")) {
                output.encodeStringElement(serialDesc, 5, self.context);
            }
            long j2 = self.ordering_id;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            if (!Intrinsics.areEqual(self.user_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 7, ByteStringSerializer.INSTANCE, self.user_id);
            }
            RequestContextDto requestContextDto = self.request_context;
            if (requestContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, RequestContextDto.Serializer.INSTANCE, requestContextDto);
            }
            if (self.country != LocalityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, LocalityDto.Serializer.INSTANCE, self.country);
            }
            ACHRelationshipDetailsDto aCHRelationshipDetailsDto = self.ach_relationship_details;
            if (aCHRelationshipDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ACHRelationshipDetailsDto.Serializer.INSTANCE, aCHRelationshipDetailsDto);
            }
            ACHTransferDetailsDto aCHTransferDetailsDto = self.ach_transfer_details;
            if (aCHTransferDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ACHTransferDetailsDto.Serializer.INSTANCE, aCHTransferDetailsDto);
            }
            CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto = self.checkout_card_relationship_details;
            if (checkoutCardRelationshipDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, CheckoutCardRelationshipDetailsDto.Serializer.INSTANCE, checkoutCardRelationshipDetailsDto);
            }
            CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto = self.checkout_card_deposit_details;
            if (checkoutCardDepositDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, CheckoutCardDepositDetailsDto.Serializer.INSTANCE, checkoutCardDepositDetailsDto);
            }
            CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto = self.checkout_card_withdrawal_details;
            if (checkoutCardWithdrawalDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, CheckoutCardWithdrawalDetailsDto.Serializer.INSTANCE, checkoutCardWithdrawalDetailsDto);
            }
            CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto = self.checkout_card_dispute_details;
            if (checkoutCardDisputeDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, CheckoutCardDisputeDetailsDto.Serializer.INSTANCE, checkoutCardDisputeDetailsDto);
            }
            CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto = self.checkout_card_dispute_fee_details;
            if (checkoutCardDisputeFeeDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, CheckoutCardDisputeFeeDetailsDto.Serializer.INSTANCE, checkoutCardDisputeFeeDetailsDto);
            }
            BankBalanceDetailsDto bankBalanceDetailsDto = self.bank_balance_details;
            if (bankBalanceDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, BankBalanceDetailsDto.Serializer.INSTANCE, bankBalanceDetailsDto);
            }
            IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto = self.iav_queued_deposit_details;
            if (iAVQueuedDepositDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, IAVQueuedDepositDetailsDto.Serializer.INSTANCE, iAVQueuedDepositDetailsDto);
            }
            ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto = self.received_ach_transfer_details;
            if (receivedACHTransferDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ReceivedACHTransferDetailsDto.Serializer.INSTANCE, receivedACHTransferDetailsDto);
            }
            ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto = self.received_instant_bank_transfer_details;
            if (receivedInstantBankTransferDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, ReceivedInstantBankTransferDetailsDto.Serializer.INSTANCE, receivedInstantBankTransferDetailsDto);
            }
            PlaidSignalDetailsDto plaidSignalDetailsDto = self.plaid_signal_details;
            if (plaidSignalDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, PlaidSignalDetailsDto.Serializer.INSTANCE, plaidSignalDetailsDto);
            }
            ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto = self.ach_deposit_schedule_details;
            if (aCHDepositScheduleDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, ACHDepositScheduleDetailsDto.Serializer.INSTANCE, aCHDepositScheduleDetailsDto);
            }
            PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto = self.plaid_identity_update_details;
            if (plaidIdentityUpdateDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, PlaidIdentityUpdateDetailsDto.Serializer.INSTANCE, plaidIdentityUpdateDetailsDto);
            }
        }

        public Surrogate(ByteString object_id, long j, String account_id, TypeDto type2, Instant instant, String context, long j2, ByteString user_id, RequestContextDto requestContextDto, LocalityDto country, ACHRelationshipDetailsDto aCHRelationshipDetailsDto, ACHTransferDetailsDto aCHTransferDetailsDto, CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, BankBalanceDetailsDto bankBalanceDetailsDto, IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto, PlaidSignalDetailsDto plaidSignalDetailsDto, ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto) {
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(country, "country");
            this.object_id = object_id;
            this.account_number = j;
            this.account_id = account_id;
            this.type = type2;
            this.timestamp = instant;
            this.context = context;
            this.ordering_id = j2;
            this.user_id = user_id;
            this.request_context = requestContextDto;
            this.country = country;
            this.ach_relationship_details = aCHRelationshipDetailsDto;
            this.ach_transfer_details = aCHTransferDetailsDto;
            this.checkout_card_relationship_details = checkoutCardRelationshipDetailsDto;
            this.checkout_card_deposit_details = checkoutCardDepositDetailsDto;
            this.checkout_card_withdrawal_details = checkoutCardWithdrawalDetailsDto;
            this.checkout_card_dispute_details = checkoutCardDisputeDetailsDto;
            this.checkout_card_dispute_fee_details = checkoutCardDisputeFeeDetailsDto;
            this.bank_balance_details = bankBalanceDetailsDto;
            this.iav_queued_deposit_details = iAVQueuedDepositDetailsDto;
            this.received_ach_transfer_details = receivedACHTransferDetailsDto;
            this.received_instant_bank_transfer_details = receivedInstantBankTransferDetailsDto;
            this.plaid_signal_details = plaidSignalDetailsDto;
            this.ach_deposit_schedule_details = aCHDepositScheduleDetailsDto;
            this.plaid_identity_update_details = plaidIdentityUpdateDetailsDto;
        }

        public final ByteString getObject_id() {
            return this.object_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, long j, String str, TypeDto typeDto, Instant instant, String str2, long j2, ByteString byteString2, RequestContextDto requestContextDto, LocalityDto localityDto, ACHRelationshipDetailsDto aCHRelationshipDetailsDto, ACHTransferDetailsDto aCHTransferDetailsDto, CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, BankBalanceDetailsDto bankBalanceDetailsDto, IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto, PlaidSignalDetailsDto plaidSignalDetailsDto, ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? str2 : "", (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? ByteString.EMPTY : byteString2, (i & 256) != 0 ? null : requestContextDto, (i & 512) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 1024) != 0 ? null : aCHRelationshipDetailsDto, (i & 2048) != 0 ? null : aCHTransferDetailsDto, (i & 4096) != 0 ? null : checkoutCardRelationshipDetailsDto, (i & 8192) != 0 ? null : checkoutCardDepositDetailsDto, (i & 16384) != 0 ? null : checkoutCardWithdrawalDetailsDto, (i & 32768) != 0 ? null : checkoutCardDisputeDetailsDto, (i & 65536) != 0 ? null : checkoutCardDisputeFeeDetailsDto, (i & 131072) != 0 ? null : bankBalanceDetailsDto, (i & 262144) != 0 ? null : iAVQueuedDepositDetailsDto, (i & 524288) != 0 ? null : receivedACHTransferDetailsDto, (i & 1048576) != 0 ? null : receivedInstantBankTransferDetailsDto, (i & 2097152) != 0 ? null : plaidSignalDetailsDto, (i & 4194304) != 0 ? null : aCHDepositScheduleDetailsDto, (i & 8388608) != 0 ? null : plaidIdentityUpdateDetailsDto);
        }

        public final long getAccount_number() {
            return this.account_number;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getContext() {
            return this.context;
        }

        public final long getOrdering_id() {
            return this.ordering_id;
        }

        public final ByteString getUser_id() {
            return this.user_id;
        }

        public final RequestContextDto getRequest_context() {
            return this.request_context;
        }

        public final LocalityDto getCountry() {
            return this.country;
        }

        public final ACHRelationshipDetailsDto getAch_relationship_details() {
            return this.ach_relationship_details;
        }

        public final ACHTransferDetailsDto getAch_transfer_details() {
            return this.ach_transfer_details;
        }

        public final CheckoutCardRelationshipDetailsDto getCheckout_card_relationship_details() {
            return this.checkout_card_relationship_details;
        }

        public final CheckoutCardDepositDetailsDto getCheckout_card_deposit_details() {
            return this.checkout_card_deposit_details;
        }

        public final CheckoutCardWithdrawalDetailsDto getCheckout_card_withdrawal_details() {
            return this.checkout_card_withdrawal_details;
        }

        public final CheckoutCardDisputeDetailsDto getCheckout_card_dispute_details() {
            return this.checkout_card_dispute_details;
        }

        public final CheckoutCardDisputeFeeDetailsDto getCheckout_card_dispute_fee_details() {
            return this.checkout_card_dispute_fee_details;
        }

        public final BankBalanceDetailsDto getBank_balance_details() {
            return this.bank_balance_details;
        }

        public final IAVQueuedDepositDetailsDto getIav_queued_deposit_details() {
            return this.iav_queued_deposit_details;
        }

        public final ReceivedACHTransferDetailsDto getReceived_ach_transfer_details() {
            return this.received_ach_transfer_details;
        }

        public final ReceivedInstantBankTransferDetailsDto getReceived_instant_bank_transfer_details() {
            return this.received_instant_bank_transfer_details;
        }

        public final PlaidSignalDetailsDto getPlaid_signal_details() {
            return this.plaid_signal_details;
        }

        public final ACHDepositScheduleDetailsDto getAch_deposit_schedule_details() {
            return this.ach_deposit_schedule_details;
        }

        public final PlaidIdentityUpdateDetailsDto getPlaid_identity_update_details() {
            return this.plaid_identity_update_details;
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActivitySnapshotDto, ActivitySnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActivitySnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) ActivitySnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
            return ActivitySnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto getZeroValue() {
            return ActivitySnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto fromProto(ActivitySnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString object_id = proto.getObject_id();
            long account_number = proto.getAccount_number();
            String account_id = proto.getAccount_id();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getType());
            Instant timestamp = proto.getTimestamp();
            String context = proto.getContext();
            long ordering_id = proto.getOrdering_id();
            ByteString user_id = proto.getUser_id();
            RequestContext request_context = proto.getRequest_context();
            RequestContextDto requestContextDtoFromProto = request_context != null ? RequestContextDto.INSTANCE.fromProto(request_context) : null;
            LocalityDto localityDtoFromProto = LocalityDto.INSTANCE.fromProto(proto.getCountry());
            ACHRelationshipDetails ach_relationship_details = proto.getAch_relationship_details();
            ACHRelationshipDetailsDto aCHRelationshipDetailsDtoFromProto = ach_relationship_details != null ? ACHRelationshipDetailsDto.INSTANCE.fromProto(ach_relationship_details) : null;
            ACHTransferDetails ach_transfer_details = proto.getAch_transfer_details();
            ACHTransferDetailsDto aCHTransferDetailsDtoFromProto = ach_transfer_details != null ? ACHTransferDetailsDto.INSTANCE.fromProto(ach_transfer_details) : null;
            CheckoutCardRelationshipDetails checkout_card_relationship_details = proto.getCheckout_card_relationship_details();
            RequestContextDto requestContextDto = requestContextDtoFromProto;
            CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDtoFromProto = checkout_card_relationship_details != null ? CheckoutCardRelationshipDetailsDto.INSTANCE.fromProto(checkout_card_relationship_details) : null;
            CheckoutCardDepositDetails checkout_card_deposit_details = proto.getCheckout_card_deposit_details();
            CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto = checkoutCardRelationshipDetailsDtoFromProto;
            CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDtoFromProto = checkout_card_deposit_details != null ? CheckoutCardDepositDetailsDto.INSTANCE.fromProto(checkout_card_deposit_details) : null;
            CheckoutCardWithdrawalDetails checkout_card_withdrawal_details = proto.getCheckout_card_withdrawal_details();
            CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto = checkoutCardDepositDetailsDtoFromProto;
            CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDtoFromProto = checkout_card_withdrawal_details != null ? CheckoutCardWithdrawalDetailsDto.INSTANCE.fromProto(checkout_card_withdrawal_details) : null;
            CheckoutCardDisputeDetails checkout_card_dispute_details = proto.getCheckout_card_dispute_details();
            CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto = checkoutCardWithdrawalDetailsDtoFromProto;
            CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDtoFromProto = checkout_card_dispute_details != null ? CheckoutCardDisputeDetailsDto.INSTANCE.fromProto(checkout_card_dispute_details) : null;
            CheckoutCardDisputeFeeDetails checkout_card_dispute_fee_details = proto.getCheckout_card_dispute_fee_details();
            CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto = checkoutCardDisputeDetailsDtoFromProto;
            CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDtoFromProto = checkout_card_dispute_fee_details != null ? CheckoutCardDisputeFeeDetailsDto.INSTANCE.fromProto(checkout_card_dispute_fee_details) : null;
            BankBalanceDetails bank_balance_details = proto.getBank_balance_details();
            CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto = checkoutCardDisputeFeeDetailsDtoFromProto;
            BankBalanceDetailsDto bankBalanceDetailsDtoFromProto = bank_balance_details != null ? BankBalanceDetailsDto.INSTANCE.fromProto(bank_balance_details) : null;
            IAVQueuedDepositDetails iav_queued_deposit_details = proto.getIav_queued_deposit_details();
            BankBalanceDetailsDto bankBalanceDetailsDto = bankBalanceDetailsDtoFromProto;
            IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDtoFromProto = iav_queued_deposit_details != null ? IAVQueuedDepositDetailsDto.INSTANCE.fromProto(iav_queued_deposit_details) : null;
            ReceivedACHTransferDetails received_ach_transfer_details = proto.getReceived_ach_transfer_details();
            IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto = iAVQueuedDepositDetailsDtoFromProto;
            ReceivedACHTransferDetailsDto receivedACHTransferDetailsDtoFromProto = received_ach_transfer_details != null ? ReceivedACHTransferDetailsDto.INSTANCE.fromProto(received_ach_transfer_details) : null;
            ReceivedInstantBankTransferDetails received_instant_bank_transfer_details = proto.getReceived_instant_bank_transfer_details();
            ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto = receivedACHTransferDetailsDtoFromProto;
            ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDtoFromProto = received_instant_bank_transfer_details != null ? ReceivedInstantBankTransferDetailsDto.INSTANCE.fromProto(received_instant_bank_transfer_details) : null;
            PlaidSignalDetails plaid_signal_details = proto.getPlaid_signal_details();
            ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto = receivedInstantBankTransferDetailsDtoFromProto;
            PlaidSignalDetailsDto plaidSignalDetailsDtoFromProto = plaid_signal_details != null ? PlaidSignalDetailsDto.INSTANCE.fromProto(plaid_signal_details) : null;
            ACHDepositScheduleDetails ach_deposit_schedule_details = proto.getAch_deposit_schedule_details();
            PlaidSignalDetailsDto plaidSignalDetailsDto = plaidSignalDetailsDtoFromProto;
            ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDtoFromProto = ach_deposit_schedule_details != null ? ACHDepositScheduleDetailsDto.INSTANCE.fromProto(ach_deposit_schedule_details) : null;
            PlaidIdentityUpdateDetails plaid_identity_update_details = proto.getPlaid_identity_update_details();
            return new ActivitySnapshotDto(new Surrogate(object_id, account_number, account_id, typeDtoFromProto, timestamp, context, ordering_id, user_id, requestContextDto, localityDtoFromProto, aCHRelationshipDetailsDtoFromProto, aCHTransferDetailsDtoFromProto, checkoutCardRelationshipDetailsDto, checkoutCardDepositDetailsDto, checkoutCardWithdrawalDetailsDto, checkoutCardDisputeDetailsDto, checkoutCardDisputeFeeDetailsDto, bankBalanceDetailsDto, iAVQueuedDepositDetailsDto, receivedACHTransferDetailsDto, receivedInstantBankTransferDetailsDto, plaidSignalDetailsDto, aCHDepositScheduleDetailsDtoFromProto, plaid_identity_update_details != null ? PlaidIdentityUpdateDetailsDto.INSTANCE.fromProto(plaid_identity_update_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ActivitySnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivitySnapshotDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ActivitySnapshotDto(null, 0L, null, null, null, null, 0L, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "AchRelationshipDetails", "AchTransferDetails", "CheckoutCardRelationshipDetails", "CheckoutCardDepositDetails", "CheckoutCardWithdrawalDetails", "CheckoutCardDisputeDetails", "CheckoutCardDisputeFeeDetails", "BankBalanceDetails", "IavQueuedDepositDetails", "ReceivedAchTransferDetails", "ReceivedInstantBankTransferDetails", "PlaidSignalDetails", "AchDepositScheduleDetails", "PlaidIdentityUpdateDetails", "Companion", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchDepositScheduleDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchTransferDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$BankBalanceDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDepositDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDisputeDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDisputeFeeDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardWithdrawalDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$IavQueuedDepositDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$PlaidIdentityUpdateDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$PlaidSignalDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$ReceivedAchTransferDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$ReceivedInstantBankTransferDetails;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AchRelationshipDetails extends DetailsDto {
            private final ACHRelationshipDetailsDto value;

            public static /* synthetic */ AchRelationshipDetails copy$default(AchRelationshipDetails achRelationshipDetails, ACHRelationshipDetailsDto aCHRelationshipDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    aCHRelationshipDetailsDto = achRelationshipDetails.value;
                }
                return achRelationshipDetails.copy(aCHRelationshipDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ACHRelationshipDetailsDto getValue() {
                return this.value;
            }

            public final AchRelationshipDetails copy(ACHRelationshipDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AchRelationshipDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AchRelationshipDetails) && Intrinsics.areEqual(this.value, ((AchRelationshipDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AchRelationshipDetails(value=" + this.value + ")";
            }

            public final ACHRelationshipDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AchRelationshipDetails(ACHRelationshipDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchTransferDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AchTransferDetails extends DetailsDto {
            private final ACHTransferDetailsDto value;

            public static /* synthetic */ AchTransferDetails copy$default(AchTransferDetails achTransferDetails, ACHTransferDetailsDto aCHTransferDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    aCHTransferDetailsDto = achTransferDetails.value;
                }
                return achTransferDetails.copy(aCHTransferDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ACHTransferDetailsDto getValue() {
                return this.value;
            }

            public final AchTransferDetails copy(ACHTransferDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AchTransferDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AchTransferDetails) && Intrinsics.areEqual(this.value, ((AchTransferDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AchTransferDetails(value=" + this.value + ")";
            }

            public final ACHTransferDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AchTransferDetails(ACHTransferDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CheckoutCardRelationshipDetails extends DetailsDto {
            private final CheckoutCardRelationshipDetailsDto value;

            public static /* synthetic */ CheckoutCardRelationshipDetails copy$default(CheckoutCardRelationshipDetails checkoutCardRelationshipDetails, CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutCardRelationshipDetailsDto = checkoutCardRelationshipDetails.value;
                }
                return checkoutCardRelationshipDetails.copy(checkoutCardRelationshipDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CheckoutCardRelationshipDetailsDto getValue() {
                return this.value;
            }

            public final CheckoutCardRelationshipDetails copy(CheckoutCardRelationshipDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CheckoutCardRelationshipDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCardRelationshipDetails) && Intrinsics.areEqual(this.value, ((CheckoutCardRelationshipDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CheckoutCardRelationshipDetails(value=" + this.value + ")";
            }

            public final CheckoutCardRelationshipDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCardRelationshipDetails(CheckoutCardRelationshipDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDepositDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CheckoutCardDepositDetails extends DetailsDto {
            private final CheckoutCardDepositDetailsDto value;

            public static /* synthetic */ CheckoutCardDepositDetails copy$default(CheckoutCardDepositDetails checkoutCardDepositDetails, CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutCardDepositDetailsDto = checkoutCardDepositDetails.value;
                }
                return checkoutCardDepositDetails.copy(checkoutCardDepositDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CheckoutCardDepositDetailsDto getValue() {
                return this.value;
            }

            public final CheckoutCardDepositDetails copy(CheckoutCardDepositDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CheckoutCardDepositDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCardDepositDetails) && Intrinsics.areEqual(this.value, ((CheckoutCardDepositDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CheckoutCardDepositDetails(value=" + this.value + ")";
            }

            public final CheckoutCardDepositDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCardDepositDetails(CheckoutCardDepositDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardWithdrawalDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CheckoutCardWithdrawalDetails extends DetailsDto {
            private final CheckoutCardWithdrawalDetailsDto value;

            public static /* synthetic */ CheckoutCardWithdrawalDetails copy$default(CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails, CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutCardWithdrawalDetailsDto = checkoutCardWithdrawalDetails.value;
                }
                return checkoutCardWithdrawalDetails.copy(checkoutCardWithdrawalDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CheckoutCardWithdrawalDetailsDto getValue() {
                return this.value;
            }

            public final CheckoutCardWithdrawalDetails copy(CheckoutCardWithdrawalDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CheckoutCardWithdrawalDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCardWithdrawalDetails) && Intrinsics.areEqual(this.value, ((CheckoutCardWithdrawalDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CheckoutCardWithdrawalDetails(value=" + this.value + ")";
            }

            public final CheckoutCardWithdrawalDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCardWithdrawalDetails(CheckoutCardWithdrawalDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDisputeDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CheckoutCardDisputeDetails extends DetailsDto {
            private final CheckoutCardDisputeDetailsDto value;

            public static /* synthetic */ CheckoutCardDisputeDetails copy$default(CheckoutCardDisputeDetails checkoutCardDisputeDetails, CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutCardDisputeDetailsDto = checkoutCardDisputeDetails.value;
                }
                return checkoutCardDisputeDetails.copy(checkoutCardDisputeDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CheckoutCardDisputeDetailsDto getValue() {
                return this.value;
            }

            public final CheckoutCardDisputeDetails copy(CheckoutCardDisputeDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CheckoutCardDisputeDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCardDisputeDetails) && Intrinsics.areEqual(this.value, ((CheckoutCardDisputeDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CheckoutCardDisputeDetails(value=" + this.value + ")";
            }

            public final CheckoutCardDisputeDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCardDisputeDetails(CheckoutCardDisputeDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$CheckoutCardDisputeFeeDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CheckoutCardDisputeFeeDetails extends DetailsDto {
            private final CheckoutCardDisputeFeeDetailsDto value;

            public static /* synthetic */ CheckoutCardDisputeFeeDetails copy$default(CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails, CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutCardDisputeFeeDetailsDto = checkoutCardDisputeFeeDetails.value;
                }
                return checkoutCardDisputeFeeDetails.copy(checkoutCardDisputeFeeDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CheckoutCardDisputeFeeDetailsDto getValue() {
                return this.value;
            }

            public final CheckoutCardDisputeFeeDetails copy(CheckoutCardDisputeFeeDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CheckoutCardDisputeFeeDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCardDisputeFeeDetails) && Intrinsics.areEqual(this.value, ((CheckoutCardDisputeFeeDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CheckoutCardDisputeFeeDetails(value=" + this.value + ")";
            }

            public final CheckoutCardDisputeFeeDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCardDisputeFeeDetails(CheckoutCardDisputeFeeDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$BankBalanceDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BankBalanceDetails extends DetailsDto {
            private final BankBalanceDetailsDto value;

            public static /* synthetic */ BankBalanceDetails copy$default(BankBalanceDetails bankBalanceDetails, BankBalanceDetailsDto bankBalanceDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    bankBalanceDetailsDto = bankBalanceDetails.value;
                }
                return bankBalanceDetails.copy(bankBalanceDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final BankBalanceDetailsDto getValue() {
                return this.value;
            }

            public final BankBalanceDetails copy(BankBalanceDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new BankBalanceDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BankBalanceDetails) && Intrinsics.areEqual(this.value, ((BankBalanceDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BankBalanceDetails(value=" + this.value + ")";
            }

            public final BankBalanceDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BankBalanceDetails(BankBalanceDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$IavQueuedDepositDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IavQueuedDepositDetails extends DetailsDto {
            private final IAVQueuedDepositDetailsDto value;

            public static /* synthetic */ IavQueuedDepositDetails copy$default(IavQueuedDepositDetails iavQueuedDepositDetails, IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    iAVQueuedDepositDetailsDto = iavQueuedDepositDetails.value;
                }
                return iavQueuedDepositDetails.copy(iAVQueuedDepositDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final IAVQueuedDepositDetailsDto getValue() {
                return this.value;
            }

            public final IavQueuedDepositDetails copy(IAVQueuedDepositDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new IavQueuedDepositDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IavQueuedDepositDetails) && Intrinsics.areEqual(this.value, ((IavQueuedDepositDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IavQueuedDepositDetails(value=" + this.value + ")";
            }

            public final IAVQueuedDepositDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IavQueuedDepositDetails(IAVQueuedDepositDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$ReceivedAchTransferDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReceivedAchTransferDetails extends DetailsDto {
            private final ReceivedACHTransferDetailsDto value;

            public static /* synthetic */ ReceivedAchTransferDetails copy$default(ReceivedAchTransferDetails receivedAchTransferDetails, ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    receivedACHTransferDetailsDto = receivedAchTransferDetails.value;
                }
                return receivedAchTransferDetails.copy(receivedACHTransferDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ReceivedACHTransferDetailsDto getValue() {
                return this.value;
            }

            public final ReceivedAchTransferDetails copy(ReceivedACHTransferDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ReceivedAchTransferDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReceivedAchTransferDetails) && Intrinsics.areEqual(this.value, ((ReceivedAchTransferDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReceivedAchTransferDetails(value=" + this.value + ")";
            }

            public final ReceivedACHTransferDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedAchTransferDetails(ReceivedACHTransferDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$ReceivedInstantBankTransferDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReceivedInstantBankTransferDetails extends DetailsDto {
            private final ReceivedInstantBankTransferDetailsDto value;

            public static /* synthetic */ ReceivedInstantBankTransferDetails copy$default(ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails, ReceivedInstantBankTransferDetailsDto receivedInstantBankTransferDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    receivedInstantBankTransferDetailsDto = receivedInstantBankTransferDetails.value;
                }
                return receivedInstantBankTransferDetails.copy(receivedInstantBankTransferDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ReceivedInstantBankTransferDetailsDto getValue() {
                return this.value;
            }

            public final ReceivedInstantBankTransferDetails copy(ReceivedInstantBankTransferDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ReceivedInstantBankTransferDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReceivedInstantBankTransferDetails) && Intrinsics.areEqual(this.value, ((ReceivedInstantBankTransferDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReceivedInstantBankTransferDetails(value=" + this.value + ")";
            }

            public final ReceivedInstantBankTransferDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedInstantBankTransferDetails(ReceivedInstantBankTransferDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$PlaidSignalDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidSignalDetails extends DetailsDto {
            private final PlaidSignalDetailsDto value;

            public static /* synthetic */ PlaidSignalDetails copy$default(PlaidSignalDetails plaidSignalDetails, PlaidSignalDetailsDto plaidSignalDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    plaidSignalDetailsDto = plaidSignalDetails.value;
                }
                return plaidSignalDetails.copy(plaidSignalDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PlaidSignalDetailsDto getValue() {
                return this.value;
            }

            public final PlaidSignalDetails copy(PlaidSignalDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PlaidSignalDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidSignalDetails) && Intrinsics.areEqual(this.value, ((PlaidSignalDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidSignalDetails(value=" + this.value + ")";
            }

            public final PlaidSignalDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidSignalDetails(PlaidSignalDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$AchDepositScheduleDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AchDepositScheduleDetails extends DetailsDto {
            private final ACHDepositScheduleDetailsDto value;

            public static /* synthetic */ AchDepositScheduleDetails copy$default(AchDepositScheduleDetails achDepositScheduleDetails, ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    aCHDepositScheduleDetailsDto = achDepositScheduleDetails.value;
                }
                return achDepositScheduleDetails.copy(aCHDepositScheduleDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ACHDepositScheduleDetailsDto getValue() {
                return this.value;
            }

            public final AchDepositScheduleDetails copy(ACHDepositScheduleDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AchDepositScheduleDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AchDepositScheduleDetails) && Intrinsics.areEqual(this.value, ((AchDepositScheduleDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AchDepositScheduleDetails(value=" + this.value + ")";
            }

            public final ACHDepositScheduleDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AchDepositScheduleDetails(ACHDepositScheduleDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$PlaidIdentityUpdateDetails;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidIdentityUpdateDetails extends DetailsDto {
            private final PlaidIdentityUpdateDetailsDto value;

            public static /* synthetic */ PlaidIdentityUpdateDetails copy$default(PlaidIdentityUpdateDetails plaidIdentityUpdateDetails, PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    plaidIdentityUpdateDetailsDto = plaidIdentityUpdateDetails.value;
                }
                return plaidIdentityUpdateDetails.copy(plaidIdentityUpdateDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PlaidIdentityUpdateDetailsDto getValue() {
                return this.value;
            }

            public final PlaidIdentityUpdateDetails copy(PlaidIdentityUpdateDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PlaidIdentityUpdateDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidIdentityUpdateDetails) && Intrinsics.areEqual(this.value, ((PlaidIdentityUpdateDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidIdentityUpdateDetails(value=" + this.value + ")";
            }

            public final PlaidIdentityUpdateDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidIdentityUpdateDetails(PlaidIdentityUpdateDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, ActivitySnapshot> {
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
            public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
                return ActivitySnapshot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(ActivitySnapshot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getAch_relationship_details() != null) {
                    return new AchRelationshipDetails(ACHRelationshipDetailsDto.INSTANCE.fromProto(proto.getAch_relationship_details()));
                }
                if (proto.getAch_transfer_details() != null) {
                    return new AchTransferDetails(ACHTransferDetailsDto.INSTANCE.fromProto(proto.getAch_transfer_details()));
                }
                if (proto.getCheckout_card_relationship_details() != null) {
                    return new CheckoutCardRelationshipDetails(CheckoutCardRelationshipDetailsDto.INSTANCE.fromProto(proto.getCheckout_card_relationship_details()));
                }
                if (proto.getCheckout_card_deposit_details() != null) {
                    return new CheckoutCardDepositDetails(CheckoutCardDepositDetailsDto.INSTANCE.fromProto(proto.getCheckout_card_deposit_details()));
                }
                if (proto.getCheckout_card_withdrawal_details() != null) {
                    return new CheckoutCardWithdrawalDetails(CheckoutCardWithdrawalDetailsDto.INSTANCE.fromProto(proto.getCheckout_card_withdrawal_details()));
                }
                if (proto.getCheckout_card_dispute_details() != null) {
                    return new CheckoutCardDisputeDetails(CheckoutCardDisputeDetailsDto.INSTANCE.fromProto(proto.getCheckout_card_dispute_details()));
                }
                if (proto.getCheckout_card_dispute_fee_details() != null) {
                    return new CheckoutCardDisputeFeeDetails(CheckoutCardDisputeFeeDetailsDto.INSTANCE.fromProto(proto.getCheckout_card_dispute_fee_details()));
                }
                if (proto.getBank_balance_details() != null) {
                    return new BankBalanceDetails(BankBalanceDetailsDto.INSTANCE.fromProto(proto.getBank_balance_details()));
                }
                if (proto.getIav_queued_deposit_details() != null) {
                    return new IavQueuedDepositDetails(IAVQueuedDepositDetailsDto.INSTANCE.fromProto(proto.getIav_queued_deposit_details()));
                }
                if (proto.getReceived_ach_transfer_details() != null) {
                    return new ReceivedAchTransferDetails(ReceivedACHTransferDetailsDto.INSTANCE.fromProto(proto.getReceived_ach_transfer_details()));
                }
                if (proto.getReceived_instant_bank_transfer_details() != null) {
                    return new ReceivedInstantBankTransferDetails(ReceivedInstantBankTransferDetailsDto.INSTANCE.fromProto(proto.getReceived_instant_bank_transfer_details()));
                }
                if (proto.getPlaid_signal_details() != null) {
                    return new PlaidSignalDetails(PlaidSignalDetailsDto.INSTANCE.fromProto(proto.getPlaid_signal_details()));
                }
                if (proto.getAch_deposit_schedule_details() != null) {
                    return new AchDepositScheduleDetails(ACHDepositScheduleDetailsDto.INSTANCE.fromProto(proto.getAch_deposit_schedule_details()));
                }
                if (proto.getPlaid_identity_update_details() != null) {
                    return new PlaidIdentityUpdateDetails(PlaidIdentityUpdateDetailsDto.INSTANCE.fromProto(proto.getPlaid_identity_update_details()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "ACH_RELATIONSHIP", "ACH_TRANSFER", "BANK_BALANCE_DETAILS", "CHECKOUT_CARD_RELATIONSHIP", "CHECKOUT_CARD_DEPOSIT", "CHECKOUT_CARD_WITHDRAWAL", "CHECKOUT_CARD_DISPUTE", "CHECKOUT_CARD_DISPUTE_FEE", TransferContext3.QUEUED_DEPOSIT, "RECEIVED_ACH_TRANSFER", "PLAID_SIGNAL_DETAILS", "INSTANT_BANK_TRANSFER_DETAILS", "ACH_DEPOSIT_SCHEDULE", "PLAID_IDENTITY_UPDATE_DETAILS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<ActivitySnapshot.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, ActivitySnapshot.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto ACH_RELATIONSHIP = new ACH_RELATIONSHIP("ACH_RELATIONSHIP", 1);
        public static final TypeDto ACH_TRANSFER = new ACH_TRANSFER("ACH_TRANSFER", 2);
        public static final TypeDto BANK_BALANCE_DETAILS = new BANK_BALANCE_DETAILS("BANK_BALANCE_DETAILS", 3);
        public static final TypeDto CHECKOUT_CARD_RELATIONSHIP = new CHECKOUT_CARD_RELATIONSHIP("CHECKOUT_CARD_RELATIONSHIP", 4);
        public static final TypeDto CHECKOUT_CARD_DEPOSIT = new CHECKOUT_CARD_DEPOSIT("CHECKOUT_CARD_DEPOSIT", 5);
        public static final TypeDto CHECKOUT_CARD_WITHDRAWAL = new CHECKOUT_CARD_WITHDRAWAL("CHECKOUT_CARD_WITHDRAWAL", 6);
        public static final TypeDto CHECKOUT_CARD_DISPUTE = new CHECKOUT_CARD_DISPUTE("CHECKOUT_CARD_DISPUTE", 7);
        public static final TypeDto CHECKOUT_CARD_DISPUTE_FEE = new CHECKOUT_CARD_DISPUTE_FEE("CHECKOUT_CARD_DISPUTE_FEE", 8);
        public static final TypeDto QUEUED_DEPOSIT = new QUEUED_DEPOSIT(TransferContext3.QUEUED_DEPOSIT, 9);
        public static final TypeDto RECEIVED_ACH_TRANSFER = new RECEIVED_ACH_TRANSFER("RECEIVED_ACH_TRANSFER", 10);
        public static final TypeDto PLAID_SIGNAL_DETAILS = new PLAID_SIGNAL_DETAILS("PLAID_SIGNAL_DETAILS", 11);
        public static final TypeDto INSTANT_BANK_TRANSFER_DETAILS = new INSTANT_BANK_TRANSFER_DETAILS("INSTANT_BANK_TRANSFER_DETAILS", 12);
        public static final TypeDto ACH_DEPOSIT_SCHEDULE = new ACH_DEPOSIT_SCHEDULE("ACH_DEPOSIT_SCHEDULE", 13);
        public static final TypeDto PLAID_IDENTITY_UPDATE_DETAILS = new PLAID_IDENTITY_UPDATE_DETAILS("PLAID_IDENTITY_UPDATE_DETAILS", 14);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, ACH_RELATIONSHIP, ACH_TRANSFER, BANK_BALANCE_DETAILS, CHECKOUT_CARD_RELATIONSHIP, CHECKOUT_CARD_DEPOSIT, CHECKOUT_CARD_WITHDRAWAL, CHECKOUT_CARD_DISPUTE, CHECKOUT_CARD_DISPUTE_FEE, QUEUED_DEPOSIT, RECEIVED_ACH_TRANSFER, PLAID_SIGNAL_DETAILS, INSTANT_BANK_TRANSFER_DETAILS, ACH_DEPOSIT_SCHEDULE, PLAID_IDENTITY_UPDATE_DETAILS};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TYPE_UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ActivitySnapshotDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ActivitySnapshotDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.ACH_RELATIONSHIP", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH_RELATIONSHIP extends TypeDto {
            ACH_RELATIONSHIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ACH_RELATIONSHIP;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.ACH_TRANSFER", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH_TRANSFER extends TypeDto {
            ACH_TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ACH_TRANSFER;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.BANK_BALANCE_DETAILS", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BANK_BALANCE_DETAILS extends TypeDto {
            BANK_BALANCE_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.BANK_BALANCE_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.CHECKOUT_CARD_RELATIONSHIP", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_RELATIONSHIP extends TypeDto {
            CHECKOUT_CARD_RELATIONSHIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CHECKOUT_CARD_RELATIONSHIP;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.CHECKOUT_CARD_DEPOSIT", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DEPOSIT extends TypeDto {
            CHECKOUT_CARD_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CHECKOUT_CARD_DEPOSIT;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.CHECKOUT_CARD_WITHDRAWAL", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_WITHDRAWAL extends TypeDto {
            CHECKOUT_CARD_WITHDRAWAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CHECKOUT_CARD_WITHDRAWAL;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.CHECKOUT_CARD_DISPUTE", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DISPUTE extends TypeDto {
            CHECKOUT_CARD_DISPUTE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CHECKOUT_CARD_DISPUTE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.CHECKOUT_CARD_DISPUTE_FEE", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DISPUTE_FEE extends TypeDto {
            CHECKOUT_CARD_DISPUTE_FEE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CHECKOUT_CARD_DISPUTE_FEE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.QUEUED_DEPOSIT", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUEUED_DEPOSIT extends TypeDto {
            QUEUED_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.QUEUED_DEPOSIT;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.RECEIVED_ACH_TRANSFER", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVED_ACH_TRANSFER extends TypeDto {
            RECEIVED_ACH_TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.RECEIVED_ACH_TRANSFER;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.PLAID_SIGNAL_DETAILS", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_SIGNAL_DETAILS extends TypeDto {
            PLAID_SIGNAL_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.PLAID_SIGNAL_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.INSTANT_BANK_TRANSFER_DETAILS", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSTANT_BANK_TRANSFER_DETAILS extends TypeDto {
            INSTANT_BANK_TRANSFER_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.INSTANT_BANK_TRANSFER_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.ACH_DEPOSIT_SCHEDULE", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH_DEPOSIT_SCHEDULE extends TypeDto {
            ACH_DEPOSIT_SCHEDULE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ACH_DEPOSIT_SCHEDULE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ActivitySnapshotDto.TypeDto.PLAID_IDENTITY_UPDATE_DETAILS", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_IDENTITY_UPDATE_DETAILS extends TypeDto {
            PLAID_IDENTITY_UPDATE_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.PLAID_IDENTITY_UPDATE_DETAILS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, ActivitySnapshot.Type> {

            /* compiled from: ActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActivitySnapshot.Type.values().length];
                    try {
                        iArr[ActivitySnapshot.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ACH_RELATIONSHIP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ACH_TRANSFER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.BANK_BALANCE_DETAILS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CHECKOUT_CARD_RELATIONSHIP.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CHECKOUT_CARD_DEPOSIT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CHECKOUT_CARD_WITHDRAWAL.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CHECKOUT_CARD_DISPUTE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CHECKOUT_CARD_DISPUTE_FEE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.QUEUED_DEPOSIT.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.RECEIVED_ACH_TRANSFER.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.PLAID_SIGNAL_DETAILS.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.INSTANT_BANK_TRANSFER_DETAILS.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ACH_DEPOSIT_SCHEDULE.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.PLAID_IDENTITY_UPDATE_DETAILS.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ActivitySnapshot.Type> getProtoAdapter() {
                return ActivitySnapshot.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(ActivitySnapshot.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TypeDto.TYPE_UNSPECIFIED;
                    case 2:
                        return TypeDto.ACH_RELATIONSHIP;
                    case 3:
                        return TypeDto.ACH_TRANSFER;
                    case 4:
                        return TypeDto.BANK_BALANCE_DETAILS;
                    case 5:
                        return TypeDto.CHECKOUT_CARD_RELATIONSHIP;
                    case 6:
                        return TypeDto.CHECKOUT_CARD_DEPOSIT;
                    case 7:
                        return TypeDto.CHECKOUT_CARD_WITHDRAWAL;
                    case 8:
                        return TypeDto.CHECKOUT_CARD_DISPUTE;
                    case 9:
                        return TypeDto.CHECKOUT_CARD_DISPUTE_FEE;
                    case 10:
                        return TypeDto.QUEUED_DEPOSIT;
                    case 11:
                        return TypeDto.RECEIVED_ACH_TRANSFER;
                    case 12:
                        return TypeDto.PLAID_SIGNAL_DETAILS;
                    case 13:
                        return TypeDto.INSTANT_BANK_TRANSFER_DETAILS;
                    case 14:
                        return TypeDto.ACH_DEPOSIT_SCHEDULE;
                    case 15:
                        return TypeDto.PLAID_IDENTITY_UPDATE_DETAILS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, ActivitySnapshot.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ActivitySnapshot.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActivitySnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ActivitySnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActivitySnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActivitySnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActivitySnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ActivitySnapshotDto";
        }
    }
}
