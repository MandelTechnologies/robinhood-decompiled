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

/* compiled from: PostUserCreationShimIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/PostUserCreationShimIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "isFromUserCreationFlow", "", "exitDeeplinkOverride", "Landroid/net/Uri;", "source", "", "forceDarkTheme", "onboardingFlowPathType", "Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "<init>", "(ZLandroid/net/Uri;Ljava/lang/String;ZLcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;)V", "()Z", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getSource", "()Ljava/lang/String;", "getForceDarkTheme", "getOnboardingFlowPathType", "()Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PostUserCreationShimIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<PostUserCreationShimIntentKey> CREATOR = new Creator();
    private final Uri exitDeeplinkOverride;
    private final boolean forceDarkTheme;
    private final boolean isFromUserCreationFlow;
    private final OnboardingFlowPathType onboardingFlowPathType;
    private final String source;

    /* compiled from: PostUserCreationShimIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<PostUserCreationShimIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostUserCreationShimIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            Uri uri = (Uri) parcel.readParcelable(PostUserCreationShimIntentKey.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new PostUserCreationShimIntentKey(z2, uri, string2, z, (OnboardingFlowPathType) parcel.readParcelable(PostUserCreationShimIntentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostUserCreationShimIntentKey[] newArray(int i) {
            return new PostUserCreationShimIntentKey[i];
        }
    }

    public PostUserCreationShimIntentKey() {
        this(false, null, null, false, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isFromUserCreationFlow ? 1 : 0);
        dest.writeParcelable(this.exitDeeplinkOverride, flags);
        dest.writeString(this.source);
        dest.writeInt(this.forceDarkTheme ? 1 : 0);
        dest.writeParcelable(this.onboardingFlowPathType, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public PostUserCreationShimIntentKey(boolean z, Uri uri, String str, boolean z2, OnboardingFlowPathType onboardingFlowPathType) {
        Intrinsics.checkNotNullParameter(onboardingFlowPathType, "onboardingFlowPathType");
        this.isFromUserCreationFlow = z;
        this.exitDeeplinkOverride = uri;
        this.source = str;
        this.forceDarkTheme = z2;
        this.onboardingFlowPathType = onboardingFlowPathType;
    }

    /* renamed from: isFromUserCreationFlow, reason: from getter */
    public final boolean getIsFromUserCreationFlow() {
        return this.isFromUserCreationFlow;
    }

    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    public /* synthetic */ PostUserCreationShimIntentKey(boolean z, Uri uri, String str, boolean z2, OnboardingFlowPathType onboardingFlowPathType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? new OnboardingFlowPathType.Brokerage(null, 1, null) : onboardingFlowPathType);
    }

    public final OnboardingFlowPathType getOnboardingFlowPathType() {
        return this.onboardingFlowPathType;
    }
}
