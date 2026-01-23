package com.robinhood.android.acats.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsIn;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "", "skipIntro", "", "forceBonusIntro", "preselectedAccountNumber", "skipPromoScreen", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Z)V", "getSource", "()Ljava/lang/String;", "getSkipIntro", "()Z", "getForceBonusIntro", "getPreselectedAccountNumber", "getSkipPromoScreen", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AcatsIn implements IntentKey, Parcelable {
    public static final Parcelable.Creator<AcatsIn> CREATOR = new Creator();
    private final boolean forceBonusIntro;
    private final String preselectedAccountNumber;
    private final boolean skipIntro;
    private final boolean skipPromoScreen;
    private final String source;

    /* compiled from: AcatsIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AcatsIn> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsIn createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z2;
                str = string3;
            } else {
                str = string3;
                z3 = z;
            }
            return new AcatsIn(string2, z4, z5, str, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsIn[] newArray(int i) {
            return new AcatsIn[i];
        }
    }

    public static /* synthetic */ AcatsIn copy$default(AcatsIn acatsIn, String str, boolean z, boolean z2, String str2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsIn.source;
        }
        if ((i & 2) != 0) {
            z = acatsIn.skipIntro;
        }
        if ((i & 4) != 0) {
            z2 = acatsIn.forceBonusIntro;
        }
        if ((i & 8) != 0) {
            str2 = acatsIn.preselectedAccountNumber;
        }
        if ((i & 16) != 0) {
            z3 = acatsIn.skipPromoScreen;
        }
        boolean z4 = z3;
        boolean z5 = z2;
        return acatsIn.copy(str, z, z5, str2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForceBonusIntro() {
        return this.forceBonusIntro;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPreselectedAccountNumber() {
        return this.preselectedAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSkipPromoScreen() {
        return this.skipPromoScreen;
    }

    public final AcatsIn copy(String source, boolean skipIntro, boolean forceBonusIntro, String preselectedAccountNumber, boolean skipPromoScreen) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AcatsIn(source, skipIntro, forceBonusIntro, preselectedAccountNumber, skipPromoScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsIn)) {
            return false;
        }
        AcatsIn acatsIn = (AcatsIn) other;
        return Intrinsics.areEqual(this.source, acatsIn.source) && this.skipIntro == acatsIn.skipIntro && this.forceBonusIntro == acatsIn.forceBonusIntro && Intrinsics.areEqual(this.preselectedAccountNumber, acatsIn.preselectedAccountNumber) && this.skipPromoScreen == acatsIn.skipPromoScreen;
    }

    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + Boolean.hashCode(this.skipIntro)) * 31) + Boolean.hashCode(this.forceBonusIntro)) * 31;
        String str = this.preselectedAccountNumber;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.skipPromoScreen);
    }

    public String toString() {
        return "AcatsIn(source=" + this.source + ", skipIntro=" + this.skipIntro + ", forceBonusIntro=" + this.forceBonusIntro + ", preselectedAccountNumber=" + this.preselectedAccountNumber + ", skipPromoScreen=" + this.skipPromoScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeInt(this.skipIntro ? 1 : 0);
        dest.writeInt(this.forceBonusIntro ? 1 : 0);
        dest.writeString(this.preselectedAccountNumber);
        dest.writeInt(this.skipPromoScreen ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public AcatsIn(String source, boolean z, boolean z2, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.skipIntro = z;
        this.forceBonusIntro = z2;
        this.preselectedAccountNumber = str;
        this.skipPromoScreen = z3;
    }

    public /* synthetic */ AcatsIn(String str, boolean z, boolean z2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z3);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    public final boolean getForceBonusIntro() {
        return this.forceBonusIntro;
    }

    public final String getPreselectedAccountNumber() {
        return this.preselectedAccountNumber;
    }

    public final boolean getSkipPromoScreen() {
        return this.skipPromoScreen;
    }
}
