package com.robinhood.android.support.supporthub;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeRow;", "", "primaryText", "", "secondaryText", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getLeadingIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConciergeRow {
    public static final int $stable = 0;
    private final ServerToBentoAssetMapper2 leadingIcon;
    private final String primaryText;
    private final String secondaryText;

    public static /* synthetic */ ConciergeRow copy$default(ConciergeRow conciergeRow, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conciergeRow.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = conciergeRow.secondaryText;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = conciergeRow.leadingIcon;
        }
        return conciergeRow.copy(str, str2, serverToBentoAssetMapper2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getLeadingIcon() {
        return this.leadingIcon;
    }

    public final ConciergeRow copy(String primaryText, String secondaryText, ServerToBentoAssetMapper2 leadingIcon) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
        return new ConciergeRow(primaryText, secondaryText, leadingIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConciergeRow)) {
            return false;
        }
        ConciergeRow conciergeRow = (ConciergeRow) other;
        return Intrinsics.areEqual(this.primaryText, conciergeRow.primaryText) && Intrinsics.areEqual(this.secondaryText, conciergeRow.secondaryText) && this.leadingIcon == conciergeRow.leadingIcon;
    }

    public int hashCode() {
        return (((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.leadingIcon.hashCode();
    }

    public String toString() {
        return "ConciergeRow(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", leadingIcon=" + this.leadingIcon + ")";
    }

    public ConciergeRow(String primaryText, String secondaryText, ServerToBentoAssetMapper2 leadingIcon) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.leadingIcon = leadingIcon;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final ServerToBentoAssetMapper2 getLeadingIcon() {
        return this.leadingIcon;
    }
}
