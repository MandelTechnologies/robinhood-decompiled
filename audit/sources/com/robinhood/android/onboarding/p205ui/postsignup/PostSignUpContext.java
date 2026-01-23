package com.robinhood.android.onboarding.p205ui.postsignup;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpContext.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "Landroid/os/Parcelable;", "hasQueuedDeposit", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(ZLcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getHasQueuedDeposit", "()Z", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PostSignUpContext> CREATOR = new Creator();
    private final boolean hasQueuedDeposit;
    private final CountryCode.Supported locality;

    /* compiled from: PostSignUpContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PostSignUpContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostSignUpContext(parcel.readInt() != 0, (CountryCode.Supported) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpContext[] newArray(int i) {
            return new PostSignUpContext[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpContext() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasQueuedDeposit ? 1 : 0);
        dest.writeSerializable(this.locality);
    }

    public PostSignUpContext(boolean z, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.hasQueuedDeposit = z;
        this.locality = locality;
    }

    public final boolean getHasQueuedDeposit() {
        return this.hasQueuedDeposit;
    }

    public /* synthetic */ PostSignUpContext(boolean z, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CountryCode.Supported.UnitedStates.INSTANCE : supported);
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }
}
