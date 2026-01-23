package com.robinhood.android.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidAuthenticationFragmentKey.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/PlaidAuthenticationFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$PlaidAuthentication;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PlaidAuthenticationFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<PlaidAuthenticationFragmentKey> CREATOR = new Creator();
    private final UUID inquiryId;
    private final UserViewState.Page<UserViewStatePageContext.PlaidAuthentication> userViewState;

    /* compiled from: PlaidAuthenticationFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<PlaidAuthenticationFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidAuthenticationFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaidAuthenticationFragmentKey((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PlaidAuthenticationFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidAuthenticationFragmentKey[] newArray(int i) {
            return new PlaidAuthenticationFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.inquiryId);
        dest.writeParcelable(this.userViewState, flags);
    }

    public PlaidAuthenticationFragmentKey(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.PlaidAuthentication> userViewState) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userViewState, "userViewState");
        this.inquiryId = inquiryId;
        this.userViewState = userViewState;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final UserViewState.Page<UserViewStatePageContext.PlaidAuthentication> getUserViewState() {
        return this.userViewState;
    }
}
