package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpIntentKey.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/PostSignUpIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "showThanksScreen", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;ZLcom/robinhood/models/api/ColorTheme;)V", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getShowThanksScreen", "()Z", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "isRhy", "isRhy$annotations", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PostSignUpIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<PostSignUpIntentKey> CREATOR = new Creator();
    private final boolean isRhy;
    private final boolean showThanksScreen;
    private final ColorTheme theme;
    private final ApiTransferAccount.TransferAccountType transferAccountType;

    /* compiled from: PostSignUpIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<PostSignUpIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostSignUpIntentKey(ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), parcel.readInt() != 0, ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpIntentKey[] newArray(int i) {
            return new PostSignUpIntentKey[i];
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
        dest.writeInt(this.showThanksScreen ? 1 : 0);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public PostSignUpIntentKey(ApiTransferAccount.TransferAccountType transferAccountType, boolean z, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.transferAccountType = transferAccountType;
        this.showThanksScreen = z;
        this.theme = theme;
        this.isRhy = transferAccountType == ApiTransferAccount.TransferAccountType.RHY;
    }

    public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
        return this.transferAccountType;
    }

    public final boolean getShowThanksScreen() {
        return this.showThanksScreen;
    }

    public /* synthetic */ PostSignUpIntentKey(ApiTransferAccount.TransferAccountType transferAccountType, boolean z, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferAccountType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }

    /* renamed from: isRhy, reason: from getter */
    public final boolean getIsRhy() {
        return this.isRhy;
    }
}
