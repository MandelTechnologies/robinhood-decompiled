package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatPageFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportChatPageFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "key", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$Pathfinder;", "<init>", "(Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$Pathfinder;)V", "getKey", "()Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$Pathfinder;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class SupportChatPageFragmentKey implements FragmentKey, Parcelable {
    public static final int RESULT_CLOSE_PATHFINDER = 10;
    private final CxChatFragmentKey.Pathfinder key;
    public static final Parcelable.Creator<SupportChatPageFragmentKey> CREATOR = new Creator();

    /* compiled from: SupportChatPageFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SupportChatPageFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportChatPageFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SupportChatPageFragmentKey(CxChatFragmentKey.Pathfinder.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportChatPageFragmentKey[] newArray(int i) {
            return new SupportChatPageFragmentKey[i];
        }
    }

    public static /* synthetic */ SupportChatPageFragmentKey copy$default(SupportChatPageFragmentKey supportChatPageFragmentKey, CxChatFragmentKey.Pathfinder pathfinder, int i, Object obj) {
        if ((i & 1) != 0) {
            pathfinder = supportChatPageFragmentKey.key;
        }
        return supportChatPageFragmentKey.copy(pathfinder);
    }

    /* renamed from: component1, reason: from getter */
    public final CxChatFragmentKey.Pathfinder getKey() {
        return this.key;
    }

    public final SupportChatPageFragmentKey copy(CxChatFragmentKey.Pathfinder key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new SupportChatPageFragmentKey(key);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SupportChatPageFragmentKey) && Intrinsics.areEqual(this.key, ((SupportChatPageFragmentKey) other).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "SupportChatPageFragmentKey(key=" + this.key + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.key.writeToParcel(dest, flags);
    }

    public SupportChatPageFragmentKey(CxChatFragmentKey.Pathfinder key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public final CxChatFragmentKey.Pathfinder getKey() {
        return this.key;
    }
}
