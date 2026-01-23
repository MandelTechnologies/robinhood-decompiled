package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldHubIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "scrollTarget", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;)V", "getScrollTarget", "()Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldHubIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GoldHubIntentKey> CREATOR = new Creator();
    private final GoldHubSettingsComponentTargetType scrollTarget;

    /* compiled from: GoldHubIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldHubIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldHubIntentKey(parcel.readInt() == 0 ? null : GoldHubSettingsComponentTargetType.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubIntentKey[] newArray(int i) {
            return new GoldHubIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldHubIntentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GoldHubIntentKey copy$default(GoldHubIntentKey goldHubIntentKey, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, int i, Object obj) {
        if ((i & 1) != 0) {
            goldHubSettingsComponentTargetType = goldHubIntentKey.scrollTarget;
        }
        return goldHubIntentKey.copy(goldHubSettingsComponentTargetType);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldHubSettingsComponentTargetType getScrollTarget() {
        return this.scrollTarget;
    }

    public final GoldHubIntentKey copy(GoldHubSettingsComponentTargetType scrollTarget) {
        return new GoldHubIntentKey(scrollTarget);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoldHubIntentKey) && this.scrollTarget == ((GoldHubIntentKey) other).scrollTarget;
    }

    public int hashCode() {
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
        if (goldHubSettingsComponentTargetType == null) {
            return 0;
        }
        return goldHubSettingsComponentTargetType.hashCode();
    }

    public String toString() {
        return "GoldHubIntentKey(scrollTarget=" + this.scrollTarget + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
        if (goldHubSettingsComponentTargetType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            goldHubSettingsComponentTargetType.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldHubIntentKey(GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType) {
        this.scrollTarget = goldHubSettingsComponentTargetType;
    }

    public /* synthetic */ GoldHubIntentKey(GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldHubSettingsComponentTargetType);
    }

    public final GoldHubSettingsComponentTargetType getScrollTarget() {
        return this.scrollTarget;
    }
}
