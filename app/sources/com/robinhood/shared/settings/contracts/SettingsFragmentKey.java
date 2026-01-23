package com.robinhood.shared.settings.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SettingsFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "launchType", "Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "fromGoldUpgrade", "", "preventUpNavigation", "isFromDeeplink", "subPage", "", "itemId", "accountNumber", "accountInfo", "Lcom/robinhood/shared/settings/contracts/SettingsAccountInfo;", "showAccountSwitcher", "<init>", "(Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/settings/contracts/SettingsAccountInfo;Z)V", "getLaunchType", "()Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "getFromGoldUpgrade", "()Z", "getPreventUpNavigation", "getSubPage", "()Ljava/lang/String;", "getItemId", "getAccountNumber", "getAccountInfo", "()Lcom/robinhood/shared/settings/contracts/SettingsAccountInfo;", "getShowAccountSwitcher", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class SettingsFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<SettingsFragmentKey> CREATOR = new Creator();
    private final SettingsFragmentKey2 accountInfo;
    private final String accountNumber;
    private final boolean fromGoldUpgrade;
    private final boolean isFromDeeplink;
    private final String itemId;
    private final SettingsFragmentKey3 launchType;
    private final boolean preventUpNavigation;
    private final boolean showAccountSwitcher;
    private final String subPage;

    /* compiled from: SettingsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SettingsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            SettingsFragmentKey2 settingsFragmentKey2;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SettingsFragmentKey3 settingsFragmentKey3ValueOf = SettingsFragmentKey3.valueOf(parcel.readString());
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            String string2 = parcel.readString();
            boolean z7 = z3;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            SettingsFragmentKey2 settingsFragmentKey22 = (SettingsFragmentKey2) parcel.readParcelable(SettingsFragmentKey.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = z7;
                settingsFragmentKey2 = settingsFragmentKey22;
            } else {
                settingsFragmentKey2 = settingsFragmentKey22;
                z4 = z;
            }
            return new SettingsFragmentKey(settingsFragmentKey3ValueOf, z5, z6, z2, string2, string3, string4, settingsFragmentKey2, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsFragmentKey[] newArray(int i) {
            return new SettingsFragmentKey[i];
        }
    }

    public SettingsFragmentKey() {
        this(null, false, false, false, null, null, null, null, false, 511, null);
    }

    public static /* synthetic */ SettingsFragmentKey copy$default(SettingsFragmentKey settingsFragmentKey, SettingsFragmentKey3 settingsFragmentKey3, boolean z, boolean z2, boolean z3, String str, String str2, String str3, SettingsFragmentKey2 settingsFragmentKey2, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            settingsFragmentKey3 = settingsFragmentKey.launchType;
        }
        if ((i & 2) != 0) {
            z = settingsFragmentKey.fromGoldUpgrade;
        }
        if ((i & 4) != 0) {
            z2 = settingsFragmentKey.preventUpNavigation;
        }
        if ((i & 8) != 0) {
            z3 = settingsFragmentKey.isFromDeeplink;
        }
        if ((i & 16) != 0) {
            str = settingsFragmentKey.subPage;
        }
        if ((i & 32) != 0) {
            str2 = settingsFragmentKey.itemId;
        }
        if ((i & 64) != 0) {
            str3 = settingsFragmentKey.accountNumber;
        }
        if ((i & 128) != 0) {
            settingsFragmentKey2 = settingsFragmentKey.accountInfo;
        }
        if ((i & 256) != 0) {
            z4 = settingsFragmentKey.showAccountSwitcher;
        }
        SettingsFragmentKey2 settingsFragmentKey22 = settingsFragmentKey2;
        boolean z5 = z4;
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        boolean z6 = z2;
        return settingsFragmentKey.copy(settingsFragmentKey3, z, z6, z3, str6, str4, str5, settingsFragmentKey22, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final SettingsFragmentKey3 getLaunchType() {
        return this.launchType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromGoldUpgrade() {
        return this.fromGoldUpgrade;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPreventUpNavigation() {
        return this.preventUpNavigation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFromDeeplink() {
        return this.isFromDeeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubPage() {
        return this.subPage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final SettingsFragmentKey2 getAccountInfo() {
        return this.accountInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    public final SettingsFragmentKey copy(SettingsFragmentKey3 launchType, boolean fromGoldUpgrade, boolean preventUpNavigation, boolean isFromDeeplink, String subPage, String itemId, String accountNumber, SettingsFragmentKey2 accountInfo, boolean showAccountSwitcher) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        Intrinsics.checkNotNullParameter(subPage, "subPage");
        return new SettingsFragmentKey(launchType, fromGoldUpgrade, preventUpNavigation, isFromDeeplink, subPage, itemId, accountNumber, accountInfo, showAccountSwitcher);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsFragmentKey)) {
            return false;
        }
        SettingsFragmentKey settingsFragmentKey = (SettingsFragmentKey) other;
        return this.launchType == settingsFragmentKey.launchType && this.fromGoldUpgrade == settingsFragmentKey.fromGoldUpgrade && this.preventUpNavigation == settingsFragmentKey.preventUpNavigation && this.isFromDeeplink == settingsFragmentKey.isFromDeeplink && Intrinsics.areEqual(this.subPage, settingsFragmentKey.subPage) && Intrinsics.areEqual(this.itemId, settingsFragmentKey.itemId) && Intrinsics.areEqual(this.accountNumber, settingsFragmentKey.accountNumber) && Intrinsics.areEqual(this.accountInfo, settingsFragmentKey.accountInfo) && this.showAccountSwitcher == settingsFragmentKey.showAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.launchType.hashCode() * 31) + Boolean.hashCode(this.fromGoldUpgrade)) * 31) + Boolean.hashCode(this.preventUpNavigation)) * 31) + Boolean.hashCode(this.isFromDeeplink)) * 31) + this.subPage.hashCode()) * 31;
        String str = this.itemId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SettingsFragmentKey2 settingsFragmentKey2 = this.accountInfo;
        return ((iHashCode3 + (settingsFragmentKey2 != null ? settingsFragmentKey2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showAccountSwitcher);
    }

    public String toString() {
        return "SettingsFragmentKey(launchType=" + this.launchType + ", fromGoldUpgrade=" + this.fromGoldUpgrade + ", preventUpNavigation=" + this.preventUpNavigation + ", isFromDeeplink=" + this.isFromDeeplink + ", subPage=" + this.subPage + ", itemId=" + this.itemId + ", accountNumber=" + this.accountNumber + ", accountInfo=" + this.accountInfo + ", showAccountSwitcher=" + this.showAccountSwitcher + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.launchType.name());
        dest.writeInt(this.fromGoldUpgrade ? 1 : 0);
        dest.writeInt(this.preventUpNavigation ? 1 : 0);
        dest.writeInt(this.isFromDeeplink ? 1 : 0);
        dest.writeString(this.subPage);
        dest.writeString(this.itemId);
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.accountInfo, flags);
        dest.writeInt(this.showAccountSwitcher ? 1 : 0);
    }

    public SettingsFragmentKey(SettingsFragmentKey3 launchType, boolean z, boolean z2, boolean z3, String subPage, String str, String str2, SettingsFragmentKey2 settingsFragmentKey2, boolean z4) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        Intrinsics.checkNotNullParameter(subPage, "subPage");
        this.launchType = launchType;
        this.fromGoldUpgrade = z;
        this.preventUpNavigation = z2;
        this.isFromDeeplink = z3;
        this.subPage = subPage;
        this.itemId = str;
        this.accountNumber = str2;
        this.accountInfo = settingsFragmentKey2;
        this.showAccountSwitcher = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SettingsFragmentKey(com.robinhood.shared.settings.contracts.SettingsFragmentKey3 r3, boolean r4, boolean r5, boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.robinhood.shared.settings.contracts.SettingsFragmentKey2 r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            com.robinhood.shared.settings.contracts.SettingsLaunchType r3 = com.robinhood.shared.settings.contracts.SettingsFragmentKey3.LAUNCH_NONE
        L6:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lc
            r4 = r0
        Lc:
            r13 = r12 & 4
            if (r13 == 0) goto L11
            r5 = r0
        L11:
            r13 = r12 & 8
            if (r13 == 0) goto L16
            r6 = r0
        L16:
            r13 = r12 & 16
            if (r13 == 0) goto L1c
            java.lang.String r7 = ""
        L1c:
            r13 = r12 & 32
            r1 = 0
            if (r13 == 0) goto L22
            r8 = r1
        L22:
            r13 = r12 & 64
            if (r13 == 0) goto L27
            r9 = r1
        L27:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L2c
            r10 = r1
        L2c:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3b
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L45
        L3b:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L45:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.settings.contracts.SettingsFragmentKey.<init>(com.robinhood.shared.settings.contracts.SettingsLaunchType, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.robinhood.shared.settings.contracts.SettingsAccountInfo, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final SettingsFragmentKey3 getLaunchType() {
        return this.launchType;
    }

    public final boolean getFromGoldUpgrade() {
        return this.fromGoldUpgrade;
    }

    public final boolean getPreventUpNavigation() {
        return this.preventUpNavigation;
    }

    public final boolean isFromDeeplink() {
        return this.isFromDeeplink;
    }

    public final String getSubPage() {
        return this.subPage;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final SettingsFragmentKey2 getAccountInfo() {
        return this.accountInfo;
    }

    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
