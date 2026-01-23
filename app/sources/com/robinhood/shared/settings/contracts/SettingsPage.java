package com.robinhood.shared.settings.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsPage.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SettingsPage;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "pageId", "", "accountNumber", "entryPointIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "getAccountNumber", "getEntryPointIdentifier", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class SettingsPage implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<SettingsPage> CREATOR = new Creator();
    private final String accountNumber;
    private final String entryPointIdentifier;
    private final String pageId;

    /* compiled from: SettingsPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SettingsPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SettingsPage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsPage[] newArray(int i) {
            return new SettingsPage[i];
        }
    }

    public static /* synthetic */ SettingsPage copy$default(SettingsPage settingsPage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingsPage.pageId;
        }
        if ((i & 2) != 0) {
            str2 = settingsPage.accountNumber;
        }
        if ((i & 4) != 0) {
            str3 = settingsPage.entryPointIdentifier;
        }
        return settingsPage.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final SettingsPage copy(String pageId, String accountNumber, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return new SettingsPage(pageId, accountNumber, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsPage)) {
            return false;
        }
        SettingsPage settingsPage = (SettingsPage) other;
        return Intrinsics.areEqual(this.pageId, settingsPage.pageId) && Intrinsics.areEqual(this.accountNumber, settingsPage.accountNumber) && Intrinsics.areEqual(this.entryPointIdentifier, settingsPage.entryPointIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.pageId.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryPointIdentifier;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SettingsPage(pageId=" + this.pageId + ", accountNumber=" + this.accountNumber + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.pageId);
        dest.writeString(this.accountNumber);
        dest.writeString(this.entryPointIdentifier);
    }

    public SettingsPage(String pageId, String str, String str2) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.pageId = pageId;
        this.accountNumber = str;
        this.entryPointIdentifier = str2;
    }

    public /* synthetic */ SettingsPage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CURRENT_TAB;
    }
}
