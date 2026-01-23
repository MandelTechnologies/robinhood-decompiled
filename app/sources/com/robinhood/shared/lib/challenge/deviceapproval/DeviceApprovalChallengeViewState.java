package com.robinhood.shared.lib.challenge.deviceapproval;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceApprovalChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;", "", "isLoading", "", "showLoadingLottie", "challengeCompleted", "headerRes", "Lcom/robinhood/utils/resource/StringResource;", "bodyRes", "secondaryCtaRes", "isButtonBarVisible", "helperTextRes", "<init>", "(ZZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;)V", "()Z", "getShowLoadingLottie", "getChallengeCompleted", "getHeaderRes", "()Lcom/robinhood/utils/resource/StringResource;", "getBodyRes", "getSecondaryCtaRes", "getHelperTextRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DeviceApprovalChallengeViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource bodyRes;
    private final boolean challengeCompleted;
    private final StringResource headerRes;
    private final StringResource helperTextRes;
    private final boolean isButtonBarVisible;
    private final boolean isLoading;
    private final StringResource secondaryCtaRes;
    private final boolean showLoadingLottie;

    public static /* synthetic */ DeviceApprovalChallengeViewState copy$default(DeviceApprovalChallengeViewState deviceApprovalChallengeViewState, boolean z, boolean z2, boolean z3, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z4, StringResource stringResource4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceApprovalChallengeViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = deviceApprovalChallengeViewState.showLoadingLottie;
        }
        if ((i & 4) != 0) {
            z3 = deviceApprovalChallengeViewState.challengeCompleted;
        }
        if ((i & 8) != 0) {
            stringResource = deviceApprovalChallengeViewState.headerRes;
        }
        if ((i & 16) != 0) {
            stringResource2 = deviceApprovalChallengeViewState.bodyRes;
        }
        if ((i & 32) != 0) {
            stringResource3 = deviceApprovalChallengeViewState.secondaryCtaRes;
        }
        if ((i & 64) != 0) {
            z4 = deviceApprovalChallengeViewState.isButtonBarVisible;
        }
        if ((i & 128) != 0) {
            stringResource4 = deviceApprovalChallengeViewState.helperTextRes;
        }
        boolean z5 = z4;
        StringResource stringResource5 = stringResource4;
        StringResource stringResource6 = stringResource2;
        StringResource stringResource7 = stringResource3;
        return deviceApprovalChallengeViewState.copy(z, z2, z3, stringResource, stringResource6, stringResource7, z5, stringResource5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoadingLottie() {
        return this.showLoadingLottie;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getChallengeCompleted() {
        return this.challengeCompleted;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getHeaderRes() {
        return this.headerRes;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getBodyRes() {
        return this.bodyRes;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getSecondaryCtaRes() {
        return this.secondaryCtaRes;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsButtonBarVisible() {
        return this.isButtonBarVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getHelperTextRes() {
        return this.helperTextRes;
    }

    public final DeviceApprovalChallengeViewState copy(boolean isLoading, boolean showLoadingLottie, boolean challengeCompleted, StringResource headerRes, StringResource bodyRes, StringResource secondaryCtaRes, boolean isButtonBarVisible, StringResource helperTextRes) {
        Intrinsics.checkNotNullParameter(headerRes, "headerRes");
        Intrinsics.checkNotNullParameter(bodyRes, "bodyRes");
        return new DeviceApprovalChallengeViewState(isLoading, showLoadingLottie, challengeCompleted, headerRes, bodyRes, secondaryCtaRes, isButtonBarVisible, helperTextRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceApprovalChallengeViewState)) {
            return false;
        }
        DeviceApprovalChallengeViewState deviceApprovalChallengeViewState = (DeviceApprovalChallengeViewState) other;
        return this.isLoading == deviceApprovalChallengeViewState.isLoading && this.showLoadingLottie == deviceApprovalChallengeViewState.showLoadingLottie && this.challengeCompleted == deviceApprovalChallengeViewState.challengeCompleted && Intrinsics.areEqual(this.headerRes, deviceApprovalChallengeViewState.headerRes) && Intrinsics.areEqual(this.bodyRes, deviceApprovalChallengeViewState.bodyRes) && Intrinsics.areEqual(this.secondaryCtaRes, deviceApprovalChallengeViewState.secondaryCtaRes) && this.isButtonBarVisible == deviceApprovalChallengeViewState.isButtonBarVisible && Intrinsics.areEqual(this.helperTextRes, deviceApprovalChallengeViewState.helperTextRes);
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showLoadingLottie)) * 31) + Boolean.hashCode(this.challengeCompleted)) * 31) + this.headerRes.hashCode()) * 31) + this.bodyRes.hashCode()) * 31;
        StringResource stringResource = this.secondaryCtaRes;
        int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isButtonBarVisible)) * 31;
        StringResource stringResource2 = this.helperTextRes;
        return iHashCode2 + (stringResource2 != null ? stringResource2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceApprovalChallengeViewState(isLoading=" + this.isLoading + ", showLoadingLottie=" + this.showLoadingLottie + ", challengeCompleted=" + this.challengeCompleted + ", headerRes=" + this.headerRes + ", bodyRes=" + this.bodyRes + ", secondaryCtaRes=" + this.secondaryCtaRes + ", isButtonBarVisible=" + this.isButtonBarVisible + ", helperTextRes=" + this.helperTextRes + ")";
    }

    public DeviceApprovalChallengeViewState(boolean z, boolean z2, boolean z3, StringResource headerRes, StringResource bodyRes, StringResource stringResource, boolean z4, StringResource stringResource2) {
        Intrinsics.checkNotNullParameter(headerRes, "headerRes");
        Intrinsics.checkNotNullParameter(bodyRes, "bodyRes");
        this.isLoading = z;
        this.showLoadingLottie = z2;
        this.challengeCompleted = z3;
        this.headerRes = headerRes;
        this.bodyRes = bodyRes;
        this.secondaryCtaRes = stringResource;
        this.isButtonBarVisible = z4;
        this.helperTextRes = stringResource2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowLoadingLottie() {
        return this.showLoadingLottie;
    }

    public final boolean getChallengeCompleted() {
        return this.challengeCompleted;
    }

    public final StringResource getHeaderRes() {
        return this.headerRes;
    }

    public final StringResource getBodyRes() {
        return this.bodyRes;
    }

    public final StringResource getSecondaryCtaRes() {
        return this.secondaryCtaRes;
    }

    public final boolean isButtonBarVisible() {
        return this.isButtonBarVisible;
    }

    public final StringResource getHelperTextRes() {
        return this.helperTextRes;
    }
}
