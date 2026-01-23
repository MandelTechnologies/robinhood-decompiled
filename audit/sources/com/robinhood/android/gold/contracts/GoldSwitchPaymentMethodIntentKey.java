package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSwitchPaymentMethodIntentKey.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldSwitchPaymentMethodIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "autoProceed", "", "selectedAccountId", "", "backupAccountId", "isDeficitImprovement", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "getAutoProceed", "()Z", "getSelectedAccountId", "()Ljava/lang/String;", "getBackupAccountId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldSwitchPaymentMethodIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GoldSwitchPaymentMethodIntentKey> CREATOR = new Creator();
    private final boolean autoProceed;
    private final String backupAccountId;
    private final boolean isDeficitImprovement;
    private final String selectedAccountId;

    /* compiled from: GoldSwitchPaymentMethodIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldSwitchPaymentMethodIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSwitchPaymentMethodIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSwitchPaymentMethodIntentKey(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSwitchPaymentMethodIntentKey[] newArray(int i) {
            return new GoldSwitchPaymentMethodIntentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.autoProceed ? 1 : 0);
        dest.writeString(this.selectedAccountId);
        dest.writeString(this.backupAccountId);
        dest.writeInt(this.isDeficitImprovement ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldSwitchPaymentMethodIntentKey(boolean z, String selectedAccountId, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        this.autoProceed = z;
        this.selectedAccountId = selectedAccountId;
        this.backupAccountId = str;
        this.isDeficitImprovement = z2;
    }

    public /* synthetic */ GoldSwitchPaymentMethodIntentKey(boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? false : z2);
    }

    public final boolean getAutoProceed() {
        return this.autoProceed;
    }

    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final String getBackupAccountId() {
        return this.backupAccountId;
    }

    /* renamed from: isDeficitImprovement, reason: from getter */
    public final boolean getIsDeficitImprovement() {
        return this.isDeficitImprovement;
    }
}
