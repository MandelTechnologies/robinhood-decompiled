package com.robinhood.transfers.suggestions.pills.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: MicrogramTransferAccount.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABB\u0081\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013BU\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0014J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003Jk\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001J&\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?HÁ\u0001¢\u0006\u0002\b@R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\b\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018¨\u0006C"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "", "seen1", "", "type", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;", "status", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;", "isExternal", "", "accountName", "", "accountNumber", "transferLimit", "withdrawableCash", "ungrantedInstant", "hasWithdrawalFee", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountName$annotations", "()V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber$annotations", "getAccountNumber", "getHasWithdrawalFee$annotations", "getHasWithdrawalFee", "()Z", "isExternal$annotations", "getStatus$annotations", "getStatus", "()Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;", "getTransferLimit$annotations", "getTransferLimit", "getType$annotations", "getType", "()Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;", "getUngrantedInstant$annotations", "getUngrantedInstant", "getWithdrawableCash$annotations", "getWithdrawableCash", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class MicrogramTransferAccount {
    private final String accountName;
    private final String accountNumber;
    private final boolean hasWithdrawalFee;
    private final boolean isExternal;
    private final MicrogramTransferAccountStatus status;
    private final String transferLimit;
    private final MicrogramTransferAccountType type;
    private final String ungrantedInstant;
    private final String withdrawableCash;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {MicrogramTransferAccountType.INSTANCE.serializer(), MicrogramTransferAccountStatus.INSTANCE.serializer(), null, null, null, null, null, null, null};

    public static /* synthetic */ MicrogramTransferAccount copy$default(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccountType microgramTransferAccountType, MicrogramTransferAccountStatus microgramTransferAccountStatus, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramTransferAccountType = microgramTransferAccount.type;
        }
        if ((i & 2) != 0) {
            microgramTransferAccountStatus = microgramTransferAccount.status;
        }
        if ((i & 4) != 0) {
            z = microgramTransferAccount.isExternal;
        }
        if ((i & 8) != 0) {
            str = microgramTransferAccount.accountName;
        }
        if ((i & 16) != 0) {
            str2 = microgramTransferAccount.accountNumber;
        }
        if ((i & 32) != 0) {
            str3 = microgramTransferAccount.transferLimit;
        }
        if ((i & 64) != 0) {
            str4 = microgramTransferAccount.withdrawableCash;
        }
        if ((i & 128) != 0) {
            str5 = microgramTransferAccount.ungrantedInstant;
        }
        if ((i & 256) != 0) {
            z2 = microgramTransferAccount.hasWithdrawalFee;
        }
        String str6 = str5;
        boolean z3 = z2;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        boolean z4 = z;
        return microgramTransferAccount.copy(microgramTransferAccountType, microgramTransferAccountStatus, z4, str, str9, str7, str8, str6, z3);
    }

    @SerialName("accountName")
    public static /* synthetic */ void getAccountName$annotations() {
    }

    @SerialName("accountNumber")
    public static /* synthetic */ void getAccountNumber$annotations() {
    }

    @SerialName("hasWithdrawalFee")
    public static /* synthetic */ void getHasWithdrawalFee$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("transferLimit")
    public static /* synthetic */ void getTransferLimit$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("ungrantedInstant")
    public static /* synthetic */ void getUngrantedInstant$annotations() {
    }

    @SerialName("withdrawableCash")
    public static /* synthetic */ void getWithdrawableCash$annotations() {
    }

    @SerialName("isExternal")
    public static /* synthetic */ void isExternal$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramTransferAccountType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final MicrogramTransferAccountStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTransferLimit() {
        return this.transferLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWithdrawableCash() {
        return this.withdrawableCash;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUngrantedInstant() {
        return this.ungrantedInstant;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasWithdrawalFee() {
        return this.hasWithdrawalFee;
    }

    public final MicrogramTransferAccount copy(MicrogramTransferAccountType type2, MicrogramTransferAccountStatus status, boolean isExternal, String accountName, String accountNumber, String transferLimit, String withdrawableCash, String ungrantedInstant, boolean hasWithdrawalFee) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(transferLimit, "transferLimit");
        return new MicrogramTransferAccount(type2, status, isExternal, accountName, accountNumber, transferLimit, withdrawableCash, ungrantedInstant, hasWithdrawalFee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicrogramTransferAccount)) {
            return false;
        }
        MicrogramTransferAccount microgramTransferAccount = (MicrogramTransferAccount) other;
        return this.type == microgramTransferAccount.type && this.status == microgramTransferAccount.status && this.isExternal == microgramTransferAccount.isExternal && Intrinsics.areEqual(this.accountName, microgramTransferAccount.accountName) && Intrinsics.areEqual(this.accountNumber, microgramTransferAccount.accountNumber) && Intrinsics.areEqual(this.transferLimit, microgramTransferAccount.transferLimit) && Intrinsics.areEqual(this.withdrawableCash, microgramTransferAccount.withdrawableCash) && Intrinsics.areEqual(this.ungrantedInstant, microgramTransferAccount.ungrantedInstant) && this.hasWithdrawalFee == microgramTransferAccount.hasWithdrawalFee;
    }

    public int hashCode() {
        MicrogramTransferAccountType microgramTransferAccountType = this.type;
        int iHashCode = (microgramTransferAccountType == null ? 0 : microgramTransferAccountType.hashCode()) * 31;
        MicrogramTransferAccountStatus microgramTransferAccountStatus = this.status;
        int iHashCode2 = (((((((((iHashCode + (microgramTransferAccountStatus == null ? 0 : microgramTransferAccountStatus.hashCode())) * 31) + Boolean.hashCode(this.isExternal)) * 31) + this.accountName.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.transferLimit.hashCode()) * 31;
        String str = this.withdrawableCash;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ungrantedInstant;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasWithdrawalFee);
    }

    public String toString() {
        return "MicrogramTransferAccount(type=" + this.type + ", status=" + this.status + ", isExternal=" + this.isExternal + ", accountName=" + this.accountName + ", accountNumber=" + this.accountNumber + ", transferLimit=" + this.transferLimit + ", withdrawableCash=" + this.withdrawableCash + ", ungrantedInstant=" + this.ungrantedInstant + ", hasWithdrawalFee=" + this.hasWithdrawalFee + ")";
    }

    /* compiled from: MicrogramTransferAccount.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MicrogramTransferAccount> serializer() {
            return MicrogramTransferAccount2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MicrogramTransferAccount(int i, @SerialName("type") MicrogramTransferAccountType microgramTransferAccountType, @SerialName("status") MicrogramTransferAccountStatus microgramTransferAccountStatus, @SerialName("isExternal") boolean z, @SerialName("accountName") String str, @SerialName("accountNumber") String str2, @SerialName("transferLimit") String str3, @SerialName("withdrawableCash") String str4, @SerialName("ungrantedInstant") String str5, @SerialName("hasWithdrawalFee") boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptions.throwMissingFieldException(i, 511, MicrogramTransferAccount2.INSTANCE.getDescriptor());
        }
        this.type = microgramTransferAccountType;
        this.status = microgramTransferAccountStatus;
        this.isExternal = z;
        this.accountName = str;
        this.accountNumber = str2;
        this.transferLimit = str3;
        this.withdrawableCash = str4;
        this.ungrantedInstant = str5;
        this.hasWithdrawalFee = z2;
    }

    public MicrogramTransferAccount(MicrogramTransferAccountType microgramTransferAccountType, MicrogramTransferAccountStatus microgramTransferAccountStatus, boolean z, String accountName, String accountNumber, String transferLimit, String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(transferLimit, "transferLimit");
        this.type = microgramTransferAccountType;
        this.status = microgramTransferAccountStatus;
        this.isExternal = z;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.transferLimit = transferLimit;
        this.withdrawableCash = str;
        this.ungrantedInstant = str2;
        this.hasWithdrawalFee = z2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(MicrogramTransferAccount self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.type);
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.status);
        output.encodeBooleanElement(serialDesc, 2, self.isExternal);
        output.encodeStringElement(serialDesc, 3, self.accountName);
        output.encodeStringElement(serialDesc, 4, self.accountNumber);
        output.encodeStringElement(serialDesc, 5, self.transferLimit);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.withdrawableCash);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.ungrantedInstant);
        output.encodeBooleanElement(serialDesc, 8, self.hasWithdrawalFee);
    }

    public final MicrogramTransferAccountType getType() {
        return this.type;
    }

    public final MicrogramTransferAccountStatus getStatus() {
        return this.status;
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTransferLimit() {
        return this.transferLimit;
    }

    public final String getWithdrawableCash() {
        return this.withdrawableCash;
    }

    public final String getUngrantedInstant() {
        return this.ungrantedInstant;
    }

    public final boolean getHasWithdrawalFee() {
        return this.hasWithdrawalFee;
    }
}
