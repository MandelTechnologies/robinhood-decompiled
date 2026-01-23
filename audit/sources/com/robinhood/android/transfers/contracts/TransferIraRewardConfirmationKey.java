package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferIraRewardConfirmationKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferIraRewardConfirmationKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "iraRewardConfirmation", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraRewardConfirmation;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraRewardConfirmation;)V", "getIraRewardConfirmation", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraRewardConfirmation;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TransferIraRewardConfirmationKey implements FragmentKey {
    public static final Parcelable.Creator<TransferIraRewardConfirmationKey> CREATOR = new Creator();
    private final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation;

    /* compiled from: TransferIraRewardConfirmationKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferIraRewardConfirmationKey$Callbacks;", "", "onButtonClick", "", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public interface Callbacks {
        void onButtonClick(ApiGenericAction action);
    }

    /* compiled from: TransferIraRewardConfirmationKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferIraRewardConfirmationKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferIraRewardConfirmationKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferIraRewardConfirmationKey((UiPostTransferPage.IraRewardConfirmation) parcel.readParcelable(TransferIraRewardConfirmationKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferIraRewardConfirmationKey[] newArray(int i) {
            return new TransferIraRewardConfirmationKey[i];
        }
    }

    public static /* synthetic */ TransferIraRewardConfirmationKey copy$default(TransferIraRewardConfirmationKey transferIraRewardConfirmationKey, UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            iraRewardConfirmation = transferIraRewardConfirmationKey.iraRewardConfirmation;
        }
        return transferIraRewardConfirmationKey.copy(iraRewardConfirmation);
    }

    /* renamed from: component1, reason: from getter */
    public final UiPostTransferPage.IraRewardConfirmation getIraRewardConfirmation() {
        return this.iraRewardConfirmation;
    }

    public final TransferIraRewardConfirmationKey copy(UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation) {
        Intrinsics.checkNotNullParameter(iraRewardConfirmation, "iraRewardConfirmation");
        return new TransferIraRewardConfirmationKey(iraRewardConfirmation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferIraRewardConfirmationKey) && Intrinsics.areEqual(this.iraRewardConfirmation, ((TransferIraRewardConfirmationKey) other).iraRewardConfirmation);
    }

    public int hashCode() {
        return this.iraRewardConfirmation.hashCode();
    }

    public String toString() {
        return "TransferIraRewardConfirmationKey(iraRewardConfirmation=" + this.iraRewardConfirmation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.iraRewardConfirmation, flags);
    }

    public TransferIraRewardConfirmationKey(UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation) {
        Intrinsics.checkNotNullParameter(iraRewardConfirmation, "iraRewardConfirmation");
        this.iraRewardConfirmation = iraRewardConfirmation;
    }

    public final UiPostTransferPage.IraRewardConfirmation getIraRewardConfirmation() {
        return this.iraRewardConfirmation;
    }
}
