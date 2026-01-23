package com.robinhood.shared.stepupverification.challenge.email;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeViewState;", "", "isLoading", "", "inputText", "", "fallbackText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "()Z", "getInputText", "()Ljava/lang/String;", "getFallbackText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmailChallengeViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource fallbackText;
    private final String inputText;
    private final boolean isLoading;

    public static /* synthetic */ EmailChallengeViewState copy$default(EmailChallengeViewState emailChallengeViewState, boolean z, String str, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailChallengeViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = emailChallengeViewState.inputText;
        }
        if ((i & 4) != 0) {
            stringResource = emailChallengeViewState.fallbackText;
        }
        return emailChallengeViewState.copy(z, str, stringResource);
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
    public final StringResource getFallbackText() {
        return this.fallbackText;
    }

    public final EmailChallengeViewState copy(boolean isLoading, String inputText, StringResource fallbackText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        return new EmailChallengeViewState(isLoading, inputText, fallbackText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailChallengeViewState)) {
            return false;
        }
        EmailChallengeViewState emailChallengeViewState = (EmailChallengeViewState) other;
        return this.isLoading == emailChallengeViewState.isLoading && Intrinsics.areEqual(this.inputText, emailChallengeViewState.inputText) && Intrinsics.areEqual(this.fallbackText, emailChallengeViewState.fallbackText);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.inputText.hashCode()) * 31;
        StringResource stringResource = this.fallbackText;
        return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
    }

    public String toString() {
        return "EmailChallengeViewState(isLoading=" + this.isLoading + ", inputText=" + this.inputText + ", fallbackText=" + this.fallbackText + ")";
    }

    public EmailChallengeViewState(boolean z, String inputText, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.isLoading = z;
        this.inputText = inputText;
        this.fallbackText = stringResource;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final StringResource getFallbackText() {
        return this.fallbackText;
    }
}
