package com.robinhood.shared.support.contracts.pathfinder;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeroImageFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/pathfinder/HeroImageFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$HeroImage;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class HeroImageFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<HeroImageFragmentKey> CREATOR = new Creator();
    private final UUID inquiryId;
    private final UserViewState.Page<UserViewStatePageContext.HeroImage> userViewState;

    /* compiled from: HeroImageFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<HeroImageFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeroImageFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeroImageFragmentKey((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(HeroImageFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeroImageFragmentKey[] newArray(int i) {
            return new HeroImageFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeroImageFragmentKey copy$default(HeroImageFragmentKey heroImageFragmentKey, UUID uuid, UserViewState.Page page, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = heroImageFragmentKey.inquiryId;
        }
        if ((i & 2) != 0) {
            page = heroImageFragmentKey.userViewState;
        }
        return heroImageFragmentKey.copy(uuid, page);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final UserViewState.Page<UserViewStatePageContext.HeroImage> component2() {
        return this.userViewState;
    }

    public final HeroImageFragmentKey copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.HeroImage> userViewState) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userViewState, "userViewState");
        return new HeroImageFragmentKey(inquiryId, userViewState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroImageFragmentKey)) {
            return false;
        }
        HeroImageFragmentKey heroImageFragmentKey = (HeroImageFragmentKey) other;
        return Intrinsics.areEqual(this.inquiryId, heroImageFragmentKey.inquiryId) && Intrinsics.areEqual(this.userViewState, heroImageFragmentKey.userViewState);
    }

    public int hashCode() {
        return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
    }

    public String toString() {
        return "HeroImageFragmentKey(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.inquiryId);
        dest.writeParcelable(this.userViewState, flags);
    }

    public HeroImageFragmentKey(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.HeroImage> userViewState) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userViewState, "userViewState");
        this.inquiryId = inquiryId;
        this.userViewState = userViewState;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final UserViewState.Page<UserViewStatePageContext.HeroImage> getUserViewState() {
        return this.userViewState;
    }
}
