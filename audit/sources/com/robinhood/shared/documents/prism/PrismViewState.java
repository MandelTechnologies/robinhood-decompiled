package com.robinhood.shared.documents.prism;

import com.robinhood.shared.documents.prism.animations.FaceIconComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismViewState;", "", "isLoading", "", "statusDetailRes", "Lcom/robinhood/utils/resource/StringResource;", "faceIconAnimationState", "Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;", "showFlareRing", "showSuccess", "showFailure", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;ZZZ)V", "()Z", "getStatusDetailRes", "()Lcom/robinhood/utils/resource/StringResource;", "getFaceIconAnimationState", "()Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;", "getShowFlareRing", "getShowSuccess", "getShowFailure", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrismViewState {
    public static final int $stable = StringResource.$stable;
    private final FaceIconComposable faceIconAnimationState;
    private final boolean isLoading;
    private final boolean showFailure;
    private final boolean showFlareRing;
    private final boolean showSuccess;
    private final StringResource statusDetailRes;

    public static /* synthetic */ PrismViewState copy$default(PrismViewState prismViewState, boolean z, StringResource stringResource, FaceIconComposable faceIconComposable, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = prismViewState.isLoading;
        }
        if ((i & 2) != 0) {
            stringResource = prismViewState.statusDetailRes;
        }
        if ((i & 4) != 0) {
            faceIconComposable = prismViewState.faceIconAnimationState;
        }
        if ((i & 8) != 0) {
            z2 = prismViewState.showFlareRing;
        }
        if ((i & 16) != 0) {
            z3 = prismViewState.showSuccess;
        }
        if ((i & 32) != 0) {
            z4 = prismViewState.showFailure;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return prismViewState.copy(z, stringResource, faceIconComposable, z2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getStatusDetailRes() {
        return this.statusDetailRes;
    }

    /* renamed from: component3, reason: from getter */
    public final FaceIconComposable getFaceIconAnimationState() {
        return this.faceIconAnimationState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowFlareRing() {
        return this.showFlareRing;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowFailure() {
        return this.showFailure;
    }

    public final PrismViewState copy(boolean isLoading, StringResource statusDetailRes, FaceIconComposable faceIconAnimationState, boolean showFlareRing, boolean showSuccess, boolean showFailure) {
        Intrinsics.checkNotNullParameter(statusDetailRes, "statusDetailRes");
        Intrinsics.checkNotNullParameter(faceIconAnimationState, "faceIconAnimationState");
        return new PrismViewState(isLoading, statusDetailRes, faceIconAnimationState, showFlareRing, showSuccess, showFailure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrismViewState)) {
            return false;
        }
        PrismViewState prismViewState = (PrismViewState) other;
        return this.isLoading == prismViewState.isLoading && Intrinsics.areEqual(this.statusDetailRes, prismViewState.statusDetailRes) && Intrinsics.areEqual(this.faceIconAnimationState, prismViewState.faceIconAnimationState) && this.showFlareRing == prismViewState.showFlareRing && this.showSuccess == prismViewState.showSuccess && this.showFailure == prismViewState.showFailure;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + this.statusDetailRes.hashCode()) * 31) + this.faceIconAnimationState.hashCode()) * 31) + Boolean.hashCode(this.showFlareRing)) * 31) + Boolean.hashCode(this.showSuccess)) * 31) + Boolean.hashCode(this.showFailure);
    }

    public String toString() {
        return "PrismViewState(isLoading=" + this.isLoading + ", statusDetailRes=" + this.statusDetailRes + ", faceIconAnimationState=" + this.faceIconAnimationState + ", showFlareRing=" + this.showFlareRing + ", showSuccess=" + this.showSuccess + ", showFailure=" + this.showFailure + ")";
    }

    public PrismViewState(boolean z, StringResource statusDetailRes, FaceIconComposable faceIconAnimationState, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(statusDetailRes, "statusDetailRes");
        Intrinsics.checkNotNullParameter(faceIconAnimationState, "faceIconAnimationState");
        this.isLoading = z;
        this.statusDetailRes = statusDetailRes;
        this.faceIconAnimationState = faceIconAnimationState;
        this.showFlareRing = z2;
        this.showSuccess = z3;
        this.showFailure = z4;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final StringResource getStatusDetailRes() {
        return this.statusDetailRes;
    }

    public final FaceIconComposable getFaceIconAnimationState() {
        return this.faceIconAnimationState;
    }

    public final boolean getShowFlareRing() {
        return this.showFlareRing;
    }

    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    public final boolean getShowFailure() {
        return this.showFailure;
    }
}
