package com.robinhood.android.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import rosetta.account.BrokerageAccountType;

/* compiled from: RecurringOrderConfiguration.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001bB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB/\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b6\u00104J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u0010,J\u0010\u00108\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b;\u0010,J\u0012\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J¸\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bB\u0010?J\u0010\u0010C\u001a\u00020 HÖ\u0001¢\u0006\u0004\bC\u0010&J\u001a\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bV\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bW\u00104R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bX\u0010,R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bY\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\b[\u0010:R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\b\\\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u0010?R\u0011\u0010a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\ba\u0010,¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/recurring/models/AmountType;", "amountType", "", "wasAmountTypePreselected", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "Ljava/util/UUID;", "achRelationshipId", "backupAchRelationshipId", "directDepositRelationshipId", "showToolbarAction", "reviewOnly", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "paycheckRecurringBrokerageCashStatus", "fromPaycheckRecurringInvocation", "Lrosetta/account/BrokerageAccountType;", "accountType", "", "accountNumber", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/AmountType;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;ZZLcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;ZLrosetta/account/BrokerageAccountType;Ljava/lang/String;)V", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/util/Money;", "component2", "()Lcom/robinhood/recurring/models/AmountType;", "component3", "()Z", "component4", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component5", "()Lj$/time/LocalDate;", "component6", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "component7", "()Ljava/util/UUID;", "component8", "component9", "component10", "component11", "component12", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "component13", "component14", "()Lrosetta/account/BrokerageAccountType;", "component15", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/AmountType;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;ZZLcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;ZLrosetta/account/BrokerageAccountType;Ljava/lang/String;)Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/util/Money;", "getAmount", "Lcom/robinhood/recurring/models/AmountType;", "getAmountType", "Z", "getWasAmountTypePreselected", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getSourceOfFunds", "Ljava/util/UUID;", "getAchRelationshipId", "getBackupAchRelationshipId", "getDirectDepositRelationshipId", "getShowToolbarAction", "getReviewOnly", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "getPaycheckRecurringBrokerageCashStatus", "getFromPaycheckRecurringInvocation", "Lrosetta/account/BrokerageAccountType;", "getAccountType", "Ljava/lang/String;", "getAccountNumber", "isBackupAchEnabled", "PaycheckRecurringBrokerageCashStatus", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecurringOrderConfiguration implements Parcelable {
    public static final Parcelable.Creator<RecurringOrderConfiguration> CREATOR = new Creator();
    private final String accountNumber;
    private final BrokerageAccountType accountType;
    private final UUID achRelationshipId;
    private final Money amount;
    private final AmountType amountType;
    private final UUID backupAchRelationshipId;
    private final UUID directDepositRelationshipId;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final boolean fromPaycheckRecurringInvocation;
    private final PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus;
    private final boolean reviewOnly;
    private final boolean showToolbarAction;
    private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
    private final LocalDate startDate;
    private final boolean wasAmountTypePreselected;

    /* compiled from: RecurringOrderConfiguration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringOrderConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderConfiguration createFromParcel(Parcel parcel) {
            boolean z;
            BrokerageAccountType brokerageAccountTypeValueOf;
            ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
            UUID uuid;
            boolean z2;
            boolean z3;
            ApiInvestmentSchedule.Frequency frequency;
            LocalDate localDate;
            UUID uuid2;
            UUID uuid3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Money money = (Money) parcel.readParcelable(RecurringOrderConfiguration.class.getClassLoader());
            AmountType amountTypeValueOf = AmountType.valueOf(parcel.readString());
            boolean z5 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            ApiInvestmentSchedule.Frequency frequencyValueOf = parcel.readInt() == 0 ? null : ApiInvestmentSchedule.Frequency.valueOf(parcel.readString());
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            ApiInvestmentSchedule.SourceOfFunds sourceOfFundsValueOf = ApiInvestmentSchedule.SourceOfFunds.valueOf(parcel.readString());
            UUID uuid4 = (UUID) parcel.readSerializable();
            UUID uuid5 = (UUID) parcel.readSerializable();
            UUID uuid6 = (UUID) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                brokerageAccountTypeValueOf = null;
                sourceOfFunds = sourceOfFundsValueOf;
                uuid = uuid5;
                z2 = true;
            } else {
                brokerageAccountTypeValueOf = null;
                sourceOfFunds = sourceOfFundsValueOf;
                uuid = uuid5;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                frequency = frequencyValueOf;
                localDate = localDate2;
                uuid2 = uuid4;
                uuid3 = uuid6;
                z4 = true;
            } else {
                z3 = true;
                frequency = frequencyValueOf;
                localDate = localDate2;
                uuid2 = uuid4;
                uuid3 = uuid6;
                z4 = z;
            }
            PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = (PaycheckRecurringBrokerageCashStatus) (parcel.readInt() == 0 ? brokerageAccountTypeValueOf : PaycheckRecurringBrokerageCashStatus.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
            }
            return new RecurringOrderConfiguration(money, amountTypeValueOf, z5, frequency, localDate, sourceOfFunds, uuid2, uuid, uuid3, z2, z4, paycheckRecurringBrokerageCashStatus, z3, brokerageAccountTypeValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderConfiguration[] newArray(int i) {
            return new RecurringOrderConfiguration[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowToolbarAction() {
        return this.showToolbarAction;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getReviewOnly() {
        return this.reviewOnly;
    }

    /* renamed from: component12, reason: from getter */
    public final PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
        return this.paycheckRecurringBrokerageCashStatus;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getFromPaycheckRecurringInvocation() {
        return this.fromPaycheckRecurringInvocation;
    }

    /* renamed from: component14, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final AmountType getAmountType() {
        return this.amountType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWasAmountTypePreselected() {
        return this.wasAmountTypePreselected;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    /* renamed from: component8, reason: from getter */
    public final UUID getBackupAchRelationshipId() {
        return this.backupAchRelationshipId;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getDirectDepositRelationshipId() {
        return this.directDepositRelationshipId;
    }

    public final RecurringOrderConfiguration copy(Money amount, AmountType amountType, boolean wasAmountTypePreselected, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, UUID backupAchRelationshipId, UUID directDepositRelationshipId, boolean showToolbarAction, boolean reviewOnly, PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean fromPaycheckRecurringInvocation, BrokerageAccountType accountType, String accountNumber) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        return new RecurringOrderConfiguration(amount, amountType, wasAmountTypePreselected, frequency, startDate, sourceOfFunds, achRelationshipId, backupAchRelationshipId, directDepositRelationshipId, showToolbarAction, reviewOnly, paycheckRecurringBrokerageCashStatus, fromPaycheckRecurringInvocation, accountType, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderConfiguration)) {
            return false;
        }
        RecurringOrderConfiguration recurringOrderConfiguration = (RecurringOrderConfiguration) other;
        return Intrinsics.areEqual(this.amount, recurringOrderConfiguration.amount) && this.amountType == recurringOrderConfiguration.amountType && this.wasAmountTypePreselected == recurringOrderConfiguration.wasAmountTypePreselected && this.frequency == recurringOrderConfiguration.frequency && Intrinsics.areEqual(this.startDate, recurringOrderConfiguration.startDate) && this.sourceOfFunds == recurringOrderConfiguration.sourceOfFunds && Intrinsics.areEqual(this.achRelationshipId, recurringOrderConfiguration.achRelationshipId) && Intrinsics.areEqual(this.backupAchRelationshipId, recurringOrderConfiguration.backupAchRelationshipId) && Intrinsics.areEqual(this.directDepositRelationshipId, recurringOrderConfiguration.directDepositRelationshipId) && this.showToolbarAction == recurringOrderConfiguration.showToolbarAction && this.reviewOnly == recurringOrderConfiguration.reviewOnly && Intrinsics.areEqual(this.paycheckRecurringBrokerageCashStatus, recurringOrderConfiguration.paycheckRecurringBrokerageCashStatus) && this.fromPaycheckRecurringInvocation == recurringOrderConfiguration.fromPaycheckRecurringInvocation && this.accountType == recurringOrderConfiguration.accountType && Intrinsics.areEqual(this.accountNumber, recurringOrderConfiguration.accountNumber);
    }

    public int hashCode() {
        Money money = this.amount;
        int iHashCode = (((((money == null ? 0 : money.hashCode()) * 31) + this.amountType.hashCode()) * 31) + Boolean.hashCode(this.wasAmountTypePreselected)) * 31;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        int iHashCode2 = (iHashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode3 = (((iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.sourceOfFunds.hashCode()) * 31;
        UUID uuid = this.achRelationshipId;
        int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.backupAchRelationshipId;
        int iHashCode5 = (iHashCode4 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.directDepositRelationshipId;
        int iHashCode6 = (((((iHashCode5 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31) + Boolean.hashCode(this.showToolbarAction)) * 31) + Boolean.hashCode(this.reviewOnly)) * 31;
        PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = this.paycheckRecurringBrokerageCashStatus;
        int iHashCode7 = (((iHashCode6 + (paycheckRecurringBrokerageCashStatus == null ? 0 : paycheckRecurringBrokerageCashStatus.hashCode())) * 31) + Boolean.hashCode(this.fromPaycheckRecurringInvocation)) * 31;
        BrokerageAccountType brokerageAccountType = this.accountType;
        int iHashCode8 = (iHashCode7 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        String str = this.accountNumber;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RecurringOrderConfiguration(amount=" + this.amount + ", amountType=" + this.amountType + ", wasAmountTypePreselected=" + this.wasAmountTypePreselected + ", frequency=" + this.frequency + ", startDate=" + this.startDate + ", sourceOfFunds=" + this.sourceOfFunds + ", achRelationshipId=" + this.achRelationshipId + ", backupAchRelationshipId=" + this.backupAchRelationshipId + ", directDepositRelationshipId=" + this.directDepositRelationshipId + ", showToolbarAction=" + this.showToolbarAction + ", reviewOnly=" + this.reviewOnly + ", paycheckRecurringBrokerageCashStatus=" + this.paycheckRecurringBrokerageCashStatus + ", fromPaycheckRecurringInvocation=" + this.fromPaycheckRecurringInvocation + ", accountType=" + this.accountType + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.amount, flags);
        dest.writeString(this.amountType.name());
        dest.writeInt(this.wasAmountTypePreselected ? 1 : 0);
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(frequency.name());
        }
        dest.writeSerializable(this.startDate);
        dest.writeString(this.sourceOfFunds.name());
        dest.writeSerializable(this.achRelationshipId);
        dest.writeSerializable(this.backupAchRelationshipId);
        dest.writeSerializable(this.directDepositRelationshipId);
        dest.writeInt(this.showToolbarAction ? 1 : 0);
        dest.writeInt(this.reviewOnly ? 1 : 0);
        PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = this.paycheckRecurringBrokerageCashStatus;
        if (paycheckRecurringBrokerageCashStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paycheckRecurringBrokerageCashStatus.writeToParcel(dest, flags);
        }
        dest.writeInt(this.fromPaycheckRecurringInvocation ? 1 : 0);
        BrokerageAccountType brokerageAccountType = this.accountType;
        if (brokerageAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(brokerageAccountType.name());
        }
        dest.writeString(this.accountNumber);
    }

    public RecurringOrderConfiguration(Money money, AmountType amountType, boolean z, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, UUID uuid2, UUID uuid3, boolean z2, boolean z3, PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z4, BrokerageAccountType brokerageAccountType, String str) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        this.amount = money;
        this.amountType = amountType;
        this.wasAmountTypePreselected = z;
        this.frequency = frequency;
        this.startDate = localDate;
        this.sourceOfFunds = sourceOfFunds;
        this.achRelationshipId = uuid;
        this.backupAchRelationshipId = uuid2;
        this.directDepositRelationshipId = uuid3;
        this.showToolbarAction = z2;
        this.reviewOnly = z3;
        this.paycheckRecurringBrokerageCashStatus = paycheckRecurringBrokerageCashStatus;
        this.fromPaycheckRecurringInvocation = z4;
        this.accountType = brokerageAccountType;
        this.accountNumber = str;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public /* synthetic */ RecurringOrderConfiguration(Money money, AmountType amountType, boolean z, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, UUID uuid2, UUID uuid3, boolean z2, boolean z3, PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z4, BrokerageAccountType brokerageAccountType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? AmountType.DOLLAR : amountType, (i & 4) != 0 ? false : z, frequency, localDate, sourceOfFunds, uuid, uuid2, (i & 256) != 0 ? null : uuid3, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : paycheckRecurringBrokerageCashStatus, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? null : brokerageAccountType, str);
    }

    public final AmountType getAmountType() {
        return this.amountType;
    }

    public final boolean getWasAmountTypePreselected() {
        return this.wasAmountTypePreselected;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    public final UUID getBackupAchRelationshipId() {
        return this.backupAchRelationshipId;
    }

    public final UUID getDirectDepositRelationshipId() {
        return this.directDepositRelationshipId;
    }

    public final boolean getShowToolbarAction() {
        return this.showToolbarAction;
    }

    public final boolean getReviewOnly() {
        return this.reviewOnly;
    }

    public final PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
        return this.paycheckRecurringBrokerageCashStatus;
    }

    public final boolean getFromPaycheckRecurringInvocation() {
        return this.fromPaycheckRecurringInvocation;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ RecurringOrderConfiguration(ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frequency, localDate, (i & 4) != 0 ? true : z, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecurringOrderConfiguration(ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z, String accountNumber) {
        this(null, AmountType.DOLLAR, false, frequency, localDate, ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER, null, null, null, z, false, null, false, null, accountNumber, 15620, null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    public final boolean isBackupAchEnabled() {
        return this.backupAchRelationshipId != null;
    }

    /* compiled from: RecurringOrderConfiguration.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "Landroid/os/Parcelable;", "sweepEnabled", "", "sweepEligible", "<init>", "(ZZ)V", "getSweepEnabled", "()Z", "getSweepEligible", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PaycheckRecurringBrokerageCashStatus implements Parcelable {
        public static final Parcelable.Creator<PaycheckRecurringBrokerageCashStatus> CREATOR = new Creator();
        private final boolean sweepEligible;
        private final boolean sweepEnabled;

        /* compiled from: RecurringOrderConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaycheckRecurringBrokerageCashStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckRecurringBrokerageCashStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaycheckRecurringBrokerageCashStatus(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckRecurringBrokerageCashStatus[] newArray(int i) {
                return new PaycheckRecurringBrokerageCashStatus[i];
            }
        }

        public static /* synthetic */ PaycheckRecurringBrokerageCashStatus copy$default(PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = paycheckRecurringBrokerageCashStatus.sweepEnabled;
            }
            if ((i & 2) != 0) {
                z2 = paycheckRecurringBrokerageCashStatus.sweepEligible;
            }
            return paycheckRecurringBrokerageCashStatus.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSweepEnabled() {
            return this.sweepEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSweepEligible() {
            return this.sweepEligible;
        }

        public final PaycheckRecurringBrokerageCashStatus copy(boolean sweepEnabled, boolean sweepEligible) {
            return new PaycheckRecurringBrokerageCashStatus(sweepEnabled, sweepEligible);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaycheckRecurringBrokerageCashStatus)) {
                return false;
            }
            PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = (PaycheckRecurringBrokerageCashStatus) other;
            return this.sweepEnabled == paycheckRecurringBrokerageCashStatus.sweepEnabled && this.sweepEligible == paycheckRecurringBrokerageCashStatus.sweepEligible;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.sweepEnabled) * 31) + Boolean.hashCode(this.sweepEligible);
        }

        public String toString() {
            return "PaycheckRecurringBrokerageCashStatus(sweepEnabled=" + this.sweepEnabled + ", sweepEligible=" + this.sweepEligible + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.sweepEnabled ? 1 : 0);
            dest.writeInt(this.sweepEligible ? 1 : 0);
        }

        public PaycheckRecurringBrokerageCashStatus(boolean z, boolean z2) {
            this.sweepEnabled = z;
            this.sweepEligible = z2;
        }

        public final boolean getSweepEnabled() {
            return this.sweepEnabled;
        }

        public final boolean getSweepEligible() {
            return this.sweepEligible;
        }
    }
}
