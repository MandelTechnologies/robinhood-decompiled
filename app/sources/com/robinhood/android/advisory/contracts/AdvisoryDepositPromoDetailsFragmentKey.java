package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryDepositPromoDetailsFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "campaign", "", "isIraTransfer", "", "<init>", "(Ljava/lang/String;Z)V", "getCampaign", "()Ljava/lang/String;", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryDepositPromoDetailsFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvisoryDepositPromoDetailsFragmentKey> CREATOR = new Creator();
    private final String campaign;
    private final boolean isIraTransfer;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryDepositPromoDetailsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryDepositPromoDetailsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryDepositPromoDetailsFragmentKey(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryDepositPromoDetailsFragmentKey[] newArray(int i) {
            return new AdvisoryDepositPromoDetailsFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisoryDepositPromoDetailsFragmentKey() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvisoryDepositPromoDetailsFragmentKey copy$default(AdvisoryDepositPromoDetailsFragmentKey advisoryDepositPromoDetailsFragmentKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryDepositPromoDetailsFragmentKey.campaign;
        }
        if ((i & 2) != 0) {
            z = advisoryDepositPromoDetailsFragmentKey.isIraTransfer;
        }
        return advisoryDepositPromoDetailsFragmentKey.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsIraTransfer() {
        return this.isIraTransfer;
    }

    public final AdvisoryDepositPromoDetailsFragmentKey copy(String campaign, boolean isIraTransfer) {
        return new AdvisoryDepositPromoDetailsFragmentKey(campaign, isIraTransfer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryDepositPromoDetailsFragmentKey)) {
            return false;
        }
        AdvisoryDepositPromoDetailsFragmentKey advisoryDepositPromoDetailsFragmentKey = (AdvisoryDepositPromoDetailsFragmentKey) other;
        return Intrinsics.areEqual(this.campaign, advisoryDepositPromoDetailsFragmentKey.campaign) && this.isIraTransfer == advisoryDepositPromoDetailsFragmentKey.isIraTransfer;
    }

    public int hashCode() {
        String str = this.campaign;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isIraTransfer);
    }

    public String toString() {
        return "AdvisoryDepositPromoDetailsFragmentKey(campaign=" + this.campaign + ", isIraTransfer=" + this.isIraTransfer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.campaign);
        dest.writeInt(this.isIraTransfer ? 1 : 0);
    }

    public AdvisoryDepositPromoDetailsFragmentKey(String str, boolean z) {
        this.campaign = str;
        this.isIraTransfer = z;
    }

    public /* synthetic */ AdvisoryDepositPromoDetailsFragmentKey(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final boolean isIraTransfer() {
        return this.isIraTransfer;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
