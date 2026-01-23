package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsActivityIntentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldAgreementsActivityIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "feature", "", "sourceScreenIdentifier", "isFromRhfOnboarding", "", "showSparkleButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getFeature", "()Ljava/lang/String;", "getSourceScreenIdentifier", "()Z", "getShowSparkleButton", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldAgreementsActivityIntentKey implements IntentKey, Parcelable {
    public static final String BACK_BUTTON_PRESSED_IDENTIFIER = "backButtonPressed";
    private final String feature;
    private final boolean isFromRhfOnboarding;
    private final boolean showSparkleButton;
    private final String sourceScreenIdentifier;
    public static final Parcelable.Creator<GoldAgreementsActivityIntentKey> CREATOR = new Creator();

    /* compiled from: GoldAgreementsActivityIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldAgreementsActivityIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldAgreementsActivityIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldAgreementsActivityIntentKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldAgreementsActivityIntentKey[] newArray(int i) {
            return new GoldAgreementsActivityIntentKey[i];
        }
    }

    public GoldAgreementsActivityIntentKey() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ GoldAgreementsActivityIntentKey copy$default(GoldAgreementsActivityIntentKey goldAgreementsActivityIntentKey, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldAgreementsActivityIntentKey.feature;
        }
        if ((i & 2) != 0) {
            str2 = goldAgreementsActivityIntentKey.sourceScreenIdentifier;
        }
        if ((i & 4) != 0) {
            z = goldAgreementsActivityIntentKey.isFromRhfOnboarding;
        }
        if ((i & 8) != 0) {
            z2 = goldAgreementsActivityIntentKey.showSparkleButton;
        }
        return goldAgreementsActivityIntentKey.copy(str, str2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSparkleButton() {
        return this.showSparkleButton;
    }

    public final GoldAgreementsActivityIntentKey copy(String feature, String sourceScreenIdentifier, boolean isFromRhfOnboarding, boolean showSparkleButton) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        return new GoldAgreementsActivityIntentKey(feature, sourceScreenIdentifier, isFromRhfOnboarding, showSparkleButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldAgreementsActivityIntentKey)) {
            return false;
        }
        GoldAgreementsActivityIntentKey goldAgreementsActivityIntentKey = (GoldAgreementsActivityIntentKey) other;
        return Intrinsics.areEqual(this.feature, goldAgreementsActivityIntentKey.feature) && Intrinsics.areEqual(this.sourceScreenIdentifier, goldAgreementsActivityIntentKey.sourceScreenIdentifier) && this.isFromRhfOnboarding == goldAgreementsActivityIntentKey.isFromRhfOnboarding && this.showSparkleButton == goldAgreementsActivityIntentKey.showSparkleButton;
    }

    public int hashCode() {
        String str = this.feature;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.sourceScreenIdentifier.hashCode()) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + Boolean.hashCode(this.showSparkleButton);
    }

    public String toString() {
        return "GoldAgreementsActivityIntentKey(feature=" + this.feature + ", sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", showSparkleButton=" + this.showSparkleButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.feature);
        dest.writeString(this.sourceScreenIdentifier);
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeInt(this.showSparkleButton ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldAgreementsActivityIntentKey(String str, String sourceScreenIdentifier, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        this.feature = str;
        this.sourceScreenIdentifier = sourceScreenIdentifier;
        this.isFromRhfOnboarding = z;
        this.showSparkleButton = z2;
    }

    public final String getFeature() {
        return this.feature;
    }

    public /* synthetic */ GoldAgreementsActivityIntentKey(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "unset" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public final boolean isFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    public final boolean getShowSparkleButton() {
        return this.showSparkleButton;
    }
}
