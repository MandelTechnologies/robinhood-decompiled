package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeIntentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "sourceScreenIdentifier", "", "feature", "exitDeeplink", "overrideDayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "sageId", "isFromOnboarding", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/ui/daynight/DayNightMode;Ljava/lang/String;Z)V", "getSourceScreenIdentifier", "()Ljava/lang/String;", "getFeature", "getExitDeeplink", "getOverrideDayNightMode", "()Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "getSageId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldUpgradeIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GoldUpgradeIntentKey> CREATOR = new Creator();
    private final String exitDeeplink;
    private final String feature;
    private final boolean isFromOnboarding;
    private final NightModeManager2 overrideDayNightMode;
    private final String sageId;
    private final String sourceScreenIdentifier;

    /* compiled from: GoldUpgradeIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldUpgradeIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldUpgradeIntentKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NightModeManager2.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeIntentKey[] newArray(int i) {
            return new GoldUpgradeIntentKey[i];
        }
    }

    public static /* synthetic */ GoldUpgradeIntentKey copy$default(GoldUpgradeIntentKey goldUpgradeIntentKey, String str, String str2, String str3, NightModeManager2 nightModeManager2, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldUpgradeIntentKey.sourceScreenIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = goldUpgradeIntentKey.feature;
        }
        if ((i & 4) != 0) {
            str3 = goldUpgradeIntentKey.exitDeeplink;
        }
        if ((i & 8) != 0) {
            nightModeManager2 = goldUpgradeIntentKey.overrideDayNightMode;
        }
        if ((i & 16) != 0) {
            str4 = goldUpgradeIntentKey.sageId;
        }
        if ((i & 32) != 0) {
            z = goldUpgradeIntentKey.isFromOnboarding;
        }
        String str5 = str4;
        boolean z2 = z;
        return goldUpgradeIntentKey.copy(str, str2, str3, nightModeManager2, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExitDeeplink() {
        return this.exitDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final NightModeManager2 getOverrideDayNightMode() {
        return this.overrideDayNightMode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSageId() {
        return this.sageId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFromOnboarding() {
        return this.isFromOnboarding;
    }

    public final GoldUpgradeIntentKey copy(String sourceScreenIdentifier, String feature, String exitDeeplink, NightModeManager2 overrideDayNightMode, String sageId, boolean isFromOnboarding) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new GoldUpgradeIntentKey(sourceScreenIdentifier, feature, exitDeeplink, overrideDayNightMode, sageId, isFromOnboarding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldUpgradeIntentKey)) {
            return false;
        }
        GoldUpgradeIntentKey goldUpgradeIntentKey = (GoldUpgradeIntentKey) other;
        return Intrinsics.areEqual(this.sourceScreenIdentifier, goldUpgradeIntentKey.sourceScreenIdentifier) && Intrinsics.areEqual(this.feature, goldUpgradeIntentKey.feature) && Intrinsics.areEqual(this.exitDeeplink, goldUpgradeIntentKey.exitDeeplink) && this.overrideDayNightMode == goldUpgradeIntentKey.overrideDayNightMode && Intrinsics.areEqual(this.sageId, goldUpgradeIntentKey.sageId) && this.isFromOnboarding == goldUpgradeIntentKey.isFromOnboarding;
    }

    public int hashCode() {
        int iHashCode = ((this.sourceScreenIdentifier.hashCode() * 31) + this.feature.hashCode()) * 31;
        String str = this.exitDeeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NightModeManager2 nightModeManager2 = this.overrideDayNightMode;
        int iHashCode3 = (iHashCode2 + (nightModeManager2 == null ? 0 : nightModeManager2.hashCode())) * 31;
        String str2 = this.sageId;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromOnboarding);
    }

    public String toString() {
        return "GoldUpgradeIntentKey(sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", feature=" + this.feature + ", exitDeeplink=" + this.exitDeeplink + ", overrideDayNightMode=" + this.overrideDayNightMode + ", sageId=" + this.sageId + ", isFromOnboarding=" + this.isFromOnboarding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sourceScreenIdentifier);
        dest.writeString(this.feature);
        dest.writeString(this.exitDeeplink);
        NightModeManager2 nightModeManager2 = this.overrideDayNightMode;
        if (nightModeManager2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(nightModeManager2.name());
        }
        dest.writeString(this.sageId);
        dest.writeInt(this.isFromOnboarding ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldUpgradeIntentKey(String sourceScreenIdentifier, String feature, String str, NightModeManager2 nightModeManager2, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.sourceScreenIdentifier = sourceScreenIdentifier;
        this.feature = feature;
        this.exitDeeplink = str;
        this.overrideDayNightMode = nightModeManager2;
        this.sageId = str2;
        this.isFromOnboarding = z;
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public /* synthetic */ GoldUpgradeIntentKey(String str, String str2, String str3, NightModeManager2 nightModeManager2, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : nightModeManager2, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z);
    }

    public final String getFeature() {
        return this.feature;
    }

    public final String getExitDeeplink() {
        return this.exitDeeplink;
    }

    public final NightModeManager2 getOverrideDayNightMode() {
        return this.overrideDayNightMode;
    }

    public final String getSageId() {
        return this.sageId;
    }

    public final boolean isFromOnboarding() {
        return this.isFromOnboarding;
    }
}
