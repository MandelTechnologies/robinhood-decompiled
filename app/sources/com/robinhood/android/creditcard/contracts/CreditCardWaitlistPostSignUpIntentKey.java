package com.robinhood.android.creditcard.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistPostSignUpIntentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistPostSignUpIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "redirectKey", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "shouldLaunchTaxMatchPromoForResurrectedUser", "", "<init>", "(Lcom/robinhood/android/retirement/contracts/RetirementSignUp;Z)V", "getRedirectKey", "()Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "getShouldLaunchTaxMatchPromoForResurrectedUser", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditCardWaitlistPostSignUpIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CreditCardWaitlistPostSignUpIntentKey> CREATOR = new Creator();
    private final RetirementSignUp redirectKey;
    private final boolean shouldLaunchTaxMatchPromoForResurrectedUser;

    /* compiled from: CreditCardWaitlistPostSignUpIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditCardWaitlistPostSignUpIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistPostSignUpIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardWaitlistPostSignUpIntentKey((RetirementSignUp) parcel.readParcelable(CreditCardWaitlistPostSignUpIntentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistPostSignUpIntentKey[] newArray(int i) {
            return new CreditCardWaitlistPostSignUpIntentKey[i];
        }
    }

    public static /* synthetic */ CreditCardWaitlistPostSignUpIntentKey copy$default(CreditCardWaitlistPostSignUpIntentKey creditCardWaitlistPostSignUpIntentKey, RetirementSignUp retirementSignUp, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementSignUp = creditCardWaitlistPostSignUpIntentKey.redirectKey;
        }
        if ((i & 2) != 0) {
            z = creditCardWaitlistPostSignUpIntentKey.shouldLaunchTaxMatchPromoForResurrectedUser;
        }
        return creditCardWaitlistPostSignUpIntentKey.copy(retirementSignUp, z);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementSignUp getRedirectKey() {
        return this.redirectKey;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
        return this.shouldLaunchTaxMatchPromoForResurrectedUser;
    }

    public final CreditCardWaitlistPostSignUpIntentKey copy(RetirementSignUp redirectKey, boolean shouldLaunchTaxMatchPromoForResurrectedUser) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        return new CreditCardWaitlistPostSignUpIntentKey(redirectKey, shouldLaunchTaxMatchPromoForResurrectedUser);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardWaitlistPostSignUpIntentKey)) {
            return false;
        }
        CreditCardWaitlistPostSignUpIntentKey creditCardWaitlistPostSignUpIntentKey = (CreditCardWaitlistPostSignUpIntentKey) other;
        return Intrinsics.areEqual(this.redirectKey, creditCardWaitlistPostSignUpIntentKey.redirectKey) && this.shouldLaunchTaxMatchPromoForResurrectedUser == creditCardWaitlistPostSignUpIntentKey.shouldLaunchTaxMatchPromoForResurrectedUser;
    }

    public int hashCode() {
        return (this.redirectKey.hashCode() * 31) + Boolean.hashCode(this.shouldLaunchTaxMatchPromoForResurrectedUser);
    }

    public String toString() {
        return "CreditCardWaitlistPostSignUpIntentKey(redirectKey=" + this.redirectKey + ", shouldLaunchTaxMatchPromoForResurrectedUser=" + this.shouldLaunchTaxMatchPromoForResurrectedUser + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.redirectKey, flags);
        dest.writeInt(this.shouldLaunchTaxMatchPromoForResurrectedUser ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CreditCardWaitlistPostSignUpIntentKey(RetirementSignUp redirectKey, boolean z) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        this.redirectKey = redirectKey;
        this.shouldLaunchTaxMatchPromoForResurrectedUser = z;
    }

    public final RetirementSignUp getRedirectKey() {
        return this.redirectKey;
    }

    public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
        return this.shouldLaunchTaxMatchPromoForResurrectedUser;
    }
}
