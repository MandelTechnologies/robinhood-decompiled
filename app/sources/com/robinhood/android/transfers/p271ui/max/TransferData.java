package com.robinhood.android.transfers.p271ui.max;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferData.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/TransferData;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "iraContributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "iraDistributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "depositSuggestions", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/android/lib/transfers/AchTransferOption;Ljava/util/List;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getSourceAccount", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "getSinkAccount", "getIraContributionData", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "getIraDistributionData", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "getAchTransferOption", "()Lcom/robinhood/android/lib/transfers/AchTransferOption;", "getDepositSuggestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransferData> CREATOR = new Creator();
    private final AchTransferOption achTransferOption;
    private final BigDecimal amount;
    private final List<BigDecimal> depositSuggestions;
    private final ApiCreateTransferRequest2 frequency;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData;
    private final ApiCreateTransferRequest.ApiTransferAccount sinkAccount;
    private final ApiCreateTransferRequest.ApiTransferAccount sourceAccount;

    /* compiled from: TransferData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            ApiCreateTransferRequest2 apiCreateTransferRequest2ValueOf = ApiCreateTransferRequest2.valueOf(parcel.readString());
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = (ApiCreateTransferRequest.ApiTransferAccount) parcel.readParcelable(TransferData.class.getClassLoader());
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = (ApiCreateTransferRequest.ApiTransferAccount) parcel.readParcelable(TransferData.class.getClassLoader());
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = (ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData) parcel.readParcelable(TransferData.class.getClassLoader());
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = (ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData) parcel.readParcelable(TransferData.class.getClassLoader());
            ArrayList arrayList = null;
            AchTransferOption achTransferOptionValueOf = parcel.readInt() == 0 ? null : AchTransferOption.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new TransferData(bigDecimal, apiCreateTransferRequest2ValueOf, apiTransferAccount, apiTransferAccount2, iraContributionData, iraDistributionData, achTransferOptionValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferData[] newArray(int i) {
            return new TransferData[i];
        }
    }

    public static /* synthetic */ TransferData copy$default(TransferData transferData, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = transferData.amount;
        }
        if ((i & 2) != 0) {
            apiCreateTransferRequest2 = transferData.frequency;
        }
        if ((i & 4) != 0) {
            apiTransferAccount = transferData.sourceAccount;
        }
        if ((i & 8) != 0) {
            apiTransferAccount2 = transferData.sinkAccount;
        }
        if ((i & 16) != 0) {
            iraContributionData = transferData.iraContributionData;
        }
        if ((i & 32) != 0) {
            iraDistributionData = transferData.iraDistributionData;
        }
        if ((i & 64) != 0) {
            achTransferOption = transferData.achTransferOption;
        }
        if ((i & 128) != 0) {
            list = transferData.depositSuggestions;
        }
        AchTransferOption achTransferOption2 = achTransferOption;
        List list2 = list;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData2 = iraContributionData;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData2 = iraDistributionData;
        return transferData.copy(bigDecimal, apiCreateTransferRequest2, apiTransferAccount, apiTransferAccount2, iraContributionData2, iraDistributionData2, achTransferOption2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData getIraContributionData() {
        return this.iraContributionData;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    /* renamed from: component7, reason: from getter */
    public final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    public final List<BigDecimal> component8() {
        return this.depositSuggestions;
    }

    public final TransferData copy(BigDecimal amount, ApiCreateTransferRequest2 frequency, ApiCreateTransferRequest.ApiTransferAccount sourceAccount, ApiCreateTransferRequest.ApiTransferAccount sinkAccount, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List<? extends BigDecimal> depositSuggestions) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        return new TransferData(amount, frequency, sourceAccount, sinkAccount, iraContributionData, iraDistributionData, achTransferOption, depositSuggestions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) other;
        return Intrinsics.areEqual(this.amount, transferData.amount) && this.frequency == transferData.frequency && Intrinsics.areEqual(this.sourceAccount, transferData.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, transferData.sinkAccount) && Intrinsics.areEqual(this.iraContributionData, transferData.iraContributionData) && Intrinsics.areEqual(this.iraDistributionData, transferData.iraDistributionData) && this.achTransferOption == transferData.achTransferOption && Intrinsics.areEqual(this.depositSuggestions, transferData.depositSuggestions);
    }

    public int hashCode() {
        int iHashCode = ((((((this.amount.hashCode() * 31) + this.frequency.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode()) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = this.iraContributionData;
        int iHashCode2 = (iHashCode + (iraContributionData == null ? 0 : iraContributionData.hashCode())) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = this.iraDistributionData;
        int iHashCode3 = (iHashCode2 + (iraDistributionData == null ? 0 : iraDistributionData.hashCode())) * 31;
        AchTransferOption achTransferOption = this.achTransferOption;
        int iHashCode4 = (iHashCode3 + (achTransferOption == null ? 0 : achTransferOption.hashCode())) * 31;
        List<BigDecimal> list = this.depositSuggestions;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TransferData(amount=" + this.amount + ", frequency=" + this.frequency + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", iraContributionData=" + this.iraContributionData + ", iraDistributionData=" + this.iraDistributionData + ", achTransferOption=" + this.achTransferOption + ", depositSuggestions=" + this.depositSuggestions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.frequency.name());
        dest.writeParcelable(this.sourceAccount, flags);
        dest.writeParcelable(this.sinkAccount, flags);
        dest.writeParcelable(this.iraContributionData, flags);
        dest.writeParcelable(this.iraDistributionData, flags);
        AchTransferOption achTransferOption = this.achTransferOption;
        if (achTransferOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(achTransferOption.name());
        }
        List<BigDecimal> list = this.depositSuggestions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<BigDecimal> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferData(BigDecimal amount, ApiCreateTransferRequest2 frequency, ApiCreateTransferRequest.ApiTransferAccount sourceAccount, ApiCreateTransferRequest.ApiTransferAccount sinkAccount, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List<? extends BigDecimal> list) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        this.amount = amount;
        this.frequency = frequency;
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
        this.iraContributionData = iraContributionData;
        this.iraDistributionData = iraDistributionData;
        this.achTransferOption = achTransferOption;
        this.depositSuggestions = list;
    }

    public /* synthetic */ TransferData(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, apiCreateTransferRequest2, apiTransferAccount, apiTransferAccount2, iraContributionData, iraDistributionData, achTransferOption, (i & 128) != 0 ? null : list);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final ApiCreateTransferRequest.ApiTransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final ApiCreateTransferRequest.ApiTransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData getIraContributionData() {
        return this.iraContributionData;
    }

    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    public final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    public final List<BigDecimal> getDepositSuggestions() {
        return this.depositSuggestions;
    }
}
