package com.robinhood.android.navigation.keys;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.deeplink.DeeplinkResolverActivity;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "DeepLinkResolver", "UnrecognizedDeepLink", "RegionGatedLoggingContext", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DeepLinkIntentKey extends IntentKey {

    /* compiled from: DeepLinkIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(DeepLinkIntentKey deepLinkIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(deepLinkIntentKey);
        }
    }

    /* compiled from: DeepLinkIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$DeepLinkResolver;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "uri", "Landroid/net/Uri;", DeeplinkResolverActivity.KEY_SHOULD_CLEAR_TOP_OVERRIDE, "", DeeplinkResolverActivity.KEY_CURRENT_SCARLET_THEME, "Landroid/os/Parcelable;", "<init>", "(Landroid/net/Uri;Ljava/lang/Boolean;Landroid/os/Parcelable;)V", "getUri", "()Landroid/net/Uri;", "getShouldClearTopOverride", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentScarletTheme", "()Landroid/os/Parcelable;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class DeepLinkResolver implements HostIntentKey {
        public static final int $stable = 8;
        private final Parcelable currentScarletTheme;
        private final Boolean shouldClearTopOverride;
        private final Uri uri;

        public DeepLinkResolver(Uri uri, Boolean bool, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.shouldClearTopOverride = bool;
            this.currentScarletTheme = parcelable;
        }

        public /* synthetic */ DeepLinkResolver(Uri uri, Boolean bool, Parcelable parcelable, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : parcelable);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return HostIntentKey.DefaultImpls.getNavigationType(this);
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final Boolean getShouldClearTopOverride() {
            return this.shouldClearTopOverride;
        }

        public final Parcelable getCurrentScarletTheme() {
            return this.currentScarletTheme;
        }
    }

    /* compiled from: DeepLinkIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$UnrecognizedDeepLink;", "Lcom/robinhood/android/navigation/keys/HostIntentKey;", "Landroid/os/Parcelable;", "relaunchAppOnDismiss", "", "launchPlayStoreImmediately", "regionGatedLoggingContext", "Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$RegionGatedLoggingContext;", "<init>", "(ZZLcom/robinhood/android/navigation/keys/DeepLinkIntentKey$RegionGatedLoggingContext;)V", "getRelaunchAppOnDismiss", "()Z", "getLaunchPlayStoreImmediately", "getRegionGatedLoggingContext", "()Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$RegionGatedLoggingContext;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class UnrecognizedDeepLink implements HostIntentKey, Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<UnrecognizedDeepLink> CREATOR = new Creator();
        private final boolean launchPlayStoreImmediately;
        private final RegionGatedLoggingContext regionGatedLoggingContext;
        private final boolean relaunchAppOnDismiss;

        /* compiled from: DeepLinkIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UnrecognizedDeepLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnrecognizedDeepLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnrecognizedDeepLink(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : RegionGatedLoggingContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnrecognizedDeepLink[] newArray(int i) {
                return new UnrecognizedDeepLink[i];
            }
        }

        public UnrecognizedDeepLink() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ UnrecognizedDeepLink copy$default(UnrecognizedDeepLink unrecognizedDeepLink, boolean z, boolean z2, RegionGatedLoggingContext regionGatedLoggingContext, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unrecognizedDeepLink.relaunchAppOnDismiss;
            }
            if ((i & 2) != 0) {
                z2 = unrecognizedDeepLink.launchPlayStoreImmediately;
            }
            if ((i & 4) != 0) {
                regionGatedLoggingContext = unrecognizedDeepLink.regionGatedLoggingContext;
            }
            return unrecognizedDeepLink.copy(z, z2, regionGatedLoggingContext);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRelaunchAppOnDismiss() {
            return this.relaunchAppOnDismiss;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLaunchPlayStoreImmediately() {
            return this.launchPlayStoreImmediately;
        }

        /* renamed from: component3, reason: from getter */
        public final RegionGatedLoggingContext getRegionGatedLoggingContext() {
            return this.regionGatedLoggingContext;
        }

        public final UnrecognizedDeepLink copy(boolean relaunchAppOnDismiss, boolean launchPlayStoreImmediately, RegionGatedLoggingContext regionGatedLoggingContext) {
            return new UnrecognizedDeepLink(relaunchAppOnDismiss, launchPlayStoreImmediately, regionGatedLoggingContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnrecognizedDeepLink)) {
                return false;
            }
            UnrecognizedDeepLink unrecognizedDeepLink = (UnrecognizedDeepLink) other;
            return this.relaunchAppOnDismiss == unrecognizedDeepLink.relaunchAppOnDismiss && this.launchPlayStoreImmediately == unrecognizedDeepLink.launchPlayStoreImmediately && Intrinsics.areEqual(this.regionGatedLoggingContext, unrecognizedDeepLink.regionGatedLoggingContext);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.relaunchAppOnDismiss) * 31) + Boolean.hashCode(this.launchPlayStoreImmediately)) * 31;
            RegionGatedLoggingContext regionGatedLoggingContext = this.regionGatedLoggingContext;
            return iHashCode + (regionGatedLoggingContext == null ? 0 : regionGatedLoggingContext.hashCode());
        }

        public String toString() {
            return "UnrecognizedDeepLink(relaunchAppOnDismiss=" + this.relaunchAppOnDismiss + ", launchPlayStoreImmediately=" + this.launchPlayStoreImmediately + ", regionGatedLoggingContext=" + this.regionGatedLoggingContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.relaunchAppOnDismiss ? 1 : 0);
            dest.writeInt(this.launchPlayStoreImmediately ? 1 : 0);
            RegionGatedLoggingContext regionGatedLoggingContext = this.regionGatedLoggingContext;
            if (regionGatedLoggingContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                regionGatedLoggingContext.writeToParcel(dest, flags);
            }
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return HostIntentKey.DefaultImpls.getNavigationType(this);
        }

        public UnrecognizedDeepLink(boolean z, boolean z2, RegionGatedLoggingContext regionGatedLoggingContext) {
            this.relaunchAppOnDismiss = z;
            this.launchPlayStoreImmediately = z2;
            this.regionGatedLoggingContext = regionGatedLoggingContext;
        }

        public /* synthetic */ UnrecognizedDeepLink(boolean z, boolean z2, RegionGatedLoggingContext regionGatedLoggingContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : regionGatedLoggingContext);
        }

        public final boolean getRelaunchAppOnDismiss() {
            return this.relaunchAppOnDismiss;
        }

        public final boolean getLaunchPlayStoreImmediately() {
            return this.launchPlayStoreImmediately;
        }

        public final RegionGatedLoggingContext getRegionGatedLoggingContext() {
            return this.regionGatedLoggingContext;
        }
    }

    /* compiled from: DeepLinkIntentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$RegionGatedLoggingContext;", "Landroid/os/Parcelable;", "deeplinkPath", "", "regionGates", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeeplinkPath", "()Ljava/lang/String;", "getRegionGates", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RegionGatedLoggingContext implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<RegionGatedLoggingContext> CREATOR = new Creator();
        private final String deeplinkPath;
        private final String regionGates;

        /* compiled from: DeepLinkIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RegionGatedLoggingContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegionGatedLoggingContext createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegionGatedLoggingContext(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegionGatedLoggingContext[] newArray(int i) {
                return new RegionGatedLoggingContext[i];
            }
        }

        public static /* synthetic */ RegionGatedLoggingContext copy$default(RegionGatedLoggingContext regionGatedLoggingContext, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = regionGatedLoggingContext.deeplinkPath;
            }
            if ((i & 2) != 0) {
                str2 = regionGatedLoggingContext.regionGates;
            }
            return regionGatedLoggingContext.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplinkPath() {
            return this.deeplinkPath;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegionGates() {
            return this.regionGates;
        }

        public final RegionGatedLoggingContext copy(String deeplinkPath, String regionGates) {
            Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
            return new RegionGatedLoggingContext(deeplinkPath, regionGates);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionGatedLoggingContext)) {
                return false;
            }
            RegionGatedLoggingContext regionGatedLoggingContext = (RegionGatedLoggingContext) other;
            return Intrinsics.areEqual(this.deeplinkPath, regionGatedLoggingContext.deeplinkPath) && Intrinsics.areEqual(this.regionGates, regionGatedLoggingContext.regionGates);
        }

        public int hashCode() {
            int iHashCode = this.deeplinkPath.hashCode() * 31;
            String str = this.regionGates;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RegionGatedLoggingContext(deeplinkPath=" + this.deeplinkPath + ", regionGates=" + this.regionGates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.deeplinkPath);
            dest.writeString(this.regionGates);
        }

        public RegionGatedLoggingContext(String deeplinkPath, String str) {
            Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
            this.deeplinkPath = deeplinkPath;
            this.regionGates = str;
        }

        public final String getDeeplinkPath() {
            return this.deeplinkPath;
        }

        public final String getRegionGates() {
            return this.regionGates;
        }
    }
}
