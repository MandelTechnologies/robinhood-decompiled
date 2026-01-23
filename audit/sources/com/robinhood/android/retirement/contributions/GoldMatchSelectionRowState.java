package com.robinhood.android.retirement.contributions;

import com.robinhood.models.serverdriven.experimental.api.AspectFitRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;", "", "primaryText", "", "secondaryText", "image", "Lcom/robinhood/models/serverdriven/experimental/api/AspectFitRemoteImage;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "loggingId", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AspectFitRemoteImage;Ljava/lang/String;Z)V", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getImage", "()Lcom/robinhood/models/serverdriven/experimental/api/AspectFitRemoteImage;", "getLoggingId", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GoldMatchSelectionRowState {
    public static final int $stable = 8;
    private final AspectFitRemoteImage<GenericAction> image;
    private final String loggingId;
    private final String primaryText;
    private final String secondaryText;
    private final boolean selected;

    public static /* synthetic */ GoldMatchSelectionRowState copy$default(GoldMatchSelectionRowState goldMatchSelectionRowState, String str, String str2, AspectFitRemoteImage aspectFitRemoteImage, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldMatchSelectionRowState.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = goldMatchSelectionRowState.secondaryText;
        }
        if ((i & 4) != 0) {
            aspectFitRemoteImage = goldMatchSelectionRowState.image;
        }
        if ((i & 8) != 0) {
            str3 = goldMatchSelectionRowState.loggingId;
        }
        if ((i & 16) != 0) {
            z = goldMatchSelectionRowState.selected;
        }
        boolean z2 = z;
        AspectFitRemoteImage aspectFitRemoteImage2 = aspectFitRemoteImage;
        return goldMatchSelectionRowState.copy(str, str2, aspectFitRemoteImage2, str3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final AspectFitRemoteImage<GenericAction> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoggingId() {
        return this.loggingId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final GoldMatchSelectionRowState copy(String primaryText, String secondaryText, AspectFitRemoteImage<? extends GenericAction> image, String loggingId, boolean selected) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(loggingId, "loggingId");
        return new GoldMatchSelectionRowState(primaryText, secondaryText, image, loggingId, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldMatchSelectionRowState)) {
            return false;
        }
        GoldMatchSelectionRowState goldMatchSelectionRowState = (GoldMatchSelectionRowState) other;
        return Intrinsics.areEqual(this.primaryText, goldMatchSelectionRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, goldMatchSelectionRowState.secondaryText) && Intrinsics.areEqual(this.image, goldMatchSelectionRowState.image) && Intrinsics.areEqual(this.loggingId, goldMatchSelectionRowState.loggingId) && this.selected == goldMatchSelectionRowState.selected;
    }

    public int hashCode() {
        return (((((((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.image.hashCode()) * 31) + this.loggingId.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        return "GoldMatchSelectionRowState(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", image=" + this.image + ", loggingId=" + this.loggingId + ", selected=" + this.selected + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldMatchSelectionRowState(String primaryText, String secondaryText, AspectFitRemoteImage<? extends GenericAction> image, String loggingId, boolean z) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(loggingId, "loggingId");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.image = image;
        this.loggingId = loggingId;
        this.selected = z;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final AspectFitRemoteImage<GenericAction> getImage() {
        return this.image;
    }

    public final String getLoggingId() {
        return this.loggingId;
    }

    public final boolean getSelected() {
        return this.selected;
    }
}
