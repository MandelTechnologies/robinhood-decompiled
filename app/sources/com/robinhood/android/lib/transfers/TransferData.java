package com.robinhood.android.lib.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: TransferData.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010DJÀ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bH\u0010;J\u0010\u0010I\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bI\u0010(J\u001a\u0010L\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bT\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010]\u001a\u0004\b^\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\b`\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\ba\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bc\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\be\u0010@R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010f\u001a\u0004\bg\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010DR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010h\u001a\u0004\b\u001d\u0010D¨\u0006j"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/TransferData;", "Landroid/os/Parcelable;", "Ljava/math/BigDecimal;", "amount", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "direction", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "fromAccount", "toAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "achTransferOption", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "iraDistributionData", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "", "promotionName", "promotionType", "j$/time/Year", "systemCalendarYear", "", "inRecurringIncludeDepositExperiment", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "iraRothConversionTransferInfo", "clawbackGracePeriodOptIn", "isFullWithdrawal", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/lib/transfers/AchTransferOption;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Lj$/time/Year;ZLcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/math/BigDecimal;", "component2", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "component3", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component4", "component5", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component6", "()Lcom/robinhood/android/lib/transfers/AchTransferOption;", "component7", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "component8", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "component9", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component10", "()Ljava/lang/String;", "component11", "component12", "()Lj$/time/Year;", "component13", "()Z", "component14", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "component15", "()Ljava/lang/Boolean;", "component16", "copy", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/lib/transfers/AchTransferOption;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Lj$/time/Year;ZLcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/android/lib/transfers/TransferData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getDirection", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getFromAccount", "getToAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "getAchTransferOption", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "getIraDistributionData", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getIraContribution", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Ljava/lang/String;", "getPromotionName", "getPromotionType", "Lj$/time/Year;", "getSystemCalendarYear", "Z", "getInRecurringIncludeDepositExperiment", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "getIraRothConversionTransferInfo", "Ljava/lang/Boolean;", "getClawbackGracePeriodOptIn", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransferData implements Parcelable {
    public static final Parcelable.Creator<TransferData> CREATOR = new Creator();
    private final AchTransferOption achTransferOption;
    private final BigDecimal amount;
    private final Boolean clawbackGracePeriodOptIn;
    private final TransferDirectionV2 direction;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiCreateTransferRequest2 frequency;
    private final TransferAccount fromAccount;
    private final boolean inRecurringIncludeDepositExperiment;
    private final IraContributionQuestionnaireResult.IraContribution iraContribution;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData;
    private final ApiRothConversionTransferInfo iraRothConversionTransferInfo;
    private final Boolean isFullWithdrawal;
    private final String promotionName;
    private final String promotionType;
    private final Year systemCalendarYear;
    private final TransferAccount toAccount;

    /* compiled from: TransferData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferData createFromParcel(Parcel parcel) {
            Boolean bool;
            Year year;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ApiRothConversionTransferInfo apiRothConversionTransferInfo;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            TransferDirectionV2 transferDirectionV2ValueOf = TransferDirectionV2.valueOf(parcel.readString());
            TransferAccount transferAccount = (TransferAccount) parcel.readParcelable(TransferData.class.getClassLoader());
            TransferAccount transferAccount2 = (TransferAccount) parcel.readParcelable(TransferData.class.getClassLoader());
            ApiCreateTransferRequest2 apiCreateTransferRequest2ValueOf = ApiCreateTransferRequest2.valueOf(parcel.readString());
            AchTransferOption achTransferOptionValueOf = parcel.readInt() == 0 ? null : AchTransferOption.valueOf(parcel.readString());
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = (ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData) parcel.readParcelable(TransferData.class.getClassLoader());
            IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) parcel.readParcelable(TransferData.class.getClassLoader());
            MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Year year2 = (Year) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                bool = null;
                year = year2;
                z = true;
            } else {
                bool = null;
                year = year2;
                z = false;
            }
            ApiRothConversionTransferInfo apiRothConversionTransferInfo2 = (ApiRothConversionTransferInfo) parcel.readParcelable(TransferData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = bool;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool;
                bool2 = boolValueOf;
                apiRothConversionTransferInfo = apiRothConversionTransferInfo2;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                apiRothConversionTransferInfo = apiRothConversionTransferInfo2;
                bool2 = boolValueOf;
            }
            return new TransferData(bigDecimal, transferDirectionV2ValueOf, transferAccount, transferAccount2, apiCreateTransferRequest2ValueOf, achTransferOptionValueOf, iraDistributionData, iraContribution, entryPointValueOf, string2, string3, year, z, apiRothConversionTransferInfo, bool2, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferData[] newArray(int i) {
            return new TransferData[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPromotionName() {
        return this.promotionName;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    /* renamed from: component12, reason: from getter */
    public final Year getSystemCalendarYear() {
        return this.systemCalendarYear;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getInRecurringIncludeDepositExperiment() {
        return this.inRecurringIncludeDepositExperiment;
    }

    /* renamed from: component14, reason: from getter */
    public final ApiRothConversionTransferInfo getIraRothConversionTransferInfo() {
        return this.iraRothConversionTransferInfo;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getClawbackGracePeriodOptIn() {
        return this.clawbackGracePeriodOptIn;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getIsFullWithdrawal() {
        return this.isFullWithdrawal;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component6, reason: from getter */
    public final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    /* renamed from: component8, reason: from getter */
    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    /* renamed from: component9, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final TransferData copy(BigDecimal amount, TransferDirectionV2 direction, TransferAccount fromAccount, TransferAccount toAccount, ApiCreateTransferRequest2 frequency, AchTransferOption achTransferOption, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, IraContributionQuestionnaireResult.IraContribution iraContribution, MAXTransferContext.EntryPoint entryPoint, String promotionName, String promotionType, Year systemCalendarYear, boolean inRecurringIncludeDepositExperiment, ApiRothConversionTransferInfo iraRothConversionTransferInfo, Boolean clawbackGracePeriodOptIn, Boolean isFullWithdrawal) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(fromAccount, "fromAccount");
        Intrinsics.checkNotNullParameter(toAccount, "toAccount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        return new TransferData(amount, direction, fromAccount, toAccount, frequency, achTransferOption, iraDistributionData, iraContribution, entryPoint, promotionName, promotionType, systemCalendarYear, inRecurringIncludeDepositExperiment, iraRothConversionTransferInfo, clawbackGracePeriodOptIn, isFullWithdrawal);
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
        return Intrinsics.areEqual(this.amount, transferData.amount) && this.direction == transferData.direction && Intrinsics.areEqual(this.fromAccount, transferData.fromAccount) && Intrinsics.areEqual(this.toAccount, transferData.toAccount) && this.frequency == transferData.frequency && this.achTransferOption == transferData.achTransferOption && Intrinsics.areEqual(this.iraDistributionData, transferData.iraDistributionData) && Intrinsics.areEqual(this.iraContribution, transferData.iraContribution) && this.entryPoint == transferData.entryPoint && Intrinsics.areEqual(this.promotionName, transferData.promotionName) && Intrinsics.areEqual(this.promotionType, transferData.promotionType) && Intrinsics.areEqual(this.systemCalendarYear, transferData.systemCalendarYear) && this.inRecurringIncludeDepositExperiment == transferData.inRecurringIncludeDepositExperiment && Intrinsics.areEqual(this.iraRothConversionTransferInfo, transferData.iraRothConversionTransferInfo) && Intrinsics.areEqual(this.clawbackGracePeriodOptIn, transferData.clawbackGracePeriodOptIn) && Intrinsics.areEqual(this.isFullWithdrawal, transferData.isFullWithdrawal);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.amount.hashCode() * 31) + this.direction.hashCode()) * 31) + this.fromAccount.hashCode()) * 31) + this.toAccount.hashCode()) * 31) + this.frequency.hashCode()) * 31;
        AchTransferOption achTransferOption = this.achTransferOption;
        int iHashCode2 = (iHashCode + (achTransferOption == null ? 0 : achTransferOption.hashCode())) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = this.iraDistributionData;
        int iHashCode3 = (iHashCode2 + (iraDistributionData == null ? 0 : iraDistributionData.hashCode())) * 31;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        int iHashCode4 = (((iHashCode3 + (iraContribution == null ? 0 : iraContribution.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
        String str = this.promotionName;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promotionType;
        int iHashCode6 = (((((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.systemCalendarYear.hashCode()) * 31) + Boolean.hashCode(this.inRecurringIncludeDepositExperiment)) * 31;
        ApiRothConversionTransferInfo apiRothConversionTransferInfo = this.iraRothConversionTransferInfo;
        int iHashCode7 = (iHashCode6 + (apiRothConversionTransferInfo == null ? 0 : apiRothConversionTransferInfo.hashCode())) * 31;
        Boolean bool = this.clawbackGracePeriodOptIn;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFullWithdrawal;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "TransferData(amount=" + this.amount + ", direction=" + this.direction + ", fromAccount=" + this.fromAccount + ", toAccount=" + this.toAccount + ", frequency=" + this.frequency + ", achTransferOption=" + this.achTransferOption + ", iraDistributionData=" + this.iraDistributionData + ", iraContribution=" + this.iraContribution + ", entryPoint=" + this.entryPoint + ", promotionName=" + this.promotionName + ", promotionType=" + this.promotionType + ", systemCalendarYear=" + this.systemCalendarYear + ", inRecurringIncludeDepositExperiment=" + this.inRecurringIncludeDepositExperiment + ", iraRothConversionTransferInfo=" + this.iraRothConversionTransferInfo + ", clawbackGracePeriodOptIn=" + this.clawbackGracePeriodOptIn + ", isFullWithdrawal=" + this.isFullWithdrawal + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.direction.name());
        dest.writeParcelable(this.fromAccount, flags);
        dest.writeParcelable(this.toAccount, flags);
        dest.writeString(this.frequency.name());
        AchTransferOption achTransferOption = this.achTransferOption;
        if (achTransferOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(achTransferOption.name());
        }
        dest.writeParcelable(this.iraDistributionData, flags);
        dest.writeParcelable(this.iraContribution, flags);
        dest.writeString(this.entryPoint.name());
        dest.writeString(this.promotionName);
        dest.writeString(this.promotionType);
        dest.writeSerializable(this.systemCalendarYear);
        dest.writeInt(this.inRecurringIncludeDepositExperiment ? 1 : 0);
        dest.writeParcelable(this.iraRothConversionTransferInfo, flags);
        Boolean bool = this.clawbackGracePeriodOptIn;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isFullWithdrawal;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public TransferData(BigDecimal amount, TransferDirectionV2 direction, TransferAccount fromAccount, TransferAccount toAccount, ApiCreateTransferRequest2 frequency, AchTransferOption achTransferOption, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, IraContributionQuestionnaireResult.IraContribution iraContribution, MAXTransferContext.EntryPoint entryPoint, String str, String str2, Year systemCalendarYear, boolean z, ApiRothConversionTransferInfo apiRothConversionTransferInfo, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(fromAccount, "fromAccount");
        Intrinsics.checkNotNullParameter(toAccount, "toAccount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        this.amount = amount;
        this.direction = direction;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.frequency = frequency;
        this.achTransferOption = achTransferOption;
        this.iraDistributionData = iraDistributionData;
        this.iraContribution = iraContribution;
        this.entryPoint = entryPoint;
        this.promotionName = str;
        this.promotionType = str2;
        this.systemCalendarYear = systemCalendarYear;
        this.inRecurringIncludeDepositExperiment = z;
        this.iraRothConversionTransferInfo = apiRothConversionTransferInfo;
        this.clawbackGracePeriodOptIn = bool;
        this.isFullWithdrawal = bool2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferData(java.math.BigDecimal r20, com.robinhood.models.api.bonfire.transfer.TransferDirectionV2 r21, com.robinhood.models.p320db.bonfire.TransferAccount r22, com.robinhood.models.p320db.bonfire.TransferAccount r23, com.robinhood.models.api.bonfire.ApiCreateTransferRequest2 r24, com.robinhood.android.lib.transfers.AchTransferOption r25, com.robinhood.models.api.bonfire.ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData r26, com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution r27, com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint r28, java.lang.String r29, java.lang.String r30, p479j$.time.Year r31, boolean r32, com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo r33, java.lang.Boolean r34, java.lang.Boolean r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L9
            r1 = 0
            r15 = r1
            goto Lb
        L9:
            r15 = r32
        Lb:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L13
            r17 = r2
            goto L15
        L13:
            r17 = r34
        L15:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L3a
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r16 = r33
            r2 = r19
            goto L58
        L3a:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r16 = r33
        L58:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.lib.transfers.TransferData.<init>(java.math.BigDecimal, com.robinhood.models.api.bonfire.transfer.TransferDirectionV2, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.api.bonfire.TransferFrequency, com.robinhood.android.lib.transfers.AchTransferOption, com.robinhood.models.api.bonfire.ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData, com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult$IraContribution, com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint, java.lang.String, java.lang.String, j$.time.Year, boolean, com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getPromotionName() {
        return this.promotionName;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final Year getSystemCalendarYear() {
        return this.systemCalendarYear;
    }

    public final boolean getInRecurringIncludeDepositExperiment() {
        return this.inRecurringIncludeDepositExperiment;
    }

    public final ApiRothConversionTransferInfo getIraRothConversionTransferInfo() {
        return this.iraRothConversionTransferInfo;
    }

    public final Boolean getClawbackGracePeriodOptIn() {
        return this.clawbackGracePeriodOptIn;
    }

    public final Boolean isFullWithdrawal() {
        return this.isFullWithdrawal;
    }
}
