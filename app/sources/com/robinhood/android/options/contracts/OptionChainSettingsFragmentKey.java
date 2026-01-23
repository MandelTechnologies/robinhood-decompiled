package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainSettingsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "fromSideBySideChain", "", "source", "isFocusedToSbsTooltipDismissedAndGreenDotVisible", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/android/options/contracts/OptionChainLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getFromSideBySideChain", "()Z", "getSource", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionChainSettingsFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OptionChainSettingsFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean fromSideBySideChain;
    private final boolean isFocusedToSbsTooltipDismissedAndGreenDotVisible;
    private final OptionChainLaunchMode launchMode;
    private final String source;

    /* compiled from: OptionChainSettingsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionChainSettingsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainSettingsFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new OptionChainSettingsFragmentKey(string2, z3, string3, z2, (OptionChainLaunchMode) parcel.readParcelable(OptionChainSettingsFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainSettingsFragmentKey[] newArray(int i) {
            return new OptionChainSettingsFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionChainSettingsFragmentKey copy$default(OptionChainSettingsFragmentKey optionChainSettingsFragmentKey, String str, boolean z, String str2, boolean z2, OptionChainLaunchMode optionChainLaunchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionChainSettingsFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            z = optionChainSettingsFragmentKey.fromSideBySideChain;
        }
        if ((i & 4) != 0) {
            str2 = optionChainSettingsFragmentKey.source;
        }
        if ((i & 8) != 0) {
            z2 = optionChainSettingsFragmentKey.isFocusedToSbsTooltipDismissedAndGreenDotVisible;
        }
        if ((i & 16) != 0) {
            optionChainLaunchMode = optionChainSettingsFragmentKey.launchMode;
        }
        OptionChainLaunchMode optionChainLaunchMode2 = optionChainLaunchMode;
        String str3 = str2;
        return optionChainSettingsFragmentKey.copy(str, z, str3, z2, optionChainLaunchMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromSideBySideChain() {
        return this.fromSideBySideChain;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFocusedToSbsTooltipDismissedAndGreenDotVisible() {
        return this.isFocusedToSbsTooltipDismissedAndGreenDotVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final OptionChainSettingsFragmentKey copy(String accountNumber, boolean fromSideBySideChain, String source, boolean isFocusedToSbsTooltipDismissedAndGreenDotVisible, OptionChainLaunchMode launchMode) {
        return new OptionChainSettingsFragmentKey(accountNumber, fromSideBySideChain, source, isFocusedToSbsTooltipDismissedAndGreenDotVisible, launchMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsFragmentKey)) {
            return false;
        }
        OptionChainSettingsFragmentKey optionChainSettingsFragmentKey = (OptionChainSettingsFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, optionChainSettingsFragmentKey.accountNumber) && this.fromSideBySideChain == optionChainSettingsFragmentKey.fromSideBySideChain && Intrinsics.areEqual(this.source, optionChainSettingsFragmentKey.source) && this.isFocusedToSbsTooltipDismissedAndGreenDotVisible == optionChainSettingsFragmentKey.isFocusedToSbsTooltipDismissedAndGreenDotVisible && Intrinsics.areEqual(this.launchMode, optionChainSettingsFragmentKey.launchMode);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.fromSideBySideChain)) * 31;
        String str2 = this.source;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isFocusedToSbsTooltipDismissedAndGreenDotVisible)) * 31;
        OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
        return iHashCode2 + (optionChainLaunchMode != null ? optionChainLaunchMode.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainSettingsFragmentKey(accountNumber=" + this.accountNumber + ", fromSideBySideChain=" + this.fromSideBySideChain + ", source=" + this.source + ", isFocusedToSbsTooltipDismissedAndGreenDotVisible=" + this.isFocusedToSbsTooltipDismissedAndGreenDotVisible + ", launchMode=" + this.launchMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.fromSideBySideChain ? 1 : 0);
        dest.writeString(this.source);
        dest.writeInt(this.isFocusedToSbsTooltipDismissedAndGreenDotVisible ? 1 : 0);
        dest.writeParcelable(this.launchMode, flags);
    }

    public OptionChainSettingsFragmentKey(String str, boolean z, String str2, boolean z2, OptionChainLaunchMode optionChainLaunchMode) {
        this.accountNumber = str;
        this.fromSideBySideChain = z;
        this.source = str2;
        this.isFocusedToSbsTooltipDismissedAndGreenDotVisible = z2;
        this.launchMode = optionChainLaunchMode;
    }

    public /* synthetic */ OptionChainSettingsFragmentKey(String str, boolean z, String str2, boolean z2, OptionChainLaunchMode optionChainLaunchMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : optionChainLaunchMode);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getFromSideBySideChain() {
        return this.fromSideBySideChain;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isFocusedToSbsTooltipDismissedAndGreenDotVisible() {
        return this.isFocusedToSbsTooltipDismissedAndGreenDotVisible;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }
}
