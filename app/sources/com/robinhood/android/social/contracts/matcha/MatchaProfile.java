package com.robinhood.android.social.contracts.matcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaProfile.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaProfile;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "userId", "", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "isPreOnboarding", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;Z)V", "getUserId", "()Ljava/lang/String;", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MatchaProfile implements FragmentKey {
    public static final Parcelable.Creator<MatchaProfile> CREATOR = new Creator();
    private final MatchaTransaction.Direction direction;
    private final boolean isPreOnboarding;
    private final String userId;

    /* compiled from: MatchaProfile.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<MatchaProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchaProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MatchaProfile(parcel.readString(), parcel.readInt() == 0 ? null : MatchaTransaction.Direction.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchaProfile[] newArray(int i) {
            return new MatchaProfile[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userId);
        MatchaTransaction.Direction direction = this.direction;
        if (direction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(direction.name());
        }
        dest.writeInt(this.isPreOnboarding ? 1 : 0);
    }

    public MatchaProfile(String userId, MatchaTransaction.Direction direction, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.direction = direction;
        this.isPreOnboarding = z;
    }

    public /* synthetic */ MatchaProfile(String str, MatchaTransaction.Direction direction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : direction, (i & 4) != 0 ? false : z);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final MatchaTransaction.Direction getDirection() {
        return this.direction;
    }

    /* renamed from: isPreOnboarding, reason: from getter */
    public final boolean getIsPreOnboarding() {
        return this.isPreOnboarding;
    }
}
