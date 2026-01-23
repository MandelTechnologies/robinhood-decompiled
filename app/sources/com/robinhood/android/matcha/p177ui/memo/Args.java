package com.robinhood.android.matcha.p177ui.memo;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Args.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/memo/Args;", "Landroid/os/Parcelable;", "transactionTitle", "Lcom/robinhood/utils/resource/StringResource;", "transactionSubtitle", "username", "", "profileAvatarStates", "", "Lcom/robinhood/p2p/common/ProfileAvatarState;", MemoInputActivity.EXTRA_MEMO, "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTransactionTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getTransactionSubtitle", "getUsername", "()Ljava/lang/String;", "getProfileAvatarStates", "()Ljava/util/List;", "getMemo", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Args implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Args> CREATOR = new Creator();
    private final String memo;
    private final List<ProfileAvatarState> profileAvatarStates;
    private final StringResource transactionSubtitle;
    private final StringResource transactionTitle;
    private final String username;

    /* compiled from: Args.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Args> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Args createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StringResource stringResource = (StringResource) parcel.readParcelable(Args.class.getClassLoader());
            StringResource stringResource2 = (StringResource) parcel.readParcelable(Args.class.getClassLoader());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
            }
            return new Args(stringResource, stringResource2, string2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Args[] newArray(int i) {
            return new Args[i];
        }
    }

    public static /* synthetic */ Args copy$default(Args args, StringResource stringResource, StringResource stringResource2, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = args.transactionTitle;
        }
        if ((i & 2) != 0) {
            stringResource2 = args.transactionSubtitle;
        }
        if ((i & 4) != 0) {
            str = args.username;
        }
        if ((i & 8) != 0) {
            list = args.profileAvatarStates;
        }
        if ((i & 16) != 0) {
            str2 = args.memo;
        }
        String str3 = str2;
        String str4 = str;
        return args.copy(stringResource, stringResource2, str4, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTransactionTitle() {
        return this.transactionTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTransactionSubtitle() {
        return this.transactionSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final List<ProfileAvatarState> component4() {
        return this.profileAvatarStates;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final Args copy(StringResource transactionTitle, StringResource transactionSubtitle, String username, List<? extends ProfileAvatarState> profileAvatarStates, String memo) {
        Intrinsics.checkNotNullParameter(transactionTitle, "transactionTitle");
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        return new Args(transactionTitle, transactionSubtitle, username, profileAvatarStates, memo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Args)) {
            return false;
        }
        Args args = (Args) other;
        return Intrinsics.areEqual(this.transactionTitle, args.transactionTitle) && Intrinsics.areEqual(this.transactionSubtitle, args.transactionSubtitle) && Intrinsics.areEqual(this.username, args.username) && Intrinsics.areEqual(this.profileAvatarStates, args.profileAvatarStates) && Intrinsics.areEqual(this.memo, args.memo);
    }

    public int hashCode() {
        int iHashCode = this.transactionTitle.hashCode() * 31;
        StringResource stringResource = this.transactionSubtitle;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str = this.username;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.profileAvatarStates.hashCode()) * 31;
        String str2 = this.memo;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Args(transactionTitle=" + this.transactionTitle + ", transactionSubtitle=" + this.transactionSubtitle + ", username=" + this.username + ", profileAvatarStates=" + this.profileAvatarStates + ", memo=" + this.memo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transactionTitle, flags);
        dest.writeParcelable(this.transactionSubtitle, flags);
        dest.writeString(this.username);
        List<ProfileAvatarState> list = this.profileAvatarStates;
        dest.writeInt(list.size());
        Iterator<ProfileAvatarState> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.memo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Args(StringResource transactionTitle, StringResource stringResource, String str, List<? extends ProfileAvatarState> profileAvatarStates, String str2) {
        Intrinsics.checkNotNullParameter(transactionTitle, "transactionTitle");
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        this.transactionTitle = transactionTitle;
        this.transactionSubtitle = stringResource;
        this.username = str;
        this.profileAvatarStates = profileAvatarStates;
        this.memo = str2;
    }

    public final StringResource getTransactionTitle() {
        return this.transactionTitle;
    }

    public final StringResource getTransactionSubtitle() {
        return this.transactionSubtitle;
    }

    public final String getUsername() {
        return this.username;
    }

    public final List<ProfileAvatarState> getProfileAvatarStates() {
        return this.profileAvatarStates;
    }

    public final String getMemo() {
        return this.memo;
    }
}
