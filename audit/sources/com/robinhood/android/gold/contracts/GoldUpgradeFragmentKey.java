package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "sourceScreenIdentifier", "", "feature", "exitDeeplink", "overrideDayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "shownInTab", "", "sageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/ui/daynight/DayNightMode;ZLjava/lang/String;)V", "getSourceScreenIdentifier", "()Ljava/lang/String;", "getFeature", "getExitDeeplink", "getOverrideDayNightMode", "()Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "getShownInTab", "()Z", "getSageId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldUpgradeFragmentKey implements FragmentKey, Parcelable {
    private final String exitDeeplink;
    private final String feature;
    private final NightModeManager2 overrideDayNightMode;
    private final String sageId;
    private final boolean shownInTab;
    private final String sourceScreenIdentifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GoldUpgradeFragmentKey> CREATOR = new Creator();

    /* compiled from: GoldUpgradeFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldUpgradeFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldUpgradeFragmentKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NightModeManager2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeFragmentKey[] newArray(int i) {
            return new GoldUpgradeFragmentKey[i];
        }
    }

    public static /* synthetic */ GoldUpgradeFragmentKey copy$default(GoldUpgradeFragmentKey goldUpgradeFragmentKey, String str, String str2, String str3, NightModeManager2 nightModeManager2, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldUpgradeFragmentKey.sourceScreenIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = goldUpgradeFragmentKey.feature;
        }
        if ((i & 4) != 0) {
            str3 = goldUpgradeFragmentKey.exitDeeplink;
        }
        if ((i & 8) != 0) {
            nightModeManager2 = goldUpgradeFragmentKey.overrideDayNightMode;
        }
        if ((i & 16) != 0) {
            z = goldUpgradeFragmentKey.shownInTab;
        }
        if ((i & 32) != 0) {
            str4 = goldUpgradeFragmentKey.sageId;
        }
        boolean z2 = z;
        String str5 = str4;
        return goldUpgradeFragmentKey.copy(str, str2, str3, nightModeManager2, z2, str5);
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
    public final boolean getShownInTab() {
        return this.shownInTab;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSageId() {
        return this.sageId;
    }

    public final GoldUpgradeFragmentKey copy(String sourceScreenIdentifier, String feature, String exitDeeplink, NightModeManager2 overrideDayNightMode, boolean shownInTab, String sageId) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new GoldUpgradeFragmentKey(sourceScreenIdentifier, feature, exitDeeplink, overrideDayNightMode, shownInTab, sageId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldUpgradeFragmentKey)) {
            return false;
        }
        GoldUpgradeFragmentKey goldUpgradeFragmentKey = (GoldUpgradeFragmentKey) other;
        return Intrinsics.areEqual(this.sourceScreenIdentifier, goldUpgradeFragmentKey.sourceScreenIdentifier) && Intrinsics.areEqual(this.feature, goldUpgradeFragmentKey.feature) && Intrinsics.areEqual(this.exitDeeplink, goldUpgradeFragmentKey.exitDeeplink) && this.overrideDayNightMode == goldUpgradeFragmentKey.overrideDayNightMode && this.shownInTab == goldUpgradeFragmentKey.shownInTab && Intrinsics.areEqual(this.sageId, goldUpgradeFragmentKey.sageId);
    }

    public int hashCode() {
        int iHashCode = ((this.sourceScreenIdentifier.hashCode() * 31) + this.feature.hashCode()) * 31;
        String str = this.exitDeeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NightModeManager2 nightModeManager2 = this.overrideDayNightMode;
        int iHashCode3 = (((iHashCode2 + (nightModeManager2 == null ? 0 : nightModeManager2.hashCode())) * 31) + Boolean.hashCode(this.shownInTab)) * 31;
        String str2 = this.sageId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GoldUpgradeFragmentKey(sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", feature=" + this.feature + ", exitDeeplink=" + this.exitDeeplink + ", overrideDayNightMode=" + this.overrideDayNightMode + ", shownInTab=" + this.shownInTab + ", sageId=" + this.sageId + ")";
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
        dest.writeInt(this.shownInTab ? 1 : 0);
        dest.writeString(this.sageId);
    }

    public GoldUpgradeFragmentKey(String sourceScreenIdentifier, String feature, String str, NightModeManager2 nightModeManager2, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.sourceScreenIdentifier = sourceScreenIdentifier;
        this.feature = feature;
        this.exitDeeplink = str;
        this.overrideDayNightMode = nightModeManager2;
        this.shownInTab = z;
        this.sageId = str2;
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public /* synthetic */ GoldUpgradeFragmentKey(String str, String str2, String str3, NightModeManager2 nightModeManager2, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, nightModeManager2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4);
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

    public final boolean getShownInTab() {
        return this.shownInTab;
    }

    public final String getSageId() {
        return this.sageId;
    }

    /* compiled from: GoldUpgradeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeFragmentKey$Companion;", "", "<init>", "()V", "defaultForGoldTab", "Lcom/robinhood/android/gold/contracts/GoldUpgradeFragmentKey;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GoldUpgradeFragmentKey defaultForGoldTab() {
            return new GoldUpgradeFragmentKey("gold-tab", GoldFeature.GOLD_TAB, null, null, true, null, 32, null);
        }
    }
}
