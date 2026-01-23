package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterWebViewFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/HelpCenterWebViewFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "helpCenterUrl", "", "<init>", "(Ljava/lang/String;)V", "getHelpCenterUrl", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class HelpCenterWebViewFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<HelpCenterWebViewFragmentKey> CREATOR = new Creator();
    private final String helpCenterUrl;

    /* compiled from: HelpCenterWebViewFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<HelpCenterWebViewFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelpCenterWebViewFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HelpCenterWebViewFragmentKey(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelpCenterWebViewFragmentKey[] newArray(int i) {
            return new HelpCenterWebViewFragmentKey[i];
        }
    }

    public static /* synthetic */ HelpCenterWebViewFragmentKey copy$default(HelpCenterWebViewFragmentKey helpCenterWebViewFragmentKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterWebViewFragmentKey.helpCenterUrl;
        }
        return helpCenterWebViewFragmentKey.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final HelpCenterWebViewFragmentKey copy(String helpCenterUrl) {
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        return new HelpCenterWebViewFragmentKey(helpCenterUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HelpCenterWebViewFragmentKey) && Intrinsics.areEqual(this.helpCenterUrl, ((HelpCenterWebViewFragmentKey) other).helpCenterUrl);
    }

    public int hashCode() {
        return this.helpCenterUrl.hashCode();
    }

    public String toString() {
        return "HelpCenterWebViewFragmentKey(helpCenterUrl=" + this.helpCenterUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.helpCenterUrl);
    }

    public HelpCenterWebViewFragmentKey(String helpCenterUrl) {
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        this.helpCenterUrl = helpCenterUrl;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
