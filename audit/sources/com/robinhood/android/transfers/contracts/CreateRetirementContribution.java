package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContribution.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JK\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/CreateRetirementContribution;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "accountNumber", "", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "showCelebration", "", "showFrequencyRow", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;ZZLcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAccountNumber", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "getShowCelebration", "()Z", "getShowFrequencyRow", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CreateRetirementContribution implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CreateRetirementContribution> CREATOR = new Creator();
    private final String accountNumber;
    private final TransferContext.RobinhoodAccountType accountType;
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final boolean showCelebration;
    private final boolean showFrequencyRow;

    /* compiled from: CreateRetirementContribution.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<CreateRetirementContribution> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRetirementContribution createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            TransferContext.RobinhoodAccountType robinhoodAccountTypeValueOf = parcel.readInt() == 0 ? null : TransferContext.RobinhoodAccountType.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new CreateRetirementContribution(bigDecimal, string2, robinhoodAccountTypeValueOf, z2, parcel.readInt() == 0 ? z : true, MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRetirementContribution[] newArray(int i) {
            return new CreateRetirementContribution[i];
        }
    }

    public CreateRetirementContribution() {
        this(null, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ CreateRetirementContribution copy$default(CreateRetirementContribution createRetirementContribution, BigDecimal bigDecimal, String str, TransferContext.RobinhoodAccountType robinhoodAccountType, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = createRetirementContribution.amount;
        }
        if ((i & 2) != 0) {
            str = createRetirementContribution.accountNumber;
        }
        if ((i & 4) != 0) {
            robinhoodAccountType = createRetirementContribution.accountType;
        }
        if ((i & 8) != 0) {
            z = createRetirementContribution.showCelebration;
        }
        if ((i & 16) != 0) {
            z2 = createRetirementContribution.showFrequencyRow;
        }
        if ((i & 32) != 0) {
            entryPoint = createRetirementContribution.entryPoint;
        }
        boolean z3 = z2;
        MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
        return createRetirementContribution.copy(bigDecimal, str, robinhoodAccountType, z, z3, entryPoint2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferContext.RobinhoodAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCelebration() {
        return this.showCelebration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowFrequencyRow() {
        return this.showFrequencyRow;
    }

    /* renamed from: component6, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final CreateRetirementContribution copy(BigDecimal amount, String accountNumber, TransferContext.RobinhoodAccountType accountType, boolean showCelebration, boolean showFrequencyRow, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new CreateRetirementContribution(amount, accountNumber, accountType, showCelebration, showFrequencyRow, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateRetirementContribution)) {
            return false;
        }
        CreateRetirementContribution createRetirementContribution = (CreateRetirementContribution) other;
        return Intrinsics.areEqual(this.amount, createRetirementContribution.amount) && Intrinsics.areEqual(this.accountNumber, createRetirementContribution.accountNumber) && this.accountType == createRetirementContribution.accountType && this.showCelebration == createRetirementContribution.showCelebration && this.showFrequencyRow == createRetirementContribution.showFrequencyRow && this.entryPoint == createRetirementContribution.entryPoint;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TransferContext.RobinhoodAccountType robinhoodAccountType = this.accountType;
        return ((((((iHashCode2 + (robinhoodAccountType != null ? robinhoodAccountType.hashCode() : 0)) * 31) + Boolean.hashCode(this.showCelebration)) * 31) + Boolean.hashCode(this.showFrequencyRow)) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "CreateRetirementContribution(amount=" + this.amount + ", accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", showCelebration=" + this.showCelebration + ", showFrequencyRow=" + this.showFrequencyRow + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.accountNumber);
        TransferContext.RobinhoodAccountType robinhoodAccountType = this.accountType;
        if (robinhoodAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(robinhoodAccountType.name());
        }
        dest.writeInt(this.showCelebration ? 1 : 0);
        dest.writeInt(this.showFrequencyRow ? 1 : 0);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CreateRetirementContribution(BigDecimal bigDecimal, String str, TransferContext.RobinhoodAccountType robinhoodAccountType, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.amount = bigDecimal;
        this.accountNumber = str;
        this.accountType = robinhoodAccountType;
        this.showCelebration = z;
        this.showFrequencyRow = z2;
        this.entryPoint = entryPoint;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final TransferContext.RobinhoodAccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getShowCelebration() {
        return this.showCelebration;
    }

    public final boolean getShowFrequencyRow() {
        return this.showFrequencyRow;
    }

    public /* synthetic */ CreateRetirementContribution(BigDecimal bigDecimal, String str, TransferContext.RobinhoodAccountType robinhoodAccountType, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : robinhoodAccountType, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
