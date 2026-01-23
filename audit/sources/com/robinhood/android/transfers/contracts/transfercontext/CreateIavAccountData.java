package com.robinhood.android.transfers.contracts.transfercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.IavAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateIavAccountData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "Landroid/os/Parcelable;", "access_token", "", "account", "Lcom/robinhood/models/api/IavAccount;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;)V", "getAccess_token", "()Ljava/lang/String;", "getAccount", "()Lcom/robinhood/models/api/IavAccount;", "getAccount_type", "()Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateIavAccountData implements Parcelable {
    public static final Parcelable.Creator<CreateIavAccountData> CREATOR = new Creator();
    private final String access_token;
    private final IavAccount account;
    private final ApiAchRelationship.BankAccountType account_type;

    /* compiled from: CreateIavAccountData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateIavAccountData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateIavAccountData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateIavAccountData(parcel.readString(), (IavAccount) parcel.readParcelable(CreateIavAccountData.class.getClassLoader()), parcel.readInt() == 0 ? null : ApiAchRelationship.BankAccountType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateIavAccountData[] newArray(int i) {
            return new CreateIavAccountData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.access_token);
        dest.writeParcelable(this.account, flags);
        ApiAchRelationship.BankAccountType bankAccountType = this.account_type;
        if (bankAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bankAccountType.name());
        }
    }

    public CreateIavAccountData(String access_token, IavAccount account, ApiAchRelationship.BankAccountType bankAccountType) {
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(account, "account");
        this.access_token = access_token;
        this.account = account;
        this.account_type = bankAccountType;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final IavAccount getAccount() {
        return this.account;
    }

    public final ApiAchRelationship.BankAccountType getAccount_type() {
        return this.account_type;
    }
}
