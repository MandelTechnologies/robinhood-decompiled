package com.robinhood.android.individualaccounts.onboarding.funding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountFundingBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "type", "Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;", "source", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;", "getSource", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndividualAccountFundingBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IndividualAccountFundingBottomSheetKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String source;
    private final IndividualAccountFundingBottomSheetKey2 type;

    /* compiled from: IndividualAccountFundingBottomSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualAccountFundingBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndividualAccountFundingBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndividualAccountFundingBottomSheetKey(parcel.readString(), IndividualAccountFundingBottomSheetKey2.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndividualAccountFundingBottomSheetKey[] newArray(int i) {
            return new IndividualAccountFundingBottomSheetKey[i];
        }
    }

    public static /* synthetic */ IndividualAccountFundingBottomSheetKey copy$default(IndividualAccountFundingBottomSheetKey individualAccountFundingBottomSheetKey, String str, IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = individualAccountFundingBottomSheetKey.accountNumber;
        }
        if ((i & 2) != 0) {
            individualAccountFundingBottomSheetKey2 = individualAccountFundingBottomSheetKey.type;
        }
        if ((i & 4) != 0) {
            str2 = individualAccountFundingBottomSheetKey.source;
        }
        return individualAccountFundingBottomSheetKey.copy(str, individualAccountFundingBottomSheetKey2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final IndividualAccountFundingBottomSheetKey2 getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final IndividualAccountFundingBottomSheetKey copy(String accountNumber, IndividualAccountFundingBottomSheetKey2 type2, String source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new IndividualAccountFundingBottomSheetKey(accountNumber, type2, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualAccountFundingBottomSheetKey)) {
            return false;
        }
        IndividualAccountFundingBottomSheetKey individualAccountFundingBottomSheetKey = (IndividualAccountFundingBottomSheetKey) other;
        return Intrinsics.areEqual(this.accountNumber, individualAccountFundingBottomSheetKey.accountNumber) && this.type == individualAccountFundingBottomSheetKey.type && Intrinsics.areEqual(this.source, individualAccountFundingBottomSheetKey.source);
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IndividualAccountFundingBottomSheetKey(accountNumber=" + this.accountNumber + ", type=" + this.type + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.type.name());
        dest.writeString(this.source);
    }

    public IndividualAccountFundingBottomSheetKey(String accountNumber, IndividualAccountFundingBottomSheetKey2 type2, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.accountNumber = accountNumber;
        this.type = type2;
        this.source = str;
    }

    public /* synthetic */ IndividualAccountFundingBottomSheetKey(String str, IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, individualAccountFundingBottomSheetKey2, (i & 4) != 0 ? null : str2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final IndividualAccountFundingBottomSheetKey2 getType() {
        return this.type;
    }

    public final String getSource() {
        return this.source;
    }
}
