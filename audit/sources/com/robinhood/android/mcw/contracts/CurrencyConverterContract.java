package com.robinhood.android.mcw.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterContract.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract$Result;", "navigator", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Result", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConverterContract extends NavigationActivityResultContract<CurrencyConverterKey, Result> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyConverterContract(Function0<? extends Navigator> navigator) {
        super(navigator);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    /* compiled from: CurrencyConverterContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "Completed", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract$Result$Completed;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Result extends Parcelable, NavigationActivityResultContract2 {

        /* compiled from: CurrencyConverterContract.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\tJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract$Result$Completed;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterContract$Result;", "updatedBalance", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getUpdatedBalance", "()Lcom/robinhood/models/util/Money;", "resultCode", "", "getResultCode", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Completed implements Result {
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            private final Money updatedBalance;

            /* compiled from: CurrencyConverterContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Completed((Money) parcel.readParcelable(Completed.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i) {
                    return new Completed[i];
                }
            }

            public static /* synthetic */ Completed copy$default(Completed completed, Money money, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = completed.updatedBalance;
                }
                return completed.copy(money);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getUpdatedBalance() {
                return this.updatedBalance;
            }

            public final Completed copy(Money updatedBalance) {
                Intrinsics.checkNotNullParameter(updatedBalance, "updatedBalance");
                return new Completed(updatedBalance);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completed) && Intrinsics.areEqual(this.updatedBalance, ((Completed) other).updatedBalance);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            public int hashCode() {
                return this.updatedBalance.hashCode();
            }

            public String toString() {
                return "Completed(updatedBalance=" + this.updatedBalance + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.updatedBalance, flags);
            }

            public Completed(Money updatedBalance) {
                Intrinsics.checkNotNullParameter(updatedBalance, "updatedBalance");
                this.updatedBalance = updatedBalance;
            }

            public final Money getUpdatedBalance() {
                return this.updatedBalance;
            }
        }
    }
}
