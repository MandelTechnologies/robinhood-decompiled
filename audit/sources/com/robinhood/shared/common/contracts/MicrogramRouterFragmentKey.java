package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramSource;

/* compiled from: MicrogramRouterFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/MicrogramRouterFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "source", "Lmicrogram/android/MicrogramSource;", "deeplink", "", "discriminator", "loadingContent", "Lcom/robinhood/shared/common/contracts/LoadingContent;", "navButtonType", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "<init>", "(Lmicrogram/android/MicrogramSource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/LoadingContent;Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;)V", "getSource", "()Lmicrogram/android/MicrogramSource;", "getDeeplink", "()Ljava/lang/String;", "getDiscriminator", "getLoadingContent", "()Lcom/robinhood/shared/common/contracts/LoadingContent;", "getNavButtonType", "()Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class MicrogramRouterFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<MicrogramRouterFragmentKey> CREATOR = new Creator();
    private final String deeplink;
    private final String discriminator;
    private final MicrogramRouterFragmentKey2 loadingContent;
    private final MicrogramRouterFragmentKey3 navButtonType;
    private final MicrogramSource source;

    /* compiled from: MicrogramRouterFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<MicrogramRouterFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramRouterFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MicrogramRouterFragmentKey((MicrogramSource) parcel.readParcelable(MicrogramRouterFragmentKey.class.getClassLoader()), parcel.readString(), parcel.readString(), MicrogramRouterFragmentKey2.valueOf(parcel.readString()), MicrogramRouterFragmentKey3.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramRouterFragmentKey[] newArray(int i) {
            return new MicrogramRouterFragmentKey[i];
        }
    }

    public static /* synthetic */ MicrogramRouterFragmentKey copy$default(MicrogramRouterFragmentKey microgramRouterFragmentKey, MicrogramSource microgramSource, String str, String str2, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramSource = microgramRouterFragmentKey.source;
        }
        if ((i & 2) != 0) {
            str = microgramRouterFragmentKey.deeplink;
        }
        if ((i & 4) != 0) {
            str2 = microgramRouterFragmentKey.discriminator;
        }
        if ((i & 8) != 0) {
            microgramRouterFragmentKey2 = microgramRouterFragmentKey.loadingContent;
        }
        if ((i & 16) != 0) {
            microgramRouterFragmentKey3 = microgramRouterFragmentKey.navButtonType;
        }
        MicrogramRouterFragmentKey3 microgramRouterFragmentKey32 = microgramRouterFragmentKey3;
        String str3 = str2;
        return microgramRouterFragmentKey.copy(microgramSource, str, str3, microgramRouterFragmentKey2, microgramRouterFragmentKey32);
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

    public final MicrogramRouterFragmentKey copy(MicrogramSource source, String deeplink, String discriminator, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
        Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
        return new MicrogramRouterFragmentKey(source, deeplink, discriminator, loadingContent, navButtonType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicrogramRouterFragmentKey)) {
            return false;
        }
        MicrogramRouterFragmentKey microgramRouterFragmentKey = (MicrogramRouterFragmentKey) other;
        return Intrinsics.areEqual(this.source, microgramRouterFragmentKey.source) && Intrinsics.areEqual(this.deeplink, microgramRouterFragmentKey.deeplink) && Intrinsics.areEqual(this.discriminator, microgramRouterFragmentKey.discriminator) && this.loadingContent == microgramRouterFragmentKey.loadingContent && this.navButtonType == microgramRouterFragmentKey.navButtonType;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.deeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discriminator;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.loadingContent.hashCode()) * 31) + this.navButtonType.hashCode();
    }

    public String toString() {
        return "MicrogramRouterFragmentKey(source=" + this.source + ", deeplink=" + this.deeplink + ", discriminator=" + this.discriminator + ", loadingContent=" + this.loadingContent + ", navButtonType=" + this.navButtonType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.source, flags);
        dest.writeString(this.deeplink);
        dest.writeString(this.discriminator);
        dest.writeString(this.loadingContent.name());
        dest.writeString(this.navButtonType.name());
    }

    public MicrogramRouterFragmentKey(MicrogramSource source, String str, String str2, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
        Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
        this.source = source;
        this.deeplink = str;
        this.discriminator = str2;
        this.loadingContent = loadingContent;
        this.navButtonType = navButtonType;
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

    public /* synthetic */ MicrogramRouterFragmentKey(MicrogramSource microgramSource, String str, String str2, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(microgramSource, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? MicrogramRouterFragmentKey2.HERO : microgramRouterFragmentKey2, (i & 16) != 0 ? MicrogramRouterFragmentKey3.BACK : microgramRouterFragmentKey3);
    }

    public final MicrogramRouterFragmentKey2 getLoadingContent() {
        return this.loadingContent;
    }

    public final MicrogramRouterFragmentKey3 getNavButtonType() {
        return this.navButtonType;
    }
}
