package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithdrawFundsDeeplink.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WithdrawFundsDeeplink;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class WithdrawFundsDeeplink implements IntentKey, Parcelable {
    public static final Parcelable.Creator<WithdrawFundsDeeplink> CREATOR = new Creator();
    private final TransferContext.RobinhoodAccountType accountType;
    private final BigDecimal amount;

    /* compiled from: WithdrawFundsDeeplink.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<WithdrawFundsDeeplink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawFundsDeeplink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawFundsDeeplink((BigDecimal) parcel.readSerializable(), TransferContext.RobinhoodAccountType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawFundsDeeplink[] newArray(int i) {
            return new WithdrawFundsDeeplink[i];
        }
    }

    public static /* synthetic */ WithdrawFundsDeeplink copy$default(WithdrawFundsDeeplink withdrawFundsDeeplink, BigDecimal bigDecimal, TransferContext.RobinhoodAccountType robinhoodAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = withdrawFundsDeeplink.amount;
        }
        if ((i & 2) != 0) {
            robinhoodAccountType = withdrawFundsDeeplink.accountType;
        }
        return withdrawFundsDeeplink.copy(bigDecimal, robinhoodAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferContext.RobinhoodAccountType getAccountType() {
        return this.accountType;
    }

    public final WithdrawFundsDeeplink copy(BigDecimal amount, TransferContext.RobinhoodAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new WithdrawFundsDeeplink(amount, accountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawFundsDeeplink)) {
            return false;
        }
        WithdrawFundsDeeplink withdrawFundsDeeplink = (WithdrawFundsDeeplink) other;
        return Intrinsics.areEqual(this.amount, withdrawFundsDeeplink.amount) && this.accountType == withdrawFundsDeeplink.accountType;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.accountType.hashCode();
    }

    public String toString() {
        return "WithdrawFundsDeeplink(amount=" + this.amount + ", accountType=" + this.accountType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.accountType.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public WithdrawFundsDeeplink(BigDecimal bigDecimal, TransferContext.RobinhoodAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.amount = bigDecimal;
        this.accountType = accountType;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferContext.RobinhoodAccountType getAccountType() {
        return this.accountType;
    }
}
