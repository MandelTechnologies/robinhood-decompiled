package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryAccountLoadingScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;", "", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "isLoading", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Z)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HeaderIcon {
    public static final int $stable = 0;
    private final ServerToBentoAssetMapper2 iconAsset;
    private final boolean isLoading;

    public static /* synthetic */ HeaderIcon copy$default(HeaderIcon headerIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            serverToBentoAssetMapper2 = headerIcon.iconAsset;
        }
        if ((i & 2) != 0) {
            z = headerIcon.isLoading;
        }
        return headerIcon.copy(serverToBentoAssetMapper2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final HeaderIcon copy(ServerToBentoAssetMapper2 iconAsset, boolean isLoading) {
        Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
        return new HeaderIcon(iconAsset, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderIcon)) {
            return false;
        }
        HeaderIcon headerIcon = (HeaderIcon) other;
        return this.iconAsset == headerIcon.iconAsset && this.isLoading == headerIcon.isLoading;
    }

    public int hashCode() {
        return (this.iconAsset.hashCode() * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "HeaderIcon(iconAsset=" + this.iconAsset + ", isLoading=" + this.isLoading + ")";
    }

    public HeaderIcon(ServerToBentoAssetMapper2 iconAsset, boolean z) {
        Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
        this.iconAsset = iconAsset;
        this.isLoading = z;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
