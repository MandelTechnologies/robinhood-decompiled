package com.robinhood.android.accountcenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterAccountDetailBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAccountDetailBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "collapsedSection", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;", "<init>", "(Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;)V", "getCollapsedSection", "()Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountCenterAccountDetailBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountCenterAccountDetailBottomSheetFragmentKey> CREATOR = new Creator();
    private final UiTypedAccountCenterItem.CollapsedSectionItem collapsedSection;

    /* compiled from: AccountCenterAccountDetailBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountCenterAccountDetailBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountCenterAccountDetailBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountCenterAccountDetailBottomSheetFragmentKey((UiTypedAccountCenterItem.CollapsedSectionItem) parcel.readParcelable(AccountCenterAccountDetailBottomSheetFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountCenterAccountDetailBottomSheetFragmentKey[] newArray(int i) {
            return new AccountCenterAccountDetailBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ AccountCenterAccountDetailBottomSheetFragmentKey copy$default(AccountCenterAccountDetailBottomSheetFragmentKey accountCenterAccountDetailBottomSheetFragmentKey, UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem, int i, Object obj) {
        if ((i & 1) != 0) {
            collapsedSectionItem = accountCenterAccountDetailBottomSheetFragmentKey.collapsedSection;
        }
        return accountCenterAccountDetailBottomSheetFragmentKey.copy(collapsedSectionItem);
    }

    /* renamed from: component1, reason: from getter */
    public final UiTypedAccountCenterItem.CollapsedSectionItem getCollapsedSection() {
        return this.collapsedSection;
    }

    public final AccountCenterAccountDetailBottomSheetFragmentKey copy(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSection) {
        Intrinsics.checkNotNullParameter(collapsedSection, "collapsedSection");
        return new AccountCenterAccountDetailBottomSheetFragmentKey(collapsedSection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountCenterAccountDetailBottomSheetFragmentKey) && Intrinsics.areEqual(this.collapsedSection, ((AccountCenterAccountDetailBottomSheetFragmentKey) other).collapsedSection);
    }

    public int hashCode() {
        return this.collapsedSection.hashCode();
    }

    public String toString() {
        return "AccountCenterAccountDetailBottomSheetFragmentKey(collapsedSection=" + this.collapsedSection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.collapsedSection, flags);
    }

    public AccountCenterAccountDetailBottomSheetFragmentKey(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSection) {
        Intrinsics.checkNotNullParameter(collapsedSection, "collapsedSection");
        this.collapsedSection = collapsedSection;
    }

    public final UiTypedAccountCenterItem.CollapsedSectionItem getCollapsedSection() {
        return this.collapsedSection;
    }
}
