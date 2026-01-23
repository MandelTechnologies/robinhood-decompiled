package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
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
import com.robinhood.rosetta.cashier.ACHTransferDetails;
import com.robinhood.rosetta.cashier.ACHTransferDetailsDto;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
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
import rosetta.cashier.TransferEvent;
import rosetta.cashier.TransferEventDto2;

/* compiled from: ACHTransferDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b3\b\u0007\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bmlnopqrsB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B³\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010(\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0006\u00100J·\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010(\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020;H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020;H\u0016¢\u0006\u0004\bD\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010GR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bR\u00106R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bS\u00106R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bT\u00106R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\bU\u0010PR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010MR\u0011\u0010\u001d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bY\u00106R\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0019\u0010 \u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\b\\\u0010PR\u0011\u0010\"\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b_\u0010GR\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010&\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bb\u0010MR\u0013\u0010'\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bc\u0010WR\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bd\u00106R\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010,\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010.\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010/\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bk\u0010W¨\u0006t"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;)V", "Lokio/ByteString;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "expected_ach_landing_datetime", "Lcom/robinhood/rosetta/common/DateDto;", "expected_ach_landing_date", "reversal_fee", "reversal_reason", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "return_reason", "fees_reversed_at", "", "scheduled", "investment_schedule_id", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "instant_used", "submitted_date", "partner_bank", "Lcom/robinhood/rosetta/common/RHEntityDto;", "rh_entity_type", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "source_type", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "purpose", "settlement_date", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntityDto;Lrosetta/cashier/TransferEventDto$SourceTypeDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;Lcom/robinhood/rosetta/common/DateDto;)V", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntityDto;Lrosetta/cashier/TransferEventDto$SourceTypeDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;Lcom/robinhood/rosetta/common/DateDto;)Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "getTransfer_id", "()Lokio/ByteString;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "getState", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getVulnerable_aml_amount", "getCreated_at", "()Lj$/time/Instant;", "getRelationship_master_id", "getBank_account_nickname", "getBank_account_last_four", "getBank_account_routing_number", "getExpected_ach_landing_datetime", "getExpected_ach_landing_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getReversal_fee", "getReversal_reason", "getReturn_reason", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "getFees_reversed_at", "getScheduled", "()Z", "getInvestment_schedule_id", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getInstant_used", "getSubmitted_date", "getPartner_bank", "getRh_entity_type", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "getSource_type", "()Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "getPurpose", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "getSettlement_date", "Companion", "Surrogate", "StateDto", "DirectionDto", "ReturnReasonDto", "PurposeDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ACHTransferDetailsDto implements Dto3<ACHTransferDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ACHTransferDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ACHTransferDetailsDto, ACHTransferDetails>> binaryBase64Serializer$delegate;
    private static final ACHTransferDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ACHTransferDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ACHTransferDetailsDto(Surrogate surrogate) {
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

    public final Instant getExpected_ach_landing_datetime() {
        return this.surrogate.getExpected_ach_landing_datetime();
    }

    public final DateDto getExpected_ach_landing_date() {
        return this.surrogate.getExpected_ach_landing_date();
    }

    public final MoneyDto getReversal_fee() {
        return this.surrogate.getReversal_fee();
    }

    public final String getReversal_reason() {
        return this.surrogate.getReversal_reason();
    }

    public final ReturnReasonDto getReturn_reason() {
        return this.surrogate.getReturn_reason();
    }

    public final Instant getFees_reversed_at() {
        return this.surrogate.getFees_reversed_at();
    }

    public final boolean getScheduled() {
        return this.surrogate.getScheduled();
    }

    public final ByteString getInvestment_schedule_id() {
        return this.surrogate.getInvestment_schedule_id();
    }

    public final AccountTypeDto getRh_account_type() {
        return this.surrogate.getRh_account_type();
    }

    public final MoneyDto getInstant_used() {
        return this.surrogate.getInstant_used();
    }

    public final DateDto getSubmitted_date() {
        return this.surrogate.getSubmitted_date();
    }

    public final String getPartner_bank() {
        return this.surrogate.getPartner_bank();
    }

    public final RHEntityDto getRh_entity_type() {
        return this.surrogate.getRh_entity_type();
    }

    public final TransferEventDto2 getSource_type() {
        return this.surrogate.getSource_type();
    }

    public final PurposeDto getPurpose() {
        return this.surrogate.getPurpose();
    }

    public final DateDto getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public /* synthetic */ ACHTransferDetailsDto(ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String str4, ReturnReasonDto returnReasonDto, Instant instant3, boolean z, ByteString byteString3, AccountTypeDto accountTypeDto, MoneyDto moneyDto4, DateDto dateDto2, String str5, RHEntityDto rHEntityDto, TransferEventDto2 transferEventDto2, PurposeDto purposeDto, DateDto dateDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : dateDto, (i & 4096) != 0 ? null : moneyDto3, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? ReturnReasonDto.INSTANCE.getZeroValue() : returnReasonDto, (i & 32768) != 0 ? null : instant3, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? ByteString.EMPTY : byteString3, (i & 262144) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 524288) != 0 ? null : moneyDto4, (i & 1048576) != 0 ? null : dateDto2, (i & 2097152) == 0 ? str5 : "", (i & 4194304) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto, (i & 8388608) != 0 ? TransferEventDto2.INSTANCE.getZeroValue() : transferEventDto2, (i & 16777216) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 33554432) != 0 ? null : dateDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ACHTransferDetailsDto(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String reversal_reason, ReturnReasonDto return_reason, Instant instant3, boolean z, ByteString investment_schedule_id, AccountTypeDto rh_account_type, MoneyDto moneyDto4, DateDto dateDto2, String partner_bank, RHEntityDto rh_entity_type, TransferEventDto2 source_type, PurposeDto purpose, DateDto dateDto3) {
        this(new Surrogate(transfer_id, direction, state, moneyDto, moneyDto2, instant, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, instant2, dateDto, moneyDto3, reversal_reason, return_reason, instant3, z, investment_schedule_id, rh_account_type, moneyDto4, dateDto2, partner_bank, rh_entity_type, source_type, purpose, dateDto3));
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(return_reason, "return_reason");
        Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
    }

    public static /* synthetic */ ACHTransferDetailsDto copy$default(ACHTransferDetailsDto aCHTransferDetailsDto, ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String str4, ReturnReasonDto returnReasonDto, Instant instant3, boolean z, ByteString byteString3, AccountTypeDto accountTypeDto, MoneyDto moneyDto4, DateDto dateDto2, String str5, RHEntityDto rHEntityDto, TransferEventDto2 transferEventDto2, PurposeDto purposeDto, DateDto dateDto3, int i, Object obj) {
        DateDto settlement_date;
        PurposeDto purposeDto2;
        ByteString transfer_id = (i & 1) != 0 ? aCHTransferDetailsDto.surrogate.getTransfer_id() : byteString;
        DirectionDto direction = (i & 2) != 0 ? aCHTransferDetailsDto.surrogate.getDirection() : directionDto;
        StateDto state = (i & 4) != 0 ? aCHTransferDetailsDto.surrogate.getState() : stateDto;
        MoneyDto amount = (i & 8) != 0 ? aCHTransferDetailsDto.surrogate.getAmount() : moneyDto;
        MoneyDto vulnerable_aml_amount = (i & 16) != 0 ? aCHTransferDetailsDto.surrogate.getVulnerable_aml_amount() : moneyDto2;
        Instant created_at = (i & 32) != 0 ? aCHTransferDetailsDto.surrogate.getCreated_at() : instant;
        ByteString relationship_master_id = (i & 64) != 0 ? aCHTransferDetailsDto.surrogate.getRelationship_master_id() : byteString2;
        String bank_account_nickname = (i & 128) != 0 ? aCHTransferDetailsDto.surrogate.getBank_account_nickname() : str;
        String bank_account_last_four = (i & 256) != 0 ? aCHTransferDetailsDto.surrogate.getBank_account_last_four() : str2;
        String bank_account_routing_number = (i & 512) != 0 ? aCHTransferDetailsDto.surrogate.getBank_account_routing_number() : str3;
        Instant expected_ach_landing_datetime = (i & 1024) != 0 ? aCHTransferDetailsDto.surrogate.getExpected_ach_landing_datetime() : instant2;
        DateDto expected_ach_landing_date = (i & 2048) != 0 ? aCHTransferDetailsDto.surrogate.getExpected_ach_landing_date() : dateDto;
        MoneyDto reversal_fee = (i & 4096) != 0 ? aCHTransferDetailsDto.surrogate.getReversal_fee() : moneyDto3;
        String reversal_reason = (i & 8192) != 0 ? aCHTransferDetailsDto.surrogate.getReversal_reason() : str4;
        ByteString byteString4 = transfer_id;
        ReturnReasonDto return_reason = (i & 16384) != 0 ? aCHTransferDetailsDto.surrogate.getReturn_reason() : returnReasonDto;
        Instant fees_reversed_at = (i & 32768) != 0 ? aCHTransferDetailsDto.surrogate.getFees_reversed_at() : instant3;
        boolean scheduled = (i & 65536) != 0 ? aCHTransferDetailsDto.surrogate.getScheduled() : z;
        ByteString investment_schedule_id = (i & 131072) != 0 ? aCHTransferDetailsDto.surrogate.getInvestment_schedule_id() : byteString3;
        AccountTypeDto rh_account_type = (i & 262144) != 0 ? aCHTransferDetailsDto.surrogate.getRh_account_type() : accountTypeDto;
        MoneyDto instant_used = (i & 524288) != 0 ? aCHTransferDetailsDto.surrogate.getInstant_used() : moneyDto4;
        DateDto submitted_date = (i & 1048576) != 0 ? aCHTransferDetailsDto.surrogate.getSubmitted_date() : dateDto2;
        String partner_bank = (i & 2097152) != 0 ? aCHTransferDetailsDto.surrogate.getPartner_bank() : str5;
        RHEntityDto rh_entity_type = (i & 4194304) != 0 ? aCHTransferDetailsDto.surrogate.getRh_entity_type() : rHEntityDto;
        TransferEventDto2 source_type = (i & 8388608) != 0 ? aCHTransferDetailsDto.surrogate.getSource_type() : transferEventDto2;
        PurposeDto purpose = (i & 16777216) != 0 ? aCHTransferDetailsDto.surrogate.getPurpose() : purposeDto;
        if ((i & 33554432) != 0) {
            purposeDto2 = purpose;
            settlement_date = aCHTransferDetailsDto.surrogate.getSettlement_date();
        } else {
            settlement_date = dateDto3;
            purposeDto2 = purpose;
        }
        return aCHTransferDetailsDto.copy(byteString4, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, expected_ach_landing_date, reversal_fee, reversal_reason, return_reason, fees_reversed_at, scheduled, investment_schedule_id, rh_account_type, instant_used, submitted_date, partner_bank, rh_entity_type, source_type, purposeDto2, settlement_date);
    }

    public final ACHTransferDetailsDto copy(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto amount, MoneyDto vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant expected_ach_landing_datetime, DateDto expected_ach_landing_date, MoneyDto reversal_fee, String reversal_reason, ReturnReasonDto return_reason, Instant fees_reversed_at, boolean scheduled, ByteString investment_schedule_id, AccountTypeDto rh_account_type, MoneyDto instant_used, DateDto submitted_date, String partner_bank, RHEntityDto rh_entity_type, TransferEventDto2 source_type, PurposeDto purpose, DateDto settlement_date) {
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(return_reason, "return_reason");
        Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return new ACHTransferDetailsDto(new Surrogate(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, expected_ach_landing_date, reversal_fee, reversal_reason, return_reason, fees_reversed_at, scheduled, investment_schedule_id, rh_account_type, instant_used, submitted_date, partner_bank, rh_entity_type, source_type, purpose, settlement_date));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ACHTransferDetails toProto() {
        ByteString transfer_id = this.surrogate.getTransfer_id();
        ACHTransferDetails.Direction direction = (ACHTransferDetails.Direction) this.surrogate.getDirection().toProto();
        ACHTransferDetails.State state = (ACHTransferDetails.State) this.surrogate.getState().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        MoneyDto vulnerable_aml_amount = this.surrogate.getVulnerable_aml_amount();
        Money proto2 = vulnerable_aml_amount != null ? vulnerable_aml_amount.toProto() : null;
        Instant created_at = this.surrogate.getCreated_at();
        ByteString relationship_master_id = this.surrogate.getRelationship_master_id();
        String bank_account_nickname = this.surrogate.getBank_account_nickname();
        String bank_account_last_four = this.surrogate.getBank_account_last_four();
        String bank_account_routing_number = this.surrogate.getBank_account_routing_number();
        Instant expected_ach_landing_datetime = this.surrogate.getExpected_ach_landing_datetime();
        DateDto expected_ach_landing_date = this.surrogate.getExpected_ach_landing_date();
        Date proto3 = expected_ach_landing_date != null ? expected_ach_landing_date.toProto() : null;
        MoneyDto reversal_fee = this.surrogate.getReversal_fee();
        Money proto4 = reversal_fee != null ? reversal_fee.toProto() : null;
        String reversal_reason = this.surrogate.getReversal_reason();
        ACHTransferDetails.ReturnReason returnReason = (ACHTransferDetails.ReturnReason) this.surrogate.getReturn_reason().toProto();
        Instant fees_reversed_at = this.surrogate.getFees_reversed_at();
        boolean scheduled = this.surrogate.getScheduled();
        ByteString investment_schedule_id = this.surrogate.getInvestment_schedule_id();
        AccountType accountType = (AccountType) this.surrogate.getRh_account_type().toProto();
        MoneyDto instant_used = this.surrogate.getInstant_used();
        Money proto5 = instant_used != null ? instant_used.toProto() : null;
        DateDto submitted_date = this.surrogate.getSubmitted_date();
        Date proto6 = submitted_date != null ? submitted_date.toProto() : null;
        String partner_bank = this.surrogate.getPartner_bank();
        RHEntity rHEntity = (RHEntity) this.surrogate.getRh_entity_type().toProto();
        TransferEvent transferEvent = (TransferEvent) this.surrogate.getSource_type().toProto();
        ACHTransferDetails.Purpose purpose = (ACHTransferDetails.Purpose) this.surrogate.getPurpose().toProto();
        DateDto settlement_date = this.surrogate.getSettlement_date();
        return new ACHTransferDetails(transfer_id, direction, state, proto, proto2, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, proto3, proto4, reversal_reason, returnReason, fees_reversed_at, scheduled, investment_schedule_id, accountType, proto5, proto6, partner_bank, rHEntity, transferEvent, purpose, settlement_date != null ? settlement_date.toProto() : null, null, 67108864, null);
    }

    public String toString() {
        return "[ACHTransferDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ACHTransferDetailsDto) && Intrinsics.areEqual(((ACHTransferDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bw\b\u0083\b\u0018\u0000 ¯\u00012\u00020\u0001:\u0004°\u0001¯\u0001B¸\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012.\b\u0002\u0010\u001e\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u0017\b\u0002\u0010!\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010&\u001a\u00020\u0013\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b.\u0010/B\u009d\u0002\b\u0010\u0012\u0006\u00101\u001a\u000200\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0018\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b.\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bF\u0010EJ6\u0010G\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\bI\u0010?J\u0010\u0010J\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0010\u0010M\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bM\u0010KJ6\u0010N\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\bN\u0010HJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bQ\u0010EJ\u0010\u0010R\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bR\u0010KJ\u0010\u0010S\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bS\u0010TJ6\u0010U\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\bU\u0010HJ\u0010\u0010V\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\bX\u0010?J\u0010\u0010Y\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b[\u0010EJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\\\u0010PJ\u0010\u0010]\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b]\u0010KJ\u0010\u0010^\u001a\u00020'HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020)HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020+HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bd\u0010PJÁ\u0003\u0010e\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001c2.\b\u0002\u0010\u001e\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\b\b\u0002\u0010 \u001a\u00020\u001f2\u0017\b\u0002\u0010!\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010&\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bg\u0010KJ\u0010\u0010h\u001a\u000200HÖ\u0001¢\u0006\u0004\bh\u0010iJ\u001a\u0010k\u001a\u00020\u001f2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bk\u0010lR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010m\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010?R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010q\u0012\u0004\bs\u0010p\u001a\u0004\br\u0010AR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010t\u0012\u0004\bv\u0010p\u001a\u0004\bu\u0010CR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010w\u0012\u0004\by\u0010p\u001a\u0004\bx\u0010ER\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010w\u0012\u0004\b{\u0010p\u001a\u0004\bz\u0010ERF\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010|\u0012\u0004\b~\u0010p\u001a\u0004\b}\u0010HR0\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u0012\u0010m\u0012\u0005\b\u0080\u0001\u0010p\u001a\u0004\b\u007f\u0010?R#\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0014\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010p\u001a\u0005\b\u0082\u0001\u0010KR#\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0015\u0010\u0081\u0001\u0012\u0005\b\u0085\u0001\u0010p\u001a\u0005\b\u0084\u0001\u0010KR#\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0016\u0010\u0081\u0001\u0012\u0005\b\u0087\u0001\u0010p\u001a\u0005\b\u0086\u0001\u0010KRH\u0010\u0017\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0017\u0010|\u0012\u0005\b\u0089\u0001\u0010p\u001a\u0005\b\u0088\u0001\u0010HR%\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0019\u0010\u008a\u0001\u0012\u0005\b\u008c\u0001\u0010p\u001a\u0005\b\u008b\u0001\u0010PR$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001a\u0010w\u0012\u0005\b\u008e\u0001\u0010p\u001a\u0005\b\u008d\u0001\u0010ER#\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0081\u0001\u0012\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u008f\u0001\u0010KR#\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0091\u0001\u0012\u0005\b\u0093\u0001\u0010p\u001a\u0005\b\u0092\u0001\u0010TRH\u0010\u001e\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010|\u0012\u0005\b\u0095\u0001\u0010p\u001a\u0005\b\u0094\u0001\u0010HR#\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010\u0096\u0001\u0012\u0005\b\u0098\u0001\u0010p\u001a\u0005\b\u0097\u0001\u0010WR1\u0010!\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010m\u0012\u0005\b\u009a\u0001\u0010p\u001a\u0005\b\u0099\u0001\u0010?R#\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010\u009b\u0001\u0012\u0005\b\u009d\u0001\u0010p\u001a\u0005\b\u009c\u0001\u0010ZR$\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010w\u0012\u0005\b\u009f\u0001\u0010p\u001a\u0005\b\u009e\u0001\u0010ER%\u0010%\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010\u008a\u0001\u0012\u0005\b¡\u0001\u0010p\u001a\u0005\b \u0001\u0010PR#\u0010&\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b&\u0010\u0081\u0001\u0012\u0005\b£\u0001\u0010p\u001a\u0005\b¢\u0001\u0010KR#\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b(\u0010¤\u0001\u0012\u0005\b¦\u0001\u0010p\u001a\u0005\b¥\u0001\u0010_R#\u0010*\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b*\u0010§\u0001\u0012\u0005\b©\u0001\u0010p\u001a\u0005\b¨\u0001\u0010aR#\u0010,\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b,\u0010ª\u0001\u0012\u0005\b¬\u0001\u0010p\u001a\u0005\b«\u0001\u0010cR%\u0010-\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b-\u0010\u008a\u0001\u0012\u0005\b®\u0001\u0010p\u001a\u0005\b\u00ad\u0001\u0010P¨\u0006±\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "expected_ach_landing_datetime", "Lcom/robinhood/rosetta/common/DateDto;", "expected_ach_landing_date", "reversal_fee", "reversal_reason", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "return_reason", "fees_reversed_at", "", "scheduled", "investment_schedule_id", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "instant_used", "submitted_date", "partner_bank", "Lcom/robinhood/rosetta/common/RHEntityDto;", "rh_entity_type", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "source_type", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "purpose", "settlement_date", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntityDto;Lrosetta/cashier/TransferEventDto$SourceTypeDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;Lcom/robinhood/rosetta/common/DateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntityDto;Lrosetta/cashier/TransferEventDto$SourceTypeDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;Lcom/robinhood/rosetta/common/DateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "component3", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "component4", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component5", "component6", "()Lj$/time/Instant;", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "()Lcom/robinhood/rosetta/common/DateDto;", "component13", "component14", "component15", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "component16", "component17", "()Z", "component18", "component19", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "component20", "component21", "component22", "component23", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "component24", "()Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "component25", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "component26", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntityDto;Lrosetta/cashier/TransferEventDto$SourceTypeDto;Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;Lcom/robinhood/rosetta/common/DateDto;)Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getTransfer_id", "getTransfer_id$annotations", "()V", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "getDirection", "getDirection$annotations", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "getState", "getState$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "getAmount$annotations", "getVulnerable_aml_amount", "getVulnerable_aml_amount$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getRelationship_master_id", "getRelationship_master_id$annotations", "Ljava/lang/String;", "getBank_account_nickname", "getBank_account_nickname$annotations", "getBank_account_last_four", "getBank_account_last_four$annotations", "getBank_account_routing_number", "getBank_account_routing_number$annotations", "getExpected_ach_landing_datetime", "getExpected_ach_landing_datetime$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getExpected_ach_landing_date", "getExpected_ach_landing_date$annotations", "getReversal_fee", "getReversal_fee$annotations", "getReversal_reason", "getReversal_reason$annotations", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "getReturn_reason", "getReturn_reason$annotations", "getFees_reversed_at", "getFees_reversed_at$annotations", "Z", "getScheduled", "getScheduled$annotations", "getInvestment_schedule_id", "getInvestment_schedule_id$annotations", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "getRh_account_type", "getRh_account_type$annotations", "getInstant_used", "getInstant_used$annotations", "getSubmitted_date", "getSubmitted_date$annotations", "getPartner_bank", "getPartner_bank$annotations", "Lcom/robinhood/rosetta/common/RHEntityDto;", "getRh_entity_type", "getRh_entity_type$annotations", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "getSource_type", "getSource_type$annotations", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "getPurpose", "getPurpose$annotations", "getSettlement_date", "getSettlement_date$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
        private final DateDto expected_ach_landing_date;
        private final Instant expected_ach_landing_datetime;
        private final Instant fees_reversed_at;
        private final MoneyDto instant_used;
        private final ByteString investment_schedule_id;
        private final String partner_bank;
        private final PurposeDto purpose;
        private final ByteString relationship_master_id;
        private final ReturnReasonDto return_reason;
        private final MoneyDto reversal_fee;
        private final String reversal_reason;
        private final AccountTypeDto rh_account_type;
        private final RHEntityDto rh_entity_type;
        private final boolean scheduled;
        private final DateDto settlement_date;
        private final TransferEventDto2 source_type;
        private final StateDto state;
        private final DateDto submitted_date;
        private final ByteString transfer_id;
        private final MoneyDto vulnerable_aml_amount;

        public Surrogate() {
            this((ByteString) null, (DirectionDto) null, (StateDto) null, (MoneyDto) null, (MoneyDto) null, (Instant) null, (ByteString) null, (String) null, (String) null, (String) null, (Instant) null, (DateDto) null, (MoneyDto) null, (String) null, (ReturnReasonDto) null, (Instant) null, false, (ByteString) null, (AccountTypeDto) null, (MoneyDto) null, (DateDto) null, (String) null, (RHEntityDto) null, (TransferEventDto2) null, (PurposeDto) null, (DateDto) null, 67108863, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String str4, ReturnReasonDto returnReasonDto, Instant instant3, boolean z, ByteString byteString3, AccountTypeDto accountTypeDto, MoneyDto moneyDto4, DateDto dateDto2, String str5, RHEntityDto rHEntityDto, TransferEventDto2 transferEventDto2, PurposeDto purposeDto, DateDto dateDto3, int i, Object obj) {
            DateDto dateDto4;
            PurposeDto purposeDto2;
            ByteString byteString4 = (i & 1) != 0 ? surrogate.transfer_id : byteString;
            DirectionDto directionDto2 = (i & 2) != 0 ? surrogate.direction : directionDto;
            StateDto stateDto2 = (i & 4) != 0 ? surrogate.state : stateDto;
            MoneyDto moneyDto5 = (i & 8) != 0 ? surrogate.amount : moneyDto;
            MoneyDto moneyDto6 = (i & 16) != 0 ? surrogate.vulnerable_aml_amount : moneyDto2;
            Instant instant4 = (i & 32) != 0 ? surrogate.created_at : instant;
            ByteString byteString5 = (i & 64) != 0 ? surrogate.relationship_master_id : byteString2;
            String str6 = (i & 128) != 0 ? surrogate.bank_account_nickname : str;
            String str7 = (i & 256) != 0 ? surrogate.bank_account_last_four : str2;
            String str8 = (i & 512) != 0 ? surrogate.bank_account_routing_number : str3;
            Instant instant5 = (i & 1024) != 0 ? surrogate.expected_ach_landing_datetime : instant2;
            DateDto dateDto5 = (i & 2048) != 0 ? surrogate.expected_ach_landing_date : dateDto;
            MoneyDto moneyDto7 = (i & 4096) != 0 ? surrogate.reversal_fee : moneyDto3;
            String str9 = (i & 8192) != 0 ? surrogate.reversal_reason : str4;
            ByteString byteString6 = byteString4;
            ReturnReasonDto returnReasonDto2 = (i & 16384) != 0 ? surrogate.return_reason : returnReasonDto;
            Instant instant6 = (i & 32768) != 0 ? surrogate.fees_reversed_at : instant3;
            boolean z2 = (i & 65536) != 0 ? surrogate.scheduled : z;
            ByteString byteString7 = (i & 131072) != 0 ? surrogate.investment_schedule_id : byteString3;
            AccountTypeDto accountTypeDto2 = (i & 262144) != 0 ? surrogate.rh_account_type : accountTypeDto;
            MoneyDto moneyDto8 = (i & 524288) != 0 ? surrogate.instant_used : moneyDto4;
            DateDto dateDto6 = (i & 1048576) != 0 ? surrogate.submitted_date : dateDto2;
            String str10 = (i & 2097152) != 0 ? surrogate.partner_bank : str5;
            RHEntityDto rHEntityDto2 = (i & 4194304) != 0 ? surrogate.rh_entity_type : rHEntityDto;
            TransferEventDto2 transferEventDto22 = (i & 8388608) != 0 ? surrogate.source_type : transferEventDto2;
            PurposeDto purposeDto3 = (i & 16777216) != 0 ? surrogate.purpose : purposeDto;
            if ((i & 33554432) != 0) {
                purposeDto2 = purposeDto3;
                dateDto4 = surrogate.settlement_date;
            } else {
                dateDto4 = dateDto3;
                purposeDto2 = purposeDto3;
            }
            return surrogate.copy(byteString6, directionDto2, stateDto2, moneyDto5, moneyDto6, instant4, byteString5, str6, str7, str8, instant5, dateDto5, moneyDto7, str9, returnReasonDto2, instant6, z2, byteString7, accountTypeDto2, moneyDto8, dateDto6, str10, rHEntityDto2, transferEventDto22, purposeDto2, dateDto4);
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

        @SerialName("expectedAchLandingDate")
        @JsonAnnotations2(names = {"expected_ach_landing_date"})
        public static /* synthetic */ void getExpected_ach_landing_date$annotations() {
        }

        @SerialName("expectedAchLandingDatetime")
        @JsonAnnotations2(names = {"expected_ach_landing_datetime"})
        public static /* synthetic */ void getExpected_ach_landing_datetime$annotations() {
        }

        @SerialName("feesReversedAt")
        @JsonAnnotations2(names = {"fees_reversed_at"})
        public static /* synthetic */ void getFees_reversed_at$annotations() {
        }

        @SerialName("instantUsed")
        @JsonAnnotations2(names = {"instant_used"})
        public static /* synthetic */ void getInstant_used$annotations() {
        }

        @SerialName("investmentScheduleId")
        @JsonAnnotations2(names = {"investment_schedule_id"})
        public static /* synthetic */ void getInvestment_schedule_id$annotations() {
        }

        @SerialName("partnerBank")
        @JsonAnnotations2(names = {"partner_bank"})
        public static /* synthetic */ void getPartner_bank$annotations() {
        }

        @SerialName("purpose")
        @JsonAnnotations2(names = {"purpose"})
        public static /* synthetic */ void getPurpose$annotations() {
        }

        @SerialName("relationshipMasterId")
        @JsonAnnotations2(names = {"relationship_master_id"})
        public static /* synthetic */ void getRelationship_master_id$annotations() {
        }

        @SerialName("returnReason")
        @JsonAnnotations2(names = {"return_reason"})
        public static /* synthetic */ void getReturn_reason$annotations() {
        }

        @SerialName("reversalFee")
        @JsonAnnotations2(names = {"reversal_fee"})
        public static /* synthetic */ void getReversal_fee$annotations() {
        }

        @SerialName("reversalReason")
        @JsonAnnotations2(names = {"reversal_reason"})
        public static /* synthetic */ void getReversal_reason$annotations() {
        }

        @SerialName("rhAccountType")
        @JsonAnnotations2(names = {"rh_account_type"})
        public static /* synthetic */ void getRh_account_type$annotations() {
        }

        @SerialName("rhEntityType")
        @JsonAnnotations2(names = {"rh_entity_type"})
        public static /* synthetic */ void getRh_entity_type$annotations() {
        }

        @SerialName("scheduled")
        @JsonAnnotations2(names = {"scheduled"})
        public static /* synthetic */ void getScheduled$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("sourceType")
        @JsonAnnotations2(names = {"source_type"})
        public static /* synthetic */ void getSource_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("submittedDate")
        @JsonAnnotations2(names = {"submitted_date"})
        public static /* synthetic */ void getSubmitted_date$annotations() {
        }

        @SerialName("transferId")
        @JsonAnnotations2(names = {MatchSelectionActivity.TRANSFER_ID_EXTRA})
        public static /* synthetic */ void getTransfer_id$annotations() {
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
        public final Instant getExpected_ach_landing_datetime() {
            return this.expected_ach_landing_datetime;
        }

        /* renamed from: component12, reason: from getter */
        public final DateDto getExpected_ach_landing_date() {
            return this.expected_ach_landing_date;
        }

        /* renamed from: component13, reason: from getter */
        public final MoneyDto getReversal_fee() {
            return this.reversal_fee;
        }

        /* renamed from: component14, reason: from getter */
        public final String getReversal_reason() {
            return this.reversal_reason;
        }

        /* renamed from: component15, reason: from getter */
        public final ReturnReasonDto getReturn_reason() {
            return this.return_reason;
        }

        /* renamed from: component16, reason: from getter */
        public final Instant getFees_reversed_at() {
            return this.fees_reversed_at;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getScheduled() {
            return this.scheduled;
        }

        /* renamed from: component18, reason: from getter */
        public final ByteString getInvestment_schedule_id() {
            return this.investment_schedule_id;
        }

        /* renamed from: component19, reason: from getter */
        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component20, reason: from getter */
        public final MoneyDto getInstant_used() {
            return this.instant_used;
        }

        /* renamed from: component21, reason: from getter */
        public final DateDto getSubmitted_date() {
            return this.submitted_date;
        }

        /* renamed from: component22, reason: from getter */
        public final String getPartner_bank() {
            return this.partner_bank;
        }

        /* renamed from: component23, reason: from getter */
        public final RHEntityDto getRh_entity_type() {
            return this.rh_entity_type;
        }

        /* renamed from: component24, reason: from getter */
        public final TransferEventDto2 getSource_type() {
            return this.source_type;
        }

        /* renamed from: component25, reason: from getter */
        public final PurposeDto getPurpose() {
            return this.purpose;
        }

        /* renamed from: component26, reason: from getter */
        public final DateDto getSettlement_date() {
            return this.settlement_date;
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

        public final Surrogate copy(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto amount, MoneyDto vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant expected_ach_landing_datetime, DateDto expected_ach_landing_date, MoneyDto reversal_fee, String reversal_reason, ReturnReasonDto return_reason, Instant fees_reversed_at, boolean scheduled, ByteString investment_schedule_id, AccountTypeDto rh_account_type, MoneyDto instant_used, DateDto submitted_date, String partner_bank, RHEntityDto rh_entity_type, TransferEventDto2 source_type, PurposeDto purpose, DateDto settlement_date) {
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
            Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
            Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
            Intrinsics.checkNotNullParameter(return_reason, "return_reason");
            Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
            Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            return new Surrogate(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, expected_ach_landing_date, reversal_fee, reversal_reason, return_reason, fees_reversed_at, scheduled, investment_schedule_id, rh_account_type, instant_used, submitted_date, partner_bank, rh_entity_type, source_type, purpose, settlement_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && this.direction == surrogate.direction && this.state == surrogate.state && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.vulnerable_aml_amount, surrogate.vulnerable_aml_amount) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.relationship_master_id, surrogate.relationship_master_id) && Intrinsics.areEqual(this.bank_account_nickname, surrogate.bank_account_nickname) && Intrinsics.areEqual(this.bank_account_last_four, surrogate.bank_account_last_four) && Intrinsics.areEqual(this.bank_account_routing_number, surrogate.bank_account_routing_number) && Intrinsics.areEqual(this.expected_ach_landing_datetime, surrogate.expected_ach_landing_datetime) && Intrinsics.areEqual(this.expected_ach_landing_date, surrogate.expected_ach_landing_date) && Intrinsics.areEqual(this.reversal_fee, surrogate.reversal_fee) && Intrinsics.areEqual(this.reversal_reason, surrogate.reversal_reason) && this.return_reason == surrogate.return_reason && Intrinsics.areEqual(this.fees_reversed_at, surrogate.fees_reversed_at) && this.scheduled == surrogate.scheduled && Intrinsics.areEqual(this.investment_schedule_id, surrogate.investment_schedule_id) && this.rh_account_type == surrogate.rh_account_type && Intrinsics.areEqual(this.instant_used, surrogate.instant_used) && Intrinsics.areEqual(this.submitted_date, surrogate.submitted_date) && Intrinsics.areEqual(this.partner_bank, surrogate.partner_bank) && this.rh_entity_type == surrogate.rh_entity_type && this.source_type == surrogate.source_type && this.purpose == surrogate.purpose && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date);
        }

        public int hashCode() {
            int iHashCode = ((((this.transfer_id.hashCode() * 31) + this.direction.hashCode()) * 31) + this.state.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.vulnerable_aml_amount;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            Instant instant = this.created_at;
            int iHashCode4 = (((((((((iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31) + this.relationship_master_id.hashCode()) * 31) + this.bank_account_nickname.hashCode()) * 31) + this.bank_account_last_four.hashCode()) * 31) + this.bank_account_routing_number.hashCode()) * 31;
            Instant instant2 = this.expected_ach_landing_datetime;
            int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            DateDto dateDto = this.expected_ach_landing_date;
            int iHashCode6 = (iHashCode5 + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            MoneyDto moneyDto3 = this.reversal_fee;
            int iHashCode7 = (((((iHashCode6 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31) + this.reversal_reason.hashCode()) * 31) + this.return_reason.hashCode()) * 31;
            Instant instant3 = this.fees_reversed_at;
            int iHashCode8 = (((((((iHashCode7 + (instant3 == null ? 0 : instant3.hashCode())) * 31) + Boolean.hashCode(this.scheduled)) * 31) + this.investment_schedule_id.hashCode()) * 31) + this.rh_account_type.hashCode()) * 31;
            MoneyDto moneyDto4 = this.instant_used;
            int iHashCode9 = (iHashCode8 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            DateDto dateDto2 = this.submitted_date;
            int iHashCode10 = (((((((((iHashCode9 + (dateDto2 == null ? 0 : dateDto2.hashCode())) * 31) + this.partner_bank.hashCode()) * 31) + this.rh_entity_type.hashCode()) * 31) + this.source_type.hashCode()) * 31) + this.purpose.hashCode()) * 31;
            DateDto dateDto3 = this.settlement_date;
            return iHashCode10 + (dateDto3 != null ? dateDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(transfer_id=" + this.transfer_id + ", direction=" + this.direction + ", state=" + this.state + ", amount=" + this.amount + ", vulnerable_aml_amount=" + this.vulnerable_aml_amount + ", created_at=" + this.created_at + ", relationship_master_id=" + this.relationship_master_id + ", bank_account_nickname=" + this.bank_account_nickname + ", bank_account_last_four=" + this.bank_account_last_four + ", bank_account_routing_number=" + this.bank_account_routing_number + ", expected_ach_landing_datetime=" + this.expected_ach_landing_datetime + ", expected_ach_landing_date=" + this.expected_ach_landing_date + ", reversal_fee=" + this.reversal_fee + ", reversal_reason=" + this.reversal_reason + ", return_reason=" + this.return_reason + ", fees_reversed_at=" + this.fees_reversed_at + ", scheduled=" + this.scheduled + ", investment_schedule_id=" + this.investment_schedule_id + ", rh_account_type=" + this.rh_account_type + ", instant_used=" + this.instant_used + ", submitted_date=" + this.submitted_date + ", partner_bank=" + this.partner_bank + ", rh_entity_type=" + this.rh_entity_type + ", source_type=" + this.source_type + ", purpose=" + this.purpose + ", settlement_date=" + this.settlement_date + ")";
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ACHTransferDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String str4, ReturnReasonDto returnReasonDto, Instant instant3, boolean z, ByteString byteString3, AccountTypeDto accountTypeDto, MoneyDto moneyDto4, DateDto dateDto2, String str5, RHEntityDto rHEntityDto, TransferEventDto2 transferEventDto2, PurposeDto purposeDto, DateDto dateDto3, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.expected_ach_landing_datetime = null;
            } else {
                this.expected_ach_landing_datetime = instant2;
            }
            if ((i & 2048) == 0) {
                this.expected_ach_landing_date = null;
            } else {
                this.expected_ach_landing_date = dateDto;
            }
            if ((i & 4096) == 0) {
                this.reversal_fee = null;
            } else {
                this.reversal_fee = moneyDto3;
            }
            if ((i & 8192) == 0) {
                this.reversal_reason = "";
            } else {
                this.reversal_reason = str4;
            }
            this.return_reason = (i & 16384) == 0 ? ReturnReasonDto.INSTANCE.getZeroValue() : returnReasonDto;
            if ((32768 & i) == 0) {
                this.fees_reversed_at = null;
            } else {
                this.fees_reversed_at = instant3;
            }
            this.scheduled = (65536 & i) == 0 ? false : z;
            this.investment_schedule_id = (131072 & i) == 0 ? ByteString.EMPTY : byteString3;
            this.rh_account_type = (262144 & i) == 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto;
            if ((524288 & i) == 0) {
                this.instant_used = null;
            } else {
                this.instant_used = moneyDto4;
            }
            if ((1048576 & i) == 0) {
                this.submitted_date = null;
            } else {
                this.submitted_date = dateDto2;
            }
            if ((2097152 & i) == 0) {
                this.partner_bank = "";
            } else {
                this.partner_bank = str5;
            }
            this.rh_entity_type = (4194304 & i) == 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto;
            this.source_type = (8388608 & i) == 0 ? TransferEventDto2.INSTANCE.getZeroValue() : transferEventDto2;
            this.purpose = (16777216 & i) == 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto;
            if ((i & 33554432) == 0) {
                this.settlement_date = null;
            } else {
                this.settlement_date = dateDto3;
            }
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
            Instant instant2 = self.expected_ach_landing_datetime;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant2);
            }
            DateDto dateDto = self.expected_ach_landing_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DateDto.Serializer.INSTANCE, dateDto);
            }
            MoneyDto moneyDto3 = self.reversal_fee;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.reversal_reason, "")) {
                output.encodeStringElement(serialDesc, 13, self.reversal_reason);
            }
            if (self.return_reason != ReturnReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, ReturnReasonDto.Serializer.INSTANCE, self.return_reason);
            }
            Instant instant3 = self.fees_reversed_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, WireInstantSerializer.INSTANCE, instant3);
            }
            boolean z = self.scheduled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 16, z);
            }
            if (!Intrinsics.areEqual(self.investment_schedule_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 17, ByteStringSerializer.INSTANCE, self.investment_schedule_id);
            }
            if (self.rh_account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, AccountTypeDto.Serializer.INSTANCE, self.rh_account_type);
            }
            MoneyDto moneyDto4 = self.instant_used;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            DateDto dateDto2 = self.submitted_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, DateDto.Serializer.INSTANCE, dateDto2);
            }
            if (!Intrinsics.areEqual(self.partner_bank, "")) {
                output.encodeStringElement(serialDesc, 21, self.partner_bank);
            }
            if (self.rh_entity_type != RHEntityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 22, RHEntityDto.Serializer.INSTANCE, self.rh_entity_type);
            }
            if (self.source_type != TransferEventDto2.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 23, TransferEventDto2.Serializer.INSTANCE, self.source_type);
            }
            if (self.purpose != PurposeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 24, PurposeDto.Serializer.INSTANCE, self.purpose);
            }
            DateDto dateDto3 = self.settlement_date;
            if (dateDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, DateDto.Serializer.INSTANCE, dateDto3);
            }
        }

        public Surrogate(ByteString transfer_id, DirectionDto direction, StateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String reversal_reason, ReturnReasonDto return_reason, Instant instant3, boolean z, ByteString investment_schedule_id, AccountTypeDto rh_account_type, MoneyDto moneyDto4, DateDto dateDto2, String partner_bank, RHEntityDto rh_entity_type, TransferEventDto2 source_type, PurposeDto purpose, DateDto dateDto3) {
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
            Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
            Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
            Intrinsics.checkNotNullParameter(return_reason, "return_reason");
            Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
            Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
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
            this.expected_ach_landing_datetime = instant2;
            this.expected_ach_landing_date = dateDto;
            this.reversal_fee = moneyDto3;
            this.reversal_reason = reversal_reason;
            this.return_reason = return_reason;
            this.fees_reversed_at = instant3;
            this.scheduled = z;
            this.investment_schedule_id = investment_schedule_id;
            this.rh_account_type = rh_account_type;
            this.instant_used = moneyDto4;
            this.submitted_date = dateDto2;
            this.partner_bank = partner_bank;
            this.rh_entity_type = rh_entity_type;
            this.source_type = source_type;
            this.purpose = purpose;
            this.settlement_date = dateDto3;
        }

        public final ByteString getTransfer_id() {
            return this.transfer_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, DateDto dateDto, MoneyDto moneyDto3, String str4, ReturnReasonDto returnReasonDto, Instant instant3, boolean z, ByteString byteString3, AccountTypeDto accountTypeDto, MoneyDto moneyDto4, DateDto dateDto2, String str5, RHEntityDto rHEntityDto, TransferEventDto2 transferEventDto2, PurposeDto purposeDto, DateDto dateDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : dateDto, (i & 4096) != 0 ? null : moneyDto3, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? ReturnReasonDto.INSTANCE.getZeroValue() : returnReasonDto, (i & 32768) != 0 ? null : instant3, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? ByteString.EMPTY : byteString3, (i & 262144) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 524288) != 0 ? null : moneyDto4, (i & 1048576) != 0 ? null : dateDto2, (i & 2097152) == 0 ? str5 : "", (i & 4194304) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto, (i & 8388608) != 0 ? TransferEventDto2.INSTANCE.getZeroValue() : transferEventDto2, (i & 16777216) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 33554432) != 0 ? null : dateDto3);
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

        public final Instant getExpected_ach_landing_datetime() {
            return this.expected_ach_landing_datetime;
        }

        public final DateDto getExpected_ach_landing_date() {
            return this.expected_ach_landing_date;
        }

        public final MoneyDto getReversal_fee() {
            return this.reversal_fee;
        }

        public final String getReversal_reason() {
            return this.reversal_reason;
        }

        public final ReturnReasonDto getReturn_reason() {
            return this.return_reason;
        }

        public final Instant getFees_reversed_at() {
            return this.fees_reversed_at;
        }

        public final boolean getScheduled() {
            return this.scheduled;
        }

        public final ByteString getInvestment_schedule_id() {
            return this.investment_schedule_id;
        }

        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        public final MoneyDto getInstant_used() {
            return this.instant_used;
        }

        public final DateDto getSubmitted_date() {
            return this.submitted_date;
        }

        public final String getPartner_bank() {
            return this.partner_bank;
        }

        public final RHEntityDto getRh_entity_type() {
            return this.rh_entity_type;
        }

        public final TransferEventDto2 getSource_type() {
            return this.source_type;
        }

        public final PurposeDto getPurpose() {
            return this.purpose;
        }

        public final DateDto getSettlement_date() {
            return this.settlement_date;
        }
    }

    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ACHTransferDetailsDto, ACHTransferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ACHTransferDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHTransferDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHTransferDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ACHTransferDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ACHTransferDetails> getProtoAdapter() {
            return ACHTransferDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHTransferDetailsDto getZeroValue() {
            return ACHTransferDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHTransferDetailsDto fromProto(ACHTransferDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString transfer_id = proto.getTransfer_id();
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Money vulnerable_aml_amount = proto.getVulnerable_aml_amount();
            MoneyDto moneyDtoFromProto2 = vulnerable_aml_amount != null ? MoneyDto.INSTANCE.fromProto(vulnerable_aml_amount) : null;
            Instant created_at = proto.getCreated_at();
            ByteString relationship_master_id = proto.getRelationship_master_id();
            String bank_account_nickname = proto.getBank_account_nickname();
            String bank_account_last_four = proto.getBank_account_last_four();
            String bank_account_routing_number = proto.getBank_account_routing_number();
            Instant expected_ach_landing_datetime = proto.getExpected_ach_landing_datetime();
            Date expected_ach_landing_date = proto.getExpected_ach_landing_date();
            DateDto dateDtoFromProto = expected_ach_landing_date != null ? DateDto.INSTANCE.fromProto(expected_ach_landing_date) : null;
            Money reversal_fee = proto.getReversal_fee();
            MoneyDto moneyDtoFromProto3 = reversal_fee != null ? MoneyDto.INSTANCE.fromProto(reversal_fee) : null;
            String reversal_reason = proto.getReversal_reason();
            MoneyDto moneyDto = moneyDtoFromProto;
            ReturnReasonDto returnReasonDtoFromProto = ReturnReasonDto.INSTANCE.fromProto(proto.getReturn_reason());
            Instant fees_reversed_at = proto.getFees_reversed_at();
            boolean scheduled = proto.getScheduled();
            ByteString investment_schedule_id = proto.getInvestment_schedule_id();
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getRh_account_type());
            Money instant_used = proto.getInstant_used();
            MoneyDto moneyDtoFromProto4 = instant_used != null ? MoneyDto.INSTANCE.fromProto(instant_used) : null;
            Date submitted_date = proto.getSubmitted_date();
            MoneyDto moneyDto2 = moneyDtoFromProto4;
            DateDto dateDtoFromProto2 = submitted_date != null ? DateDto.INSTANCE.fromProto(submitted_date) : null;
            String partner_bank = proto.getPartner_bank();
            DateDto dateDto = dateDtoFromProto2;
            RHEntityDto rHEntityDtoFromProto = RHEntityDto.INSTANCE.fromProto(proto.getRh_entity_type());
            TransferEventDto2 transferEventDto2FromProto = TransferEventDto2.INSTANCE.fromProto(proto.getSource_type());
            PurposeDto purposeDtoFromProto = PurposeDto.INSTANCE.fromProto(proto.getPurpose());
            Date settlement_date = proto.getSettlement_date();
            return new ACHTransferDetailsDto(new Surrogate(transfer_id, directionDtoFromProto, stateDtoFromProto, moneyDto, moneyDtoFromProto2, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, dateDtoFromProto, moneyDtoFromProto3, reversal_reason, returnReasonDtoFromProto, fees_reversed_at, scheduled, investment_schedule_id, accountTypeDtoFromProto, moneyDto2, dateDto, partner_bank, rHEntityDtoFromProto, transferEventDto2FromProto, purposeDtoFromProto, settlement_date != null ? DateDto.INSTANCE.fromProto(settlement_date) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ACHTransferDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ACHTransferDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 67108863, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "NEW", "REQUESTED", "NEEDS_APPROVAL", "APPROVED", "REJECTED", "CANCELLED", "FAILED", "SUBMITTED", "REVERSED", "COMPLETED", "PENDING_CANCEL", "REVIEWING_BALANCE", "ABORTED", "QUEUED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<ACHTransferDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, ACHTransferDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final StateDto NEW = new NEW("NEW", 1);
        public static final StateDto REQUESTED = new REQUESTED("REQUESTED", 2);
        public static final StateDto NEEDS_APPROVAL = new NEEDS_APPROVAL("NEEDS_APPROVAL", 3);
        public static final StateDto APPROVED = new APPROVED("APPROVED", 4);
        public static final StateDto REJECTED = new REJECTED("REJECTED", 5);
        public static final StateDto CANCELLED = new CANCELLED("CANCELLED", 6);
        public static final StateDto FAILED = new FAILED("FAILED", 7);
        public static final StateDto SUBMITTED = new SUBMITTED("SUBMITTED", 8);
        public static final StateDto REVERSED = new REVERSED("REVERSED", 9);
        public static final StateDto COMPLETED = new COMPLETED("COMPLETED", 10);
        public static final StateDto PENDING_CANCEL = new PENDING_CANCEL("PENDING_CANCEL", 11);
        public static final StateDto REVIEWING_BALANCE = new REVIEWING_BALANCE("REVIEWING_BALANCE", 12);
        public static final StateDto ABORTED = new ABORTED("ABORTED", 13);
        public static final StateDto QUEUED = new QUEUED("QUEUED", 14);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{STATE_UNSPECIFIED, NEW, REQUESTED, NEEDS_APPROVAL, APPROVED, REJECTED, CANCELLED, FAILED, SUBMITTED, REVERSED, COMPLETED, PENDING_CANCEL, REVIEWING_BALANCE, ABORTED, QUEUED};
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

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends StateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.STATE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHTransferDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.NEW", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends StateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.NEW;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.REQUESTED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REQUESTED extends StateDto {
            REQUESTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.REQUESTED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.NEEDS_APPROVAL", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEEDS_APPROVAL extends StateDto {
            NEEDS_APPROVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.NEEDS_APPROVAL;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.APPROVED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APPROVED extends StateDto {
            APPROVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.APPROVED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.REJECTED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends StateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.REJECTED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.CANCELLED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELLED extends StateDto {
            CANCELLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.CANCELLED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.FAILED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends StateDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.FAILED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.SUBMITTED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMITTED extends StateDto {
            SUBMITTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.SUBMITTED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.REVERSED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVERSED extends StateDto {
            REVERSED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.REVERSED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.COMPLETED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends StateDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.COMPLETED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.PENDING_CANCEL", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_CANCEL extends StateDto {
            PENDING_CANCEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.PENDING_CANCEL;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.REVIEWING_BALANCE", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEWING_BALANCE extends StateDto {
            REVIEWING_BALANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.REVIEWING_BALANCE;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.ABORTED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ABORTED extends StateDto {
            ABORTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.ABORTED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.StateDto.QUEUED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUEUED extends StateDto {
            QUEUED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.State toProto() {
                return ACHTransferDetails.State.QUEUED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, ACHTransferDetails.State> {

            /* compiled from: ACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHTransferDetails.State.values().length];
                    try {
                        iArr[ACHTransferDetails.State.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.NEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.REQUESTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.NEEDS_APPROVAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.APPROVED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.REJECTED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.CANCELLED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.FAILED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.SUBMITTED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.REVERSED.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.COMPLETED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.PENDING_CANCEL.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.REVIEWING_BALANCE.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.ABORTED.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[ACHTransferDetails.State.QUEUED.ordinal()] = 15;
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
            public ProtoAdapter<ACHTransferDetails.State> getProtoAdapter() {
                return ACHTransferDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(ACHTransferDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return StateDto.STATE_UNSPECIFIED;
                    case 2:
                        return StateDto.NEW;
                    case 3:
                        return StateDto.REQUESTED;
                    case 4:
                        return StateDto.NEEDS_APPROVAL;
                    case 5:
                        return StateDto.APPROVED;
                    case 6:
                        return StateDto.REJECTED;
                    case 7:
                        return StateDto.CANCELLED;
                    case 8:
                        return StateDto.FAILED;
                    case 9:
                        return StateDto.SUBMITTED;
                    case 10:
                        return StateDto.REVERSED;
                    case 11:
                        return StateDto.COMPLETED;
                    case 12:
                        return StateDto.PENDING_CANCEL;
                    case 13:
                        return StateDto.REVIEWING_BALANCE;
                    case 14:
                        return StateDto.ABORTED;
                    case 15:
                        return StateDto.QUEUED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, ACHTransferDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHTransferDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

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
    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_UNSPECIFIED", "DEPOSIT", "WITHDRAW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<ACHTransferDetails.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, ACHTransferDetails.Direction>> binaryBase64Serializer$delegate;
        public static final DirectionDto DIRECTION_UNSPECIFIED = new DIRECTION_UNSPECIFIED("DIRECTION_UNSPECIFIED", 0);
        public static final DirectionDto DEPOSIT = new DEPOSIT("DEPOSIT", 1);
        public static final DirectionDto WITHDRAW = new WITHDRAW("WITHDRAW", 2);

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{DIRECTION_UNSPECIFIED, DEPOSIT, WITHDRAW};
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

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.DirectionDto.DIRECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECTION_UNSPECIFIED extends DirectionDto {
            DIRECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Direction toProto() {
                return ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED;
            }
        }

        private DirectionDto(String str, int i) {
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHTransferDetailsDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.DirectionDto.DEPOSIT", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends DirectionDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Direction toProto() {
                return ACHTransferDetails.Direction.DEPOSIT;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.DirectionDto.WITHDRAW", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAW extends DirectionDto {
            WITHDRAW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Direction toProto() {
                return ACHTransferDetails.Direction.WITHDRAW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, ACHTransferDetails.Direction> {

            /* compiled from: ACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHTransferDetails.Direction.values().length];
                    try {
                        iArr[ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHTransferDetails.Direction.DEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHTransferDetails.Direction.WITHDRAW.ordinal()] = 3;
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
            public ProtoAdapter<ACHTransferDetails.Direction> getProtoAdapter() {
                return ACHTransferDetails.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.DIRECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(ACHTransferDetails.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.DIRECTION_UNSPECIFIED;
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

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, ACHTransferDetails.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHTransferDetails.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RETURN_REASON_UNSPECIFIED", "INSUFFICIENT_FUNDS", "ACCOUNT_CLOSED", "NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT", "INVALID_ACCOUNT_NUMBER", "RETURN_REQUESTED_BY_CUSTOMER_BANK", "AUTHORIZATION_REVOKED_BY_CUSTOMER", "PAYMENT_STOPPED", "UNCOLLECTED_FUNDS", "CUSTOMER_ADVISES_NOT_AUTHORIZED", "BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION", "RDFI_CANNOT_ACCEPT_TRANSFERS", "BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED", "ACCOUNT_FROZEN", "NON_TRANSACTION_ACCOUNT", "CREDIT_ENTRY_REFUSED_BY_RECEIVER", "DUPLICATE_ENTRY", "CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED", "INVALID_TRANSACTION_CODE", "CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ReturnReasonDto implements Dto2<ACHTransferDetails.ReturnReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReturnReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ReturnReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ReturnReasonDto, ACHTransferDetails.ReturnReason>> binaryBase64Serializer$delegate;
        public static final ReturnReasonDto RETURN_REASON_UNSPECIFIED = new RETURN_REASON_UNSPECIFIED("RETURN_REASON_UNSPECIFIED", 0);
        public static final ReturnReasonDto INSUFFICIENT_FUNDS = new INSUFFICIENT_FUNDS("INSUFFICIENT_FUNDS", 1);
        public static final ReturnReasonDto ACCOUNT_CLOSED = new ACCOUNT_CLOSED("ACCOUNT_CLOSED", 2);
        public static final ReturnReasonDto NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT = new NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT("NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT", 3);
        public static final ReturnReasonDto INVALID_ACCOUNT_NUMBER = new INVALID_ACCOUNT_NUMBER("INVALID_ACCOUNT_NUMBER", 4);
        public static final ReturnReasonDto RETURN_REQUESTED_BY_CUSTOMER_BANK = new RETURN_REQUESTED_BY_CUSTOMER_BANK("RETURN_REQUESTED_BY_CUSTOMER_BANK", 5);
        public static final ReturnReasonDto AUTHORIZATION_REVOKED_BY_CUSTOMER = new AUTHORIZATION_REVOKED_BY_CUSTOMER("AUTHORIZATION_REVOKED_BY_CUSTOMER", 6);
        public static final ReturnReasonDto PAYMENT_STOPPED = new PAYMENT_STOPPED("PAYMENT_STOPPED", 7);
        public static final ReturnReasonDto UNCOLLECTED_FUNDS = new UNCOLLECTED_FUNDS("UNCOLLECTED_FUNDS", 8);
        public static final ReturnReasonDto CUSTOMER_ADVISES_NOT_AUTHORIZED = new CUSTOMER_ADVISES_NOT_AUTHORIZED("CUSTOMER_ADVISES_NOT_AUTHORIZED", 9);
        public static final ReturnReasonDto BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION = new BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION("BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION", 10);
        public static final ReturnReasonDto RDFI_CANNOT_ACCEPT_TRANSFERS = new RDFI_CANNOT_ACCEPT_TRANSFERS("RDFI_CANNOT_ACCEPT_TRANSFERS", 11);
        public static final ReturnReasonDto BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = new BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED("BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED", 12);
        public static final ReturnReasonDto ACCOUNT_FROZEN = new ACCOUNT_FROZEN("ACCOUNT_FROZEN", 13);
        public static final ReturnReasonDto NON_TRANSACTION_ACCOUNT = new NON_TRANSACTION_ACCOUNT("NON_TRANSACTION_ACCOUNT", 14);
        public static final ReturnReasonDto CREDIT_ENTRY_REFUSED_BY_RECEIVER = new CREDIT_ENTRY_REFUSED_BY_RECEIVER("CREDIT_ENTRY_REFUSED_BY_RECEIVER", 15);
        public static final ReturnReasonDto DUPLICATE_ENTRY = new DUPLICATE_ENTRY("DUPLICATE_ENTRY", 16);
        public static final ReturnReasonDto CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED = new CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED("CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED", 17);
        public static final ReturnReasonDto INVALID_TRANSACTION_CODE = new INVALID_TRANSACTION_CODE("INVALID_TRANSACTION_CODE", 18);

        /* renamed from: CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS */
        public static final ReturnReasonDto f5959xcde576cc = new C36229xcde576cc("CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS", 19);

        private static final /* synthetic */ ReturnReasonDto[] $values() {
            return new ReturnReasonDto[]{RETURN_REASON_UNSPECIFIED, INSUFFICIENT_FUNDS, ACCOUNT_CLOSED, NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT, INVALID_ACCOUNT_NUMBER, RETURN_REQUESTED_BY_CUSTOMER_BANK, AUTHORIZATION_REVOKED_BY_CUSTOMER, PAYMENT_STOPPED, UNCOLLECTED_FUNDS, CUSTOMER_ADVISES_NOT_AUTHORIZED, BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION, RDFI_CANNOT_ACCEPT_TRANSFERS, BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED, ACCOUNT_FROZEN, NON_TRANSACTION_ACCOUNT, CREDIT_ENTRY_REFUSED_BY_RECEIVER, DUPLICATE_ENTRY, CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED, INVALID_TRANSACTION_CODE, f5959xcde576cc};
        }

        public /* synthetic */ ReturnReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ReturnReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.RETURN_REASON_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETURN_REASON_UNSPECIFIED extends ReturnReasonDto {
            RETURN_REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED;
            }
        }

        private ReturnReasonDto(String str, int i) {
        }

        static {
            ReturnReasonDto[] returnReasonDtoArr$values = $values();
            $VALUES = returnReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(returnReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$ReturnReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHTransferDetailsDto.ReturnReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.INSUFFICIENT_FUNDS", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSUFFICIENT_FUNDS extends ReturnReasonDto {
            INSUFFICIENT_FUNDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.INSUFFICIENT_FUNDS;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.ACCOUNT_CLOSED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_CLOSED extends ReturnReasonDto {
            ACCOUNT_CLOSED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.ACCOUNT_CLOSED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT extends ReturnReasonDto {
            NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.INVALID_ACCOUNT_NUMBER", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVALID_ACCOUNT_NUMBER extends ReturnReasonDto {
            INVALID_ACCOUNT_NUMBER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.INVALID_ACCOUNT_NUMBER;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.RETURN_REQUESTED_BY_CUSTOMER_BANK", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETURN_REQUESTED_BY_CUSTOMER_BANK extends ReturnReasonDto {
            RETURN_REQUESTED_BY_CUSTOMER_BANK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.RETURN_REQUESTED_BY_CUSTOMER_BANK;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.AUTHORIZATION_REVOKED_BY_CUSTOMER", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTHORIZATION_REVOKED_BY_CUSTOMER extends ReturnReasonDto {
            AUTHORIZATION_REVOKED_BY_CUSTOMER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.AUTHORIZATION_REVOKED_BY_CUSTOMER;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.PAYMENT_STOPPED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYMENT_STOPPED extends ReturnReasonDto {
            PAYMENT_STOPPED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.PAYMENT_STOPPED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.UNCOLLECTED_FUNDS", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNCOLLECTED_FUNDS extends ReturnReasonDto {
            UNCOLLECTED_FUNDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.UNCOLLECTED_FUNDS;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.CUSTOMER_ADVISES_NOT_AUTHORIZED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOMER_ADVISES_NOT_AUTHORIZED extends ReturnReasonDto {
            CUSTOMER_ADVISES_NOT_AUTHORIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.CUSTOMER_ADVISES_NOT_AUTHORIZED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION extends ReturnReasonDto {
            BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.RDFI_CANNOT_ACCEPT_TRANSFERS", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RDFI_CANNOT_ACCEPT_TRANSFERS extends ReturnReasonDto {
            RDFI_CANNOT_ACCEPT_TRANSFERS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.RDFI_CANNOT_ACCEPT_TRANSFERS;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED extends ReturnReasonDto {
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.ACCOUNT_FROZEN", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_FROZEN extends ReturnReasonDto {
            ACCOUNT_FROZEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.ACCOUNT_FROZEN;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.NON_TRANSACTION_ACCOUNT", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NON_TRANSACTION_ACCOUNT extends ReturnReasonDto {
            NON_TRANSACTION_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.NON_TRANSACTION_ACCOUNT;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.CREDIT_ENTRY_REFUSED_BY_RECEIVER", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREDIT_ENTRY_REFUSED_BY_RECEIVER extends ReturnReasonDto {
            CREDIT_ENTRY_REFUSED_BY_RECEIVER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.CREDIT_ENTRY_REFUSED_BY_RECEIVER;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.DUPLICATE_ENTRY", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DUPLICATE_ENTRY extends ReturnReasonDto {
            DUPLICATE_ENTRY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.DUPLICATE_ENTRY;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED extends ReturnReasonDto {
            CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.INVALID_TRANSACTION_CODE", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVALID_TRANSACTION_CODE extends ReturnReasonDto {
            INVALID_TRANSACTION_CODE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.INVALID_TRANSACTION_CODE;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.ReturnReasonDto.CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$ReturnReasonDto$CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS */
        static final class C36229xcde576cc extends ReturnReasonDto {
            C36229xcde576cc(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.ReturnReason toProto() {
                return ACHTransferDetails.ReturnReason.f5958xcde576cc;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ReturnReasonDto, ACHTransferDetails.ReturnReason> {

            /* compiled from: ACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHTransferDetails.ReturnReason.values().length];
                    try {
                        iArr[ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.INSUFFICIENT_FUNDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.ACCOUNT_CLOSED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.INVALID_ACCOUNT_NUMBER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.RETURN_REQUESTED_BY_CUSTOMER_BANK.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.AUTHORIZATION_REVOKED_BY_CUSTOMER.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.PAYMENT_STOPPED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.UNCOLLECTED_FUNDS.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.CUSTOMER_ADVISES_NOT_AUTHORIZED.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.RDFI_CANNOT_ACCEPT_TRANSFERS.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.ACCOUNT_FROZEN.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.NON_TRANSACTION_ACCOUNT.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.CREDIT_ENTRY_REFUSED_BY_RECEIVER.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.DUPLICATE_ENTRY.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.INVALID_TRANSACTION_CODE.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[ACHTransferDetails.ReturnReason.f5958xcde576cc.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ReturnReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReturnReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReturnReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) ReturnReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHTransferDetails.ReturnReason> getProtoAdapter() {
                return ACHTransferDetails.ReturnReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReturnReasonDto getZeroValue() {
                return ReturnReasonDto.RETURN_REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReturnReasonDto fromProto(ACHTransferDetails.ReturnReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ReturnReasonDto.RETURN_REASON_UNSPECIFIED;
                    case 2:
                        return ReturnReasonDto.INSUFFICIENT_FUNDS;
                    case 3:
                        return ReturnReasonDto.ACCOUNT_CLOSED;
                    case 4:
                        return ReturnReasonDto.NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT;
                    case 5:
                        return ReturnReasonDto.INVALID_ACCOUNT_NUMBER;
                    case 6:
                        return ReturnReasonDto.RETURN_REQUESTED_BY_CUSTOMER_BANK;
                    case 7:
                        return ReturnReasonDto.AUTHORIZATION_REVOKED_BY_CUSTOMER;
                    case 8:
                        return ReturnReasonDto.PAYMENT_STOPPED;
                    case 9:
                        return ReturnReasonDto.UNCOLLECTED_FUNDS;
                    case 10:
                        return ReturnReasonDto.CUSTOMER_ADVISES_NOT_AUTHORIZED;
                    case 11:
                        return ReturnReasonDto.BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION;
                    case 12:
                        return ReturnReasonDto.RDFI_CANNOT_ACCEPT_TRANSFERS;
                    case 13:
                        return ReturnReasonDto.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED;
                    case 14:
                        return ReturnReasonDto.ACCOUNT_FROZEN;
                    case 15:
                        return ReturnReasonDto.NON_TRANSACTION_ACCOUNT;
                    case 16:
                        return ReturnReasonDto.CREDIT_ENTRY_REFUSED_BY_RECEIVER;
                    case 17:
                        return ReturnReasonDto.DUPLICATE_ENTRY;
                    case 18:
                        return ReturnReasonDto.CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED;
                    case 19:
                        return ReturnReasonDto.INVALID_TRANSACTION_CODE;
                    case 20:
                        return ReturnReasonDto.f5959xcde576cc;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$ReturnReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ReturnReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ReturnReasonDto, ACHTransferDetails.ReturnReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHTransferDetails.ReturnReason", ReturnReasonDto.getEntries(), ReturnReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ReturnReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ReturnReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ReturnReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ReturnReasonDto valueOf(String str) {
            return (ReturnReasonDto) Enum.valueOf(ReturnReasonDto.class, str);
        }

        public static ReturnReasonDto[] values() {
            return (ReturnReasonDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PURPOSE_UNSPECIFIED", "MICRODEPOSIT", "PULLBACK", "REGULAR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PurposeDto implements Dto2<ACHTransferDetails.Purpose>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PurposeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PurposeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PurposeDto, ACHTransferDetails.Purpose>> binaryBase64Serializer$delegate;
        public static final PurposeDto PURPOSE_UNSPECIFIED = new PURPOSE_UNSPECIFIED("PURPOSE_UNSPECIFIED", 0);
        public static final PurposeDto MICRODEPOSIT = new MICRODEPOSIT("MICRODEPOSIT", 1);
        public static final PurposeDto PULLBACK = new PULLBACK("PULLBACK", 2);
        public static final PurposeDto REGULAR = new REGULAR("REGULAR", 3);

        private static final /* synthetic */ PurposeDto[] $values() {
            return new PurposeDto[]{PURPOSE_UNSPECIFIED, MICRODEPOSIT, PULLBACK, REGULAR};
        }

        public /* synthetic */ PurposeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PurposeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.PurposeDto.PURPOSE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PURPOSE_UNSPECIFIED extends PurposeDto {
            PURPOSE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Purpose toProto() {
                return ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED;
            }
        }

        private PurposeDto(String str, int i) {
        }

        static {
            PurposeDto[] purposeDtoArr$values = $values();
            $VALUES = purposeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(purposeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHTransferDetailsDto$PurposeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHTransferDetailsDto.PurposeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.PurposeDto.MICRODEPOSIT", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MICRODEPOSIT extends PurposeDto {
            MICRODEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Purpose toProto() {
                return ACHTransferDetails.Purpose.MICRODEPOSIT;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.PurposeDto.PULLBACK", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PULLBACK extends PurposeDto {
            PULLBACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Purpose toProto() {
                return ACHTransferDetails.Purpose.PULLBACK;
            }
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHTransferDetailsDto.PurposeDto.REGULAR", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REGULAR extends PurposeDto {
            REGULAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHTransferDetails.Purpose toProto() {
                return ACHTransferDetails.Purpose.REGULAR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PurposeDto, ACHTransferDetails.Purpose> {

            /* compiled from: ACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHTransferDetails.Purpose.values().length];
                    try {
                        iArr[ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHTransferDetails.Purpose.MICRODEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHTransferDetails.Purpose.PULLBACK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ACHTransferDetails.Purpose.REGULAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PurposeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PurposeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PurposeDto> getBinaryBase64Serializer() {
                return (KSerializer) PurposeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHTransferDetails.Purpose> getProtoAdapter() {
                return ACHTransferDetails.Purpose.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PurposeDto getZeroValue() {
                return PurposeDto.PURPOSE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PurposeDto fromProto(ACHTransferDetails.Purpose proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PurposeDto.PURPOSE_UNSPECIFIED;
                }
                if (i == 2) {
                    return PurposeDto.MICRODEPOSIT;
                }
                if (i == 3) {
                    return PurposeDto.PULLBACK;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return PurposeDto.REGULAR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$PurposeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PurposeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PurposeDto, ACHTransferDetails.Purpose> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHTransferDetails.Purpose", PurposeDto.getEntries(), PurposeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PurposeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PurposeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PurposeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PurposeDto valueOf(String str) {
            return (PurposeDto) Enum.valueOf(PurposeDto.class, str);
        }

        public static PurposeDto[] values() {
            return (PurposeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ACHTransferDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ACHTransferDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ACHTransferDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ACHTransferDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ACHTransferDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ACHTransferDetailsDto";
        }
    }
}
