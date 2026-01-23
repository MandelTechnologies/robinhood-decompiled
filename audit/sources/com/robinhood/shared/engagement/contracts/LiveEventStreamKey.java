package com.robinhood.shared.engagement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveEventStreamKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/engagement/contracts/LiveEventStreamKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "", "microgramId", "launchArguments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getMicrogramId", "getLaunchArguments", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LiveEventStreamKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<LiveEventStreamKey> CREATOR = new Creator();
    private final String launchArguments;
    private final String microgramId;
    private final String source;

    /* compiled from: LiveEventStreamKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LiveEventStreamKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveEventStreamKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LiveEventStreamKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveEventStreamKey[] newArray(int i) {
            return new LiveEventStreamKey[i];
        }
    }

    public static /* synthetic */ LiveEventStreamKey copy$default(LiveEventStreamKey liveEventStreamKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveEventStreamKey.source;
        }
        if ((i & 2) != 0) {
            str2 = liveEventStreamKey.microgramId;
        }
        if ((i & 4) != 0) {
            str3 = liveEventStreamKey.launchArguments;
        }
        return liveEventStreamKey.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMicrogramId() {
        return this.microgramId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLaunchArguments() {
        return this.launchArguments;
    }

    public final LiveEventStreamKey copy(String source, String microgramId, String launchArguments) {
        Intrinsics.checkNotNullParameter(microgramId, "microgramId");
        return new LiveEventStreamKey(source, microgramId, launchArguments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventStreamKey)) {
            return false;
        }
        LiveEventStreamKey liveEventStreamKey = (LiveEventStreamKey) other;
        return Intrinsics.areEqual(this.source, liveEventStreamKey.source) && Intrinsics.areEqual(this.microgramId, liveEventStreamKey.microgramId) && Intrinsics.areEqual(this.launchArguments, liveEventStreamKey.launchArguments);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.microgramId.hashCode()) * 31;
        String str2 = this.launchArguments;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LiveEventStreamKey(source=" + this.source + ", microgramId=" + this.microgramId + ", launchArguments=" + this.launchArguments + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.microgramId);
        dest.writeString(this.launchArguments);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public LiveEventStreamKey(String str, String microgramId, String str2) {
        Intrinsics.checkNotNullParameter(microgramId, "microgramId");
        this.source = str;
        this.microgramId = microgramId;
        this.launchArguments = str2;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getMicrogramId() {
        return this.microgramId;
    }

    public final String getLaunchArguments() {
        return this.launchArguments;
    }
}
