package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentChecklistV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/ChecklistItem;", "", "isEnabled", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "<init>", "(ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "()Z", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChecklistItem {
    public static final int $stable = StringResource.$stable;
    private final ServerToBentoAssetMapper2 icon;
    private final boolean isEnabled;
    private final StringResource primaryText;
    private final StringResource secondaryText;

    public static /* synthetic */ ChecklistItem copy$default(ChecklistItem checklistItem, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checklistItem.isEnabled;
        }
        if ((i & 2) != 0) {
            serverToBentoAssetMapper2 = checklistItem.icon;
        }
        if ((i & 4) != 0) {
            stringResource = checklistItem.primaryText;
        }
        if ((i & 8) != 0) {
            stringResource2 = checklistItem.secondaryText;
        }
        return checklistItem.copy(z, serverToBentoAssetMapper2, stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final ChecklistItem copy(boolean isEnabled, ServerToBentoAssetMapper2 icon, StringResource primaryText, StringResource secondaryText) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new ChecklistItem(isEnabled, icon, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChecklistItem)) {
            return false;
        }
        ChecklistItem checklistItem = (ChecklistItem) other;
        return this.isEnabled == checklistItem.isEnabled && this.icon == checklistItem.icon && Intrinsics.areEqual(this.primaryText, checklistItem.primaryText) && Intrinsics.areEqual(this.secondaryText, checklistItem.secondaryText);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        int iHashCode2 = (((iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "ChecklistItem(isEnabled=" + this.isEnabled + ", icon=" + this.icon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public ChecklistItem(boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource primaryText, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.isEnabled = z;
        this.icon = serverToBentoAssetMapper2;
        this.primaryText = primaryText;
        this.secondaryText = stringResource;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }
}
