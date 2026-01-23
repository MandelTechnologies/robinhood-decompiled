package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageIntentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldSageIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "sourceScreenIdentifier", "", "sageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceScreenIdentifier", "()Ljava/lang/String;", "getSageId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldSageIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GoldSageIntentKey> CREATOR = new Creator();
    private final String sageId;
    private final String sourceScreenIdentifier;

    /* compiled from: GoldSageIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldSageIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSageIntentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageIntentKey[] newArray(int i) {
            return new GoldSageIntentKey[i];
        }
    }

    public static /* synthetic */ GoldSageIntentKey copy$default(GoldSageIntentKey goldSageIntentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageIntentKey.sourceScreenIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = goldSageIntentKey.sageId;
        }
        return goldSageIntentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSageId() {
        return this.sageId;
    }

    public final GoldSageIntentKey copy(String sourceScreenIdentifier, String sageId) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        return new GoldSageIntentKey(sourceScreenIdentifier, sageId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSageIntentKey)) {
            return false;
        }
        GoldSageIntentKey goldSageIntentKey = (GoldSageIntentKey) other;
        return Intrinsics.areEqual(this.sourceScreenIdentifier, goldSageIntentKey.sourceScreenIdentifier) && Intrinsics.areEqual(this.sageId, goldSageIntentKey.sageId);
    }

    public int hashCode() {
        int iHashCode = this.sourceScreenIdentifier.hashCode() * 31;
        String str = this.sageId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GoldSageIntentKey(sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", sageId=" + this.sageId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sourceScreenIdentifier);
        dest.writeString(this.sageId);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldSageIntentKey(String sourceScreenIdentifier, String str) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        this.sourceScreenIdentifier = sourceScreenIdentifier;
        this.sageId = str;
    }

    public /* synthetic */ GoldSageIntentKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public final String getSageId() {
        return this.sageId;
    }
}
