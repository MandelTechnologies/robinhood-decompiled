package com.robinhood.android.common.recurring.amount.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountTypeArgs.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeArgs;", "Landroid/os/Parcelable;", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "directDepositRelationshipId", "Ljava/util/UUID;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "existingSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;ZLcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Ljava/util/List;)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "()Z", "getActionType", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "getDirectDepositRelationshipId", "()Ljava/util/UUID;", "getLoggingSource", "()Ljava/lang/String;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getExistingSchedules", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderAmountTypeArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringOrderAmountTypeArgs> CREATOR = new Creator();
    private final RecurringOrderActionType actionType;
    private final ApiAssetType assetType;
    private final UUID directDepositRelationshipId;
    private final List<UiPaycheckInvestmentSchedule> existingSchedules;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final boolean isBrokerageCashTransfer;
    private final String loggingSource;

    /* compiled from: RecurringOrderAmountTypeArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringOrderAmountTypeArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderAmountTypeArgs createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ApiAssetType apiAssetTypeValueOf = ApiAssetType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            RecurringOrderActionType recurringOrderActionType = (RecurringOrderActionType) parcel.readParcelable(RecurringOrderAmountTypeArgs.class.getClassLoader());
            UUID uuid = (UUID) parcel.readSerializable();
            String string2 = parcel.readString();
            ApiInvestmentSchedule.Frequency frequencyValueOf = ApiInvestmentSchedule.Frequency.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(RecurringOrderAmountTypeArgs.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new RecurringOrderAmountTypeArgs(apiAssetTypeValueOf, z, recurringOrderActionType, uuid, string2, frequencyValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderAmountTypeArgs[] newArray(int i) {
            return new RecurringOrderAmountTypeArgs[i];
        }
    }

    public static /* synthetic */ RecurringOrderAmountTypeArgs copy$default(RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs, ApiAssetType apiAssetType, boolean z, RecurringOrderActionType recurringOrderActionType, UUID uuid, String str, ApiInvestmentSchedule.Frequency frequency, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = recurringOrderAmountTypeArgs.assetType;
        }
        if ((i & 2) != 0) {
            z = recurringOrderAmountTypeArgs.isBrokerageCashTransfer;
        }
        if ((i & 4) != 0) {
            recurringOrderActionType = recurringOrderAmountTypeArgs.actionType;
        }
        if ((i & 8) != 0) {
            uuid = recurringOrderAmountTypeArgs.directDepositRelationshipId;
        }
        if ((i & 16) != 0) {
            str = recurringOrderAmountTypeArgs.loggingSource;
        }
        if ((i & 32) != 0) {
            frequency = recurringOrderAmountTypeArgs.frequency;
        }
        if ((i & 64) != 0) {
            list = recurringOrderAmountTypeArgs.existingSchedules;
        }
        ApiInvestmentSchedule.Frequency frequency2 = frequency;
        List list2 = list;
        String str2 = str;
        RecurringOrderActionType recurringOrderActionType2 = recurringOrderActionType;
        return recurringOrderAmountTypeArgs.copy(apiAssetType, z, recurringOrderActionType2, uuid, str2, frequency2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBrokerageCashTransfer() {
        return this.isBrokerageCashTransfer;
    }

    /* renamed from: component3, reason: from getter */
    public final RecurringOrderActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getDirectDepositRelationshipId() {
        return this.directDepositRelationshipId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final List<UiPaycheckInvestmentSchedule> component7() {
        return this.existingSchedules;
    }

    public final RecurringOrderAmountTypeArgs copy(ApiAssetType assetType, boolean isBrokerageCashTransfer, RecurringOrderActionType actionType, UUID directDepositRelationshipId, String loggingSource, ApiInvestmentSchedule.Frequency frequency, List<UiPaycheckInvestmentSchedule> existingSchedules) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new RecurringOrderAmountTypeArgs(assetType, isBrokerageCashTransfer, actionType, directDepositRelationshipId, loggingSource, frequency, existingSchedules);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderAmountTypeArgs)) {
            return false;
        }
        RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs = (RecurringOrderAmountTypeArgs) other;
        return this.assetType == recurringOrderAmountTypeArgs.assetType && this.isBrokerageCashTransfer == recurringOrderAmountTypeArgs.isBrokerageCashTransfer && Intrinsics.areEqual(this.actionType, recurringOrderAmountTypeArgs.actionType) && Intrinsics.areEqual(this.directDepositRelationshipId, recurringOrderAmountTypeArgs.directDepositRelationshipId) && Intrinsics.areEqual(this.loggingSource, recurringOrderAmountTypeArgs.loggingSource) && this.frequency == recurringOrderAmountTypeArgs.frequency && Intrinsics.areEqual(this.existingSchedules, recurringOrderAmountTypeArgs.existingSchedules);
    }

    public int hashCode() {
        int iHashCode = ((((this.assetType.hashCode() * 31) + Boolean.hashCode(this.isBrokerageCashTransfer)) * 31) + this.actionType.hashCode()) * 31;
        UUID uuid = this.directDepositRelationshipId;
        int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.loggingSource.hashCode()) * 31) + this.frequency.hashCode()) * 31;
        List<UiPaycheckInvestmentSchedule> list = this.existingSchedules;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "RecurringOrderAmountTypeArgs(assetType=" + this.assetType + ", isBrokerageCashTransfer=" + this.isBrokerageCashTransfer + ", actionType=" + this.actionType + ", directDepositRelationshipId=" + this.directDepositRelationshipId + ", loggingSource=" + this.loggingSource + ", frequency=" + this.frequency + ", existingSchedules=" + this.existingSchedules + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetType.name());
        dest.writeInt(this.isBrokerageCashTransfer ? 1 : 0);
        dest.writeParcelable(this.actionType, flags);
        dest.writeSerializable(this.directDepositRelationshipId);
        dest.writeString(this.loggingSource);
        dest.writeString(this.frequency.name());
        List<UiPaycheckInvestmentSchedule> list = this.existingSchedules;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<UiPaycheckInvestmentSchedule> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public RecurringOrderAmountTypeArgs(ApiAssetType assetType, boolean z, RecurringOrderActionType actionType, UUID uuid, String loggingSource, ApiInvestmentSchedule.Frequency frequency, List<UiPaycheckInvestmentSchedule> list) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.assetType = assetType;
        this.isBrokerageCashTransfer = z;
        this.actionType = actionType;
        this.directDepositRelationshipId = uuid;
        this.loggingSource = loggingSource;
        this.frequency = frequency;
        this.existingSchedules = list;
    }

    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    public final boolean isBrokerageCashTransfer() {
        return this.isBrokerageCashTransfer;
    }

    public final RecurringOrderActionType getActionType() {
        return this.actionType;
    }

    public final UUID getDirectDepositRelationshipId() {
        return this.directDepositRelationshipId;
    }

    public /* synthetic */ RecurringOrderAmountTypeArgs(ApiAssetType apiAssetType, boolean z, RecurringOrderActionType recurringOrderActionType, UUID uuid, String str, ApiInvestmentSchedule.Frequency frequency, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiAssetType, z, recurringOrderActionType, uuid, (i & 16) != 0 ? "" : str, frequency, (i & 64) != 0 ? null : list);
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final List<UiPaycheckInvestmentSchedule> getExistingSchedules() {
        return this.existingSchedules;
    }
}
