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
import com.robinhood.rosetta.cashier.IAVQueuedDepositDetails;
import com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: IAVQueuedDepositDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006456789B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bo\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0016Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate;)V", "user_uuid", "", "bank_account_type", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "bank_routing_number", "hmac_bank_account_number", "account_owner_names", "", "balance_available", "Lcom/robinhood/rosetta/common/MoneyDto;", "balance_current", "amount", "state", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;)V", "getUser_uuid", "()Ljava/lang/String;", "getBank_account_type", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "getBank_routing_number", "getHmac_bank_account_number", "getAccount_owner_names", "()Ljava/util/List;", "getBalance_available", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getBalance_current", "getAmount", "getState", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "BankAccountTypeDto", "StateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class IAVQueuedDepositDetailsDto implements Dto3<IAVQueuedDepositDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IAVQueuedDepositDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IAVQueuedDepositDetailsDto, IAVQueuedDepositDetails>> binaryBase64Serializer$delegate;
    private static final IAVQueuedDepositDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IAVQueuedDepositDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IAVQueuedDepositDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final BankAccountTypeDto getBank_account_type() {
        return this.surrogate.getBank_account_type();
    }

    public final String getBank_routing_number() {
        return this.surrogate.getBank_routing_number();
    }

    public final String getHmac_bank_account_number() {
        return this.surrogate.getHmac_bank_account_number();
    }

    public final List<String> getAccount_owner_names() {
        return this.surrogate.getAccount_owner_names();
    }

    public final MoneyDto getBalance_available() {
        return this.surrogate.getBalance_available();
    }

    public final MoneyDto getBalance_current() {
        return this.surrogate.getBalance_current();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public /* synthetic */ IAVQueuedDepositDetailsDto(String str, BankAccountTypeDto bankAccountTypeDto, String str2, String str3, List list, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto stateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BankAccountTypeDto.INSTANCE.getZeroValue() : bankAccountTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IAVQueuedDepositDetailsDto(String user_uuid, BankAccountTypeDto bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto state) {
        this(new Surrogate(user_uuid, bank_account_type, bank_routing_number, hmac_bank_account_number, account_owner_names, moneyDto, moneyDto2, moneyDto3, state));
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public static /* synthetic */ IAVQueuedDepositDetailsDto copy$default(IAVQueuedDepositDetailsDto iAVQueuedDepositDetailsDto, String str, BankAccountTypeDto bankAccountTypeDto, String str2, String str3, List list, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto stateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iAVQueuedDepositDetailsDto.surrogate.getUser_uuid();
        }
        if ((i & 2) != 0) {
            bankAccountTypeDto = iAVQueuedDepositDetailsDto.surrogate.getBank_account_type();
        }
        if ((i & 4) != 0) {
            str2 = iAVQueuedDepositDetailsDto.surrogate.getBank_routing_number();
        }
        if ((i & 8) != 0) {
            str3 = iAVQueuedDepositDetailsDto.surrogate.getHmac_bank_account_number();
        }
        if ((i & 16) != 0) {
            list = iAVQueuedDepositDetailsDto.surrogate.getAccount_owner_names();
        }
        if ((i & 32) != 0) {
            moneyDto = iAVQueuedDepositDetailsDto.surrogate.getBalance_available();
        }
        if ((i & 64) != 0) {
            moneyDto2 = iAVQueuedDepositDetailsDto.surrogate.getBalance_current();
        }
        if ((i & 128) != 0) {
            moneyDto3 = iAVQueuedDepositDetailsDto.surrogate.getAmount();
        }
        if ((i & 256) != 0) {
            stateDto = iAVQueuedDepositDetailsDto.surrogate.getState();
        }
        MoneyDto moneyDto4 = moneyDto3;
        StateDto stateDto2 = stateDto;
        MoneyDto moneyDto5 = moneyDto;
        MoneyDto moneyDto6 = moneyDto2;
        List list2 = list;
        String str4 = str2;
        return iAVQueuedDepositDetailsDto.copy(str, bankAccountTypeDto, str4, str3, list2, moneyDto5, moneyDto6, moneyDto4, stateDto2);
    }

    public final IAVQueuedDepositDetailsDto copy(String user_uuid, BankAccountTypeDto bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, MoneyDto balance_available, MoneyDto balance_current, MoneyDto amount, StateDto state) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
        Intrinsics.checkNotNullParameter(state, "state");
        return new IAVQueuedDepositDetailsDto(new Surrogate(user_uuid, bank_account_type, bank_routing_number, hmac_bank_account_number, account_owner_names, balance_available, balance_current, amount, state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IAVQueuedDepositDetails toProto() {
        String user_uuid = this.surrogate.getUser_uuid();
        IAVQueuedDepositDetails.BankAccountType bankAccountType = (IAVQueuedDepositDetails.BankAccountType) this.surrogate.getBank_account_type().toProto();
        String bank_routing_number = this.surrogate.getBank_routing_number();
        String hmac_bank_account_number = this.surrogate.getHmac_bank_account_number();
        List<String> account_owner_names = this.surrogate.getAccount_owner_names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_owner_names, 10));
        Iterator<T> it = account_owner_names.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        MoneyDto balance_available = this.surrogate.getBalance_available();
        Money proto = balance_available != null ? balance_available.toProto() : null;
        MoneyDto balance_current = this.surrogate.getBalance_current();
        Money proto2 = balance_current != null ? balance_current.toProto() : null;
        MoneyDto amount = this.surrogate.getAmount();
        return new IAVQueuedDepositDetails(user_uuid, bankAccountType, bank_routing_number, hmac_bank_account_number, arrayList, proto, proto2, amount != null ? amount.toProto() : null, (IAVQueuedDepositDetails.State) this.surrogate.getState().toProto(), null, 512, null);
    }

    public String toString() {
        return "[IAVQueuedDepositDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IAVQueuedDepositDetailsDto) && Intrinsics.areEqual(((IAVQueuedDepositDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002FGBm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003Jo\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0013HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J%\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010'R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.¨\u0006H"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate;", "", "user_uuid", "", "bank_account_type", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "bank_routing_number", "hmac_bank_account_number", "account_owner_names", "", "balance_available", "Lcom/robinhood/rosetta/common/MoneyDto;", "balance_current", "amount", "state", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_uuid$annotations", "()V", "getUser_uuid", "()Ljava/lang/String;", "getBank_account_type$annotations", "getBank_account_type", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "getBank_routing_number$annotations", "getBank_routing_number", "getHmac_bank_account_number$annotations", "getHmac_bank_account_number", "getAccount_owner_names$annotations", "getAccount_owner_names", "()Ljava/util/List;", "getBalance_available$annotations", "getBalance_available", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getBalance_current$annotations", "getBalance_current", "getAmount$annotations", "getAmount", "getState$annotations", "getState", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> account_owner_names;
        private final MoneyDto amount;
        private final MoneyDto balance_available;
        private final MoneyDto balance_current;
        private final BankAccountTypeDto bank_account_type;
        private final String bank_routing_number;
        private final String hmac_bank_account_number;
        private final StateDto state;
        private final String user_uuid;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IAVQueuedDepositDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (BankAccountTypeDto) null, (String) null, (String) null, (List) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (StateDto) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, BankAccountTypeDto bankAccountTypeDto, String str2, String str3, List list, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto stateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.user_uuid;
            }
            if ((i & 2) != 0) {
                bankAccountTypeDto = surrogate.bank_account_type;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.bank_routing_number;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.hmac_bank_account_number;
            }
            if ((i & 16) != 0) {
                list = surrogate.account_owner_names;
            }
            if ((i & 32) != 0) {
                moneyDto = surrogate.balance_available;
            }
            if ((i & 64) != 0) {
                moneyDto2 = surrogate.balance_current;
            }
            if ((i & 128) != 0) {
                moneyDto3 = surrogate.amount;
            }
            if ((i & 256) != 0) {
                stateDto = surrogate.state;
            }
            MoneyDto moneyDto4 = moneyDto3;
            StateDto stateDto2 = stateDto;
            MoneyDto moneyDto5 = moneyDto;
            MoneyDto moneyDto6 = moneyDto2;
            List list2 = list;
            String str4 = str2;
            return surrogate.copy(str, bankAccountTypeDto, str4, str3, list2, moneyDto5, moneyDto6, moneyDto4, stateDto2);
        }

        @SerialName("accountOwnerNames")
        @JsonAnnotations2(names = {"account_owner_names"})
        public static /* synthetic */ void getAccount_owner_names$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("balanceAvailable")
        @JsonAnnotations2(names = {"balance_available"})
        public static /* synthetic */ void getBalance_available$annotations() {
        }

        @SerialName("balanceCurrent")
        @JsonAnnotations2(names = {"balance_current"})
        public static /* synthetic */ void getBalance_current$annotations() {
        }

        @SerialName("bankAccountType")
        @JsonAnnotations2(names = {"bank_account_type"})
        public static /* synthetic */ void getBank_account_type$annotations() {
        }

        @SerialName("bankRoutingNumber")
        @JsonAnnotations2(names = {"bank_routing_number"})
        public static /* synthetic */ void getBank_routing_number$annotations() {
        }

        @SerialName("hmacBankAccountNumber")
        @JsonAnnotations2(names = {"hmac_bank_account_number"})
        public static /* synthetic */ void getHmac_bank_account_number$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component2, reason: from getter */
        public final BankAccountTypeDto getBank_account_type() {
            return this.bank_account_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBank_routing_number() {
            return this.bank_routing_number;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHmac_bank_account_number() {
            return this.hmac_bank_account_number;
        }

        public final List<String> component5() {
            return this.account_owner_names;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getBalance_available() {
            return this.balance_available;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getBalance_current() {
            return this.balance_current;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component9, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        public final Surrogate copy(String user_uuid, BankAccountTypeDto bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, MoneyDto balance_available, MoneyDto balance_current, MoneyDto amount, StateDto state) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
            Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
            Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
            Intrinsics.checkNotNullParameter(state, "state");
            return new Surrogate(user_uuid, bank_account_type, bank_routing_number, hmac_bank_account_number, account_owner_names, balance_available, balance_current, amount, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && this.bank_account_type == surrogate.bank_account_type && Intrinsics.areEqual(this.bank_routing_number, surrogate.bank_routing_number) && Intrinsics.areEqual(this.hmac_bank_account_number, surrogate.hmac_bank_account_number) && Intrinsics.areEqual(this.account_owner_names, surrogate.account_owner_names) && Intrinsics.areEqual(this.balance_available, surrogate.balance_available) && Intrinsics.areEqual(this.balance_current, surrogate.balance_current) && Intrinsics.areEqual(this.amount, surrogate.amount) && this.state == surrogate.state;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.user_uuid.hashCode() * 31) + this.bank_account_type.hashCode()) * 31) + this.bank_routing_number.hashCode()) * 31) + this.hmac_bank_account_number.hashCode()) * 31) + this.account_owner_names.hashCode()) * 31;
            MoneyDto moneyDto = this.balance_available;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.balance_current;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.amount;
            return ((iHashCode3 + (moneyDto3 != null ? moneyDto3.hashCode() : 0)) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "Surrogate(user_uuid=" + this.user_uuid + ", bank_account_type=" + this.bank_account_type + ", bank_routing_number=" + this.bank_routing_number + ", hmac_bank_account_number=" + this.hmac_bank_account_number + ", account_owner_names=" + this.account_owner_names + ", balance_available=" + this.balance_available + ", balance_current=" + this.balance_current + ", amount=" + this.amount + ", state=" + this.state + ")";
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IAVQueuedDepositDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BankAccountTypeDto bankAccountTypeDto, String str2, String str3, List list, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto stateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str;
            }
            if ((i & 2) == 0) {
                this.bank_account_type = BankAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.bank_account_type = bankAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.bank_routing_number = "";
            } else {
                this.bank_routing_number = str2;
            }
            if ((i & 8) == 0) {
                this.hmac_bank_account_number = "";
            } else {
                this.hmac_bank_account_number = str3;
            }
            if ((i & 16) == 0) {
                this.account_owner_names = CollectionsKt.emptyList();
            } else {
                this.account_owner_names = list;
            }
            if ((i & 32) == 0) {
                this.balance_available = null;
            } else {
                this.balance_available = moneyDto;
            }
            if ((i & 64) == 0) {
                this.balance_current = null;
            } else {
                this.balance_current = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto3;
            }
            if ((i & 256) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_uuid);
            }
            if (self.bank_account_type != BankAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BankAccountTypeDto.Serializer.INSTANCE, self.bank_account_type);
            }
            if (!Intrinsics.areEqual(self.bank_routing_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.bank_routing_number);
            }
            if (!Intrinsics.areEqual(self.hmac_bank_account_number, "")) {
                output.encodeStringElement(serialDesc, 3, self.hmac_bank_account_number);
            }
            if (!Intrinsics.areEqual(self.account_owner_names, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.account_owner_names);
            }
            MoneyDto moneyDto = self.balance_available;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.balance_current;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.amount;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, StateDto.Serializer.INSTANCE, self.state);
            }
        }

        public Surrogate(String user_uuid, BankAccountTypeDto bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto state) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
            Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
            Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
            Intrinsics.checkNotNullParameter(state, "state");
            this.user_uuid = user_uuid;
            this.bank_account_type = bank_account_type;
            this.bank_routing_number = bank_routing_number;
            this.hmac_bank_account_number = hmac_bank_account_number;
            this.account_owner_names = account_owner_names;
            this.balance_available = moneyDto;
            this.balance_current = moneyDto2;
            this.amount = moneyDto3;
            this.state = state;
        }

        public /* synthetic */ Surrogate(String str, BankAccountTypeDto bankAccountTypeDto, String str2, String str3, List list, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, StateDto stateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BankAccountTypeDto.INSTANCE.getZeroValue() : bankAccountTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto);
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final BankAccountTypeDto getBank_account_type() {
            return this.bank_account_type;
        }

        public final String getBank_routing_number() {
            return this.bank_routing_number;
        }

        public final String getHmac_bank_account_number() {
            return this.hmac_bank_account_number;
        }

        public final List<String> getAccount_owner_names() {
            return this.account_owner_names;
        }

        public final MoneyDto getBalance_available() {
            return this.balance_available;
        }

        public final MoneyDto getBalance_current() {
            return this.balance_current;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final StateDto getState() {
            return this.state;
        }
    }

    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IAVQueuedDepositDetailsDto, IAVQueuedDepositDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IAVQueuedDepositDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IAVQueuedDepositDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IAVQueuedDepositDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) IAVQueuedDepositDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IAVQueuedDepositDetails> getProtoAdapter() {
            return IAVQueuedDepositDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IAVQueuedDepositDetailsDto getZeroValue() {
            return IAVQueuedDepositDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IAVQueuedDepositDetailsDto fromProto(IAVQueuedDepositDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String user_uuid = proto.getUser_uuid();
            BankAccountTypeDto bankAccountTypeDtoFromProto = BankAccountTypeDto.INSTANCE.fromProto(proto.getBank_account_type());
            String bank_routing_number = proto.getBank_routing_number();
            String hmac_bank_account_number = proto.getHmac_bank_account_number();
            List<String> account_owner_names = proto.getAccount_owner_names();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_owner_names, 10));
            Iterator<T> it = account_owner_names.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            Money balance_available = proto.getBalance_available();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = balance_available != null ? MoneyDto.INSTANCE.fromProto(balance_available) : null;
            Money balance_current = proto.getBalance_current();
            MoneyDto moneyDtoFromProto2 = balance_current != null ? MoneyDto.INSTANCE.fromProto(balance_current) : null;
            Money amount = proto.getAmount();
            return new IAVQueuedDepositDetailsDto(new Surrogate(user_uuid, bankAccountTypeDtoFromProto, bank_routing_number, hmac_bank_account_number, arrayList, moneyDtoFromProto, moneyDtoFromProto2, amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null, StateDto.INSTANCE.fromProto(proto.getState())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IAVQueuedDepositDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new IAVQueuedDepositDetailsDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "BANK_ACCOUNT_TYPE_UNSPECIFIED", "CHECKING", "SAVINGS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class BankAccountTypeDto implements Dto2<IAVQueuedDepositDetails.BankAccountType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BankAccountTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<BankAccountTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<BankAccountTypeDto, IAVQueuedDepositDetails.BankAccountType>> binaryBase64Serializer$delegate;
        public static final BankAccountTypeDto BANK_ACCOUNT_TYPE_UNSPECIFIED = new BANK_ACCOUNT_TYPE_UNSPECIFIED("BANK_ACCOUNT_TYPE_UNSPECIFIED", 0);
        public static final BankAccountTypeDto CHECKING = new CHECKING("CHECKING", 1);
        public static final BankAccountTypeDto SAVINGS = new SAVINGS("SAVINGS", 2);

        private static final /* synthetic */ BankAccountTypeDto[] $values() {
            return new BankAccountTypeDto[]{BANK_ACCOUNT_TYPE_UNSPECIFIED, CHECKING, SAVINGS};
        }

        public /* synthetic */ BankAccountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<BankAccountTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private BankAccountTypeDto(String str, int i) {
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto.BankAccountTypeDto.BANK_ACCOUNT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BANK_ACCOUNT_TYPE_UNSPECIFIED extends BankAccountTypeDto {
            BANK_ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IAVQueuedDepositDetails.BankAccountType toProto() {
                return IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED;
            }
        }

        static {
            BankAccountTypeDto[] bankAccountTypeDtoArr$values = $values();
            $VALUES = bankAccountTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(bankAccountTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto$BankAccountTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IAVQueuedDepositDetailsDto.BankAccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto.BankAccountTypeDto.CHECKING", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKING extends BankAccountTypeDto {
            CHECKING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IAVQueuedDepositDetails.BankAccountType toProto() {
                return IAVQueuedDepositDetails.BankAccountType.CHECKING;
            }
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto.BankAccountTypeDto.SAVINGS", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SAVINGS extends BankAccountTypeDto {
            SAVINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IAVQueuedDepositDetails.BankAccountType toProto() {
                return IAVQueuedDepositDetails.BankAccountType.SAVINGS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<BankAccountTypeDto, IAVQueuedDepositDetails.BankAccountType> {

            /* compiled from: IAVQueuedDepositDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IAVQueuedDepositDetails.BankAccountType.values().length];
                    try {
                        iArr[IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IAVQueuedDepositDetails.BankAccountType.CHECKING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[IAVQueuedDepositDetails.BankAccountType.SAVINGS.ordinal()] = 3;
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

            public final KSerializer<BankAccountTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BankAccountTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BankAccountTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) BankAccountTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<IAVQueuedDepositDetails.BankAccountType> getProtoAdapter() {
                return IAVQueuedDepositDetails.BankAccountType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BankAccountTypeDto getZeroValue() {
                return BankAccountTypeDto.BANK_ACCOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BankAccountTypeDto fromProto(IAVQueuedDepositDetails.BankAccountType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return BankAccountTypeDto.BANK_ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return BankAccountTypeDto.CHECKING;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return BankAccountTypeDto.SAVINGS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$BankAccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<BankAccountTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<BankAccountTypeDto, IAVQueuedDepositDetails.BankAccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.IAVQueuedDepositDetails.BankAccountType", BankAccountTypeDto.getEntries(), BankAccountTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public BankAccountTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (BankAccountTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, BankAccountTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static BankAccountTypeDto valueOf(String str) {
            return (BankAccountTypeDto) Enum.valueOf(BankAccountTypeDto.class, str);
        }

        public static BankAccountTypeDto[] values() {
            return (BankAccountTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "CREATED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<IAVQueuedDepositDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, IAVQueuedDepositDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final StateDto CREATED = new CREATED("CREATED", 1);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{TYPE_UNSPECIFIED, CREATED};
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

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto.StateDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends StateDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IAVQueuedDepositDetails.State toProto() {
                return IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IAVQueuedDepositDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto.StateDto.CREATED", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREATED extends StateDto {
            CREATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public IAVQueuedDepositDetails.State toProto() {
                return IAVQueuedDepositDetails.State.CREATED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, IAVQueuedDepositDetails.State> {

            /* compiled from: IAVQueuedDepositDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IAVQueuedDepositDetails.State.values().length];
                    try {
                        iArr[IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IAVQueuedDepositDetails.State.CREATED.ordinal()] = 2;
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
            public ProtoAdapter<IAVQueuedDepositDetails.State> getProtoAdapter() {
                return IAVQueuedDepositDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(IAVQueuedDepositDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StateDto.TYPE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return StateDto.CREATED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: IAVQueuedDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, IAVQueuedDepositDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.IAVQueuedDepositDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

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

    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IAVQueuedDepositDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.IAVQueuedDepositDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IAVQueuedDepositDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IAVQueuedDepositDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IAVQueuedDepositDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IAVQueuedDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.IAVQueuedDepositDetailsDto";
        }
    }
}
