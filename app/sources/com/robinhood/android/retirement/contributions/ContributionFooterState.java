package com.robinhood.android.retirement.contributions;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "", "buttonText", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "", "helperText", "isEnabled", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Z)V", "getButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getHelperText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionFooterState {
    public static final int $stable = StringResource.$stable;
    private final StringResource buttonText;
    private final StringResource helperText;
    private final boolean isEnabled;
    private final boolean isLoading;

    public static /* synthetic */ ContributionFooterState copy$default(ContributionFooterState contributionFooterState, StringResource stringResource, boolean z, StringResource stringResource2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = contributionFooterState.buttonText;
        }
        if ((i & 2) != 0) {
            z = contributionFooterState.isLoading;
        }
        if ((i & 4) != 0) {
            stringResource2 = contributionFooterState.helperText;
        }
        if ((i & 8) != 0) {
            z2 = contributionFooterState.isEnabled;
        }
        return contributionFooterState.copy(stringResource, z, stringResource2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getHelperText() {
        return this.helperText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final ContributionFooterState copy(StringResource buttonText, boolean isLoading, StringResource helperText, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new ContributionFooterState(buttonText, isLoading, helperText, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionFooterState)) {
            return false;
        }
        ContributionFooterState contributionFooterState = (ContributionFooterState) other;
        return Intrinsics.areEqual(this.buttonText, contributionFooterState.buttonText) && this.isLoading == contributionFooterState.isLoading && Intrinsics.areEqual(this.helperText, contributionFooterState.helperText) && this.isEnabled == contributionFooterState.isEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.buttonText.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        StringResource stringResource = this.helperText;
        return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isEnabled);
    }

    public String toString() {
        return "ContributionFooterState(buttonText=" + this.buttonText + ", isLoading=" + this.isLoading + ", helperText=" + this.helperText + ", isEnabled=" + this.isEnabled + ")";
    }

    public ContributionFooterState(StringResource buttonText, boolean z, StringResource stringResource, boolean z2) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.buttonText = buttonText;
        this.isLoading = z;
        this.helperText = stringResource;
        this.isEnabled = z2;
    }

    public final StringResource getButtonText() {
        return this.buttonText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final StringResource getHelperText() {
        return this.helperText;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
