package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositFundsDeepLink.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/DepositFundsDeepLink;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "shouldWaitForResult", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;ZLcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "getShouldWaitForResult", "()Z", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DepositFundsDeepLink implements IntentKey, Parcelable {
    public static final Parcelable.Creator<DepositFundsDeepLink> CREATOR = new Creator();
    private final TransferContext.RobinhoodAccountType accountType;
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiAutomaticDeposit.Frequency frequency;
    private final boolean shouldWaitForResult;

    /* compiled from: DepositFundsDeepLink.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<DepositFundsDeepLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositFundsDeepLink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositFundsDeepLink((BigDecimal) parcel.readSerializable(), ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()), TransferContext.RobinhoodAccountType.valueOf(parcel.readString()), parcel.readInt() != 0, MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositFundsDeepLink[] newArray(int i) {
            return new DepositFundsDeepLink[i];
        }
    }

    public DepositFundsDeepLink() {
        this(null, null, null, false, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.frequency.name());
        dest.writeString(this.accountType.name());
        dest.writeInt(this.shouldWaitForResult ? 1 : 0);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public DepositFundsDeepLink(BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, TransferContext.RobinhoodAccountType accountType, boolean z, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.amount = bigDecimal;
        this.frequency = frequency;
        this.accountType = accountType;
        this.shouldWaitForResult = z;
        this.entryPoint = entryPoint;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public /* synthetic */ DepositFundsDeepLink(BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, TransferContext.RobinhoodAccountType robinhoodAccountType, boolean z, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? ApiAutomaticDeposit.Frequency.ONCE : frequency, (i & 4) != 0 ? TransferContext.RobinhoodAccountType.BROKERAGE : robinhoodAccountType, (i & 8) != 0 ? false : z, (i & 16) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    public final TransferContext.RobinhoodAccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getShouldWaitForResult() {
        return this.shouldWaitForResult;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
