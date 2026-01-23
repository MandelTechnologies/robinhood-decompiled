package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnableMarginInvestingKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/EnableMarginInvestingKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "sourceScreenIdentifier", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "showConfirmationSettingsButton", "", "inHoodMonth2025Promo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getSourceScreenIdentifier", "getSourceType", "()Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "getShowConfirmationSettingsButton", "()Z", "getInHoodMonth2025Promo", "fromAcats", "getFromAcats", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EnableMarginInvestingKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<EnableMarginInvestingKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean inHoodMonth2025Promo;
    private final boolean showConfirmationSettingsButton;
    private final String sourceScreenIdentifier;
    private final EnableMarginInvestingKey2 sourceType;

    /* compiled from: EnableMarginInvestingKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<EnableMarginInvestingKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnableMarginInvestingKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            EnableMarginInvestingKey2 enableMarginInvestingKey2 = (EnableMarginInvestingKey2) parcel.readParcelable(EnableMarginInvestingKey.class.getClassLoader());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new EnableMarginInvestingKey(string2, string3, enableMarginInvestingKey2, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnableMarginInvestingKey[] newArray(int i) {
            return new EnableMarginInvestingKey[i];
        }
    }

    public EnableMarginInvestingKey() {
        this(null, null, null, false, false, 31, null);
    }

    public static /* synthetic */ EnableMarginInvestingKey copy$default(EnableMarginInvestingKey enableMarginInvestingKey, String str, String str2, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableMarginInvestingKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = enableMarginInvestingKey.sourceScreenIdentifier;
        }
        if ((i & 4) != 0) {
            enableMarginInvestingKey2 = enableMarginInvestingKey.sourceType;
        }
        if ((i & 8) != 0) {
            z = enableMarginInvestingKey.showConfirmationSettingsButton;
        }
        if ((i & 16) != 0) {
            z2 = enableMarginInvestingKey.inHoodMonth2025Promo;
        }
        boolean z3 = z2;
        EnableMarginInvestingKey2 enableMarginInvestingKey22 = enableMarginInvestingKey2;
        return enableMarginInvestingKey.copy(str, str2, enableMarginInvestingKey22, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final EnableMarginInvestingKey2 getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowConfirmationSettingsButton() {
        return this.showConfirmationSettingsButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInHoodMonth2025Promo() {
        return this.inHoodMonth2025Promo;
    }

    public final EnableMarginInvestingKey copy(String accountNumber, String sourceScreenIdentifier, EnableMarginInvestingKey2 sourceType, boolean showConfirmationSettingsButton, boolean inHoodMonth2025Promo) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return new EnableMarginInvestingKey(accountNumber, sourceScreenIdentifier, sourceType, showConfirmationSettingsButton, inHoodMonth2025Promo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableMarginInvestingKey)) {
            return false;
        }
        EnableMarginInvestingKey enableMarginInvestingKey = (EnableMarginInvestingKey) other;
        return Intrinsics.areEqual(this.accountNumber, enableMarginInvestingKey.accountNumber) && Intrinsics.areEqual(this.sourceScreenIdentifier, enableMarginInvestingKey.sourceScreenIdentifier) && Intrinsics.areEqual(this.sourceType, enableMarginInvestingKey.sourceType) && this.showConfirmationSettingsButton == enableMarginInvestingKey.showConfirmationSettingsButton && this.inHoodMonth2025Promo == enableMarginInvestingKey.inHoodMonth2025Promo;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceScreenIdentifier;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.sourceType.hashCode()) * 31) + Boolean.hashCode(this.showConfirmationSettingsButton)) * 31) + Boolean.hashCode(this.inHoodMonth2025Promo);
    }

    public String toString() {
        return "EnableMarginInvestingKey(accountNumber=" + this.accountNumber + ", sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", sourceType=" + this.sourceType + ", showConfirmationSettingsButton=" + this.showConfirmationSettingsButton + ", inHoodMonth2025Promo=" + this.inHoodMonth2025Promo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.sourceScreenIdentifier);
        dest.writeParcelable(this.sourceType, flags);
        dest.writeInt(this.showConfirmationSettingsButton ? 1 : 0);
        dest.writeInt(this.inHoodMonth2025Promo ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public EnableMarginInvestingKey(String str, String str2, EnableMarginInvestingKey2 sourceType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.accountNumber = str;
        this.sourceScreenIdentifier = str2;
        this.sourceType = sourceType;
        this.showConfirmationSettingsButton = z;
        this.inHoodMonth2025Promo = z2;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public /* synthetic */ EnableMarginInvestingKey(String str, String str2, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? EnableMarginInvestingKey2.Default.INSTANCE : enableMarginInvestingKey2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }

    public final EnableMarginInvestingKey2 getSourceType() {
        return this.sourceType;
    }

    public final boolean getShowConfirmationSettingsButton() {
        return this.showConfirmationSettingsButton;
    }

    public final boolean getInHoodMonth2025Promo() {
        return this.inHoodMonth2025Promo;
    }

    public final boolean getFromAcats() {
        return Intrinsics.areEqual(this.sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE);
    }
}
