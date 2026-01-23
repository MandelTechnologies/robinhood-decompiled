package com.robinhood.android.internalassettransfers.presubmissionwarn;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.internalassettransfers.presubmissionwarn.models.WarningType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PresubmissionCheckAlertSheets.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/models/WarningType;", "pictogramAsset", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitleMarkdown", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "isBlocking", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/presubmissionwarn/models/WarningType;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/internalassettransfers/presubmissionwarn/Button;Lcom/robinhood/android/internalassettransfers/presubmissionwarn/Button;Z)V", "getType", "()Lcom/robinhood/android/internalassettransfers/presubmissionwarn/models/WarningType;", "getPictogramAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitleMarkdown", "getPrimaryButton", "()Lcom/robinhood/android/internalassettransfers/presubmissionwarn/Button;", "getSecondaryButton", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PresubmissionChecksAlertSheet implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<PresubmissionChecksAlertSheet> CREATOR = new Creator();
    private final boolean isBlocking;
    private final ServerToBentoAssetMapper3 pictogramAsset;
    private final Button primaryButton;
    private final Button secondaryButton;
    private final StringResource subtitleMarkdown;
    private final StringResource title;
    private final WarningType type;

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PresubmissionChecksAlertSheet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresubmissionChecksAlertSheet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WarningType warningType = (WarningType) parcel.readParcelable(PresubmissionChecksAlertSheet.class.getClassLoader());
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3ValueOf = parcel.readInt() == 0 ? null : ServerToBentoAssetMapper3.valueOf(parcel.readString());
            StringResource stringResource = (StringResource) parcel.readParcelable(PresubmissionChecksAlertSheet.class.getClassLoader());
            StringResource stringResource2 = (StringResource) parcel.readParcelable(PresubmissionChecksAlertSheet.class.getClassLoader());
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new PresubmissionChecksAlertSheet(warningType, serverToBentoAssetMapper3ValueOf, stringResource, stringResource2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresubmissionChecksAlertSheet[] newArray(int i) {
            return new PresubmissionChecksAlertSheet[i];
        }
    }

    public static /* synthetic */ PresubmissionChecksAlertSheet copy$default(PresubmissionChecksAlertSheet presubmissionChecksAlertSheet, WarningType warningType, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, StringResource stringResource, StringResource stringResource2, Button button, Button button2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            warningType = presubmissionChecksAlertSheet.type;
        }
        if ((i & 2) != 0) {
            serverToBentoAssetMapper3 = presubmissionChecksAlertSheet.pictogramAsset;
        }
        if ((i & 4) != 0) {
            stringResource = presubmissionChecksAlertSheet.title;
        }
        if ((i & 8) != 0) {
            stringResource2 = presubmissionChecksAlertSheet.subtitleMarkdown;
        }
        if ((i & 16) != 0) {
            button = presubmissionChecksAlertSheet.primaryButton;
        }
        if ((i & 32) != 0) {
            button2 = presubmissionChecksAlertSheet.secondaryButton;
        }
        if ((i & 64) != 0) {
            z = presubmissionChecksAlertSheet.isBlocking;
        }
        Button button3 = button2;
        boolean z2 = z;
        Button button4 = button;
        StringResource stringResource3 = stringResource;
        return presubmissionChecksAlertSheet.copy(warningType, serverToBentoAssetMapper3, stringResource3, stringResource2, button4, button3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final WarningType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerToBentoAssetMapper3 getPictogramAsset() {
        return this.pictogramAsset;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    /* renamed from: component5, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsBlocking() {
        return this.isBlocking;
    }

    public final PresubmissionChecksAlertSheet copy(WarningType type2, ServerToBentoAssetMapper3 pictogramAsset, StringResource title, StringResource subtitleMarkdown, Button primaryButton, Button secondaryButton, boolean isBlocking) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        return new PresubmissionChecksAlertSheet(type2, pictogramAsset, title, subtitleMarkdown, primaryButton, secondaryButton, isBlocking);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresubmissionChecksAlertSheet)) {
            return false;
        }
        PresubmissionChecksAlertSheet presubmissionChecksAlertSheet = (PresubmissionChecksAlertSheet) other;
        return Intrinsics.areEqual(this.type, presubmissionChecksAlertSheet.type) && this.pictogramAsset == presubmissionChecksAlertSheet.pictogramAsset && Intrinsics.areEqual(this.title, presubmissionChecksAlertSheet.title) && Intrinsics.areEqual(this.subtitleMarkdown, presubmissionChecksAlertSheet.subtitleMarkdown) && Intrinsics.areEqual(this.primaryButton, presubmissionChecksAlertSheet.primaryButton) && Intrinsics.areEqual(this.secondaryButton, presubmissionChecksAlertSheet.secondaryButton) && this.isBlocking == presubmissionChecksAlertSheet.isBlocking;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = this.pictogramAsset;
        int iHashCode2 = (((((((iHashCode + (serverToBentoAssetMapper3 == null ? 0 : serverToBentoAssetMapper3.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitleMarkdown.hashCode()) * 31) + this.primaryButton.hashCode()) * 31;
        Button button = this.secondaryButton;
        return ((iHashCode2 + (button != null ? button.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBlocking);
    }

    public String toString() {
        return "PresubmissionChecksAlertSheet(type=" + this.type + ", pictogramAsset=" + this.pictogramAsset + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", isBlocking=" + this.isBlocking + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.type, flags);
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = this.pictogramAsset;
        if (serverToBentoAssetMapper3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverToBentoAssetMapper3.name());
        }
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitleMarkdown, flags);
        this.primaryButton.writeToParcel(dest, flags);
        Button button = this.secondaryButton;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isBlocking ? 1 : 0);
    }

    public PresubmissionChecksAlertSheet(WarningType type2, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, StringResource title, StringResource subtitleMarkdown, Button primaryButton, Button button, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.type = type2;
        this.pictogramAsset = serverToBentoAssetMapper3;
        this.title = title;
        this.subtitleMarkdown = subtitleMarkdown;
        this.primaryButton = primaryButton;
        this.secondaryButton = button;
        this.isBlocking = z;
    }

    public final WarningType getType() {
        return this.type;
    }

    public final ServerToBentoAssetMapper3 getPictogramAsset() {
        return this.pictogramAsset;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }
}
