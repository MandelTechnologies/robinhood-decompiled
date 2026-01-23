package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaymentMethodBottomSheetArgs.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheetArgs;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "isBackup", "", "isCrypto", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "showPaymentMethodAnnotation", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;ZZLcom/robinhood/rosetta/eventlogging/RecurringContext;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getPaymentMethod", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getShowPaymentMethodAnnotation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringPaymentMethodBottomSheetArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringPaymentMethodBottomSheetArgs> CREATOR = new Creator();
    private final AchRelationship achRelationship;
    private final UUID instrumentId;
    private final boolean isBackup;
    private final boolean isCrypto;
    private final RecurringContext loggingContext;
    private final ApiInvestmentSchedule.SourceOfFunds paymentMethod;
    private final boolean showPaymentMethodAnnotation;

    /* compiled from: RecurringPaymentMethodBottomSheetArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringPaymentMethodBottomSheetArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPaymentMethodBottomSheetArgs createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            RecurringContext recurringContext;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            ApiInvestmentSchedule.SourceOfFunds sourceOfFundsValueOf = parcel.readInt() == 0 ? null : ApiInvestmentSchedule.SourceOfFunds.valueOf(parcel.readString());
            AchRelationship achRelationship = (AchRelationship) parcel.readParcelable(RecurringPaymentMethodBottomSheetArgs.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            RecurringContext recurringContext2 = (RecurringContext) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = z2;
                recurringContext = recurringContext2;
            } else {
                recurringContext = recurringContext2;
                z3 = z;
            }
            return new RecurringPaymentMethodBottomSheetArgs(uuid, sourceOfFundsValueOf, achRelationship, z4, z5, recurringContext, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPaymentMethodBottomSheetArgs[] newArray(int i) {
            return new RecurringPaymentMethodBottomSheetArgs[i];
        }
    }

    public static /* synthetic */ RecurringPaymentMethodBottomSheetArgs copy$default(RecurringPaymentMethodBottomSheetArgs recurringPaymentMethodBottomSheetArgs, UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, boolean z, boolean z2, RecurringContext recurringContext, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recurringPaymentMethodBottomSheetArgs.instrumentId;
        }
        if ((i & 2) != 0) {
            sourceOfFunds = recurringPaymentMethodBottomSheetArgs.paymentMethod;
        }
        if ((i & 4) != 0) {
            achRelationship = recurringPaymentMethodBottomSheetArgs.achRelationship;
        }
        if ((i & 8) != 0) {
            z = recurringPaymentMethodBottomSheetArgs.isBackup;
        }
        if ((i & 16) != 0) {
            z2 = recurringPaymentMethodBottomSheetArgs.isCrypto;
        }
        if ((i & 32) != 0) {
            recurringContext = recurringPaymentMethodBottomSheetArgs.loggingContext;
        }
        if ((i & 64) != 0) {
            z3 = recurringPaymentMethodBottomSheetArgs.showPaymentMethodAnnotation;
        }
        RecurringContext recurringContext2 = recurringContext;
        boolean z4 = z3;
        boolean z5 = z2;
        AchRelationship achRelationship2 = achRelationship;
        return recurringPaymentMethodBottomSheetArgs.copy(uuid, sourceOfFunds, achRelationship2, z, z5, recurringContext2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiInvestmentSchedule.SourceOfFunds getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBackup() {
        return this.isBackup;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component6, reason: from getter */
    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final RecurringPaymentMethodBottomSheetArgs copy(UUID instrumentId, ApiInvestmentSchedule.SourceOfFunds paymentMethod, AchRelationship achRelationship, boolean isBackup, boolean isCrypto, RecurringContext loggingContext, boolean showPaymentMethodAnnotation) {
        return new RecurringPaymentMethodBottomSheetArgs(instrumentId, paymentMethod, achRelationship, isBackup, isCrypto, loggingContext, showPaymentMethodAnnotation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentMethodBottomSheetArgs)) {
            return false;
        }
        RecurringPaymentMethodBottomSheetArgs recurringPaymentMethodBottomSheetArgs = (RecurringPaymentMethodBottomSheetArgs) other;
        return Intrinsics.areEqual(this.instrumentId, recurringPaymentMethodBottomSheetArgs.instrumentId) && this.paymentMethod == recurringPaymentMethodBottomSheetArgs.paymentMethod && Intrinsics.areEqual(this.achRelationship, recurringPaymentMethodBottomSheetArgs.achRelationship) && this.isBackup == recurringPaymentMethodBottomSheetArgs.isBackup && this.isCrypto == recurringPaymentMethodBottomSheetArgs.isCrypto && Intrinsics.areEqual(this.loggingContext, recurringPaymentMethodBottomSheetArgs.loggingContext) && this.showPaymentMethodAnnotation == recurringPaymentMethodBottomSheetArgs.showPaymentMethodAnnotation;
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.paymentMethod;
        int iHashCode2 = (iHashCode + (sourceOfFunds == null ? 0 : sourceOfFunds.hashCode())) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode3 = (((((iHashCode2 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31) + Boolean.hashCode(this.isBackup)) * 31) + Boolean.hashCode(this.isCrypto)) * 31;
        RecurringContext recurringContext = this.loggingContext;
        return ((iHashCode3 + (recurringContext != null ? recurringContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPaymentMethodAnnotation);
    }

    public String toString() {
        return "RecurringPaymentMethodBottomSheetArgs(instrumentId=" + this.instrumentId + ", paymentMethod=" + this.paymentMethod + ", achRelationship=" + this.achRelationship + ", isBackup=" + this.isBackup + ", isCrypto=" + this.isCrypto + ", loggingContext=" + this.loggingContext + ", showPaymentMethodAnnotation=" + this.showPaymentMethodAnnotation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = this.paymentMethod;
        if (sourceOfFunds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sourceOfFunds.name());
        }
        dest.writeParcelable(this.achRelationship, flags);
        dest.writeInt(this.isBackup ? 1 : 0);
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeSerializable(this.loggingContext);
        dest.writeInt(this.showPaymentMethodAnnotation ? 1 : 0);
    }

    public RecurringPaymentMethodBottomSheetArgs(UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, boolean z, boolean z2, RecurringContext recurringContext, boolean z3) {
        this.instrumentId = uuid;
        this.paymentMethod = sourceOfFunds;
        this.achRelationship = achRelationship;
        this.isBackup = z;
        this.isCrypto = z2;
        this.loggingContext = recurringContext;
        this.showPaymentMethodAnnotation = z3;
    }

    public /* synthetic */ RecurringPaymentMethodBottomSheetArgs(UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, boolean z, boolean z2, RecurringContext recurringContext, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, sourceOfFunds, (i & 4) != 0 ? null : achRelationship, z, z2, recurringContext, (i & 64) != 0 ? false : z3);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final ApiInvestmentSchedule.SourceOfFunds getPaymentMethod() {
        return this.paymentMethod;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final boolean isBackup() {
        return this.isBackup;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }
}
