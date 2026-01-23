package com.robinhood.android.onboarding.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdOnboardingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/SdOnboardingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "flowPathType", "Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "source", "", "exitDeeplinkOverride", "Landroid/net/Uri;", "entryPointIdentifier", "forceDarkTheme", "", "<init>", "(Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Z)V", "getFlowPathType", "()Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "getSource", "()Ljava/lang/String;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getEntryPointIdentifier", "getForceDarkTheme", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SdOnboardingIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<SdOnboardingIntentKey> CREATOR = new Creator();
    private final String entryPointIdentifier;
    private final Uri exitDeeplinkOverride;
    private final OnboardingFlowPathType flowPathType;
    private final boolean forceDarkTheme;
    private final String source;

    /* compiled from: SdOnboardingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<SdOnboardingIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdOnboardingIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SdOnboardingIntentKey((OnboardingFlowPathType) parcel.readParcelable(SdOnboardingIntentKey.class.getClassLoader()), parcel.readString(), (Uri) parcel.readParcelable(SdOnboardingIntentKey.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdOnboardingIntentKey[] newArray(int i) {
            return new SdOnboardingIntentKey[i];
        }
    }

    public SdOnboardingIntentKey() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ SdOnboardingIntentKey copy$default(SdOnboardingIntentKey sdOnboardingIntentKey, OnboardingFlowPathType onboardingFlowPathType, String str, Uri uri, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            onboardingFlowPathType = sdOnboardingIntentKey.flowPathType;
        }
        if ((i & 2) != 0) {
            str = sdOnboardingIntentKey.source;
        }
        if ((i & 4) != 0) {
            uri = sdOnboardingIntentKey.exitDeeplinkOverride;
        }
        if ((i & 8) != 0) {
            str2 = sdOnboardingIntentKey.entryPointIdentifier;
        }
        if ((i & 16) != 0) {
            z = sdOnboardingIntentKey.forceDarkTheme;
        }
        boolean z2 = z;
        Uri uri2 = uri;
        return sdOnboardingIntentKey.copy(onboardingFlowPathType, str, uri2, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final OnboardingFlowPathType getFlowPathType() {
        return this.flowPathType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    public final SdOnboardingIntentKey copy(OnboardingFlowPathType flowPathType, String source, Uri exitDeeplinkOverride, String entryPointIdentifier, boolean forceDarkTheme) {
        Intrinsics.checkNotNullParameter(flowPathType, "flowPathType");
        return new SdOnboardingIntentKey(flowPathType, source, exitDeeplinkOverride, entryPointIdentifier, forceDarkTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdOnboardingIntentKey)) {
            return false;
        }
        SdOnboardingIntentKey sdOnboardingIntentKey = (SdOnboardingIntentKey) other;
        return Intrinsics.areEqual(this.flowPathType, sdOnboardingIntentKey.flowPathType) && Intrinsics.areEqual(this.source, sdOnboardingIntentKey.source) && Intrinsics.areEqual(this.exitDeeplinkOverride, sdOnboardingIntentKey.exitDeeplinkOverride) && Intrinsics.areEqual(this.entryPointIdentifier, sdOnboardingIntentKey.entryPointIdentifier) && this.forceDarkTheme == sdOnboardingIntentKey.forceDarkTheme;
    }

    public int hashCode() {
        int iHashCode = this.flowPathType.hashCode() * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.exitDeeplinkOverride;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.entryPointIdentifier;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceDarkTheme);
    }

    public String toString() {
        return "SdOnboardingIntentKey(flowPathType=" + this.flowPathType + ", source=" + this.source + ", exitDeeplinkOverride=" + this.exitDeeplinkOverride + ", entryPointIdentifier=" + this.entryPointIdentifier + ", forceDarkTheme=" + this.forceDarkTheme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.flowPathType, flags);
        dest.writeString(this.source);
        dest.writeParcelable(this.exitDeeplinkOverride, flags);
        dest.writeString(this.entryPointIdentifier);
        dest.writeInt(this.forceDarkTheme ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public SdOnboardingIntentKey(OnboardingFlowPathType flowPathType, String str, Uri uri, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(flowPathType, "flowPathType");
        this.flowPathType = flowPathType;
        this.source = str;
        this.exitDeeplinkOverride = uri;
        this.entryPointIdentifier = str2;
        this.forceDarkTheme = z;
    }

    public /* synthetic */ SdOnboardingIntentKey(OnboardingFlowPathType onboardingFlowPathType, String str, Uri uri, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new OnboardingFlowPathType.Brokerage(null, 1, null) : onboardingFlowPathType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z);
    }

    public final OnboardingFlowPathType getFlowPathType() {
        return this.flowPathType;
    }

    public final String getSource() {
        return this.source;
    }

    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }
}
