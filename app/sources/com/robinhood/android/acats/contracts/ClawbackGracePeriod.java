package com.robinhood.android.acats.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/ClawbackGracePeriod;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "content", "Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class ClawbackGracePeriod implements IntentKey, Parcelable {
    public static final Parcelable.Creator<ClawbackGracePeriod> CREATOR = new Creator();
    private final ClawbackGracePeriodContent content;

    /* compiled from: AcatsIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ClawbackGracePeriod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClawbackGracePeriod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClawbackGracePeriod((ClawbackGracePeriodContent) parcel.readParcelable(ClawbackGracePeriod.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClawbackGracePeriod[] newArray(int i) {
            return new ClawbackGracePeriod[i];
        }
    }

    public static /* synthetic */ ClawbackGracePeriod copy$default(ClawbackGracePeriod clawbackGracePeriod, ClawbackGracePeriodContent apiPreCreateTransferResponse4, int i, Object obj) {
        if ((i & 1) != 0) {
            apiPreCreateTransferResponse4 = clawbackGracePeriod.content;
        }
        return clawbackGracePeriod.copy(apiPreCreateTransferResponse4);
    }

    /* renamed from: component1, reason: from getter */
    public final ClawbackGracePeriodContent getContent() {
        return this.content;
    }

    public final ClawbackGracePeriod copy(ClawbackGracePeriodContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ClawbackGracePeriod(content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClawbackGracePeriod) && Intrinsics.areEqual(this.content, ((ClawbackGracePeriod) other).content);
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "ClawbackGracePeriod(content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.content, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public ClawbackGracePeriod(ClawbackGracePeriodContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    public final ClawbackGracePeriodContent getContent() {
        return this.content;
    }
}
