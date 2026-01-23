package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: IraContributionQuestionnaireResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "IraContribution", "UpdateTaxYear", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$UpdateTaxYear;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class IraContributionQuestionnaireResult implements Parcelable, NavigationActivityResultContract2 {
    private final int resultCode;

    public /* synthetic */ IraContributionQuestionnaireResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IraContributionQuestionnaireResult() {
        this.resultCode = -1;
    }

    @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
    public int getResultCode() {
        return this.resultCode;
    }

    /* compiled from: IraContributionQuestionnaireResult.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", "<init>", "()V", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "toIraContributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "OneTimeContribution", "IndirectRollover", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution$IndirectRollover;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution$OneTimeContribution;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class IraContribution extends IraContributionQuestionnaireResult {
        public /* synthetic */ IraContribution(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract TransferAccount getAccount();

        public abstract IraContributionType getIraContributionType();

        public abstract ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData toIraContributionData();

        private IraContribution() {
            super(null);
        }

        /* compiled from: IraContributionQuestionnaireResult.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001bR\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution$OneTimeContribution;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "account", "j$/time/Year", "taxYear", "Lcom/robinhood/models/util/Money;", "contributionLimit", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lj$/time/Year;Lcom/robinhood/models/util/Money;)V", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "toIraContributionData", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component2", "()Lj$/time/Year;", "component3", "()Lcom/robinhood/models/util/Money;", "copy", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lj$/time/Year;Lcom/robinhood/models/util/Money;)Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution$OneTimeContribution;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getAccount", "Lj$/time/Year;", "getTaxYear", "Lcom/robinhood/models/util/Money;", "getContributionLimit", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "iraContributionType", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OneTimeContribution extends IraContribution {
            public static final Parcelable.Creator<OneTimeContribution> CREATOR = new Creator();
            private final TransferAccount account;
            private final Money contributionLimit;
            private final Year taxYear;

            /* compiled from: IraContributionQuestionnaireResult.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OneTimeContribution> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OneTimeContribution createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OneTimeContribution((TransferAccount) parcel.readParcelable(OneTimeContribution.class.getClassLoader()), (Year) parcel.readSerializable(), (Money) parcel.readParcelable(OneTimeContribution.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OneTimeContribution[] newArray(int i) {
                    return new OneTimeContribution[i];
                }
            }

            public static /* synthetic */ OneTimeContribution copy$default(OneTimeContribution oneTimeContribution, TransferAccount transferAccount, Year year, Money money, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccount = oneTimeContribution.account;
                }
                if ((i & 2) != 0) {
                    year = oneTimeContribution.taxYear;
                }
                if ((i & 4) != 0) {
                    money = oneTimeContribution.contributionLimit;
                }
                return oneTimeContribution.copy(transferAccount, year, money);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccount getAccount() {
                return this.account;
            }

            /* renamed from: component2, reason: from getter */
            public final Year getTaxYear() {
                return this.taxYear;
            }

            /* renamed from: component3, reason: from getter */
            public final Money getContributionLimit() {
                return this.contributionLimit;
            }

            public final OneTimeContribution copy(TransferAccount account, Year taxYear, Money contributionLimit) {
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                return new OneTimeContribution(account, taxYear, contributionLimit);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OneTimeContribution)) {
                    return false;
                }
                OneTimeContribution oneTimeContribution = (OneTimeContribution) other;
                return Intrinsics.areEqual(this.account, oneTimeContribution.account) && Intrinsics.areEqual(this.taxYear, oneTimeContribution.taxYear) && Intrinsics.areEqual(this.contributionLimit, oneTimeContribution.contributionLimit);
            }

            public int hashCode() {
                int iHashCode = ((this.account.hashCode() * 31) + this.taxYear.hashCode()) * 31;
                Money money = this.contributionLimit;
                return iHashCode + (money == null ? 0 : money.hashCode());
            }

            public String toString() {
                return "OneTimeContribution(account=" + this.account + ", taxYear=" + this.taxYear + ", contributionLimit=" + this.contributionLimit + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.account, flags);
                dest.writeSerializable(this.taxYear);
                dest.writeParcelable(this.contributionLimit, flags);
            }

            public /* synthetic */ OneTimeContribution(TransferAccount transferAccount, Year year, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(transferAccount, year, (i & 4) != 0 ? null : money);
            }

            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public TransferAccount getAccount() {
                return this.account;
            }

            public final Year getTaxYear() {
                return this.taxYear;
            }

            public final Money getContributionLimit() {
                return this.contributionLimit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OneTimeContribution(TransferAccount account, Year taxYear, Money money) {
                super(null);
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                this.account = account;
                this.taxYear = taxYear;
                this.contributionLimit = money;
            }

            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public IraContributionType getIraContributionType() {
                return IraContributionType.ONE_TIME_CONTRIBUTION;
            }

            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData toIraContributionData() {
                return new ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData(IraContributionType.ONE_TIME_CONTRIBUTION, this.taxYear);
            }
        }

        /* compiled from: IraContributionQuestionnaireResult.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution$IndirectRollover;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "toIraContributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IndirectRollover extends IraContribution {
            public static final Parcelable.Creator<IndirectRollover> CREATOR = new Creator();
            private final TransferAccount account;

            /* compiled from: IraContributionQuestionnaireResult.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<IndirectRollover> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IndirectRollover createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IndirectRollover((TransferAccount) parcel.readParcelable(IndirectRollover.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IndirectRollover[] newArray(int i) {
                    return new IndirectRollover[i];
                }
            }

            public static /* synthetic */ IndirectRollover copy$default(IndirectRollover indirectRollover, TransferAccount transferAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccount = indirectRollover.account;
                }
                return indirectRollover.copy(transferAccount);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccount getAccount() {
                return this.account;
            }

            public final IndirectRollover copy(TransferAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return new IndirectRollover(account);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IndirectRollover) && Intrinsics.areEqual(this.account, ((IndirectRollover) other).account);
            }

            public int hashCode() {
                return this.account.hashCode();
            }

            public String toString() {
                return "IndirectRollover(account=" + this.account + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.account, flags);
            }

            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public TransferAccount getAccount() {
                return this.account;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IndirectRollover(TransferAccount account) {
                super(null);
                Intrinsics.checkNotNullParameter(account, "account");
                this.account = account;
            }

            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public IraContributionType getIraContributionType() {
                return IraContributionType.INDIRECT_ROLLOVER;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult.IraContribution
            public ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData toIraContributionData() {
                return new ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData(IraContributionType.INDIRECT_ROLLOVER, null, 2, 0 == true ? 1 : 0);
            }
        }
    }

    /* compiled from: IraContributionQuestionnaireResult.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$UpdateTaxYear;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", "j$/time/Year", "taxYear", "Lcom/robinhood/models/util/Money;", "contributionLimit", "<init>", "(Lj$/time/Year;Lcom/robinhood/models/util/Money;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lj$/time/Year;", "component2", "()Lcom/robinhood/models/util/Money;", "copy", "(Lj$/time/Year;Lcom/robinhood/models/util/Money;)Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$UpdateTaxYear;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Year;", "getTaxYear", "Lcom/robinhood/models/util/Money;", "getContributionLimit", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateTaxYear extends IraContributionQuestionnaireResult {
        public static final Parcelable.Creator<UpdateTaxYear> CREATOR = new Creator();
        private final Money contributionLimit;
        private final Year taxYear;

        /* compiled from: IraContributionQuestionnaireResult.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateTaxYear> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateTaxYear createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateTaxYear((Year) parcel.readSerializable(), (Money) parcel.readParcelable(UpdateTaxYear.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateTaxYear[] newArray(int i) {
                return new UpdateTaxYear[i];
            }
        }

        public static /* synthetic */ UpdateTaxYear copy$default(UpdateTaxYear updateTaxYear, Year year, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                year = updateTaxYear.taxYear;
            }
            if ((i & 2) != 0) {
                money = updateTaxYear.contributionLimit;
            }
            return updateTaxYear.copy(year, money);
        }

        /* renamed from: component1, reason: from getter */
        public final Year getTaxYear() {
            return this.taxYear;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getContributionLimit() {
            return this.contributionLimit;
        }

        public final UpdateTaxYear copy(Year taxYear, Money contributionLimit) {
            return new UpdateTaxYear(taxYear, contributionLimit);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateTaxYear)) {
                return false;
            }
            UpdateTaxYear updateTaxYear = (UpdateTaxYear) other;
            return Intrinsics.areEqual(this.taxYear, updateTaxYear.taxYear) && Intrinsics.areEqual(this.contributionLimit, updateTaxYear.contributionLimit);
        }

        public int hashCode() {
            Year year = this.taxYear;
            int iHashCode = (year == null ? 0 : year.hashCode()) * 31;
            Money money = this.contributionLimit;
            return iHashCode + (money != null ? money.hashCode() : 0);
        }

        public String toString() {
            return "UpdateTaxYear(taxYear=" + this.taxYear + ", contributionLimit=" + this.contributionLimit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.taxYear);
            dest.writeParcelable(this.contributionLimit, flags);
        }

        public final Year getTaxYear() {
            return this.taxYear;
        }

        public final Money getContributionLimit() {
            return this.contributionLimit;
        }

        public UpdateTaxYear(Year year, Money money) {
            super(null);
            this.taxYear = year;
            this.contributionLimit = money;
        }
    }
}
