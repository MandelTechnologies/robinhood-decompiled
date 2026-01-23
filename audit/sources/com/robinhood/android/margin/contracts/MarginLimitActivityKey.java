package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitActivityKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/MarginLimitActivityKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "submitOnConfirmation", "", "forceShowRemoveLimitButton", "sourceScreenIdentifier", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSubmitOnConfirmation", "()Z", "getForceShowRemoveLimitButton", "getSourceScreenIdentifier", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MarginLimitActivityKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<MarginLimitActivityKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean forceShowRemoveLimitButton;
    private final String sourceScreenIdentifier;
    private final boolean submitOnConfirmation;

    /* compiled from: MarginLimitActivityKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<MarginLimitActivityKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginLimitActivityKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginLimitActivityKey(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginLimitActivityKey[] newArray(int i) {
            return new MarginLimitActivityKey[i];
        }
    }

    public static /* synthetic */ MarginLimitActivityKey copy$default(MarginLimitActivityKey marginLimitActivityKey, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginLimitActivityKey.accountNumber;
        }
        if ((i & 2) != 0) {
            z = marginLimitActivityKey.submitOnConfirmation;
        }
        if ((i & 4) != 0) {
            z2 = marginLimitActivityKey.forceShowRemoveLimitButton;
        }
        if ((i & 8) != 0) {
            str2 = marginLimitActivityKey.sourceScreenIdentifier;
        }
        return marginLimitActivityKey.copy(str, z, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSubmitOnConfirmation() {
        return this.submitOnConfirmation;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForceShowRemoveLimitButton() {
        return this.forceShowRemoveLimitButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public final MarginLimitActivityKey copy(String accountNumber, boolean submitOnConfirmation, boolean forceShowRemoveLimitButton, String sourceScreenIdentifier) {
        return new MarginLimitActivityKey(accountNumber, submitOnConfirmation, forceShowRemoveLimitButton, sourceScreenIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginLimitActivityKey)) {
            return false;
        }
        MarginLimitActivityKey marginLimitActivityKey = (MarginLimitActivityKey) other;
        return Intrinsics.areEqual(this.accountNumber, marginLimitActivityKey.accountNumber) && this.submitOnConfirmation == marginLimitActivityKey.submitOnConfirmation && this.forceShowRemoveLimitButton == marginLimitActivityKey.forceShowRemoveLimitButton && Intrinsics.areEqual(this.sourceScreenIdentifier, marginLimitActivityKey.sourceScreenIdentifier);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.submitOnConfirmation)) * 31) + Boolean.hashCode(this.forceShowRemoveLimitButton)) * 31;
        String str2 = this.sourceScreenIdentifier;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MarginLimitActivityKey(accountNumber=" + this.accountNumber + ", submitOnConfirmation=" + this.submitOnConfirmation + ", forceShowRemoveLimitButton=" + this.forceShowRemoveLimitButton + ", sourceScreenIdentifier=" + this.sourceScreenIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.submitOnConfirmation ? 1 : 0);
        dest.writeInt(this.forceShowRemoveLimitButton ? 1 : 0);
        dest.writeString(this.sourceScreenIdentifier);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public MarginLimitActivityKey(String str, boolean z, boolean z2, String str2) {
        this.accountNumber = str;
        this.submitOnConfirmation = z;
        this.forceShowRemoveLimitButton = z2;
        this.sourceScreenIdentifier = str2;
    }

    public /* synthetic */ MarginLimitActivityKey(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getSubmitOnConfirmation() {
        return this.submitOnConfirmation;
    }

    public final boolean getForceShowRemoveLimitButton() {
        return this.forceShowRemoveLimitButton;
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }
}
