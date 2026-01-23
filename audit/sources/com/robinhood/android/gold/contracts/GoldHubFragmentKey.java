package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldHubFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "shownInTab", "", "scrollTarget", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "loggingEntrypoint", "", "<init>", "(ZLcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;Ljava/lang/String;)V", "getShownInTab", "()Z", "getScrollTarget", "()Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "getLoggingEntrypoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldHubFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<GoldHubFragmentKey> CREATOR = new Creator();
    private final String loggingEntrypoint;
    private final GoldHubSettingsComponentTargetType scrollTarget;
    private final boolean shownInTab;

    /* compiled from: GoldHubFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldHubFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldHubFragmentKey(parcel.readInt() != 0, parcel.readInt() == 0 ? null : GoldHubSettingsComponentTargetType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubFragmentKey[] newArray(int i) {
            return new GoldHubFragmentKey[i];
        }
    }

    public GoldHubFragmentKey() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ GoldHubFragmentKey copy$default(GoldHubFragmentKey goldHubFragmentKey, boolean z, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goldHubFragmentKey.shownInTab;
        }
        if ((i & 2) != 0) {
            goldHubSettingsComponentTargetType = goldHubFragmentKey.scrollTarget;
        }
        if ((i & 4) != 0) {
            str = goldHubFragmentKey.loggingEntrypoint;
        }
        return goldHubFragmentKey.copy(z, goldHubSettingsComponentTargetType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShownInTab() {
        return this.shownInTab;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldHubSettingsComponentTargetType getScrollTarget() {
        return this.scrollTarget;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggingEntrypoint() {
        return this.loggingEntrypoint;
    }

    public final GoldHubFragmentKey copy(boolean shownInTab, GoldHubSettingsComponentTargetType scrollTarget, String loggingEntrypoint) {
        return new GoldHubFragmentKey(shownInTab, scrollTarget, loggingEntrypoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldHubFragmentKey)) {
            return false;
        }
        GoldHubFragmentKey goldHubFragmentKey = (GoldHubFragmentKey) other;
        return this.shownInTab == goldHubFragmentKey.shownInTab && this.scrollTarget == goldHubFragmentKey.scrollTarget && Intrinsics.areEqual(this.loggingEntrypoint, goldHubFragmentKey.loggingEntrypoint);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.shownInTab) * 31;
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
        int iHashCode2 = (iHashCode + (goldHubSettingsComponentTargetType == null ? 0 : goldHubSettingsComponentTargetType.hashCode())) * 31;
        String str = this.loggingEntrypoint;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GoldHubFragmentKey(shownInTab=" + this.shownInTab + ", scrollTarget=" + this.scrollTarget + ", loggingEntrypoint=" + this.loggingEntrypoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.shownInTab ? 1 : 0);
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
        if (goldHubSettingsComponentTargetType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            goldHubSettingsComponentTargetType.writeToParcel(dest, flags);
        }
        dest.writeString(this.loggingEntrypoint);
    }

    public GoldHubFragmentKey(boolean z, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, String str) {
        this.shownInTab = z;
        this.scrollTarget = goldHubSettingsComponentTargetType;
        this.loggingEntrypoint = str;
    }

    public /* synthetic */ GoldHubFragmentKey(boolean z, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : goldHubSettingsComponentTargetType, (i & 4) != 0 ? null : str);
    }

    public final boolean getShownInTab() {
        return this.shownInTab;
    }

    public final GoldHubSettingsComponentTargetType getScrollTarget() {
        return this.scrollTarget;
    }

    public final String getLoggingEntrypoint() {
        return this.loggingEntrypoint;
    }
}
