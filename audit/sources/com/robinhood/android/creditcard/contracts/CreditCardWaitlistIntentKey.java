package com.robinhood.android.creditcard.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistIntentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "referralCode", "", "creditApplicationReferralCode", "autoJoin", "", "source", "showInModal", "showPlanSelector", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getReferralCode", "()Ljava/lang/String;", "getCreditApplicationReferralCode", "getAutoJoin", "()Z", "getSource", "getShowInModal", "getShowPlanSelector", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CreditCardWaitlistIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CreditCardWaitlistIntentKey> CREATOR = new Creator();
    private final boolean autoJoin;
    private final String creditApplicationReferralCode;
    private final String referralCode;
    private final boolean showInModal;
    private final boolean showPlanSelector;
    private final String source;

    /* compiled from: CreditCardWaitlistIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CreditCardWaitlistIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CreditCardWaitlistIntentKey(string2, string3, z4, string4, z2, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistIntentKey[] newArray(int i) {
            return new CreditCardWaitlistIntentKey[i];
        }
    }

    public CreditCardWaitlistIntentKey() {
        this(null, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ CreditCardWaitlistIntentKey copy$default(CreditCardWaitlistIntentKey creditCardWaitlistIntentKey, String str, String str2, boolean z, String str3, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditCardWaitlistIntentKey.referralCode;
        }
        if ((i & 2) != 0) {
            str2 = creditCardWaitlistIntentKey.creditApplicationReferralCode;
        }
        if ((i & 4) != 0) {
            z = creditCardWaitlistIntentKey.autoJoin;
        }
        if ((i & 8) != 0) {
            str3 = creditCardWaitlistIntentKey.source;
        }
        if ((i & 16) != 0) {
            z2 = creditCardWaitlistIntentKey.showInModal;
        }
        if ((i & 32) != 0) {
            z3 = creditCardWaitlistIntentKey.showPlanSelector;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return creditCardWaitlistIntentKey.copy(str, str2, z, str3, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreditApplicationReferralCode() {
        return this.creditApplicationReferralCode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAutoJoin() {
        return this.autoJoin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowInModal() {
        return this.showInModal;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowPlanSelector() {
        return this.showPlanSelector;
    }

    public final CreditCardWaitlistIntentKey copy(String referralCode, String creditApplicationReferralCode, boolean autoJoin, String source, boolean showInModal, boolean showPlanSelector) {
        return new CreditCardWaitlistIntentKey(referralCode, creditApplicationReferralCode, autoJoin, source, showInModal, showPlanSelector);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardWaitlistIntentKey)) {
            return false;
        }
        CreditCardWaitlistIntentKey creditCardWaitlistIntentKey = (CreditCardWaitlistIntentKey) other;
        return Intrinsics.areEqual(this.referralCode, creditCardWaitlistIntentKey.referralCode) && Intrinsics.areEqual(this.creditApplicationReferralCode, creditCardWaitlistIntentKey.creditApplicationReferralCode) && this.autoJoin == creditCardWaitlistIntentKey.autoJoin && Intrinsics.areEqual(this.source, creditCardWaitlistIntentKey.source) && this.showInModal == creditCardWaitlistIntentKey.showInModal && this.showPlanSelector == creditCardWaitlistIntentKey.showPlanSelector;
    }

    public int hashCode() {
        String str = this.referralCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.creditApplicationReferralCode;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.autoJoin)) * 31;
        String str3 = this.source;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.showInModal)) * 31) + Boolean.hashCode(this.showPlanSelector);
    }

    public String toString() {
        return "CreditCardWaitlistIntentKey(referralCode=" + this.referralCode + ", creditApplicationReferralCode=" + this.creditApplicationReferralCode + ", autoJoin=" + this.autoJoin + ", source=" + this.source + ", showInModal=" + this.showInModal + ", showPlanSelector=" + this.showPlanSelector + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.referralCode);
        dest.writeString(this.creditApplicationReferralCode);
        dest.writeInt(this.autoJoin ? 1 : 0);
        dest.writeString(this.source);
        dest.writeInt(this.showInModal ? 1 : 0);
        dest.writeInt(this.showPlanSelector ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CreditCardWaitlistIntentKey(String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
        this.referralCode = str;
        this.creditApplicationReferralCode = str2;
        this.autoJoin = z;
        this.source = str3;
        this.showInModal = z2;
        this.showPlanSelector = z3;
    }

    public /* synthetic */ CreditCardWaitlistIntentKey(String str, String str2, boolean z, String str3, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final String getCreditApplicationReferralCode() {
        return this.creditApplicationReferralCode;
    }

    public final boolean getAutoJoin() {
        return this.autoJoin;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getShowInModal() {
        return this.showInModal;
    }

    public final boolean getShowPlanSelector() {
        return this.showPlanSelector;
    }
}
