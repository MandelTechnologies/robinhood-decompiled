package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionsDialogFragmentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0006J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/CreateRetirementContributionsDialogFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "amountSelected", "", "taxYear", "", "excludeUserContributionsSection", "", "<init>", "(Ljava/lang/String;IZ)V", "getAmountSelected", "()Ljava/lang/String;", "getTaxYear", "()I", "getExcludeUserContributionsSection", "()Z", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CreateRetirementContributionsDialogFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<CreateRetirementContributionsDialogFragmentKey> CREATOR = new Creator();
    private final String amountSelected;
    private final boolean excludeUserContributionsSection;
    private final int taxYear;

    /* compiled from: CreateRetirementContributionsDialogFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<CreateRetirementContributionsDialogFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRetirementContributionsDialogFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateRetirementContributionsDialogFragmentKey(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRetirementContributionsDialogFragmentKey[] newArray(int i) {
            return new CreateRetirementContributionsDialogFragmentKey[i];
        }
    }

    public static /* synthetic */ CreateRetirementContributionsDialogFragmentKey copy$default(CreateRetirementContributionsDialogFragmentKey createRetirementContributionsDialogFragmentKey, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createRetirementContributionsDialogFragmentKey.amountSelected;
        }
        if ((i2 & 2) != 0) {
            i = createRetirementContributionsDialogFragmentKey.taxYear;
        }
        if ((i2 & 4) != 0) {
            z = createRetirementContributionsDialogFragmentKey.excludeUserContributionsSection;
        }
        return createRetirementContributionsDialogFragmentKey.copy(str, i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmountSelected() {
        return this.amountSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTaxYear() {
        return this.taxYear;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExcludeUserContributionsSection() {
        return this.excludeUserContributionsSection;
    }

    public final CreateRetirementContributionsDialogFragmentKey copy(String amountSelected, int taxYear, boolean excludeUserContributionsSection) {
        Intrinsics.checkNotNullParameter(amountSelected, "amountSelected");
        return new CreateRetirementContributionsDialogFragmentKey(amountSelected, taxYear, excludeUserContributionsSection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateRetirementContributionsDialogFragmentKey)) {
            return false;
        }
        CreateRetirementContributionsDialogFragmentKey createRetirementContributionsDialogFragmentKey = (CreateRetirementContributionsDialogFragmentKey) other;
        return Intrinsics.areEqual(this.amountSelected, createRetirementContributionsDialogFragmentKey.amountSelected) && this.taxYear == createRetirementContributionsDialogFragmentKey.taxYear && this.excludeUserContributionsSection == createRetirementContributionsDialogFragmentKey.excludeUserContributionsSection;
    }

    public int hashCode() {
        return (((this.amountSelected.hashCode() * 31) + Integer.hashCode(this.taxYear)) * 31) + Boolean.hashCode(this.excludeUserContributionsSection);
    }

    public String toString() {
        return "CreateRetirementContributionsDialogFragmentKey(amountSelected=" + this.amountSelected + ", taxYear=" + this.taxYear + ", excludeUserContributionsSection=" + this.excludeUserContributionsSection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amountSelected);
        dest.writeInt(this.taxYear);
        dest.writeInt(this.excludeUserContributionsSection ? 1 : 0);
    }

    public CreateRetirementContributionsDialogFragmentKey(String amountSelected, int i, boolean z) {
        Intrinsics.checkNotNullParameter(amountSelected, "amountSelected");
        this.amountSelected = amountSelected;
        this.taxYear = i;
        this.excludeUserContributionsSection = z;
    }

    public /* synthetic */ CreateRetirementContributionsDialogFragmentKey(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }

    public final String getAmountSelected() {
        return this.amountSelected;
    }

    public final int getTaxYear() {
        return this.taxYear;
    }

    public final boolean getExcludeUserContributionsSection() {
        return this.excludeUserContributionsSection;
    }
}
