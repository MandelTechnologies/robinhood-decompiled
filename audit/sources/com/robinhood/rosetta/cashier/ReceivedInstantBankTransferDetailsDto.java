package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails;
import com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.common.RHEntity;
import com.robinhood.rosetta.common.RHEntityDto;
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
import p479j$.time.Instant;

/* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006NMOPQRB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B«\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0006\u0010 J¯\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u00108R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bC\u0010&R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bD\u0010&R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010&R\u0011\u0010\u0019\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bG\u0010&R\u0011\u0010\u001b\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bH\u0010&R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006S"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;)V", "Lokio/ByteString;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "rh_account_id", "user_uuid", "reversal_reason", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "Lcom/robinhood/rosetta/common/RHEntityDto;", "rh_entity_type", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/RHEntityDto;)V", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/RHEntityDto;)Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "getTransfer_id", "()Lokio/ByteString;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "getState", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getVulnerable_aml_amount", "getCreated_at", "()Lj$/time/Instant;", "getRelationship_master_id", "getBank_account_nickname", "getBank_account_last_four", "getBank_account_routing_number", "getRh_account_id", "getUser_uuid", "getReversal_reason", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getRh_entity_type", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "Companion", "Surrogate", "StateDto", "DirectionDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ReceivedInstantBankTransferDetailsDto implements Dto3<ReceivedInstantBankTransferDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReceivedInstantBankTransferDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReceivedInstantBankTransferDetailsDto, ReceivedInstantBankTransferDetails>> binaryBase64Serializer$delegate;
    private static final ReceivedInstantBankTransferDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReceivedInstantBankTransferDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReceivedInstantBankTransferDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final MoneyDto getVulnerable_aml_amount() {
        return this.surrogate.getVulnerable_aml_amount();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final ByteString getRelationship_master_id() {
        return this.surrogate.getRelationship_master_id();
    }

    public final String getBank_account_nickname() {
        return this.surrogate.getBank_account_nickname();
    }

    public final String getBank_account_last_four() {
        return this.surrogate.getBank_account_last_four();
    }

    public final String getBank_account_routing_number() {
        return this.surrogate.getBank_account_routing_number();
    }

    public final String getRh_account_id() {
        return this.surrogate.getRh_account_id();
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getReversal_reason() {
        return this.surrogate.getReversal_reason();
    }

    public final AccountTypeDto getRh_account_type() {
        return this.surrogate.getRh_account_type();
    }

    public final RHEntityDto getRh_entity_type() {
        return this.surrogate.getRh_entity_type();
    }

    public /* synthetic */ ReceivedInstantBankTransferDetailsDto(ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, String str4, String str5, String str6, AccountTypeDto accountTypeDto, RHEntityDto rHEntityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) == 0 ? instant : null, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16384) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReceivedInstantBankTransferDetailsDto(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountTypeDto rh_account_type, RHEntityDto rh_entity_type) {
        this(new Surrogate(transfer_id, direction, state, moneyDto, moneyDto2, instant, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, rh_account_id, user_uuid, reversal_reason, rh_account_type, rh_entity_type));
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
    }

    public final ReceivedInstantBankTransferDetailsDto copy(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto amount, MoneyDto vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountTypeDto rh_account_type, RHEntityDto rh_entity_type) {
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        return new ReceivedInstantBankTransferDetailsDto(new Surrogate(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, rh_account_id, user_uuid, reversal_reason, rh_account_type, rh_entity_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ReceivedInstantBankTransferDetails toProto() {
        ByteString transfer_id = this.surrogate.getTransfer_id();
        ReceivedInstantBankTransferDetails.Direction direction = (ReceivedInstantBankTransferDetails.Direction) this.surrogate.getDirection().toProto();
        ReceivedInstantBankTransferDetails.State state = (ReceivedInstantBankTransferDetails.State) this.surrogate.getState().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        MoneyDto vulnerable_aml_amount = this.surrogate.getVulnerable_aml_amount();
        return new ReceivedInstantBankTransferDetails(transfer_id, direction, state, proto, vulnerable_aml_amount != null ? vulnerable_aml_amount.toProto() : null, this.surrogate.getCreated_at(), this.surrogate.getRelationship_master_id(), this.surrogate.getBank_account_nickname(), this.surrogate.getBank_account_last_four(), this.surrogate.getBank_account_routing_number(), this.surrogate.getRh_account_id(), this.surrogate.getUser_uuid(), this.surrogate.getReversal_reason(), (AccountType) this.surrogate.getRh_account_type().toProto(), (RHEntity) this.surrogate.getRh_entity_type().toProto(), null, 32768, null);
    }

    public String toString() {
        return "[ReceivedInstantBankTransferDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReceivedInstantBankTransferDetailsDto) && Intrinsics.areEqual(((ReceivedInstantBankTransferDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b,\b\u0083\b\u0018\u0000 u2\u00020\u0001:\u0002vuBå\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB±\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b6\u00105J6\u00107\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b=\u0010;J\u0010\u0010>\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b>\u0010;J\u0010\u0010?\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b?\u0010;J\u0010\u0010@\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b@\u0010;J\u0010\u0010A\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bC\u0010DJî\u0001\u0010E\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bG\u0010;J\u0010\u0010H\u001a\u00020 HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010N\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010/R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010R\u0012\u0004\bT\u0010Q\u001a\u0004\bS\u00101R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010U\u0012\u0004\bW\u0010Q\u001a\u0004\bV\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010X\u0012\u0004\bZ\u0010Q\u001a\u0004\bY\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010X\u0012\u0004\b\\\u0010Q\u001a\u0004\b[\u00105RF\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010]\u0012\u0004\b_\u0010Q\u001a\u0004\b^\u00108R/\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010N\u0012\u0004\ba\u0010Q\u001a\u0004\b`\u0010/R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010b\u0012\u0004\bd\u0010Q\u001a\u0004\bc\u0010;R \u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010b\u0012\u0004\bf\u0010Q\u001a\u0004\be\u0010;R \u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010b\u0012\u0004\bh\u0010Q\u001a\u0004\bg\u0010;R \u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010b\u0012\u0004\bj\u0010Q\u001a\u0004\bi\u0010;R \u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010b\u0012\u0004\bl\u0010Q\u001a\u0004\bk\u0010;R \u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010b\u0012\u0004\bn\u0010Q\u001a\u0004\bm\u0010;R \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010o\u0012\u0004\bq\u0010Q\u001a\u0004\bp\u0010BR \u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010r\u0012\u0004\bt\u0010Q\u001a\u0004\bs\u0010D¨\u0006w"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "rh_account_id", "user_uuid", "reversal_reason", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "Lcom/robinhood/rosetta/common/RHEntityDto;", "rh_entity_type", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/RHEntityDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/RHEntityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "component3", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "component4", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component5", "component6", "()Lj$/time/Instant;", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "component15", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/RHEntityDto;)Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getTransfer_id", "getTransfer_id$annotations", "()V", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "getDirection", "getDirection$annotations", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "getState", "getState$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "getAmount$annotations", "getVulnerable_aml_amount", "getVulnerable_aml_amount$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getRelationship_master_id", "getRelationship_master_id$annotations", "Ljava/lang/String;", "getBank_account_nickname", "getBank_account_nickname$annotations", "getBank_account_last_four", "getBank_account_last_four$annotations", "getBank_account_routing_number", "getBank_account_routing_number$annotations", "getRh_account_id", "getRh_account_id$annotations", "getUser_uuid", "getUser_uuid$annotations", "getReversal_reason", "getReversal_reason$annotations", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "getRh_account_type", "getRh_account_type$annotations", "Lcom/robinhood/rosetta/common/RHEntityDto;", "getRh_entity_type", "getRh_entity_type$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final String bank_account_last_four;
        private final String bank_account_nickname;
        private final String bank_account_routing_number;
        private final Instant created_at;
        private final DirectionDto direction;
        private final ByteString relationship_master_id;
        private final String reversal_reason;
        private final String rh_account_id;
        private final AccountTypeDto rh_account_type;
        private final RHEntityDto rh_entity_type;
        private final StateDto state;
        private final ByteString transfer_id;
        private final String user_uuid;
        private final MoneyDto vulnerable_aml_amount;

        public Surrogate() {
            this((ByteString) null, (DirectionDto) null, (StateDto) null, (MoneyDto) null, (MoneyDto) null, (Instant) null, (ByteString) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AccountTypeDto) null, (RHEntityDto) null, 32767, (DefaultConstructorMarker) null);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("bankAccountLastFour")
        @JsonAnnotations2(names = {"bank_account_last_four"})
        public static /* synthetic */ void getBank_account_last_four$annotations() {
        }

        @SerialName("bankAccountNickname")
        @JsonAnnotations2(names = {"bank_account_nickname"})
        public static /* synthetic */ void getBank_account_nickname$annotations() {
        }

        @SerialName("bankAccountRoutingNumber")
        @JsonAnnotations2(names = {"bank_account_routing_number"})
        public static /* synthetic */ void getBank_account_routing_number$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("relationshipMasterId")
        @JsonAnnotations2(names = {"relationship_master_id"})
        public static /* synthetic */ void getRelationship_master_id$annotations() {
        }

        @SerialName("reversalReason")
        @JsonAnnotations2(names = {"reversal_reason"})
        public static /* synthetic */ void getReversal_reason$annotations() {
        }

        @SerialName("rhAccountId")
        @JsonAnnotations2(names = {"rh_account_id"})
        public static /* synthetic */ void getRh_account_id$annotations() {
        }

        @SerialName("rhAccountType")
        @JsonAnnotations2(names = {"rh_account_type"})
        public static /* synthetic */ void getRh_account_type$annotations() {
        }

        @SerialName("rhEntityType")
        @JsonAnnotations2(names = {"rh_entity_type"})
        public static /* synthetic */ void getRh_entity_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("transferId")
        @JsonAnnotations2(names = {MatchSelectionActivity.TRANSFER_ID_EXTRA})
        public static /* synthetic */ void getTransfer_id$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        @SerialName("vulnerableAmlAmount")
        @JsonAnnotations2(names = {"vulnerable_aml_amount"})
        public static /* synthetic */ void getVulnerable_aml_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getTransfer_id() {
            return this.transfer_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getBank_account_routing_number() {
            return this.bank_account_routing_number;
        }

        /* renamed from: component11, reason: from getter */
        public final String getRh_account_id() {
            return this.rh_account_id;
        }

        /* renamed from: component12, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component13, reason: from getter */
        public final String getReversal_reason() {
            return this.reversal_reason;
        }

        /* renamed from: component14, reason: from getter */
        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        /* renamed from: component15, reason: from getter */
        public final RHEntityDto getRh_entity_type() {
            return this.rh_entity_type;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component3, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getVulnerable_aml_amount() {
            return this.vulnerable_aml_amount;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component7, reason: from getter */
        public final ByteString getRelationship_master_id() {
            return this.relationship_master_id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBank_account_nickname() {
            return this.bank_account_nickname;
        }

        /* renamed from: component9, reason: from getter */
        public final String getBank_account_last_four() {
            return this.bank_account_last_four;
        }

        public final Surrogate copy(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto amount, MoneyDto vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountTypeDto rh_account_type, RHEntityDto rh_entity_type) {
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
            Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
            Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
            return new Surrogate(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, rh_account_id, user_uuid, reversal_reason, rh_account_type, rh_entity_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && this.direction == surrogate.direction && this.state == surrogate.state && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.vulnerable_aml_amount, surrogate.vulnerable_aml_amount) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.relationship_master_id, surrogate.relationship_master_id) && Intrinsics.areEqual(this.bank_account_nickname, surrogate.bank_account_nickname) && Intrinsics.areEqual(this.bank_account_last_four, surrogate.bank_account_last_four) && Intrinsics.areEqual(this.bank_account_routing_number, surrogate.bank_account_routing_number) && Intrinsics.areEqual(this.rh_account_id, surrogate.rh_account_id) && Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.reversal_reason, surrogate.reversal_reason) && this.rh_account_type == surrogate.rh_account_type && this.rh_entity_type == surrogate.rh_entity_type;
        }

        public int hashCode() {
            int iHashCode = ((((this.transfer_id.hashCode() * 31) + this.direction.hashCode()) * 31) + this.state.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.vulnerable_aml_amount;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            Instant instant = this.created_at;
            return ((((((((((((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 31) + this.relationship_master_id.hashCode()) * 31) + this.bank_account_nickname.hashCode()) * 31) + this.bank_account_last_four.hashCode()) * 31) + this.bank_account_routing_number.hashCode()) * 31) + this.rh_account_id.hashCode()) * 31) + this.user_uuid.hashCode()) * 31) + this.reversal_reason.hashCode()) * 31) + this.rh_account_type.hashCode()) * 31) + this.rh_entity_type.hashCode();
        }

        public String toString() {
            return "Surrogate(transfer_id=" + this.transfer_id + ", direction=" + this.direction + ", state=" + this.state + ", amount=" + this.amount + ", vulnerable_aml_amount=" + this.vulnerable_aml_amount + ", created_at=" + this.created_at + ", relationship_master_id=" + this.relationship_master_id + ", bank_account_nickname=" + this.bank_account_nickname + ", bank_account_last_four=" + this.bank_account_last_four + ", bank_account_routing_number=" + this.bank_account_routing_number + ", rh_account_id=" + this.rh_account_id + ", user_uuid=" + this.user_uuid + ", reversal_reason=" + this.reversal_reason + ", rh_account_type=" + this.rh_account_type + ", rh_entity_type=" + this.rh_entity_type + ")";
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReceivedInstantBankTransferDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, String str4, String str5, String str6, AccountTypeDto accountTypeDto, RHEntityDto rHEntityDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.transfer_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 4) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 8) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.vulnerable_aml_amount = null;
            } else {
                this.vulnerable_aml_amount = moneyDto2;
            }
            if ((i & 32) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 64) == 0) {
                this.relationship_master_id = ByteString.EMPTY;
            } else {
                this.relationship_master_id = byteString2;
            }
            if ((i & 128) == 0) {
                this.bank_account_nickname = "";
            } else {
                this.bank_account_nickname = str;
            }
            if ((i & 256) == 0) {
                this.bank_account_last_four = "";
            } else {
                this.bank_account_last_four = str2;
            }
            if ((i & 512) == 0) {
                this.bank_account_routing_number = "";
            } else {
                this.bank_account_routing_number = str3;
            }
            if ((i & 1024) == 0) {
                this.rh_account_id = "";
            } else {
                this.rh_account_id = str4;
            }
            if ((i & 2048) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str5;
            }
            if ((i & 4096) == 0) {
                this.reversal_reason = "";
            } else {
                this.reversal_reason = str6;
            }
            this.rh_account_type = (i & 8192) == 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto;
            this.rh_entity_type = (i & 16384) == 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.transfer_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.transfer_id);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, StateDto.Serializer.INSTANCE, self.state);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.vulnerable_aml_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.relationship_master_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 6, ByteStringSerializer.INSTANCE, self.relationship_master_id);
            }
            if (!Intrinsics.areEqual(self.bank_account_nickname, "")) {
                output.encodeStringElement(serialDesc, 7, self.bank_account_nickname);
            }
            if (!Intrinsics.areEqual(self.bank_account_last_four, "")) {
                output.encodeStringElement(serialDesc, 8, self.bank_account_last_four);
            }
            if (!Intrinsics.areEqual(self.bank_account_routing_number, "")) {
                output.encodeStringElement(serialDesc, 9, self.bank_account_routing_number);
            }
            if (!Intrinsics.areEqual(self.rh_account_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.rh_account_id);
            }
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 11, self.user_uuid);
            }
            if (!Intrinsics.areEqual(self.reversal_reason, "")) {
                output.encodeStringElement(serialDesc, 12, self.reversal_reason);
            }
            if (self.rh_account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, AccountTypeDto.Serializer.INSTANCE, self.rh_account_type);
            }
            if (self.rh_entity_type != RHEntityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, RHEntityDto.Serializer.INSTANCE, self.rh_entity_type);
            }
        }

        public Surrogate(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountTypeDto rh_account_type, RHEntityDto rh_entity_type) {
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
            Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
            Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
            this.transfer_id = transfer_id;
            this.direction = direction;
            this.state = state;
            this.amount = moneyDto;
            this.vulnerable_aml_amount = moneyDto2;
            this.created_at = instant;
            this.relationship_master_id = relationship_master_id;
            this.bank_account_nickname = bank_account_nickname;
            this.bank_account_last_four = bank_account_last_four;
            this.bank_account_routing_number = bank_account_routing_number;
            this.rh_account_id = rh_account_id;
            this.user_uuid = user_uuid;
            this.reversal_reason = reversal_reason;
            this.rh_account_type = rh_account_type;
            this.rh_entity_type = rh_entity_type;
        }

        public final ByteString getTransfer_id() {
            return this.transfer_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, String str4, String str5, String str6, AccountTypeDto accountTypeDto, RHEntityDto rHEntityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) == 0 ? instant : null, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16384) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto);
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final StateDto getState() {
            return this.state;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final MoneyDto getVulnerable_aml_amount() {
            return this.vulnerable_aml_amount;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final ByteString getRelationship_master_id() {
            return this.relationship_master_id;
        }

        public final String getBank_account_nickname() {
            return this.bank_account_nickname;
        }

        public final String getBank_account_last_four() {
            return this.bank_account_last_four;
        }

        public final String getBank_account_routing_number() {
            return this.bank_account_routing_number;
        }

        public final String getRh_account_id() {
            return this.rh_account_id;
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final String getReversal_reason() {
            return this.reversal_reason;
        }

        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        public final RHEntityDto getRh_entity_type() {
            return this.rh_entity_type;
        }
    }

    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ReceivedInstantBankTransferDetailsDto, ReceivedInstantBankTransferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReceivedInstantBankTransferDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReceivedInstantBankTransferDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReceivedInstantBankTransferDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ReceivedInstantBankTransferDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReceivedInstantBankTransferDetails> getProtoAdapter() {
            return ReceivedInstantBankTransferDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReceivedInstantBankTransferDetailsDto getZeroValue() {
            return ReceivedInstantBankTransferDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReceivedInstantBankTransferDetailsDto fromProto(ReceivedInstantBankTransferDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString transfer_id = proto.getTransfer_id();
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Money vulnerable_aml_amount = proto.getVulnerable_aml_amount();
            return new ReceivedInstantBankTransferDetailsDto(new Surrogate(transfer_id, directionDtoFromProto, stateDtoFromProto, moneyDtoFromProto, vulnerable_aml_amount != null ? MoneyDto.INSTANCE.fromProto(vulnerable_aml_amount) : null, proto.getCreated_at(), proto.getRelationship_master_id(), proto.getBank_account_nickname(), proto.getBank_account_last_four(), proto.getBank_account_routing_number(), proto.getRh_account_id(), proto.getUser_uuid(), proto.getReversal_reason(), AccountTypeDto.INSTANCE.fromProto(proto.getRh_account_type()), RHEntityDto.INSTANCE.fromProto(proto.getRh_entity_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceivedInstantBankTransferDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReceivedInstantBankTransferDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NEW", "READY", "PENDING", "COMPLETED", "FAILED", "DISPUTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<ReceivedInstantBankTransferDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, ReceivedInstantBankTransferDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto NEW = new NEW("NEW", 0);
        public static final StateDto READY = new READY("READY", 1);
        public static final StateDto PENDING = new PENDING("PENDING", 2);
        public static final StateDto COMPLETED = new COMPLETED("COMPLETED", 3);
        public static final StateDto FAILED = new FAILED("FAILED", 4);
        public static final StateDto DISPUTED = new DISPUTED("DISPUTED", 5);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{NEW, READY, PENDING, COMPLETED, FAILED, DISPUTED};
        }

        public /* synthetic */ StateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.NEW", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends StateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.NEW;
            }
        }

        private StateDto(String str, int i) {
        }

        static {
            StateDto[] stateDtoArr$values = $values();
            $VALUES = stateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReceivedInstantBankTransferDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.READY", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class READY extends StateDto {
            READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.READY;
            }
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.PENDING", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING extends StateDto {
            PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.PENDING;
            }
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.COMPLETED", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends StateDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.COMPLETED;
            }
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.FAILED", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends StateDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.FAILED;
            }
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.StateDto.DISPUTED", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISPUTED extends StateDto {
            DISPUTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.State toProto() {
                return ReceivedInstantBankTransferDetails.State.DISPUTED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, ReceivedInstantBankTransferDetails.State> {

            /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ReceivedInstantBankTransferDetails.State.values().length];
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.NEW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.READY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.PENDING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.COMPLETED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.FAILED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.State.DISPUTED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getBinaryBase64Serializer() {
                return (KSerializer) StateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ReceivedInstantBankTransferDetails.State> getProtoAdapter() {
                return ReceivedInstantBankTransferDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.NEW;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(ReceivedInstantBankTransferDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return StateDto.NEW;
                    case 2:
                        return StateDto.READY;
                    case 3:
                        return StateDto.PENDING;
                    case 4:
                        return StateDto.COMPLETED;
                    case 5:
                        return StateDto.FAILED;
                    case 6:
                        return StateDto.DISPUTED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, ReceivedInstantBankTransferDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ReceivedInstantBankTransferDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "DEPOSIT", "WITHDRAW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<ReceivedInstantBankTransferDetails.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, ReceivedInstantBankTransferDetails.Direction>> binaryBase64Serializer$delegate;
        public static final DirectionDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final DirectionDto DEPOSIT = new DEPOSIT("DEPOSIT", 1);
        public static final DirectionDto WITHDRAW = new WITHDRAW("WITHDRAW", 2);

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{UNSPECIFIED, DEPOSIT, WITHDRAW};
        }

        public /* synthetic */ DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DirectionDto(String str, int i) {
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.DirectionDto.UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends DirectionDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.Direction toProto() {
                return ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED;
            }
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReceivedInstantBankTransferDetailsDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.DirectionDto.DEPOSIT", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends DirectionDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.Direction toProto() {
                return ReceivedInstantBankTransferDetails.Direction.DEPOSIT;
            }
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto.DirectionDto.WITHDRAW", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAW extends DirectionDto {
            WITHDRAW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedInstantBankTransferDetails.Direction toProto() {
                return ReceivedInstantBankTransferDetails.Direction.WITHDRAW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, ReceivedInstantBankTransferDetails.Direction> {

            /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ReceivedInstantBankTransferDetails.Direction.values().length];
                    try {
                        iArr[ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.Direction.DEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ReceivedInstantBankTransferDetails.Direction.WITHDRAW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ReceivedInstantBankTransferDetails.Direction> getProtoAdapter() {
                return ReceivedInstantBankTransferDetails.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(ReceivedInstantBankTransferDetails.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectionDto.DEPOSIT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectionDto.WITHDRAW;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, ReceivedInstantBankTransferDetails.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ReceivedInstantBankTransferDetails.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ReceivedInstantBankTransferDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ReceivedInstantBankTransferDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReceivedInstantBankTransferDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReceivedInstantBankTransferDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReceivedInstantBankTransferDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReceivedInstantBankTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetailsDto";
        }
    }
}
