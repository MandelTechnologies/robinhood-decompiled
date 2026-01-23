package com.robinhood.shared.gdpr.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$EntryPoint;", "<init>", "(Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$EntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$EntryPoint;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "EntryPoint", "ButtonType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class PrivacySettingsFragmentKey implements TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<PrivacySettingsFragmentKey> CREATOR = new Creator();
    private final EntryPoint entryPoint;

    /* compiled from: PrivacySettingsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PrivacySettingsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivacySettingsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrivacySettingsFragmentKey(EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivacySettingsFragmentKey[] newArray(int i) {
            return new PrivacySettingsFragmentKey[i];
        }
    }

    public static /* synthetic */ PrivacySettingsFragmentKey copy$default(PrivacySettingsFragmentKey privacySettingsFragmentKey, EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = privacySettingsFragmentKey.entryPoint;
        }
        return privacySettingsFragmentKey.copy(entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final PrivacySettingsFragmentKey copy(EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new PrivacySettingsFragmentKey(entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PrivacySettingsFragmentKey) && this.entryPoint == ((PrivacySettingsFragmentKey) other).entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return "PrivacySettingsFragmentKey(entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entryPoint.name());
    }

    public PrivacySettingsFragmentKey(EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entryPoint = entryPoint;
    }

    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacySettingsFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$EntryPoint;", "", "buttonType", "Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;", "shouldShowSaveAndContinue", "", "shouldAutoDismissWithDelayOnAcceptAll", "shouldImplicitlyDeclineOnClose", "analyticsIdentifier", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;ZZZLjava/lang/String;)V", "getButtonType", "()Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;", "getShouldShowSaveAndContinue", "()Z", "getShouldAutoDismissWithDelayOnAcceptAll", "getShouldImplicitlyDeclineOnClose", "getAnalyticsIdentifier", "()Ljava/lang/String;", "MODAL", "MANAGE_YOUR_DATA", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class EntryPoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        private final String analyticsIdentifier;
        private final ButtonType buttonType;
        private final boolean shouldAutoDismissWithDelayOnAcceptAll;
        private final boolean shouldImplicitlyDeclineOnClose;
        private final boolean shouldShowSaveAndContinue;
        public static final EntryPoint MODAL = new EntryPoint("MODAL", 0, ButtonType.CLOSE_BUTTON, true, true, true, "onboarding");
        public static final EntryPoint MANAGE_YOUR_DATA = new EntryPoint("MANAGE_YOUR_DATA", 1, ButtonType.BACK_BUTTON, false, false, false, "settings");

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{MODAL, MANAGE_YOUR_DATA};
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, ButtonType buttonType, boolean z, boolean z2, boolean z3, String str2) {
            this.buttonType = buttonType;
            this.shouldShowSaveAndContinue = z;
            this.shouldAutoDismissWithDelayOnAcceptAll = z2;
            this.shouldImplicitlyDeclineOnClose = z3;
            this.analyticsIdentifier = str2;
        }

        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        public final boolean getShouldShowSaveAndContinue() {
            return this.shouldShowSaveAndContinue;
        }

        public final boolean getShouldAutoDismissWithDelayOnAcceptAll() {
            return this.shouldAutoDismissWithDelayOnAcceptAll;
        }

        public final boolean getShouldImplicitlyDeclineOnClose() {
            return this.shouldImplicitlyDeclineOnClose;
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacySettingsFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK_BUTTON", "CLOSE_BUTTON", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class ButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType BACK_BUTTON = new ButtonType("BACK_BUTTON", 0);
        public static final ButtonType CLOSE_BUTTON = new ButtonType("CLOSE_BUTTON", 1);

        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{BACK_BUTTON, CLOSE_BUTTON};
        }

        public static EnumEntries<ButtonType> getEntries() {
            return $ENTRIES;
        }

        private ButtonType(String str, int i) {
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonTypeArr$values);
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
