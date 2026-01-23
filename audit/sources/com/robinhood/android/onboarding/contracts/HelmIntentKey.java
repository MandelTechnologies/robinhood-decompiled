package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelmIntentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/HelmIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/ColorTheme;)V", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "isRhy", "", "isRhy$annotations", "()V", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HelmIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<HelmIntentKey> CREATOR = new Creator();
    private final boolean isRhy;
    private final ColorTheme theme;
    private final ApiTransferAccount.TransferAccountType transferAccountType;

    /* compiled from: HelmIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HelmIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HelmIntentKey(ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmIntentKey[] newArray(int i) {
            return new HelmIntentKey[i];
        }
    }

    public static /* synthetic */ void isRhy$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transferAccountType.name());
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public HelmIntentKey(ApiTransferAccount.TransferAccountType transferAccountType, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.transferAccountType = transferAccountType;
        this.theme = theme;
        this.isRhy = transferAccountType == ApiTransferAccount.TransferAccountType.RHY;
    }

    public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
        return this.transferAccountType;
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }

    /* renamed from: isRhy, reason: from getter */
    public final boolean getIsRhy() {
        return this.isRhy;
    }
}
