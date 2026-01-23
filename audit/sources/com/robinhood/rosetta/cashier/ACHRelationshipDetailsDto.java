package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.cashier.ACHRelationshipDetails;
import com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto;
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
import p479j$.time.Instant;

/* compiled from: ACHRelationshipDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bFEGHIJKLB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001cJ\u0091\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010\"R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\"¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;)V", "", "routing_number", "hmac_bank_account_number", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "bank_account_type", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "verification_method", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_balance", "available_balance", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "source_type", "bank_account_holder_name", "bank_name", "bank_account_number_last_four", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "getRouting_number", "getHmac_bank_account_number", "getBank_account_type", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "getState", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "getVerification_method", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "getCreated_at", "()Lj$/time/Instant;", "getCurrent_balance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAvailable_balance", "getSource_type", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "getBank_account_holder_name", "getBank_name", "getBank_account_number_last_four", "Companion", "Surrogate", "StateDto", "VerificationMethodDto", "AccountTypeDto", "SourceTypeDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ACHRelationshipDetailsDto implements Dto3<ACHRelationshipDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ACHRelationshipDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ACHRelationshipDetailsDto, ACHRelationshipDetails>> binaryBase64Serializer$delegate;
    private static final ACHRelationshipDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ACHRelationshipDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ACHRelationshipDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRouting_number() {
        return this.surrogate.getRouting_number();
    }

    public final String getHmac_bank_account_number() {
        return this.surrogate.getHmac_bank_account_number();
    }

    public final AccountTypeDto getBank_account_type() {
        return this.surrogate.getBank_account_type();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final VerificationMethodDto getVerification_method() {
        return this.surrogate.getVerification_method();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final MoneyDto getCurrent_balance() {
        return this.surrogate.getCurrent_balance();
    }

    public final MoneyDto getAvailable_balance() {
        return this.surrogate.getAvailable_balance();
    }

    public final SourceTypeDto getSource_type() {
        return this.surrogate.getSource_type();
    }

    public final String getBank_account_holder_name() {
        return this.surrogate.getBank_account_holder_name();
    }

    public final String getBank_name() {
        return this.surrogate.getBank_name();
    }

    public final String getBank_account_number_last_four() {
        return this.surrogate.getBank_account_number_last_four();
    }

    public /* synthetic */ ACHRelationshipDetailsDto(String str, String str2, AccountTypeDto accountTypeDto, StateDto stateDto, VerificationMethodDto verificationMethodDto, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto sourceTypeDto, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 8) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 16) != 0 ? VerificationMethodDto.INSTANCE.getZeroValue() : verificationMethodDto, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : moneyDto, (i & 128) == 0 ? moneyDto2 : null, (i & 256) != 0 ? SourceTypeDto.INSTANCE.getZeroValue() : sourceTypeDto, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ACHRelationshipDetailsDto(String routing_number, String hmac_bank_account_number, AccountTypeDto bank_account_type, StateDto state, VerificationMethodDto verification_method, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four) {
        this(new Surrogate(routing_number, hmac_bank_account_number, bank_account_type, state, verification_method, instant, moneyDto, moneyDto2, source_type, bank_account_holder_name, bank_name, bank_account_number_last_four));
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(verification_method, "verification_method");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
        Intrinsics.checkNotNullParameter(bank_name, "bank_name");
        Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
    }

    public static /* synthetic */ ACHRelationshipDetailsDto copy$default(ACHRelationshipDetailsDto aCHRelationshipDetailsDto, String str, String str2, AccountTypeDto accountTypeDto, StateDto stateDto, VerificationMethodDto verificationMethodDto, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto sourceTypeDto, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCHRelationshipDetailsDto.surrogate.getRouting_number();
        }
        if ((i & 2) != 0) {
            str2 = aCHRelationshipDetailsDto.surrogate.getHmac_bank_account_number();
        }
        if ((i & 4) != 0) {
            accountTypeDto = aCHRelationshipDetailsDto.surrogate.getBank_account_type();
        }
        if ((i & 8) != 0) {
            stateDto = aCHRelationshipDetailsDto.surrogate.getState();
        }
        if ((i & 16) != 0) {
            verificationMethodDto = aCHRelationshipDetailsDto.surrogate.getVerification_method();
        }
        if ((i & 32) != 0) {
            instant = aCHRelationshipDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 64) != 0) {
            moneyDto = aCHRelationshipDetailsDto.surrogate.getCurrent_balance();
        }
        if ((i & 128) != 0) {
            moneyDto2 = aCHRelationshipDetailsDto.surrogate.getAvailable_balance();
        }
        if ((i & 256) != 0) {
            sourceTypeDto = aCHRelationshipDetailsDto.surrogate.getSource_type();
        }
        if ((i & 512) != 0) {
            str3 = aCHRelationshipDetailsDto.surrogate.getBank_account_holder_name();
        }
        if ((i & 1024) != 0) {
            str4 = aCHRelationshipDetailsDto.surrogate.getBank_name();
        }
        if ((i & 2048) != 0) {
            str5 = aCHRelationshipDetailsDto.surrogate.getBank_account_number_last_four();
        }
        String str6 = str4;
        String str7 = str5;
        SourceTypeDto sourceTypeDto2 = sourceTypeDto;
        String str8 = str3;
        MoneyDto moneyDto3 = moneyDto;
        MoneyDto moneyDto4 = moneyDto2;
        VerificationMethodDto verificationMethodDto2 = verificationMethodDto;
        Instant instant2 = instant;
        return aCHRelationshipDetailsDto.copy(str, str2, accountTypeDto, stateDto, verificationMethodDto2, instant2, moneyDto3, moneyDto4, sourceTypeDto2, str8, str6, str7);
    }

    public final ACHRelationshipDetailsDto copy(String routing_number, String hmac_bank_account_number, AccountTypeDto bank_account_type, StateDto state, VerificationMethodDto verification_method, Instant created_at, MoneyDto current_balance, MoneyDto available_balance, SourceTypeDto source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four) {
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(verification_method, "verification_method");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
        Intrinsics.checkNotNullParameter(bank_name, "bank_name");
        Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
        return new ACHRelationshipDetailsDto(new Surrogate(routing_number, hmac_bank_account_number, bank_account_type, state, verification_method, created_at, current_balance, available_balance, source_type, bank_account_holder_name, bank_name, bank_account_number_last_four));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ACHRelationshipDetails toProto() {
        String routing_number = this.surrogate.getRouting_number();
        String hmac_bank_account_number = this.surrogate.getHmac_bank_account_number();
        ACHRelationshipDetails.AccountType accountType = (ACHRelationshipDetails.AccountType) this.surrogate.getBank_account_type().toProto();
        ACHRelationshipDetails.State state = (ACHRelationshipDetails.State) this.surrogate.getState().toProto();
        ACHRelationshipDetails.VerificationMethod verificationMethod = (ACHRelationshipDetails.VerificationMethod) this.surrogate.getVerification_method().toProto();
        Instant created_at = this.surrogate.getCreated_at();
        MoneyDto current_balance = this.surrogate.getCurrent_balance();
        Money proto = current_balance != null ? current_balance.toProto() : null;
        MoneyDto available_balance = this.surrogate.getAvailable_balance();
        return new ACHRelationshipDetails(routing_number, hmac_bank_account_number, accountType, state, verificationMethod, created_at, proto, available_balance != null ? available_balance.toProto() : null, (ACHRelationshipDetails.SourceType) this.surrogate.getSource_type().toProto(), this.surrogate.getBank_account_holder_name(), this.surrogate.getBank_name(), this.surrogate.getBank_account_number_last_four(), null, 4096, null);
    }

    public String toString() {
        return "[ACHRelationshipDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ACHRelationshipDetailsDto) && Intrinsics.areEqual(((ACHRelationshipDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 e2\u00020\u0001:\u0002feB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0093\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u00101J6\u00102\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010*J²\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2.\b\u0002\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010*J\u0010\u0010?\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010E\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010*R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010K\u0012\u0004\bM\u0010H\u001a\u0004\bL\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010N\u0012\u0004\bP\u0010H\u001a\u0004\bO\u0010/R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010Q\u0012\u0004\bS\u0010H\u001a\u0004\bR\u00101RF\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010T\u0012\u0004\bV\u0010H\u001a\u0004\bU\u00103R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010W\u0012\u0004\bY\u0010H\u001a\u0004\bX\u00105R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\b[\u0010H\u001a\u0004\bZ\u00105R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\\\u0012\u0004\b^\u0010H\u001a\u0004\b]\u00108R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010E\u0012\u0004\b`\u0010H\u001a\u0004\b_\u0010*R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010E\u0012\u0004\bb\u0010H\u001a\u0004\ba\u0010*R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010E\u0012\u0004\bd\u0010H\u001a\u0004\bc\u0010*¨\u0006g"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "", "", "routing_number", "hmac_bank_account_number", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "bank_account_type", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "verification_method", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_balance", "available_balance", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "source_type", "bank_account_holder_name", "bank_name", "bank_account_number_last_four", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "component4", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "component5", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "component6", "()Lj$/time/Instant;", "component7", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component8", "component9", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRouting_number", "getRouting_number$annotations", "()V", "getHmac_bank_account_number", "getHmac_bank_account_number$annotations", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "getBank_account_type", "getBank_account_type$annotations", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "getState", "getState$annotations", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "getVerification_method", "getVerification_method$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCurrent_balance", "getCurrent_balance$annotations", "getAvailable_balance", "getAvailable_balance$annotations", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "getSource_type", "getSource_type$annotations", "getBank_account_holder_name", "getBank_account_holder_name$annotations", "getBank_name", "getBank_name$annotations", "getBank_account_number_last_four", "getBank_account_number_last_four$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto available_balance;
        private final String bank_account_holder_name;
        private final String bank_account_number_last_four;
        private final AccountTypeDto bank_account_type;
        private final String bank_name;
        private final Instant created_at;
        private final MoneyDto current_balance;
        private final String hmac_bank_account_number;
        private final String routing_number;
        private final SourceTypeDto source_type;
        private final StateDto state;
        private final VerificationMethodDto verification_method;

        public Surrogate() {
            this((String) null, (String) null, (AccountTypeDto) null, (StateDto) null, (VerificationMethodDto) null, (Instant) null, (MoneyDto) null, (MoneyDto) null, (SourceTypeDto) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, AccountTypeDto accountTypeDto, StateDto stateDto, VerificationMethodDto verificationMethodDto, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto sourceTypeDto, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.routing_number;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.hmac_bank_account_number;
            }
            if ((i & 4) != 0) {
                accountTypeDto = surrogate.bank_account_type;
            }
            if ((i & 8) != 0) {
                stateDto = surrogate.state;
            }
            if ((i & 16) != 0) {
                verificationMethodDto = surrogate.verification_method;
            }
            if ((i & 32) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 64) != 0) {
                moneyDto = surrogate.current_balance;
            }
            if ((i & 128) != 0) {
                moneyDto2 = surrogate.available_balance;
            }
            if ((i & 256) != 0) {
                sourceTypeDto = surrogate.source_type;
            }
            if ((i & 512) != 0) {
                str3 = surrogate.bank_account_holder_name;
            }
            if ((i & 1024) != 0) {
                str4 = surrogate.bank_name;
            }
            if ((i & 2048) != 0) {
                str5 = surrogate.bank_account_number_last_four;
            }
            String str6 = str4;
            String str7 = str5;
            SourceTypeDto sourceTypeDto2 = sourceTypeDto;
            String str8 = str3;
            MoneyDto moneyDto3 = moneyDto;
            MoneyDto moneyDto4 = moneyDto2;
            VerificationMethodDto verificationMethodDto2 = verificationMethodDto;
            Instant instant2 = instant;
            return surrogate.copy(str, str2, accountTypeDto, stateDto, verificationMethodDto2, instant2, moneyDto3, moneyDto4, sourceTypeDto2, str8, str6, str7);
        }

        @SerialName("availableBalance")
        @JsonAnnotations2(names = {"available_balance"})
        public static /* synthetic */ void getAvailable_balance$annotations() {
        }

        @SerialName("bankAccountHolderName")
        @JsonAnnotations2(names = {"bank_account_holder_name"})
        public static /* synthetic */ void getBank_account_holder_name$annotations() {
        }

        @SerialName("bankAccountNumberLastFour")
        @JsonAnnotations2(names = {"bank_account_number_last_four"})
        public static /* synthetic */ void getBank_account_number_last_four$annotations() {
        }

        @SerialName("bankAccountType")
        @JsonAnnotations2(names = {"bank_account_type"})
        public static /* synthetic */ void getBank_account_type$annotations() {
        }

        @SerialName("bankName")
        @JsonAnnotations2(names = {"bank_name"})
        public static /* synthetic */ void getBank_name$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("currentBalance")
        @JsonAnnotations2(names = {"current_balance"})
        public static /* synthetic */ void getCurrent_balance$annotations() {
        }

        @SerialName("hmacBankAccountNumber")
        @JsonAnnotations2(names = {"hmac_bank_account_number"})
        public static /* synthetic */ void getHmac_bank_account_number$annotations() {
        }

        @SerialName("routingNumber")
        @JsonAnnotations2(names = {"routing_number"})
        public static /* synthetic */ void getRouting_number$annotations() {
        }

        @SerialName("sourceType")
        @JsonAnnotations2(names = {"source_type"})
        public static /* synthetic */ void getSource_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("verificationMethod")
        @JsonAnnotations2(names = {"verification_method"})
        public static /* synthetic */ void getVerification_method$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRouting_number() {
            return this.routing_number;
        }

        /* renamed from: component10, reason: from getter */
        public final String getBank_account_holder_name() {
            return this.bank_account_holder_name;
        }

        /* renamed from: component11, reason: from getter */
        public final String getBank_name() {
            return this.bank_name;
        }

        /* renamed from: component12, reason: from getter */
        public final String getBank_account_number_last_four() {
            return this.bank_account_number_last_four;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHmac_bank_account_number() {
            return this.hmac_bank_account_number;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountTypeDto getBank_account_type() {
            return this.bank_account_type;
        }

        /* renamed from: component4, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        /* renamed from: component5, reason: from getter */
        public final VerificationMethodDto getVerification_method() {
            return this.verification_method;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getCurrent_balance() {
            return this.current_balance;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getAvailable_balance() {
            return this.available_balance;
        }

        /* renamed from: component9, reason: from getter */
        public final SourceTypeDto getSource_type() {
            return this.source_type;
        }

        public final Surrogate copy(String routing_number, String hmac_bank_account_number, AccountTypeDto bank_account_type, StateDto state, VerificationMethodDto verification_method, Instant created_at, MoneyDto current_balance, MoneyDto available_balance, SourceTypeDto source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four) {
            Intrinsics.checkNotNullParameter(routing_number, "routing_number");
            Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(verification_method, "verification_method");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
            Intrinsics.checkNotNullParameter(bank_name, "bank_name");
            Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
            return new Surrogate(routing_number, hmac_bank_account_number, bank_account_type, state, verification_method, created_at, current_balance, available_balance, source_type, bank_account_holder_name, bank_name, bank_account_number_last_four);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.routing_number, surrogate.routing_number) && Intrinsics.areEqual(this.hmac_bank_account_number, surrogate.hmac_bank_account_number) && this.bank_account_type == surrogate.bank_account_type && this.state == surrogate.state && this.verification_method == surrogate.verification_method && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.current_balance, surrogate.current_balance) && Intrinsics.areEqual(this.available_balance, surrogate.available_balance) && this.source_type == surrogate.source_type && Intrinsics.areEqual(this.bank_account_holder_name, surrogate.bank_account_holder_name) && Intrinsics.areEqual(this.bank_name, surrogate.bank_name) && Intrinsics.areEqual(this.bank_account_number_last_four, surrogate.bank_account_number_last_four);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.routing_number.hashCode() * 31) + this.hmac_bank_account_number.hashCode()) * 31) + this.bank_account_type.hashCode()) * 31) + this.state.hashCode()) * 31) + this.verification_method.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            MoneyDto moneyDto = this.current_balance;
            int iHashCode3 = (iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.available_balance;
            return ((((((((iHashCode3 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.source_type.hashCode()) * 31) + this.bank_account_holder_name.hashCode()) * 31) + this.bank_name.hashCode()) * 31) + this.bank_account_number_last_four.hashCode();
        }

        public String toString() {
            return "Surrogate(routing_number=" + this.routing_number + ", hmac_bank_account_number=" + this.hmac_bank_account_number + ", bank_account_type=" + this.bank_account_type + ", state=" + this.state + ", verification_method=" + this.verification_method + ", created_at=" + this.created_at + ", current_balance=" + this.current_balance + ", available_balance=" + this.available_balance + ", source_type=" + this.source_type + ", bank_account_holder_name=" + this.bank_account_holder_name + ", bank_name=" + this.bank_name + ", bank_account_number_last_four=" + this.bank_account_number_last_four + ")";
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ACHRelationshipDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AccountTypeDto accountTypeDto, StateDto stateDto, VerificationMethodDto verificationMethodDto, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto sourceTypeDto, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.routing_number = "";
            } else {
                this.routing_number = str;
            }
            if ((i & 2) == 0) {
                this.hmac_bank_account_number = "";
            } else {
                this.hmac_bank_account_number = str2;
            }
            if ((i & 4) == 0) {
                this.bank_account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.bank_account_type = accountTypeDto;
            }
            if ((i & 8) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 16) == 0) {
                this.verification_method = VerificationMethodDto.INSTANCE.getZeroValue();
            } else {
                this.verification_method = verificationMethodDto;
            }
            if ((i & 32) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 64) == 0) {
                this.current_balance = null;
            } else {
                this.current_balance = moneyDto;
            }
            if ((i & 128) == 0) {
                this.available_balance = null;
            } else {
                this.available_balance = moneyDto2;
            }
            if ((i & 256) == 0) {
                this.source_type = SourceTypeDto.INSTANCE.getZeroValue();
            } else {
                this.source_type = sourceTypeDto;
            }
            if ((i & 512) == 0) {
                this.bank_account_holder_name = "";
            } else {
                this.bank_account_holder_name = str3;
            }
            if ((i & 1024) == 0) {
                this.bank_name = "";
            } else {
                this.bank_name = str4;
            }
            if ((i & 2048) == 0) {
                this.bank_account_number_last_four = "";
            } else {
                this.bank_account_number_last_four = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.routing_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.routing_number);
            }
            if (!Intrinsics.areEqual(self.hmac_bank_account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.hmac_bank_account_number);
            }
            if (self.bank_account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AccountTypeDto.Serializer.INSTANCE, self.bank_account_type);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, StateDto.Serializer.INSTANCE, self.state);
            }
            if (self.verification_method != VerificationMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, VerificationMethodDto.Serializer.INSTANCE, self.verification_method);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            MoneyDto moneyDto = self.current_balance;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.available_balance;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (self.source_type != SourceTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, SourceTypeDto.Serializer.INSTANCE, self.source_type);
            }
            if (!Intrinsics.areEqual(self.bank_account_holder_name, "")) {
                output.encodeStringElement(serialDesc, 9, self.bank_account_holder_name);
            }
            if (!Intrinsics.areEqual(self.bank_name, "")) {
                output.encodeStringElement(serialDesc, 10, self.bank_name);
            }
            if (Intrinsics.areEqual(self.bank_account_number_last_four, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 11, self.bank_account_number_last_four);
        }

        public Surrogate(String routing_number, String hmac_bank_account_number, AccountTypeDto bank_account_type, StateDto state, VerificationMethodDto verification_method, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four) {
            Intrinsics.checkNotNullParameter(routing_number, "routing_number");
            Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(verification_method, "verification_method");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
            Intrinsics.checkNotNullParameter(bank_name, "bank_name");
            Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
            this.routing_number = routing_number;
            this.hmac_bank_account_number = hmac_bank_account_number;
            this.bank_account_type = bank_account_type;
            this.state = state;
            this.verification_method = verification_method;
            this.created_at = instant;
            this.current_balance = moneyDto;
            this.available_balance = moneyDto2;
            this.source_type = source_type;
            this.bank_account_holder_name = bank_account_holder_name;
            this.bank_name = bank_name;
            this.bank_account_number_last_four = bank_account_number_last_four;
        }

        public /* synthetic */ Surrogate(String str, String str2, AccountTypeDto accountTypeDto, StateDto stateDto, VerificationMethodDto verificationMethodDto, Instant instant, MoneyDto moneyDto, MoneyDto moneyDto2, SourceTypeDto sourceTypeDto, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 8) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 16) != 0 ? VerificationMethodDto.INSTANCE.getZeroValue() : verificationMethodDto, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : moneyDto, (i & 128) == 0 ? moneyDto2 : null, (i & 256) != 0 ? SourceTypeDto.INSTANCE.getZeroValue() : sourceTypeDto, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5);
        }

        public final String getRouting_number() {
            return this.routing_number;
        }

        public final String getHmac_bank_account_number() {
            return this.hmac_bank_account_number;
        }

        public final AccountTypeDto getBank_account_type() {
            return this.bank_account_type;
        }

        public final StateDto getState() {
            return this.state;
        }

        public final VerificationMethodDto getVerification_method() {
            return this.verification_method;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final MoneyDto getCurrent_balance() {
            return this.current_balance;
        }

        public final MoneyDto getAvailable_balance() {
            return this.available_balance;
        }

        public final SourceTypeDto getSource_type() {
            return this.source_type;
        }

        public final String getBank_account_holder_name() {
            return this.bank_account_holder_name;
        }

        public final String getBank_name() {
            return this.bank_name;
        }

        public final String getBank_account_number_last_four() {
            return this.bank_account_number_last_four;
        }
    }

    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ACHRelationshipDetailsDto, ACHRelationshipDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ACHRelationshipDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHRelationshipDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ACHRelationshipDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ACHRelationshipDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ACHRelationshipDetails> getProtoAdapter() {
            return ACHRelationshipDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHRelationshipDetailsDto getZeroValue() {
            return ACHRelationshipDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ACHRelationshipDetailsDto fromProto(ACHRelationshipDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String routing_number = proto.getRouting_number();
            String hmac_bank_account_number = proto.getHmac_bank_account_number();
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getBank_account_type());
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            VerificationMethodDto verificationMethodDtoFromProto = VerificationMethodDto.INSTANCE.fromProto(proto.getVerification_method());
            Instant created_at = proto.getCreated_at();
            Money current_balance = proto.getCurrent_balance();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = current_balance != null ? MoneyDto.INSTANCE.fromProto(current_balance) : null;
            Money available_balance = proto.getAvailable_balance();
            return new ACHRelationshipDetailsDto(new Surrogate(routing_number, hmac_bank_account_number, accountTypeDtoFromProto, stateDtoFromProto, verificationMethodDtoFromProto, created_at, moneyDtoFromProto, available_balance != null ? MoneyDto.INSTANCE.fromProto(available_balance) : null, SourceTypeDto.INSTANCE.fromProto(proto.getSource_type()), proto.getBank_account_holder_name(), proto.getBank_name(), proto.getBank_account_number_last_four()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ACHRelationshipDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ACHRelationshipDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "PENDING", "VERIFIED", "UNLINKED", "NEEDS_APPROVAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<ACHRelationshipDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, ACHRelationshipDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final StateDto PENDING = new PENDING("PENDING", 1);
        public static final StateDto VERIFIED = new VERIFIED("VERIFIED", 2);
        public static final StateDto UNLINKED = new UNLINKED("UNLINKED", 3);
        public static final StateDto NEEDS_APPROVAL = new NEEDS_APPROVAL("NEEDS_APPROVAL", 4);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{STATE_UNSPECIFIED, PENDING, VERIFIED, UNLINKED, NEEDS_APPROVAL};
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

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.StateDto.STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends StateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.State toProto() {
                return ACHRelationshipDetails.State.STATE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHRelationshipDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.StateDto.PENDING", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING extends StateDto {
            PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.State toProto() {
                return ACHRelationshipDetails.State.PENDING;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.StateDto.VERIFIED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VERIFIED extends StateDto {
            VERIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.State toProto() {
                return ACHRelationshipDetails.State.VERIFIED;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.StateDto.UNLINKED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNLINKED extends StateDto {
            UNLINKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.State toProto() {
                return ACHRelationshipDetails.State.UNLINKED;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.StateDto.NEEDS_APPROVAL", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEEDS_APPROVAL extends StateDto {
            NEEDS_APPROVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.State toProto() {
                return ACHRelationshipDetails.State.NEEDS_APPROVAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, ACHRelationshipDetails.State> {

            /* compiled from: ACHRelationshipDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHRelationshipDetails.State.values().length];
                    try {
                        iArr[ACHRelationshipDetails.State.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.State.PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.State.VERIFIED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.State.UNLINKED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.State.NEEDS_APPROVAL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
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
            public ProtoAdapter<ACHRelationshipDetails.State> getProtoAdapter() {
                return ACHRelationshipDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(ACHRelationshipDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StateDto.STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return StateDto.PENDING;
                }
                if (i == 3) {
                    return StateDto.VERIFIED;
                }
                if (i == 4) {
                    return StateDto.UNLINKED;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return StateDto.NEEDS_APPROVAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, ACHRelationshipDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHRelationshipDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

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
    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFICATION_METHOD_UNSPECIFIED", "MICRODEPOSITS", "IAV", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class VerificationMethodDto implements Dto2<ACHRelationshipDetails.VerificationMethod>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerificationMethodDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<VerificationMethodDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<VerificationMethodDto, ACHRelationshipDetails.VerificationMethod>> binaryBase64Serializer$delegate;
        public static final VerificationMethodDto VERIFICATION_METHOD_UNSPECIFIED = new VERIFICATION_METHOD_UNSPECIFIED("VERIFICATION_METHOD_UNSPECIFIED", 0);
        public static final VerificationMethodDto MICRODEPOSITS = new MICRODEPOSITS("MICRODEPOSITS", 1);
        public static final VerificationMethodDto IAV = new IAV("IAV", 2);

        private static final /* synthetic */ VerificationMethodDto[] $values() {
            return new VerificationMethodDto[]{VERIFICATION_METHOD_UNSPECIFIED, MICRODEPOSITS, IAV};
        }

        public /* synthetic */ VerificationMethodDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<VerificationMethodDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private VerificationMethodDto(String str, int i) {
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.VerificationMethodDto.VERIFICATION_METHOD_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VERIFICATION_METHOD_UNSPECIFIED extends VerificationMethodDto {
            VERIFICATION_METHOD_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.VerificationMethod toProto() {
                return ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED;
            }
        }

        static {
            VerificationMethodDto[] verificationMethodDtoArr$values = $values();
            $VALUES = verificationMethodDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(verificationMethodDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto$VerificationMethodDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHRelationshipDetailsDto.VerificationMethodDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.VerificationMethodDto.MICRODEPOSITS", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MICRODEPOSITS extends VerificationMethodDto {
            MICRODEPOSITS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.VerificationMethod toProto() {
                return ACHRelationshipDetails.VerificationMethod.MICRODEPOSITS;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.VerificationMethodDto.IAV", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IAV extends VerificationMethodDto {
            IAV(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.VerificationMethod toProto() {
                return ACHRelationshipDetails.VerificationMethod.IAV;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<VerificationMethodDto, ACHRelationshipDetails.VerificationMethod> {

            /* compiled from: ACHRelationshipDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHRelationshipDetails.VerificationMethod.values().length];
                    try {
                        iArr[ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.VerificationMethod.MICRODEPOSITS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.VerificationMethod.IAV.ordinal()] = 3;
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

            public final KSerializer<VerificationMethodDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<VerificationMethodDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<VerificationMethodDto> getBinaryBase64Serializer() {
                return (KSerializer) VerificationMethodDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHRelationshipDetails.VerificationMethod> getProtoAdapter() {
                return ACHRelationshipDetails.VerificationMethod.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public VerificationMethodDto getZeroValue() {
                return VerificationMethodDto.VERIFICATION_METHOD_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public VerificationMethodDto fromProto(ACHRelationshipDetails.VerificationMethod proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return VerificationMethodDto.VERIFICATION_METHOD_UNSPECIFIED;
                }
                if (i == 2) {
                    return VerificationMethodDto.MICRODEPOSITS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return VerificationMethodDto.IAV;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$VerificationMethodDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<VerificationMethodDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<VerificationMethodDto, ACHRelationshipDetails.VerificationMethod> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHRelationshipDetails.VerificationMethod", VerificationMethodDto.getEntries(), VerificationMethodDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public VerificationMethodDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (VerificationMethodDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, VerificationMethodDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static VerificationMethodDto valueOf(String str) {
            return (VerificationMethodDto) Enum.valueOf(VerificationMethodDto.class, str);
        }

        public static VerificationMethodDto[] values() {
            return (VerificationMethodDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TYPE_UNSPECIFIED", "CHECKING", "SAVINGS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountTypeDto implements Dto2<ACHRelationshipDetails.AccountType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AccountTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountTypeDto, ACHRelationshipDetails.AccountType>> binaryBase64Serializer$delegate;
        public static final AccountTypeDto ACCOUNT_TYPE_UNSPECIFIED = new ACCOUNT_TYPE_UNSPECIFIED("ACCOUNT_TYPE_UNSPECIFIED", 0);
        public static final AccountTypeDto CHECKING = new CHECKING("CHECKING", 1);
        public static final AccountTypeDto SAVINGS = new SAVINGS("SAVINGS", 2);

        private static final /* synthetic */ AccountTypeDto[] $values() {
            return new AccountTypeDto[]{ACCOUNT_TYPE_UNSPECIFIED, CHECKING, SAVINGS};
        }

        public /* synthetic */ AccountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AccountTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_TYPE_UNSPECIFIED extends AccountTypeDto {
            ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.AccountType toProto() {
                return ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
            }
        }

        private AccountTypeDto(String str, int i) {
        }

        static {
            AccountTypeDto[] accountTypeDtoArr$values = $values();
            $VALUES = accountTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto$AccountTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHRelationshipDetailsDto.AccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.AccountTypeDto.CHECKING", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKING extends AccountTypeDto {
            CHECKING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.AccountType toProto() {
                return ACHRelationshipDetails.AccountType.CHECKING;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.AccountTypeDto.SAVINGS", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SAVINGS extends AccountTypeDto {
            SAVINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.AccountType toProto() {
                return ACHRelationshipDetails.AccountType.SAVINGS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AccountTypeDto, ACHRelationshipDetails.AccountType> {

            /* compiled from: ACHRelationshipDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHRelationshipDetails.AccountType.values().length];
                    try {
                        iArr[ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.AccountType.CHECKING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.AccountType.SAVINGS.ordinal()] = 3;
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

            public final KSerializer<AccountTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHRelationshipDetails.AccountType> getProtoAdapter() {
                return ACHRelationshipDetails.AccountType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeDto getZeroValue() {
                return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeDto fromProto(ACHRelationshipDetails.AccountType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AccountTypeDto.CHECKING;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return AccountTypeDto.SAVINGS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$AccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AccountTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AccountTypeDto, ACHRelationshipDetails.AccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHRelationshipDetails.AccountType", AccountTypeDto.getEntries(), AccountTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AccountTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AccountTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AccountTypeDto valueOf(String str) {
            return (AccountTypeDto) Enum.valueOf(AccountTypeDto.class, str);
        }

        public static AccountTypeDto[] values() {
            return (AccountTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_TYPE_UNSPECIFIED", "CUSTOMER_INITIATED", "CATPAY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceTypeDto implements Dto2<ACHRelationshipDetails.SourceType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceTypeDto, ACHRelationshipDetails.SourceType>> binaryBase64Serializer$delegate;
        public static final SourceTypeDto SOURCE_TYPE_UNSPECIFIED = new SOURCE_TYPE_UNSPECIFIED("SOURCE_TYPE_UNSPECIFIED", 0);
        public static final SourceTypeDto CUSTOMER_INITIATED = new CUSTOMER_INITIATED("CUSTOMER_INITIATED", 1);
        public static final SourceTypeDto CATPAY = new CATPAY("CATPAY", 2);

        private static final /* synthetic */ SourceTypeDto[] $values() {
            return new SourceTypeDto[]{SOURCE_TYPE_UNSPECIFIED, CUSTOMER_INITIATED, CATPAY};
        }

        public /* synthetic */ SourceTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.SourceTypeDto.SOURCE_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_TYPE_UNSPECIFIED extends SourceTypeDto {
            SOURCE_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.SourceType toProto() {
                return ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED;
            }
        }

        private SourceTypeDto(String str, int i) {
        }

        static {
            SourceTypeDto[] sourceTypeDtoArr$values = $values();
            $VALUES = sourceTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto$SourceTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ACHRelationshipDetailsDto.SourceTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.SourceTypeDto.CUSTOMER_INITIATED", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOMER_INITIATED extends SourceTypeDto {
            CUSTOMER_INITIATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.SourceType toProto() {
                return ACHRelationshipDetails.SourceType.CUSTOMER_INITIATED;
            }
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ACHRelationshipDetailsDto.SourceTypeDto.CATPAY", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CATPAY extends SourceTypeDto {
            CATPAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ACHRelationshipDetails.SourceType toProto() {
                return ACHRelationshipDetails.SourceType.CATPAY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceTypeDto, ACHRelationshipDetails.SourceType> {

            /* compiled from: ACHRelationshipDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ACHRelationshipDetails.SourceType.values().length];
                    try {
                        iArr[ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.SourceType.CUSTOMER_INITIATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ACHRelationshipDetails.SourceType.CATPAY.ordinal()] = 3;
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

            public final KSerializer<SourceTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ACHRelationshipDetails.SourceType> getProtoAdapter() {
                return ACHRelationshipDetails.SourceType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceTypeDto getZeroValue() {
                return SourceTypeDto.SOURCE_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceTypeDto fromProto(ACHRelationshipDetails.SourceType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SourceTypeDto.SOURCE_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return SourceTypeDto.CUSTOMER_INITIATED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return SourceTypeDto.CATPAY;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ACHRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$SourceTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SourceTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceTypeDto, ACHRelationshipDetails.SourceType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ACHRelationshipDetails.SourceType", SourceTypeDto.getEntries(), SourceTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceTypeDto valueOf(String str) {
            return (SourceTypeDto) Enum.valueOf(SourceTypeDto.class, str);
        }

        public static SourceTypeDto[] values() {
            return (SourceTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ACHRelationshipDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ACHRelationshipDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ACHRelationshipDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ACHRelationshipDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ACHRelationshipDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ACHRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ACHRelationshipDetailsDto";
        }
    }
}
