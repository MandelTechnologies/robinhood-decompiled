package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramSource;

/* compiled from: MicrogramRouterFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/MicrogramRouterTabFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "source", "Lmicrogram/android/MicrogramSource;", "deeplink", "", "discriminator", "loadingContent", "Lcom/robinhood/shared/common/contracts/LoadingContent;", "navButtonType", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Lmicrogram/android/MicrogramSource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/LoadingContent;Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getSource", "()Lmicrogram/android/MicrogramSource;", "getDeeplink", "()Ljava/lang/String;", "getDiscriminator", "getLoadingContent", "()Lcom/robinhood/shared/common/contracts/LoadingContent;", "getNavButtonType", "()Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class MicrogramRouterTabFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<MicrogramRouterTabFragmentKey> CREATOR = new Creator();
    private final String deeplink;
    private final FragmentTab defaultTab;
    private final String discriminator;
    private final MicrogramRouterFragmentKey2 loadingContent;
    private final MicrogramRouterFragmentKey3 navButtonType;
    private final MicrogramSource source;

    /* compiled from: MicrogramRouterFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<MicrogramRouterTabFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramRouterTabFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MicrogramRouterTabFragmentKey((MicrogramSource) parcel.readParcelable(MicrogramRouterTabFragmentKey.class.getClassLoader()), parcel.readString(), parcel.readString(), MicrogramRouterFragmentKey2.valueOf(parcel.readString()), MicrogramRouterFragmentKey3.valueOf(parcel.readString()), FragmentTab.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramRouterTabFragmentKey[] newArray(int i) {
            return new MicrogramRouterTabFragmentKey[i];
        }
    }

    public static /* synthetic */ MicrogramRouterTabFragmentKey copy$default(MicrogramRouterTabFragmentKey microgramRouterTabFragmentKey, MicrogramSource microgramSource, String str, String str2, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, FragmentTab fragmentTab, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramSource = microgramRouterTabFragmentKey.source;
        }
        if ((i & 2) != 0) {
            str = microgramRouterTabFragmentKey.deeplink;
        }
        if ((i & 4) != 0) {
            str2 = microgramRouterTabFragmentKey.discriminator;
        }
        if ((i & 8) != 0) {
            microgramRouterFragmentKey2 = microgramRouterTabFragmentKey.loadingContent;
        }
        if ((i & 16) != 0) {
            microgramRouterFragmentKey3 = microgramRouterTabFragmentKey.navButtonType;
        }
        if ((i & 32) != 0) {
            fragmentTab = microgramRouterTabFragmentKey.defaultTab;
        }
        MicrogramRouterFragmentKey3 microgramRouterFragmentKey32 = microgramRouterFragmentKey3;
        FragmentTab fragmentTab2 = fragmentTab;
        return microgramRouterTabFragmentKey.copy(microgramSource, str, str2, microgramRouterFragmentKey2, microgramRouterFragmentKey32, fragmentTab2);
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDiscriminator() {
        return this.discriminator;
    }

    /* renamed from: component4, reason: from getter */
    public final MicrogramRouterFragmentKey2 getLoadingContent() {
        return this.loadingContent;
    }

    /* renamed from: component5, reason: from getter */
    public final MicrogramRouterFragmentKey3 getNavButtonType() {
        return this.navButtonType;
    }

    /* renamed from: component6, reason: from getter */
    public final FragmentTab getDefaultTab() {
        return this.defaultTab;
    }

    public final MicrogramRouterTabFragmentKey copy(MicrogramSource source, String deeplink, String discriminator, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType, FragmentTab defaultTab) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
        Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new MicrogramRouterTabFragmentKey(source, deeplink, discriminator, loadingContent, navButtonType, defaultTab);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicrogramRouterTabFragmentKey)) {
            return false;
        }
        MicrogramRouterTabFragmentKey microgramRouterTabFragmentKey = (MicrogramRouterTabFragmentKey) other;
        return Intrinsics.areEqual(this.source, microgramRouterTabFragmentKey.source) && Intrinsics.areEqual(this.deeplink, microgramRouterTabFragmentKey.deeplink) && Intrinsics.areEqual(this.discriminator, microgramRouterTabFragmentKey.discriminator) && this.loadingContent == microgramRouterTabFragmentKey.loadingContent && this.navButtonType == microgramRouterTabFragmentKey.navButtonType && this.defaultTab == microgramRouterTabFragmentKey.defaultTab;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.deeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discriminator;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.loadingContent.hashCode()) * 31) + this.navButtonType.hashCode()) * 31) + this.defaultTab.hashCode();
    }

    public String toString() {
        return "MicrogramRouterTabFragmentKey(source=" + this.source + ", deeplink=" + this.deeplink + ", discriminator=" + this.discriminator + ", loadingContent=" + this.loadingContent + ", navButtonType=" + this.navButtonType + ", defaultTab=" + this.defaultTab + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.source, flags);
        dest.writeString(this.deeplink);
        dest.writeString(this.discriminator);
        dest.writeString(this.loadingContent.name());
        dest.writeString(this.navButtonType.name());
        dest.writeString(this.defaultTab.name());
    }

    public MicrogramRouterTabFragmentKey(MicrogramSource source, String str, String str2, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType, FragmentTab defaultTab) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
        Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        this.source = source;
        this.deeplink = str;
        this.discriminator = str2;
        this.loadingContent = loadingContent;
        this.navButtonType = navButtonType;
        this.defaultTab = defaultTab;
    }

    public final MicrogramSource getSource() {
        return this.source;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getDiscriminator() {
        return this.discriminator;
    }

    public /* synthetic */ MicrogramRouterTabFragmentKey(MicrogramSource microgramSource, String str, String str2, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(microgramSource, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? MicrogramRouterFragmentKey2.HERO : microgramRouterFragmentKey2, (i & 16) != 0 ? MicrogramRouterFragmentKey3.BACK : microgramRouterFragmentKey3, (i & 32) != 0 ? FragmentTab.CURRENT_TAB : fragmentTab);
    }

    public final MicrogramRouterFragmentKey2 getLoadingContent() {
        return this.loadingContent;
    }

    public final MicrogramRouterFragmentKey3 getNavButtonType() {
        return this.navButtonType;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return this.defaultTab;
    }
}
