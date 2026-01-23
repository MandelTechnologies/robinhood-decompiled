package com.robinhood.trader.i18n.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingpassWebviewIntentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/trader/i18n/contracts/SingpassWebviewIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "completionCheckpoint", "", "endpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompletionCheckpoint", "()Ljava/lang/String;", "getEndpoint", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SingpassWebviewIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<SingpassWebviewIntentKey> CREATOR = new Creator();
    private final String completionCheckpoint;
    private final String endpoint;

    /* compiled from: SingpassWebviewIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SingpassWebviewIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingpassWebviewIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SingpassWebviewIntentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingpassWebviewIntentKey[] newArray(int i) {
            return new SingpassWebviewIntentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.completionCheckpoint);
        dest.writeString(this.endpoint);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public SingpassWebviewIntentKey(String completionCheckpoint, String endpoint) {
        Intrinsics.checkNotNullParameter(completionCheckpoint, "completionCheckpoint");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.completionCheckpoint = completionCheckpoint;
        this.endpoint = endpoint;
    }

    public final String getCompletionCheckpoint() {
        return this.completionCheckpoint;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }
}
