package com.robinhood.shared.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringTradeIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "UpdateFrequency", "UpdateAmount", "CreateRecurringTrade", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$CreateRecurringTrade;", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$UpdateAmount;", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$UpdateFrequency;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface RecurringTradeIntentKey extends IntentKey, Parcelable {

    /* compiled from: RecurringTradeIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(RecurringTradeIntentKey recurringTradeIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(recurringTradeIntentKey);
        }
    }

    /* compiled from: RecurringTradeIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0017¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$UpdateFrequency;", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey;", "Ljava/util/UUID;", "investmentScheduleId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "selectedFrequency", "j$/time/LocalDate", "nextInvestmentDate", "", "openDatePickerOnFirstOpen", "currencyPairId", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;ZLjava/util/UUID;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component3", "()Lj$/time/LocalDate;", "component4", "()Z", "component5", "copy", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;ZLjava/util/UUID;)Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$UpdateFrequency;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInvestmentScheduleId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getSelectedFrequency", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Z", "getOpenDatePickerOnFirstOpen", "getCurrencyPairId", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateFrequency implements RecurringTradeIntentKey {
        public static final Parcelable.Creator<UpdateFrequency> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final UUID investmentScheduleId;
        private final LocalDate nextInvestmentDate;
        private final boolean openDatePickerOnFirstOpen;
        private final ApiInvestmentSchedule.Frequency selectedFrequency;

        /* compiled from: RecurringTradeIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateFrequency> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateFrequency createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateFrequency((UUID) parcel.readSerializable(), ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateFrequency[] newArray(int i) {
                return new UpdateFrequency[i];
            }
        }

        public static /* synthetic */ UpdateFrequency copy$default(UpdateFrequency updateFrequency, UUID uuid, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = updateFrequency.investmentScheduleId;
            }
            if ((i & 2) != 0) {
                frequency = updateFrequency.selectedFrequency;
            }
            if ((i & 4) != 0) {
                localDate = updateFrequency.nextInvestmentDate;
            }
            if ((i & 8) != 0) {
                z = updateFrequency.openDatePickerOnFirstOpen;
            }
            if ((i & 16) != 0) {
                uuid2 = updateFrequency.currencyPairId;
            }
            UUID uuid3 = uuid2;
            LocalDate localDate2 = localDate;
            return updateFrequency.copy(uuid, frequency, localDate2, z, uuid3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getNextInvestmentDate() {
            return this.nextInvestmentDate;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getOpenDatePickerOnFirstOpen() {
            return this.openDatePickerOnFirstOpen;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UpdateFrequency copy(UUID investmentScheduleId, ApiInvestmentSchedule.Frequency selectedFrequency, LocalDate nextInvestmentDate, boolean openDatePickerOnFirstOpen, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
            Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new UpdateFrequency(investmentScheduleId, selectedFrequency, nextInvestmentDate, openDatePickerOnFirstOpen, currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateFrequency)) {
                return false;
            }
            UpdateFrequency updateFrequency = (UpdateFrequency) other;
            return Intrinsics.areEqual(this.investmentScheduleId, updateFrequency.investmentScheduleId) && this.selectedFrequency == updateFrequency.selectedFrequency && Intrinsics.areEqual(this.nextInvestmentDate, updateFrequency.nextInvestmentDate) && this.openDatePickerOnFirstOpen == updateFrequency.openDatePickerOnFirstOpen && Intrinsics.areEqual(this.currencyPairId, updateFrequency.currencyPairId);
        }

        public int hashCode() {
            return (((((((this.investmentScheduleId.hashCode() * 31) + this.selectedFrequency.hashCode()) * 31) + this.nextInvestmentDate.hashCode()) * 31) + Boolean.hashCode(this.openDatePickerOnFirstOpen)) * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "UpdateFrequency(investmentScheduleId=" + this.investmentScheduleId + ", selectedFrequency=" + this.selectedFrequency + ", nextInvestmentDate=" + this.nextInvestmentDate + ", openDatePickerOnFirstOpen=" + this.openDatePickerOnFirstOpen + ", currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.investmentScheduleId);
            dest.writeString(this.selectedFrequency.name());
            dest.writeSerializable(this.nextInvestmentDate);
            dest.writeInt(this.openDatePickerOnFirstOpen ? 1 : 0);
            dest.writeSerializable(this.currencyPairId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public UpdateFrequency(UUID investmentScheduleId, ApiInvestmentSchedule.Frequency selectedFrequency, LocalDate nextInvestmentDate, boolean z, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
            Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.investmentScheduleId = investmentScheduleId;
            this.selectedFrequency = selectedFrequency;
            this.nextInvestmentDate = nextInvestmentDate;
            this.openDatePickerOnFirstOpen = z;
            this.currencyPairId = currencyPairId;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        public final ApiInvestmentSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        public final LocalDate getNextInvestmentDate() {
            return this.nextInvestmentDate;
        }

        public final boolean getOpenDatePickerOnFirstOpen() {
            return this.openDatePickerOnFirstOpen;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }

    /* compiled from: RecurringTradeIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$UpdateAmount;", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey;", "investmentScheduleId", "Ljava/util/UUID;", "selectedFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "buyingPowerAmount", "Lcom/robinhood/models/util/Money;", "currencyPairId", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/models/util/Money;Ljava/util/UUID;)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "getSelectedFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getBuyingPowerAmount", "()Lcom/robinhood/models/util/Money;", "getCurrencyPairId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateAmount implements RecurringTradeIntentKey {
        public static final Parcelable.Creator<UpdateAmount> CREATOR = new Creator();
        private final Money buyingPowerAmount;
        private final UUID currencyPairId;
        private final UUID investmentScheduleId;
        private final ApiInvestmentSchedule.Frequency selectedFrequency;

        /* compiled from: RecurringTradeIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateAmount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateAmount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateAmount((UUID) parcel.readSerializable(), ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (Money) parcel.readParcelable(UpdateAmount.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateAmount[] newArray(int i) {
                return new UpdateAmount[i];
            }
        }

        public static /* synthetic */ UpdateAmount copy$default(UpdateAmount updateAmount, UUID uuid, ApiInvestmentSchedule.Frequency frequency, Money money, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = updateAmount.investmentScheduleId;
            }
            if ((i & 2) != 0) {
                frequency = updateAmount.selectedFrequency;
            }
            if ((i & 4) != 0) {
                money = updateAmount.buyingPowerAmount;
            }
            if ((i & 8) != 0) {
                uuid2 = updateAmount.currencyPairId;
            }
            return updateAmount.copy(uuid, frequency, money, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getBuyingPowerAmount() {
            return this.buyingPowerAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UpdateAmount copy(UUID investmentScheduleId, ApiInvestmentSchedule.Frequency selectedFrequency, Money buyingPowerAmount, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
            Intrinsics.checkNotNullParameter(buyingPowerAmount, "buyingPowerAmount");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new UpdateAmount(investmentScheduleId, selectedFrequency, buyingPowerAmount, currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateAmount)) {
                return false;
            }
            UpdateAmount updateAmount = (UpdateAmount) other;
            return Intrinsics.areEqual(this.investmentScheduleId, updateAmount.investmentScheduleId) && this.selectedFrequency == updateAmount.selectedFrequency && Intrinsics.areEqual(this.buyingPowerAmount, updateAmount.buyingPowerAmount) && Intrinsics.areEqual(this.currencyPairId, updateAmount.currencyPairId);
        }

        public int hashCode() {
            return (((((this.investmentScheduleId.hashCode() * 31) + this.selectedFrequency.hashCode()) * 31) + this.buyingPowerAmount.hashCode()) * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "UpdateAmount(investmentScheduleId=" + this.investmentScheduleId + ", selectedFrequency=" + this.selectedFrequency + ", buyingPowerAmount=" + this.buyingPowerAmount + ", currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.investmentScheduleId);
            dest.writeString(this.selectedFrequency.name());
            dest.writeParcelable(this.buyingPowerAmount, flags);
            dest.writeSerializable(this.currencyPairId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public UpdateAmount(UUID investmentScheduleId, ApiInvestmentSchedule.Frequency selectedFrequency, Money buyingPowerAmount, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
            Intrinsics.checkNotNullParameter(buyingPowerAmount, "buyingPowerAmount");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.investmentScheduleId = investmentScheduleId;
            this.selectedFrequency = selectedFrequency;
            this.buyingPowerAmount = buyingPowerAmount;
            this.currencyPairId = currencyPairId;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        public final ApiInvestmentSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        public final Money getBuyingPowerAmount() {
            return this.buyingPowerAmount;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }

    /* compiled from: RecurringTradeIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$CreateRecurringTrade;", "Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey;", "Ljava/util/UUID;", "currencyPairId", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "", "fromReview", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/util/Money;", "component3", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component4", "()Lj$/time/LocalDate;", "component5", "()Z", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Z)Lcom/robinhood/shared/recurring/contracts/RecurringTradeIntentKey$CreateRecurringTrade;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getCurrencyPairId", "Lcom/robinhood/models/util/Money;", "getAmount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "Z", "getFromReview", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateRecurringTrade implements RecurringTradeIntentKey {
        public static final Parcelable.Creator<CreateRecurringTrade> CREATOR = new Creator();
        private final Money amount;
        private final UUID currencyPairId;
        private final ApiInvestmentSchedule.Frequency frequency;
        private final boolean fromReview;
        private final LocalDate startDate;

        /* compiled from: RecurringTradeIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateRecurringTrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateRecurringTrade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateRecurringTrade((UUID) parcel.readSerializable(), (Money) parcel.readParcelable(CreateRecurringTrade.class.getClassLoader()), parcel.readInt() == 0 ? null : ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateRecurringTrade[] newArray(int i) {
                return new CreateRecurringTrade[i];
            }
        }

        public static /* synthetic */ CreateRecurringTrade copy$default(CreateRecurringTrade createRecurringTrade, UUID uuid, Money money, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = createRecurringTrade.currencyPairId;
            }
            if ((i & 2) != 0) {
                money = createRecurringTrade.amount;
            }
            if ((i & 4) != 0) {
                frequency = createRecurringTrade.frequency;
            }
            if ((i & 8) != 0) {
                localDate = createRecurringTrade.startDate;
            }
            if ((i & 16) != 0) {
                z = createRecurringTrade.fromReview;
            }
            boolean z2 = z;
            ApiInvestmentSchedule.Frequency frequency2 = frequency;
            return createRecurringTrade.copy(uuid, money, frequency2, localDate, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component4, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getFromReview() {
            return this.fromReview;
        }

        public final CreateRecurringTrade copy(UUID currencyPairId, Money amount, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, boolean fromReview) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new CreateRecurringTrade(currencyPairId, amount, frequency, startDate, fromReview);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateRecurringTrade)) {
                return false;
            }
            CreateRecurringTrade createRecurringTrade = (CreateRecurringTrade) other;
            return Intrinsics.areEqual(this.currencyPairId, createRecurringTrade.currencyPairId) && Intrinsics.areEqual(this.amount, createRecurringTrade.amount) && this.frequency == createRecurringTrade.frequency && Intrinsics.areEqual(this.startDate, createRecurringTrade.startDate) && this.fromReview == createRecurringTrade.fromReview;
        }

        public int hashCode() {
            int iHashCode = this.currencyPairId.hashCode() * 31;
            Money money = this.amount;
            int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            int iHashCode3 = (iHashCode2 + (frequency == null ? 0 : frequency.hashCode())) * 31;
            LocalDate localDate = this.startDate;
            return ((iHashCode3 + (localDate != null ? localDate.hashCode() : 0)) * 31) + Boolean.hashCode(this.fromReview);
        }

        public String toString() {
            return "CreateRecurringTrade(currencyPairId=" + this.currencyPairId + ", amount=" + this.amount + ", frequency=" + this.frequency + ", startDate=" + this.startDate + ", fromReview=" + this.fromReview + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeParcelable(this.amount, flags);
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(frequency.name());
            }
            dest.writeSerializable(this.startDate);
            dest.writeInt(this.fromReview ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public CreateRecurringTrade(UUID currencyPairId, Money money, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
            this.amount = money;
            this.frequency = frequency;
            this.startDate = localDate;
            this.fromReview = z;
        }

        public /* synthetic */ CreateRecurringTrade(UUID uuid, Money money, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : frequency, (i & 8) != 0 ? null : localDate, (i & 16) != 0 ? false : z);
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final boolean getFromReview() {
            return this.fromReview;
        }
    }
}
