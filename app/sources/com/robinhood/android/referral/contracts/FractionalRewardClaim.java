package com.robinhood.android.referral.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaim.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/FractionalRewardClaim;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "rewardId", "Ljava/util/UUID;", "isFromRhfOnboarding", "", "<init>", "(Ljava/util/UUID;Z)V", "getRewardId", "()Ljava/util/UUID;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FractionalRewardClaim implements IntentKey, Parcelable {
    public static final String INTENT_DATA_SHOWN_REFERRAL_DIALOG = "shownReferralDialog";
    private final boolean isFromRhfOnboarding;
    private final UUID rewardId;
    public static final Parcelable.Creator<FractionalRewardClaim> CREATOR = new Creator();

    /* compiled from: FractionalRewardClaim.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FractionalRewardClaim> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FractionalRewardClaim createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FractionalRewardClaim((UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FractionalRewardClaim[] newArray(int i) {
            return new FractionalRewardClaim[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.rewardId);
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public FractionalRewardClaim(UUID rewardId, boolean z) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.rewardId = rewardId;
        this.isFromRhfOnboarding = z;
    }

    public /* synthetic */ FractionalRewardClaim(UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? false : z);
    }

    public final UUID getRewardId() {
        return this.rewardId;
    }

    /* renamed from: isFromRhfOnboarding, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }
}
