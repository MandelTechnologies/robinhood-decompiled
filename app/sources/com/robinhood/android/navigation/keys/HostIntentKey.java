package com.robinhood.android.navigation.keys;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HostIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/HostIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "ShowFragmentInStandaloneActivity", "ShowFragmentInStandaloneRdsActivity", "ShowFragmentInTab", "DialogFragmentHost", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface HostIntentKey extends IntentKey {

    /* compiled from: HostIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(HostIntentKey hostIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(hostIntentKey);
        }
    }

    /* compiled from: HostIntentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "Landroid/os/Parcelable;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "requiresAuthentication", "", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Z)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getRequiresAuthentication", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowFragmentInStandaloneActivity implements HostIntentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ShowFragmentInStandaloneActivity> CREATOR = new Creator();
        private final FragmentKey fragmentKey;
        private final boolean requiresAuthentication;

        /* compiled from: HostIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShowFragmentInStandaloneActivity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInStandaloneActivity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowFragmentInStandaloneActivity((FragmentKey) parcel.readParcelable(ShowFragmentInStandaloneActivity.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInStandaloneActivity[] newArray(int i) {
                return new ShowFragmentInStandaloneActivity[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fragmentKey, flags);
            dest.writeInt(this.requiresAuthentication ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public ShowFragmentInStandaloneActivity(FragmentKey fragmentKey, boolean z) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
            this.requiresAuthentication = z;
        }

        public /* synthetic */ ShowFragmentInStandaloneActivity(FragmentKey fragmentKey, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentKey, (i & 2) != 0 ? true : z);
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }
    }

    /* compiled from: HostIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneRdsActivity;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "Landroid/os/Parcelable;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "allowLandscapeMode", "", "requiresAuthentication", "useCloseIcon", "allowMainBanner", "shouldPromptForLockscreen", "forceDarkMode", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;ZZZZZZ)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getAllowLandscapeMode", "()Z", "getRequiresAuthentication", "getUseCloseIcon", "getAllowMainBanner", "getShouldPromptForLockscreen", "getForceDarkMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragmentInStandaloneRdsActivity implements HostIntentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ShowFragmentInStandaloneRdsActivity> CREATOR = new Creator();
        private final boolean allowLandscapeMode;
        private final boolean allowMainBanner;
        private final boolean forceDarkMode;
        private final FragmentKey fragmentKey;
        private final boolean requiresAuthentication;
        private final boolean shouldPromptForLockscreen;
        private final boolean useCloseIcon;

        /* compiled from: HostIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShowFragmentInStandaloneRdsActivity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInStandaloneRdsActivity createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                FragmentKey fragmentKey = (FragmentKey) parcel.readParcelable(ShowFragmentInStandaloneRdsActivity.class.getClassLoader());
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z5 = z;
                }
                return new ShowFragmentInStandaloneRdsActivity(fragmentKey, z6, z7, z2, z3, z4, z5);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInStandaloneRdsActivity[] newArray(int i) {
                return new ShowFragmentInStandaloneRdsActivity[i];
            }
        }

        public static /* synthetic */ ShowFragmentInStandaloneRdsActivity copy$default(ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity, FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = showFragmentInStandaloneRdsActivity.fragmentKey;
            }
            if ((i & 2) != 0) {
                z = showFragmentInStandaloneRdsActivity.allowLandscapeMode;
            }
            if ((i & 4) != 0) {
                z2 = showFragmentInStandaloneRdsActivity.requiresAuthentication;
            }
            if ((i & 8) != 0) {
                z3 = showFragmentInStandaloneRdsActivity.useCloseIcon;
            }
            if ((i & 16) != 0) {
                z4 = showFragmentInStandaloneRdsActivity.allowMainBanner;
            }
            if ((i & 32) != 0) {
                z5 = showFragmentInStandaloneRdsActivity.shouldPromptForLockscreen;
            }
            if ((i & 64) != 0) {
                z6 = showFragmentInStandaloneRdsActivity.forceDarkMode;
            }
            boolean z7 = z5;
            boolean z8 = z6;
            boolean z9 = z4;
            boolean z10 = z2;
            return showFragmentInStandaloneRdsActivity.copy(fragmentKey, z, z10, z3, z9, z7, z8);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAllowLandscapeMode() {
            return this.allowLandscapeMode;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseCloseIcon() {
            return this.useCloseIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAllowMainBanner() {
            return this.allowMainBanner;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldPromptForLockscreen() {
            return this.shouldPromptForLockscreen;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        public final ShowFragmentInStandaloneRdsActivity copy(FragmentKey fragmentKey, boolean allowLandscapeMode, boolean requiresAuthentication, boolean useCloseIcon, boolean allowMainBanner, boolean shouldPromptForLockscreen, boolean forceDarkMode) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowFragmentInStandaloneRdsActivity(fragmentKey, allowLandscapeMode, requiresAuthentication, useCloseIcon, allowMainBanner, shouldPromptForLockscreen, forceDarkMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFragmentInStandaloneRdsActivity)) {
                return false;
            }
            ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity = (ShowFragmentInStandaloneRdsActivity) other;
            return Intrinsics.areEqual(this.fragmentKey, showFragmentInStandaloneRdsActivity.fragmentKey) && this.allowLandscapeMode == showFragmentInStandaloneRdsActivity.allowLandscapeMode && this.requiresAuthentication == showFragmentInStandaloneRdsActivity.requiresAuthentication && this.useCloseIcon == showFragmentInStandaloneRdsActivity.useCloseIcon && this.allowMainBanner == showFragmentInStandaloneRdsActivity.allowMainBanner && this.shouldPromptForLockscreen == showFragmentInStandaloneRdsActivity.shouldPromptForLockscreen && this.forceDarkMode == showFragmentInStandaloneRdsActivity.forceDarkMode;
        }

        public int hashCode() {
            return (((((((((((this.fragmentKey.hashCode() * 31) + Boolean.hashCode(this.allowLandscapeMode)) * 31) + Boolean.hashCode(this.requiresAuthentication)) * 31) + Boolean.hashCode(this.useCloseIcon)) * 31) + Boolean.hashCode(this.allowMainBanner)) * 31) + Boolean.hashCode(this.shouldPromptForLockscreen)) * 31) + Boolean.hashCode(this.forceDarkMode);
        }

        public String toString() {
            return "ShowFragmentInStandaloneRdsActivity(fragmentKey=" + this.fragmentKey + ", allowLandscapeMode=" + this.allowLandscapeMode + ", requiresAuthentication=" + this.requiresAuthentication + ", useCloseIcon=" + this.useCloseIcon + ", allowMainBanner=" + this.allowMainBanner + ", shouldPromptForLockscreen=" + this.shouldPromptForLockscreen + ", forceDarkMode=" + this.forceDarkMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fragmentKey, flags);
            dest.writeInt(this.allowLandscapeMode ? 1 : 0);
            dest.writeInt(this.requiresAuthentication ? 1 : 0);
            dest.writeInt(this.useCloseIcon ? 1 : 0);
            dest.writeInt(this.allowMainBanner ? 1 : 0);
            dest.writeInt(this.shouldPromptForLockscreen ? 1 : 0);
            dest.writeInt(this.forceDarkMode ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public ShowFragmentInStandaloneRdsActivity(FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
            this.allowLandscapeMode = z;
            this.requiresAuthentication = z2;
            this.useCloseIcon = z3;
            this.allowMainBanner = z4;
            this.shouldPromptForLockscreen = z5;
            this.forceDarkMode = z6;
        }

        public /* synthetic */ ShowFragmentInStandaloneRdsActivity(FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentKey, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6);
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final boolean getAllowLandscapeMode() {
            return this.allowLandscapeMode;
        }

        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }

        public final boolean getUseCloseIcon() {
            return this.useCloseIcon;
        }

        public final boolean getAllowMainBanner() {
            return this.allowMainBanner;
        }

        public final boolean getShouldPromptForLockscreen() {
            return this.shouldPromptForLockscreen;
        }

        public final boolean getForceDarkMode() {
            return this.forceDarkMode;
        }
    }

    /* compiled from: HostIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInTab;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "Landroid/os/Parcelable;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "addToBackstack", "", "clearBackstack", "defaultTabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;ZZLcom/robinhood/android/navigation/keys/FragmentTab;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getAddToBackstack", "()Z", "getClearBackstack", "getDefaultTabOverride", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowFragmentInTab implements HostIntentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ShowFragmentInTab> CREATOR = new Creator();
        private final boolean addToBackstack;
        private final boolean clearBackstack;
        private final FragmentTab defaultTabOverride;
        private final FragmentKey fragmentKey;

        /* compiled from: HostIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShowFragmentInTab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowFragmentInTab((FragmentKey) parcel.readParcelable(ShowFragmentInTab.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : FragmentTab.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFragmentInTab[] newArray(int i) {
                return new ShowFragmentInTab[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fragmentKey, flags);
            dest.writeInt(this.addToBackstack ? 1 : 0);
            dest.writeInt(this.clearBackstack ? 1 : 0);
            FragmentTab fragmentTab = this.defaultTabOverride;
            if (fragmentTab == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(fragmentTab.name());
            }
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public ShowFragmentInTab(FragmentKey fragmentKey, boolean z, boolean z2, FragmentTab fragmentTab) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
            this.addToBackstack = z;
            this.clearBackstack = z2;
            this.defaultTabOverride = fragmentTab;
        }

        public /* synthetic */ ShowFragmentInTab(FragmentKey fragmentKey, boolean z, boolean z2, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentKey, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : fragmentTab);
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final boolean getAddToBackstack() {
            return this.addToBackstack;
        }

        public final boolean getClearBackstack() {
            return this.clearBackstack;
        }

        public final FragmentTab getDefaultTabOverride() {
            return this.defaultTabOverride;
        }
    }

    /* compiled from: HostIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/HostIntentKey$DialogFragmentHost;", "K", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "dialogFragmentKey", "<init>", "(Landroid/os/Parcelable;)V", "getDialogFragmentKey", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DialogFragmentHost<K extends Parcelable & DialogFragmentKey> implements HostIntentKey {
        public static final int $stable = 0;
        private final K dialogFragmentKey;

        public DialogFragmentHost(K dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final K getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }
}
