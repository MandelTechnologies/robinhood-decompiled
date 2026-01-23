package com.robinhood.android.social.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateReportFragmentKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "userId", "", "username", "profilePictureUrl", "memoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getUsername", "getProfilePictureUrl", "getMemoId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CreateReportFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<CreateReportFragmentKey> CREATOR = new Creator();
    private final String memoId;
    private final String profilePictureUrl;
    private final String userId;
    private final String username;

    /* compiled from: CreateReportFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<CreateReportFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateReportFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateReportFragmentKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateReportFragmentKey[] newArray(int i) {
            return new CreateReportFragmentKey[i];
        }
    }

    public static /* synthetic */ CreateReportFragmentKey copy$default(CreateReportFragmentKey createReportFragmentKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createReportFragmentKey.userId;
        }
        if ((i & 2) != 0) {
            str2 = createReportFragmentKey.username;
        }
        if ((i & 4) != 0) {
            str3 = createReportFragmentKey.profilePictureUrl;
        }
        if ((i & 8) != 0) {
            str4 = createReportFragmentKey.memoId;
        }
        return createReportFragmentKey.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMemoId() {
        return this.memoId;
    }

    public final CreateReportFragmentKey copy(String userId, String username, String profilePictureUrl, String memoId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new CreateReportFragmentKey(userId, username, profilePictureUrl, memoId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateReportFragmentKey)) {
            return false;
        }
        CreateReportFragmentKey createReportFragmentKey = (CreateReportFragmentKey) other;
        return Intrinsics.areEqual(this.userId, createReportFragmentKey.userId) && Intrinsics.areEqual(this.username, createReportFragmentKey.username) && Intrinsics.areEqual(this.profilePictureUrl, createReportFragmentKey.profilePictureUrl) && Intrinsics.areEqual(this.memoId, createReportFragmentKey.memoId);
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profilePictureUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memoId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CreateReportFragmentKey(userId=" + this.userId + ", username=" + this.username + ", profilePictureUrl=" + this.profilePictureUrl + ", memoId=" + this.memoId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userId);
        dest.writeString(this.username);
        dest.writeString(this.profilePictureUrl);
        dest.writeString(this.memoId);
    }

    public CreateReportFragmentKey(String userId, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.username = str;
        this.profilePictureUrl = str2;
        this.memoId = str3;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getMemoId() {
        return this.memoId;
    }
}
