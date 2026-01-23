package com.robinhood.shared.rhweb.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebIntentKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "allowCameraAccess", "", "allowFileAccess", "convertToRhWebLink", "destinationUri", "Landroid/net/Uri;", "hideToolbar", "openNewWindowInSystem", "blockScreenSharing", "acceptThirdPartyCookies", "requiresAuthentication", "<init>", "(ZZZLandroid/net/Uri;ZZZZZ)V", "getAllowCameraAccess", "()Z", "getAllowFileAccess", "getConvertToRhWebLink", "getDestinationUri", "()Landroid/net/Uri;", "getHideToolbar", "getOpenNewWindowInSystem", "getBlockScreenSharing", "getAcceptThirdPartyCookies", "getRequiresAuthentication", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhWebIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RhWebIntentKey> CREATOR = new Creator();
    private final boolean acceptThirdPartyCookies;
    private final boolean allowCameraAccess;
    private final boolean allowFileAccess;
    private final boolean blockScreenSharing;
    private final boolean convertToRhWebLink;
    private final Uri destinationUri;
    private final boolean hideToolbar;
    private final boolean openNewWindowInSystem;
    private final boolean requiresAuthentication;

    /* compiled from: RhWebIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<RhWebIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhWebIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Uri uri;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z9 = false;
            boolean z10 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z9 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z10 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            Uri uri2 = (Uri) parcel.readParcelable(RhWebIntentKey.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = z3;
                uri = uri2;
                z5 = z4;
            } else {
                z4 = z3;
                uri = uri2;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
            } else {
                z7 = z6;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z8 = z7;
            } else {
                z8 = z7;
                z7 = z;
            }
            if (parcel.readInt() == 0) {
                z8 = z;
            }
            return new RhWebIntentKey(z9, z10, z2, uri, z5, z4, z6, z7, z8);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhWebIntentKey[] newArray(int i) {
            return new RhWebIntentKey[i];
        }
    }

    public static /* synthetic */ RhWebIntentKey copy$default(RhWebIntentKey rhWebIntentKey, boolean z, boolean z2, boolean z3, Uri uri, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhWebIntentKey.allowCameraAccess;
        }
        if ((i & 2) != 0) {
            z2 = rhWebIntentKey.allowFileAccess;
        }
        if ((i & 4) != 0) {
            z3 = rhWebIntentKey.convertToRhWebLink;
        }
        if ((i & 8) != 0) {
            uri = rhWebIntentKey.destinationUri;
        }
        if ((i & 16) != 0) {
            z4 = rhWebIntentKey.hideToolbar;
        }
        if ((i & 32) != 0) {
            z5 = rhWebIntentKey.openNewWindowInSystem;
        }
        if ((i & 64) != 0) {
            z6 = rhWebIntentKey.blockScreenSharing;
        }
        if ((i & 128) != 0) {
            z7 = rhWebIntentKey.acceptThirdPartyCookies;
        }
        if ((i & 256) != 0) {
            z8 = rhWebIntentKey.requiresAuthentication;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        boolean z11 = z5;
        boolean z12 = z6;
        boolean z13 = z4;
        boolean z14 = z3;
        return rhWebIntentKey.copy(z, z2, z14, uri, z13, z11, z12, z9, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowCameraAccess() {
        return this.allowCameraAccess;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getConvertToRhWebLink() {
        return this.convertToRhWebLink;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getDestinationUri() {
        return this.destinationUri;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHideToolbar() {
        return this.hideToolbar;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOpenNewWindowInSystem() {
        return this.openNewWindowInSystem;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBlockScreenSharing() {
        return this.blockScreenSharing;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAcceptThirdPartyCookies() {
        return this.acceptThirdPartyCookies;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getRequiresAuthentication() {
        return this.requiresAuthentication;
    }

    public final RhWebIntentKey copy(boolean allowCameraAccess, boolean allowFileAccess, boolean convertToRhWebLink, Uri destinationUri, boolean hideToolbar, boolean openNewWindowInSystem, boolean blockScreenSharing, boolean acceptThirdPartyCookies, boolean requiresAuthentication) {
        Intrinsics.checkNotNullParameter(destinationUri, "destinationUri");
        return new RhWebIntentKey(allowCameraAccess, allowFileAccess, convertToRhWebLink, destinationUri, hideToolbar, openNewWindowInSystem, blockScreenSharing, acceptThirdPartyCookies, requiresAuthentication);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhWebIntentKey)) {
            return false;
        }
        RhWebIntentKey rhWebIntentKey = (RhWebIntentKey) other;
        return this.allowCameraAccess == rhWebIntentKey.allowCameraAccess && this.allowFileAccess == rhWebIntentKey.allowFileAccess && this.convertToRhWebLink == rhWebIntentKey.convertToRhWebLink && Intrinsics.areEqual(this.destinationUri, rhWebIntentKey.destinationUri) && this.hideToolbar == rhWebIntentKey.hideToolbar && this.openNewWindowInSystem == rhWebIntentKey.openNewWindowInSystem && this.blockScreenSharing == rhWebIntentKey.blockScreenSharing && this.acceptThirdPartyCookies == rhWebIntentKey.acceptThirdPartyCookies && this.requiresAuthentication == rhWebIntentKey.requiresAuthentication;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.allowCameraAccess) * 31) + Boolean.hashCode(this.allowFileAccess)) * 31) + Boolean.hashCode(this.convertToRhWebLink)) * 31) + this.destinationUri.hashCode()) * 31) + Boolean.hashCode(this.hideToolbar)) * 31) + Boolean.hashCode(this.openNewWindowInSystem)) * 31) + Boolean.hashCode(this.blockScreenSharing)) * 31) + Boolean.hashCode(this.acceptThirdPartyCookies)) * 31) + Boolean.hashCode(this.requiresAuthentication);
    }

    public String toString() {
        return "RhWebIntentKey(allowCameraAccess=" + this.allowCameraAccess + ", allowFileAccess=" + this.allowFileAccess + ", convertToRhWebLink=" + this.convertToRhWebLink + ", destinationUri=" + this.destinationUri + ", hideToolbar=" + this.hideToolbar + ", openNewWindowInSystem=" + this.openNewWindowInSystem + ", blockScreenSharing=" + this.blockScreenSharing + ", acceptThirdPartyCookies=" + this.acceptThirdPartyCookies + ", requiresAuthentication=" + this.requiresAuthentication + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.allowCameraAccess ? 1 : 0);
        dest.writeInt(this.allowFileAccess ? 1 : 0);
        dest.writeInt(this.convertToRhWebLink ? 1 : 0);
        dest.writeParcelable(this.destinationUri, flags);
        dest.writeInt(this.hideToolbar ? 1 : 0);
        dest.writeInt(this.openNewWindowInSystem ? 1 : 0);
        dest.writeInt(this.blockScreenSharing ? 1 : 0);
        dest.writeInt(this.acceptThirdPartyCookies ? 1 : 0);
        dest.writeInt(this.requiresAuthentication ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RhWebIntentKey(boolean z, boolean z2, boolean z3, Uri destinationUri, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(destinationUri, "destinationUri");
        this.allowCameraAccess = z;
        this.allowFileAccess = z2;
        this.convertToRhWebLink = z3;
        this.destinationUri = destinationUri;
        this.hideToolbar = z4;
        this.openNewWindowInSystem = z5;
        this.blockScreenSharing = z6;
        this.acceptThirdPartyCookies = z7;
        this.requiresAuthentication = z8;
    }

    public /* synthetic */ RhWebIntentKey(boolean z, boolean z2, boolean z3, Uri uri, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, uri, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? true : z8);
    }

    public final boolean getAllowCameraAccess() {
        return this.allowCameraAccess;
    }

    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    public final boolean getConvertToRhWebLink() {
        return this.convertToRhWebLink;
    }

    public final Uri getDestinationUri() {
        return this.destinationUri;
    }

    public final boolean getHideToolbar() {
        return this.hideToolbar;
    }

    public final boolean getOpenNewWindowInSystem() {
        return this.openNewWindowInSystem;
    }

    public final boolean getBlockScreenSharing() {
        return this.blockScreenSharing;
    }

    public final boolean getAcceptThirdPartyCookies() {
        return this.acceptThirdPartyCookies;
    }

    public final boolean getRequiresAuthentication() {
        return this.requiresAuthentication;
    }
}
