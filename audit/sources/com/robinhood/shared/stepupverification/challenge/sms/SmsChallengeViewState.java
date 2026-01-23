package com.robinhood.shared.stepupverification.challenge.sms;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SmsChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeViewState;", "", "isLoading", "", "inputText", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "fallbackText", "<init>", "(ZLjava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "()Z", "getInputText", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getFallbackText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SmsChallengeViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource fallbackText;
    private final String inputText;
    private final boolean isLoading;
    private final StringResource subtitle;

    public static /* synthetic */ SmsChallengeViewState copy$default(SmsChallengeViewState smsChallengeViewState, boolean z, String str, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smsChallengeViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = smsChallengeViewState.inputText;
        }
        if ((i & 4) != 0) {
            stringResource = smsChallengeViewState.subtitle;
        }
        if ((i & 8) != 0) {
            stringResource2 = smsChallengeViewState.fallbackText;
        }
        return smsChallengeViewState.copy(z, str, stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getFallbackText() {
        return this.fallbackText;
    }

    public final SmsChallengeViewState copy(boolean isLoading, String inputText, StringResource subtitle, StringResource fallbackText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new SmsChallengeViewState(isLoading, inputText, subtitle, fallbackText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsChallengeViewState)) {
            return false;
        }
        SmsChallengeViewState smsChallengeViewState = (SmsChallengeViewState) other;
        return this.isLoading == smsChallengeViewState.isLoading && Intrinsics.areEqual(this.inputText, smsChallengeViewState.inputText) && Intrinsics.areEqual(this.subtitle, smsChallengeViewState.subtitle) && Intrinsics.areEqual(this.fallbackText, smsChallengeViewState.fallbackText);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.inputText.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        StringResource stringResource = this.fallbackText;
        return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
    }

    public String toString() {
        return "SmsChallengeViewState(isLoading=" + this.isLoading + ", inputText=" + this.inputText + ", subtitle=" + this.subtitle + ", fallbackText=" + this.fallbackText + ")";
    }

    public SmsChallengeViewState(boolean z, String inputText, StringResource subtitle, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.isLoading = z;
        this.inputText = inputText;
        this.subtitle = subtitle;
        this.fallbackText = stringResource;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final StringResource getFallbackText() {
        return this.fallbackText;
    }
}
