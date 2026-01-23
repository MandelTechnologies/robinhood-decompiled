package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.cashier.ACHDepositScheduleDetails;
import com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: ACHDepositScheduleDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006234567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0015JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate;)V", "ach_deposit_schedule_id", "", "ach_relationship_master_id", "state", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "rh_account_type", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "frequency", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "last_attempt_date", "Lcom/robinhood/rosetta/common/DateDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;Lcom/robinhood/rosetta/common/DateDto;)V", "getAch_deposit_schedule_id", "()Ljava/lang/String;", "getAch_relationship_master_id", "getState", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getFrequency", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "getLast_attempt_date", "()Lcom/robinhood/rosetta/common/DateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "StateDto", "FrequencyDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ACHDepositScheduleDetailsDto implements Dto3<ACHDepositScheduleDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ACHDepositScheduleDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ACHDepositScheduleDetailsDto, ACHDepositScheduleDetails>> binaryBase64Serializer$delegate;
    private static final ACHDepositScheduleDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ACHDepositScheduleDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ACHDepositScheduleDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAch_deposit_schedule_id() {
        return this.surrogate.getAch_deposit_schedule_id();
    }

    public final String getAch_relationship_master_id() {
        return this.surrogate.getAch_relationship_master_id();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final AccountTypeDto getRh_account_type() {
        return this.surrogate.getRh_account_type();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final FrequencyDto getFrequency() {
        return this.surrogate.getFrequency();
    }

    public final DateDto getLast_attempt_date() {
        return this.surrogate.getLast_attempt_date();
    }

    public /* synthetic */ ACHDepositScheduleDetailsDto(String str, String str2, StateDto stateDto, AccountTypeDto accountTypeDto, MoneyDto moneyDto, FrequencyDto frequencyDto, DateDto dateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? FrequencyDto.INSTANCE.getZeroValue() : frequencyDto, (i & 64) != 0 ? null : dateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ACHDepositScheduleDetailsDto(String ach_deposit_schedule_id, String ach_relationship_master_id, StateDto state, AccountTypeDto rh_account_type, MoneyDto moneyDto, FrequencyDto frequency, DateDto dateDto) {
        this(new Surrogate(ach_deposit_schedule_id, ach_relationship_master_id, state, rh_account_type, moneyDto, frequency, dateDto));
        Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
        Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
    }

    public static /* synthetic */ ACHDepositScheduleDetailsDto copy$default(ACHDepositScheduleDetailsDto aCHDepositScheduleDetailsDto, String str, String str2, StateDto stateDto, AccountTypeDto accountTypeDto, MoneyDto moneyDto, FrequencyDto frequencyDto, DateDto dateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCHDepositScheduleDetailsDto.surrogate.getAch_deposit_schedule_id();
        }
        if ((i & 2) != 0) {
            str2 = aCHDepositScheduleDetailsDto.surrogate.getAch_relationship_master_id();
        }
        if ((i & 4) != 0) {
            stateDto = aCHDepositScheduleDetailsDto.surrogate.getState();
        }
        if ((i & 8) != 0) {
            accountTypeDto = aCHDepositScheduleDetailsDto.surrogate.getRh_account_type();
        }
        if ((i & 16) != 0) {
            moneyDto = aCHDepositScheduleDetailsDto.surrogate.getAmount();
        }
        if ((i & 32) != 0) {
            frequencyDto = aCHDepositScheduleDetailsDto.surrogate.getFrequency();
        }
        if ((i & 64) != 0) {
            dateDto = aCHDepositScheduleDetailsDto.surrogate.getLast_attempt_date();
        }
        FrequencyDto frequencyDto2 = frequencyDto;
        DateDto dateDto2 = dateDto;
        MoneyDto moneyDto2 = moneyDto;
        StateDto stateDto2 = stateDto;
        return aCHDepositScheduleDetailsDto.copy(str, str2, stateDto2, accountTypeDto, moneyDto2, frequencyDto2, dateDto2);
    }

    public final ACHDepositScheduleDetailsDto copy(String ach_deposit_schedule_id, String ach_relationship_master_id, StateDto state, AccountTypeDto rh_account_type, MoneyDto amount, FrequencyDto frequency, DateDto last_attempt_date) {
        Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
        Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new ACHDepositScheduleDetailsDto(new Surrogate(ach_deposit_schedule_id, ach_relationship_master_id, state, rh_account_type, amount, frequency, last_attempt_date));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ACHDepositScheduleDetails toProto() {
        String ach_deposit_schedule_id = this.surrogate.getAch_deposit_schedule_id();
        String ach_relationship_master_id = this.surrogate.getAch_relationship_master_id();
        ACHDepositScheduleDetails.State state = (ACHDepositScheduleDetails.State) this.surrogate.getState().toProto();
        AccountType accountType = (AccountType) this.surrogate.getRh_account_type().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        ACHDepositScheduleDetails.Frequency frequency = (ACHDepositScheduleDetails.Frequency) this.surrogate.getFrequency().toProto();
        DateDto last_attempt_date = this.surrogate.getLast_attempt_date();
        return new ACHDepositScheduleDetails(ach_deposit_schedule_id, ach_relationship_master_id, state, accountType, proto, frequency, last_attempt_date != null ? last_attempt_date.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[ACHDepositScheduleDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ACHDepositScheduleDetailsDto) && Intrinsics.areEqual(((ACHDepositScheduleDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@ABQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0012HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate;", "", "ach_deposit_schedule_id", "", "ach_relationship_master_id", "state", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "rh_account_type", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "frequency", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "last_attempt_date", "Lcom/robinhood/rosetta/common/DateDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;Lcom/robinhood/rosetta/common/DateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;Lcom/robinhood/rosetta/common/DateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAch_deposit_schedule_id$annotations", "()V", "getAch_deposit_schedule_id", "()Ljava/lang/String;", "getAch_relationship_master_id$annotations", "getAch_relationship_master_id", "getState$annotations", "getState", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "getRh_account_type$annotations", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getAmount$annotations", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getFrequency$annotations", "getFrequency", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "getLast_attempt_date$annotations", "getLast_attempt_date", "()Lcom/robinhood/rosetta/common/DateDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String ach_deposit_schedule_id;
        private final String ach_relationship_master_id;
        private final MoneyDto amount;
        private final FrequencyDto frequency;
        private final DateDto last_attempt_date;
        private final AccountTypeDto rh_account_type;
        private final StateDto state;

        public Surrogate() {
            this((String) null, (String) null, (StateDto) null, (AccountTypeDto) null, (MoneyDto) null, (FrequencyDto) null, (DateDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, StateDto stateDto, AccountTypeDto accountTypeDto, MoneyDto moneyDto, FrequencyDto frequencyDto, DateDto dateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ach_deposit_schedule_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.ach_relationship_master_id;
            }
            if ((i & 4) != 0) {
                stateDto = surrogate.state;
            }
            if ((i & 8) != 0) {
                accountTypeDto = surrogate.rh_account_type;
            }
            if ((i & 16) != 0) {
                moneyDto = surrogate.amount;
            }
            if ((i & 32) != 0) {
                frequencyDto = surrogate.frequency;
            }
            if ((i & 64) != 0) {
                dateDto = surrogate.last_attempt_date;
            }
            FrequencyDto frequencyDto2 = frequencyDto;
            DateDto dateDto2 = dateDto;
            MoneyDto moneyDto2 = moneyDto;
            StateDto stateDto2 = stateDto;
            return surrogate.copy(str, str2, stateDto2, accountTypeDto, moneyDto2, frequencyDto2, dateDto2);
        }

        @SerialName("achDepositScheduleId")
        @JsonAnnotations2(names = {"ach_deposit_schedule_id"})
        public static /* synthetic */ void getAch_deposit_schedule_id$annotations() {
        }

        @SerialName("achRelationshipMasterId")
        @JsonAnnotations2(names = {"ach_relationship_master_id"})
        public static /* synthetic */ void getAch_relationship_master_id$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("frequency")
        @JsonAnnotations2(names = {"frequency"})
        public static /* synthetic */ void getFrequency$annotations() {
        }

        @SerialName("lastAttemptDate")
        @JsonAnnotations2(names = {"last_attempt_date"})
        public static /* synthetic */ void getLast_attempt_date$annotations() {
        }

        @SerialName("rhAccountType")
        @JsonAnnotations2(names = {"rh_account_type"})
        public static /* synthetic */ void getRh_account_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAch_deposit_schedule_id() {
            return this.ach_deposit_schedule_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAch_relationship_master_id() {
            return this.ach_relationship_master_id;
        }

        /* renamed from: component3, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component6, reason: from getter */
        public final FrequencyDto getFrequency() {
            return this.frequency;
        }

        /* renamed from: component7, reason: from getter */
        public final DateDto getLast_attempt_date() {
            return this.last_attempt_date;
        }

        public final Surrogate copy(String ach_deposit_schedule_id, String ach_relationship_master_id, StateDto state, AccountTypeDto rh_account_type, MoneyDto amount, FrequencyDto frequency, DateDto last_attempt_date) {
            Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
            Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            return new Surrogate(ach_deposit_schedule_id, ach_relationship_master_id, state, rh_account_type, amount, frequency, last_attempt_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ach_deposit_schedule_id, surrogate.ach_deposit_schedule_id) && Intrinsics.areEqual(this.ach_relationship_master_id, surrogate.ach_relationship_master_id) && this.state == surrogate.state && this.rh_account_type == surrogate.rh_account_type && Intrinsics.areEqual(this.amount, surrogate.amount) && this.frequency == surrogate.frequency && Intrinsics.areEqual(this.last_attempt_date, surrogate.last_attempt_date);
        }

        public int hashCode() {
            int iHashCode = ((((((this.ach_deposit_schedule_id.hashCode() * 31) + this.ach_relationship_master_id.hashCode()) * 31) + this.state.hashCode()) * 31) + this.rh_account_type.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.frequency.hashCode()) * 31;
            DateDto dateDto = this.last_attempt_date;
            return iHashCode2 + (dateDto != null ? dateDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ach_deposit_schedule_id=" + this.ach_deposit_schedule_id + ", ach_relationship_master_id=" + this.ach_relationship_master_id + ", state=" + this.state + ", rh_account_type=" + this.rh_account_type + ", amount=" + this.amount + ", frequency=" + this.frequency + ", last_attempt_date=" + this.last_attempt_date + ")";
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ACHDepositScheduleDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, StateDto stateDto, AccountTypeDto accountTypeDto, MoneyDto moneyDto, FrequencyDto frequencyDto, DateDto dateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ach_deposit_schedule_id = "";
            } else {
                this.ach_deposit_schedule_id = str;
            }
            if ((i & 2) == 0) {
                this.ach_relationship_master_id = "";
            } else {
                this.ach_relationship_master_id = str2;
            }
            if ((i & 4) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 8) == 0) {
                this.rh_account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.rh_account_type = accountTypeDto;
            }
            if ((i & 16) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 32) == 0) {
                this.frequency = FrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = frequencyDto;
            }
            if ((i & 64) == 0) {
                this.last_attempt_date = null;
            } else {
                this.last_attempt_date = dateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ach_deposit_schedule_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ach_deposit_schedule_id);
            }
            if (!Intrinsics.areEqual(self.ach_relationship_master_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.ach_relationship_master_id);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, StateDto.Serializer.INSTANCE, self.state);
            }
            if (self.rh_account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, AccountTypeDto.Serializer.INSTANCE, self.rh_account_type);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.frequency != FrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, FrequencyDto.Serializer.INSTANCE, self.frequency);
            }
            DateDto dateDto = self.last_attempt_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DateDto.Serializer.INSTANCE, dateDto);
            }
        }

        public Surrogate(String ach_deposit_schedule_id, String ach_relationship_master_id, StateDto state, AccountTypeDto rh_account_type, MoneyDto moneyDto, FrequencyDto frequency, DateDto dateDto) {
            Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
            Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.ach_deposit_schedule_id = ach_deposit_schedule_id;
            this.ach_relationship_master_id = ach_relationship_master_id;
            this.state = state;
            this.rh_account_type = rh_account_type;
            this.amount = moneyDto;
            this.frequency = frequency;
            this.last_attempt_date = dateDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, StateDto stateDto, AccountTypeDto accountTypeDto, MoneyDto moneyDto, FrequencyDto frequencyDto, DateDto dateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? FrequencyDto.INSTANCE.getZeroValue() : frequencyDto, (i & 64) != 0 ? null : dateDto);
        }

        public final String getAch_deposit_schedule_id() {
            return this.ach_deposit_schedule_id;
        }

        public final String getAch_relationship_master_id() {
            return this.ach_relationship_master_id;
        }

        public final StateDto getState() {
            return this.state;
        }

        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final FrequencyDto getFrequency() {
            return this.frequency;
        }

        public final DateDto getLast_attempt_date() {
            return this.last_attempt_date;
        }
    }

    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ACHDepositScheduleDetailsDto, ACHDepositScheduleDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ACHDepositScheduleDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHDepositScheduleDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHDepositScheduleDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ACHDepositScheduleDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ACHDepositScheduleDetails> getProtoAdapter() {
            return ACHDepositScheduleDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHDepositScheduleDetailsDto getZeroValue() {
            return ACHDepositScheduleDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHDepositScheduleDetailsDto fromProto(ACHDepositScheduleDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ach_deposit_schedule_id = proto.getAch_deposit_schedule_id();
            String ach_relationship_master_id = proto.getAch_relationship_master_id();
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getRh_account_type());
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            FrequencyDto frequencyDtoFromProto = FrequencyDto.INSTANCE.fromProto(proto.getFrequency());
            Date last_attempt_date = proto.getLast_attempt_date();
            return new ACHDepositScheduleDetailsDto(new Surrogate(ach_deposit_schedule_id, ach_relationship_master_id, stateDtoFromProto, accountTypeDtoFromProto, moneyDtoFromProto, frequencyDtoFromProto, last_attempt_date != null ? DateDto.INSTANCE.fromProto(last_attempt_date) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ACHDepositScheduleDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ACHDepositScheduleDetailsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<ACHDepositScheduleDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, ACHDepositScheduleDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto ACTIVE = new ACTIVE("ACTIVE", 0);
        public static final StateDto INACTIVE = new INACTIVE("INACTIVE", 1);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{ACTIVE, INACTIVE};
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

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.StateDto.ACTIVE", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTIVE extends StateDto {
            ACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.State toProto() {
                return ACHDepositScheduleDetails.State.ACTIVE;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHDepositScheduleDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.StateDto.INACTIVE", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INACTIVE extends StateDto {
            INACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.State toProto() {
                return ACHDepositScheduleDetails.State.INACTIVE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, ACHDepositScheduleDetails.State> {

            /* compiled from: ACHDepositScheduleDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHDepositScheduleDetails.State.values().length];
                    try {
                        iArr[ACHDepositScheduleDetails.State.ACTIVE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHDepositScheduleDetails.State.INACTIVE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
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
            public ProtoAdapter<ACHDepositScheduleDetails.State> getProtoAdapter() {
                return ACHDepositScheduleDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.ACTIVE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(ACHDepositScheduleDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StateDto.ACTIVE;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return StateDto.INACTIVE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, ACHDepositScheduleDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHDepositScheduleDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

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
    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FrequencyDto implements Dto2<ACHDepositScheduleDetails.Frequency>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FrequencyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FrequencyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FrequencyDto, ACHDepositScheduleDetails.Frequency>> binaryBase64Serializer$delegate;
        public static final FrequencyDto WEEKLY = new WEEKLY("WEEKLY", 0);
        public static final FrequencyDto BIWEEKLY = new BIWEEKLY("BIWEEKLY", 1);
        public static final FrequencyDto MONTHLY = new MONTHLY("MONTHLY", 2);
        public static final FrequencyDto QUARTERLY = new QUARTERLY("QUARTERLY", 3);

        private static final /* synthetic */ FrequencyDto[] $values() {
            return new FrequencyDto[]{WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
        }

        public /* synthetic */ FrequencyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FrequencyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.FrequencyDto.WEEKLY", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEEKLY extends FrequencyDto {
            WEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.Frequency toProto() {
                return ACHDepositScheduleDetails.Frequency.WEEKLY;
            }
        }

        private FrequencyDto(String str, int i) {
        }

        static {
            FrequencyDto[] frequencyDtoArr$values = $values();
            $VALUES = frequencyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(frequencyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto$FrequencyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHDepositScheduleDetailsDto.FrequencyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.FrequencyDto.BIWEEKLY", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BIWEEKLY extends FrequencyDto {
            BIWEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.Frequency toProto() {
                return ACHDepositScheduleDetails.Frequency.BIWEEKLY;
            }
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.FrequencyDto.MONTHLY", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MONTHLY extends FrequencyDto {
            MONTHLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.Frequency toProto() {
                return ACHDepositScheduleDetails.Frequency.MONTHLY;
            }
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto.FrequencyDto.QUARTERLY", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUARTERLY extends FrequencyDto {
            QUARTERLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHDepositScheduleDetails.Frequency toProto() {
                return ACHDepositScheduleDetails.Frequency.QUARTERLY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FrequencyDto, ACHDepositScheduleDetails.Frequency> {

            /* compiled from: ACHDepositScheduleDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHDepositScheduleDetails.Frequency.values().length];
                    try {
                        iArr[ACHDepositScheduleDetails.Frequency.WEEKLY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHDepositScheduleDetails.Frequency.BIWEEKLY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHDepositScheduleDetails.Frequency.MONTHLY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ACHDepositScheduleDetails.Frequency.QUARTERLY.ordinal()] = 4;
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

            public final KSerializer<FrequencyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FrequencyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FrequencyDto> getBinaryBase64Serializer() {
                return (KSerializer) FrequencyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHDepositScheduleDetails.Frequency> getProtoAdapter() {
                return ACHDepositScheduleDetails.Frequency.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FrequencyDto getZeroValue() {
                return FrequencyDto.WEEKLY;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FrequencyDto fromProto(ACHDepositScheduleDetails.Frequency proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return FrequencyDto.WEEKLY;
                }
                if (i == 2) {
                    return FrequencyDto.BIWEEKLY;
                }
                if (i == 3) {
                    return FrequencyDto.MONTHLY;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return FrequencyDto.QUARTERLY;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHDepositScheduleDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$FrequencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<FrequencyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FrequencyDto, ACHDepositScheduleDetails.Frequency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHDepositScheduleDetails.Frequency", FrequencyDto.getEntries(), FrequencyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FrequencyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FrequencyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FrequencyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FrequencyDto valueOf(String str) {
            return (FrequencyDto) Enum.valueOf(FrequencyDto.class, str);
        }

        public static FrequencyDto[] values() {
            return (FrequencyDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ACHDepositScheduleDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ACHDepositScheduleDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ACHDepositScheduleDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ACHDepositScheduleDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ACHDepositScheduleDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ACHDepositScheduleDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ACHDepositScheduleDetailsDto";
        }
    }
}
