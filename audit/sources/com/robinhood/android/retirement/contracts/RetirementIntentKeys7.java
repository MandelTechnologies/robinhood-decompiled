package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Result", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementIntentKeys7 extends NavigationActivityResultContract<RetirementSignUp, Result> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementIntentKeys7(Function0<? extends Navigator> navigatorDelegate) {
        super(navigatorDelegate);
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
    }

    /* compiled from: RetirementIntentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "Success", "Canceled", "Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result$Canceled;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result$Success;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract$Result */
    public interface Result extends Parcelable, NavigationActivityResultContract2 {

        /* compiled from: RetirementIntentKeys.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\rJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result$Success;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAccountNumber", "()Ljava/lang/String;", "resultCode", "", "getResultCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract$Result$Success, reason: from toString */
        public static final /* data */ class Success implements Result {
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            private final String accountNumber;
            private final BrokerageAccountType brokerageAccountType;

            /* compiled from: RetirementIntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract$Result$Success$Creator */
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Success(BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            public static /* synthetic */ Success copy$default(Success success, BrokerageAccountType brokerageAccountType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    brokerageAccountType = success.brokerageAccountType;
                }
                if ((i & 2) != 0) {
                    str = success.accountNumber;
                }
                return success.copy(brokerageAccountType, str);
            }

            /* renamed from: component1, reason: from getter */
            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final Success copy(BrokerageAccountType brokerageAccountType, String accountNumber) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new Success(brokerageAccountType, accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return this.brokerageAccountType == success.brokerageAccountType && Intrinsics.areEqual(this.accountNumber, success.accountNumber);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            public int hashCode() {
                return (this.brokerageAccountType.hashCode() * 31) + this.accountNumber.hashCode();
            }

            public String toString() {
                return "Success(brokerageAccountType=" + this.brokerageAccountType + ", accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.brokerageAccountType.name());
                dest.writeString(this.accountNumber);
            }

            public Success(BrokerageAccountType brokerageAccountType, String accountNumber) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.brokerageAccountType = brokerageAccountType;
                this.accountNumber = accountNumber;
            }

            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }

        /* compiled from: RetirementIntentKeys.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result$Canceled;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUpContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract$Result$Canceled */
        public static final class Canceled implements Result {
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

            /* compiled from: RetirementIntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.retirement.contracts.RetirementSignUpContract$Result$Canceled$Creator */
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Canceled() {
            }
        }
    }
}
